import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!ke", name = "i", descriptor = "J")
	public static long aLong52;

	@OriginalMember(owner = "client!ke", name = "k", descriptor = "[I")
	public static int[] anIntArray175;

	@OriginalMember(owner = "client!ke", name = "l", descriptor = "[I")
	public static int[] anIntArray176;

	@OriginalMember(owner = "client!ke", name = "q", descriptor = "[Lclient!hb;")
	public static Class4_Sub1_Sub2_Sub3[] aClass4_Sub1_Sub2_Sub3Array5;

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
	public static int anInt1798 = 1;

	@OriginalMember(owner = "client!ke", name = "m", descriptor = "Lclient!ec;")
	public static Class22 aClass22_474 = Static60.method1113("");

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "Lclient!ec;")
	public static Class22 aClass22_470 = aClass22_474;

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "[J")
	public static long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "Lclient!ec;")
	public static Class22 aClass22_471 = aClass22_474;

	@OriginalMember(owner = "client!ke", name = "f", descriptor = "[I")
	public static int[] anIntArray174 = new int[32];

	@OriginalMember(owner = "client!ke", name = "g", descriptor = "Lclient!ec;")
	public static Class22 aClass22_472 = aClass22_474;

	@OriginalMember(owner = "client!ke", name = "h", descriptor = "Lclient!ec;")
	public static Class22 aClass22_473 = aClass22_474;

	@OriginalMember(owner = "client!ke", name = "o", descriptor = "Lclient!ec;")
	private static Class22 aClass22_475 = Static60.method1113("Malformed login packet)3");

	@OriginalMember(owner = "client!ke", name = "p", descriptor = "Lclient!ec;")
	public static Class22 aClass22_476 = aClass22_474;

	@OriginalMember(owner = "client!ke", name = "r", descriptor = "Lclient!ec;")
	public static Class22 aClass22_477 = aClass22_475;

	@OriginalMember(owner = "client!ke", name = "s", descriptor = "Lclient!ec;")
	public static Class22 aClass22_478 = aClass22_474;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IB)Lclient!ec;")
	public static Class22 method1118(@OriginalArg(0) int arg0) {
		if (arg0 < 100000) {
			return Static44.method856(new Class22[] { Static78.aClass22_574, Static134.method2042(arg0), Static37.aClass22_255 });
		} else if (arg0 < 10000000) {
			return Static44.method856(new Class22[] { Static116.aClass22_892, Static134.method2042(arg0 / 1000), Static74.aClass22_546, Static37.aClass22_255 });
		} else {
			return Static44.method856(new Class22[] { Static84.aClass22_638, Static134.method2042(arg0 / 1000000), Static38.aClass22_268, Static37.aClass22_255 });
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!ea;IZLclient!ea;)V")
	public static void method1119(@OriginalArg(0) Class20 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class20 arg2) {
		Static128.aClass20_60 = arg2;
		Static32.aBoolean85 = arg1;
		Static99.aClass20_48 = arg0;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
	public static void method1120() {
		if (Static4.anInt77 > 0) {
			Static4.anInt77--;
		}
		if (Static48.anInt1298 > 1) {
			Static48.anInt1298--;
		}
		if (Static68.aBoolean48) {
			Static68.aBoolean48 = false;
			Static54.method1025();
			return;
		}
		for (@Pc(30) int local30 = 0; local30 < 100 && Static71.method1181(); local30++) {
		}
		if (Static112.anInt2775 != 30) {
			return;
		}
		Static79.method1430(Static38.aClass4_Sub11_Sub1_1);
		@Pc(56) Object local56 = Static115.aClass70_1.anObject4;
		@Pc(85) int local85;
		@Pc(70) int local70;
		@Pc(87) int local87;
		@Pc(104) int local104;
		@Pc(109) int local109;
		synchronized (Static115.aClass70_1.anObject4) {
			if (!Static90.aBoolean213) {
				Static115.aClass70_1.anInt2732 = 0;
			} else if (Static65.anInt1845 != 0 || Static115.aClass70_1.anInt2732 >= 40) {
				local70 = 0;
				Static38.aClass4_Sub11_Sub1_1.method752(119);
				Static38.aClass4_Sub11_Sub1_1.method701(0);
				local85 = Static38.aClass4_Sub11_Sub1_1.anInt1099;
				for (local87 = 0; local87 < Static115.aClass70_1.anInt2732 && Static38.aClass4_Sub11_Sub1_1.anInt1099 - local85 < 240; local87++) {
					local70++;
					local104 = Static115.aClass70_1.anIntArray302[local87];
					local109 = Static115.aClass70_1.anIntArray301[local87];
					if (local104 < 0) {
						local104 = 0;
					} else if (local104 > 502) {
						local104 = 502;
					}
					if (local109 < 0) {
						local109 = 0;
					} else if (local109 > 764) {
						local109 = 764;
					}
					@Pc(139) int local139 = local104 * 765 + local109;
					if (Static115.aClass70_1.anIntArray302[local87] == -1 && Static115.aClass70_1.anIntArray301[local87] == -1) {
						local139 = 524287;
						local109 = -1;
						local104 = -1;
					}
					if (Static62.anInt1808 != local109 || local104 != Static24.anInt557) {
						@Pc(183) int local183 = local109 - Static62.anInt1808;
						Static62.anInt1808 = local109;
						@Pc(190) int local190 = local104 - Static24.anInt557;
						Static24.anInt557 = local104;
						if (Static129.anInt3059 < 8 && local183 >= -32 && local183 <= 31 && local190 >= -32 && local190 <= 31) {
							local183 += 32;
							local190 += 32;
							Static38.aClass4_Sub11_Sub1_1.method700(local190 + (Static129.anInt3059 << 12) + (local183 << 6));
							Static129.anInt3059 = 0;
						} else if (Static129.anInt3059 < 8) {
							Static38.aClass4_Sub11_Sub1_1.method737((Static129.anInt3059 << 19) + local139 + 8388608);
							Static129.anInt3059 = 0;
						} else {
							Static38.aClass4_Sub11_Sub1_1.method717(local139 + (Static129.anInt3059 << 19) - 1073741824);
							Static129.anInt3059 = 0;
						}
					} else if (Static129.anInt3059 < 2047) {
						Static129.anInt3059++;
					}
				}
				Static38.aClass4_Sub11_Sub1_1.method702(Static38.aClass4_Sub11_Sub1_1.anInt1099 - local85);
				if (Static115.aClass70_1.anInt2732 <= local70) {
					Static115.aClass70_1.anInt2732 = 0;
				} else {
					Static115.aClass70_1.anInt2732 -= local70;
					for (local104 = 0; local104 < Static115.aClass70_1.anInt2732; local104++) {
						Static115.aClass70_1.anIntArray301[local104] = Static115.aClass70_1.anIntArray301[local104 + local70];
						Static115.aClass70_1.anIntArray302[local104] = Static115.aClass70_1.anIntArray302[local70 + local104];
					}
				}
			}
		}
		if (Static65.anInt1845 != 0) {
			@Pc(347) long local347 = (Static70.aLong57 - Static9.aLong7) / 50L;
			if (local347 > 4095L) {
				local347 = 4095L;
			}
			Static9.aLong7 = Static70.aLong57;
			local70 = Static8.anInt2382;
			local85 = Static55.anInt1118;
			if (local70 < 0) {
				local70 = 0;
			} else if (local70 > 764) {
				local70 = 764;
			}
			@Pc(380) byte local380 = 0;
			if (Static65.anInt1845 == 2) {
				local380 = 1;
			}
			Static38.aClass4_Sub11_Sub1_1.method752(242);
			local109 = (int) local347;
			if (local85 < 0) {
				local85 = 0;
			} else if (local85 > 502) {
				local85 = 502;
			}
			local87 = local85 * 765 + local70;
			Static38.aClass4_Sub11_Sub1_1.method717((local109 << 20) + ((local380 << 19) + local87));
		}
		if (Static26.anInt923 > 0) {
			Static26.anInt923--;
		}
		if (Static89.aBooleanArray18[96] || Static89.aBooleanArray18[97] || Static89.aBooleanArray18[98] || Static89.aBooleanArray18[99]) {
			Static76.aBoolean173 = true;
		}
		if (Static76.aBoolean173 && Static26.anInt923 <= 0) {
			Static76.aBoolean173 = false;
			Static26.anInt923 = 20;
			Static38.aClass4_Sub11_Sub1_1.method752(211);
			Static38.aClass4_Sub11_Sub1_1.method691(Static111.anInt2754);
			Static38.aClass4_Sub11_Sub1_1.method691(Static111.anInt2766);
		}
		if (Static105.aBoolean234 && !Static64.aBoolean164) {
			Static64.aBoolean164 = true;
			Static38.aClass4_Sub11_Sub1_1.method752(177);
			Static38.aClass4_Sub11_Sub1_1.method701(1);
		}
		if (!Static105.aBoolean234 && Static64.aBoolean164) {
			Static64.aBoolean164 = false;
			Static38.aClass4_Sub11_Sub1_1.method752(177);
			Static38.aClass4_Sub11_Sub1_1.method701(0);
		}
		Static49.method921();
		if (Static112.anInt2775 != 30) {
			return;
		}
		Static75.method1269();
		Static16.method285();
		Static30.anInt708++;
		if (Static30.anInt708 > 750) {
			Static54.method1025();
			return;
		}
		Static56.method1037();
		Static10.method162();
		Static43.method823();
		if (Static113.anInt2788 != 0) {
			Static130.anInt3100 += 20;
			if (Static130.anInt3100 >= 400) {
				Static113.anInt2788 = 0;
			}
		}
		Static46.anInt1293++;
		if (Static5.aClass4_Sub7_1 != null) {
			Static114.anInt2821++;
			if (Static114.anInt2821 >= 15) {
				Static110.method1772(Static5.aClass4_Sub7_1);
				Static5.aClass4_Sub7_1 = null;
			}
		}
		@Pc(654) Class4_Sub7 local654;
		if (Static30.aClass4_Sub7_6 != null) {
			Static110.method1772(Static30.aClass4_Sub7_6);
			Static90.anInt2395++;
			if (Static94.anInt2532 + 5 < Static72.anInt1914 || Static94.anInt2532 - 5 > Static72.anInt1914 || Static117.anInt2876 > Static78.anInt2045 + 5 || Static117.anInt2876 < Static78.anInt2045 - 5) {
				Static59.aBoolean158 = true;
			}
			if (Static72.anInt1920 == 0) {
				if (Static59.aBoolean158 && Static90.anInt2395 >= 5) {
					if (Static30.aClass4_Sub7_6 == Static42.aClass4_Sub7_8 && Static89.anInt2376 != Static67.anInt1869) {
						local654 = Static30.aClass4_Sub7_6;
						@Pc(656) byte local656 = 0;
						if (Static103.anInt2622 == 1 && local654.anInt793 == 206) {
							local656 = 1;
						}
						if (local654.anIntArray89[Static67.anInt1869] <= 0) {
							local656 = 0;
						}
						if (Static48.method899(Static124.method1890(local654))) {
							local70 = Static67.anInt1869;
							local85 = Static89.anInt2376;
							local654.anIntArray89[local70] = local654.anIntArray89[local85];
							local654.anIntArray83[local70] = local654.anIntArray83[local85];
							local654.anIntArray89[local85] = -1;
							local654.anIntArray83[local85] = 0;
						} else if (local656 == 1) {
							local70 = Static67.anInt1869;
							local85 = Static89.anInt2376;
							while (local70 != local85) {
								if (local85 > local70) {
									local654.method532(local85 - 1, local85);
									local85--;
								} else if (local85 < local70) {
									local654.method532(local85 + 1, local85);
									local85++;
								}
							}
						} else {
							local654.method532(Static67.anInt1869, Static89.anInt2376);
						}
						Static38.aClass4_Sub11_Sub1_1.method752(56);
						Static38.aClass4_Sub11_Sub1_1.method735(Static67.anInt1869);
						Static38.aClass4_Sub11_Sub1_1.method720(local656);
						Static38.aClass4_Sub11_Sub1_1.method740(Static30.aClass4_Sub7_6.anInt738);
						Static38.aClass4_Sub11_Sub1_1.method733(Static89.anInt2376);
					}
				} else if ((Static104.anInt2626 == 1 || Static28.method446(Static99.anInt2589 - 1)) && Static99.anInt2589 > 2) {
					Static113.method1803();
				} else if (Static99.anInt2589 > 0) {
					Static12.method172(Static99.anInt2589 - 1);
				}
				Static30.aClass4_Sub7_6 = null;
				Static114.anInt2821 = 10;
				Static65.anInt1845 = 0;
			}
		}
		Static23.aBoolean57 = false;
		Static45.anInt1278 = 0;
		Static103.aClass4_Sub7_14 = null;
		Static93.aBoolean224 = false;
		local654 = Static43.aClass4_Sub7_10;
		Static43.aClass4_Sub7_10 = null;
		@Pc(830) Class4_Sub7 local830 = Static58.aClass4_Sub7_12;
		Static58.aClass4_Sub7_12 = null;
		while (Static122.method950() && Static45.anInt1278 < 128) {
			Static60.anIntArray173[Static45.anInt1278] = Static11.anInt2985;
			Static9.anIntArray16[Static45.anInt1278] = Static90.anInt2393;
			Static45.anInt1278++;
		}
		Static106.method1750(Static11.anInt2982, 0, 0, 503, 0, 765, 0);
		Static96.anInt2513++;
		while (true) {
			@Pc(872) Class4_Sub3 local872;
			@Pc(885) Class4_Sub7 local885;
			@Pc(877) Class4_Sub7 local877;
			do {
				local872 = (Class4_Sub3) Static92.aClass82_8.method2029();
				if (local872 == null) {
					while (true) {
						do {
							local872 = (Class4_Sub3) Static66.aClass82_6.method2029();
							if (local872 == null) {
								while (true) {
									do {
										local872 = (Class4_Sub3) Static9.aClass82_2.method2029();
										if (local872 == null) {
											if (Static133.aClass4_Sub7_16 != null) {
												Static75.method1270();
											}
											if (Static127.anInt3017 != -1) {
												local85 = Static127.anInt3017;
												local70 = Static127.anInt3033;
												@Pc(1039) boolean local1039 = Static78.method1305(true, 0, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray277[0], 0, 0, local85, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray280[0], 0, local70, 0, 0);
												Static127.anInt3017 = -1;
												if (local1039) {
													Static130.anInt3100 = 0;
													Static130.anInt3102 = Static55.anInt1118;
													Static113.anInt2788 = 1;
													Static23.anInt555 = Static8.anInt2382;
												}
											}
											Static130.method2004();
											if (local654 != Static43.aClass4_Sub7_10) {
												if (local654 != null) {
													Static110.method1772(local654);
												}
												if (Static43.aClass4_Sub7_10 != null) {
													Static110.method1772(Static43.aClass4_Sub7_10);
												}
											}
											if (Static58.aClass4_Sub7_12 != local830 && Static33.anInt843 == Static76.anInt2023) {
												if (local830 != null) {
													Static110.method1772(local830);
												}
												if (Static58.aClass4_Sub7_12 != null) {
													Static110.method1772(Static58.aClass4_Sub7_12);
												}
											}
											if (Static58.aClass4_Sub7_12 == null) {
												if (Static33.anInt843 > 0) {
													Static33.anInt843--;
												}
											} else if (Static76.anInt2023 > Static33.anInt843) {
												Static33.anInt843++;
												if (Static33.anInt843 == Static76.anInt2023) {
													Static110.method1772(Static58.aClass4_Sub7_12);
												}
											}
											Static115.method1824();
											if (Static19.aBoolean53) {
												Static132.method2027();
											}
											for (local85 = 0; local85 < 5; local85++) {
												@Pc(1134) int local1134 = Static14.anIntArray41[local85]++;
											}
											local70 = Static27.method432();
											local87 = Static94.method1627();
											if (local70 > 4500 && local87 > 4500) {
												Static4.anInt77 = 250;
												Static62.method1124(4000);
												Static38.aClass4_Sub11_Sub1_1.method752(13);
											}
											Static52.anInt1490++;
											Static69.anInt1882++;
											Static57.anInt1750++;
											if (Static69.anInt1882 > 500) {
												Static69.anInt1882 = 0;
												local104 = (int) (Math.random() * 8.0D);
												if ((local104 & 0x2) == 2) {
													Static11.anInt2986 += Static26.anInt916;
												}
												if ((local104 & 0x4) == 4) {
													Static9.anInt184 += Static9.anInt191;
												}
												if ((local104 & 0x1) == 1) {
													Static111.anInt2760 += Static54.anInt1520;
												}
											}
											if (Static9.anInt184 < -40) {
												Static9.anInt191 = 1;
											}
											if (Static52.anInt1490 > 500) {
												Static52.anInt1490 = 0;
												local104 = (int) (Math.random() * 8.0D);
												if ((local104 & 0x1) == 1) {
													Static23.anInt552 += Static30.anInt706;
												}
												if ((local104 & 0x2) == 2) {
													Static25.anInt574 += Static5.anInt87;
												}
											}
											if (Static111.anInt2760 < -50) {
												Static54.anInt1520 = 2;
											}
											if (Static25.anInt574 < -20) {
												Static5.anInt87 = 1;
											}
											if (Static25.anInt574 > 10) {
												Static5.anInt87 = -1;
											}
											if (Static111.anInt2760 > 50) {
												Static54.anInt1520 = -2;
											}
											if (Static9.anInt184 > 40) {
												Static9.anInt191 = -1;
											}
											if (Static11.anInt2986 < -55) {
												Static26.anInt916 = 2;
											}
											if (Static11.anInt2986 > 55) {
												Static26.anInt916 = -2;
											}
											if (Static23.anInt552 < -60) {
												Static30.anInt706 = 2;
											}
											if (Static23.anInt552 > 60) {
												Static30.anInt706 = -2;
											}
											if (Static57.anInt1750 > 50) {
												Static38.aClass4_Sub11_Sub1_1.method752(232);
											}
											try {
												if (Static120.aClass6_4 != null && Static38.aClass4_Sub11_Sub1_1.anInt1099 > 0) {
													Static120.aClass6_4.method133(Static38.aClass4_Sub11_Sub1_1.aByteArray9, Static38.aClass4_Sub11_Sub1_1.anInt1099);
													Static38.aClass4_Sub11_Sub1_1.anInt1099 = 0;
													Static57.anInt1750 = 0;
													return;
												}
												return;
											} catch (@Pc(1351) IOException local1351) {
												Static54.method1025();
												return;
											}
										}
										local877 = local872.aClass4_Sub7_3;
										if (local877.anInt784 < 0) {
											break;
										}
										local885 = Static106.method1749(local877.anInt802);
									} while (local885 == null || local885.aClass4_Sub7Array1 == null || local885.aClass4_Sub7Array1.length <= local877.anInt784 || local877 != local885.aClass4_Sub7Array1[local877.anInt784]);
									Static133.method2036(local872);
								}
							}
							local877 = local872.aClass4_Sub7_3;
							if (local877.anInt784 < 0) {
								break;
							}
							local885 = Static106.method1749(local877.anInt802);
						} while (local885 == null || local885.aClass4_Sub7Array1 == null || local885.aClass4_Sub7Array1.length <= local877.anInt784 || local885.aClass4_Sub7Array1[local877.anInt784] != local877);
						Static133.method2036(local872);
					}
				}
				local877 = local872.aClass4_Sub7_3;
				if (local877.anInt784 < 0) {
					break;
				}
				local885 = Static106.method1749(local877.anInt802);
			} while (local885 == null || local885.aClass4_Sub7Array1 == null || local877.anInt784 >= local885.aClass4_Sub7Array1.length || local877 != local885.aClass4_Sub7Array1[local877.anInt784]);
			Static133.method2036(local872);
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
	public static void method1121() {
		aClass22_472 = null;
		aClass22_477 = null;
		aClass22_478 = null;
		aLongArray3 = null;
		anIntArray175 = null;
		aClass22_473 = null;
		aClass4_Sub1_Sub2_Sub3Array5 = null;
		aClass22_471 = null;
		anIntArray176 = null;
		aClass22_470 = null;
		aClass22_474 = null;
		anIntArray174 = null;
		aClass22_476 = null;
		aClass22_475 = null;
	}
}
