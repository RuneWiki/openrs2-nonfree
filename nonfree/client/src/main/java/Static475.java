import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static475 {

	@OriginalMember(owner = "client!qf", name = "r", descriptor = "Lclient!bs;")
	public static final Class47 aClass47_1 = new Class47();

	@OriginalMember(owner = "client!qf", name = "v", descriptor = "Lclient!fca;")
	public static Class114 aClass114_56 = new Class114();

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIIIIIIILclient!eo;)Z")
	public static boolean method6805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class106 arg10) {
		@Pc(5) int local5 = arg4;
		@Pc(7) int local7 = arg3;
		@Pc(16) int local16 = arg4 - 64;
		@Pc(21) int local21 = arg3 - 64;
		Static587.anIntArrayArray55[64][64] = 99;
		Static572.anIntArrayArray51[64][64] = 0;
		@Pc(35) byte local35 = 0;
		Static267.anIntArray284[0] = arg4;
		@Pc(46) int local46 = 0;
		@Pc(49) int local49 = local35 + 1;
		Static334.anIntArray356[0] = arg3;
		@Pc(54) int[][] local54 = arg10.anIntArrayArray8;
		while (true) {
			label282: while (true) {
				@Pc(79) int local79;
				@Pc(68) int local68;
				@Pc(85) int local85;
				@Pc(91) int local91;
				@Pc(246) int local246;
				@Pc(288) int local288;
				do {
					do {
						do {
							label259: do {
								if (local46 == local49) {
									Static150.anInt3076 = local5;
									Static192.anInt3707 = local7;
									return false;
								}
								local7 = Static334.anIntArray356[local46];
								local5 = Static267.anIntArray284[local46];
								local68 = local7 - local21;
								local46 = local46 + 1 & 0xFFF;
								local79 = local5 - local16;
								local85 = local5 - arg10.anInt3007;
								local91 = local7 - arg10.anInt3006;
								if (arg9 == -4) {
									if (local5 == arg2 && local7 == arg5) {
										Static150.anInt3076 = local5;
										Static192.anInt3707 = local7;
										return true;
									}
								} else if (arg9 == -3) {
									if (Static173.method2972(local7, arg2, arg1, arg5, arg8, arg0, arg0, local5)) {
										Static192.anInt3707 = local7;
										Static150.anInt3076 = local5;
										return true;
									}
								} else if (arg9 == -2) {
									if (arg10.method2670(arg0, arg0, arg6, arg5, local5, arg2, arg1, arg8, local7)) {
										Static150.anInt3076 = local5;
										Static192.anInt3707 = local7;
										return true;
									}
								} else if (arg9 == -1) {
									if (arg10.method2674(arg1, local7, local5, arg6, arg8, arg5, arg0, arg2)) {
										Static150.anInt3076 = local5;
										Static192.anInt3707 = local7;
										return true;
									}
								} else if (arg9 == 0 || arg9 == 1 || arg9 == 2 || arg9 == 3 || arg9 == 9) {
									if (arg10.method2665(arg5, local7, arg7, arg2, arg9, arg0, local5)) {
										Static150.anInt3076 = local5;
										Static192.anInt3707 = local7;
										return true;
									}
								} else if (arg10.method2669(arg5, arg0, local7, arg9, arg7, local5, arg2)) {
									Static192.anInt3707 = local7;
									Static150.anInt3076 = local5;
									return true;
								}
								local246 = Static572.anIntArrayArray51[local79][local68] + 1;
								if (local79 > 0 && Static587.anIntArrayArray55[local79 - 1][local68] == 0 && (local54[local85 - 1][local91] & 0x43A40000) == 0 && (local54[local85 - 1][arg0 + local91 - 1] & 0x4E240000) == 0) {
									local288 = 1;
									while (true) {
										if (local288 >= arg0 - 1) {
											Static267.anIntArray284[local49] = local5 - 1;
											Static334.anIntArray356[local49] = local7;
											Static587.anIntArrayArray55[local79 - 1][local68] = 2;
											local49 = local49 + 1 & 0xFFF;
											Static572.anIntArrayArray51[local79 - 1][local68] = local246;
											break;
										}
										if ((local54[local85 - 1][local91 + local288] & 0x4FA40000) != 0) {
											break;
										}
										local288++;
									}
								}
								if (128 - arg0 > local79 && Static587.anIntArrayArray55[local79 + 1][local68] == 0 && (local54[arg0 + local85][local91] & 0x60E40000) == 0 && (local54[arg0 + local85][local91 + arg0 - 1] & 0x78240000) == 0) {
									local288 = 1;
									while (true) {
										if (arg0 - 1 <= local288) {
											Static267.anIntArray284[local49] = local5 + 1;
											Static334.anIntArray356[local49] = local7;
											Static587.anIntArrayArray55[local79 + 1][local68] = 8;
											local49 = local49 + 1 & 0xFFF;
											Static572.anIntArrayArray51[local79 + 1][local68] = local246;
											break;
										}
										if ((local54[local85 + arg0][local288 + local91] & 0x78E40000) != 0) {
											break;
										}
										local288++;
									}
								}
								if (local68 > 0 && Static587.anIntArrayArray55[local79][local68 - 1] == 0 && (local54[local85][local91 - 1] & 0x43A40000) == 0 && (local54[arg0 + local85 - 1][local91 - 1] & 0x60E40000) == 0) {
									local288 = 1;
									while (true) {
										if (arg0 - 1 <= local288) {
											Static267.anIntArray284[local49] = local5;
											Static334.anIntArray356[local49] = local7 - 1;
											Static587.anIntArrayArray55[local79][local68 - 1] = 1;
											local49 = local49 + 1 & 0xFFF;
											Static572.anIntArrayArray51[local79][local68 - 1] = local246;
											break;
										}
										if ((local54[local85 + local288][local91 - 1] & 0x63E40000) != 0) {
											break;
										}
										local288++;
									}
								}
								if (local68 < 128 - arg0 && Static587.anIntArrayArray55[local79][local68 + 1] == 0 && (local54[local85][local91 + arg0] & 0x4E240000) == 0 && (local54[local85 + arg0 - 1][arg0 + local91] & 0x78240000) == 0) {
									local288 = 1;
									while (true) {
										if (local288 >= arg0 - 1) {
											Static267.anIntArray284[local49] = local5;
											Static334.anIntArray356[local49] = local7 + 1;
											local49 = local49 + 1 & 0xFFF;
											Static587.anIntArrayArray55[local79][local68 + 1] = 4;
											Static572.anIntArrayArray51[local79][local68 + 1] = local246;
											break;
										}
										if ((local54[local85 + local288][arg0 + local91] & 0x7E240000) != 0) {
											break;
										}
										local288++;
									}
								}
								if (local79 > 0 && local68 > 0 && Static587.anIntArrayArray55[local79 - 1][local68 - 1] == 0 && (local54[local85 - 1][local91 - 1] & 0x43A40000) == 0) {
									local288 = 1;
									while (true) {
										if (local288 >= arg0) {
											Static267.anIntArray284[local49] = local5 - 1;
											Static334.anIntArray356[local49] = local7 - 1;
											Static587.anIntArrayArray55[local79 - 1][local68 - 1] = 3;
											local49 = local49 + 1 & 0xFFF;
											Static572.anIntArrayArray51[local79 - 1][local68 - 1] = local246;
											break;
										}
										if ((local54[local85 - 1][local288 + local91 - 1] & 0x4FA40000) != 0 || (local54[local85 + local288 - 1][local91 - 1] & 0x63E40000) != 0) {
											break;
										}
										local288++;
									}
								}
								if (local79 < 128 - arg0 && local68 > 0 && Static587.anIntArrayArray55[local79 + 1][local68 - 1] == 0 && (local54[arg0 + local85][local91 - 1] & 0x60E40000) == 0) {
									local288 = 1;
									while (true) {
										if (local288 >= arg0) {
											Static267.anIntArray284[local49] = local5 + 1;
											Static334.anIntArray356[local49] = local7 - 1;
											Static587.anIntArrayArray55[local79 + 1][local68 - 1] = 9;
											local49 = local49 + 1 & 0xFFF;
											Static572.anIntArrayArray51[local79 + 1][local68 - 1] = local246;
											break;
										}
										if ((local54[arg0 + local85][local288 + local91 - 1] & 0x78E40000) != 0 || (local54[local85 + local288][local91 - 1] & 0x63E40000) != 0) {
											break;
										}
										local288++;
									}
								}
								if (local79 > 0 && local68 < 128 - arg0 && Static587.anIntArrayArray55[local79 - 1][local68 + 1] == 0 && (local54[local85 - 1][arg0 + local91] & 0x4E240000) == 0) {
									for (local288 = 1; local288 < arg0; local288++) {
										if ((local54[local85 - 1][local288 + local91] & 0x4FA40000) != 0 || (local54[local85 + local288 - 1][arg0 + local91] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static267.anIntArray284[local49] = local5 - 1;
									Static334.anIntArray356[local49] = local7 + 1;
									local49 = local49 + 1 & 0xFFF;
									Static587.anIntArrayArray55[local79 - 1][local68 + 1] = 6;
									Static572.anIntArrayArray51[local79 - 1][local68 + 1] = local246;
								}
							} while (local79 >= 128 - arg0);
						} while (128 - arg0 <= local68);
					} while (Static587.anIntArrayArray55[local79 + 1][local68 + 1] != 0);
				} while ((local54[local85 + arg0][local91 + arg0] & 0x78240000) != 0);
				for (local288 = 1; local288 < arg0; local288++) {
					if ((local54[local288 + local85][arg0 + local91] & 0x7E240000) != 0 || (local54[local85 + arg0][local91 + local288] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static267.anIntArray284[local49] = local5 + 1;
				Static334.anIntArray356[local49] = local7 + 1;
				Static587.anIntArrayArray55[local79 + 1][local68 + 1] = 12;
				local49 = local49 + 1 & 0xFFF;
				Static572.anIntArrayArray51[local79 + 1][local68 + 1] = local246;
			}
		}
	}
}
