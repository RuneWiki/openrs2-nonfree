import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!or", name = "e", descriptor = "[I")
	public static int[] anIntArray535;

	@OriginalMember(owner = "client!or", name = "f", descriptor = "I")
	public static int anInt6708;

	@OriginalMember(owner = "client!or", name = "n", descriptor = "I")
	public static int anInt6715;

	@OriginalMember(owner = "client!or", name = "p", descriptor = "[[B")
	public static byte[][] aByteArrayArray25;

	@OriginalMember(owner = "client!or", name = "g", descriptor = "I")
	public static int anInt6709 = 127;

	@OriginalMember(owner = "client!or", name = "j", descriptor = "I")
	public static int anInt6712 = 1;

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IIBIIII)V")
	public static void method5577(@OriginalArg(0) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(14) Class17_Sub8 local14 = (Class17_Sub8) Static71.aClass204_2.method5359(); local14 != null; local14 = (Class17_Sub8) Static71.aClass204_2.method5357()) {
			if (Static342.anInt6706 >= local14.anInt5730) {
				local14.method5473();
			} else {
				Static50.method927((local14.anInt5732 << 7) + 64, arg3 >> 1, arg1 >> 1, local14.anInt5737 * 2, (local14.anInt5731 << 7) + 64);
				Static81.aClass78_2.method4072(local14.aString210, arg2 + Static257.anIntArray436[0], local14.anInt5729 | 0xFF000000, 0, Static257.anIntArray436[1] + arg0);
			}
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(I)V")
	public static void method5578() {
		if (Static296.anInt5970 > 1) {
			Static296.anInt5970--;
			Static113.anInt6473 = Static344.anInt6736;
		}
		if (Static49.anInt1089 > 0) {
			Static49.anInt1089--;
		}
		if (Static355.aBoolean596) {
			Static355.aBoolean596 = false;
			Static181.method3368();
			return;
		}
		if (!Static173.aBoolean319) {
			Static67.method1256();
		}
		for (@Pc(33) int local33 = 0; local33 < 100 && Static332.method5465(); local33++) {
		}
		if (Static139.anInt3135 != 30) {
			return;
		}
		Static193.method3503(Static320.aClass4_Sub7_Sub1_3);
		@Pc(57) Object local57 = Static165.aClass67_5.anObject3;
		@Pc(82) int local82;
		@Pc(84) int local84;
		@Pc(86) int local86;
		@Pc(103) int local103;
		@Pc(121) int local121;
		@Pc(179) int local179;
		synchronized (Static165.aClass67_5.anObject3) {
			if (!Static153.aBoolean285) {
				Static165.aClass67_5.anInt1691 = 0;
			} else if (Static9.anInt6461 != 0 || Static165.aClass67_5.anInt1691 >= 40) {
				Static320.aClass4_Sub7_Sub1_3.method1237(0);
				Static320.aClass4_Sub7_Sub1_3.method2416(0);
				local82 = Static320.aClass4_Sub7_Sub1_3.anInt2667;
				local84 = 0;
				for (local86 = 0; Static165.aClass67_5.anInt1691 > local86 && Static320.aClass4_Sub7_Sub1_3.anInt2667 - local82 < 240; local86++) {
					local84++;
					local103 = Static165.aClass67_5.anIntArray171[local86];
					if (local103 < 0) {
						local103 = 0;
					} else if (local103 > 65534) {
						local103 = 65534;
					}
					local121 = Static165.aClass67_5.anIntArray170[local86];
					if (local121 < 0) {
						local121 = 0;
					} else if (local121 > 65534) {
						local121 = 65534;
					}
					@Pc(134) boolean local134 = false;
					if (Static165.aClass67_5.anIntArray171[local86] == -1 && Static165.aClass67_5.anIntArray170[local86] == -1) {
						local134 = true;
						local103 = -1;
						local121 = -1;
					}
					if (Static211.anInt4418 != local121 || local103 != Static112.anInt2454) {
						local179 = local121 - Static211.anInt4418;
						Static211.anInt4418 = local121;
						@Pc(186) int local186 = local103 - Static112.anInt2454;
						Static112.anInt2454 = local103;
						if (Static271.anInt5573 < 8 && local179 >= -32 && local179 <= 31 && local186 >= -32 && local186 <= 31) {
							local186 += 32;
							local179 += 32;
							Static320.aClass4_Sub7_Sub1_3.method2376(local186 + (local179 << 6) + (Static271.anInt5573 << 12));
							Static271.anInt5573 = 0;
						} else if (Static271.anInt5573 < 32 && local179 >= -128 && local179 <= 127 && local186 >= -128 && local186 <= 127) {
							Static320.aClass4_Sub7_Sub1_3.method2416(Static271.anInt5573 + 128);
							local186 += 128;
							local179 += 128;
							Static320.aClass4_Sub7_Sub1_3.method2376((local179 << 8) + local186);
							Static271.anInt5573 = 0;
						} else if (Static271.anInt5573 < 32) {
							Static320.aClass4_Sub7_Sub1_3.method2416(Static271.anInt5573 + 192);
							if (local134) {
								Static320.aClass4_Sub7_Sub1_3.method2387(Integer.MIN_VALUE);
							} else {
								Static320.aClass4_Sub7_Sub1_3.method2387(local103 << 16 | local121);
							}
							Static271.anInt5573 = 0;
						} else {
							Static320.aClass4_Sub7_Sub1_3.method2376(Static271.anInt5573 + 57344);
							if (local134) {
								Static320.aClass4_Sub7_Sub1_3.method2387(Integer.MIN_VALUE);
							} else {
								Static320.aClass4_Sub7_Sub1_3.method2387(local121 | local103 << 16);
							}
							Static271.anInt5573 = 0;
						}
					} else if (Static271.anInt5573 < 2047) {
						Static271.anInt5573++;
					}
				}
				Static320.aClass4_Sub7_Sub1_3.method2392(Static320.aClass4_Sub7_Sub1_3.anInt2667 - local82);
				if (Static165.aClass67_5.anInt1691 <= local84) {
					Static165.aClass67_5.anInt1691 = 0;
				} else {
					Static165.aClass67_5.anInt1691 -= local84;
					for (local103 = 0; local103 < Static165.aClass67_5.anInt1691; local103++) {
						Static165.aClass67_5.anIntArray170[local103] = Static165.aClass67_5.anIntArray170[local84 + local103];
						Static165.aClass67_5.anIntArray171[local103] = Static165.aClass67_5.anIntArray171[local103 + local84];
					}
				}
			}
		}
		if (Static9.anInt6461 != 0) {
			@Pc(407) long local407 = (Static266.aLong199 - Static84.aLong65) / 50L;
			if (local407 > 32767L) {
				local407 = 32767L;
			}
			Static84.aLong65 = Static266.aLong199;
			local82 = Static237.anInt4924;
			if (local82 < 0) {
				local82 = 0;
			} else if (local82 > 65535) {
				local82 = 65535;
			}
			local84 = Static65.anInt1361;
			if (local84 < 0) {
				local84 = 0;
			} else if (local84 > 65535) {
				local84 = 65535;
			}
			@Pc(448) byte local448 = 0;
			if (Static9.anInt6461 == 2) {
				local448 = 1;
			}
			local103 = (int) local407;
			Static320.aClass4_Sub7_Sub1_3.method1237(217);
			Static320.aClass4_Sub7_Sub1_3.method2375(local84 | local82 << 16);
			Static320.aClass4_Sub7_Sub1_3.method2406(local448 << 15 | local103);
		}
		if (Static218.anInt4556 > 0) {
			Static218.anInt4556--;
		}
		if (Static275.aBoolean495 && Static218.anInt4556 <= 0) {
			Static275.aBoolean495 = false;
			Static218.anInt4556 = 20;
			Static320.aClass4_Sub7_Sub1_3.method1237(7);
			Static320.aClass4_Sub7_Sub1_3.method2390((int) Static174.aFloat39 >> 3);
			Static320.aClass4_Sub7_Sub1_3.method2406((int) Static138.aFloat35 >> 3);
		}
		if (Static317.aBoolean551 && !Static90.aBoolean174) {
			Static90.aBoolean174 = true;
			Static320.aClass4_Sub7_Sub1_3.method1237(113);
			Static320.aClass4_Sub7_Sub1_3.method2416(1);
		}
		if (!Static317.aBoolean551 && Static90.aBoolean174) {
			Static90.aBoolean174 = false;
			Static320.aClass4_Sub7_Sub1_3.method1237(113);
			Static320.aClass4_Sub7_Sub1_3.method2416(0);
		}
		if (!Static243.aBoolean429) {
			Static320.aClass4_Sub7_Sub1_3.method1237(225);
			Static320.aClass4_Sub7_Sub1_3.method2375(Static163.method3130());
			Static243.aBoolean429 = true;
		}
		if (Static156.aBoolean292) {
			Static156.aBoolean292 = false;
		} else {
			Static203.aFloat41 /= 2.0F;
		}
		if (Static135.aBoolean259) {
			Static135.aBoolean259 = false;
		} else {
			Static229.aFloat44 /= 2.0F;
		}
		Static178.method5435();
		if (Static139.anInt3135 != 30) {
			return;
		}
		Static100.method1854();
		Static257.method4395();
		Static193.method3507();
		Static40.anInt911++;
		if (Static40.anInt911 > 750) {
			Static181.method3368();
			return;
		}
		Static38.method721();
		Static312.method2420();
		Static268.method4670();
		for (@Pc(636) int local636 = Static110.method2037(true); local636 != -1; local636 = Static110.method2037(false)) {
			Static308.method5554(local636);
			Static291.anIntArray487[Static289.anInt5852++ & 0x1F] = local636;
		}
		@Pc(725) Class72 local725;
		@Pc(772) int local772;
		for (@Pc(662) Class4_Sub1_Sub8 local662 = Static142.method2790(); local662 != null; local662 = Static142.method2790()) {
			local82 = local662.method2029();
			local84 = local662.method2035();
			if (local82 == 1) {
				Static289.anIntArray486[local84] = local662.anInt2410;
				Static156.aBoolean291 |= Static72.aBooleanArray12[local84];
				Static171.anIntArray332[Static15.anInt317++ & 0x1F] = local84;
			} else if (local82 == 2) {
				Static60.aStringArray7[local84] = local662.aString80;
				Static18.anIntArray51[Static143.anInt3195++ & 0x1F] = local84;
			} else if (local82 == 3) {
				local725 = Static66.method1243(local84);
				if (!local662.aString80.equals(local725.aString61)) {
					local725.aString61 = local662.aString80;
					Static238.method4097(local725);
				}
			} else if (local82 == 4) {
				local725 = Static66.method1243(local84);
				local103 = local662.anInt2410;
				local121 = local662.anInt2405;
				local772 = local662.anInt2403;
				if (local725.anInt1794 != local103 || local121 != local725.anInt1879 || local725.anInt1822 != local772) {
					local725.anInt1879 = local121;
					local725.anInt1822 = local772;
					local725.anInt1794 = local103;
					Static238.method4097(local725);
				}
			} else if (local82 == 5) {
				local725 = Static66.method1243(local84);
				if (local725.anInt1836 != local662.anInt2410 || local662.anInt2410 == -1) {
					local725.anInt1832 = 0;
					local725.anInt1836 = local662.anInt2410;
					local725.anInt1821 = 1;
					local725.anInt1808 = 0;
					Static238.method4097(local725);
				}
			} else if (local82 == 6) {
				local86 = local662.anInt2410;
				local103 = local86 >> 10 & 0x1F;
				local121 = local86 >> 5 & 0x1F;
				local772 = local86 & 0x1F;
				local179 = (local121 << 11) + (local103 << 19) + (local772 << 3);
				@Pc(788) Class72 local788 = Static66.method1243(local84);
				if (local179 != local788.anInt1862) {
					local788.anInt1862 = local179;
					Static238.method4097(local788);
				}
			} else if (local82 == 7) {
				local725 = Static66.method1243(local84);
				@Pc(821) boolean local821 = local662.anInt2410 == 1;
				if (local725.aBoolean148 != local821) {
					local725.aBoolean148 = local821;
					Static238.method4097(local725);
				}
			} else if (local82 == 8) {
				local725 = Static66.method1243(local84);
				if (local725.anInt1817 != local662.anInt2410 || local662.anInt2405 != local725.anInt1867 || local662.anInt2403 != local725.anInt1878) {
					local725.anInt1878 = local662.anInt2403;
					local725.anInt1867 = local662.anInt2405;
					local725.anInt1817 = local662.anInt2410;
					if (local725.lb != -1) {
						if (local725.anInt1889 > 0) {
							local725.anInt1878 = local725.anInt1878 * 32 / local725.anInt1889;
						} else if (local725.anInt1827 > 0) {
							local725.anInt1878 = local725.anInt1878 * 32 / local725.anInt1827;
						}
					}
					Static238.method4097(local725);
				}
			} else if (local82 == 9) {
				local725 = Static66.method1243(local84);
				if (local662.anInt2410 != local725.lb || local725.anInt1807 != local662.anInt2405) {
					local725.anInt1807 = local662.anInt2405;
					local725.lb = local662.anInt2410;
					Static238.method4097(local725);
				}
			} else if (local82 == 10) {
				local725 = Static66.method1243(local84);
				if (local725.anInt1852 != local662.anInt2410 || local725.anInt1797 != local662.anInt2405 || local662.anInt2403 != local725.anInt1857) {
					local725.anInt1852 = local662.anInt2410;
					local725.anInt1857 = local662.anInt2403;
					local725.anInt1797 = local662.anInt2405;
					Static238.method4097(local725);
				}
			} else if (local82 == 11) {
				local725 = Static66.method1243(local84);
				local725.anInt1854 = local725.anInt1805 = local662.anInt2405;
				local725.anInt1861 = local725.anInt1796 = local662.anInt2410;
				local725.aByte34 = 0;
				local725.aByte33 = 0;
				Static238.method4097(local725);
			} else if (local82 == 12) {
				local725 = Static66.method1243(local84);
				local103 = local662.anInt2410;
				if (local725 != null && local725.anInt1825 == 0) {
					if (local103 > local725.anInt1795 - local725.anInt1806) {
						local103 = local725.anInt1795 - local725.anInt1806;
					}
					if (local103 < 0) {
						local103 = 0;
					}
					if (local103 != local725.anInt1864) {
						local725.anInt1864 = local103;
						Static238.method4097(local725);
					}
				}
			} else if (local82 == 13) {
				local725 = Static66.method1243(local84);
				local725.anInt1828 = local662.anInt2410;
			} else if (local82 == 14) {
				local725 = Static66.method1243(local84);
				local725.anInt1882 = local662.anInt2410;
			} else if (local82 == 15) {
				Static219.anInt4563 = local662.anInt2405;
				Static321.anInt6340 = local662.anInt2410;
				Static165.aBoolean283 = true;
			}
		}
		if (Static18.anInt369 != 0) {
			Static273.anInt5607 += 20;
			if (Static273.anInt5607 >= 400) {
				Static18.anInt369 = 0;
			}
		}
		Static106.anInt2370++;
		if (Static20.aClass72_1 != null) {
			Static178.anInt6530++;
			if (Static178.anInt6530 >= 15) {
				Static238.method4097(Static20.aClass72_1);
				Static20.aClass72_1 = null;
			}
		}
		@Pc(1241) Class72 local1241 = Static55.aClass72_4;
		@Pc(1243) Class72 local1243 = Static346.aClass72_21;
		Static55.aClass72_4 = null;
		Static205.aBoolean368 = false;
		Static182.aBoolean332 = false;
		Static352.anInt6604 = 0;
		Static346.aClass72_21 = null;
		Static57.aClass72_5 = null;
		while (Static204.method3619() && Static352.anInt6604 < 128) {
			if (!Static265.method4633() || Static306.aChar4 != '`' && Static306.aChar4 != '§') {
				Static129.anIntArray269[Static352.anInt6604] = Static229.anInt4776;
				Static305.anIntArray501[Static352.anInt6604] = Static306.aChar4;
				Static352.anInt6604++;
			} else if (Static279.method4782()) {
				Static161.method3107();
			} else {
				Static13.method307();
			}
		}
		if (Static279.method4782()) {
			Static242.method4204();
		}
		Static142.aClass72_13 = null;
		Static279.method4784(-1, null, -1);
		Static59.method1050(null, -1, -1);
		if (Static310.anInt6220 != -1) {
			Static46.method881(Static310.anInt6220, 0, 0, Static38.anInt832, 0, 0, Static202.anInt4258);
		}
		Static344.anInt6736++;
		if (Static142.aClass72_13 != null) {
			Static293.method4983();
		}
		if (Static206.aBoolean369) {
			Static320.aClass4_Sub7_Sub1_3.method1237(142);
			Static320.aClass4_Sub7_Sub1_3.method2375(Static186.anInt5634 << 28 | Static120.anInt2713 << 14 | Static171.anInt3791);
			Static206.aBoolean369 = false;
		}
		while (true) {
			@Pc(1380) Class72 local1380;
			@Pc(1364) Class4_Sub22 local1364;
			@Pc(1369) Class72 local1369;
			do {
				local1364 = (Class4_Sub22) Static152.aClass130_72.method3500();
				if (local1364 == null) {
					while (true) {
						do {
							local1364 = (Class4_Sub22) Static344.aClass130_154.method3500();
							if (local1364 == null) {
								while (true) {
									do {
										local1364 = (Class4_Sub22) Static238.aClass130_107.method3500();
										if (local1364 == null) {
											if (Static142.aClass72_13 == null) {
												Static109.anInt2407 = 0;
											}
											if (Static301.aClass72_19 != null) {
												Static111.method2068();
											}
											if (Static98.anInt6644 > 0 && Static77.aBooleanArray13[82] && Static77.aBooleanArray13[81] && Static32.anInt3682 != 0) {
												local86 = Static279.anInt5645 - Static32.anInt3682;
												if (local86 < 0) {
													local86 = 0;
												} else if (local86 > 3) {
													local86 = 3;
												}
												Static284.method4850(Static110.aClass2_Sub2_Sub1_Sub1_1.anIntArray518[0] + Static10.anInt231, local86, Static81.anInt1732 + Static110.aClass2_Sub2_Sub1_Sub1_1.anIntArray517[0]);
											}
											Static161.method3104();
											if (Static215.aClass72_15 != null) {
												Static238.method4097(Static215.aClass72_15);
												Static83.anInt1766++;
												if (Static38.anInt830 > Static100.anInt2288 + 5 || Static38.anInt830 < Static100.anInt2288 - 5 || Static184.anInt4055 > Static121.anInt2745 + 5 || Static184.anInt4055 < Static121.anInt2745 - 5) {
													Static337.aBoolean513 = true;
												}
												if (Static136.anInt3094 == 0) {
													if (Static337.aBoolean513 && Static83.anInt1766 >= 5) {
														if (Static215.aClass72_15 == Static63.aClass72_6 && Static49.anInt1090 != Static77.anInt1681) {
															local725 = Static215.aClass72_15;
															@Pc(1624) byte local1624 = 0;
															if (Static252.anInt5237 == 1 && local725.anInt1804 == 206) {
																local1624 = 1;
															}
															if (local725.anIntArray179[Static77.anInt1681] <= 0) {
																local1624 = 0;
															}
															if (local1624 == 1) {
																local121 = Static49.anInt1090;
																local772 = Static77.anInt1681;
																while (local772 != local121) {
																	if (local121 > local772) {
																		local725.method1513(local121, local121 - 1);
																		local121--;
																	} else if (local121 < local772) {
																		local725.method1513(local121, local121 + 1);
																		local121++;
																	}
																}
															} else {
																local725.method1513(Static49.anInt1090, Static77.anInt1681);
															}
															Static320.aClass4_Sub7_Sub1_3.method1237(178);
															Static320.aClass4_Sub7_Sub1_3.method2387(Static215.aClass72_15.anInt1830);
															Static320.aClass4_Sub7_Sub1_3.method2371(local1624);
															Static320.aClass4_Sub7_Sub1_3.method2376(Static49.anInt1090);
															Static320.aClass4_Sub7_Sub1_3.method2362(Static77.anInt1681);
														}
													} else if ((Static82.anInt1737 == 1 || Static72.method1364()) && Static282.anInt5713 > 2) {
														Static204.method3617();
													} else if (Static282.method4832()) {
														Static298.method5069();
													}
													Static9.anInt6461 = 0;
													Static178.anInt6530 = 10;
													Static215.aClass72_15 = null;
												}
											}
											if (local1241 != Static55.aClass72_4) {
												if (local1241 != null) {
													Static238.method4097(local1241);
												}
												if (Static55.aClass72_4 != null) {
													Static238.method4097(Static55.aClass72_4);
												}
											}
											if (Static346.aClass72_21 != local1243 && Static196.anInt4219 == Static251.anInt5215) {
												if (local1243 != null) {
													Static238.method4097(local1243);
												}
												if (Static346.aClass72_21 != null) {
													Static238.method4097(Static346.aClass72_21);
												}
											}
											if (Static346.aClass72_21 == null) {
												if (Static251.anInt5215 > 0) {
													Static251.anInt5215--;
												}
											} else if (Static196.anInt4219 > Static251.anInt5215) {
												Static251.anInt5215++;
												if (Static251.anInt5215 == Static196.anInt4219) {
													Static238.method4097(Static346.aClass72_21);
												}
											}
											for (local86 = 0; local86 < 5; local86++) {
												@Pc(1828) int local1828 = Static130.anIntArray273[local86]++;
											}
											local103 = Static348.method5638();
											local121 = Static343.method5585();
											if (local103 > 15000 && local121 > 15000) {
												Static49.anInt1089 = 250;
												Static158.method3053(14500);
												Static320.aClass4_Sub7_Sub1_3.method1237(71);
											}
											if (Static156.aBoolean291 && Static274.method4763() - 60000L > Static9.aLong243) {
												Static188.method3431();
											}
											Static121.anInt2749++;
											if (Static121.anInt2749 > 500) {
												Static121.anInt2749 = 0;
												local772 = (int) (Math.random() * 8.0D);
												if ((local772 & 0x2) == 2) {
													Static302.anInt6100 += Static260.anInt5350;
												}
												if ((local772 & 0x1) == 1) {
													Static150.anInt6596 += Static256.anInt5264;
												}
												if ((local772 & 0x4) == 4) {
													Static146.anInt3285 += Static258.anInt5309;
												}
											}
											if (Static150.anInt6596 < -50) {
												Static256.anInt5264 = 2;
											}
											if (Static150.anInt6596 > 50) {
												Static256.anInt5264 = -2;
											}
											if (Static302.anInt6100 < -55) {
												Static260.anInt5350 = 2;
											}
											if (Static302.anInt6100 > 55) {
												Static260.anInt5350 = -2;
											}
											if (Static146.anInt3285 < -40) {
												Static258.anInt5309 = 1;
											}
											if (Static146.anInt3285 > 40) {
												Static258.anInt5309 = -1;
											}
											Static113.anInt6474++;
											if (Static113.anInt6474 > 500) {
												Static113.anInt6474 = 0;
												local772 = (int) (Math.random() * 8.0D);
												if ((local772 & 0x2) == 2) {
													Static48.anInt1082 += Static242.anInt5093;
												}
												if ((local772 & 0x1) == 1) {
													Static222.anInt4620 += Static345.anInt6757;
												}
											}
											if (Static222.anInt4620 < -60) {
												Static345.anInt6757 = 2;
											}
											if (Static48.anInt1082 < -20) {
												Static242.anInt5093 = 1;
											}
											if (Static222.anInt4620 > 60) {
												Static345.anInt6757 = -2;
											}
											if (Static48.anInt1082 > 10) {
												Static242.anInt5093 = -1;
											}
											Static140.anInt3160++;
											if (Static140.anInt3160 > 50) {
												Static320.aClass4_Sub7_Sub1_3.method1237(99);
											}
											if (Static350.aBoolean591) {
												Static315.method1382();
												Static350.aBoolean591 = false;
											}
											try {
												if (Static131.aClass171_3 != null && Static320.aClass4_Sub7_Sub1_3.anInt2667 > 0) {
													Static131.aClass171_3.method4636(Static320.aClass4_Sub7_Sub1_3.aByteArray42, Static320.aClass4_Sub7_Sub1_3.anInt2667);
													Static320.aClass4_Sub7_Sub1_3.anInt2667 = 0;
													Static140.anInt3160 = 0;
													return;
												}
												return;
											} catch (@Pc(2072) IOException local2072) {
												Static181.method3368();
												return;
											}
										}
										local1369 = local1364.aClass72_12;
										if (local1369.anInt1849 < 0) {
											break;
										}
										local1380 = Static66.method1243(local1369.anInt1813);
									} while (local1380 == null || local1380.aClass72Array1 == null || local1369.anInt1849 >= local1380.aClass72Array1.length || local1369 != local1380.aClass72Array1[local1369.anInt1849]);
									Static97.method1756(local1364);
								}
							}
							local1369 = local1364.aClass72_12;
							if (local1369.anInt1849 < 0) {
								break;
							}
							local1380 = Static66.method1243(local1369.anInt1813);
						} while (local1380 == null || local1380.aClass72Array1 == null || local1380.aClass72Array1.length <= local1369.anInt1849 || local1380.aClass72Array1[local1369.anInt1849] != local1369);
						Static97.method1756(local1364);
					}
				}
				local1369 = local1364.aClass72_12;
				if (local1369.anInt1849 < 0) {
					break;
				}
				local1380 = Static66.method1243(local1369.anInt1813);
			} while (local1380 == null || local1380.aClass72Array1 == null || local1369.anInt1849 >= local1380.aClass72Array1.length || local1369 != local1380.aClass72Array1[local1369.anInt1849]);
			Static97.method1756(local1364);
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!ur;Z)V")
	public static void method5579(@OriginalArg(0) Class2_Sub2_Sub1_Sub2 arg0) {
		for (@Pc(10) Class4_Sub37 local10 = (Class4_Sub37) Static182.aClass130_85.method3499(); local10 != null; local10 = (Class4_Sub37) Static182.aClass130_85.method3512()) {
			if (local10.aClass2_Sub2_Sub1_Sub2_1 == arg0) {
				if (local10.aClass4_Sub13_Sub1_2 != null) {
					Static337.aClass4_Sub13_Sub2_2.method2499(local10.aClass4_Sub13_Sub1_2);
					local10.aClass4_Sub13_Sub1_2 = null;
				}
				local10.method5667();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(B)V")
	public static void method5581() {
		@Pc(5) Class154 local5 = Static100.aClass154_35;
		synchronized (Static100.aClass154_35) {
			Static100.aClass154_35.method4212();
		}
		local5 = Static195.aClass154_67;
		synchronized (Static195.aClass154_67) {
			Static195.aClass154_67.method4212();
		}
		local5 = Static277.aClass154_85;
		synchronized (Static277.aClass154_85) {
			Static277.aClass154_85.method4212();
		}
		local5 = Static81.aClass154_26;
		synchronized (Static81.aClass154_26) {
			Static81.aClass154_26.method4212();
		}
	}

	@OriginalMember(owner = "client!or", name = "c", descriptor = "(I)V")
	public static void method5582() {
		@Pc(10) Class154 local10 = Static36.aClass154_8;
		synchronized (Static36.aClass154_8) {
			Static36.aClass154_8.method4212();
		}
	}
}
