import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!bv", name = "o", descriptor = "I")
	public static int anInt9344;

	@OriginalMember(owner = "client!bv", name = "k", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_121 = new Class160(21, 3);

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(B)V")
	public static void method7642() {
		if (Static146.anInt2581 == 9) {
			Static99.method1593(5);
		} else if (Static146.anInt2581 == 5 || Static146.anInt2581 == 6) {
			Static99.method1593(3);
		} else if (Static146.anInt2581 == 12) {
			Static99.method1593(3);
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Z)Ljava/lang/String;")
	public static String method7646() {
		return Static330.aBoolean415 || Static185.aClass6_Sub48_1 == null ? "" : Static185.aClass6_Sub48_1.aString104;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIBII)V")
	public static void method7647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(8) int local8 = 0; local8 < Static73.anInt1201; local8++) {
			@Pc(14) Rectangle local14 = Class6_Sub1_Sub11.aRectangleArray1[local8];
			if (local14.width + local14.x > arg3 && local14.x < arg3 + arg2 && local14.height + local14.y > arg0 && local14.y < arg0 + arg1) {
				Static44.aBooleanArray5[local8] = true;
			}
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIIIIILclient!sl;ZIIII)Z")
	public static boolean method7650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class295 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg0;
		@Pc(9) int local9 = arg2;
		@Pc(22) int local22 = arg0 - 64;
		Static88.anIntArrayArray26[64][64] = 99;
		@Pc(33) int local33 = arg2 - 64;
		Static102.anIntArrayArray29[64][64] = 0;
		@Pc(41) byte local41 = 0;
		Static160.anIntArray325[0] = arg0;
		@Pc(47) int local47 = 0;
		@Pc(50) int local50 = local41 + 1;
		Static502.anIntArray649[0] = arg2;
		@Pc(55) int[][] local55 = arg6.anIntArrayArray80;
		while (true) {
			label282: while (true) {
				@Pc(70) int local70;
				@Pc(75) int local75;
				@Pc(87) int local87;
				@Pc(93) int local93;
				@Pc(241) int local241;
				@Pc(289) int local289;
				do {
					do {
						do {
							label259: do {
								if (local47 == local50) {
									Static119.anInt7676 = local7;
									Static97.anInt1600 = local9;
									return false;
								}
								local9 = Static502.anIntArray649[local47];
								local7 = Static160.anIntArray325[local47];
								local70 = local7 - local22;
								local75 = local9 - local33;
								local47 = local47 + 1 & 0xFFF;
								local87 = local7 - arg6.anInt7938;
								local93 = local9 - arg6.anInt7934;
								if (arg3 == -4) {
									if (arg8 == local7 && arg5 == local9) {
										Static119.anInt7676 = local7;
										Static97.anInt1600 = local9;
										return true;
									}
								} else if (arg3 == -3) {
									if (Static134.method1997(arg10, arg8, arg9, local9, arg5, local7, arg7, arg10)) {
										Static119.anInt7676 = local7;
										Static97.anInt1600 = local9;
										return true;
									}
								} else if (arg3 == -2) {
									if (arg6.method6561(arg10, local7, arg5, arg9, arg7, arg8, arg10, arg1, local9)) {
										Static97.anInt1600 = local9;
										Static119.anInt7676 = local7;
										return true;
									}
								} else if (arg3 == -1) {
									if (arg6.method6547(arg5, arg10, arg7, local7, arg8, local9, arg9, arg1)) {
										Static119.anInt7676 = local7;
										Static97.anInt1600 = local9;
										return true;
									}
								} else if (arg3 == 0 || arg3 == 1 || arg3 == 2 || arg3 == 3 || arg3 == 9) {
									if (arg6.method6545(arg5, arg10, arg4, arg8, arg3, local9, local7)) {
										Static119.anInt7676 = local7;
										Static97.anInt1600 = local9;
										return true;
									}
								} else if (arg6.method6559(arg4, arg5, arg10, arg8, arg3, local7, local9)) {
									Static119.anInt7676 = local7;
									Static97.anInt1600 = local9;
									return true;
								}
								local241 = Static102.anIntArrayArray29[local70][local75] + 1;
								if (local70 > 0 && Static88.anIntArrayArray26[local70 - 1][local75] == 0 && (local55[local87 - 1][local93] & 0x43A40000) == 0 && (local55[local87 - 1][arg10 + local93 - 1] & 0x4E240000) == 0) {
									local289 = 1;
									while (true) {
										if (arg10 - 1 <= local289) {
											Static160.anIntArray325[local50] = local7 - 1;
											Static502.anIntArray649[local50] = local9;
											Static88.anIntArrayArray26[local70 - 1][local75] = 2;
											local50 = local50 + 1 & 0xFFF;
											Static102.anIntArrayArray29[local70 - 1][local75] = local241;
											break;
										}
										if ((local55[local87 - 1][local93 + local289] & 0x4FA40000) != 0) {
											break;
										}
										local289++;
									}
								}
								if (local70 < 128 - arg10 && Static88.anIntArrayArray26[local70 + 1][local75] == 0 && (local55[local87 + arg10][local93] & 0x60E40000) == 0 && (local55[local87 + arg10][arg10 + local93 - 1] & 0x78240000) == 0) {
									local289 = 1;
									while (true) {
										if (arg10 - 1 <= local289) {
											Static160.anIntArray325[local50] = local7 + 1;
											Static502.anIntArray649[local50] = local9;
											Static88.anIntArrayArray26[local70 + 1][local75] = 8;
											local50 = local50 + 1 & 0xFFF;
											Static102.anIntArrayArray29[local70 + 1][local75] = local241;
											break;
										}
										if ((local55[local87 + arg10][local289 + local93] & 0x78E40000) != 0) {
											break;
										}
										local289++;
									}
								}
								if (local75 > 0 && Static88.anIntArrayArray26[local70][local75 - 1] == 0 && (local55[local87][local93 - 1] & 0x43A40000) == 0 && (local55[local87 + arg10 - 1][local93 - 1] & 0x60E40000) == 0) {
									local289 = 1;
									while (true) {
										if (arg10 - 1 <= local289) {
											Static160.anIntArray325[local50] = local7;
											Static502.anIntArray649[local50] = local9 - 1;
											Static88.anIntArrayArray26[local70][local75 - 1] = 1;
											local50 = local50 + 1 & 0xFFF;
											Static102.anIntArrayArray29[local70][local75 - 1] = local241;
											break;
										}
										if ((local55[local289 + local87][local93 - 1] & 0x63E40000) != 0) {
											break;
										}
										local289++;
									}
								}
								if (local75 < 128 - arg10 && Static88.anIntArrayArray26[local70][local75 + 1] == 0 && (local55[local87][local93 + arg10] & 0x4E240000) == 0 && (local55[local87 + arg10 - 1][local93 + arg10] & 0x78240000) == 0) {
									local289 = 1;
									while (true) {
										if (arg10 - 1 <= local289) {
											Static160.anIntArray325[local50] = local7;
											Static502.anIntArray649[local50] = local9 + 1;
											local50 = local50 + 1 & 0xFFF;
											Static88.anIntArrayArray26[local70][local75 + 1] = 4;
											Static102.anIntArrayArray29[local70][local75 + 1] = local241;
											break;
										}
										if ((local55[local289 + local87][local93 + arg10] & 0x7E240000) != 0) {
											break;
										}
										local289++;
									}
								}
								if (local70 > 0 && local75 > 0 && Static88.anIntArrayArray26[local70 - 1][local75 - 1] == 0 && (local55[local87 - 1][local93 - 1] & 0x43A40000) == 0) {
									local289 = 1;
									while (true) {
										if (arg10 <= local289) {
											Static160.anIntArray325[local50] = local7 - 1;
											Static502.anIntArray649[local50] = local9 - 1;
											Static88.anIntArrayArray26[local70 - 1][local75 - 1] = 3;
											local50 = local50 + 1 & 0xFFF;
											Static102.anIntArrayArray29[local70 - 1][local75 - 1] = local241;
											break;
										}
										if ((local55[local87 - 1][local289 + local93 - 1] & 0x4FA40000) != 0 || (local55[local289 + local87 - 1][local93 - 1] & 0x63E40000) != 0) {
											break;
										}
										local289++;
									}
								}
								if (local70 < 128 - arg10 && local75 > 0 && Static88.anIntArrayArray26[local70 + 1][local75 - 1] == 0 && (local55[local87 + arg10][local93 - 1] & 0x60E40000) == 0) {
									local289 = 1;
									while (true) {
										if (local289 >= arg10) {
											Static160.anIntArray325[local50] = local7 + 1;
											Static502.anIntArray649[local50] = local9 - 1;
											Static88.anIntArrayArray26[local70 + 1][local75 - 1] = 9;
											local50 = local50 + 1 & 0xFFF;
											Static102.anIntArrayArray29[local70 + 1][local75 - 1] = local241;
											break;
										}
										if ((local55[arg10 + local87][local289 + local93 - 1] & 0x78E40000) != 0 || (local55[local289 + local87][local93 - 1] & 0x63E40000) != 0) {
											break;
										}
										local289++;
									}
								}
								if (local70 > 0 && local75 < 128 - arg10 && Static88.anIntArrayArray26[local70 - 1][local75 + 1] == 0 && (local55[local87 - 1][arg10 + local93] & 0x4E240000) == 0) {
									for (local289 = 1; local289 < arg10; local289++) {
										if ((local55[local87 - 1][local289 + local93] & 0x4FA40000) != 0 || (local55[local87 + local289 - 1][arg10 + local93] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static160.anIntArray325[local50] = local7 - 1;
									Static502.anIntArray649[local50] = local9 + 1;
									Static88.anIntArrayArray26[local70 - 1][local75 + 1] = 6;
									local50 = local50 + 1 & 0xFFF;
									Static102.anIntArrayArray29[local70 - 1][local75 + 1] = local241;
								}
							} while (local70 >= 128 - arg10);
						} while (128 - arg10 <= local75);
					} while (Static88.anIntArrayArray26[local70 + 1][local75 + 1] != 0);
				} while ((local55[local87 + arg10][arg10 + local93] & 0x78240000) != 0);
				for (local289 = 1; local289 < arg10; local289++) {
					if ((local55[local289 + local87][arg10 + local93] & 0x7E240000) != 0 || (local55[local87 + arg10][local289 + local93] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static160.anIntArray325[local50] = local7 + 1;
				Static502.anIntArray649[local50] = local9 + 1;
				Static88.anIntArrayArray26[local70 + 1][local75 + 1] = 12;
				local50 = local50 + 1 & 0xFFF;
				Static102.anIntArrayArray29[local70 + 1][local75 + 1] = local241;
			}
		}
	}
}
