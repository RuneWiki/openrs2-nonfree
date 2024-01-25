import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!fu", name = "d", descriptor = "I")
	public static int anInt3378;

	@OriginalMember(owner = "client!fu", name = "c", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_58 = new Class126(120, 0);

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(B)V")
	public static void method2976() {
		Static562.aClass208ArrayArray3 = new Class208[Static280.aClass143_73.method3116()][];
		Static384.aClass208ArrayArray2 = new Class208[Static280.aClass143_73.method3116()][];
		Static89.aBooleanArray8 = new boolean[Static280.aClass143_73.method3116()];
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIIIIBIILclient!jo;III)Z")
	public static boolean method2977(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class198 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg4;
		@Pc(9) int local9 = arg9;
		@Pc(18) int local18 = arg4 - 64;
		@Pc(23) int local23 = arg9 - 64;
		Static638.anIntArrayArray106[64][64] = 99;
		Static376.anIntArrayArray70[64][64] = 0;
		@Pc(37) byte local37 = 0;
		Static476.anIntArray503[0] = arg4;
		@Pc(43) int local43 = 0;
		@Pc(46) int local46 = local37 + 1;
		Static331.anIntArray638[0] = arg9;
		@Pc(51) int[][] local51 = arg7.anIntArrayArray57;
		while (true) {
			label282: while (true) {
				@Pc(83) int local83;
				@Pc(93) int local93;
				@Pc(99) int local99;
				@Pc(105) int local105;
				@Pc(254) int local254;
				@Pc(290) int local290;
				do {
					do {
						do {
							label259: do {
								if (local46 == local43) {
									Static502.anInt8448 = local9;
									Static77.anInt1744 = local7;
									return false;
								}
								local9 = Static331.anIntArray638[local43];
								local7 = Static476.anIntArray503[local43];
								local83 = local7 - local18;
								local43 = local43 + 1 & 0xFFF;
								local93 = local9 - local23;
								local99 = local7 - arg7.anInt5352;
								local105 = local9 - arg7.anInt5350;
								if (arg0 == -4) {
									if (arg8 == local7 && local9 == arg6) {
										Static502.anInt8448 = local9;
										Static77.anInt1744 = local7;
										return true;
									}
								} else if (arg0 == -3) {
									if (Static263.method4139(arg10, arg8, arg6, local7, arg2, local9, arg5, arg2)) {
										Static77.anInt1744 = local7;
										Static502.anInt8448 = local9;
										return true;
									}
								} else if (arg0 == -2) {
									if (arg7.method4543(arg8, local9, arg2, local7, arg3, arg5, arg6, arg2, arg10)) {
										Static502.anInt8448 = local9;
										Static77.anInt1744 = local7;
										return true;
									}
								} else if (arg0 == -1) {
									if (arg7.method4538(local9, arg10, arg6, arg5, arg3, arg8, arg2, local7)) {
										Static502.anInt8448 = local9;
										Static77.anInt1744 = local7;
										return true;
									}
								} else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
									if (arg7.method4534(arg0, arg2, local9, arg6, arg8, arg1, local7)) {
										Static77.anInt1744 = local7;
										Static502.anInt8448 = local9;
										return true;
									}
								} else if (arg7.method4541(local7, arg0, arg2, arg8, arg1, local9, arg6)) {
									Static502.anInt8448 = local9;
									Static77.anInt1744 = local7;
									return true;
								}
								local254 = Static376.anIntArrayArray70[local83][local93] + 1;
								if (local83 > 0 && Static638.anIntArrayArray106[local83 - 1][local93] == 0 && (local51[local99 - 1][local105] & 0x43A40000) == 0 && (local51[local99 - 1][arg2 + local105 - 1] & 0x4E240000) == 0) {
									local290 = 1;
									while (true) {
										if (arg2 - 1 <= local290) {
											Static476.anIntArray503[local46] = local7 - 1;
											Static331.anIntArray638[local46] = local9;
											Static638.anIntArrayArray106[local83 - 1][local93] = 2;
											local46 = local46 + 1 & 0xFFF;
											Static376.anIntArrayArray70[local83 - 1][local93] = local254;
											break;
										}
										if ((local51[local99 - 1][local105 + local290] & 0x4FA40000) != 0) {
											break;
										}
										local290++;
									}
								}
								if (local83 < 128 - arg2 && Static638.anIntArrayArray106[local83 + 1][local93] == 0 && (local51[arg2 + local99][local105] & 0x60E40000) == 0 && (local51[local99 + arg2][local105 + arg2 - 1] & 0x78240000) == 0) {
									local290 = 1;
									while (true) {
										if (arg2 - 1 <= local290) {
											Static476.anIntArray503[local46] = local7 + 1;
											Static331.anIntArray638[local46] = local9;
											Static638.anIntArrayArray106[local83 + 1][local93] = 8;
											local46 = local46 + 1 & 0xFFF;
											Static376.anIntArrayArray70[local83 + 1][local93] = local254;
											break;
										}
										if ((local51[arg2 + local99][local290 + local105] & 0x78E40000) != 0) {
											break;
										}
										local290++;
									}
								}
								if (local93 > 0 && Static638.anIntArrayArray106[local83][local93 - 1] == 0 && (local51[local99][local105 - 1] & 0x43A40000) == 0 && (local51[local99 + arg2 - 1][local105 - 1] & 0x60E40000) == 0) {
									local290 = 1;
									while (true) {
										if (local290 >= arg2 - 1) {
											Static476.anIntArray503[local46] = local7;
											Static331.anIntArray638[local46] = local9 - 1;
											Static638.anIntArrayArray106[local83][local93 - 1] = 1;
											local46 = local46 + 1 & 0xFFF;
											Static376.anIntArrayArray70[local83][local93 - 1] = local254;
											break;
										}
										if ((local51[local290 + local99][local105 - 1] & 0x63E40000) != 0) {
											break;
										}
										local290++;
									}
								}
								if (local93 < 128 - arg2 && Static638.anIntArrayArray106[local83][local93 + 1] == 0 && (local51[local99][local105 + arg2] & 0x4E240000) == 0 && (local51[local99 + arg2 - 1][local105 + arg2] & 0x78240000) == 0) {
									local290 = 1;
									while (true) {
										if (local290 >= arg2 - 1) {
											Static476.anIntArray503[local46] = local7;
											Static331.anIntArray638[local46] = local9 + 1;
											Static638.anIntArrayArray106[local83][local93 + 1] = 4;
											local46 = local46 + 1 & 0xFFF;
											Static376.anIntArrayArray70[local83][local93 + 1] = local254;
											break;
										}
										if ((local51[local290 + local99][arg2 + local105] & 0x7E240000) != 0) {
											break;
										}
										local290++;
									}
								}
								if (local83 > 0 && local93 > 0 && Static638.anIntArrayArray106[local83 - 1][local93 - 1] == 0 && (local51[local99 - 1][local105 - 1] & 0x43A40000) == 0) {
									local290 = 1;
									while (true) {
										if (arg2 <= local290) {
											Static476.anIntArray503[local46] = local7 - 1;
											Static331.anIntArray638[local46] = local9 - 1;
											local46 = local46 + 1 & 0xFFF;
											Static638.anIntArrayArray106[local83 - 1][local93 - 1] = 3;
											Static376.anIntArrayArray70[local83 - 1][local93 - 1] = local254;
											break;
										}
										if ((local51[local99 - 1][local105 + local290 - 1] & 0x4FA40000) != 0 || (local51[local99 + local290 - 1][local105 - 1] & 0x63E40000) != 0) {
											break;
										}
										local290++;
									}
								}
								if (128 - arg2 > local83 && local93 > 0 && Static638.anIntArrayArray106[local83 + 1][local93 - 1] == 0 && (local51[local99 + arg2][local105 - 1] & 0x60E40000) == 0) {
									local290 = 1;
									while (true) {
										if (local290 >= arg2) {
											Static476.anIntArray503[local46] = local7 + 1;
											Static331.anIntArray638[local46] = local9 - 1;
											Static638.anIntArrayArray106[local83 + 1][local93 - 1] = 9;
											local46 = local46 + 1 & 0xFFF;
											Static376.anIntArrayArray70[local83 + 1][local93 - 1] = local254;
											break;
										}
										if ((local51[local99 + arg2][local290 + local105 - 1] & 0x78E40000) != 0 || (local51[local290 + local99][local105 - 1] & 0x63E40000) != 0) {
											break;
										}
										local290++;
									}
								}
								if (local83 > 0 && 128 - arg2 > local93 && Static638.anIntArrayArray106[local83 - 1][local93 + 1] == 0 && (local51[local99 - 1][arg2 + local105] & 0x4E240000) == 0) {
									for (local290 = 1; local290 < arg2; local290++) {
										if ((local51[local99 - 1][local105 + local290] & 0x4FA40000) != 0 || (local51[local99 + local290 - 1][local105 + arg2] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static476.anIntArray503[local46] = local7 - 1;
									Static331.anIntArray638[local46] = local9 + 1;
									local46 = local46 + 1 & 0xFFF;
									Static638.anIntArrayArray106[local83 - 1][local93 + 1] = 6;
									Static376.anIntArrayArray70[local83 - 1][local93 + 1] = local254;
								}
							} while (local83 >= 128 - arg2);
						} while (local93 >= 128 - arg2);
					} while (Static638.anIntArrayArray106[local83 + 1][local93 + 1] != 0);
				} while ((local51[arg2 + local99][local105 + arg2] & 0x78240000) != 0);
				for (local290 = 1; local290 < arg2; local290++) {
					if ((local51[local290 + local99][arg2 + local105] & 0x7E240000) != 0 || (local51[arg2 + local99][local290 + local105] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static476.anIntArray503[local46] = local7 + 1;
				Static331.anIntArray638[local46] = local9 + 1;
				Static638.anIntArrayArray106[local83 + 1][local93 + 1] = 12;
				local46 = local46 + 1 & 0xFFF;
				Static376.anIntArrayArray70[local83 + 1][local93 + 1] = local254;
			}
		}
	}
}
