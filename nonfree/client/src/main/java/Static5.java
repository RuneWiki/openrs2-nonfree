import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ad", name = "kb", descriptor = "Lclient!ub;")
	public static Class3_Sub1_Sub4_Sub2 aClass3_Sub1_Sub4_Sub2_6;

	@OriginalMember(owner = "client!ad", name = "ob", descriptor = "[[B")
	public static byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!ad", name = "sb", descriptor = "I")
	public static int anInt256;

	@OriginalMember(owner = "client!ad", name = "q", descriptor = "Lclient!e;")
	public static Class3_Sub4_Sub1 aClass3_Sub4_Sub1_1 = new Class3_Sub4_Sub1(5000);

	@OriginalMember(owner = "client!ad", name = "ab", descriptor = "Lclient!ad;")
	public static Class4 aClass4_111 = Static75.method1216("Bitte warten Sie eine Minute");

	@OriginalMember(owner = "client!ad", name = "bb", descriptor = "Lclient!ad;")
	private static Class4 aClass4_112 = Static75.method1216("Error loading your profile)3");

	@OriginalMember(owner = "client!ad", name = "cb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_113 = aClass4_112;

	@OriginalMember(owner = "client!ad", name = "gb", descriptor = "Lclient!ad;")
	private static Class4 aClass4_115 = Static75.method1216("Enter your username (V password)3");

	@OriginalMember(owner = "client!ad", name = "db", descriptor = "Lclient!ad;")
	public static Class4 aClass4_114 = aClass4_115;

	@OriginalMember(owner = "client!ad", name = "hb", descriptor = "[I")
	public static int[] anIntArray10 = new int[2000];

	@OriginalMember(owner = "client!ad", name = "ib", descriptor = "Lclient!bb;")
	public static Class8 aClass8_2 = new Class8(64);

	@OriginalMember(owner = "client!ad", name = "jb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_116 = Static75.method1216("sch-Utteln:");

	@OriginalMember(owner = "client!ad", name = "lb", descriptor = "Lclient!wb;")
	public static Class68 aClass68_1 = new Class68();

	@OriginalMember(owner = "client!ad", name = "mb", descriptor = "I")
	public static int anInt255 = 1;

	@OriginalMember(owner = "client!ad", name = "nb", descriptor = "[I")
	public static int[] anIntArray11 = new int[50];

	@OriginalMember(owner = "client!ad", name = "pb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_117 = Static75.method1216("null");

	@OriginalMember(owner = "client!ad", name = "qb", descriptor = "[Lclient!me;")
	public static Class50[] aClass50Array1 = new Class50[50];

	@OriginalMember(owner = "client!ad", name = "rb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_118 = Static75.method1216("null");

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)Lclient!ad;")
	public static Class4 method126(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - arg0;
		if (local8 < -9) {
			return Static104.aClass4_1405;
		} else if (local8 < -6) {
			return Static47.aClass4_606;
		} else if (local8 < -3) {
			return Static38.aClass4_1574;
		} else if (local8 < 0) {
			return Static54.aClass4_680;
		} else if (local8 > 9) {
			return Static34.aClass4_522;
		} else if (local8 > 6) {
			return Static44.aClass4_579;
		} else if (local8 > 3) {
			return Static11.aClass4_1596;
		} else if (local8 > 0) {
			return Static72.aClass4_917;
		} else {
			return Static65.aClass4_832;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIIZ)V")
	public static void method127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static92.anInt2106 == arg1 && Static92.anInt2129 == arg0 && (arg2 == Static72.anInt1739 || !Static36.aBoolean70)) {
			return;
		}
		Static72.anInt1739 = arg2;
		Static92.anInt2106 = arg1;
		Static92.anInt2129 = arg0;
		if (!Static36.aBoolean70) {
			Static72.anInt1739 = 0;
		}
		Static60.method1007(25);
		Static63.method1086(false, Static60.aClass4_756, null);
		@Pc(41) int local41 = Static93.anInt2429;
		@Pc(43) int local43 = Static43.anInt1144;
		Static43.anInt1144 = arg1 * 8 - 48;
		@Pc(54) int local54 = Static43.anInt1144 - local43;
		Static93.anInt2429 = arg0 * 8 - 48;
		@Pc(67) int local67 = Static93.anInt2429 - local41;
		for (@Pc(71) int local71 = 0; local71 < 32768; local71++) {
			@Pc(77) Class3_Sub1_Sub1_Sub1_Sub1 local77 = Static90.aClass3_Sub1_Sub1_Sub1_Sub1Array9[local71];
			if (local77 != null) {
				for (@Pc(81) int local81 = 0; local81 < 10; local81++) {
					local77.anIntArray289[local81] -= local54;
					local77.anIntArray286[local81] -= local67;
				}
				local77.anInt2348 -= local67 * 128;
				local77.anInt2342 -= local54 * 128;
			}
		}
		for (@Pc(125) int local125 = 0; local125 < 2048; local125++) {
			@Pc(131) Class3_Sub1_Sub1_Sub1_Sub2 local131 = Static7.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local125];
			if (local131 != null) {
				for (@Pc(135) int local135 = 0; local135 < 10; local135++) {
					local131.anIntArray289[local135] -= local54;
					local131.anIntArray286[local135] -= local67;
				}
				local131.anInt2348 -= local67 * 128;
				local131.anInt2342 -= local54 * 128;
			}
		}
		Static49.anInt1203 = arg2;
		Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.method1553(arg3, false, arg4);
		@Pc(198) byte local198 = 0;
		@Pc(200) byte local200 = 104;
		@Pc(202) byte local202 = 1;
		@Pc(204) byte local204 = 0;
		if (local54 < 0) {
			local202 = -1;
			local200 = -1;
			local198 = 103;
		}
		@Pc(214) byte local214 = 104;
		@Pc(216) byte local216 = 1;
		if (local67 < 0) {
			local204 = 103;
			local216 = -1;
			local214 = -1;
		}
		for (@Pc(229) int local229 = local198; local229 != local200; local229 += local202) {
			for (@Pc(233) int local233 = local204; local233 != local214; local233 += local216) {
				@Pc(239) int local239 = local229 + local54;
				@Pc(243) int local243 = local233 + local67;
				for (@Pc(245) int local245 = 0; local245 < 4; local245++) {
					if (local239 >= 0 && local243 >= 0 && local239 < 104 && local243 < 104) {
						Static22.aClass20ArrayArrayArray1[local245][local229][local233] = Static22.aClass20ArrayArrayArray1[local245][local239][local243];
					} else {
						Static22.aClass20ArrayArrayArray1[local245][local229][local233] = null;
					}
				}
			}
		}
		for (@Pc(312) Class3_Sub12 local312 = (Class3_Sub12) Static67.aClass20_8.method308(); local312 != null; local312 = (Class3_Sub12) Static67.aClass20_8.method309()) {
			local312.anInt2767 -= local67;
			local312.anInt2776 -= local54;
			if (local312.anInt2776 < 0 || local312.anInt2767 < 0 || local312.anInt2776 >= 104 || local312.anInt2767 >= 104) {
				local312.method1930();
			}
		}
		Static103.aBoolean217 = false;
		Static55.anInt1389 = -1;
		Static28.anInt868 = 0;
		if (Static31.anInt954 != 0) {
			Static31.anInt954 -= local54;
			Static103.anInt2539 -= local67;
		}
		Static20.aClass20_2.method310();
		Static35.aClass20_4.method310();
	}

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "(I)V")
	public static void method135() {
		anIntArray11 = null;
		aClass8_2 = null;
		aClass4_118 = null;
		aClass4_111 = null;
		aClass3_Sub4_Sub1_1 = null;
		anIntArray10 = null;
		aClass4_117 = null;
		aClass4_116 = null;
		aClass4_113 = null;
		aClass4_114 = null;
		aByteArrayArray1 = null;
		aClass68_1 = null;
		aClass50Array1 = null;
		aClass4_112 = null;
		aClass4_115 = null;
		aClass3_Sub1_Sub4_Sub2_6 = null;
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(IB)V")
	public static void method143() {
		Static29.method616(10, null, 0, false);
	}

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "(B)V")
	public static void method144() {
		Static7.method171();
		if (Static19.anInt476 == 1) {
			Static47.aClass3_Sub1_Sub4_Sub2Array8[Static60.anInt1491 / 100].method1733(Static55.anInt1393 - 8 - 4, Static49.anInt1217 - 8 + -4);
		}
		if (Static19.anInt476 == 2) {
			Static47.aClass3_Sub1_Sub4_Sub2Array8[Static60.anInt1491 / 100 + 4].method1733(Static55.anInt1393 - 4 - 8, Static49.anInt1217 + -12);
		}
		if (Static21.anInt490 != -1) {
			Static16.method229(Static21.anInt490);
			Static73.method1186(334, 512, 4, Static21.anInt490);
		}
		if (Static48.anInt1201 != -1) {
			Static16.method229(Static48.anInt1201);
			Static73.method1186(334, 512, 0, Static48.anInt1201);
		}
		Static53.method1654();
		if (!Static106.aBoolean231) {
			Static68.method1120();
			Static90.method1918();
		} else if (Static76.anInt1815 == 0) {
			Static104.method1698();
		}
		if (Static38.anInt2802 == 1) {
			Static103.aClass3_Sub1_Sub4_Sub2_43.method1733(472, 296);
		}
		@Pc(154) int local154;
		if (Static28.aBoolean53) {
			@Pc(116) byte local116 = 20;
			@Pc(120) int local120 = 16776960;
			if (Static113.anInt2860 < 30 && Static36.aBoolean70) {
				local120 = 16711680;
			}
			if (Static113.anInt2860 < 20 && !Static36.aBoolean70) {
				local120 = 16711680;
			}
			Static71.aClass3_Sub1_Sub4_Sub4_2.method1856(Static60.method1012(new Class4[] { Static77.aClass4_1026, Static93.method1632(Static113.anInt2860) }), 20, local120);
			local154 = local116 + 15;
			local120 = 16776960;
			@Pc(158) Runtime local158 = Runtime.getRuntime();
			@Pc(167) int local167 = (int) ((local158.totalMemory() - local158.freeMemory()) / 1024L);
			if (local167 > 32768 && Static36.aBoolean70) {
				local120 = 16711680;
			}
			if (local167 > 65536 && !Static36.aBoolean70) {
				local120 = 16711680;
			}
			Static71.aClass3_Sub1_Sub4_Sub4_2.method1856(Static60.method1012(new Class4[] { Static43.aClass4_577, Static93.method1632(local167), Static53.aClass4_1360 }), 35, local120);
			local154 += 15;
			if (Static3.aBoolean193) {
				Static71.aClass3_Sub1_Sub4_Sub4_2.method1856(Static17.aClass4_199, 50, 16711680);
				local154 += 15;
				Static3.aBoolean193 = false;
			}
			if (Static42.aBoolean80) {
				Static71.aClass3_Sub1_Sub4_Sub4_2.method1856(Static24.aClass4_325, local154, 16711680);
				Static42.aBoolean80 = false;
				local154 += 15;
			}
			if (Static72.aBoolean134) {
				Static71.aClass3_Sub1_Sub4_Sub4_2.method1856(Static28.aClass4_412, local154, 16711680);
				Static72.aBoolean134 = false;
				local154 += 15;
			}
		}
		if (Static11.anInt2850 == 0) {
			return;
		}
		@Pc(247) int local247 = Static11.anInt2850 / 50;
		local154 = local247 / 60;
		@Pc(255) int local255 = local247 % 60;
		if (local255 >= 10) {
			Static71.aClass3_Sub1_Sub4_Sub4_2.method1866(Static60.method1012(new Class4[] { Static107.aClass4_1491, Static93.method1632(local154), Static25.aClass4_352, Static93.method1632(local255) }), 4, 329, 16776960);
		} else {
			Static71.aClass3_Sub1_Sub4_Sub4_2.method1866(Static60.method1012(new Class4[] { Static107.aClass4_1491, Static93.method1632(local154), Static17.aClass4_203, Static93.method1632(local255) }), 4, 329, 16776960);
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IBIII)I")
	public static int method147(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(24) int local24 = 65536 - Class3_Sub1_Sub4_Sub1.anIntArray298[arg1 * 1024 / arg0] >> 1;
		return (arg2 * local24 >> 16) + (arg3 * (65536 - local24) >> 16);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)Lclient!qb;")
	public static Class3_Sub1_Sub12 method152(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub1_Sub12 local10 = (Class3_Sub1_Sub12) Static52.aClass8_17.method195((long) arg0);
		if (local10 != null) {
			return local10;
		}
		local10 = Static103.method1690(Static43.aClass64_34, Static24.aClass64_19, arg0);
		if (local10 != null) {
			Static52.aClass8_17.method199((long) arg0, local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!rc;)Z")
	public static boolean method154(@OriginalArg(1) Class3_Sub1_Sub14 arg0) {
		if (arg0.anIntArray267 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < arg0.anIntArray267.length; local12++) {
			@Pc(19) int local19 = Static81.method1281(local12, arg0);
			@Pc(24) int local24 = arg0.anIntArray268[local12];
			if (arg0.anIntArray267[local12] == 2) {
				if (local19 >= local24) {
					return false;
				}
			} else if (arg0.anIntArray267[local12] == 3) {
				if (local24 >= local19) {
					return false;
				}
			} else if (arg0.anIntArray267[local12] == 4) {
				if (local19 == local24) {
					return false;
				}
			} else if (local19 != local24) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZI)V")
	public static void method155(@OriginalArg(1) int arg0) {
		if (!Static100.method1650(arg0)) {
			return;
		}
		@Pc(14) Class3_Sub1_Sub14[] local14 = Static104.aClass3_Sub1_Sub14ArrayArray1[arg0];
		for (@Pc(20) int local20 = 0; local20 < local14.length; local20++) {
			@Pc(26) Class3_Sub1_Sub14 local26 = local14[local20];
			if (local26.anObjectArray6 != null) {
				Static46.method1874(0, 0, local26, local26.anObjectArray6);
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BILclient!rd;I)Z")
	public static boolean method161(@OriginalArg(1) int arg0, @OriginalArg(2) Class64 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) byte[] local9 = arg1.method1625(arg2, arg0);
		if (local9 == null) {
			return false;
		} else {
			Static113.method1935(local9);
			return true;
		}
	}
}
