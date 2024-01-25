import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static439 {

	@OriginalMember(owner = "client!sj", name = "e", descriptor = "Lclient!kda;")
	public static Class160 aClass160_71;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIII)I")
	public static int method5139(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return arg1;
		} else if (local7 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg1;
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIILclient!vba;IIIIIIII)Z")
	public static boolean method5140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class299 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(5) int local5 = arg5;
		@Pc(7) int local7 = arg1;
		@Pc(16) int local16 = arg5 - 64;
		Static355.anIntArrayArray24[64][64] = 99;
		@Pc(27) int local27 = arg1 - 64;
		Static143.anIntArrayArray30[64][64] = 0;
		@Pc(35) byte local35 = 0;
		@Pc(46) int local46 = 0;
		Static460.anIntArray620[0] = arg5;
		@Pc(53) int local53 = local35 + 1;
		Static529.anIntArray773[0] = arg1;
		@Pc(58) int[][] local58 = arg3.anIntArrayArray84;
		while (true) {
			label282: while (true) {
				@Pc(76) int local76;
				@Pc(71) int local71;
				@Pc(88) int local88;
				@Pc(94) int local94;
				@Pc(239) int local239;
				@Pc(281) int local281;
				do {
					do {
						do {
							label259: do {
								if (local53 == local46) {
									Static144.anInt3323 = local5;
									Static504.anInt8566 = local7;
									return false;
								}
								local7 = Static529.anIntArray773[local46];
								local5 = Static460.anIntArray620[local46];
								local71 = local7 - local27;
								local76 = local5 - local16;
								local46 = local46 + 1 & 0xFFF;
								local88 = local5 - arg3.anInt8548;
								local94 = local7 - arg3.anInt8569;
								if (arg4 == -4) {
									if (arg10 == local5 && arg7 == local7) {
										Static504.anInt8566 = local7;
										Static144.anInt3323 = local5;
										return true;
									}
								} else if (arg4 == -3) {
									if (Static76.method1970(arg0, arg10, local5, local7, arg9, arg7, arg8, arg0)) {
										Static504.anInt8566 = local7;
										Static144.anInt3323 = local5;
										return true;
									}
								} else if (arg4 == -2) {
									if (arg3.method7242(local5, arg9, arg0, arg2, arg0, local7, arg10, arg8, arg7)) {
										Static504.anInt8566 = local7;
										Static144.anInt3323 = local5;
										return true;
									}
								} else if (arg4 == -1) {
									if (arg3.method7227(arg7, arg0, arg10, local5, arg9, local7, arg2, arg8)) {
										Static504.anInt8566 = local7;
										Static144.anInt3323 = local5;
										return true;
									}
								} else if (arg4 == 0 || arg4 == 1 || arg4 == 2 || arg4 == 3 || arg4 == 9) {
									if (arg3.method7240(arg7, local7, arg0, arg6, arg10, arg4, local5)) {
										Static504.anInt8566 = local7;
										Static144.anInt3323 = local5;
										return true;
									}
								} else if (arg3.method7236(arg0, local7, arg7, arg10, arg4, arg6, local5)) {
									Static504.anInt8566 = local7;
									Static144.anInt3323 = local5;
									return true;
								}
								local239 = Static143.anIntArrayArray30[local76][local71] + 1;
								if (local76 > 0 && Static355.anIntArrayArray24[local76 - 1][local71] == 0 && (local58[local88 - 1][local94] & 0x43A40000) == 0 && (local58[local88 - 1][local94 + arg0 - 1] & 0x4E240000) == 0) {
									local281 = 1;
									while (true) {
										if (local281 >= arg0 - 1) {
											Static460.anIntArray620[local53] = local5 - 1;
											Static529.anIntArray773[local53] = local7;
											local53 = local53 + 1 & 0xFFF;
											Static355.anIntArrayArray24[local76 - 1][local71] = 2;
											Static143.anIntArrayArray30[local76 - 1][local71] = local239;
											break;
										}
										if ((local58[local88 - 1][local94 + local281] & 0x4FA40000) != 0) {
											break;
										}
										local281++;
									}
								}
								if (local76 < 128 - arg0 && Static355.anIntArrayArray24[local76 + 1][local71] == 0 && (local58[arg0 + local88][local94] & 0x60E40000) == 0 && (local58[local88 + arg0][local94 + arg0 - 1] & 0x78240000) == 0) {
									local281 = 1;
									while (true) {
										if (local281 >= arg0 - 1) {
											Static460.anIntArray620[local53] = local5 + 1;
											Static529.anIntArray773[local53] = local7;
											local53 = local53 + 1 & 0xFFF;
											Static355.anIntArrayArray24[local76 + 1][local71] = 8;
											Static143.anIntArrayArray30[local76 + 1][local71] = local239;
											break;
										}
										if ((local58[local88 + arg0][local94 + local281] & 0x78E40000) != 0) {
											break;
										}
										local281++;
									}
								}
								if (local71 > 0 && Static355.anIntArrayArray24[local76][local71 - 1] == 0 && (local58[local88][local94 - 1] & 0x43A40000) == 0 && (local58[local88 + arg0 - 1][local94 - 1] & 0x60E40000) == 0) {
									local281 = 1;
									while (true) {
										if (arg0 - 1 <= local281) {
											Static460.anIntArray620[local53] = local5;
											Static529.anIntArray773[local53] = local7 - 1;
											Static355.anIntArrayArray24[local76][local71 - 1] = 1;
											local53 = local53 + 1 & 0xFFF;
											Static143.anIntArrayArray30[local76][local71 - 1] = local239;
											break;
										}
										if ((local58[local281 + local88][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local281++;
									}
								}
								if (128 - arg0 > local71 && Static355.anIntArrayArray24[local76][local71 + 1] == 0 && (local58[local88][local94 + arg0] & 0x4E240000) == 0 && (local58[arg0 + local88 - 1][arg0 + local94] & 0x78240000) == 0) {
									local281 = 1;
									while (true) {
										if (local281 >= arg0 - 1) {
											Static460.anIntArray620[local53] = local5;
											Static529.anIntArray773[local53] = local7 + 1;
											local53 = local53 + 1 & 0xFFF;
											Static355.anIntArrayArray24[local76][local71 + 1] = 4;
											Static143.anIntArrayArray30[local76][local71 + 1] = local239;
											break;
										}
										if ((local58[local281 + local88][arg0 + local94] & 0x7E240000) != 0) {
											break;
										}
										local281++;
									}
								}
								if (local76 > 0 && local71 > 0 && Static355.anIntArrayArray24[local76 - 1][local71 - 1] == 0 && (local58[local88 - 1][local94 - 1] & 0x43A40000) == 0) {
									local281 = 1;
									while (true) {
										if (local281 >= arg0) {
											Static460.anIntArray620[local53] = local5 - 1;
											Static529.anIntArray773[local53] = local7 - 1;
											Static355.anIntArrayArray24[local76 - 1][local71 - 1] = 3;
											local53 = local53 + 1 & 0xFFF;
											Static143.anIntArrayArray30[local76 - 1][local71 - 1] = local239;
											break;
										}
										if ((local58[local88 - 1][local281 + local94 - 1] & 0x4FA40000) != 0 || (local58[local88 + local281 - 1][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local281++;
									}
								}
								if (local76 < 128 - arg0 && local71 > 0 && Static355.anIntArrayArray24[local76 + 1][local71 - 1] == 0 && (local58[local88 + arg0][local94 - 1] & 0x60E40000) == 0) {
									local281 = 1;
									while (true) {
										if (arg0 <= local281) {
											Static460.anIntArray620[local53] = local5 + 1;
											Static529.anIntArray773[local53] = local7 - 1;
											local53 = local53 + 1 & 0xFFF;
											Static355.anIntArrayArray24[local76 + 1][local71 - 1] = 9;
											Static143.anIntArrayArray30[local76 + 1][local71 - 1] = local239;
											break;
										}
										if ((local58[arg0 + local88][local94 + local281 - 1] & 0x78E40000) != 0 || (local58[local281 + local88][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local281++;
									}
								}
								if (local76 > 0 && local71 < 128 - arg0 && Static355.anIntArrayArray24[local76 - 1][local71 + 1] == 0 && (local58[local88 - 1][local94 + arg0] & 0x4E240000) == 0) {
									for (local281 = 1; local281 < arg0; local281++) {
										if ((local58[local88 - 1][local281 + local94] & 0x4FA40000) != 0 || (local58[local281 + local88 - 1][local94 + arg0] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static460.anIntArray620[local53] = local5 - 1;
									Static529.anIntArray773[local53] = local7 + 1;
									local53 = local53 + 1 & 0xFFF;
									Static355.anIntArrayArray24[local76 - 1][local71 + 1] = 6;
									Static143.anIntArrayArray30[local76 - 1][local71 + 1] = local239;
								}
							} while (local76 >= 128 - arg0);
						} while (local71 >= 128 - arg0);
					} while (Static355.anIntArrayArray24[local76 + 1][local71 + 1] != 0);
				} while ((local58[local88 + arg0][arg0 + local94] & 0x78240000) != 0);
				for (local281 = 1; local281 < arg0; local281++) {
					if ((local58[local281 + local88][arg0 + local94] & 0x7E240000) != 0 || (local58[arg0 + local88][local281 + local94] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static460.anIntArray620[local53] = local5 + 1;
				Static529.anIntArray773[local53] = local7 + 1;
				local53 = local53 + 1 & 0xFFF;
				Static355.anIntArrayArray24[local76 + 1][local71 + 1] = 12;
				Static143.anIntArrayArray30[local76 + 1][local71 + 1] = local239;
			}
		}
	}
}
