import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!kda", name = "g", descriptor = "I")
	public static int anInt5145;

	@OriginalMember(owner = "client!kda", name = "h", descriptor = "Lclient!xa;")
	public static Class13 aClass13_17;

	@OriginalMember(owner = "client!kda", name = "e", descriptor = "I")
	public static int anInt5143 = 0;

	@OriginalMember(owner = "client!kda", name = "f", descriptor = "I")
	public static int anInt5144 = 1;

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(B)[Lclient!os;")
	public static Class258[] method4356() {
		return new Class258[] { Static332.aClass258_14, Static327.aClass258_21, Static367.aClass258_20, Static583.aClass258_22, Static240.aClass258_12, Static406.aClass258_19, Static157.aClass258_15, Static547.aClass258_18, Static158.aClass258_11, Static289.aClass258_13 };
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(IIILclient!ed;IIIBIIII)Z")
	public static boolean method4358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class84 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg4;
		@Pc(14) int local14 = arg10;
		@Pc(23) int local23 = arg4 - 64;
		@Pc(27) int local27 = arg10 - 64;
		Static456.anIntArrayArray66[64][64] = 99;
		Static518.anIntArrayArray74[64][64] = 0;
		@Pc(41) byte local41 = 0;
		Static539.anIntArray693[0] = arg4;
		@Pc(47) int local47 = 0;
		@Pc(50) int local50 = local41 + 1;
		Static440.anIntArray616[0] = arg10;
		@Pc(55) int[][] local55 = arg3.anIntArrayArray37;
		while (true) {
			label282: while (true) {
				@Pc(81) int local81;
				@Pc(76) int local76;
				@Pc(87) int local87;
				@Pc(93) int local93;
				@Pc(242) int local242;
				@Pc(282) int local282;
				do {
					do {
						do {
							label259: do {
								if (local50 == local47) {
									Static499.anInt8659 = local7;
									Static437.anInt7500 = local14;
									return false;
								}
								local7 = Static539.anIntArray693[local47];
								local14 = Static440.anIntArray616[local47];
								local47 = local47 + 1 & 0xFFF;
								local76 = local14 - local27;
								local81 = local7 - local23;
								local87 = local7 - arg3.anInt2635;
								local93 = local14 - arg3.anInt2638;
								if (arg0 == -4) {
									if (local7 == arg9 && local14 == arg2) {
										Static499.anInt8659 = local7;
										Static437.anInt7500 = local14;
										return true;
									}
								} else if (arg0 == -3) {
									if (Static34.method7578(local14, arg6, arg1, arg5, arg9, arg6, arg2, local7)) {
										Static499.anInt8659 = local7;
										Static437.anInt7500 = local14;
										return true;
									}
								} else if (arg0 == -2) {
									if (arg3.method2357(arg6, arg5, arg6, arg2, local7, arg1, arg7, local14, arg9)) {
										Static437.anInt7500 = local14;
										Static499.anInt8659 = local7;
										return true;
									}
								} else if (arg0 == -1) {
									if (arg3.method2347(local7, arg6, arg2, arg5, local14, arg9, arg7, arg1)) {
										Static437.anInt7500 = local14;
										Static499.anInt8659 = local7;
										return true;
									}
								} else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
									if (arg3.method2346(arg6, arg2, local14, local7, arg0, arg8, arg9)) {
										Static437.anInt7500 = local14;
										Static499.anInt8659 = local7;
										return true;
									}
								} else if (arg3.method2348(local14, arg6, arg8, arg9, arg0, arg2, local7)) {
									Static499.anInt8659 = local7;
									Static437.anInt7500 = local14;
									return true;
								}
								local242 = Static518.anIntArrayArray74[local81][local76] + 1;
								if (local81 > 0 && Static456.anIntArrayArray66[local81 - 1][local76] == 0 && (local55[local87 - 1][local93] & 0x43A40000) == 0 && (local55[local87 - 1][local93 + arg6 - 1] & 0x4E240000) == 0) {
									local282 = 1;
									while (true) {
										if (local282 >= arg6 - 1) {
											Static539.anIntArray693[local50] = local7 - 1;
											Static440.anIntArray616[local50] = local14;
											local50 = local50 + 1 & 0xFFF;
											Static456.anIntArrayArray66[local81 - 1][local76] = 2;
											Static518.anIntArrayArray74[local81 - 1][local76] = local242;
											break;
										}
										if ((local55[local87 - 1][local282 + local93] & 0x4FA40000) != 0) {
											break;
										}
										local282++;
									}
								}
								if (128 - arg6 > local81 && Static456.anIntArrayArray66[local81 + 1][local76] == 0 && (local55[arg6 + local87][local93] & 0x60E40000) == 0 && (local55[local87 + arg6][local93 + arg6 - 1] & 0x78240000) == 0) {
									local282 = 1;
									while (true) {
										if (local282 >= arg6 - 1) {
											Static539.anIntArray693[local50] = local7 + 1;
											Static440.anIntArray616[local50] = local14;
											local50 = local50 + 1 & 0xFFF;
											Static456.anIntArrayArray66[local81 + 1][local76] = 8;
											Static518.anIntArrayArray74[local81 + 1][local76] = local242;
											break;
										}
										if ((local55[local87 + arg6][local282 + local93] & 0x78E40000) != 0) {
											break;
										}
										local282++;
									}
								}
								if (local76 > 0 && Static456.anIntArrayArray66[local81][local76 - 1] == 0 && (local55[local87][local93 - 1] & 0x43A40000) == 0 && (local55[local87 + arg6 - 1][local93 - 1] & 0x60E40000) == 0) {
									local282 = 1;
									while (true) {
										if (local282 >= arg6 - 1) {
											Static539.anIntArray693[local50] = local7;
											Static440.anIntArray616[local50] = local14 - 1;
											local50 = local50 + 1 & 0xFFF;
											Static456.anIntArrayArray66[local81][local76 - 1] = 1;
											Static518.anIntArrayArray74[local81][local76 - 1] = local242;
											break;
										}
										if ((local55[local282 + local87][local93 - 1] & 0x63E40000) != 0) {
											break;
										}
										local282++;
									}
								}
								if (local76 < 128 - arg6 && Static456.anIntArrayArray66[local81][local76 + 1] == 0 && (local55[local87][local93 + arg6] & 0x4E240000) == 0 && (local55[local87 + arg6 - 1][local93 + arg6] & 0x78240000) == 0) {
									local282 = 1;
									while (true) {
										if (arg6 - 1 <= local282) {
											Static539.anIntArray693[local50] = local7;
											Static440.anIntArray616[local50] = local14 + 1;
											local50 = local50 + 1 & 0xFFF;
											Static456.anIntArrayArray66[local81][local76 + 1] = 4;
											Static518.anIntArrayArray74[local81][local76 + 1] = local242;
											break;
										}
										if ((local55[local87 + local282][arg6 + local93] & 0x7E240000) != 0) {
											break;
										}
										local282++;
									}
								}
								if (local81 > 0 && local76 > 0 && Static456.anIntArrayArray66[local81 - 1][local76 - 1] == 0 && (local55[local87 - 1][local93 - 1] & 0x43A40000) == 0) {
									local282 = 1;
									while (true) {
										if (local282 >= arg6) {
											Static539.anIntArray693[local50] = local7 - 1;
											Static440.anIntArray616[local50] = local14 - 1;
											Static456.anIntArrayArray66[local81 - 1][local76 - 1] = 3;
											local50 = local50 + 1 & 0xFFF;
											Static518.anIntArrayArray74[local81 - 1][local76 - 1] = local242;
											break;
										}
										if ((local55[local87 - 1][local93 + local282 - 1] & 0x4FA40000) != 0 || (local55[local282 + local87 - 1][local93 - 1] & 0x63E40000) != 0) {
											break;
										}
										local282++;
									}
								}
								if (128 - arg6 > local81 && local76 > 0 && Static456.anIntArrayArray66[local81 + 1][local76 - 1] == 0 && (local55[arg6 + local87][local93 - 1] & 0x60E40000) == 0) {
									local282 = 1;
									while (true) {
										if (arg6 <= local282) {
											Static539.anIntArray693[local50] = local7 + 1;
											Static440.anIntArray616[local50] = local14 - 1;
											Static456.anIntArrayArray66[local81 + 1][local76 - 1] = 9;
											local50 = local50 + 1 & 0xFFF;
											Static518.anIntArrayArray74[local81 + 1][local76 - 1] = local242;
											break;
										}
										if ((local55[local87 + arg6][local282 + local93 - 1] & 0x78E40000) != 0 || (local55[local282 + local87][local93 - 1] & 0x63E40000) != 0) {
											break;
										}
										local282++;
									}
								}
								if (local81 > 0 && local76 < 128 - arg6 && Static456.anIntArrayArray66[local81 - 1][local76 + 1] == 0 && (local55[local87 - 1][arg6 + local93] & 0x4E240000) == 0) {
									for (local282 = 1; local282 < arg6; local282++) {
										if ((local55[local87 - 1][local93 + local282] & 0x4FA40000) != 0 || (local55[local282 + local87 - 1][arg6 + local93] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static539.anIntArray693[local50] = local7 - 1;
									Static440.anIntArray616[local50] = local14 + 1;
									local50 = local50 + 1 & 0xFFF;
									Static456.anIntArrayArray66[local81 - 1][local76 + 1] = 6;
									Static518.anIntArrayArray74[local81 - 1][local76 + 1] = local242;
								}
							} while (local81 >= 128 - arg6);
						} while (local76 >= 128 - arg6);
					} while (Static456.anIntArrayArray66[local81 + 1][local76 + 1] != 0);
				} while ((local55[local87 + arg6][arg6 + local93] & 0x78240000) != 0);
				for (local282 = 1; local282 < arg6; local282++) {
					if ((local55[local87 + local282][arg6 + local93] & 0x7E240000) != 0 || (local55[arg6 + local87][local282 + local93] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static539.anIntArray693[local50] = local7 + 1;
				Static440.anIntArray616[local50] = local14 + 1;
				Static456.anIntArrayArray66[local81 + 1][local76 + 1] = 12;
				local50 = local50 + 1 & 0xFFF;
				Static518.anIntArrayArray74[local81 + 1][local76 + 1] = local242;
			}
		}
	}
}
