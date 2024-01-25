import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "Lclient!mg;")
	public static Class160 aClass160_58;

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "Lclient!jv;")
	public static Class138 aClass138_9;

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg0 >= Static8.anInt223 && Static184.anInt3600 >= arg0 && arg5 >= Static8.anInt223 && arg5 <= Static184.anInt3600 && Static8.anInt223 <= arg6 && Static184.anInt3600 >= arg6 && arg3 >= Static8.anInt223 && Static184.anInt3600 >= arg3 && arg8 >= Static430.anInt7123 && arg8 <= Static181.anInt3543 && arg2 >= Static430.anInt7123 && Static181.anInt3543 >= arg2 && Static430.anInt7123 <= arg7 && arg7 <= Static181.anInt3543 && arg1 >= Static430.anInt7123 && Static181.anInt3543 >= arg1) {
			Static118.method2093(arg8, arg1, arg3, arg2, arg5, arg6, arg0, arg7, arg4);
		} else {
			Static146.method2424(arg4, arg7, arg2, arg6, arg0, arg8, arg1, arg3, arg5);
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIILclient!eq;IIBIIIII)Z")
	public static boolean method4124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class70 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg2;
		@Pc(9) int local9 = arg1;
		@Pc(17) int local17 = arg2 - 64;
		@Pc(22) int local22 = arg1 - 64;
		Static149.anIntArrayArray28[64][64] = 99;
		Static142.anIntArrayArray27[64][64] = 0;
		@Pc(41) byte local41 = 0;
		@Pc(43) int local43 = 0;
		Static432.anIntArray602[0] = arg2;
		@Pc(50) int local50 = local41 + 1;
		Static185.anIntArray318[0] = arg1;
		@Pc(55) int[][] local55 = arg3.anIntArrayArray17;
		while (true) {
			label282: while (true) {
				@Pc(79) int local79;
				@Pc(69) int local69;
				@Pc(85) int local85;
				@Pc(91) int local91;
				@Pc(235) int local235;
				@Pc(278) int local278;
				do {
					do {
						do {
							label259: do {
								if (local50 == local43) {
									Static275.anInt5052 = local7;
									Static333.anInt5769 = local9;
									return false;
								}
								local7 = Static432.anIntArray602[local43];
								local9 = Static185.anIntArray318[local43];
								local69 = local9 - local22;
								local43 = local43 + 1 & 0xFFF;
								local79 = local7 - local17;
								local85 = local7 - arg3.anInt2303;
								local91 = local9 - arg3.anInt2305;
								if (arg0 == -4) {
									if (arg5 == local7 && local9 == arg9) {
										Static275.anInt5052 = local7;
										Static333.anInt5769 = local9;
										return true;
									}
								} else if (arg0 == -3) {
									if (Static170.method2747(arg4, arg10, arg7, local9, arg9, local7, arg5, arg4)) {
										Static275.anInt5052 = local7;
										Static333.anInt5769 = local9;
										return true;
									}
								} else if (arg0 == -2) {
									if (arg3.method1805(arg10, local9, arg9, arg4, arg7, arg8, arg4, local7, arg5)) {
										Static275.anInt5052 = local7;
										Static333.anInt5769 = local9;
										return true;
									}
								} else if (arg0 == -1) {
									if (arg3.method1803(arg8, arg9, local7, arg5, local9, arg4, arg7, arg10)) {
										Static275.anInt5052 = local7;
										Static333.anInt5769 = local9;
										return true;
									}
								} else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
									if (arg3.method1795(local7, arg5, arg6, arg9, arg4, local9, arg0)) {
										Static275.anInt5052 = local7;
										Static333.anInt5769 = local9;
										return true;
									}
								} else if (arg3.method1796(arg5, arg6, arg4, local7, arg9, local9, arg0)) {
									Static333.anInt5769 = local9;
									Static275.anInt5052 = local7;
									return true;
								}
								local235 = Static142.anIntArrayArray27[local79][local69] + 1;
								if (local79 > 0 && Static149.anIntArrayArray28[local79 - 1][local69] == 0 && (local55[local85 - 1][local91] & 0x43A40000) == 0 && (local55[local85 - 1][local91 + arg4 - 1] & 0x4E240000) == 0) {
									local278 = 1;
									while (true) {
										if (arg4 - 1 <= local278) {
											Static432.anIntArray602[local50] = local7 - 1;
											Static185.anIntArray318[local50] = local9;
											local50 = local50 + 1 & 0xFFF;
											Static149.anIntArrayArray28[local79 - 1][local69] = 2;
											Static142.anIntArrayArray27[local79 - 1][local69] = local235;
											break;
										}
										if ((local55[local85 - 1][local91 + local278] & 0x4FA40000) != 0) {
											break;
										}
										local278++;
									}
								}
								if (128 - arg4 > local79 && Static149.anIntArrayArray28[local79 + 1][local69] == 0 && (local55[arg4 + local85][local91] & 0x60E40000) == 0 && (local55[local85 + arg4][local91 + arg4 - 1] & 0x78240000) == 0) {
									local278 = 1;
									while (true) {
										if (local278 >= arg4 - 1) {
											Static432.anIntArray602[local50] = local7 + 1;
											Static185.anIntArray318[local50] = local9;
											local50 = local50 + 1 & 0xFFF;
											Static149.anIntArrayArray28[local79 + 1][local69] = 8;
											Static142.anIntArrayArray27[local79 + 1][local69] = local235;
											break;
										}
										if ((local55[arg4 + local85][local91 + local278] & 0x78E40000) != 0) {
											break;
										}
										local278++;
									}
								}
								if (local69 > 0 && Static149.anIntArrayArray28[local79][local69 - 1] == 0 && (local55[local85][local91 - 1] & 0x43A40000) == 0 && (local55[arg4 + local85 - 1][local91 - 1] & 0x60E40000) == 0) {
									local278 = 1;
									while (true) {
										if (local278 >= arg4 - 1) {
											Static432.anIntArray602[local50] = local7;
											Static185.anIntArray318[local50] = local9 - 1;
											Static149.anIntArrayArray28[local79][local69 - 1] = 1;
											local50 = local50 + 1 & 0xFFF;
											Static142.anIntArrayArray27[local79][local69 - 1] = local235;
											break;
										}
										if ((local55[local85 + local278][local91 - 1] & 0x63E40000) != 0) {
											break;
										}
										local278++;
									}
								}
								if (128 - arg4 > local69 && Static149.anIntArrayArray28[local79][local69 + 1] == 0 && (local55[local85][arg4 + local91] & 0x4E240000) == 0 && (local55[arg4 + local85 - 1][arg4 + local91] & 0x78240000) == 0) {
									local278 = 1;
									while (true) {
										if (local278 >= arg4 - 1) {
											Static432.anIntArray602[local50] = local7;
											Static185.anIntArray318[local50] = local9 + 1;
											Static149.anIntArrayArray28[local79][local69 + 1] = 4;
											local50 = local50 + 1 & 0xFFF;
											Static142.anIntArrayArray27[local79][local69 + 1] = local235;
											break;
										}
										if ((local55[local278 + local85][local91 + arg4] & 0x7E240000) != 0) {
											break;
										}
										local278++;
									}
								}
								if (local79 > 0 && local69 > 0 && Static149.anIntArrayArray28[local79 - 1][local69 - 1] == 0 && (local55[local85 - 1][local91 - 1] & 0x43A40000) == 0) {
									local278 = 1;
									while (true) {
										if (local278 >= arg4) {
											Static432.anIntArray602[local50] = local7 - 1;
											Static185.anIntArray318[local50] = local9 - 1;
											local50 = local50 + 1 & 0xFFF;
											Static149.anIntArrayArray28[local79 - 1][local69 - 1] = 3;
											Static142.anIntArrayArray27[local79 - 1][local69 - 1] = local235;
											break;
										}
										if ((local55[local85 - 1][local91 + local278 - 1] & 0x4FA40000) != 0 || (local55[local278 + local85 - 1][local91 - 1] & 0x63E40000) != 0) {
											break;
										}
										local278++;
									}
								}
								if (128 - arg4 > local79 && local69 > 0 && Static149.anIntArrayArray28[local79 + 1][local69 - 1] == 0 && (local55[arg4 + local85][local91 - 1] & 0x60E40000) == 0) {
									local278 = 1;
									while (true) {
										if (arg4 <= local278) {
											Static432.anIntArray602[local50] = local7 + 1;
											Static185.anIntArray318[local50] = local9 - 1;
											local50 = local50 + 1 & 0xFFF;
											Static149.anIntArrayArray28[local79 + 1][local69 - 1] = 9;
											Static142.anIntArrayArray27[local79 + 1][local69 - 1] = local235;
											break;
										}
										if ((local55[arg4 + local85][local278 + local91 - 1] & 0x78E40000) != 0 || (local55[local85 + local278][local91 - 1] & 0x63E40000) != 0) {
											break;
										}
										local278++;
									}
								}
								if (local79 > 0 && local69 < 128 - arg4 && Static149.anIntArrayArray28[local79 - 1][local69 + 1] == 0 && (local55[local85 - 1][local91 + arg4] & 0x4E240000) == 0) {
									for (local278 = 1; local278 < arg4; local278++) {
										if ((local55[local85 - 1][local278 + local91] & 0x4FA40000) != 0 || (local55[local278 + local85 - 1][arg4 + local91] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static432.anIntArray602[local50] = local7 - 1;
									Static185.anIntArray318[local50] = local9 + 1;
									local50 = local50 + 1 & 0xFFF;
									Static149.anIntArrayArray28[local79 - 1][local69 + 1] = 6;
									Static142.anIntArrayArray27[local79 - 1][local69 + 1] = local235;
								}
							} while (128 - arg4 <= local79);
						} while (128 - arg4 <= local69);
					} while (Static149.anIntArrayArray28[local79 + 1][local69 + 1] != 0);
				} while ((local55[arg4 + local85][arg4 + local91] & 0x78240000) != 0);
				for (local278 = 1; local278 < arg4; local278++) {
					if ((local55[local85 + local278][local91 + arg4] & 0x7E240000) != 0 || (local55[arg4 + local85][local91 + local278] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static432.anIntArray602[local50] = local7 + 1;
				Static185.anIntArray318[local50] = local9 + 1;
				Static149.anIntArrayArray28[local79 + 1][local69 + 1] = 12;
				local50 = local50 + 1 & 0xFFF;
				Static142.anIntArrayArray27[local79 + 1][local69 + 1] = local235;
			}
		}
	}
}
