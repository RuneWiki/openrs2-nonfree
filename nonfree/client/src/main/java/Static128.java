import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method2691(@OriginalArg(0) String arg0) {
		if (!arg0.equals("")) {
			Static332.method5312(Static449.aClass77_76);
			Static383.aClass12_Sub8_Sub2_1.method5214(Static201.method3811(arg0));
			Static383.aClass12_Sub8_Sub2_1.method5180(arg0);
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIIIIIILclient!ld;I)Z")
	public static boolean method2693(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class184 arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg7;
		@Pc(9) int local9 = arg0;
		@Pc(18) int local18 = arg7 - 64;
		Static315.anIntArrayArray56[64][64] = 99;
		@Pc(29) int local29 = arg0 - 64;
		Static412.anIntArrayArray71[64][64] = 0;
		@Pc(37) byte local37 = 0;
		@Pc(39) int local39 = 0;
		Static449.anIntArray613[0] = arg7;
		@Pc(46) int local46 = local37 + 1;
		Static97.anIntArray199[0] = arg0;
		@Pc(51) int[][] local51 = arg9.anIntArrayArray51;
		while (true) {
			label282: while (true) {
				@Pc(71) int local71;
				@Pc(66) int local66;
				@Pc(83) int local83;
				@Pc(88) int local88;
				@Pc(243) int local243;
				@Pc(279) int local279;
				do {
					do {
						do {
							label259: do {
								if (local39 == local46) {
									Static288.anInt5601 = local7;
									Static429.anInt7947 = local9;
									return false;
								}
								local9 = Static97.anIntArray199[local39];
								local7 = Static449.anIntArray613[local39];
								local66 = local9 - local29;
								local71 = local7 - local18;
								local39 = local39 + 1 & 0xFFF;
								local83 = local7 - arg9.anInt5439;
								local88 = local9 - arg9.anInt5440;
								if (arg6 == -4) {
									if (local7 == arg10 && arg1 == local9) {
										Static429.anInt7947 = local9;
										Static288.anInt5601 = local7;
										return true;
									}
								} else if (arg6 == -3) {
									if (Static176.method3493(local7, arg4, local9, arg2, arg10, arg5, arg2, arg1)) {
										Static288.anInt5601 = local7;
										Static429.anInt7947 = local9;
										return true;
									}
								} else if (arg6 == -2) {
									if (arg9.method4598(arg2, arg8, arg10, local7, local9, arg2, arg1, arg4, arg5)) {
										Static288.anInt5601 = local7;
										Static429.anInt7947 = local9;
										return true;
									}
								} else if (arg6 == -1) {
									if (arg9.method4594(arg1, local7, arg10, arg4, arg2, arg5, arg8, local9)) {
										Static429.anInt7947 = local9;
										Static288.anInt5601 = local7;
										return true;
									}
								} else if (arg6 == 0 || arg6 == 1 || arg6 == 2 || arg6 == 3 || arg6 == 9) {
									if (arg9.method4586(arg1, arg10, local7, arg3, arg6, local9, arg2)) {
										Static429.anInt7947 = local9;
										Static288.anInt5601 = local7;
										return true;
									}
								} else if (arg9.method4592(local9, arg6, arg1, arg2, arg3, local7, arg10)) {
									Static429.anInt7947 = local9;
									Static288.anInt5601 = local7;
									return true;
								}
								local243 = Static412.anIntArrayArray71[local71][local66] + 1;
								if (local71 > 0 && Static315.anIntArrayArray56[local71 - 1][local66] == 0 && (local51[local83 - 1][local88] & 0x43A40000) == 0 && (local51[local83 - 1][local88 + arg2 - 1] & 0x4E240000) == 0) {
									local279 = 1;
									while (true) {
										if (arg2 - 1 <= local279) {
											Static449.anIntArray613[local46] = local7 - 1;
											Static97.anIntArray199[local46] = local9;
											local46 = local46 + 1 & 0xFFF;
											Static315.anIntArrayArray56[local71 - 1][local66] = 2;
											Static412.anIntArrayArray71[local71 - 1][local66] = local243;
											break;
										}
										if ((local51[local83 - 1][local279 + local88] & 0x4FA40000) != 0) {
											break;
										}
										local279++;
									}
								}
								if (local71 < 128 - arg2 && Static315.anIntArrayArray56[local71 + 1][local66] == 0 && (local51[local83 + arg2][local88] & 0x60E40000) == 0 && (local51[local83 + arg2][arg2 + local88 - 1] & 0x78240000) == 0) {
									local279 = 1;
									while (true) {
										if (arg2 - 1 <= local279) {
											Static449.anIntArray613[local46] = local7 + 1;
											Static97.anIntArray199[local46] = local9;
											Static315.anIntArrayArray56[local71 + 1][local66] = 8;
											local46 = local46 + 1 & 0xFFF;
											Static412.anIntArrayArray71[local71 + 1][local66] = local243;
											break;
										}
										if ((local51[local83 + arg2][local88 + local279] & 0x78E40000) != 0) {
											break;
										}
										local279++;
									}
								}
								if (local66 > 0 && Static315.anIntArrayArray56[local71][local66 - 1] == 0 && (local51[local83][local88 - 1] & 0x43A40000) == 0 && (local51[arg2 + local83 - 1][local88 - 1] & 0x60E40000) == 0) {
									local279 = 1;
									while (true) {
										if (arg2 - 1 <= local279) {
											Static449.anIntArray613[local46] = local7;
											Static97.anIntArray199[local46] = local9 - 1;
											Static315.anIntArrayArray56[local71][local66 - 1] = 1;
											local46 = local46 + 1 & 0xFFF;
											Static412.anIntArrayArray71[local71][local66 - 1] = local243;
											break;
										}
										if ((local51[local279 + local83][local88 - 1] & 0x63E40000) != 0) {
											break;
										}
										local279++;
									}
								}
								if (local66 < 128 - arg2 && Static315.anIntArrayArray56[local71][local66 + 1] == 0 && (local51[local83][arg2 + local88] & 0x4E240000) == 0 && (local51[arg2 + local83 - 1][local88 + arg2] & 0x78240000) == 0) {
									local279 = 1;
									while (true) {
										if (local279 >= arg2 - 1) {
											Static449.anIntArray613[local46] = local7;
											Static97.anIntArray199[local46] = local9 + 1;
											local46 = local46 + 1 & 0xFFF;
											Static315.anIntArrayArray56[local71][local66 + 1] = 4;
											Static412.anIntArrayArray71[local71][local66 + 1] = local243;
											break;
										}
										if ((local51[local279 + local83][arg2 + local88] & 0x7E240000) != 0) {
											break;
										}
										local279++;
									}
								}
								if (local71 > 0 && local66 > 0 && Static315.anIntArrayArray56[local71 - 1][local66 - 1] == 0 && (local51[local83 - 1][local88 - 1] & 0x43A40000) == 0) {
									local279 = 1;
									while (true) {
										if (local279 >= arg2) {
											Static449.anIntArray613[local46] = local7 - 1;
											Static97.anIntArray199[local46] = local9 - 1;
											Static315.anIntArrayArray56[local71 - 1][local66 - 1] = 3;
											local46 = local46 + 1 & 0xFFF;
											Static412.anIntArrayArray71[local71 - 1][local66 - 1] = local243;
											break;
										}
										if ((local51[local83 - 1][local279 + local88 - 1] & 0x4FA40000) != 0 || (local51[local279 + local83 - 1][local88 - 1] & 0x63E40000) != 0) {
											break;
										}
										local279++;
									}
								}
								if (128 - arg2 > local71 && local66 > 0 && Static315.anIntArrayArray56[local71 + 1][local66 - 1] == 0 && (local51[local83 + arg2][local88 - 1] & 0x60E40000) == 0) {
									local279 = 1;
									while (true) {
										if (arg2 <= local279) {
											Static449.anIntArray613[local46] = local7 + 1;
											Static97.anIntArray199[local46] = local9 - 1;
											local46 = local46 + 1 & 0xFFF;
											Static315.anIntArrayArray56[local71 + 1][local66 - 1] = 9;
											Static412.anIntArrayArray71[local71 + 1][local66 - 1] = local243;
											break;
										}
										if ((local51[local83 + arg2][local279 + local88 - 1] & 0x78E40000) != 0 || (local51[local279 + local83][local88 - 1] & 0x63E40000) != 0) {
											break;
										}
										local279++;
									}
								}
								if (local71 > 0 && local66 < 128 - arg2 && Static315.anIntArrayArray56[local71 - 1][local66 + 1] == 0 && (local51[local83 - 1][local88 + arg2] & 0x4E240000) == 0) {
									for (local279 = 1; local279 < arg2; local279++) {
										if ((local51[local83 - 1][local88 + local279] & 0x4FA40000) != 0 || (local51[local83 + local279 - 1][local88 + arg2] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static449.anIntArray613[local46] = local7 - 1;
									Static97.anIntArray199[local46] = local9 + 1;
									Static315.anIntArrayArray56[local71 - 1][local66 + 1] = 6;
									local46 = local46 + 1 & 0xFFF;
									Static412.anIntArrayArray71[local71 - 1][local66 + 1] = local243;
								}
							} while (local71 >= 128 - arg2);
						} while (128 - arg2 <= local66);
					} while (Static315.anIntArrayArray56[local71 + 1][local66 + 1] != 0);
				} while ((local51[local83 + arg2][local88 + arg2] & 0x78240000) != 0);
				for (local279 = 1; local279 < arg2; local279++) {
					if ((local51[local279 + local83][local88 + arg2] & 0x7E240000) != 0 || (local51[local83 + arg2][local279 + local88] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static449.anIntArray613[local46] = local7 + 1;
				Static97.anIntArray199[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static315.anIntArrayArray56[local71 + 1][local66 + 1] = 12;
				Static412.anIntArrayArray71[local71 + 1][local66 + 1] = local243;
			}
		}
	}
}
