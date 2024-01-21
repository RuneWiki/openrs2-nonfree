import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!o", name = "K", descriptor = "Lclient!re;")
	public static Class69 aClass69_1;

	@OriginalMember(owner = "client!o", name = "P", descriptor = "I")
	public static int anInt2027;

	@OriginalMember(owner = "client!o", name = "R", descriptor = "I")
	public static int anInt2029;

	@OriginalMember(owner = "client!o", name = "Y", descriptor = "Lclient!gf;")
	public static Class3_Sub1_Sub5_Sub3 aClass3_Sub1_Sub5_Sub3_18;

	@OriginalMember(owner = "client!o", name = "L", descriptor = "Lclient!na;")
	private static Class53 aClass53_923 = Static109.method1737("Invalid username or password)3");

	@OriginalMember(owner = "client!o", name = "O", descriptor = "Lclient!na;")
	public static Class53 aClass53_924 = aClass53_923;

	@OriginalMember(owner = "client!o", name = "bb", descriptor = "Lclient!na;")
	private static Class53 aClass53_926 = Static109.method1737("Bad session id)3");

	@OriginalMember(owner = "client!o", name = "S", descriptor = "Lclient!na;")
	public static Class53 aClass53_925 = aClass53_926;

	@OriginalMember(owner = "client!o", name = "W", descriptor = "I")
	public static int anInt2033 = 0;

	@OriginalMember(owner = "client!o", name = "e", descriptor = "(I)V")
	public static void method1413() {
		Static40.method820();
		Static93.aBoolean90 = true;
		Static93.method1541();
		if (Static68.aBoolean62) {
			Static43.aClass3_Sub1_Sub5_Sub2_1.method735(Static35.aClass53_478, 239, 40, 0);
			Static43.aClass3_Sub1_Sub5_Sub2_1.method735(Static103.method1689(new Class53[] { Static35.aClass53_475, Static40.aClass53_519 }), 239, 60, 128);
		} else if (Static105.anInt2427 == 1) {
			Static43.aClass3_Sub1_Sub5_Sub2_1.method735(Static107.aClass53_1238, 239, 40, 0);
			Static43.aClass3_Sub1_Sub5_Sub2_1.method735(Static103.method1689(new Class53[] { Static35.aClass53_479, Static40.aClass53_519 }), 239, 60, 128);
		} else if (Static105.anInt2427 == 2) {
			Static43.aClass3_Sub1_Sub5_Sub2_1.method735(Static36.aClass53_488, 239, 40, 0);
			Static43.aClass3_Sub1_Sub5_Sub2_1.method735(Static103.method1689(new Class53[] { Static35.aClass53_479, Static40.aClass53_519 }), 239, 60, 128);
		} else {
			@Pc(105) int local105;
			@Pc(107) int local107;
			@Pc(98) Class3_Sub1_Sub5_Sub2 local98;
			if (Static105.anInt2427 == 3) {
				if (Static35.aClass53_470 != Static35.aClass53_479) {
					Static122.method1946(Static35.aClass53_479);
					Static35.aClass53_470 = Static35.aClass53_479;
				}
				local98 = Static89.aClass3_Sub1_Sub5_Sub2_3;
				Static84.method1317(0, 0, 463, 77);
				for (local105 = 0; local105 < Static49.anInt1322; local105++) {
					local107 = local105 * 14 + 18 - Static8.anInt208;
					if (local107 > 0 && local107 < 110) {
						local98.method735(Static9.aClass53Array2[local105], 239, local107, 0);
					}
				}
				Static84.method1321();
				if (Static49.anInt1322 > 5) {
					Static79.method1383(77, Static49.anInt1322 * 14 + 7, 0, Static8.anInt208, 463);
				}
				if (Static35.aClass53_479.method1294() == 0) {
					Static43.aClass3_Sub1_Sub5_Sub2_1.method735(Static91.aClass53_1054, 239, 40, 255);
				} else if (Static49.anInt1322 == 0) {
					Static43.aClass3_Sub1_Sub5_Sub2_1.method735(Static77.aClass53_866, 239, 40, 0);
				}
				local98.method735(Static103.method1689(new Class53[] { Static35.aClass53_479, Static40.aClass53_519 }), 239, 90, 0);
				Static84.method1322(0, 77, 479, 0);
			} else if (Static105.anInt2427 == 4) {
				Static43.aClass3_Sub1_Sub5_Sub2_1.method735(Static35.aClass53_474, 239, 40, 0);
				Static43.aClass3_Sub1_Sub5_Sub2_1.method735(Static103.method1689(new Class53[] { Static35.aClass53_479, Static40.aClass53_519 }), 239, 60, 128);
			} else if (Static114.aClass53_1307 == null) {
				@Pc(72) boolean local72;
				if (Static123.anInt2865 != -1) {
					local72 = Static76.method1268(Static123.anInt2865, 96, 2, 479);
					if (!local72) {
						Static52.aBoolean50 = true;
					}
				} else if (Static30.anInt1019 == -1) {
					local98 = Static89.aClass3_Sub1_Sub5_Sub2_3;
					Static84.method1317(0, 0, 463, 77);
					local105 = 0;
					for (local107 = 0; local107 < 100; local107++) {
						if (Static94.aClass53Array16[local107] != null) {
							@Pc(123) int local123 = Static3.anInt80 + 70 - local105 * 14;
							@Pc(127) int local127 = Static82.anIntArray110[local107];
							@Pc(131) Class53 local131 = Static15.aClass53Array4[local107];
							@Pc(133) byte local133 = 0;
							if (local131 != null && local131.method1291(Static40.aClass53_516)) {
								local133 = 1;
								local131 = local131.method1289(5);
							}
							if (local131 != null && local131.method1291(Static126.aClass53_1045)) {
								local131 = local131.method1289(5);
								local133 = 2;
							}
							if (local127 == 0) {
								if (local123 > 0 && local123 < 110) {
									local98.method746(Static94.aClass53Array16[local107], 4, local123, 0);
								}
								local105++;
							}
							@Pc(217) int local217;
							if ((local127 == 1 || local127 == 2) && (local127 == 1 || Static68.anInt1720 == 0 || Static68.anInt1720 == 1 && Static125.method1973(local131))) {
								local105++;
								if (local123 > 0 && local123 < 110) {
									local217 = 4;
									if (local133 == 1) {
										Static53.aClass3_Sub1_Sub5_Sub3Array7[0].method813(4, local123 - 12);
										local217 += 14;
									}
									if (local133 == 2) {
										Static53.aClass3_Sub1_Sub5_Sub3Array7[1].method813(local217, local123 - 12);
										local217 += 14;
									}
									local98.method746(Static103.method1689(new Class53[] { local131, Static107.aClass53_1235 }), local217, local123, 0);
									local217 += local98.method745(local131) + 8;
									local98.method746(Static94.aClass53Array16[local107], local217, local123, 255);
								}
							}
							if ((local127 == 3 || local127 == 7) && Static91.anInt2195 == 0 && (local127 == 7 || Static9.anInt237 == 0 || Static9.anInt237 == 1 && Static125.method1973(local131))) {
								local105++;
								if (local123 > 0 && local123 < 110) {
									local98.method746(Static65.aClass53_741, 4, local123, 0);
									local217 = local98.method745(Static65.aClass53_741) + 4;
									local217 += local98.method755(32);
									if (local133 == 1) {
										Static53.aClass3_Sub1_Sub5_Sub3Array7[0].method813(local217, local123 - 12);
										local217 += 14;
									}
									if (local133 == 2) {
										Static53.aClass3_Sub1_Sub5_Sub3Array7[1].method813(local217, local123 - 12);
										local217 += 14;
									}
									local98.method746(Static103.method1689(new Class53[] { local131, Static107.aClass53_1235 }), local217, local123, 0);
									local217 += local98.method745(local131) + 8;
									local98.method746(Static94.aClass53Array16[local107], local217, local123, 8388608);
								}
							}
							if (local127 == 4 && (Static88.anInt2106 == 0 || Static88.anInt2106 == 1 && Static125.method1973(local131))) {
								if (local123 > 0 && local123 < 110) {
									local98.method746(Static103.method1689(new Class53[] { local131, Static104.aClass53_1278, Static94.aClass53Array16[local107] }), 4, local123, 8388736);
								}
								local105++;
							}
							if (local127 == 5 && Static91.anInt2195 == 0 && Static9.anInt237 < 2) {
								if (local123 > 0 && local123 < 110) {
									local98.method746(Static94.aClass53Array16[local107], 4, local123, 8388608);
								}
								local105++;
							}
							if (local127 == 6 && Static91.anInt2195 == 0 && Static9.anInt237 < 2) {
								local105++;
								if (local123 > 0 && local123 < 110) {
									local98.method746(Static103.method1689(new Class53[] { Static107.aClass53_1237, Static104.aClass53_1278, local131, Static107.aClass53_1235 }), 4, local123, 0);
									local98.method746(Static94.aClass53Array16[local107], local98.method745(Static103.method1689(new Class53[] { Static107.aClass53_1237, Static104.aClass53_1278, local131 })) + 12, local123, 8388608);
								}
							}
							if (local127 == 8 && (Static88.anInt2106 == 0 || Static88.anInt2106 == 1 && Static125.method1973(local131))) {
								if (local123 > 0 && local123 < 110) {
									local98.method746(Static103.method1689(new Class53[] { local131, Static104.aClass53_1278, Static94.aClass53Array16[local107] }), 4, local123, 8270336);
								}
								local105++;
							}
						}
					}
					Static84.method1321();
					Static52.anInt1346 = local105 * 14 + 7;
					if (Static52.anInt1346 < 78) {
						Static52.anInt1346 = 78;
					}
					Static79.method1383(77, Static52.anInt1346, 0, Static52.anInt1346 - Static3.anInt80 - 77, 463);
					@Pc(623) Class53 local623;
					if (Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1 == null || Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.aClass53_668 == null) {
						local623 = Static122.aClass53_1409;
					} else {
						local623 = Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.aClass53_668;
					}
					local98.method746(Static103.method1689(new Class53[] { local623, Static107.aClass53_1235 }), 4, 90, 0);
					local98.method746(Static103.method1689(new Class53[] { Static35.aClass53_469, Static40.aClass53_519 }), local98.method745(Static103.method1689(new Class53[] { local623, Static61.aClass53_708 })) + 6, 90, 255);
					Static84.method1322(0, 77, 479, 0);
				} else {
					local72 = Static76.method1268(Static30.anInt1019, 96, 3, 479);
					if (!local72) {
						Static52.aBoolean50 = true;
					}
				}
			} else {
				Static43.aClass3_Sub1_Sub5_Sub2_1.method739(Static114.aClass53_1307, 10, 20, 459, 40, 0, false, 1, 1, 0);
				Static43.aClass3_Sub1_Sub5_Sub2_1.method735(Static49.aClass53_616, 239, 80, 128);
			}
		}
		if (Static94.aBoolean93 && Static35.anInt1112 == 2) {
			Static45.method889();
		}
		Static50.method1909();
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!we;ILjava/awt/Component;)V")
	public static void method1414(@OriginalArg(0) Class62 arg0, @OriginalArg(2) Component arg1) {
		if (Static83.aBoolean77) {
			return;
		}
		Static106.aClass3_Sub1_Sub5_Sub3_24 = Static20.method374(Static63.aClass53_723, arg0, Static117.aClass53_1349);
		Static108.aClass3_Sub1_Sub5_Sub3_25 = Static20.method374(Static62.aClass53_716, arg0, Static117.aClass53_1349);
		Static38.aClass3_Sub1_Sub5_Sub3_10 = Static20.method374(Static114.aClass53_1305, arg0, Static117.aClass53_1349);
		Static73.aClass3_Sub1_Sub5_Sub3_15 = Static20.method374(Static52.aClass53_630, arg0, Static117.aClass53_1349);
		Static96.aClass3_Sub1_Sub5_Sub3_13 = Static20.method374(Static42.aClass53_536, arg0, Static117.aClass53_1349);
		Static78.aClass3_Sub1_Sub5_Sub3_16 = Static20.method374(Static105.aClass53_1214, arg0, Static117.aClass53_1349);
		Static60.aClass27_22 = Static11.method180(96, 479, arg1);
		Static108.aClass3_Sub1_Sub5_Sub3_25.method813(0, 0);
		Static87.aClass27_33 = Static11.method180(156, 172, arg1);
		Static84.method1313();
		Static38.aClass3_Sub1_Sub5_Sub3_10.method813(0, 0);
		Static118.aClass27_44 = Static11.method180(261, 190, arg1);
		Static106.aClass3_Sub1_Sub5_Sub3_24.method813(0, 0);
		Static62.aClass27_25 = Static11.method180(334, 512, arg1);
		Static84.method1313();
		Static121.aClass27_46 = Static11.method180(50, 496, arg1);
		Static18.aClass27_6 = Static11.method180(37, 269, arg1);
		Static11.aClass27_4 = Static11.method180(45, 249, arg1);
		@Pc(110) Class3_Sub1_Sub5_Sub4 local110 = Static40.method819(Static71.aClass53_796, arg0, Static117.aClass53_1349);
		Static111.aClass27_39 = Static11.method180(local110.anInt1942, local110.anInt1941, arg1);
		local110.method1330(0, 0);
		@Pc(128) Class3_Sub1_Sub5_Sub4 local128 = Static40.method819(Static35.aClass53_466, arg0, Static117.aClass53_1349);
		Static54.aClass27_48 = Static11.method180(local128.anInt1942, local128.anInt1941, arg1);
		local128.method1330(0, 0);
		@Pc(146) Class3_Sub1_Sub5_Sub4 local146 = Static40.method819(Static120.aClass53_1384, arg0, Static117.aClass53_1349);
		Static111.aClass27_40 = Static11.method180(local146.anInt1942, local146.anInt1941, arg1);
		local146.method1330(0, 0);
		@Pc(166) Class3_Sub1_Sub5_Sub4 local166 = Static40.method819(Static53.aClass53_996, arg0, Static117.aClass53_1349);
		Static75.aClass27_30 = Static11.method180(local166.anInt1942, local166.anInt1941, arg1);
		local166.method1330(0, 0);
		@Pc(186) Class3_Sub1_Sub5_Sub4 local186 = Static40.method819(Static61.aClass53_712, arg0, Static117.aClass53_1349);
		Static62.aClass27_24 = Static11.method180(local186.anInt1942, local186.anInt1941, arg1);
		local186.method1330(0, 0);
		@Pc(209) Class3_Sub1_Sub5_Sub4 local209 = Static40.method819(Static93.aClass53_1072, arg0, Static117.aClass53_1349);
		Static58.aClass27_21 = Static11.method180(local209.anInt1942, local209.anInt1941, arg1);
		local209.method1330(0, 0);
		@Pc(227) Class3_Sub1_Sub5_Sub4 local227 = Static40.method819(Static63.aClass53_720, arg0, Static117.aClass53_1349);
		Static114.aClass27_41 = Static11.method180(local227.anInt1942, local227.anInt1941, arg1);
		local227.method1330(0, 0);
		@Pc(245) Class3_Sub1_Sub5_Sub4 local245 = Static40.method819(Static93.aClass53_1065, arg0, Static117.aClass53_1349);
		Static68.aClass27_27 = Static11.method180(local245.anInt1942, local245.anInt1941, arg1);
		local245.method1330(0, 0);
		@Pc(265) Class3_Sub1_Sub5_Sub4 local265 = Static40.method819(Static102.aClass53_1169, arg0, Static117.aClass53_1349);
		Static27.aClass27_13 = Static11.method180(local265.anInt1942, local265.anInt1941, arg1);
		local265.method1330(0, 0);
		Static72.aClass3_Sub1_Sub5_Sub3_14 = Static20.method374(Static3.aClass53_23, arg0, Static117.aClass53_1349);
		Static123.aClass3_Sub1_Sub5_Sub3_26 = Static20.method374(Static13.aClass53_124, arg0, Static117.aClass53_1349);
		Static119.aClass3_Sub1_Sub5_Sub3_5 = Static20.method374(Static101.aClass53_1161, arg0, Static117.aClass53_1349);
		Static33.aClass3_Sub1_Sub5_Sub3_17 = Static72.aClass3_Sub1_Sub5_Sub3_14.method812();
		Static33.aClass3_Sub1_Sub5_Sub3_17.method811();
		Static126.aClass3_Sub1_Sub5_Sub3_20 = Static123.aClass3_Sub1_Sub5_Sub3_26.method812();
		Static126.aClass3_Sub1_Sub5_Sub3_20.method811();
		Static101.aClass3_Sub1_Sub5_Sub3_22 = Static72.aClass3_Sub1_Sub5_Sub3_14.method812();
		Static101.aClass3_Sub1_Sub5_Sub3_22.method810();
		Static48.aClass3_Sub1_Sub5_Sub3_12 = Static123.aClass3_Sub1_Sub5_Sub3_26.method812();
		Static48.aClass3_Sub1_Sub5_Sub3_12.method810();
		Static105.aClass3_Sub1_Sub5_Sub3_23 = Static119.aClass3_Sub1_Sub5_Sub3_5.method812();
		Static105.aClass3_Sub1_Sub5_Sub3_23.method810();
		Static32.aClass3_Sub1_Sub5_Sub3_9 = Static72.aClass3_Sub1_Sub5_Sub3_14.method812();
		Static32.aClass3_Sub1_Sub5_Sub3_9.method811();
		Static32.aClass3_Sub1_Sub5_Sub3_9.method810();
		aClass3_Sub1_Sub5_Sub3_18 = Static123.aClass3_Sub1_Sub5_Sub3_26.method812();
		aClass3_Sub1_Sub5_Sub3_18.method811();
		aClass3_Sub1_Sub5_Sub3_18.method810();
		Static41.aClass3_Sub1_Sub5_Sub3Array3 = Static90.method1466(Static65.aClass53_734, arg0, Static117.aClass53_1349);
		Static69.anIntArray224 = new int[151];
		Static15.anIntArray32 = new int[33];
		Static18.anIntArray50 = new int[151];
		Static118.anIntArray388 = new int[33];
		@Pc(358) int local358;
		@Pc(360) int local360;
		@Pc(362) int local362;
		for (@Pc(354) int local354 = 0; local354 < 33; local354++) {
			local358 = 999;
			local360 = 0;
			for (local362 = 0; local362 < 34; local362++) {
				if (Static38.aClass3_Sub1_Sub5_Sub3_10.aByteArray22[local362 + local354 * Static38.aClass3_Sub1_Sub5_Sub3_10.anInt1168] == 0) {
					if (local358 == 999) {
						local358 = local362;
					}
				} else if (local358 != 999) {
					local360 = local362;
					break;
				}
			}
			Static15.anIntArray32[local354] = local358;
			Static118.anIntArray388[local354] = local360 - local358;
		}
		for (local358 = 5; local358 < 156; local358++) {
			local360 = 999;
			local362 = 0;
			for (@Pc(419) int local419 = 25; local419 < 172; local419++) {
				if (Static38.aClass3_Sub1_Sub5_Sub3_10.aByteArray22[local419 + Static38.aClass3_Sub1_Sub5_Sub3_10.anInt1168 * local358] == 0 && (local419 > 34 || local358 > 34)) {
					if (local360 == 999) {
						local360 = local419;
					}
				} else if (local360 != 999) {
					local362 = local419;
					break;
				}
			}
			Static18.anIntArray50[local358 - 5] = local360 - 25;
			Static69.anIntArray224[local358 - 5] = local362 - local360;
		}
		Static83.aBoolean77 = true;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BIILclient!nb;)V")
	public static void method1415(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub1_Sub5_Sub4 arg2) {
		if (arg2 == null) {
			return;
		}
		@Pc(19) int local19 = arg0 * arg0 + arg1 * arg1;
		@Pc(26) int local26 = Static87.anInt2099 + Static50.anInt2790 & 0x7FF;
		if (local19 > 6400) {
			return;
		}
		@Pc(36) int local36 = Class3_Sub1_Sub5_Sub1.anIntArray86[local26];
		@Pc(44) int local44 = local36 * 256 / (Static7.anInt197 + 256);
		@Pc(48) int local48 = Class3_Sub1_Sub5_Sub1.anIntArray84[local26];
		@Pc(56) int local56 = local48 * 256 / (Static7.anInt197 + 256);
		@Pc(66) int local66 = arg1 * local56 - local44 * arg0 >> 16;
		@Pc(76) int local76 = local56 * arg0 + local44 * arg1 >> 16;
		if (local19 > 2500) {
			arg2.method1334(Static38.aClass3_Sub1_Sub5_Sub3_10, local76 + 94 + 4 - arg2.anInt1938 / 2, -(arg2.anInt1939 / 2) + -4 + 83 + -local66);
		} else {
			arg2.method1347(local76 + 4 + 94 - arg2.anInt1938 / 2, -local66 + 83 - arg2.anInt1939 / 2 + -4);
		}
	}

	@OriginalMember(owner = "client!o", name = "f", descriptor = "(I)V")
	public static void method1416() {
		aClass53_925 = null;
		aClass53_924 = null;
		aClass53_923 = null;
		aClass3_Sub1_Sub5_Sub3_18 = null;
		aClass53_926 = null;
		aClass69_1 = null;
	}
}
