import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static623 {

	@OriginalMember(owner = "client!wca", name = "d", descriptor = "Lclient!ofa;")
	public static Class244 aClass244_6;

	@OriginalMember(owner = "client!wca", name = "h", descriptor = "I")
	public static int anInt10320;

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "I")
	public static int anInt10314 = -1;

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(Z)V")
	public static void method8478() {
		if (Static621.anInt10311 == 5) {
			Static621.anInt10311 = 6;
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(IILclient!gaa;)Ljava/lang/String;")
	public static String method8479(@OriginalArg(0) int arg0, @OriginalArg(2) Class108 arg1) {
		if (!Static71.method1836(arg1).method1188(arg0) && arg1.anObjectArray21 == null) {
			return null;
		} else if (arg1.aStringArray13 == null || arg1.aStringArray13.length <= arg0 || arg1.aStringArray13[arg0] == null || arg1.aStringArray13[arg0].trim().length() == 0) {
			return Static401.aBoolean650 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray13[arg0];
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(IIIIIIILclient!rl;IIII)Z")
	public static boolean method8481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class291 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(24) int local24 = arg8;
		@Pc(26) int local26 = arg1;
		@Pc(34) int local34 = arg8 - 64;
		Static97.anIntArrayArray23[64][64] = 99;
		@Pc(45) int local45 = arg1 - 64;
		Static634.anIntArrayArray103[64][64] = 0;
		@Pc(53) byte local53 = 0;
		@Pc(55) int local55 = 0;
		Static478.anIntArray606[0] = arg8;
		@Pc(62) int local62 = local53 + 1;
		Static273.anIntArray338[0] = arg1;
		@Pc(67) int[][] local67 = arg6.anIntArrayArray89;
		while (true) {
			label282: while (true) {
				@Pc(87) int local87;
				@Pc(82) int local82;
				@Pc(99) int local99;
				@Pc(105) int local105;
				@Pc(258) int local258;
				@Pc(300) int local300;
				do {
					do {
						do {
							label259: do {
								if (local55 == local62) {
									Static390.anInt7402 = local24;
									Static243.anInt5476 = local26;
									return false;
								}
								local24 = Static478.anIntArray606[local55];
								local26 = Static273.anIntArray338[local55];
								local82 = local26 - local45;
								local87 = local24 - local34;
								local55 = local55 + 1 & 0xFFF;
								local99 = local24 - arg6.anInt8721;
								local105 = local26 - arg6.anInt8715;
								if (arg2 == -4) {
									if (local24 == arg7 && local26 == arg5) {
										Static390.anInt7402 = local24;
										Static243.anInt5476 = local26;
										return true;
									}
								} else if (arg2 == -3) {
									if (Static192.method3820(arg0, local24, arg10, arg3, arg7, arg5, arg3, local26)) {
										Static390.anInt7402 = local24;
										Static243.anInt5476 = local26;
										return true;
									}
								} else if (arg2 == -2) {
									if (arg6.method7199(arg3, arg10, arg5, local26, arg0, arg3, arg9, arg7, local24)) {
										Static390.anInt7402 = local24;
										Static243.anInt5476 = local26;
										return true;
									}
								} else if (arg2 == -1) {
									if (arg6.method7204(arg7, local24, arg0, arg9, arg5, arg3, arg10, local26)) {
										Static390.anInt7402 = local24;
										Static243.anInt5476 = local26;
										return true;
									}
								} else if (arg2 == 0 || arg2 == 1 || arg2 == 2 || arg2 == 3 || arg2 == 9) {
									if (arg6.method7210(local26, arg3, arg7, arg2, arg4, local24, arg5)) {
										Static390.anInt7402 = local24;
										Static243.anInt5476 = local26;
										return true;
									}
								} else if (arg6.method7203(local26, arg7, arg2, arg3, arg4, arg5, local24)) {
									Static390.anInt7402 = local24;
									Static243.anInt5476 = local26;
									return true;
								}
								local258 = Static634.anIntArrayArray103[local87][local82] + 1;
								if (local87 > 0 && Static97.anIntArrayArray23[local87 - 1][local82] == 0 && (local67[local99 - 1][local105] & 0x43A40000) == 0 && (local67[local99 - 1][arg3 + local105 - 1] & 0x4E240000) == 0) {
									local300 = 1;
									while (true) {
										if (local300 >= arg3 - 1) {
											Static478.anIntArray606[local62] = local24 - 1;
											Static273.anIntArray338[local62] = local26;
											Static97.anIntArrayArray23[local87 - 1][local82] = 2;
											local62 = local62 + 1 & 0xFFF;
											Static634.anIntArrayArray103[local87 - 1][local82] = local258;
											break;
										}
										if ((local67[local99 - 1][local105 + local300] & 0x4FA40000) != 0) {
											break;
										}
										local300++;
									}
								}
								if (128 - arg3 > local87 && Static97.anIntArrayArray23[local87 + 1][local82] == 0 && (local67[local99 + arg3][local105] & 0x60E40000) == 0 && (local67[local99 + arg3][arg3 + local105 - 1] & 0x78240000) == 0) {
									local300 = 1;
									while (true) {
										if (local300 >= arg3 - 1) {
											Static478.anIntArray606[local62] = local24 + 1;
											Static273.anIntArray338[local62] = local26;
											local62 = local62 + 1 & 0xFFF;
											Static97.anIntArrayArray23[local87 + 1][local82] = 8;
											Static634.anIntArrayArray103[local87 + 1][local82] = local258;
											break;
										}
										if ((local67[local99 + arg3][local105 + local300] & 0x78E40000) != 0) {
											break;
										}
										local300++;
									}
								}
								if (local82 > 0 && Static97.anIntArrayArray23[local87][local82 - 1] == 0 && (local67[local99][local105 - 1] & 0x43A40000) == 0 && (local67[local99 + arg3 - 1][local105 - 1] & 0x60E40000) == 0) {
									local300 = 1;
									while (true) {
										if (arg3 - 1 <= local300) {
											Static478.anIntArray606[local62] = local24;
											Static273.anIntArray338[local62] = local26 - 1;
											Static97.anIntArrayArray23[local87][local82 - 1] = 1;
											local62 = local62 + 1 & 0xFFF;
											Static634.anIntArrayArray103[local87][local82 - 1] = local258;
											break;
										}
										if ((local67[local99 + local300][local105 - 1] & 0x63E40000) != 0) {
											break;
										}
										local300++;
									}
								}
								if (128 - arg3 > local82 && Static97.anIntArrayArray23[local87][local82 + 1] == 0 && (local67[local99][arg3 + local105] & 0x4E240000) == 0 && (local67[local99 + arg3 - 1][arg3 + local105] & 0x78240000) == 0) {
									local300 = 1;
									while (true) {
										if (arg3 - 1 <= local300) {
											Static478.anIntArray606[local62] = local24;
											Static273.anIntArray338[local62] = local26 + 1;
											local62 = local62 + 1 & 0xFFF;
											Static97.anIntArrayArray23[local87][local82 + 1] = 4;
											Static634.anIntArrayArray103[local87][local82 + 1] = local258;
											break;
										}
										if ((local67[local99 + local300][local105 + arg3] & 0x7E240000) != 0) {
											break;
										}
										local300++;
									}
								}
								if (local87 > 0 && local82 > 0 && Static97.anIntArrayArray23[local87 - 1][local82 - 1] == 0 && (local67[local99 - 1][local105 - 1] & 0x43A40000) == 0) {
									local300 = 1;
									while (true) {
										if (local300 >= arg3) {
											Static478.anIntArray606[local62] = local24 - 1;
											Static273.anIntArray338[local62] = local26 - 1;
											local62 = local62 + 1 & 0xFFF;
											Static97.anIntArrayArray23[local87 - 1][local82 - 1] = 3;
											Static634.anIntArrayArray103[local87 - 1][local82 - 1] = local258;
											break;
										}
										if ((local67[local99 - 1][local105 + local300 - 1] & 0x4FA40000) != 0 || (local67[local300 + local99 - 1][local105 - 1] & 0x63E40000) != 0) {
											break;
										}
										local300++;
									}
								}
								if (local87 < 128 - arg3 && local82 > 0 && Static97.anIntArrayArray23[local87 + 1][local82 - 1] == 0 && (local67[arg3 + local99][local105 - 1] & 0x60E40000) == 0) {
									local300 = 1;
									while (true) {
										if (local300 >= arg3) {
											Static478.anIntArray606[local62] = local24 + 1;
											Static273.anIntArray338[local62] = local26 - 1;
											Static97.anIntArrayArray23[local87 + 1][local82 - 1] = 9;
											local62 = local62 + 1 & 0xFFF;
											Static634.anIntArrayArray103[local87 + 1][local82 - 1] = local258;
											break;
										}
										if ((local67[arg3 + local99][local300 + local105 - 1] & 0x78E40000) != 0 || (local67[local300 + local99][local105 - 1] & 0x63E40000) != 0) {
											break;
										}
										local300++;
									}
								}
								if (local87 > 0 && 128 - arg3 > local82 && Static97.anIntArrayArray23[local87 - 1][local82 + 1] == 0 && (local67[local99 - 1][local105 + arg3] & 0x4E240000) == 0) {
									for (local300 = 1; local300 < arg3; local300++) {
										if ((local67[local99 - 1][local105 + local300] & 0x4FA40000) != 0 || (local67[local99 + local300 - 1][local105 + arg3] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static478.anIntArray606[local62] = local24 - 1;
									Static273.anIntArray338[local62] = local26 + 1;
									local62 = local62 + 1 & 0xFFF;
									Static97.anIntArrayArray23[local87 - 1][local82 + 1] = 6;
									Static634.anIntArrayArray103[local87 - 1][local82 + 1] = local258;
								}
							} while (128 - arg3 <= local87);
						} while (local82 >= 128 - arg3);
					} while (Static97.anIntArrayArray23[local87 + 1][local82 + 1] != 0);
				} while ((local67[arg3 + local99][local105 + arg3] & 0x78240000) != 0);
				for (local300 = 1; local300 < arg3; local300++) {
					if ((local67[local99 + local300][arg3 + local105] & 0x7E240000) != 0 || (local67[local99 + arg3][local105 + local300] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static478.anIntArray606[local62] = local24 + 1;
				Static273.anIntArray338[local62] = local26 + 1;
				local62 = local62 + 1 & 0xFFF;
				Static97.anIntArrayArray23[local87 + 1][local82 + 1] = 12;
				Static634.anIntArrayArray103[local87 + 1][local82 + 1] = local258;
			}
		}
	}
}
