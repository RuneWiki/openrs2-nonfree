import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!ci", name = "E", descriptor = "I")
	public static int anInt1677;

	@OriginalMember(owner = "client!ci", name = "L", descriptor = "I")
	public static int anInt1681;

	@OriginalMember(owner = "client!ci", name = "H", descriptor = "Lclient!bn;")
	public static final Class33 aClass33_3 = new Class33(12, 4);

	@OriginalMember(owner = "client!ci", name = "J", descriptor = "[I")
	public static final int[] anIntArray157 = new int[4];

	@OriginalMember(owner = "client!ci", name = "K", descriptor = "[S")
	public static short[] aShortArray20 = new short[256];

	@OriginalMember(owner = "client!ci", name = "e", descriptor = "(I)V")
	public static void method1659() {
		if (Static228.anInt8958 > 1) {
			Static136.anInt3211 = Static418.anInt7279;
			Static228.anInt8958--;
		}
		if (Static5.aBoolean5) {
			Static5.aBoolean5 = false;
			Static317.method5198();
			return;
		}
		if (!Static25.aBoolean94) {
			Static515.method7351();
		}
		for (@Pc(27) int local27 = 0; local27 < 100 && Static126.method2777(); local27++) {
		}
		if (Static51.anInt7926 != 9) {
			return;
		}
		Static96.method2189(Static192.aClass1_Sub13_Sub2_1, Static385.aClass186_96.method4851());
		if (Static515.aClass1_Sub36_2 == null) {
			if (Static93.method2172() >= Static246.aLong123) {
				Static515.aClass1_Sub36_2 = Static27.aClass54_1.method1976(Static153.aClass130_5.aString26);
			}
		} else if (Static515.aClass1_Sub36_2.anInt6597 != -1) {
			Static444.method6416(Static468.aClass186_110);
			Static192.aClass1_Sub13_Sub2_1.method3038(Static515.aClass1_Sub36_2.anInt6597);
			Static515.aClass1_Sub36_2 = null;
			Static246.aLong123 = Static93.method2172() + 30000L;
		}
		@Pc(88) Class1_Sub41 local88 = (Class1_Sub41) Static407.aClass38_54.method1419();
		@Pc(126) int local126;
		@Pc(142) int local142;
		@Pc(193) int local193;
		@Pc(200) int local200;
		@Pc(211) int local211;
		if (local88 != null || Static396.aLong181 < Static93.method2172() - 2000L) {
			@Pc(103) boolean local103 = false;
			@Pc(106) int local106 = Static192.aClass1_Sub13_Sub2_1.anInt3400;
			for (@Pc(111) Class1_Sub41 local111 = (Class1_Sub41) Static507.aClass38_72.method1419(); local111 != null && Static192.aClass1_Sub13_Sub2_1.anInt3400 - local106 < 240; local111 = (Class1_Sub41) Static507.aClass38_72.method1415()) {
				local111.method7983();
				local126 = local111.method7866();
				if (local126 < -1) {
					local126 = -1;
				} else if (local126 > 65534) {
					local126 = 65534;
				}
				local142 = local111.method7870();
				if (local142 < -1) {
					local142 = -1;
				} else if (local142 > 65534) {
					local142 = 65534;
				}
				if (local142 != Static88.anInt2254 || Static275.anInt5398 != local126) {
					if (!local103) {
						Static444.method6416(Static447.aClass186_105);
						Static192.aClass1_Sub13_Sub2_1.method3060(0);
						local106 = Static192.aClass1_Sub13_Sub2_1.anInt3400;
						local103 = true;
					}
					local193 = local142 - Static88.anInt2254;
					Static88.anInt2254 = local142;
					local200 = local126 - Static275.anInt5398;
					Static275.anInt5398 = local126;
					local211 = (int) ((local111.method7871() - Static396.aLong181) / 20L);
					if (local211 < 8 && local193 >= -32 && local193 <= 31 && local200 >= -32 && local200 <= 31) {
						local200 += 32;
						local193 += 32;
						Static192.aClass1_Sub13_Sub2_1.method3038(local200 + (local193 << 6) + (local211 << 12));
					} else if (local211 < 32 && local193 >= -128 && local193 <= 127 && local200 >= -128 && local200 <= 127) {
						local200 += 128;
						local193 += 128;
						Static192.aClass1_Sub13_Sub2_1.method3060(local211 + 128);
						Static192.aClass1_Sub13_Sub2_1.method3038((local193 << 8) + local200);
					} else if (local211 < 32) {
						Static192.aClass1_Sub13_Sub2_1.method3060(local211 + 192);
						if (local142 == 1 || local126 == -1) {
							Static192.aClass1_Sub13_Sub2_1.method3069(Integer.MIN_VALUE);
						} else {
							Static192.aClass1_Sub13_Sub2_1.method3069(local126 << 16 | local142);
						}
					} else {
						Static192.aClass1_Sub13_Sub2_1.method3038(local211 + 57344);
						if (local142 == 1 || local126 == -1) {
							Static192.aClass1_Sub13_Sub2_1.method3069(Integer.MIN_VALUE);
						} else {
							Static192.aClass1_Sub13_Sub2_1.method3069(local126 << 16 | local142);
						}
					}
					Static396.aLong181 = local111.method7871();
				}
			}
			if (local103) {
				Static192.aClass1_Sub13_Sub2_1.method3077(Static192.aClass1_Sub13_Sub2_1.anInt3400 - local106);
			}
		}
		@Pc(398) int local398;
		if (local88 != null) {
			@Pc(382) long local382 = (local88.method7871() - Static456.aLong206) / 50L;
			if (local382 > 32767L) {
				local382 = 32767L;
			}
			Static456.aLong206 = local88.method7871();
			local398 = local88.method7866();
			if (local398 < 0) {
				local398 = 0;
			} else if (local398 > 65535) {
				local398 = 65535;
			}
			local126 = local88.method7870();
			if (local126 < 0) {
				local126 = 0;
			} else if (local126 > 65535) {
				local126 = 65535;
			}
			@Pc(427) byte local427 = 0;
			if (local88.method7875() == 2) {
				local427 = 1;
			}
			local193 = (int) local382;
			Static444.method6416(Static363.aClass186_112);
			Static192.aClass1_Sub13_Sub2_1.method3080(local398 << 16 | local126);
			Static192.aClass1_Sub13_Sub2_1.method3019(local427 << 15 | local193);
		}
		@Pc(484) int local484;
		if (Static200.anInt4238 > 0) {
			Static444.method6416(Static443.aClass186_103);
			Static192.aClass1_Sub13_Sub2_1.method3060(Static200.anInt4238 * 3);
			for (local484 = 0; local484 < Static200.anInt4238; local484++) {
				@Pc(489) Interface2 local489 = Static163.anInterface2Array1[local484];
				@Pc(497) long local497 = (local489.method7097() - Static196.aLong112) / 50L;
				if (local497 > 65535L) {
					local497 = 65535L;
				}
				Static196.aLong112 = local489.method7097();
				Static192.aClass1_Sub13_Sub2_1.method3060(local489.method7099());
				Static192.aClass1_Sub13_Sub2_1.method3038((int) local497);
			}
		}
		if (Static294.anInt5704 > 0) {
			Static294.anInt5704--;
		}
		if (Static126.aBoolean196 && Static294.anInt5704 <= 0) {
			Static126.aBoolean196 = false;
			Static294.anInt5704 = 20;
			Static444.method6416(Static307.aClass186_86);
			Static192.aClass1_Sub13_Sub2_1.method3023((int) Static362.aFloat128 >> 3);
			Static192.aClass1_Sub13_Sub2_1.method3019((int) Static443.aFloat151 >> 3);
		}
		if (Static109.aBoolean177 && !Static324.aBoolean418) {
			Static324.aBoolean418 = true;
			Static444.method6416(Static184.aClass186_59);
			Static192.aClass1_Sub13_Sub2_1.method3060(1);
		}
		if (!Static109.aBoolean177 && Static324.aBoolean418) {
			Static324.aBoolean418 = false;
			Static444.method6416(Static184.aClass186_59);
			Static192.aClass1_Sub13_Sub2_1.method3060(0);
		}
		if (!Static521.aBoolean614) {
			Static444.method6416(Static446.aClass186_104);
			Static192.aClass1_Sub13_Sub2_1.method3060(0);
			local484 = Static192.aClass1_Sub13_Sub2_1.anInt3400;
			@Pc(625) Class1_Sub13 local625 = new Class1_Sub13(Static81.method2029());
			Static89.aClass1_Sub28_Sub1_1.method4263(local625);
			Static192.aClass1_Sub13_Sub2_1.method3041(local625.aByteArray45, local625.anInt3400);
			Static192.aClass1_Sub13_Sub2_1.method3077(Static192.aClass1_Sub13_Sub2_1.anInt3400 - local484);
			Static521.aBoolean614 = true;
		}
		if (Static313.aClass206ArrayArrayArray2 != null) {
			if (Static464.anInt8003 == 2) {
				Static210.method3823();
			} else if (Static464.anInt8003 == 3) {
				Static294.method4944();
			}
		}
		if (Static305.aBoolean404) {
			Static305.aBoolean404 = false;
		} else {
			Static28.aFloat50 /= 2.0F;
		}
		if (Static32.aBoolean102) {
			Static32.aBoolean102 = false;
		} else {
			Static404.aFloat203 /= 2.0F;
		}
		Static128.method2800();
		if (Static51.anInt7926 != 9) {
			return;
		}
		Static432.method6371();
		Static43.method1387();
		Static150.method3009();
		Static198.method3658();
		Static215.anInt4441++;
		if (Static215.anInt4441 > 750) {
			Static317.method5198();
			return;
		}
		Static282.method4793();
		Static107.method2296();
		Static41.method1363();
		for (local484 = Static343.aClass286_1.method6995(true); local484 != -1; local484 = Static343.aClass286_1.method6995(false)) {
			Static192.method3616(local484);
			Static7.anIntArray14[Static267.anInt5165++ & 0x1F] = local484;
		}
		@Pc(848) Class309 local848;
		for (@Pc(754) Class1_Sub1_Sub13 local754 = Static285.method4843(); local754 != null; local754 = Static285.method4843()) {
			local398 = local754.method4924();
			local126 = local754.method4922();
			if (local398 == 1) {
				Static52.anIntArray138[local126] = local754.anInt5686;
				Static538.aBoolean651 |= Static99.aBooleanArray12[local126];
				Static66.anIntArray163[Static380.anInt6676++ & 0x1F] = local126;
			} else if (local398 == 2) {
				Static29.aStringArray5[local126] = local754.aString54;
				Static2.anIntArray400[Static194.anInt4069++ & 0x1F] = local126;
			} else if (local398 == 3) {
				local848 = Static80.method2005(local126);
				if (!local754.aString54.equals(local848.aString78)) {
					local848.aString78 = local754.aString54;
					Static291.method4908(local848);
				}
			} else if (local398 == 4) {
				local848 = Static80.method2005(local126);
				local193 = local754.anInt5686;
				local200 = local754.anInt5680;
				local211 = local754.anInt5690;
				if (local848.anInt8792 != local193 || local848.anInt8794 != local200 || local848.anInt8778 != local211) {
					local848.anInt8778 = local211;
					local848.anInt8794 = local200;
					local848.anInt8792 = local193;
					Static291.method4908(local848);
				}
			} else if (local398 == 5) {
				local848 = Static80.method2005(local126);
				if (local754.anInt5686 != local848.anInt8766 || local754.anInt5686 == -1) {
					local848.anInt8766 = local754.anInt5686;
					local848.anInt8776 = 1;
					local848.anInt8738 = 0;
					local848.anInt8791 = 0;
					Static291.method4908(local848);
				}
			} else if (local398 == 6) {
				local142 = local754.anInt5686;
				local193 = local142 >> 10 & 0x1F;
				local200 = local142 >> 5 & 0x1F;
				local211 = local142 & 0x1F;
				@Pc(819) int local819 = (local193 << 19) + (local200 << 11) + (local211 << 3);
				@Pc(823) Class309 local823 = Static80.method2005(local126);
				if (local823.anInt8729 != local819) {
					local823.anInt8729 = local819;
					Static291.method4908(local823);
				}
			} else if (local398 == 7) {
				local848 = Static80.method2005(local126);
				@Pc(1149) boolean local1149 = local754.anInt5686 == 1;
				if (local1149 != local848.aBoolean608) {
					local848.aBoolean608 = local1149;
					Static291.method4908(local848);
				}
			} else if (local398 == 8) {
				local848 = Static80.method2005(local126);
				if (local754.anInt5686 != local848.anInt8724 || local754.anInt5680 != local848.anInt8757 || local754.anInt5690 != local848.anInt8805) {
					local848.anInt8724 = local754.anInt5686;
					local848.anInt8805 = local754.anInt5690;
					local848.anInt8757 = local754.anInt5680;
					if (local848.anInt8735 != -1) {
						if (local848.anInt8781 > 0) {
							local848.anInt8805 = local848.anInt8805 * 32 / local848.anInt8781;
						} else if (local848.anInt8745 > 0) {
							local848.anInt8805 = local848.anInt8805 * 32 / local848.anInt8745;
						}
					}
					Static291.method4908(local848);
				}
			} else if (local398 == 9) {
				local848 = Static80.method2005(local126);
				if (local754.anInt5686 != local848.anInt8735 || local754.anInt5680 != local848.anInt8741) {
					local848.anInt8741 = local754.anInt5680;
					local848.anInt8735 = local754.anInt5686;
					Static291.method4908(local848);
				}
			} else if (local398 == 10) {
				local848 = Static80.method2005(local126);
				if (local848.anInt8723 != local754.anInt5686 || local848.anInt8725 != local754.anInt5680 || local754.anInt5690 != local848.anInt8763) {
					local848.anInt8763 = local754.anInt5690;
					local848.anInt8723 = local754.anInt5686;
					local848.anInt8725 = local754.anInt5680;
					Static291.method4908(local848);
				}
			} else if (local398 == 11) {
				local848 = Static80.method2005(local126);
				local848.aByte108 = 0;
				local848.aByte106 = 0;
				local848.anInt8777 = local848.anInt8765 = local754.anInt5680;
				local848.anInt8744 = local848.anInt8720 = local754.anInt5686;
				Static291.method4908(local848);
			} else if (local398 == 12) {
				local848 = Static80.method2005(local126);
				local193 = local754.anInt5686;
				if (local848 != null && local848.anInt8802 == 0) {
					if (local193 > local848.anInt8775 - local848.anInt8752) {
						local193 = local848.anInt8775 - local848.anInt8752;
					}
					if (local193 < 0) {
						local193 = 0;
					}
					if (local193 != local848.anInt8721) {
						local848.anInt8721 = local193;
						Static291.method4908(local848);
					}
				}
			} else if (local398 == 14) {
				local848 = Static80.method2005(local126);
				local848.anInt8767 = local754.anInt5686;
			} else if (local398 == 15) {
				Static540.anInt9357 = local754.anInt5686;
				Static79.aBoolean156 = true;
				Static417.anInt6093 = local754.anInt5680;
			} else if (local398 == 16) {
				local848 = Static80.method2005(local126);
				local848.anInt8799 = local754.anInt5686;
			}
		}
		if (Static302.anInt5846 != 0) {
			Static222.anInt4503 += 20;
			if (Static222.anInt4503 >= 400) {
				Static302.anInt5846 = 0;
			}
		}
		Static309.anInt5936++;
		if (Static447.aClass309_12 != null) {
			Static183.anInt3920++;
			if (Static183.anInt3920 >= 15) {
				Static291.method4908(Static447.aClass309_12);
				Static447.aClass309_12 = null;
			}
		}
		Static201.aBoolean257 = false;
		Static88.aClass309_4 = null;
		Static29.aClass309_2 = null;
		Static519.aBoolean611 = false;
		Static21.method868(null, -1, -1);
		Static55.method1546(-1, -1, null);
		if (!Static382.aBoolean440) {
			Static151.anInt3437 = -1;
		}
		Static255.method4302();
		Static418.anInt7279++;
		if (Static194.aBoolean247) {
			Static444.method6416(Static185.aClass186_60);
			Static192.aClass1_Sub13_Sub2_1.method3080(Static373.anInt6582 << 28 | Static230.anInt4565 << 14 | Static372.anInt6575);
			Static194.aBoolean247 = false;
		}
		while (true) {
			@Pc(1404) Class1_Sub40 local1404;
			@Pc(1409) Class309 local1409;
			do {
				local1404 = (Class1_Sub40) Static237.aClass38_35.method1423();
				if (local1404 == null) {
					while (true) {
						do {
							local1404 = (Class1_Sub40) Static111.aClass38_22.method1423();
							if (local1404 == null) {
								while (true) {
									do {
										local1404 = (Class1_Sub40) Static524.aClass38_75.method1423();
										if (local1404 == null) {
											if (Static88.aClass309_4 == null) {
												Static372.anInt6577 = 0;
											}
											if (Static279.aClass309_6 != null) {
												Static34.method1306();
											}
											if (Static351.anInt6430 > 0 && Static126.aClass60_1.method5384(82) && Static126.aClass60_1.method5384(81) && Static430.anInt7441 != 0) {
												local398 = Static16.aClass47_Sub2_Sub3_Sub2_1.aByte94 - Static430.anInt7441;
												if (local398 < 0) {
													local398 = 0;
												} else if (local398 > 3) {
													local398 = 3;
												}
												Static86.method2085(local398, Static517.anInt8716 + Static16.aClass47_Sub2_Sub3_Sub2_1.anIntArray361[0], Static324.anInt6132 - -Static16.aClass47_Sub2_Sub3_Sub2_1.anIntArray362[0]);
											}
											Static373.method5708();
											for (local398 = 0; local398 < 5; local398++) {
												@Pc(1599) int local1599 = Static480.anIntArray637[local398]++;
											}
											if (Static538.aBoolean651 && Static132.aLong82 < Static93.method2172() - 60000L) {
												Static466.method6817();
											}
											for (@Pc(1624) Class2_Sub4_Sub2 local1624 = (Class2_Sub4_Sub2) Static201.aClass145_4.method3919(); local1624 != null; local1624 = (Class2_Sub4_Sub2) Static201.aClass145_4.method3926()) {
												if ((long) local1624.anInt6564 < Static93.method2172() / 1000L - 5L) {
													if (local1624.aShort98 > 0) {
														Static310.method5136("", "", 5, 0, local1624.aString60 + Static111.aClass114_54.method3330(Static315.anInt5993));
													}
													if (local1624.aShort98 == 0) {
														Static310.method5136("", "", 5, 0, local1624.aString60 + Static28.aClass114_16.method3330(Static315.anInt5993));
													}
													local1624.method7890();
												}
											}
											Static503.anInt8542++;
											if (Static503.anInt8542 > 500) {
												Static503.anInt8542 = 0;
												local142 = (int) (Math.random() * 8.0D);
												if ((local142 & 0x1) == 1) {
													Static186.anInt3940 += Static344.anInt6400;
												}
												if ((local142 & 0x4) == 4) {
													Static157.anInt3480 += Static454.anInt7630;
												}
												if ((local142 & 0x2) == 2) {
													Static403.anInt8578 += Static44.anInt1390;
												}
											}
											if (Static186.anInt3940 < -50) {
												Static344.anInt6400 = 2;
											}
											if (Static186.anInt3940 > 50) {
												Static344.anInt6400 = -2;
											}
											if (Static403.anInt8578 < -55) {
												Static44.anInt1390 = 2;
											}
											if (Static157.anInt3480 < -40) {
												Static454.anInt7630 = 1;
											}
											if (Static403.anInt8578 > 55) {
												Static44.anInt1390 = -2;
											}
											if (Static157.anInt3480 > 40) {
												Static454.anInt7630 = -1;
											}
											Static198.anInt4111++;
											if (Static198.anInt4111 > 500) {
												Static198.anInt4111 = 0;
												local142 = (int) (Math.random() * 8.0D);
												if ((local142 & 0x2) == 2) {
													Static189.anInt4000 += Static457.anInt7868;
												}
												if ((local142 & 0x1) == 1) {
													Static96.anInt2375 += Static354.anInt6469;
												}
											}
											if (Static96.anInt2375 < -60) {
												Static354.anInt6469 = 2;
											}
											if (Static189.anInt4000 < -20) {
												Static457.anInt7868 = 1;
											}
											if (Static96.anInt2375 > 60) {
												Static354.anInt6469 = -2;
											}
											if (Static189.anInt4000 > 10) {
												Static457.anInt7868 = -1;
											}
											Static288.anInt5629++;
											if (Static288.anInt5629 > 50) {
												Static444.method6416(Static438.aClass186_36);
											}
											if (Static242.aBoolean147) {
												Static256.method4322();
												Static242.aBoolean147 = false;
											}
											try {
												if (Static453.aClass154_1 != null && Static192.aClass1_Sub13_Sub2_1.anInt3400 > 0) {
													Static178.anInt3816 += Static192.aClass1_Sub13_Sub2_1.anInt3400;
													Static453.aClass154_1.method4023(Static192.aClass1_Sub13_Sub2_1.anInt3400, Static192.aClass1_Sub13_Sub2_1.aByteArray45);
													Static288.anInt5629 = 0;
													Static192.aClass1_Sub13_Sub2_1.anInt3400 = 0;
													return;
												}
												return;
											} catch (@Pc(1886) IOException local1886) {
												Static317.method5198();
												return;
											}
										}
										local1409 = local1404.aClass309_10;
										if (local1409.anInt8726 < 0) {
											break;
										}
										local848 = Static80.method2005(local1409.anInt8764);
									} while (local848 == null || local848.lb == null || local1409.anInt8726 >= local848.lb.length || local1409 != local848.lb[local1409.anInt8726]);
									Static387.method5838(local1404);
								}
							}
							local1409 = local1404.aClass309_10;
							if (local1409.anInt8726 < 0) {
								break;
							}
							local848 = Static80.method2005(local1409.anInt8764);
						} while (local848 == null || local848.lb == null || local848.lb.length <= local1409.anInt8726 || local848.lb[local1409.anInt8726] != local1409);
						Static387.method5838(local1404);
					}
				}
				local1409 = local1404.aClass309_10;
				if (local1409.anInt8726 < 0) {
					break;
				}
				local848 = Static80.method2005(local1409.anInt8764);
			} while (local848 == null || local848.lb == null || local1409.anInt8726 >= local848.lb.length || local1409 != local848.lb[local1409.anInt8726]);
			Static387.method5838(local1404);
		}
	}
}
