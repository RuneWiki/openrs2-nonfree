import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!ce", name = "Bb", descriptor = "[Lclient!pb;")
	public static Class1_Sub1_Sub4_Sub4[] aClass1_Sub1_Sub4_Sub4Array3;

	@OriginalMember(owner = "client!ce", name = "Lb", descriptor = "Z")
	public static boolean aBoolean56;

	@OriginalMember(owner = "client!ce", name = "sb", descriptor = "I")
	public static int anInt617 = 0;

	@OriginalMember(owner = "client!ce", name = "yb", descriptor = "Lclient!kd;")
	private static Class39 aClass39_323 = Static108.method1915("Loading title screen )2 ");

	@OriginalMember(owner = "client!ce", name = "xb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_322 = aClass39_323;

	@OriginalMember(owner = "client!ce", name = "Hb", descriptor = "Lclient!kd;")
	private static Class39 aClass39_324 = Static108.method1915("Connecting to friendserver");

	@OriginalMember(owner = "client!ce", name = "Jb", descriptor = "I")
	public static int anInt630 = 0;

	@OriginalMember(owner = "client!ce", name = "Kb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_325 = aClass39_324;

	@OriginalMember(owner = "client!ce", name = "Pb", descriptor = "[I")
	public static int[] anIntArray103 = new int[50];

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IBIIIII)I")
	public static int method352(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg3 & 0x3;
		if ((arg1 & 0x1) == 1) {
			@Pc(16) int local16 = arg4;
			arg4 = arg2;
			arg2 = local16;
		}
		if (local3 == 0) {
			return arg5;
		} else if (local3 == 1) {
			return arg0;
		} else if (local3 == 2) {
			return 7 + 1 - arg5 - arg4;
		} else {
			return 8 - arg0 - arg2;
		}
	}

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "(B)V")
	public static void method353() {
		if (Static58.anInt1564 == 2) {
			Static74.method1279((Static40.anInt1177 - Static103.anInt2610 << 7) + anInt630, Static56.anInt1517 + (-Static71.anInt1795 + Static69.anInt1768 << 7), Static38.anInt1155 * 2);
			if (Static9.anInt2985 > -1 && Static45.anInt1256 % 20 < 10) {
				Static29.aClass1_Sub1_Sub4_Sub4Array5[0].method1539(Static9.anInt2985 - 12, Static38.anInt1158 + -28);
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IBII)V")
	public static void method354(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
			for (local7 = 0; local7 < 8; local7++) {
				Static51.anIntArrayArrayArray6[arg1][local3 + arg2][arg0 + local7] = 0;
			}
		}
		if (arg2 > 0) {
			for (local7 = 1; local7 < 8; local7++) {
				Static51.anIntArrayArrayArray6[arg1][arg2][local7 + arg0] = Static51.anIntArrayArrayArray6[arg1][arg2 - 1][arg0 + local7];
			}
		}
		if (arg0 > 0) {
			for (local7 = 1; local7 < 8; local7++) {
				Static51.anIntArrayArrayArray6[arg1][local7 + arg2][arg0] = Static51.anIntArrayArrayArray6[arg1][local7 + arg2][arg0 - 1];
			}
		}
		if (arg2 > 0 && Static51.anIntArrayArrayArray6[arg1][arg2 - 1][arg0] != 0) {
			Static51.anIntArrayArrayArray6[arg1][arg2][arg0] = Static51.anIntArrayArrayArray6[arg1][arg2 - 1][arg0];
		} else if (arg0 > 0 && Static51.anIntArrayArrayArray6[arg1][arg2][arg0 - 1] != 0) {
			Static51.anIntArrayArrayArray6[arg1][arg2][arg0] = Static51.anIntArrayArrayArray6[arg1][arg2][arg0 - 1];
		} else if (arg2 > 0 && arg0 > 0 && Static51.anIntArrayArrayArray6[arg1][arg2 - 1][arg0 - 1] != 0) {
			Static51.anIntArrayArrayArray6[arg1][arg2][arg0] = Static51.anIntArrayArrayArray6[arg1][arg2 - 1][arg0 - 1];
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZI)V")
	public static void method355(@OriginalArg(0) boolean arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static20.anInt731; local3++) {
			@Pc(11) Class1_Sub1_Sub2_Sub1_Sub1 local11 = Static114.aClass1_Sub1_Sub2_Sub1_Sub1Array1[Static51.anIntArray192[local3]];
			@Pc(19) int local19 = (Static51.anIntArray192[local3] << 14) + 536870912;
			if (local11 != null && local11.method1797() && arg0 == local11.aClass1_Sub1_Sub5_1.aBoolean74 && local11.aClass1_Sub1_Sub5_1.method523()) {
				@Pc(44) int local44 = local11.anInt2508 >> 7;
				@Pc(49) int local49 = local11.anInt2521 >> 7;
				if (local49 >= 0 && local49 < 104 && local44 >= 0 && local44 < 104) {
					if (local11.anInt2486 == 1 && (local11.anInt2521 & 0x7F) == 64 && (local11.anInt2508 & 0x7F) == 64) {
						if (Static46.anIntArrayArray26[local49][local44] == Static38.anInt1159) {
							continue;
						}
						Static46.anIntArrayArray26[local49][local44] = Static38.anInt1159;
					}
					if (!local11.aClass1_Sub1_Sub5_1.aBoolean76) {
						local19 += Integer.MIN_VALUE;
					}
					Static32.aClass5_2.method108(Static9.anInt2983, local11.anInt2521, local11.anInt2508, Static62.method2035(Static9.anInt2983, local11.anInt2486 * 64 + local11.anInt2521 - 64, local11.anInt2508 + (local11.anInt2486 + -1) * 64), (local11.anInt2486 - 1) * 64 + 60, local11, local11.anInt2509, local19, local11.aBoolean203);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(BJ)V")
	public static void method356(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < Static12.anInt502; local14++) {
			if (Static45.aLongArray3[local14] == arg0) {
				Static35.aBoolean96 = true;
				Static12.anInt502--;
				for (@Pc(38) int local38 = local14; local38 < Static12.anInt502; local38++) {
					Static117.aClass39Array29[local38] = Static117.aClass39Array29[local38 + 1];
					Static14.anIntArray93[local38] = Static14.anIntArray93[local38 + 1];
					Static45.aLongArray3[local38] = Static45.aLongArray3[local38 + 1];
					Static88.anIntArray322[local38] = Static88.anIntArray322[local38 + 1];
				}
				Static96.anInt2282 = Static45.anInt1256 + 1;
				Static103.aClass1_Sub18_Sub1_5.method2203(148);
				Static103.aClass1_Sub18_Sub1_5.method2179(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(II)V")
	public static void method357(@OriginalArg(1) int arg0) {
		if (arg0 == -3) {
			Static38.method688(Static114.aClass39_1358, Static9.aClass39_1461, Static129.aClass39_1549);
		} else if (arg0 == -2) {
			Static38.method688(Static113.aClass39_1355, Static9.aClass39_1452, Static9.aClass39_1451);
		} else if (arg0 == -1) {
			Static38.method688(Static114.aClass39_1356, Static9.aClass39_1476, Static85.aClass39_1021);
		} else if (arg0 == 3) {
			Static38.method688(Static22.aClass39_370, Static9.aClass39_1473, Static9.aClass39_1471);
		} else if (arg0 == 4) {
			Static38.method688(Static46.aClass39_1330, Static9.aClass39_1477, Static116.aClass39_1381);
		} else if (arg0 == 5) {
			Static38.method688(Static77.aClass39_963, Static9.aClass39_1459, Static96.aClass39_1152);
		} else if (arg0 == 6) {
			Static38.method688(Static14.aClass39_287, Static9.aClass39_1439, Static92.aClass39_1109);
		} else if (arg0 == 7) {
			Static38.method688(Static56.aClass39_742, Static9.aClass39_1455, Static92.aClass39_1105);
		} else if (arg0 == 8) {
			Static38.method688(Static45.aClass39_605, Static9.aClass39_1446, Static21.aClass39_353);
		} else if (arg0 == 9) {
			Static38.method688(Static119.aClass39_1419, Static9.aClass39_1440, Static49.aClass39_653);
		} else if (arg0 == 10) {
			Static38.method688(Static31.aClass39_473, Static9.aClass39_1475, Static21.aClass39_355);
		} else if (arg0 == 11) {
			Static38.method688(Static44.aClass39_602, Static9.aClass39_1444, Static92.aClass39_1102);
		} else if (arg0 == 12) {
			Static38.method688(Static39.aClass39_549, Static9.aClass39_1438, Static124.aClass39_1490);
		} else if (arg0 == 13) {
			Static38.method688(Static114.aClass39_1365, Static9.aClass39_1465, Static102.aClass39_1252);
		} else if (arg0 == 14) {
			Static38.method688(Static67.aClass39_856, Static9.aClass39_1457, Static129.aClass39_1551);
		} else if (arg0 == 16) {
			Static38.method688(Static46.aClass39_1334, Static9.aClass39_1472, Static85.aClass39_1024);
		} else if (arg0 == 17) {
			Static38.method688(Static87.aClass39_1007, Static9.aClass39_1450, Static102.aClass39_1251);
		} else if (arg0 == 18) {
			Static38.method688(Static35.aClass39_500, Static9.aClass39_1478, Static40.aClass39_555);
		} else if (arg0 == 19) {
			Static38.method688(Static93.aClass39_1128, Static56.aClass39_746, Static46.aClass39_1332);
		} else if (arg0 == 20) {
			Static38.method688(Static114.aClass39_1364, Static9.aClass39_1474, Static73.aClass39_897);
		} else if (arg0 == 22) {
			Static38.method688(Static119.aClass39_1417, Static9.aClass39_1443, Static76.aClass39_945);
		} else if (arg0 == 23) {
			Static38.method688(Static67.aClass39_858, Static9.aClass39_1466, Static107.aClass39_1308);
		} else if (arg0 == 24) {
			Static38.method688(Static77.aClass39_966, Static9.aClass39_1462, Static54.aClass39_722);
		} else if (arg0 == 25) {
			Static38.method688(Static114.aClass39_1360, Static9.aClass39_1464, Static85.aClass39_1018);
		} else if (arg0 == 26) {
			Static38.method688(Static53.aClass39_706, Static9.aClass39_1441, Static91.aClass39_1086);
		} else if (arg0 == 27) {
			Static38.method688(Static92.aClass39_1101, Static9.aClass39_1447, Static9.aClass39_1456);
		} else {
			Static38.method688(Static114.aClass39_1366, Static9.aClass39_1449, Static9.aClass39_1436);
		}
		Static41.method2108(10);
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(IBII)Z")
	public static boolean method358(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11 = arg0 >> 14 & 0x7FFF;
		@Pc(18) int local18 = Static32.aClass5_2.method122(Static9.anInt2983, arg2, arg1, arg0);
		if (local18 == -1) {
			return false;
		}
		@Pc(28) int local28 = local18 & 0x1F;
		@Pc(34) int local34 = local18 >> 6 & 0x3;
		if (local28 == 10 || local28 == 11 || local28 == 22) {
			@Pc(75) Class1_Sub1_Sub18 local75 = Static104.method1862(local11);
			@Pc(86) int local86;
			@Pc(89) int local89;
			if (local34 == 0 || local34 == 2) {
				local86 = local75.anInt3039;
				local89 = local75.anInt3029;
			} else {
				local86 = local75.anInt3029;
				local89 = local75.anInt3039;
			}
			@Pc(100) int local100 = local75.anInt3047;
			if (local34 != 0) {
				local100 = (local100 << local34 & 0xF) + (local100 >> 4 - local34);
			}
			Static45.method792(Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray389[0], 0, 0, local86, Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray387[0], 2, arg2, arg1, local100, local89, true);
		} else {
			Static45.method792(Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray389[0], local34, local28 + 1, 0, Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray387[0], 2, arg2, arg1, 0, 0, true);
		}
		Static104.anInt2644 = Static89.anInt2109;
		Static95.anInt2879 = 0;
		Static77.anInt1930 = 2;
		Static66.anInt1726 = Static38.anInt1157;
		return true;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(IB)I")
	public static int method360(@OriginalArg(0) int arg0) {
		@Pc(3) Class1_Sub1_Sub8 local3 = Static99.method1764(arg0);
		@Pc(10) int local10 = local3.anInt1123;
		@Pc(13) int local13 = local3.anInt1115;
		@Pc(16) int local16 = local3.anInt1119;
		@Pc(31) int local31 = Class39.anIntArray245[local13 - local16];
		return local31 & Static44.anIntArray175[local10] >> local16;
	}

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "(I)V")
	public static void method361() {
		aClass39_322 = null;
		anIntArray103 = null;
		aClass39_323 = null;
		aClass39_325 = null;
		aClass39_324 = null;
		aClass1_Sub1_Sub4_Sub4Array3 = null;
	}
}
