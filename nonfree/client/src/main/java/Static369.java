import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!sj", name = "J", descriptor = "F")
	public static float aFloat95;

	@OriginalMember(owner = "client!sj", name = "H", descriptor = "[I")
	public static final int[] anIntArray623 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!sj", name = "M", descriptor = "I")
	private static int anInt6759 = 2;

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(III)V")
	public static void method5148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static448.anInt7868 == 1) {
			Static78.method1447(arg1, Static306.aClass1_Sub35_2, arg0);
		} else if (Static448.anInt7868 == 2) {
			Static397.method5468(arg0, arg1);
		}
		Static306.aClass1_Sub35_2 = null;
		Static448.anInt7868 = 0;
	}

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "(B)V")
	public static void method5150() {
		if (Static162.anInt3420 > 1) {
			Static111.anInt4635 = Static175.anInt3842;
			Static162.anInt3420--;
		}
		if (Static32.anInt907 > 0) {
			Static32.anInt907--;
		}
		if (Static259.aBoolean313) {
			Static259.aBoolean313 = false;
			Static48.method898();
			return;
		}
		if (!Static96.aBoolean151) {
			Static83.method1517();
		}
		for (@Pc(41) int local41 = 0; local41 < 100 && Static131.method2160(); local41++) {
		}
		if (Static170.anInt3494 != 9) {
			return;
		}
		Static316.method4522(Static241.aClass177_66.method4037(), Static433.aClass1_Sub3_Sub1_11);
		if (Static2.aClass1_Sub15_1 == null) {
			if (Static208.aLong126 <= Static250.method3737()) {
				Static2.aClass1_Sub15_1 = Static461.aClass184_4.method4167(Static156.aClass35_9.aString6);
			}
		} else if (Static2.aClass1_Sub15_1.anInt2380 != -1) {
			Static32.method677(Static412.aClass177_102);
			Static433.aClass1_Sub3_Sub1_11.method1227(Static2.aClass1_Sub15_1.anInt2380);
			Static2.aClass1_Sub15_1 = null;
			Static208.aLong126 = Static250.method3737() + 30000L;
		}
		@Pc(107) Class1_Sub25 local107 = (Class1_Sub25) Static341.aClass203_43.method4548();
		@Pc(121) int local121;
		@Pc(142) int local142;
		@Pc(162) int local162;
		@Pc(178) boolean local178;
		@Pc(227) int local227;
		@Pc(233) int local233;
		@Pc(245) int local245;
		if (local107 != null || Static250.method3737() - 2000L > Static417.aLong213) {
			@Pc(118) boolean local118 = false;
			local121 = Static433.aClass1_Sub3_Sub1_11.anInt1710;
			for (@Pc(126) Class1_Sub25 local126 = (Class1_Sub25) Static389.aClass203_45.method4548(); local126 != null && Static433.aClass1_Sub3_Sub1_11.anInt1710 - local121 < 240; local126 = (Class1_Sub25) Static389.aClass203_45.method4545()) {
				local126.method6178();
				local142 = local126.method3347();
				if (local142 < 0) {
					local142 = 0;
				} else if (local142 > 65534) {
					local142 = 65534;
				}
				local162 = local126.method3349();
				if (local162 < 0) {
					local162 = 0;
				} else if (local162 > 65534) {
					local162 = 65534;
				}
				local178 = false;
				if (local126.method3347() == -1 && local126.method3349() == -1) {
					local178 = true;
					local142 = -1;
					local162 = -1;
				}
				if (local162 != Static257.anInt4995 || Static287.anInt5454 != local142) {
					if (!local118) {
						Static32.method677(Static32.aClass177_13);
						Static433.aClass1_Sub3_Sub1_11.method1208(0);
						local118 = true;
						local121 = Static433.aClass1_Sub3_Sub1_11.anInt1710;
					}
					local227 = local162 - Static257.anInt4995;
					Static257.anInt4995 = local162;
					local233 = local142 - Static287.anInt5454;
					Static287.anInt5454 = local142;
					local245 = (int) ((local126.method3352() - Static417.aLong213) / 20L);
					if (local245 < 8 && local227 >= -32 && local227 <= 31 && local233 >= -32 && local233 <= 31) {
						local233 += 32;
						local227 += 32;
						Static433.aClass1_Sub3_Sub1_11.method1227(local233 + (local227 << 6) + (local245 << 12));
					} else if (local245 < 32 && local227 >= -128 && local227 <= 127 && local233 >= -128 && local233 <= 127) {
						Static433.aClass1_Sub3_Sub1_11.method1208(local245 + 128);
						local227 += 128;
						local233 += 128;
						Static433.aClass1_Sub3_Sub1_11.method1227((local227 << 8) + local233);
					} else if (local245 < 32) {
						Static433.aClass1_Sub3_Sub1_11.method1208(local245 + 192);
						if (local178) {
							Static433.aClass1_Sub3_Sub1_11.method1197(Integer.MIN_VALUE);
						} else {
							Static433.aClass1_Sub3_Sub1_11.method1197(local142 << 16 | local162);
						}
					} else {
						Static433.aClass1_Sub3_Sub1_11.method1227(local245 + 57344);
						if (local178) {
							Static433.aClass1_Sub3_Sub1_11.method1197(Integer.MIN_VALUE);
						} else {
							Static433.aClass1_Sub3_Sub1_11.method1197(local162 | local142 << 16);
						}
					}
					Static417.aLong213 = local126.method3352();
				}
			}
			if (local118) {
				Static433.aClass1_Sub3_Sub1_11.method1185(Static433.aClass1_Sub3_Sub1_11.anInt1710 - local121);
			}
		}
		@Pc(420) int local420;
		@Pc(461) int local461;
		if (local107 != null) {
			@Pc(406) long local406 = (local107.method3352() - Static365.aLong190) / 50L;
			if (local406 > 32767L) {
				local406 = 32767L;
			}
			Static365.aLong190 = local107.method3352();
			local420 = local107.method3347();
			if (local420 < 0) {
				local420 = 0;
			} else if (local420 > 65535) {
				local420 = 65535;
			}
			local142 = local107.method3349();
			if (local142 < 0) {
				local142 = 0;
			} else if (local142 > 65535) {
				local142 = 65535;
			}
			@Pc(448) byte local448 = 0;
			if (local107.method3350() == 2) {
				local448 = 1;
			}
			Static32.method677(Static456.aClass177_24);
			local461 = (int) local406;
			Static433.aClass1_Sub3_Sub1_11.method1167(local420 << 16 | local142);
			Static433.aClass1_Sub3_Sub1_11.method1227(local448 << 15 | local461);
		}
		@Pc(485) int local485;
		if (Static119.anInt2647 > 0) {
			local485 = 0;
			for (local121 = 0; local121 < Static119.anInt2647; local121++) {
				if (Static400.aClass113Array1[local121].method5048()) {
					local485++;
				}
			}
			if (local485 > 0) {
				Static32.method677(Static310.aClass177_81);
				if (local485 > 75) {
					local485 = 75;
				}
				Static433.aClass1_Sub3_Sub1_11.method1208(local485 * 3);
				for (local420 = 0; local420 < Static119.anInt2647; local420++) {
					@Pc(532) Class113 local532 = Static400.aClass113Array1[local420];
					if (local532.method5048()) {
						@Pc(544) long local544 = (local532.method5052() - Static100.aLong67) / 50L;
						Static100.aLong67 = local532.method5052();
						if (local544 > 65535L) {
							local544 = 65535L;
						}
						Static433.aClass1_Sub3_Sub1_11.method1208(local532.method5051());
						Static433.aClass1_Sub3_Sub1_11.method1227((int) local544);
					}
				}
			}
		}
		if (Static362.anInt6663 > 0) {
			Static362.anInt6663--;
		}
		if (Static450.aBoolean515 && Static362.anInt6663 <= 0) {
			Static450.aBoolean515 = false;
			Static362.anInt6663 = 20;
			Static32.method677(Static145.aClass177_45);
			Static433.aClass1_Sub3_Sub1_11.method1184((int) Static267.aFloat83 >> 3);
			Static433.aClass1_Sub3_Sub1_11.method1205((int) Static26.aFloat5 >> 3);
		}
		if (Static266.aBoolean321 && !Static174.aBoolean238) {
			Static174.aBoolean238 = true;
			Static32.method677(Static321.aClass177_82);
			Static433.aClass1_Sub3_Sub1_11.method1208(1);
		}
		if (!Static266.aBoolean321 && Static174.aBoolean238) {
			Static174.aBoolean238 = false;
			Static32.method677(Static321.aClass177_82);
			Static433.aClass1_Sub3_Sub1_11.method1208(0);
		}
		if (!Static399.aBoolean22) {
			Static32.method677(Static398.aClass177_100);
			Static433.aClass1_Sub3_Sub1_11.method1208(0);
			local485 = Static433.aClass1_Sub3_Sub1_11.anInt1710;
			@Pc(678) Class1_Sub3 local678 = Static12.aClass34_Sub1_1.method5476();
			Static433.aClass1_Sub3_Sub1_11.method1181(local678.aByteArray14, local678.anInt1710);
			Static433.aClass1_Sub3_Sub1_11.method1185(Static433.aClass1_Sub3_Sub1_11.anInt1710 - local485);
			Static399.aBoolean22 = true;
		}
		if (Static67.aClass252ArrayArrayArray2 != null) {
			if (Static21.anInt6762 == 2) {
				Static226.method3458();
			} else if (Static21.anInt6762 == 3) {
				Static206.method3289();
			}
		}
		if (Static290.aBoolean340) {
			Static290.aBoolean340 = false;
		} else {
			Static214.aFloat101 /= 2.0F;
		}
		if (Static81.aBoolean127) {
			Static81.aBoolean127 = false;
		} else {
			Static191.aFloat61 /= 2.0F;
		}
		Static263.method3902();
		if (Static170.anInt3494 != 9) {
			return;
		}
		Static106.method1755();
		Static432.method5787();
		Static354.method5034();
		Static52.method977();
		Static132.anInt2937++;
		if (Static132.anInt2937 > 750) {
			Static48.method898();
			return;
		}
		Static67.method1308();
		Static422.method5715();
		Static298.method4342();
		for (local485 = Static366.aClass190_1.method4305(true); local485 != -1; local485 = Static366.aClass190_1.method4305(false)) {
			Static371.method5183(local485);
			Static128.anIntArray298[Static342.anInt6266++ & 0x1F] = local485;
		}
		@Pc(862) Class68 local862;
		for (@Pc(795) Class1_Sub1_Sub11 local795 = Static78.method1443(); local795 != null; local795 = Static78.method1443()) {
			local420 = local795.method2955();
			local142 = local795.method2952();
			if (local420 == 1) {
				Static31.anIntArray221[local142] = local795.anInt3820;
				Static334.aBoolean390 |= Static398.aBooleanArray23[local142];
				Static200.anIntArray392[Static181.anInt3933++ & 0x1F] = local142;
			} else if (local420 == 2) {
				Static255.aStringArray34[local142] = local795.aString33;
				Static374.anIntArray528[Static57.anInt1523++ & 0x1F] = local142;
			} else if (local420 == 3) {
				local862 = Static300.method4351(local142);
				if (!local795.aString33.equals(local862.aString23)) {
					local862.aString23 = local795.aString33;
					Static446.method6042(local862);
				}
			} else if (local420 == 4) {
				local862 = Static300.method4351(local142);
				local461 = local795.anInt3820;
				local227 = local795.anInt3819;
				local233 = local795.anInt3823;
				if (local862.anInt2162 != local461 || local227 != local862.anInt2176 || local862.anInt2127 != local233) {
					local862.anInt2176 = local227;
					local862.anInt2127 = local233;
					local862.anInt2162 = local461;
					Static446.method6042(local862);
				}
			} else if (local420 == 5) {
				local862 = Static300.method4351(local142);
				if (local862.anInt2111 != local795.anInt3820 || local795.anInt3820 == -1) {
					local862.anInt2111 = local795.anInt3820;
					local862.anInt2151 = 0;
					local862.anInt2116 = 1;
					local862.anInt2128 = 0;
					Static446.method6042(local862);
				}
			} else if (local420 == 6) {
				local162 = local795.anInt3820;
				local461 = local162 >> 10 & 0x1F;
				local227 = local162 >> 5 & 0x1F;
				local233 = local162 & 0x1F;
				local245 = (local233 << 3) + (local461 << 19) + (local227 << 11);
				@Pc(925) Class68 local925 = Static300.method4351(local142);
				if (local925.anInt2189 != local245) {
					local925.anInt2189 = local245;
					Static446.method6042(local925);
				}
			} else if (local420 == 7) {
				local862 = Static300.method4351(local142);
				local178 = local795.anInt3820 == 1;
				if (local178 != local862.aBoolean136) {
					local862.aBoolean136 = local178;
					Static446.method6042(local862);
				}
			} else if (local420 == 8) {
				local862 = Static300.method4351(local142);
				if (local862.anInt2167 != local795.anInt3820 || local862.anInt2120 != local795.anInt3819 || local862.anInt2112 != local795.anInt3823) {
					local862.anInt2120 = local795.anInt3819;
					local862.anInt2167 = local795.anInt3820;
					local862.anInt2112 = local795.anInt3823;
					if (local862.anInt2136 != -1) {
						if (local862.anInt2126 > 0) {
							local862.anInt2112 = local862.anInt2112 * 32 / local862.anInt2126;
						} else if (local862.anInt2190 > 0) {
							local862.anInt2112 = local862.anInt2112 * 32 / local862.anInt2190;
						}
					}
					Static446.method6042(local862);
				}
			} else if (local420 == 9) {
				local862 = Static300.method4351(local142);
				if (local795.anInt3820 != local862.anInt2136 || local795.anInt3819 != local862.anInt2106) {
					local862.anInt2136 = local795.anInt3820;
					local862.anInt2106 = local795.anInt3819;
					Static446.method6042(local862);
				}
			} else if (local420 == 10) {
				local862 = Static300.method4351(local142);
				if (local795.anInt3820 != local862.anInt2108 || local795.anInt3819 != local862.anInt2142 || local795.anInt3823 != local862.anInt2182) {
					local862.anInt2142 = local795.anInt3819;
					local862.anInt2108 = local795.anInt3820;
					local862.anInt2182 = local795.anInt3823;
					Static446.method6042(local862);
				}
			} else if (local420 == 11) {
				local862 = Static300.method4351(local142);
				local862.anInt2175 = local862.anInt2132 = local795.anInt3819;
				local862.aByte44 = 0;
				local862.aByte43 = 0;
				local862.anInt2170 = local862.anInt2110 = local795.anInt3820;
				Static446.method6042(local862);
			} else if (local420 == 12) {
				local862 = Static300.method4351(local142);
				local461 = local795.anInt3820;
				if (local862 != null && local862.anInt2153 == 0) {
					if (local862.anInt2122 - local862.anInt2149 < local461) {
						local461 = local862.anInt2122 - local862.anInt2149;
					}
					if (local461 < 0) {
						local461 = 0;
					}
					if (local862.anInt2125 != local461) {
						local862.anInt2125 = local461;
						Static446.method6042(local862);
					}
				}
			} else if (local420 == 14) {
				local862 = Static300.method4351(local142);
				local862.anInt2118 = local795.anInt3820;
			} else if (local420 == 15) {
				Static110.aBoolean473 = true;
				Static270.anInt5251 = local795.anInt3820;
				Static57.anInt1519 = local795.anInt3819;
			} else if (local420 == 16) {
				local862 = Static300.method4351(local142);
				local862.anInt2183 = local795.anInt3820;
			}
		}
		Static234.anInt4630++;
		if (Static349.anInt6472 != 0) {
			Static233.anInt4625 += 20;
			if (Static233.anInt4625 >= 400) {
				Static349.anInt6472 = 0;
			}
		}
		if (Static423.aClass68_16 != null) {
			Static353.anInt7449++;
			if (Static353.anInt7449 >= 15) {
				Static446.method6042(Static423.aClass68_16);
				Static423.aClass68_16 = null;
			}
		}
		Static452.aBoolean519 = false;
		Static315.aClass68_12 = null;
		Static98.aClass68_5 = null;
		Static57.aBoolean98 = false;
		Static4.method54(-1, null, -1);
		Static229.method3506(-1, null, -1);
		if (!Static293.aBoolean300) {
			Static49.anInt1209 = -1;
		}
		Static191.method3099();
		Static175.anInt3842++;
		if (Static170.aBoolean207) {
			Static32.method677(Static415.aClass177_104);
			Static433.aClass1_Sub3_Sub1_11.method1163(Static401.anInt7263 | Static4.anInt59 << 28 | Static181.anInt3935 << 14);
			Static170.aBoolean207 = false;
		}
		while (true) {
			@Pc(1420) Class1_Sub10 local1420;
			@Pc(1425) Class68 local1425;
			do {
				local1420 = (Class1_Sub10) Static90.aClass203_8.method4549();
				if (local1420 == null) {
					while (true) {
						do {
							local1420 = (Class1_Sub10) Static4.aClass203_1.method4549();
							if (local1420 == null) {
								while (true) {
									do {
										local1420 = (Class1_Sub10) Static106.aClass203_11.method4549();
										if (local1420 == null) {
											if (Static98.aClass68_5 == null) {
												Static209.anInt4285 = 0;
											}
											if (Static404.aClass68_11 != null) {
												Static184.method3065();
											}
											if (Static41.anInt1052 > 0 && Static414.aClass48_1.method1119(82) && Static414.aClass48_1.method1119(81) && Static24.anInt605 != 0) {
												local420 = Static429.aClass30_Sub1_Sub1_Sub2_2.aByte102 - Static24.anInt605;
												if (local420 < 0) {
													local420 = 0;
												} else if (local420 > 3) {
													local420 = 3;
												}
												Static147.method2349(Static380.anInt6896 + Static429.aClass30_Sub1_Sub1_Sub2_2.anIntArray129[0], Static278.anInt5374 + Static429.aClass30_Sub1_Sub1_Sub2_2.anIntArray130[0], local420);
											}
											Static318.method4539();
											for (local420 = 0; local420 < 5; local420++) {
												@Pc(1620) int local1620 = Static275.anIntArray501[local420]++;
											}
											if (Static334.aBoolean390 && Static250.method3737() - 60000L > Static14.aLong8) {
												Static208.method3578();
											}
											for (@Pc(1649) Class41_Sub3_Sub1 local1649 = (Class41_Sub3_Sub1) Static212.aClass117_5.method2967(); local1649 != null; local1649 = (Class41_Sub3_Sub1) Static212.aClass117_5.method2970()) {
												if ((long) local1649.anInt2851 < Static250.method3737() / 1000L - 5L) {
													if (local1649.aShort51 > 0) {
														Static227.method3471("", 0, local1649.aString25 + Static274.aClass158_136.method3594(Static365.anInt6682), 5, "");
													}
													if (local1649.aShort51 == 0) {
														Static227.method3471("", 0, local1649.aString25 + Static345.aClass158_170.method3594(Static365.anInt6682), 5, "");
													}
													local1649.method5447();
												}
											}
											Static272.anInt5276++;
											if (Static272.anInt5276 > 500) {
												Static272.anInt5276 = 0;
												local162 = (int) (Math.random() * 8.0D);
												if ((local162 & 0x2) == 2) {
													Static383.anInt6965 += Static288.anInt5501;
												}
												if ((local162 & 0x1) == 1) {
													Static436.anInt7703 += anInt6759;
												}
												if ((local162 & 0x4) == 4) {
													Static167.anInt5709 += Static280.anInt5389;
												}
											}
											if (Static436.anInt7703 < -50) {
												anInt6759 = 2;
											}
											if (Static383.anInt6965 < -55) {
												Static288.anInt5501 = 2;
											}
											if (Static436.anInt7703 > 50) {
												anInt6759 = -2;
											}
											if (Static383.anInt6965 > 55) {
												Static288.anInt5501 = -2;
											}
											if (Static167.anInt5709 < -40) {
												Static280.anInt5389 = 1;
											}
											Static187.anInt3976++;
											if (Static167.anInt5709 > 40) {
												Static280.anInt5389 = -1;
											}
											if (Static187.anInt3976 > 500) {
												Static187.anInt3976 = 0;
												local162 = (int) (Math.random() * 8.0D);
												if ((local162 & 0x1) == 1) {
													Static217.anInt4366 += Static145.anInt3147;
												}
												if ((local162 & 0x2) == 2) {
													Static135.anInt3022 += Static8.anInt97;
												}
											}
											if (Static217.anInt4366 < -60) {
												Static145.anInt3147 = 2;
											}
											if (Static217.anInt4366 > 60) {
												Static145.anInt3147 = -2;
											}
											if (Static135.anInt3022 < -20) {
												Static8.anInt97 = 1;
											}
											Static180.anInt3907++;
											if (Static135.anInt3022 > 10) {
												Static8.anInt97 = -1;
											}
											if (Static180.anInt3907 > 50) {
												Static32.method677(Static285.aClass177_78);
											}
											if (Static363.aBoolean422) {
												Static158.method2630();
												Static363.aBoolean422 = false;
											}
											try {
												if (Static388.aClass236_13 != null && Static433.aClass1_Sub3_Sub1_11.anInt1710 > 0) {
													Static339.anInt6203 += Static433.aClass1_Sub3_Sub1_11.anInt1710;
													Static388.aClass236_13.method5227(Static433.aClass1_Sub3_Sub1_11.anInt1710, Static433.aClass1_Sub3_Sub1_11.aByteArray14);
													Static180.anInt3907 = 0;
													Static433.aClass1_Sub3_Sub1_11.anInt1710 = 0;
													return;
												}
												return;
											} catch (@Pc(1907) IOException local1907) {
												Static48.method898();
												return;
											}
										}
										local1425 = local1420.aClass68_3;
										if (local1425.anInt2188 < 0) {
											break;
										}
										local862 = Static300.method4351(local1425.anInt2129);
									} while (local862 == null || local862.aClass68Array2 == null || local1425.anInt2188 >= local862.aClass68Array2.length || local862.aClass68Array2[local1425.anInt2188] != local1425);
									Static178.method3000(local1420);
								}
							}
							local1425 = local1420.aClass68_3;
							if (local1425.anInt2188 < 0) {
								break;
							}
							local862 = Static300.method4351(local1425.anInt2129);
						} while (local862 == null || local862.aClass68Array2 == null || local1425.anInt2188 >= local862.aClass68Array2.length || local862.aClass68Array2[local1425.anInt2188] != local1425);
						Static178.method3000(local1420);
					}
				}
				local1425 = local1420.aClass68_3;
				if (local1425.anInt2188 < 0) {
					break;
				}
				local862 = Static300.method4351(local1425.anInt2129);
			} while (local862 == null || local862.aClass68Array2 == null || local862.aClass68Array2.length <= local1425.anInt2188 || local862.aClass68Array2[local1425.anInt2188] != local1425);
			Static178.method3000(local1420);
		}
	}
}
