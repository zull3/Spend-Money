//Write a program that exchangs a certain amount of money to smaller bills and coins
//Import Scanner
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    //declare constants
    final int SEK_20 = 20;
    final int SEK_10 = 10;
    final int SEK_5 = 5;
    final int SEK_2 = 2;
    final int SEK_1 = 1;

    //declare variables
    int amount = 0;
    int noOf20s = 0;
    int noOf10s = 0;
    int noOf5s = 0;
    int noOf2s = 0;
    int noOf1s = 0;
    int remainderAmount = 0;

    Scanner userInput = new Scanner(System.in);

    System.out.println("Enter amount to exchange: ");
    
    amount = userInput.nextInt();
    remainderAmount = amount;
    
    noOf20s = remainderAmount / SEK_20;
    remainderAmount = remainderAmount % 20;

    noOf10s = remainderAmount / SEK_10;
    remainderAmount = remainderAmount % 10;

    noOf5s = remainderAmount / SEK_5;
    remainderAmount = remainderAmount % 5;

    noOf2s = remainderAmount / SEK_2;
    remainderAmount = remainderAmount % 2;

    noOf1s = remainderAmount / SEK_1;
    remainderAmount = remainderAmount % 1;

    System.out.print("|Exchange");
    System.out.print("|20 kronor");
    System.out.print("|10 kronor");
    System.out.print("|5 kronor");
    System.out.print("|2 kronor");
    System.out.println("|1 kronor");

    System.out.printf("|%-8s", amount);
    System.out.printf("|%-9s", + noOf20s);
    System.out.printf("|%-9s", + noOf10s);                   
    System.out.printf("|%-8s", + noOf5s);
    System.out.printf("|%-8s", + noOf2s);
    System.out.println("|" + noOf1s);

    
  }
}