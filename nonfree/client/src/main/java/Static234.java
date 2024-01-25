import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!lu", name = "N", descriptor = "F")
	public static float aFloat140;

	@OriginalMember(owner = "client!lu", name = "O", descriptor = "Lclient!qd;")
	public static Class192 aClass192_2;

	@OriginalMember(owner = "client!lu", name = "D", descriptor = "Lclient!gk;")
	public static final Class83 aClass83_93 = new Class83("glow3:", "leuchten3:", "brillant3:", "brilho3:");

	@OriginalMember(owner = "client!lu", name = "H", descriptor = "Z")
	public static boolean aBoolean411 = false;

	@OriginalMember(owner = "client!lu", name = "L", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_199 = new Class22(19, 6);

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIIIILclient!sd;IIIIII)Z")
	public static boolean method3499(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class213 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg3;
		@Pc(9) int local9 = arg6;
		@Pc(22) int local22 = arg3 - 64;
		@Pc(27) int local27 = arg6 - 64;
		Static159.anIntArrayArray30[64][64] = 99;
		Static14.anIntArrayArray1[64][64] = 0;
		@Pc(41) byte local41 = 0;
		@Pc(43) int local43 = 0;
		Static129.anIntArray182[0] = arg3;
		@Pc(50) int local50 = local41 + 1;
		Static416.anIntArray526[0] = arg6;
		@Pc(55) int[][] local55 = arg4.anIntArrayArray48;
		while (true) {
			label282: while (true) {
				@Pc(74) int local74;
				@Pc(69) int local69;
				@Pc(86) int local86;
				@Pc(92) int local92;
				@Pc(247) int local247;
				@Pc(289) int local289;
				do {
					do {
						do {
							label259: do {
								if (local50 == local43) {
									Static389.anInt6521 = local7;
									Static102.anInt2045 = local9;
									return false;
								}
								local7 = Static129.anIntArray182[local43];
								local9 = Static416.anIntArray526[local43];
								local69 = local9 - local27;
								local74 = local7 - local22;
								local43 = local43 + 1 & 0xFFF;
								local86 = local7 - arg4.anInt6230;
								local92 = local9 - arg4.anInt6235;
								if (arg10 == -4) {
									if (local7 == arg0 && local9 == arg5) {
										Static102.anInt2045 = local9;
										Static389.anInt6521 = local7;
										return true;
									}
								} else if (arg10 == -3) {
									if (Static455.method4305(arg8, arg5, arg8, arg1, arg7, local9, local7, arg0)) {
										Static389.anInt6521 = local7;
										Static102.anInt2045 = local9;
										return true;
									}
								} else if (arg10 == -2) {
									if (arg4.method4844(arg0, arg8, arg1, local7, arg2, arg5, local9, arg7, arg8)) {
										Static389.anInt6521 = local7;
										Static102.anInt2045 = local9;
										return true;
									}
								} else if (arg10 == -1) {
									if (arg4.method4840(arg7, arg8, arg0, arg2, arg1, arg5, local7, local9)) {
										Static102.anInt2045 = local9;
										Static389.anInt6521 = local7;
										return true;
									}
								} else if (arg10 == 0 || arg10 == 1 || arg10 == 2 || arg10 == 3 || arg10 == 9) {
									if (arg4.method4842(local9, arg9, arg5, arg8, local7, arg0, arg10)) {
										Static102.anInt2045 = local9;
										Static389.anInt6521 = local7;
										return true;
									}
								} else if (arg4.method4849(arg9, local7, arg10, arg0, local9, arg5, arg8)) {
									Static389.anInt6521 = local7;
									Static102.anInt2045 = local9;
									return true;
								}
								local247 = Static14.anIntArrayArray1[local74][local69] + 1;
								if (local74 > 0 && Static159.anIntArrayArray30[local74 - 1][local69] == 0 && (local55[local86 - 1][local92] & 0x43A40000) == 0 && (local55[local86 - 1][local92 + arg8 - 1] & 0x4E240000) == 0) {
									local289 = 1;
									while (true) {
										if (local289 >= arg8 - 1) {
											Static129.anIntArray182[local50] = local7 - 1;
											Static416.anIntArray526[local50] = local9;
											Static159.anIntArrayArray30[local74 - 1][local69] = 2;
											local50 = local50 + 1 & 0xFFF;
											Static14.anIntArrayArray1[local74 - 1][local69] = local247;
											break;
										}
										if ((local55[local86 - 1][local92 + local289] & 0x4FA40000) != 0) {
											break;
										}
										local289++;
									}
								}
								if (local74 < 128 - arg8 && Static159.anIntArrayArray30[local74 + 1][local69] == 0 && (local55[local86 + arg8][local92] & 0x60E40000) == 0 && (local55[arg8 + local86][local92 + arg8 - 1] & 0x78240000) == 0) {
									local289 = 1;
									while (true) {
										if (local289 >= arg8 - 1) {
											Static129.anIntArray182[local50] = local7 + 1;
											Static416.anIntArray526[local50] = local9;
											Static159.anIntArrayArray30[local74 + 1][local69] = 8;
											local50 = local50 + 1 & 0xFFF;
											Static14.anIntArrayArray1[local74 + 1][local69] = local247;
											break;
										}
										if ((local55[local86 + arg8][local289 + local92] & 0x78E40000) != 0) {
											break;
										}
										local289++;
									}
								}
								if (local69 > 0 && Static159.anIntArrayArray30[local74][local69 - 1] == 0 && (local55[local86][local92 - 1] & 0x43A40000) == 0 && (local55[arg8 + local86 - 1][local92 - 1] & 0x60E40000) == 0) {
									local289 = 1;
									while (true) {
										if (arg8 - 1 <= local289) {
											Static129.anIntArray182[local50] = local7;
											Static416.anIntArray526[local50] = local9 - 1;
											Static159.anIntArrayArray30[local74][local69 - 1] = 1;
											local50 = local50 + 1 & 0xFFF;
											Static14.anIntArrayArray1[local74][local69 - 1] = local247;
											break;
										}
										if ((local55[local289 + local86][local92 - 1] & 0x63E40000) != 0) {
											break;
										}
										local289++;
									}
								}
								if (local69 < 128 - arg8 && Static159.anIntArrayArray30[local74][local69 + 1] == 0 && (local55[local86][local92 + arg8] & 0x4E240000) == 0 && (local55[local86 + arg8 - 1][local92 + arg8] & 0x78240000) == 0) {
									local289 = 1;
									while (true) {
										if (arg8 - 1 <= local289) {
											Static129.anIntArray182[local50] = local7;
											Static416.anIntArray526[local50] = local9 + 1;
											Static159.anIntArrayArray30[local74][local69 + 1] = 4;
											local50 = local50 + 1 & 0xFFF;
											Static14.anIntArrayArray1[local74][local69 + 1] = local247;
											break;
										}
										if ((local55[local289 + local86][arg8 + local92] & 0x7E240000) != 0) {
											break;
										}
										local289++;
									}
								}
								if (local74 > 0 && local69 > 0 && Static159.anIntArrayArray30[local74 - 1][local69 - 1] == 0 && (local55[local86 - 1][local92 - 1] & 0x43A40000) == 0) {
									local289 = 1;
									while (true) {
										if (arg8 <= local289) {
											Static129.anIntArray182[local50] = local7 - 1;
											Static416.anIntArray526[local50] = local9 - 1;
											Static159.anIntArrayArray30[local74 - 1][local69 - 1] = 3;
											local50 = local50 + 1 & 0xFFF;
											Static14.anIntArrayArray1[local74 - 1][local69 - 1] = local247;
											break;
										}
										if ((local55[local86 - 1][local92 + local289 - 1] & 0x4FA40000) != 0 || (local55[local86 + local289 - 1][local92 - 1] & 0x63E40000) != 0) {
											break;
										}
										local289++;
									}
								}
								if (local74 < 128 - arg8 && local69 > 0 && Static159.anIntArrayArray30[local74 + 1][local69 - 1] == 0 && (local55[local86 + arg8][local92 - 1] & 0x60E40000) == 0) {
									local289 = 1;
									while (true) {
										if (arg8 <= local289) {
											Static129.anIntArray182[local50] = local7 + 1;
											Static416.anIntArray526[local50] = local9 - 1;
											local50 = local50 + 1 & 0xFFF;
											Static159.anIntArrayArray30[local74 + 1][local69 - 1] = 9;
											Static14.anIntArrayArray1[local74 + 1][local69 - 1] = local247;
											break;
										}
										if ((local55[local86 + arg8][local289 + local92 - 1] & 0x78E40000) != 0 || (local55[local86 + local289][local92 - 1] & 0x63E40000) != 0) {
											break;
										}
										local289++;
									}
								}
								if (local74 > 0 && 128 - arg8 > local69 && Static159.anIntArrayArray30[local74 - 1][local69 + 1] == 0 && (local55[local86 - 1][local92 + arg8] & 0x4E240000) == 0) {
									for (local289 = 1; local289 < arg8; local289++) {
										if ((local55[local86 - 1][local92 + local289] & 0x4FA40000) != 0 || (local55[local86 + local289 - 1][arg8 + local92] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static129.anIntArray182[local50] = local7 - 1;
									Static416.anIntArray526[local50] = local9 + 1;
									local50 = local50 + 1 & 0xFFF;
									Static159.anIntArrayArray30[local74 - 1][local69 + 1] = 6;
									Static14.anIntArrayArray1[local74 - 1][local69 + 1] = local247;
								}
							} while (128 - arg8 <= local74);
						} while (128 - arg8 <= local69);
					} while (Static159.anIntArrayArray30[local74 + 1][local69 + 1] != 0);
				} while ((local55[arg8 + local86][arg8 + local92] & 0x78240000) != 0);
				for (local289 = 1; local289 < arg8; local289++) {
					if ((local55[local289 + local86][arg8 + local92] & 0x7E240000) != 0 || (local55[arg8 + local86][local92 + local289] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static129.anIntArray182[local50] = local7 + 1;
				Static416.anIntArray526[local50] = local9 + 1;
				Static159.anIntArrayArray30[local74 + 1][local69 + 1] = 12;
				local50 = local50 + 1 & 0xFFF;
				Static14.anIntArrayArray1[local74 + 1][local69 + 1] = local247;
			}
		}
	}

	@OriginalMember(owner = "client!lu", name = "c", descriptor = "(B)V")
	public static void method3501() {
		Static259.aClass68_26.method1791();
		Static232.aClass68_25.method1791();
		Static384.aClass68_47.method1791();
		Static52.aClass68_4.method1791();
		Static158.aClass68_16.method1791();
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IB)V")
	public static void method3502(@OriginalArg(0) int arg0) {
		@Pc(8) Class4_Sub1_Sub11 local8 = Static405.method5222(arg0, 14);
		local8.method2608();
	}
}
