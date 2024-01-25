import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!ls", name = "v", descriptor = "[I")
	public static int[] anIntArray406;

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)V")
	public static void method5729() {
		if (Static612.anInt10717 > 1) {
			Static62.anInt2039 = Static7.anInt132;
			Static612.anInt10717--;
		}
		if (Static356.aBoolean506) {
			Static356.aBoolean506 = false;
			Static584.method4583();
			return;
		}
		if (!Static65.aBoolean754) {
			Static364.method6173();
		}
		for (@Pc(29) int local29 = 0; local29 < 100 && Static616.method8985(); local29++) {
		}
		if (Static529.anInt9623 != 10) {
			return;
		}
		@Pc(51) Class2_Sub52 local51;
		@Pc(60) int local60;
		while (Static605.method9166()) {
			local51 = Static130.method3019(Static390.aClass94_77, Static361.aClass183_1);
			local51.aClass2_Sub11_Sub2_7.method8374(0);
			local60 = local51.aClass2_Sub11_Sub2_7.anInt10066;
			Static476.method7472(local51.aClass2_Sub11_Sub2_7);
			local51.aClass2_Sub11_Sub2_7.method8335(local51.aClass2_Sub11_Sub2_7.anInt10066 - local60);
			Static96.method2563(local51);
		}
		if (Static282.aClass2_Sub36_1 == null) {
			if (Static277.method5091() >= Static200.aLong99) {
				Static282.aClass2_Sub36_1 = Static305.aClass262_1.method6849(Static185.aClass255_2.aString89);
			}
		} else if (Static282.aClass2_Sub36_1.anInt6974 != -1) {
			local51 = Static130.method3019(Static47.aClass94_15, Static361.aClass183_1);
			local51.aClass2_Sub11_Sub2_7.method8333(Static282.aClass2_Sub36_1.anInt6974);
			Static96.method2563(local51);
			Static282.aClass2_Sub36_1 = null;
			Static200.aLong99 = Static277.method5091() + 30000L;
		}
		@Pc(131) Class2_Sub9 local131 = (Class2_Sub9) Static253.aClass341_64.method8524();
		@Pc(148) int local148;
		@Pc(170) int local170;
		@Pc(187) int local187;
		@Pc(233) int local233;
		@Pc(239) int local239;
		@Pc(251) int local251;
		@Pc(146) Class2_Sub52 local146;
		if (local131 != null || Static277.method5091() - 2000L > Static12.aLong6) {
			local146 = null;
			local148 = 0;
			for (@Pc(153) Class2_Sub9 local153 = (Class2_Sub9) Static144.aClass341_32.method8524(); local153 != null && (local146 == null || local146.aClass2_Sub11_Sub2_7.anInt10066 - local148 < 240); local153 = (Class2_Sub9) Static144.aClass341_32.method8519()) {
				local153.method9253();
				local170 = local153.method7082();
				if (local170 < -1) {
					local170 = -1;
				} else if (local170 > 65534) {
					local170 = 65534;
				}
				local187 = local153.method7079();
				if (local187 < -1) {
					local187 = -1;
				} else if (local187 > 65534) {
					local187 = 65534;
				}
				if (Static119.anInt3172 != local187 || local170 != Static8.anInt156) {
					if (local146 == null) {
						local146 = Static130.method3019(Static569.aClass94_102, Static361.aClass183_1);
						local146.aClass2_Sub11_Sub2_7.method8374(0);
						local148 = local146.aClass2_Sub11_Sub2_7.anInt10066;
					}
					local233 = local187 - Static119.anInt3172;
					Static119.anInt3172 = local187;
					local239 = local170 - Static8.anInt156;
					Static8.anInt156 = local170;
					local251 = (int) ((local153.method7083() - Static12.aLong6) / 20L);
					if (local251 < 8 && local233 >= -32 && local233 <= 31 && local239 >= -32 && local239 <= 31) {
						local233 += 32;
						local239 += 32;
						local146.aClass2_Sub11_Sub2_7.method8333(local239 + (local233 << 6) + (local251 << 12));
					} else if (local251 < 32 && local233 >= -128 && local233 <= 127 && local239 >= -128 && local239 <= 127) {
						local233 += 128;
						local239 += 128;
						local146.aClass2_Sub11_Sub2_7.method8374(local251 + 128);
						local146.aClass2_Sub11_Sub2_7.method8333(local239 + (local233 << 8));
					} else if (local251 >= 32) {
						local146.aClass2_Sub11_Sub2_7.method8333(local251 + 57344);
						if (local187 == 1 || local170 == -1) {
							local146.aClass2_Sub11_Sub2_7.method8387(Integer.MIN_VALUE);
						} else {
							local146.aClass2_Sub11_Sub2_7.method8387(local170 << 16 | local187);
						}
					} else {
						local146.aClass2_Sub11_Sub2_7.method8374(local251 + 192);
						if (local187 == 1 || local170 == -1) {
							local146.aClass2_Sub11_Sub2_7.method8387(Integer.MIN_VALUE);
						} else {
							local146.aClass2_Sub11_Sub2_7.method8387(local187 | local170 << 16);
						}
					}
					Static12.aLong6 = local153.method7083();
				}
			}
			if (local146 != null) {
				local146.aClass2_Sub11_Sub2_7.method8335(local146.aClass2_Sub11_Sub2_7.anInt10066 - local148);
				Static96.method2563(local146);
			}
		}
		@Pc(452) int local452;
		if (local131 != null) {
			@Pc(436) long local436 = (local131.method7083() - Static204.aLong248) / 50L;
			Static204.aLong248 = local131.method7083();
			if (local436 > 32767L) {
				local436 = 32767L;
			}
			local452 = local131.method7082();
			if (local452 < 0) {
				local452 = 0;
			} else if (local452 > 65535) {
				local452 = 65535;
			}
			local170 = local131.method7079();
			if (local170 < 0) {
				local170 = 0;
			} else if (local170 > 65535) {
				local170 = 65535;
			}
			@Pc(485) byte local485 = 0;
			if (local131.method7081() == 2) {
				local485 = 1;
			}
			local233 = (int) local436;
			@Pc(510) Class2_Sub52 local510 = Static130.method3019(Static224.aClass94_46, Static361.aClass183_1);
			local510.aClass2_Sub11_Sub2_7.method8333(local233 | local485 << 15);
			local510.aClass2_Sub11_Sub2_7.method8387(local452 << 16 | local170);
			Static96.method2563(local510);
		}
		if (Static558.anInt9991 > 0) {
			local146 = Static130.method3019(Static160.aClass94_35, Static361.aClass183_1);
			local146.aClass2_Sub11_Sub2_7.method8374(Static558.anInt9991 * 3);
			for (local148 = 0; local148 < Static558.anInt9991; local148++) {
				@Pc(557) Interface16 local557 = Static642.anInterface16Array2[local148];
				@Pc(566) long local566 = (local557.method4434() - Static176.aLong92) / 50L;
				Static176.aLong92 = local557.method4434();
				if (local566 > 65535L) {
					local566 = 65535L;
				}
				local146.aClass2_Sub11_Sub2_7.method8374(local557.method4435());
				local146.aClass2_Sub11_Sub2_7.method8333((int) local566);
			}
			Static96.method2563(local146);
		}
		if (Static395.anInt7576 > 0) {
			Static395.anInt7576--;
		}
		if (Static166.aBoolean304 && Static395.anInt7576 <= 0) {
			Static166.aBoolean304 = false;
			Static395.anInt7576 = 20;
			local146 = Static130.method3019(Static596.aClass94_105, Static361.aClass183_1);
			local146.aClass2_Sub11_Sub2_7.method8345((int) Static72.aFloat68 >> 3);
			local146.aClass2_Sub11_Sub2_7.method8333((int) Static305.aFloat154 >> 3);
			Static96.method2563(local146);
		}
		if (Static123.aBoolean250 != Static437.aBoolean575) {
			Static123.aBoolean250 = Static437.aBoolean575;
			local146 = Static130.method3019(Static128.aClass94_29, Static361.aClass183_1);
			local146.aClass2_Sub11_Sub2_7.method8374(Static437.aBoolean575 ? 1 : 0);
			Static96.method2563(local146);
		}
		if (!Static475.aBoolean694) {
			local146 = Static130.method3019(Static183.aClass94_37, Static361.aClass183_1);
			local146.aClass2_Sub11_Sub2_7.method8374(0);
			local148 = local146.aClass2_Sub11_Sub2_7.anInt10066;
			@Pc(702) Class2_Sub11 local702 = Static74.aClass2_Sub13_5.method2605();
			local146.aClass2_Sub11_Sub2_7.method8376(local702.anInt10066, 0, local702.aByteArray128);
			local146.aClass2_Sub11_Sub2_7.method8335(local146.aClass2_Sub11_Sub2_7.anInt10066 - local148);
			Static96.method2563(local146);
			Static475.aBoolean694 = true;
		}
		if (Static395.aClass100ArrayArrayArray3 != null) {
			if (Static496.anInt9165 == 2) {
				Static49.method1755();
			} else if (Static496.anInt9165 == 3) {
				Static322.method5589();
			}
		}
		if (Static414.aBoolean558) {
			Static414.aBoolean558 = false;
		} else {
			Static485.aFloat196 /= 2.0F;
		}
		if (Static172.aBoolean308) {
			Static172.aBoolean308 = false;
		} else {
			Static351.aFloat157 /= 2.0F;
		}
		Static489.method7598();
		if (Static529.anInt9623 != 10) {
			return;
		}
		Static328.method5639();
		Static237.method4456();
		Static486.method7563();
		Static85.anInt2575++;
		if (Static85.anInt2575 > 750) {
			Static584.method4583();
			return;
		}
		Static232.method4416();
		Static155.method3479();
		Static456.method5468();
		for (local60 = Static286.aClass263_3.method6854(true); local60 != -1; local60 = Static286.aClass263_3.method6854(false)) {
			Static416.method6725(local60);
			Static93.anIntArray129[Static609.anInt10690++ & 0x1F] = local60;
		}
		@Pc(894) Class24 local894;
		for (@Pc(828) Class2_Sub6_Sub6 local828 = Static604.method8883(); local828 != null; local828 = Static604.method8883()) {
			local452 = local828.method3087();
			local170 = local828.method3090();
			if (local452 == 1) {
				Static306.anIntArray372[local170] = local828.anInt3368;
				Static453.aBoolean599 |= Static544.aBooleanArray25[local170];
				Static350.anIntArray439[Static65.anInt11083++ & 0x1F] = local170;
			} else if (local452 == 2) {
				Static443.aStringArray36[local170] = local828.aString27;
				Static613.anIntArray689[Static604.anInt10622++ & 0x1F] = local170;
			} else if (local452 == 3) {
				local894 = Static87.method8101(local170);
				if (!local828.aString27.equals(local894.aString5)) {
					local894.aString5 = local828.aString27;
					Static553.method8248(local894);
				}
			} else if (local452 == 4) {
				local894 = Static87.method8101(local170);
				local233 = local828.anInt3368;
				local239 = local828.anInt3367;
				local251 = local828.anInt3366;
				if (local894.anInt478 != local233 || local239 != local894.anInt466 || local894.anInt482 != local251) {
					local894.anInt466 = local239;
					local894.anInt478 = local233;
					local894.anInt482 = local251;
					Static553.method8248(local894);
				}
			} else if (local452 == 5) {
				local894 = Static87.method8101(local170);
				if (local828.anInt3368 != local894.anInt435 || local828.anInt3368 == -1) {
					local894.anInt435 = local828.anInt3368;
					local894.anInt491 = 0;
					local894.anInt514 = 0;
					local894.anInt456 = 1;
					@Pc(988) Class130 local988 = local894.anInt435 == -1 ? null : Static195.aClass193_1.method5573(local894.anInt435);
					if (local988 != null) {
						Static573.method8546(local894.anInt491, local988);
					}
					Static553.method8248(local894);
				}
			} else if (local452 == 6) {
				local187 = local828.anInt3368;
				local233 = local187 >> 10 & 0x1F;
				local239 = local187 >> 5 & 0x1F;
				local251 = local187 & 0x1F;
				@Pc(1037) int local1037 = (local251 << 3) + ((local233 << 19) + (local239 << 11));
				@Pc(1041) Class24 local1041 = Static87.method8101(local170);
				if (local1037 != local1041.anInt464) {
					local1041.anInt464 = local1037;
					Static553.method8248(local1041);
				}
			} else if (local452 == 7) {
				local894 = Static87.method8101(local170);
				@Pc(1072) boolean local1072 = local828.anInt3368 == 1;
				if (local894.aBoolean43 != local1072) {
					local894.aBoolean43 = local1072;
					Static553.method8248(local894);
				}
			} else if (local452 == 8) {
				local894 = Static87.method8101(local170);
				if (local894.anInt469 != local828.anInt3368 || local828.anInt3367 != local894.anInt424 || local828.anInt3366 != local894.anInt446) {
					local894.anInt446 = local828.anInt3366;
					local894.anInt424 = local828.anInt3367;
					local894.anInt469 = local828.anInt3368;
					if (local894.anInt501 != -1) {
						if (local894.anInt492 > 0) {
							local894.anInt446 = local894.anInt446 * 32 / local894.anInt492;
						} else if (local894.anInt515 > 0) {
							local894.anInt446 = local894.anInt446 * 32 / local894.anInt515;
						}
					}
					Static553.method8248(local894);
				}
			} else if (local452 == 9) {
				local894 = Static87.method8101(local170);
				if (local828.anInt3368 != local894.anInt501 || local828.anInt3367 != local894.anInt483) {
					local894.anInt483 = local828.anInt3367;
					local894.anInt501 = local828.anInt3368;
					Static553.method8248(local894);
				}
			} else if (local452 == 10) {
				local894 = Static87.method8101(local170);
				if (local894.anInt499 != local828.anInt3368 || local828.anInt3367 != local894.anInt485 || local894.anInt447 != local828.anInt3366) {
					local894.anInt485 = local828.anInt3367;
					local894.anInt499 = local828.anInt3368;
					local894.anInt447 = local828.anInt3366;
					Static553.method8248(local894);
				}
			} else if (local452 == 11) {
				local894 = Static87.method8101(local170);
				local894.aByte9 = 0;
				local894.anInt465 = local894.anInt461 = local828.anInt3367;
				local894.aByte6 = 0;
				local894.anInt495 = local894.anInt487 = local828.anInt3368;
				Static553.method8248(local894);
			} else if (local452 == 12) {
				local894 = Static87.method8101(local170);
				local233 = local828.anInt3368;
				if (local894 != null && local894.anInt480 == 0) {
					if (local894.anInt489 - local894.anInt488 < local233) {
						local233 = local894.anInt489 - local894.anInt488;
					}
					if (local233 < 0) {
						local233 = 0;
					}
					if (local233 != local894.anInt467) {
						local894.anInt467 = local233;
						Static553.method8248(local894);
					}
				}
			} else if (local452 == 14) {
				local894 = Static87.method8101(local170);
				local894.anInt468 = local828.anInt3368;
			} else if (local452 == 15) {
				Static339.anInt6841 = local828.anInt3367;
				Static542.anInt9759 = local828.anInt3368;
				Static236.aBoolean376 = true;
			} else if (local452 == 16) {
				local894 = Static87.method8101(local170);
				local894.anInt437 = local828.anInt3368;
			} else if (local452 == 17) {
				local894 = Static87.method8101(local170);
				local894.anInt498 = local828.anInt3368;
			}
		}
		Static99.anInt2781++;
		if (Static592.anInt10450 != 0) {
			Static124.anInt11090 += 20;
			if (Static124.anInt11090 >= 400) {
				Static592.anInt10450 = 0;
			}
		}
		if (Static7.aClass24_2 != null) {
			Static354.anInt7035++;
			if (Static354.anInt7035 >= 15) {
				Static553.method8248(Static7.aClass24_2);
				Static7.aClass24_2 = null;
			}
		}
		Static320.aClass24_13 = null;
		Static172.aBoolean307 = false;
		Static50.aClass24_5 = null;
		Static133.aBoolean254 = false;
		Static327.method5626(null, -1, -1);
		Static437.method6921(-1, null, -1);
		if (!Static475.aBoolean695) {
			Static151.anInt3895 = -1;
		}
		Static499.method7732();
		Static7.anInt132++;
		if (Static524.aBoolean714) {
			@Pc(1478) Class2_Sub52 local1478 = Static130.method3019(Static467.aClass94_87, Static361.aClass183_1);
			local1478.aClass2_Sub11_Sub2_7.method8387(Static512.anInt9375 << 14 | Static567.anInt10184 << 28 | Static30.anInt670);
			Static96.method2563(local1478);
			Static524.aBoolean714 = false;
		}
		while (true) {
			@Pc(1501) Class2_Sub44 local1501;
			@Pc(1506) Class24 local1506;
			do {
				local1501 = (Class2_Sub44) Static488.aClass341_57.method8526();
				if (local1501 == null) {
					while (true) {
						do {
							local1501 = (Class2_Sub44) Static156.aClass341_37.method8526();
							if (local1501 == null) {
								while (true) {
									do {
										local1501 = (Class2_Sub44) Static98.aClass341_28.method8526();
										if (local1501 == null) {
											if (Static50.aClass24_5 == null) {
												Static606.anInt10699 = 0;
											}
											if (Static612.aClass24_17 != null) {
												Static123.method2957();
											}
											if (Static468.anInt8823 > 0 && Static449.aClass90_1.method8781(82) && Static449.aClass90_1.method8781(81) && Static341.anInt6870 != 0) {
												local452 = Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aByte132 - Static341.anInt6870;
												if (local452 < 0) {
													local452 = 0;
												} else if (local452 > 3) {
													local452 = 3;
												}
												Static147.method3257(Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anIntArray357[0] + Static32.anInt723, local452, Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anIntArray358[0] + Static84.anInt2565);
											}
											Static570.method8516();
											for (local452 = 0; local452 < 5; local452++) {
												@Pc(1712) int local1712 = Static579.anIntArray664[local452]++;
											}
											if (Static453.aBoolean599 && Static277.method5091() - 60000L > Static232.aLong107) {
												Static154.method6048();
											}
											for (@Pc(1741) Class3_Sub2_Sub1 local1741 = (Class3_Sub2_Sub1) Static96.aClass325_2.method8016(); local1741 != null; local1741 = (Class3_Sub2_Sub1) Static96.aClass325_2.method8022()) {
												if (Static277.method5091() / 1000L - 5L > (long) local1741.anInt3406) {
													if (local1741.aShort33 > 0) {
														Static101.method2658("", 5, 0, local1741.aString28 + Static588.aClass351_21.method8691(Static476.anInt8915), "", "");
													}
													if (local1741.aShort33 == 0) {
														Static101.method2658("", 5, 0, local1741.aString28 + Static588.aClass351_22.method8691(Static476.anInt8915), "", "");
													}
													local1741.method8909();
												}
											}
											Static225.anInt4990++;
											if (Static225.anInt4990 > 500) {
												Static225.anInt4990 = 0;
												local187 = (int) (Math.random() * 8.0D);
												if ((local187 & 0x4) == 4) {
													Static471.anInt8841 += Static637.anInt11024;
												}
												if ((local187 & 0x1) == 1) {
													Static213.anInt4833 += Static578.anInt8196;
												}
												if ((local187 & 0x2) == 2) {
													Static568.anInt10190 += Static11.anInt6557;
												}
											}
											if (Static213.anInt4833 < -50) {
												Static578.anInt8196 = 2;
											}
											if (Static213.anInt4833 > 50) {
												Static578.anInt8196 = -2;
											}
											if (Static568.anInt10190 < -55) {
												Static11.anInt6557 = 2;
											}
											if (Static471.anInt8841 < -40) {
												Static637.anInt11024 = 1;
											}
											if (Static568.anInt10190 > 55) {
												Static11.anInt6557 = -2;
											}
											Static603.anInt7133++;
											if (Static471.anInt8841 > 40) {
												Static637.anInt11024 = -1;
											}
											if (Static603.anInt7133 > 500) {
												Static603.anInt7133 = 0;
												local187 = (int) (Math.random() * 8.0D);
												if ((local187 & 0x2) == 2) {
													Static183.anInt4411 += Static96.anInt2724;
												}
												if ((local187 & 0x1) == 1) {
													Static563.anInt10146 += Static83.anInt2549;
												}
											}
											if (Static563.anInt10146 < -60) {
												Static83.anInt2549 = 2;
											}
											if (Static183.anInt4411 < -20) {
												Static96.anInt2724 = 1;
											}
											if (Static563.anInt10146 > 60) {
												Static83.anInt2549 = -2;
											}
											if (Static183.anInt4411 > 10) {
												Static96.anInt2724 = -1;
											}
											Static201.anInt4634++;
											if (Static201.anInt4634 > 50) {
												@Pc(1970) Class2_Sub52 local1970 = Static130.method3019(Static392.aClass94_78, Static361.aClass183_1);
												Static96.method2563(local1970);
											}
											if (Static167.aBoolean305) {
												Static70.method2115();
												Static167.aBoolean305 = false;
											}
											try {
												Static547.method8179();
												return;
											} catch (@Pc(1985) IOException local1985) {
												Static584.method4583();
												return;
											}
										}
										local1506 = local1501.aClass24_15;
										if (local1506.anInt439 < 0) {
											break;
										}
										local894 = Static87.method8101(local1506.anInt511);
									} while (local894 == null || local894.aClass24Array1 == null || local1506.anInt439 >= local894.aClass24Array1.length || local894.aClass24Array1[local1506.anInt439] != local1506);
									Static284.method5153(local1501);
								}
							}
							local1506 = local1501.aClass24_15;
							if (local1506.anInt439 < 0) {
								break;
							}
							local894 = Static87.method8101(local1506.anInt511);
						} while (local894 == null || local894.aClass24Array1 == null || local894.aClass24Array1.length <= local1506.anInt439 || local894.aClass24Array1[local1506.anInt439] != local1506);
						Static284.method5153(local1501);
					}
				}
				local1506 = local1501.aClass24_15;
				if (local1506.anInt439 < 0) {
					break;
				}
				local894 = Static87.method8101(local1506.anInt511);
			} while (local894 == null || local894.aClass24Array1 == null || local894.aClass24Array1.length <= local1506.anInt439 || local1506 != local894.aClass24Array1[local1506.anInt439]);
			Static284.method5153(local1501);
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Ljava/lang/String;B)[B")
	public static byte[] method5730(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) byte[] local11 = new byte[local8];
		for (@Pc(18) int local18 = 0; local18 < local8; local18++) {
			@Pc(24) char local24 = arg0.charAt(local18);
			if (local24 > '\u0000' && local24 < '\u0080' || !(local24 < ' ' || local24 > 'ÿ')) {
				local11[local18] = (byte) local24;
			} else if (local24 == '€') {
				local11[local18] = -128;
			} else if (local24 == '‚') {
				local11[local18] = -126;
			} else if (local24 == 'ƒ') {
				local11[local18] = -125;
			} else if (local24 == '„') {
				local11[local18] = -124;
			} else if (local24 == '…') {
				local11[local18] = -123;
			} else if (local24 == '†') {
				local11[local18] = -122;
			} else if (local24 == '‡') {
				local11[local18] = -121;
			} else if (local24 == 'ˆ') {
				local11[local18] = -120;
			} else if (local24 == '‰') {
				local11[local18] = -119;
			} else if (local24 == 'Š') {
				local11[local18] = -118;
			} else if (local24 == '‹') {
				local11[local18] = -117;
			} else if (local24 == 'Œ') {
				local11[local18] = -116;
			} else if (local24 == 'Ž') {
				local11[local18] = -114;
			} else if (local24 == '‘') {
				local11[local18] = -111;
			} else if (local24 == '’') {
				local11[local18] = -110;
			} else if (local24 == '“') {
				local11[local18] = -109;
			} else if (local24 == '”') {
				local11[local18] = -108;
			} else if (local24 == '•') {
				local11[local18] = -107;
			} else if (local24 == '–') {
				local11[local18] = -106;
			} else if (local24 == '—') {
				local11[local18] = -105;
			} else if (local24 == '˜') {
				local11[local18] = -104;
			} else if (local24 == '™') {
				local11[local18] = -103;
			} else if (local24 == 'š') {
				local11[local18] = -102;
			} else if (local24 == '›') {
				local11[local18] = -101;
			} else if (local24 == 'œ') {
				local11[local18] = -100;
			} else if (local24 == 'ž') {
				local11[local18] = -98;
			} else if (local24 == 'Ÿ') {
				local11[local18] = -97;
			} else {
				local11[local18] = 63;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(I)V")
	public static void method5732() {
		Static478.aClass95Array1 = null;
	}
}
