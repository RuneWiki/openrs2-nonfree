import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static589 {

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "I")
	public static int anInt9469;

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "[Lclient!vr;")
	public static Class33[] aClass33Array26;

	@OriginalMember(owner = "client!tu", name = "e", descriptor = "[I")
	public static int[] anIntArray820;

	@OriginalMember(owner = "client!tu", name = "f", descriptor = "Lclient!u;")
	public static Class342 aClass342_4;

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(B)V")
	public static void method8286() {
		if (Static620.anInt9925 > 1) {
			Static620.anInt9925--;
			Static126.anInt2583 = Static629.anInt10041;
		}
		if (Static286.aBoolean362) {
			Static286.aBoolean362 = false;
			Static663.method9152();
			return;
		}
		if (!Static43.aBoolean74) {
			Static449.method6568();
		}
		for (@Pc(27) int local27 = 0; local27 < 100 && Static498.method8890(); local27++) {
		}
		if (Static406.anInt6454 != 10) {
			return;
		}
		@Pc(51) Class3_Sub34 local51;
		@Pc(60) int local60;
		while (Static20.method6839()) {
			local51 = Static172.method3123(Static163.aClass375_1, Static15.aClass218_129);
			local51.aClass3_Sub25_Sub1_2.method8614(0);
			local60 = local51.aClass3_Sub25_Sub1_2.anInt9765;
			Static395.method5580(local51.aClass3_Sub25_Sub1_2);
			local51.aClass3_Sub25_Sub1_2.method8628(local51.aClass3_Sub25_Sub1_2.anInt9765 - local60);
			Static441.method6275(local51);
		}
		if (Static479.aClass3_Sub26_1 == null) {
			if (Static524.method7320() >= Static494.aLong245) {
				Static479.aClass3_Sub26_1 = Static352.aClass42_1.method1154(Static541.aClass342_3.aString113);
			}
		} else if (Static479.aClass3_Sub26_1.anInt3727 != -1) {
			local51 = Static172.method3123(Static163.aClass375_1, Static570.aClass218_134);
			local51.aClass3_Sub25_Sub1_2.method8649(Static479.aClass3_Sub26_1.anInt3727);
			Static441.method6275(local51);
			Static479.aClass3_Sub26_1 = null;
			Static494.aLong245 = Static524.method7320() + 30000L;
		}
		@Pc(129) Class3_Sub43 local129 = (Class3_Sub43) Static655.aClass338_233.method8177();
		@Pc(142) int local142;
		@Pc(164) int local164;
		@Pc(182) int local182;
		@Pc(233) int local233;
		@Pc(240) int local240;
		@Pc(252) int local252;
		@Pc(140) Class3_Sub34 local140;
		if (local129 != null || Static124.aLong81 < Static524.method7320() - 2000L) {
			local140 = null;
			local142 = 0;
			for (@Pc(147) Class3_Sub43 local147 = (Class3_Sub43) Static457.aClass338_185.method8177(); local147 != null && (local140 == null || local140.aClass3_Sub25_Sub1_2.anInt9765 - local142 < 240); local147 = (Class3_Sub43) Static457.aClass338_185.method8168()) {
				local147.method9380();
				local164 = local147.method7777();
				if (local164 < -1) {
					local164 = -1;
				} else if (local164 > 65534) {
					local164 = 65534;
				}
				local182 = local147.method7774();
				if (local182 < -1) {
					local182 = -1;
				} else if (local182 > 65534) {
					local182 = 65534;
				}
				if (Static553.anInt9036 != local182 || local164 != Static236.anInt4342) {
					if (local140 == null) {
						local140 = Static172.method3123(Static163.aClass375_1, Static374.aClass218_91);
						local140.aClass3_Sub25_Sub1_2.method8614(0);
						local142 = local140.aClass3_Sub25_Sub1_2.anInt9765;
					}
					local233 = local182 - Static553.anInt9036;
					Static553.anInt9036 = local182;
					local240 = local164 - Static236.anInt4342;
					Static236.anInt4342 = local164;
					local252 = (int) ((local147.method7779() - Static124.aLong81) / 20L);
					if (local252 < 8 && local233 >= -32 && local233 <= 31 && local240 >= -32 && local240 <= 31) {
						local240 += 32;
						local233 += 32;
						local140.aClass3_Sub25_Sub1_2.method8649((local233 << 6) + (local252 << 12) + local240);
					} else if (local252 < 32 && local233 >= -128 && local233 <= 127 && local240 >= -128 && local240 <= 127) {
						local233 += 128;
						local140.aClass3_Sub25_Sub1_2.method8614(local252 + 128);
						local240 += 128;
						local140.aClass3_Sub25_Sub1_2.method8649((local233 << 8) + local240);
					} else if (local252 >= 32) {
						local140.aClass3_Sub25_Sub1_2.method8649(local252 + 57344);
						if (local182 == 1 || local164 == -1) {
							local140.aClass3_Sub25_Sub1_2.method8588(Integer.MIN_VALUE);
						} else {
							local140.aClass3_Sub25_Sub1_2.method8588(local164 << 16 | local182);
						}
					} else {
						local140.aClass3_Sub25_Sub1_2.method8614(local252 + 192);
						if (local182 == 1 || local164 == -1) {
							local140.aClass3_Sub25_Sub1_2.method8588(Integer.MIN_VALUE);
						} else {
							local140.aClass3_Sub25_Sub1_2.method8588(local164 << 16 | local182);
						}
					}
					Static124.aLong81 = local147.method7779();
				}
			}
			if (local140 != null) {
				local140.aClass3_Sub25_Sub1_2.method8628(local140.aClass3_Sub25_Sub1_2.anInt9765 - local142);
				Static441.method6275(local140);
			}
		}
		@Pc(454) int local454;
		if (local129 != null) {
			@Pc(438) long local438 = (local129.method7779() - Static436.aLong220) / 50L;
			Static436.aLong220 = local129.method7779();
			if (local438 > 32767L) {
				local438 = 32767L;
			}
			local454 = local129.method7777();
			if (local454 < 0) {
				local454 = 0;
			} else if (local454 > 65535) {
				local454 = 65535;
			}
			local164 = local129.method7774();
			if (local164 < 0) {
				local164 = 0;
			} else if (local164 > 65535) {
				local164 = 65535;
			}
			@Pc(485) byte local485 = 0;
			if (local129.method7778() == 2) {
				local485 = 1;
			}
			local233 = (int) local438;
			@Pc(506) Class3_Sub34 local506 = Static172.method3123(Static163.aClass375_1, Static189.aClass218_83);
			local506.aClass3_Sub25_Sub1_2.method8595(local454 << 16 | local164);
			local506.aClass3_Sub25_Sub1_2.method8596(local233 | local485 << 15);
			Static441.method6275(local506);
		}
		@Pc(564) long local564;
		if (Static664.anInt10591 > 0) {
			local140 = Static172.method3123(Static163.aClass375_1, Static617.aClass218_148);
			local140.aClass3_Sub25_Sub1_2.method8614(Static664.anInt10591 * 3);
			for (local142 = 0; local142 < Static664.anInt10591; local142++) {
				@Pc(556) Interface22 local556 = Static32.anInterface22Array1[local142];
				local564 = (local556.method7007() - Static97.aLong20) / 50L;
				if (local564 > 65535L) {
					local564 = 65535L;
				}
				Static97.aLong20 = local556.method7007();
				local140.aClass3_Sub25_Sub1_2.method8614(local556.method7005());
				local140.aClass3_Sub25_Sub1_2.method8649((int) local564);
			}
			Static441.method6275(local140);
		}
		if (Static2.anInt9931 > 0) {
			Static2.anInt9931--;
		}
		if (Static214.aBoolean310 && Static2.anInt9931 <= 0) {
			Static214.aBoolean310 = false;
			Static2.anInt9931 = 20;
			local140 = Static172.method3123(Static163.aClass375_1, Static478.aClass218_119);
			local140.aClass3_Sub25_Sub1_2.method8596((int) Static618.aFloat207 >> 3);
			local140.aClass3_Sub25_Sub1_2.method8649((int) Static667.aFloat212 >> 3);
			Static441.method6275(local140);
		}
		if (Static160.aBoolean240 != Static633.aBoolean766) {
			Static160.aBoolean240 = Static633.aBoolean766;
			local140 = Static172.method3123(Static163.aClass375_1, Static240.aClass218_64);
			local140.aClass3_Sub25_Sub1_2.method8614(Static633.aBoolean766 ? 1 : 0);
			Static441.method6275(local140);
		}
		if (!Static275.aBoolean358) {
			local140 = Static172.method3123(Static163.aClass375_1, Static415.aClass218_97);
			local140.aClass3_Sub25_Sub1_2.method8614(0);
			local142 = local140.aClass3_Sub25_Sub1_2.anInt9765;
			@Pc(691) Class3_Sub25 local691 = Static24.aClass3_Sub22_4.method2839();
			local140.aClass3_Sub25_Sub1_2.method8637(local691.aByteArray106, local691.anInt9765, 0);
			local140.aClass3_Sub25_Sub1_2.method8628(local140.aClass3_Sub25_Sub1_2.anInt9765 - local142);
			Static441.method6275(local140);
			Static275.aBoolean358 = true;
		}
		if (Static15.aClass164ArrayArrayArray5 != null) {
			if (Static428.anInt6834 == 2) {
				Static55.method1207();
			} else if (Static428.anInt6834 == 3) {
				Static273.method4432();
			}
		}
		if (Static470.aBoolean587) {
			Static470.aBoolean587 = false;
		} else {
			Static577.aFloat226 /= 2.0F;
		}
		if (Static139.aBoolean217) {
			Static139.aBoolean217 = false;
		} else {
			Static667.aFloat213 /= 2.0F;
		}
		Static572.method8073();
		if (Static406.anInt6454 != 10) {
			return;
		}
		Static523.method7310();
		Static150.method5038();
		Static516.method7267();
		Static394.anInt6210++;
		if (Static394.anInt6210 > 750) {
			Static663.method9152();
			return;
		}
		Static500.method7775();
		Static19.method574();
		Static5.method130();
		for (local60 = Static131.aClass66_1.method1631(true); local60 != -1; local60 = Static131.aClass66_1.method1631(false)) {
			Static41.method1056(local60);
			Static196.anIntArray347[Static228.anInt4271++ & 0x1F] = local60;
		}
		for (@Pc(814) Class3_Sub11_Sub4 local814 = Static143.method2622(); local814 != null; local814 = Static143.method2622()) {
			local454 = local814.method2196();
			local564 = local814.method2197();
			if (local454 == 1) {
				Static449.anIntArray636[(int) local564] = local814.anInt2394;
				Static430.aBoolean489 |= Static487.aBooleanArray38[(int) local564];
				Static548.anIntArray761[Static471.anInt7772++ & 0x1F] = (int) local564;
			} else if (local454 == 2) {
				Static628.aStringArray37[(int) local564] = local814.aString21;
				Static304.anIntArray454[Static169.anInt3337++ & 0x1F] = (int) local564;
			} else {
				@Pc(860) Class260 local860;
				if (local454 == 3) {
					local860 = Static383.method5492((int) local564);
					if (!local814.aString21.equals(local860.aString74)) {
						local860.aString74 = local814.aString21;
						Static456.method8151(local860);
					}
				} else {
					@Pc(1248) int local1248;
					if (local454 == 4) {
						local860 = Static383.method5492((int) local564);
						local240 = local814.anInt2394;
						local252 = local814.anInt2400;
						local1248 = local814.anInt2401;
						if (local240 != local860.anInt6935 || local252 != local860.anInt7000 || local860.anInt6959 != local1248) {
							local860.anInt6935 = local240;
							local860.anInt6959 = local1248;
							local860.anInt7000 = local252;
							Static456.method8151(local860);
						}
					} else if (local454 == 5) {
						local860 = Static383.method5492((int) local564);
						if (local860.anInt6927 != local814.anInt2394 || local814.anInt2394 == -1) {
							local860.anInt6927 = local814.anInt2394;
							local860.anInt6954 = 0;
							local860.anInt6982 = 1;
							local860.anInt6988 = 0;
							@Pc(1317) Class372 local1317 = local860.anInt6927 == -1 ? null : Static243.aClass343_3.method8356(local860.anInt6927);
							if (local1317 != null) {
								Static639.method8891(local860.anInt6954, local1317);
							}
							Static456.method8151(local860);
						}
					} else if (local454 == 6) {
						local233 = local814.anInt2394;
						local240 = local233 >> 10 & 0x1F;
						local252 = local233 >> 5 & 0x1F;
						local1248 = local233 & 0x1F;
						@Pc(1260) int local1260 = (local240 << 19) + (local252 << 11) + (local1248 << 3);
						@Pc(1265) Class260 local1265 = Static383.method5492((int) local564);
						if (local1260 != local1265.anInt6967) {
							local1265.anInt6967 = local1260;
							Static456.method8151(local1265);
						}
					} else if (local454 == 7) {
						local860 = Static383.method5492((int) local564);
						@Pc(870) boolean local870 = local814.anInt2394 == 1;
						if (local870 != local860.aBoolean497) {
							local860.aBoolean497 = local870;
							Static456.method8151(local860);
						}
					} else if (local454 == 8) {
						local860 = Static383.method5492((int) local564);
						if (local860.anInt6974 != local814.anInt2394 || local814.anInt2400 != local860.anInt6973 || local860.anInt6989 != local814.anInt2401) {
							local860.anInt6989 = local814.anInt2401;
							local860.anInt6973 = local814.anInt2400;
							local860.anInt6974 = local814.anInt2394;
							if (local860.anInt6964 != -1) {
								if (local860.anInt6975 > 0) {
									local860.anInt6989 = local860.anInt6989 * 32 / local860.anInt6975;
								} else if (local860.anInt6931 > 0) {
									local860.anInt6989 = local860.anInt6989 * 32 / local860.anInt6931;
								}
							}
							Static456.method8151(local860);
						}
					} else if (local454 == 9) {
						local860 = Static383.method5492((int) local564);
						if (local814.anInt2394 != local860.anInt6964 || local814.anInt2400 != local860.anInt6996) {
							local860.anInt6964 = local814.anInt2394;
							local860.anInt6996 = local814.anInt2400;
							Static456.method8151(local860);
						}
					} else if (local454 == 10) {
						local860 = Static383.method5492((int) local564);
						if (local814.anInt2394 != local860.anInt7004 || local860.anInt6926 != local814.anInt2400 || local814.anInt2401 != local860.anInt6945) {
							local860.anInt6945 = local814.anInt2401;
							local860.anInt6926 = local814.anInt2400;
							local860.anInt7004 = local814.anInt2394;
							Static456.method8151(local860);
						}
					} else if (local454 == 11) {
						local860 = Static383.method5492((int) local564);
						local860.anInt6942 = local860.anInt6932 = local814.anInt2394;
						local860.aByte97 = 0;
						local860.anInt6950 = local860.anInt6991 = local814.anInt2400;
						local860.aByte96 = 0;
						Static456.method8151(local860);
					} else if (local454 == 12) {
						local860 = Static383.method5492((int) local564);
						local240 = local814.anInt2394;
						if (local860 != null && local860.anInt7003 == 0) {
							if (local860.anInt6970 - local860.anInt6971 < local240) {
								local240 = local860.anInt6970 - local860.anInt6971;
							}
							if (local240 < 0) {
								local240 = 0;
							}
							if (local240 != local860.anInt6946) {
								local860.anInt6946 = local240;
								Static456.method8151(local860);
							}
						}
					} else if (local454 == 14) {
						local860 = Static383.method5492((int) local564);
						local860.anInt6961 = local814.anInt2394;
					} else if (local454 == 15) {
						Static27.aBoolean43 = true;
						Static514.anInt8261 = local814.anInt2400;
						Static661.anInt10551 = local814.anInt2394;
					} else if (local454 == 16) {
						local860 = Static383.method5492((int) local564);
						local860.anInt6976 = local814.anInt2394;
					} else if (local454 == 17) {
						local860 = Static383.method5492((int) local564);
						local860.anInt6941 = local814.anInt2394;
					} else if (local454 == 18) {
						local860 = Static383.method5492((int) local564);
						local240 = (int) (local564 >> 32);
						local860.method6246(local240, (short) local814.anInt2400, (short) local814.anInt2394);
					} else if (local454 == 19) {
						local860 = Static383.method5492((int) local564);
						local240 = (int) (local564 >> 32);
						local860.method6259(local240, (short) local814.anInt2400, (short) local814.anInt2394);
					}
				}
			}
		}
		Static619.anInt10674++;
		if (Static240.anInt4425 != 0) {
			Static245.anInt4476 += 20;
			if (Static245.anInt4476 >= 400) {
				Static240.anInt4425 = 0;
			}
		}
		if (Static129.aClass260_8 != null) {
			Static415.anInt6639++;
			if (Static415.anInt6639 >= 15) {
				Static456.method8151(Static129.aClass260_8);
				Static129.aClass260_8 = null;
			}
		}
		Static601.aClass260_20 = null;
		Static196.aBoolean288 = false;
		Static240.aClass260_11 = null;
		Static423.aBoolean482 = false;
		Static655.method9119(-1, -1, (Class260) null);
		Static208.method3665(-1, (Class260) null, -1);
		if (!Static624.aBoolean698) {
			Static21.anInt510 = -1;
		}
		Static162.method2938();
		Static629.anInt10041++;
		if (Static158.aBoolean67) {
			@Pc(1517) Class3_Sub34 local1517 = Static172.method3123(Static163.aClass375_1, Static437.aClass218_106);
			local1517.aClass3_Sub25_Sub1_2.method8630(Static39.anInt910 << 28 | Static428.anInt6832 << 14 | Static492.anInt8114);
			Static441.method6275(local1517);
			Static158.aBoolean67 = false;
		}
		while (true) {
			@Pc(1540) Class3_Sub17 local1540;
			@Pc(1556) Class260 local1556;
			@Pc(1545) Class260 local1545;
			do {
				local1540 = (Class3_Sub17) Static65.aClass338_33.method8169();
				if (local1540 == null) {
					while (true) {
						do {
							local1540 = (Class3_Sub17) Static232.aClass338_110.method8169();
							if (local1540 == null) {
								while (true) {
									do {
										local1540 = (Class3_Sub17) Static510.aClass338_126.method8169();
										if (local1540 == null) {
											if (Static601.aClass260_20 == null) {
												Static231.anInt4294 = 0;
											}
											if (Static678.aClass260_21 != null) {
												Static42.method1060();
											}
											if (Static24.anInt545 > 0 && Static440.aClass19_1.method2352(82) && Static440.aClass19_1.method2352(81) && Static71.anInt1338 != 0) {
												local454 = Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aByte174 - Static71.anInt1338;
												if (local454 < 0) {
													local454 = 0;
												} else if (local454 > 3) {
													local454 = 3;
												}
												Static273.method4434(local454, Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anIntArray955[0] + Static72.anInt1361, Static287.anInt4910 + Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anIntArray956[0]);
											}
											Static507.method6859();
											for (local454 = 0; local454 < 5; local454++) {
												@Pc(1744) int local1744 = Static142.anIntArray232[local454]++;
											}
											if (Static430.aBoolean489 && Static123.aLong80 < Static524.method7320() - 60000L) {
												Static343.method5153();
											}
											for (@Pc(1774) Class28_Sub4_Sub1 local1774 = (Class28_Sub4_Sub1) Static225.aClass371_2.method8911(); local1774 != null; local1774 = (Class28_Sub4_Sub1) Static225.aClass371_2.method8917()) {
												if (Static524.method7320() / 1000L - 5L > (long) local1774.anInt8233) {
													if (local1774.aShort87 > 0) {
														Static450.method6577(5, "", "", local1774.aString99 + Static601.aClass346_21.method8440(Static609.anInt9834), 0, "");
													}
													if (local1774.aShort87 == 0) {
														Static450.method6577(5, "", "", local1774.aString99 + Static601.aClass346_22.method8440(Static609.anInt9834), 0, "");
													}
													local1774.method9276();
												}
											}
											Static184.anInt3728++;
											if (Static184.anInt3728 > 500) {
												Static184.anInt3728 = 0;
												local182 = (int) (Math.random() * 8.0D);
												if ((local182 & 0x1) == 1) {
													Static641.anInt10179 += Static32.anInt643;
												}
												if ((local182 & 0x4) == 4) {
													Static173.anInt3446 += Static198.anInt10717;
												}
												if ((local182 & 0x2) == 2) {
													Static168.anInt3311 += Static158.anInt928;
												}
											}
											if (Static641.anInt10179 < -50) {
												Static32.anInt643 = 2;
											}
											if (Static641.anInt10179 > 50) {
												Static32.anInt643 = -2;
											}
											if (Static168.anInt3311 < -55) {
												Static158.anInt928 = 2;
											}
											if (Static173.anInt3446 < -40) {
												Static198.anInt10717 = 1;
											}
											if (Static168.anInt3311 > 55) {
												Static158.anInt928 = -2;
											}
											Static523.anInt8396++;
											if (Static173.anInt3446 > 40) {
												Static198.anInt10717 = -1;
											}
											if (Static523.anInt8396 > 500) {
												Static523.anInt8396 = 0;
												local182 = (int) (Math.random() * 8.0D);
												if ((local182 & 0x2) == 2) {
													Static663.anInt10571 += Static419.anInt1525;
												}
												if ((local182 & 0x1) == 1) {
													Static490.anInt8101 += Static239.anInt4419;
												}
											}
											if (Static490.anInt8101 < -60) {
												Static239.anInt4419 = 2;
											}
											if (Static490.anInt8101 > 60) {
												Static239.anInt4419 = -2;
											}
											if (Static663.anInt10571 < -20) {
												Static419.anInt1525 = 1;
											}
											Static213.anInt4078++;
											if (Static663.anInt10571 > 10) {
												Static419.anInt1525 = -1;
											}
											if (Static213.anInt4078 > 50) {
												@Pc(2012) Class3_Sub34 local2012 = Static172.method3123(Static163.aClass375_1, Static199.aClass218_53);
												Static441.method6275(local2012);
											}
											if (Static12.aBoolean12) {
												Static448.method6559();
												Static12.aBoolean12 = false;
											}
											try {
												Static93.method9381();
												return;
											} catch (@Pc(2025) IOException local2025) {
												Static663.method9152();
												return;
											}
										}
										local1545 = local1540.aClass260_6;
										if (local1545.anInt6985 < 0) {
											break;
										}
										local1556 = Static383.method5492(local1545.anInt6993);
									} while (local1556 == null || local1556.aClass260Array2 == null || local1545.anInt6985 >= local1556.aClass260Array2.length || local1556.aClass260Array2[local1545.anInt6985] != local1545);
									Static565.method8015(local1540);
								}
							}
							local1545 = local1540.aClass260_6;
							if (local1545.anInt6985 < 0) {
								break;
							}
							local1556 = Static383.method5492(local1545.anInt6993);
						} while (local1556 == null || local1556.aClass260Array2 == null || local1545.anInt6985 >= local1556.aClass260Array2.length || local1545 != local1556.aClass260Array2[local1545.anInt6985]);
						Static565.method8015(local1540);
					}
				}
				local1545 = local1540.aClass260_6;
				if (local1545.anInt6985 < 0) {
					break;
				}
				local1556 = Static383.method5492(local1545.anInt6993);
			} while (local1556 == null || local1556.aClass260Array2 == null || local1545.anInt6985 >= local1556.aClass260Array2.length || local1556.aClass260Array2[local1545.anInt6985] != local1545);
			Static565.method8015(local1540);
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IB)I")
	public static int method8288(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method8289(@OriginalArg(0) String arg0) {
		for (@Pc(14) int local14 = 0; local14 < Static672.aStringArray42.length; local14++) {
			if (Static672.aStringArray42[local14].equalsIgnoreCase(arg0)) {
				return local14;
			}
		}
		return -1;
	}
}
