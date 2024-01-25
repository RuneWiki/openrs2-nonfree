import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!is", name = "b", descriptor = "I")
	public static int anInt3129;

	@OriginalMember(owner = "client!is", name = "d", descriptor = "I")
	public static int anInt3130;

	@OriginalMember(owner = "client!is", name = "g", descriptor = "I")
	public static int anInt3132;

	@OriginalMember(owner = "client!is", name = "e", descriptor = "[I")
	public static final int[] anIntArray204 = new int[13];

	@OriginalMember(owner = "client!is", name = "i", descriptor = "I")
	public static int anInt3134 = 0;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(III)V")
	public static void method2597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = Static451.aClass89_10.method1995(Static420.aClass119_169.method2673(Static394.anInt6582));
		@Pc(26) int local26;
		for (@Pc(18) Class1_Sub19 local18 = (Class1_Sub19) Static202.aClass227_21.method4967(); local18 != null; local18 = (Class1_Sub19) Static202.aClass227_21.method4973()) {
			local26 = Static125.method1994(local18);
			if (local11 < local26) {
				local11 = local26;
			}
		}
		local11 += 8;
		local26 = Static118.anInt2201 * 16 + 21;
		@Pc(52) int local52 = arg1 - local11 / 2;
		if (local52 + local11 > Static69.anInt1304) {
			local52 = Static69.anInt1304 - local11;
		}
		if (local52 < 0) {
			local52 = 0;
		}
		@Pc(71) int local71 = arg0;
		if (local26 + arg0 > Static338.anInt5777) {
			local71 = Static338.anInt5777 - local26;
		}
		if (local71 < 0) {
			local71 = 0;
		}
		Static129.anInt2365 = local52;
		Static387.anInt6440 = Static118.anInt2201 * 16 + (Static382.aBoolean780 ? 26 : 22);
		Static187.anInt3228 = local71;
		Static17.aBoolean39 = true;
		Static413.anInt6778 = local11;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IIIBIIILclient!as;IIII)Z")
	public static boolean method2600(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class14 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg9;
		@Pc(9) int local9 = arg7;
		@Pc(23) int local23 = arg9 - 64;
		@Pc(27) int local27 = arg7 - 64;
		Static77.anIntArrayArray22[64][64] = 99;
		Static88.anIntArrayArray24[64][64] = 0;
		@Pc(41) byte local41 = 0;
		Static2.anIntArray2[0] = arg9;
		@Pc(47) int local47 = 0;
		@Pc(50) int local50 = local41 + 1;
		Static149.anIntArray175[0] = arg7;
		@Pc(55) int[][] local55 = arg6.anIntArrayArray3;
		while (true) {
			label282: while (true) {
				@Pc(70) int local70;
				@Pc(75) int local75;
				@Pc(86) int local86;
				@Pc(92) int local92;
				@Pc(241) int local241;
				@Pc(289) int local289;
				do {
					do {
						do {
							label259: do {
								if (local50 == local47) {
									Static59.anInt1169 = local9;
									Static121.anInt2244 = local7;
									return false;
								}
								local9 = Static149.anIntArray175[local47];
								local7 = Static2.anIntArray2[local47];
								local70 = local7 - local23;
								local75 = local9 - local27;
								local47 = local47 + 1 & 0xFFF;
								local86 = local7 - arg6.anInt377;
								local92 = local9 - arg6.anInt374;
								if (arg5 == -4) {
									if (local7 == arg1 && local9 == arg4) {
										Static59.anInt1169 = local9;
										Static121.anInt2244 = local7;
										return true;
									}
								} else if (arg5 == -3) {
									if (Static311.method4232(local9, local7, arg2, arg0, arg8, arg2, arg1, arg4)) {
										Static59.anInt1169 = local9;
										Static121.anInt2244 = local7;
										return true;
									}
								} else if (arg5 == -2) {
									if (arg6.method272(local9, local7, arg4, arg2, arg8, arg2, arg3, arg1, arg0)) {
										Static121.anInt2244 = local7;
										Static59.anInt1169 = local9;
										return true;
									}
								} else if (arg5 == -1) {
									if (arg6.method271(arg0, arg4, arg1, arg2, local9, arg3, arg8, local7)) {
										Static59.anInt1169 = local9;
										Static121.anInt2244 = local7;
										return true;
									}
								} else if (arg5 == 0 || arg5 == 1 || arg5 == 2 || arg5 == 3 || arg5 == 9) {
									if (arg6.method277(arg2, arg10, arg1, arg5, local9, arg4, local7)) {
										Static121.anInt2244 = local7;
										Static59.anInt1169 = local9;
										return true;
									}
								} else if (arg6.method278(arg5, local9, arg2, arg1, arg4, arg10, local7)) {
									Static59.anInt1169 = local9;
									Static121.anInt2244 = local7;
									return true;
								}
								local241 = Static88.anIntArrayArray24[local70][local75] + 1;
								if (local70 > 0 && Static77.anIntArrayArray22[local70 - 1][local75] == 0 && (local55[local86 - 1][local92] & 0x43A40000) == 0 && (local55[local86 - 1][arg2 + local92 - 1] & 0x4E240000) == 0) {
									local289 = 1;
									while (true) {
										if (arg2 - 1 <= local289) {
											Static2.anIntArray2[local50] = local7 - 1;
											Static149.anIntArray175[local50] = local9;
											local50 = local50 + 1 & 0xFFF;
											Static77.anIntArrayArray22[local70 - 1][local75] = 2;
											Static88.anIntArrayArray24[local70 - 1][local75] = local241;
											break;
										}
										if ((local55[local86 - 1][local289 + local92] & 0x4FA40000) != 0) {
											break;
										}
										local289++;
									}
								}
								if (128 - arg2 > local70 && Static77.anIntArrayArray22[local70 + 1][local75] == 0 && (local55[arg2 + local86][local92] & 0x60E40000) == 0 && (local55[arg2 + local86][local92 + arg2 - 1] & 0x78240000) == 0) {
									local289 = 1;
									while (true) {
										if (arg2 - 1 <= local289) {
											Static2.anIntArray2[local50] = local7 + 1;
											Static149.anIntArray175[local50] = local9;
											local50 = local50 + 1 & 0xFFF;
											Static77.anIntArrayArray22[local70 + 1][local75] = 8;
											Static88.anIntArrayArray24[local70 + 1][local75] = local241;
											break;
										}
										if ((local55[local86 + arg2][local92 + local289] & 0x78E40000) != 0) {
											break;
										}
										local289++;
									}
								}
								if (local75 > 0 && Static77.anIntArrayArray22[local70][local75 - 1] == 0 && (local55[local86][local92 - 1] & 0x43A40000) == 0 && (local55[local86 + arg2 - 1][local92 - 1] & 0x60E40000) == 0) {
									local289 = 1;
									while (true) {
										if (local289 >= arg2 - 1) {
											Static2.anIntArray2[local50] = local7;
											Static149.anIntArray175[local50] = local9 - 1;
											local50 = local50 + 1 & 0xFFF;
											Static77.anIntArrayArray22[local70][local75 - 1] = 1;
											Static88.anIntArrayArray24[local70][local75 - 1] = local241;
											break;
										}
										if ((local55[local86 + local289][local92 - 1] & 0x63E40000) != 0) {
											break;
										}
										local289++;
									}
								}
								if (local75 < 128 - arg2 && Static77.anIntArrayArray22[local70][local75 + 1] == 0 && (local55[local86][arg2 + local92] & 0x4E240000) == 0 && (local55[arg2 + local86 - 1][arg2 + local92] & 0x78240000) == 0) {
									local289 = 1;
									while (true) {
										if (local289 >= arg2 - 1) {
											Static2.anIntArray2[local50] = local7;
											Static149.anIntArray175[local50] = local9 + 1;
											Static77.anIntArrayArray22[local70][local75 + 1] = 4;
											local50 = local50 + 1 & 0xFFF;
											Static88.anIntArrayArray24[local70][local75 + 1] = local241;
											break;
										}
										if ((local55[local86 + local289][arg2 + local92] & 0x7E240000) != 0) {
											break;
										}
										local289++;
									}
								}
								if (local70 > 0 && local75 > 0 && Static77.anIntArrayArray22[local70 - 1][local75 - 1] == 0 && (local55[local86 - 1][local92 - 1] & 0x43A40000) == 0) {
									local289 = 1;
									while (true) {
										if (arg2 <= local289) {
											Static2.anIntArray2[local50] = local7 - 1;
											Static149.anIntArray175[local50] = local9 - 1;
											local50 = local50 + 1 & 0xFFF;
											Static77.anIntArrayArray22[local70 - 1][local75 - 1] = 3;
											Static88.anIntArrayArray24[local70 - 1][local75 - 1] = local241;
											break;
										}
										if ((local55[local86 - 1][local289 + local92 - 1] & 0x4FA40000) != 0 || (local55[local289 + local86 - 1][local92 - 1] & 0x63E40000) != 0) {
											break;
										}
										local289++;
									}
								}
								if (128 - arg2 > local70 && local75 > 0 && Static77.anIntArrayArray22[local70 + 1][local75 - 1] == 0 && (local55[local86 + arg2][local92 - 1] & 0x60E40000) == 0) {
									local289 = 1;
									while (true) {
										if (arg2 <= local289) {
											Static2.anIntArray2[local50] = local7 + 1;
											Static149.anIntArray175[local50] = local9 - 1;
											Static77.anIntArrayArray22[local70 + 1][local75 - 1] = 9;
											local50 = local50 + 1 & 0xFFF;
											Static88.anIntArrayArray24[local70 + 1][local75 - 1] = local241;
											break;
										}
										if ((local55[arg2 + local86][local92 + local289 - 1] & 0x78E40000) != 0 || (local55[local289 + local86][local92 - 1] & 0x63E40000) != 0) {
											break;
										}
										local289++;
									}
								}
								if (local70 > 0 && local75 < 128 - arg2 && Static77.anIntArrayArray22[local70 - 1][local75 + 1] == 0 && (local55[local86 - 1][arg2 + local92] & 0x4E240000) == 0) {
									for (local289 = 1; local289 < arg2; local289++) {
										if ((local55[local86 - 1][local92 + local289] & 0x4FA40000) != 0 || (local55[local86 + local289 - 1][local92 + arg2] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static2.anIntArray2[local50] = local7 - 1;
									Static149.anIntArray175[local50] = local9 + 1;
									Static77.anIntArrayArray22[local70 - 1][local75 + 1] = 6;
									local50 = local50 + 1 & 0xFFF;
									Static88.anIntArrayArray24[local70 - 1][local75 + 1] = local241;
								}
							} while (local70 >= 128 - arg2);
						} while (local75 >= 128 - arg2);
					} while (Static77.anIntArrayArray22[local70 + 1][local75 + 1] != 0);
				} while ((local55[arg2 + local86][local92 + arg2] & 0x78240000) != 0);
				for (local289 = 1; local289 < arg2; local289++) {
					if ((local55[local289 + local86][local92 + arg2] & 0x7E240000) != 0 || (local55[arg2 + local86][local289 + local92] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static2.anIntArray2[local50] = local7 + 1;
				Static149.anIntArray175[local50] = local9 + 1;
				local50 = local50 + 1 & 0xFFF;
				Static77.anIntArrayArray22[local70 + 1][local75 + 1] = 12;
				Static88.anIntArrayArray24[local70 + 1][local75 + 1] = local241;
			}
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(ILclient!ya;)V")
	public static void method2601(@OriginalArg(0) int arg0, @OriginalArg(1) Class157 arg1) {
		Static94.aClass157Array1[arg0] = arg1;
	}
}
