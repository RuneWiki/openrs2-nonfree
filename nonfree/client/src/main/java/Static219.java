import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!qb", name = "r", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!qb", name = "q", descriptor = "I")
	public static int anInt4208 = 3353893;

	@OriginalMember(owner = "client!qb", name = "v", descriptor = "I")
	public static int anInt4212 = 0;

	@OriginalMember(owner = "client!qb", name = "D", descriptor = "[I")
	public static int[] anIntArray348 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIII)V")
	public static void method3404(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(29) int local29;
		if (Static116.anInt5523 == 0) {
			@Pc(9) int local9 = Static60.anInt1354;
			@Pc(11) int local11 = Static190.anInt3867;
			@Pc(13) int local13 = Static244.anInt4816;
			@Pc(27) int local27 = (local9 - local11) * (arg1 - arg2) / arg0 + local11;
			local29 = Static157.anInt314;
			@Pc(43) int local43 = (local29 - local13) * (arg3 - arg4) / arg5 + local13;
			if (Static145.aBoolean386 && (Static282.anInt5536 & 0x40) != 0) {
				@Pc(81) Class97 local81 = Static77.method1320(Static109.anInt2178, Static144.anInt2858);
				if (local81 == null) {
					Static229.method3599();
				} else {
					Static140.method2241((short) 26, " ->", Static201.aString139, Static43.anInt871, 0L, local43, local27);
				}
			} else {
				if (Static122.anInt2465 == 1) {
					Static140.method2241((short) 28, "", Static278.aString179, -1, 0L, local43, local27);
				}
				Static140.method2241((short) 15, "", Static265.aString174, -1, 0L, local43, local27);
			}
		}
		@Pc(99) long local99 = -1L;
		for (local29 = 0; local29 < Static242.anInt4774; local29++) {
			@Pc(120) long local120 = Static4.aLongArray1[local29];
			@Pc(125) int local125 = (int) local120 & 0x7F;
			@Pc(132) int local132 = (int) local120 >> 7 & 0x7F;
			@Pc(139) int local139 = Integer.MAX_VALUE & (int) (local120 >>> 32);
			@Pc(146) int local146 = (int) local120 >> 29 & 0x3;
			if (local120 != local99) {
				local99 = local120;
				@Pc(258) int local258;
				if (local146 == 2 && Static277.method4343(Static222.anInt4467, local125, local132, local120)) {
					@Pc(168) Class73 local168 = Static296.method4591(local139);
					if (local168.anIntArray196 != null) {
						local168 = local168.method1899();
					}
					if (local168 == null) {
						continue;
					}
					if (Static116.anInt5523 == 1) {
						Static140.method2241((short) 8, Static137.aString92 + " -> <col=00ffff>" + local168.aString84, Static118.aString86, Static303.anInt5779, local120, local132, local125);
					} else if (Static145.aBoolean386) {
						@Pc(196) Class4_Sub2_Sub7 local196 = Static221.anInt4243 == -1 ? null : Static58.method2508(Static221.anInt4243);
						if ((Static282.anInt5536 & 0x4) != 0 && (local196 == null || local168.method1897(local196.anInt1697, Static221.anInt4243) != local196.anInt1697)) {
							Static140.method2241((short) 39, Static160.aString115 + " -> <col=00ffff>" + local168.aString84, Static201.aString139, Static43.anInt871, local120, local132, local125);
						}
					} else {
						@Pc(243) String[] local243 = local168.aStringArray14;
						if (Static36.aBoolean51) {
							local243 = Static167.method2666(local243);
						}
						if (local243 != null) {
							for (local258 = 4; local258 >= 0; local258--) {
								if (local243[local258] != null) {
									@Pc(272) int local272 = -1;
									@Pc(274) short local274 = 0;
									if (local258 == 0) {
										local274 = 31;
									}
									if (local168.anInt2239 == local258) {
										local272 = local168.anInt2224;
									}
									if (local258 == local168.anInt2238) {
										local272 = local168.anInt2228;
									}
									if (local258 == 1) {
										local274 = 41;
									}
									if (local258 == 2) {
										local274 = 24;
									}
									if (local258 == 3) {
										local274 = 19;
									}
									if (local258 == 4) {
										local274 = 1003;
									}
									Static140.method2241(local274, "<col=00ffff>" + local168.aString84, local243[local258], local272, local120, local132, local125);
								}
							}
						}
						Static140.method2241((short) 1001, "<col=00ffff>" + local168.aString84, Static250.aString164, Static55.anInt1250, (long) local168.anInt2237, local132, local125);
					}
				}
				@Pc(494) int local494;
				@Pc(505) int local505;
				@Pc(447) int local447;
				@Pc(461) int local461;
				@Pc(470) Class13_Sub5_Sub2 local470;
				@Pc(570) Class13_Sub5_Sub1 local570;
				if (local146 == 1) {
					@Pc(394) Class13_Sub5_Sub2 local394 = Static260.aClass13_Sub5_Sub2Array114[local139];
					if ((local394.aClass185_1.anInt5803 & 0x1) == 0 && (local394.anInt5334 & 0x7F) == 0 && (local394.anInt5294 & 0x7F) == 0 || (local394.aClass185_1.anInt5803 & 0x1) == 1 && (local394.anInt5334 & 0x7F) == 64 && (local394.anInt5294 & 0x7F) == 64) {
						local447 = local394.anInt5334 - (local394.aClass185_1.anInt5803 - 1) * 64;
						local258 = local394.anInt5294 + 64 - local394.aClass185_1.anInt5803 * 64;
						for (local461 = 0; local461 < Static99.anInt1950; local461++) {
							local470 = Static260.aClass13_Sub5_Sub2Array114[Static123.anIntArray214[local461]];
							if (local470 != null && !local470.aBoolean351 && local394 != local470 && local470.aBoolean352) {
								local494 = local470.anInt5334 - (local470.aClass185_1.anInt5803 - 1) * 64;
								local505 = local470.anInt5294 - (local470.aClass185_1.anInt5803 - 1) * 64;
								if (local447 <= local494 && local470.aClass185_1.anInt5803 <= local394.aClass185_1.anInt5803 - (local494 - local447 >> 7) && local258 <= local505 && local470.aClass185_1.anInt5803 <= local394.aClass185_1.anInt5803 - (local505 - local258 >> 7)) {
									Static190.method3150(local125, Static123.anIntArray214[local461], local470.aClass185_1, local132);
									local470.aBoolean351 = true;
								}
							}
						}
						for (local461 = 0; local461 < Static85.anInt1730; local461++) {
							local570 = Static100.aClass13_Sub5_Sub1Array1[Static291.anIntArray457[local461]];
							if (local570 != null && !local570.aBoolean351 && local570.aBoolean352) {
								local494 = local570.anInt5334 + 64 - local570.method4219() * 64;
								local505 = local570.anInt5294 - (local570.method4219() - 1) * 64;
								if (local447 <= local494 && local570.method4219() <= local394.aClass185_1.anInt5803 - (local494 - local447 >> 7) && local505 >= local258 && local570.method4219() <= local394.aClass185_1.anInt5803 - (local505 - local258 >> 7)) {
									Static25.method558(local570, local132, local125, Static291.anIntArray457[local461]);
									local570.aBoolean351 = true;
								}
							}
						}
					}
					if (local394.aBoolean351) {
						continue;
					}
					Static190.method3150(local125, local139, local394.aClass185_1, local132);
					local394.aBoolean351 = true;
				}
				if (local146 == 0) {
					@Pc(683) Class13_Sub5_Sub1 local683 = Static100.aClass13_Sub5_Sub1Array1[local139];
					if ((local683.anInt5334 & 0x7F) == 64 && (local683.anInt5294 & 0x7F) == 64) {
						local447 = local683.anInt5334 - (local683.method4219() - 1) * 64;
						local258 = local683.anInt5294 - (local683.method4219() - 1) * 64;
						for (local461 = 0; local461 < Static99.anInt1950; local461++) {
							local470 = Static260.aClass13_Sub5_Sub2Array114[Static123.anIntArray214[local461]];
							if (local470 != null && !local470.aBoolean351 && local470.aBoolean352) {
								local494 = local470.anInt5334 + 64 - local470.aClass185_1.anInt5803 * 64;
								local505 = local470.anInt5294 - (local470.aClass185_1.anInt5803 - 1) * 64;
								if (local494 >= local447 && local470.aClass185_1.anInt5803 <= local683.method4219() - (local494 - local447 >> 7) && local258 <= local505 && local470.aClass185_1.anInt5803 <= local683.method4219() - (local505 - local258 >> 7)) {
									Static190.method3150(local125, Static123.anIntArray214[local461], local470.aClass185_1, local132);
									local470.aBoolean351 = true;
								}
							}
						}
						for (local461 = 0; local461 < Static85.anInt1730; local461++) {
							local570 = Static100.aClass13_Sub5_Sub1Array1[Static291.anIntArray457[local461]];
							if (local570 != null && !local570.aBoolean351 && local570 != local683 && local570.aBoolean352) {
								local494 = local570.anInt5334 + 64 - local570.method4219() * 64;
								local505 = local570.anInt5294 + 64 - local570.method4219() * 64;
								if (local494 >= local447 && local570.method4219() <= local683.method4219() - (local494 - local447 >> 7) && local505 >= local258 && local570.method4219() <= local683.method4219() - (local505 - local258 >> 7)) {
									Static25.method558(local570, local132, local125, Static291.anIntArray457[local461]);
									local570.aBoolean351 = true;
								}
							}
						}
					}
					if (local683.aBoolean351) {
						continue;
					}
					Static25.method558(local683, local132, local125, local139);
					local683.aBoolean351 = true;
				}
				if (local146 == 3) {
					@Pc(956) Class17 local956 = Static216.aClass17ArrayArrayArray1[Static222.anInt4467][local125][local132];
					if (local956 != null) {
						for (@Pc(964) Class4_Sub2_Sub3 local964 = (Class4_Sub2_Sub3) local956.method609(); local964 != null; local964 = (Class4_Sub2_Sub3) local956.method614()) {
							local258 = local964.aClass13_Sub6_1.anInt4615;
							@Pc(974) Class29 local974 = Static187.method3128(local258);
							if (Static116.anInt5523 == 1) {
								Static140.method2241((short) 17, Static137.aString92 + " -> <col=ff9040>" + local974.aString35, Static118.aString86, Static303.anInt5779, (long) local258, local132, local125);
							} else if (Static145.aBoolean386) {
								@Pc(1115) Class4_Sub2_Sub7 local1115 = Static221.anInt4243 == -1 ? null : Static58.method2508(Static221.anInt4243);
								if ((Static282.anInt5536 & 0x1) != 0 && (local1115 == null || local974.method925(Static221.anInt4243, local1115.anInt1697) != local1115.anInt1697)) {
									Static140.method2241((short) 6, Static160.aString115 + " -> <col=ff9040>" + local974.aString35, Static201.aString139, Static43.anInt871, (long) local258, local132, local125);
								}
							} else {
								@Pc(982) String[] local982 = local974.aStringArray4;
								if (Static36.aBoolean51) {
									local982 = Static167.method2666(local982);
								}
								for (local494 = 4; local494 >= 0; local494--) {
									if (local982 != null && local982[local494] != null) {
										@Pc(1007) int local1007 = -1;
										@Pc(1009) byte local1009 = 0;
										if (local974.anInt982 == local494) {
											local1007 = local974.anInt1031;
										}
										if (local494 == 0) {
											local1009 = 32;
										}
										if (local494 == local974.anInt1016) {
											local1007 = local974.anInt986;
										}
										if (local494 == 1) {
											local1009 = 34;
										}
										if (local494 == 2) {
											local1009 = 51;
										}
										if (local494 == 3) {
											local1009 = 1;
										}
										if (local494 == 4) {
											local1009 = 43;
										}
										Static140.method2241(local1009, "<col=ff9040>" + local974.aString35, local982[local494], local1007, (long) local258, local132, local125);
									}
								}
								Static140.method2241((short) 1005, "<col=ff9040>" + local974.aString35, Static250.aString164, Static55.anInt1250, (long) local258, local132, local125);
							}
						}
					}
				}
			}
		}
	}
}
