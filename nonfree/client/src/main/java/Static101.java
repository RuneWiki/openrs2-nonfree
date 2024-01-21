import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!re", name = "f", descriptor = "Lclient!ef;")
	public static Class16 aClass16_125;

	@OriginalMember(owner = "client!re", name = "v", descriptor = "Lclient!ef;")
	public static Class16 aClass16_126;

	@OriginalMember(owner = "client!re", name = "z", descriptor = "[I")
	public static int[] anIntArray334;

	@OriginalMember(owner = "client!re", name = "b", descriptor = "Lclient!he;")
	public static Class26 aClass26_1492 = Static6.method100("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!re", name = "e", descriptor = "I")
	public static int anInt2759 = 1;

	@OriginalMember(owner = "client!re", name = "g", descriptor = "Lclient!he;")
	private static Class26 aClass26_1493 = Static6.method100("Please wait 1 minute and try again)3");

	@OriginalMember(owner = "client!re", name = "j", descriptor = "Lclient!he;")
	public static Class26 aClass26_1494 = Static6.method100("mapdots");

	@OriginalMember(owner = "client!re", name = "l", descriptor = "I")
	public static int anInt2762 = -1;

	@OriginalMember(owner = "client!re", name = "n", descriptor = "Lclient!he;")
	public static Class26 aClass26_1495 = aClass26_1493;

	@OriginalMember(owner = "client!re", name = "o", descriptor = "J")
	public static long aLong86 = 0L;

	@OriginalMember(owner = "client!re", name = "p", descriptor = "Lclient!he;")
	public static Class26 aClass26_1496 = Static6.method100("");

	@OriginalMember(owner = "client!re", name = "x", descriptor = "Lclient!he;")
	public static Class26 aClass26_1497 = Static6.method100("compass");

	@OriginalMember(owner = "client!re", name = "y", descriptor = "Lclient!he;")
	public static Class26 aClass26_1498 = aClass26_1493;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
	public static void method1892() {
		aClass26_1497 = null;
		anIntArray334 = null;
		aClass26_1493 = null;
		aClass16_126 = null;
		aClass26_1498 = null;
		aClass16_125 = null;
		aClass26_1496 = null;
		aClass26_1495 = null;
		aClass26_1492 = null;
		aClass26_1494 = null;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(III)I")
	public static int method1893(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			return 12345678;
		}
		arg0 = arg0 * (arg1 & 0x7F) / 128;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V")
	public static void method1894() {
		if (Static126.anInt3213 > 0) {
			Static126.anInt3213--;
		}
		if (Static93.anInt2522 > 1) {
			Static93.anInt2522--;
		}
		if (Static4.aBoolean13) {
			Static4.aBoolean13 = false;
			Static17.method274();
			return;
		}
		for (@Pc(27) int local27 = 0; local27 < 100 && Static78.method1363(); local27++) {
		}
		if (Static89.anInt2466 != 30) {
			return;
		}
		Static126.method2199(Static107.aClass3_Sub11_Sub1_3);
		@Pc(51) Object local51 = Static52.aClass53_1.anObject4;
		@Pc(87) int local87;
		@Pc(74) int local74;
		@Pc(89) int local89;
		@Pc(104) int local104;
		@Pc(122) int local122;
		synchronized (Static52.aClass53_1.anObject4) {
			if (!Static89.aBoolean136) {
				Static52.aClass53_1.anInt2452 = 0;
			} else if (Static102.anInt2770 != 0 || Static52.aClass53_1.anInt2452 >= 40) {
				local74 = 0;
				Static107.aClass3_Sub11_Sub1_3.method1029(185);
				Static107.aClass3_Sub11_Sub1_3.method992(0);
				local87 = Static107.aClass3_Sub11_Sub1_3.anInt1562;
				for (local89 = 0; Static52.aClass53_1.anInt2452 > local89 && Static107.aClass3_Sub11_Sub1_3.anInt1562 - local87 < 240; local89++) {
					local74++;
					local104 = Static52.aClass53_1.anIntArray293[local89];
					if (local104 < 0) {
						local104 = 0;
					} else if (local104 > 502) {
						local104 = 502;
					}
					local122 = Static52.aClass53_1.anIntArray294[local89];
					if (local122 < 0) {
						local122 = 0;
					} else if (local122 > 764) {
						local122 = 764;
					}
					@Pc(144) int local144 = local122 + local104 * 765;
					if (Static52.aClass53_1.anIntArray293[local89] == -1 && Static52.aClass53_1.anIntArray294[local89] == -1) {
						local104 = -1;
						local122 = -1;
						local144 = 524287;
					}
					if (Static48.anInt1578 != local122 || local104 != Static2.anInt17) {
						@Pc(189) int local189 = local122 - Static48.anInt1578;
						Static48.anInt1578 = local122;
						@Pc(196) int local196 = local104 - Static2.anInt17;
						Static2.anInt17 = local104;
						if (Static98.anInt2630 < 8 && local189 >= -32 && local189 <= 31 && local196 >= -32 && local196 <= 31) {
							local189 += 32;
							local196 += 32;
							Static107.aClass3_Sub11_Sub1_3.method972(local196 + (Static98.anInt2630 << 12) + (local189 << 6));
							Static98.anInt2630 = 0;
						} else if (Static98.anInt2630 < 8) {
							Static107.aClass3_Sub11_Sub1_3.method996((Static98.anInt2630 << 19) + local144 + 8388608);
							Static98.anInt2630 = 0;
						} else {
							Static107.aClass3_Sub11_Sub1_3.method1001((Static98.anInt2630 << 19) + local144 - 1073741824);
							Static98.anInt2630 = 0;
						}
					} else if (Static98.anInt2630 < 2047) {
						Static98.anInt2630++;
					}
				}
				Static107.aClass3_Sub11_Sub1_3.method1023(Static107.aClass3_Sub11_Sub1_3.anInt1562 - local87);
				if (Static52.aClass53_1.anInt2452 > local74) {
					Static52.aClass53_1.anInt2452 -= local74;
					for (local104 = 0; local104 < Static52.aClass53_1.anInt2452; local104++) {
						Static52.aClass53_1.anIntArray294[local104] = Static52.aClass53_1.anIntArray294[local104 + local74];
						Static52.aClass53_1.anIntArray293[local104] = Static52.aClass53_1.anIntArray293[local74 + local104];
					}
				} else {
					Static52.aClass53_1.anInt2452 = 0;
				}
			}
		}
		if (Static102.anInt2770 != 0) {
			local87 = Static19.anInt514;
			local74 = Static59.anInt1803;
			if (local87 < 0) {
				local87 = 0;
			} else if (local87 > 502) {
				local87 = 502;
			}
			if (local74 < 0) {
				local74 = 0;
			} else if (local74 > 764) {
				local74 = 764;
			}
			local89 = local74 + local87 * 765;
			@Pc(383) byte local383 = 0;
			if (Static102.anInt2770 == 2) {
				local383 = 1;
			}
			@Pc(397) long local397 = (aLong86 - Static71.aLong63) / 50L;
			Static71.aLong63 = aLong86;
			if (local397 > 4095L) {
				local397 = 4095L;
			}
			Static107.aClass3_Sub11_Sub1_3.method1029(99);
			local122 = (int) local397;
			Static107.aClass3_Sub11_Sub1_3.method1001((local122 << 20) + (local383 << 19) + local89);
		}
		if (Static64.anInt1936 > 0) {
			Static64.anInt1936--;
		}
		if (Static95.aBooleanArray24[96] || Static95.aBooleanArray24[97] || Static95.aBooleanArray24[98] || Static95.aBooleanArray24[99]) {
			Static5.aBoolean180 = true;
		}
		if (Static5.aBoolean180 && Static64.anInt1936 <= 0) {
			Static5.aBoolean180 = false;
			Static64.anInt1936 = 20;
			Static107.aClass3_Sub11_Sub1_3.method1029(128);
			Static107.aClass3_Sub11_Sub1_3.method1016(Static1.anInt5);
			Static107.aClass3_Sub11_Sub1_3.method972(Static78.anInt2107);
		}
		if (Static4.aBoolean12 && !Static98.aBoolean150) {
			Static98.aBoolean150 = true;
			Static107.aClass3_Sub11_Sub1_3.method1029(7);
			Static107.aClass3_Sub11_Sub1_3.method992(1);
		}
		if (!Static4.aBoolean12 && Static98.aBoolean150) {
			Static98.aBoolean150 = false;
			Static107.aClass3_Sub11_Sub1_3.method1029(7);
			Static107.aClass3_Sub11_Sub1_3.method992(0);
		}
		Static125.method2193();
		if (Static89.anInt2466 != 30) {
			return;
		}
		Static93.method1686();
		Static88.method1629();
		Static113.anInt3001++;
		if (Static113.anInt3001 > 750) {
			Static17.method274();
			return;
		}
		Static10.method166();
		Static100.method2208();
		Static93.method1688();
		if (Static49.anInt1587 != 0) {
			Static17.anInt428 += 20;
			if (Static17.anInt428 >= 400) {
				Static49.anInt1587 = 0;
			}
		}
		Static42.anInt1304++;
		if (Static74.aClass3_Sub14_7 != null) {
			Static29.anInt1008++;
			if (Static29.anInt1008 >= 15) {
				Static110.method2004(Static74.aClass3_Sub14_7);
				Static74.aClass3_Sub14_7 = null;
			}
		}
		@Pc(641) Class3_Sub14 local641;
		if (Static6.aClass3_Sub14_1 != null) {
			Static110.method2004(Static6.aClass3_Sub14_1);
			if (Static113.anInt3014 + 5 < Static59.anInt1807 || Static59.anInt1807 < Static113.anInt3014 - 5 || Static96.anInt2604 + 5 < Static7.anInt187 || Static96.anInt2604 - 5 > Static7.anInt187) {
				Static117.aBoolean168 = true;
			}
			Static5.anInt3225++;
			if (Static21.anInt826 == 0) {
				if (Static117.aBoolean168 && Static5.anInt3225 >= 5) {
					if (Static6.aClass3_Sub14_1 == Static66.aClass3_Sub14_12 && Static55.anInt1650 != Static90.anInt2490) {
						local641 = Static6.aClass3_Sub14_1;
						@Pc(643) byte local643 = 0;
						if (Static27.anInt972 == 1 && local641.anInt2186 == 206) {
							local643 = 1;
						}
						if (local641.anIntArray214[Static55.anInt1650] <= 0) {
							local643 = 0;
						}
						if (Static116.method2089(Static89.method1641(local641))) {
							local87 = Static90.anInt2490;
							local74 = Static55.anInt1650;
							local641.anIntArray214[local74] = local641.anIntArray214[local87];
							local641.anIntArray215[local74] = local641.anIntArray215[local87];
							local641.anIntArray214[local87] = -1;
							local641.anIntArray215[local87] = 0;
						} else if (local643 == 1) {
							local74 = Static55.anInt1650;
							local87 = Static90.anInt2490;
							while (local74 != local87) {
								if (local74 < local87) {
									local641.method1385(local87 - 1, local87);
									local87--;
								} else if (local74 > local87) {
									local641.method1385(local87 + 1, local87);
									local87++;
								}
							}
						} else {
							local641.method1385(Static55.anInt1650, Static90.anInt2490);
						}
						Static107.aClass3_Sub11_Sub1_3.method1029(121);
						Static107.aClass3_Sub11_Sub1_3.method983(Static55.anInt1650);
						Static107.aClass3_Sub11_Sub1_3.method990(local643);
						Static107.aClass3_Sub11_Sub1_3.method976(Static6.aClass3_Sub14_1.anInt2154);
						Static107.aClass3_Sub11_Sub1_3.method989(Static90.anInt2490);
					}
				} else if ((Static131.anInt3266 == 1 || Static66.method1634(Static56.anInt1695 - 1)) && Static56.anInt1695 > 2) {
					Static15.method263();
				} else if (Static56.anInt1695 > 0) {
					Static70.method986(Static56.anInt1695 - 1);
				}
				Static102.anInt2770 = 0;
				Static29.anInt1008 = 10;
				Static6.aClass3_Sub14_1 = null;
			}
		}
		Static54.aBoolean86 = false;
		Static93.aBoolean140 = false;
		Static125.anInt3203 = 0;
		Static91.aClass3_Sub14_13 = null;
		local641 = Static53.aClass3_Sub14_4;
		@Pc(823) Class3_Sub14 local823 = Static71.aClass3_Sub14_6;
		Static53.aClass3_Sub14_4 = null;
		Static71.aClass3_Sub14_6 = null;
		while (Static85.method1490() && Static125.anInt3203 < 128) {
			Static81.anIntArray227[Static125.anInt3203] = Static91.anInt2510;
			Static81.anIntArray225[Static125.anInt3203] = Static76.anInt2094;
			Static125.anInt3203++;
		}
		Static9.method136(0, 765, Static32.anInt1048, 0, 503, 0, 0);
		Static71.anInt2023++;
		while (true) {
			@Pc(869) Class3_Sub15 local869;
			@Pc(882) Class3_Sub14 local882;
			@Pc(874) Class3_Sub14 local874;
			do {
				local869 = (Class3_Sub15) Static23.aClass65_33.method1959();
				if (local869 == null) {
					while (true) {
						do {
							local869 = (Class3_Sub15) Static29.aClass65_22.method1959();
							if (local869 == null) {
								while (true) {
									do {
										local869 = (Class3_Sub15) Static5.aClass65_81.method1959();
										if (local869 == null) {
											if (Static109.aClass3_Sub14_15 != null) {
												Static80.method1395();
											}
											if (Static112.anInt2989 != -1) {
												local87 = Static112.anInt2989;
												local74 = Static112.anInt2984;
												@Pc(1038) boolean local1038 = Static100.method2209(0, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray325[0], local74, local87, 0, 0, true, 0, 0, 0, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray326[0]);
												Static112.anInt2989 = -1;
												if (local1038) {
													Static2.anInt18 = Static19.anInt514;
													Static93.anInt2538 = Static59.anInt1803;
													Static17.anInt428 = 0;
													Static49.anInt1587 = 1;
												}
											}
											Static23.method876();
											if (local641 != Static53.aClass3_Sub14_4) {
												if (local641 != null) {
													Static110.method2004(local641);
												}
												if (Static53.aClass3_Sub14_4 != null) {
													Static110.method2004(Static53.aClass3_Sub14_4);
												}
											}
											if (local823 != Static71.aClass3_Sub14_6 && Static8.anInt205 == Static126.anInt3212) {
												if (local823 != null) {
													Static110.method2004(local823);
												}
												if (Static71.aClass3_Sub14_6 != null) {
													Static110.method2004(Static71.aClass3_Sub14_6);
												}
											}
											if (Static71.aClass3_Sub14_6 == null) {
												if (Static126.anInt3212 > 0) {
													Static126.anInt3212--;
												}
											} else if (Static126.anInt3212 < Static8.anInt205) {
												Static126.anInt3212++;
												if (Static8.anInt205 == Static126.anInt3212) {
													Static110.method2004(Static71.aClass3_Sub14_6);
												}
											}
											Static39.method773();
											if (Static40.aBoolean67) {
												Static126.method2198();
											}
											for (local87 = 0; local87 < 5; local87++) {
												@Pc(1129) int local1129 = Static91.anIntArray302[local87]++;
											}
											local74 = Static65.method1270();
											local89 = Static52.method1088();
											if (local74 > 4500 && local89 > 4500) {
												Static126.anInt3213 = 250;
												Static46.method886(4000);
												Static107.aClass3_Sub11_Sub1_3.method1029(230);
											}
											Static130.anInt3257++;
											Static61.anInt1843++;
											if (Static61.anInt1843 > 500) {
												local104 = (int) (Math.random() * 8.0D);
												if ((local104 & 0x4) == 4) {
													Static94.anInt2554 += Static24.anInt893;
												}
												if ((local104 & 0x1) == 1) {
													Static117.anInt3069 += Static54.anInt1629;
												}
												Static61.anInt1843 = 0;
												if ((local104 & 0x2) == 2) {
													Static36.anInt1196 += Static121.anInt3168;
												}
											}
											if (Static117.anInt3069 < -50) {
												Static54.anInt1629 = 2;
											}
											Static42.anInt1303++;
											if (Static94.anInt2554 < -40) {
												Static24.anInt893 = 1;
											}
											if (Static117.anInt3069 > 50) {
												Static54.anInt1629 = -2;
											}
											if (Static130.anInt3257 > 500) {
												local104 = (int) (Math.random() * 8.0D);
												Static130.anInt3257 = 0;
												if ((local104 & 0x1) == 1) {
													Static52.anInt1614 += Static58.anInt1798;
												}
												if ((local104 & 0x2) == 2) {
													Static33.anInt1081 += Static66.anInt2453;
												}
											}
											if (Static36.anInt1196 < -55) {
												Static121.anInt3168 = 2;
											}
											if (Static52.anInt1614 < -60) {
												Static58.anInt1798 = 2;
											}
											if (Static52.anInt1614 > 60) {
												Static58.anInt1798 = -2;
											}
											if (Static94.anInt2554 > 40) {
												Static24.anInt893 = -1;
											}
											if (Static36.anInt1196 > 55) {
												Static121.anInt3168 = -2;
											}
											if (Static33.anInt1081 < -20) {
												Static66.anInt2453 = 1;
											}
											if (Static33.anInt1081 > 10) {
												Static66.anInt2453 = -1;
											}
											if (Static42.anInt1303 > 50) {
												Static107.aClass3_Sub11_Sub1_3.method1029(202);
											}
											try {
												if (Static118.aClass76_4 != null && Static107.aClass3_Sub11_Sub1_3.anInt1562 > 0) {
													Static118.aClass76_4.method2185(Static107.aClass3_Sub11_Sub1_3.anInt1562, Static107.aClass3_Sub11_Sub1_3.aByteArray13);
													Static42.anInt1303 = 0;
													Static107.aClass3_Sub11_Sub1_3.anInt1562 = 0;
													return;
												}
												return;
											} catch (@Pc(1350) IOException local1350) {
												Static17.method274();
												return;
											}
										}
										local874 = local869.aClass3_Sub14_11;
										if (local874.anInt2150 < 0) {
											break;
										}
										local882 = Static100.method2212(local874.anInt2159);
									} while (local882 == null || local882.aClass3_Sub14Array2 == null || local882.aClass3_Sub14Array2.length <= local874.anInt2150 || local882.aClass3_Sub14Array2[local874.anInt2150] != local874);
									Static28.method595(local869);
								}
							}
							local874 = local869.aClass3_Sub14_11;
							if (local874.anInt2150 < 0) {
								break;
							}
							local882 = Static100.method2212(local874.anInt2159);
						} while (local882 == null || local882.aClass3_Sub14Array2 == null || local882.aClass3_Sub14Array2.length <= local874.anInt2150 || local874 != local882.aClass3_Sub14Array2[local874.anInt2150]);
						Static28.method595(local869);
					}
				}
				local874 = local869.aClass3_Sub14_11;
				if (local874.anInt2150 < 0) {
					break;
				}
				local882 = Static100.method2212(local874.anInt2159);
			} while (local882 == null || local882.aClass3_Sub14Array2 == null || local874.anInt2150 >= local882.aClass3_Sub14Array2.length || local882.aClass3_Sub14Array2[local874.anInt2150] != local874);
			Static28.method595(local869);
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ZIIII)V")
	public static void method1895(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static77.method2218(arg0, arg2, arg0 + arg1, arg2 + arg3);
		Static127.method2238();
		Static67.anInt2785++;
		Static62.method1232(true);
		Static61.method1202(true);
		Static62.method1232(false);
		Static61.method1202(false);
		Static31.method1877();
		Static40.method780();
		@Pc(39) int local39;
		@Pc(58) int local58;
		if (!Static40.aBoolean67) {
			local39 = Static1.anInt5;
			if (local39 < Static122.anInt3178 / 256) {
				local39 = Static122.anInt3178 / 256;
			}
			local58 = Static94.anInt2554 + Static78.anInt2107 & 0x7FF;
			if (Static6.aBooleanArray1[4] && Static15.anIntArray53[4] + 128 > local39) {
				local39 = Static15.anIntArray53[4] + 128;
			}
			Static28.method592(local39, Static99.anInt2754, Static110.method2006(Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anInt2733, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anInt2731, Static132.anInt3270) - 50, local39 * 3 + 600, Static85.anInt2342, local58);
		}
		if (Static40.aBoolean67) {
			local39 = Static76.method1359();
		} else {
			local39 = Static32.method627();
		}
		@Pc(107) int local107 = Static81.anInt2248;
		local58 = Static10.anInt282;
		@Pc(111) int local111 = Static54.anInt1624;
		@Pc(113) int local113 = Static79.anInt2157;
		@Pc(115) int local115 = Static32.anInt1052;
		@Pc(159) int local159;
		for (@Pc(117) int local117 = 0; local117 < 5; local117++) {
			if (Static6.aBooleanArray1[local117]) {
				local159 = (int) ((double) -Static126.anIntArray387[local117] + (double) (Static126.anIntArray387[local117] * 2 + 1) * Math.random() + Math.sin((double) Static91.anIntArray302[local117] * ((double) Static96.anIntArray310[local117] / 100.0D)) * (double) Static15.anIntArray53[local117]);
				if (local117 == 0) {
					Static10.anInt282 += local159;
				}
				if (local117 == 3) {
					Static32.anInt1052 = Static32.anInt1052 + local159 & 0x7FF;
				}
				if (local117 == 2) {
					Static54.anInt1624 += local159;
				}
				if (local117 == 1) {
					Static79.anInt2157 += local159;
				}
				if (local117 == 4) {
					Static81.anInt2248 += local159;
					if (Static81.anInt2248 < 128) {
						Static81.anInt2248 = 128;
					}
					if (Static81.anInt2248 > 383) {
						Static81.anInt2248 = 383;
					}
				}
			}
		}
		local159 = Static59.anInt1807;
		@Pc(219) int local219 = Static7.anInt187;
		if (arg0 <= local159 && arg1 + arg0 > local159 && local219 >= arg2 && arg3 + arg2 > local219) {
			Static84.anInt2330 = Static59.anInt1807 - arg0;
			Static84.anInt2328 = Static7.anInt187 - arg2;
			Static84.anInt2331 = 0;
			Static84.aBoolean131 = true;
		} else {
			Static84.aBoolean131 = false;
			Static84.anInt2331 = 0;
		}
		Static65.method1267();
		Static77.method2214(arg0, arg2, arg1, arg3, 0);
		Static65.method1267();
		Static62.aClass69_1.method2037(Static10.anInt282, Static79.anInt2157, Static54.anInt1624, Static81.anInt2248, Static32.anInt1052, local39);
		Static65.method1267();
		Static62.aClass69_1.method2056();
		Static13.method220(arg0, arg2, arg1, arg3);
		Static14.method241(arg0, arg2);
		((Class34) Static127.anInterface2_1).method1104(Static42.anInt1304);
		Static39.method772(arg1, arg0, arg2, arg3);
		Static54.anInt1624 = local111;
		Static32.anInt1052 = local115;
		Static81.anInt2248 = local107;
		Static79.anInt2157 = local113;
		Static10.anInt282 = local58;
		if (Static55.aBoolean88 && Static25.method2157() == 0) {
			Static55.aBoolean88 = false;
		}
		if (Static55.aBoolean88) {
			Static77.method2214(arg0, arg2, arg1, arg3, 0);
			Static30.method555(false, Static11.aClass26_167);
		}
		if (!Static55.aBoolean88 && !Static109.aBoolean162 && arg0 <= local159 && local159 < arg1 + arg0 && local219 >= arg2 && local219 < arg3 + arg2) {
			Static25.method2163(arg2, local219, arg0, local159);
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IBI[B)Lclient!he;")
	public static Class26 method1896(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(9) Class26 local9 = new Class26();
		local9.aByteArray7 = new byte[arg0];
		local9.anInt1345 = 0;
		for (@Pc(18) int local18 = arg1; local18 < arg0 + arg1; local18++) {
			if (arg2[local18] != 0) {
				local9.aByteArray7[local9.anInt1345++] = arg2[local18];
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!he;ZILclient!he;Lclient!he;)V")
	public static void method1897(@OriginalArg(0) Class26 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class26 arg2, @OriginalArg(4) Class26 arg3) {
		for (@Pc(12) int local12 = 99; local12 > 0; local12--) {
			Static29.anIntArray101[local12] = Static29.anIntArray101[local12 - 1];
			Static23.aClass26Array10[local12] = Static23.aClass26Array10[local12 - 1];
			Static13.aClass26Array6[local12] = Static13.aClass26Array6[local12 - 1];
			Static63.aClass26Array16[local12] = Static63.aClass26Array16[local12 - 1];
		}
		Static29.anIntArray101[0] = arg1;
		Static23.aClass26Array10[0] = arg0;
		Static13.aClass26Array6[0] = arg3;
		Static63.aClass26Array16[0] = arg2;
		Static110.anInt2935 = Static71.anInt2023;
		Static130.anInt3259++;
	}
}
