import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!lf", name = "A", descriptor = "Lclient!bc;")
	public static Class2_Sub2_Sub1_Sub2 aClass2_Sub2_Sub1_Sub2_3;

	@OriginalMember(owner = "client!lf", name = "ab", descriptor = "Lclient!g;")
	public static Class26 aClass26_13;

	@OriginalMember(owner = "client!lf", name = "bb", descriptor = "Lclient!re;")
	public static Class9 aClass9_31;

	@OriginalMember(owner = "client!lf", name = "v", descriptor = "Z")
	public static boolean aBoolean58 = false;

	@OriginalMember(owner = "client!lf", name = "y", descriptor = "I")
	public static int anInt1476 = 0;

	@OriginalMember(owner = "client!lf", name = "z", descriptor = "Lclient!u;")
	public static Class74 aClass74_1033 = Static72.method1077("titlebox");

	@OriginalMember(owner = "client!lf", name = "D", descriptor = "I")
	public static int anInt1478 = 0;

	@OriginalMember(owner = "client!lf", name = "E", descriptor = "Lclient!u;")
	private static Class74 aClass74_1034 = Static72.method1077("Add friend");

	@OriginalMember(owner = "client!lf", name = "G", descriptor = "Lclient!u;")
	public static Class74 aClass74_1035 = Static72.method1077("Fertigkeit)2");

	@OriginalMember(owner = "client!lf", name = "H", descriptor = "Lclient!u;")
	private static Class74 aClass74_1036 = Static72.method1077("Attack");

	@OriginalMember(owner = "client!lf", name = "I", descriptor = "Lclient!u;")
	public static Class74 aClass74_1037 = Static72.method1077("Hidden)2use");

	@OriginalMember(owner = "client!lf", name = "N", descriptor = "Lclient!u;")
	private static Class74 aClass74_1039 = Static72.method1077("On");

	@OriginalMember(owner = "client!lf", name = "L", descriptor = "Lclient!u;")
	public static Class74 aClass74_1038 = aClass74_1039;

	@OriginalMember(owner = "client!lf", name = "T", descriptor = "[I")
	public static int[] anIntArray183 = new int[5];

	@OriginalMember(owner = "client!lf", name = "X", descriptor = "Lclient!u;")
	public static Class74 aClass74_1040 = aClass74_1034;

	@OriginalMember(owner = "client!lf", name = "Y", descriptor = "[I")
	public static int[] anIntArray184 = new int[100];

	@OriginalMember(owner = "client!lf", name = "cb", descriptor = "Lclient!u;")
	public static Class74 aClass74_1041 = Static72.method1077("Verbindung konnte nicht hergestellt werden)3");

	@OriginalMember(owner = "client!lf", name = "fb", descriptor = "Lclient!u;")
	public static Class74 aClass74_1042 = Static72.method1077("Bitte geben Sie Ihr Passwort ein)3");

	@OriginalMember(owner = "client!lf", name = "hb", descriptor = "Lclient!u;")
	public static Class74 aClass74_1043 = Static72.method1077("Lade Ignorieren)2Liste)3)3)3");

	@OriginalMember(owner = "client!lf", name = "ib", descriptor = "Lclient!u;")
	public static Class74 aClass74_1044 = Static72.method1077("VOLL");

	@OriginalMember(owner = "client!lf", name = "jb", descriptor = "Lclient!u;")
	public static Class74 aClass74_1045 = aClass74_1036;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!g;IZ)Lclient!lf;")
	public static Class2_Sub15 method1022(@OriginalArg(0) Class26 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) byte[] local13 = arg0.method1365(arg1);
		return local13 == null ? null : new Class2_Sub15(local13);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILclient!u;BLclient!u;)V")
	public static void method1024(@OriginalArg(0) int arg0, @OriginalArg(1) Class74 arg1, @OriginalArg(3) Class74 arg2) {
		if (Static42.anInt982 == -1) {
			Static55.aBoolean16 = true;
		}
		if (arg0 == 0 && Static83.anInt1804 != -1) {
			Static16.aClass74_411 = arg2;
			Static41.anInt973 = 0;
		}
		for (@Pc(20) int local20 = 99; local20 > 0; local20--) {
			Static100.anIntArray314[local20] = Static100.anIntArray314[local20 - 1];
			Static20.aClass74Array3[local20] = Static20.aClass74Array3[local20 - 1];
			Static106.aClass74Array17[local20] = Static106.aClass74Array17[local20 - 1];
		}
		Static100.anIntArray314[0] = arg0;
		Static20.aClass74Array3[0] = arg1;
		Static106.aClass74Array17[0] = arg2;
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "(I)V")
	public static void method1025() {
		Static116.anInt2490 = 0;
		@Pc(12) int local12 = Static62.anInt1413 + (Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anInt2672 >> 7);
		@Pc(19) int local19 = (Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anInt2673 >> 7) + Static107.anInt2343;
		if (local19 >= 3053 && local19 <= 3156 && local12 >= 3056 && local12 <= 3136) {
			Static116.anInt2490 = 1;
		}
		if (local19 >= 3072 && local19 <= 3118 && local12 >= 9492 && local12 <= 9535) {
			Static116.anInt2490 = 1;
		}
		if (Static116.anInt2490 == 1 && local19 >= 3139 && local19 <= 3199 && local12 >= 3008 && local12 <= 3062) {
			Static116.anInt2490 = 0;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!g;IBI)Lclient!ae;")
	public static Class2_Sub2_Sub1_Sub1 method1027(@OriginalArg(0) Class26 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return Static65.method1010(arg0, arg1, arg2) ? Static89.method1328() : null;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I[BBI[Lclient!ob;II)V")
	public static void method1028(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class55[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(20) int local20;
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			for (@Pc(16) int local16 = 0; local16 < 64; local16++) {
				for (local20 = 0; local20 < 64; local20++) {
					if (local16 + arg2 > 0 && local16 + arg2 < 103 && arg0 + local20 > 0 && local20 + arg0 < 103) {
						arg3[local7].anIntArrayArray18[arg2 + local16][local20 + arg0] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(94) Class2_Sub10 local94 = new Class2_Sub10(arg1);
		for (local20 = 0; local20 < 4; local20++) {
			for (@Pc(100) int local100 = 0; local100 < 64; local100++) {
				for (@Pc(104) int local104 = 0; local104 < 64; local104++) {
					Static126.method1925(arg4, arg0 + local104, 0, arg5, local20, local94, local100 + arg2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "(I)V")
	public static void method1029() {
		aClass74_1040 = null;
		anIntArray183 = null;
		aClass74_1038 = null;
		aClass74_1042 = null;
		aClass74_1037 = null;
		aClass26_13 = null;
		aClass74_1044 = null;
		aClass74_1041 = null;
		aClass74_1034 = null;
		aClass2_Sub2_Sub1_Sub2_3 = null;
		anIntArray184 = null;
		aClass74_1039 = null;
		aClass74_1035 = null;
		aClass74_1045 = null;
		aClass74_1043 = null;
		aClass74_1033 = null;
		aClass9_31 = null;
		aClass74_1036 = null;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(JI)V")
	public static void method1030(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < Static101.anInt2247; local14++) {
			if (arg0 == Static10.aLongArray6[local14]) {
				Static101.anInt2247--;
				Static116.aBoolean107 = true;
				for (@Pc(35) int local35 = local14; local35 < Static101.anInt2247; local35++) {
					Static10.aLongArray6[local35] = Static10.aLongArray6[local35 + 1];
				}
				Static128.aClass2_Sub10_Sub1_3.method1533(114);
				Static128.aClass2_Sub10_Sub1_3.method1495(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)V")
	public static void method1031() {
		@Pc(7) Class42 local7 = Static39.aClass42_1;
		synchronized (Static39.aClass42_1) {
			Static1.anInt2101 = Static3.anInt47;
			@Pc(27) int local27;
			if (Static123.anInt2659 >= 0) {
				while (Static126.anInt2867 != Static123.anInt2659) {
					local27 = Static20.anIntArray62[Static126.anInt2867];
					Static126.anInt2867 = Static126.anInt2867 + 1 & 0x7F;
					if (local27 < 0) {
						Static78.aBooleanArray5[~local27] = false;
					} else {
						Static78.aBooleanArray5[local27] = true;
					}
				}
			} else {
				for (local27 = 0; local27 < 112; local27++) {
					Static78.aBooleanArray5[local27] = false;
				}
				Static123.anInt2659 = Static126.anInt2867;
			}
			Static3.anInt47 = Static49.anInt1164;
		}
	}

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "(I)V")
	public static void method1032() {
		if (Static84.aBoolean73 && Static71.anInt1547 != Static117.anInt2529) {
			Static15.method353(Static117.anInt2529, Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray393[0], Static113.anInt2442, Static48.anInt1147, Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray394[0]);
		} else if (Static117.anInt2529 != Static99.anInt2136) {
			Static99.anInt2136 = Static117.anInt2529;
			Static93.method1378(Static117.anInt2529);
		}
	}
}
