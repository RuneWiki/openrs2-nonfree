import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static640 {

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "I")
	public static int anInt10180 = 0;

	@OriginalMember(owner = "client!wt", name = "e", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_137 = new Class130(62, 2);

	@OriginalMember(owner = "client!wt", name = "j", descriptor = "[[F")
	public static final float[][] aFloatArrayArray18 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@OriginalMember(owner = "client!wt", name = "k", descriptor = "[I")
	public static final int[] anIntArray665 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(III)Lclient!fe;")
	public static Class105 method8724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class105 local7 = new Class105();
		local7.anInt2961 = arg0 + 6;
		local7.anInt2957 = -1;
		local7.anInt2966 = arg1 + 5 + 1;
		local7.anInt2972 = -1;
		local7.anIntArrayArray19 = new int[local7.anInt2961][local7.anInt2966];
		local7.method2737();
		return local7;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIIIIILclient!fe;IIIII)Z")
	public static boolean method8725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class105 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		@Pc(7) int local7 = arg0;
		@Pc(9) int local9 = arg7;
		@Pc(18) int local18 = arg0 - 64;
		Static426.anIntArrayArray52[64][64] = 99;
		@Pc(29) int local29 = arg7 - 64;
		Static331.anIntArrayArray43[64][64] = 0;
		@Pc(37) byte local37 = 0;
		Static360.anIntArray409[0] = arg0;
		@Pc(43) int local43 = 0;
		@Pc(46) int local46 = local37 + 1;
		Static143.anIntArray139[0] = arg7;
		@Pc(51) int[][] local51 = arg6.anIntArrayArray19;
		while (true) {
			label282: while (true) {
				@Pc(65) int local65;
				@Pc(75) int local75;
				@Pc(81) int local81;
				@Pc(87) int local87;
				@Pc(237) int local237;
				@Pc(277) int local277;
				do {
					do {
						do {
							label259: do {
								if (local46 == local43) {
									Static574.anInt9453 = local7;
									Static496.anInt2424 = local9;
									return false;
								}
								local9 = Static143.anIntArray139[local43];
								local7 = Static360.anIntArray409[local43];
								local65 = local7 - local18;
								local43 = local43 + 1 & 0xFFF;
								local75 = local9 - local29;
								local81 = local7 - arg6.anInt2957;
								local87 = local9 - arg6.anInt2972;
								if (arg3 == -4) {
									if (local7 == arg9 && arg4 == local9) {
										Static496.anInt2424 = local9;
										Static574.anInt9453 = local7;
										return true;
									}
								} else if (arg3 == -3) {
									if (Static352.method5824(arg9, arg8, arg5, arg8, arg4, arg10, local9, local7)) {
										Static574.anInt9453 = local7;
										Static496.anInt2424 = local9;
										return true;
									}
								} else if (arg3 == -2) {
									if (arg6.method2727(arg8, arg2, arg8, arg4, arg5, local7, local9, arg10, arg9)) {
										Static496.anInt2424 = local9;
										Static574.anInt9453 = local7;
										return true;
									}
								} else if (arg3 == -1) {
									if (arg6.method2723(arg4, local7, arg9, local9, arg8, arg5, arg2, arg10)) {
										Static574.anInt9453 = local7;
										Static496.anInt2424 = local9;
										return true;
									}
								} else if (arg3 == 0 || arg3 == 1 || arg3 == 2 || arg3 == 3 || arg3 == 9) {
									if (arg6.method2724(arg3, arg9, local7, arg4, local9, arg8, arg1)) {
										Static496.anInt2424 = local9;
										Static574.anInt9453 = local7;
										return true;
									}
								} else if (arg6.method2734(arg4, arg1, arg9, arg3, local9, local7, arg8)) {
									Static496.anInt2424 = local9;
									Static574.anInt9453 = local7;
									return true;
								}
								local237 = Static331.anIntArrayArray43[local65][local75] + 1;
								if (local65 > 0 && Static426.anIntArrayArray52[local65 - 1][local75] == 0 && (local51[local81 - 1][local87] & 0x43A40000) == 0 && (local51[local81 - 1][local87 + arg8 - 1] & 0x4E240000) == 0) {
									local277 = 1;
									while (true) {
										if (arg8 - 1 <= local277) {
											Static360.anIntArray409[local46] = local7 - 1;
											Static143.anIntArray139[local46] = local9;
											Static426.anIntArrayArray52[local65 - 1][local75] = 2;
											local46 = local46 + 1 & 0xFFF;
											Static331.anIntArrayArray43[local65 - 1][local75] = local237;
											break;
										}
										if ((local51[local81 - 1][local277 + local87] & 0x4FA40000) != 0) {
											break;
										}
										local277++;
									}
								}
								if (128 - arg8 > local65 && Static426.anIntArrayArray52[local65 + 1][local75] == 0 && (local51[arg8 + local81][local87] & 0x60E40000) == 0 && (local51[arg8 + local81][arg8 + local87 - 1] & 0x78240000) == 0) {
									local277 = 1;
									while (true) {
										if (local277 >= arg8 - 1) {
											Static360.anIntArray409[local46] = local7 + 1;
											Static143.anIntArray139[local46] = local9;
											local46 = local46 + 1 & 0xFFF;
											Static426.anIntArrayArray52[local65 + 1][local75] = 8;
											Static331.anIntArrayArray43[local65 + 1][local75] = local237;
											break;
										}
										if ((local51[local81 + arg8][local277 + local87] & 0x78E40000) != 0) {
											break;
										}
										local277++;
									}
								}
								if (local75 > 0 && Static426.anIntArrayArray52[local65][local75 - 1] == 0 && (local51[local81][local87 - 1] & 0x43A40000) == 0 && (local51[arg8 + local81 - 1][local87 - 1] & 0x60E40000) == 0) {
									local277 = 1;
									while (true) {
										if (arg8 - 1 <= local277) {
											Static360.anIntArray409[local46] = local7;
											Static143.anIntArray139[local46] = local9 - 1;
											Static426.anIntArrayArray52[local65][local75 - 1] = 1;
											local46 = local46 + 1 & 0xFFF;
											Static331.anIntArrayArray43[local65][local75 - 1] = local237;
											break;
										}
										if ((local51[local277 + local81][local87 - 1] & 0x63E40000) != 0) {
											break;
										}
										local277++;
									}
								}
								if (local75 < 128 - arg8 && Static426.anIntArrayArray52[local65][local75 + 1] == 0 && (local51[local81][arg8 + local87] & 0x4E240000) == 0 && (local51[arg8 + local81 - 1][arg8 + local87] & 0x78240000) == 0) {
									local277 = 1;
									while (true) {
										if (local277 >= arg8 - 1) {
											Static360.anIntArray409[local46] = local7;
											Static143.anIntArray139[local46] = local9 + 1;
											Static426.anIntArrayArray52[local65][local75 + 1] = 4;
											local46 = local46 + 1 & 0xFFF;
											Static331.anIntArrayArray43[local65][local75 + 1] = local237;
											break;
										}
										if ((local51[local277 + local81][arg8 + local87] & 0x7E240000) != 0) {
											break;
										}
										local277++;
									}
								}
								if (local65 > 0 && local75 > 0 && Static426.anIntArrayArray52[local65 - 1][local75 - 1] == 0 && (local51[local81 - 1][local87 - 1] & 0x43A40000) == 0) {
									local277 = 1;
									while (true) {
										if (local277 >= arg8) {
											Static360.anIntArray409[local46] = local7 - 1;
											Static143.anIntArray139[local46] = local9 - 1;
											Static426.anIntArrayArray52[local65 - 1][local75 - 1] = 3;
											local46 = local46 + 1 & 0xFFF;
											Static331.anIntArrayArray43[local65 - 1][local75 - 1] = local237;
											break;
										}
										if ((local51[local81 - 1][local87 + local277 - 1] & 0x4FA40000) != 0 || (local51[local81 + local277 - 1][local87 - 1] & 0x63E40000) != 0) {
											break;
										}
										local277++;
									}
								}
								if (128 - arg8 > local65 && local75 > 0 && Static426.anIntArrayArray52[local65 + 1][local75 - 1] == 0 && (local51[local81 + arg8][local87 - 1] & 0x60E40000) == 0) {
									local277 = 1;
									while (true) {
										if (local277 >= arg8) {
											Static360.anIntArray409[local46] = local7 + 1;
											Static143.anIntArray139[local46] = local9 - 1;
											Static426.anIntArrayArray52[local65 + 1][local75 - 1] = 9;
											local46 = local46 + 1 & 0xFFF;
											Static331.anIntArrayArray43[local65 + 1][local75 - 1] = local237;
											break;
										}
										if ((local51[local81 + arg8][local277 + local87 - 1] & 0x78E40000) != 0 || (local51[local81 + local277][local87 - 1] & 0x63E40000) != 0) {
											break;
										}
										local277++;
									}
								}
								if (local65 > 0 && local75 < 128 - arg8 && Static426.anIntArrayArray52[local65 - 1][local75 + 1] == 0 && (local51[local81 - 1][local87 + arg8] & 0x4E240000) == 0) {
									for (local277 = 1; local277 < arg8; local277++) {
										if ((local51[local81 - 1][local277 + local87] & 0x4FA40000) != 0 || (local51[local277 + local81 - 1][arg8 + local87] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static360.anIntArray409[local46] = local7 - 1;
									Static143.anIntArray139[local46] = local9 + 1;
									local46 = local46 + 1 & 0xFFF;
									Static426.anIntArrayArray52[local65 - 1][local75 + 1] = 6;
									Static331.anIntArrayArray43[local65 - 1][local75 + 1] = local237;
								}
							} while (local65 >= 128 - arg8);
						} while (128 - arg8 <= local75);
					} while (Static426.anIntArrayArray52[local65 + 1][local75 + 1] != 0);
				} while ((local51[local81 + arg8][arg8 + local87] & 0x78240000) != 0);
				for (local277 = 1; local277 < arg8; local277++) {
					if ((local51[local81 + local277][arg8 + local87] & 0x7E240000) != 0 || (local51[local81 + arg8][local87 + local277] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static360.anIntArray409[local46] = local7 + 1;
				Static143.anIntArray139[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static426.anIntArrayArray52[local65 + 1][local75 + 1] = 12;
				Static331.anIntArrayArray43[local65 + 1][local75 + 1] = local237;
			}
		}
	}
}
