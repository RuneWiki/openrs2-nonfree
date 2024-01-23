import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!in", name = "W", descriptor = "Lclient!g;")
	public static Class56 aClass56_12;

	@OriginalMember(owner = "client!in", name = "M", descriptor = "I")
	public static int anInt2953 = 0;

	@OriginalMember(owner = "client!in", name = "N", descriptor = "[S")
	public static short[] aShortArray26 = new short[256];

	@OriginalMember(owner = "client!in", name = "X", descriptor = "Z")
	public static boolean aBoolean205 = false;

	@OriginalMember(owner = "client!in", name = "Y", descriptor = "J")
	public static long aLong97 = 0L;

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ILclient!ek;IB)Lclient!sc;")
	public static Class2_Sub8_Sub1_Sub1 method2315(@OriginalArg(0) int arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) int arg2) {
		return Static187.method3282(arg1, arg0, arg2) ? Static60.method1165() : null;
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(III)V")
	public static void method2316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class2_Sub8_Sub10 local13 = Static92.method1633(7, arg1);
		local13.method2052();
		local13.anInt2698 = arg0;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(B[[[IZ[Lclient!rm;)V")
	public static void method2317(@OriginalArg(1) int[][][] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class154[] arg2) {
		@Pc(9) int local9;
		@Pc(16) int local16;
		if (!arg1) {
			for (local9 = 0; local9 < 4; local9++) {
				for (local16 = 0; local16 < 104; local16++) {
					for (@Pc(23) int local23 = 0; local23 < 104; local23++) {
						if ((Static13.aByteArrayArrayArray2[local9][local16][local23] & 0x1) == 1) {
							@Pc(40) int local40 = local9;
							if ((Static13.aByteArrayArrayArray2[1][local16][local23] & 0x2) == 2) {
								local40 = local9 - 1;
							}
							if (local40 >= 0) {
								arg2[local40].method3913(local23, local16);
							}
						}
					}
				}
			}
			Static263.anInt5195 += (int) (Math.random() * 5.0D) - 2;
			Static25.anInt551 += (int) (Math.random() * 5.0D) - 2;
			if (Static263.anInt5195 < -8) {
				Static263.anInt5195 = -8;
			}
			if (Static25.anInt551 < -16) {
				Static25.anInt551 = -16;
			}
			if (Static263.anInt5195 > 8) {
				Static263.anInt5195 = 8;
			}
			if (Static25.anInt551 > 16) {
				Static25.anInt551 = 16;
			}
		}
		local16 = Static25.anInt551 >> 1;
		@Pc(133) int[][] local133 = new int[104][104];
		@Pc(137) byte local137;
		if (arg1) {
			local137 = 1;
		} else {
			local137 = 4;
		}
		@Pc(145) int[][] local145 = new int[104][104];
		local9 = Static263.anInt5195 >> 2 << 10;
		@Pc(153) int local153;
		@Pc(170) int local170;
		@Pc(176) int local176;
		@Pc(178) int local178;
		@Pc(183) int local183;
		@Pc(324) int local324;
		@Pc(211) int local211;
		@Pc(231) int local231;
		@Pc(244) int local244;
		@Pc(250) int local250;
		@Pc(254) int local254;
		@Pc(308) int local308;
		for (local153 = 0; local153 < local137; local153++) {
			@Pc(164) byte[][] local164 = Static209.aByteArrayArrayArray18[local153];
			@Pc(302) int local302;
			@Pc(452) int local452;
			@Pc(512) int local512;
			@Pc(506) int local506;
			if (!Static116.aBoolean184) {
				local170 = (int) Math.sqrt(5100.0D);
				local176 = local170 * 768 >> 8;
				for (local178 = 1; local178 < 103; local178++) {
					for (local183 = 1; local183 < 103; local183++) {
						local211 = Static9.anIntArrayArrayArray7[local153][local183 + 1][local178] - Static9.anIntArrayArrayArray7[local153][local183 - 1][local178];
						local231 = Static9.anIntArrayArrayArray7[local153][local183][local178 + 1] - Static9.anIntArrayArrayArray7[local153][local183][local178 - 1];
						local244 = (int) Math.sqrt((double) (local231 * local231 + local211 * local211 + 65536));
						local250 = (local211 << 8) / local244;
						local254 = -65536 / local244;
						local302 = (local164[local183][local178] >> 1) + (local164[local183 - 1][local178] >> 2) + (local164[local183 + 1][local178] >> 3) + (local164[local183][local178 - 1] >> 2) + (local164[local183][local178 + 1] >> 3);
						local308 = (local231 << 8) / local244;
						local324 = (local254 * -10 + local250 * -50 + local308 * -50) / local176 + 74;
						local145[local183][local178] = local324 - local302;
					}
				}
			} else if (Static265.aBoolean348) {
				for (local170 = 1; local170 < 103; local170++) {
					for (local176 = 1; local176 < 103; local176++) {
						local183 = (local164[local176][local170 + 1] >> 3) + (local164[local176][local170 - 1] >> 2) + (local164[local176 + -1][local170] >> 2) + (local164[local176 + 1][local170] >> 3) + (local164[local176][local170] >> 1);
						local145[local176][local170] = 74 - local183;
					}
				}
			} else {
				local170 = (int) Static235.aFloatArray15[0];
				local176 = (int) Static235.aFloatArray15[1];
				local178 = (int) Static235.aFloatArray15[2];
				local183 = (int) Math.sqrt((double) (local176 * local176 + local170 * local170 + local178 * local178));
				local324 = local183 * 1024 >> 8;
				for (local211 = 1; local211 < 103; local211++) {
					for (local231 = 1; local231 < 103; local231++) {
						local250 = Static9.anIntArrayArrayArray7[local153][local231 + 1][local211] - Static9.anIntArrayArrayArray7[local153][local231 - 1][local211];
						local254 = Static9.anIntArrayArrayArray7[local153][local231][local211 + 1] - Static9.anIntArrayArrayArray7[local153][local231][local211 - 1];
						local308 = (int) Math.sqrt((double) (local254 * local254 + local250 * local250 + 65536));
						local452 = -65536 / local308;
						local302 = (local250 << 8) / local308;
						local506 = (local164[local231][local211 - 1] >> 2) + (local164[local231 - 1][local211] >> 2) + (local164[local231 + 1][local211] >> 3) + (local164[local231][local211 + 1] >> 3) + (local164[local231][local211] >> 1);
						local512 = (local254 << 8) / local308;
						local244 = (local178 * local512 + local452 * local176 + local170 * local302) / local324 + 96;
						local145[local231][local211] = local244 - (int) ((float) local506 * 1.7F);
					}
				}
			}
			for (local170 = 0; local170 < 104; local170++) {
				Static9.anIntArray299[local170] = 0;
				Static93.anIntArray202[local170] = 0;
				Static152.anIntArray341[local170] = 0;
				Static167.anIntArray364[local170] = 0;
				Static295.anIntArray562[local170] = 0;
			}
			for (local170 = -5; local170 < 104; local170++) {
				for (local176 = 0; local176 < 104; local176++) {
					local178 = local170 + 5;
					@Pc(736) int local736;
					if (local178 < 104) {
						local183 = Static10.aByteArrayArrayArray1[local153][local178][local176] & 0xFF;
						if (local183 > 0) {
							@Pc(700) Class172 local700 = Static173.method3143(local183 - 1);
							Static9.anIntArray299[local176] += local700.anInt5468;
							Static93.anIntArray202[local176] += local700.anInt5466;
							Static152.anIntArray341[local176] += local700.anInt5461;
							Static167.anIntArray364[local176] += local700.anInt5465;
							local736 = Static295.anIntArray562[local176]++;
						}
					}
					local183 = local170 - 5;
					if (local183 >= 0) {
						local324 = Static10.aByteArrayArrayArray1[local153][local183][local176] & 0xFF;
						if (local324 > 0) {
							@Pc(764) Class172 local764 = Static173.method3143(local324 - 1);
							Static9.anIntArray299[local176] -= local764.anInt5468;
							Static93.anIntArray202[local176] -= local764.anInt5466;
							Static152.anIntArray341[local176] -= local764.anInt5461;
							Static167.anIntArray364[local176] -= local764.anInt5465;
							local736 = Static295.anIntArray562[local176]--;
						}
					}
				}
				if (local170 >= 0) {
					local176 = 0;
					local178 = 0;
					local324 = 0;
					local183 = 0;
					local211 = 0;
					for (local231 = -5; local231 < 104; local231++) {
						local244 = local231 + 5;
						if (local244 < 104) {
							local178 += Static93.anIntArray202[local244];
							local176 += Static9.anIntArray299[local244];
							local183 += Static152.anIntArray341[local244];
							local324 += Static167.anIntArray364[local244];
							local211 += Static295.anIntArray562[local244];
						}
						local250 = local231 - 5;
						if (local250 >= 0) {
							local176 -= Static9.anIntArray299[local250];
							local211 -= Static295.anIntArray562[local250];
							local183 -= Static152.anIntArray341[local250];
							local178 -= Static93.anIntArray202[local250];
							local324 -= Static167.anIntArray364[local250];
						}
						if (local231 >= 0 && local211 > 0) {
							local133[local170][local231] = Static19.method323(local176 * 256 / local324, local178 / local211, local183 / local211);
						}
					}
				}
			}
			for (local170 = 1; local170 < 103; local170++) {
				label772: for (local176 = 1; local176 < 103; local176++) {
					if (arg1 || Static69.method2440() || (Static13.aByteArrayArrayArray2[0][local170][local176] & 0x2) != 0 || (Static13.aByteArrayArrayArray2[local153][local170][local176] & 0x10) == 0 && Static54.method979(local153, local176, local170) == Static194.anInt4082) {
						if (Static305.anInt5900 > local153) {
							Static305.anInt5900 = local153;
						}
						local183 = Static83.aByteArrayArrayArray6[local153][local170][local176] & 0xFF;
						local178 = Static10.aByteArrayArrayArray1[local153][local170][local176] & 0xFF;
						if (local178 > 0 || local183 > 0) {
							local324 = Static9.anIntArrayArrayArray7[local153][local170][local176];
							local211 = Static9.anIntArrayArrayArray7[local153][local170 + 1][local176];
							local244 = Static9.anIntArrayArrayArray7[local153][local170][local176 + 1];
							local231 = Static9.anIntArrayArrayArray7[local153][local170 + 1][local176 + 1];
							if (local153 > 0) {
								@Pc(1069) boolean local1069 = true;
								if (local178 == 0 && Static14.aByteArrayArrayArray3[local153][local170][local176] != 0) {
									local1069 = false;
								}
								if (local183 > 0 && !Static7.method121(local183 - 1).aBoolean289) {
									local1069 = false;
								}
								if (local1069 && local324 == local211 && local324 == local231 && local324 == local244) {
									Static228.anIntArrayArrayArray14[local153][local170][local176] |= 0x4;
								}
							}
							if (local178 > 0) {
								local250 = local133[local170][local176];
								local308 = local16 + (local250 & 0x7F);
								if (local308 < 0) {
									local308 = 0;
								} else if (local308 > 127) {
									local308 = 127;
								}
								local302 = local308 + (local250 & 0x380) + (local9 + local250 & 0xFC00);
								local254 = Static1.anIntArray2[Static74.method1402(96, local302)];
							} else {
								local250 = -1;
								local254 = 0;
							}
							local308 = local145[local170][local176];
							local302 = local145[local170 + 1][local176];
							local452 = local145[local170 + 1][local176 + 1];
							local512 = local145[local170][local176 + 1];
							if (local183 == 0) {
								Static268.method4230(local153, local170, local176, 0, 0, -1, local324, local211, local231, local244, Static74.method1402(local308, local250), Static74.method1402(local302, local250), Static74.method1402(local452, local250), Static74.method1402(local512, local250), 0, 0, 0, 0, local254, 0);
								if (Static116.aBoolean184 && local153 > 0 && local250 != -1 && Static173.method3143(local178 - 1).aBoolean363) {
									Static266.method4180(0, 0, true, false, local170, local176, local324 - Static9.anIntArrayArrayArray7[0][local170][local176], local211 - Static9.anIntArrayArrayArray7[0][local170 + 1][local176], local231 - Static9.anIntArrayArrayArray7[0][local170 + 1][local176 + 1], -Static9.anIntArrayArrayArray7[0][local170][local176 + 1] + local244);
								}
								if (Static116.aBoolean184 && !arg1 && Static170.anIntArrayArray23 != null && local153 == 0) {
									for (local506 = local170 - 1; local506 <= local170 + 1; local506++) {
										for (@Pc(1809) int local1809 = local176 - 1; local1809 <= local176 + 1; local1809++) {
											if ((local170 != local506 || local176 != local1809) && local506 >= 0 && local506 < 104 && local1809 >= 0 && local1809 < 104) {
												@Pc(1866) int local1866 = Static83.aByteArrayArrayArray6[local153][local506][local1809] & 0xFF;
												if (local1866 != 0) {
													@Pc(1876) Class127 local1876 = Static7.method121(local1866 - 1);
													if (local1876.anInt4280 != -1 && Static48.method888(Static1.anInterface3_1.method4135(local1876.anInt4280))) {
														Static170.anIntArrayArray23[local170][local176] = local1876.anInt4282 + (local1876.anInt4274 << 24);
														continue label772;
													}
												}
											}
										}
									}
								}
							} else {
								local506 = Static14.aByteArrayArrayArray3[local153][local170][local176] + 1;
								@Pc(1246) byte local1246 = Static121.aByteArrayArrayArray7[local153][local170][local176];
								@Pc(1252) Class127 local1252 = Static7.method121(local183 - 1);
								@Pc(1291) int local1291;
								@Pc(1339) int local1339;
								@Pc(1278) int local1278;
								if (Static116.aBoolean184 && !arg1 && Static170.anIntArrayArray23 != null && local153 == 0) {
									if (local1252.anInt4280 != -1 && Static48.method888(Static1.anInterface3_1.method4135(local1252.anInt4280))) {
										Static170.anIntArrayArray23[local170][local176] = local1252.anInt4282 + (local1252.anInt4274 << 24);
									} else {
										label738: for (local1278 = local170 - 1; local1278 <= local170 + 1; local1278++) {
											for (local1291 = local176 - 1; local1291 <= local176 + 1; local1291++) {
												if ((local1278 != local170 || local1291 != local176) && local1278 >= 0 && local1278 < 104 && local1291 >= 0 && local1291 < 104) {
													local1339 = Static83.aByteArrayArrayArray6[local153][local1278][local1291] & 0xFF;
													if (local1339 != 0) {
														@Pc(1354) Class127 local1354 = Static7.method121(local1339 - 1);
														if (local1354.anInt4280 != -1 && Static48.method888(Static1.anInterface3_1.method4135(local1354.anInt4280))) {
															Static170.anIntArrayArray23[local170][local176] = local1354.anInt4282 + (local1354.anInt4274 << 24);
															break label738;
														}
													}
												}
											}
										}
									}
								}
								local1278 = local1252.anInt4280;
								if (local1278 >= 0 && !Static1.anInterface3_1.method4141(local1278)) {
									local1278 = -1;
								}
								@Pc(1479) int local1479;
								@Pc(1450) int local1450;
								if (local1278 >= 0) {
									local1339 = Static1.anIntArray2[Static43.method816(Static1.anInterface3_1.method4132(local1278), 96)];
									local1291 = -1;
								} else if (local1252.anInt4281 == -1) {
									local1291 = -2;
									local1339 = 0;
								} else {
									local1291 = local1252.anInt4281;
									local1450 = local16 + (local1291 & 0x7F);
									if (local1450 < 0) {
										local1450 = 0;
									} else if (local1450 > 127) {
										local1450 = 127;
									}
									local1479 = local1450 + (local9 + local1291 & 0xFC00) + (local1291 & 0x380);
									local1339 = Static1.anIntArray2[Static43.method816(local1479, 96)];
								}
								if (local1252.anInt4275 >= 0) {
									local1450 = local1252.anInt4275;
									local1479 = (local1450 & 0x7F) + local16;
									if (local1479 < 0) {
										local1479 = 0;
									} else if (local1479 > 127) {
										local1479 = 127;
									}
									@Pc(1537) int local1537 = (local1450 & 0x380) + (local1450 + local9 & 0xFC00) + local1479;
									local1339 = Static1.anIntArray2[Static43.method816(local1537, 96)];
								}
								Static268.method4230(local153, local170, local176, local506, local1246, local1278, local324, local211, local231, local244, Static74.method1402(local308, local250), Static74.method1402(local302, local250), Static74.method1402(local452, local250), Static74.method1402(local512, local250), Static43.method816(local1291, local308), Static43.method816(local1291, local302), Static43.method816(local1291, local452), Static43.method816(local1291, local512), local254, local1339);
								if (Static116.aBoolean184 && local153 > 0) {
									Static266.method4180(local506, local1246, local1291 == -2 || !local1252.aBoolean288, local250 == -1 || !Static173.method3143(local178 - 1).aBoolean363, local170, local176, local324 - Static9.anIntArrayArrayArray7[0][local170][local176], local211 - Static9.anIntArrayArrayArray7[0][local170 + 1][local176], local231 - Static9.anIntArrayArrayArray7[0][local170 + 1][local176 + 1], -Static9.anIntArrayArrayArray7[0][local170][local176 + 1] + local244);
								}
							}
						}
					}
				}
			}
			if (Static116.aBoolean184) {
				@Pc(1921) float[][] local1921 = new float[105][105];
				@Pc(1925) float[][] local1925 = new float[105][105];
				@Pc(1929) float[][] local1929 = new float[105][105];
				@Pc(1933) int[][] local1933 = Static9.anIntArrayArrayArray7[local153];
				local324 = 1;
				while (true) {
					if (local324 > 103) {
						@Pc(2054) Class2_Sub32[] local2054;
						if (arg1) {
							local2054 = Static106.method1818(local153, local1925, Static14.aByteArrayArrayArray3[local153], local1929, Static9.anIntArrayArrayArray7[local153], Static121.aByteArrayArrayArray7[local153], Static10.aByteArrayArrayArray1[local153], Static13.aByteArrayArrayArray2, Static170.anIntArrayArray23, local145, local133, local1921, Static83.aByteArrayArrayArray6[local153], Static300.anIntArrayArrayArray15[0], arg0);
							Static37.method705(local153, local2054);
							break;
						}
						local2054 = Static106.method1818(local153, local1925, Static14.aByteArrayArrayArray3[local153], local1929, Static9.anIntArrayArrayArray7[local153], Static121.aByteArrayArrayArray7[local153], Static10.aByteArrayArrayArray1[local153], Static13.aByteArrayArrayArray2, null, local145, local133, local1921, Static83.aByteArrayArrayArray6[local153], null, arg0);
						@Pc(2112) Class2_Sub32[] local2112 = Static39.method732(local145, Static83.aByteArrayArrayArray6[local153], local1925, local1929, Static121.aByteArrayArrayArray7[local153], Static9.anIntArrayArrayArray7[local153], Static14.aByteArrayArrayArray3[local153], Static10.aByteArrayArrayArray1[local153], Static13.aByteArrayArrayArray2, local153, local1921);
						@Pc(2120) Class2_Sub32[] local2120 = new Class2_Sub32[local2054.length + local2112.length];
						for (local244 = 0; local244 < local2054.length; local244++) {
							local2120[local244] = local2054[local244];
						}
						for (local244 = 0; local244 < local2112.length; local244++) {
							local2120[local244 + local2054.length] = local2112[local244];
						}
						Static37.method705(local153, local2120);
						Static90.method1603(Static83.aByteArrayArrayArray6[local153], Static121.aByteArrayArrayArray7[local153], Static14.aByteArrayArrayArray3[local153], local1929, Static212.aClass156Array1, Static212.anInt4342, local153, Static10.aByteArrayArrayArray1[local153], local1925, local1921, Static9.anIntArrayArrayArray7[local153]);
						break;
					}
					for (local211 = 1; local211 <= 103; local211++) {
						local244 = local1933[local211][local324 + 1] - local1933[local211][local324 - 1];
						local231 = local1933[local211 + 1][local324] - local1933[local211 - 1][local324];
						@Pc(1990) float local1990 = (float) Math.sqrt((double) (local231 * local231 + local244 * local244 + 65536));
						local1929[local211][local324] = (float) local231 / local1990;
						local1925[local211][local324] = -256.0F / local1990;
						local1921[local211][local324] = (float) local244 / local1990;
					}
					local324++;
				}
			}
			Static10.aByteArrayArrayArray1[local153] = null;
			Static83.aByteArrayArrayArray6[local153] = null;
			Static14.aByteArrayArrayArray3[local153] = null;
			Static121.aByteArrayArrayArray7[local153] = null;
			Static209.aByteArrayArrayArray18[local153] = null;
		}
		Static281.method4397();
		if (arg1) {
			return;
		}
		@Pc(2224) int local2224;
		for (local153 = 0; local153 < 104; local153++) {
			for (local2224 = 0; local2224 < 104; local2224++) {
				if ((Static13.aByteArrayArrayArray2[1][local153][local2224] & 0x2) == 2) {
					Static92.method1630(local153, local2224);
				}
			}
		}
		for (local153 = 0; local153 < 4; local153++) {
			for (local2224 = 0; local2224 <= 104; local2224++) {
				for (local170 = 0; local170 <= 104; local170++) {
					if ((Static228.anIntArrayArrayArray14[local153][local170][local2224] & 0x1) != 0) {
						for (local176 = local2224; local176 > 0 && (Static228.anIntArrayArrayArray14[local153][local170][local176 - 1] & 0x1) != 0; local176--) {
						}
						local183 = local153;
						for (local178 = local2224; local178 < 104 && (Static228.anIntArrayArrayArray14[local153][local170][local178 + 1] & 0x1) != 0; local178++) {
						}
						local324 = local153;
						label453: while (local183 > 0) {
							for (local211 = local176; local211 <= local178; local211++) {
								if ((Static228.anIntArrayArrayArray14[local183 - 1][local170][local211] & 0x1) == 0) {
									break label453;
								}
							}
							local183--;
						}
						label442: while (local324 < 3) {
							for (local211 = local176; local211 <= local178; local211++) {
								if ((Static228.anIntArrayArrayArray14[local324 + 1][local170][local211] & 0x1) == 0) {
									break label442;
								}
							}
							local324++;
						}
						local211 = (local324 + 1 - local183) * (-local176 + 1 + local178);
						if (local211 >= 8) {
							local244 = Static9.anIntArrayArrayArray7[local324][local170][local176] - 240;
							local250 = Static9.anIntArrayArrayArray7[local183][local170][local176];
							Static307.method4643(1, local170 * 128, local170 * 128, local176 * 128, local178 * 128 + 128, local244, local250);
							for (local254 = local183; local254 <= local324; local254++) {
								for (local308 = local176; local308 <= local178; local308++) {
									Static228.anIntArrayArrayArray14[local254][local170][local308] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((Static228.anIntArrayArrayArray14[local153][local170][local2224] & 0x2) != 0) {
						local176 = local170;
						local178 = local170;
						while (local176 > 0 && (Static228.anIntArrayArrayArray14[local153][local176 - 1][local2224] & 0x2) != 0) {
							local176--;
						}
						local324 = local153;
						while (local178 < 104 && (Static228.anIntArrayArrayArray14[local153][local178 + 1][local2224] & 0x2) != 0) {
							local178++;
						}
						label508: for (local183 = local153; local183 > 0; local183--) {
							for (local211 = local176; local211 <= local178; local211++) {
								if ((Static228.anIntArrayArrayArray14[local183 - 1][local211][local2224] & 0x2) == 0) {
									break label508;
								}
							}
						}
						label497: while (local324 < 3) {
							for (local211 = local176; local211 <= local178; local211++) {
								if ((Static228.anIntArrayArrayArray14[local324 + 1][local211][local2224] & 0x2) == 0) {
									break label497;
								}
							}
							local324++;
						}
						local211 = (local324 + 1 - local183) * (-local176 + (local178 - -1));
						if (local211 >= 8) {
							local244 = Static9.anIntArrayArrayArray7[local324][local176][local2224] - 240;
							local250 = Static9.anIntArrayArrayArray7[local183][local176][local2224];
							Static307.method4643(2, local176 * 128, local178 * 128 + 128, local2224 * 128, local2224 * 128, local244, local250);
							for (local254 = local183; local254 <= local324; local254++) {
								for (local308 = local176; local308 <= local178; local308++) {
									Static228.anIntArrayArrayArray14[local254][local308][local2224] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((Static228.anIntArrayArrayArray14[local153][local170][local2224] & 0x4) != 0) {
						local178 = local170;
						local176 = local170;
						for (local183 = local2224; local183 > 0 && (Static228.anIntArrayArrayArray14[local153][local170][local183 - 1] & 0x4) != 0; local183--) {
						}
						for (local324 = local2224; local324 < 104 && (Static228.anIntArrayArrayArray14[local153][local170][local324 + 1] & 0x4) != 0; local324++) {
						}
						label563: while (local176 > 0) {
							for (local211 = local183; local211 <= local324; local211++) {
								if ((Static228.anIntArrayArrayArray14[local153][local176 - 1][local211] & 0x4) == 0) {
									break label563;
								}
							}
							local176--;
						}
						label552: while (local178 < 104) {
							for (local211 = local183; local211 <= local324; local211++) {
								if ((Static228.anIntArrayArrayArray14[local153][local178 + 1][local211] & 0x4) == 0) {
									break label552;
								}
							}
							local178++;
						}
						if ((local324 + 1 - local183) * (-local176 + 1 + local178) >= 4) {
							local211 = Static9.anIntArrayArrayArray7[local153][local176][local183];
							Static307.method4643(4, local176 * 128, local178 * 128 + 128, local183 * 128, local324 * 128 + 128, local211, local211);
							for (local231 = local176; local231 <= local178; local231++) {
								for (local244 = local183; local244 <= local324; local244++) {
									Static228.anIntArrayArrayArray14[local153][local231][local244] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIB[[II)I")
	public static int method2318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[][] arg3, @OriginalArg(5) int arg4) {
		@Pc(30) int local30 = arg3[arg0 + 1][arg2] * arg1 + arg3[arg0][arg2] * (128 - arg1) >> 7;
		@Pc(57) int local57 = arg1 * arg3[arg0 + 1][arg2 + 1] + arg3[arg0][arg2 + 1] * (128 - arg1) >> 7;
		return arg4 * local57 + local30 * (128 - arg4) >> 7;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Z)V")
	public static void method2319(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		Static242.aString165 = arg2;
		Static303.anInt5848 = arg1;
		Static67.aString59 = arg0;
		if (Static242.aString165.equals("") || Static67.aString59.equals("")) {
			Static93.anInt2262 = 3;
		} else if (Static74.anInt1836 == -1) {
			Static21.anInt457 = 0;
			Static293.anInt5704 = 0;
			Static137.anInt3071 = 1;
			Static93.anInt2262 = -3;
			@Pc(52) Class2_Sub16 local52 = new Class2_Sub16(128);
			local52.method2168(10);
			local52.method2186((int) (Math.random() * 9.9999999E7D));
			local52.method2144(Static228.method3719(Static242.aString165));
			local52.method2186((int) (Math.random() * 9.9999999E7D));
			local52.method2153(Static67.aString59);
			local52.method2186((int) (Math.random() * 9.9999999E7D));
			local52.method2136(Static119.aBigInteger5, Static210.aBigInteger4);
			Static211.aClass2_Sub16_Sub1_2.anInt2789 = 0;
			Static211.aClass2_Sub16_Sub1_2.method2168(24);
			Static211.aClass2_Sub16_Sub1_2.method2168(local52.anInt2789 + 2);
			Static211.aClass2_Sub16_Sub1_2.method2143(553);
			Static211.aClass2_Sub16_Sub1_2.method2178(local52.aByteArray17, local52.anInt2789);
		} else {
			Static199.method3564();
		}
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(B)V")
	public static void method2321() {
		Static184.aClass44_20 = new Class44();
	}
}
