import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIII)V")
	public static void method3238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static351.anIntArrayArray33 != null) {
			Static351.anIntArrayArray33[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static131.aShortArrayArray1 != null) {
			Static131.aShortArrayArray1[arg0][arg1] = (short) arg3;
		}
		if (Static411.aByteArrayArray22 != null) {
			Static411.aByteArrayArray22[arg0][arg1] = (byte) arg4;
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)V")
	public static void method3239() {
		Static22.anInt572 = 0;
		Static166.aClass111_49.method2555();
		Static166.aClass111_49.method2552(Static380.aClass1_Sub40_3);
		Static22.anInt572++;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "([ILclient!qh;II)V")
	public static void method3240(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class11_Sub1_Sub1_Sub3_Sub2 arg1, @OriginalArg(2) int arg2) {
		@Pc(10) boolean local10;
		@Pc(12) int local12;
		if (arg1.anIntArray448 != null) {
			local10 = true;
			for (local12 = 0; local12 < arg1.anIntArray448.length; local12++) {
				if (arg0[local12] != arg1.anIntArray448[local12]) {
					local10 = false;
					break;
				}
			}
			if (local10 && arg1.anInt7591 != -1) {
				@Pc(49) Class197 local49 = Static223.aClass245_1.method5312(arg1.anInt7591);
				@Pc(52) int local52 = local49.anInt5072;
				if (local52 == 1) {
					arg1.anInt7545 = 0;
					arg1.anInt7580 = 0;
					arg1.anInt7532 = arg2;
					arg1.anInt7558 = 0;
					arg1.anInt7595 = 1;
					if (!arg1.aBoolean577) {
						Static473.method6515(arg1, local49, arg1.anInt7558);
					}
				}
				if (local52 == 2) {
					arg1.anInt7545 = 0;
				}
			}
		}
		local10 = true;
		for (local12 = 0; local12 < arg0.length; local12++) {
			if (arg0[local12] != -1) {
				local10 = false;
			}
			if (arg1.anIntArray448 == null || arg1.anIntArray448[local12] == -1 || Static223.aClass245_1.method5312(arg0[local12]).anInt5076 >= Static223.aClass245_1.method5312(arg1.anIntArray448[local12]).anInt5076) {
				arg1.anInt7532 = arg2;
				arg1.anInt7607 = arg1.anInt7604;
				arg1.anIntArray448 = arg0;
			}
		}
		if (local10) {
			arg1.anIntArray448 = arg0;
			arg1.anInt7532 = arg2;
			arg1.anInt7607 = arg1.anInt7604;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIIILclient!nn;IIII)Z")
	public static boolean method3241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class240 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg8;
		@Pc(9) int local9 = arg3;
		@Pc(18) int local18 = arg8 - 64;
		Static69.anIntArrayArray6[64][64] = 99;
		@Pc(29) int local29 = arg3 - 64;
		Static581.anIntArrayArray56[64][64] = 0;
		@Pc(37) byte local37 = 0;
		@Pc(39) int local39 = 0;
		Static379.anIntArray393[0] = arg8;
		@Pc(46) int local46 = local37 + 1;
		Static181.anIntArray160[0] = arg3;
		@Pc(51) int[][] local51 = arg7.anIntArrayArray34;
		while (true) {
			label282: while (true) {
				@Pc(69) int local69;
				@Pc(80) int local80;
				@Pc(86) int local86;
				@Pc(92) int local92;
				@Pc(238) int local238;
				@Pc(283) int local283;
				do {
					do {
						do {
							label259: do {
								if (local39 == local46) {
									Static427.anInt7668 = local9;
									Static146.anInt2805 = local7;
									return false;
								}
								local7 = Static379.anIntArray393[local39];
								local9 = Static181.anIntArray160[local39];
								local69 = local7 - local18;
								local39 = local39 + 1 & 0xFFF;
								local80 = local9 - local29;
								local86 = local7 - arg7.anInt6474;
								local92 = local9 - arg7.anInt6475;
								if (arg4 == -4) {
									if (arg2 == local7 && local9 == arg6) {
										Static427.anInt7668 = local9;
										Static146.anInt2805 = local7;
										return true;
									}
								} else if (arg4 == -3) {
									if (Static371.method5426(local7, arg10, arg2, arg10, arg5, arg1, local9, arg6)) {
										Static427.anInt7668 = local9;
										Static146.anInt2805 = local7;
										return true;
									}
								} else if (arg4 == -2) {
									if (arg7.method5251(arg2, arg1, local7, local9, arg5, arg9, arg10, arg10, arg6)) {
										Static427.anInt7668 = local9;
										Static146.anInt2805 = local7;
										return true;
									}
								} else if (arg4 == -1) {
									if (arg7.method5263(arg9, local9, arg6, arg1, arg5, local7, arg10, arg2)) {
										Static146.anInt2805 = local7;
										Static427.anInt7668 = local9;
										return true;
									}
								} else if (arg4 == 0 || arg4 == 1 || arg4 == 2 || arg4 == 3 || arg4 == 9) {
									if (arg7.method5249(local7, arg0, arg4, arg2, arg6, local9, arg10)) {
										Static427.anInt7668 = local9;
										Static146.anInt2805 = local7;
										return true;
									}
								} else if (arg7.method5262(arg10, local9, arg0, arg2, arg4, arg6, local7)) {
									Static146.anInt2805 = local7;
									Static427.anInt7668 = local9;
									return true;
								}
								local238 = Static581.anIntArrayArray56[local69][local80] + 1;
								if (local69 > 0 && Static69.anIntArrayArray6[local69 - 1][local80] == 0 && (local51[local86 - 1][local92] & 0x43A40000) == 0 && (local51[local86 - 1][local92 + arg10 - 1] & 0x4E240000) == 0) {
									local283 = 1;
									while (true) {
										if (local283 >= arg10 - 1) {
											Static379.anIntArray393[local46] = local7 - 1;
											Static181.anIntArray160[local46] = local9;
											local46 = local46 + 1 & 0xFFF;
											Static69.anIntArrayArray6[local69 - 1][local80] = 2;
											Static581.anIntArrayArray56[local69 - 1][local80] = local238;
											break;
										}
										if ((local51[local86 - 1][local283 + local92] & 0x4FA40000) != 0) {
											break;
										}
										local283++;
									}
								}
								if (local69 < 128 - arg10 && Static69.anIntArrayArray6[local69 + 1][local80] == 0 && (local51[arg10 + local86][local92] & 0x60E40000) == 0 && (local51[arg10 + local86][arg10 + local92 - 1] & 0x78240000) == 0) {
									local283 = 1;
									while (true) {
										if (arg10 - 1 <= local283) {
											Static379.anIntArray393[local46] = local7 + 1;
											Static181.anIntArray160[local46] = local9;
											Static69.anIntArrayArray6[local69 + 1][local80] = 8;
											local46 = local46 + 1 & 0xFFF;
											Static581.anIntArrayArray56[local69 + 1][local80] = local238;
											break;
										}
										if ((local51[local86 + arg10][local92 + local283] & 0x78E40000) != 0) {
											break;
										}
										local283++;
									}
								}
								if (local80 > 0 && Static69.anIntArrayArray6[local69][local80 - 1] == 0 && (local51[local86][local92 - 1] & 0x43A40000) == 0 && (local51[local86 + arg10 - 1][local92 - 1] & 0x60E40000) == 0) {
									local283 = 1;
									while (true) {
										if (local283 >= arg10 - 1) {
											Static379.anIntArray393[local46] = local7;
											Static181.anIntArray160[local46] = local9 - 1;
											Static69.anIntArrayArray6[local69][local80 - 1] = 1;
											local46 = local46 + 1 & 0xFFF;
											Static581.anIntArrayArray56[local69][local80 - 1] = local238;
											break;
										}
										if ((local51[local283 + local86][local92 - 1] & 0x63E40000) != 0) {
											break;
										}
										local283++;
									}
								}
								if (local80 < 128 - arg10 && Static69.anIntArrayArray6[local69][local80 + 1] == 0 && (local51[local86][local92 + arg10] & 0x4E240000) == 0 && (local51[local86 + arg10 - 1][arg10 + local92] & 0x78240000) == 0) {
									local283 = 1;
									while (true) {
										if (arg10 - 1 <= local283) {
											Static379.anIntArray393[local46] = local7;
											Static181.anIntArray160[local46] = local9 + 1;
											Static69.anIntArrayArray6[local69][local80 + 1] = 4;
											local46 = local46 + 1 & 0xFFF;
											Static581.anIntArrayArray56[local69][local80 + 1] = local238;
											break;
										}
										if ((local51[local86 + local283][arg10 + local92] & 0x7E240000) != 0) {
											break;
										}
										local283++;
									}
								}
								if (local69 > 0 && local80 > 0 && Static69.anIntArrayArray6[local69 - 1][local80 - 1] == 0 && (local51[local86 - 1][local92 - 1] & 0x43A40000) == 0) {
									local283 = 1;
									while (true) {
										if (local283 >= arg10) {
											Static379.anIntArray393[local46] = local7 - 1;
											Static181.anIntArray160[local46] = local9 - 1;
											Static69.anIntArrayArray6[local69 - 1][local80 - 1] = 3;
											local46 = local46 + 1 & 0xFFF;
											Static581.anIntArrayArray56[local69 - 1][local80 - 1] = local238;
											break;
										}
										if ((local51[local86 - 1][local92 + local283 - 1] & 0x4FA40000) != 0 || (local51[local283 + local86 - 1][local92 - 1] & 0x63E40000) != 0) {
											break;
										}
										local283++;
									}
								}
								if (local69 < 128 - arg10 && local80 > 0 && Static69.anIntArrayArray6[local69 + 1][local80 - 1] == 0 && (local51[local86 + arg10][local92 - 1] & 0x60E40000) == 0) {
									local283 = 1;
									while (true) {
										if (arg10 <= local283) {
											Static379.anIntArray393[local46] = local7 + 1;
											Static181.anIntArray160[local46] = local9 - 1;
											Static69.anIntArrayArray6[local69 + 1][local80 - 1] = 9;
											local46 = local46 + 1 & 0xFFF;
											Static581.anIntArrayArray56[local69 + 1][local80 - 1] = local238;
											break;
										}
										if ((local51[local86 + arg10][local92 + local283 - 1] & 0x78E40000) != 0 || (local51[local283 + local86][local92 - 1] & 0x63E40000) != 0) {
											break;
										}
										local283++;
									}
								}
								if (local69 > 0 && local80 < 128 - arg10 && Static69.anIntArrayArray6[local69 - 1][local80 + 1] == 0 && (local51[local86 - 1][arg10 + local92] & 0x4E240000) == 0) {
									for (local283 = 1; local283 < arg10; local283++) {
										if ((local51[local86 - 1][local283 + local92] & 0x4FA40000) != 0 || (local51[local86 + local283 - 1][local92 + arg10] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static379.anIntArray393[local46] = local7 - 1;
									Static181.anIntArray160[local46] = local9 + 1;
									Static69.anIntArrayArray6[local69 - 1][local80 + 1] = 6;
									local46 = local46 + 1 & 0xFFF;
									Static581.anIntArrayArray56[local69 - 1][local80 + 1] = local238;
								}
							} while (128 - arg10 <= local69);
						} while (128 - arg10 <= local80);
					} while (Static69.anIntArrayArray6[local69 + 1][local80 + 1] != 0);
				} while ((local51[local86 + arg10][arg10 + local92] & 0x78240000) != 0);
				for (local283 = 1; local283 < arg10; local283++) {
					if ((local51[local86 + local283][arg10 + local92] & 0x7E240000) != 0 || (local51[local86 + arg10][local283 + local92] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static379.anIntArray393[local46] = local7 + 1;
				Static181.anIntArray160[local46] = local9 + 1;
				Static69.anIntArrayArray6[local69 + 1][local80 + 1] = 12;
				local46 = local46 + 1 & 0xFFF;
				Static581.anIntArrayArray56[local69 + 1][local80 + 1] = local238;
			}
		}
	}
}
