import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!db", name = "s", descriptor = "[Lclient!am;")
	public static Class9[] aClass9Array1;

	@OriginalMember(owner = "client!db", name = "w", descriptor = "Lclient!th;")
	public static Class168 aClass168_33;

	@OriginalMember(owner = "client!db", name = "z", descriptor = "Lclient!th;")
	public static Class168 aClass168_34;

	@OriginalMember(owner = "client!db", name = "o", descriptor = "I")
	public static int anInt1002 = 0;

	@OriginalMember(owner = "client!db", name = "v", descriptor = "Z")
	public static boolean aBoolean72 = true;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Z[Lclient!ic;B[[[I)V")
	public static void method824(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class75[] arg1, @OriginalArg(3) int[][][] arg2) {
		@Pc(9) byte local9;
		if (arg0) {
			local9 = 1;
		} else {
			local9 = 4;
		}
		@Pc(17) int local17;
		@Pc(22) int local22;
		if (!arg0) {
			for (local17 = 0; local17 < 4; local17++) {
				for (local22 = 0; local22 < 104; local22++) {
					for (@Pc(27) int local27 = 0; local27 < 104; local27++) {
						if ((Static303.aByteArrayArrayArray19[local17][local22][local27] & 0x1) == 1) {
							@Pc(46) int local46 = local17;
							if ((Static303.aByteArrayArrayArray19[1][local22][local27] & 0x2) == 2) {
								local46 = local17 - 1;
							}
							if (local46 >= 0) {
								arg1[local46].method1814(local27, local22);
							}
						}
					}
				}
			}
			Static185.anInt4090 += (int) (Math.random() * 5.0D) - 2;
			Static209.anInt4543 += (int) (Math.random() * 5.0D) - 2;
			if (Static209.anInt4543 < -8) {
				Static209.anInt4543 = -8;
			}
			if (Static185.anInt4090 < -16) {
				Static185.anInt4090 = -16;
			}
			if (Static209.anInt4543 > 8) {
				Static209.anInt4543 = 8;
			}
			if (Static185.anInt4090 > 16) {
				Static185.anInt4090 = 16;
			}
		}
		local17 = Static209.anInt4543 >> 2 << 10;
		local22 = Static185.anInt4090 >> 1;
		@Pc(147) int[][] local147 = new int[104][104];
		@Pc(151) int[][] local151 = new int[104][104];
		@Pc(153) int local153;
		@Pc(170) int local170;
		@Pc(176) int local176;
		@Pc(178) int local178;
		@Pc(183) int local183;
		@Pc(322) int local322;
		@Pc(208) int local208;
		@Pc(228) int local228;
		@Pc(241) int local241;
		@Pc(247) int local247;
		@Pc(251) int local251;
		@Pc(306) int local306;
		for (local153 = 0; local153 < local9; local153++) {
			@Pc(164) byte[][] local164 = Static170.aByteArrayArrayArray14[local153];
			@Pc(300) int local300;
			@Pc(454) int local454;
			@Pc(460) int local460;
			@Pc(509) int local509;
			if (!Static294.aBoolean367) {
				local170 = (int) Math.sqrt(5100.0D);
				local176 = local170 * 768 >> 8;
				for (local178 = 1; local178 < 103; local178++) {
					for (local183 = 1; local183 < 103; local183++) {
						local208 = Static46.anIntArrayArrayArray1[local153][local183 + 1][local178] - Static46.anIntArrayArrayArray1[local153][local183 - 1][local178];
						local228 = Static46.anIntArrayArrayArray1[local153][local183][local178 + 1] - Static46.anIntArrayArrayArray1[local153][local183][local178 - 1];
						local241 = (int) Math.sqrt((double) (local208 * local208 + local228 * local228 + 65536));
						local247 = (local208 << 8) / local241;
						local251 = -65536 / local241;
						local300 = (local164[local183][local178 + 1] >> 3) + (local164[local183][local178 - 1] >> 2) + (local164[local183 + 1][local178] >> 3) + (local164[local183 + -1][local178] >> 2) + (local164[local183][local178] >> 1);
						local306 = (local228 << 8) / local241;
						local322 = (local306 * -50 + local251 * -10 + local247 * -50) / local176 + 74;
						local147[local183][local178] = local322 - local300;
					}
				}
			} else if (Static65.aBoolean96) {
				for (local170 = 1; local170 < 103; local170++) {
					for (local176 = 1; local176 < 103; local176++) {
						local183 = (local164[local176][local170] >> 1) + (local164[local176][local170 + 1] >> 3) + (local164[local176 + -1][local170] >> 2) + (local164[local176 - -1][local170] >> 3) + (local164[local176][local170 + -1] >> 2);
						local147[local176][local170] = 74 - local183;
					}
				}
			} else {
				local176 = (int) Static180.aFloatArray15[1];
				local170 = (int) Static180.aFloatArray15[0];
				local178 = (int) Static180.aFloatArray15[2];
				local183 = (int) Math.sqrt((double) (local178 * local178 + local176 * local176 + local170 * local170));
				local322 = local183 * 1024 >> 8;
				for (local208 = 1; local208 < 103; local208++) {
					for (local228 = 1; local228 < 103; local228++) {
						local247 = Static46.anIntArrayArrayArray1[local153][local228 + 1][local208] - Static46.anIntArrayArrayArray1[local153][local228 - 1][local208];
						local251 = Static46.anIntArrayArrayArray1[local153][local228][local208 + 1] - Static46.anIntArrayArrayArray1[local153][local228][local208 - 1];
						local306 = (int) Math.sqrt((double) (local247 * local247 + local251 * local251 + 65536));
						local300 = (local247 << 8) / local306;
						local454 = -65536 / local306;
						local460 = (local251 << 8) / local306;
						local509 = (local164[local228][local208] >> 1) + (local164[local228][local208 + 1] >> 3) + (local164[local228 + 1][local208] >> 3) + (local164[local228 + -1][local208] >> 2) + (local164[local228][local208 + -1] >> 2);
						local241 = (local300 * local170 + local176 * local454 + local178 * local460) / local322 + 96;
						local147[local228][local208] = local241 - (int) ((float) local509 * 1.7F);
					}
				}
			}
			for (local170 = 0; local170 < 104; local170++) {
				Static120.anIntArray566[local170] = 0;
				Static150.anIntArray311[local170] = 0;
				Static193.anIntArray368[local170] = 0;
				Static313.anIntArray567[local170] = 0;
				Static145.anIntArray540[local170] = 0;
			}
			for (local170 = -5; local170 < 104; local170++) {
				for (local176 = 0; local176 < 104; local176++) {
					local178 = local170 + 5;
					@Pc(733) int local733;
					if (local178 < 104) {
						local183 = Static257.aByteArrayArrayArray15[local153][local178][local176] & 0xFF;
						if (local183 > 0) {
							@Pc(697) Class30 local697 = Static90.method1547(local183 - 1);
							Static120.anIntArray566[local176] += local697.anInt926;
							Static150.anIntArray311[local176] += local697.anInt927;
							Static193.anIntArray368[local176] += local697.anInt924;
							Static313.anIntArray567[local176] += local697.anInt920;
							local733 = Static145.anIntArray540[local176]++;
						}
					}
					local183 = local170 - 5;
					if (local183 >= 0) {
						local322 = Static257.aByteArrayArrayArray15[local153][local183][local176] & 0xFF;
						if (local322 > 0) {
							@Pc(768) Class30 local768 = Static90.method1547(local322 - 1);
							Static120.anIntArray566[local176] -= local768.anInt926;
							Static150.anIntArray311[local176] -= local768.anInt927;
							Static193.anIntArray368[local176] -= local768.anInt924;
							Static313.anIntArray567[local176] -= local768.anInt920;
							local733 = Static145.anIntArray540[local176]--;
						}
					}
				}
				if (local170 >= 0) {
					local176 = 0;
					local178 = 0;
					local183 = 0;
					local322 = 0;
					local208 = 0;
					for (local228 = -5; local228 < 104; local228++) {
						local241 = local228 + 5;
						if (local241 < 104) {
							local183 += Static193.anIntArray368[local241];
							local322 += Static313.anIntArray567[local241];
							local176 += Static120.anIntArray566[local241];
							local208 += Static145.anIntArray540[local241];
							local178 += Static150.anIntArray311[local241];
						}
						local247 = local228 - 5;
						if (local247 >= 0) {
							local208 -= Static145.anIntArray540[local247];
							local178 -= Static150.anIntArray311[local247];
							local183 -= Static193.anIntArray368[local247];
							local322 -= Static313.anIntArray567[local247];
							local176 -= Static120.anIntArray566[local247];
						}
						if (local228 >= 0 && local208 > 0) {
							local151[local170][local228] = Static21.method457(local183 / local208, local178 / local208, local176 * 256 / local322);
						}
					}
				}
			}
			for (local170 = 1; local170 < 103; local170++) {
				label764: for (local176 = 1; local176 < 103; local176++) {
					if (arg0 || Static241.method3782() || (Static303.aByteArrayArrayArray19[0][local170][local176] & 0x2) != 0 || (Static303.aByteArrayArrayArray19[local153][local170][local176] & 0x10) == 0 && Static183.method2976(local176, local170, local153) == Static204.anInt4430) {
						if (Static75.anInt1755 > local153) {
							Static75.anInt1755 = local153;
						}
						local178 = Static257.aByteArrayArrayArray15[local153][local170][local176] & 0xFF;
						local183 = Static266.aByteArrayArrayArray16[local153][local170][local176] & 0xFF;
						if (local178 > 0 || local183 > 0) {
							local322 = Static46.anIntArrayArrayArray1[local153][local170][local176];
							local208 = Static46.anIntArrayArrayArray1[local153][local170 + 1][local176];
							local228 = Static46.anIntArrayArrayArray1[local153][local170 + 1][local176 + 1];
							local241 = Static46.anIntArrayArrayArray1[local153][local170][local176 + 1];
							if (local153 > 0) {
								@Pc(1075) boolean local1075 = true;
								if (local178 == 0 && Static43.aByteArrayArrayArray1[local153][local170][local176] != 0) {
									local1075 = false;
								}
								if (local183 > 0 && !Static148.method2407(local183 - 1).aBoolean137) {
									local1075 = false;
								}
								if (local1075 && local208 == local322 && local322 == local228 && local241 == local322) {
									Static211.anIntArrayArrayArray9[local153][local170][local176] |= 0x4;
								}
							}
							if (local178 > 0) {
								local247 = local151[local170][local176];
								local306 = (local247 & 0x7F) + local22;
								if (local306 < 0) {
									local306 = 0;
								} else if (local306 > 127) {
									local306 = 127;
								}
								local300 = (local247 & 0x380) + (local17 + local247 & 0xFC00) + local306;
								local251 = Static237.anIntArray462[Static213.method3404(96, local300)];
							} else {
								local251 = 0;
								local247 = -1;
							}
							local306 = local147[local170][local176];
							local300 = local147[local170 + 1][local176];
							local460 = local147[local170][local176 + 1];
							local454 = local147[local170 + 1][local176 + 1];
							if (local183 == 0) {
								Static104.method1727(local153, local170, local176, 0, 0, -1, local322, local208, local228, local241, Static213.method3404(local306, local247), Static213.method3404(local300, local247), Static213.method3404(local454, local247), Static213.method3404(local460, local247), 0, 0, 0, 0, local251, 0);
								if (Static294.aBoolean367 && local153 > 0 && local247 != -1 && Static90.method1547(local178 - 1).aBoolean66) {
									Static177.method2841(0, 0, true, false, local170, local176, local322 - Static46.anIntArrayArrayArray1[0][local170][local176], local208 - Static46.anIntArrayArrayArray1[0][local170 + 1][local176], local228 - Static46.anIntArrayArrayArray1[0][local170 + 1][local176 + 1], local241 - Static46.anIntArrayArrayArray1[0][local170][local176 - -1]);
								}
								if (Static294.aBoolean367 && !arg0 && Static142.anIntArrayArray40 != null && local153 == 0) {
									for (local509 = local170 - 1; local509 <= local170 + 1; local509++) {
										for (@Pc(1366) int local1366 = local176 - 1; local1366 <= local176 + 1; local1366++) {
											if ((local509 != local170 || local176 != local1366) && local509 >= 0 && local509 < 104 && local1366 >= 0 && local1366 < 104) {
												@Pc(1404) int local1404 = Static266.aByteArrayArrayArray16[local153][local509][local1366] & 0xFF;
												if (local1404 != 0) {
													@Pc(1415) Class62 local1415 = Static148.method2407(local1404 - 1);
													if (local1415.anInt1983 != -1 && Static222.method3475(Static237.anInterface1_1.method4601(local1415.anInt1983))) {
														Static142.anIntArrayArray40[local170][local176] = (local1415.anInt1981 << 24) + local1415.anInt1986;
														continue label764;
													}
												}
											}
										}
									}
								}
							} else {
								local509 = Static43.aByteArrayArrayArray1[local153][local170][local176] + 1;
								@Pc(1468) byte local1468 = Static111.aByteArrayArrayArray3[local153][local170][local176];
								@Pc(1474) Class62 local1474 = Static148.method2407(local183 - 1);
								@Pc(1503) int local1503;
								@Pc(1516) int local1516;
								@Pc(1559) int local1559;
								if (Static294.aBoolean367 && !arg0 && Static142.anIntArrayArray40 != null && local153 == 0) {
									if (local1474.anInt1983 != -1 && Static222.method3475(Static237.anInterface1_1.method4601(local1474.anInt1983))) {
										Static142.anIntArrayArray40[local170][local176] = local1474.anInt1986 + (local1474.anInt1981 << 24);
									} else {
										label745: for (local1503 = local170 - 1; local1503 <= local170 + 1; local1503++) {
											for (local1516 = local176 - 1; local1516 <= local176 + 1; local1516++) {
												if ((local1503 != local170 || local176 != local1516) && local1503 >= 0 && local1503 < 104 && local1516 >= 0 && local1516 < 104) {
													local1559 = Static266.aByteArrayArrayArray16[local153][local1503][local1516] & 0xFF;
													if (local1559 != 0) {
														@Pc(1567) Class62 local1567 = Static148.method2407(local1559 - 1);
														if (local1567.anInt1983 != -1 && Static222.method3475(Static237.anInterface1_1.method4601(local1567.anInt1983))) {
															Static142.anIntArrayArray40[local170][local176] = (local1567.anInt1981 << 24) + local1567.anInt1986;
															break label745;
														}
													}
												}
											}
										}
									}
								}
								local1503 = local1474.anInt1983;
								if (local1503 >= 0 && !Static237.anInterface1_1.method4603(local1503)) {
									local1503 = -1;
								}
								@Pc(1693) int local1693;
								@Pc(1665) int local1665;
								if (local1503 >= 0) {
									local1516 = -1;
									local1559 = Static237.anIntArray462[Static305.method4638(96, Static237.anInterface1_1.method4597(local1503))];
								} else if (local1474.anInt1980 == -1) {
									local1516 = -2;
									local1559 = 0;
								} else {
									local1516 = local1474.anInt1980;
									local1665 = (local1516 & 0x7F) + local22;
									if (local1665 < 0) {
										local1665 = 0;
									} else if (local1665 > 127) {
										local1665 = 127;
									}
									local1693 = local1665 + (local1516 & 0x380) + (local1516 + local17 & 0xFC00);
									local1559 = Static237.anIntArray462[Static305.method4638(96, local1693)];
								}
								if (local1474.anInt1979 >= 0) {
									local1665 = local1474.anInt1979;
									local1693 = (local1665 & 0x7F) + local22;
									if (local1693 < 0) {
										local1693 = 0;
									} else if (local1693 > 127) {
										local1693 = 127;
									}
									@Pc(1744) int local1744 = local1693 + (local1665 & 0x380) + (local17 + local1665 & 0xFC00);
									local1559 = Static237.anIntArray462[Static305.method4638(96, local1744)];
								}
								Static104.method1727(local153, local170, local176, local509, local1468, local1503, local322, local208, local228, local241, Static213.method3404(local306, local247), Static213.method3404(local300, local247), Static213.method3404(local454, local247), Static213.method3404(local460, local247), Static305.method4638(local306, local1516), Static305.method4638(local300, local1516), Static305.method4638(local454, local1516), Static305.method4638(local460, local1516), local251, local1559);
								if (Static294.aBoolean367 && local153 > 0) {
									Static177.method2841(local509, local1468, local1516 == -2 || !local1474.aBoolean135, local247 == -1 || !Static90.method1547(local178 - 1).aBoolean66, local170, local176, local322 - Static46.anIntArrayArrayArray1[0][local170][local176], local208 + -Static46.anIntArrayArrayArray1[0][local170 - -1][local176], local228 - Static46.anIntArrayArrayArray1[0][local170 + 1][local176 + 1], -Static46.anIntArrayArrayArray1[0][local170][local176 + 1] + local241);
								}
							}
						}
					}
				}
			}
			if (Static294.aBoolean367) {
				@Pc(1896) float[][] local1896 = new float[105][105];
				@Pc(1900) int[][] local1900 = Static46.anIntArrayArrayArray1[local153];
				@Pc(1904) float[][] local1904 = new float[105][105];
				@Pc(1908) float[][] local1908 = new float[105][105];
				local322 = 1;
				while (true) {
					if (local322 > 103) {
						@Pc(2032) Class1_Sub28[] local2032;
						if (arg0) {
							local2032 = Static102.method718(local1908, Static46.anIntArrayArrayArray1[local153], Static299.anIntArrayArrayArray14[0], Static43.aByteArrayArrayArray1[local153], Static303.aByteArrayArrayArray19, Static111.aByteArrayArrayArray3[local153], Static142.anIntArrayArray40, local1896, Static266.aByteArrayArrayArray16[local153], Static257.aByteArrayArrayArray15[local153], arg2, local1904, local151, local147, local153);
							Static254.method3874(local153, local2032);
							break;
						}
						local2032 = Static102.method718(local1908, Static46.anIntArrayArrayArray1[local153], null, Static43.aByteArrayArrayArray1[local153], Static303.aByteArrayArrayArray19, Static111.aByteArrayArrayArray3[local153], null, local1896, Static266.aByteArrayArrayArray16[local153], Static257.aByteArrayArrayArray15[local153], arg2, local1904, local151, local147, local153);
						@Pc(2056) Class1_Sub28[] local2056 = Static200.method3205(local153, Static266.aByteArrayArrayArray16[local153], local1908, Static111.aByteArrayArrayArray3[local153], local1896, Static43.aByteArrayArrayArray1[local153], Static46.anIntArrayArrayArray1[local153], Static257.aByteArrayArrayArray15[local153], Static303.aByteArrayArrayArray19, local147, local1904);
						@Pc(2063) Class1_Sub28[] local2063 = new Class1_Sub28[local2056.length + local2032.length];
						for (local241 = 0; local241 < local2032.length; local241++) {
							local2063[local241] = local2032[local241];
						}
						for (local241 = 0; local241 < local2056.length; local241++) {
							local2063[local2032.length + local241] = local2056[local241];
						}
						Static254.method3874(local153, local2063);
						Static288.method4420(local1904, Static266.aByteArrayArrayArray16[local153], Static46.anIntArrayArrayArray1[local153], Static257.aByteArrayArrayArray15[local153], local1908, local1896, Static111.aByteArrayArrayArray3[local153], local153, Static43.aByteArrayArrayArray1[local153], Static191.aClass59Array1, Static191.anInt4217);
						break;
					}
					for (local208 = 1; local208 <= 103; local208++) {
						local228 = local1900[local208 + 1][local322] - local1900[local208 - 1][local322];
						local241 = local1900[local208][local322 + 1] - local1900[local208][local322 - 1];
						@Pc(1968) float local1968 = (float) Math.sqrt((double) (local228 * local228 + local241 * local241 + 65536));
						local1908[local208][local322] = (float) local228 / local1968;
						local1896[local208][local322] = -256.0F / local1968;
						local1904[local208][local322] = (float) local241 / local1968;
					}
					local322++;
				}
			}
			Static257.aByteArrayArrayArray15[local153] = null;
			Static266.aByteArrayArrayArray16[local153] = null;
			Static43.aByteArrayArrayArray1[local153] = null;
			Static111.aByteArrayArrayArray3[local153] = null;
			Static170.aByteArrayArrayArray14[local153] = null;
		}
		Static21.method449();
		if (arg0) {
			return;
		}
		@Pc(2207) int local2207;
		for (local153 = 0; local153 < 104; local153++) {
			for (local2207 = 0; local2207 < 104; local2207++) {
				if ((Static303.aByteArrayArrayArray19[1][local153][local2207] & 0x2) == 2) {
					Static229.method3620(local153, local2207);
				}
			}
		}
		for (local153 = 0; local153 < 4; local153++) {
			for (local2207 = 0; local2207 <= 104; local2207++) {
				for (local170 = 0; local170 <= 104; local170++) {
					if ((Static211.anIntArrayArrayArray9[local153][local170][local2207] & 0x1) != 0) {
						local176 = local2207;
						local178 = local2207;
						while (local176 > 0 && (Static211.anIntArrayArrayArray9[local153][local170][local176 - 1] & 0x1) != 0) {
							local176--;
						}
						while (local178 < 104 && (Static211.anIntArrayArrayArray9[local153][local170][local178 + 1] & 0x1) != 0) {
							local178++;
						}
						label447: for (local183 = local153; local183 > 0; local183--) {
							for (local208 = local176; local208 <= local178; local208++) {
								if ((Static211.anIntArrayArrayArray9[local183 - 1][local170][local208] & 0x1) == 0) {
									break label447;
								}
							}
						}
						label435: for (local322 = local153; local322 < 3; local322++) {
							for (local208 = local176; local208 <= local178; local208++) {
								if ((Static211.anIntArrayArrayArray9[local322 + 1][local170][local208] & 0x1) == 0) {
									break label435;
								}
							}
						}
						local208 = (local322 + 1 - local183) * (-local176 + local178 - -1);
						if (local208 >= 8) {
							local247 = Static46.anIntArrayArrayArray1[local183][local170][local176];
							local241 = Static46.anIntArrayArrayArray1[local322][local170][local176] - 240;
							Static101.method204(1, local170 * 128, local170 * 128, local176 * 128, local178 * 128 + 128, local241, local247);
							for (local251 = local183; local251 <= local322; local251++) {
								for (local306 = local176; local306 <= local178; local306++) {
									Static211.anIntArrayArrayArray9[local251][local170][local306] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((Static211.anIntArrayArrayArray9[local153][local170][local2207] & 0x2) != 0) {
						local176 = local170;
						local178 = local170;
						local322 = local153;
						while (local176 > 0 && (Static211.anIntArrayArrayArray9[local153][local176 - 1][local2207] & 0x2) != 0) {
							local176--;
						}
						local183 = local153;
						while (local178 < 104 && (Static211.anIntArrayArrayArray9[local153][local178 + 1][local2207] & 0x2) != 0) {
							local178++;
						}
						label501: while (local183 > 0) {
							for (local208 = local176; local208 <= local178; local208++) {
								if ((Static211.anIntArrayArrayArray9[local183 - 1][local208][local2207] & 0x2) == 0) {
									break label501;
								}
							}
							local183--;
						}
						label490: while (local322 < 3) {
							for (local208 = local176; local208 <= local178; local208++) {
								if ((Static211.anIntArrayArrayArray9[local322 + 1][local208][local2207] & 0x2) == 0) {
									break label490;
								}
							}
							local322++;
						}
						local208 = (local322 + 1 - local183) * (local178 + 1 - local176);
						if (local208 >= 8) {
							local241 = Static46.anIntArrayArrayArray1[local322][local176][local2207] - 240;
							local247 = Static46.anIntArrayArrayArray1[local183][local176][local2207];
							Static101.method204(2, local176 * 128, local178 * 128 + 128, local2207 * 128, local2207 * 128, local241, local247);
							for (local251 = local183; local251 <= local322; local251++) {
								for (local306 = local176; local306 <= local178; local306++) {
									Static211.anIntArrayArrayArray9[local251][local306][local2207] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((Static211.anIntArrayArrayArray9[local153][local170][local2207] & 0x4) != 0) {
						local176 = local170;
						local178 = local170;
						for (local183 = local2207; local183 > 0 && (Static211.anIntArrayArrayArray9[local153][local170][local183 - 1] & 0x4) != 0; local183--) {
						}
						for (local322 = local2207; local322 < 104 && (Static211.anIntArrayArrayArray9[local153][local170][local322 + 1] & 0x4) != 0; local322++) {
						}
						label555: while (local176 > 0) {
							for (local208 = local183; local208 <= local322; local208++) {
								if ((Static211.anIntArrayArrayArray9[local153][local176 - 1][local208] & 0x4) == 0) {
									break label555;
								}
							}
							local176--;
						}
						label544: while (local178 < 104) {
							for (local208 = local183; local208 <= local322; local208++) {
								if ((Static211.anIntArrayArrayArray9[local153][local178 + 1][local208] & 0x4) == 0) {
									break label544;
								}
							}
							local178++;
						}
						if ((local178 + 1 - local176) * (local322 + -local183 - -1) >= 4) {
							local208 = Static46.anIntArrayArrayArray1[local153][local176][local183];
							Static101.method204(4, local176 * 128, local178 * 128 + 128, local183 * 128, local322 * 128 + 128, local208, local208);
							for (local228 = local176; local228 <= local178; local228++) {
								for (local241 = local183; local241 <= local322; local241++) {
									Static211.anIntArrayArrayArray9[local153][local228][local241] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(BZ)Z")
	public static boolean method825(@OriginalArg(1) boolean arg0) {
		@Pc(9) boolean local9 = Static314.method4745();
		if (local9 == arg0) {
			return true;
		}
		if (!arg0) {
			Static314.method4751();
		} else if (!Static314.method4749() || !Static314.method4746() || !Static314.method4753()) {
			arg0 = false;
		}
		Static198.aBoolean269 = arg0;
		Static24.method510(Static142.aClass112_2);
		if (local9 == arg0) {
			return false;
		} else {
			((Class63_Sub1) Static237.anInterface1_1).method4606();
			return true;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(BLclient!gf;Lclient!vl;)Lclient!ua;")
	public static Class1_Sub28 method826(@OriginalArg(1) Class62 arg0, @OriginalArg(2) Class186 arg1) {
		@Pc(36) long local36 = ((long) arg0.anInt1986 << 32) + ((long) arg0.anInt1989 << 56) - (long) (-arg0.anInt1984 + -(arg0.anInt1983 + 1 << 16));
		@Pc(42) Class1_Sub28 local42 = (Class1_Sub28) arg1.method4570(local36);
		if (local42 == null) {
			local42 = new Class1_Sub28(arg0.anInt1983, (float) arg0.anInt1984, true, false, arg0.anInt1986);
			arg1.method4575(local36, local42);
		}
		return local42;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(II)V")
	public static void method827(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub3_Sub22 local8 = Static271.method4108(5, arg0);
		local8.method4464();
	}
}
