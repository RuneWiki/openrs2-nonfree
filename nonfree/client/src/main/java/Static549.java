import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static549 {

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(FIIIIIII[FFI)V")
	public static void method7572(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float[] arg7, @OriginalArg(9) float arg8, @OriginalArg(10) int arg9) {
		@Pc(9) int local9 = arg1 - arg4;
		@Pc(13) int local13 = arg6 - arg3;
		@Pc(17) int local17 = arg5 - arg2;
		@Pc(38) float local38 = arg7[1] * (float) local13 + (float) local9 * arg7[0] + arg7[2] * (float) local17;
		@Pc(59) float local59 = arg7[5] * (float) local17 + arg7[4] * (float) local13 + (float) local9 * arg7[3];
		@Pc(84) float local84 = arg7[8] * (float) local17 + arg7[6] * (float) local9 + arg7[7] * (float) local13;
		@Pc(95) float local95 = (float) Math.atan2((double) local38, (double) local84) / 6.2831855F + 0.5F;
		if (arg0 != 1.0F) {
			local95 *= arg0;
		}
		@Pc(109) float local109 = local59 + arg8 + 0.5F;
		@Pc(116) float local116;
		if (arg9 == 1) {
			local116 = local95;
			local95 = -local109;
			local109 = local116;
		} else if (arg9 == 2) {
			local95 = -local95;
			local109 = -local109;
		} else if (arg9 == 3) {
			local116 = local95;
			local95 = local109;
			local109 = -local116;
		}
		Static353.aFloat139 = local109;
		Static108.aFloat19 = local95;
	}

	@OriginalMember(owner = "client!vr", name = "d", descriptor = "(I)V")
	public static void method7573() {
		if (Static105.anInt1967 > 1) {
			Static555.anInt8692 = Static48.anInt821;
			Static105.anInt1967--;
		}
		if (Static156.aBoolean183) {
			Static156.aBoolean183 = false;
			Static253.method3573();
			return;
		}
		if (!Static330.aBoolean415) {
			Static560.method6157();
		}
		for (@Pc(29) int local29 = 0; local29 < 100 && Static300.method4189(); local29++) {
		}
		if (Static146.anInt2581 != 10) {
			return;
		}
		Static95.method1488(Static315.aClass160_72.method3424(), Static218.aClass6_Sub14_Sub2_1);
		if (Static154.aClass6_Sub15_2 == null) {
			if (Static404.aLong185 <= Static137.method2058()) {
				Static154.aClass6_Sub15_2 = Static295.aClass317_1.method7316(Static271.aClass147_2.aString55);
			}
		} else if (Static154.aClass6_Sub15_2.anInt1528 != -1) {
			Static136.method2051(Static9.aClass160_9);
			Static218.aClass6_Sub14_Sub2_1.method5999(Static154.aClass6_Sub15_2.anInt1528);
			Static154.aClass6_Sub15_2 = null;
			Static404.aLong185 = Static137.method2058() + 30000L;
		}
		@Pc(98) Class6_Sub8 local98 = (Class6_Sub8) Static274.aClass275_64.method6366();
		@Pc(133) int local133;
		@Pc(152) int local152;
		@Pc(196) int local196;
		@Pc(203) int local203;
		@Pc(216) int local216;
		if (local98 != null || Static217.aLong105 < Static137.method2058() - 2000L) {
			@Pc(109) boolean local109 = false;
			@Pc(112) int local112 = Static218.aClass6_Sub14_Sub2_1.anInt7244;
			for (@Pc(117) Class6_Sub8 local117 = (Class6_Sub8) Static537.aClass275_189.method6366(); local117 != null && Static218.aClass6_Sub14_Sub2_1.anInt7244 - local112 < 240; local117 = (Class6_Sub8) Static537.aClass275_189.method6364()) {
				local117.method7849();
				local133 = local117.method7643();
				if (local133 < -1) {
					local133 = -1;
				} else if (local133 > 65534) {
					local133 = 65534;
				}
				local152 = local117.method7645();
				if (local152 < -1) {
					local152 = -1;
				} else if (local152 > 65534) {
					local152 = 65534;
				}
				if (local152 != Static46.anInt806 || local133 != Static43.anInt708) {
					if (!local109) {
						Static136.method2051(Static340.aClass160_78);
						Static218.aClass6_Sub14_Sub2_1.method6035(0);
						local112 = Static218.aClass6_Sub14_Sub2_1.anInt7244;
						local109 = true;
					}
					local196 = local152 - Static46.anInt806;
					Static46.anInt806 = local152;
					local203 = local133 - Static43.anInt708;
					Static43.anInt708 = local133;
					local216 = (int) ((local117.method7644() - Static217.aLong105) / 20L);
					if (local216 < 8 && local196 >= -32 && local196 <= 31 && local203 >= -32 && local203 <= 31) {
						local203 += 32;
						local196 += 32;
						Static218.aClass6_Sub14_Sub2_1.method5999(local203 + (local196 << 6) + (local216 << 12));
					} else if (local216 < 32 && local196 >= -128 && local196 <= 127 && local203 >= -128 && local203 <= 127) {
						local196 += 128;
						local203 += 128;
						Static218.aClass6_Sub14_Sub2_1.method6035(local216 + 128);
						Static218.aClass6_Sub14_Sub2_1.method5999(local203 + (local196 << 8));
					} else if (local216 < 32) {
						Static218.aClass6_Sub14_Sub2_1.method6035(local216 + 192);
						if (local152 == 1 || local133 == -1) {
							Static218.aClass6_Sub14_Sub2_1.method5990(Integer.MIN_VALUE);
						} else {
							Static218.aClass6_Sub14_Sub2_1.method5990(local152 | local133 << 16);
						}
					} else {
						Static218.aClass6_Sub14_Sub2_1.method5999(local216 + 57344);
						if (local152 == 1 || local133 == -1) {
							Static218.aClass6_Sub14_Sub2_1.method5990(Integer.MIN_VALUE);
						} else {
							Static218.aClass6_Sub14_Sub2_1.method5990(local133 << 16 | local152);
						}
					}
					Static217.aLong105 = local117.method7644();
				}
			}
			if (local109) {
				Static218.aClass6_Sub14_Sub2_1.method5985(Static218.aClass6_Sub14_Sub2_1.anInt7244 - local112);
			}
		}
		@Pc(403) int local403;
		if (local98 != null) {
			@Pc(387) long local387 = (local98.method7644() - Static71.aLong41) / 50L;
			if (local387 > 32767L) {
				local387 = 32767L;
			}
			Static71.aLong41 = local98.method7644();
			local403 = local98.method7643();
			if (local403 < 0) {
				local403 = 0;
			} else if (local403 > 65535) {
				local403 = 65535;
			}
			local133 = local98.method7645();
			if (local133 < 0) {
				local133 = 0;
			} else if (local133 > 65535) {
				local133 = 65535;
			}
			@Pc(435) byte local435 = 0;
			if (local98.method7651() == 2) {
				local435 = 1;
			}
			local196 = (int) local387;
			Static136.method2051(Static125.aClass160_35);
			Static218.aClass6_Sub14_Sub2_1.method5980(local196 | local435 << 15);
			Static218.aClass6_Sub14_Sub2_1.method6001(local403 << 16 | local133);
		}
		@Pc(485) int local485;
		if (Static39.anInt679 > 0) {
			Static136.method2051(Static178.aClass160_95);
			Static218.aClass6_Sub14_Sub2_1.method6035(Static39.anInt679 * 3);
			for (local485 = 0; local485 < Static39.anInt679; local485++) {
				@Pc(491) Interface16 local491 = Static339.anInterface16Array2[local485];
				@Pc(499) long local499 = (local491.method943() - Static56.aLong33) / 50L;
				Static56.aLong33 = local491.method943();
				if (local499 > 65535L) {
					local499 = 65535L;
				}
				Static218.aClass6_Sub14_Sub2_1.method6035(local491.method944());
				Static218.aClass6_Sub14_Sub2_1.method5999((int) local499);
			}
		}
		if (Static544.anInt9202 > 0) {
			Static544.anInt9202--;
		}
		if (Static244.aBoolean263 && Static544.anInt9202 <= 0) {
			Static244.aBoolean263 = false;
			Static544.anInt9202 = 20;
			Static136.method2051(Static373.aClass160_90);
			Static218.aClass6_Sub14_Sub2_1.method5999((int) Static475.aFloat174 >> 3);
			Static218.aClass6_Sub14_Sub2_1.method6011((int) Static399.aFloat167 >> 3);
		}
		if (Static241.aBoolean259 && !Static359.aBoolean432) {
			Static359.aBoolean432 = true;
			Static136.method2051(Static544.aClass160_120);
			Static218.aClass6_Sub14_Sub2_1.method6035(1);
		}
		if (!Static241.aBoolean259 && Static359.aBoolean432) {
			Static359.aBoolean432 = false;
			Static136.method2051(Static544.aClass160_120);
			Static218.aClass6_Sub14_Sub2_1.method6035(0);
		}
		if (!Static474.aBoolean543) {
			Static136.method2051(Static232.aClass160_50);
			Static218.aClass6_Sub14_Sub2_1.method6035(0);
			local485 = Static218.aClass6_Sub14_Sub2_1.anInt7244;
			@Pc(633) Class6_Sub14 local633 = new Class6_Sub14(Static186.method2766());
			Static480.aClass6_Sub37_Sub1_1.method5146(local633);
			Static218.aClass6_Sub14_Sub2_1.method6039(local633.anInt7244, local633.aByteArray88);
			Static218.aClass6_Sub14_Sub2_1.method5985(Static218.aClass6_Sub14_Sub2_1.anInt7244 - local485);
			Static474.aBoolean543 = true;
		}
		if (Static208.aClass9ArrayArrayArray3 != null) {
			if (Static354.anInt6233 == 2) {
				Static410.method5971();
			} else if (Static354.anInt6233 == 3) {
				Static251.method4150();
			}
		}
		if (Static457.aBoolean261) {
			Static457.aBoolean261 = false;
		} else {
			Static212.aFloat48 /= 2.0F;
		}
		if (Static355.aBoolean428) {
			Static355.aBoolean428 = false;
		} else {
			Static274.aFloat47 /= 2.0F;
		}
		Static356.method5301();
		if (Static146.anInt2581 != 10) {
			return;
		}
		Static38.method533();
		Static200.method3796();
		Static37.method527();
		Static62.method799();
		Static418.anInt7398++;
		if (Static418.anInt7398 > 750) {
			Static253.method3573();
			return;
		}
		Static311.method4824();
		Static154.method2272();
		Static490.method6770();
		for (local485 = Static505.aClass30_1.method502(true); local485 != -1; local485 = Static505.aClass30_1.method502(false)) {
			Static325.method5028(local485);
			Static339.anIntArray527[Static20.anInt365++ & 0x1F] = local485;
		}
		@Pc(806) Class97 local806;
		for (@Pc(758) Class6_Sub1_Sub5 local758 = Static14.method220(); local758 != null; local758 = Static14.method220()) {
			local403 = local758.method773();
			local133 = local758.method774();
			if (local403 == 1) {
				Static402.anIntArray568[local133] = local758.anInt972;
				Static362.aBoolean433 |= Static248.aBooleanArray25[local133];
				Static31.anIntArray42[Static422.anInt7469++ & 0x1F] = local133;
			} else if (local403 == 2) {
				Static579.aStringArray38[local133] = local758.aString10;
				Static82.anIntArray173[Static430.anInt5649++ & 0x1F] = local133;
			} else if (local403 == 3) {
				local806 = Static133.method4068(local133);
				if (!local758.aString10.equals(local806.aString38)) {
					local806.aString38 = local758.aString10;
					Static390.method5794(local806);
				}
			} else if (local403 == 4) {
				local806 = Static133.method4068(local133);
				local196 = local758.anInt972;
				local203 = local758.anInt974;
				local216 = local758.anInt979;
				if (local806.anInt2262 != local196 || local203 != local806.anInt2263 || local216 != local806.anInt2273) {
					local806.anInt2263 = local203;
					local806.anInt2273 = local216;
					local806.anInt2262 = local196;
					Static390.method5794(local806);
				}
			} else if (local403 == 5) {
				local806 = Static133.method4068(local133);
				if (local806.anInt2310 != local758.anInt972 || local758.anInt972 == -1) {
					local806.anInt2304 = 0;
					local806.anInt2287 = 1;
					local806.anInt2310 = local758.anInt972;
					local806.anInt2272 = 0;
					Static390.method5794(local806);
				}
			} else if (local403 == 6) {
				local152 = local758.anInt972;
				local196 = local152 >> 10 & 0x1F;
				local203 = local152 >> 5 & 0x1F;
				local216 = local152 & 0x1F;
				@Pc(906) int local906 = (local216 << 3) + (local196 << 19) + (local203 << 11);
				@Pc(910) Class97 local910 = Static133.method4068(local133);
				if (local910.anInt2352 != local906) {
					local910.anInt2352 = local906;
					Static390.method5794(local910);
				}
			} else if (local403 == 7) {
				local806 = Static133.method4068(local133);
				@Pc(937) boolean local937 = local758.anInt972 == 1;
				if (local806.aBoolean150 != local937) {
					local806.aBoolean150 = local937;
					Static390.method5794(local806);
				}
			} else if (local403 == 8) {
				local806 = Static133.method4068(local133);
				if (local758.anInt972 != local806.anInt2322 || local758.anInt974 != local806.anInt2279 || local806.anInt2312 != local758.anInt979) {
					local806.anInt2312 = local758.anInt979;
					local806.anInt2322 = local758.anInt972;
					local806.anInt2279 = local758.anInt974;
					if (local806.anInt2277 != -1) {
						if (local806.anInt2318 > 0) {
							local806.anInt2312 = local806.anInt2312 * 32 / local806.anInt2318;
						} else if (local806.anInt2276 > 0) {
							local806.anInt2312 = local806.anInt2312 * 32 / local806.anInt2276;
						}
					}
					Static390.method5794(local806);
				}
			} else if (local403 == 9) {
				local806 = Static133.method4068(local133);
				if (local806.anInt2277 != local758.anInt972 || local758.anInt974 != local806.anInt2329) {
					local806.anInt2277 = local758.anInt972;
					local806.anInt2329 = local758.anInt974;
					Static390.method5794(local806);
				}
			} else if (local403 == 10) {
				local806 = Static133.method4068(local133);
				if (local806.anInt2266 != local758.anInt972 || local806.anInt2332 != local758.anInt974 || local758.anInt979 != local806.anInt2351) {
					local806.anInt2332 = local758.anInt974;
					local806.anInt2351 = local758.anInt979;
					local806.anInt2266 = local758.anInt972;
					Static390.method5794(local806);
				}
			} else if (local403 == 11) {
				local806 = Static133.method4068(local133);
				local806.anInt2265 = local806.anInt2320 = local758.anInt972;
				local806.aByte44 = 0;
				local806.anInt2331 = local806.anInt2260 = local758.anInt974;
				local806.aByte41 = 0;
				Static390.method5794(local806);
			} else if (local403 == 12) {
				local806 = Static133.method4068(local133);
				local196 = local758.anInt972;
				if (local806 != null && local806.anInt2264 == 0) {
					if (local806.anInt2321 - local806.anInt2305 < local196) {
						local196 = local806.anInt2321 - local806.anInt2305;
					}
					if (local196 < 0) {
						local196 = 0;
					}
					if (local806.anInt2334 != local196) {
						local806.anInt2334 = local196;
						Static390.method5794(local806);
					}
				}
			} else if (local403 == 14) {
				local806 = Static133.method4068(local133);
				local806.anInt2344 = local758.anInt972;
			} else if (local403 == 15) {
				Static334.anInt5975 = local758.anInt972;
				Static16.anInt311 = local758.anInt974;
				Static190.aBoolean258 = true;
			} else if (local403 == 16) {
				local806 = Static133.method4068(local133);
				local806.anInt2346 = local758.anInt972;
			}
		}
		if (Static452.anInt7777 != 0) {
			Static137.anInt2438 += 20;
			if (Static137.anInt2438 >= 400) {
				Static452.anInt7777 = 0;
			}
		}
		Static267.anInt4424++;
		if (Static226.aClass97_6 != null) {
			Static546.anInt9213++;
			if (Static546.anInt9213 >= 15) {
				Static390.method5794(Static226.aClass97_6);
				Static226.aClass97_6 = null;
			}
		}
		Static157.aClass97_5 = null;
		Static551.aClass97_14 = null;
		Static143.aBoolean537 = false;
		Static332.aBoolean393 = false;
		Static508.method7012(null, -1, -1);
		Static465.method6523(-1, null, -1);
		if (!Static492.aBoolean560) {
			Static278.anInt6564 = -1;
		}
		Static137.method2059();
		Static48.anInt821++;
		if (Static258.aBoolean269) {
			Static136.method2051(Static317.aClass160_73);
			Static218.aClass6_Sub14_Sub2_1.method6001(Static24.anInt5487 | Static61.anInt981 << 14 | Static566.anInt9474 << 28);
			Static258.aBoolean269 = false;
		}
		while (true) {
			@Pc(1391) Class6_Sub36 local1391;
			@Pc(1396) Class97 local1396;
			do {
				local1391 = (Class6_Sub36) Static80.aClass275_33.method6360();
				if (local1391 == null) {
					while (true) {
						do {
							local1391 = (Class6_Sub36) Static543.aClass275_192.method6360();
							if (local1391 == null) {
								while (true) {
									do {
										local1391 = (Class6_Sub36) Static446.aClass275_163.method6360();
										if (local1391 == null) {
											if (Static157.aClass97_5 == null) {
												Static540.anInt9139 = 0;
											}
											if (Static382.aClass97_10 != null) {
												Static484.method6710();
											}
											if (Static231.anInt3930 > 0 && Static539.aClass88_1.method6348(82) && Static539.aClass88_1.method6348(81) && Static563.anInt9404 != 0) {
												local403 = Static426.aClass29_Sub2_Sub1_Sub2_2.aByte103 - Static563.anInt9404;
												if (local403 < 0) {
													local403 = 0;
												} else if (local403 > 3) {
													local403 = 3;
												}
												Static169.method2642(local403, Static167.anInt3048 + Static426.aClass29_Sub2_Sub1_Sub2_2.anIntArray660[0], Static218.anInt3718 + Static426.aClass29_Sub2_Sub1_Sub2_2.anIntArray661[0]);
											}
											Static361.method5345();
											for (local403 = 0; local403 < 5; local403++) {
												@Pc(1604) int local1604 = Static5.anIntArray10[local403]++;
											}
											if (Static362.aBoolean433 && Static137.method2058() - 60000L > Static97.aLong54) {
												Static480.method6664();
											}
											for (@Pc(1631) Class102_Sub1_Sub2 local1631 = (Class102_Sub1_Sub2) Static468.aClass249_6.method5817(); local1631 != null; local1631 = (Class102_Sub1_Sub2) Static468.aClass249_6.method5815()) {
												if (Static137.method2058() / 1000L - 5L > (long) local1631.anInt8196) {
													if (local1631.aShort111 > 0) {
														Static164.method2396("", 5, "", local1631.aString101 + Static141.aClass104_64.method2145(Static470.anInt7957), 0, "");
													}
													if (local1631.aShort111 == 0) {
														Static164.method2396("", 5, "", local1631.aString101 + Static141.aClass104_65.method2145(Static470.anInt7957), 0, "");
													}
													local1631.method7587();
												}
											}
											Static58.anInt955++;
											if (Static58.anInt955 > 500) {
												Static58.anInt955 = 0;
												local152 = (int) (Math.random() * 8.0D);
												if ((local152 & 0x1) == 1) {
													Static343.anInt6094 += Static148.anInt2605;
												}
												if ((local152 & 0x2) == 2) {
													Static316.anInt5715 += Static354.anInt6235;
												}
												if ((local152 & 0x4) == 4) {
													Static74.anInt1216 += Static339.anInt6004;
												}
											}
											if (Static343.anInt6094 < -50) {
												Static148.anInt2605 = 2;
											}
											if (Static316.anInt5715 < -55) {
												Static354.anInt6235 = 2;
											}
											if (Static343.anInt6094 > 50) {
												Static148.anInt2605 = -2;
											}
											if (Static316.anInt5715 > 55) {
												Static354.anInt6235 = -2;
											}
											if (Static74.anInt1216 < -40) {
												Static339.anInt6004 = 1;
											}
											if (Static74.anInt1216 > 40) {
												Static339.anInt6004 = -1;
											}
											Static156.anInt2754++;
											if (Static156.anInt2754 > 500) {
												Static156.anInt2754 = 0;
												local152 = (int) (Math.random() * 8.0D);
												if ((local152 & 0x2) == 2) {
													Static291.anInt4749 += Static197.anInt3441;
												}
												if ((local152 & 0x1) == 1) {
													Static574.anInt6272 += Static73.anInt1200;
												}
											}
											if (Static574.anInt6272 < -60) {
												Static73.anInt1200 = 2;
											}
											if (Static574.anInt6272 > 60) {
												Static73.anInt1200 = -2;
											}
											if (Static291.anInt4749 < -20) {
												Static197.anInt3441 = 1;
											}
											if (Static291.anInt4749 > 10) {
												Static197.anInt3441 = -1;
											}
											Static126.anInt2191++;
											if (Static126.anInt2191 > 50) {
												Static136.method2051(Static293.aClass160_65);
											}
											if (Static136.aBoolean168) {
												Static247.method3536();
												Static136.aBoolean168 = false;
											}
											try {
												if (Static225.aClass71_1 != null && Static218.aClass6_Sub14_Sub2_1.anInt7244 > 0) {
													Static161.anInt2830 += Static218.aClass6_Sub14_Sub2_1.anInt7244;
													Static225.aClass71_1.method5968(Static218.aClass6_Sub14_Sub2_1.aByteArray88, Static218.aClass6_Sub14_Sub2_1.anInt7244);
													Static218.aClass6_Sub14_Sub2_1.anInt7244 = 0;
													Static126.anInt2191 = 0;
													return;
												}
												return;
											} catch (@Pc(1898) IOException local1898) {
												Static253.method3573();
												return;
											}
										}
										local1396 = local1391.aClass97_7;
										if (local1396.lb < 0) {
											break;
										}
										local806 = Static133.method4068(local1396.anInt2325);
									} while (local806 == null || local806.aClass97Array1 == null || local806.aClass97Array1.length <= local1396.lb || local1396 != local806.aClass97Array1[local1396.lb]);
									Static100.method1639(local1391);
								}
							}
							local1396 = local1391.aClass97_7;
							if (local1396.lb < 0) {
								break;
							}
							local806 = Static133.method4068(local1396.anInt2325);
						} while (local806 == null || local806.aClass97Array1 == null || local1396.lb >= local806.aClass97Array1.length || local1396 != local806.aClass97Array1[local1396.lb]);
						Static100.method1639(local1391);
					}
				}
				local1396 = local1391.aClass97_7;
				if (local1396.lb < 0) {
					break;
				}
				local806 = Static133.method4068(local1396.anInt2325);
			} while (local806 == null || local806.aClass97Array1 == null || local806.aClass97Array1.length <= local1396.lb || local806.aClass97Array1[local1396.lb] != local1396);
			Static100.method1639(local1391);
		}
	}

	@OriginalMember(owner = "client!vr", name = "e", descriptor = "(I)V")
	public static void method7574() {
		if (!Static435.aBoolean524) {
			return;
		}
		while (true) {
			while (Static376.aClass8_Sub1Array2.length > Static432.anInt7942) {
				@Pc(25) Class8_Sub1 local25 = Static376.aClass8_Sub1Array2[Static432.anInt7942];
				if (local25 != null && local25.anInt2022 == -1) {
					if (Static49.aClass6_Sub15_1 == null) {
						Static49.aClass6_Sub15_1 = Static295.aClass317_1.method7316(local25.aString33);
					}
					@Pc(48) int local48 = Static49.aClass6_Sub15_1.anInt1528;
					if (local48 == -1) {
						return;
					}
					local25.anInt2022 = local48;
					Static49.aClass6_Sub15_1 = null;
					Static432.anInt7942++;
				} else {
					Static432.anInt7942++;
				}
			}
			return;
		}
	}
}
