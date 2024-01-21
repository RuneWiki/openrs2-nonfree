import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!jf", name = "E", descriptor = "[[B")
	public static byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!jf", name = "G", descriptor = "Z")
	public static boolean aBoolean51;

	@OriginalMember(owner = "client!jf", name = "J", descriptor = "Lclient!pe;")
	public static Class26_Sub1 aClass26_Sub1_41;

	@OriginalMember(owner = "client!jf", name = "Q", descriptor = "Lclient!ud;")
	public static Class77 aClass77_1;

	@OriginalMember(owner = "client!jf", name = "v", descriptor = "I")
	public static int anInt1355 = 0;

	@OriginalMember(owner = "client!jf", name = "w", descriptor = "Lclient!u;")
	public static Class74 aClass74_948 = Static72.method1077("redstone3");

	@OriginalMember(owner = "client!jf", name = "A", descriptor = "Lclient!u;")
	public static Class74 aClass74_949 = Static72.method1077("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!jf", name = "H", descriptor = "Lclient!u;")
	private static Class74 aClass74_953 = Static72.method1077("Connecting to friendserver");

	@OriginalMember(owner = "client!jf", name = "B", descriptor = "Lclient!u;")
	public static Class74 aClass74_950 = aClass74_953;

	@OriginalMember(owner = "client!jf", name = "C", descriptor = "Lclient!u;")
	private static Class74 aClass74_951 = Static72.method1077("Press (Wchange your password(W on front page)3");

	@OriginalMember(owner = "client!jf", name = "D", descriptor = "Lclient!u;")
	public static Class74 aClass74_952 = Static72.method1077("Icons redrawn");

	@OriginalMember(owner = "client!jf", name = "cb", descriptor = "Lclient!u;")
	private static Class74 aClass74_960 = Static72.method1077("Login server offline)3");

	@OriginalMember(owner = "client!jf", name = "M", descriptor = "Lclient!u;")
	public static Class74 aClass74_954 = aClass74_960;

	@OriginalMember(owner = "client!jf", name = "R", descriptor = "Lclient!u;")
	public static Class74 aClass74_955 = aClass74_951;

	@OriginalMember(owner = "client!jf", name = "T", descriptor = "Lclient!u;")
	public static Class74 aClass74_956 = Static72.method1077("Bitte wenden Sie sich an den Kundendienst)3");

	@OriginalMember(owner = "client!jf", name = "U", descriptor = "I")
	public static int anInt1362 = 0;

	@OriginalMember(owner = "client!jf", name = "V", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray2 = new int[4][105][105];

	@OriginalMember(owner = "client!jf", name = "Y", descriptor = "Lclient!u;")
	public static Class74 aClass74_957 = Static72.method1077("Freund hinzuf-Ugen");

	@OriginalMember(owner = "client!jf", name = "Z", descriptor = "Lclient!u;")
	public static Class74 aClass74_958 = Static72.method1077("Null");

	@OriginalMember(owner = "client!jf", name = "bb", descriptor = "Lclient!u;")
	public static Class74 aClass74_959 = Static72.method1077("Classic");

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIB)Z")
	public static boolean method939(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0 && Static36.anInt879 == arg0) {
			return true;
		} else if (arg1 == 1 && arg0 == Static38.anInt934) {
			return true;
		} else {
			return (arg1 == 2 || arg1 == 3) && Static18.anInt555 == arg0;
		}
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(II)Lclient!u;")
	public static Class74 method940(@OriginalArg(1) int arg0) {
		return Static45.method731(false, arg0);
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "(II)I")
	public static int method941(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(10) int local10 = local0 | local0 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(28) int local28 = local22 | local22 >>> 8;
		@Pc(34) int local34 = local28 | local28 >>> 16;
		return local34 + 1;
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)V")
	public static void method942() {
		for (@Pc(3) int local3 = 0; local3 < Static48.anInt1157; local3++) {
			@Pc(9) int local9 = Static32.anIntArray97[local3]--;
			if (Static32.anIntArray97[local3] >= -10) {
				@Pc(76) Class36 local76 = Static21.aClass36Array1[local3];
				if (local76 == null) {
					local76 = Static131.method880(Static82.aClass26_Sub1_54, Static63.anIntArray173[local3], 0);
					if (local76 == null) {
						continue;
					}
					Static32.anIntArray97[local3] += local76.method879();
					Static21.aClass36Array1[local3] = local76;
				}
				if (Static32.anIntArray97[local3] < 0) {
					@Pc(202) int local202;
					if (Static1.anIntArray307[local3] == 0) {
						local202 = Static33.anInt827;
					} else {
						@Pc(119) int local119 = (Static1.anIntArray307[local3] & 0xFF) * 128;
						@Pc(127) int local127 = Static1.anIntArray307[local3] >> 16 & 0xFF;
						@Pc(137) int local137 = local127 * 128 + 64 - Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anInt2673;
						@Pc(145) int local145 = Static1.anIntArray307[local3] >> 8 & 0xFF;
						if (local137 < 0) {
							local137 = -local137;
						}
						@Pc(162) int local162 = local145 * 128 + 64 - Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anInt2672;
						if (local162 < 0) {
							local162 = -local162;
						}
						@Pc(173) int local173 = local162 + local137 - 128;
						if (local173 > local119) {
							Static32.anIntArray97[local3] = -100;
							continue;
						}
						if (local173 < 0) {
							local173 = 0;
						}
						local202 = Static75.anInt1600 * (local119 - local173) / local119;
					}
					if (local202 > 0) {
						@Pc(216) Class2_Sub14_Sub1 local216 = local76.method882().method993(Static52.aClass33_1);
						@Pc(221) Class2_Sub16_Sub1 local221 = Static134.method1190(local216, local202);
						local221.method1174(Static20.anIntArray59[local3] - 1);
						Static55.aClass2_Sub16_Sub3_2.method1839(local221);
					}
					Static32.anIntArray97[local3] = -100;
				}
			} else {
				Static48.anInt1157--;
				for (@Pc(23) int local23 = local3; local23 < Static48.anInt1157; local23++) {
					Static63.anIntArray173[local23] = Static63.anIntArray173[local23 + 1];
					Static21.aClass36Array1[local23] = Static21.aClass36Array1[local23 + 1];
					Static20.anIntArray59[local23] = Static20.anIntArray59[local23 + 1];
					Static32.anIntArray97[local23] = Static32.anIntArray97[local23 + 1];
					Static1.anIntArray307[local23] = Static1.anIntArray307[local23 + 1];
				}
				local3--;
			}
		}
		if (Static57.aBoolean52 && !Static117.method1743()) {
			if (Static69.anInt1519 != 0 && Static64.anInt1437 != -1) {
				Static4.method26(0, Static35.aClass26_Sub1_77, Static64.anInt1437, Static69.anInt1519);
			}
			Static57.aBoolean52 = false;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(BIII)Z")
	public static boolean method943(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg1 >> 14 & 0x7FFF;
		@Pc(23) int local23 = Static84.aClass69_1.method1617(Static117.anInt2529, arg0, arg2, arg1);
		if (local23 == -1) {
			return false;
		}
		@Pc(34) int local34 = local23 >> 6 & 0x3;
		@Pc(38) int local38 = local23 & 0x1F;
		if (local38 == 10 || local38 == 11 || local38 == 22) {
			@Pc(81) Class2_Sub2_Sub14 local81 = Static2.method19(local16);
			@Pc(84) int local84 = local81.anInt2243;
			@Pc(97) int local97;
			@Pc(100) int local100;
			if (local34 == 0 || local34 == 2) {
				local100 = local81.anInt2259;
				local97 = local81.anInt2279;
			} else {
				local97 = local81.anInt2259;
				local100 = local81.anInt2279;
			}
			if (local34 != 0) {
				local84 = (local84 << local34 & 0xF) + (local84 >> 4 - local34);
			}
			Static48.method794(2, local100, true, 0, arg2, 0, arg0, local84, local97, Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray393[0], Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray394[0]);
		} else {
			Static48.method794(2, 0, true, local38 + 1, arg2, local34, arg0, 0, 0, Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray393[0], Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray394[0]);
		}
		Static126.anInt2857 = 2;
		Static75.anInt1601 = Static120.anInt2565;
		Static124.anInt2729 = Static15.anInt442;
		Static38.anInt929 = 0;
		return true;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILclient!pe;I)V")
	public static void method944(@OriginalArg(0) int arg0, @OriginalArg(1) Class26_Sub1 arg1) {
		if (Static116.aClass2_Sub10_54 == null) {
			Static124.method1876(0, (byte) 0, 255, null, true, 255);
			Static65.aClass26_Sub1Array1[arg0] = arg1;
		} else {
			Static116.aClass2_Sub10_54.anInt2187 = arg0 * 8 + 5;
			@Pc(23) int local23 = Static116.aClass2_Sub10_54.method1532();
			@Pc(27) int local27 = Static116.aClass2_Sub10_54.method1532();
			arg1.method1385(local27, local23);
		}
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)V")
	public static void method945() {
		aClass74_956 = null;
		aClass77_1 = null;
		aClass74_960 = null;
		aClass74_952 = null;
		aClass74_948 = null;
		aByteArrayArray4 = null;
		aClass74_957 = null;
		aClass74_954 = null;
		aClass74_950 = null;
		aClass74_959 = null;
		aClass26_Sub1_41 = null;
		aClass74_958 = null;
		aClass74_951 = null;
		anIntArrayArrayArray2 = null;
		aClass74_953 = null;
		aClass74_949 = null;
		aClass74_955 = null;
	}
}
