import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!t", name = "M", descriptor = "Lclient!cg;")
	public static Class22 aClass22_86;

	@OriginalMember(owner = "client!t", name = "R", descriptor = "Lclient!cg;")
	public static Class22 aClass22_87;

	@OriginalMember(owner = "client!t", name = "T", descriptor = "I")
	public static int anInt5021;

	@OriginalMember(owner = "client!t", name = "U", descriptor = "[I")
	public static int[] anIntArray393;

	@OriginalMember(owner = "client!t", name = "I", descriptor = "Ljava/lang/String;")
	public static String aString170 = "";

	@OriginalMember(owner = "client!t", name = "S", descriptor = "Lclient!no;")
	public static Class4_Sub24_Sub1 aClass4_Sub24_Sub1_3 = new Class4_Sub24_Sub1(5000);

	@OriginalMember(owner = "client!t", name = "V", descriptor = "[S")
	public static short[] aShortArray81 = new short[500];

	@OriginalMember(owner = "client!t", name = "a", descriptor = "([[[IZI[Lclient!ao;)V")
	public static void method3966(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class12[] arg2) {
		@Pc(15) byte local15;
		if (arg1) {
			local15 = 1;
		} else {
			local15 = 4;
		}
		@Pc(24) int local24;
		@Pc(31) int local31;
		if (!arg1) {
			for (local24 = 0; local24 < 4; local24++) {
				for (local31 = 0; local31 < 104; local31++) {
					for (@Pc(36) int local36 = 0; local36 < 104; local36++) {
						if ((Static27.aByteArrayArrayArray2[local24][local31][local36] & 0x1) == 1) {
							@Pc(56) int local56 = local24;
							if ((Static27.aByteArrayArrayArray2[1][local31][local36] & 0x2) == 2) {
								local56 = local24 - 1;
							}
							if (local56 >= 0) {
								arg2[local56].method271(local31, local36);
							}
						}
					}
				}
			}
			Static97.anInt4593 += (int) (Math.random() * 5.0D) - 2;
			Static205.anInt4048 += (int) (Math.random() * 5.0D) - 2;
			if (Static97.anInt4593 < -8) {
				Static97.anInt4593 = -8;
			}
			if (Static97.anInt4593 > 8) {
				Static97.anInt4593 = 8;
			}
			if (Static205.anInt4048 < -16) {
				Static205.anInt4048 = -16;
			}
			if (Static205.anInt4048 > 16) {
				Static205.anInt4048 = 16;
			}
		}
		local24 = Static97.anInt4593 >> 2 << 10;
		local31 = Static205.anInt4048 >> 1;
		@Pc(148) int[][] local148 = new int[104][104];
		@Pc(152) int[][] local152 = new int[104][104];
		@Pc(154) int local154;
		@Pc(171) int local171;
		@Pc(176) int local176;
		@Pc(261) int local261;
		@Pc(228) int local228;
		@Pc(282) int local282;
		@Pc(284) int local284;
		@Pc(289) int local289;
		@Pc(430) int local430;
		@Pc(315) int local315;
		@Pc(336) int local336;
		@Pc(350) int local350;
		for (local154 = 0; local154 < local15; local154++) {
			@Pc(165) byte[][] local165 = Static22.aByteArrayArrayArray1[local154];
			@Pc(356) int local356;
			@Pc(360) int local360;
			@Pc(414) int local414;
			@Pc(408) int local408;
			if (!Static251.aBoolean330) {
				local171 = (int) Math.sqrt(5100.0D);
				local176 = local171 * 768 >> 8;
				for (local261 = 1; local261 < 103; local261++) {
					for (local228 = 1; local228 < 103; local228++) {
						local284 = Static154.anIntArrayArrayArray5[local154][local228 + 1][local261] - Static154.anIntArrayArrayArray5[local154][local228 - 1][local261];
						local289 = Static154.anIntArrayArrayArray5[local154][local228][local261 + 1] - Static154.anIntArrayArrayArray5[local154][local228][local261 - 1];
						local430 = (int) Math.sqrt((double) (local289 * local289 + local284 * local284 + 65536));
						local350 = (local289 << 8) / local430;
						local356 = (local165[local228][local261] >> 1) + (local165[local228][local261 + 1] >> 3) + (local165[local228 + -1][local261] >> 2) + (local165[local228 + 1][local261] >> 3) + (local165[local228][local261 + -1] >> 2);
						local336 = -65536 / local430;
						local315 = (local284 << 8) / local430;
						local282 = (local350 * -50 + local336 * -10 + local315 * -50) / local176 + 74;
						local152[local228][local261] = local282 - local356;
					}
				}
			} else if (Static253.aBoolean335) {
				for (local171 = 1; local171 < 103; local171++) {
					for (local176 = 1; local176 < 103; local176++) {
						local228 = (local165[local176][local171] >> 1) + ((local165[local176][local171 + 1] >> 3) + (local165[local176 - 1][local171] >> 2) + (local165[local176 - -1][local171] >> 3) + (local165[local176][local171 + -1] >> 2));
						local152[local176][local171] = 74 - local228;
					}
				}
			} else {
				local176 = (int) Static290.aFloatArray25[1];
				local171 = (int) Static290.aFloatArray25[0];
				local261 = (int) Static290.aFloatArray25[2];
				local228 = (int) Math.sqrt((double) (local261 * local261 + local176 * local176 + local171 * local171));
				local282 = local228 * 1024 >> 8;
				for (local284 = 1; local284 < 103; local284++) {
					for (local289 = 1; local289 < 103; local289++) {
						local315 = Static154.anIntArrayArrayArray5[local154][local289 + 1][local284] - Static154.anIntArrayArrayArray5[local154][local289 - 1][local284];
						local336 = Static154.anIntArrayArrayArray5[local154][local289][local284 + 1] - Static154.anIntArrayArrayArray5[local154][local289][local284 - 1];
						local350 = (int) Math.sqrt((double) (local315 * local315 + local336 * local336 + 65536));
						local356 = (local315 << 8) / local350;
						local360 = -65536 / local350;
						local408 = (local165[local289][local284] >> 1) + (local165[local289][local284 + 1] >> 3) + (local165[local289 + -1][local284] >> 2) + (local165[local289 - -1][local284] >> 3) + (local165[local289][local284 + -1] >> 2);
						local414 = (local336 << 8) / local350;
						local430 = (local261 * local414 + local356 * local171 + local176 * local360) / local282 + 96;
						local152[local289][local284] = local430 - (int) ((float) local408 * 1.7F);
					}
				}
			}
			for (local171 = 0; local171 < 104; local171++) {
				Static170.anIntArray283[local171] = 0;
				Static71.anIntArray138[local171] = 0;
				Static199.anIntArray243[local171] = 0;
				Static184.anIntArray306[local171] = 0;
				Static279.anIntArray435[local171] = 0;
			}
			for (local171 = -5; local171 < 104; local171++) {
				for (local176 = 0; local176 < 104; local176++) {
					local261 = local171 + 5;
					@Pc(726) int local726;
					if (local261 < 104) {
						local228 = Static121.aByteArrayArrayArray8[local154][local261][local176] & 0xFF;
						if (local228 > 0) {
							@Pc(690) Class118 local690 = Static151.method2396(local228 - 1);
							Static170.anIntArray283[local176] += local690.anInt3677;
							Static71.anIntArray138[local176] += local690.anInt3684;
							Static199.anIntArray243[local176] += local690.anInt3672;
							Static184.anIntArray306[local176] += local690.anInt3678;
							local726 = Static279.anIntArray435[local176]++;
						}
					}
					local228 = local171 - 5;
					if (local228 >= 0) {
						local282 = Static121.aByteArrayArrayArray8[local154][local228][local176] & 0xFF;
						if (local282 > 0) {
							@Pc(759) Class118 local759 = Static151.method2396(local282 - 1);
							Static170.anIntArray283[local176] -= local759.anInt3677;
							Static71.anIntArray138[local176] -= local759.anInt3684;
							Static199.anIntArray243[local176] -= local759.anInt3672;
							Static184.anIntArray306[local176] -= local759.anInt3678;
							local726 = Static279.anIntArray435[local176]--;
						}
					}
				}
				if (local171 >= 0) {
					local261 = 0;
					local176 = 0;
					local228 = 0;
					local282 = 0;
					local284 = 0;
					for (local289 = -5; local289 < 104; local289++) {
						local430 = local289 + 5;
						local315 = local289 - 5;
						if (local430 < 104) {
							local282 += Static184.anIntArray306[local430];
							local261 += Static71.anIntArray138[local430];
							local176 += Static170.anIntArray283[local430];
							local228 += Static199.anIntArray243[local430];
							local284 += Static279.anIntArray435[local430];
						}
						if (local315 >= 0) {
							local282 -= Static184.anIntArray306[local315];
							local176 -= Static170.anIntArray283[local315];
							local284 -= Static279.anIntArray435[local315];
							local261 -= Static71.anIntArray138[local315];
							local228 -= Static199.anIntArray243[local315];
						}
						if (local289 >= 0 && local284 > 0) {
							local148[local171][local289] = Static208.method3283(local228 / local284, local176 * 256 / local282, local261 / local284);
						}
					}
				}
			}
			for (local171 = 1; local171 < 103; local171++) {
				label777: for (local176 = 1; local176 < 103; local176++) {
					if (arg1 || Static162.method2605() || (Static27.aByteArrayArrayArray2[0][local171][local176] & 0x2) != 0 || (Static27.aByteArrayArrayArray2[local154][local171][local176] & 0x10) == 0 && Static253.method3902(local176, local154, local171) == Static60.anInt1347) {
						if (Static55.anInt1243 > local154) {
							Static55.anInt1243 = local154;
						}
						local261 = Static121.aByteArrayArrayArray8[local154][local171][local176] & 0xFF;
						local228 = Static241.aByteArrayArrayArray13[local154][local171][local176] & 0xFF;
						if (local261 > 0 || local228 > 0) {
							local282 = Static154.anIntArrayArrayArray5[local154][local171][local176];
							local289 = Static154.anIntArrayArrayArray5[local154][local171 + 1][local176 + 1];
							local284 = Static154.anIntArrayArrayArray5[local154][local171 + 1][local176];
							local430 = Static154.anIntArrayArrayArray5[local154][local171][local176 + 1];
							if (local154 > 0) {
								@Pc(1062) boolean local1062 = true;
								if (local261 == 0 && Static32.aByteArrayArrayArray3[local154][local171][local176] != 0) {
									local1062 = false;
								}
								if (local228 > 0 && !Static1.method5(local228 - 1).aBoolean69) {
									local1062 = false;
								}
								if (local1062 && local282 == local284 && local282 == local289 && local282 == local430) {
									Static8.anIntArrayArrayArray1[local154][local171][local176] |= 0x4;
								}
							}
							if (local261 <= 0) {
								local336 = 0;
								local315 = -1;
							} else {
								local315 = local148[local171][local176];
								local350 = local31 + (local315 & 0x7F);
								if (local350 < 0) {
									local350 = 0;
								} else if (local350 > 127) {
									local350 = 127;
								}
								local356 = (local315 & 0x380) + (local315 + local24 & 0xFC00) + local350;
								local336 = Static283.anIntArray441[Static51.method987(local356, 96)];
							}
							local350 = local152[local171][local176];
							local356 = local152[local171 + 1][local176];
							local414 = local152[local171][local176 + 1];
							local360 = local152[local171 + 1][local176 + 1];
							if (local228 == 0) {
								Static103.method1692(local154, local171, local176, 0, 0, -1, local282, local284, local289, local430, Static51.method987(local315, local350), Static51.method987(local315, local356), Static51.method987(local315, local360), Static51.method987(local315, local414), 0, 0, 0, 0, local336, 0);
								if (Static251.aBoolean330 && local154 > 0 && local315 != -1 && Static151.method2396(local261 - 1).aBoolean237) {
									Static249.method3810(0, 0, true, false, local171, local176, local282 - Static154.anIntArrayArrayArray5[0][local171][local176], -Static154.anIntArrayArrayArray5[0][local171 + 1][local176] + local284, local289 - Static154.anIntArrayArrayArray5[0][local171 + 1][local176 + 1], -Static154.anIntArrayArrayArray5[0][local171][local176 + 1] + local430);
								}
								if (Static251.aBoolean330 && !arg1 && Static149.anIntArrayArray17 != null && local154 == 0) {
									for (local408 = local171 - 1; local408 <= local171 + 1; local408++) {
										for (@Pc(1352) int local1352 = local176 - 1; local1352 <= local176 + 1; local1352++) {
											if ((local171 != local408 || local176 != local1352) && local408 >= 0 && local408 < 104 && local1352 >= 0 && local1352 < 104) {
												@Pc(1399) int local1399 = Static241.aByteArrayArrayArray13[local154][local408][local1352] & 0xFF;
												if (local1399 != 0) {
													@Pc(1410) Class34 local1410 = Static1.method5(local1399 - 1);
													if (local1410.anInt1198 != -1 && Static16.method285(Static283.anInterface1_1.method2427(local1410.anInt1198))) {
														Static149.anIntArrayArray17[local171][local176] = local1410.anInt1197 + (local1410.anInt1200 << 24);
														continue label777;
													}
												}
											}
										}
									}
								}
							} else {
								@Pc(1455) byte local1455 = Static66.aByteArrayArrayArray15[local154][local171][local176];
								local408 = Static32.aByteArrayArrayArray3[local154][local171][local176] + 1;
								@Pc(1471) Class34 local1471 = Static1.method5(local228 - 1);
								@Pc(1499) int local1499;
								@Pc(1512) int local1512;
								@Pc(1559) int local1559;
								if (Static251.aBoolean330 && !arg1 && Static149.anIntArrayArray17 != null && local154 == 0) {
									if (local1471.anInt1198 != -1 && Static16.method285(Static283.anInterface1_1.method2427(local1471.anInt1198))) {
										Static149.anIntArrayArray17[local171][local176] = (local1471.anInt1200 << 24) + local1471.anInt1197;
									} else {
										label758: for (local1499 = local171 - 1; local1499 <= local171 + 1; local1499++) {
											for (local1512 = local176 - 1; local1512 <= local176 + 1; local1512++) {
												if ((local171 != local1499 || local176 != local1512) && local1499 >= 0 && local1499 < 104 && local1512 >= 0 && local1512 < 104) {
													local1559 = Static241.aByteArrayArrayArray13[local154][local1499][local1512] & 0xFF;
													if (local1559 != 0) {
														@Pc(1572) Class34 local1572 = Static1.method5(local1559 - 1);
														if (local1572.anInt1198 != -1 && Static16.method285(Static283.anInterface1_1.method2427(local1572.anInt1198))) {
															Static149.anIntArrayArray17[local171][local176] = local1572.anInt1197 + (local1572.anInt1200 << 24);
															break label758;
														}
													}
												}
											}
										}
									}
								}
								local1499 = local1471.anInt1198;
								if (local1499 >= 0 && !Static283.anInterface1_1.method2433(local1499)) {
									local1499 = -1;
								}
								@Pc(1699) int local1699;
								@Pc(1671) int local1671;
								if (local1499 >= 0) {
									local1559 = Static283.anIntArray441[Static269.method4236(96, Static283.anInterface1_1.method2431(local1499))];
									local1512 = -1;
								} else if (local1471.anInt1194 == -1) {
									local1512 = -2;
									local1559 = 0;
								} else {
									local1512 = local1471.anInt1194;
									local1671 = local31 + (local1512 & 0x7F);
									if (local1671 < 0) {
										local1671 = 0;
									} else if (local1671 > 127) {
										local1671 = 127;
									}
									local1699 = (local1512 & 0x380) + (local1512 + local24 & 0xFC00) + local1671;
									local1559 = Static283.anIntArray441[Static269.method4236(96, local1699)];
								}
								if (local1471.anInt1202 >= 0) {
									local1671 = local1471.anInt1202;
									local1699 = (local1671 & 0x7F) + local31;
									if (local1699 < 0) {
										local1699 = 0;
									} else if (local1699 > 127) {
										local1699 = 127;
									}
									@Pc(1749) int local1749 = (local1671 + local24 & 0xFC00) - (-(local1671 & 0x380) - local1699);
									local1559 = Static283.anIntArray441[Static269.method4236(96, local1749)];
								}
								Static103.method1692(local154, local171, local176, local408, local1455, local1499, local282, local284, local289, local430, Static51.method987(local315, local350), Static51.method987(local315, local356), Static51.method987(local315, local360), Static51.method987(local315, local414), Static269.method4236(local350, local1512), Static269.method4236(local356, local1512), Static269.method4236(local360, local1512), Static269.method4236(local414, local1512), local336, local1559);
								if (Static251.aBoolean330 && local154 > 0) {
									Static249.method3810(local408, local1455, local1512 == -2 || !local1471.aBoolean67, local315 == -1 || !Static151.method2396(local261 - 1).aBoolean237, local171, local176, local282 - Static154.anIntArrayArrayArray5[0][local171][local176], -Static154.anIntArrayArrayArray5[0][local171 + 1][local176] + local284, local289 - Static154.anIntArrayArrayArray5[0][local171 + 1][local176 + 1], -Static154.anIntArrayArrayArray5[0][local171][local176 + 1] + local430);
								}
							}
						}
					}
				}
			}
			if (Static251.aBoolean330) {
				@Pc(1898) float[][] local1898 = new float[105][105];
				@Pc(1902) float[][] local1902 = new float[105][105];
				@Pc(1906) float[][] local1906 = new float[105][105];
				@Pc(1910) int[][] local1910 = Static154.anIntArrayArrayArray5[local154];
				local282 = 1;
				while (true) {
					if (local282 > 103) {
						@Pc(2034) Class4_Sub8[] local2034;
						if (arg1) {
							local2034 = Static63.method1166(arg0, Static32.aByteArrayArrayArray3[local154], Static241.aByteArrayArrayArray13[local154], local154, Static66.aByteArrayArrayArray15[local154], Static230.anIntArrayArrayArray12[0], local1902, Static27.aByteArrayArrayArray2, local152, local148, local1898, Static149.anIntArrayArray17, local1906, Static154.anIntArrayArrayArray5[local154], Static121.aByteArrayArrayArray8[local154]);
							Static228.method3588(local154, local2034);
							break;
						}
						local2034 = Static63.method1166(arg0, Static32.aByteArrayArrayArray3[local154], Static241.aByteArrayArrayArray13[local154], local154, Static66.aByteArrayArrayArray15[local154], null, local1902, Static27.aByteArrayArrayArray2, local152, local148, local1898, null, local1906, Static154.anIntArrayArrayArray5[local154], Static121.aByteArrayArrayArray8[local154]);
						@Pc(2058) Class4_Sub8[] local2058 = Static264.method4175(Static32.aByteArrayArrayArray3[local154], local152, local154, local1898, Static154.anIntArrayArrayArray5[local154], Static66.aByteArrayArrayArray15[local154], Static121.aByteArrayArrayArray8[local154], local1906, Static27.aByteArrayArrayArray2, local1902, Static241.aByteArrayArrayArray13[local154]);
						@Pc(2065) Class4_Sub8[] local2065 = new Class4_Sub8[local2058.length + local2034.length];
						for (local430 = 0; local430 < local2034.length; local430++) {
							local2065[local430] = local2034[local430];
						}
						for (local430 = 0; local430 < local2058.length; local430++) {
							local2065[local430 + local2034.length] = local2058[local430];
						}
						Static228.method3588(local154, local2065);
						Static192.method778(Static142.aClass137Array1, local1906, Static241.aByteArrayArrayArray13[local154], local1898, local1902, Static32.aByteArrayArrayArray3[local154], Static142.anInt2825, Static66.aByteArrayArrayArray15[local154], Static121.aByteArrayArrayArray8[local154], local154, Static154.anIntArrayArrayArray5[local154]);
						break;
					}
					for (local284 = 1; local284 <= 103; local284++) {
						local289 = local1910[local284 + 1][local282] - local1910[local284 - 1][local282];
						local430 = local1910[local284][local282 + 1] - local1910[local284][local282 - 1];
						@Pc(1970) float local1970 = (float) Math.sqrt((double) (local289 * local289 + local430 * local430 + 65536));
						local1898[local284][local282] = (float) local289 / local1970;
						local1906[local284][local282] = -256.0F / local1970;
						local1902[local284][local282] = (float) local430 / local1970;
					}
					local282++;
				}
			}
			Static121.aByteArrayArrayArray8[local154] = null;
			Static241.aByteArrayArrayArray13[local154] = null;
			Static32.aByteArrayArrayArray3[local154] = null;
			Static66.aByteArrayArrayArray15[local154] = null;
			Static22.aByteArrayArrayArray1[local154] = null;
		}
		Static222.method3492();
		if (arg1) {
			return;
		}
		@Pc(2205) int local2205;
		for (local154 = 0; local154 < 104; local154++) {
			for (local2205 = 0; local2205 < 104; local2205++) {
				if ((Static27.aByteArrayArrayArray2[1][local154][local2205] & 0x2) == 2) {
					Static103.method1693(local154, local2205);
				}
			}
		}
		for (local154 = 0; local154 < 4; local154++) {
			for (local2205 = 0; local2205 <= 104; local2205++) {
				for (local171 = 0; local171 <= 104; local171++) {
					if ((Static8.anIntArrayArrayArray1[local154][local171][local2205] & 0x1) != 0) {
						for (local176 = local2205; local176 > 0 && (Static8.anIntArrayArrayArray1[local154][local171][local176 - 1] & 0x1) != 0; local176--) {
						}
						for (local261 = local2205; local261 < 104 && (Static8.anIntArrayArrayArray1[local154][local171][local261 + 1] & 0x1) != 0; local261++) {
						}
						local282 = local154;
						label459: for (local228 = local154; local228 > 0; local228--) {
							for (local284 = local176; local284 <= local261; local284++) {
								if ((Static8.anIntArrayArrayArray1[local228 - 1][local171][local284] & 0x1) == 0) {
									break label459;
								}
							}
						}
						label448: while (local282 < 3) {
							for (local284 = local176; local284 <= local261; local284++) {
								if ((Static8.anIntArrayArrayArray1[local282 + 1][local171][local284] & 0x1) == 0) {
									break label448;
								}
							}
							local282++;
						}
						local284 = (local261 + 1 - local176) * (-local228 + local282 + 1);
						if (local284 >= 8) {
							local430 = Static154.anIntArrayArrayArray5[local282][local171][local176] - 240;
							local315 = Static154.anIntArrayArrayArray5[local228][local171][local176];
							Static224.method3526(1, local171 * 128, local171 * 128, local176 * 128, local261 * 128 + 128, local430, local315);
							for (local336 = local228; local336 <= local282; local336++) {
								for (local350 = local176; local350 <= local261; local350++) {
									Static8.anIntArrayArrayArray1[local336][local171][local350] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((Static8.anIntArrayArrayArray1[local154][local171][local2205] & 0x2) != 0) {
						for (local176 = local171; local176 > 0 && (Static8.anIntArrayArrayArray1[local154][local176 - 1][local2205] & 0x2) != 0; local176--) {
						}
						for (local261 = local171; local261 < 104 && (Static8.anIntArrayArrayArray1[local154][local261 + 1][local2205] & 0x2) != 0; local261++) {
						}
						local228 = local154;
						local282 = local154;
						label514: while (local228 > 0) {
							for (local284 = local176; local284 <= local261; local284++) {
								if ((Static8.anIntArrayArrayArray1[local228 - 1][local284][local2205] & 0x2) == 0) {
									break label514;
								}
							}
							local228--;
						}
						label503: while (local282 < 3) {
							for (local284 = local176; local284 <= local261; local284++) {
								if ((Static8.anIntArrayArrayArray1[local282 + 1][local284][local2205] & 0x2) == 0) {
									break label503;
								}
							}
							local282++;
						}
						local284 = (local261 + 1 - local176) * (local282 - (local228 + -1));
						if (local284 >= 8) {
							local315 = Static154.anIntArrayArrayArray5[local228][local176][local2205];
							local430 = Static154.anIntArrayArrayArray5[local282][local176][local2205] - 240;
							Static224.method3526(2, local176 * 128, local261 * 128 + 128, local2205 * 128, local2205 * 128, local430, local315);
							for (local336 = local228; local336 <= local282; local336++) {
								for (local350 = local176; local350 <= local261; local350++) {
									Static8.anIntArrayArrayArray1[local336][local350][local2205] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((Static8.anIntArrayArrayArray1[local154][local171][local2205] & 0x4) != 0) {
						local176 = local171;
						local261 = local171;
						local228 = local2205;
						local282 = local2205;
						while (local228 > 0 && (Static8.anIntArrayArrayArray1[local154][local171][local228 - 1] & 0x4) != 0) {
							local228--;
						}
						while (local282 < 104 && (Static8.anIntArrayArrayArray1[local154][local171][local282 + 1] & 0x4) != 0) {
							local282++;
						}
						label569: while (local176 > 0) {
							for (local284 = local228; local284 <= local282; local284++) {
								if ((Static8.anIntArrayArrayArray1[local154][local176 - 1][local284] & 0x4) == 0) {
									break label569;
								}
							}
							local176--;
						}
						label558: while (local261 < 104) {
							for (local284 = local228; local284 <= local282; local284++) {
								if ((Static8.anIntArrayArrayArray1[local154][local261 + 1][local284] & 0x4) == 0) {
									break label558;
								}
							}
							local261++;
						}
						if ((local261 + 1 - local176) * (-local228 + (local282 - -1)) >= 4) {
							local284 = Static154.anIntArrayArrayArray5[local154][local176][local228];
							Static224.method3526(4, local176 * 128, local261 * 128 + 128, local228 * 128, local282 * 128 + 128, local284, local284);
							for (local289 = local176; local289 <= local261; local289++) {
								for (local430 = local228; local430 <= local282; local430++) {
									Static8.anIntArrayArrayArray1[local154][local289][local430] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!cg;I)V")
	public static void method3967(@OriginalArg(0) Class22 arg0) {
		Static284.aClass22_100 = arg0;
	}
}
