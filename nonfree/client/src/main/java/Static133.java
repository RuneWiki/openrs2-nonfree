import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!n", name = "b", descriptor = "Lclient!gj;")
	public static Class41 aClass41_2;

	@OriginalMember(owner = "client!n", name = "d", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray10 = new byte[4][104][104];

	@OriginalMember(owner = "client!n", name = "i", descriptor = "I")
	public static int anInt3087 = 1;

	@OriginalMember(owner = "client!n", name = "n", descriptor = "Lclient!qe;")
	public static Class78 aClass78_595 = Static199.method3560("Hidden)2");

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
	public static void method2414() {
		if (Static2.anInt44 > 1) {
			Static2.anInt44--;
			Static155.anInt3569 = anInt3087;
		}
		if (Static58.anInt1022 > 0) {
			Static58.anInt1022--;
		}
		if (Static5.aBoolean5) {
			Static5.aBoolean5 = false;
			Static162.method2928();
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < 100 && Static223.method3925(); local29++) {
		}
		if (Static226.anInt4903 != 30) {
			return;
		}
		Static198.method3555(Static161.aClass2_Sub23_Sub1_5);
		@Pc(56) Object local56 = Static65.aClass65_1.anObject4;
		@Pc(87) int local87;
		@Pc(84) int local84;
		@Pc(89) int local89;
		@Pc(106) int local106;
		@Pc(111) int local111;
		synchronized (Static65.aClass65_1.anObject4) {
			if (!Static215.aBoolean204) {
				Static65.aClass65_1.anInt3089 = 0;
			} else if (Static122.anInt1735 != 0 || Static65.aClass65_1.anInt3089 >= 40) {
				Static161.aClass2_Sub23_Sub1_5.method2155(114);
				Static161.aClass2_Sub23_Sub1_5.method2132(0);
				local84 = 0;
				local87 = Static161.aClass2_Sub23_Sub1_5.anInt2703;
				for (local89 = 0; Static65.aClass65_1.anInt3089 > local89 && Static161.aClass2_Sub23_Sub1_5.anInt2703 - local87 < 240; local89++) {
					local84++;
					local106 = Static65.aClass65_1.anIntArray506[local89];
					local111 = Static65.aClass65_1.anIntArray505[local89];
					@Pc(113) boolean local113 = false;
					if (local106 < 0) {
						local106 = 0;
					} else if (local106 > 65534) {
						local106 = 65534;
					}
					if (local111 < 0) {
						local111 = 0;
					} else if (local111 > 65534) {
						local111 = 65534;
					}
					if (Static65.aClass65_1.anIntArray506[local89] == -1 && Static65.aClass65_1.anIntArray505[local89] == -1) {
						local111 = -1;
						local106 = -1;
						local113 = true;
					}
					if (local111 != Static142.anInt3235 || Static22.anInt406 != local106) {
						@Pc(184) int local184 = local111 - Static142.anInt3235;
						Static142.anInt3235 = local111;
						@Pc(191) int local191 = local106 - Static22.anInt406;
						Static22.anInt406 = local106;
						if (Static106.anInt2313 < 8 && local184 >= -32 && local184 <= 31 && local191 >= -32 && local191 <= 31) {
							local191 += 32;
							local184 += 32;
							Static161.aClass2_Sub23_Sub1_5.method2117(local191 + (Static106.anInt2313 << 12) + (local184 << 6));
							Static106.anInt2313 = 0;
						} else if (Static106.anInt2313 < 32 && local184 >= -128 && local184 <= 127 && local191 >= -128 && local191 <= 127) {
							Static161.aClass2_Sub23_Sub1_5.method2132(Static106.anInt2313 + 128);
							local184 += 128;
							local191 += 128;
							Static161.aClass2_Sub23_Sub1_5.method2117(local191 + (local184 << 8));
							Static106.anInt2313 = 0;
						} else if (Static106.anInt2313 < 32) {
							Static161.aClass2_Sub23_Sub1_5.method2132(Static106.anInt2313 + 192);
							if (local113) {
								Static161.aClass2_Sub23_Sub1_5.method2134(Integer.MIN_VALUE);
							} else {
								Static161.aClass2_Sub23_Sub1_5.method2134(local111 | local106 << 16);
							}
							Static106.anInt2313 = 0;
						} else {
							Static161.aClass2_Sub23_Sub1_5.method2117(Static106.anInt2313 + 57344);
							if (local113) {
								Static161.aClass2_Sub23_Sub1_5.method2134(Integer.MIN_VALUE);
							} else {
								Static161.aClass2_Sub23_Sub1_5.method2134(local111 | local106 << 16);
							}
							Static106.anInt2313 = 0;
						}
					} else if (Static106.anInt2313 < 2047) {
						Static106.anInt2313++;
					}
				}
				Static161.aClass2_Sub23_Sub1_5.method2093(Static161.aClass2_Sub23_Sub1_5.anInt2703 - local87);
				if (local84 >= Static65.aClass65_1.anInt3089) {
					Static65.aClass65_1.anInt3089 = 0;
				} else {
					Static65.aClass65_1.anInt3089 -= local84;
					for (local106 = 0; local106 < Static65.aClass65_1.anInt3089; local106++) {
						Static65.aClass65_1.anIntArray505[local106] = Static65.aClass65_1.anIntArray505[local84 + local106];
						Static65.aClass65_1.anIntArray506[local106] = Static65.aClass65_1.anIntArray506[local84 + local106];
					}
				}
			}
		}
		if (Static122.anInt1735 != 0) {
			@Pc(418) long local418 = (Static58.aLong41 - Static187.aLong159) / 50L;
			if (local418 > 32767L) {
				local418 = 32767L;
			}
			Static187.aLong159 = Static58.aLong41;
			local87 = Static55.anInt981;
			if (local87 < 0) {
				local87 = 0;
			} else if (local87 > 65535) {
				local87 = 65535;
			}
			local84 = Static205.anInt740;
			@Pc(448) byte local448 = 0;
			if (local84 < 0) {
				local84 = 0;
			} else if (local84 > 65535) {
				local84 = 65535;
			}
			if (Static122.anInt1735 == 2) {
				local448 = 1;
			}
			Static161.aClass2_Sub23_Sub1_5.method2155(222);
			local106 = (int) local418;
			Static161.aClass2_Sub23_Sub1_5.method2109(local84 | local87 << 16);
			Static161.aClass2_Sub23_Sub1_5.method2090(local448 << 15 | local106);
		}
		if (Static181.anInt4198 > 0) {
			Static181.anInt4198--;
		}
		if (Static121.aBooleanArray133[96] || Static121.aBooleanArray133[97] || Static121.aBooleanArray133[98] || Static121.aBooleanArray133[99]) {
			Static52.aBoolean35 = true;
		}
		if (Static52.aBoolean35 && Static181.anInt4198 <= 0) {
			Static52.aBoolean35 = false;
			Static181.anInt4198 = 20;
			Static161.aClass2_Sub23_Sub1_5.method2155(157);
			Static161.aClass2_Sub23_Sub1_5.method2119(Static114.anInt2557);
			Static161.aClass2_Sub23_Sub1_5.method2099(Static140.anInt3197);
		}
		if (Static130.aBoolean119 && !Static224.aBoolean211) {
			Static224.aBoolean211 = true;
			Static161.aClass2_Sub23_Sub1_5.method2155(165);
			Static161.aClass2_Sub23_Sub1_5.method2132(1);
		}
		if (!Static130.aBoolean119 && Static224.aBoolean211) {
			Static224.aBoolean211 = false;
			Static161.aClass2_Sub23_Sub1_5.method2155(165);
			Static161.aClass2_Sub23_Sub1_5.method2132(0);
		}
		if (!Static97.aBoolean78) {
			Static161.aClass2_Sub23_Sub1_5.method2155(40);
			Static161.aClass2_Sub23_Sub1_5.method2109(Static209.method3066());
			Static97.aBoolean78 = true;
		}
		Static157.method2818();
		if (Static226.anInt4903 != 30) {
			return;
		}
		Static52.method672();
		Static98.method1692();
		Static216.anInt4727++;
		if (Static216.anInt4727 > 750) {
			Static162.method2928();
			return;
		}
		Static201.method3576();
		Static125.method1284();
		Static94.method1645();
		if (Static118.aClass64_8 != null) {
			Static128.method2311();
		}
		for (@Pc(638) int local638 = Static170.method3114(true); local638 != -1; local638 = Static170.method3114(false)) {
			Static69.method1122(local638);
			Static138.anIntArray527[Static151.anInt3458++ & 0x1F] = local638;
		}
		for (@Pc(664) Class2_Sub3_Sub15 local664 = Static176.method3215(); local664 != null; local664 = Static176.method3215()) {
			local87 = local664.method1639();
			local84 = local664.method1642();
			if (local87 == 1) {
				Static171.anIntArray652[local84] = local664.anInt2073;
				Static56.anIntArray161[Static126.anInt2866++ & 0x1F] = local84;
			} else if (local87 == 2) {
				Static164.aClass78Array29[local84] = local664.aClass78_458;
				Static1.anIntArray1[Static223.anInt4832++ & 0x1F] = local84;
			}
		}
		Static44.anInt797++;
		if (Static8.anInt262 != 0) {
			Static2.anInt42 += 20;
			if (Static2.anInt42 >= 400) {
				Static8.anInt262 = 0;
			}
		}
		if (Static68.aClass64_7 != null) {
			Static123.anInt2811++;
			if (Static123.anInt2811 >= 15) {
				Static70.method2259(Static68.aClass64_7);
				Static68.aClass64_7 = null;
			}
		}
		@Pc(840) Class64 local840;
		if (Static55.aClass64_4 != null) {
			Static70.method2259(Static55.aClass64_4);
			if (Static44.anInt806 > Static49.anInt904 + 5 || Static49.anInt904 - 5 > Static44.anInt806 || Static10.anInt309 + 5 < Static81.anInt1744 || Static81.anInt1744 < Static10.anInt309 - 5) {
				Static198.aBoolean193 = true;
			}
			Static181.anInt4196++;
			if (Static78.anInt1709 == 0) {
				if (Static198.aBoolean193 && Static181.anInt4196 >= 5) {
					if (Static68.aClass64_6 == Static55.aClass64_4 && Static67.anInt931 != Static132.anInt3079) {
						local840 = Static55.aClass64_4;
						@Pc(846) byte local846 = 0;
						if (Static200.anInt4494 == 1 && local840.anInt3002 == 206) {
							local846 = 1;
						}
						if (local840.anIntArray493[Static132.anInt3079] <= 0) {
							local846 = 0;
						}
						if (Static64.method1035(Static36.method473(local840))) {
							local89 = Static67.anInt931;
							local106 = Static132.anInt3079;
							local840.anIntArray493[local106] = local840.anIntArray493[local89];
							local840.anIntArray496[local106] = local840.anIntArray496[local89];
							local840.anIntArray493[local89] = -1;
							local840.anIntArray496[local89] = 0;
						} else if (local846 == 1) {
							local89 = Static67.anInt931;
							local106 = Static132.anInt3079;
							while (local89 != local106) {
								if (local89 > local106) {
									local840.method2411(local89, local89 - 1);
									local89--;
								} else if (local89 < local106) {
									local840.method2411(local89, local89 + 1);
									local89++;
								}
							}
						} else {
							local840.method2411(Static67.anInt931, Static132.anInt3079);
						}
						Static161.aClass2_Sub23_Sub1_5.method2155(247);
						Static161.aClass2_Sub23_Sub1_5.method2128(local846);
						Static161.aClass2_Sub23_Sub1_5.method2117(Static132.anInt3079);
						Static161.aClass2_Sub23_Sub1_5.method2119(Static67.anInt931);
						Static161.aClass2_Sub23_Sub1_5.method2102(Static55.aClass64_4.anInt3044);
					}
				} else if ((Static152.anInt3472 == 1 || Static97.method1688(Static138.anInt3182 - 1)) && Static138.anInt3182 > 2) {
					Static75.method1257();
				} else if (Static138.anInt3182 > 0) {
					Static70.method2260(Static138.anInt3182 - 1);
				}
				Static55.aClass64_4 = null;
				Static122.anInt1735 = 0;
				Static123.anInt2811 = 10;
			}
		}
		Static4.anInt115 = 0;
		Static226.aBoolean213 = false;
		Static79.aBoolean63 = false;
		Static156.aClass64_12 = null;
		local840 = Static132.aClass64_10;
		Static132.aClass64_10 = null;
		@Pc(998) Class64 local998 = Static185.aClass64_13;
		Static185.aClass64_13 = null;
		while (Static53.method1335() && Static4.anInt115 < 128) {
			Static224.anIntArray788[Static4.anInt115] = Static92.anInt2046;
			Static22.anIntArray53[Static4.anInt115] = Static153.anInt3538;
			Static4.anInt115++;
		}
		Static118.aClass64_8 = null;
		if (Static166.anInt1143 != -1) {
			Static179.method3304(Static134.anInt3131, Static166.anInt1143, Static30.anInt546, 0, 0, 0, 0);
		}
		anInt3087++;
		while (true) {
			@Pc(1043) Class2_Sub1 local1043;
			@Pc(1059) Class64 local1059;
			@Pc(1048) Class64 local1048;
			do {
				local1043 = (Class2_Sub1) Static23.aClass44_7.method1365();
				if (local1043 == null) {
					while (true) {
						do {
							local1043 = (Class2_Sub1) Static150.aClass44_39.method1365();
							if (local1043 == null) {
								while (true) {
									do {
										local1043 = (Class2_Sub1) Static37.aClass44_9.method1365();
										if (local1043 == null) {
											if (Static169.aBoolean170 && Static118.aClass64_8 == null) {
												Static169.aBoolean170 = false;
											}
											if (Static227.aClass64_17 != null) {
												Static125.method1285();
											}
											if (Static219.anInt4760 != -1) {
												local89 = Static219.anInt4760;
												local106 = Static84.anInt1809;
												@Pc(1214) boolean local1214 = Static107.method1849(0, 0, local89, 0, 0, 0, Static31.aClass5_Sub2_Sub2_1.anIntArray333[0], true, Static31.aClass5_Sub2_Sub2_1.anIntArray334[0], local106, 0);
												Static219.anInt4760 = -1;
												if (local1214) {
													Static206.anInt4570 = Static205.anInt740;
													Static2.anInt42 = 0;
													Static46.anInt847 = Static55.anInt981;
													Static8.anInt262 = 1;
												}
											}
											Static160.method2883();
											if (Static132.aClass64_10 != local840) {
												if (local840 != null) {
													Static70.method2259(local840);
												}
												if (Static132.aClass64_10 != null) {
													Static70.method2259(Static132.aClass64_10);
												}
											}
											if (Static185.aClass64_13 != local998 && Static148.anInt3377 == Static125.anInt1648) {
												if (local998 != null) {
													Static70.method2259(local998);
												}
												if (Static185.aClass64_13 != null) {
													Static70.method2259(Static185.aClass64_13);
												}
											}
											if (Static185.aClass64_13 == null) {
												if (Static125.anInt1648 > 0) {
													Static125.anInt1648--;
												}
											} else if (Static148.anInt3377 > Static125.anInt1648) {
												Static125.anInt1648++;
												if (Static125.anInt1648 == Static148.anInt3377) {
													Static70.method2259(Static185.aClass64_13);
												}
											}
											if (Static145.anInt3290 == 1) {
												Static66.method1082();
											} else if (Static145.anInt3290 == 2) {
												Static85.method1492();
											} else {
												Static27.method360();
											}
											for (local89 = 0; local89 < 5; local89++) {
												@Pc(1311) int local1311 = Static160.anIntArray615[local89]++;
											}
											local106 = Static107.method1847();
											local111 = Static121.method3979();
											if (local106 > 4500 && local111 > 4500) {
												Static58.anInt1022 = 250;
												Static7.method156(4000);
												Static161.aClass2_Sub23_Sub1_5.method2155(63);
											}
											Static187.anInt4372++;
											Static35.anInt585++;
											Static203.anInt4535++;
											@Pc(1367) int local1367;
											if (Static203.anInt4535 > 500) {
												Static203.anInt4535 = 0;
												local1367 = (int) (Math.random() * 8.0D);
												if ((local1367 & 0x2) == 2) {
													Static226.anInt4901 += Static209.anInt3898;
												}
												if ((local1367 & 0x1) == 1) {
													Static33.anInt573 += Static201.anInt4508;
												}
												if ((local1367 & 0x4) == 4) {
													Static178.anInt4142 += Static73.anInt1579;
												}
											}
											if (Static187.anInt4372 > 500) {
												Static187.anInt4372 = 0;
												local1367 = (int) (Math.random() * 8.0D);
												if ((local1367 & 0x2) == 2) {
													Static62.anInt1225 += Static153.anInt3533;
												}
												if ((local1367 & 0x1) == 1) {
													Static90.anInt2013 += Static165.anInt3817;
												}
											}
											if (Static226.anInt4901 < -55) {
												Static209.anInt3898 = 2;
											}
											if (Static90.anInt2013 < -60) {
												Static165.anInt3817 = 2;
											}
											if (Static226.anInt4901 > 55) {
												Static209.anInt3898 = -2;
											}
											if (Static178.anInt4142 < -40) {
												Static73.anInt1579 = 1;
											}
											if (Static62.anInt1225 < -20) {
												Static153.anInt3533 = 1;
											}
											if (Static62.anInt1225 > 10) {
												Static153.anInt3533 = -1;
											}
											if (Static90.anInt2013 > 60) {
												Static165.anInt3817 = -2;
											}
											if (Static178.anInt4142 > 40) {
												Static73.anInt1579 = -1;
											}
											if (Static33.anInt573 < -50) {
												Static201.anInt4508 = 2;
											}
											if (Static33.anInt573 > 50) {
												Static201.anInt4508 = -2;
											}
											if (Static35.anInt585 > 50) {
												Static161.aClass2_Sub23_Sub1_5.method2155(252);
											}
											Static97.method1684();
											try {
												if (Static202.aClass105_4 != null && Static161.aClass2_Sub23_Sub1_5.anInt2703 > 0) {
													Static202.aClass105_4.method3692(Static161.aClass2_Sub23_Sub1_5.aByteArray41, Static161.aClass2_Sub23_Sub1_5.anInt2703);
													Static35.anInt585 = 0;
													Static161.aClass2_Sub23_Sub1_5.anInt2703 = 0;
													return;
												}
												return;
											} catch (@Pc(1524) IOException local1524) {
												Static162.method2928();
												return;
											}
										}
										local1048 = local1043.aClass64_1;
										if (local1048.anInt2993 < 0) {
											break;
										}
										local1059 = Static204.method3618(local1048.anInt3075);
									} while (local1059 == null || local1059.aClass64Array2 == null || local1059.aClass64Array2.length <= local1048.anInt2993 || local1048 != local1059.aClass64Array2[local1048.anInt2993]);
									Static50.method649(local1043);
								}
							}
							local1048 = local1043.aClass64_1;
							if (local1048.anInt2993 < 0) {
								break;
							}
							local1059 = Static204.method3618(local1048.anInt3075);
						} while (local1059 == null || local1059.aClass64Array2 == null || local1059.aClass64Array2.length <= local1048.anInt2993 || local1059.aClass64Array2[local1048.anInt2993] != local1048);
						Static50.method649(local1043);
					}
				}
				local1048 = local1043.aClass64_1;
				if (local1048.anInt2993 < 0) {
					break;
				}
				local1059 = Static204.method3618(local1048.anInt3075);
			} while (local1059 == null || local1059.aClass64Array2 == null || local1059.aClass64Array2.length <= local1048.anInt2993 || local1048 != local1059.aClass64Array2[local1048.anInt2993]);
			Static50.method649(local1043);
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIII)V")
	public static void method2415(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		Static221.method3893(arg4, arg2 - arg0, Static183.anIntArrayArray40[arg3], arg0 + arg2);
		@Pc(24) int local24 = arg0 * arg0;
		@Pc(28) int local28 = local24 << 1;
		@Pc(32) int local32 = arg1 * arg1;
		@Pc(36) int local36 = local32 << 1;
		@Pc(40) int local40 = arg1 << 1;
		@Pc(44) int local44 = local24 << 2;
		@Pc(53) int local53 = local36 + (1 - local40) * local24;
		@Pc(62) int local62 = local32 - (local40 - 1) * local28;
		@Pc(64) int local64 = arg1;
		@Pc(72) int local72 = local36 * 3;
		@Pc(76) int local76 = local32 << 2;
		@Pc(84) int local84 = ((arg1 << 1) - 3) * local28;
		@Pc(90) int local90 = local76;
		@Pc(96) int local96 = (arg1 - 1) * local44;
		while (local64 > 0) {
			if (local53 < 0) {
				while (local53 < 0) {
					local62 += local90;
					local53 += local72;
					local72 += local76;
					local7++;
					local90 += local76;
				}
			}
			local64--;
			@Pc(130) int local130 = arg3 - local64;
			@Pc(134) int local134 = local64 + arg3;
			if (local62 < 0) {
				local7++;
				local62 += local90;
				local90 += local76;
				local53 += local72;
				local72 += local76;
			}
			local62 += -local84;
			local53 += -local96;
			@Pc(170) int local170 = local7 + arg2;
			local84 -= local44;
			local96 -= local44;
			@Pc(183) int local183 = arg2 - local7;
			Static221.method3893(arg4, local183, Static183.anIntArrayArray40[local130], local170);
			Static221.method3893(arg4, local183, Static183.anIntArrayArray40[local134], local170);
		}
	}
}
