import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_335 = Static181.method2795("Too many connections from your address)3");

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "Lclient!qe;")
	public static Class83 aClass83_334 = aClass83_335;

	@OriginalMember(owner = "client!eb", name = "o", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_336 = Static181.method2795(" weitere Optionen");

	@OriginalMember(owner = "client!eb", name = "x", descriptor = "I")
	public static int anInt1032 = 99;

	@OriginalMember(owner = "client!eb", name = "y", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_337 = Static181.method2795("W-=hlen Sie eine Welt");

	@OriginalMember(owner = "client!eb", name = "D", descriptor = "Lclient!qe;")
	public static Class83 aClass83_338 = null;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
	public static void method795() {
		if (Static130.anInt2830 > 1) {
			Static130.anInt2830--;
			Static199.anInt3947 = Static29.anInt739;
		}
		if (Static111.anInt2577 > 0) {
			Static111.anInt2577--;
		}
		if (Static4.aBoolean4) {
			Static4.aBoolean4 = false;
			Static71.method1377();
			return;
		}
		for (@Pc(31) int local31 = 0; local31 < 100 && Static36.method740(); local31++) {
		}
		if (Static68.anInt1625 != 30) {
			return;
		}
		Static127.method2161(Static69.aClass2_Sub3_Sub1_2);
		@Pc(57) Object local57 = Static175.aClass45_1.anObject3;
		@Pc(87) int local87;
		@Pc(89) int local89;
		@Pc(91) int local91;
		@Pc(111) int local111;
		@Pc(106) int local106;
		synchronized (Static175.aClass45_1.anObject3) {
			if (!Static195.aBoolean181) {
				Static175.aClass45_1.anInt1791 = 0;
			} else if (Static61.anInt1502 != 0 || Static175.aClass45_1.anInt1791 >= 40) {
				Static69.aClass2_Sub3_Sub1_2.method284(26);
				Static69.aClass2_Sub3_Sub1_2.method247(0);
				local87 = Static69.aClass2_Sub3_Sub1_2.anInt340;
				local89 = 0;
				for (local91 = 0; Static175.aClass45_1.anInt1791 > local91 && Static69.aClass2_Sub3_Sub1_2.anInt340 - local87 < 240; local91++) {
					local89++;
					local106 = Static175.aClass45_1.anIntArray172[local91];
					local111 = Static175.aClass45_1.anIntArray173[local91];
					if (local106 < 0) {
						local106 = 0;
					} else if (local106 > 764) {
						local106 = 764;
					}
					if (local111 < 0) {
						local111 = 0;
					} else if (local111 > 502) {
						local111 = 502;
					}
					@Pc(144) int local144 = local111 * 765 + local106;
					if (Static175.aClass45_1.anIntArray173[local91] == -1 && Static175.aClass45_1.anIntArray172[local91] == -1) {
						local111 = -1;
						local106 = -1;
						local144 = 524287;
					}
					if (Static52.anInt1339 != local106 || local111 != Static174.anInt3594) {
						@Pc(183) int local183 = local106 - Static52.anInt1339;
						@Pc(188) int local188 = local111 - Static174.anInt3594;
						Static174.anInt3594 = local111;
						Static52.anInt1339 = local106;
						if (Static206.anInt4067 < 8 && local183 >= -32 && local183 <= 31 && local188 >= -32 && local188 <= 31) {
							local188 += 32;
							local183 += 32;
							Static69.aClass2_Sub3_Sub1_2.method239(local188 + (Static206.anInt4067 << 12) + (local183 << 6));
							Static206.anInt4067 = 0;
						} else if (Static206.anInt4067 < 8) {
							Static69.aClass2_Sub3_Sub1_2.method231(local144 + (Static206.anInt4067 << 19) + 8388608);
							Static206.anInt4067 = 0;
						} else {
							Static69.aClass2_Sub3_Sub1_2.method246(local144 + (Static206.anInt4067 << 19) - 1073741824);
							Static206.anInt4067 = 0;
						}
					} else if (Static206.anInt4067 < 2047) {
						Static206.anInt4067++;
					}
				}
				Static69.aClass2_Sub3_Sub1_2.method255(Static69.aClass2_Sub3_Sub1_2.anInt340 - local87);
				if (local89 < Static175.aClass45_1.anInt1791) {
					Static175.aClass45_1.anInt1791 -= local89;
					for (local111 = 0; local111 < Static175.aClass45_1.anInt1791; local111++) {
						Static175.aClass45_1.anIntArray172[local111] = Static175.aClass45_1.anIntArray172[local111 + local89];
						Static175.aClass45_1.anIntArray173[local111] = Static175.aClass45_1.anIntArray173[local111 + local89];
					}
				} else {
					Static175.aClass45_1.anInt1791 = 0;
				}
			}
		}
		if (Static61.anInt1502 != 0) {
			@Pc(352) long local352 = (Static50.aLong40 - Static200.aLong137) / 50L;
			Static200.aLong137 = Static50.aLong40;
			if (local352 > 4095L) {
				local352 = 4095L;
			}
			local89 = Static59.anInt1446;
			local87 = Static153.anInt3298;
			if (local89 < 0) {
				local89 = 0;
			} else if (local89 > 764) {
				local89 = 764;
			}
			if (local87 < 0) {
				local87 = 0;
			} else if (local87 > 502) {
				local87 = 502;
			}
			local91 = local89 + local87 * 765;
			local106 = (int) local352;
			@Pc(402) byte local402 = 0;
			if (Static61.anInt1502 == 2) {
				local402 = 1;
			}
			Static69.aClass2_Sub3_Sub1_2.method284(72);
			Static69.aClass2_Sub3_Sub1_2.method246(local91 + (local106 << 20) + (local402 << 19));
		}
		if (Static71.aBooleanArray10[96] || Static71.aBooleanArray10[97] || Static71.aBooleanArray10[98] || Static71.aBooleanArray10[99]) {
			Static12.aBoolean22 = true;
		}
		if (Static61.anInt1500 > 0) {
			Static61.anInt1500--;
		}
		if (Static12.aBoolean22 && Static61.anInt1500 <= 0) {
			Static61.anInt1500 = 20;
			Static12.aBoolean22 = false;
			Static69.aClass2_Sub3_Sub1_2.method284(255);
			Static69.aClass2_Sub3_Sub1_2.method225(Static153.anInt3302);
			Static69.aClass2_Sub3_Sub1_2.method239(Static210.anInt4184);
		}
		if (Static84.aBoolean98 && !Static167.aBoolean161) {
			Static167.aBoolean161 = true;
			Static69.aClass2_Sub3_Sub1_2.method284(11);
			Static69.aClass2_Sub3_Sub1_2.method247(1);
		}
		if (!Static84.aBoolean98 && Static167.aBoolean161) {
			Static167.aBoolean161 = false;
			Static69.aClass2_Sub3_Sub1_2.method284(11);
			Static69.aClass2_Sub3_Sub1_2.method247(0);
		}
		Static98.method1681();
		if (Static68.anInt1625 != 30) {
			return;
		}
		Static17.method373();
		Static79.method1449();
		Static17.anInt503++;
		if (Static17.anInt503 > 750) {
			Static71.method1377();
			return;
		}
		Static92.method1595();
		Static132.method2199();
		method803();
		if (Static42.aClass5_8 != null) {
			Static10.method282();
		}
		Static57.anInt1427++;
		if (Static37.anInt961 != 0) {
			Static46.anInt1093 += 20;
			if (Static46.anInt1093 >= 400) {
				Static37.anInt961 = 0;
			}
		}
		if (Static183.aClass5_6 != null) {
			Static93.anInt1976++;
			if (Static93.anInt1976 >= 15) {
				Static121.method2085(Static183.aClass5_6);
				Static183.aClass5_6 = null;
			}
		}
		@Pc(658) Class5 local658;
		if (Static124.aClass5_14 != null) {
			Static121.method2085(Static124.aClass5_14);
			Static172.anInt3540++;
			if (Static146.anInt3027 + 5 < Static4.anInt95 || Static146.anInt3027 - 5 > Static4.anInt95 || Static121.anInt2740 > Static191.anInt3781 + 5 || Static121.anInt2740 < Static191.anInt3781 - 5) {
				Static69.aBoolean86 = true;
			}
			if (Static36.anInt939 == 0) {
				if (Static69.aBoolean86 && Static172.anInt3540 >= 5) {
					if (Static87.aClass5_10 == Static124.aClass5_14 && Static67.anInt1609 != Static142.anInt2990) {
						@Pc(656) byte local656 = 0;
						local658 = Static124.aClass5_14;
						if (Static135.anInt2896 == 1 && local658.anInt180 == 206) {
							local656 = 1;
						}
						if (local658.anIntArray9[Static67.anInt1609] <= 0) {
							local656 = 0;
						}
						if (Static170.method2644(Static138.method2242(local658))) {
							local87 = Static142.anInt2990;
							local89 = Static67.anInt1609;
							local658.anIntArray9[local89] = local658.anIntArray9[local87];
							local658.anIntArray5[local89] = local658.anIntArray5[local87];
							local658.anIntArray9[local87] = -1;
							local658.anIntArray5[local87] = 0;
						} else if (local656 == 1) {
							local87 = Static142.anInt2990;
							local89 = Static67.anInt1609;
							while (local89 != local87) {
								if (local87 > local89) {
									local658.method101(local87, local87 - 1);
									local87--;
								} else if (local87 < local89) {
									local658.method101(local87, local87 + 1);
									local87++;
								}
							}
						} else {
							local658.method101(Static142.anInt2990, Static67.anInt1609);
						}
						Static69.aClass2_Sub3_Sub1_2.method284(150);
						Static69.aClass2_Sub3_Sub1_2.method233(Static124.aClass5_14.anInt159);
						Static69.aClass2_Sub3_Sub1_2.method239(Static67.anInt1609);
						Static69.aClass2_Sub3_Sub1_2.method247(local656);
						Static69.aClass2_Sub3_Sub1_2.method225(Static142.anInt2990);
					}
				} else if ((Static180.anInt3674 == 1 || Static177.method2716(Static98.anInt2124 - 1)) && Static98.anInt2124 > 2) {
					Static167.method2589();
				} else if (Static98.anInt2124 > 0) {
					Static8.method124(Static98.anInt2124 - 1);
				}
				Static93.anInt1976 = 10;
				Static124.aClass5_14 = null;
				Static61.anInt1502 = 0;
			}
		}
		Static49.anInt1267 = 0;
		Static22.aClass5_4 = null;
		Static48.aBoolean72 = false;
		Static71.aBoolean89 = false;
		local658 = Static135.aClass5_16;
		@Pc(830) Class5 local830 = Static114.aClass5_15;
		Static114.aClass5_15 = null;
		Static135.aClass5_16 = null;
		while (Static192.method2895() && Static49.anInt1267 < 128) {
			Static32.anIntArray66[Static49.anInt1267] = Static91.anInt1955;
			Static152.anIntArray302[Static49.anInt1267] = Static53.anInt1354;
			Static49.anInt1267++;
		}
		Static42.aClass5_8 = null;
		if (Static138.anInt2942 != -1) {
			Static56.method1058(0, Static89.anInt4290, 0, Static138.anInt2942, 0, Static190.anInt3767, 0);
		}
		Static29.anInt739++;
		while (true) {
			@Pc(881) Class2_Sub4 local881;
			@Pc(899) Class5 local899;
			@Pc(886) Class5 local886;
			do {
				local881 = (Class2_Sub4) Static152.aClass19_13.method679();
				if (local881 == null) {
					while (true) {
						do {
							local881 = (Class2_Sub4) Static48.aClass19_1.method679();
							if (local881 == null) {
								while (true) {
									do {
										local881 = (Class2_Sub4) Static169.aClass19_16.method679();
										if (local881 == null) {
											if (Static147.aBoolean187 && Static42.aClass5_8 == null) {
												Static147.aBoolean187 = false;
											}
											if (Static73.aClass5_9 != null) {
												Static166.method2575();
											}
											if (Static132.anInt2867 != -1) {
												local89 = Static201.anInt4001;
												local87 = Static132.anInt2867;
												@Pc(1066) boolean local1066 = Static166.method2576(0, local87, 0, local89, true, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray316[0], 0, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray319[0], 0);
												if (local1066) {
													Static37.anInt961 = 1;
													Static85.anInt1874 = Static59.anInt1446;
													Static46.anInt1093 = 0;
													Static33.anInt870 = Static153.anInt3298;
												}
												Static132.anInt2867 = -1;
											}
											Static34.method718();
											if (Static135.aClass5_16 != local658) {
												if (local658 != null) {
													Static121.method2085(local658);
												}
												if (Static135.aClass5_16 != null) {
													Static121.method2085(Static135.aClass5_16);
												}
											}
											if (local830 != Static114.aClass5_15 && Static39.anInt996 == Static22.anInt591) {
												if (local830 != null) {
													Static121.method2085(local830);
												}
												if (Static114.aClass5_15 != null) {
													Static121.method2085(Static114.aClass5_15);
												}
											}
											if (Static114.aClass5_15 == null) {
												if (Static22.anInt591 > 0) {
													Static22.anInt591--;
												}
											} else if (Static39.anInt996 > Static22.anInt591) {
												Static22.anInt591++;
												if (Static22.anInt591 == Static39.anInt996) {
													Static121.method2085(Static114.aClass5_15);
												}
											}
											Static154.method2368();
											if (Static97.aBoolean106) {
												Static196.method2944();
											}
											for (local87 = 0; local87 < 5; local87++) {
												@Pc(1158) int local1158 = Static62.anIntArray124[local87]++;
											}
											local89 = Static129.method2177();
											local91 = Static164.method2529();
											if (local89 > 4500 && local91 > 4500) {
												Static111.anInt2577 = 250;
												Static132.method2200(4000);
												Static69.aClass2_Sub3_Sub1_2.method284(154);
											}
											Static75.anInt1759++;
											Static54.anInt1359++;
											if (Static54.anInt1359 > 500) {
												Static54.anInt1359 = 0;
												local111 = (int) (Math.random() * 8.0D);
												if ((local111 & 0x1) == 1) {
													Static125.anInt2772 += Static138.anInt2938;
												}
												if ((local111 & 0x4) == 4) {
													Static171.anInt3530 += Static185.anInt3724;
												}
												if ((local111 & 0x2) == 2) {
													Static18.anInt2020 += Static214.anInt4258;
												}
											}
											Static39.anInt1002++;
											if (Static171.anInt3530 < -40) {
												Static185.anInt3724 = 1;
											}
											if (Static39.anInt1002 > 500) {
												Static39.anInt1002 = 0;
												local111 = (int) (Math.random() * 8.0D);
												if ((local111 & 0x1) == 1) {
													Static124.anInt2528 += Static183.anInt775;
												}
												if ((local111 & 0x2) == 2) {
													Static59.anInt1449 += Static143.anInt3005;
												}
											}
											if (Static171.anInt3530 > 40) {
												Static185.anInt3724 = -1;
											}
											if (Static59.anInt1449 < -20) {
												Static143.anInt3005 = 1;
											}
											if (Static59.anInt1449 > 10) {
												Static143.anInt3005 = -1;
											}
											if (Static124.anInt2528 < -60) {
												Static183.anInt775 = 2;
											}
											if (Static125.anInt2772 < -50) {
												Static138.anInt2938 = 2;
											}
											if (Static18.anInt2020 < -55) {
												Static214.anInt4258 = 2;
											}
											if (Static125.anInt2772 > 50) {
												Static138.anInt2938 = -2;
											}
											if (Static124.anInt2528 > 60) {
												Static183.anInt775 = -2;
											}
											if (Static18.anInt2020 > 55) {
												Static214.anInt4258 = -2;
											}
											if (Static75.anInt1759 > 50) {
												Static69.aClass2_Sub3_Sub1_2.method284(155);
											}
											try {
												if (Static175.aClass25_5 != null && Static69.aClass2_Sub3_Sub1_2.anInt340 > 0) {
													Static175.aClass25_5.method800(Static69.aClass2_Sub3_Sub1_2.aByteArray2, Static69.aClass2_Sub3_Sub1_2.anInt340);
													Static75.anInt1759 = 0;
													Static69.aClass2_Sub3_Sub1_2.anInt340 = 0;
													return;
												}
												return;
											} catch (@Pc(1376) IOException local1376) {
												Static71.method1377();
												return;
											}
										}
										local886 = local881.aClass5_3;
										if (local886.anInt131 < 0) {
											break;
										}
										local899 = Static74.method1401(local886.anInt132);
									} while (local899 == null || local899.aClass5Array1 == null || local886.anInt131 >= local899.aClass5Array1.length || local899.aClass5Array1[local886.anInt131] != local886);
									Static89.method3267(local881);
								}
							}
							local886 = local881.aClass5_3;
							if (local886.anInt131 < 0) {
								break;
							}
							local899 = Static74.method1401(local886.anInt132);
						} while (local899 == null || local899.aClass5Array1 == null || local886.anInt131 >= local899.aClass5Array1.length || local886 != local899.aClass5Array1[local886.anInt131]);
						Static89.method3267(local881);
					}
				}
				local886 = local881.aClass5_3;
				if (local886.anInt131 < 0) {
					break;
				}
				local899 = Static74.method1401(local886.anInt132);
			} while (local899 == null || local899.aClass5Array1 == null || local899.aClass5Array1.length <= local886.anInt131 || local886 != local899.aClass5Array1[local886.anInt131]);
			Static89.method3267(local881);
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!ae;III)V")
	public static void method797(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static73.aClass5_9 != null || Static159.aBoolean152 || (arg0 == null || Static180.method2790(arg0) == null)) {
			return;
		}
		Static73.aClass5_9 = arg0;
		Static106.aClass5_12 = Static180.method2790(arg0);
		Static207.anInt4082 = 0;
		Static201.aBoolean185 = false;
		Static207.anInt4084 = arg1;
		Static131.anInt2840 = arg2;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)Lclient!qe;")
	public static Class83 method799(@OriginalArg(1) int arg0) {
		return Static67.method1268(new Class83[] { Static129.method2179(arg0 >> 24 & 0xFF), Static60.aClass83_641, Static129.method2179(arg0 >> 16 & 0xFF), Static60.aClass83_641, Static129.method2179(arg0 >> 8 & 0xFF), Static60.aClass83_641, Static129.method2179(arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "(B)V")
	private static void method803() {
		for (@Pc(7) int local7 = -1; local7 < Static21.anInt572; local7++) {
			@Pc(14) int local14;
			if (local7 == -1) {
				local14 = 2047;
			} else {
				local14 = Static10.anIntArray18[local7];
			}
			@Pc(24) Class24_Sub4_Sub1 local24 = Static22.aClass24_Sub4_Sub1Array1[local14];
			if (local24 != null && local24.anInt3295 > 0) {
				local24.anInt3295--;
				if (local24.anInt3295 == 0) {
					local24.aClass83_972 = null;
				}
			}
		}
		for (@Pc(62) int local62 = 0; local62 < Static162.anInt3930; local62++) {
			@Pc(68) int local68 = Static207.anIntArray402[local62];
			@Pc(72) Class24_Sub4_Sub2 local72 = Static47.aClass24_Sub4_Sub2Array1[local68];
			if (local72 != null && local72.anInt3295 > 0) {
				local72.anInt3295--;
				if (local72.anInt3295 == 0) {
					local72.aClass83_972 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILclient!qe;)V")
	public static void method805(@OriginalArg(1) Class83 arg0) {
		if (Static135.aClass2_Sub27Array1 == null) {
			return;
		}
		@Pc(10) int local10 = 0;
		@Pc(19) long local19 = arg0.method2397();
		if (local19 == 0L) {
			return;
		}
		while (local10 < Static135.aClass2_Sub27Array1.length && Static135.aClass2_Sub27Array1[local10].aLong149 != local19) {
			local10++;
		}
		if (Static135.aClass2_Sub27Array1.length > local10 && Static135.aClass2_Sub27Array1[local10] != null) {
			Static69.aClass2_Sub3_Sub1_2.method284(45);
			Static69.aClass2_Sub3_Sub1_2.method249(Static135.aClass2_Sub27Array1[local10].aLong149);
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BJ)V")
	public static void method806(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static177.anInt3618 >= 100 && Static114.anInt2626 != 1 || Static177.anInt3618 >= 200) {
			Static165.method2554(0, Static106.aClass83_710, Static182.aClass83_1067);
			return;
		}
		@Pc(35) Class83 local35 = Static12.method296(arg0).method2400();
		for (@Pc(37) int local37 = 0; local37 < Static177.anInt3618; local37++) {
			if (Static139.aLongArray3[local37] == arg0) {
				Static165.method2554(0, Static67.method1268(new Class83[] { local35, Static206.aClass83_1166 }), Static182.aClass83_1067);
				return;
			}
		}
		for (@Pc(72) int local72 = 0; local72 < Static85.anInt1875; local72++) {
			if (Static211.aLongArray8[local72] == arg0) {
				Static165.method2554(0, Static67.method1268(new Class83[] { Static151.aClass83_912, local35, Static160.aClass83_953 }), Static182.aClass83_1067);
				return;
			}
		}
		if (local35.method2402(Static54.aClass24_Sub4_Sub1_1.aClass83_664)) {
			Static165.method2554(0, Static158.aClass83_947, Static182.aClass83_1067);
			return;
		}
		Static133.aClass83Array49[Static177.anInt3618] = local35;
		Static139.aLongArray3[Static177.anInt3618] = arg0;
		Static10.anIntArray19[Static177.anInt3618] = 0;
		Static211.aClass83Array58[Static177.anInt3618] = Static182.aClass83_1067;
		Static121.anIntArray274[Static177.anInt3618] = 0;
		Static38.anInt976 = Static29.anInt739;
		Static177.anInt3618++;
		Static69.aClass2_Sub3_Sub1_2.method284(40);
		Static69.aClass2_Sub3_Sub1_2.method249(arg0);
	}
}
