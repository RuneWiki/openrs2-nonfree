import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "Lclient!ff;")
	public static Class3_Sub1_Sub5_Sub2 aClass3_Sub1_Sub5_Sub2_1;

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "[I")
	public static int[] anIntArray147;

	@OriginalMember(owner = "client!hf", name = "s", descriptor = "Lclient!na;")
	private static Class53 aClass53_554 = Static109.method1737("Friends");

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "Lclient!na;")
	public static Class53 aClass53_548 = aClass53_554;

	@OriginalMember(owner = "client!hf", name = "h", descriptor = "Lclient!na;")
	private static Class53 aClass53_550 = Static109.method1737("yellow:");

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "Lclient!na;")
	public static Class53 aClass53_549 = aClass53_550;

	@OriginalMember(owner = "client!hf", name = "i", descriptor = "I")
	public static int anInt1233 = 0;

	@OriginalMember(owner = "client!hf", name = "j", descriptor = "[Z")
	public static boolean[] aBooleanArray6 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

	@OriginalMember(owner = "client!hf", name = "k", descriptor = "Lclient!na;")
	public static Class53 aClass53_551 = Static109.method1737("ams");

	@OriginalMember(owner = "client!hf", name = "l", descriptor = "Lclient!na;")
	public static Class53 aClass53_552 = Static109.method1737("overlay_multiway");

	@OriginalMember(owner = "client!hf", name = "m", descriptor = "Lclient!na;")
	public static Class53 aClass53_553 = aClass53_550;

	@OriginalMember(owner = "client!hf", name = "n", descriptor = "I")
	public static int anInt1234 = 0;

	@OriginalMember(owner = "client!hf", name = "p", descriptor = "I")
	public static int anInt1236 = 0;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZ[BI)Z")
	public static boolean method864(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Class3_Sub7 local12 = new Class3_Sub7(arg1);
		@Pc(14) int local14 = -1;
		label67: while (true) {
			@Pc(18) int local18 = local12.method619();
			if (local18 == 0) {
				return local7;
			}
			local14 += local18;
			@Pc(29) int local29 = 0;
			@Pc(31) boolean local31 = false;
			while (true) {
				@Pc(68) int local68;
				@Pc(94) Class3_Sub1_Sub2 local94;
				do {
					@Pc(58) int local58;
					@Pc(72) int local72;
					do {
						do {
							do {
								do {
									@Pc(37) int local37;
									while (local31) {
										local37 = local12.method619();
										if (local37 == 0) {
											continue label67;
										}
										local12.method647();
									}
									local37 = local12.method619();
									if (local37 == 0) {
										continue label67;
									}
									local29 += local37 - 1;
									@Pc(54) int local54 = local29 >> 6 & 0x3F;
									local58 = arg0 + local54;
									@Pc(62) int local62 = local29 & 0x3F;
									local68 = local12.method647() >> 2;
									local72 = arg2 + local62;
								} while (local58 <= 0);
							} while (local72 <= 0);
						} while (local58 >= 103);
					} while (local72 >= 103);
					local94 = Static12.method200(local14);
				} while (local68 == 22 && Static45.aBoolean47 && local94.anInt279 == 0 && !local94.aBoolean12);
				if (!local94.method175()) {
					Static94.anInt2245++;
					local7 = false;
				}
				local31 = true;
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
	public static void method865() {
		Static42.method842(Static123.anInt2858);
		if (Static54.anInt2856 != -1) {
			Static42.method842(Static54.anInt2856);
		}
		Static37.anInt2215 = 0;
		Static90.aClass27_34.method1540();
		Static10.anIntArray26 = Static24.method475(Static10.anIntArray26);
		Static84.method1313();
		Static76.method1268(Static123.anInt2858, 503, 0, 765);
		if (Static54.anInt2856 != -1) {
			Static76.method1268(Static54.anInt2856, 503, 0, 765);
		}
		if (Static94.aBoolean93) {
			Static45.method889();
		} else {
			Static125.method1972();
			Static65.method1132();
		}
		try {
			@Pc(61) Graphics local61 = Static87.aCanvas1.getGraphics();
			Static90.aClass27_34.method1536(0, local61, 0);
		} catch (@Pc(74) Exception local74) {
			Static87.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(B)V")
	public static void method866() {
		anIntArray147 = null;
		aClass53_553 = null;
		aBooleanArray6 = null;
		aClass3_Sub1_Sub5_Sub2_1 = null;
		aClass53_554 = null;
		aClass53_551 = null;
		aClass53_552 = null;
		aClass53_550 = null;
		aClass53_548 = null;
		aClass53_549 = null;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
	public static void method867() {
		if (Static40.aClass37_2 != null) {
			Static40.aClass37_2.method948();
			Static40.aClass37_2 = null;
		}
		Static54.method1954();
		Static120.aClass39_1.method995();
		for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
			Static90.aClass9Array1[local14].method150();
		}
		System.gc();
		Static2.method36();
		Static27.anInt856 = -1;
		Static58.aBoolean56 = false;
		Static30.method673();
		Static103.method1692(10);
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V")
	public static void method868() {
		for (@Pc(10) Class3_Sub16 local10 = (Class3_Sub16) Static49.aClass11_7.method189(); local10 != null; local10 = (Class3_Sub16) Static49.aClass11_7.method187()) {
			if (local10.anInt2509 == -1) {
				local10.anInt2510 = 0;
				Static113.method1806(local10);
			} else {
				local10.method1962();
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(B)V")
	public static void method869() {
		Static40.method820();
		Static115.method1819();
		@Pc(25) int local25;
		@Pc(27) int local27;
		if (Static119.anInt444 == 2 || Static119.anInt444 == 5) {
			@Pc(20) byte[] local20 = Static38.aClass3_Sub1_Sub5_Sub3_10.aByteArray22;
			@Pc(22) int[] local22 = Static84.anIntArray256;
			local25 = local20.length;
			for (local27 = 0; local27 < local25; local27++) {
				if (local20[local27] == 0) {
					local22[local27] = 0;
				}
			}
			if (Static119.anInt444 < 3) {
				Static54.aClass3_Sub1_Sub5_Sub4_37.method1329(0, 0, 33, 33, 25, 25, Static87.anInt2099, 256, Static15.anIntArray32, Static118.anIntArray388);
			}
			Static50.method1912();
			return;
		}
		@Pc(71) int local71 = Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anInt1424 / 32 + 48;
		@Pc(78) int local78 = Static87.anInt2099 + Static50.anInt2790 & 0x7FF;
		local25 = 464 - Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anInt1427 / 32;
		Static124.aClass3_Sub1_Sub5_Sub4_38.method1329(25, 5, 146, 151, local71, local25, local78, Static7.anInt197 + 256, Static18.anIntArray50, Static69.anIntArray224);
		for (local27 = 0; local27 < Static35.anInt1114; local27++) {
			local71 = Static40.anIntArray141[local27] * 4 + 2 - Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anInt1424 / 32;
			local25 = Static115.anIntArray372[local27] * 4 + 2 - Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anInt1427 / 32;
			Static80.method1415(local71, local25, Static33.aClass3_Sub1_Sub5_Sub4Array11[local27]);
		}
		@Pc(160) int local160;
		for (@Pc(156) int local156 = 0; local156 < 104; local156++) {
			for (local160 = 0; local160 < 104; local160++) {
				@Pc(170) Class11 local170 = Static95.aClass11ArrayArrayArray1[Static72.anInt1813][local156][local160];
				if (local170 != null) {
					local71 = local156 * 4 + 2 - Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anInt1424 / 32;
					local25 = local160 * 4 + 2 - Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anInt1427 / 32;
					Static80.method1415(local71, local25, Static13.aClass3_Sub1_Sub5_Sub4Array5[0]);
				}
			}
		}
		for (local160 = 0; local160 < Static20.anInt693; local160++) {
			@Pc(222) Class3_Sub1_Sub4_Sub1_Sub1 local222 = Static44.aClass3_Sub1_Sub4_Sub1_Sub1Array1[Static18.anIntArray49[local160]];
			if (local222 != null && local222.method1036()) {
				@Pc(231) Class3_Sub1_Sub1 local231 = local222.aClass3_Sub1_Sub1_1;
				if (local231 != null && local231.anIntArray11 != null) {
					local231 = local231.method77();
				}
				if (local231 != null && local231.aBoolean5 && local231.aBoolean6) {
					local71 = local222.anInt1424 / 32 - Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anInt1424 / 32;
					local25 = local222.anInt1427 / 32 - Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anInt1427 / 32;
					Static80.method1415(local71, local25, Static13.aClass3_Sub1_Sub5_Sub4Array5[1]);
				}
			}
		}
		@Pc(326) int local326;
		@Pc(291) Class3_Sub1_Sub4_Sub1_Sub2 local291;
		for (@Pc(283) int local283 = 0; local283 < Static72.anInt1820; local283++) {
			local291 = Static10.aClass3_Sub1_Sub4_Sub1_Sub2Array1[Static71.anIntArray228[local283]];
			if (local291 != null && local291.method1036()) {
				local71 = local291.anInt1424 / 32 - Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anInt1424 / 32;
				@Pc(309) boolean local309 = false;
				local25 = local291.anInt1427 / 32 - Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anInt1427 / 32;
				@Pc(324) long local324 = local291.aClass53_668.method1286();
				for (local326 = 0; local326 < Static68.anInt1724; local326++) {
					if (Static2.aLongArray1[local326] == local324 && Static120.anIntArray405[local326] != 0) {
						local309 = true;
						break;
					}
				}
				@Pc(352) boolean local352 = false;
				if (Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anInt1506 != 0 && local291.anInt1506 != 0 && local291.anInt1506 == Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anInt1506) {
					local352 = true;
				}
				if (local309) {
					Static80.method1415(local71, local25, Static13.aClass3_Sub1_Sub5_Sub4Array5[3]);
				} else if (local352) {
					Static80.method1415(local71, local25, Static13.aClass3_Sub1_Sub5_Sub4Array5[4]);
				} else {
					Static80.method1415(local71, local25, Static13.aClass3_Sub1_Sub5_Sub4Array5[2]);
				}
			}
		}
		if (Static15.anInt335 != 0 && Static27.anInt843 % 20 < 10) {
			if (Static15.anInt335 == 1 && Static79.anInt1982 >= 0 && Static44.aClass3_Sub1_Sub4_Sub1_Sub1Array1.length > Static79.anInt1982) {
				@Pc(423) Class3_Sub1_Sub4_Sub1_Sub1 local423 = Static44.aClass3_Sub1_Sub4_Sub1_Sub1Array1[Static79.anInt1982];
				if (local423 != null) {
					local71 = local423.anInt1424 / 32 - Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anInt1424 / 32;
					local25 = local423.anInt1427 / 32 - Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anInt1427 / 32;
					Static85.method1433(Static89.aClass3_Sub1_Sub5_Sub4Array12[1], local25, local71);
				}
			}
			if (Static15.anInt335 == 2) {
				local71 = (Static119.anInt432 - Static80.anInt2029) * 4 + 2 - Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anInt1424 / 32;
				local25 = (Static73.anInt1833 - Static4.anInt145) * 4 + 2 - Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anInt1427 / 32;
				Static85.method1433(Static89.aClass3_Sub1_Sub5_Sub4Array12[1], local25, local71);
			}
			if (Static15.anInt335 == 10 && Static41.anInt1203 >= 0 && Static10.aClass3_Sub1_Sub4_Sub1_Sub2Array1.length > Static41.anInt1203) {
				local291 = Static10.aClass3_Sub1_Sub4_Sub1_Sub2Array1[Static41.anInt1203];
				if (local291 != null) {
					local71 = local291.anInt1424 / 32 - Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anInt1424 / 32;
					local25 = local291.anInt1427 / 32 - Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anInt1427 / 32;
					Static85.method1433(Static89.aClass3_Sub1_Sub5_Sub4Array12[1], local25, local71);
				}
			}
		}
		if (Static68.anInt1730 != 0) {
			local25 = Static59.anInt1551 * 4 + 2 - Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anInt1427 / 32;
			local71 = Static68.anInt1730 * 4 + 2 - Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anInt1424 / 32;
			Static80.method1415(local71, local25, Static89.aClass3_Sub1_Sub5_Sub4Array12[0]);
		}
		Static84.method1316(97, 78, 3, 3, 16777215);
		if (Static119.anInt444 >= 3) {
			@Pc(583) byte[] local583 = Static38.aClass3_Sub1_Sub5_Sub3_10.aByteArray22;
			@Pc(585) int[] local585 = Static84.anIntArray256;
			for (@Pc(587) int local587 = 0; local587 <= 33; local587++) {
				@Pc(594) int local594 = local587 * Static38.aClass3_Sub1_Sub5_Sub3_10.anInt1168;
				for (local326 = 0; local326 <= 33; local326++) {
					if (local583[local594 + local326] == 0) {
						local585[local326 + local594] = 0;
					}
				}
			}
		} else {
			Static54.aClass3_Sub1_Sub5_Sub4_37.method1329(0, 0, 33, 33, 25, 25, Static87.anInt2099, 256, Static15.anIntArray32, Static118.anIntArray388);
		}
		Static50.method1912();
	}
}
