import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
	public static int anInt205;

	@OriginalMember(owner = "client!aj", name = "H", descriptor = "I")
	public static int anInt231;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(BI)I")
	public static int method247(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lclient!qs;IIIIIIIIIII)Z")
	public static boolean method250(@OriginalArg(0) Class174 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg2;
		@Pc(9) int local9 = arg6;
		@Pc(18) int local18 = arg2 - 64;
		Static36.anIntArrayArray11[64][64] = 99;
		@Pc(28) int local28 = arg6 - 64;
		Static218.anIntArrayArray41[64][64] = 0;
		@Pc(44) byte local44 = 0;
		@Pc(46) int local46 = 0;
		Static304.anIntArray499[0] = arg2;
		@Pc(53) int local53 = local44 + 1;
		Static333.anIntArray5[0] = arg6;
		@Pc(58) int[][] local58 = arg0.anIntArrayArray53;
		while (true) {
			label282: while (true) {
				@Pc(72) int local72;
				@Pc(82) int local82;
				@Pc(88) int local88;
				@Pc(94) int local94;
				@Pc(242) int local242;
				@Pc(284) int local284;
				do {
					do {
						do {
							label259: do {
								if (local46 == local53) {
									Static295.anInt5963 = local7;
									Static330.anInt6452 = local9;
									return false;
								}
								local9 = Static333.anIntArray5[local46];
								local7 = Static304.anIntArray499[local46];
								local72 = local7 - local18;
								local46 = local46 + 1 & 0xFFF;
								local82 = local9 - local28;
								local88 = local7 - arg0.anInt5481;
								local94 = local9 - arg0.anInt5486;
								if (arg10 == -4) {
									if (arg5 == local7 && local9 == arg1) {
										Static330.anInt6452 = local9;
										Static295.anInt5963 = local7;
										return true;
									}
								} else if (arg10 == -3) {
									if (Static265.method4632(arg5, arg1, local7, local9, arg3, arg3, arg9, arg4)) {
										Static295.anInt5963 = local7;
										Static330.anInt6452 = local9;
										return true;
									}
								} else if (arg10 == -2) {
									if (arg0.method4667(arg3, arg1, arg3, local7, arg4, arg7, arg9, arg5, local9)) {
										Static295.anInt5963 = local7;
										Static330.anInt6452 = local9;
										return true;
									}
								} else if (arg10 == -1) {
									if (arg0.method4653(arg1, arg4, arg5, local9, arg3, arg7, local7, arg9)) {
										Static330.anInt6452 = local9;
										Static295.anInt5963 = local7;
										return true;
									}
								} else if (arg10 == 0 || arg10 == 1 || arg10 == 2 || arg10 == 3 || arg10 == 9) {
									if (arg0.method4657(arg3, arg8, local7, arg10, local9, arg5, arg1)) {
										Static330.anInt6452 = local9;
										Static295.anInt5963 = local7;
										return true;
									}
								} else if (arg0.method4658(arg10, arg1, local7, arg5, arg3, arg8, local9)) {
									Static295.anInt5963 = local7;
									Static330.anInt6452 = local9;
									return true;
								}
								local242 = Static218.anIntArrayArray41[local72][local82] + 1;
								if (local72 > 0 && Static36.anIntArrayArray11[local72 - 1][local82] == 0 && (local58[local88 - 1][local94] & 0x43A40000) == 0 && (local58[local88 - 1][local94 + arg3 - 1] & 0x4E240000) == 0) {
									local284 = 1;
									while (true) {
										if (local284 >= arg3 - 1) {
											Static304.anIntArray499[local53] = local7 - 1;
											Static333.anIntArray5[local53] = local9;
											Static36.anIntArrayArray11[local72 - 1][local82] = 2;
											local53 = local53 + 1 & 0xFFF;
											Static218.anIntArrayArray41[local72 - 1][local82] = local242;
											break;
										}
										if ((local58[local88 - 1][local284 + local94] & 0x4FA40000) != 0) {
											break;
										}
										local284++;
									}
								}
								if (128 - arg3 > local72 && Static36.anIntArrayArray11[local72 + 1][local82] == 0 && (local58[local88 + arg3][local94] & 0x60E40000) == 0 && (local58[local88 + arg3][local94 + arg3 - 1] & 0x78240000) == 0) {
									local284 = 1;
									while (true) {
										if (arg3 - 1 <= local284) {
											Static304.anIntArray499[local53] = local7 + 1;
											Static333.anIntArray5[local53] = local9;
											local53 = local53 + 1 & 0xFFF;
											Static36.anIntArrayArray11[local72 + 1][local82] = 8;
											Static218.anIntArrayArray41[local72 + 1][local82] = local242;
											break;
										}
										if ((local58[local88 + arg3][local94 + local284] & 0x78E40000) != 0) {
											break;
										}
										local284++;
									}
								}
								if (local82 > 0 && Static36.anIntArrayArray11[local72][local82 - 1] == 0 && (local58[local88][local94 - 1] & 0x43A40000) == 0 && (local58[arg3 + local88 - 1][local94 - 1] & 0x60E40000) == 0) {
									local284 = 1;
									while (true) {
										if (local284 >= arg3 - 1) {
											Static304.anIntArray499[local53] = local7;
											Static333.anIntArray5[local53] = local9 - 1;
											local53 = local53 + 1 & 0xFFF;
											Static36.anIntArrayArray11[local72][local82 - 1] = 1;
											Static218.anIntArrayArray41[local72][local82 - 1] = local242;
											break;
										}
										if ((local58[local88 + local284][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local284++;
									}
								}
								if (128 - arg3 > local82 && Static36.anIntArrayArray11[local72][local82 + 1] == 0 && (local58[local88][arg3 + local94] & 0x4E240000) == 0 && (local58[arg3 + local88 - 1][local94 + arg3] & 0x78240000) == 0) {
									local284 = 1;
									while (true) {
										if (local284 >= arg3 - 1) {
											Static304.anIntArray499[local53] = local7;
											Static333.anIntArray5[local53] = local9 + 1;
											Static36.anIntArrayArray11[local72][local82 + 1] = 4;
											local53 = local53 + 1 & 0xFFF;
											Static218.anIntArrayArray41[local72][local82 + 1] = local242;
											break;
										}
										if ((local58[local88 + local284][local94 + arg3] & 0x7E240000) != 0) {
											break;
										}
										local284++;
									}
								}
								if (local72 > 0 && local82 > 0 && Static36.anIntArrayArray11[local72 - 1][local82 - 1] == 0 && (local58[local88 - 1][local94 - 1] & 0x43A40000) == 0) {
									local284 = 1;
									while (true) {
										if (local284 >= arg3) {
											Static304.anIntArray499[local53] = local7 - 1;
											Static333.anIntArray5[local53] = local9 - 1;
											Static36.anIntArrayArray11[local72 - 1][local82 - 1] = 3;
											local53 = local53 + 1 & 0xFFF;
											Static218.anIntArrayArray41[local72 - 1][local82 - 1] = local242;
											break;
										}
										if ((local58[local88 - 1][local94 + local284 - 1] & 0x4FA40000) != 0 || (local58[local284 + local88 - 1][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local284++;
									}
								}
								if (local72 < 128 - arg3 && local82 > 0 && Static36.anIntArrayArray11[local72 + 1][local82 - 1] == 0 && (local58[arg3 + local88][local94 - 1] & 0x60E40000) == 0) {
									local284 = 1;
									while (true) {
										if (arg3 <= local284) {
											Static304.anIntArray499[local53] = local7 + 1;
											Static333.anIntArray5[local53] = local9 - 1;
											local53 = local53 + 1 & 0xFFF;
											Static36.anIntArrayArray11[local72 + 1][local82 - 1] = 9;
											Static218.anIntArrayArray41[local72 + 1][local82 - 1] = local242;
											break;
										}
										if ((local58[local88 + arg3][local94 + local284 - 1] & 0x78E40000) != 0 || (local58[local88 + local284][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local284++;
									}
								}
								if (local72 > 0 && 128 - arg3 > local82 && Static36.anIntArrayArray11[local72 - 1][local82 + 1] == 0 && (local58[local88 - 1][arg3 + local94] & 0x4E240000) == 0) {
									for (local284 = 1; local284 < arg3; local284++) {
										if ((local58[local88 - 1][local284 + local94] & 0x4FA40000) != 0 || (local58[local284 + local88 - 1][arg3 + local94] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static304.anIntArray499[local53] = local7 - 1;
									Static333.anIntArray5[local53] = local9 + 1;
									Static36.anIntArrayArray11[local72 - 1][local82 + 1] = 6;
									local53 = local53 + 1 & 0xFFF;
									Static218.anIntArrayArray41[local72 - 1][local82 + 1] = local242;
								}
							} while (local72 >= 128 - arg3);
						} while (local82 >= 128 - arg3);
					} while (Static36.anIntArrayArray11[local72 + 1][local82 + 1] != 0);
				} while ((local58[local88 + arg3][local94 + arg3] & 0x78240000) != 0);
				for (local284 = 1; local284 < arg3; local284++) {
					if ((local58[local88 + local284][arg3 + local94] & 0x7E240000) != 0 || (local58[local88 + arg3][local284 + local94] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static304.anIntArray499[local53] = local7 + 1;
				Static333.anIntArray5[local53] = local9 + 1;
				Static36.anIntArrayArray11[local72 + 1][local82 + 1] = 12;
				local53 = local53 + 1 & 0xFFF;
				Static218.anIntArrayArray41[local72 + 1][local82 + 1] = local242;
			}
		}
	}
}
