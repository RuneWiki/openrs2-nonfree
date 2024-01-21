import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!td", name = "f", descriptor = "I")
	public static int anInt2962;

	@OriginalMember(owner = "client!td", name = "i", descriptor = "[I")
	public static int[] anIntArray206;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1366 = Static193.method3027("flash1:");

	@OriginalMember(owner = "client!td", name = "b", descriptor = "I")
	public static int anInt2960 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!td", name = "c", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1367 = Static193.method3027("level)2");

	@OriginalMember(owner = "client!td", name = "d", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1368 = Static193.method3027("Error connecting to server)3");

	@OriginalMember(owner = "client!td", name = "g", descriptor = "[J")
	public static final long[] aLongArray6 = new long[100];

	@OriginalMember(owner = "client!td", name = "h", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1369 = aClass70_1367;

	@OriginalMember(owner = "client!td", name = "m", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1370 = aClass70_1366;

	@OriginalMember(owner = "client!td", name = "n", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1371 = aClass70_1368;

	@OriginalMember(owner = "client!td", name = "o", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1372 = aClass70_1366;

	@OriginalMember(owner = "client!td", name = "p", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1373 = Static193.method3027("scape main");

	@OriginalMember(owner = "client!td", name = "q", descriptor = "[I")
	public static final int[] anIntArray207 = new int[4000];

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
	public static void method2097() {
		if (Static139.anInt4131 > 1) {
			Static139.anInt4131--;
		}
		if (Static193.anInt3931 > 0) {
			Static193.anInt3931--;
		}
		if (Static9.aBoolean14) {
			Static9.aBoolean14 = false;
			Static117.method1690();
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < 100 && Static69.method1010(); local29++) {
		}
		if (Static15.anInt351 != 30) {
			return;
		}
		Static72.method1037(Static93.aClass3_Sub4_Sub1_18);
		@Pc(53) Object local53 = Static34.aClass46_1.anObject4;
		@Pc(85) int local85;
		@Pc(82) int local82;
		@Pc(87) int local87;
		@Pc(103) int local103;
		@Pc(108) int local108;
		synchronized (Static34.aClass46_1.anObject4) {
			if (!Static97.aBoolean105) {
				Static34.aClass46_1.anInt1967 = 0;
			} else if (Static15.anInt343 != 0 || Static34.aClass46_1.anInt1967 >= 40) {
				Static93.aClass3_Sub4_Sub1_18.method1298(37);
				Static93.aClass3_Sub4_Sub1_18.method1239(0);
				local82 = 0;
				local85 = Static93.aClass3_Sub4_Sub1_18.anInt1758;
				for (local87 = 0; local87 < Static34.aClass46_1.anInt1967 && Static93.aClass3_Sub4_Sub1_18.anInt1758 - local85 < 240; local87++) {
					local103 = Static34.aClass46_1.anIntArray110[local87];
					local108 = Static34.aClass46_1.anIntArray109[local87];
					local82++;
					if (local108 < 0) {
						local108 = 0;
					} else if (local108 > 764) {
						local108 = 764;
					}
					if (local103 < 0) {
						local103 = 0;
					} else if (local103 > 502) {
						local103 = 502;
					}
					@Pc(146) int local146 = local103 * 765 + local108;
					if (Static34.aClass46_1.anIntArray110[local87] == -1 && Static34.aClass46_1.anIntArray109[local87] == -1) {
						local103 = -1;
						local146 = 524287;
						local108 = -1;
					}
					if (Static27.anInt571 != local108 || local103 != Static17.anInt368) {
						@Pc(187) int local187 = local108 - Static27.anInt571;
						Static27.anInt571 = local108;
						@Pc(194) int local194 = local103 - Static17.anInt368;
						Static17.anInt368 = local103;
						if (Static25.anInt537 < 8 && local187 >= -32 && local187 <= 31 && local194 >= -32 && local194 <= 31) {
							local194 += 32;
							local187 += 32;
							Static93.aClass3_Sub4_Sub1_18.method1252(local194 + (local187 << 6) + (Static25.anInt537 << 12));
							Static25.anInt537 = 0;
						} else if (Static25.anInt537 < 8) {
							Static93.aClass3_Sub4_Sub1_18.method1276((Static25.anInt537 << 19) + local146 + 8388608);
							Static25.anInt537 = 0;
						} else {
							Static93.aClass3_Sub4_Sub1_18.method1285((Static25.anInt537 << 19) + local146 - 1073741824);
							Static25.anInt537 = 0;
						}
					} else if (Static25.anInt537 < 2047) {
						Static25.anInt537++;
					}
				}
				Static93.aClass3_Sub4_Sub1_18.method1265(Static93.aClass3_Sub4_Sub1_18.anInt1758 - local85);
				if (local82 >= Static34.aClass46_1.anInt1967) {
					Static34.aClass46_1.anInt1967 = 0;
				} else {
					Static34.aClass46_1.anInt1967 -= local82;
					for (local103 = 0; local103 < Static34.aClass46_1.anInt1967; local103++) {
						Static34.aClass46_1.anIntArray109[local103] = Static34.aClass46_1.anIntArray109[local103 + local82];
						Static34.aClass46_1.anIntArray110[local103] = Static34.aClass46_1.anIntArray110[local103 + local82];
					}
				}
			}
		}
		if (Static15.anInt343 != 0) {
			local85 = Static96.anInt2006;
			if (local85 < 0) {
				local85 = 0;
			} else if (local85 > 502) {
				local85 = 502;
			}
			local82 = Static124.anInt3874;
			@Pc(369) byte local369 = 0;
			if (Static15.anInt343 == 2) {
				local369 = 1;
			}
			if (local82 < 0) {
				local82 = 0;
			} else if (local82 > 764) {
				local82 = 764;
			}
			@Pc(397) long local397 = (Static88.aLong55 - Static129.aLong76) / 50L;
			Static129.aLong76 = Static88.aLong55;
			Static93.aClass3_Sub4_Sub1_18.method1298(59);
			if (local397 > 4095L) {
				local397 = 4095L;
			}
			local87 = local85 * 765 + local82;
			local108 = (int) local397;
			Static93.aClass3_Sub4_Sub1_18.method1285((local108 << 20) - (-(local369 << 19) - local87));
		}
		if (Static81.aBooleanArray4[96] || Static81.aBooleanArray4[97] || Static81.aBooleanArray4[98] || Static81.aBooleanArray4[99]) {
			Static8.aBoolean10 = true;
		}
		if (Static21.anInt401 > 0) {
			Static21.anInt401--;
		}
		if (Static8.aBoolean10 && Static21.anInt401 <= 0) {
			Static8.aBoolean10 = false;
			Static21.anInt401 = 20;
			Static93.aClass3_Sub4_Sub1_18.method1298(28);
			Static93.aClass3_Sub4_Sub1_18.method1273(Static179.anInt1329);
			Static93.aClass3_Sub4_Sub1_18.method1289(Static97.anInt2019);
		}
		if (Static68.aBoolean84 && !Static199.aBoolean183) {
			Static199.aBoolean183 = true;
			Static93.aClass3_Sub4_Sub1_18.method1298(195);
			Static93.aClass3_Sub4_Sub1_18.method1239(1);
		}
		if (!Static68.aBoolean84 && Static199.aBoolean183) {
			Static199.aBoolean183 = false;
			Static93.aClass3_Sub4_Sub1_18.method1298(195);
			Static93.aClass3_Sub4_Sub1_18.method1239(0);
		}
		Static123.method1755();
		if (Static15.anInt351 != 30) {
			return;
		}
		Static34.method599();
		Static193.method3028();
		Static82.anInt1626++;
		if (Static82.anInt1626 > 750) {
			Static117.method1690();
			return;
		}
		Static60.method2388();
		Static96.method1398();
		Static129.method1824();
		if (Static58.aClass6_35 != null) {
			Static138.method1973();
		}
		if (Static108.anInt2201 != 0) {
			Static191.anInt3883 += 20;
			if (Static191.anInt3883 >= 400) {
				Static108.anInt2201 = 0;
			}
		}
		Static211.anInt4246++;
		if (Static145.aClass6_75 != null) {
			Static120.anInt2431++;
			if (Static120.anInt2431 >= 15) {
				Static9.method237(Static145.aClass6_75);
				Static145.aClass6_75 = null;
			}
		}
		@Pc(687) Class6 local687;
		if (Static55.aClass6_32 != null) {
			Static9.method237(Static55.aClass6_32);
			Static149.anInt3040++;
			if (Static8.anInt187 > Static209.anInt4238 + 5 || Static8.anInt187 < Static209.anInt4238 - 5 || Static167.anInt3403 > Static127.anInt2501 + 5 || Static167.anInt3403 < Static127.anInt2501 - 5) {
				Static58.aBoolean76 = true;
			}
			if (Static202.anInt4135 == 0) {
				if (Static58.aBoolean76 && Static149.anInt3040 >= 5) {
					if (Static55.aClass6_32 == Static57.aClass6_34 && Static175.anInt3539 != Static23.anInt456) {
						local687 = Static55.aClass6_32;
						@Pc(693) byte local693 = 0;
						if (Static132.anInt2573 == 1 && local687.anInt274 == 206) {
							local693 = 1;
						}
						if (local687.anIntArray15[Static175.anInt3539] <= 0) {
							local693 = 0;
						}
						if (Static136.method1947(Static157.method2365(local687))) {
							local85 = Static23.anInt456;
							local82 = Static175.anInt3539;
							local687.anIntArray15[local82] = local687.anIntArray15[local85];
							local687.anIntArray9[local82] = local687.anIntArray9[local85];
							local687.anIntArray15[local85] = -1;
							local687.anIntArray9[local85] = 0;
						} else if (local693 == 1) {
							local85 = Static23.anInt456;
							local82 = Static175.anInt3539;
							while (local82 != local85) {
								if (local82 < local85) {
									local687.method236(local85 - 1, local85);
									local85--;
								} else if (local82 > local85) {
									local687.method236(local85 + 1, local85);
									local85++;
								}
							}
						} else {
							local687.method236(Static175.anInt3539, Static23.anInt456);
						}
						Static93.aClass3_Sub4_Sub1_18.method1298(219);
						Static93.aClass3_Sub4_Sub1_18.method1264(Static175.anInt3539);
						Static93.aClass3_Sub4_Sub1_18.method1292(local693);
						Static93.aClass3_Sub4_Sub1_18.method1252(Static23.anInt456);
						Static93.aClass3_Sub4_Sub1_18.method1275(Static55.aClass6_32.anInt229);
					}
				} else if ((Static75.anInt1476 == 1 || Static17.method308(Static35.anInt770 - 1)) && Static35.anInt770 > 2) {
					Static153.method2268();
				} else if (Static35.anInt770 > 0) {
					Static56.method887(Static35.anInt770 - 1);
				}
				Static15.anInt343 = 0;
				Static120.anInt2431 = 10;
				Static55.aClass6_32 = null;
			}
		}
		Static47.aBoolean55 = false;
		Static86.aBoolean94 = false;
		@Pc(835) Class6 local835 = Static191.aClass6_105;
		Static138.anInt2823 = 0;
		Static191.aClass6_105 = null;
		Static98.aClass6_55 = null;
		local687 = Static85.aClass6_51;
		Static85.aClass6_51 = null;
		while (Static138.method1981() && Static138.anInt2823 < 128) {
			Static23.anIntArray33[Static138.anInt2823] = Static175.anInt3547;
			Static5.anIntArray2[Static138.anInt2823] = Static38.anInt824;
			Static138.anInt2823++;
		}
		Static58.aClass6_35 = null;
		if (Static63.anInt1331 != -1) {
			Static108.method1562(Static63.anInt1331, 0, Static41.anInt876, 0, 0, 0, Static203.anInt4148);
		}
		Static86.anInt1703++;
		while (true) {
			@Pc(890) Class3_Sub26 local890;
			@Pc(906) Class6 local906;
			@Pc(895) Class6 local895;
			do {
				local890 = (Class3_Sub26) Static174.aClass10_97.method270();
				if (local890 == null) {
					while (true) {
						do {
							local890 = (Class3_Sub26) Static208.aClass10_70.method270();
							if (local890 == null) {
								while (true) {
									do {
										local890 = (Class3_Sub26) Static109.aClass10_63.method270();
										if (local890 == null) {
											if (Static197.aBoolean180 && Static58.aClass6_35 == null) {
												Static197.aBoolean180 = false;
											}
											if (Static154.aClass6_83 != null) {
												Static91.method1316();
											}
											if (Static193.anInt3928 != -1) {
												local85 = Static193.anInt3928;
												local82 = Static182.anInt3733;
												@Pc(1067) boolean local1067 = Static103.method1467(true, 0, Static144.aClass26_Sub2_Sub1_1.anIntArray182[0], 0, 0, 0, local82, local85, 0, 0, Static144.aClass26_Sub2_Sub1_1.anIntArray185[0]);
												Static193.anInt3928 = -1;
												if (local1067) {
													Static191.anInt3883 = 0;
													Static108.anInt2201 = 1;
													Static27.anInt572 = Static124.anInt3874;
													Static31.anInt714 = Static96.anInt2006;
												}
											}
											Static40.method672();
											if (local687 != Static85.aClass6_51) {
												if (local687 != null) {
													Static9.method237(local687);
												}
												if (Static85.aClass6_51 != null) {
													Static9.method237(Static85.aClass6_51);
												}
											}
											if (local835 != Static191.aClass6_105 && Static96.anInt2009 == Static95.anInt1979) {
												if (local835 != null) {
													Static9.method237(local835);
												}
												if (Static191.aClass6_105 != null) {
													Static9.method237(Static191.aClass6_105);
												}
											}
											if (Static191.aClass6_105 == null) {
												if (Static96.anInt2009 > 0) {
													Static96.anInt2009--;
												}
											} else if (Static95.anInt1979 > Static96.anInt2009) {
												Static96.anInt2009++;
												if (Static96.anInt2009 == Static95.anInt1979) {
													Static9.method237(Static191.aClass6_105);
												}
											}
											Static201.method3204();
											if (Static192.aBoolean174) {
												Static90.method1304();
											}
											for (local85 = 0; local85 < 5; local85++) {
												@Pc(1155) int local1155 = Static122.anIntArray147[local85]++;
											}
											local82 = Static26.method472();
											local87 = Static160.method2412();
											if (local82 > 4500 && local87 > 4500) {
												Static193.anInt3931 = 250;
												Static184.method2899(4000);
												Static93.aClass3_Sub4_Sub1_18.method1298(253);
											}
											Static116.anInt3346++;
											Static138.anInt2827++;
											Static117.anInt2374++;
											if (Static117.anInt2374 > 500) {
												local103 = (int) (Math.random() * 8.0D);
												if ((local103 & 0x1) == 1) {
													Static105.anInt2111 += Static97.anInt2012;
												}
												Static117.anInt2374 = 0;
												if ((local103 & 0x4) == 4) {
													Static124.anInt3872 += Static133.anInt2653;
												}
												if ((local103 & 0x2) == 2) {
													Static198.anInt4041 += Static193.anInt3927;
												}
											}
											if (Static124.anInt3872 < -40) {
												Static133.anInt2653 = 1;
											}
											if (Static105.anInt2111 < -50) {
												Static97.anInt2012 = 2;
											}
											if (Static198.anInt4041 < -55) {
												Static193.anInt3927 = 2;
											}
											if (Static124.anInt3872 > 40) {
												Static133.anInt2653 = -1;
											}
											if (Static138.anInt2827 > 500) {
												Static138.anInt2827 = 0;
												local103 = (int) (Math.random() * 8.0D);
												if ((local103 & 0x1) == 1) {
													Static62.anInt1310 += Static85.anInt1695;
												}
												if ((local103 & 0x2) == 2) {
													Static212.anInt4284 += Static209.anInt4233;
												}
											}
											if (Static212.anInt4284 < -20) {
												Static209.anInt4233 = 1;
											}
											if (Static105.anInt2111 > 50) {
												Static97.anInt2012 = -2;
											}
											if (Static198.anInt4041 > 55) {
												Static193.anInt3927 = -2;
											}
											if (Static212.anInt4284 > 10) {
												Static209.anInt4233 = -1;
											}
											if (Static62.anInt1310 < -60) {
												Static85.anInt1695 = 2;
											}
											if (Static62.anInt1310 > 60) {
												Static85.anInt1695 = -2;
											}
											if (Static116.anInt3346 > 50) {
												Static93.aClass3_Sub4_Sub1_18.method1298(2);
											}
											try {
												if (Static148.aClass33_2 != null && Static93.aClass3_Sub4_Sub1_18.anInt1758 > 0) {
													Static148.aClass33_2.method924(Static93.aClass3_Sub4_Sub1_18.anInt1758, Static93.aClass3_Sub4_Sub1_18.aByteArray12);
													Static116.anInt3346 = 0;
													Static93.aClass3_Sub4_Sub1_18.anInt1758 = 0;
													return;
												}
												return;
											} catch (@Pc(1378) IOException local1378) {
												Static117.method1690();
												return;
											}
										}
										local895 = local890.aClass6_116;
										if (local895.anInt261 < 0) {
											break;
										}
										local906 = Static146.method2127(local895.anInt198);
									} while (local906 == null || local906.aClass6Array1 == null || local906.aClass6Array1.length <= local895.anInt261 || local895 != local906.aClass6Array1[local895.anInt261]);
									Static185.method2901(local890);
								}
							}
							local895 = local890.aClass6_116;
							if (local895.anInt261 < 0) {
								break;
							}
							local906 = Static146.method2127(local895.anInt198);
						} while (local906 == null || local906.aClass6Array1 == null || local895.anInt261 >= local906.aClass6Array1.length || local906.aClass6Array1[local895.anInt261] != local895);
						Static185.method2901(local890);
					}
				}
				local895 = local890.aClass6_116;
				if (local895.anInt261 < 0) {
					break;
				}
				local906 = Static146.method2127(local895.anInt198);
			} while (local906 == null || local906.aClass6Array1 == null || local906.aClass6Array1.length <= local895.anInt261 || local895 != local906.aClass6Array1[local895.anInt261]);
			Static185.method2901(local890);
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2098(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 == arg2) {
			Static3.method22(arg2, arg4, arg5, arg0, arg1, arg6);
		} else if (arg4 - arg2 >= Static119.anInt2428 && arg2 + arg4 <= Static200.anInt4074 && Static26.anInt554 <= arg6 - arg3 && arg3 + arg6 <= Static52.anInt1117) {
			Static118.method1707(arg2, arg6, arg5, arg0, arg3, arg4, arg1);
		} else {
			Static9.method230(arg3, arg5, arg6, arg2, arg4, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILclient!b;I)I")
	public static int method2099(@OriginalArg(0) int arg0, @OriginalArg(1) Class6 arg1) {
		if (arg1.anIntArrayArray4 == null || arg0 >= arg1.anIntArrayArray4.length) {
			return -2;
		}
		try {
			@Pc(18) int[] local18 = arg1.anIntArrayArray4[arg0];
			@Pc(20) int local20 = 0;
			@Pc(27) byte local27 = 0;
			@Pc(29) int local29 = 0;
			while (true) {
				@Pc(34) int local34 = local18[local29++];
				@Pc(36) byte local36 = 0;
				@Pc(38) int local38 = 0;
				if (local34 == 0) {
					return local20;
				}
				if (local34 == 15) {
					local36 = 1;
				}
				if (local34 == 1) {
					local38 = Static111.anIntArray138[local18[local29++]];
				}
				if (local34 == 2) {
					local38 = Static149.anIntArray220[local18[local29++]];
				}
				if (local34 == 16) {
					local36 = 2;
				}
				if (local34 == 17) {
					local36 = 3;
				}
				if (local34 == 3) {
					local38 = Static11.anIntArray24[local18[local29++]];
				}
				@Pc(102) int local102;
				@Pc(113) Class6 local113;
				@Pc(118) int local118;
				@Pc(130) int local130;
				if (local34 == 4) {
					local102 = local18[local29++] << 16;
					@Pc(109) int local109 = local102 + local18[local29++];
					local113 = Static146.method2127(local109);
					local118 = local18[local29++];
					if (local118 != -1 && (!Static14.method275(local118).aBoolean72 || Static4.aBoolean5)) {
						for (local130 = 0; local130 < local113.anIntArray15.length; local130++) {
							if (local118 + 1 == local113.anIntArray15[local130]) {
								local38 += local113.anIntArray9[local130];
							}
						}
					}
				}
				if (local34 == 5) {
					local38 = Static16.anIntArray27[local18[local29++]];
				}
				if (local34 == 6) {
					local38 = Class30_Sub1.anIntArray64[Static149.anIntArray220[local18[local29++]] - 1];
				}
				if (local34 == 7) {
					local38 = Static16.anIntArray27[local18[local29++]] * 100 / 46875;
				}
				if (local34 == 8) {
					local38 = Static144.aClass26_Sub2_Sub1_1.anInt1947;
				}
				if (local34 == 9) {
					for (local102 = 0; local102 < 25; local102++) {
						if (Static113.aBooleanArray11[local102]) {
							local38 += Static149.anIntArray220[local102];
						}
					}
				}
				if (local34 == 10) {
					local102 = local18[local29++] << 16;
					local102 += local18[local29++];
					local113 = Static146.method2127(local102);
					local118 = local18[local29++];
					if (local118 != -1 && (!Static14.method275(local118).aBoolean72 || Static4.aBoolean5)) {
						for (local130 = 0; local130 < local113.anIntArray15.length; local130++) {
							if (local118 + 1 == local113.anIntArray15[local130]) {
								local38 = 999999999;
								break;
							}
						}
					}
				}
				if (local34 == 11) {
					local38 = Static141.anInt2856;
				}
				if (local34 == 12) {
					local38 = Static116.anInt3345;
				}
				if (local34 == 13) {
					local102 = Static16.anIntArray27[local18[local29++]];
					@Pc(311) int local311 = local18[local29++];
					local38 = (0x1 << local311 & local102) == 0 ? 0 : 1;
				}
				if (local34 == 14) {
					local102 = local18[local29++];
					local38 = Static160.method2409(local102);
				}
				if (local34 == 18) {
					local38 = (Static144.aClass26_Sub2_Sub1_1.anInt2593 >> 7) + Static30.anInt695;
				}
				if (local34 == 19) {
					local38 = Static55.anInt1184 + (Static144.aClass26_Sub2_Sub1_1.anInt2611 >> 7);
				}
				if (local34 == 20) {
					local38 = local18[local29++];
				}
				if (local36 == 0) {
					if (local27 == 0) {
						local20 += local38;
					}
					if (local27 == 1) {
						local20 -= local38;
					}
					if (local27 == 2 && local38 != 0) {
						local20 /= local38;
					}
					if (local27 == 3) {
						local20 *= local38;
					}
					local27 = 0;
				} else {
					local27 = local36;
				}
			}
		} catch (@Pc(421) Exception local421) {
			return -1;
		}
	}
}
