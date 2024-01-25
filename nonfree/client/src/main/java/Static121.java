import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!fo", name = "l", descriptor = "Z")
	public static boolean aBoolean154;

	@OriginalMember(owner = "client!fo", name = "x", descriptor = "I")
	public static int anInt2075;

	@OriginalMember(owner = "client!fo", name = "y", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray19;

	@OriginalMember(owner = "client!fo", name = "g", descriptor = "[I")
	public static final int[] anIntArray98 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!fo", name = "k", descriptor = "[F")
	public static final float[] aFloatArray6 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!fo", name = "q", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_93 = new Class137(64, -1);

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIIIIIIILclient!vb;III)Z")
	public static boolean method1656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class247 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg8;
		@Pc(9) int local9 = arg4;
		@Pc(18) int local18 = arg8 - 64;
		@Pc(23) int local23 = arg4 - 64;
		Static411.anIntArrayArray171[64][64] = 99;
		Static397.anIntArrayArray162[64][64] = 0;
		@Pc(37) byte local37 = 0;
		@Pc(39) int local39 = 0;
		Static40.anIntArray253[0] = arg8;
		@Pc(51) int local51 = local37 + 1;
		Static145.anIntArray117[0] = arg4;
		@Pc(56) int[][] local56 = arg7.anIntArrayArray179;
		while (true) {
			label282: while (true) {
				@Pc(77) int local77;
				@Pc(82) int local82;
				@Pc(88) int local88;
				@Pc(94) int local94;
				@Pc(236) int local236;
				@Pc(284) int local284;
				do {
					do {
						do {
							label259: do {
								if (local51 == local39) {
									Static341.anInt5564 = local9;
									Static410.anInt6682 = local7;
									return false;
								}
								local9 = Static145.anIntArray117[local39];
								local7 = Static40.anIntArray253[local39];
								local39 = local39 + 1 & 0xFFF;
								local77 = local7 - local18;
								local82 = local9 - local23;
								local88 = local7 - arg7.anInt6878;
								local94 = local9 - arg7.anInt6866;
								if (arg9 == -4) {
									if (local7 == arg6 && arg0 == local9) {
										Static410.anInt6682 = local7;
										Static341.anInt5564 = local9;
										return true;
									}
								} else if (arg9 == -3) {
									if (Static177.method2368(arg0, local7, arg5, arg10, local9, arg2, arg5, arg6)) {
										Static410.anInt6682 = local7;
										Static341.anInt5564 = local9;
										return true;
									}
								} else if (arg9 == -2) {
									if (arg7.method5266(local9, arg2, arg0, arg5, arg5, arg10, arg3, arg6, local7)) {
										Static341.anInt5564 = local9;
										Static410.anInt6682 = local7;
										return true;
									}
								} else if (arg9 == -1) {
									if (arg7.method5264(arg10, arg0, arg3, arg6, local7, arg5, arg2, local9)) {
										Static341.anInt5564 = local9;
										Static410.anInt6682 = local7;
										return true;
									}
								} else if (arg9 == 0 || arg9 == 1 || arg9 == 2 || arg9 == 3 || arg9 == 9) {
									if (arg7.method5260(local9, arg9, arg5, arg6, arg0, local7, arg1)) {
										Static410.anInt6682 = local7;
										Static341.anInt5564 = local9;
										return true;
									}
								} else if (arg7.method5272(arg5, local9, arg6, arg9, local7, arg0, arg1)) {
									Static341.anInt5564 = local9;
									Static410.anInt6682 = local7;
									return true;
								}
								local236 = Static397.anIntArrayArray162[local77][local82] + 1;
								if (local77 > 0 && Static411.anIntArrayArray171[local77 - 1][local82] == 0 && (local56[local88 - 1][local94] & 0x43A40000) == 0 && (local56[local88 - 1][arg5 + local94 - 1] & 0x4E240000) == 0) {
									local284 = 1;
									while (true) {
										if (arg5 - 1 <= local284) {
											Static40.anIntArray253[local51] = local7 - 1;
											Static145.anIntArray117[local51] = local9;
											local51 = local51 + 1 & 0xFFF;
											Static411.anIntArrayArray171[local77 - 1][local82] = 2;
											Static397.anIntArrayArray162[local77 - 1][local82] = local236;
											break;
										}
										if ((local56[local88 - 1][local284 + local94] & 0x4FA40000) != 0) {
											break;
										}
										local284++;
									}
								}
								if (local77 < 128 - arg5 && Static411.anIntArrayArray171[local77 + 1][local82] == 0 && (local56[local88 + arg5][local94] & 0x60E40000) == 0 && (local56[local88 + arg5][arg5 + local94 - 1] & 0x78240000) == 0) {
									local284 = 1;
									while (true) {
										if (local284 >= arg5 - 1) {
											Static40.anIntArray253[local51] = local7 + 1;
											Static145.anIntArray117[local51] = local9;
											local51 = local51 + 1 & 0xFFF;
											Static411.anIntArrayArray171[local77 + 1][local82] = 8;
											Static397.anIntArrayArray162[local77 + 1][local82] = local236;
											break;
										}
										if ((local56[local88 + arg5][local94 + local284] & 0x78E40000) != 0) {
											break;
										}
										local284++;
									}
								}
								if (local82 > 0 && Static411.anIntArrayArray171[local77][local82 - 1] == 0 && (local56[local88][local94 - 1] & 0x43A40000) == 0 && (local56[arg5 + local88 - 1][local94 - 1] & 0x60E40000) == 0) {
									local284 = 1;
									while (true) {
										if (arg5 - 1 <= local284) {
											Static40.anIntArray253[local51] = local7;
											Static145.anIntArray117[local51] = local9 - 1;
											Static411.anIntArrayArray171[local77][local82 - 1] = 1;
											local51 = local51 + 1 & 0xFFF;
											Static397.anIntArrayArray162[local77][local82 - 1] = local236;
											break;
										}
										if ((local56[local88 + local284][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local284++;
									}
								}
								if (local82 < 128 - arg5 && Static411.anIntArrayArray171[local77][local82 + 1] == 0 && (local56[local88][local94 + arg5] & 0x4E240000) == 0 && (local56[arg5 + local88 - 1][arg5 + local94] & 0x78240000) == 0) {
									local284 = 1;
									while (true) {
										if (local284 >= arg5 - 1) {
											Static40.anIntArray253[local51] = local7;
											Static145.anIntArray117[local51] = local9 + 1;
											Static411.anIntArrayArray171[local77][local82 + 1] = 4;
											local51 = local51 + 1 & 0xFFF;
											Static397.anIntArrayArray162[local77][local82 + 1] = local236;
											break;
										}
										if ((local56[local88 + local284][local94 + arg5] & 0x7E240000) != 0) {
											break;
										}
										local284++;
									}
								}
								if (local77 > 0 && local82 > 0 && Static411.anIntArrayArray171[local77 - 1][local82 - 1] == 0 && (local56[local88 - 1][local94 - 1] & 0x43A40000) == 0) {
									local284 = 1;
									while (true) {
										if (arg5 <= local284) {
											Static40.anIntArray253[local51] = local7 - 1;
											Static145.anIntArray117[local51] = local9 - 1;
											Static411.anIntArrayArray171[local77 - 1][local82 - 1] = 3;
											local51 = local51 + 1 & 0xFFF;
											Static397.anIntArrayArray162[local77 - 1][local82 - 1] = local236;
											break;
										}
										if ((local56[local88 - 1][local284 + local94 - 1] & 0x4FA40000) != 0 || (local56[local88 + local284 - 1][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local284++;
									}
								}
								if (local77 < 128 - arg5 && local82 > 0 && Static411.anIntArrayArray171[local77 + 1][local82 - 1] == 0 && (local56[local88 + arg5][local94 - 1] & 0x60E40000) == 0) {
									local284 = 1;
									while (true) {
										if (local284 >= arg5) {
											Static40.anIntArray253[local51] = local7 + 1;
											Static145.anIntArray117[local51] = local9 - 1;
											Static411.anIntArrayArray171[local77 + 1][local82 - 1] = 9;
											local51 = local51 + 1 & 0xFFF;
											Static397.anIntArrayArray162[local77 + 1][local82 - 1] = local236;
											break;
										}
										if ((local56[arg5 + local88][local284 + local94 - 1] & 0x78E40000) != 0 || (local56[local284 + local88][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local284++;
									}
								}
								if (local77 > 0 && 128 - arg5 > local82 && Static411.anIntArrayArray171[local77 - 1][local82 + 1] == 0 && (local56[local88 - 1][arg5 + local94] & 0x4E240000) == 0) {
									for (local284 = 1; local284 < arg5; local284++) {
										if ((local56[local88 - 1][local284 + local94] & 0x4FA40000) != 0 || (local56[local88 + local284 - 1][arg5 + local94] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static40.anIntArray253[local51] = local7 - 1;
									Static145.anIntArray117[local51] = local9 + 1;
									Static411.anIntArrayArray171[local77 - 1][local82 + 1] = 6;
									local51 = local51 + 1 & 0xFFF;
									Static397.anIntArrayArray162[local77 - 1][local82 + 1] = local236;
								}
							} while (local77 >= 128 - arg5);
						} while (local82 >= 128 - arg5);
					} while (Static411.anIntArrayArray171[local77 + 1][local82 + 1] != 0);
				} while ((local56[local88 + arg5][local94 + arg5] & 0x78240000) != 0);
				for (local284 = 1; local284 < arg5; local284++) {
					if ((local56[local284 + local88][arg5 + local94] & 0x7E240000) != 0 || (local56[local88 + arg5][local284 + local94] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static40.anIntArray253[local51] = local7 + 1;
				Static145.anIntArray117[local51] = local9 + 1;
				Static411.anIntArrayArray171[local77 + 1][local82 + 1] = 12;
				local51 = local51 + 1 & 0xFFF;
				Static397.anIntArrayArray162[local77 + 1][local82 + 1] = local236;
			}
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILclient!dh;)Lclient!ke;")
	public static Class63_Sub2 method1658(@OriginalArg(1) Class1_Sub11 arg0) {
		return new Class63_Sub2(arg0.method4482(), arg0.method4482(), arg0.method4482(), arg0.method4482(), arg0.method4493(), arg0.method4493(), arg0.method4463());
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(B)V")
	public static void method1659() {
		Static200.aClass257_15.method5499();
	}
}
