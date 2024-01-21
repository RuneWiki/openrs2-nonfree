import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!ma", name = "p", descriptor = "[Lclient!pf;")
	public static Class1_Sub1_Sub1_Sub3[] aClass1_Sub1_Sub1_Sub3Array7;

	@OriginalMember(owner = "client!ma", name = "y", descriptor = "[Lclient!rh;")
	public static Class1_Sub1_Sub1_Sub4[] aClass1_Sub1_Sub1_Sub4Array6;

	@OriginalMember(owner = "client!ma", name = "k", descriptor = "Lclient!rf;")
	public static Class70 aClass70_968 = Static49.method1293("Standort");

	@OriginalMember(owner = "client!ma", name = "l", descriptor = "[I")
	public static int[] anIntArray292 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!ma", name = "F", descriptor = "Lclient!rf;")
	private static Class70 aClass70_973 = Static49.method1293(" is already on your ignore list)3");

	@OriginalMember(owner = "client!ma", name = "r", descriptor = "Lclient!rf;")
	public static Class70 aClass70_969 = aClass70_973;

	@OriginalMember(owner = "client!ma", name = "s", descriptor = "Lclient!rf;")
	private static Class70 aClass70_970 = Static49.method1293("No response from server)3");

	@OriginalMember(owner = "client!ma", name = "z", descriptor = "Lclient!rf;")
	public static Class70 aClass70_971 = aClass70_970;

	@OriginalMember(owner = "client!ma", name = "B", descriptor = "Lclient!rf;")
	public static Class70 aClass70_972 = Static49.method1293("(U0a )2 in: ");

	@OriginalMember(owner = "client!ma", name = "C", descriptor = "I")
	public static final int anInt2999 = 2301979;

	@OriginalMember(owner = "client!ma", name = "E", descriptor = "I")
	public static int anInt3001 = 1;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	public static String method2212(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(24) String local24;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			arg0 = local11.aThrowable1;
			local24 = local11.aString5 + " | ";
		} else {
			local24 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(50) String local50 = local32.toString();
		@Pc(58) BufferedReader local58 = new BufferedReader(new StringReader(local50));
		@Pc(61) String local61 = local58.readLine();
		while (true) {
			while (true) {
				@Pc(64) String local64 = local58.readLine();
				if (local64 == null) {
					return local24 + "| " + local61;
				}
				@Pc(70) int local70 = local64.indexOf(40);
				@Pc(77) int local77 = local64.indexOf(41, local70 + 1);
				if (local70 >= 0 && local77 >= 0) {
					@Pc(91) String local91 = local64.substring(local70 + 1, local77);
					@Pc(95) int local95 = local91.indexOf(".java:");
					if (local95 >= 0) {
						local91 = local91.substring(0, local95) + local91.substring(local95 + 5);
						local24 = local24 + local91 + ' ';
						continue;
					}
					local64 = local64.substring(0, local70);
				}
				local64 = local64.trim();
				local64 = local64.substring(local64.lastIndexOf(32) + 1);
				local64 = local64.substring(local64.lastIndexOf(9) + 1);
				local24 = local24 + local64 + ' ';
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IB)Z")
	public static boolean method2213(@OriginalArg(0) int arg0) {
		if (Static126.aBooleanArray5[arg0]) {
			return true;
		} else if (Static144.aClass76_113.method3319(arg0)) {
			@Pc(23) int local23 = Static144.aClass76_113.method3306(arg0);
			if (local23 == 0) {
				Static126.aBooleanArray5[arg0] = true;
				return true;
			}
			if (Static77.aClass39ArrayArray1[arg0] == null) {
				Static77.aClass39ArrayArray1[arg0] = new Class39[local23];
			}
			for (@Pc(42) int local42 = 0; local42 < local23; local42++) {
				if (Static77.aClass39ArrayArray1[arg0][local42] == null) {
					@Pc(61) byte[] local61 = Static144.aClass76_113.method3316(local42, arg0);
					if (local61 != null) {
						Static77.aClass39ArrayArray1[arg0][local42] = new Class39();
						Static77.aClass39ArrayArray1[arg0][local42].anInt2355 = (arg0 << 16) + local42;
						if (local61[0] == -1) {
							Static77.aClass39ArrayArray1[arg0][local42].method1752(new Class1_Sub9(local61));
						} else {
							Static77.aClass39ArrayArray1[arg0][local42].method1748(new Class1_Sub9(local61));
						}
					}
				}
			}
			Static126.aBooleanArray5[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
	public static void method2215() {
		Static60.method1459();
		Static75.method1679();
		Static99.method3501();
		Static184.method3516();
		Static127.method2535();
		Static165.method3300();
		Static157.method1975();
		Static11.method327();
		Static176.method3431();
		Static115.method2334();
		Static14.method365();
		Static14.method368();
		((Class82) Static1.anInterface2_1).method3428();
		Static183.aClass25_30.method1300();
		Static45.aClass76_Sub1_4.method3330();
		Static148.aClass76_Sub1_13.method3330();
		Static58.aClass76_Sub1_5.method3330();
		Static113.aClass76_Sub1_10.method3330();
		Static67.aClass76_Sub1_6.method3330();
		Static124.aClass76_Sub1_12.method3330();
		Static16.aClass76_Sub1_1.method3330();
		Static156.aClass76_Sub1_15.method3330();
		Static101.aClass76_Sub1_9.method3330();
		Static161.aClass76_Sub1_16.method3330();
		Static88.aClass76_Sub1_8.method3330();
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(Z)V")
	public static void method2227() {
		aClass70_970 = null;
		aClass70_971 = null;
		aClass1_Sub1_Sub1_Sub4Array6 = null;
		anIntArray292 = null;
		aClass1_Sub1_Sub1_Sub3Array7 = null;
		aClass70_969 = null;
		aClass70_973 = null;
		aClass70_968 = null;
		aClass70_972 = null;
	}
}
