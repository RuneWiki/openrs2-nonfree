import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!wh", name = "h", descriptor = "Lclient!wa;")
	public static Class87 aClass87_15;

	@OriginalMember(owner = "client!wh", name = "m", descriptor = "I")
	public static int anInt4201;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "Lclient!db;")
	public static Class16 aClass16_13 = new Class16(512);

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "Lclient!wa;")
	public static Class87 aClass87_14 = null;

	@OriginalMember(owner = "client!wh", name = "j", descriptor = "Lclient!ai;")
	private static Class6 aClass6_1277 = Static38.method685("flash1:");

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1276 = aClass6_1277;

	@OriginalMember(owner = "client!wh", name = "i", descriptor = "[I")
	public static int[] anIntArray405 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!wh", name = "k", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1278 = aClass6_1277;

	@OriginalMember(owner = "client!wh", name = "o", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1279 = Static38.method685("titlebox");

	@OriginalMember(owner = "client!wh", name = "q", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1280 = Static38.method685("Bitte geben Sie Ihr Passwort ein)3");

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(BI)I")
	public static int method2812(@OriginalArg(1) int arg0) {
		@Pc(7) Class2_Sub3_Sub7 local7 = Static22.method391(arg0);
		@Pc(10) int local10 = local7.anInt1472;
		@Pc(13) int local13 = local7.anInt1473;
		@Pc(16) int local16 = local7.anInt1481;
		@Pc(28) int local28 = Class2_Sub3_Sub11.anIntArray177[local13 - local16];
		return Static11.anIntArray9[local10] >> local16 & local28;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!me;ILclient!ai;)I")
	public static int method2813(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) Class6 arg1) {
		@Pc(7) int local7 = arg0.anInt2154;
		arg0.method1444(arg1.anInt165);
		arg0.anInt2154 += Static89.aClass58_1.method1737(arg1.anInt165, arg0.anInt2154, arg0.aByteArray14, 0, arg1.aByteArray2);
		return arg0.anInt2154 - local7;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
	public static void method2814() {
		if (Static132.anInt3074 > 0) {
			Static132.anInt3074--;
		}
		if (Static31.anInt772 > 1) {
			Static31.anInt772--;
		}
		if (Static155.aBoolean160) {
			Static155.aBoolean160 = false;
			Static157.method2413();
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < 100 && Static77.method1230(); local29++) {
		}
		if (Static156.anInt3638 != 30) {
			return;
		}
		Static47.method879(Static66.aClass2_Sub13_Sub1_2);
		@Pc(53) Object local53 = Static36.aClass52_1.anObject3;
		@Pc(85) int local85;
		@Pc(82) int local82;
		@Pc(87) int local87;
		@Pc(104) int local104;
		@Pc(109) int local109;
		synchronized (Static36.aClass52_1.anObject3) {
			if (!Static2.aBoolean3) {
				Static36.aClass52_1.anInt2292 = 0;
			} else if (Static19.anInt509 != 0 || Static36.aClass52_1.anInt2292 >= 40) {
				Static66.aClass2_Sub13_Sub1_2.method1455(6);
				Static66.aClass2_Sub13_Sub1_2.method1416(0);
				local82 = 0;
				local85 = Static66.aClass2_Sub13_Sub1_2.anInt2154;
				for (local87 = 0; local87 < Static36.aClass52_1.anInt2292 && Static66.aClass2_Sub13_Sub1_2.anInt2154 - local85 < 240; local87++) {
					local82++;
					local104 = Static36.aClass52_1.anIntArray171[local87];
					local109 = Static36.aClass52_1.anIntArray172[local87];
					if (local109 < 0) {
						local109 = 0;
					} else if (local109 > 764) {
						local109 = 764;
					}
					if (local104 < 0) {
						local104 = 0;
					} else if (local104 > 502) {
						local104 = 502;
					}
					@Pc(142) int local142 = local109 + local104 * 765;
					if (Static36.aClass52_1.anIntArray171[local87] == -1 && Static36.aClass52_1.anIntArray172[local87] == -1) {
						local109 = -1;
						local104 = -1;
						local142 = 524287;
					}
					if (local109 != Static171.anInt4018 || local104 != Static28.anInt729) {
						@Pc(187) int local187 = local104 - Static28.anInt729;
						Static28.anInt729 = local104;
						@Pc(194) int local194 = local109 - Static171.anInt4018;
						Static171.anInt4018 = local109;
						if (Static153.anInt3527 < 8 && local194 >= -32 && local194 <= 31 && local187 >= -32 && local187 <= 31) {
							local187 += 32;
							local194 += 32;
							Static66.aClass2_Sub13_Sub1_2.method1428(local187 + (local194 << 6) + (Static153.anInt3527 << 12));
							Static153.anInt3527 = 0;
						} else if (Static153.anInt3527 < 8) {
							Static66.aClass2_Sub13_Sub1_2.method1440((Static153.anInt3527 << 19) + (local142 + 8388608));
							Static153.anInt3527 = 0;
						} else {
							Static66.aClass2_Sub13_Sub1_2.method1421(local142 + (Static153.anInt3527 << 19) - 1073741824);
							Static153.anInt3527 = 0;
						}
					} else if (Static153.anInt3527 < 2047) {
						Static153.anInt3527++;
					}
				}
				Static66.aClass2_Sub13_Sub1_2.method1424(Static66.aClass2_Sub13_Sub1_2.anInt2154 - local85);
				if (Static36.aClass52_1.anInt2292 > local82) {
					Static36.aClass52_1.anInt2292 -= local82;
					for (local104 = 0; local104 < Static36.aClass52_1.anInt2292; local104++) {
						Static36.aClass52_1.anIntArray172[local104] = Static36.aClass52_1.anIntArray172[local82 + local104];
						Static36.aClass52_1.anIntArray171[local104] = Static36.aClass52_1.anIntArray171[local82 + local104];
					}
				} else {
					Static36.aClass52_1.anInt2292 = 0;
				}
			}
		}
		if (Static19.anInt509 != 0) {
			@Pc(363) long local363 = (Static153.aLong205 - Static142.aLong192) / 50L;
			Static142.aLong192 = Static153.aLong205;
			local82 = Static155.anInt3959;
			if (local363 > 4095L) {
				local363 = 4095L;
			}
			if (local82 < 0) {
				local82 = 0;
			} else if (local82 > 764) {
				local82 = 764;
			}
			local85 = Static5.anInt84;
			@Pc(391) byte local391 = 0;
			if (local85 < 0) {
				local85 = 0;
			} else if (local85 > 502) {
				local85 = 502;
			}
			local109 = (int) local363;
			if (Static19.anInt509 == 2) {
				local391 = 1;
			}
			local87 = local82 + local85 * 765;
			Static66.aClass2_Sub13_Sub1_2.method1455(36);
			Static66.aClass2_Sub13_Sub1_2.method1443((local109 << 20) + (local391 << 19) + local87);
		}
		if (Static81.anInt1981 > 0) {
			Static81.anInt1981--;
		}
		if (Static161.aBooleanArray19[96] || Static161.aBooleanArray19[97] || Static161.aBooleanArray19[98] || Static161.aBooleanArray19[99]) {
			Static92.aBoolean88 = true;
		}
		if (Static92.aBoolean88 && Static81.anInt1981 <= 0) {
			Static81.anInt1981 = 20;
			Static92.aBoolean88 = false;
			Static66.aClass2_Sub13_Sub1_2.method1455(26);
			Static66.aClass2_Sub13_Sub1_2.method1447(Static154.anInt3559);
			Static66.aClass2_Sub13_Sub1_2.method1431(Static30.anInt768);
		}
		if (Static84.aBoolean80 && !Static144.aBoolean138) {
			Static144.aBoolean138 = true;
			Static66.aClass2_Sub13_Sub1_2.method1455(233);
			Static66.aClass2_Sub13_Sub1_2.method1416(1);
		}
		if (!Static84.aBoolean80 && Static144.aBoolean138) {
			Static144.aBoolean138 = false;
			Static66.aClass2_Sub13_Sub1_2.method1455(233);
			Static66.aClass2_Sub13_Sub1_2.method1416(0);
		}
		Static40.method728();
		if (Static156.anInt3638 != 30) {
			return;
		}
		Static115.method1858();
		method2818();
		Static31.anInt773++;
		if (Static31.anInt773 > 750) {
			Static157.method2413();
			return;
		}
		Static113.method1829();
		Static144.method2228();
		Static10.method162();
		if (Static113.anInt2749 != 0) {
			Static73.anInt1792 += 20;
			if (Static73.anInt1792 >= 400) {
				Static113.anInt2749 = 0;
			}
		}
		Static131.anInt3038++;
		if (Static152.aClass87_11 != null) {
			Static107.anInt2561++;
			if (Static107.anInt2561 >= 15) {
				Static151.method2327(Static152.aClass87_11);
				Static152.aClass87_11 = null;
			}
		}
		@Pc(656) Class87 local656;
		if (Static27.aClass87_4 != null) {
			Static151.method2327(Static27.aClass87_4);
			Static116.anInt2793++;
			if (Static174.anInt4035 + 5 < Static69.anInt1736 || Static69.anInt1736 < Static174.anInt4035 - 5 || Static77.anInt1906 > Static163.anInt3830 + 5 || Static163.anInt3830 - 5 > Static77.anInt1906) {
				Static110.aBoolean107 = true;
			}
			if (Static51.anInt1408 == 0) {
				if (Static110.aBoolean107 && Static116.anInt2793 >= 5) {
					if (aClass87_15 == Static27.aClass87_4 && Static70.anInt1745 != Static83.anInt2043) {
						local656 = Static27.aClass87_4;
						@Pc(662) byte local662 = 0;
						if (Static67.anInt1691 == 1 && local656.anInt4101 == 206) {
							local662 = 1;
						}
						if (local656.anIntArray396[Static83.anInt2043] <= 0) {
							local662 = 0;
						}
						if (Static156.method2409(Static179.method2802(local656))) {
							local82 = Static83.anInt2043;
							local85 = Static70.anInt1745;
							local656.anIntArray396[local82] = local656.anIntArray396[local85];
							local656.anIntArray399[local82] = local656.anIntArray399[local85];
							local656.anIntArray396[local85] = -1;
							local656.anIntArray399[local85] = 0;
						} else if (local662 == 1) {
							local85 = Static70.anInt1745;
							local82 = Static83.anInt2043;
							while (local85 != local82) {
								if (local85 > local82) {
									local656.method2767(local85 - 1, local85);
									local85--;
								} else if (local82 > local85) {
									local656.method2767(local85 + 1, local85);
									local85++;
								}
							}
						} else {
							local656.method2767(Static83.anInt2043, Static70.anInt1745);
						}
						Static66.aClass2_Sub13_Sub1_2.method1455(63);
						Static66.aClass2_Sub13_Sub1_2.method1403(Static70.anInt1745);
						Static66.aClass2_Sub13_Sub1_2.method1426(Static27.aClass87_4.anInt4085);
						Static66.aClass2_Sub13_Sub1_2.method1428(Static83.anInt2043);
						Static66.aClass2_Sub13_Sub1_2.method1416(local662);
					}
				} else if ((Static21.anInt523 == 1 || Static160.method429(Static46.anInt1322 - 1)) && Static46.anInt1322 > 2) {
					Static126.method1962();
				} else if (Static46.anInt1322 > 0) {
					Static25.method466(Static46.anInt1322 - 1);
				}
				Static19.anInt509 = 0;
				Static107.anInt2561 = 10;
				Static27.aClass87_4 = null;
			}
		}
		Static13.anInt333 = 0;
		aClass87_14 = null;
		Static105.aBoolean103 = false;
		Static11.aBoolean9 = false;
		local656 = Static67.aClass87_5;
		Static67.aClass87_5 = null;
		@Pc(845) Class87 local845 = Static90.aClass87_12;
		Static90.aClass87_12 = null;
		while (Static136.method2123() && Static13.anInt333 < 128) {
			Static157.anIntArray359[Static13.anInt333] = Static4.anInt72;
			Static179.anIntArray404[Static13.anInt333] = Static73.anInt1788;
			Static13.anInt333++;
		}
		if (Static21.anInt520 != -1) {
			Static177.method2770(0, 765, 0, 0, 0, 503, Static21.anInt520);
		}
		Static7.anInt124++;
		while (true) {
			@Pc(888) Class2_Sub2 local888;
			@Pc(904) Class87 local904;
			@Pc(893) Class87 local893;
			do {
				local888 = (Class2_Sub2) Static5.aClass84_1.method2703();
				if (local888 == null) {
					while (true) {
						do {
							local888 = (Class2_Sub2) Static107.aClass84_5.method2703();
							if (local888 == null) {
								while (true) {
									do {
										local888 = (Class2_Sub2) Static149.aClass84_12.method2703();
										if (local888 == null) {
											if (Static88.aClass87_6 != null) {
												Static140.method2161();
											}
											if (Static80.anInt1953 != -1) {
												local85 = Static80.anInt1953;
												local82 = Static80.anInt1942;
												@Pc(1058) boolean local1058 = Static74.method1151(local85, 0, 0, local82, 0, 0, 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray221[0], 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray223[0], true);
												if (local1058) {
													Static83.anInt2045 = Static5.anInt84;
													Static73.anInt1792 = 0;
													Static113.anInt2749 = 1;
													Static17.anInt2418 = Static155.anInt3959;
												}
												Static80.anInt1953 = -1;
											}
											Static13.method211();
											if (Static67.aClass87_5 != local656) {
												if (local656 != null) {
													Static151.method2327(local656);
												}
												if (Static67.aClass87_5 != null) {
													Static151.method2327(Static67.aClass87_5);
												}
											}
											if (local845 != Static90.aClass87_12 && Static51.anInt1415 == Static140.anInt3276) {
												if (local845 != null) {
													Static151.method2327(local845);
												}
												if (Static90.aClass87_12 != null) {
													Static151.method2327(Static90.aClass87_12);
												}
											}
											if (Static90.aClass87_12 == null) {
												if (Static140.anInt3276 > 0) {
													Static140.anInt3276--;
												}
											} else if (Static51.anInt1415 > Static140.anInt3276) {
												Static140.anInt3276++;
												if (Static140.anInt3276 == Static51.anInt1415) {
													Static151.method2327(Static90.aClass87_12);
												}
											}
											Static161.method2582();
											if (Static115.aBoolean113) {
												Static157.method2414();
											}
											for (local85 = 0; local85 < 5; local85++) {
												@Pc(1150) int local1150 = Static68.anIntArray115[local85]++;
											}
											local82 = Static108.method1741();
											local87 = Static155.method2678();
											if (local82 > 4500 && local87 > 4500) {
												Static132.anInt3074 = 250;
												Static43.method842(4000);
												Static66.aClass2_Sub13_Sub1_2.method1455(187);
											}
											Static51.anInt1412++;
											Static180.anInt4187++;
											Static73.anInt1791++;
											if (Static73.anInt1791 > 500) {
												local104 = (int) (Math.random() * 8.0D);
												Static73.anInt1791 = 0;
												if ((local104 & 0x1) == 1) {
													Static92.anInt2288 += Static156.anInt3641;
												}
												if ((local104 & 0x2) == 2) {
													Static60.anInt1425 += Static65.anInt1625;
												}
												if ((local104 & 0x4) == 4) {
													Static137.anInt3191 += Static7.anInt131;
												}
											}
											if (Static92.anInt2288 < -50) {
												Static156.anInt3641 = 2;
											}
											if (Static51.anInt1412 > 500) {
												Static51.anInt1412 = 0;
												local104 = (int) (Math.random() * 8.0D);
												if ((local104 & 0x2) == 2) {
													Static36.anInt1028 += Static112.anInt2714;
												}
												if ((local104 & 0x1) == 1) {
													Static46.anInt1324 += Static70.anInt1741;
												}
											}
											if (Static60.anInt1425 < -55) {
												Static65.anInt1625 = 2;
											}
											if (Static46.anInt1324 < -60) {
												Static70.anInt1741 = 2;
											}
											if (Static36.anInt1028 < -20) {
												Static112.anInt2714 = 1;
											}
											if (Static60.anInt1425 > 55) {
												Static65.anInt1625 = -2;
											}
											if (Static92.anInt2288 > 50) {
												Static156.anInt3641 = -2;
											}
											if (Static137.anInt3191 < -40) {
												Static7.anInt131 = 1;
											}
											if (Static46.anInt1324 > 60) {
												Static70.anInt1741 = -2;
											}
											if (Static137.anInt3191 > 40) {
												Static7.anInt131 = -1;
											}
											if (Static36.anInt1028 > 10) {
												Static112.anInt2714 = -1;
											}
											if (Static180.anInt4187 > 50) {
												Static66.aClass2_Sub13_Sub1_2.method1455(87);
											}
											try {
												if (Static166.aClass43_3 != null && Static66.aClass2_Sub13_Sub1_2.anInt2154 > 0) {
													Static166.aClass43_3.method1241(Static66.aClass2_Sub13_Sub1_2.anInt2154, Static66.aClass2_Sub13_Sub1_2.aByteArray14);
													Static66.aClass2_Sub13_Sub1_2.anInt2154 = 0;
													Static180.anInt4187 = 0;
													return;
												}
												return;
											} catch (@Pc(1380) IOException local1380) {
												Static157.method2413();
												return;
											}
										}
										local893 = local888.aClass87_1;
										if (local893.anInt4105 < 0) {
											break;
										}
										local904 = Static57.method940(local893.anInt4074);
									} while (local904 == null || local904.aClass87Array2 == null || local904.aClass87Array2.length <= local893.anInt4105 || local893 != local904.aClass87Array2[local893.anInt4105]);
									Static92.method1505(local888);
								}
							}
							local893 = local888.aClass87_1;
							if (local893.anInt4105 < 0) {
								break;
							}
							local904 = Static57.method940(local893.anInt4074);
						} while (local904 == null || local904.aClass87Array2 == null || local893.anInt4105 >= local904.aClass87Array2.length || local904.aClass87Array2[local893.anInt4105] != local893);
						Static92.method1505(local888);
					}
				}
				local893 = local888.aClass87_1;
				if (local893.anInt4105 < 0) {
					break;
				}
				local904 = Static57.method940(local893.anInt4074);
			} while (local904 == null || local904.aClass87Array2 == null || local904.aClass87Array2.length <= local893.anInt4105 || local893 != local904.aClass87Array2[local893.anInt4105]);
			Static92.method1505(local888);
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)Z")
	public static boolean method2815(@OriginalArg(1) int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
	public static void method2816() {
		anIntArray405 = null;
		aClass6_1278 = null;
		aClass16_13 = null;
		aClass87_14 = null;
		aClass6_1280 = null;
		aClass6_1279 = null;
		aClass6_1276 = null;
		aClass87_15 = null;
		aClass6_1277 = null;
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)V")
	public static void method2817() {
		if (!Static26.aBoolean28) {
			return;
		}
		@Pc(11) Class87 local11 = Static72.method1126(Static39.anInt1129, Static146.anInt4005);
		if (local11 != null && local11.anObjectArray29 != null) {
			@Pc(20) Class2_Sub2 local20 = new Class2_Sub2();
			local20.anObjectArray1 = local11.anObjectArray29;
			local20.aClass87_1 = local11;
			Static92.method1505(local20);
		}
		Static26.aBoolean28 = false;
		Static151.method2327(local11);
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(B)V")
	private static void method2818() {
		for (@Pc(7) int local7 = 0; local7 < Static122.anInt2842; local7++) {
			@Pc(13) int local13 = Static143.anIntArray297[local7]--;
			if (Static143.anIntArray297[local7] >= -10) {
				@Pc(86) Class86 local86 = Static126.aClass86Array1[local7];
				if (local86 == null) {
					local86 = Static189.method2754(Static136.aClass10_Sub1_14, Static162.anIntArray377[local7], 0);
					if (local86 == null) {
						continue;
					}
					Static143.anIntArray297[local7] += local86.method2752();
					Static126.aClass86Array1[local7] = local86;
				}
				if (Static143.anIntArray297[local7] < 0) {
					@Pc(120) int local120;
					if (Static152.anIntArray350[local7] == 0) {
						local120 = Static34.anInt997;
					} else {
						@Pc(130) int local130 = (Static152.anIntArray350[local7] & 0xFF) * 128;
						@Pc(138) int local138 = Static152.anIntArray350[local7] >> 16 & 0xFF;
						@Pc(148) int local148 = local138 * 128 + 64 - Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt2674;
						if (local148 < 0) {
							local148 = -local148;
						}
						@Pc(161) int local161 = Static152.anIntArray350[local7] >> 8 & 0xFF;
						@Pc(170) int local170 = local161 * 128 + 64 - Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt2672;
						if (local170 < 0) {
							local170 = -local170;
						}
						@Pc(181) int local181 = local170 + local148 - 128;
						if (local130 < local181) {
							Static143.anIntArray297[local7] = -100;
							continue;
						}
						if (local181 < 0) {
							local181 = 0;
						}
						local120 = Static107.anInt2566 * (local130 - local181) / local130;
					}
					if (local120 > 0) {
						@Pc(216) Class2_Sub19_Sub1 local216 = local86.method2751().method2108(Static179.aClass88_1);
						@Pc(221) Class2_Sub10_Sub1 local221 = Static186.method776(local216, local120);
						local221.method775(Static158.anIntArray360[local7] - 1);
						Static109.aClass2_Sub10_Sub4_12.method2745(local221);
					}
					Static143.anIntArray297[local7] = -100;
				}
			} else {
				Static122.anInt2842--;
				for (@Pc(29) int local29 = local7; local29 < Static122.anInt2842; local29++) {
					Static162.anIntArray377[local29] = Static162.anIntArray377[local29 + 1];
					Static126.aClass86Array1[local29] = Static126.aClass86Array1[local29 + 1];
					Static158.anIntArray360[local29] = Static158.anIntArray360[local29 + 1];
					Static143.anIntArray297[local29] = Static143.anIntArray297[local29 + 1];
					Static152.anIntArray350[local29] = Static152.anIntArray350[local29 + 1];
				}
				local7--;
			}
		}
		if (Static52.aBoolean56 && !Static66.method1059()) {
			if (Static81.anInt1983 != 0 && Static94.anInt2328 != -1) {
				Static180.method2811(Static81.anInt1983, Static5.aClass10_Sub1_2, Static94.anInt2328, 0);
			}
			Static52.aBoolean56 = false;
		}
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)V")
	public static void method2819() {
		Static13.aClass17_1.method509();
		Static132.aClass17_19.method509();
	}
}
