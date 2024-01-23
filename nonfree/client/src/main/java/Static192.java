import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!od", name = "r", descriptor = "Lclient!cg;")
	public static Class22 aClass22_20;

	@OriginalMember(owner = "client!od", name = "J", descriptor = "I")
	private static int anInt842;

	@OriginalMember(owner = "client!od", name = "K", descriptor = "Z")
	private static boolean aBoolean57;

	@OriginalMember(owner = "client!od", name = "f", descriptor = "I")
	public static int anInt815 = 127;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "([Lclient!qb;[[F[[BB[[F[[F[[BI[[B[[BI[[I)V")
	public static void method778(@OriginalArg(0) Class137[] arg0, @OriginalArg(1) float[][] arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(4) float[][] arg3, @OriginalArg(5) float[][] arg4, @OriginalArg(6) byte[][] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[][] arg7, @OriginalArg(9) byte[][] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int[][] arg10) {
		for (@Pc(36) int local36 = 0; local36 < arg6; local36++) {
			@Pc(47) Class137 local47 = arg0[local36];
			if (arg9 == local47.anInt4211) {
				@Pc(56) Class76 local56 = new Class76();
				@Pc(58) int local58 = 0;
				@Pc(66) int local66 = local47.anInt4210 + (local47.anInt4215 >> 7);
				@Pc(75) int local75 = (local47.anInt4206 >> 7) - local47.anInt4210;
				@Pc(84) int local84 = (local47.anInt4215 >> 7) - local47.anInt4210;
				if (local84 < 0) {
					local58 = -local84;
					local84 = 0;
				}
				if (local66 > 103) {
					local66 = 103;
				}
				@Pc(103) int local103;
				@Pc(111) short local111;
				@Pc(117) int local117;
				@Pc(125) int local125;
				@Pc(143) int local143;
				@Pc(154) int local154;
				@Pc(341) boolean local341;
				@Pc(382) int local382;
				for (local103 = local84; local103 <= local66; local103++) {
					local111 = local47.aShortArray74[local58];
					local117 = (local111 >> 8) + local75;
					local125 = (local111 & 0xFF) + local117 - 1;
					if (local125 > 103) {
						local125 = 103;
					}
					if (local117 < 0) {
						local117 = 0;
					}
					for (local143 = local117; local143 <= local125; local143++) {
						local154 = arg2[local143][local103] & 0xFF;
						@Pc(162) int local162 = arg8[local143][local103] & 0xFF;
						@Pc(164) boolean local164 = false;
						@Pc(175) Class34 local175;
						@Pc(199) int[] local199;
						@Pc(258) int[] local258;
						if (local162 == 0) {
							if (local154 == 0) {
								continue;
							}
							local175 = Static1.method5(local154 - 1);
							if (local175.anInt1194 == -1) {
								continue;
							}
							if (arg5[local143][local103] != 0) {
								local199 = Static216.anIntArrayArray29[arg5[local143][local103]];
								local56.anInt2412 += (local199.length >> 1) * 3 - 6;
								local56.anInt2411 += local199.length >> 1;
								continue;
							}
						} else if (local154 != 0) {
							local175 = Static1.method5(local154 - 1);
							@Pc(248) byte local248;
							if (local175.anInt1194 == -1) {
								local248 = arg5[local143][local103];
								if (local248 != 0) {
									local258 = Static135.anIntArrayArray16[local248];
									local56.anInt2412 += (local258.length >> 1) * 3 - 6;
									local56.anInt2411 += local258.length >> 1;
								}
								continue;
							}
							local248 = arg5[local143][local103];
							if (local248 != 0) {
								local164 = true;
							}
						}
						@Pc(300) Class99 local300 = Static101.method1682(arg9, local143, local103);
						if (local300 != null) {
							@Pc(311) int local311 = (int) (local300.aLong117 >> 14) & 0x3F;
							if (local311 == 9) {
								local258 = null;
								@Pc(325) int local325 = (int) (local300.aLong117 >> 20) & 0x3;
								@Pc(354) boolean local354;
								@Pc(369) short local369;
								@Pc(376) int local376;
								if ((local325 & 0x1) == 0) {
									local341 = local143 + 1 <= local125;
									local354 = local117 <= local143 - 1;
									if (!local354 && local103 + 1 <= local66) {
										local369 = local47.aShortArray74[local58 + 1];
										local376 = local75 + (local369 >> 8);
										local382 = local376 + (local369 & 0xFF);
										local354 = local143 > local376 && local382 > local143;
									}
									if (!local341 && local84 <= local103 - 1) {
										local369 = local47.aShortArray74[local58 - 1];
										local376 = (local369 >> 8) + local75;
										local382 = local376 + (local369 & 0xFF);
										local341 = local376 < local143 && local382 > local143;
									}
									if (local354 && local341) {
										local258 = Static216.anIntArrayArray29[0];
									} else if (local354) {
										local258 = Static216.anIntArrayArray29[1];
									} else if (local341) {
										local258 = Static216.anIntArrayArray29[1];
									}
								} else {
									local354 = local117 <= local143 - 1;
									if (!local354 && local84 <= local103 - 1) {
										local369 = local47.aShortArray74[local58 - 1];
										local376 = local75 + (local369 >> 8);
										local382 = local376 + (local369 & 0xFF);
										local354 = local143 > local376 && local143 < local382;
									}
									local341 = local125 >= local143 + 1;
									if (!local341 && local66 >= local103 + 1) {
										local369 = local47.aShortArray74[local58 + 1];
										local376 = local75 + (local369 >> 8);
										local382 = local376 + (local369 & 0xFF);
										local341 = local143 > local376 && local143 < local382;
									}
									if (local354 && local341) {
										local258 = Static216.anIntArrayArray29[0];
									} else if (local354) {
										local258 = Static216.anIntArrayArray29[1];
									} else if (local341) {
										local258 = Static216.anIntArrayArray29[1];
									}
								}
								if (local258 != null) {
									local56.anInt2412 += ((local258.length >> 1) - 2) * 3;
									local56.anInt2411 += local258.length >> 1;
								}
								continue;
							}
						}
						if (local164) {
							local258 = Static135.anIntArrayArray16[arg5[local143][local103]];
							local199 = Static216.anIntArrayArray29[arg5[local143][local103]];
							local56.anInt2412 += ((local199.length >> 1) - 2) * 3;
							local56.anInt2412 += ((local258.length >> 1) - 2) * 3;
							local56.anInt2411 += local199.length >> 1;
							local56.anInt2411 += local258.length >> 1;
						} else {
							local199 = Static216.anIntArrayArray29[0];
							local56.anInt2412 += (local199.length >> 1) * 3 - 6;
							local56.anInt2411 += local199.length >> 1;
						}
					}
					local58++;
				}
				local58 = 0;
				local56.method1967();
				if ((local47.anInt4215 >> 7) - local47.anInt4210 < 0) {
					local58 = local47.anInt4210 - (local47.anInt4215 >> 7);
				}
				for (local103 = local84; local103 <= local66; local103++) {
					local111 = local47.aShortArray74[local58];
					local117 = (local111 >> 8) + local75;
					local125 = (local111 & 0xFF) + (local117 - 1);
					if (local117 < 0) {
						local117 = 0;
					}
					if (local125 > 103) {
						local125 = 103;
					}
					for (local143 = local117; local143 <= local125; local143++) {
						@Pc(802) byte local802 = arg7[local143][local103];
						@Pc(804) boolean local804 = false;
						local154 = arg8[local143][local103] & 0xFF;
						@Pc(820) int local820 = arg2[local143][local103] & 0xFF;
						@Pc(835) Class34 local835;
						if (local154 == 0) {
							if (local820 == 0) {
								continue;
							}
							local835 = Static1.method5(local820 - 1);
							if (local835.anInt1194 == -1) {
								continue;
							}
							if (arg5[local143][local103] != 0) {
								Static133.method2174(arg10, local47, arg3, arg7[local143][local103], arg1, local103, local56, local143, arg4, Static216.anIntArrayArray29[arg5[local143][local103]]);
								continue;
							}
						} else if (local820 != 0) {
							local835 = Static1.method5(local820 - 1);
							if (local835.anInt1194 == -1) {
								Static133.method2174(arg10, local47, arg3, arg7[local143][local103], arg1, local103, local56, local143, arg4, Static135.anIntArrayArray16[arg5[local143][local103]]);
								continue;
							}
							@Pc(890) byte local890 = arg5[local143][local103];
							if (local890 != 0) {
								local804 = true;
							}
						}
						@Pc(928) Class99 local928 = Static101.method1682(arg9, local143, local103);
						if (local928 != null) {
							@Pc(938) int local938 = (int) (local928.aLong117 >> 14) & 0x3F;
							if (local938 == 9) {
								@Pc(945) int[] local945 = null;
								@Pc(953) int local953 = (int) (local928.aLong117 >> 20) & 0x3;
								@Pc(995) int local995;
								@Pc(1018) boolean local1018;
								@Pc(982) short local982;
								if ((local953 & 0x1) == 0) {
									local341 = local117 <= local143 - 1;
									local1018 = local143 + 1 <= local125;
									if (!local341 && local66 >= local103 + 1) {
										local982 = local47.aShortArray74[local58 + 1];
										local382 = local75 + (local982 >> 8);
										local995 = (local982 & 0xFF) + local382;
										local341 = local382 < local143 && local995 > local143;
									}
									if (!local1018 && local84 <= local103 - 1) {
										local982 = local47.aShortArray74[local58 - 1];
										local382 = (local982 >> 8) + local75;
										local995 = local382 + (local982 & 0xFF);
										local1018 = local143 > local382 && local995 > local143;
									}
									if (local341 && local1018) {
										local945 = Static216.anIntArrayArray29[0];
									} else if (local341) {
										local802 = 1;
										local945 = Static216.anIntArrayArray29[1];
									} else if (local1018) {
										local802 = 3;
										local945 = Static216.anIntArrayArray29[1];
									}
								} else {
									local341 = local143 - 1 >= local117;
									if (!local341 && local103 - 1 >= local84) {
										local982 = local47.aShortArray74[local58 - 1];
										local382 = local75 + (local982 >> 8);
										local995 = (local982 & 0xFF) + local382;
										local341 = local382 < local143 && local995 > local143;
									}
									local1018 = local125 >= local143 + 1;
									if (!local1018 && local103 + 1 <= local66) {
										local982 = local47.aShortArray74[local58 + 1];
										local382 = (local982 >> 8) + local75;
										local995 = local382 + (local982 & 0xFF);
										local1018 = local143 > local382 && local143 < local995;
									}
									if (local341 && local1018) {
										local945 = Static216.anIntArrayArray29[0];
									} else if (local341) {
										local945 = Static216.anIntArrayArray29[1];
										local802 = 0;
									} else if (local1018) {
										local945 = Static216.anIntArrayArray29[1];
										local802 = 2;
									}
								}
								if (local945 != null) {
									Static133.method2174(arg10, local47, arg3, local802, arg1, local103, local56, local143, arg4, local945);
								}
								continue;
							}
						}
						if (local804) {
							Static133.method2174(arg10, local47, arg3, arg7[local143][local103], arg1, local103, local56, local143, arg4, Static135.anIntArrayArray16[arg5[local143][local103]]);
							Static133.method2174(arg10, local47, arg3, arg7[local143][local103], arg1, local103, local56, local143, arg4, Static216.anIntArrayArray29[arg5[local143][local103]]);
						} else {
							Static133.method2174(arg10, local47, arg3, local802, arg1, local103, local56, local143, arg4, Static216.anIntArrayArray29[0]);
						}
					}
					local58++;
				}
				if (local56.anInt2413 > 0 && local56.anInt2410 > 0) {
					local56.method1966();
					local47.aClass76_1 = local56;
				}
			}
		}
	}
}
