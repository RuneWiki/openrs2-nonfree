import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static449 {

	@OriginalMember(owner = "client!wm", name = "I", descriptor = "I")
	public static int anInt7499;

	@OriginalMember(owner = "client!wm", name = "N", descriptor = "[I")
	public static int[] anIntArray563;

	@OriginalMember(owner = "client!wm", name = "U", descriptor = "I")
	public static int anInt7510;

	@OriginalMember(owner = "client!wm", name = "G", descriptor = "Lclient!ek;")
	public static Class67 aClass67_37 = new Class67(8);

	@OriginalMember(owner = "client!wm", name = "W", descriptor = "[[B")
	public static final byte[][] aByteArrayArray20 = new byte[1000][];

	@OriginalMember(owner = "client!wm", name = "e", descriptor = "(Z)V")
	public static void method5957() {
		if (Static284.anInt4667 > 0) {
			Static284.anInt4667--;
		}
		if (Static385.anInt6297 > 1) {
			Static161.anInt2989 = Static79.anInt1568;
			Static385.anInt6297--;
		}
		if (Static188.aBoolean267) {
			Static188.aBoolean267 = false;
			Static288.method3772();
			return;
		}
		if (!Static339.aBoolean390) {
			Static89.method1407();
		}
		for (@Pc(35) int local35 = 0; local35 < 100 && Static279.method3689(); local35++) {
		}
		if (Static8.anInt119 != 9) {
			return;
		}
		Static33.method449(Static118.aClass146_37.method2858(), Static247.aClass4_Sub9_Sub2_2);
		if (Static170.aClass4_Sub16_3 == null) {
			if (Static333.aLong166 <= Static266.method3498()) {
				Static170.aClass4_Sub16_3 = Static160.aClass40_2.method684(Static338.aClass220_5.aString62);
			}
		} else if (Static170.aClass4_Sub16_3.anInt2822 != -1) {
			Static448.method5935(Static138.aClass146_41);
			Static247.aClass4_Sub9_Sub2_2.method5029(Static170.aClass4_Sub16_3.anInt2822);
			Static170.aClass4_Sub16_3 = null;
			Static333.aLong166 = Static266.method3498() + 30000L;
		}
		@Pc(98) Class4_Sub1 local98 = (Class4_Sub1) Static398.aClass244_36.method5263();
		@Pc(112) int local112;
		@Pc(133) int local133;
		@Pc(148) int local148;
		@Pc(166) boolean local166;
		@Pc(215) int local215;
		@Pc(222) int local222;
		@Pc(233) int local233;
		if (local98 != null || Static266.method3498() - 2000L > Static170.aLong219) {
			@Pc(109) boolean local109 = false;
			local112 = Static247.aClass4_Sub9_Sub2_2.anInt6207;
			for (@Pc(117) Class4_Sub1 local117 = (Class4_Sub1) Static154.aClass244_14.method5263(); local117 != null && Static247.aClass4_Sub9_Sub2_2.anInt6207 - local112 < 240; local117 = (Class4_Sub1) Static154.aClass244_14.method5271()) {
				local117.method6059();
				local133 = local117.method64();
				if (local133 < 0) {
					local133 = 0;
				} else if (local133 > 65534) {
					local133 = 65534;
				}
				local148 = local117.method65();
				if (local148 < 0) {
					local148 = 0;
				} else if (local148 > 65534) {
					local148 = 65534;
				}
				local166 = false;
				if (local117.method64() == -1 && local117.method65() == -1) {
					local148 = -1;
					local166 = true;
					local133 = -1;
				}
				if (Static349.anInt5768 != local148 || local133 != Static265.anInt4372) {
					if (!local109) {
						Static448.method5935(Static336.aClass146_74);
						Static247.aClass4_Sub9_Sub2_2.method4999(0);
						local112 = Static247.aClass4_Sub9_Sub2_2.anInt6207;
						local109 = true;
					}
					local215 = local148 - Static349.anInt5768;
					Static349.anInt5768 = local148;
					local222 = local133 - Static265.anInt4372;
					Static265.anInt4372 = local133;
					local233 = (int) ((local117.method63() - Static170.aLong219) / 20L);
					if (local233 < 8 && local215 >= -32 && local215 <= 31 && local222 >= -32 && local222 <= 31) {
						local222 += 32;
						local215 += 32;
						Static247.aClass4_Sub9_Sub2_2.method5029((local233 << 12) - (-(local215 << 6) - local222));
					} else if (local233 < 32 && local215 >= -128 && local215 <= 127 && local222 >= -128 && local222 <= 127) {
						local222 += 128;
						Static247.aClass4_Sub9_Sub2_2.method4999(local233 + 128);
						local215 += 128;
						Static247.aClass4_Sub9_Sub2_2.method5029(local222 + (local215 << 8));
					} else if (local233 >= 32) {
						Static247.aClass4_Sub9_Sub2_2.method5029(local233 + 57344);
						if (local166) {
							Static247.aClass4_Sub9_Sub2_2.method5047(Integer.MIN_VALUE);
						} else {
							Static247.aClass4_Sub9_Sub2_2.method5047(local133 << 16 | local148);
						}
					} else {
						Static247.aClass4_Sub9_Sub2_2.method4999(local233 + 192);
						if (local166) {
							Static247.aClass4_Sub9_Sub2_2.method5047(Integer.MIN_VALUE);
						} else {
							Static247.aClass4_Sub9_Sub2_2.method5047(local133 << 16 | local148);
						}
					}
					Static170.aLong219 = local117.method63();
				}
			}
			if (local109) {
				Static247.aClass4_Sub9_Sub2_2.method5025(Static247.aClass4_Sub9_Sub2_2.anInt6207 - local112);
			}
		}
		@Pc(413) int local413;
		@Pc(460) int local460;
		if (local98 != null) {
			@Pc(399) long local399 = (local98.method63() - Static169.aLong85) / 50L;
			if (local399 > 32767L) {
				local399 = 32767L;
			}
			Static169.aLong85 = local98.method63();
			local413 = local98.method64();
			if (local413 < 0) {
				local413 = 0;
			} else if (local413 > 65535) {
				local413 = 65535;
			}
			local133 = local98.method65();
			if (local133 < 0) {
				local133 = 0;
			} else if (local133 > 65535) {
				local133 = 65535;
			}
			@Pc(446) byte local446 = 0;
			if (local98.method67() == 2) {
				local446 = 1;
			}
			local460 = (int) local399;
			Static448.method5935(Static17.aClass146_12);
			Static247.aClass4_Sub9_Sub2_2.method5048(local413 << 16 | local133);
			Static247.aClass4_Sub9_Sub2_2.method5055(local446 << 15 | local460);
		}
		@Pc(490) int local490;
		if (Static306.anInt5006 > 0) {
			local490 = 0;
			for (local112 = 0; local112 < Static306.anInt5006; local112++) {
				if (Static167.aClass36Array1[local112].method579()) {
					local490++;
				}
			}
			if (local490 > 0) {
				Static448.method5935(Static379.aClass146_88);
				if (local490 > 75) {
					local490 = 75;
				}
				Static247.aClass4_Sub9_Sub2_2.method4999(local490 * 3);
				for (local413 = 0; local413 < Static306.anInt5006; local413++) {
					@Pc(535) Class36 local535 = Static167.aClass36Array1[local413];
					if (local535.method579()) {
						@Pc(547) long local547 = (local535.method578() - Static180.aLong90) / 50L;
						if (local547 > 65535L) {
							local547 = 65535L;
						}
						Static180.aLong90 = local535.method578();
						Static247.aClass4_Sub9_Sub2_2.method4999(local535.method576());
						Static247.aClass4_Sub9_Sub2_2.method5029((int) local547);
					}
				}
			}
		}
		if (Static404.anInt6575 > 0) {
			Static404.anInt6575--;
		}
		if (Static333.aBoolean386 && Static404.anInt6575 <= 0) {
			Static333.aBoolean386 = false;
			Static404.anInt6575 = 20;
			Static448.method5935(Static362.aClass146_84);
			Static247.aClass4_Sub9_Sub2_2.method5018((int) Static109.aFloat75 >> 3);
			Static247.aClass4_Sub9_Sub2_2.method5055((int) Static439.aFloat99 >> 3);
		}
		if (Static252.aBoolean308 && !Static252.aBoolean309) {
			Static252.aBoolean309 = true;
			Static448.method5935(Static432.aClass146_102);
			Static247.aClass4_Sub9_Sub2_2.method4999(1);
		}
		if (!Static252.aBoolean308 && Static252.aBoolean309) {
			Static252.aBoolean309 = false;
			Static448.method5935(Static432.aClass146_102);
			Static247.aClass4_Sub9_Sub2_2.method4999(0);
		}
		if (!Static340.aBoolean392) {
			Static448.method5935(Static253.aClass146_59);
			Static247.aClass4_Sub9_Sub2_2.method4999(0);
			local490 = Static247.aClass4_Sub9_Sub2_2.anInt6207;
			@Pc(686) Class4_Sub9 local686 = Static413.aClass49_Sub1_1.method2491();
			Static247.aClass4_Sub9_Sub2_2.method5052(local686.anInt6207, local686.aByteArray81);
			Static247.aClass4_Sub9_Sub2_2.method5025(Static247.aClass4_Sub9_Sub2_2.anInt6207 - local490);
			Static340.aBoolean392 = true;
		}
		if (Static432.aClass75ArrayArrayArray6 != null) {
			if (Static97.anInt1791 == 2) {
				Static427.method2167();
			} else if (Static97.anInt1791 == 3) {
				Static141.method1991();
			}
		}
		if (Static165.aBoolean224) {
			Static165.aBoolean224 = false;
		} else {
			Static390.aFloat102 /= 2.0F;
		}
		if (Static354.aBoolean417) {
			Static354.aBoolean417 = false;
		} else {
			Static33.aFloat7 /= 2.0F;
		}
		Static12.method161();
		if (Static8.anInt119 != 9) {
			return;
		}
		Static321.method4250();
		Static239.method3207();
		Static39.method545();
		Static267.method3511();
		Static77.anInt1536++;
		if (Static77.anInt1536 > 750) {
			Static288.method3772();
			return;
		}
		Static375.method4922();
		Static264.method3486();
		Static194.method5773();
		for (local490 = Static52.aClass81_1.method1668(true); local490 != -1; local490 = Static52.aClass81_1.method1668(false)) {
			Static146.method2058(local490);
			Static31.anIntArray42[Static307.anInt5014++ & 0x1F] = local490;
		}
		@Pc(854) Class110 local854;
		for (@Pc(802) Class4_Sub2_Sub17 local802 = Static289.method3774(); local802 != null; local802 = Static289.method3774()) {
			local413 = local802.method5526();
			local133 = local802.method5532();
			if (local413 == 1) {
				Static83.anIntArray416[local133] = local802.anInt6873;
				Static247.aBoolean303 |= Static269.aBooleanArray22[local133];
				Static77.anIntArray113[Static306.anInt5008++ & 0x1F] = local133;
			} else if (local413 == 2) {
				Static432.aStringArray45[local133] = local802.aString71;
				Static18.anIntArray17[Static216.anInt3697++ & 0x1F] = local133;
			} else if (local413 == 3) {
				local854 = Static235.method3185(local133);
				if (!local802.aString71.equals(local854.aString19)) {
					local854.aString19 = local802.aString71;
					Static118.method1693(local854);
				}
			} else if (local413 == 4) {
				local854 = Static235.method3185(local133);
				local460 = local802.anInt6873;
				local215 = local802.anInt6871;
				local222 = local802.anInt6869;
				if (local460 != local854.anInt2593 || local854.anInt2658 != local215 || local854.anInt2599 != local222) {
					local854.anInt2593 = local460;
					local854.anInt2658 = local215;
					local854.anInt2599 = local222;
					Static118.method1693(local854);
				}
			} else if (local413 == 5) {
				local854 = Static235.method3185(local133);
				if (local802.anInt6873 != local854.anInt2667 || local802.anInt6873 == -1) {
					local854.anInt2667 = local802.anInt6873;
					local854.anInt2664 = 0;
					local854.anInt2624 = 0;
					local854.anInt2660 = 1;
					Static118.method1693(local854);
				}
			} else if (local413 == 6) {
				local148 = local802.anInt6873;
				local460 = local148 >> 10 & 0x1F;
				local215 = local148 >> 5 & 0x1F;
				local222 = local148 & 0x1F;
				local233 = (local222 << 3) + (local215 << 11) + (local460 << 19);
				@Pc(1284) Class110 local1284 = Static235.method3185(local133);
				if (local1284.anInt2665 != local233) {
					local1284.anInt2665 = local233;
					Static118.method1693(local1284);
				}
			} else if (local413 == 7) {
				local854 = Static235.method3185(local133);
				local166 = local802.anInt6873 == 1;
				if (local854.aBoolean179 != local166) {
					local854.aBoolean179 = local166;
					Static118.method1693(local854);
				}
			} else if (local413 == 8) {
				local854 = Static235.method3185(local133);
				if (local802.anInt6873 != local854.anInt2619 || local802.anInt6871 != local854.anInt2597 || local802.anInt6869 != local854.anInt2650) {
					local854.anInt2619 = local802.anInt6873;
					local854.anInt2650 = local802.anInt6869;
					local854.anInt2597 = local802.anInt6871;
					if (local854.anInt2588 != -1) {
						if (local854.anInt2621 > 0) {
							local854.anInt2650 = local854.anInt2650 * 32 / local854.anInt2621;
						} else if (local854.anInt2608 > 0) {
							local854.anInt2650 = local854.anInt2650 * 32 / local854.anInt2608;
						}
					}
					Static118.method1693(local854);
				}
			} else if (local413 == 9) {
				local854 = Static235.method3185(local133);
				if (local854.anInt2588 != local802.anInt6873 || local802.anInt6871 != local854.anInt2610) {
					local854.anInt2588 = local802.anInt6873;
					local854.anInt2610 = local802.anInt6871;
					Static118.method1693(local854);
				}
			} else if (local413 == 10) {
				local854 = Static235.method3185(local133);
				if (local854.anInt2607 != local802.anInt6873 || local802.anInt6871 != local854.anInt2657 || local854.anInt2659 != local802.anInt6869) {
					local854.anInt2657 = local802.anInt6871;
					local854.anInt2607 = local802.anInt6873;
					local854.anInt2659 = local802.anInt6869;
					Static118.method1693(local854);
				}
			} else if (local413 == 11) {
				local854 = Static235.method3185(local133);
				local854.aByte48 = 0;
				local854.anInt2622 = local854.anInt2637 = local802.anInt6873;
				local854.aByte49 = 0;
				local854.anInt2643 = local854.anInt2618 = local802.anInt6871;
				Static118.method1693(local854);
			} else if (local413 == 12) {
				local854 = Static235.method3185(local133);
				local460 = local802.anInt6873;
				if (local854 != null && local854.anInt2627 == 0) {
					if (local460 > local854.anInt2596 - local854.anInt2590) {
						local460 = local854.anInt2596 - local854.anInt2590;
					}
					if (local460 < 0) {
						local460 = 0;
					}
					if (local460 != local854.anInt2642) {
						local854.anInt2642 = local460;
						Static118.method1693(local854);
					}
				}
			} else if (local413 == 14) {
				local854 = Static235.method3185(local133);
				local854.anInt2636 = local802.anInt6873;
			} else if (local413 == 15) {
				Static435.aBoolean509 = true;
				Static25.anInt375 = local802.anInt6871;
				Static363.anInt5531 = local802.anInt6873;
			} else if (local413 == 16) {
				local854 = Static235.method3185(local133);
				local854.anInt2662 = local802.anInt6873;
			}
		}
		if (Static253.anInt4186 != 0) {
			Static99.anInt1829 += 20;
			if (Static99.anInt1829 >= 400) {
				Static253.anInt4186 = 0;
			}
		}
		Static298.anInt4895++;
		if (Static129.aClass110_7 != null) {
			Static183.anInt3357++;
			if (Static183.anInt3357 >= 15) {
				Static118.method1693(Static129.aClass110_7);
				Static129.aClass110_7 = null;
			}
		}
		Static30.aBoolean32 = false;
		Static240.aBoolean299 = false;
		Static123.aClass110_6 = null;
		Static63.aClass110_16 = null;
		Static252.method3319(-1, null, -1);
		Static199.method2853(-1, -1, null);
		if (!Static70.aBoolean94) {
			Static340.anInt5535 = -1;
		}
		Static164.method2300();
		Static79.anInt1568++;
		if (Static426.aBoolean337) {
			Static448.method5935(Static170.aClass146_106);
			Static247.aClass4_Sub9_Sub2_2.method5048(Static66.anInt1312 | Static115.anInt2116 << 14 | Static41.anInt668 << 28);
			Static426.aBoolean337 = false;
		}
		while (true) {
			@Pc(1434) Class4_Sub34 local1434;
			@Pc(1439) Class110 local1439;
			do {
				local1434 = (Class4_Sub34) Static301.aClass244_28.method5268();
				if (local1434 == null) {
					while (true) {
						do {
							local1434 = (Class4_Sub34) Static6.aClass244_1.method5268();
							if (local1434 == null) {
								while (true) {
									do {
										local1434 = (Class4_Sub34) Static302.aClass244_29.method5268();
										if (local1434 == null) {
											if (Static123.aClass110_6 == null) {
												Static368.anInt6060 = 0;
											}
											if (Static11.aClass110_1 != null) {
												Static388.method5131();
											}
											if (Static270.anInt4509 > 0 && Static180.aClass107_1.method2003(82) && Static180.aClass107_1.method2003(81) && Static157.anInt2901 != 0) {
												local413 = Static401.aClass8_Sub3_Sub1_Sub1_2.aByte99 - Static157.anInt2901;
												if (local413 < 0) {
													local413 = 0;
												} else if (local413 > 3) {
													local413 = 3;
												}
												Static113.method1678(local413, Static401.aClass8_Sub3_Sub1_Sub1_2.anIntArray559[0] + Static366.anInt6052, Static401.aClass8_Sub3_Sub1_Sub1_2.anIntArray560[0] + Static365.anInt6047);
											}
											Static260.method6058();
											for (local413 = 0; local413 < 5; local413++) {
												@Pc(1635) int local1635 = Static63.anIntArray455[local413]++;
											}
											if (Static247.aBoolean303 && Static398.aLong191 < Static266.method3498() - 60000L) {
												Static125.method1758();
											}
											Static20.anInt1661++;
											if (Static20.anInt1661 > 500) {
												Static20.anInt1661 = 0;
												local133 = (int) (Math.random() * 8.0D);
												if ((local133 & 0x1) == 1) {
													Static328.anInt5322 += Static294.anInt4822;
												}
												if ((local133 & 0x4) == 4) {
													Static206.anInt4096 += Static222.anInt3816;
												}
												if ((local133 & 0x2) == 2) {
													Static141.anInt2521 += Static437.anInt7254;
												}
											}
											if (Static328.anInt5322 < -50) {
												Static294.anInt4822 = 2;
											}
											if (Static141.anInt2521 < -55) {
												Static437.anInt7254 = 2;
											}
											if (Static328.anInt5322 > 50) {
												Static294.anInt4822 = -2;
											}
											if (Static141.anInt2521 > 55) {
												Static437.anInt7254 = -2;
											}
											if (Static206.anInt4096 < -40) {
												Static222.anInt3816 = 1;
											}
											Static428.anInt7132++;
											if (Static206.anInt4096 > 40) {
												Static222.anInt3816 = -1;
											}
											if (Static428.anInt7132 > 500) {
												Static428.anInt7132 = 0;
												local133 = (int) (Math.random() * 8.0D);
												if ((local133 & 0x2) == 2) {
													Static380.anInt6188 += Static421.anInt7078;
												}
												if ((local133 & 0x1) == 1) {
													Static35.anInt575 += Static329.anInt5332;
												}
											}
											if (Static35.anInt575 < -60) {
												Static329.anInt5332 = 2;
											}
											if (Static35.anInt575 > 60) {
												Static329.anInt5332 = -2;
											}
											if (Static380.anInt6188 < -20) {
												Static421.anInt7078 = 1;
											}
											Static351.anInt5837++;
											if (Static380.anInt6188 > 10) {
												Static421.anInt7078 = -1;
											}
											if (Static351.anInt5837 > 50) {
												Static448.method5935(Static278.aClass146_62);
											}
											if (Static249.aBoolean536) {
												Static172.method2390();
												Static249.aBoolean536 = false;
											}
											try {
												if (Static338.aClass152_4 != null && Static247.aClass4_Sub9_Sub2_2.anInt6207 > 0) {
													Static212.anInt3691 += Static247.aClass4_Sub9_Sub2_2.anInt6207;
													Static338.aClass152_4.method2926(Static247.aClass4_Sub9_Sub2_2.anInt6207, Static247.aClass4_Sub9_Sub2_2.aByteArray81);
													Static351.anInt5837 = 0;
													Static247.aClass4_Sub9_Sub2_2.anInt6207 = 0;
													return;
												}
												return;
											} catch (@Pc(1843) IOException local1843) {
												Static288.method3772();
												return;
											}
										}
										local1439 = local1434.aClass110_14;
										if (local1439.anInt2585 < 0) {
											break;
										}
										local854 = Static235.method3185(local1439.anInt2649);
									} while (local854 == null || local854.aClass110Array1 == null || local854.aClass110Array1.length <= local1439.anInt2585 || local854.aClass110Array1[local1439.anInt2585] != local1439);
									Static80.method1289(local1434);
								}
							}
							local1439 = local1434.aClass110_14;
							if (local1439.anInt2585 < 0) {
								break;
							}
							local854 = Static235.method3185(local1439.anInt2649);
						} while (local854 == null || local854.aClass110Array1 == null || local854.aClass110Array1.length <= local1439.anInt2585 || local1439 != local854.aClass110Array1[local1439.anInt2585]);
						Static80.method1289(local1434);
					}
				}
				local1439 = local1434.aClass110_14;
				if (local1439.anInt2585 < 0) {
					break;
				}
				local854 = Static235.method3185(local1439.anInt2649);
			} while (local854 == null || local854.aClass110Array1 == null || local1439.anInt2585 >= local854.aClass110Array1.length || local1439 != local854.aClass110Array1[local1439.anInt2585]);
			Static80.method1289(local1434);
		}
	}
}
