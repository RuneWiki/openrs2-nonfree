import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!ee", name = "i", descriptor = "Lclient!vb;")
	public static Class82 aClass82_19;

	@OriginalMember(owner = "client!ee", name = "l", descriptor = "Lclient!vb;")
	public static Class82 aClass82_20;

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "Lclient!tg;")
	private static Class81 aClass81_373 = Static120.method2057("You can(Wt add yourself to your own friend list)3");

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "Lclient!tg;")
	public static Class81 aClass81_372 = aClass81_373;

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
	public static volatile int anInt1067 = 0;

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "Lclient!tg;")
	public static Class81 aClass81_374 = Static120.method2057("Bitte versuchen Sie es erneut)3");

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "[S")
	public static short[] aShortArray9 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
	public static void method807() {
		aShortArray9 = null;
		aClass81_373 = null;
		aClass81_372 = null;
		aClass82_20 = null;
		aClass81_374 = null;
		aClass82_19 = null;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)V")
	public static void method808() {
		if (Static153.anInt3498 > 0) {
			Static153.anInt3498--;
		}
		if (Static106.anInt2330 > 1) {
			Static106.anInt2330--;
		}
		if (Static94.aBoolean89) {
			Static94.aBoolean89 = false;
			Static146.method2499();
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < 100 && Static172.method3038(); local29++) {
		}
		if (Static112.anInt2525 != 30) {
			return;
		}
		Static153.method2676(Static104.aClass1_Sub8_Sub1_2);
		@Pc(51) Object local51 = Static40.aClass51_1.anObject3;
		@Pc(86) int local86;
		@Pc(83) int local83;
		@Pc(88) int local88;
		@Pc(105) int local105;
		@Pc(124) int local124;
		synchronized (Static40.aClass51_1.anObject3) {
			if (!Static44.aBoolean41) {
				Static40.aClass51_1.anInt2068 = 0;
			} else if (Static118.anInt2618 != 0 || Static40.aClass51_1.anInt2068 >= 40) {
				Static104.aClass1_Sub8_Sub1_2.method366(96);
				Static104.aClass1_Sub8_Sub1_2.method331(0);
				local83 = 0;
				local86 = Static104.aClass1_Sub8_Sub1_2.anInt446;
				for (local88 = 0; local88 < Static40.aClass51_1.anInt2068 && Static104.aClass1_Sub8_Sub1_2.anInt446 - local86 < 240; local88++) {
					local83++;
					local105 = Static40.aClass51_1.anIntArray234[local88];
					if (local105 < 0) {
						local105 = 0;
					} else if (local105 > 502) {
						local105 = 502;
					}
					local124 = Static40.aClass51_1.anIntArray233[local88];
					if (local124 < 0) {
						local124 = 0;
					} else if (local124 > 764) {
						local124 = 764;
					}
					@Pc(143) int local143 = local124 + local105 * 765;
					if (Static40.aClass51_1.anIntArray234[local88] == -1 && Static40.aClass51_1.anIntArray233[local88] == -1) {
						local124 = -1;
						local105 = -1;
						local143 = 524287;
					}
					if (Static153.anInt3502 != local124 || local105 != Static75.anInt1808) {
						@Pc(183) int local183 = local124 - Static153.anInt3502;
						@Pc(187) int local187 = local105 - Static75.anInt1808;
						Static75.anInt1808 = local105;
						Static153.anInt3502 = local124;
						if (Static144.anInt3163 < 8 && local183 >= -32 && local183 <= 31 && local187 >= -32 && local187 <= 31) {
							local183 += 32;
							local187 += 32;
							Static104.aClass1_Sub8_Sub1_2.method337((local183 << 6) + ((Static144.anInt3163 << 12) + local187));
							Static144.anInt3163 = 0;
						} else if (Static144.anInt3163 < 8) {
							Static104.aClass1_Sub8_Sub1_2.method343((Static144.anInt3163 << 19) + (local143 + 8388608));
							Static144.anInt3163 = 0;
						} else {
							Static104.aClass1_Sub8_Sub1_2.method328((Static144.anInt3163 << 19) + local143 - 1073741824);
							Static144.anInt3163 = 0;
						}
					} else if (Static144.anInt3163 < 2047) {
						Static144.anInt3163++;
					}
				}
				Static104.aClass1_Sub8_Sub1_2.method341(Static104.aClass1_Sub8_Sub1_2.anInt446 - local86);
				if (Static40.aClass51_1.anInt2068 <= local83) {
					Static40.aClass51_1.anInt2068 = 0;
				} else {
					Static40.aClass51_1.anInt2068 -= local83;
					for (local105 = 0; local105 < Static40.aClass51_1.anInt2068; local105++) {
						Static40.aClass51_1.anIntArray233[local105] = Static40.aClass51_1.anIntArray233[local83 + local105];
						Static40.aClass51_1.anIntArray234[local105] = Static40.aClass51_1.anIntArray234[local105 + local83];
					}
				}
			}
		}
		if (Static118.anInt2618 != 0) {
			@Pc(351) long local351 = (Static140.aLong114 - Static140.aLong113) / 50L;
			local83 = Static140.anInt3065;
			if (local351 > 4095L) {
				local351 = 4095L;
			}
			local86 = Static119.anInt2628;
			local124 = (int) local351;
			if (local86 < 0) {
				local86 = 0;
			} else if (local86 > 502) {
				local86 = 502;
			}
			Static140.aLong113 = Static140.aLong114;
			@Pc(386) byte local386 = 0;
			if (Static118.anInt2618 == 2) {
				local386 = 1;
			}
			if (local83 < 0) {
				local83 = 0;
			} else if (local83 > 764) {
				local83 = 764;
			}
			Static104.aClass1_Sub8_Sub1_2.method366(25);
			local88 = local86 * 765 + local83;
			Static104.aClass1_Sub8_Sub1_2.method333((local386 << 19) + (local124 << 20) + local88);
		}
		if (Static72.anInt1733 > 0) {
			Static72.anInt1733--;
		}
		if (Static107.aBooleanArray13[96] || Static107.aBooleanArray13[97] || Static107.aBooleanArray13[98] || Static107.aBooleanArray13[99]) {
			Static139.aBoolean120 = true;
		}
		if (Static139.aBoolean120 && Static72.anInt1733 <= 0) {
			Static72.anInt1733 = 20;
			Static139.aBoolean120 = false;
			Static104.aClass1_Sub8_Sub1_2.method366(48);
			Static104.aClass1_Sub8_Sub1_2.method318(Static23.anInt585);
			Static104.aClass1_Sub8_Sub1_2.method318(Static35.anInt964);
		}
		if (Static110.aBoolean104 && !Static80.aBoolean73) {
			Static80.aBoolean73 = true;
			Static104.aClass1_Sub8_Sub1_2.method366(210);
			Static104.aClass1_Sub8_Sub1_2.method331(1);
		}
		if (!Static110.aBoolean104 && Static80.aBoolean73) {
			Static80.aBoolean73 = false;
			Static104.aClass1_Sub8_Sub1_2.method366(210);
			Static104.aClass1_Sub8_Sub1_2.method331(0);
		}
		Static137.method2310();
		if (Static112.anInt2525 != 30) {
			return;
		}
		Static93.method1579();
		Static34.method737();
		Static70.anInt1716++;
		if (Static70.anInt1716 > 750) {
			Static146.method2499();
			return;
		}
		Static121.method2083();
		Static172.method3037();
		Static122.method2146();
		if (Static23.anInt583 != 0) {
			Static173.anInt4002 += 20;
			if (Static173.anInt4002 >= 400) {
				Static23.anInt583 = 0;
			}
		}
		Static149.anInt3336++;
		if (Static179.aClass77_14 != null) {
			Static129.anInt2838++;
			if (Static129.anInt2838 >= 15) {
				Static51.method913(Static179.aClass77_14);
				Static179.aClass77_14 = null;
			}
		}
		@Pc(645) Class77 local645;
		if (Static29.aClass77_4 != null) {
			Static51.method913(Static29.aClass77_4);
			if (Static126.anInt2762 + 5 < Static36.anInt973 || Static36.anInt973 < Static126.anInt2762 - 5 || Static160.anInt3660 + 5 < Static172.anInt3997 || Static160.anInt3660 - 5 > Static172.anInt3997) {
				Static69.aBoolean67 = true;
			}
			Static161.anInt3681++;
			if (Static1.anInt20 == 0) {
				if (Static69.aBoolean67 && Static161.anInt3681 >= 5) {
					if (Static41.aClass77_6 == Static29.aClass77_4 && Static176.anInt4013 != Static162.anInt3717) {
						local645 = Static29.aClass77_4;
						@Pc(647) byte local647 = 0;
						if (Static143.anInt3135 == 1 && local645.anInt3249 == 206) {
							local647 = 1;
						}
						if (local645.anIntArray348[Static176.anInt4013] <= 0) {
							local647 = 0;
						}
						if (Static157.method2710(Static165.method2894(local645))) {
							local86 = Static162.anInt3717;
							local83 = Static176.anInt4013;
							local645.anIntArray348[local83] = local645.anIntArray348[local86];
							local645.anIntArray342[local83] = local645.anIntArray342[local86];
							local645.anIntArray348[local86] = -1;
							local645.anIntArray342[local86] = 0;
						} else if (local647 == 1) {
							local83 = Static176.anInt4013;
							local86 = Static162.anInt3717;
							while (local83 != local86) {
								if (local83 < local86) {
									local645.method2501(local86, local86 - 1);
									local86--;
								} else if (local86 < local83) {
									local645.method2501(local86, local86 + 1);
									local86++;
								}
							}
						} else {
							local645.method2501(Static162.anInt3717, Static176.anInt4013);
						}
						Static104.aClass1_Sub8_Sub1_2.method366(105);
						Static104.aClass1_Sub8_Sub1_2.method357(Static29.aClass77_4.anInt3231);
						Static104.aClass1_Sub8_Sub1_2.method340(local647);
						Static104.aClass1_Sub8_Sub1_2.method318(Static176.anInt4013);
						Static104.aClass1_Sub8_Sub1_2.method337(Static162.anInt3717);
					}
				} else if ((Static40.anInt1050 == 1 || Static71.method1253(Static118.anInt2616 - 1)) && Static118.anInt2616 > 2) {
					Static100.method1649();
				} else if (Static118.anInt2616 > 0) {
					Static40.method794(Static118.anInt2616 - 1);
				}
				Static129.anInt2838 = 10;
				Static118.anInt2618 = 0;
				Static29.aClass77_4 = null;
			}
		}
		Static18.aBoolean8 = false;
		Static83.aClass77_11 = null;
		local645 = Static62.aClass77_9;
		Static183.aBoolean170 = false;
		Static62.aClass77_9 = null;
		Static70.anInt1712 = 0;
		@Pc(834) Class77 local834 = Static53.aClass77_8;
		Static53.aClass77_8 = null;
		while (Static58.method1033() && Static70.anInt1712 < 128) {
			Static18.anIntArray19[Static70.anInt1712] = Static3.anInt104;
			Static168.anIntArray416[Static70.anInt1712] = Static16.anInt311;
			Static70.anInt1712++;
		}
		if (Static97.anInt2134 != -1) {
			Static167.method2970(503, Static97.anInt2134, 0, 0, 0, 0, 765);
		}
		Static121.anInt2701++;
		while (true) {
			@Pc(879) Class1_Sub3 local879;
			@Pc(895) Class77 local895;
			@Pc(884) Class77 local884;
			do {
				local879 = (Class1_Sub3) Static64.aClass30_10.method1122();
				if (local879 == null) {
					while (true) {
						do {
							local879 = (Class1_Sub3) Static18.aClass30_4.method1122();
							if (local879 == null) {
								while (true) {
									do {
										local879 = (Class1_Sub3) Static41.aClass30_7.method1122();
										if (local879 == null) {
											if (Static31.aClass77_5 != null) {
												Static34.method735();
											}
											if (Static183.anInt4108 != -1) {
												local86 = Static183.anInt4108;
												local83 = Static151.anInt3418;
												@Pc(1053) boolean local1053 = Static139.method2339(true, 0, 0, 0, 0, Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anIntArray326[0], local86, Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anIntArray324[0], local83, 0, 0);
												if (local1053) {
													Static173.anInt4002 = 0;
													Static23.anInt583 = 1;
													Static21.anInt537 = Static119.anInt2628;
													Static114.anInt2144 = Static140.anInt3065;
												}
												Static183.anInt4108 = -1;
											}
											Static116.method2027();
											if (local645 != Static62.aClass77_9) {
												if (local645 != null) {
													Static51.method913(local645);
												}
												if (Static62.aClass77_9 != null) {
													Static51.method913(Static62.aClass77_9);
												}
											}
											if (local834 != Static53.aClass77_8 && Static75.anInt1814 == Static104.anInt2267) {
												if (local834 != null) {
													Static51.method913(local834);
												}
												if (Static53.aClass77_8 != null) {
													Static51.method913(Static53.aClass77_8);
												}
											}
											if (Static53.aClass77_8 == null) {
												if (Static104.anInt2267 > 0) {
													Static104.anInt2267--;
												}
											} else if (Static104.anInt2267 < Static75.anInt1814) {
												Static104.anInt2267++;
												if (Static104.anInt2267 == Static75.anInt1814) {
													Static51.method913(Static53.aClass77_8);
												}
											}
											Static164.method2873();
											if (Static184.aBoolean171) {
												Static126.method2165();
											}
											for (local86 = 0; local86 < 5; local86++) {
												@Pc(1144) int local1144 = Static95.anIntArray235[local86]++;
											}
											local83 = Static51.method914();
											local88 = Static107.method1777();
											if (local83 > 4500 && local88 > 4500) {
												Static153.anInt3498 = 250;
												Static172.method3034(4000);
												Static104.aClass1_Sub8_Sub1_2.method366(171);
											}
											Static157.anInt3573++;
											Static119.anInt2639++;
											Static52.anInt1279++;
											if (Static119.anInt2639 > 500) {
												Static119.anInt2639 = 0;
												local105 = (int) (Math.random() * 8.0D);
												if ((local105 & 0x2) == 2) {
													Static85.anInt418 += Static9.anInt172;
												}
												if ((local105 & 0x1) == 1) {
													Static46.anInt1126 += Static152.anInt3462;
												}
												if ((local105 & 0x4) == 4) {
													Static1.anInt14 += Static7.anInt160;
												}
											}
											if (Static1.anInt14 < -40) {
												Static7.anInt160 = 1;
											}
											if (Static46.anInt1126 < -50) {
												Static152.anInt3462 = 2;
											}
											if (Static157.anInt3573 > 500) {
												local105 = (int) (Math.random() * 8.0D);
												if ((local105 & 0x1) == 1) {
													Static2.anInt37 += Static163.anInt3740;
												}
												Static157.anInt3573 = 0;
												if ((local105 & 0x2) == 2) {
													Static160.anInt3643 += Static41.anInt1064;
												}
											}
											if (Static85.anInt418 < -55) {
												Static9.anInt172 = 2;
											}
											if (Static1.anInt14 > 40) {
												Static7.anInt160 = -1;
											}
											if (Static160.anInt3643 < -20) {
												Static41.anInt1064 = 1;
											}
											if (Static46.anInt1126 > 50) {
												Static152.anInt3462 = -2;
											}
											if (Static85.anInt418 > 55) {
												Static9.anInt172 = -2;
											}
											if (Static160.anInt3643 > 10) {
												Static41.anInt1064 = -1;
											}
											if (Static2.anInt37 < -60) {
												Static163.anInt3740 = 2;
											}
											if (Static2.anInt37 > 60) {
												Static163.anInt3740 = -2;
											}
											if (Static52.anInt1279 > 50) {
												Static104.aClass1_Sub8_Sub1_2.method366(33);
											}
											try {
												if (Static158.aClass41_3 != null && Static104.aClass1_Sub8_Sub1_2.anInt446 > 0) {
													Static158.aClass41_3.method1339(Static104.aClass1_Sub8_Sub1_2.anInt446, Static104.aClass1_Sub8_Sub1_2.aByteArray3);
													Static104.aClass1_Sub8_Sub1_2.anInt446 = 0;
													Static52.anInt1279 = 0;
													return;
												}
												return;
											} catch (@Pc(1350) IOException local1350) {
												Static146.method2499();
												return;
											}
										}
										local884 = local879.aClass77_1;
										if (local884.anInt3189 < 0) {
											break;
										}
										local895 = Static41.method800(local884.anInt3196);
									} while (local895 == null || local895.aClass77Array1 == null || local895.aClass77Array1.length <= local884.anInt3189 || local884 != local895.aClass77Array1[local884.anInt3189]);
									Static49.method870(local879);
								}
							}
							local884 = local879.aClass77_1;
							if (local884.anInt3189 < 0) {
								break;
							}
							local895 = Static41.method800(local884.anInt3196);
						} while (local895 == null || local895.aClass77Array1 == null || local884.anInt3189 >= local895.aClass77Array1.length || local884 != local895.aClass77Array1[local884.anInt3189]);
						Static49.method870(local879);
					}
				}
				local884 = local879.aClass77_1;
				if (local884.anInt3189 < 0) {
					break;
				}
				local895 = Static41.method800(local884.anInt3196);
			} while (local895 == null || local895.aClass77Array1 == null || local884.anInt3189 >= local895.aClass77Array1.length || local884 != local895.aClass77Array1[local884.anInt3189]);
			Static49.method870(local879);
		}
	}
}
