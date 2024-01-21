import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "J")
	public static long aLong153;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "[S")
	public static short[] aShortArray49 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
	public static int anInt3895 = 0;

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "I")
	private static int anInt3896 = 2;

	@OriginalMember(owner = "client!vh", name = "f", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1717 = Static32.method683("OFF");

	@OriginalMember(owner = "client!vh", name = "g", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1718 = aClass49_1717;

	@OriginalMember(owner = "client!vh", name = "h", descriptor = "[[[Lclient!tf;")
	public static Class81[][][] aClass81ArrayArrayArray1 = new Class81[4][104][104];

	@OriginalMember(owner = "client!vh", name = "i", descriptor = "[I")
	public static int[] anIntArray362 = new int[500];

	@OriginalMember(owner = "client!vh", name = "j", descriptor = "[I")
	public static int[] anIntArray363 = new int[128];

	@OriginalMember(owner = "client!vh", name = "l", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1719 = Static32.method683("zur-Uck auf die RuneScape)2Webseite gehen");

	@OriginalMember(owner = "client!vh", name = "m", descriptor = "Lclient!ua;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(B[BII)I")
	public static int method2900(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = -1;
		for (@Pc(9) int local9 = arg2; local9 < arg1; local9++) {
			local3 = local3 >>> 8 ^ Class75.anIntArray283[(arg0[local9] ^ local3) & 0xFF];
		}
		return ~local3;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
	public static void method2901() {
		if (Static28.anInt626 > 1) {
			Static28.anInt626--;
		}
		if (Static12.anInt220 > 0) {
			Static12.anInt220--;
		}
		if (Static3.aBoolean4) {
			Static3.aBoolean4 = false;
			Static48.method881();
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < 100 && Static159.method2680(); local32++) {
		}
		if (Static95.anInt2009 != 30) {
			return;
		}
		Static28.method507(Static176.aClass2_Sub13_Sub1_14);
		@Pc(60) Object local60 = Static82.aClass72_1.anObject3;
		@Pc(92) int local92;
		@Pc(94) int local94;
		@Pc(96) int local96;
		@Pc(112) int local112;
		@Pc(118) int local118;
		synchronized (Static82.aClass72_1.anObject3) {
			if (!Static157.aBoolean146) {
				Static82.aClass72_1.anInt2941 = 0;
			} else if (Static63.anInt1351 != 0 || Static82.aClass72_1.anInt2941 >= 40) {
				Static176.aClass2_Sub13_Sub1_14.method2976(210);
				Static176.aClass2_Sub13_Sub1_14.method2932(0);
				local92 = Static176.aClass2_Sub13_Sub1_14.anInt3940;
				local94 = 0;
				for (local96 = 0; local96 < Static82.aClass72_1.anInt2941 && Static176.aClass2_Sub13_Sub1_14.anInt3940 - local92 < 240; local96++) {
					local112 = Static82.aClass72_1.anIntArray278[local96];
					local94++;
					local118 = Static82.aClass72_1.anIntArray279[local96];
					if (local118 < 0) {
						local118 = 0;
					} else if (local118 > 764) {
						local118 = 764;
					}
					if (local112 < 0) {
						local112 = 0;
					} else if (local112 > 502) {
						local112 = 502;
					}
					@Pc(148) int local148 = local112 * 765 + local118;
					if (Static82.aClass72_1.anIntArray278[local96] == -1 && Static82.aClass72_1.anIntArray279[local96] == -1) {
						local148 = 524287;
						local118 = -1;
						local112 = -1;
					}
					if (local118 != Static61.anInt1318 || local112 != Static83.anInt1775) {
						@Pc(194) int local194 = local118 - Static61.anInt1318;
						@Pc(199) int local199 = local112 - Static83.anInt1775;
						Static83.anInt1775 = local112;
						Static61.anInt1318 = local118;
						if (Static86.anInt3521 < 8 && local194 >= -32 && local194 <= 31 && local199 >= -32 && local199 <= 31) {
							local194 += 32;
							local199 += 32;
							Static176.aClass2_Sub13_Sub1_14.method2921(local199 + (local194 << 6) + (Static86.anInt3521 << 12));
							Static86.anInt3521 = 0;
						} else if (Static86.anInt3521 < 8) {
							Static176.aClass2_Sub13_Sub1_14.method2913((Static86.anInt3521 << 19) + local148 + 8388608);
							Static86.anInt3521 = 0;
						} else {
							Static176.aClass2_Sub13_Sub1_14.method2952((Static86.anInt3521 << 19) + local148 - 1073741824);
							Static86.anInt3521 = 0;
						}
					} else if (Static86.anInt3521 < 2047) {
						Static86.anInt3521++;
					}
				}
				Static176.aClass2_Sub13_Sub1_14.method2929(Static176.aClass2_Sub13_Sub1_14.anInt3940 - local92);
				if (Static82.aClass72_1.anInt2941 <= local94) {
					Static82.aClass72_1.anInt2941 = 0;
				} else {
					Static82.aClass72_1.anInt2941 -= local94;
					for (local112 = 0; local112 < Static82.aClass72_1.anInt2941; local112++) {
						Static82.aClass72_1.anIntArray279[local112] = Static82.aClass72_1.anIntArray279[local112 + local94];
						Static82.aClass72_1.anIntArray278[local112] = Static82.aClass72_1.anIntArray278[local112 + local94];
					}
				}
			}
		}
		if (Static63.anInt1351 != 0) {
			@Pc(358) long local358 = (Static40.aLong40 - Static12.aLong15) / 50L;
			Static12.aLong15 = Static40.aLong40;
			local92 = Static61.anInt1320;
			if (local92 < 0) {
				local92 = 0;
			} else if (local92 > 502) {
				local92 = 502;
			}
			if (local358 > 4095L) {
				local358 = 4095L;
			}
			local94 = Static114.anInt2394;
			local118 = (int) local358;
			if (local94 < 0) {
				local94 = 0;
			} else if (local94 > 764) {
				local94 = 764;
			}
			local96 = local92 * 765 + local94;
			@Pc(406) byte local406 = 0;
			if (Static63.anInt1351 == 2) {
				local406 = 1;
			}
			Static176.aClass2_Sub13_Sub1_14.method2976(242);
			Static176.aClass2_Sub13_Sub1_14.method2968((local406 << 19) + ((local118 << 20) + local96));
		}
		if (Static68.aBooleanArray10[96] || Static68.aBooleanArray10[97] || Static68.aBooleanArray10[98] || Static68.aBooleanArray10[99]) {
			Static163.aBoolean27 = true;
		}
		if (Static141.anInt3010 > 0) {
			Static141.anInt3010--;
		}
		if (Static163.aBoolean27 && Static141.anInt3010 <= 0) {
			Static163.aBoolean27 = false;
			Static141.anInt3010 = 20;
			Static176.aClass2_Sub13_Sub1_14.method2976(230);
			Static176.aClass2_Sub13_Sub1_14.method2938(Static126.anInt2750);
			Static176.aClass2_Sub13_Sub1_14.method2964(Static63.anInt1356);
		}
		if (Static181.aBoolean173 && !Static99.aBoolean88) {
			Static99.aBoolean88 = true;
			Static176.aClass2_Sub13_Sub1_14.method2976(143);
			Static176.aClass2_Sub13_Sub1_14.method2932(1);
		}
		if (!Static181.aBoolean173 && Static99.aBoolean88) {
			Static99.aBoolean88 = false;
			Static176.aClass2_Sub13_Sub1_14.method2976(143);
			Static176.aClass2_Sub13_Sub1_14.method2932(0);
		}
		Static46.method839();
		if (Static95.anInt2009 != 30) {
			return;
		}
		Static101.method1741();
		Static12.method183();
		Static102.anInt2167++;
		if (Static102.anInt2167 > 750) {
			Static48.method881();
			return;
		}
		Static66.method1122();
		Static29.method544();
		Static21.method397();
		if (Static175.anInt3819 != 0) {
			Static82.anInt1768 += 20;
			if (Static82.anInt1768 >= 400) {
				Static175.anInt3819 = 0;
			}
		}
		Static170.anInt3724++;
		if (Static94.aClass85_7 != null) {
			Static162.anInt3604++;
			if (Static162.anInt3604 >= 15) {
				Static102.method1756(Static94.aClass85_7);
				Static94.aClass85_7 = null;
			}
		}
		@Pc(651) Class85 local651;
		if (Static154.aClass85_13 != null) {
			Static102.method1756(Static154.aClass85_13);
			Static146.anInt3093++;
			if (Static57.anInt1208 + 5 < Static20.anInt449 || Static20.anInt449 < Static57.anInt1208 - 5 || Static96.anInt2022 > Static37.anInt941 + 5 || Static96.anInt2022 < Static37.anInt941 - 5) {
				Static111.aBoolean100 = true;
			}
			if (Static182.anInt4058 == 0) {
				if (Static111.aBoolean100 && Static146.anInt3093 >= 5) {
					if (Static6.aClass85_1 == Static154.aClass85_13 && Static141.anInt3004 != Static9.anInt165) {
						local651 = Static154.aClass85_13;
						@Pc(653) byte local653 = 0;
						if (Static12.anInt224 == 1 && local651.anInt3876 == 206) {
							local653 = 1;
						}
						if (local651.anIntArray358[Static141.anInt3004] <= 0) {
							local653 = 0;
						}
						if (Static140.method2336(Static111.method1895(local651))) {
							local92 = Static9.anInt165;
							local94 = Static141.anInt3004;
							local651.anIntArray358[local94] = local651.anIntArray358[local92];
							local651.anIntArray357[local94] = local651.anIntArray357[local92];
							local651.anIntArray358[local92] = -1;
							local651.anIntArray357[local92] = 0;
						} else if (local653 == 1) {
							local94 = Static141.anInt3004;
							local92 = Static9.anInt165;
							while (local94 != local92) {
								if (local92 > local94) {
									local651.method2891(local92, local92 - 1);
									local92--;
								} else if (local92 < local94) {
									local651.method2891(local92, local92 + 1);
									local92++;
								}
							}
						} else {
							local651.method2891(Static9.anInt165, Static141.anInt3004);
						}
						Static176.aClass2_Sub13_Sub1_14.method2976(10);
						Static176.aClass2_Sub13_Sub1_14.method2920(Static154.aClass85_13.anInt3849);
						Static176.aClass2_Sub13_Sub1_14.method2967(Static141.anInt3004);
						Static176.aClass2_Sub13_Sub1_14.method2951(local653);
						Static176.aClass2_Sub13_Sub1_14.method2938(Static9.anInt165);
					}
				} else if ((Static111.anInt2307 == 1 || Static26.method476(Static133.anInt3713 - 1)) && Static133.anInt3713 > 2) {
					Static112.method1902();
				} else if (Static133.anInt3713 > 0) {
					Static6.method105(Static133.anInt3713 - 1);
				}
				Static162.anInt3604 = 10;
				Static154.aClass85_13 = null;
				Static63.anInt1351 = 0;
			}
		}
		Static44.aClass85_9 = null;
		local651 = Static184.aClass85_16;
		Static25.aBoolean20 = false;
		Static48.aBoolean42 = false;
		Static184.aClass85_16 = null;
		@Pc(832) Class85 local832 = Static84.aClass85_6;
		Static84.aClass85_6 = null;
		for (Static44.anInt2154 = 0; Static92.method1585() && Static44.anInt2154 < 128; Static44.anInt2154++) {
			Static23.anIntArray44[Static44.anInt2154] = Static180.anInt3987;
			anIntArray363[Static44.anInt2154] = Static72.anInt1492;
		}
		if (Static3.anInt57 != -1) {
			Static92.method1582(0, 503, 0, 0, 765, 0, Static3.anInt57);
		}
		Static69.anInt1431++;
		while (true) {
			@Pc(880) Class2_Sub12 local880;
			@Pc(896) Class85 local896;
			@Pc(885) Class85 local885;
			do {
				local880 = (Class2_Sub12) Static96.aClass81_7.method2681();
				if (local880 == null) {
					while (true) {
						do {
							local880 = (Class2_Sub12) Static185.aClass81_16.method2681();
							if (local880 == null) {
								while (true) {
									do {
										local880 = (Class2_Sub12) Static155.aClass81_13.method2681();
										if (local880 == null) {
											if (Static160.aClass85_14 != null) {
												Static71.method1183();
											}
											if (Static8.anInt2220 != -1) {
												local92 = Static8.anInt2220;
												local94 = Static29.anInt698;
												@Pc(1048) boolean local1048 = Static51.method905(0, 0, local92, 0, 0, Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray318[0], Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray316[0], true, local94, 0, 0);
												Static8.anInt2220 = -1;
												if (local1048) {
													Static82.anInt1768 = 0;
													Static129.anInt2804 = Static61.anInt1320;
													Static55.anInt1205 = Static114.anInt2394;
													Static175.anInt3819 = 1;
												}
											}
											Static21.method395();
											if (Static184.aClass85_16 != local651) {
												if (local651 != null) {
													Static102.method1756(local651);
												}
												if (Static184.aClass85_16 != null) {
													Static102.method1756(Static184.aClass85_16);
												}
											}
											if (Static84.aClass85_6 != local832 && Static163.anInt693 == Static154.anInt3327) {
												if (local832 != null) {
													Static102.method1756(local832);
												}
												if (Static84.aClass85_6 != null) {
													Static102.method1756(Static84.aClass85_6);
												}
											}
											if (Static84.aClass85_6 == null) {
												if (Static163.anInt693 > 0) {
													Static163.anInt693--;
												}
											} else if (Static154.anInt3327 > Static163.anInt693) {
												Static163.anInt693++;
												if (Static163.anInt693 == Static154.anInt3327) {
													Static102.method1756(Static84.aClass85_6);
												}
											}
											Static140.method2335();
											if (Static96.aBoolean84) {
												Static149.method2451();
											}
											for (local92 = 0; local92 < 5; local92++) {
												@Pc(1133) int local1133 = Static62.anIntArray163[local92]++;
											}
											local94 = Static130.method2875();
											local96 = Static170.method2833();
											if (local94 > 4500 && local96 > 4500) {
												Static12.anInt220 = 250;
												Static54.method942(4000);
												Static176.aClass2_Sub13_Sub1_14.method2976(36);
											}
											Static140.anInt3002++;
											if (Static140.anInt3002 > 500) {
												Static140.anInt3002 = 0;
												local112 = (int) (Math.random() * 8.0D);
												if ((local112 & 0x4) == 4) {
													Static70.anInt1445 += Static110.anInt2287;
												}
												if ((local112 & 0x1) == 1) {
													Static54.anInt1195 += Static132.anInt2850;
												}
												if ((local112 & 0x2) == 2) {
													Static154.anInt3331 += anInt3896;
												}
											}
											Static180.anInt3994++;
											if (Static70.anInt1445 < -40) {
												Static110.anInt2287 = 1;
											}
											if (Static180.anInt3994 > 500) {
												Static180.anInt3994 = 0;
												local112 = (int) (Math.random() * 8.0D);
												if ((local112 & 0x2) == 2) {
													Static128.anInt2774 += Static147.anInt3138;
												}
												if ((local112 & 0x1) == 1) {
													Static43.anInt1034 += Static114.anInt2388;
												}
											}
											Static182.anInt4064++;
											if (Static128.anInt2774 < -20) {
												Static147.anInt3138 = 1;
											}
											if (Static43.anInt1034 < -60) {
												Static114.anInt2388 = 2;
											}
											if (Static54.anInt1195 < -50) {
												Static132.anInt2850 = 2;
											}
											if (Static128.anInt2774 > 10) {
												Static147.anInt3138 = -1;
											}
											if (Static54.anInt1195 > 50) {
												Static132.anInt2850 = -2;
											}
											if (Static154.anInt3331 < -55) {
												anInt3896 = 2;
											}
											if (Static43.anInt1034 > 60) {
												Static114.anInt2388 = -2;
											}
											if (Static70.anInt1445 > 40) {
												Static110.anInt2287 = -1;
											}
											if (Static154.anInt3331 > 55) {
												anInt3896 = -2;
											}
											if (Static182.anInt4064 > 50) {
												Static176.aClass2_Sub13_Sub1_14.method2976(20);
											}
											try {
												if (Static51.aClass57_3 != null && Static176.aClass2_Sub13_Sub1_14.anInt3940 > 0) {
													Static51.aClass57_3.method1885(Static176.aClass2_Sub13_Sub1_14.anInt3940, Static176.aClass2_Sub13_Sub1_14.aByteArray49);
													Static182.anInt4064 = 0;
													Static176.aClass2_Sub13_Sub1_14.anInt3940 = 0;
													return;
												}
												return;
											} catch (@Pc(1354) IOException local1354) {
												Static48.method881();
												return;
											}
										}
										local885 = local880.aClass85_4;
										if (local885.anInt3866 < 0) {
											break;
										}
										local896 = Static140.method2337(local885.anInt3851);
									} while (local896 == null || local896.aClass85Array2 == null || local885.anInt3866 >= local896.aClass85Array2.length || local885 != local896.aClass85Array2[local885.anInt3866]);
									Static38.method766(local880);
								}
							}
							local885 = local880.aClass85_4;
							if (local885.anInt3866 < 0) {
								break;
							}
							local896 = Static140.method2337(local885.anInt3851);
						} while (local896 == null || local896.aClass85Array2 == null || local896.aClass85Array2.length <= local885.anInt3866 || local896.aClass85Array2[local885.anInt3866] != local885);
						Static38.method766(local880);
					}
				}
				local885 = local880.aClass85_4;
				if (local885.anInt3866 < 0) {
					break;
				}
				local896 = Static140.method2337(local885.anInt3851);
			} while (local896 == null || local896.aClass85Array2 == null || local885.anInt3866 >= local896.aClass85Array2.length || local885 != local896.aClass85Array2[local885.anInt3866]);
			Static38.method766(local880);
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)Z")
	public static boolean method2902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static182.anIntArrayArrayArray8[arg0][arg1][arg2];
		if (local7 == -Static90.anInt1923) {
			return false;
		} else if (local7 == Static90.anInt1923) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (Static1.method1(local22 + 1, Static27.anIntArrayArrayArray2[arg0][arg1][arg2], local26 + 1) && Static1.method1(local22 + 128 - 1, Static27.anIntArrayArrayArray2[arg0][arg1 + 1][arg2], local26 + 1) && Static1.method1(local22 + 128 - 1, Static27.anIntArrayArrayArray2[arg0][arg1 + 1][arg2 + 1], local26 + 128 - 1) && Static1.method1(local22 + 1, Static27.anIntArrayArrayArray2[arg0][arg1][arg2 + 1], local26 + 128 - 1)) {
				Static182.anIntArrayArrayArray8[arg0][arg1][arg2] = Static90.anInt1923;
				return true;
			} else {
				Static182.anIntArrayArrayArray8[arg0][arg1][arg2] = -Static90.anInt1923;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)V")
	public static void method2903() {
		aShortArray49 = null;
		anIntArray363 = null;
		aClass49_1719 = null;
		aClass49_1717 = null;
		anIntArray362 = null;
		aClass81ArrayArrayArray1 = null;
		aClass49_1718 = null;
	}
}
