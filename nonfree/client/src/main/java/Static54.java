import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!jf", name = "Sb", descriptor = "I")
	public static int anInt1338 = 0;

	@OriginalMember(owner = "client!jf", name = "Tb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_575 = Static119.method1462("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!jf", name = "bc", descriptor = "Lclient!cd;")
	public static Class13 aClass13_8 = new Class13();

	@OriginalMember(owner = "client!jf", name = "cc", descriptor = "[Z")
	public static boolean[] aBooleanArray10 = new boolean[8];

	@OriginalMember(owner = "client!jf", name = "ec", descriptor = "Lclient!pe;")
	public static Class65 aClass65_576 = Static119.method1462("mapfunction");

	@OriginalMember(owner = "client!jf", name = "fc", descriptor = "I")
	public static int anInt1346 = 0;

	@OriginalMember(owner = "client!jf", name = "v", descriptor = "(I)V")
	public static void method952() {
		if (Static129.aClass7_6 != null) {
			Static129.aClass7_6.method157();
			Static129.aClass7_6 = null;
		}
		Static110.method1795();
		Static124.aClass49_1.method1180();
		for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
			Static90.aClass46Array1[local18].method1100();
		}
		System.gc();
		Static63.method1132();
		Static105.anInt2364 = -1;
		Static100.aBoolean92 = false;
		Static9.method169();
		Static98.method1604(10);
	}

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "(B)V")
	public static void method955() {
		aClass13_8 = null;
		aBooleanArray10 = null;
		aClass65_576 = null;
		aClass65_575 = null;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIII)V")
	public static void method956(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static52.aClass2_Sub1_Sub4_Sub2Array4[0].method996(arg1, arg4);
		@Pc(13) int local13 = (arg0 - 32) * arg0 / arg2;
		if (local13 < 8) {
			local13 = 8;
		}
		Static52.aClass2_Sub1_Sub4_Sub2Array4[1].method996(arg1, arg0 + arg4 - 16);
		Static118.method2081(arg1, arg4 + 16, 16, arg0 - 32, Static108.anInt2428);
		@Pc(57) int local57 = (arg0 - local13 - 32) * arg3 / (arg2 - arg0);
		Static118.method2081(arg1, arg4 + local57 + 16, 16, local13, Static133.anInt2919);
		Static118.method2077(arg1, local57 + arg4 + 16, local13, Static62.anInt1507);
		Static118.method2077(arg1 + 1, local57 + arg4 + 16, local13, Static62.anInt1507);
		Static118.method2067(arg1, arg4 + local57 + 16, 16, Static62.anInt1507);
		Static118.method2067(arg1, local57 + arg4 + 17, 16, Static62.anInt1507);
		Static118.method2077(arg1 + 15, arg4 - (-16 - local57), local13, Static35.anInt804);
		Static118.method2077(arg1 + 14, local57 + arg4 + 17, local13 - 1, Static35.anInt804);
		Static118.method2067(arg1, local57 + arg4 + local13 + 15, 16, Static35.anInt804);
		Static118.method2067(arg1 + 1, arg4 - -local57 + 14 + local13, 15, Static35.anInt804);
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(III)Z")
	public static boolean method957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		@Pc(17) Class2_Sub1_Sub15 local17 = Static73.method1248(arg1);
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local17.method1911(arg0);
	}

	@OriginalMember(owner = "client!jf", name = "w", descriptor = "(I)V")
	public static void method959() {
		if (Static95.aClass2_Sub22_11 != null || Static52.aClass2_Sub22_6 != null) {
			return;
		}
		@Pc(18) int local18 = Static17.anInt390;
		@Pc(36) int local36;
		@Pc(94) int local94;
		@Pc(88) int local88;
		if (Static3.aBoolean5) {
			if (local18 != 1) {
				local36 = Static66.anInt1586;
				local94 = Static39.anInt837;
				if (local36 < Static56.anInt1421 - 10 || local36 > Static56.anInt1421 + Static45.anInt1093 + 10 || Static75.anInt2326 - 10 > local94 || Static75.anInt2326 + Static15.anInt372 + 10 < local94) {
					Static3.aBoolean5 = false;
					Static7.method151(Static15.anInt372, Static45.anInt1093, Static56.anInt1421, Static75.anInt2326);
				}
			}
			if (local18 != 1) {
				return;
			}
			local36 = Static56.anInt1421;
			local88 = Static45.anInt1093;
			local94 = Static75.anInt2326;
			@Pc(239) int local239 = Static96.anInt2190;
			@Pc(241) int local241 = -1;
			@Pc(243) int local243 = Static100.anInt2282;
			for (@Pc(245) int local245 = 0; local245 < Static49.anInt1205; local245++) {
				@Pc(259) int local259 = (Static49.anInt1205 - local245 - 1) * 15 + local94 + 31;
				if (local239 > local36 && local239 < local88 + local36 && local259 - 13 < local243 && local259 + 3 > local243) {
					local241 = local245;
				}
			}
			if (local241 != -1) {
				Static76.method1279(local241);
			}
			Static3.aBoolean5 = false;
			Static7.method151(Static15.anInt372, Static45.anInt1093, Static56.anInt1421, Static75.anInt2326);
			return;
		}
		if (local18 == 1 && Static49.anInt1205 > 0) {
			local36 = Static126.anIntArray355[Static49.anInt1205 - 1];
			if (local36 == 1 || local36 == 15 || local36 == 20 || local36 == 26 || local36 == 33 || local36 == 35 || local36 == 30 || local36 == 10 || local36 == 46 || local36 == 3 || local36 == 19 || local36 == 1001) {
				local88 = Static113.anIntArray333[Static49.anInt1205 - 1];
				local94 = Static84.anIntArray241[Static49.anInt1205 - 1];
				@Pc(98) Class2_Sub22 local98 = Static35.method645(local88);
				if (Static28.method578(Static114.method1834(local98)) || Static62.method1121(Static114.method1834(local98))) {
					Static123.aBoolean107 = false;
					Static21.anInt523 = 0;
					if (Static95.aClass2_Sub22_11 != null) {
						Static116.method1853(Static95.aClass2_Sub22_11);
					}
					Static95.aClass2_Sub22_11 = Static35.method645(local88);
					Static72.anInt1649 = local94;
					Static46.anInt1109 = Static100.anInt2282;
					Static111.anInt2491 = Static96.anInt2190;
					Static116.method1853(Static95.aClass2_Sub22_11);
					return;
				}
			}
		}
		if (local18 == 1 && (Static107.anInt2410 == 1 && Static49.anInt1205 > 2 || Static20.method343(Static49.anInt1205 - 1))) {
			local18 = 2;
		}
		if (local18 == 1 && Static49.anInt1205 > 0) {
			Static76.method1279(Static49.anInt1205 - 1);
		}
		if (local18 == 2 && Static49.anInt1205 > 0) {
			Static33.method631();
			return;
		}
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "(III)V")
	public static void method961(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) Class13 local11 = Static76.aClass13ArrayArrayArray1[Static59.anInt1479][arg0][arg1];
		if (local11 == null) {
			Static124.aClass49_1.method1164(Static59.anInt1479, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(26) Class2_Sub1_Sub1_Sub6 local26 = (Class2_Sub1_Sub1_Sub6) local11.method270();
		@Pc(28) Class2_Sub1_Sub1_Sub6 local28 = null;
		while (local26 != null) {
			@Pc(34) Class2_Sub1_Sub11 local34 = Static4.method872(local26.anInt2468);
			@Pc(37) int local37 = local34.anInt2095;
			if (local34.anInt2071 == 1) {
				local37 *= local26.anInt2464 + 1;
			}
			if (local21 < local37) {
				local28 = local26;
				local21 = local37;
			}
			local26 = (Class2_Sub1_Sub1_Sub6) local11.method273();
		}
		if (local28 == null) {
			Static124.aClass49_1.method1164(Static59.anInt1479, arg0, arg1);
			return;
		}
		local11.method269(local28);
		local26 = (Class2_Sub1_Sub1_Sub6) local11.method270();
		@Pc(83) Class2_Sub1_Sub1_Sub6 local83 = null;
		@Pc(85) Class2_Sub1_Sub1_Sub6 local85 = null;
		while (local26 != null) {
			if (local26.anInt2468 != local28.anInt2468) {
				if (local85 == null) {
					local85 = local26;
				}
				if (local26.anInt2468 != local85.anInt2468 && local83 == null) {
					local83 = local26;
				}
			}
			local26 = (Class2_Sub1_Sub1_Sub6) local11.method273();
		}
		@Pc(123) int local123 = (arg1 << 7) + arg0 + 1610612736;
		Static124.aClass49_1.method1165(Static59.anInt1479, arg0, arg1, Static106.method1718(arg1 * 128 + 64, arg0 * 128 + 64, Static59.anInt1479), local28, local123, local85, local83);
	}
}
