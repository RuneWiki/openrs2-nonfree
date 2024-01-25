import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!b", name = "r", descriptor = "I")
	public static int anInt7350 = 1;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIZ)Ljava/lang/String;")
	public static String method5791(@OriginalArg(0) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static90.method1743(arg0);
	}

	@OriginalMember(owner = "client!b", name = "e", descriptor = "(I)V")
	public static void method5792() {
		if (Static46.anInt860 > 0) {
			Static46.anInt860--;
		}
		if (Static38.anInt6363 > 1) {
			Static453.anInt7434 = Static37.anInt715;
			Static38.anInt6363--;
		}
		if (Static235.aBoolean424) {
			Static235.aBoolean424 = false;
			Static76.method1391();
			return;
		}
		if (!Static123.aBoolean212) {
			Static372.method2348();
		}
		for (@Pc(33) int local33 = 0; local33 < 100 && Static106.method1962(); local33++) {
		}
		if (Static162.anInt3250 != 30) {
			return;
		}
		Static365.method4990(Static424.aClass2_Sub23_Sub2_1, Static351.aClass54_95.method1251());
		if (Static278.aClass2_Sub36_1 == null) {
			if (Static21.method458() >= Static452.aLong226) {
				Static278.aClass2_Sub36_1 = Static451.aClass268_1.method5855(Static266.aString47);
			}
		} else if (Static278.aClass2_Sub36_1.anInt5667 != -1) {
			Static159.method2586(Static432.aClass54_105);
			Static424.aClass2_Sub23_Sub2_1.method5502(Static278.aClass2_Sub36_1.anInt5667);
			Static278.aClass2_Sub36_1 = null;
			Static452.aLong226 = Static21.method458() + 30000L;
		}
		@Pc(96) Class2_Sub15 local96 = (Class2_Sub15) Static360.aClass14_47.method309();
		@Pc(110) int local110;
		@Pc(131) int local131;
		@Pc(151) int local151;
		@Pc(169) boolean local169;
		@Pc(214) int local214;
		@Pc(221) int local221;
		@Pc(232) int local232;
		if (local96 != null || Static21.method458() - 2000L > Static80.aLong216) {
			@Pc(107) boolean local107 = false;
			local110 = Static424.aClass2_Sub23_Sub2_1.anInt6952;
			for (@Pc(115) Class2_Sub15 local115 = (Class2_Sub15) Static421.aClass14_48.method309(); local115 != null && Static424.aClass2_Sub23_Sub2_1.anInt6952 - local110 < 240; local115 = (Class2_Sub15) Static421.aClass14_48.method311()) {
				local115.method5866();
				local131 = local115.method2336();
				if (local131 < 0) {
					local131 = 0;
				} else if (local131 > 65534) {
					local131 = 65534;
				}
				local151 = local115.method2334();
				if (local151 < 0) {
					local151 = 0;
				} else if (local151 > 65534) {
					local151 = 65534;
				}
				local169 = false;
				if (local115.method2336() == -1 && local115.method2334() == -1) {
					local169 = true;
					local131 = -1;
					local151 = -1;
				}
				if (local151 != Static400.anInt7452 || Static241.anInt4898 != local131) {
					if (!local107) {
						Static159.method2586(Static192.aClass54_54);
						Static424.aClass2_Sub23_Sub2_1.method5449(0);
						local107 = true;
						local110 = Static424.aClass2_Sub23_Sub2_1.anInt6952;
					}
					local214 = local151 - Static400.anInt7452;
					Static400.anInt7452 = local151;
					local221 = local131 - Static241.anInt4898;
					Static241.anInt4898 = local131;
					local232 = (int) ((local115.method2338() - Static80.aLong216) / 20L);
					if (local232 < 8 && local214 >= -32 && local214 <= 31 && local221 >= -32 && local221 <= 31) {
						local214 += 32;
						local221 += 32;
						Static424.aClass2_Sub23_Sub2_1.method5502(local221 + (local232 << 12) + (local214 << 6));
					} else if (local232 < 32 && local214 >= -128 && local214 <= 127 && local221 >= -128 && local221 <= 127) {
						Static424.aClass2_Sub23_Sub2_1.method5449(local232 + 128);
						local221 += 128;
						local214 += 128;
						Static424.aClass2_Sub23_Sub2_1.method5502(local221 + (local214 << 8));
					} else if (local232 < 32) {
						Static424.aClass2_Sub23_Sub2_1.method5449(local232 + 192);
						if (local169) {
							Static424.aClass2_Sub23_Sub2_1.method5506(Integer.MIN_VALUE);
						} else {
							Static424.aClass2_Sub23_Sub2_1.method5506(local131 << 16 | local151);
						}
					} else {
						Static424.aClass2_Sub23_Sub2_1.method5502(local232 + 57344);
						if (local169) {
							Static424.aClass2_Sub23_Sub2_1.method5506(Integer.MIN_VALUE);
						} else {
							Static424.aClass2_Sub23_Sub2_1.method5506(local151 | local131 << 16);
						}
					}
					Static80.aLong216 = local115.method2338();
				}
			}
			if (local107) {
				Static424.aClass2_Sub23_Sub2_1.method5448(Static424.aClass2_Sub23_Sub2_1.anInt6952 - local110);
			}
		}
		@Pc(409) int local409;
		@Pc(461) int local461;
		if (local96 != null) {
			@Pc(393) long local393 = (local96.method2338() - Static292.aLong147) / 50L;
			if (local393 > 32767L) {
				local393 = 32767L;
			}
			Static292.aLong147 = local96.method2338();
			local409 = local96.method2336();
			if (local409 < 0) {
				local409 = 0;
			} else if (local409 > 65535) {
				local409 = 65535;
			}
			local131 = local96.method2334();
			if (local131 < 0) {
				local131 = 0;
			} else if (local131 > 65535) {
				local131 = 65535;
			}
			@Pc(442) byte local442 = 0;
			if (local96.method2337() == 2) {
				local442 = 1;
			}
			Static159.method2586(Static383.aClass54_91);
			local461 = (int) local393;
			Static424.aClass2_Sub23_Sub2_1.method5478(local409 << 16 | local131);
			Static424.aClass2_Sub23_Sub2_1.method5454(local461 | local442 << 15);
		}
		@Pc(481) int local481;
		if (Static222.anInt4305 > 0) {
			local481 = 0;
			for (local110 = 0; local110 < Static222.anInt4305; local110++) {
				if (Static23.aClass141Array1[local110].method4289()) {
					local481++;
				}
			}
			if (local481 > 0) {
				Static159.method2586(Static117.aClass54_40);
				if (local481 > 75) {
					local481 = 75;
				}
				Static424.aClass2_Sub23_Sub2_1.method5449(local481 * 3);
				for (local409 = 0; local409 < Static222.anInt4305; local409++) {
					@Pc(529) Class141 local529 = Static23.aClass141Array1[local409];
					if (local529.method4289()) {
						@Pc(541) long local541 = (local529.method4292() - Static340.aLong166) / 50L;
						Static340.aLong166 = local529.method4292();
						if (local541 > 65535L) {
							local541 = 65535L;
						}
						Static424.aClass2_Sub23_Sub2_1.method5449(local529.method4288());
						Static424.aClass2_Sub23_Sub2_1.method5502((int) local541);
					}
				}
			}
		}
		if (Static455.anInt5542 > 0) {
			Static455.anInt5542--;
		}
		if (Static243.aBoolean333 && Static455.anInt5542 <= 0) {
			Static455.anInt5542 = 20;
			Static243.aBoolean333 = false;
			Static159.method2586(Static291.aClass54_75);
			Static424.aClass2_Sub23_Sub2_1.method5470((int) Static287.aFloat74 >> 3);
			Static424.aClass2_Sub23_Sub2_1.method5470((int) Static202.aFloat62 >> 3);
		}
		if (Static8.aBoolean8 && !Static338.aBoolean439) {
			Static338.aBoolean439 = true;
			Static159.method2586(Static209.aClass54_57);
			Static424.aClass2_Sub23_Sub2_1.method5449(1);
		}
		if (!Static8.aBoolean8 && Static338.aBoolean439) {
			Static338.aBoolean439 = false;
			Static159.method2586(Static209.aClass54_57);
			Static424.aClass2_Sub23_Sub2_1.method5449(0);
		}
		if (!Static120.aBoolean204) {
			Static159.method2586(Static20.aClass54_14);
			Static424.aClass2_Sub23_Sub2_1.method5449(0);
			local481 = Static424.aClass2_Sub23_Sub2_1.anInt6952;
			@Pc(674) Class2_Sub23 local674 = Static12.aClass79_Sub1_1.method3963();
			Static424.aClass2_Sub23_Sub2_1.method5462(local674.anInt6952, local674.aByteArray130);
			Static424.aClass2_Sub23_Sub2_1.method5448(Static424.aClass2_Sub23_Sub2_1.anInt6952 - local481);
			Static120.aBoolean204 = true;
		}
		if (Static440.aClass106ArrayArrayArray3 != null) {
			if (Static159.anInt3195 == 2) {
				Static69.method1323();
			} else if (Static159.anInt3195 == 3) {
				Static176.method188();
			}
		}
		if (Static140.aBoolean233) {
			Static140.aBoolean233 = false;
		} else {
			Static118.aFloat53 /= 2.0F;
		}
		if (Static96.aBoolean166) {
			Static96.aBoolean166 = false;
		} else {
			Static286.aFloat73 /= 2.0F;
		}
		Static117.method2077();
		if (Static162.anInt3250 != 30) {
			return;
		}
		Static415.method5521();
		Static215.method3379();
		Static339.method4702();
		Static253.method3833();
		Static194.anInt3721++;
		if (Static194.anInt3721 > 750) {
			Static76.method1391();
			return;
		}
		Static351.method5163();
		Static299.method4285();
		Static301.method4324();
		for (local481 = Static344.aClass108_1.method2427(true); local481 != -1; local481 = Static344.aClass108_1.method2427(false)) {
			Static158.method2582(local481);
			Static170.anIntArray301[Static214.anInt4155++ & 0x1F] = local481;
		}
		@Pc(837) Class68 local837;
		for (@Pc(790) Class2_Sub5_Sub13 local790 = Static177.method2843(); local790 != null; local790 = Static177.method2843()) {
			local409 = local790.method4546();
			local131 = local790.method4549();
			if (local409 == 1) {
				Static19.anIntArray426[local131] = local790.anInt5641;
				Static275.aBoolean376 |= Static70.aBooleanArray9[local131];
				Static176.anIntArray17[Static334.anInt5795++ & 0x1F] = local131;
			} else if (local409 == 2) {
				Static109.aStringArray34[local131] = local790.aString52;
				Static294.anIntArray424[Static265.anInt4940++ & 0x1F] = local131;
			} else if (local409 == 3) {
				local837 = Static165.method2704(local131);
				if (!local790.aString52.equals(local837.aString22)) {
					local837.aString22 = local790.aString52;
					Static78.method1460(local837);
				}
			} else if (local409 == 4) {
				local837 = Static165.method2704(local131);
				local461 = local790.anInt5641;
				local214 = local790.anInt5643;
				local221 = local790.anInt5644;
				if (local461 != local837.anInt2238 || local214 != local837.anInt2203 || local837.anInt2185 != local221) {
					local837.anInt2238 = local461;
					local837.anInt2185 = local221;
					local837.anInt2203 = local214;
					Static78.method1460(local837);
				}
			} else if (local409 == 5) {
				local837 = Static165.method2704(local131);
				if (local790.anInt5641 != local837.anInt2222 || local790.anInt5641 == -1) {
					local837.anInt2222 = local790.anInt5641;
					local837.anInt2210 = 0;
					local837.anInt2224 = 0;
					local837.anInt2231 = 1;
					Static78.method1460(local837);
				}
			} else if (local409 == 6) {
				local151 = local790.anInt5641;
				local461 = local151 >> 10 & 0x1F;
				local214 = local151 >> 5 & 0x1F;
				local221 = local151 & 0x1F;
				local232 = (local461 << 19) + ((local214 << 11) + (local221 << 3));
				@Pc(914) Class68 local914 = Static165.method2704(local131);
				if (local232 != local914.anInt2235) {
					local914.anInt2235 = local232;
					Static78.method1460(local914);
				}
			} else if (local409 == 7) {
				local837 = Static165.method2704(local131);
				local169 = local790.anInt5641 == 1;
				if (local169 != local837.aBoolean151) {
					local837.aBoolean151 = local169;
					Static78.method1460(local837);
				}
			} else if (local409 == 8) {
				local837 = Static165.method2704(local131);
				if (local837.anInt2228 != local790.anInt5641 || local837.anInt2205 != local790.anInt5643 || local790.anInt5644 != local837.anInt2242) {
					local837.anInt2205 = local790.anInt5643;
					local837.anInt2242 = local790.anInt5644;
					local837.anInt2228 = local790.anInt5641;
					if (local837.anInt2208 != -1) {
						if (local837.anInt2207 > 0) {
							local837.anInt2242 = local837.anInt2242 * 32 / local837.anInt2207;
						} else if (local837.anInt2171 > 0) {
							local837.anInt2242 = local837.anInt2242 * 32 / local837.anInt2171;
						}
					}
					Static78.method1460(local837);
				}
			} else if (local409 == 9) {
				local837 = Static165.method2704(local131);
				if (local790.anInt5641 != local837.anInt2208 || local837.anInt2220 != local790.anInt5643) {
					local837.anInt2220 = local790.anInt5643;
					local837.anInt2208 = local790.anInt5641;
					Static78.method1460(local837);
				}
			} else if (local409 == 10) {
				local837 = Static165.method2704(local131);
				if (local837.anInt2192 != local790.anInt5641 || local790.anInt5643 != local837.lb || local790.anInt5644 != local837.anInt2254) {
					local837.anInt2254 = local790.anInt5644;
					local837.lb = local790.anInt5643;
					local837.anInt2192 = local790.anInt5641;
					Static78.method1460(local837);
				}
			} else if (local409 == 11) {
				local837 = Static165.method2704(local131);
				local837.anInt2244 = local837.anInt2168 = local790.anInt5641;
				local837.aByte33 = 0;
				local837.aByte34 = 0;
				local837.anInt2214 = local837.anInt2186 = local790.anInt5643;
				Static78.method1460(local837);
			} else if (local409 == 12) {
				local837 = Static165.method2704(local131);
				local461 = local790.anInt5641;
				if (local837 != null && local837.anInt2249 == 0) {
					if (local837.anInt2243 - local837.anInt2252 < local461) {
						local461 = local837.anInt2243 - local837.anInt2252;
					}
					if (local461 < 0) {
						local461 = 0;
					}
					if (local461 != local837.anInt2172) {
						local837.anInt2172 = local461;
						Static78.method1460(local837);
					}
				}
			} else if (local409 == 14) {
				local837 = Static165.method2704(local131);
				local837.anInt2187 = local790.anInt5641;
			} else if (local409 == 15) {
				Static66.anInt134 = local790.anInt5641;
				Static11.aBoolean11 = true;
				Static220.anInt4265 = local790.anInt5643;
			} else if (local409 == 16) {
				local837 = Static165.method2704(local131);
				local837.anInt2232 = local790.anInt5641;
			}
		}
		Static377.anInt6400++;
		if (Static46.anInt864 != 0) {
			Static115.anInt2620 += 20;
			if (Static115.anInt2620 >= 400) {
				Static46.anInt864 = 0;
			}
		}
		if (Static84.aClass68_2 != null) {
			Static353.anInt5985++;
			if (Static353.anInt5985 >= 15) {
				Static78.method1460(Static84.aClass68_2);
				Static84.aClass68_2 = null;
			}
		}
		Static256.aClass68_10 = null;
		Static193.aClass68_8 = null;
		Static130.aBoolean218 = false;
		Static362.aBoolean435 = false;
		Static428.method5624(-1, null, -1);
		Static130.method2223(-1, null, -1);
		if (!Static385.aBoolean441) {
			Static54.anInt1162 = -1;
		}
		Static281.method5823();
		Static37.anInt715++;
		if (Static211.aBoolean301) {
			Static159.method2586(Static264.aClass54_69);
			Static424.aClass2_Sub23_Sub2_1.method5476(Static317.anInt5576 | Static297.anInt5331 << 14 | Static432.anInt7161 << 28);
			Static211.aBoolean301 = false;
		}
		while (true) {
			@Pc(1427) Class2_Sub30 local1427;
			@Pc(1432) Class68 local1432;
			do {
				local1427 = (Class2_Sub30) Static156.aClass14_30.method307();
				if (local1427 == null) {
					while (true) {
						do {
							local1427 = (Class2_Sub30) Static179.aClass14_31.method307();
							if (local1427 == null) {
								while (true) {
									do {
										local1427 = (Class2_Sub30) Static293.aClass14_39.method307();
										if (local1427 == null) {
											if (Static193.aClass68_8 == null) {
												Static110.anInt2578 = 0;
											}
											if (Static182.aClass68_7 != null) {
												Static117.method2079();
											}
											if (Static193.anInt3710 > 0 && Static334.aClass226_1.method4977(82) && Static334.aClass226_1.method4977(81) && Static411.anInt6846 != 0) {
												local409 = Static375.aClass3_Sub2_Sub1_Sub2_7.aByte89 - Static411.anInt6846;
												if (local409 < 0) {
													local409 = 0;
												} else if (local409 > 3) {
													local409 = 3;
												}
												Static379.method5082(local409, Static48.anInt962 + Static375.aClass3_Sub2_Sub1_Sub2_7.anIntArray525[0], Static375.aClass3_Sub2_Sub1_Sub2_7.anIntArray524[0] + Static324.anInt5624);
											}
											Static145.method2419();
											for (local409 = 0; local409 < 5; local409++) {
												@Pc(1634) int local1634 = Static323.anIntArray461[local409]++;
											}
											if (Static275.aBoolean376 && Static21.method458() - 60000L > Static449.aLong223) {
												Static415.method5522();
											}
											Static284.anInt5128++;
											if (Static284.anInt5128 > 500) {
												Static284.anInt5128 = 0;
												local131 = (int) (Math.random() * 8.0D);
												if ((local131 & 0x4) == 4) {
													Static279.anInt5093 += Static14.anInt343;
												}
												if ((local131 & 0x2) == 2) {
													Static197.anInt3801 += Static338.anInt6357;
												}
												if ((local131 & 0x1) == 1) {
													Static343.anInt5854 += Static370.anInt6352;
												}
											}
											if (Static343.anInt5854 < -50) {
												Static370.anInt6352 = 2;
											}
											if (Static197.anInt3801 < -55) {
												Static338.anInt6357 = 2;
											}
											if (Static343.anInt5854 > 50) {
												Static370.anInt6352 = -2;
											}
											if (Static197.anInt3801 > 55) {
												Static338.anInt6357 = -2;
											}
											if (Static279.anInt5093 < -40) {
												Static14.anInt343 = 1;
											}
											Static197.anInt3805++;
											if (Static279.anInt5093 > 40) {
												Static14.anInt343 = -1;
											}
											if (Static197.anInt3805 > 500) {
												Static197.anInt3805 = 0;
												local131 = (int) (Math.random() * 8.0D);
												if ((local131 & 0x2) == 2) {
													Static261.anInt4889 += Static218.anInt4198;
												}
												if ((local131 & 0x1) == 1) {
													Static166.anInt3321 += Static194.anInt3718;
												}
											}
											if (Static166.anInt3321 < -60) {
												Static194.anInt3718 = 2;
											}
											if (Static166.anInt3321 > 60) {
												Static194.anInt3718 = -2;
											}
											if (Static261.anInt4889 < -20) {
												Static218.anInt4198 = 1;
											}
											if (Static261.anInt4889 > 10) {
												Static218.anInt4198 = -1;
											}
											Static385.anInt6455++;
											if (Static385.anInt6455 > 50) {
												Static159.method2586(Static104.aClass54_34);
											}
											if (Static354.aBoolean421) {
												Static260.method3925();
												Static354.aBoolean421 = false;
											}
											try {
												if (Static34.aClass34_2 != null && Static424.aClass2_Sub23_Sub2_1.anInt6952 > 0) {
													Static67.anInt1493 += Static424.aClass2_Sub23_Sub2_1.anInt6952;
													Static34.aClass34_2.method606(Static424.aClass2_Sub23_Sub2_1.anInt6952, Static424.aClass2_Sub23_Sub2_1.aByteArray130);
													Static385.anInt6455 = 0;
													Static424.aClass2_Sub23_Sub2_1.anInt6952 = 0;
													return;
												}
												return;
											} catch (@Pc(1842) IOException local1842) {
												Static76.method1391();
												return;
											}
										}
										local1432 = local1427.aClass68_12;
										if (local1432.anInt2215 < 0) {
											break;
										}
										local837 = Static165.method2704(local1432.anInt2221);
									} while (local837 == null || local837.aClass68Array1 == null || local1432.anInt2215 >= local837.aClass68Array1.length || local1432 != local837.aClass68Array1[local1432.anInt2215]);
									Static168.method2731(local1427);
								}
							}
							local1432 = local1427.aClass68_12;
							if (local1432.anInt2215 < 0) {
								break;
							}
							local837 = Static165.method2704(local1432.anInt2221);
						} while (local837 == null || local837.aClass68Array1 == null || local837.aClass68Array1.length <= local1432.anInt2215 || local1432 != local837.aClass68Array1[local1432.anInt2215]);
						Static168.method2731(local1427);
					}
				}
				local1432 = local1427.aClass68_12;
				if (local1432.anInt2215 < 0) {
					break;
				}
				local837 = Static165.method2704(local1432.anInt2221);
			} while (local837 == null || local837.aClass68Array1 == null || local1432.anInt2215 >= local837.aClass68Array1.length || local1432 != local837.aClass68Array1[local1432.anInt2215]);
			Static168.method2731(local1427);
		}
	}
}
