import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!jo", name = "x", descriptor = "I")
	private static int anInt4794 = 2;

	@OriginalMember(owner = "client!jo", name = "A", descriptor = "I")
	public static int anInt4797 = 1;

	@OriginalMember(owner = "client!jo", name = "D", descriptor = "I")
	public static int anInt4800 = 0;

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "(I)V")
	public static void method4109() {
		if (Static97.anInt1865 > 1) {
			Static330.anInt6004 = Static592.anInt9587;
			Static97.anInt1865--;
		}
		if (Static283.aBoolean380) {
			Static283.aBoolean380 = false;
			Static97.method1750();
			return;
		}
		if (!Static587.aBoolean734) {
			Static305.method1155();
		}
		for (@Pc(31) int local31 = 0; local31 < 100 && Static333.method5191(); local31++) {
		}
		if (Static557.anInt9206 != 10) {
			return;
		}
		@Pc(51) Class6_Sub31 local51;
		@Pc(60) int local60;
		while (Static305.method1153()) {
			local51 = Static114.method2007(Static430.aClass47_117, Static337.aClass324_1);
			local51.aClass6_Sub21_Sub2_2.method6062(0);
			local60 = local51.aClass6_Sub21_Sub2_2.anInt7338;
			Static382.method5653(local51.aClass6_Sub21_Sub2_2);
			local51.aClass6_Sub21_Sub2_2.method6008(local51.aClass6_Sub21_Sub2_2.anInt7338 - local60);
			Static534.method7251(local51);
		}
		if (Class273.lb == null) {
			if (Static8.method201() >= Static182.aLong95) {
				Class273.lb = Static304.aClass23_1.method887(Static316.aClass105_5.aString26);
			}
		} else if (Class273.lb.anInt8165 != -1) {
			local51 = Static114.method2007(Static540.aClass47_62, Static337.aClass324_1);
			local51.aClass6_Sub21_Sub2_2.method6052(Class273.lb.anInt8165);
			Static534.method7251(local51);
			Class273.lb = null;
			Static182.aLong95 = Static8.method201() + 30000L;
		}
		@Pc(132) Class6_Sub5 local132 = (Class6_Sub5) Static395.aClass361_52.method7838();
		@Pc(151) int local151;
		@Pc(176) int local176;
		@Pc(193) int local193;
		@Pc(245) int local245;
		@Pc(251) int local251;
		@Pc(265) int local265;
		@Pc(149) Class6_Sub31 local149;
		if (local132 != null || Static8.method201() - 2000L > Static486.aLong221) {
			local149 = null;
			local151 = 0;
			for (@Pc(156) Class6_Sub5 local156 = (Class6_Sub5) Static19.aClass361_49.method7838(); local156 != null && (local149 == null || local149.aClass6_Sub21_Sub2_2.anInt7338 - local151 < 240); local156 = (Class6_Sub5) Static19.aClass361_49.method7845()) {
				local156.method7804();
				local176 = local156.method1982();
				if (local176 < -1) {
					local176 = -1;
				} else if (local176 > 65534) {
					local176 = 65534;
				}
				local193 = local156.method1991();
				if (local193 < -1) {
					local193 = -1;
				} else if (local193 > 65534) {
					local193 = 65534;
				}
				if (Static173.anInt3663 != local193 || local176 != Static129.anInt2930) {
					if (local149 == null) {
						local149 = Static114.method2007(Static219.aClass47_66, Static337.aClass324_1);
						local149.aClass6_Sub21_Sub2_2.method6062(0);
						local151 = local149.aClass6_Sub21_Sub2_2.anInt7338;
					}
					local245 = local193 - Static173.anInt3663;
					Static173.anInt3663 = local193;
					local251 = local176 - Static129.anInt2930;
					Static129.anInt2930 = local176;
					local265 = (int) ((local156.method1985() - Static486.aLong221) / 20L);
					if (local265 < 8 && local245 >= -32 && local245 <= 31 && local251 >= -32 && local251 <= 31) {
						local245 += 32;
						local251 += 32;
						local149.aClass6_Sub21_Sub2_2.method6052((local265 << 12) + (local245 << 6) + local251);
					} else if (local265 < 32 && local245 >= -128 && local245 <= 127 && local251 >= -128 && local251 <= 127) {
						local251 += 128;
						local149.aClass6_Sub21_Sub2_2.method6062(local265 + 128);
						local245 += 128;
						local149.aClass6_Sub21_Sub2_2.method6052((local245 << 8) + local251);
					} else if (local265 < 32) {
						local149.aClass6_Sub21_Sub2_2.method6062(local265 + 192);
						if (local193 == 1 || local176 == -1) {
							local149.aClass6_Sub21_Sub2_2.method6033(Integer.MIN_VALUE);
						} else {
							local149.aClass6_Sub21_Sub2_2.method6033(local193 | local176 << 16);
						}
					} else {
						local149.aClass6_Sub21_Sub2_2.method6052(local265 + 57344);
						if (local193 == 1 || local176 == -1) {
							local149.aClass6_Sub21_Sub2_2.method6033(Integer.MIN_VALUE);
						} else {
							local149.aClass6_Sub21_Sub2_2.method6033(local193 | local176 << 16);
						}
					}
					Static486.aLong221 = local156.method1985();
				}
			}
			if (local149 != null) {
				local149.aClass6_Sub21_Sub2_2.method6008(local149.aClass6_Sub21_Sub2_2.anInt7338 - local151);
				Static534.method7251(local149);
			}
		}
		@Pc(469) int local469;
		if (local132 != null) {
			@Pc(453) long local453 = (local132.method1985() - Static8.aLong9) / 50L;
			if (local453 > 32767L) {
				local453 = 32767L;
			}
			Static8.aLong9 = local132.method1985();
			local469 = local132.method1982();
			if (local469 < 0) {
				local469 = 0;
			} else if (local469 > 65535) {
				local469 = 65535;
			}
			local176 = local132.method1991();
			if (local176 < 0) {
				local176 = 0;
			} else if (local176 > 65535) {
				local176 = 65535;
			}
			@Pc(502) byte local502 = 0;
			if (local132.method1986() == 2) {
				local502 = 1;
			}
			local245 = (int) local453;
			@Pc(521) Class6_Sub31 local521 = Static114.method2007(Static341.aClass47_98, Static337.aClass324_1);
			local521.aClass6_Sub21_Sub2_2.method6033(local469 << 16 | local176);
			local521.aClass6_Sub21_Sub2_2.method6023(local502 << 15 | local245);
			Static534.method7251(local521);
		}
		if (Static86.anInt1717 > 0) {
			local149 = Static114.method2007(Static374.aClass47_101, Static337.aClass324_1);
			local149.aClass6_Sub21_Sub2_2.method6062(Static86.anInt1717 * 3);
			for (local151 = 0; local151 < Static86.anInt1717; local151++) {
				@Pc(571) Interface8 local571 = Static119.anInterface8Array1[local151];
				@Pc(580) long local580 = (local571.method1042() - Static488.aLong141) / 50L;
				Static488.aLong141 = local571.method1042();
				if (local580 > 65535L) {
					local580 = 65535L;
				}
				local149.aClass6_Sub21_Sub2_2.method6062(local571.method1038());
				local149.aClass6_Sub21_Sub2_2.method6052((int) local580);
			}
			Static534.method7251(local149);
		}
		if (Static488.anInt5159 > 0) {
			Static488.anInt5159--;
		}
		if (Static261.aBoolean359 && Static488.anInt5159 <= 0) {
			Static261.aBoolean359 = false;
			Static488.anInt5159 = 20;
			local149 = Static114.method2007(Static287.aClass47_85, Static337.aClass324_1);
			local149.aClass6_Sub21_Sub2_2.method6039((int) Static331.aFloat140 >> 3);
			local149.aClass6_Sub21_Sub2_2.method6023((int) Static428.aFloat160 >> 3);
			Static534.method7251(local149);
		}
		if (Static470.aBoolean53 != Static203.aBoolean287) {
			Static203.aBoolean287 = Static470.aBoolean53;
			local149 = Static114.method2007(Static496.aClass47_128, Static337.aClass324_1);
			local149.aClass6_Sub21_Sub2_2.method6062(Static470.aBoolean53 ? 1 : 0);
			Static534.method7251(local149);
		}
		if (!Static408.aBoolean501) {
			local149 = Static114.method2007(Static305.aClass47_22, Static337.aClass324_1);
			local149.aClass6_Sub21_Sub2_2.method6062(0);
			local151 = local149.aClass6_Sub21_Sub2_2.anInt7338;
			@Pc(719) Class6_Sub21 local719 = new Class6_Sub21(Static333.method5194());
			Static140.aClass6_Sub48_Sub1_1.method7372(local719);
			local149.aClass6_Sub21_Sub2_2.method6063(local719.aByteArray93, local719.anInt7338);
			local149.aClass6_Sub21_Sub2_2.method6008(local149.aClass6_Sub21_Sub2_2.anInt7338 - local151);
			Static534.method7251(local149);
			Static408.aBoolean501 = true;
		}
		if (Static270.aClass276ArrayArrayArray2 != null) {
			if (Static346.anInt6215 == 2) {
				Static12.method252();
			} else if (Static346.anInt6215 == 3) {
				Static542.method7334();
			}
		}
		if (Static438.aBoolean528) {
			Static438.aBoolean528 = false;
		} else {
			Static272.aFloat131 /= 2.0F;
		}
		if (Static73.aBoolean110) {
			Static73.aBoolean110 = false;
		} else {
			Static345.aFloat142 /= 2.0F;
		}
		Static55.method1207();
		if (Static557.anInt9206 != 10) {
			return;
		}
		Static211.method3732();
		Static392.method6492();
		Static281.method4620();
		Static377.method5603();
		Static530.anInt8824++;
		if (Static530.anInt8824 > 750) {
			Static97.method1750();
			return;
		}
		Static545.method7396();
		Static22.method4013();
		Static94.method1699();
		for (local60 = Static498.aClass101_1.method2870(true); local60 != -1; local60 = Static498.aClass101_1.method2870(false)) {
			Static445.method6315(local60);
			Static528.anIntArray649[Static51.anInt1126++ & 0x1F] = local60;
		}
		@Pc(906) Class292 local906;
		for (@Pc(856) Class6_Sub2_Sub7 local856 = Static400.method5853(); local856 != null; local856 = Static400.method5853()) {
			local469 = local856.method2588();
			local176 = local856.method2586();
			if (local469 == 1) {
				Static395.anIntArray511[local176] = local856.anInt2944;
				Static185.aBoolean264 |= Static165.aBooleanArray29[local176];
				Static79.anIntArray143[Static155.anInt3335++ & 0x1F] = local176;
			} else if (local469 == 2) {
				Static334.aStringArray24[local176] = local856.aString24;
				Static499.anIntArray606[Static308.anInt5659++ & 0x1F] = local176;
			} else if (local469 == 3) {
				local906 = Static367.method5505(local176);
				if (!local856.aString24.equals(local906.aString77)) {
					local906.aString77 = local856.aString24;
					Static464.method6502(local906);
				}
			} else if (local469 == 4) {
				local906 = Static367.method5505(local176);
				local245 = local856.anInt2944;
				local251 = local856.anInt2947;
				local265 = local856.anInt2942;
				if (local906.anInt7885 != local245 || local906.anInt7942 != local251 || local906.anInt7967 != local265) {
					local906.anInt7967 = local265;
					local906.anInt7885 = local245;
					local906.anInt7942 = local251;
					Static464.method6502(local906);
				}
			} else if (local469 == 5) {
				local906 = Static367.method5505(local176);
				if (local856.anInt2944 != local906.anInt7936 || local856.anInt2944 == -1) {
					local906.anInt7941 = 0;
					local906.anInt7936 = local856.anInt2944;
					local906.anInt7886 = 1;
					local906.anInt7969 = 0;
					@Pc(1015) Class57 local1015 = local906.anInt7936 == -1 ? null : Static78.aClass298_2.method6521(local906.anInt7936);
					if (local1015 != null) {
						Static240.method4205(local906.anInt7969, local1015);
					}
					Static464.method6502(local906);
				}
			} else if (local469 == 6) {
				local193 = local856.anInt2944;
				local245 = local193 >> 10 & 0x1F;
				local251 = local193 >> 5 & 0x1F;
				local265 = local193 & 0x1F;
				@Pc(1063) int local1063 = (local265 << 3) + (local251 << 11) + (local245 << 19);
				@Pc(1067) Class292 local1067 = Static367.method5505(local176);
				if (local1063 != local1067.anInt7898) {
					local1067.anInt7898 = local1063;
					Static464.method6502(local1067);
				}
			} else if (local469 == 7) {
				local906 = Static367.method5505(local176);
				@Pc(1102) boolean local1102 = local856.anInt2944 == 1;
				if (local906.aBoolean560 != local1102) {
					local906.aBoolean560 = local1102;
					Static464.method6502(local906);
				}
			} else if (local469 == 8) {
				local906 = Static367.method5505(local176);
				if (local856.anInt2944 != local906.anInt7951 || local856.anInt2947 != local906.anInt7897 || local906.anInt7904 != local856.anInt2942) {
					local906.anInt7904 = local856.anInt2942;
					local906.anInt7897 = local856.anInt2947;
					local906.anInt7951 = local856.anInt2944;
					if (local906.anInt7933 != -1) {
						if (local906.anInt7914 > 0) {
							local906.anInt7904 = local906.anInt7904 * 32 / local906.anInt7914;
						} else if (local906.anInt7962 > 0) {
							local906.anInt7904 = local906.anInt7904 * 32 / local906.anInt7962;
						}
					}
					Static464.method6502(local906);
				}
			} else if (local469 == 9) {
				local906 = Static367.method5505(local176);
				if (local906.anInt7933 != local856.anInt2944 || local856.anInt2947 != local906.anInt7924) {
					local906.anInt7933 = local856.anInt2944;
					local906.anInt7924 = local856.anInt2947;
					Static464.method6502(local906);
				}
			} else if (local469 == 10) {
				local906 = Static367.method5505(local176);
				if (local856.anInt2944 != local906.anInt7939 || local856.anInt2947 != local906.anInt7893 || local906.anInt7926 != local856.anInt2942) {
					local906.anInt7893 = local856.anInt2947;
					local906.anInt7939 = local856.anInt2944;
					local906.anInt7926 = local856.anInt2942;
					Static464.method6502(local906);
				}
			} else if (local469 == 11) {
				local906 = Static367.method5505(local176);
				local906.anInt7883 = local906.anInt7920 = local856.anInt2944;
				local906.aByte96 = 0;
				local906.anInt7923 = local906.anInt7960 = local856.anInt2947;
				local906.aByte94 = 0;
				Static464.method6502(local906);
			} else if (local469 == 12) {
				local906 = Static367.method5505(local176);
				local245 = local856.anInt2944;
				if (local906 != null && local906.lb == 0) {
					if (local245 > local906.anInt7949 - local906.anInt7912) {
						local245 = local906.anInt7949 - local906.anInt7912;
					}
					if (local245 < 0) {
						local245 = 0;
					}
					if (local245 != local906.anInt7911) {
						local906.anInt7911 = local245;
						Static464.method6502(local906);
					}
				}
			} else if (local469 == 14) {
				local906 = Static367.method5505(local176);
				local906.anInt7946 = local856.anInt2944;
			} else if (local469 == 15) {
				Static71.aBoolean107 = true;
				Static530.anInt8828 = local856.anInt2944;
				Static210.anInt4254 = local856.anInt2947;
			} else if (local469 == 16) {
				local906 = Static367.method5505(local176);
				local906.anInt7954 = local856.anInt2944;
			}
		}
		Static54.anInt1208++;
		if (Static445.anInt7719 != 0) {
			Static212.anInt4275 += 20;
			if (Static212.anInt4275 >= 400) {
				Static445.anInt7719 = 0;
			}
		}
		if (Static25.aClass292_2 != null) {
			Static155.anInt3339++;
			if (Static155.anInt3339 >= 15) {
				Static464.method6502(Static25.aClass292_2);
				Static25.aClass292_2 = null;
			}
		}
		Static90.aBoolean718 = false;
		Static408.aClass292_6 = null;
		Static577.aBoolean723 = false;
		Static1.aClass292_16 = null;
		Static560.method7563(null, -1, -1);
		Static202.method3654(null, -1, -1);
		if (!Static199.aBoolean458) {
			Static245.anInt4901 = -1;
		}
		Static112.method1994();
		Static592.anInt9587++;
		if (Static395.aBoolean486) {
			@Pc(1494) Class6_Sub31 local1494 = Static114.method2007(Static92.aClass47_32, Static337.aClass324_1);
			local1494.aClass6_Sub21_Sub2_2.method6061(Static290.anInt5424 << 14 | Static310.anInt1807 << 28 | Static130.anInt2956);
			Static534.method7251(local1494);
			Static395.aBoolean486 = false;
		}
		while (true) {
			@Pc(1517) Class6_Sub43 local1517;
			@Pc(1522) Class292 local1522;
			do {
				local1517 = (Class6_Sub43) Static445.aClass361_55.method7835();
				if (local1517 == null) {
					while (true) {
						do {
							local1517 = (Class6_Sub43) Static141.aClass361_22.method7835();
							if (local1517 == null) {
								while (true) {
									do {
										local1517 = (Class6_Sub43) Static127.aClass361_21.method7835();
										if (local1517 == null) {
											if (Static1.aClass292_16 == null) {
												Static114.anInt2194 = 0;
											}
											if (Static547.aClass292_14 != null) {
												Static409.method7705();
											}
											if (Static582.anInt9457 > 0 && Static365.aClass155_1.method4042(82) && Static365.aClass155_1.method4042(81) && Static330.anInt6006 != 0) {
												local469 = Static328.aClass4_Sub1_Sub1_Sub2_2.aByte108 - Static330.anInt6006;
												if (local469 < 0) {
													local469 = 0;
												} else if (local469 > 3) {
													local469 = 3;
												}
												Static284.method4645(local469, Static328.aClass4_Sub1_Sub1_Sub2_2.anIntArray522[0] + Static138.anInt3088, Static328.aClass4_Sub1_Sub1_Sub2_2.anIntArray521[0] + Static39.anInt4952);
											}
											Static253.method4294();
											for (local469 = 0; local469 < 5; local469++) {
												@Pc(1715) int local1715 = Static6.anIntArray251[local469]++;
											}
											if (Static185.aBoolean264 && Static8.method201() - 60000L > Static559.aLong254) {
												Static512.method7099();
											}
											for (@Pc(1744) Class98_Sub1_Sub2 local1744 = (Class98_Sub1_Sub2) Static74.aClass40_1.method1132(); local1744 != null; local1744 = (Class98_Sub1_Sub2) Static74.aClass40_1.method1129()) {
												if ((long) local1744.anInt6945 < Static8.method201() / 1000L - 5L) {
													if (local1744.aShort89 > 0) {
														Static417.method5982("", "", "", local1744.aString60 + Static230.aClass156_18.method4065(Static25.anInt769), 0, 5);
													}
													if (local1744.aShort89 == 0) {
														Static417.method5982("", "", "", local1744.aString60 + Static230.aClass156_19.method4065(Static25.anInt769), 0, 5);
													}
													local1744.method7855();
												}
											}
											Static273.anInt5233++;
											if (Static273.anInt5233 > 500) {
												Static273.anInt5233 = 0;
												local193 = (int) (Math.random() * 8.0D);
												if ((local193 & 0x2) == 2) {
													Static95.anInt1825 += anInt4794;
												}
												if ((local193 & 0x1) == 1) {
													Static289.anInt5381 += Static157.anInt3354;
												}
												if ((local193 & 0x4) == 4) {
													Static196.anInt4058 += Static512.anInt8676;
												}
											}
											if (Static289.anInt5381 < -50) {
												Static157.anInt3354 = 2;
											}
											if (Static95.anInt1825 < -55) {
												anInt4794 = 2;
											}
											if (Static289.anInt5381 > 50) {
												Static157.anInt3354 = -2;
											}
											if (Static196.anInt4058 < -40) {
												Static512.anInt8676 = 1;
											}
											if (Static95.anInt1825 > 55) {
												anInt4794 = -2;
											}
											Static74.anInt1534++;
											if (Static196.anInt4058 > 40) {
												Static512.anInt8676 = -1;
											}
											if (Static74.anInt1534 > 500) {
												Static74.anInt1534 = 0;
												local193 = (int) (Math.random() * 8.0D);
												if ((local193 & 0x2) == 2) {
													Static291.anInt5446 += Static256.anInt5002;
												}
												if ((local193 & 0x1) == 1) {
													Static185.anInt3860 += Static36.anInt955;
												}
											}
											if (Static185.anInt3860 < -60) {
												Static36.anInt955 = 2;
											}
											if (Static185.anInt3860 > 60) {
												Static36.anInt955 = -2;
											}
											if (Static291.anInt5446 < -20) {
												Static256.anInt5002 = 1;
											}
											if (Static291.anInt5446 > 10) {
												Static256.anInt5002 = -1;
											}
											Static133.anInt2978++;
											if (Static133.anInt2978 > 50) {
												@Pc(1975) Class6_Sub31 local1975 = Static114.method2007(Static596.aClass47_155, Static337.aClass324_1);
												Static534.method7251(local1975);
											}
											if (Static558.aBoolean714) {
												Static311.method4889();
												Static558.aBoolean714 = false;
											}
											try {
												Static278.method4563();
												return;
											} catch (@Pc(1990) IOException local1990) {
												Static97.method1750();
												return;
											}
										}
										local1522 = local1517.aClass292_12;
										if (local1522.anInt7964 < 0) {
											break;
										}
										local906 = Static367.method5505(local1522.anInt7901);
									} while (local906 == null || local906.aClass292Array2 == null || local906.aClass292Array2.length <= local1522.anInt7964 || local906.aClass292Array2[local1522.anInt7964] != local1522);
									Static446.method6319(local1517);
								}
							}
							local1522 = local1517.aClass292_12;
							if (local1522.anInt7964 < 0) {
								break;
							}
							local906 = Static367.method5505(local1522.anInt7901);
						} while (local906 == null || local906.aClass292Array2 == null || local1522.anInt7964 >= local906.aClass292Array2.length || local906.aClass292Array2[local1522.anInt7964] != local1522);
						Static446.method6319(local1517);
					}
				}
				local1522 = local1517.aClass292_12;
				if (local1522.anInt7964 < 0) {
					break;
				}
				local906 = Static367.method5505(local1522.anInt7901);
			} while (local906 == null || local906.aClass292Array2 == null || local1522.anInt7964 >= local906.aClass292Array2.length || local906.aClass292Array2[local1522.anInt7964] != local1522);
			Static446.method6319(local1517);
		}
	}
}
