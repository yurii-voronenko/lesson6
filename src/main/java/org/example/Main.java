package org.example;

public class Main
{
    public static void main(String[] args) {

        int intVal = 10;

        // Арифметичні оператори
        int plusExample = intVal + 20;
        System.out.println(intVal + " + 20 = " + plusExample);

        int minusExample = intVal - 5;
        System.out.println(intVal + " - 5 = " + minusExample);

        int multiplyExample = intVal * 3;
        System.out.println(intVal + " * 3 = " + multiplyExample);

        int divisionExample = intVal / 3;
        System.out.println(intVal + " / 3 = " + divisionExample);

        int modExample = intVal % 4;
        System.out.println(intVal + " % 4 = " + modExample);


        // Оператори скороченного присвоєння
        int shortPlusExample = intVal;
        shortPlusExample += 5;
        System.out.println("shortPlusExample = " + shortPlusExample);

        int shortMinusExample = intVal;
        shortMinusExample -= 5;
        System.out.println("shortMinusExample = " + shortMinusExample);

        // Pre/Post increments and decrements
        int incrementExample = intVal;
        int postIncrementExample = incrementExample ++;
        System.out.println("incrementExample = " + incrementExample);
        System.out.println("postIncrementExample = " + postIncrementExample);
        // 11
        int preIncrementExample = ++ incrementExample; // 12
        System.out.println("incrementExample = " + incrementExample);
        System.out.println("preIncrementExample = " + preIncrementExample);

        incrementExample ++; // +1
        ++ incrementExample; // +1

        System.out.println("incrementExample = " + incrementExample);

         incrementExample --; // -1
        -- incrementExample; // -1

        System.out.println("incrementExample = " + incrementExample);

        // Оператори порівняння

        boolean equalExample = intVal == 10;
        System.out.println( intVal + " == 10 : " + equalExample);

        boolean notEqualExample = intVal != 5;
        System.out.println( intVal + " != 5 : " + notEqualExample);

        boolean greaterExample = intVal > 7;
        System.out.println( intVal + " > 7 : " + greaterExample);

        boolean lessExample = intVal < 7;
        System.out.println( intVal + " < 7 : " + lessExample);

        boolean greaterOrEqualExample = intVal >= 10;
        System.out.println( intVal + " >= 10 : " + greaterOrEqualExample);

        boolean lessOrEqualExample = intVal <= 10;
        System.out.println( intVal + " <= 10 : " + lessOrEqualExample);

        // Логічні оператори
        String hello = "Привіт";
        String java = "Java";
        String strMessage = "Привіт з програми на Java";
        boolean logicalExample = strMessage.contains("Привіт");
        boolean logicalNotExample = !logicalExample; // !false = true      !true = false
        System.out.println("logicalExample = " + logicalExample + ", logicalNotExample = " + logicalNotExample);

        // && - AND
        if (strMessage.contains(hello) && strMessage.contains(java)) {
            System.out.println("AND: Це програма JAVA");
        } else {
            System.out.println("AND: Це НЕ програма JAVA");
        }

        // || - OR
        if (strMessage.contains(hello) || strMessage.contains(java)) {
            System.out.println("OR: Це програма JAVA");
        } else {
            System.out.println("OR: Це НЕ програма JAVA");
        }

        if (!strMessage.contains(hello) || !strMessage.contains(java)) {
            System.out.println("OR: Це НЕ програма JAVA");
        }

        // ^ - XOR
        // Only for manual gas or automatic diesel
        boolean isDiesel = false;
        boolean isManual = false;
        if (isDiesel && !isManual || !isDiesel && isManual) {
            System.out.println("XOR: Manual Gas or Automatic Diesel");
        }

        if (isDiesel ^ isManual) {
            System.out.println("XOR: Manual Gas or Automatic Diesel");
        }

        // Bitwise
        byte first  = 0b00000001; // 1
        byte second = 0b00000011; // 3

        System.out.println( first + " & " + second + " = " + (first & second));
        System.out.println( first + " | " + second + " = " + (first | second));
        System.out.println( first + " ^ " + second + " = " + (first ^ second));






    }
}