import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static580 {

	@OriginalMember(owner = "client!uo", name = "k", descriptor = "Lclient!ha;")
	public static Class16 aClass16_10;

	@OriginalMember(owner = "client!uo", name = "i", descriptor = "I")
	public static int anInt5357 = 0;

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIILclient!caa;IIIIIIII)Z")
	public static boolean method4372(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class48 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		@Pc(7) int local7 = arg0;
		@Pc(9) int local9 = arg8;
		@Pc(18) int local18 = arg0 - 64;
		@Pc(23) int local23 = arg8 - 64;
		Static342.anIntArrayArray37[64][64] = 99;
		Static84.anIntArrayArray5[64][64] = 0;
		@Pc(42) byte local42 = 0;
		@Pc(44) int local44 = 0;
		Static452.anIntArray445[0] = arg0;
		@Pc(51) int local51 = local42 + 1;
		Static579.anIntArray580[0] = arg8;
		@Pc(56) int[][] local56 = arg3.anIntArrayArray3;
		while (true) {
			label282: while (true) {
				@Pc(76) int local76;
				@Pc(81) int local81;
				@Pc(86) int local86;
				@Pc(92) int local92;
				@Pc(245) int local245;
				@Pc(284) int local284;
				do {
					do {
						do {
							label259: do {
								if (local51 == local44) {
									Static277.anInt5778 = local9;
									Static249.anInt5513 = local7;
									return false;
								}
								local9 = Static579.anIntArray580[local44];
								local7 = Static452.anIntArray445[local44];
								local44 = local44 + 1 & 0xFFF;
								local76 = local7 - local18;
								local81 = local9 - local23;
								local86 = local7 - arg3.anInt1884;
								local92 = local9 - arg3.anInt1886;
								if (arg7 == -4) {
									if (arg5 == local7 && arg9 == local9) {
										Static277.anInt5778 = local9;
										Static249.anInt5513 = local7;
										return true;
									}
								} else if (arg7 == -3) {
									if (Static318.method3985(local9, arg6, arg6, arg4, arg5, arg9, local7, arg1)) {
										Static277.anInt5778 = local9;
										Static249.anInt5513 = local7;
										return true;
									}
								} else if (arg7 == -2) {
									if (arg3.method1634(arg9, local7, arg4, local9, arg5, arg1, arg2, arg6, arg6)) {
										Static277.anInt5778 = local9;
										Static249.anInt5513 = local7;
										return true;
									}
								} else if (arg7 == -1) {
									if (arg3.method1632(arg9, local7, arg1, arg5, local9, arg6, arg4, arg2)) {
										Static249.anInt5513 = local7;
										Static277.anInt5778 = local9;
										return true;
									}
								} else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
									if (arg3.method1646(local9, arg5, arg9, local7, arg10, arg7, arg6)) {
										Static249.anInt5513 = local7;
										Static277.anInt5778 = local9;
										return true;
									}
								} else if (arg3.method1644(arg7, local9, arg6, arg10, local7, arg9, arg5)) {
									Static277.anInt5778 = local9;
									Static249.anInt5513 = local7;
									return true;
								}
								local245 = Static84.anIntArrayArray5[local76][local81] + 1;
								if (local76 > 0 && Static342.anIntArrayArray37[local76 - 1][local81] == 0 && (local56[local86 - 1][local92] & 0x43A40000) == 0 && (local56[local86 - 1][arg6 + local92 - 1] & 0x4E240000) == 0) {
									local284 = 1;
									while (true) {
										if (arg6 - 1 <= local284) {
											Static452.anIntArray445[local51] = local7 - 1;
											Static579.anIntArray580[local51] = local9;
											local51 = local51 + 1 & 0xFFF;
											Static342.anIntArrayArray37[local76 - 1][local81] = 2;
											Static84.anIntArrayArray5[local76 - 1][local81] = local245;
											break;
										}
										if ((local56[local86 - 1][local92 + local284] & 0x4FA40000) != 0) {
											break;
										}
										local284++;
									}
								}
								if (local76 < 128 - arg6 && Static342.anIntArrayArray37[local76 + 1][local81] == 0 && (local56[arg6 + local86][local92] & 0x60E40000) == 0 && (local56[arg6 + local86][local92 + arg6 - 1] & 0x78240000) == 0) {
									local284 = 1;
									while (true) {
										if (arg6 - 1 <= local284) {
											Static452.anIntArray445[local51] = local7 + 1;
											Static579.anIntArray580[local51] = local9;
											Static342.anIntArrayArray37[local76 + 1][local81] = 8;
											local51 = local51 + 1 & 0xFFF;
											Static84.anIntArrayArray5[local76 + 1][local81] = local245;
											break;
										}
										if ((local56[arg6 + local86][local284 + local92] & 0x78E40000) != 0) {
											break;
										}
										local284++;
									}
								}
								if (local81 > 0 && Static342.anIntArrayArray37[local76][local81 - 1] == 0 && (local56[local86][local92 - 1] & 0x43A40000) == 0 && (local56[local86 + arg6 - 1][local92 - 1] & 0x60E40000) == 0) {
									local284 = 1;
									while (true) {
										if (local284 >= arg6 - 1) {
											Static452.anIntArray445[local51] = local7;
											Static579.anIntArray580[local51] = local9 - 1;
											Static342.anIntArrayArray37[local76][local81 - 1] = 1;
											local51 = local51 + 1 & 0xFFF;
											Static84.anIntArrayArray5[local76][local81 - 1] = local245;
											break;
										}
										if ((local56[local86 + local284][local92 - 1] & 0x63E40000) != 0) {
											break;
										}
										local284++;
									}
								}
								if (local81 < 128 - arg6 && Static342.anIntArrayArray37[local76][local81 + 1] == 0 && (local56[local86][arg6 + local92] & 0x4E240000) == 0 && (local56[local86 + arg6 - 1][local92 + arg6] & 0x78240000) == 0) {
									local284 = 1;
									while (true) {
										if (arg6 - 1 <= local284) {
											Static452.anIntArray445[local51] = local7;
											Static579.anIntArray580[local51] = local9 + 1;
											Static342.anIntArrayArray37[local76][local81 + 1] = 4;
											local51 = local51 + 1 & 0xFFF;
											Static84.anIntArrayArray5[local76][local81 + 1] = local245;
											break;
										}
										if ((local56[local284 + local86][local92 + arg6] & 0x7E240000) != 0) {
											break;
										}
										local284++;
									}
								}
								if (local76 > 0 && local81 > 0 && Static342.anIntArrayArray37[local76 - 1][local81 - 1] == 0 && (local56[local86 - 1][local92 - 1] & 0x43A40000) == 0) {
									local284 = 1;
									while (true) {
										if (arg6 <= local284) {
											Static452.anIntArray445[local51] = local7 - 1;
											Static579.anIntArray580[local51] = local9 - 1;
											Static342.anIntArrayArray37[local76 - 1][local81 - 1] = 3;
											local51 = local51 + 1 & 0xFFF;
											Static84.anIntArrayArray5[local76 - 1][local81 - 1] = local245;
											break;
										}
										if ((local56[local86 - 1][local284 + local92 - 1] & 0x4FA40000) != 0 || (local56[local284 + local86 - 1][local92 - 1] & 0x63E40000) != 0) {
											break;
										}
										local284++;
									}
								}
								if (128 - arg6 > local76 && local81 > 0 && Static342.anIntArrayArray37[local76 + 1][local81 - 1] == 0 && (local56[arg6 + local86][local92 - 1] & 0x60E40000) == 0) {
									local284 = 1;
									while (true) {
										if (local284 >= arg6) {
											Static452.anIntArray445[local51] = local7 + 1;
											Static579.anIntArray580[local51] = local9 - 1;
											local51 = local51 + 1 & 0xFFF;
											Static342.anIntArrayArray37[local76 + 1][local81 - 1] = 9;
											Static84.anIntArrayArray5[local76 + 1][local81 - 1] = local245;
											break;
										}
										if ((local56[arg6 + local86][local92 + local284 - 1] & 0x78E40000) != 0 || (local56[local86 + local284][local92 - 1] & 0x63E40000) != 0) {
											break;
										}
										local284++;
									}
								}
								if (local76 > 0 && 128 - arg6 > local81 && Static342.anIntArrayArray37[local76 - 1][local81 + 1] == 0 && (local56[local86 - 1][arg6 + local92] & 0x4E240000) == 0) {
									for (local284 = 1; local284 < arg6; local284++) {
										if ((local56[local86 - 1][local92 + local284] & 0x4FA40000) != 0 || (local56[local86 + local284 - 1][arg6 + local92] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static452.anIntArray445[local51] = local7 - 1;
									Static579.anIntArray580[local51] = local9 + 1;
									Static342.anIntArrayArray37[local76 - 1][local81 + 1] = 6;
									local51 = local51 + 1 & 0xFFF;
									Static84.anIntArrayArray5[local76 - 1][local81 + 1] = local245;
								}
							} while (local76 >= 128 - arg6);
						} while (local81 >= 128 - arg6);
					} while (Static342.anIntArrayArray37[local76 + 1][local81 + 1] != 0);
				} while ((local56[local86 + arg6][arg6 + local92] & 0x78240000) != 0);
				for (local284 = 1; local284 < arg6; local284++) {
					if ((local56[local284 + local86][arg6 + local92] & 0x7E240000) != 0 || (local56[arg6 + local86][local92 + local284] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static452.anIntArray445[local51] = local7 + 1;
				Static579.anIntArray580[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static342.anIntArrayArray37[local76 + 1][local81 + 1] = 12;
				Static84.anIntArrayArray5[local76 + 1][local81 + 1] = local245;
			}
		}
	}

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "(I)V")
	public static void method4373() {
		Static91.anInt2547 = 0;
		Static128.anInt3421 = 0;
		Static226.anInt5177++;
		Static482.method7143();
		Static49.method1398();
		Static440.method6802();
		@Pc(21) boolean local21 = false;
		@Pc(34) int local34;
		for (@Pc(23) int local23 = 0; local23 < Static128.anInt3421; local23++) {
			local34 = Static214.anIntArray272[local23];
			@Pc(41) Class8_Sub50 local41 = (Class8_Sub50) Static278.aClass253_20.method6594((long) local34);
			@Pc(44) Class15_Sub1_Sub2_Sub2_Sub2 local44 = local41.aClass15_Sub1_Sub2_Sub2_Sub2_2;
			if (Static211.aBoolean370 && Static582.method8110(local34)) {
				Static108.method2413();
			}
			if (local44.anInt8089 != Static226.anInt5177) {
				if (local44.aClass300_1.method7314()) {
					Static218.method4118(local44);
				}
				local44.method6702(null);
				local21 = true;
				local41.method8640();
			}
		}
		if (local21) {
			Static438.anInt8226 = Static278.aClass253_20.method6592();
			Static278.aClass253_20.method6590(Static537.aClass8_Sub50Array1);
		}
		if (Static635.anInt10565 != Static442.aClass8_Sub8_Sub2_2.anInt10588) {
			throw new RuntimeException("gnp1 pos:" + Static442.aClass8_Sub8_Sub2_2.anInt10588 + " psize:" + Static635.anInt10565);
		}
		for (local34 = 0; local34 < Static59.anInt1906; local34++) {
			if (Static278.aClass253_20.method6594((long) Static620.anIntArray609[local34]) == null) {
				throw new RuntimeException("gnp2 pos:" + local34 + " size:" + Static59.anInt1906);
			}
		}
		if (Static438.anInt8226 - Static59.anInt1906 != 0) {
			throw new RuntimeException("gnp3 mis:" + (Static438.anInt8226 - Static59.anInt1906));
		}
		for (@Pc(174) int local174 = 0; local174 < Static438.anInt8226; local174++) {
			if (Static226.anInt5177 != Static537.aClass8_Sub50Array1[local174].aClass15_Sub1_Sub2_Sub2_Sub2_2.anInt8089) {
				throw new RuntimeException("gnp4 uk:" + Static537.aClass8_Sub50Array1[local174].aClass15_Sub1_Sub2_Sub2_Sub2_2.anInt8075);
			}
		}
	}
}
