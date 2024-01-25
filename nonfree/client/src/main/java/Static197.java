import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!iba", name = "r", descriptor = "Lclient!kea;")
	public static Class161 aClass161_44;

	@OriginalMember(owner = "client!iba", name = "s", descriptor = "I")
	public static int anInt4463 = 500;

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(IIIIILclient!vi;IIIIII)Z")
	public static boolean method3740(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class306 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg8;
		@Pc(9) int local9 = arg1;
		@Pc(18) int local18 = arg8 - 64;
		@Pc(23) int local23 = arg1 - 64;
		Static474.anIntArrayArray80[64][64] = 99;
		Static290.anIntArrayArray56[64][64] = 0;
		@Pc(42) byte local42 = 0;
		Static135.anIntArray273[0] = arg8;
		@Pc(48) int local48 = 0;
		@Pc(51) int local51 = local42 + 1;
		Static142.anIntArray282[0] = arg1;
		@Pc(56) int[][] local56 = arg4.anIntArrayArray85;
		while (true) {
			label282: while (true) {
				@Pc(76) int local76;
				@Pc(81) int local81;
				@Pc(86) int local86;
				@Pc(92) int local92;
				@Pc(243) int local243;
				@Pc(288) int local288;
				do {
					do {
						do {
							label259: do {
								if (local51 == local48) {
									Static335.anInt3038 = local7;
									Static23.anInt6895 = local9;
									return false;
								}
								local9 = Static142.anIntArray282[local48];
								local7 = Static135.anIntArray273[local48];
								local48 = local48 + 1 & 0xFFF;
								local76 = local7 - local18;
								local81 = local9 - local23;
								local86 = local7 - arg4.anInt8975;
								local92 = local9 - arg4.anInt8969;
								if (arg5 == -4) {
									if (local7 == arg0 && local9 == arg7) {
										Static335.anInt3038 = local7;
										Static23.anInt6895 = local9;
										return true;
									}
								} else if (arg5 == -3) {
									if (Static467.method6978(arg0, arg6, local9, arg2, arg7, local7, arg10, arg6)) {
										Static335.anInt3038 = local7;
										Static23.anInt6895 = local9;
										return true;
									}
								} else if (arg5 == -2) {
									if (arg4.method7355(local7, arg6, arg10, arg9, arg7, arg0, local9, arg2, arg6)) {
										Static335.anInt3038 = local7;
										Static23.anInt6895 = local9;
										return true;
									}
								} else if (arg5 == -1) {
									if (arg4.method7356(arg2, local9, arg10, arg7, arg0, local7, arg9, arg6)) {
										Static23.anInt6895 = local9;
										Static335.anInt3038 = local7;
										return true;
									}
								} else if (arg5 == 0 || arg5 == 1 || arg5 == 2 || arg5 == 3 || arg5 == 9) {
									if (arg4.method7369(arg5, arg3, arg0, arg7, local9, local7, arg6)) {
										Static335.anInt3038 = local7;
										Static23.anInt6895 = local9;
										return true;
									}
								} else if (arg4.method7368(arg0, local9, local7, arg5, arg6, arg7, arg3)) {
									Static23.anInt6895 = local9;
									Static335.anInt3038 = local7;
									return true;
								}
								local243 = Static290.anIntArrayArray56[local76][local81] + 1;
								if (local76 > 0 && Static474.anIntArrayArray80[local76 - 1][local81] == 0 && (local56[local86 - 1][local92] & 0x43A40000) == 0 && (local56[local86 - 1][arg6 + local92 - 1] & 0x4E240000) == 0) {
									local288 = 1;
									while (true) {
										if (local288 >= arg6 - 1) {
											Static135.anIntArray273[local51] = local7 - 1;
											Static142.anIntArray282[local51] = local9;
											Static474.anIntArrayArray80[local76 - 1][local81] = 2;
											local51 = local51 + 1 & 0xFFF;
											Static290.anIntArrayArray56[local76 - 1][local81] = local243;
											break;
										}
										if ((local56[local86 - 1][local288 + local92] & 0x4FA40000) != 0) {
											break;
										}
										local288++;
									}
								}
								if (128 - arg6 > local76 && Static474.anIntArrayArray80[local76 + 1][local81] == 0 && (local56[local86 + arg6][local92] & 0x60E40000) == 0 && (local56[arg6 + local86][arg6 + local92 - 1] & 0x78240000) == 0) {
									local288 = 1;
									while (true) {
										if (arg6 - 1 <= local288) {
											Static135.anIntArray273[local51] = local7 + 1;
											Static142.anIntArray282[local51] = local9;
											Static474.anIntArrayArray80[local76 + 1][local81] = 8;
											local51 = local51 + 1 & 0xFFF;
											Static290.anIntArrayArray56[local76 + 1][local81] = local243;
											break;
										}
										if ((local56[local86 + arg6][local92 + local288] & 0x78E40000) != 0) {
											break;
										}
										local288++;
									}
								}
								if (local81 > 0 && Static474.anIntArrayArray80[local76][local81 - 1] == 0 && (local56[local86][local92 - 1] & 0x43A40000) == 0 && (local56[arg6 + local86 - 1][local92 - 1] & 0x60E40000) == 0) {
									local288 = 1;
									while (true) {
										if (arg6 - 1 <= local288) {
											Static135.anIntArray273[local51] = local7;
											Static142.anIntArray282[local51] = local9 - 1;
											Static474.anIntArrayArray80[local76][local81 - 1] = 1;
											local51 = local51 + 1 & 0xFFF;
											Static290.anIntArrayArray56[local76][local81 - 1] = local243;
											break;
										}
										if ((local56[local86 + local288][local92 - 1] & 0x63E40000) != 0) {
											break;
										}
										local288++;
									}
								}
								if (128 - arg6 > local81 && Static474.anIntArrayArray80[local76][local81 + 1] == 0 && (local56[local86][arg6 + local92] & 0x4E240000) == 0 && (local56[arg6 + local86 - 1][local92 + arg6] & 0x78240000) == 0) {
									local288 = 1;
									while (true) {
										if (arg6 - 1 <= local288) {
											Static135.anIntArray273[local51] = local7;
											Static142.anIntArray282[local51] = local9 + 1;
											local51 = local51 + 1 & 0xFFF;
											Static474.anIntArrayArray80[local76][local81 + 1] = 4;
											Static290.anIntArrayArray56[local76][local81 + 1] = local243;
											break;
										}
										if ((local56[local86 + local288][local92 + arg6] & 0x7E240000) != 0) {
											break;
										}
										local288++;
									}
								}
								if (local76 > 0 && local81 > 0 && Static474.anIntArrayArray80[local76 - 1][local81 - 1] == 0 && (local56[local86 - 1][local92 - 1] & 0x43A40000) == 0) {
									local288 = 1;
									while (true) {
										if (arg6 <= local288) {
											Static135.anIntArray273[local51] = local7 - 1;
											Static142.anIntArray282[local51] = local9 - 1;
											local51 = local51 + 1 & 0xFFF;
											Static474.anIntArrayArray80[local76 - 1][local81 - 1] = 3;
											Static290.anIntArrayArray56[local76 - 1][local81 - 1] = local243;
											break;
										}
										if ((local56[local86 - 1][local92 + local288 - 1] & 0x4FA40000) != 0 || (local56[local288 + local86 - 1][local92 - 1] & 0x63E40000) != 0) {
											break;
										}
										local288++;
									}
								}
								if (128 - arg6 > local76 && local81 > 0 && Static474.anIntArrayArray80[local76 + 1][local81 - 1] == 0 && (local56[local86 + arg6][local92 - 1] & 0x60E40000) == 0) {
									local288 = 1;
									while (true) {
										if (arg6 <= local288) {
											Static135.anIntArray273[local51] = local7 + 1;
											Static142.anIntArray282[local51] = local9 - 1;
											local51 = local51 + 1 & 0xFFF;
											Static474.anIntArrayArray80[local76 + 1][local81 - 1] = 9;
											Static290.anIntArrayArray56[local76 + 1][local81 - 1] = local243;
											break;
										}
										if ((local56[local86 + arg6][local288 + local92 - 1] & 0x78E40000) != 0 || (local56[local86 + local288][local92 - 1] & 0x63E40000) != 0) {
											break;
										}
										local288++;
									}
								}
								if (local76 > 0 && 128 - arg6 > local81 && Static474.anIntArrayArray80[local76 - 1][local81 + 1] == 0 && (local56[local86 - 1][arg6 + local92] & 0x4E240000) == 0) {
									for (local288 = 1; local288 < arg6; local288++) {
										if ((local56[local86 - 1][local288 + local92] & 0x4FA40000) != 0 || (local56[local86 + local288 - 1][local92 + arg6] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static135.anIntArray273[local51] = local7 - 1;
									Static142.anIntArray282[local51] = local9 + 1;
									Static474.anIntArrayArray80[local76 - 1][local81 + 1] = 6;
									local51 = local51 + 1 & 0xFFF;
									Static290.anIntArrayArray56[local76 - 1][local81 + 1] = local243;
								}
							} while (local76 >= 128 - arg6);
						} while (local81 >= 128 - arg6);
					} while (Static474.anIntArrayArray80[local76 + 1][local81 + 1] != 0);
				} while ((local56[arg6 + local86][arg6 + local92] & 0x78240000) != 0);
				for (local288 = 1; local288 < arg6; local288++) {
					if ((local56[local288 + local86][arg6 + local92] & 0x7E240000) != 0 || (local56[arg6 + local86][local92 + local288] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static135.anIntArray273[local51] = local7 + 1;
				Static142.anIntArray282[local51] = local9 + 1;
				Static474.anIntArrayArray80[local76 + 1][local81 + 1] = 12;
				local51 = local51 + 1 & 0xFFF;
				Static290.anIntArrayArray56[local76 + 1][local81 + 1] = local243;
			}
		}
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(ZI)Z")
	public static boolean method3742(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 2 || arg0 == 4;
	}
}
