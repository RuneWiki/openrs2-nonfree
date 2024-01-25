import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!i", name = "o", descriptor = "Lclient!ir;")
	public static Class100 aClass100_58;

	@OriginalMember(owner = "client!i", name = "v", descriptor = "[Z")
	public static final boolean[] aBooleanArray12 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)V")
	public static void method2167() {
		if (Static1.anInt8 > 1) {
			Static316.anInt6202 = Static293.anInt6247;
			Static1.anInt8--;
		}
		if (Static238.anInt4781 > 0) {
			Static238.anInt4781--;
		}
		if (Static273.aBoolean343) {
			Static273.aBoolean343 = false;
			Static301.method5086();
			return;
		}
		if (!Static168.aBoolean192) {
			Static256.method4301();
		}
		for (@Pc(38) int local38 = 0; local38 < 100 && Static238.method4073(); local38++) {
		}
		if (Static266.anInt5370 != 30) {
			return;
		}
		Static117.method2037(Static291.aClass3_Sub4_Sub2_3);
		@Pc(64) Object local64 = Static102.aClass95_1.anObject5;
		@Pc(99) int local99;
		@Pc(101) int local101;
		@Pc(103) int local103;
		@Pc(120) int local120;
		@Pc(141) int local141;
		@Pc(200) int local200;
		synchronized (Static102.aClass95_1.anObject5) {
			if (!Static9.aBoolean19) {
				Static102.aClass95_1.anInt2770 = 0;
			} else if (Static249.anInt4645 != 0 || Static102.aClass95_1.anInt2770 >= 40) {
				Static291.aClass3_Sub4_Sub2_3.method3682(73);
				Static291.aClass3_Sub4_Sub2_3.method3614(0);
				local99 = Static291.aClass3_Sub4_Sub2_3.anInt4268;
				local101 = 0;
				for (local103 = 0; Static102.aClass95_1.anInt2770 > local103 && Static291.aClass3_Sub4_Sub2_3.anInt4268 - local99 < 240; local103++) {
					local101++;
					local120 = Static102.aClass95_1.anIntArray184[local103];
					if (local120 < 0) {
						local120 = 0;
					} else if (local120 > 65534) {
						local120 = 65534;
					}
					local141 = Static102.aClass95_1.anIntArray185[local103];
					if (local141 < 0) {
						local141 = 0;
					} else if (local141 > 65534) {
						local141 = 65534;
					}
					@Pc(154) boolean local154 = false;
					if (Static102.aClass95_1.anIntArray184[local103] == -1 && Static102.aClass95_1.anIntArray185[local103] == -1) {
						local141 = -1;
						local154 = true;
						local120 = -1;
					}
					if (local141 != Static341.anInt6650 || local120 != Static251.anInt4978) {
						local200 = local141 - Static341.anInt6650;
						Static341.anInt6650 = local141;
						@Pc(207) int local207 = local120 - Static251.anInt4978;
						Static251.anInt4978 = local120;
						if (Static247.anInt4941 < 8 && local200 >= -32 && local200 <= 31 && local207 >= -32 && local207 <= 31) {
							local200 += 32;
							local207 += 32;
							Static291.aClass3_Sub4_Sub2_3.method3660(local207 + (local200 << 6) + (Static247.anInt4941 << 12));
							Static247.anInt4941 = 0;
						} else if (Static247.anInt4941 < 32 && local200 >= -128 && local200 <= 127 && local207 >= -128 && local207 <= 127) {
							Static291.aClass3_Sub4_Sub2_3.method3614(Static247.anInt4941 + 128);
							local200 += 128;
							local207 += 128;
							Static291.aClass3_Sub4_Sub2_3.method3660((local200 << 8) + local207);
							Static247.anInt4941 = 0;
						} else if (Static247.anInt4941 < 32) {
							Static291.aClass3_Sub4_Sub2_3.method3614(Static247.anInt4941 + 192);
							if (local154) {
								Static291.aClass3_Sub4_Sub2_3.method3650(Integer.MIN_VALUE);
							} else {
								Static291.aClass3_Sub4_Sub2_3.method3650(local141 | local120 << 16);
							}
							Static247.anInt4941 = 0;
						} else {
							Static291.aClass3_Sub4_Sub2_3.method3660(Static247.anInt4941 + 57344);
							if (local154) {
								Static291.aClass3_Sub4_Sub2_3.method3650(Integer.MIN_VALUE);
							} else {
								Static291.aClass3_Sub4_Sub2_3.method3650(local120 << 16 | local141);
							}
							Static247.anInt4941 = 0;
						}
					} else if (Static247.anInt4941 < 2047) {
						Static247.anInt4941++;
					}
				}
				Static291.aClass3_Sub4_Sub2_3.method3661(Static291.aClass3_Sub4_Sub2_3.anInt4268 - local99);
				if (local101 >= Static102.aClass95_1.anInt2770) {
					Static102.aClass95_1.anInt2770 = 0;
				} else {
					Static102.aClass95_1.anInt2770 -= local101;
					for (local120 = 0; local120 < Static102.aClass95_1.anInt2770; local120++) {
						Static102.aClass95_1.anIntArray185[local120] = Static102.aClass95_1.anIntArray185[local120 + local101];
						Static102.aClass95_1.anIntArray184[local120] = Static102.aClass95_1.anIntArray184[local120 + local101];
					}
				}
			}
		}
		if (Static249.anInt4645 != 0) {
			@Pc(414) long local414 = (Static28.aLong23 - Static81.aLong64) / 50L;
			Static81.aLong64 = Static28.aLong23;
			if (local414 > 32767L) {
				local414 = 32767L;
			}
			local99 = Static170.anInt6277;
			if (local99 < 0) {
				local99 = 0;
			} else if (local99 > 65535) {
				local99 = 65535;
			}
			local101 = Static99.anInt2129;
			if (local101 < 0) {
				local101 = 0;
			} else if (local101 > 65535) {
				local101 = 65535;
			}
			@Pc(452) byte local452 = 0;
			if (Static249.anInt4645 == 2) {
				local452 = 1;
			}
			Static291.aClass3_Sub4_Sub2_3.method3682(215);
			local120 = (int) local414;
			Static291.aClass3_Sub4_Sub2_3.method3663(local120 | local452 << 15);
			Static291.aClass3_Sub4_Sub2_3.method3627(local99 << 16 | local101);
		}
		if (Static305.anInt6000 > 0) {
			Static305.anInt6000--;
		}
		if (Static105.aBoolean110 && Static305.anInt6000 <= 0) {
			Static105.aBoolean110 = false;
			Static305.anInt6000 = 20;
			Static291.aClass3_Sub4_Sub2_3.method3682(87);
			Static291.aClass3_Sub4_Sub2_3.method3660((int) Static46.aFloat2 >> 3);
			Static291.aClass3_Sub4_Sub2_3.method3635((int) Static57.aFloat3 >> 3);
		}
		if (Static135.aBoolean157 && !Static74.aBoolean74) {
			Static74.aBoolean74 = true;
			Static291.aClass3_Sub4_Sub2_3.method3682(150);
			Static291.aClass3_Sub4_Sub2_3.method3614(1);
		}
		if (!Static135.aBoolean157 && Static74.aBoolean74) {
			Static74.aBoolean74 = false;
			Static291.aClass3_Sub4_Sub2_3.method3682(150);
			Static291.aClass3_Sub4_Sub2_3.method3614(0);
		}
		if (!Static137.aBoolean143) {
			Static291.aClass3_Sub4_Sub2_3.method3682(166);
			Static291.aClass3_Sub4_Sub2_3.method3627(Static192.method3421());
			Static137.aBoolean143 = true;
		}
		if (Static267.aBoolean336) {
			Static267.aBoolean336 = false;
		} else {
			Static352.aFloat78 /= 2.0F;
		}
		if (Static323.aBoolean424) {
			Static323.aBoolean424 = false;
		} else {
			Static128.aFloat21 /= 2.0F;
		}
		Static286.method4923();
		if (Static266.anInt5370 != 30) {
			return;
		}
		Static327.method5346();
		Static234.method4373();
		Static140.method2296();
		Static37.anInt6453++;
		if (Static37.anInt6453 > 750) {
			Static301.method5086();
			return;
		}
		Static174.method2863();
		Static278.method4662();
		Static165.method2611();
		for (@Pc(653) int local653 = Static182.method3252(true); local653 != -1; local653 = Static182.method3252(false)) {
			Static231.method3988(local653);
			Static54.anIntArray71[Static345.anInt6709++ & 0x1F] = local653;
		}
		@Pc(737) Class181 local737;
		@Pc(1110) int local1110;
		for (@Pc(679) Class3_Sub7_Sub11 local679 = Static92.method1463(); local679 != null; local679 = Static92.method1463()) {
			local99 = local679.method2506();
			local101 = local679.method2504();
			if (local99 == 1) {
				Static347.anIntArray563[local101] = local679.anInt3054;
				Static63.aBoolean66 |= Static213.aBooleanArray22[local101];
				Static41.anIntArray58[Static307.anInt6095++ & 0x1F] = local101;
			} else if (local99 == 2) {
				Static195.aStringArray24[local101] = local679.aString117;
				Static308.anIntArray509[Static120.anInt2593++ & 0x1F] = local101;
			} else if (local99 == 3) {
				local737 = Static20.method415(local101);
				if (!local679.aString117.equals(local737.aString207)) {
					local737.aString207 = local679.aString117;
					Static316.method5250(local737);
				}
			} else if (local99 == 4) {
				local737 = Static20.method415(local101);
				local120 = local679.anInt3054;
				local141 = local679.anInt3053;
				local1110 = local679.anInt3057;
				if (local120 != local737.anInt5706 || local737.anInt5762 != local141 || local1110 != local737.anInt5765) {
					local737.anInt5765 = local1110;
					local737.anInt5706 = local120;
					local737.anInt5762 = local141;
					Static316.method5250(local737);
				}
			} else if (local99 == 5) {
				local737 = Static20.method415(local101);
				if (local679.anInt3054 != local737.anInt5741 || local679.anInt3054 == -1) {
					local737.anInt5744 = 1;
					local737.anInt5774 = 0;
					local737.anInt5754 = 0;
					local737.anInt5741 = local679.anInt3054;
					Static316.method5250(local737);
				}
			} else if (local99 == 6) {
				local103 = local679.anInt3054;
				local120 = local103 >> 10 & 0x1F;
				local141 = local103 >> 5 & 0x1F;
				local1110 = local103 & 0x1F;
				local200 = (local1110 << 3) + ((local120 << 19) + (local141 << 11));
				@Pc(1127) Class181 local1127 = Static20.method415(local101);
				if (local200 != local1127.anInt5679) {
					local1127.anInt5679 = local200;
					Static316.method5250(local1127);
				}
			} else if (local99 == 7) {
				local737 = Static20.method415(local101);
				@Pc(786) boolean local786 = local679.anInt3054 == 1;
				if (local786 != local737.aBoolean388) {
					local737.aBoolean388 = local786;
					Static316.method5250(local737);
				}
			} else if (local99 == 8) {
				local737 = Static20.method415(local101);
				if (local737.anInt5745 != local679.anInt3054 || local737.anInt5712 != local679.anInt3053 || local737.anInt5700 != local679.anInt3057) {
					local737.anInt5712 = local679.anInt3053;
					local737.anInt5745 = local679.anInt3054;
					local737.anInt5700 = local679.anInt3057;
					if (local737.anInt5684 != -1) {
						if (local737.anInt5719 > 0) {
							local737.anInt5700 = local737.anInt5700 * 32 / local737.anInt5719;
						} else if (local737.anInt5723 > 0) {
							local737.anInt5700 = local737.anInt5700 * 32 / local737.anInt5723;
						}
					}
					Static316.method5250(local737);
				}
			} else if (local99 == 9) {
				local737 = Static20.method415(local101);
				if (local737.anInt5684 != local679.anInt3054 || local737.anInt5707 != local679.anInt3053) {
					local737.anInt5707 = local679.anInt3053;
					local737.anInt5684 = local679.anInt3054;
					Static316.method5250(local737);
				}
			} else if (local99 == 10) {
				local737 = Static20.method415(local101);
				if (local679.anInt3054 != local737.anInt5731 || local679.anInt3053 != local737.anInt5769 || local679.anInt3057 != local737.anInt5753) {
					local737.anInt5769 = local679.anInt3053;
					local737.anInt5753 = local679.anInt3057;
					local737.anInt5731 = local679.anInt3054;
					Static316.method5250(local737);
				}
			} else if (local99 == 11) {
				local737 = Static20.method415(local101);
				local737.anInt5690 = local737.anInt5691 = local679.anInt3053;
				local737.anInt5687 = local737.anInt5740 = local679.anInt3054;
				local737.aByte66 = 0;
				local737.aByte65 = 0;
				Static316.method5250(local737);
			} else if (local99 == 12) {
				local737 = Static20.method415(local101);
				local120 = local679.anInt3054;
				if (local737 != null && local737.anInt5715 == 0) {
					if (local737.anInt5724 - local737.anInt5721 < local120) {
						local120 = local737.anInt5724 - local737.anInt5721;
					}
					if (local120 < 0) {
						local120 = 0;
					}
					if (local737.anInt5685 != local120) {
						local737.anInt5685 = local120;
						Static316.method5250(local737);
					}
				}
			} else if (local99 == 13) {
				local737 = Static20.method415(local101);
				local737.anInt5752 = local679.anInt3054;
			} else if (local99 == 14) {
				local737 = Static20.method415(local101);
				local737.anInt5778 = local679.anInt3054;
			} else if (local99 == 15) {
				Static312.aBoolean427 = true;
				Static154.anInt6365 = local679.anInt3054;
				Static355.anInt6865 = local679.anInt3053;
			}
		}
		if (Static245.anInt4839 != 0) {
			Static297.anInt5931 += 20;
			if (Static297.anInt5931 >= 400) {
				Static245.anInt4839 = 0;
			}
		}
		Static347.anInt6759++;
		if (Static201.aClass181_37 != null) {
			Static131.anInt2749++;
			if (Static131.anInt2749 >= 15) {
				Static316.method5250(Static201.aClass181_37);
				Static201.aClass181_37 = null;
			}
		}
		@Pc(1259) Class181 local1259 = Static118.aClass181_22;
		Static118.aClass181_22 = null;
		@Pc(1263) Class181 local1263 = Static188.aClass181_32;
		Static188.aClass181_32 = null;
		Static6.aClass181_48 = null;
		Static114.anInt2412 = 0;
		Static61.aBoolean62 = false;
		Static25.aBoolean31 = false;
		while (Static253.method4241() && Static114.anInt2412 < 128) {
			if (!Static175.method2872() || Static32.aChar1 != '`' && Static32.aChar1 != '§') {
				Static198.anIntArray340[Static114.anInt2412] = Static20.anInt554;
				Static223.anIntArray372[Static114.anInt2412] = Static32.aChar1;
				Static114.anInt2412++;
			} else if (Static130.method2222()) {
				Static298.method5057();
			} else {
				Static42.method729();
			}
		}
		if (Static130.method2222()) {
			Static97.method1656();
		}
		Static18.aClass181_4 = null;
		Static319.method5266(null, -1, -1);
		Static246.method4183(-1, -1, null);
		if (Static191.anInt3991 != -1) {
			Static171.method2835(0, Static171.anInt3583, 0, Static191.anInt3991, 0, Static298.anInt5944, 0);
		}
		Static293.anInt6247++;
		if (Static18.aClass181_4 != null) {
			Static77.method1161();
		}
		if (Static260.aBoolean301) {
			Static291.aClass3_Sub4_Sub2_3.method3682(52);
			Static291.aClass3_Sub4_Sub2_3.method3650(Static234.anInt5169 | Static187.anInt3943 << 28 | Static164.anInt6258 << 14);
			Static260.aBoolean301 = false;
		}
		while (true) {
			@Pc(1394) Class181 local1394;
			@Pc(1381) Class3_Sub41 local1381;
			@Pc(1386) Class181 local1386;
			do {
				local1381 = (Class3_Sub41) Static65.aClass127_6.method3396();
				if (local1381 == null) {
					while (true) {
						do {
							local1381 = (Class3_Sub41) Static132.aClass127_14.method3396();
							if (local1381 == null) {
								while (true) {
									do {
										local1381 = (Class3_Sub41) Static160.aClass127_16.method3396();
										if (local1381 == null) {
											if (Static18.aClass181_4 == null) {
												Static278.anInt5569 = 0;
											}
											if (Static328.aClass181_50 != null) {
												Static20.method416();
											}
											if (Static350.anInt6800 > 0 && Static192.aBooleanArray19[82] && Static192.aBooleanArray19[81] && Static19.anInt532 != 0) {
												local103 = Static163.anInt3184 - Static19.anInt532;
												if (local103 < 0) {
													local103 = 0;
												} else if (local103 > 3) {
													local103 = 3;
												}
												Static12.method220(Static296.anInt5889 + Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray404[0], local103, Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray405[0] + Static186.anInt3094);
											}
											Static158.method2505();
											if (Static262.aClass181_59 != null) {
												Static316.method5250(Static262.aClass181_59);
												if (Static192.anInt4000 > Static35.anInt2863 + 5 || Static192.anInt4000 < Static35.anInt2863 - 5 || Static13.anInt354 + 5 < Static221.anInt4562 || Static221.anInt4562 < Static13.anInt354 - 5) {
													Static203.aBoolean236 = true;
												}
												Static255.anInt6077++;
												if (Static1.anInt12 == 0) {
													if (Static203.aBoolean236 && Static255.anInt6077 >= 5) {
														if (Static262.aClass181_59 == Static198.aClass181_34 && Static29.anInt732 != Static164.anInt6261) {
															local737 = Static262.aClass181_59;
															@Pc(1651) byte local1651 = 0;
															if (Static144.anInt2892 == 1 && local737.anInt5755 == 206) {
																local1651 = 1;
															}
															if (local737.anIntArray469[Static29.anInt732] <= 0) {
																local1651 = 0;
															}
															if (local1651 == 1) {
																local141 = Static164.anInt6261;
																local1110 = Static29.anInt732;
																while (local1110 != local141) {
																	if (local1110 < local141) {
																		local737.method4924(local141, local141 - 1);
																		local141--;
																	} else if (local141 < local1110) {
																		local737.method4924(local141, local141 + 1);
																		local141++;
																	}
																}
															} else {
																local737.method4924(Static164.anInt6261, Static29.anInt732);
															}
															Static291.aClass3_Sub4_Sub2_3.method3682(38);
															Static291.aClass3_Sub4_Sub2_3.method3650(Static262.aClass181_59.anInt5761);
															Static291.aClass3_Sub4_Sub2_3.method3635(Static29.anInt732);
															Static291.aClass3_Sub4_Sub2_3.method3630(local1651);
															Static291.aClass3_Sub4_Sub2_3.method3660(Static164.anInt6261);
														}
													} else if ((Static285.anInt5662 == 1 || Static331.method5461()) && Static170.anInt6279 > 2) {
														Static67.method1072();
													} else if (Static340.method5559()) {
														Static131.method2230();
													}
													Static262.aClass181_59 = null;
													Static249.anInt4645 = 0;
													Static131.anInt2749 = 10;
												}
											}
											if (Static118.aClass181_22 != local1259) {
												if (local1259 != null) {
													Static316.method5250(local1259);
												}
												if (Static118.aClass181_22 != null) {
													Static316.method5250(Static118.aClass181_22);
												}
											}
											if (local1263 != Static188.aClass181_32 && Static85.anInt1707 == Static283.anInt4484) {
												if (local1263 != null) {
													Static316.method5250(local1263);
												}
												if (Static188.aClass181_32 != null) {
													Static316.method5250(Static188.aClass181_32);
												}
											}
											if (Static188.aClass181_32 == null) {
												if (Static283.anInt4484 > 0) {
													Static283.anInt4484--;
												}
											} else if (Static283.anInt4484 < Static85.anInt1707) {
												Static283.anInt4484++;
												if (Static85.anInt1707 == Static283.anInt4484) {
													Static316.method5250(Static188.aClass181_32);
												}
											}
											for (local103 = 0; local103 < 5; local103++) {
												@Pc(1831) int local1831 = Static27.anIntArray35[local103]++;
											}
											local120 = Static200.method3496();
											local141 = Static149.method2421();
											if (local120 > 15000 && local141 > 15000) {
												Static238.anInt4781 = 250;
												Static291.method4970(14500);
												Static291.aClass3_Sub4_Sub2_3.method3682(191);
											}
											if (Static63.aBoolean66 && Static53.method898() - 60000L > Static328.aLong195) {
												Static323.method5291();
											}
											Static62.anInt1293++;
											if (Static62.anInt1293 > 500) {
												Static62.anInt1293 = 0;
												local1110 = (int) (Math.random() * 8.0D);
												if ((local1110 & 0x4) == 4) {
													Static2.anInt29 += Static192.anInt4004;
												}
												if ((local1110 & 0x1) == 1) {
													Static327.anInt6302 += Static97.anInt2037;
												}
												if ((local1110 & 0x2) == 2) {
													Static348.anInt6764 += Static301.anInt5980;
												}
											}
											if (Static327.anInt6302 < -50) {
												Static97.anInt2037 = 2;
											}
											if (Static348.anInt6764 < -55) {
												Static301.anInt5980 = 2;
											}
											if (Static327.anInt6302 > 50) {
												Static97.anInt2037 = -2;
											}
											if (Static348.anInt6764 > 55) {
												Static301.anInt5980 = -2;
											}
											if (Static2.anInt29 < -40) {
												Static192.anInt4004 = 1;
											}
											Static317.anInt5590++;
											if (Static2.anInt29 > 40) {
												Static192.anInt4004 = -1;
											}
											if (Static317.anInt5590 > 500) {
												Static317.anInt5590 = 0;
												local1110 = (int) (Math.random() * 8.0D);
												if ((local1110 & 0x2) == 2) {
													Static12.anInt309 += Static208.anInt4203;
												}
												if ((local1110 & 0x1) == 1) {
													Static42.anInt892 += Static294.anInt6361;
												}
											}
											if (Static42.anInt892 < -60) {
												Static294.anInt6361 = 2;
											}
											if (Static12.anInt309 < -20) {
												Static208.anInt4203 = 1;
											}
											if (Static42.anInt892 > 60) {
												Static294.anInt6361 = -2;
											}
											Static179.anInt3791++;
											if (Static12.anInt309 > 10) {
												Static208.anInt4203 = -1;
											}
											if (Static179.anInt3791 > 50) {
												Static291.aClass3_Sub4_Sub2_3.method3682(135);
											}
											if (Static149.aBoolean163) {
												Static91.method1446();
												Static149.aBoolean163 = false;
											}
											try {
												if (Static76.aClass16_2 != null && Static291.aClass3_Sub4_Sub2_3.anInt4268 > 0) {
													Static76.aClass16_2.method397(Static291.aClass3_Sub4_Sub2_3.aByteArray70, Static291.aClass3_Sub4_Sub2_3.anInt4268);
													Static179.anInt3791 = 0;
													Static291.aClass3_Sub4_Sub2_3.anInt4268 = 0;
													return;
												}
												return;
											} catch (@Pc(2061) IOException local2061) {
												Static301.method5086();
												return;
											}
										}
										local1386 = local1381.aClass181_54;
										if (local1386.anInt5688 < 0) {
											break;
										}
										local1394 = Static20.method415(local1386.anInt5734);
									} while (local1394 == null || local1394.aClass181Array2 == null || local1386.anInt5688 >= local1394.aClass181Array2.length || local1394.aClass181Array2[local1386.anInt5688] != local1386);
									Static139.method2275(local1381);
								}
							}
							local1386 = local1381.aClass181_54;
							if (local1386.anInt5688 < 0) {
								break;
							}
							local1394 = Static20.method415(local1386.anInt5734);
						} while (local1394 == null || local1394.aClass181Array2 == null || local1394.aClass181Array2.length <= local1386.anInt5688 || local1386 != local1394.aClass181Array2[local1386.anInt5688]);
						Static139.method2275(local1381);
					}
				}
				local1386 = local1381.aClass181_54;
				if (local1386.anInt5688 < 0) {
					break;
				}
				local1394 = Static20.method415(local1386.anInt5734);
			} while (local1394 == null || local1394.aClass181Array2 == null || local1394.aClass181Array2.length <= local1386.anInt5688 || local1386 != local1394.aClass181Array2[local1386.anInt5688]);
			Static139.method2275(local1381);
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BLclient!tj;I)Z")
	public static boolean method2169(@OriginalArg(1) Class122 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = (Static162.anInt2152 - 104) / 2;
		@Pc(17) int local17 = (Static122.anInt2632 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg1; local29 <= 3; local29++) {
					if (Static109.method1871(local25, local29, local21, arg1)) {
						local40 = local29;
						if (Static116.method2027(local25, local21)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static129.method2220(local25, local40, local21);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(90) int[] local90 = new int[262144];
		for (local29 = 0; local29 < local90.length; local29++) {
			local90[local29] = -16777216;
		}
		Static323.aClass57_22 = arg0.method4762(local90, 512, 512, 512);
		Static298.method5056();
		local40 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 228 << 16) + (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF000000;
		@Pc(167) int local167 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0x86B5FF00) << 16;
		@Pc(186) int local186 = (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D);
		@Pc(190) boolean[][] local190 = new boolean[Static320.anInt2554][Static320.anInt2554];
		@Pc(196) int local196;
		@Pc(213) int local213;
		@Pc(217) int local217;
		@Pc(221) int local221;
		@Pc(274) int local274;
		@Pc(280) int local280;
		@Pc(284) int local284;
		@Pc(307) int local307;
		for (@Pc(192) int local192 = local11; local192 < local11 + 104; local192 += Static320.anInt2554) {
			for (local196 = local17; local196 < local17 + 104; local196 += Static320.anInt2554) {
				arg0.method4768(0, 0, Static320.anInt2554 * 4, Static320.anInt2554 * 4);
				arg0.method4751(-16777216);
				for (local213 = arg1; local213 <= 3; local213++) {
					for (local217 = 0; local217 < Static320.anInt2554; local217++) {
						for (local221 = 0; local221 < Static320.anInt2554; local221++) {
							local190[local217][local221] = Static109.method1871(local196 + local221, local213, local217 + local192, arg1);
						}
					}
					Static355.aClass22Array3[local213].method4666(local192, local196, Static320.anInt2554 + local192, local196 + Static320.anInt2554, local190);
					if (!Static197.aBoolean231) {
						for (local221 = -4; local221 < Static320.anInt2554; local221++) {
							for (local274 = -4; local274 < Static320.anInt2554; local274++) {
								local280 = local192 + local221;
								local284 = local274 + local196;
								if (local11 <= local280 && local284 >= local17 && Static109.method1871(local284, local213, local280, arg1)) {
									local307 = local213;
									if (Static116.method2027(local284, local280)) {
										local307 = local213 - 1;
									}
									if (local307 >= 0) {
										Static311.method5220(local40, local307, local284, arg0, local280, local167, local221 * 4, (Static320.anInt2554 - local274) * 4 - 4);
									}
								}
							}
						}
					}
				}
				if (Static197.aBoolean231) {
					@Pc(352) Class13 local352 = Static34.aClass13Array1[arg1];
					for (local221 = 0; local221 < Static320.anInt2554; local221++) {
						for (local274 = 0; local274 < Static320.anInt2554; local274++) {
							local280 = local192 + local221;
							local284 = local274 + local196;
							local307 = local352.anIntArrayArray1[local280 - local352.anInt340][local284 - local352.anInt336];
							if ((local307 & 0x40240000) != 0) {
								arg0.method4801(4, local221 * 4, (Static320.anInt2554 - local274) * 4 - 4, 4, -1713569622);
							} else if ((local307 & 0x800000) != 0) {
								arg0.method4736(-1713569622, local221 * 4, 4, (Static320.anInt2554 - local274) * 4 - 4);
							} else if ((local307 & 0x2000000) != 0) {
								arg0.method4760(4, -1713569622, local221 * 4 + 3, (Static320.anInt2554 - local274) * 4 + -4);
							} else if ((local307 & 0x8000000) != 0) {
								arg0.method4736(-1713569622, local221 * 4, 4, (Static320.anInt2554 - local274) * 4 - 1);
							} else if ((local307 & 0x20000000) != 0) {
								arg0.method4760(4, -1713569622, local221 * 4, (Static320.anInt2554 - local274) * 4 - 4);
							}
						}
					}
				}
				arg0.method4732(0, 0, Static320.anInt2554 * 4, Static320.anInt2554 * 4, local186, 2);
				Static323.aClass57_22.method5432((local192 - local11) * 4 + 48, -(Static320.anInt2554 * 4) + -((-local17 + local196) * 4) + 464, Static320.anInt2554 * 4, Static320.anInt2554 * 4);
			}
		}
		arg0.method4734();
		arg0.method4751(-16777215);
		Static203.method3543();
		Static77.anInt1525 = 0;
		Static233.aClass127_25.method3401();
		if (!Static197.aBoolean231) {
			for (local196 = local11; local196 < local11 + 104; local196++) {
				for (local213 = local17; local213 < local17 + 104; local213++) {
					for (local217 = arg1; arg1 + 1 >= local217 && local217 <= 3; local217++) {
						if (Static109.method1871(local213, local217, local196, arg1)) {
							@Pc(621) Interface5 local621 = (Interface5) Static135.method2262(local217, local196, local213);
							if (local621 == null) {
								local621 = (Interface5) Static134.method2239(local217, local196, local213, lk.class);
							}
							if (local621 == null) {
								local621 = (Interface5) Static132.method2235(local217, local196, local213);
							}
							if (local621 == null) {
								local621 = (Interface5) Static2.method11(local217, local196, local213);
							}
							if (local621 != null) {
								@Pc(661) Class170 local661 = Static268.method4553(local621.method5344());
								if (!local661.aBoolean304 || Static126.aBoolean251) {
									local280 = local661.anInt5231;
									if (local661.anIntArray424 != null) {
										for (local284 = 0; local284 < local661.anIntArray424.length; local284++) {
											if (local661.anIntArray424[local284] != -1) {
												@Pc(689) Class170 local689 = Static268.method4553(local661.anIntArray424[local284]);
												if (local689.anInt5231 >= 0) {
													local280 = local689.anInt5231;
												}
											}
										}
									}
									if (local280 >= 0) {
										@Pc(709) boolean local709 = false;
										if (local280 >= 0) {
											@Pc(718) Class211 local718 = Static136.method2268(local280);
											if (local718 != null && local718.aBoolean443) {
												local709 = true;
											}
										}
										local307 = local196;
										@Pc(729) int local729 = local213;
										if (local709) {
											@Pc(736) int[][] local736 = Static34.aClass13Array1[local217].anIntArrayArray1;
											@Pc(741) int local741 = Static34.aClass13Array1[local217].anInt340;
											@Pc(746) int local746 = Static34.aClass13Array1[local217].anInt336;
											for (@Pc(748) int local748 = 0; local748 < 10; local748++) {
												@Pc(755) int local755 = (int) (Math.random() * 4.0D);
												if (local755 == 0 && local307 > local11 && local196 - 3 < local307 && (local736[local307 - local741 - 1][local729 - local746] & 0x2C0108) == 0) {
													local307--;
												}
												if (local755 == 1 && local11 + 104 - 1 > local307 && local307 < local196 + 3 && (local736[local307 + 1 - local741][local729 - local746] & 0x2C0180) == 0) {
													local307++;
												}
												if (local755 == 2 && local729 > local17 && local213 - 3 < local729 && (local736[local307 - local741][local729 - local746 - 1] & 0x2C0102) == 0) {
													local729--;
												}
												if (local755 == 3 && local729 < local17 + 104 - 1 && local729 < local213 + 3 && (local736[local307 - local741][local729 + 1 - local746] & 0x2C0120) == 0) {
													local729++;
												}
											}
										}
										Static184.anIntArray529[Static77.anInt1525] = local661.anInt5232;
										Static348.anIntArray564[Static77.anInt1525] = local307;
										Static40.anIntArray537[Static77.anInt1525] = local729;
										Static77.anInt1525++;
									}
								}
							}
						}
					}
				}
			}
			if (Static247.aClass146_5 != null) {
				Static296.aClass100_115.anInt2828 = 1;
				Static179.method2993(1024, 64);
				for (local213 = 0; local213 < Static247.aClass146_5.anInt4414; local213++) {
					local217 = Static247.aClass146_5.anIntArray357[local213];
					if (Static163.anInt3184 == local217 >> 28) {
						local221 = (local217 >> 14 & 0x3FFF) - Static186.anInt3094;
						local274 = (local217 & 0x3FFF) - Static296.anInt5889;
						if (local221 >= 0 && Static162.anInt2152 > local221 && local274 >= 0 && local274 < Static122.anInt2632) {
							Static233.aClass127_25.method3387(new Class3_Sub22(local213));
						} else {
							@Pc(1024) Class211 local1024 = Static136.method2268(Static247.aClass146_5.anIntArray356[local213]);
							if (local1024.anIntArray555 != null && local221 + local1024.anInt6620 >= 0 && Static162.anInt2152 > local221 + local1024.anInt6586 && local1024.anInt6615 + local274 >= 0 && Static122.anInt2632 > local1024.anInt6587 + local274) {
								Static233.aClass127_25.method3387(new Class3_Sub22(local213));
							}
						}
					}
				}
				Static179.method2993(128, 64);
				Static296.aClass100_115.anInt2828 = 2;
				Static296.aClass100_115.method2295();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
	public static void method2171() {
		if (Static104.anInt2185 == 0) {
			return;
		}
		try {
			if (++Static273.anInt5473 > 2000) {
				if (Static76.aClass16_2 != null) {
					Static76.aClass16_2.method392();
					Static76.aClass16_2 = null;
				}
				if (Static307.anInt6097 >= 1) {
					Static104.anInt2185 = 0;
					Static92.anInt1817 = -5;
					return;
				}
				Static273.anInt5473 = 0;
				Static104.anInt2185 = 1;
				Static307.anInt6097++;
				if (Static342.anInt6677 == Static47.anInt1037) {
					Static342.anInt6677 = Static230.anInt6570;
				} else {
					Static342.anInt6677 = Static47.anInt1037;
				}
			}
			if (Static104.anInt2185 == 1) {
				Static277.aClass207_7 = Static353.aClass42_5.method960(Static342.anInt6677, Static346.aString255);
				Static104.anInt2185 = 2;
			}
			@Pc(119) int local119;
			if (Static104.anInt2185 == 2) {
				if (Static277.aClass207_7.anInt6346 == 2) {
					throw new IOException();
				}
				if (Static277.aClass207_7.anInt6346 != 1) {
					return;
				}
				Static76.aClass16_2 = new Class16((Socket) Static277.aClass207_7.anObject7, Static353.aClass42_5);
				Static277.aClass207_7 = null;
				Static76.aClass16_2.method397(Static291.aClass3_Sub4_Sub2_3.aByteArray70, Static291.aClass3_Sub4_Sub2_3.anInt4268);
				if (Static348.aClass30_2 != null) {
					Static348.aClass30_2.method4515();
				}
				if (Static194.aClass30_1 != null) {
					Static194.aClass30_1.method4515();
				}
				local119 = Static76.aClass16_2.method394();
				if (Static348.aClass30_2 != null) {
					Static348.aClass30_2.method4515();
				}
				if (Static194.aClass30_1 != null) {
					Static194.aClass30_1.method4515();
				}
				if (local119 != 21) {
					Static104.anInt2185 = 0;
					Static92.anInt1817 = local119;
					Static76.aClass16_2.method392();
					Static76.aClass16_2 = null;
					return;
				}
				Static104.anInt2185 = 3;
			}
			if (Static104.anInt2185 == 3) {
				if (Static76.aClass16_2.method391() < 1) {
					return;
				}
				Static246.aStringArray29 = new String[Static76.aClass16_2.method394()];
				Static104.anInt2185 = 4;
			}
			if (Static104.anInt2185 == 4 && Static76.aClass16_2.method391() >= Static246.aStringArray29.length * 8) {
				Static20.aClass3_Sub4_Sub2_1.anInt4268 = 0;
				Static76.aClass16_2.method398(Static20.aClass3_Sub4_Sub2_1.aByteArray70, 0, Static246.aStringArray29.length * 8);
				for (local119 = 0; local119 < Static246.aStringArray29.length; local119++) {
					Static246.aStringArray29[local119] = Static232.method4000(Static20.aClass3_Sub4_Sub2_1.method3641());
				}
				Static104.anInt2185 = 0;
				Static92.anInt1817 = 21;
				Static76.aClass16_2.method392();
				Static76.aClass16_2 = null;
			}
		} catch (@Pc(229) IOException local229) {
			if (Static76.aClass16_2 != null) {
				Static76.aClass16_2.method392();
				Static76.aClass16_2 = null;
			}
			if (Static307.anInt6097 < 1) {
				Static104.anInt2185 = 1;
				Static307.anInt6097++;
				Static273.anInt5473 = 0;
				if (Static47.anInt1037 == Static342.anInt6677) {
					Static342.anInt6677 = Static230.anInt6570;
				} else {
					Static342.anInt6677 = Static47.anInt1037;
				}
			} else {
				Static104.anInt2185 = 0;
				Static92.anInt1817 = -4;
			}
		}
	}
}
