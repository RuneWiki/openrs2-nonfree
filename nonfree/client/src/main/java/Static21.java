import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!bj", name = "r", descriptor = "[I")
	public static int[] anIntArray66;

	@OriginalMember(owner = "client!bj", name = "H", descriptor = "I")
	public static int anInt649;

	@OriginalMember(owner = "client!bj", name = "A", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_491 = Static118.method2249("Lade)3)3)3");

	@OriginalMember(owner = "client!bj", name = "C", descriptor = "I")
	public static int anInt645 = 0;

	@OriginalMember(owner = "client!bj", name = "Q", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_493 = Static118.method2249("as it was used to break our rules)3");

	@OriginalMember(owner = "client!bj", name = "E", descriptor = "Lclient!oc;")
	public static Class65 aClass65_492 = aClass65_493;

	@OriginalMember(owner = "client!bj", name = "F", descriptor = "I")
	public static int anInt647 = 0;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Z)V")
	public static void method396() {
		Static1.aClass87_75.method3061();
	}

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "(I)Z")
	public static boolean method397() throws IOException {
		if (Static123.aClass23_4 == null) {
			return false;
		}
		@Pc(11) int local11 = Static123.aClass23_4.method732();
		if (local11 == 0) {
			return false;
		}
		if (Static192.anInt4177 == -1) {
			Static123.aClass23_4.method729(Static1.aClass1_Sub14_Sub1_43.aByteArray29, 0, 1);
			Static1.aClass1_Sub14_Sub1_43.anInt2306 = 0;
			local11--;
			Static192.anInt4177 = Static1.aClass1_Sub14_Sub1_43.method1765();
			Static62.anInt1604 = Static129.anIntArray368[Static192.anInt4177];
		}
		if (Static62.anInt1604 == -1) {
			if (local11 <= 0) {
				return false;
			}
			Static123.aClass23_4.method729(Static1.aClass1_Sub14_Sub1_43.aByteArray29, 0, 1);
			local11--;
			Static62.anInt1604 = Static1.aClass1_Sub14_Sub1_43.aByteArray29[0] & 0xFF;
		}
		if (Static62.anInt1604 == -2) {
			if (local11 <= 1) {
				return false;
			}
			Static123.aClass23_4.method729(Static1.aClass1_Sub14_Sub1_43.aByteArray29, 0, 2);
			Static1.aClass1_Sub14_Sub1_43.anInt2306 = 0;
			local11 -= 2;
			Static62.anInt1604 = Static1.aClass1_Sub14_Sub1_43.method1753();
		}
		if (Static62.anInt1604 > local11) {
			return false;
		}
		Static1.aClass1_Sub14_Sub1_43.anInt2306 = 0;
		Static123.aClass23_4.method729(Static1.aClass1_Sub14_Sub1_43.aByteArray29, 0, Static62.anInt1604);
		anInt645 = Static150.anInt3510;
		Static124.anInt3084 = 0;
		Static150.anInt3510 = Static172.anInt3846;
		Static172.anInt3846 = Static192.anInt4177;
		if (Static192.anInt4177 == 151) {
			Static77.aBoolean81 = true;
			Static169.anInt2041 = Static1.aClass1_Sub14_Sub1_43.method1738();
			Static136.anInt3359 = Static1.aClass1_Sub14_Sub1_43.method1738();
			Static58.anInt1541 = Static1.aClass1_Sub14_Sub1_43.method1753();
			Static156.anInt3584 = Static1.aClass1_Sub14_Sub1_43.method1738();
			Static22.anInt667 = Static1.aClass1_Sub14_Sub1_43.method1738();
			if (Static22.anInt667 >= 100) {
				Static160.anInt2779 = Static136.anInt3359 * 128 + 64;
				Static78.anInt1919 = Static169.anInt2041 * 128 + 64;
				Static97.anInt2437 = Static171.method2896(Static78.anInt1919, Static207.anInt4425, Static160.anInt2779) - Static58.anInt1541;
			}
			Static192.anInt4177 = -1;
			return true;
		}
		@Pc(170) int local170;
		if (Static192.anInt4177 == 249) {
			for (local170 = 0; local170 < Static132.anInt3289; local170++) {
				@Pc(175) Class1_Sub2_Sub7 local175 = Static207.method3284(local170);
				if (local175 != null && local175.anInt960 == 0) {
					Static179.anIntArray459[local170] = 0;
					Static135.anIntArray379[local170] = 0;
				}
			}
			Static136.method2573();
			Static158.anInt3609 += 32;
			Static192.anInt4177 = -1;
			return true;
		} else if (Static192.anInt4177 == 217) {
			Static55.method974();
			Static192.anInt4177 = -1;
			return true;
		} else if (Static192.anInt4177 == 227) {
			Static51.anInt1367 = Static1.aClass1_Sub14_Sub1_43.method1749() * 30;
			Static26.anInt783 = Static1.anInt4459;
			Static192.anInt4177 = -1;
			return true;
		} else {
			@Pc(239) long local239;
			@Pc(261) long local261;
			@Pc(295) int local295;
			@Pc(281) int local281;
			@Pc(374) boolean local374;
			@Pc(370) int local370;
			@Pc(376) int local376;
			if (Static192.anInt4177 == 160) {
				Static131.anInt3262 = Static1.anInt4459;
				local239 = Static1.aClass1_Sub14_Sub1_43.method1732();
				if (local239 == 0L) {
					Static192.anInt4177 = -1;
					Static26.aClass1_Sub13Array1 = null;
					Static51.aClass65_853 = null;
					Static58.anInt1542 = 0;
					Static167.aClass65_2240 = null;
					return true;
				}
				local261 = Static1.aClass1_Sub14_Sub1_43.method1732();
				Static167.aClass65_2240 = Static134.method2558(local261);
				Static51.aClass65_853 = Static134.method2558(local239);
				Static79.aByte8 = Static1.aClass1_Sub14_Sub1_43.method1720();
				local281 = Static1.aClass1_Sub14_Sub1_43.method1738();
				if (local281 == 255) {
					Static192.anInt4177 = -1;
					return true;
				}
				Static58.anInt1542 = local281;
				@Pc(293) Class1_Sub13[] local293 = new Class1_Sub13[100];
				for (local295 = 0; local295 < Static58.anInt1542; local295++) {
					local293[local295] = new Class1_Sub13();
					local293[local295].aLong150 = Static1.aClass1_Sub14_Sub1_43.method1732();
					local293[local295].aClass65_1177 = Static134.method2558(local293[local295].aLong150);
					local293[local295].anInt1929 = Static1.aClass1_Sub14_Sub1_43.method1753();
					local293[local295].aByte7 = Static1.aClass1_Sub14_Sub1_43.method1720();
					local293[local295].aClass65_1178 = Static1.aClass1_Sub14_Sub1_43.method1706();
					if (local293[local295].aLong150 == Static141.aLong108) {
						Static30.aByte3 = local293[local295].aByte7;
					}
				}
				local370 = Static58.anInt1542;
				while (local370 > 0) {
					local370--;
					local374 = true;
					for (local376 = 0; local376 < local370; local376++) {
						if (local293[local376].aClass65_1177.method2464(local293[local376 + 1].aClass65_1177) > 0) {
							local374 = false;
							@Pc(396) Class1_Sub13 local396 = local293[local376];
							local293[local376] = local293[local376 + 1];
							local293[local376 + 1] = local396;
						}
					}
					if (local374) {
						break;
					}
				}
				Static26.aClass1_Sub13Array1 = local293;
				Static192.anInt4177 = -1;
				return true;
			} else if (Static192.anInt4177 == 29) {
				local170 = Static1.aClass1_Sub14_Sub1_43.method1715();
				if (local170 == 65535) {
					local170 = -1;
				}
				Static117.method2156(local170);
				Static192.anInt4177 = -1;
				return true;
			} else {
				@Pc(463) int local463;
				if (Static192.anInt4177 == 18) {
					local170 = Static1.aClass1_Sub14_Sub1_43.method1744();
					local463 = Static1.aClass1_Sub14_Sub1_43.method1704();
					if (local463 == 65535) {
						local463 = -1;
					}
					Static15.method287(local463, local170);
					Static192.anInt4177 = -1;
					return true;
				} else if (Static192.anInt4177 == 233) {
					local170 = Static1.aClass1_Sub14_Sub1_43.method1737();
					Static45.aClass34_4 = Static153.aClass14_3.method628(local170);
					Static192.anInt4177 = -1;
					return true;
				} else {
					@Pc(523) int local523;
					if (Static192.anInt4177 == 230) {
						local170 = Static1.aClass1_Sub14_Sub1_43.method1752();
						local463 = Static1.aClass1_Sub14_Sub1_43.method1704();
						if (local170 == 1) {
							Static197.method3215();
							for (local523 = 0; local523 < 4; local523++) {
								Static83.aClass57Array1[local523].method2262();
							}
							System.gc();
						} else if (local170 == 2) {
							Static101.method1916();
							System.gc();
							Static118.method2247(25);
						}
						Static28.anInt856 = local463;
						Static90.method3299(local463);
						Static204.method3258();
						Static47.method811(Static28.anInt856);
						for (local523 = 0; local523 < 100; local523++) {
							Static197.aBooleanArray18[local523] = true;
						}
						Static192.anInt4177 = -1;
						return true;
					}
					@Pc(582) Class97 local582;
					if (Static192.anInt4177 == 168) {
						local170 = Static1.aClass1_Sub14_Sub1_43.method1700();
						local463 = Static1.aClass1_Sub14_Sub1_43.method1753();
						local523 = Static1.aClass1_Sub14_Sub1_43.method1737();
						local582 = Static154.method2691(local170);
						if (local463 == 65535) {
							local463 = -1;
						}
						@Pc(600) Class1_Sub2_Sub2 local600;
						if (local582.aBoolean181) {
							local582.anInt4306 = local463;
							local582.anInt4336 = local523;
							local600 = Static40.method700(local463);
							local582.anInt4352 = local600.anInt296;
							local582.anInt4369 = local600.anInt311;
							local582.anInt4380 = local600.anInt313;
							local582.anInt4359 = local600.anInt289;
							local582.anInt4370 = local600.anInt323;
							if (local582.anInt4356 > 0) {
								local582.anInt4369 = local582.anInt4369 * 32 / local582.anInt4356;
							} else if (local582.anInt4371 > 0) {
								local582.anInt4369 = local582.anInt4369 * 32 / local582.anInt4371;
							}
							local582.anInt4307 = local600.anInt312;
							Static25.method448(local582);
						} else if (local463 == -1) {
							local582.anInt4315 = 0;
							Static192.anInt4177 = -1;
							return true;
						} else {
							local600 = Static40.method700(local463);
							local582.anInt4380 = local600.anInt313;
							local582.anInt4369 = local600.anInt311 * 100 / local523;
							local582.anInt4325 = local463;
							local582.anInt4315 = 4;
							local582.anInt4370 = local600.anInt323;
							Static25.method448(local582);
						}
						Static192.anInt4177 = -1;
						return true;
					}
					@Pc(739) int local739;
					@Pc(774) int local774;
					@Pc(732) Class97 local732;
					if (Static192.anInt4177 == 101) {
						local170 = Static1.aClass1_Sub14_Sub1_43.method1700();
						local463 = Static1.aClass1_Sub14_Sub1_43.method1753();
						if (local170 < -70000) {
							local463 += 32768;
						}
						if (local170 >= 0) {
							local732 = Static154.method2691(local170);
						} else {
							local732 = null;
						}
						if (local732 != null) {
							for (local739 = 0; local739 < local732.anIntArray512.length; local739++) {
								local732.anIntArray512[local739] = 0;
								local732.anIntArray507[local739] = 0;
							}
						}
						Static14.method273(local463);
						local739 = Static1.aClass1_Sub14_Sub1_43.method1753();
						for (local281 = 0; local281 < local739; local281++) {
							local774 = Static1.aClass1_Sub14_Sub1_43.method1728();
							if (local774 == 255) {
								local774 = Static1.aClass1_Sub14_Sub1_43.method1696();
							}
							local295 = Static1.aClass1_Sub14_Sub1_43.method1753();
							if (local732 != null && local732.anIntArray512.length > local281) {
								local732.anIntArray512[local281] = local295;
								local732.anIntArray507[local281] = local774;
							}
							Static63.method1107(local295 - 1, local463, local774, local281);
						}
						if (local732 != null) {
							Static25.method448(local732);
						}
						Static136.method2573();
						Static105.anIntArray296[Static148.anInt3485++ & 0x1F] = local463 & 0x7FFF;
						Static192.anInt4177 = -1;
						return true;
					} else if (Static192.anInt4177 == 57) {
						local170 = Static1.aClass1_Sub14_Sub1_43.method1700();
						local463 = Static1.aClass1_Sub14_Sub1_43.method1753();
						Static179.anIntArray459[local463] = local170;
						if (Static135.anIntArray379[local463] != local170) {
							Static135.anIntArray379[local463] = local170;
							Static146.method2643(local463);
						}
						Static47.anIntArray118[Static158.anInt3609++ & 0x1F] = local463;
						Static192.anInt4177 = -1;
						return true;
					} else {
						@Pc(889) Class65 local889;
						if (Static192.anInt4177 == 214) {
							local889 = Static1.aClass1_Sub14_Sub1_43.method1706();
							@Pc(896) Object[] local896 = new Object[local889.method2482() + 1];
							for (local523 = local889.method2482() - 1; local523 >= 0; local523--) {
								if (local889.method2473(local523) == 115) {
									local896[local523 + 1] = Static1.aClass1_Sub14_Sub1_43.method1706();
								} else {
									local896[local523 + 1] = Integer.valueOf(Static1.aClass1_Sub14_Sub1_43.method1700());
								}
							}
							local896[0] = Integer.valueOf(Static1.aClass1_Sub14_Sub1_43.method1700());
							@Pc(952) Class1_Sub26 local952 = new Class1_Sub26();
							local952.anObjectArray3 = local896;
							Static94.method1780(local952);
							Static192.anInt4177 = -1;
							return true;
						} else if (Static192.anInt4177 == 106) {
							Static188.aClass65_2456 = Static1.aClass1_Sub14_Sub1_43.method1706();
							Static62.method1098(Static188.aClass65_2456);
							Static192.anInt4177 = -1;
							return true;
						} else if (Static192.anInt4177 == 113) {
							local170 = Static1.aClass1_Sub14_Sub1_43.method1715();
							local463 = Static1.aClass1_Sub14_Sub1_43.method1737();
							local732 = Static154.method2691(local463);
							if (local732 != null && local732.anInt4329 == 0) {
								if (local170 > local732.anInt4341 - local732.anInt4354) {
									local170 = local732.anInt4341 - local732.anInt4354;
								}
								if (local170 < 0) {
									local170 = 0;
								}
								if (local732.anInt4342 != local170) {
									local732.anInt4342 = local170;
									Static25.method448(local732);
								}
							}
							Static192.anInt4177 = -1;
							return true;
						} else {
							@Pc(1163) int local1163;
							@Pc(1053) boolean local1053;
							@Pc(1173) int local1173;
							@Pc(1137) Class65 local1137;
							if (Static192.anInt4177 == 117) {
								local239 = Static1.aClass1_Sub14_Sub1_43.method1732();
								local523 = Static1.aClass1_Sub14_Sub1_43.method1753();
								@Pc(1051) byte local1051 = Static1.aClass1_Sub14_Sub1_43.method1720();
								local1053 = false;
								if ((Long.MIN_VALUE & local239) != 0L) {
									local1053 = true;
								}
								if (local1053) {
									if (Static58.anInt1542 == 0) {
										Static192.anInt4177 = -1;
										return true;
									}
									local239 &= Long.MAX_VALUE;
									for (local774 = 0; local774 < Static58.anInt1542 && (local239 != Static26.aClass1_Sub13Array1[local774].aLong150 || local523 != Static26.aClass1_Sub13Array1[local774].anInt1929); local774++) {
									}
									if (Static58.anInt1542 > local774) {
										while (local774 < Static58.anInt1542 - 1) {
											Static26.aClass1_Sub13Array1[local774] = Static26.aClass1_Sub13Array1[local774 + 1];
											local774++;
										}
										Static58.anInt1542--;
										Static26.aClass1_Sub13Array1[Static58.anInt1542] = null;
									}
								} else {
									local1137 = Static1.aClass1_Sub14_Sub1_43.method1706();
									@Pc(1141) Class1_Sub13 local1141 = new Class1_Sub13();
									local1141.aLong150 = local239;
									local1141.aClass65_1177 = Static134.method2558(local1141.aLong150);
									local1141.anInt1929 = local523;
									local1141.aByte7 = local1051;
									local1141.aClass65_1178 = local1137;
									for (local1163 = Static58.anInt1542 - 1; local1163 >= 0; local1163--) {
										local1173 = Static26.aClass1_Sub13Array1[local1163].aClass65_1177.method2464(local1141.aClass65_1177);
										if (local1173 == 0) {
											Static26.aClass1_Sub13Array1[local1163].anInt1929 = local523;
											Static26.aClass1_Sub13Array1[local1163].aByte7 = local1051;
											Static26.aClass1_Sub13Array1[local1163].aClass65_1178 = local1137;
											Static131.anInt3262 = Static1.anInt4459;
											if (local239 == Static141.aLong108) {
												Static30.aByte3 = local1051;
											}
											Static192.anInt4177 = -1;
											return true;
										}
										if (local1173 < 0) {
											break;
										}
									}
									if (Static58.anInt1542 >= Static26.aClass1_Sub13Array1.length) {
										Static192.anInt4177 = -1;
										return true;
									}
									for (local1173 = Static58.anInt1542 - 1; local1173 > local1163; local1173--) {
										Static26.aClass1_Sub13Array1[local1173 + 1] = Static26.aClass1_Sub13Array1[local1173];
									}
									if (Static58.anInt1542 == 0) {
										Static26.aClass1_Sub13Array1 = new Class1_Sub13[100];
									}
									Static26.aClass1_Sub13Array1[local1163 + 1] = local1141;
									if (Static141.aLong108 == local239) {
										Static30.aByte3 = local1051;
									}
									Static58.anInt1542++;
								}
								Static131.anInt3262 = Static1.anInt4459;
								Static192.anInt4177 = -1;
								return true;
							} else if (Static192.anInt4177 == 184) {
								local170 = Static1.aClass1_Sub14_Sub1_43.method1704();
								local463 = Static1.aClass1_Sub14_Sub1_43.method1749();
								Static54.anInt3674 = local463;
								Static82.anInt2025 = local170;
								Static2.method49();
								Static192.anInt4177 = -1;
								return true;
							} else if (Static192.anInt4177 == 241) {
								local170 = Static1.aClass1_Sub14_Sub1_43.method1753();
								if (local170 == 65535) {
									local170 = -1;
								}
								local463 = Static1.aClass1_Sub14_Sub1_43.method1737();
								local732 = Static154.method2691(local463);
								if (local732.anInt4315 != 2 || local732.anInt4325 != local170) {
									local732.anInt4315 = 2;
									local732.anInt4325 = local170;
									Static25.method448(local732);
								}
								Static192.anInt4177 = -1;
								return true;
							} else {
								@Pc(1349) Class97 local1349;
								if (Static192.anInt4177 == 245) {
									local170 = Static1.aClass1_Sub14_Sub1_43.method1696();
									local1349 = Static154.method2691(local170);
									local1349.anInt4315 = 3;
									local1349.anInt4325 = Static201.aClass6_Sub4_Sub1_3.aClass19_1.method695();
									Static25.method448(local1349);
									Static192.anInt4177 = -1;
									return true;
								}
								@Pc(1387) long local1387;
								@Pc(1407) int local1407;
								@Pc(1392) long local1392;
								@Pc(1399) long local1399;
								@Pc(1430) int local1430;
								if (Static192.anInt4177 == 229) {
									local239 = Static1.aClass1_Sub14_Sub1_43.method1732();
									Static1.aClass1_Sub14_Sub1_43.method1720();
									local261 = Static1.aClass1_Sub14_Sub1_43.method1732();
									local1387 = Static1.aClass1_Sub14_Sub1_43.method1753();
									local1392 = Static1.aClass1_Sub14_Sub1_43.method1713();
									local1399 = (local1387 << 32) + local1392;
									local1173 = Static1.aClass1_Sub14_Sub1_43.method1738();
									@Pc(1405) boolean local1405 = false;
									for (local1407 = 0; local1407 < 100; local1407++) {
										if (local1399 == Static189.aLongArray8[local1407]) {
											local1405 = true;
											break;
										}
									}
									if (local1173 <= 1) {
										for (local1430 = 0; local1430 < Static29.anInt859; local1430++) {
											if (local239 == Static197.aLongArray9[local1430]) {
												local1405 = true;
												break;
											}
										}
									}
									if (!local1405 && Static18.anInt456 == 0) {
										Static189.aLongArray8[Static49.anInt1305] = local1399;
										Static49.anInt1305 = (Static49.anInt1305 + 1) % 100;
										@Pc(1472) Class65 local1472 = Static175.method1620(Static199.method3232(Static1.aClass1_Sub14_Sub1_43).method2491());
										if (local1173 == 2 || local1173 == 3) {
											Static94.method1777(local1472, Static134.method2558(local261).method2488(), Static109.method2004(new Class65[] { Static16.aClass65_319, Static134.method2558(local239).method2488() }));
										} else if (local1173 == 1) {
											Static94.method1777(local1472, Static134.method2558(local261).method2488(), Static109.method2004(new Class65[] { Static193.aClass65_2484, Static134.method2558(local239).method2488() }));
										} else {
											Static94.method1777(local1472, Static134.method2558(local261).method2488(), Static134.method2558(local239).method2488());
										}
									}
									Static192.anInt4177 = -1;
									return true;
								} else if (Static192.anInt4177 == 130) {
									local239 = Static1.aClass1_Sub14_Sub1_43.method1732();
									Static1.aClass1_Sub14_Sub1_43.method1720();
									local261 = Static1.aClass1_Sub14_Sub1_43.method1732();
									local1387 = Static1.aClass1_Sub14_Sub1_43.method1753();
									@Pc(1583) boolean local1583 = false;
									local1392 = Static1.aClass1_Sub14_Sub1_43.method1713();
									local1173 = Static1.aClass1_Sub14_Sub1_43.method1738();
									@Pc(1598) long local1598 = local1392 + (local1387 << 32);
									local370 = Static1.aClass1_Sub14_Sub1_43.method1753();
									for (local1430 = 0; local1430 < 100; local1430++) {
										if (local1598 == Static189.aLongArray8[local1430]) {
											local1583 = true;
											break;
										}
									}
									if (local1173 <= 1) {
										for (@Pc(1627) int local1627 = 0; local1627 < Static29.anInt859; local1627++) {
											if (Static197.aLongArray9[local1627] == local239) {
												local1583 = true;
												break;
											}
										}
									}
									if (!local1583 && Static18.anInt456 == 0) {
										Static189.aLongArray8[Static49.anInt1305] = local1598;
										Static49.anInt1305 = (Static49.anInt1305 + 1) % 100;
										@Pc(1667) Class65 local1667 = Static15.method282(local370).method3207(Static1.aClass1_Sub14_Sub1_43);
										if (local1173 == 2 || local1173 == 3) {
											Static61.method1078(local370, Static134.method2558(local261).method2488(), 20, local1667, Static109.method2004(new Class65[] { Static16.aClass65_319, Static134.method2558(local239).method2488() }));
										} else if (local1173 == 1) {
											Static61.method1078(local370, Static134.method2558(local261).method2488(), 20, local1667, Static109.method2004(new Class65[] { Static193.aClass65_2484, Static134.method2558(local239).method2488() }));
										} else {
											Static61.method1078(local370, Static134.method2558(local261).method2488(), 20, local1667, Static134.method2558(local239).method2488());
										}
									}
									Static192.anInt4177 = -1;
									return true;
								} else if (Static192.anInt4177 == 244) {
									local170 = Static1.aClass1_Sub14_Sub1_43.method1738();
									local463 = Static1.aClass1_Sub14_Sub1_43.method1738();
									local523 = Static1.aClass1_Sub14_Sub1_43.method1738();
									local739 = Static1.aClass1_Sub14_Sub1_43.method1738();
									local281 = Static1.aClass1_Sub14_Sub1_43.method1753();
									Static18.aBooleanArray1[local170] = true;
									Static121.anIntArray337[local170] = local463;
									Static208.anIntArray450[local170] = local523;
									Static55.anIntArray132[local170] = local739;
									Static97.anIntArray274[local170] = local281;
									Static192.anInt4177 = -1;
									return true;
								} else if (Static192.anInt4177 == 33) {
									local170 = Static1.aClass1_Sub14_Sub1_43.method1715();
									local739 = local170 >> 5 & 0x1F;
									local281 = local170 & 0x1F;
									local463 = Static1.aClass1_Sub14_Sub1_43.method1700();
									local523 = local170 >> 10 & 0x1F;
									local774 = (local281 << 3) + (local523 << 19) + (local739 << 11);
									@Pc(1854) Class97 local1854 = Static154.method2691(local463);
									if (local1854.anInt4367 != local774) {
										local1854.anInt4367 = local774;
										Static25.method448(local1854);
									}
									Static192.anInt4177 = -1;
									return true;
								} else if (Static192.anInt4177 == 69) {
									local170 = Static1.aClass1_Sub14_Sub1_43.method1729();
									local463 = Static1.aClass1_Sub14_Sub1_43.method1700();
									local732 = Static154.method2691(local463);
									if (local732.anInt4381 != local170 || local170 == -1) {
										local732.anInt4328 = 0;
										local732.anInt4381 = local170;
										local732.anInt4316 = 0;
										Static25.method448(local732);
									}
									Static192.anInt4177 = -1;
									return true;
								} else {
									@Pc(2015) Class1_Sub20 local2015;
									if (Static192.anInt4177 == 255) {
										local170 = Static62.anInt1604 + Static1.aClass1_Sub14_Sub1_43.anInt2306;
										local463 = Static1.aClass1_Sub14_Sub1_43.method1753();
										local523 = Static1.aClass1_Sub14_Sub1_43.method1753();
										if (Static28.anInt856 != local463) {
											Static28.anInt856 = local463;
											Static90.method3299(Static28.anInt856);
											Static204.method3258();
											Static47.method811(Static28.anInt856);
											for (local739 = 0; local739 < 100; local739++) {
												Static197.aBooleanArray18[local739] = true;
											}
										}
										while (local523-- > 0) {
											local739 = Static1.aClass1_Sub14_Sub1_43.method1700();
											local281 = Static1.aClass1_Sub14_Sub1_43.method1753();
											local774 = Static1.aClass1_Sub14_Sub1_43.method1738();
											@Pc(1981) Class1_Sub20 local1981 = (Class1_Sub20) Static200.aClass99_14.method3292((long) local739);
											if (local1981 != null && local1981.anInt3111 != local281) {
												Static104.method1931(local1981, true);
												local1981 = null;
											}
											if (local1981 == null) {
												local1981 = Static38.method678(local281, local739, local774);
											}
											local1981.aBoolean128 = true;
										}
										for (local2015 = (Class1_Sub20) Static200.aClass99_14.method3288(); local2015 != null; local2015 = (Class1_Sub20) Static200.aClass99_14.method3289()) {
											if (local2015.aBoolean128) {
												local2015.aBoolean128 = false;
											} else {
												Static104.method1931(local2015, true);
											}
										}
										Static81.aClass99_5 = new Class99(512);
										while (local170 > Static1.aClass1_Sub14_Sub1_43.anInt2306) {
											local281 = Static1.aClass1_Sub14_Sub1_43.method1700();
											local774 = Static1.aClass1_Sub14_Sub1_43.method1753();
											local295 = Static1.aClass1_Sub14_Sub1_43.method1753();
											local1163 = Static1.aClass1_Sub14_Sub1_43.method1700();
											for (local1173 = local774; local1173 <= local295; local1173++) {
												local1399 = (long) local1173 + ((long) local281 << 32);
												Static81.aClass99_5.method3290(new Class1_Sub21(local1163), local1399);
											}
										}
										Static192.anInt4177 = -1;
										return true;
									}
									@Pc(2109) Class65 local2109;
									if (Static192.anInt4177 == 132) {
										local239 = Static1.aClass1_Sub14_Sub1_43.method1732();
										local2109 = Static175.method1620(Static199.method3232(Static1.aClass1_Sub14_Sub1_43).method2491());
										Static31.method603(6, Static134.method2558(local239).method2488(), local2109);
										Static192.anInt4177 = -1;
										return true;
									} else if (Static192.anInt4177 == 143) {
										Static87.method1472(Static62.anInt1604, Static153.aClass14_3, Static1.aClass1_Sub14_Sub1_43);
										Static192.anInt4177 = -1;
										return true;
									} else if (Static192.anInt4177 == 121) {
										Static52.anInt1411 = Static1.aClass1_Sub14_Sub1_43.method1722();
										Static53.anInt1437 = Static1.aClass1_Sub14_Sub1_43.method1752();
										Static192.anInt4177 = -1;
										return true;
									} else if (Static192.anInt4177 == 201) {
										Static171.anInt3802 = Static1.aClass1_Sub14_Sub1_43.method1738();
										Static192.anInt4177 = -1;
										Static68.anInt1494 = Static1.anInt4459;
										return true;
									} else if (Static192.anInt4177 == 87) {
										Static136.method2573();
										Static34.anInt998 = Static1.aClass1_Sub14_Sub1_43.method1738();
										Static192.anInt4177 = -1;
										Static26.anInt783 = Static1.anInt4459;
										return true;
									} else if (Static192.anInt4177 == 86) {
										local170 = Static1.aClass1_Sub14_Sub1_43.method1749();
										local463 = Static1.aClass1_Sub14_Sub1_43.method1737();
										local523 = Static1.aClass1_Sub14_Sub1_43.method1752();
										local2015 = (Class1_Sub20) Static200.aClass99_14.method3292((long) local463);
										if (local2015 != null) {
											Static104.method1931(local2015, local2015.anInt3111 != local170);
										}
										Static38.method678(local170, local463, local523);
										Static192.anInt4177 = -1;
										return true;
									} else if (Static192.anInt4177 == 25) {
										if (Static28.anInt856 != -1) {
											Static123.method2354(Static28.anInt856, 0);
										}
										Static192.anInt4177 = -1;
										return true;
									} else if (Static192.anInt4177 == 179) {
										@Pc(2260) byte[] local2260 = new byte[Static62.anInt1604];
										Static1.aClass1_Sub14_Sub1_43.method1762(local2260, Static62.anInt1604);
										Static104.method1927(Static183.method2975(0, Static62.anInt1604, local2260));
										Static192.anInt4177 = -1;
										return true;
									} else if (Static192.anInt4177 == 140) {
										local170 = Static1.aClass1_Sub14_Sub1_43.method1696();
										local1349 = Static154.method2691(local170);
										for (local523 = 0; local523 < local1349.anIntArray512.length; local523++) {
											local1349.anIntArray512[local523] = -1;
											local1349.anIntArray512[local523] = 0;
										}
										Static25.method448(local1349);
										Static192.anInt4177 = -1;
										return true;
									} else if (Static192.anInt4177 == 90) {
										local170 = Static1.aClass1_Sub14_Sub1_43.method1750();
										local463 = Static1.aClass1_Sub14_Sub1_43.method1705();
										local523 = Static1.aClass1_Sub14_Sub1_43.method1729();
										local582 = Static154.method2691(local463);
										local582.aByte10 = 0;
										local582.anInt4339 = local582.anInt4350 = local170;
										local582.aByte13 = 0;
										local582.anInt4318 = local582.anInt4308 = local523;
										Static25.method448(local582);
										Static192.anInt4177 = -1;
										return true;
									} else if (Static192.anInt4177 == 152) {
										local170 = Static1.aClass1_Sub14_Sub1_43.method1738();
										if (Static1.aClass1_Sub14_Sub1_43.method1738() == 0) {
											Static109.aClass9Array1[local170] = new Class9();
										} else {
											Static1.aClass1_Sub14_Sub1_43.anInt2306--;
											Static109.aClass9Array1[local170] = new Class9(Static1.aClass1_Sub14_Sub1_43);
										}
										Static192.anInt4177 = -1;
										Static123.anInt3062 = Static1.anInt4459;
										return true;
									} else {
										@Pc(2610) Class65 local2610;
										@Pc(2628) Class65 local2628;
										if (Static192.anInt4177 == 145) {
											local239 = Static1.aClass1_Sub14_Sub1_43.method1732();
											local523 = Static1.aClass1_Sub14_Sub1_43.method1753();
											local739 = Static1.aClass1_Sub14_Sub1_43.method1738();
											@Pc(2418) Class65 local2418 = Static117.aClass65_1665;
											if (local523 > 0) {
												local2418 = Static1.aClass1_Sub14_Sub1_43.method1706();
											}
											local1137 = Static134.method2558(local239).method2488();
											for (local295 = 0; local295 < Static33.anInt973; local295++) {
												if (local239 == Static206.aLongArray10[local295]) {
													if (local523 != Static9.anIntArray16[local295]) {
														Static9.anIntArray16[local295] = local523;
														if (local523 > 0) {
															Static31.method603(5, Static117.aClass65_1665, Static109.method2004(new Class65[] { local1137, Static154.aClass65_2045 }));
														}
														if (local523 == 0) {
															Static31.method603(5, Static117.aClass65_1665, Static109.method2004(new Class65[] { local1137, Static111.aClass65_1578 }));
														}
													}
													local1137 = null;
													Static53.aClass65Array19[local295] = local2418;
													Static46.anIntArray116[local295] = local739;
													break;
												}
											}
											if (local1137 != null && Static33.anInt973 < 200) {
												Static206.aLongArray10[Static33.anInt973] = local239;
												Static125.aClass65Array41[Static33.anInt973] = local1137;
												Static9.anIntArray16[Static33.anInt973] = local523;
												Static53.aClass65Array19[Static33.anInt973] = local2418;
												Static46.anIntArray116[Static33.anInt973] = local739;
												Static33.anInt973++;
											}
											Static68.anInt1494 = Static1.anInt4459;
											local1173 = Static33.anInt973;
											while (local1173 > 0) {
												local374 = true;
												local1173--;
												for (local370 = 0; local370 < local1173; local370++) {
													if (Static9.anIntArray16[local370] != Static13.anInt910 && Static9.anIntArray16[local370 + 1] == Static13.anInt910 || Static9.anIntArray16[local370] == 0 && Static9.anIntArray16[local370 + 1] != 0) {
														local374 = false;
														local376 = Static9.anIntArray16[local370];
														Static9.anIntArray16[local370] = Static9.anIntArray16[local370 + 1];
														Static9.anIntArray16[local370 + 1] = local376;
														local2610 = Static53.aClass65Array19[local370];
														Static53.aClass65Array19[local370] = Static53.aClass65Array19[local370 + 1];
														Static53.aClass65Array19[local370 + 1] = local2610;
														local2628 = Static125.aClass65Array41[local370];
														Static125.aClass65Array41[local370] = Static125.aClass65Array41[local370 + 1];
														Static125.aClass65Array41[local370 + 1] = local2628;
														@Pc(2646) long local2646 = Static206.aLongArray10[local370];
														Static206.aLongArray10[local370] = Static206.aLongArray10[local370 + 1];
														Static206.aLongArray10[local370 + 1] = local2646;
														@Pc(2664) int local2664 = Static46.anIntArray116[local370];
														Static46.anIntArray116[local370] = Static46.anIntArray116[local370 + 1];
														Static46.anIntArray116[local370 + 1] = local2664;
													}
												}
												if (local374) {
													break;
												}
											}
											Static192.anInt4177 = -1;
											return true;
										} else if (Static192.anInt4177 == 50) {
											Static53.anInt1437 = Static1.aClass1_Sub14_Sub1_43.method1722();
											Static52.anInt1411 = Static1.aClass1_Sub14_Sub1_43.method1722();
											while (Static1.aClass1_Sub14_Sub1_43.anInt2306 < Static62.anInt1604) {
												Static192.anInt4177 = Static1.aClass1_Sub14_Sub1_43.method1738();
												Static28.method560();
											}
											Static192.anInt4177 = -1;
											return true;
										} else if (Static192.anInt4177 == 254) {
											Static78.anInt1922 = Static1.aClass1_Sub14_Sub1_43.method1738();
											Static180.anInt3908 = Static1.aClass1_Sub14_Sub1_43.method1738();
											Static102.anInt2549 = Static1.aClass1_Sub14_Sub1_43.method1738();
											Static192.anInt4177 = -1;
											return true;
										} else if (Static192.anInt4177 == 4) {
											Static77.aBoolean81 = true;
											Static61.anInt1574 = Static1.aClass1_Sub14_Sub1_43.method1738();
											Static14.anInt393 = Static1.aClass1_Sub14_Sub1_43.method1738();
											Static145.anInt3441 = Static1.aClass1_Sub14_Sub1_43.method1753();
											Static63.anInt1620 = Static1.aClass1_Sub14_Sub1_43.method1738();
											Static81.anInt2021 = Static1.aClass1_Sub14_Sub1_43.method1738();
											if (Static81.anInt2021 >= 100) {
												local170 = Static61.anInt1574 * 128 + 64;
												local463 = Static14.anInt393 * 128 + 64;
												local523 = Static171.method2896(local170, Static207.anInt4425, local463) - Static145.anInt3441;
												local739 = local170 - Static78.anInt1919;
												local774 = local463 - Static160.anInt2779;
												local281 = local523 - Static97.anInt2437;
												local295 = (int) Math.sqrt((double) (local774 * local774 + local739 * local739));
												Static34.anInt999 = (int) (Math.atan2((double) local281, (double) local295) * 325.949D) & 0x7FF;
												Static126.anInt3116 = (int) (-325.949D * Math.atan2((double) local739, (double) local774)) & 0x7FF;
												if (Static34.anInt999 < 128) {
													Static34.anInt999 = 128;
												}
												if (Static34.anInt999 > 383) {
													Static34.anInt999 = 383;
												}
											}
											Static192.anInt4177 = -1;
											return true;
										} else if (Static192.anInt4177 == 47) {
											local170 = Static1.aClass1_Sub14_Sub1_43.method1722();
											local463 = Static1.aClass1_Sub14_Sub1_43.method1722();
											local523 = Static1.aClass1_Sub14_Sub1_43.method1722();
											Static207.anInt4425 = local170 >> 1;
											Static201.aClass6_Sub4_Sub1_3.method2991(local523, (local170 & 0x1) == 1, local463);
											Static192.anInt4177 = -1;
											return true;
										} else if (Static192.anInt4177 == 43) {
											local889 = Static1.aClass1_Sub14_Sub1_43.method1706();
											@Pc(2919) Class65 local2919;
											if (local889.method2461(Static80.aClass65_1202)) {
												local2919 = local889.method2481(local889.method2484(Static68.aClass65_933), 0);
												local1053 = false;
												local261 = local2919.method2475();
												for (local774 = 0; local774 < Static29.anInt859; local774++) {
													if (local261 == Static197.aLongArray9[local774]) {
														local1053 = true;
														break;
													}
												}
												if (!local1053 && Static18.anInt456 == 0) {
													Static31.method603(4, local2919, Static39.aClass65_672);
												}
											} else if (local889.method2461(Static135.aClass65_1866)) {
												local2919 = local889.method2481(local889.method2484(Static68.aClass65_933), 0);
												local261 = local2919.method2475();
												local1053 = false;
												for (local774 = 0; local774 < Static29.anInt859; local774++) {
													if (local261 == Static197.aLongArray9[local774]) {
														local1053 = true;
														break;
													}
												}
												if (!local1053 && Static18.anInt456 == 0) {
													@Pc(3295) Class65 local3295 = local889.method2481(local889.method2482() - 9, local889.method2484(Static68.aClass65_933) + 1);
													Static31.method603(8, local2919, local3295);
												}
											} else if (local889.method2461(Static191.aClass65_2473)) {
												local2919 = local889.method2481(local889.method2484(Static68.aClass65_933), 0);
												local261 = local2919.method2475();
												local1053 = false;
												for (local774 = 0; local774 < Static29.anInt859; local774++) {
													if (Static197.aLongArray9[local774] == local261) {
														local1053 = true;
														break;
													}
												}
												if (!local1053 && Static18.anInt456 == 0) {
													Static31.method603(10, local2919, Static117.aClass65_1665);
												}
											} else if (local889.method2461(Static173.aClass65_2280)) {
												local2919 = local889.method2481(local889.method2484(Static173.aClass65_2280), 0);
												Static31.method603(11, Static117.aClass65_1665, local2919);
											} else if (local889.method2461(Static74.aClass65_1114)) {
												local2919 = local889.method2481(local889.method2484(Static74.aClass65_1114), 0);
												if (Static18.anInt456 == 0) {
													Static31.method603(12, Static117.aClass65_1665, local2919);
												}
											} else if (local889.method2461(Static189.aClass65_2468)) {
												local2919 = local889.method2481(local889.method2484(Static189.aClass65_2468), 0);
												if (Static18.anInt456 == 0) {
													Static31.method603(13, Static117.aClass65_1665, local2919);
												}
											} else if (local889.method2461(Static90.aClass65_2590)) {
												local2919 = local889.method2481(local889.method2484(Static68.aClass65_933), 0);
												local261 = local2919.method2475();
												local1053 = false;
												for (local774 = 0; local774 < Static29.anInt859; local774++) {
													if (Static197.aLongArray9[local774] == local261) {
														local1053 = true;
														break;
													}
												}
												if (!local1053 && Static18.anInt456 == 0) {
													Static31.method603(14, local2919, Static117.aClass65_1665);
												}
											} else if (local889.method2461(Static40.aClass65_674)) {
												local2919 = local889.method2481(local889.method2484(Static68.aClass65_933), 0);
												local261 = local2919.method2475();
												local1053 = false;
												for (local774 = 0; local774 < Static29.anInt859; local774++) {
													if (local261 == Static197.aLongArray9[local774]) {
														local1053 = true;
														break;
													}
												}
												if (!local1053 && Static18.anInt456 == 0) {
													Static31.method603(15, local2919, Static117.aClass65_1665);
												}
											} else if (local889.method2461(Static209.aClass65_2579)) {
												local1053 = false;
												local2919 = local889.method2481(local889.method2484(Static68.aClass65_933), 0);
												local261 = local2919.method2475();
												for (local774 = 0; local774 < Static29.anInt859; local774++) {
													if (Static197.aLongArray9[local774] == local261) {
														local1053 = true;
														break;
													}
												}
												if (!local1053 && Static18.anInt456 == 0) {
													Static31.method603(16, local2919, Static117.aClass65_1665);
												}
											} else {
												Static31.method603(0, Static117.aClass65_1665, local889);
											}
											Static192.anInt4177 = -1;
											return true;
										} else if (Static192.anInt4177 == 19) {
											for (local170 = 0; local170 < Static135.anIntArray379.length; local170++) {
												if (Static135.anIntArray379[local170] != Static179.anIntArray459[local170]) {
													Static135.anIntArray379[local170] = Static179.anIntArray459[local170];
													Static146.method2643(local170);
													Static47.anIntArray118[Static158.anInt3609++ & 0x1F] = local170;
												}
											}
											Static192.anInt4177 = -1;
											return true;
										} else if (Static192.anInt4177 == 250) {
											Static185.method3077(true);
											Static192.anInt4177 = -1;
											return true;
										} else if (Static192.anInt4177 == 39) {
											local889 = Static1.aClass1_Sub14_Sub1_43.method1706();
											local463 = Static1.aClass1_Sub14_Sub1_43.method1737();
											local732 = Static154.method2691(local463);
											if (!local889.method2470(local732.aClass65_2566)) {
												local732.aClass65_2566 = local889;
												Static25.method448(local732);
											}
											Static192.anInt4177 = -1;
											return true;
										} else if (Static192.anInt4177 == 186) {
											local170 = Static1.aClass1_Sub14_Sub1_43.method1696();
											local463 = Static1.aClass1_Sub14_Sub1_43.method1704();
											if (local463 == 65535) {
												local463 = -1;
											}
											local732 = Static154.method2691(local170);
											if (local732.anInt4315 != 1 || local732.anInt4325 != local463) {
												local732.anInt4325 = local463;
												local732.anInt4315 = 1;
												Static25.method448(local732);
											}
											Static192.anInt4177 = -1;
											return true;
										} else if (Static192.anInt4177 == 185) {
											local239 = Static1.aClass1_Sub14_Sub1_43.method1732();
											local523 = Static1.aClass1_Sub14_Sub1_43.method1753();
											@Pc(3463) Class65 local3463 = Static15.method282(local523).method3207(Static1.aClass1_Sub14_Sub1_43);
											Static61.method1078(local523, null, 19, local3463, Static134.method2558(local239).method2488());
											Static192.anInt4177 = -1;
											return true;
										} else if (Static192.anInt4177 == 208) {
											Static31.anInt933 = Static1.aClass1_Sub14_Sub1_43.method1738();
											Static192.anInt4177 = -1;
											return true;
										} else if (Static192.anInt4177 == 167) {
											Static29.anInt859 = Static62.anInt1604 / 8;
											for (local170 = 0; local170 < Static29.anInt859; local170++) {
												Static197.aLongArray9[local170] = Static1.aClass1_Sub14_Sub1_43.method1732();
												Static149.aClass65Array47[local170] = Static134.method2558(Static197.aLongArray9[local170]);
											}
											Static192.anInt4177 = -1;
											Static68.anInt1494 = Static1.anInt4459;
											return true;
										} else if (Static192.anInt4177 == 32 || Static192.anInt4177 == 99 || Static192.anInt4177 == 77 || Static192.anInt4177 == 181 || Static192.anInt4177 == 88 || Static192.anInt4177 == 175 || Static192.anInt4177 == 196 || Static192.anInt4177 == 112 || Static192.anInt4177 == 224 || Static192.anInt4177 == 100 || Static192.anInt4177 == 15) {
											Static28.method560();
											Static192.anInt4177 = -1;
											return true;
										} else if (Static192.anInt4177 == 172) {
											local170 = Static1.aClass1_Sub14_Sub1_43.method1715();
											Static104.method1929(local170);
											Static105.anIntArray296[Static148.anInt3485++ & 0x1F] = local170 & 0x7FFF;
											Static192.anInt4177 = -1;
											return true;
										} else if (Static192.anInt4177 == 123) {
											local170 = Static1.aClass1_Sub14_Sub1_43.method1700();
											local463 = Static1.aClass1_Sub14_Sub1_43.method1753();
											if (local170 < -70000) {
												local463 += 32768;
											}
											if (local170 < 0) {
												local732 = null;
											} else {
												local732 = Static154.method2691(local170);
											}
											while (Static62.anInt1604 > Static1.aClass1_Sub14_Sub1_43.anInt2306) {
												local739 = Static1.aClass1_Sub14_Sub1_43.method1703();
												local281 = Static1.aClass1_Sub14_Sub1_43.method1753();
												local774 = 0;
												if (local281 != 0) {
													local774 = Static1.aClass1_Sub14_Sub1_43.method1738();
													if (local774 == 255) {
														local774 = Static1.aClass1_Sub14_Sub1_43.method1700();
													}
												}
												if (local732 != null && local739 >= 0 && local732.anIntArray512.length > local739) {
													local732.anIntArray512[local739] = local281;
													local732.anIntArray507[local739] = local774;
												}
												Static63.method1107(local281 - 1, local463, local774, local739);
											}
											if (local732 != null) {
												Static25.method448(local732);
											}
											Static136.method2573();
											Static105.anIntArray296[Static148.anInt3485++ & 0x1F] = local463 & 0x7FFF;
											Static192.anInt4177 = -1;
											return true;
										} else if (Static192.anInt4177 == 75) {
											Static77.aBoolean81 = false;
											for (local170 = 0; local170 < 5; local170++) {
												Static18.aBooleanArray1[local170] = false;
											}
											Static192.anInt4177 = -1;
											return true;
										} else if (Static192.anInt4177 == 194) {
											@Pc(3769) boolean local3769 = Static1.aClass1_Sub14_Sub1_43.method1738() == 1;
											local463 = Static1.aClass1_Sub14_Sub1_43.method1696();
											local732 = Static154.method2691(local463);
											if (local3769 != local732.aBoolean180) {
												local732.aBoolean180 = local3769;
												Static25.method448(local732);
											}
											Static192.anInt4177 = -1;
											return true;
										} else if (Static192.anInt4177 == 237) {
											local170 = Static1.aClass1_Sub14_Sub1_43.method1700();
											@Pc(3815) Class1_Sub20 local3815 = (Class1_Sub20) Static200.aClass99_14.method3292((long) local170);
											if (local3815 != null) {
												Static104.method1931(local3815, true);
											}
											if (Static7.aClass97_1 != null) {
												Static25.method448(Static7.aClass97_1);
												Static7.aClass97_1 = null;
											}
											Static192.anInt4177 = -1;
											return true;
										} else if (Static192.anInt4177 == 116) {
											Static53.anInt1437 = Static1.aClass1_Sub14_Sub1_43.method1728();
											Static52.anInt1411 = Static1.aClass1_Sub14_Sub1_43.method1752();
											for (local170 = Static53.anInt1437; local170 < Static53.anInt1437 + 8; local170++) {
												for (local463 = Static52.anInt1411; local463 < Static52.anInt1411 + 8; local463++) {
													if (Static27.aClass91ArrayArrayArray1[Static207.anInt4425][local170][local463] != null) {
														Static27.aClass91ArrayArrayArray1[Static207.anInt4425][local170][local463] = null;
														Static146.method2644(local170, local463);
													}
												}
											}
											for (@Pc(3888) Class1_Sub24 local3888 = (Class1_Sub24) Static159.aClass91_19.method3148(); local3888 != null; local3888 = (Class1_Sub24) Static159.aClass91_19.method3150()) {
												if (Static53.anInt1437 <= local3888.anInt4100 && local3888.anInt4100 < Static53.anInt1437 + 8 && local3888.anInt4087 >= Static52.anInt1411 && Static52.anInt1411 + 8 > local3888.anInt4087 && local3888.anInt4096 == Static207.anInt4425) {
													local3888.anInt4094 = 0;
												}
											}
											Static192.anInt4177 = -1;
											return true;
										} else {
											@Pc(3991) int local3991;
											if (Static192.anInt4177 == 178) {
												local239 = Static1.aClass1_Sub14_Sub1_43.method1732();
												local261 = Static1.aClass1_Sub14_Sub1_43.method1753();
												local1387 = Static1.aClass1_Sub14_Sub1_43.method1713();
												local295 = Static1.aClass1_Sub14_Sub1_43.method1738();
												@Pc(3960) boolean local3960 = false;
												@Pc(3966) long local3966 = (local261 << 32) + local1387;
												for (local376 = 0; local376 < 100; local376++) {
													if (Static189.aLongArray8[local376] == local3966) {
														local3960 = true;
														break;
													}
												}
												if (local295 <= 1) {
													for (local3991 = 0; local3991 < Static29.anInt859; local3991++) {
														if (Static197.aLongArray9[local3991] == local239) {
															local3960 = true;
															break;
														}
													}
												}
												if (!local3960 && Static18.anInt456 == 0) {
													Static189.aLongArray8[Static49.anInt1305] = local3966;
													Static49.anInt1305 = (Static49.anInt1305 + 1) % 100;
													local2610 = Static175.method1620(Static199.method3232(Static1.aClass1_Sub14_Sub1_43).method2491());
													if (local295 == 2 || local295 == 3) {
														Static31.method603(7, Static109.method2004(new Class65[] { Static16.aClass65_319, Static134.method2558(local239).method2488() }), local2610);
													} else if (local295 == 1) {
														Static31.method603(7, Static109.method2004(new Class65[] { Static193.aClass65_2484, Static134.method2558(local239).method2488() }), local2610);
													} else {
														Static31.method603(3, Static134.method2558(local239).method2488(), local2610);
													}
												}
												Static192.anInt4177 = -1;
												return true;
											} else if (Static192.anInt4177 == 206) {
												Static101.method1910(Static1.aClass1_Sub14_Sub1_43);
												Static192.anInt4177 = -1;
												return true;
											} else if (Static192.anInt4177 == 247) {
												local170 = Static1.aClass1_Sub14_Sub1_43.method1753();
												@Pc(4124) byte local4124 = Static1.aClass1_Sub14_Sub1_43.method1714();
												Static179.anIntArray459[local170] = local4124;
												if (local4124 != Static135.anIntArray379[local170]) {
													Static135.anIntArray379[local170] = local4124;
													Static146.method2643(local170);
												}
												Static47.anIntArray118[Static158.anInt3609++ & 0x1F] = local170;
												Static192.anInt4177 = -1;
												return true;
											} else if (Static192.anInt4177 == 147) {
												local170 = Static1.aClass1_Sub14_Sub1_43.method1738();
												local463 = local170 >> 6;
												@Pc(4169) Class49 local4169 = new Class49();
												local4169.anInt2337 = local170 & 0x3F;
												local4169.anInt2333 = Static1.aClass1_Sub14_Sub1_43.method1738();
												if (local4169.anInt2333 >= 0 && Static136.aClass1_Sub2_Sub5_Sub3Array10.length > local4169.anInt2333) {
													if (local4169.anInt2337 == 1 || local4169.anInt2337 == 10) {
														local4169.anInt2327 = Static1.aClass1_Sub14_Sub1_43.method1753();
														Static1.aClass1_Sub14_Sub1_43.anInt2306 += 3;
													} else if (local4169.anInt2337 >= 2 && local4169.anInt2337 <= 6) {
														if (local4169.anInt2337 == 2) {
															local4169.anInt2325 = 64;
															local4169.anInt2330 = 64;
														}
														if (local4169.anInt2337 == 3) {
															local4169.anInt2325 = 0;
															local4169.anInt2330 = 64;
														}
														if (local4169.anInt2337 == 4) {
															local4169.anInt2330 = 64;
															local4169.anInt2325 = 128;
														}
														if (local4169.anInt2337 == 5) {
															local4169.anInt2325 = 64;
															local4169.anInt2330 = 0;
														}
														if (local4169.anInt2337 == 6) {
															local4169.anInt2325 = 64;
															local4169.anInt2330 = 128;
														}
														local4169.anInt2337 = 2;
														local4169.anInt2336 = Static1.aClass1_Sub14_Sub1_43.method1753();
														local4169.anInt2331 = Static1.aClass1_Sub14_Sub1_43.method1753();
														local4169.anInt2334 = Static1.aClass1_Sub14_Sub1_43.method1738();
													}
													local4169.anInt2326 = Static1.aClass1_Sub14_Sub1_43.method1753();
													if (local4169.anInt2326 == 65535) {
														local4169.anInt2326 = -1;
													}
													Static44.aClass49Array1[local463] = local4169;
												}
												Static192.anInt4177 = -1;
												return true;
											} else if (Static192.anInt4177 == 126) {
												local170 = Static1.aClass1_Sub14_Sub1_43.method1704();
												local463 = Static1.aClass1_Sub14_Sub1_43.method1749();
												local523 = Static1.aClass1_Sub14_Sub1_43.method1715();
												local739 = Static1.aClass1_Sub14_Sub1_43.method1696();
												@Pc(4346) Class97 local4346 = Static154.method2691(local739);
												if (local523 != local4346.anInt4370 || local4346.anInt4380 != local170 || local4346.anInt4369 != local463) {
													local4346.anInt4370 = local523;
													local4346.anInt4369 = local463;
													local4346.anInt4380 = local170;
													Static25.method448(local4346);
												}
												Static192.anInt4177 = -1;
												return true;
											} else if (Static192.anInt4177 == 180) {
												Static192.anInt4177 = -1;
												Static106.anInt2616 = 0;
												return true;
											} else if (Static192.anInt4177 == 91) {
												local170 = Static1.aClass1_Sub14_Sub1_43.method1753();
												if (local170 == 65535) {
													local170 = -1;
												}
												local463 = Static1.aClass1_Sub14_Sub1_43.method1738();
												local523 = Static1.aClass1_Sub14_Sub1_43.method1753();
												Static184.method3067(local170, local463, local523);
												Static192.anInt4177 = -1;
												return true;
											} else if (Static192.anInt4177 == 31) {
												for (local170 = 0; local170 < Static158.aClass6_Sub4_Sub1Array1.length; local170++) {
													if (Static158.aClass6_Sub4_Sub1Array1[local170] != null) {
														Static158.aClass6_Sub4_Sub1Array1[local170].anInt3945 = -1;
													}
												}
												for (local463 = 0; local463 < Static106.aClass6_Sub4_Sub2Array1.length; local463++) {
													if (Static106.aClass6_Sub4_Sub2Array1[local463] != null) {
														Static106.aClass6_Sub4_Sub2Array1[local463].anInt3945 = -1;
													}
												}
												Static192.anInt4177 = -1;
												return true;
											} else if (Static192.anInt4177 == 209) {
												Static136.method2573();
												Static47.anInt1234 = Static1.aClass1_Sub14_Sub1_43.method1729();
												Static192.anInt4177 = -1;
												Static26.anInt783 = Static1.anInt4459;
												return true;
											} else if (Static192.anInt4177 == 28) {
												local170 = Static1.aClass1_Sub14_Sub1_43.method1704();
												local463 = Static1.aClass1_Sub14_Sub1_43.method1737();
												if (local170 == 65535) {
													local170 = -1;
												}
												local523 = Static1.aClass1_Sub14_Sub1_43.method1705();
												local739 = Static1.aClass1_Sub14_Sub1_43.method1715();
												if (local739 == 65535) {
													local739 = -1;
												}
												for (local281 = local739; local281 <= local170; local281++) {
													@Pc(4534) long local4534 = (long) local281 + ((long) local523 << 32);
													@Pc(4539) Class1 local4539 = Static81.aClass99_5.method3292(local4534);
													if (local4539 != null) {
														local4539.method3295();
													}
													Static81.aClass99_5.method3290(new Class1_Sub21(local463), local4534);
												}
												Static192.anInt4177 = -1;
												return true;
											} else if (Static192.anInt4177 == 149) {
												Static136.method2573();
												local170 = Static1.aClass1_Sub14_Sub1_43.method1752();
												local463 = Static1.aClass1_Sub14_Sub1_43.method1737();
												local523 = Static1.aClass1_Sub14_Sub1_43.method1728();
												Static37.anIntArray97[local523] = local463;
												Static118.anIntArray335[local523] = local170;
												Static113.anIntArray327[local523] = 1;
												for (local739 = 0; local739 < 98; local739++) {
													if (local463 >= Class18.anIntArray447[local739]) {
														Static113.anIntArray327[local523] = local739 + 2;
													}
												}
												Static178.anIntArray458[Static100.anInt2519++ & 0x1F] = local523;
												Static192.anInt4177 = -1;
												return true;
											} else if (Static192.anInt4177 == 164) {
												Static185.method3077(false);
												Static192.anInt4177 = -1;
												return true;
											} else if (Static192.anInt4177 == 111) {
												local170 = Static1.aClass1_Sub14_Sub1_43.method1704();
												local463 = Static1.aClass1_Sub14_Sub1_43.method1705();
												local523 = Static1.aClass1_Sub14_Sub1_43.method1749();
												local582 = Static154.method2691(local463);
												Static192.anInt4177 = -1;
												local582.anInt4311 = (local523 << 16) + local170;
												return true;
											} else if (Static192.anInt4177 == 92) {
												Static26.method477();
												Static192.anInt4177 = -1;
												return true;
											} else if (Static192.anInt4177 == 6) {
												local239 = Static1.aClass1_Sub14_Sub1_43.method1732();
												local261 = Static1.aClass1_Sub14_Sub1_43.method1753();
												local1387 = Static1.aClass1_Sub14_Sub1_43.method1713();
												@Pc(4707) long local4707 = (local261 << 32) + local1387;
												@Pc(4709) boolean local4709 = false;
												local295 = Static1.aClass1_Sub14_Sub1_43.method1738();
												local1163 = Static1.aClass1_Sub14_Sub1_43.method1753();
												for (local3991 = 0; local3991 < 100; local3991++) {
													if (local4707 == Static189.aLongArray8[local3991]) {
														local4709 = true;
														break;
													}
												}
												if (local295 <= 1) {
													for (local1407 = 0; local1407 < Static29.anInt859; local1407++) {
														if (local239 == Static197.aLongArray9[local1407]) {
															local4709 = true;
															break;
														}
													}
												}
												if (!local4709 && Static18.anInt456 == 0) {
													Static189.aLongArray8[Static49.anInt1305] = local4707;
													Static49.anInt1305 = (Static49.anInt1305 + 1) % 100;
													local2628 = Static15.method282(local1163).method3207(Static1.aClass1_Sub14_Sub1_43);
													if (local295 == 2) {
														Static61.method1078(local1163, null, 18, local2628, Static109.method2004(new Class65[] { Static16.aClass65_319, Static134.method2558(local239).method2488() }));
													} else if (local295 == 1) {
														Static61.method1078(local1163, null, 18, local2628, Static109.method2004(new Class65[] { Static193.aClass65_2484, Static134.method2558(local239).method2488() }));
													} else {
														Static61.method1078(local1163, null, 18, local2628, Static134.method2558(local239).method2488());
													}
												}
												Static192.anInt4177 = -1;
												return true;
											} else if (Static192.anInt4177 == 107) {
												local170 = Static1.aClass1_Sub14_Sub1_43.method1728();
												local463 = Static1.aClass1_Sub14_Sub1_43.method1752();
												local2109 = Static1.aClass1_Sub14_Sub1_43.method1706();
												if (local463 >= 1 && local463 <= 8) {
													if (local2109.method2489(Static158.aClass65_2098)) {
														local2109 = null;
													}
													Static196.aClass65Array61[local463 - 1] = local2109;
													Static61.aBooleanArray9[local463 - 1] = local170 == 0;
												}
												Static192.anInt4177 = -1;
												return true;
											} else if (Static192.anInt4177 == 238) {
												Static137.method2586();
												Static192.anInt4177 = -1;
												return false;
											} else {
												Static107.method1977(null, "T1 - " + Static192.anInt4177 + "," + Static150.anInt3510 + "," + anInt645 + " - " + Static62.anInt1604);
												Static137.method2586();
												return true;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIZ)I")
	public static int method398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class1_Sub15 local15 = (Class1_Sub15) Static145.aClass99_11.method3292((long) arg1);
		if (local15 == null) {
			return -1;
		} else if (arg0 >= 0 && arg0 < local15.anIntArray269.length) {
			return local15.anIntArray269[arg0];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IZ)V")
	public static void method400(@OriginalArg(1) boolean arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static22.anInt659; local7++) {
			@Pc(15) Class6_Sub4_Sub2 local15 = Static106.aClass6_Sub4_Sub2Array1[Static72.anIntArray197[local7]];
			@Pc(24) long local24 = (long) Static72.anIntArray197[local7] << 32 | 0x20000000L;
			if (local15 != null && local15.method2996() && local15.aClass1_Sub2_Sub11_1.aBoolean67 == arg0 && local15.aClass1_Sub2_Sub11_1.method1075()) {
				@Pc(49) int local49 = local15.anInt3976 >> 7;
				@Pc(54) int local54 = local15.anInt3934 >> 7;
				if (local54 >= 0 && local54 < 104 && local49 >= 0 && local49 < 104) {
					if (local15.anInt3959 == 1 && (local15.anInt3934 & 0x7F) == 64 && (local15.anInt3976 & 0x7F) == 64) {
						if (Static100.anInt2510 == Static86.anIntArrayArray19[local54][local49]) {
							continue;
						}
						Static86.anIntArrayArray19[local54][local49] = Static100.anInt2510;
					}
					if (!local15.aClass1_Sub2_Sub11_1.aBoolean68) {
						local24 |= Long.MIN_VALUE;
					}
					local15.anInt3943 = Static171.method2896(local15.anInt3959 * 64 + local15.anInt3934 - 64, Static207.anInt4425, local15.anInt3976 + (local15.anInt3959 - 1) * 64);
					Static133.method2536(Static207.anInt4425, local15.anInt3934, local15.anInt3976, local15.anInt3943, local15.anInt3959 * 64 + 60 - 64, local15, local15.anInt3971, local24, local15.aBoolean159);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lclient!oc;Lclient!sd;BLclient!oc;Lclient!sd;)Lclient!jh;")
	public static Class1_Sub2_Sub5_Sub4_Sub1 method401(@OriginalArg(0) Class65 arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(3) Class65 arg2, @OriginalArg(4) Class60 arg3) {
		@Pc(10) int local10 = arg3.method2328(arg2);
		@Pc(21) int local21 = arg3.method2333(arg0, local10);
		return Static12.method222(local21, arg1, arg3, local10);
	}
}
