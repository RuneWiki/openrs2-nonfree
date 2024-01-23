import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!e", name = "a", descriptor = "I")
	public static int anInt1188;

	@OriginalMember(owner = "client!e", name = "h", descriptor = "Lclient!ti;")
	public static Class158 aClass158_1;

	@OriginalMember(owner = "client!e", name = "c", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray18 = null;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIBIIIIIIII)V")
	public static void method1029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7) {
		@Pc(10) int local10 = arg0 - arg5;
		if (arg0 < Static95.anInt2218) {
			local10++;
		}
		@Pc(22) int local22 = arg2 - arg4;
		if (arg2 < Static164.anInt3508) {
			local22++;
		}
		@Pc(33) int local33;
		@Pc(48) int local48;
		@Pc(59) int local59;
		@Pc(64) int local64;
		@Pc(72) int local72;
		@Pc(112) int local112;
		@Pc(144) int local144;
		@Pc(157) int local157;
		@Pc(162) int local162;
		@Pc(211) int local211;
		@Pc(236) int local236;
		@Pc(228) int local228;
		@Pc(257) int local257;
		@Pc(280) int local280;
		@Pc(303) int local303;
		@Pc(389) int local389;
		@Pc(405) int local405;
		@Pc(189) int[][] local189;
		for (local33 = 0; local33 < local22; local33++) {
			local48 = local33 * arg3 >> 16;
			local59 = (local33 + 1) * arg3 >> 16;
			local64 = local59 - local48;
			if (local64 > 0) {
				local72 = local33 + arg4 >> 6;
				if (local72 >= 0 && Static10.anIntArrayArrayArray1.length - 1 >= local72) {
					local48 += arg7;
					local59 += arg7;
					local189 = Static10.anIntArrayArrayArray1[local72];
					@Pc(193) byte[][] local193 = Static267.aByteArrayArrayArray24[local72];
					@Pc(197) byte[][] local197 = Static24.aByteArrayArrayArray22[local72];
					@Pc(201) byte[][] local201 = Static104.aByteArrayArrayArray16[local72];
					@Pc(205) byte[][] local205 = Static230.aByteArrayArrayArray15[local72];
					@Pc(209) byte[][] local209 = Static198.aByteArrayArrayArray2[local72];
					for (local211 = 0; local211 < local10; local211++) {
						local228 = arg6 * (local211 + 1) >> 16;
						local236 = local211 * arg6 >> 16;
						@Pc(240) int local240 = local228 - local236;
						if (local240 > 0) {
							local228 += arg1;
							local257 = local211 + arg5 >> 6;
							local236 += arg1;
							@Pc(267) int local267 = arg5 + local211 & 0x3F;
							@Pc(274) int local274 = local33 + arg4 & 0x3F;
							local280 = local274 + (local267 << 6);
							if (local257 < 0 || local189.length - 1 < local257 || local189[local257] == null) {
								if (Static20.aClass1_Sub2_Sub21_1.anInt5439 != -1) {
									local303 = Static20.aClass1_Sub2_Sub21_1.anInt5439;
								} else if ((arg5 + local211 & 0x4) == (arg4 + local33 & 0x4)) {
									local303 = Static21.anIntArray48[Static56.anInt1236 + 1];
								} else {
									local303 = 4936552;
								}
								if (local257 < 0 || local189.length - 1 < local257) {
									if (local303 == 0) {
										local303 = 1;
									}
									Static50.method954(local48, local236, local64, local240, local303);
									continue;
								}
							} else {
								local303 = local189[local257][local280];
							}
							if (local303 == 0) {
								local303 = 1;
							}
							local389 = local197[local257] == null ? 0 : Static21.anIntArray48[local197[local257][local280] & 0xFF];
							local405 = local209[local257] == null ? 0 : Static21.anIntArray48[local209[local257][local280] & 0xFF];
							@Pc(434) int local434;
							if (local389 == 0 && local405 == 0) {
								Static50.method954(local48, local236, local64, local240, local303);
							} else {
								@Pc(430) byte local430;
								if (local389 != 0) {
									local430 = local193[local257] == null ? 0 : local193[local257][local280];
									local434 = local430 & 0xFC;
									if (local389 == -1) {
										local389 = 1;
									}
									if (local434 == 0 || local64 <= 1 || local240 <= 1) {
										Static50.method954(local48, local236, local64, local240, local389);
									} else {
										Static101.method1897(local48, local240, true, local64, Static50.anIntArray107, local236, local303, local430 & 0x3, local434 >> 2, local389);
									}
								}
								if (local405 != 0) {
									if (local405 == -1) {
										local405 = local303;
									}
									local430 = local205[local257][local280];
									local434 = local430 & 0xFC;
									if (local434 == 0 || local64 <= 1 || local240 <= 1) {
										Static50.method954(local48, local236, local64, local240, local405);
									}
									Static101.method1897(local48, local240, local389 == 0, local64, Static50.anIntArray107, local236, 0, local430 & 0x3, local434 >> 2, local405);
								}
							}
							if (local201[local257] != null) {
								@Pc(559) int local559 = local201[local257][local280] & 0xFF;
								if (local559 != 0) {
									@Pc(571) int local571;
									if (local240 == 1) {
										local571 = local236;
									} else {
										local571 = local228 - 1;
									}
									@Pc(579) int local579 = 13421772;
									if (local559 >= 5 && local559 <= 8 || local559 >= 13 && local559 <= 16 || local559 >= 21 && local559 <= 24 || local559 == 27 || local559 == 28) {
										local559 -= 4;
										local579 = 13369344;
									}
									if (local64 == 1) {
										local434 = local48;
									} else {
										local434 = local59 - 1;
									}
									if (local559 == 1) {
										Static50.method953(local48, local236, local240, local579);
									} else if (local559 == 2) {
										Static50.method943(local48, local236, local64, local579);
									} else if (local559 == 3) {
										Static50.method953(local434, local236, local240, local579);
									} else if (local559 == 4) {
										Static50.method943(local48, local571, local64, local579);
									} else if (local559 == 9) {
										Static50.method953(local48, local236, local240, 16777215);
										Static50.method943(local48, local236, local64, local579);
									} else if (local559 == 10) {
										Static50.method953(local434, local236, local240, 16777215);
										Static50.method943(local48, local236, local64, local579);
									} else if (local559 == 11) {
										Static50.method953(local434, local236, local240, 16777215);
										Static50.method943(local48, local571, local64, local579);
									} else if (local559 == 12) {
										Static50.method953(local48, local236, local240, 16777215);
										Static50.method943(local48, local571, local64, local579);
									} else if (local559 == 17) {
										Static50.method943(local48, local236, 1, local579);
									} else if (local559 == 18) {
										Static50.method943(local434, local236, 1, local579);
									} else if (local559 == 19) {
										Static50.method943(local434, local571, 1, local579);
									} else if (local559 == 20) {
										Static50.method943(local48, local571, 1, local579);
									} else {
										@Pc(759) int local759;
										if (local559 == 25) {
											for (local759 = 0; local759 < local240; local759++) {
												Static50.method943(local48 + local759, -local759 + local571, 1, local579);
											}
										} else if (local559 == 26) {
											for (local759 = 0; local759 < local240; local759++) {
												Static50.method943(local759 + local48, local759 + local236, 1, local579);
											}
										}
									}
								}
							}
						}
					}
				} else {
					local48 += arg7;
					for (@Pc(91) int local91 = 0; local91 < local10; local91++) {
						if (Static20.aClass1_Sub2_Sub21_1.anInt5439 != -1) {
							local112 = Static20.aClass1_Sub2_Sub21_1.anInt5439;
						} else if ((arg4 + local33 & 0x4) == (local91 + arg5 & 0x4)) {
							local112 = Static21.anIntArray48[Static56.anInt1236 + 1];
						} else {
							local112 = 4936552;
						}
						if (local112 == 0) {
							local112 = 1;
						}
						local144 = (local91 * arg6 >> 16) + arg1;
						local157 = ((local91 + 1) * arg6 >> 16) + arg1;
						local162 = local157 - local144;
						Static50.method954(local48, local144, local64, local162, local112);
					}
				}
			}
		}
		for (local33 = -2; local33 < local22 + 2; local33++) {
			local48 = arg3 * local33 >> 16;
			local59 = (local33 + 1) * arg3 >> 16;
			local64 = local59 - local48;
			if (local64 > 0) {
				local72 = arg4 + local33 >> 6;
				local48 += arg7;
				if (local72 >= 0 && local72 <= Static100.anIntArrayArrayArray6.length - 1) {
					local189 = Static100.anIntArrayArrayArray6[local72];
					for (local112 = -2; local112 < local10 + 2; local112++) {
						local144 = arg6 * local112 >> 16;
						local157 = (local112 + 1) * arg6 >> 16;
						local162 = local157 - local144;
						if (local162 > 0) {
							local144 += arg1;
							@Pc(968) int local968 = local112 + arg5 >> 6;
							if (local968 >= 0 && local968 <= local189.length - 1) {
								local211 = ((local112 + arg5 & 0x3F) << 6) + (local33 + arg4 & 0x3F);
								if (local189[local968] != null) {
									local236 = local189[local968][local211];
									local228 = local236 & 0x1FFF;
									if (local228 != 0) {
										@Pc(1022) Class4 local1022 = Static117.method2105(local228 - 1);
										local257 = local236 >> 13 & 0x3;
										@Pc(1039) boolean local1039 = (local236 >> 15 & 0x1) == 1;
										@Pc(1045) Class12_Sub2 local1045 = local1022.method144(local1039, local257);
										if (local1045 != null) {
											local303 = local162 * local1045.anInt5026 / 4;
											local280 = local64 * local1045.anInt5018 / 4;
											if (local1022.aBoolean7) {
												local405 = local236 >> 20 & 0xF;
												local389 = local236 >> 16 & 0xF;
												if ((local257 & 0x1) == 1) {
													local257 = local389;
													local389 = local405;
													local405 = local257;
												}
												local303 = local405 * local162;
												local280 = local389 * local64;
											}
											if (local280 != 0 && local303 != 0) {
												if (local1022.anInt116 == 0) {
													local1045.method3938(local48, local162 + local144 - local303, local280, local303);
												} else {
													local1045.method3930(local48, local162 + local144 - local303, local280, local303, local1022.anInt116);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIBI)V")
	public static void method1030(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 >= Static224.anInt4436 && Static68.anInt1451 >= arg0) {
			@Pc(28) int local28 = Static23.method431(arg2, Static49.anInt1129, Static297.anInt5619);
			@Pc(34) int local34 = Static23.method431(arg3, Static49.anInt1129, Static297.anInt5619);
			Static95.method1753(local28, arg1, arg0, local34);
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II)V")
	public static void method1031(@OriginalArg(0) int arg0) {
		Static296.anInt5584 = 20;
		Static146.anInt3173 = arg0;
		Static240.anInt4766 = 3;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(FIIZIIBI)[I")
	public static int[] method1032(@OriginalArg(0) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class1_Sub3_Sub23 local10 = new Class1_Sub3_Sub23();
		local10.anInt3543 = 8;
		local10.aBoolean257 = true;
		local10.anInt3541 = (int) (arg0 * 4096.0F);
		local10.anInt3538 = 8;
		local10.anInt3533 = 35;
		local10.anInt3536 = 4;
		local10.method4447();
		Static92.method1623(2048, 1);
		local10.method2856(local6, 0);
		return local6;
	}
}
