import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "Lclient!dh;")
	public static Class33 aClass33_4 = new Class33(64);

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
	public static int anInt715 = 0;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(BZ[Lclient!hm;[[[I)V")
	public static void method517(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class63[] arg1, @OriginalArg(3) int[][][] arg2) {
		@Pc(10) int local10;
		@Pc(15) int local15;
		if (!arg0) {
			for (local10 = 0; local10 < 4; local10++) {
				for (local15 = 0; local15 < 104; local15++) {
					for (@Pc(22) int local22 = 0; local22 < 104; local22++) {
						if ((Static46.aByteArrayArrayArray2[local10][local15][local22] & 0x1) == 1) {
							@Pc(41) int local41 = local10;
							if ((Static46.aByteArrayArrayArray2[1][local15][local22] & 0x2) == 2) {
								local41 = local10 - 1;
							}
							if (local41 >= 0) {
								arg1[local41].method1669(local22, local15);
							}
						}
					}
				}
			}
			Static24.anInt441 += (int) (Math.random() * 5.0D) - 2;
			Static34.anInt680 += (int) (Math.random() * 5.0D) - 2;
			if (Static24.anInt441 < -16) {
				Static24.anInt441 = -16;
			}
			if (Static34.anInt680 < -8) {
				Static34.anInt680 = -8;
			}
			if (Static34.anInt680 > 8) {
				Static34.anInt680 = 8;
			}
			if (Static24.anInt441 > 16) {
				Static24.anInt441 = 16;
			}
		}
		@Pc(121) byte local121;
		if (arg0) {
			local121 = 1;
		} else {
			local121 = 4;
		}
		local10 = Static34.anInt680 >> 2 << 10;
		local15 = Static24.anInt441 >> 1;
		@Pc(147) int[][] local147 = new int[104][104];
		@Pc(151) int[][] local151 = new int[104][104];
		@Pc(153) int local153;
		@Pc(170) int local170;
		@Pc(175) int local175;
		@Pc(262) int local262;
		@Pc(230) int local230;
		@Pc(283) int local283;
		@Pc(285) int local285;
		@Pc(292) int local292;
		@Pc(434) int local434;
		@Pc(316) int local316;
		@Pc(339) int local339;
		@Pc(352) int local352;
		for (local153 = 0; local153 < local121; local153++) {
			@Pc(164) byte[][] local164 = Static227.aByteArrayArrayArray14[local153];
			@Pc(358) int local358;
			@Pc(362) int local362;
			@Pc(418) int local418;
			@Pc(412) int local412;
			if (!Static178.aBoolean216) {
				local170 = (int) Math.sqrt(5100.0D);
				local175 = local170 * 768 >> 8;
				for (local262 = 1; local262 < 103; local262++) {
					for (local230 = 1; local230 < 103; local230++) {
						local285 = Static250.anIntArrayArrayArray13[local153][local230 + 1][local262] - Static250.anIntArrayArrayArray13[local153][local230 - 1][local262];
						local292 = Static250.anIntArrayArrayArray13[local153][local230][local262 + 1] - Static250.anIntArrayArrayArray13[local153][local230][local262 - 1];
						local434 = (int) Math.sqrt((double) (local285 * local285 + local292 * local292 + 65536));
						local352 = (local292 << 8) / local434;
						local339 = -65536 / local434;
						local316 = (local285 << 8) / local434;
						local283 = (local352 * -50 + local316 * -50 + local339 * -10) / local175 + 74;
						local358 = (local164[local230][local262] >> 1) + ((local164[local230 - 1][local262] >> 2) + (local164[local230 + 1][local262] >> 3)) + (local164[local230][local262 + -1] >> 2) + (local164[local230][local262 + 1] >> 3);
						local147[local230][local262] = local283 - local358;
					}
				}
			} else if (Static298.aBoolean357) {
				for (local170 = 1; local170 < 103; local170++) {
					for (local175 = 1; local175 < 103; local175++) {
						local230 = (local164[local175][local170] >> 1) + (local164[local175 + 1][local170] >> 3) + (local164[local175 + -1][local170] >> 2) + (local164[local175][local170 + -1] >> 2) + (local164[local175][local170 + 1] >> 3);
						local147[local175][local170] = 74 - local230;
					}
				}
			} else {
				local170 = (int) Static291.aFloatArray31[0];
				local175 = (int) Static291.aFloatArray31[1];
				local262 = (int) Static291.aFloatArray31[2];
				local230 = (int) Math.sqrt((double) (local175 * local175 + local170 * local170 + local262 * local262));
				local283 = local230 * 1024 >> 8;
				for (local285 = 1; local285 < 103; local285++) {
					for (local292 = 1; local292 < 103; local292++) {
						local316 = Static250.anIntArrayArrayArray13[local153][local292 + 1][local285] - Static250.anIntArrayArrayArray13[local153][local292 - 1][local285];
						local339 = Static250.anIntArrayArrayArray13[local153][local292][local285 + 1] - Static250.anIntArrayArrayArray13[local153][local292][local285 - 1];
						local352 = (int) Math.sqrt((double) (local316 * local316 + local339 * local339 + 65536));
						local358 = (local316 << 8) / local352;
						local362 = -65536 / local352;
						local412 = (local164[local292][local285] >> 1) + ((local164[local292][local285 - 1] >> 2) + (local164[local292 - 1][local285] >> 2) - (-(local164[local292 + 1][local285] >> 3) + -(local164[local292][local285 - -1] >> 3)));
						local418 = (local339 << 8) / local352;
						local434 = (local262 * local418 + local170 * local358 + local175 * local362) / local283 + 96;
						local147[local292][local285] = local434 - (int) ((float) local412 * 1.7F);
					}
				}
			}
			for (local170 = 0; local170 < 104; local170++) {
				Static121.anIntArray239[local170] = 0;
				Static210.anIntArray373[local170] = 0;
				Static125.anIntArray242[local170] = 0;
				Static126.anIntArray243[local170] = 0;
				Static280.anIntArray472[local170] = 0;
			}
			for (local170 = -5; local170 < 104; local170++) {
				for (local175 = 0; local175 < 104; local175++) {
					local262 = local170 + 5;
					@Pc(744) int local744;
					if (local262 < 104) {
						local230 = Static218.aByteArrayArrayArray21[local153][local262][local175] & 0xFF;
						if (local230 > 0) {
							@Pc(708) Class142 local708 = Static263.method722(local230 - 1);
							Static121.anIntArray239[local175] += local708.anInt4375;
							Static210.anIntArray373[local175] += local708.anInt4372;
							Static125.anIntArray242[local175] += local708.anInt4368;
							Static126.anIntArray243[local175] += local708.anInt4377;
							local744 = Static280.anIntArray472[local175]++;
						}
					}
					local230 = local170 - 5;
					if (local230 >= 0) {
						local283 = Static218.aByteArrayArrayArray21[local153][local230][local175] & 0xFF;
						if (local283 > 0) {
							@Pc(777) Class142 local777 = Static263.method722(local283 - 1);
							Static121.anIntArray239[local175] -= local777.anInt4375;
							Static210.anIntArray373[local175] -= local777.anInt4372;
							Static125.anIntArray242[local175] -= local777.anInt4368;
							Static126.anIntArray243[local175] -= local777.anInt4377;
							local744 = Static280.anIntArray472[local175]--;
						}
					}
				}
				if (local170 >= 0) {
					local175 = 0;
					local230 = 0;
					local283 = 0;
					local285 = 0;
					local262 = 0;
					for (local292 = -5; local292 < 104; local292++) {
						local316 = local292 - 5;
						local434 = local292 + 5;
						if (local434 < 104) {
							local262 += Static210.anIntArray373[local434];
							local230 += Static125.anIntArray242[local434];
							local283 += Static126.anIntArray243[local434];
							local175 += Static121.anIntArray239[local434];
							local285 += Static280.anIntArray472[local434];
						}
						if (local316 >= 0) {
							local262 -= Static210.anIntArray373[local316];
							local283 -= Static126.anIntArray243[local316];
							local285 -= Static280.anIntArray472[local316];
							local175 -= Static121.anIntArray239[local316];
							local230 -= Static125.anIntArray242[local316];
						}
						if (local292 >= 0 && local285 > 0) {
							local151[local170][local292] = Static98.method1593(local262 / local285, local175 * 256 / local283, local230 / local285);
						}
					}
				}
			}
			for (local170 = 1; local170 < 103; local170++) {
				label764: for (local175 = 1; local175 < 103; local175++) {
					if (arg0 || Static62.method957() || (Static46.aByteArrayArrayArray2[0][local170][local175] & 0x2) != 0 || (Static46.aByteArrayArrayArray2[local153][local170][local175] & 0x10) == 0 && Static99.method1612(local170, local153, local175) == Static168.anInt3342) {
						if (local153 < Static145.anInt2969) {
							Static145.anInt2969 = local153;
						}
						local262 = Static218.aByteArrayArrayArray21[local153][local170][local175] & 0xFF;
						local230 = Static81.aByteArrayArrayArray15[local153][local170][local175] & 0xFF;
						if (local262 > 0 || local230 > 0) {
							local285 = Static250.anIntArrayArrayArray13[local153][local170 + 1][local175];
							local283 = Static250.anIntArrayArrayArray13[local153][local170][local175];
							local292 = Static250.anIntArrayArrayArray13[local153][local170 + 1][local175 + 1];
							local434 = Static250.anIntArrayArrayArray13[local153][local170][local175 + 1];
							if (local153 > 0) {
								@Pc(1078) boolean local1078 = true;
								if (local262 == 0 && Static200.aByteArrayArrayArray12[local153][local170][local175] != 0) {
									local1078 = false;
								}
								if (local230 > 0 && !Static171.method2693(local230 - 1).aBoolean79) {
									local1078 = false;
								}
								if (local1078 && local283 == local285 && local283 == local292 && local434 == local283) {
									Static84.anIntArrayArrayArray6[local153][local170][local175] |= 0x4;
								}
							}
							if (local262 > 0) {
								local316 = local151[local170][local175];
								local352 = local15 + (local316 & 0x7F);
								if (local352 < 0) {
									local352 = 0;
								} else if (local352 > 127) {
									local352 = 127;
								}
								local358 = (local316 + local10 & 0xFC00) + (local316 & 0x380) + local352;
								local339 = Static204.anIntArray354[Static2.method17(96, local358)];
							} else {
								local339 = 0;
								local316 = -1;
							}
							local352 = local147[local170][local175];
							local358 = local147[local170 + 1][local175];
							local362 = local147[local170 + 1][local175 + 1];
							local418 = local147[local170][local175 + 1];
							if (local230 == 0) {
								Static271.method4058(local153, local170, local175, 0, 0, -1, local283, local285, local292, local434, Static2.method17(local352, local316), Static2.method17(local358, local316), Static2.method17(local362, local316), Static2.method17(local418, local316), 0, 0, 0, 0, local339, 0);
								if (Static178.aBoolean216 && local153 > 0 && local316 != -1 && Static263.method722(local262 - 1).aBoolean293) {
									Static64.method987(0, 0, true, false, local170, local175, local283 - Static250.anIntArrayArrayArray13[0][local170][local175], -Static250.anIntArrayArrayArray13[0][local170 + 1][local175] + local285, local292 - Static250.anIntArrayArrayArray13[0][local170 + 1][local175 + 1], -Static250.anIntArrayArrayArray13[0][local170][local175 - -1] + local434);
								}
								if (Static178.aBoolean216 && !arg0 && Static120.anIntArrayArray23 != null && local153 == 0) {
									for (local412 = local170 - 1; local412 <= local170 + 1; local412++) {
										for (@Pc(1368) int local1368 = local175 - 1; local1368 <= local175 + 1; local1368++) {
											if ((local412 != local170 || local1368 != local175) && local412 >= 0 && local412 < 104 && local1368 >= 0 && local1368 < 104) {
												@Pc(1408) int local1408 = Static81.aByteArrayArrayArray15[local153][local412][local1368] & 0xFF;
												if (local1408 != 0) {
													@Pc(1416) Class35 local1416 = Static171.method2693(local1408 - 1);
													if (local1416.anInt1069 != -1 && Static262.method3974(Static204.anInterface2_1.method1983(local1416.anInt1069))) {
														Static120.anIntArrayArray23[local170][local175] = (local1416.anInt1077 << 24) + local1416.anInt1074;
														continue label764;
													}
												}
											}
										}
									}
								}
							} else {
								@Pc(1458) byte local1458 = Static84.aByteArrayArrayArray4[local153][local170][local175];
								local412 = Static200.aByteArrayArrayArray12[local153][local170][local175] + 1;
								@Pc(1474) Class35 local1474 = Static171.method2693(local230 - 1);
								@Pc(1515) int local1515;
								@Pc(1528) int local1528;
								@Pc(1579) int local1579;
								if (Static178.aBoolean216 && !arg0 && Static120.anIntArrayArray23 != null && local153 == 0) {
									if (local1474.anInt1069 != -1 && Static262.method3974(Static204.anInterface2_1.method1983(local1474.anInt1069))) {
										Static120.anIntArrayArray23[local170][local175] = (local1474.anInt1077 << 24) + local1474.anInt1074;
									} else {
										label745: for (local1515 = local170 - 1; local1515 <= local170 + 1; local1515++) {
											for (local1528 = local175 - 1; local1528 <= local175 + 1; local1528++) {
												if ((local170 != local1515 || local175 != local1528) && local1515 >= 0 && local1515 < 104 && local1528 >= 0 && local1528 < 104) {
													local1579 = Static81.aByteArrayArrayArray15[local153][local1515][local1528] & 0xFF;
													if (local1579 != 0) {
														@Pc(1592) Class35 local1592 = Static171.method2693(local1579 - 1);
														if (local1592.anInt1069 != -1 && Static262.method3974(Static204.anInterface2_1.method1983(local1592.anInt1069))) {
															Static120.anIntArrayArray23[local170][local175] = (local1592.anInt1077 << 24) + local1592.anInt1074;
															break label745;
														}
													}
												}
											}
										}
									}
								}
								local1515 = local1474.anInt1069;
								if (local1515 >= 0 && !Static204.anInterface2_1.method1976(local1515)) {
									local1515 = -1;
								}
								@Pc(1703) int local1703;
								@Pc(1676) int local1676;
								if (local1515 >= 0) {
									local1579 = Static204.anIntArray354[Static169.method2669(Static204.anInterface2_1.method1979(local1515), 96)];
									local1528 = -1;
								} else if (local1474.anInt1071 == -1) {
									local1579 = 0;
									local1528 = -2;
								} else {
									local1528 = local1474.anInt1071;
									local1676 = (local1528 & 0x7F) + local15;
									if (local1676 < 0) {
										local1676 = 0;
									} else if (local1676 > 127) {
										local1676 = 127;
									}
									local1703 = (local1528 & 0x380) + (local10 + local1528 & 0xFC00) + local1676;
									local1579 = Static204.anIntArray354[Static169.method2669(local1703, 96)];
								}
								if (local1474.anInt1066 >= 0) {
									local1676 = local1474.anInt1066;
									local1703 = local15 + (local1676 & 0x7F);
									if (local1703 < 0) {
										local1703 = 0;
									} else if (local1703 > 127) {
										local1703 = 127;
									}
									@Pc(1752) int local1752 = local1703 + (local1676 & 0x380) + (local1676 + local10 & 0xFC00);
									local1579 = Static204.anIntArray354[Static169.method2669(local1752, 96)];
								}
								Static271.method4058(local153, local170, local175, local412, local1458, local1515, local283, local285, local292, local434, Static2.method17(local352, local316), Static2.method17(local358, local316), Static2.method17(local362, local316), Static2.method17(local418, local316), Static169.method2669(local1528, local352), Static169.method2669(local1528, local358), Static169.method2669(local1528, local362), Static169.method2669(local1528, local418), local339, local1579);
								if (Static178.aBoolean216 && local153 > 0) {
									Static64.method987(local412, local1458, local1528 == -2 || !local1474.aBoolean80, local316 == -1 || !Static263.method722(local262 - 1).aBoolean293, local170, local175, local283 - Static250.anIntArrayArrayArray13[0][local170][local175], local285 - Static250.anIntArrayArrayArray13[0][local170 + 1][local175], local292 - Static250.anIntArrayArrayArray13[0][local170 + 1][local175 + 1], -Static250.anIntArrayArrayArray13[0][local170][local175 + 1] + local434);
								}
							}
						}
					}
				}
			}
			if (Static178.aBoolean216) {
				@Pc(1898) float[][] local1898 = new float[105][105];
				@Pc(1902) float[][] local1902 = new float[105][105];
				@Pc(1906) int[][] local1906 = Static250.anIntArrayArrayArray13[local153];
				@Pc(1910) float[][] local1910 = new float[105][105];
				local283 = 1;
				while (true) {
					if (local283 > 103) {
						@Pc(2033) Class4_Sub14[] local2033;
						if (arg0) {
							local2033 = Static169.method2665(local151, local1898, Static200.aByteArrayArrayArray12[local153], Static250.anIntArrayArrayArray13[local153], local147, local1910, Static81.aByteArrayArrayArray15[local153], Static84.aByteArrayArrayArray4[local153], Static218.aByteArrayArrayArray21[local153], Static120.anIntArrayArray23, Static231.anIntArrayArrayArray12[0], arg2, local153, local1902, Static46.aByteArrayArrayArray2);
							Static218.method4259(local153, local2033);
							break;
						}
						local2033 = Static169.method2665(local151, local1898, Static200.aByteArrayArrayArray12[local153], Static250.anIntArrayArrayArray13[local153], local147, local1910, Static81.aByteArrayArrayArray15[local153], Static84.aByteArrayArrayArray4[local153], Static218.aByteArrayArrayArray21[local153], null, null, arg2, local153, local1902, Static46.aByteArrayArrayArray2);
						@Pc(2091) Class4_Sub14[] local2091 = Static103.method1667(local147, Static250.anIntArrayArrayArray13[local153], Static84.aByteArrayArrayArray4[local153], local1902, Static218.aByteArrayArrayArray21[local153], Static200.aByteArrayArrayArray12[local153], local1898, Static81.aByteArrayArrayArray15[local153], local153, Static46.aByteArrayArrayArray2, local1910);
						@Pc(2098) Class4_Sub14[] local2098 = new Class4_Sub14[local2033.length + local2091.length];
						for (local434 = 0; local434 < local2033.length; local434++) {
							local2098[local434] = local2033[local434];
						}
						for (local434 = 0; local434 < local2091.length; local434++) {
							local2098[local434 + local2033.length] = local2091[local434];
						}
						Static218.method4259(local153, local2098);
						Static41.method686(Static84.aByteArrayArrayArray4[local153], Static12.anInt225, Static200.aByteArrayArrayArray12[local153], Static81.aByteArrayArrayArray15[local153], Static12.aClass155Array1, Static218.aByteArrayArrayArray21[local153], Static250.anIntArrayArrayArray13[local153], local153, local1902, local1910, local1898);
						break;
					}
					for (local285 = 1; local285 <= 103; local285++) {
						local292 = local1906[local285 + 1][local283] - local1906[local285 - 1][local283];
						local434 = local1906[local285][local283 + 1] - local1906[local285][local283 - 1];
						@Pc(1969) float local1969 = (float) Math.sqrt((double) (local292 * local292 + local434 * local434 + 65536));
						local1898[local285][local283] = (float) local292 / local1969;
						local1902[local285][local283] = -256.0F / local1969;
						local1910[local285][local283] = (float) local434 / local1969;
					}
					local283++;
				}
			}
			Static218.aByteArrayArrayArray21[local153] = null;
			Static81.aByteArrayArrayArray15[local153] = null;
			Static200.aByteArrayArrayArray12[local153] = null;
			Static84.aByteArrayArrayArray4[local153] = null;
			Static227.aByteArrayArrayArray14[local153] = null;
		}
		Static205.method3262();
		if (arg0) {
			return;
		}
		@Pc(2200) int local2200;
		for (local153 = 0; local153 < 104; local153++) {
			for (local2200 = 0; local2200 < 104; local2200++) {
				if ((Static46.aByteArrayArrayArray2[1][local153][local2200] & 0x2) == 2) {
					Static18.method326(local153, local2200);
				}
			}
		}
		for (local153 = 0; local153 < 4; local153++) {
			for (local2200 = 0; local2200 <= 104; local2200++) {
				for (local170 = 0; local170 <= 104; local170++) {
					if ((Static84.anIntArrayArrayArray6[local153][local170][local2200] & 0x1) != 0) {
						for (local175 = local2200; local175 > 0 && (Static84.anIntArrayArrayArray6[local153][local170][local175 - 1] & 0x1) != 0; local175--) {
						}
						for (local262 = local2200; local262 < 104 && (Static84.anIntArrayArrayArray6[local153][local170][local262 + 1] & 0x1) != 0; local262++) {
						}
						local230 = local153;
						local283 = local153;
						label446: while (local230 > 0) {
							for (local285 = local175; local285 <= local262; local285++) {
								if ((Static84.anIntArrayArrayArray6[local230 - 1][local170][local285] & 0x1) == 0) {
									break label446;
								}
							}
							local230--;
						}
						label435: while (local283 < 3) {
							for (local285 = local175; local285 <= local262; local285++) {
								if ((Static84.anIntArrayArrayArray6[local283 + 1][local170][local285] & 0x1) == 0) {
									break label435;
								}
							}
							local283++;
						}
						local285 = (local262 + 1 - local175) * (-local230 + 1 + local283);
						if (local285 >= 8) {
							local434 = Static250.anIntArrayArrayArray13[local283][local170][local175] - 240;
							local316 = Static250.anIntArrayArrayArray13[local230][local170][local175];
							Static266.method3996(1, local170 * 128, local170 * 128, local175 * 128, local262 * 128 + 128, local434, local316);
							for (local339 = local230; local339 <= local283; local339++) {
								for (local352 = local175; local352 <= local262; local352++) {
									Static84.anIntArrayArrayArray6[local339][local170][local352] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((Static84.anIntArrayArrayArray6[local153][local170][local2200] & 0x2) != 0) {
						for (local175 = local170; local175 > 0 && (Static84.anIntArrayArrayArray6[local153][local175 - 1][local2200] & 0x2) != 0; local175--) {
						}
						local230 = local153;
						local283 = local153;
						for (local262 = local170; local262 < 104 && (Static84.anIntArrayArrayArray6[local153][local262 + 1][local2200] & 0x2) != 0; local262++) {
						}
						label501: while (local230 > 0) {
							for (local285 = local175; local285 <= local262; local285++) {
								if ((Static84.anIntArrayArrayArray6[local230 - 1][local285][local2200] & 0x2) == 0) {
									break label501;
								}
							}
							local230--;
						}
						label490: while (local283 < 3) {
							for (local285 = local175; local285 <= local262; local285++) {
								if ((Static84.anIntArrayArrayArray6[local283 + 1][local285][local2200] & 0x2) == 0) {
									break label490;
								}
							}
							local283++;
						}
						local285 = (local262 + 1 - local175) * (local283 + 1 + -local230);
						if (local285 >= 8) {
							local434 = Static250.anIntArrayArrayArray13[local283][local175][local2200] - 240;
							local316 = Static250.anIntArrayArrayArray13[local230][local175][local2200];
							Static266.method3996(2, local175 * 128, local262 * 128 + 128, local2200 * 128, local2200 * 128, local434, local316);
							for (local339 = local230; local339 <= local283; local339++) {
								for (local352 = local175; local352 <= local262; local352++) {
									Static84.anIntArrayArrayArray6[local339][local352][local2200] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((Static84.anIntArrayArrayArray6[local153][local170][local2200] & 0x4) != 0) {
						local262 = local170;
						local175 = local170;
						for (local230 = local2200; local230 > 0 && (Static84.anIntArrayArrayArray6[local153][local170][local230 - 1] & 0x4) != 0; local230--) {
						}
						for (local283 = local2200; local283 < 104 && (Static84.anIntArrayArrayArray6[local153][local170][local283 + 1] & 0x4) != 0; local283++) {
						}
						label555: while (local175 > 0) {
							for (local285 = local230; local285 <= local283; local285++) {
								if ((Static84.anIntArrayArrayArray6[local153][local175 - 1][local285] & 0x4) == 0) {
									break label555;
								}
							}
							local175--;
						}
						label544: while (local262 < 104) {
							for (local285 = local230; local285 <= local283; local285++) {
								if ((Static84.anIntArrayArrayArray6[local153][local262 + 1][local285] & 0x4) == 0) {
									break label544;
								}
							}
							local262++;
						}
						if ((local262 + 1 - local175) * ((local283 - local230) + 1) >= 4) {
							local285 = Static250.anIntArrayArrayArray13[local153][local175][local230];
							Static266.method3996(4, local175 * 128, local262 * 128 + 128, local230 * 128, local283 * 128 + 128, local285, local285);
							for (local292 = local175; local292 <= local262; local292++) {
								for (local434 = local230; local434 <= local283; local434++) {
									Static84.anIntArrayArrayArray6[local153][local292][local434] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
	public static void method518() {
		aClass33_4 = null;
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(I)V")
	public static void method519() {
		if (Static189.anInt4944 != -1) {
			Static224.method3579(-1, Static189.anInt4944, -1);
			Static189.anInt4944 = -1;
		}
	}
}
