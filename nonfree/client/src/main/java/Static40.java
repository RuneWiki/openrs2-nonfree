import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!ck", name = "u", descriptor = "I")
	public static int anInt6052 = 0;

	@OriginalMember(owner = "client!ck", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString232 = "flash2:";

	@OriginalMember(owner = "client!ck", name = "F", descriptor = "Z")
	public static boolean aBoolean431 = true;

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4951(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static167.method2786(arg4, Static111.anInt2039, Static245.anInt6027);
		@Pc(17) int local17 = Static167.method2786(arg1, Static111.anInt2039, Static245.anInt6027);
		@Pc(23) int local23 = Static167.method2786(arg2, Static204.anInt4020, Static175.anInt3267);
		@Pc(29) int local29 = Static167.method2786(arg6, Static204.anInt4020, Static175.anInt3267);
		@Pc(37) int local37 = Static167.method2786(arg4 + arg5, Static111.anInt2039, Static245.anInt6027);
		@Pc(53) int local53 = Static167.method2786(arg1 - arg5, Static111.anInt2039, Static245.anInt6027);
		@Pc(55) int local55;
		for (local55 = local11; local55 < local37; local55++) {
			Static235.method3988(arg3, Static129.anIntArrayArray40[local55], local29, local23);
		}
		for (local55 = local17; local55 > local53; local55--) {
			Static235.method3988(arg3, Static129.anIntArrayArray40[local55], local29, local23);
		}
		@Pc(101) int local101 = Static167.method2786(arg5 + arg2, Static204.anInt4020, Static175.anInt3267);
		@Pc(109) int local109 = Static167.method2786(arg6 - arg5, Static204.anInt4020, Static175.anInt3267);
		for (local55 = local37; local55 <= local53; local55++) {
			@Pc(118) int[] local118 = Static129.anIntArrayArray40[local55];
			Static235.method3988(arg3, local118, local101, local23);
			Static235.method3988(arg0, local118, local109, local101);
			Static235.method3988(arg3, local118, local29, local109);
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(BILclient!rg;I)V")
	public static void method4956(@OriginalArg(1) int arg0, @OriginalArg(2) Class151 arg1, @OriginalArg(3) int arg2) {
		if (arg1.anInt4746 == 1) {
			Static167.method2784((short) 40, "", arg1.anInt4800, -1, arg1.aString168, 0L, 0);
		}
		@Pc(32) String local32;
		if (arg1.anInt4746 == 2 && !Static39.aBoolean56) {
			local32 = Static53.method5031(arg1);
			if (local32 != null) {
				Static167.method2784((short) 20, "<col=00ff00>" + arg1.aString169, arg1.anInt4800, -1, local32, 0L, -1);
			}
		}
		if (arg1.anInt4746 == 3) {
			Static167.method2784((short) 11, "", arg1.anInt4800, -1, Static11.aString178, 0L, 0);
		}
		if (arg1.anInt4746 == 4) {
			Static167.method2784((short) 42, "", arg1.anInt4800, -1, arg1.aString168, 0L, 0);
		}
		if (arg1.anInt4746 == 5) {
			Static167.method2784((short) 36, "", arg1.anInt4800, -1, arg1.aString168, 0L, 0);
		}
		if (arg1.anInt4746 == 6 && Static259.aClass151_18 == null) {
			Static167.method2784((short) 58, "", arg1.anInt4800, -1, arg1.aString168, 0L, -1);
		}
		@Pc(156) int local156;
		@Pc(154) int local154;
		if (arg1.anInt4721 == 2) {
			local154 = 0;
			for (local156 = 0; local156 < arg1.anInt4792; local156++) {
				for (@Pc(162) int local162 = 0; local162 < arg1.anInt4761; local162++) {
					@Pc(173) int local173 = (arg1.anInt4771 + 32) * local156;
					@Pc(180) int local180 = (arg1.anInt4723 + 32) * local162;
					if (local154 < 20) {
						local180 += arg1.anIntArray513[local154];
						local173 += arg1.anIntArray514[local154];
					}
					if (local180 <= arg0 && arg2 >= local173 && local180 + 32 > arg0 && local173 + 32 > arg2) {
						Static215.aClass151_12 = arg1;
						Static222.anInt4339 = local154;
						if (arg1.anIntArray511[local154] > 0) {
							@Pc(226) Class3_Sub31 local226 = Static42.method612(arg1);
							@Pc(235) Class21 local235 = Static133.method2309(arg1.anIntArray511[local154] - 1);
							if (Static153.anInt2895 == 1 && local226.method4796()) {
								if (Static265.anInt5507 != arg1.anInt4800 || local154 != Static17.anInt332) {
									Static167.method2784((short) 26, Static246.aString173 + " -> <col=ff9040>" + local235.aString18, arg1.anInt4800, -1, Static149.aString103, (long) local235.anInt540, local154);
								}
							} else if (Static39.aBoolean56 && local226.method4796()) {
								@Pc(571) Class3_Sub4_Sub6 local571 = Static78.anInt1479 == -1 ? null : Static6.method109(Static78.anInt1479);
								if ((Static75.anInt1408 & 0x10) != 0 && (local571 == null || local235.method442(local571.anInt1108, Static78.anInt1479) != local571.anInt1108)) {
									Static167.method2784((short) 19, Static286.aString205 + " -> <col=ff9040>" + local235.aString18, arg1.anInt4800, Static269.anInt5498, Static26.aString14, (long) local235.anInt540, local154);
								}
							} else {
								@Pc(294) String[] local294 = local235.aStringArray8;
								if (Static208.aBoolean293) {
									local294 = Static113.method1828(local294);
								}
								@Pc(306) int local306;
								@Pc(323) byte local323;
								if (local226.method4796()) {
									for (local306 = 4; local306 >= 3; local306--) {
										if (local294 != null && local294[local306] != null) {
											if (local306 == 3) {
												local323 = 15;
											} else {
												local323 = 51;
											}
											Static167.method2784(local323, "<col=ff9040>" + local235.aString18, arg1.anInt4800, -1, local294[local306], (long) local235.anInt540, local154);
										}
									}
								}
								if (local226.method4785()) {
									Static167.method2784((short) 16, "<col=ff9040>" + local235.aString18, arg1.anInt4800, Static270.anInt5516, Static149.aString103, (long) local235.anInt540, local154);
								}
								if (local226.method4796() && local294 != null) {
									for (local306 = 2; local306 >= 0; local306--) {
										if (local294[local306] != null) {
											local323 = 0;
											if (local306 == 0) {
												local323 = 21;
											}
											if (local306 == 1) {
												local323 = 47;
											}
											if (local306 == 2) {
												local323 = 12;
											}
											Static167.method2784(local323, "<col=ff9040>" + local235.aString18, arg1.anInt4800, -1, local294[local306], (long) local235.anInt540, local154);
										}
									}
								}
								local294 = arg1.aStringArray33;
								if (Static208.aBoolean293) {
									local294 = Static113.method1828(local294);
								}
								if (local294 != null) {
									for (local306 = 4; local306 >= 0; local306--) {
										if (local294[local306] != null) {
											local323 = 0;
											if (local306 == 0) {
												local323 = 43;
											}
											if (local306 == 1) {
												local323 = 3;
											}
											if (local306 == 2) {
												local323 = 24;
											}
											if (local306 == 3) {
												local323 = 9;
											}
											if (local306 == 4) {
												local323 = 7;
											}
											Static167.method2784(local323, "<col=ff9040>" + local235.aString18, arg1.anInt4800, -1, local294[local306], (long) local235.anInt540, local154);
										}
									}
								}
								Static167.method2784((short) 1009, "<col=ff9040>" + local235.aString18, arg1.anInt4800, Static229.anInt4480, Static181.aString126, (long) local235.anInt540, local154);
							}
						}
					}
					local154++;
				}
			}
		}
		if (!arg1.aBoolean328) {
			return;
		}
		if (!Static39.aBoolean56) {
			for (local154 = 9; local154 >= 5; local154--) {
				@Pc(676) String local676 = Static254.method4303(local154, arg1);
				if (local676 != null) {
					Static167.method2784((short) 1007, arg1.aString167, arg1.anInt4800, Static171.method2842(local154, arg1), local676, (long) (local154 + 1), arg1.anInt4776);
				}
			}
			local32 = Static53.method5031(arg1);
			if (local32 != null) {
				Static167.method2784((short) 20, arg1.aString167, arg1.anInt4800, -1, local32, 0L, arg1.anInt4776);
			}
			for (local156 = 4; local156 >= 0; local156--) {
				@Pc(738) String local738 = Static254.method4303(local156, arg1);
				if (local738 != null) {
					Static167.method2784((short) 2, arg1.aString167, arg1.anInt4800, Static171.method2842(local156, arg1), local738, (long) (local156 + 1), arg1.anInt4776);
				}
			}
			if (Static42.method612(arg1).method4793()) {
				if (arg1.aString166 == null) {
					Static167.method2784((short) 58, "", arg1.anInt4800, -1, Static144.aString170, 0L, arg1.anInt4776);
				} else {
					Static167.method2784((short) 58, "", arg1.anInt4800, -1, arg1.aString166, 0L, arg1.anInt4776);
				}
			}
		} else if (Static42.method612(arg1).method4787() && (Static75.anInt1408 & 0x20) != 0) {
			Static167.method2784((short) 57, Static286.aString205 + " -> " + arg1.aString167, arg1.anInt4800, Static269.anInt5498, Static26.aString14, 0L, arg1.anInt4776);
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILclient!rg;)Lclient!rg;")
	public static Class151 method4959(@OriginalArg(1) Class151 arg0) {
		@Pc(11) Class151 local11 = Static42.method625(arg0);
		if (local11 == null) {
			local11 = arg0.aClass151_15;
		}
		return local11;
	}

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "(II)I")
	public static int method4963(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "([Lclient!rk;I[[[IZ)V")
	public static void method4966(@OriginalArg(0) Class153[] arg0, @OriginalArg(2) int[][][] arg1, @OriginalArg(3) boolean arg2) {
		@Pc(9) byte local9;
		if (arg2) {
			local9 = 1;
		} else {
			local9 = 4;
		}
		@Pc(17) int local17;
		@Pc(22) int local22;
		if (!arg2) {
			for (local17 = 0; local17 < 4; local17++) {
				for (local22 = 0; local22 < 104; local22++) {
					for (@Pc(27) int local27 = 0; local27 < 104; local27++) {
						if ((Static41.aByteArrayArrayArray2[local17][local22][local27] & 0x1) == 1) {
							@Pc(44) int local44 = local17;
							if ((Static41.aByteArrayArrayArray2[1][local22][local27] & 0x2) == 2) {
								local44 = local17 - 1;
							}
							if (local44 >= 0) {
								arg0[local44].method4091(local27, local22);
							}
						}
					}
				}
			}
			Static165.anInt3087 += (int) (Math.random() * 5.0D) - 2;
			if (Static165.anInt3087 < -16) {
				Static165.anInt3087 = -16;
			}
			Static270.anInt5514 += (int) (Math.random() * 5.0D) - 2;
			if (Static270.anInt5514 < -8) {
				Static270.anInt5514 = -8;
			}
			if (Static270.anInt5514 > 8) {
				Static270.anInt5514 = 8;
			}
			if (Static165.anInt3087 > 16) {
				Static165.anInt3087 = 16;
			}
		}
		local17 = Static270.anInt5514 >> 2 << 10;
		local22 = Static165.anInt3087 >> 1;
		@Pc(140) int[][] local140 = new int[104][104];
		@Pc(144) int[][] local144 = new int[104][104];
		@Pc(146) int local146;
		@Pc(166) int local166;
		@Pc(171) int local171;
		@Pc(176) int local176;
		@Pc(192) int local192;
		@Pc(198) int local198;
		@Pc(200) int local200;
		@Pc(205) int local205;
		@Pc(349) int local349;
		@Pc(233) int local233;
		@Pc(254) int local254;
		@Pc(267) int local267;
		for (local146 = 0; local146 < local9; local146++) {
			@Pc(157) byte[][] local157 = Static188.aByteArrayArrayArray17[local146];
			@Pc(332) int local332;
			@Pc(271) int local271;
			@Pc(277) int local277;
			@Pc(326) int local326;
			if (!Static283.aBoolean393) {
				local166 = (int) Math.sqrt(5100.0D);
				local171 = local166 * 768 >> 8;
				for (local176 = 1; local176 < 103; local176++) {
					for (local192 = 1; local192 < 103; local192++) {
						local200 = Static256.anIntArrayArrayArray14[local146][local192 + 1][local176] - Static256.anIntArrayArrayArray14[local146][local192 - 1][local176];
						local205 = Static256.anIntArrayArrayArray14[local146][local192][local176 + 1] - Static256.anIntArrayArrayArray14[local146][local192][local176 - 1];
						local349 = (int) Math.sqrt((double) (local200 * local200 + local205 * local205 + 65536));
						local233 = (local200 << 8) / local349;
						local254 = -65536 / local349;
						local267 = (local205 << 8) / local349;
						local198 = (local267 * -50 + local254 * -10 + local233 * -50) / local171 + 74;
						local332 = (local157[local192][local176] >> 1) + (local157[local192][local176 - 1] >> 2) + (local157[local192 - -1][local176] >> 3) + (local157[local192 + -1][local176] >> 2) + (local157[local192][local176 + 1] >> 3);
						local140[local192][local176] = local198 - local332;
					}
				}
			} else if (Static67.aBoolean95) {
				for (local166 = 1; local166 < 103; local166++) {
					for (local171 = 1; local171 < 103; local171++) {
						local192 = (local157[local171][local166 + 1] >> 3) + (local157[local171 - 1][local166] >> 2) + (local157[local171 + 1][local166] >> 3) + (local157[local171][local166 + -1] >> 2) + (local157[local171][local166] >> 1);
						local140[local171][local166] = 74 - local192;
					}
				}
			} else {
				local166 = (int) Static226.aFloatArray18[0];
				local171 = (int) Static226.aFloatArray18[1];
				local176 = (int) Static226.aFloatArray18[2];
				local192 = (int) Math.sqrt((double) (local176 * local176 + local166 * local166 + local171 * local171));
				local198 = local192 * 1024 >> 8;
				for (local200 = 1; local200 < 103; local200++) {
					for (local205 = 1; local205 < 103; local205++) {
						local233 = Static256.anIntArrayArrayArray14[local146][local205 + 1][local200] - Static256.anIntArrayArrayArray14[local146][local205 - 1][local200];
						local254 = Static256.anIntArrayArrayArray14[local146][local205][local200 + 1] - Static256.anIntArrayArrayArray14[local146][local205][local200 - 1];
						local267 = (int) Math.sqrt((double) (local254 * local254 + local233 * local233 + 65536));
						local271 = -65536 / local267;
						local277 = (local254 << 8) / local267;
						local326 = (local157[local205][local200 + 1] >> 3) + (local157[local205][local200 - 1] >> 2) + (local157[local205 + 1][local200] >> 3) + (local157[local205 + -1][local200] >> 2) + (local157[local205][local200] >> 1);
						local332 = (local233 << 8) / local267;
						local349 = (local277 * local176 + local166 * local332 + local171 * local271) / local198 + 96;
						local140[local205][local200] = local349 - (int) ((float) local326 * 1.7F);
					}
				}
			}
			for (local166 = 0; local166 < 104; local166++) {
				Static144.anIntArray527[local166] = 0;
				Static12.anIntArray20[local166] = 0;
				Static83.anIntArray154[local166] = 0;
				Static152.anIntArray331[local166] = 0;
				Static131.anIntArray295[local166] = 0;
			}
			for (local166 = -5; local166 < 104; local166++) {
				for (local171 = 0; local171 < 104; local171++) {
					local176 = local166 + 5;
					@Pc(728) int local728;
					if (local176 < 104) {
						local192 = Static5.aByteArrayArrayArray1[local146][local176][local171] & 0xFF;
						if (local192 > 0) {
							@Pc(692) Class72 local692 = Static257.method4338(local192 - 1);
							Static144.anIntArray527[local171] += local692.anInt2003;
							Static12.anIntArray20[local171] += local692.anInt2002;
							Static83.anIntArray154[local171] += local692.anInt2009;
							Static152.anIntArray331[local171] += local692.anInt2001;
							local728 = Static131.anIntArray295[local171]++;
						}
					}
					local192 = local166 - 5;
					if (local192 >= 0) {
						local198 = Static5.aByteArrayArrayArray1[local146][local192][local171] & 0xFF;
						if (local198 > 0) {
							@Pc(761) Class72 local761 = Static257.method4338(local198 - 1);
							Static144.anIntArray527[local171] -= local761.anInt2003;
							Static12.anIntArray20[local171] -= local761.anInt2002;
							Static83.anIntArray154[local171] -= local761.anInt2009;
							Static152.anIntArray331[local171] -= local761.anInt2001;
							local728 = Static131.anIntArray295[local171]--;
						}
					}
				}
				if (local166 >= 0) {
					local192 = 0;
					local176 = 0;
					local171 = 0;
					local200 = 0;
					local198 = 0;
					for (local205 = -5; local205 < 104; local205++) {
						local349 = local205 + 5;
						local233 = local205 - 5;
						if (local349 < 104) {
							local176 += Static12.anIntArray20[local349];
							local192 += Static83.anIntArray154[local349];
							local198 += Static152.anIntArray331[local349];
							local200 += Static131.anIntArray295[local349];
							local171 += Static144.anIntArray527[local349];
						}
						if (local233 >= 0) {
							local200 -= Static131.anIntArray295[local233];
							local192 -= Static83.anIntArray154[local233];
							local176 -= Static12.anIntArray20[local233];
							local198 -= Static152.anIntArray331[local233];
							local171 -= Static144.anIntArray527[local233];
						}
						if (local205 >= 0 && local200 > 0) {
							local144[local166][local205] = Static198.method3272(local192 / local200, local176 / local200, local171 * 256 / local198);
						}
					}
				}
			}
			for (local166 = 1; local166 < 103; local166++) {
				label757: for (local171 = 1; local171 < 103; local171++) {
					if (arg2 || Static208.method3462() || (Static41.aByteArrayArrayArray2[0][local166][local171] & 0x2) != 0 || (Static41.aByteArrayArrayArray2[local146][local166][local171] & 0x10) == 0 && Static133.method2305(local146, local171, local166) == Static187.anInt3700) {
						if (Static170.anInt3194 > local146) {
							Static170.anInt3194 = local146;
						}
						local192 = Static86.aByteArrayArrayArray14[local146][local166][local171] & 0xFF;
						local176 = Static5.aByteArrayArrayArray1[local146][local166][local171] & 0xFF;
						if (local176 > 0 || local192 > 0) {
							local198 = Static256.anIntArrayArrayArray14[local146][local166][local171];
							local205 = Static256.anIntArrayArrayArray14[local146][local166 + 1][local171 + 1];
							local200 = Static256.anIntArrayArrayArray14[local146][local166 + 1][local171];
							local349 = Static256.anIntArrayArrayArray14[local146][local166][local171 + 1];
							if (local146 > 0) {
								@Pc(1071) boolean local1071 = true;
								if (local176 == 0 && Static220.aByteArrayArrayArray19[local146][local166][local171] != 0) {
									local1071 = false;
								}
								if (local192 > 0 && !Static278.method4188(local192 - 1).aBoolean415) {
									local1071 = false;
								}
								if (local1071 && local198 == local200 && local205 == local198 && local349 == local198) {
									Static104.anIntArrayArrayArray6[local146][local166][local171] |= 0x4;
								}
							}
							if (local176 > 0) {
								local233 = local144[local166][local171];
								local267 = local22 + (local233 & 0x7F);
								if (local267 < 0) {
									local267 = 0;
								} else if (local267 > 127) {
									local267 = 127;
								}
								local332 = local267 + (local233 & 0x380) + (local17 + local233 & 0xFC00);
								local254 = Static16.anIntArray25[Static130.method2210(96, local332)];
							} else {
								local254 = 0;
								local233 = -1;
							}
							local267 = local140[local166][local171];
							local271 = local140[local166 + 1][local171 + 1];
							local332 = local140[local166 + 1][local171];
							local277 = local140[local166][local171 + 1];
							if (local192 == 0) {
								Static161.method2652(local146, local166, local171, 0, 0, -1, local198, local200, local205, local349, Static130.method2210(local267, local233), Static130.method2210(local332, local233), Static130.method2210(local271, local233), Static130.method2210(local277, local233), 0, 0, 0, 0, local254, 0);
								if (Static283.aBoolean393 && local146 > 0 && local233 != -1 && Static257.method4338(local176 - 1).aBoolean158) {
									Static193.method3204(0, 0, true, false, local166, local171, local198 - Static256.anIntArrayArrayArray14[0][local166][local171], local200 + -Static256.anIntArrayArrayArray14[0][local166 + 1][local171], local205 - Static256.anIntArrayArrayArray14[0][local166 + 1][local171 + 1], local349 - Static256.anIntArrayArrayArray14[0][local166][local171 + 1]);
								}
								if (Static283.aBoolean393 && !arg2 && Static157.anIntArrayArray45 != null && local146 == 0) {
									for (local326 = local166 - 1; local326 <= local166 + 1; local326++) {
										for (@Pc(1793) int local1793 = local171 - 1; local1793 <= local171 + 1; local1793++) {
											if ((local166 != local326 || local1793 != local171) && local326 >= 0 && local326 < 104 && local1793 >= 0 && local1793 < 104) {
												@Pc(1846) int local1846 = Static86.aByteArrayArrayArray14[local146][local326][local1793] & 0xFF;
												if (local1846 != 0) {
													@Pc(1859) Class183 local1859 = Static278.method4188(local1846 - 1);
													if (local1859.anInt5780 != -1 && Static308.method4938(Static16.anInterface4_1.method2901(local1859.anInt5780))) {
														Static157.anIntArrayArray45[local166][local171] = (local1859.anInt5781 << 24) + local1859.anInt5782;
														continue label757;
													}
												}
											}
										}
									}
								}
							} else {
								local326 = Static220.aByteArrayArrayArray19[local146][local166][local171] + 1;
								@Pc(1252) byte local1252 = Static310.aByteArrayArrayArray20[local146][local166][local171];
								@Pc(1258) Class183 local1258 = Static278.method4188(local192 - 1);
								@Pc(1307) int local1307;
								@Pc(1353) int local1353;
								@Pc(1298) int local1298;
								if (Static283.aBoolean393 && !arg2 && Static157.anIntArrayArray45 != null && local146 == 0) {
									if (local1258.anInt5780 != -1 && Static308.method4938(Static16.anInterface4_1.method2901(local1258.anInt5780))) {
										Static157.anIntArrayArray45[local166][local171] = local1258.anInt5782 + (local1258.anInt5781 << 24);
									} else {
										label723: for (local1298 = local166 - 1; local1298 <= local166 + 1; local1298++) {
											for (local1307 = local171 - 1; local1307 <= local171 + 1; local1307++) {
												if ((local1298 != local166 || local1307 != local171) && local1298 >= 0 && local1298 < 104 && local1307 >= 0 && local1307 < 104) {
													local1353 = Static86.aByteArrayArrayArray14[local146][local1298][local1307] & 0xFF;
													if (local1353 != 0) {
														@Pc(1366) Class183 local1366 = Static278.method4188(local1353 - 1);
														if (local1366.anInt5780 != -1 && Static308.method4938(Static16.anInterface4_1.method2901(local1366.anInt5780))) {
															Static157.anIntArrayArray45[local166][local171] = local1366.anInt5782 + (local1366.anInt5781 << 24);
															break label723;
														}
													}
												}
											}
										}
									}
								}
								local1298 = local1258.anInt5780;
								if (local1298 >= 0 && !Static16.anInterface4_1.method2909(local1298)) {
									local1298 = -1;
								}
								@Pc(1478) int local1478;
								@Pc(1450) int local1450;
								if (local1298 >= 0) {
									local1353 = Static16.anIntArray25[Static156.method2604(Static16.anInterface4_1.method2906(local1298), 96)];
									local1307 = -1;
								} else if (local1258.anInt5777 == -1) {
									local1307 = -2;
									local1353 = 0;
								} else {
									local1307 = local1258.anInt5777;
									local1450 = local22 + (local1307 & 0x7F);
									if (local1450 < 0) {
										local1450 = 0;
									} else if (local1450 > 127) {
										local1450 = 127;
									}
									local1478 = local1450 + (local1307 + local17 & 0xFC00) + (local1307 & 0x380);
									local1353 = Static16.anIntArray25[Static156.method2604(local1478, 96)];
								}
								if (local1258.anInt5776 >= 0) {
									local1450 = local1258.anInt5776;
									local1478 = local22 + (local1450 & 0x7F);
									if (local1478 < 0) {
										local1478 = 0;
									} else if (local1478 > 127) {
										local1478 = 127;
									}
									@Pc(1527) int local1527 = local1478 + (local1450 & 0x380) + (local17 + local1450 & 0xFC00);
									local1353 = Static16.anIntArray25[Static156.method2604(local1527, 96)];
								}
								Static161.method2652(local146, local166, local171, local326, local1252, local1298, local198, local200, local205, local349, Static130.method2210(local267, local233), Static130.method2210(local332, local233), Static130.method2210(local271, local233), Static130.method2210(local277, local233), Static156.method2604(local1307, local267), Static156.method2604(local1307, local332), Static156.method2604(local1307, local271), Static156.method2604(local1307, local277), local254, local1353);
								if (Static283.aBoolean393 && local146 > 0) {
									Static193.method3204(local326, local1252, local1307 == -2 || !local1258.aBoolean412, local233 == -1 || !Static257.method4338(local176 - 1).aBoolean158, local166, local171, local198 - Static256.anIntArrayArrayArray14[0][local166][local171], local200 + -Static256.anIntArrayArrayArray14[0][local166 - -1][local171], local205 - Static256.anIntArrayArrayArray14[0][local166 + 1][local171 + 1], local349 - Static256.anIntArrayArrayArray14[0][local166][local171 - -1]);
								}
							}
						}
					}
				}
			}
			if (Static283.aBoolean393) {
				@Pc(1905) float[][] local1905 = new float[105][105];
				@Pc(1909) float[][] local1909 = new float[105][105];
				@Pc(1913) float[][] local1913 = new float[105][105];
				@Pc(1917) int[][] local1917 = Static256.anIntArrayArrayArray14[local146];
				local198 = 1;
				while (true) {
					if (local198 > 103) {
						@Pc(2039) Class3_Sub21[] local2039;
						if (arg2) {
							local2039 = Static47.method4904(local1909, Static157.anIntArrayArray45, Static86.aByteArrayArrayArray14[local146], arg1, local144, Static310.aByteArrayArrayArray20[local146], local1905, local1913, Static256.anIntArrayArrayArray14[local146], local146, Static41.aByteArrayArrayArray2, Static220.aByteArrayArrayArray19[local146], Static258.anIntArrayArrayArray15[0], Static5.aByteArrayArrayArray1[local146], local140);
							Static296.method4812(local146, local2039);
							break;
						}
						local2039 = Static47.method4904(local1909, null, Static86.aByteArrayArrayArray14[local146], arg1, local144, Static310.aByteArrayArrayArray20[local146], local1905, local1913, Static256.anIntArrayArrayArray14[local146], local146, Static41.aByteArrayArrayArray2, Static220.aByteArrayArrayArray19[local146], null, Static5.aByteArrayArrayArray1[local146], local140);
						@Pc(2063) Class3_Sub21[] local2063 = Static290.method4756(local1905, local1913, local146, Static256.anIntArrayArrayArray14[local146], local1909, Static5.aByteArrayArrayArray1[local146], Static220.aByteArrayArrayArray19[local146], Static86.aByteArrayArrayArray14[local146], local140, Static310.aByteArrayArrayArray20[local146], Static41.aByteArrayArrayArray2);
						@Pc(2071) Class3_Sub21[] local2071 = new Class3_Sub21[local2039.length + local2063.length];
						for (local349 = 0; local349 < local2039.length; local349++) {
							local2071[local349] = local2039[local349];
						}
						for (local349 = 0; local349 < local2063.length; local349++) {
							local2071[local349 + local2039.length] = local2063[local349];
						}
						Static296.method4812(local146, local2071);
						Static249.method4210(local1909, local1905, Static142.aClass90Array1, local1913, local146, Static256.anIntArrayArrayArray14[local146], Static310.aByteArrayArrayArray20[local146], Static86.aByteArrayArrayArray14[local146], Static5.aByteArrayArrayArray1[local146], Static142.anInt2730, Static220.aByteArrayArrayArray19[local146]);
						break;
					}
					for (local200 = 1; local200 <= 103; local200++) {
						local205 = local1917[local200 + 1][local198] - local1917[local200 - 1][local198];
						local349 = local1917[local200][local198 + 1] - local1917[local200][local198 - 1];
						@Pc(1975) float local1975 = (float) Math.sqrt((double) (local205 * local205 + local349 * local349 + 65536));
						local1909[local200][local198] = (float) local205 / local1975;
						local1905[local200][local198] = -256.0F / local1975;
						local1913[local200][local198] = (float) local349 / local1975;
					}
					local198++;
				}
			}
			Static5.aByteArrayArrayArray1[local146] = null;
			Static86.aByteArrayArrayArray14[local146] = null;
			Static220.aByteArrayArrayArray19[local146] = null;
			Static310.aByteArrayArrayArray20[local146] = null;
			Static188.aByteArrayArrayArray17[local146] = null;
		}
		Static132.method2217();
		if (arg2) {
			return;
		}
		@Pc(2211) int local2211;
		for (local146 = 0; local146 < 104; local146++) {
			for (local2211 = 0; local2211 < 104; local2211++) {
				if ((Static41.aByteArrayArrayArray2[1][local146][local2211] & 0x2) == 2) {
					Static41.method569(local146, local2211);
				}
			}
		}
		for (local146 = 0; local146 < 4; local146++) {
			for (local2211 = 0; local2211 <= 104; local2211++) {
				for (local166 = 0; local166 <= 104; local166++) {
					if ((Static104.anIntArrayArrayArray6[local146][local166][local2211] & 0x1) != 0) {
						for (local176 = local2211; local176 < 104 && (Static104.anIntArrayArrayArray6[local146][local166][local176 + 1] & 0x1) != 0; local176++) {
						}
						local171 = local2211;
						local192 = local146;
						while (local171 > 0 && (Static104.anIntArrayArrayArray6[local146][local166][local171 - 1] & 0x1) != 0) {
							local171--;
						}
						label441: while (local192 > 0) {
							for (local200 = local171; local200 <= local176; local200++) {
								if ((Static104.anIntArrayArrayArray6[local192 - 1][local166][local200] & 0x1) == 0) {
									break label441;
								}
							}
							local192--;
						}
						label429: for (local198 = local146; local198 < 3; local198++) {
							for (local200 = local171; local200 <= local176; local200++) {
								if ((Static104.anIntArrayArrayArray6[local198 + 1][local166][local200] & 0x1) == 0) {
									break label429;
								}
							}
						}
						local200 = (local198 + 1 - local192) * (local176 - local171 - -1);
						if (local200 >= 8) {
							local349 = Static256.anIntArrayArrayArray14[local198][local166][local171] - 240;
							local233 = Static256.anIntArrayArrayArray14[local192][local166][local171];
							Static34.method527(1, local166 * 128, local166 * 128, local171 * 128, local176 * 128 + 128, local349, local233);
							for (local254 = local192; local254 <= local198; local254++) {
								for (local267 = local171; local267 <= local176; local267++) {
									Static104.anIntArrayArrayArray6[local254][local166][local267] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((Static104.anIntArrayArrayArray6[local146][local166][local2211] & 0x2) != 0) {
						local171 = local166;
						local176 = local166;
						local192 = local146;
						while (local176 < 104 && (Static104.anIntArrayArrayArray6[local146][local176 + 1][local2211] & 0x2) != 0) {
							local176++;
						}
						while (local171 > 0 && (Static104.anIntArrayArrayArray6[local146][local171 - 1][local2211] & 0x2) != 0) {
							local171--;
						}
						label496: while (local192 > 0) {
							for (local200 = local171; local200 <= local176; local200++) {
								if ((Static104.anIntArrayArrayArray6[local192 - 1][local200][local2211] & 0x2) == 0) {
									break label496;
								}
							}
							local192--;
						}
						label484: for (local198 = local146; local198 < 3; local198++) {
							for (local200 = local171; local200 <= local176; local200++) {
								if ((Static104.anIntArrayArrayArray6[local198 + 1][local200][local2211] & 0x2) == 0) {
									break label484;
								}
							}
						}
						local200 = (local176 + 1 - local171) * (-local192 + (local198 - -1));
						if (local200 >= 8) {
							local349 = Static256.anIntArrayArrayArray14[local198][local171][local2211] - 240;
							local233 = Static256.anIntArrayArrayArray14[local192][local171][local2211];
							Static34.method527(2, local171 * 128, local176 * 128 + 128, local2211 * 128, local2211 * 128, local349, local233);
							for (local254 = local192; local254 <= local198; local254++) {
								for (local267 = local171; local267 <= local176; local267++) {
									Static104.anIntArrayArrayArray6[local254][local267][local2211] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((Static104.anIntArrayArrayArray6[local146][local166][local2211] & 0x4) != 0) {
						local171 = local166;
						local176 = local166;
						local192 = local2211;
						for (local198 = local2211; local198 < 104 && (Static104.anIntArrayArrayArray6[local146][local166][local198 + 1] & 0x4) != 0; local198++) {
						}
						while (local192 > 0 && (Static104.anIntArrayArrayArray6[local146][local166][local192 - 1] & 0x4) != 0) {
							local192--;
						}
						label549: while (local171 > 0) {
							for (local200 = local192; local200 <= local198; local200++) {
								if ((Static104.anIntArrayArrayArray6[local146][local171 - 1][local200] & 0x4) == 0) {
									break label549;
								}
							}
							local171--;
						}
						label538: while (local176 < 104) {
							for (local200 = local192; local200 <= local198; local200++) {
								if ((Static104.anIntArrayArrayArray6[local146][local176 + 1][local200] & 0x4) == 0) {
									break label538;
								}
							}
							local176++;
						}
						if ((local198 + 1 - local192) * (-local171 + 1 + local176) >= 4) {
							local200 = Static256.anIntArrayArrayArray14[local146][local171][local192];
							Static34.method527(4, local171 * 128, local176 * 128 + 128, local192 * 128, local198 * 128 + 128, local200, local200);
							for (local205 = local171; local205 <= local176; local205++) {
								for (local349 = local192; local349 <= local198; local349++) {
									Static104.anIntArrayArrayArray6[local146][local205][local349] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
	}
}
