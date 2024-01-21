import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!we", name = "n", descriptor = "J")
	public static long aLong88;

	@OriginalMember(owner = "client!we", name = "j", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1851 = Static69.method1153("To play on this world move to a free area first");

	@OriginalMember(owner = "client!we", name = "a", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1845 = aClass64_1851;

	@OriginalMember(owner = "client!we", name = "b", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1846 = Static69.method1153("backhmid1");

	@OriginalMember(owner = "client!we", name = "c", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1847 = Static69.method1153(")2");

	@OriginalMember(owner = "client!we", name = "d", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1848 = Static69.method1153("Please wait )2 attempting to reestablish");

	@OriginalMember(owner = "client!we", name = "e", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1849 = aClass64_1848;

	@OriginalMember(owner = "client!we", name = "f", descriptor = "I")
	public static int anInt2872 = 0;

	@OriginalMember(owner = "client!we", name = "g", descriptor = "I")
	public static int anInt2873 = 0;

	@OriginalMember(owner = "client!we", name = "i", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1850 = Static69.method1153("null");

	@OriginalMember(owner = "client!we", name = "l", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1852 = Static69.method1153("RuneScape wurde aktualisiert(Q");

	@OriginalMember(owner = "client!we", name = "m", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1853 = Static69.method1153("Ihr Spielkonto wird bereits benutzt)3");

	@OriginalMember(owner = "client!we", name = "q", descriptor = "I")
	public static int anInt2878 = 0;

	@OriginalMember(owner = "client!we", name = "r", descriptor = "Z")
	public static boolean aBoolean170 = false;

	@OriginalMember(owner = "client!we", name = "s", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1854 = Static69.method1153("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!we", name = "t", descriptor = "I")
	public static int anInt2879 = -1;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(BILclient!pb;I)[Lclient!oa;")
	public static Class1_Sub1_Sub5_Sub3[] method2101(@OriginalArg(1) int arg0, @OriginalArg(2) Class41 arg1, @OriginalArg(3) int arg2) {
		return Static100.method1613(arg0, arg2, arg1) ? Static60.method1018() : null;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
	public static void method2102() {
		aClass64_1853 = null;
		aClass64_1848 = null;
		aClass64_1851 = null;
		aClass64_1847 = null;
		aClass64_1849 = null;
		aClass64_1846 = null;
		aClass64_1850 = null;
		aClass64_1852 = null;
		aClass64_1854 = null;
		aClass64_1845 = null;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method2103(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			arg0 = local15.aThrowable1;
			local10 = local15.aString4 + " | ";
		} else {
			local10 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(45) String local45 = local32.toString();
		@Pc(58) BufferedReader local58 = new BufferedReader(new StringReader(local45));
		@Pc(61) String local61 = local58.readLine();
		while (true) {
			while (true) {
				@Pc(64) String local64 = local58.readLine();
				if (local64 == null) {
					return local10 + "| " + local61;
				}
				@Pc(70) int local70 = local64.indexOf(40);
				@Pc(77) int local77 = local64.indexOf(41, local70 + 1);
				if (local70 >= 0 && local77 >= 0) {
					@Pc(91) String local91 = local64.substring(local70 + 1, local77);
					@Pc(95) int local95 = local91.indexOf(".java:");
					if (local95 >= 0) {
						local91 = local91.substring(0, local95) + local91.substring(local95 + 5);
						local10 = local10 + local91 + ' ';
						continue;
					}
					local64 = local64.substring(0, local70);
				}
				local64 = local64.trim();
				local64 = local64.substring(local64.lastIndexOf(32) + 1);
				local64 = local64.substring(local64.lastIndexOf(9) + 1);
				local10 = local10 + local64 + ' ';
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIII)V")
	public static void method2104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class1_Sub7 local10 = (Class1_Sub7) Static91.aClass50_10.method1151(); local10 != null; local10 = (Class1_Sub7) Static91.aClass50_10.method1141()) {
			if (local10.anInt1226 != -1 || local10.anIntArray168 != null) {
				@Pc(21) int local21 = 0;
				if (local10.anInt1235 < arg1) {
					local21 = arg1 - local10.anInt1235;
				} else if (arg1 < local10.anInt1234) {
					local21 = local10.anInt1234 - arg1;
				}
				if (arg2 > local10.anInt1225) {
					local21 += arg2 - local10.anInt1225;
				} else if (arg2 < local10.anInt1223) {
					local21 += local10.anInt1223 - arg2;
				}
				if (local21 - 64 > local10.anInt1233 || Static69.anInt1549 == 0 || local10.anInt1232 != arg0) {
					if (local10.aClass1_Sub2_Sub1_1 != null) {
						Static23.aClass1_Sub2_Sub2_1.method1523(local10.aClass1_Sub2_Sub1_1);
						local10.aClass1_Sub2_Sub1_1 = null;
					}
					if (local10.aClass1_Sub2_Sub1_2 != null) {
						Static23.aClass1_Sub2_Sub2_1.method1523(local10.aClass1_Sub2_Sub1_2);
						local10.aClass1_Sub2_Sub1_2 = null;
					}
				} else {
					local21 -= 64;
					if (local21 < 0) {
						local21 = 0;
					}
					@Pc(142) int local142 = (local10.anInt1233 - local21) * Static69.anInt1549 / local10.anInt1233;
					if (local10.aClass1_Sub2_Sub1_1 != null) {
						local10.aClass1_Sub2_Sub1_1.method115(local142);
					} else if (local10.anInt1226 >= 0) {
						@Pc(157) Class34 local157 = Static126.method820(Static10.aClass41_Sub1_1, local10.anInt1226);
						if (local157 != null) {
							@Pc(164) Class1_Sub4_Sub1 local164 = local157.method817().method1190(Static67.aClass32_1);
							@Pc(169) Class1_Sub2_Sub1 local169 = Static122.method124(local164, local142);
							local169.method99(-1);
							Static23.aClass1_Sub2_Sub2_1.method1524(local169);
							local10.aClass1_Sub2_Sub1_1 = local169;
						}
					}
					if (local10.aClass1_Sub2_Sub1_2 != null) {
						local10.aClass1_Sub2_Sub1_2.method115(local142);
						if (!local10.aClass1_Sub2_Sub1_2.method2073()) {
							local10.aClass1_Sub2_Sub1_2 = null;
						}
					} else if (local10.anIntArray168 != null && (local10.anInt1228 -= arg3) <= 0) {
						@Pc(206) int local206 = (int) (Math.random() * (double) local10.anIntArray168.length);
						@Pc(214) Class34 local214 = Static126.method820(Static10.aClass41_Sub1_1, local10.anIntArray168[local206]);
						if (local214 != null) {
							@Pc(221) Class1_Sub4_Sub1 local221 = local214.method817().method1190(Static67.aClass32_1);
							@Pc(226) Class1_Sub2_Sub1 local226 = Static122.method124(local221, local142);
							local226.method99(0);
							Static23.aClass1_Sub2_Sub2_1.method1524(local226);
							local10.anInt1228 = (int) (Math.random() * (double) (local10.anInt1230 - local10.anInt1220)) + local10.anInt1220;
							local10.aClass1_Sub2_Sub1_2 = local226;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V")
	public static void method2105() {
		Static27.aClass19_34.method416();
		Static22.aClass19_23.method416();
		Static94.aClass19_78.method416();
	}

	@OriginalMember(owner = "client!we", name = "c", descriptor = "(I)V")
	public static void method2106() {
		if (Static17.anInt576 != 1) {
			return;
		}
		if (Static118.anInt2842 >= 539 && Static118.anInt2842 <= 573 && Static96.anInt2745 >= 169 && Static96.anInt2745 < 205 && Static101.anIntArray334[0] != -1) {
			Static83.anInt1922 = 0;
			Static19.aBoolean41 = true;
			Static84.aBoolean118 = true;
		}
		if (Static118.anInt2842 >= 569 && Static118.anInt2842 <= 599 && Static96.anInt2745 >= 168 && Static96.anInt2745 < 205 && Static101.anIntArray334[1] != -1) {
			Static19.aBoolean41 = true;
			Static84.aBoolean118 = true;
			Static83.anInt1922 = 1;
		}
		if (Static118.anInt2842 >= 597 && Static118.anInt2842 <= 627 && Static96.anInt2745 >= 168 && Static96.anInt2745 < 205 && Static101.anIntArray334[2] != -1) {
			Static84.aBoolean118 = true;
			Static19.aBoolean41 = true;
			Static83.anInt1922 = 2;
		}
		if (Static118.anInt2842 >= 625 && Static118.anInt2842 <= 669 && Static96.anInt2745 >= 168 && Static96.anInt2745 < 203 && Static101.anIntArray334[3] != -1) {
			Static83.anInt1922 = 3;
			Static19.aBoolean41 = true;
			Static84.aBoolean118 = true;
		}
		if (Static118.anInt2842 >= 666 && Static118.anInt2842 <= 696 && Static96.anInt2745 >= 168 && Static96.anInt2745 < 205 && Static101.anIntArray334[4] != -1) {
			Static84.aBoolean118 = true;
			Static19.aBoolean41 = true;
			Static83.anInt1922 = 4;
		}
		if (Static118.anInt2842 >= 694 && Static118.anInt2842 <= 724 && Static96.anInt2745 >= 168 && Static96.anInt2745 < 205 && Static101.anIntArray334[5] != -1) {
			Static19.aBoolean41 = true;
			Static84.aBoolean118 = true;
			Static83.anInt1922 = 5;
		}
		if (Static118.anInt2842 >= 722 && Static118.anInt2842 <= 756 && Static96.anInt2745 >= 169 && Static96.anInt2745 < 205 && Static101.anIntArray334[6] != -1) {
			Static84.aBoolean118 = true;
			Static19.aBoolean41 = true;
			Static83.anInt1922 = 6;
		}
		if (Static118.anInt2842 >= 540 && Static118.anInt2842 <= 574 && Static96.anInt2745 >= 466 && Static96.anInt2745 < 502 && Static101.anIntArray334[7] != -1) {
			Static19.aBoolean41 = true;
			Static83.anInt1922 = 7;
			Static84.aBoolean118 = true;
		}
		if (Static118.anInt2842 >= 572 && Static118.anInt2842 <= 602 && Static96.anInt2745 >= 466 && Static96.anInt2745 < 503 && Static101.anIntArray334[8] != -1) {
			Static19.aBoolean41 = true;
			Static84.aBoolean118 = true;
			Static83.anInt1922 = 8;
		}
		if (Static118.anInt2842 >= 599 && Static118.anInt2842 <= 629 && Static96.anInt2745 >= 466 && Static96.anInt2745 < 503 && Static101.anIntArray334[9] != -1) {
			Static84.aBoolean118 = true;
			Static83.anInt1922 = 9;
			Static19.aBoolean41 = true;
		}
		if (Static118.anInt2842 >= 627 && Static118.anInt2842 <= 671 && Static96.anInt2745 >= 467 && Static96.anInt2745 < 502 && Static101.anIntArray334[10] != -1) {
			Static83.anInt1922 = 10;
			Static84.aBoolean118 = true;
			Static19.aBoolean41 = true;
		}
		if (Static118.anInt2842 >= 669 && Static118.anInt2842 <= 699 && Static96.anInt2745 >= 466 && Static96.anInt2745 < 503 && Static101.anIntArray334[11] != -1) {
			Static83.anInt1922 = 11;
			Static19.aBoolean41 = true;
			Static84.aBoolean118 = true;
		}
		if (Static118.anInt2842 >= 696 && Static118.anInt2842 <= 726 && Static96.anInt2745 >= 466 && Static96.anInt2745 < 503 && Static101.anIntArray334[12] != -1) {
			Static84.aBoolean118 = true;
			Static19.aBoolean41 = true;
			Static83.anInt1922 = 12;
		}
		if (Static118.anInt2842 >= 724 && Static118.anInt2842 <= 758 && Static96.anInt2745 >= 466 && Static96.anInt2745 < 502 && Static101.anIntArray334[13] != -1) {
			Static83.anInt1922 = 13;
			Static84.aBoolean118 = true;
			Static19.aBoolean41 = true;
			return;
		}
	}
}
