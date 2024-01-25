import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "[[S")
	public static short[][] aShortArrayArray5;

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_80 = new Class25(1, 8);

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
	public static int anInt4995 = 0;

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "[I")
	public static final int[] anIntArray449 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_86 = new Class186(105, 3);

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
	public static void method4404() {
		if (Static96.anInt1785 > 1) {
			Static29.anInt445 = Static323.anInt5265;
			Static96.anInt1785--;
		}
		if (Static275.anInt4710 > 0) {
			Static275.anInt4710--;
		}
		if (Static234.aBoolean264) {
			Static234.aBoolean264 = false;
			Static109.method1806();
			return;
		}
		if (!Static206.aBoolean239) {
			Static95.method1651();
		}
		for (@Pc(38) int local38 = 0; local38 < 100 && Static415.method5627(); local38++) {
		}
		if (Static54.anInt1123 != 30) {
			return;
		}
		Static202.method3183(Static25.aClass25_113.method360(), Static449.aClass6_Sub15_Sub1_2);
		if (Static361.aClass6_Sub22_2 == null) {
			if (Static274.aLong150 <= Static154.method2527()) {
				Static361.aClass6_Sub22_2 = Static274.aClass172_1.method3956(Static367.aString66);
			}
		} else if (Static361.aClass6_Sub22_2.anInt4140 != -1) {
			Static298.method4373(Static116.aClass25_26);
			Static449.aClass6_Sub15_Sub1_2.method3100(Static361.aClass6_Sub22_2.anInt4140);
			Static361.aClass6_Sub22_2 = null;
			Static274.aLong150 = Static154.method2527() + 30000L;
		}
		@Pc(107) Class6_Sub7 local107 = (Class6_Sub7) Static254.aClass88_34.method1882();
		@Pc(125) int local125;
		@Pc(147) int local147;
		@Pc(169) int local169;
		@Pc(182) boolean local182;
		@Pc(232) int local232;
		@Pc(239) int local239;
		@Pc(251) int local251;
		if (local107 != null || Static154.method2527() - 2000L > Static244.aLong132) {
			@Pc(122) boolean local122 = false;
			local125 = Static449.aClass6_Sub15_Sub1_2.anInt3487;
			for (@Pc(130) Class6_Sub7 local130 = (Class6_Sub7) Static181.aClass88_28.method1882(); local130 != null && Static449.aClass6_Sub15_Sub1_2.anInt3487 - local125 < 240; local130 = (Class6_Sub7) Static181.aClass88_28.method1891()) {
				local130.method5977();
				local147 = local130.method1258();
				if (local147 < 0) {
					local147 = 0;
				} else if (local147 > 65534) {
					local147 = 65534;
				}
				local169 = local130.method1257();
				if (local169 < 0) {
					local169 = 0;
				} else if (local169 > 65534) {
					local169 = 65534;
				}
				local182 = false;
				if (local130.method1258() == -1 && local130.method1257() == -1) {
					local169 = -1;
					local147 = -1;
					local182 = true;
				}
				if (Static27.anInt437 != local169 || Static373.anInt1820 != local147) {
					if (!local122) {
						Static298.method4373(Static444.aClass25_109);
						Static449.aClass6_Sub15_Sub1_2.method3075(0);
						local122 = true;
						local125 = Static449.aClass6_Sub15_Sub1_2.anInt3487;
					}
					local232 = local169 - Static27.anInt437;
					Static27.anInt437 = local169;
					local239 = local147 - Static373.anInt1820;
					Static373.anInt1820 = local147;
					local251 = (int) ((local130.method1259() - Static244.aLong132) / 20L);
					if (local251 < 8 && local232 >= -32 && local232 <= 31 && local239 >= -32 && local239 <= 31) {
						local239 += 32;
						local232 += 32;
						Static449.aClass6_Sub15_Sub1_2.method3100((local251 << 12) - (-(local232 << 6) - local239));
					} else if (local251 < 32 && local232 >= -128 && local232 <= 127 && local239 >= -128 && local239 <= 127) {
						local239 += 128;
						local232 += 128;
						Static449.aClass6_Sub15_Sub1_2.method3075(local251 + 128);
						Static449.aClass6_Sub15_Sub1_2.method3100(local239 + (local232 << 8));
					} else if (local251 >= 32) {
						Static449.aClass6_Sub15_Sub1_2.method3100(local251 + 57344);
						if (local182) {
							Static449.aClass6_Sub15_Sub1_2.method3107(Integer.MIN_VALUE);
						} else {
							Static449.aClass6_Sub15_Sub1_2.method3107(local169 | local147 << 16);
						}
					} else {
						Static449.aClass6_Sub15_Sub1_2.method3075(local251 + 192);
						if (local182) {
							Static449.aClass6_Sub15_Sub1_2.method3107(Integer.MIN_VALUE);
						} else {
							Static449.aClass6_Sub15_Sub1_2.method3107(local169 | local147 << 16);
						}
					}
					Static244.aLong132 = local130.method1259();
				}
			}
			if (local122) {
				Static449.aClass6_Sub15_Sub1_2.method3118(Static449.aClass6_Sub15_Sub1_2.anInt3487 - local125);
			}
		}
		@Pc(427) int local427;
		@Pc(477) int local477;
		if (local107 != null) {
			@Pc(411) long local411 = (local107.method1259() - Static269.aLong146) / 50L;
			Static269.aLong146 = local107.method1259();
			if (local411 > 32767L) {
				local411 = 32767L;
			}
			local427 = local107.method1258();
			if (local427 < 0) {
				local427 = 0;
			} else if (local427 > 65535) {
				local427 = 65535;
			}
			local147 = local107.method1257();
			if (local147 < 0) {
				local147 = 0;
			} else if (local147 > 65535) {
				local147 = 65535;
			}
			@Pc(460) byte local460 = 0;
			if (local107.method1261() == 2) {
				local460 = 1;
			}
			Static298.method4373(Static273.aClass25_71);
			local477 = (int) local411;
			Static449.aClass6_Sub15_Sub1_2.method3113(local427 << 16 | local147);
			Static449.aClass6_Sub15_Sub1_2.method3117(local477 | local460 << 15);
		}
		@Pc(500) int local500;
		if (Static203.anInt3583 > 0) {
			local500 = 0;
			for (local125 = 0; local125 < Static203.anInt3583; local125++) {
				if (Static370.aClass139Array1[local125].method3204()) {
					local500++;
				}
			}
			if (local500 > 0) {
				if (local500 > 75) {
					local500 = 75;
				}
				Static298.method4373(Static368.aClass25_98);
				Static449.aClass6_Sub15_Sub1_2.method3075(local500 * 3);
				for (local427 = 0; local427 < Static203.anInt3583; local427++) {
					@Pc(550) Class139 local550 = Static370.aClass139Array1[local427];
					if (local550.method3204()) {
						@Pc(562) long local562 = (local550.method3203() - Static49.aLong29) / 50L;
						Static49.aLong29 = local550.method3203();
						if (local562 > 65535L) {
							local562 = 65535L;
						}
						Static449.aClass6_Sub15_Sub1_2.method3075(local550.method3202());
						Static449.aClass6_Sub15_Sub1_2.method3100((int) local562);
					}
				}
			}
		}
		if (Static269.anInt4608 > 0) {
			Static269.anInt4608--;
		}
		if (Static165.aBoolean204 && Static269.anInt4608 <= 0) {
			Static165.aBoolean204 = false;
			Static269.anInt4608 = 20;
			Static298.method4373(Static319.aClass25_84);
			Static449.aClass6_Sub15_Sub1_2.method3136((int) Static397.aFloat99 >> 3);
			Static449.aClass6_Sub15_Sub1_2.method3117((int) Static367.aFloat104 >> 3);
		}
		if (Static343.aBoolean385 && !Static390.aBoolean442) {
			Static390.aBoolean442 = true;
			Static298.method4373(Static446.aClass25_118);
			Static449.aClass6_Sub15_Sub1_2.method3075(1);
		}
		if (!Static343.aBoolean385 && Static390.aBoolean442) {
			Static390.aBoolean442 = false;
			Static298.method4373(Static446.aClass25_118);
			Static449.aClass6_Sub15_Sub1_2.method3075(0);
		}
		if (!Static59.aBoolean106) {
			Static298.method4373(Static194.aClass25_92);
			Static449.aClass6_Sub15_Sub1_2.method3075(0);
			local500 = Static449.aClass6_Sub15_Sub1_2.anInt3487;
			@Pc(686) Class6_Sub15 local686 = Static8.aClass173_Sub1_1.method3973();
			Static449.aClass6_Sub15_Sub1_2.method3135(local686.anInt3487, local686.aByteArray51);
			Static449.aClass6_Sub15_Sub1_2.method3118(Static449.aClass6_Sub15_Sub1_2.anInt3487 - local500);
			Static59.aBoolean106 = true;
		}
		if (Static30.aClass189ArrayArrayArray2 != null) {
			if (Static9.anInt164 == 2) {
				Static343.method4832();
			} else if (Static9.anInt164 == 3) {
				Static429.method5847();
			}
		}
		if (Static241.aBoolean268) {
			Static241.aBoolean268 = false;
		} else {
			Static74.aFloat6 /= 2.0F;
		}
		if (Static270.aBoolean332) {
			Static270.aBoolean332 = false;
		} else {
			Static201.aFloat66 /= 2.0F;
		}
		Static20.method283();
		if (Static54.anInt1123 != 30) {
			return;
		}
		Static312.method4468();
		Static251.method3870();
		Static367.method5801();
		Static434.method5878();
		Static344.anInt5771++;
		if (Static344.anInt5771 > 750) {
			Static109.method1806();
			return;
		}
		Static246.method3783();
		Static155.method2533();
		Static443.method5936();
		for (local500 = Static71.aClass126_1.method2808(true); local500 != -1; local500 = Static71.aClass126_1.method2808(false)) {
			Static287.method4279(local500);
			Static254.anIntArray328[Static383.anInt6311++ & 0x1F] = local500;
		}
		@Pc(924) Class239 local924;
		for (@Pc(809) Class6_Sub1_Sub12 local809 = Static195.method3063(); local809 != null; local809 = Static195.method3063()) {
			local427 = local809.method3045();
			local147 = local809.method3044();
			if (local427 == 1) {
				Static235.anIntArray358[local147] = local809.anInt3397;
				Static243.aBoolean270 |= Static434.aBooleanArray27[local147];
				Static104.anIntArray199[Static71.anInt1485++ & 0x1F] = local147;
			} else if (local427 == 2) {
				Static307.aStringArray18[local147] = local809.aString32;
				Static335.anIntArray501[Static332.anInt5636++ & 0x1F] = local147;
			} else if (local427 == 3) {
				local924 = Static299.method4387(local147);
				if (!local809.aString32.equals(local924.aString59)) {
					local924.aString59 = local809.aString32;
					Static354.method4992(local924);
				}
			} else if (local427 == 4) {
				local924 = Static299.method4387(local147);
				local477 = local809.anInt3397;
				local232 = local809.anInt3403;
				local239 = local809.anInt3400;
				if (local477 != local924.anInt6446 || local232 != local924.anInt6426 || local924.anInt6413 != local239) {
					local924.anInt6426 = local232;
					local924.anInt6446 = local477;
					local924.anInt6413 = local239;
					Static354.method4992(local924);
				}
			} else if (local427 == 5) {
				local924 = Static299.method4387(local147);
				if (local809.anInt3397 != local924.anInt6493 || local809.anInt3397 == -1) {
					local924.anInt6469 = 1;
					local924.anInt6498 = 0;
					local924.anInt6460 = 0;
					local924.anInt6493 = local809.anInt3397;
					Static354.method4992(local924);
				}
			} else if (local427 == 6) {
				local169 = local809.anInt3397;
				local477 = local169 >> 10 & 0x1F;
				local232 = local169 >> 5 & 0x1F;
				local239 = local169 & 0x1F;
				local251 = (local232 << 11) + (local477 << 19) + (local239 << 3);
				@Pc(905) Class239 local905 = Static299.method4387(local147);
				if (local251 != local905.anInt6431) {
					local905.anInt6431 = local251;
					Static354.method4992(local905);
				}
			} else if (local427 == 7) {
				local924 = Static299.method4387(local147);
				local182 = local809.anInt3397 == 1;
				if (local182 != local924.aBoolean428) {
					local924.aBoolean428 = local182;
					Static354.method4992(local924);
				}
			} else if (local427 == 8) {
				local924 = Static299.method4387(local147);
				if (local924.anInt6458 != local809.anInt3397 || local809.anInt3403 != local924.anInt6449 || local924.anInt6462 != local809.anInt3400) {
					local924.anInt6449 = local809.anInt3403;
					local924.anInt6458 = local809.anInt3397;
					local924.anInt6462 = local809.anInt3400;
					if (local924.anInt6492 != -1) {
						if (local924.anInt6407 > 0) {
							local924.anInt6462 = local924.anInt6462 * 32 / local924.anInt6407;
						} else if (local924.anInt6459 > 0) {
							local924.anInt6462 = local924.anInt6462 * 32 / local924.anInt6459;
						}
					}
					Static354.method4992(local924);
				}
			} else if (local427 == 9) {
				local924 = Static299.method4387(local147);
				if (local924.anInt6492 != local809.anInt3397 || local809.anInt3403 != local924.anInt6466) {
					local924.anInt6492 = local809.anInt3397;
					local924.anInt6466 = local809.anInt3403;
					Static354.method4992(local924);
				}
			} else if (local427 == 10) {
				local924 = Static299.method4387(local147);
				if (local809.anInt3397 != local924.anInt6496 || local924.anInt6463 != local809.anInt3403 || local809.anInt3400 != local924.anInt6486) {
					local924.anInt6463 = local809.anInt3403;
					local924.anInt6496 = local809.anInt3397;
					local924.anInt6486 = local809.anInt3400;
					Static354.method4992(local924);
				}
			} else if (local427 == 11) {
				local924 = Static299.method4387(local147);
				local924.anInt6484 = local924.anInt6454 = local809.anInt3397;
				local924.aByte90 = 0;
				local924.aByte91 = 0;
				local924.anInt6483 = local924.anInt6485 = local809.anInt3403;
				Static354.method4992(local924);
			} else if (local427 == 12) {
				local924 = Static299.method4387(local147);
				local477 = local809.anInt3397;
				if (local924 != null && local924.anInt6447 == 0) {
					if (local924.anInt6440 - local924.anInt6408 < local477) {
						local477 = local924.anInt6440 - local924.anInt6408;
					}
					if (local477 < 0) {
						local477 = 0;
					}
					if (local477 != local924.anInt6438) {
						local924.anInt6438 = local477;
						Static354.method4992(local924);
					}
				}
			} else if (local427 == 14) {
				local924 = Static299.method4387(local147);
				local924.anInt6455 = local809.anInt3397;
			} else if (local427 == 15) {
				Static58.anInt1221 = local809.anInt3403;
				Static305.aBoolean353 = true;
				Static278.anInt4731 = local809.anInt3397;
			} else if (local427 == 16) {
				local924 = Static299.method4387(local147);
				local924.anInt6477 = local809.anInt3397;
			}
		}
		Static338.anInt5679++;
		if (Static80.anInt1571 != 0) {
			Static133.anInt2347 += 20;
			if (Static133.anInt2347 >= 400) {
				Static80.anInt1571 = 0;
			}
		}
		if (Static96.aClass239_4 != null) {
			Static38.anInt863++;
			if (Static38.anInt863 >= 15) {
				Static354.method4992(Static96.aClass239_4);
				Static96.aClass239_4 = null;
			}
		}
		Static178.aBoolean96 = false;
		Static332.aClass239_11 = null;
		Static297.aClass239_6 = null;
		Static6.aBoolean9 = false;
		Static311.method4459(-1, -1, null);
		Static297.method4368(-1, -1, null);
		if (!Static274.aBoolean336) {
			Static54.anInt1132 = -1;
		}
		Static346.method4859();
		Static323.anInt5265++;
		if (Static19.aBoolean16) {
			Static298.method4373(Static261.aClass25_67);
			Static449.aClass6_Sub15_Sub1_2.method3121(Static229.anInt3886 | Static266.anInt4570 << 28 | Static316.anInt7083 << 14);
			Static19.aBoolean16 = false;
		}
		while (true) {
			@Pc(1444) Class6_Sub29 local1444;
			@Pc(1449) Class239 local1449;
			do {
				local1444 = (Class6_Sub29) Static384.aClass88_42.method1881();
				if (local1444 == null) {
					while (true) {
						do {
							local1444 = (Class6_Sub29) Static446.aClass88_47.method1881();
							if (local1444 == null) {
								while (true) {
									do {
										local1444 = (Class6_Sub29) Static357.aClass88_41.method1881();
										if (local1444 == null) {
											if (Static332.aClass239_11 == null) {
												Static203.anInt3586 = 0;
											}
											if (Static332.aClass239_12 != null) {
												Static87.method1531();
											}
											if (Static221.anInt3810 > 0 && Static326.aClass86_1.method1867(82) && Static326.aClass86_1.method1867(81) && Static238.anInt4074 != 0) {
												local427 = Static134.aClass3_Sub3_Sub6_Sub1_1.aByte93 - Static238.anInt4074;
												if (local427 < 0) {
													local427 = 0;
												} else if (local427 > 3) {
													local427 = 3;
												}
												Static54.method1012(Static206.anInt3592 + Static134.aClass3_Sub3_Sub6_Sub1_1.anIntArray582[0], Static99.anInt1814 - -Static134.aClass3_Sub3_Sub6_Sub1_1.anIntArray583[0], local427);
											}
											Static429.method5852();
											for (local427 = 0; local427 < 5; local427++) {
												@Pc(1646) int local1646 = Static260.anIntArray398[local427]++;
											}
											if (Static243.aBoolean270 && Static424.aLong9 < Static154.method2527() - 60000L) {
												Static224.method3409();
											}
											Static25.anInt7192++;
											if (Static25.anInt7192 > 500) {
												Static25.anInt7192 = 0;
												local147 = (int) (Math.random() * 8.0D);
												if ((local147 & 0x2) == 2) {
													Static398.anInt6585 += Static430.anInt7161;
												}
												if ((local147 & 0x1) == 1) {
													Static61.anInt1259 += Static20.anInt367;
												}
												if ((local147 & 0x4) == 4) {
													Static59.anInt1235 += Static201.anInt3537;
												}
											}
											if (Static61.anInt1259 < -50) {
												Static20.anInt367 = 2;
											}
											if (Static398.anInt6585 < -55) {
												Static430.anInt7161 = 2;
											}
											if (Static61.anInt1259 > 50) {
												Static20.anInt367 = -2;
											}
											if (Static398.anInt6585 > 55) {
												Static430.anInt7161 = -2;
											}
											if (Static59.anInt1235 < -40) {
												Static201.anInt3537 = 1;
											}
											if (Static59.anInt1235 > 40) {
												Static201.anInt3537 = -1;
											}
											Static256.anInt4374++;
											if (Static256.anInt4374 > 500) {
												Static256.anInt4374 = 0;
												local147 = (int) (Math.random() * 8.0D);
												if ((local147 & 0x1) == 1) {
													Static71.anInt1484 += Static90.anInt1673;
												}
												if ((local147 & 0x2) == 2) {
													Static393.anInt5623 += Static280.anInt4775;
												}
											}
											if (Static71.anInt1484 < -60) {
												Static90.anInt1673 = 2;
											}
											if (Static71.anInt1484 > 60) {
												Static90.anInt1673 = -2;
											}
											if (Static393.anInt5623 < -20) {
												Static280.anInt4775 = 1;
											}
											Static367.anInt7089++;
											if (Static393.anInt5623 > 10) {
												Static280.anInt4775 = -1;
											}
											if (Static367.anInt7089 > 50) {
												Static298.method4373(Static405.aClass25_106);
											}
											if (Static179.aBoolean222) {
												Static134.method2178();
												Static179.aBoolean222 = false;
											}
											try {
												if (Static103.aClass30_1 != null && Static449.aClass6_Sub15_Sub1_2.anInt3487 > 0) {
													Static322.anInt5260 += Static449.aClass6_Sub15_Sub1_2.anInt3487;
													Static103.aClass30_1.method733(Static449.aClass6_Sub15_Sub1_2.aByteArray51, Static449.aClass6_Sub15_Sub1_2.anInt3487);
													Static367.anInt7089 = 0;
													Static449.aClass6_Sub15_Sub1_2.anInt3487 = 0;
													return;
												}
												return;
											} catch (@Pc(1866) IOException local1866) {
												Static109.method1806();
												return;
											}
										}
										local1449 = local1444.aClass239_10;
										if (local1449.anInt6487 < 0) {
											break;
										}
										local924 = Static299.method4387(local1449.anInt6479);
									} while (local924 == null || local924.aClass239Array1 == null || local1449.anInt6487 >= local924.aClass239Array1.length || local924.aClass239Array1[local1449.anInt6487] != local1449);
									Static308.method4424(local1444);
								}
							}
							local1449 = local1444.aClass239_10;
							if (local1449.anInt6487 < 0) {
								break;
							}
							local924 = Static299.method4387(local1449.anInt6479);
						} while (local924 == null || local924.aClass239Array1 == null || local1449.anInt6487 >= local924.aClass239Array1.length || local924.aClass239Array1[local1449.anInt6487] != local1449);
						Static308.method4424(local1444);
					}
				}
				local1449 = local1444.aClass239_10;
				if (local1449.anInt6487 < 0) {
					break;
				}
				local924 = Static299.method4387(local1449.anInt6479);
			} while (local924 == null || local924.aClass239Array1 == null || local1449.anInt6487 >= local924.aClass239Array1.length || local1449 != local924.aClass239Array1[local1449.anInt6487]);
			Static308.method4424(local1444);
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BLclient!hf;)[Lclient!il;")
	public static Class117[] method4405(@OriginalArg(1) Class103 arg0) {
		if (!arg0.method2356()) {
			return new Class117[0];
		}
		@Pc(16) Class249 local16 = arg0.method2354();
		while (local16.anInt6929 == 0) {
			Static170.method1617(10L);
		}
		if (local16.anInt6929 == 2) {
			return new Class117[0];
		}
		@Pc(37) int[] local37 = (int[]) local16.anObject10;
		@Pc(43) Class117[] local43 = new Class117[local37.length >> 2];
		for (@Pc(45) int local45 = 0; local45 < local43.length; local45++) {
			@Pc(51) Class117 local51 = new Class117();
			local43[local45] = local51;
			local51.anInt2944 = local37[local45 << 2];
			local51.anInt2939 = local37[(local45 << 2) + 1];
			local51.anInt2947 = local37[(local45 << 2) + 2];
			local51.anInt2945 = local37[(local45 << 2) + 3];
		}
		return local43;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIII)V")
	public static void method4406(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(18) Class6_Sub14 local18 = (Class6_Sub14) Static329.aClass88_40.method1882(); local18 != null; local18 = (Class6_Sub14) Static329.aClass88_40.method1891()) {
			Static439.method5908(arg1, local18, arg0, arg3, arg2);
		}
		for (@Pc(39) Class6_Sub14 local39 = (Class6_Sub14) Static170.aClass88_18.method1882(); local39 != null; local39 = (Class6_Sub14) Static170.aClass88_18.method1891()) {
			@Pc(43) byte local43 = 1;
			@Pc(48) Class208 local48 = local39.aClass3_Sub3_Sub6_Sub2_1.method5511();
			if (local39.aClass3_Sub3_Sub6_Sub2_1.aBoolean453) {
				local43 = 0;
			} else if (local39.aClass3_Sub3_Sub6_Sub2_1.anInt6735 == local48.anInt5574 || local39.aClass3_Sub3_Sub6_Sub2_1.anInt6735 == local48.anInt5595 || local48.anInt5570 == local39.aClass3_Sub3_Sub6_Sub2_1.anInt6735 || local48.anInt5555 == local39.aClass3_Sub3_Sub6_Sub2_1.anInt6735) {
				local43 = 2;
			} else if (local48.anInt5588 == local39.aClass3_Sub3_Sub6_Sub2_1.anInt6735 || local39.aClass3_Sub3_Sub6_Sub2_1.anInt6735 == local48.anInt5571 || local39.aClass3_Sub3_Sub6_Sub2_1.anInt6735 == local48.anInt5585 || local39.aClass3_Sub3_Sub6_Sub2_1.anInt6735 == local48.anInt5573) {
				local43 = 3;
			}
			if (local43 != local39.anInt2362) {
				@Pc(139) int local139 = Static402.method5467(local39.aClass3_Sub3_Sub6_Sub2_1);
				if (local139 != local39.anInt2361) {
					if (local39.aClass6_Sub5_Sub4_1 != null) {
						Static371.aClass6_Sub5_Sub2_2.method2168(local39.aClass6_Sub5_Sub4_1);
						local39.aClass6_Sub5_Sub4_1 = null;
					}
					local39.anInt2361 = local139;
				}
				local39.anInt2362 = local43;
			}
			local39.anInt2370 = local39.aClass3_Sub3_Sub6_Sub2_1.anInt6675;
			local39.anInt2368 = local39.aClass3_Sub3_Sub6_Sub2_1.anInt6675 + (local39.aClass3_Sub3_Sub6_Sub2_1.method5512() << 6);
			local39.anInt2369 = local39.aClass3_Sub3_Sub6_Sub2_1.anInt6677;
			local39.anInt2363 = local39.aClass3_Sub3_Sub6_Sub2_1.anInt6677 + (local39.aClass3_Sub3_Sub6_Sub2_1.method5512() << 6);
			Static439.method5908(arg1, local39, arg0, arg3, arg2);
		}
		for (@Pc(218) Class6_Sub14 local218 = (Class6_Sub14) Static417.aClass137_35.method3181(); local218 != null; local218 = (Class6_Sub14) Static417.aClass137_35.method3182()) {
			@Pc(222) byte local222 = 1;
			@Pc(227) Class208 local227 = local218.aClass3_Sub3_Sub6_Sub1_2.method5511();
			if (local218.aClass3_Sub3_Sub6_Sub1_2.aBoolean453) {
				local222 = 0;
			} else if (local227.anInt5574 == local218.aClass3_Sub3_Sub6_Sub1_2.anInt6735 || local227.anInt5595 == local218.aClass3_Sub3_Sub6_Sub1_2.anInt6735 || local218.aClass3_Sub3_Sub6_Sub1_2.anInt6735 == local227.anInt5570 || local227.anInt5555 == local218.aClass3_Sub3_Sub6_Sub1_2.anInt6735) {
				local222 = 2;
			} else if (local227.anInt5588 == local218.aClass3_Sub3_Sub6_Sub1_2.anInt6735 || local227.anInt5571 == local218.aClass3_Sub3_Sub6_Sub1_2.anInt6735 || local218.aClass3_Sub3_Sub6_Sub1_2.anInt6735 == local227.anInt5585 || local218.aClass3_Sub3_Sub6_Sub1_2.anInt6735 == local227.anInt5573) {
				local222 = 3;
			}
			if (local218.anInt2362 != local222) {
				@Pc(330) int local330 = Static158.method2617(local218.aClass3_Sub3_Sub6_Sub1_2);
				if (local330 != local218.anInt2361) {
					if (local218.aClass6_Sub5_Sub4_1 != null) {
						Static371.aClass6_Sub5_Sub2_2.method2168(local218.aClass6_Sub5_Sub4_1);
						local218.aClass6_Sub5_Sub4_1 = null;
					}
					local218.anInt2361 = local330;
				}
				local218.anInt2362 = local222;
			}
			local218.anInt2370 = local218.aClass3_Sub3_Sub6_Sub1_2.anInt6675;
			local218.anInt2368 = local218.aClass3_Sub3_Sub6_Sub1_2.anInt6675 + (local218.aClass3_Sub3_Sub6_Sub1_2.method5512() << 6);
			local218.anInt2369 = local218.aClass3_Sub3_Sub6_Sub1_2.anInt6677;
			local218.anInt2363 = local218.aClass3_Sub3_Sub6_Sub1_2.anInt6677 + (local218.aClass3_Sub3_Sub6_Sub1_2.method5512() << 6);
			Static439.method5908(arg1, local218, arg0, arg3, arg2);
		}
	}
}
