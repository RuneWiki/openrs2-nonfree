import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!jk", name = "q", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_130 = new Class202("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!jk", name = "s", descriptor = "Lclient!qc;")
	public static final Class231 aClass231_40 = new Class231(64);

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIILclient!gea;IIIIIII)Z")
	public static boolean method3578(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class99 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		@Pc(7) int local7 = arg1;
		@Pc(9) int local9 = arg5;
		@Pc(17) int local17 = arg1 - 64;
		Static198.anIntArrayArray43[64][64] = 99;
		@Pc(27) int local27 = arg5 - 64;
		Static78.anIntArrayArray8[64][64] = 0;
		@Pc(35) byte local35 = 0;
		Static541.anIntArray764[0] = arg1;
		@Pc(41) int local41 = 0;
		@Pc(49) int local49 = local35 + 1;
		Static523.anIntArray696[0] = arg5;
		@Pc(54) int[][] local54 = arg4.anIntArrayArray42;
		while (true) {
			label282: while (true) {
				@Pc(80) int local80;
				@Pc(69) int local69;
				@Pc(85) int local85;
				@Pc(91) int local91;
				@Pc(235) int local235;
				@Pc(280) int local280;
				do {
					do {
						do {
							label259: do {
								if (local49 == local41) {
									Static274.anInt4977 = local9;
									Static184.anInt3393 = local7;
									return false;
								}
								local7 = Static541.anIntArray764[local41];
								local9 = Static523.anIntArray696[local41];
								local69 = local9 - local27;
								local41 = local41 + 1 & 0xFFF;
								local80 = local7 - local17;
								local85 = local7 - arg4.anInt2805;
								local91 = local9 - arg4.anInt2817;
								if (arg0 == -4) {
									if (local7 == arg7 && local9 == arg2) {
										Static274.anInt4977 = local9;
										Static184.anInt3393 = local7;
										return true;
									}
								} else if (arg0 == -3) {
									if (Static112.method2186(arg9, arg8, local9, arg7, arg2, local7, arg9, arg10)) {
										Static274.anInt4977 = local9;
										Static184.anInt3393 = local7;
										return true;
									}
								} else if (arg0 == -2) {
									if (arg4.method2640(arg7, arg9, local7, arg10, arg9, arg6, local9, arg8, arg2)) {
										Static184.anInt3393 = local7;
										Static274.anInt4977 = local9;
										return true;
									}
								} else if (arg0 == -1) {
									if (arg4.method2647(arg9, arg10, local9, arg7, local7, arg6, arg8, arg2)) {
										Static184.anInt3393 = local7;
										Static274.anInt4977 = local9;
										return true;
									}
								} else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
									if (arg4.method2635(local9, arg3, arg7, local7, arg9, arg2, arg0)) {
										Static274.anInt4977 = local9;
										Static184.anInt3393 = local7;
										return true;
									}
								} else if (arg4.method2649(arg0, arg7, arg3, local7, arg2, arg9, local9)) {
									Static274.anInt4977 = local9;
									Static184.anInt3393 = local7;
									return true;
								}
								local235 = Static78.anIntArrayArray8[local80][local69] + 1;
								if (local80 > 0 && Static198.anIntArrayArray43[local80 - 1][local69] == 0 && (local54[local85 - 1][local91] & 0x43A40000) == 0 && (local54[local85 - 1][arg9 + local91 - 1] & 0x4E240000) == 0) {
									local280 = 1;
									while (true) {
										if (local280 >= arg9 - 1) {
											Static541.anIntArray764[local49] = local7 - 1;
											Static523.anIntArray696[local49] = local9;
											Static198.anIntArrayArray43[local80 - 1][local69] = 2;
											local49 = local49 + 1 & 0xFFF;
											Static78.anIntArrayArray8[local80 - 1][local69] = local235;
											break;
										}
										if ((local54[local85 - 1][local91 + local280] & 0x4FA40000) != 0) {
											break;
										}
										local280++;
									}
								}
								if (local80 < 128 - arg9 && Static198.anIntArrayArray43[local80 + 1][local69] == 0 && (local54[arg9 + local85][local91] & 0x60E40000) == 0 && (local54[arg9 + local85][local91 + arg9 - 1] & 0x78240000) == 0) {
									local280 = 1;
									while (true) {
										if (arg9 - 1 <= local280) {
											Static541.anIntArray764[local49] = local7 + 1;
											Static523.anIntArray696[local49] = local9;
											Static198.anIntArrayArray43[local80 + 1][local69] = 8;
											local49 = local49 + 1 & 0xFFF;
											Static78.anIntArrayArray8[local80 + 1][local69] = local235;
											break;
										}
										if ((local54[arg9 + local85][local91 + local280] & 0x78E40000) != 0) {
											break;
										}
										local280++;
									}
								}
								if (local69 > 0 && Static198.anIntArrayArray43[local80][local69 - 1] == 0 && (local54[local85][local91 - 1] & 0x43A40000) == 0 && (local54[local85 + arg9 - 1][local91 - 1] & 0x60E40000) == 0) {
									local280 = 1;
									while (true) {
										if (arg9 - 1 <= local280) {
											Static541.anIntArray764[local49] = local7;
											Static523.anIntArray696[local49] = local9 - 1;
											Static198.anIntArrayArray43[local80][local69 - 1] = 1;
											local49 = local49 + 1 & 0xFFF;
											Static78.anIntArrayArray8[local80][local69 - 1] = local235;
											break;
										}
										if ((local54[local280 + local85][local91 - 1] & 0x63E40000) != 0) {
											break;
										}
										local280++;
									}
								}
								if (128 - arg9 > local69 && Static198.anIntArrayArray43[local80][local69 + 1] == 0 && (local54[local85][arg9 + local91] & 0x4E240000) == 0 && (local54[local85 + arg9 - 1][arg9 + local91] & 0x78240000) == 0) {
									local280 = 1;
									while (true) {
										if (arg9 - 1 <= local280) {
											Static541.anIntArray764[local49] = local7;
											Static523.anIntArray696[local49] = local9 + 1;
											Static198.anIntArrayArray43[local80][local69 + 1] = 4;
											local49 = local49 + 1 & 0xFFF;
											Static78.anIntArrayArray8[local80][local69 + 1] = local235;
											break;
										}
										if ((local54[local85 + local280][local91 + arg9] & 0x7E240000) != 0) {
											break;
										}
										local280++;
									}
								}
								if (local80 > 0 && local69 > 0 && Static198.anIntArrayArray43[local80 - 1][local69 - 1] == 0 && (local54[local85 - 1][local91 - 1] & 0x43A40000) == 0) {
									local280 = 1;
									while (true) {
										if (local280 >= arg9) {
											Static541.anIntArray764[local49] = local7 - 1;
											Static523.anIntArray696[local49] = local9 - 1;
											local49 = local49 + 1 & 0xFFF;
											Static198.anIntArrayArray43[local80 - 1][local69 - 1] = 3;
											Static78.anIntArrayArray8[local80 - 1][local69 - 1] = local235;
											break;
										}
										if ((local54[local85 - 1][local280 + local91 - 1] & 0x4FA40000) != 0 || (local54[local85 + local280 - 1][local91 - 1] & 0x63E40000) != 0) {
											break;
										}
										local280++;
									}
								}
								if (local80 < 128 - arg9 && local69 > 0 && Static198.anIntArrayArray43[local80 + 1][local69 - 1] == 0 && (local54[local85 + arg9][local91 - 1] & 0x60E40000) == 0) {
									local280 = 1;
									while (true) {
										if (local280 >= arg9) {
											Static541.anIntArray764[local49] = local7 + 1;
											Static523.anIntArray696[local49] = local9 - 1;
											local49 = local49 + 1 & 0xFFF;
											Static198.anIntArrayArray43[local80 + 1][local69 - 1] = 9;
											Static78.anIntArrayArray8[local80 + 1][local69 - 1] = local235;
											break;
										}
										if ((local54[arg9 + local85][local280 + local91 - 1] & 0x78E40000) != 0 || (local54[local85 + local280][local91 - 1] & 0x63E40000) != 0) {
											break;
										}
										local280++;
									}
								}
								if (local80 > 0 && local69 < 128 - arg9 && Static198.anIntArrayArray43[local80 - 1][local69 + 1] == 0 && (local54[local85 - 1][local91 + arg9] & 0x4E240000) == 0) {
									for (local280 = 1; local280 < arg9; local280++) {
										if ((local54[local85 - 1][local280 + local91] & 0x4FA40000) != 0 || (local54[local280 + local85 - 1][arg9 + local91] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static541.anIntArray764[local49] = local7 - 1;
									Static523.anIntArray696[local49] = local9 + 1;
									local49 = local49 + 1 & 0xFFF;
									Static198.anIntArrayArray43[local80 - 1][local69 + 1] = 6;
									Static78.anIntArrayArray8[local80 - 1][local69 + 1] = local235;
								}
							} while (128 - arg9 <= local80);
						} while (local69 >= 128 - arg9);
					} while (Static198.anIntArrayArray43[local80 + 1][local69 + 1] != 0);
				} while ((local54[local85 + arg9][arg9 + local91] & 0x78240000) != 0);
				for (local280 = 1; local280 < arg9; local280++) {
					if ((local54[local280 + local85][local91 + arg9] & 0x7E240000) != 0 || (local54[local85 + arg9][local91 + local280] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static541.anIntArray764[local49] = local7 + 1;
				Static523.anIntArray696[local49] = local9 + 1;
				local49 = local49 + 1 & 0xFFF;
				Static198.anIntArrayArray43[local80 + 1][local69 + 1] = 12;
				Static78.anIntArrayArray8[local80 + 1][local69 + 1] = local235;
			}
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)Z")
	public static boolean method3579() {
		if (Static30.aBoolean40) {
			try {
				Static559.method6631("showVideoAd", Static531.aClass283_6.anApplet1);
				return true;
			} catch (@Pc(14) Throwable local14) {
			}
		}
		return false;
	}
}
