import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!jh", name = "F", descriptor = "Lclient!wd;")
	public static final Class384 aClass384_8 = new Class384();

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIZIIIILclient!sn;IIII)Z")
	public static boolean method4025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class324 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg5;
		@Pc(9) int local9 = arg9;
		@Pc(22) int local22 = arg5 - 64;
		Static394.anIntArrayArray35[64][64] = 99;
		@Pc(32) int local32 = arg9 - 64;
		Static358.anIntArrayArray33[64][64] = 0;
		@Pc(40) byte local40 = 0;
		Static233.anIntArray251[0] = arg5;
		@Pc(46) int local46 = 0;
		@Pc(49) int local49 = local40 + 1;
		Static436.anIntArray495[0] = arg9;
		@Pc(54) int[][] local54 = arg6.anIntArrayArray51;
		while (true) {
			label282: while (true) {
				@Pc(69) int local69;
				@Pc(74) int local74;
				@Pc(85) int local85;
				@Pc(91) int local91;
				@Pc(240) int local240;
				@Pc(285) int local285;
				do {
					do {
						do {
							label259: do {
								if (local49 == local46) {
									Static520.anInt9403 = local7;
									Static51.anInt1061 = local9;
									return false;
								}
								local9 = Static436.anIntArray495[local46];
								local7 = Static233.anIntArray251[local46];
								local69 = local7 - local22;
								local74 = local9 - local32;
								local46 = local46 + 1 & 0xFFF;
								local85 = local7 - arg6.anInt9209;
								local91 = local9 - arg6.anInt9227;
								if (arg1 == -4) {
									if (local7 == arg0 && local9 == arg2) {
										Static51.anInt1061 = local9;
										Static520.anInt9403 = local7;
										return true;
									}
								} else if (arg1 == -3) {
									if (Static219.method3187(arg7, local9, arg2, arg10, arg7, arg0, arg3, local7)) {
										Static51.anInt1061 = local9;
										Static520.anInt9403 = local7;
										return true;
									}
								} else if (arg1 == -2) {
									if (arg6.method7779(arg2, arg3, arg7, local7, arg4, arg7, arg0, arg10, local9)) {
										Static520.anInt9403 = local7;
										Static51.anInt1061 = local9;
										return true;
									}
								} else if (arg1 == -1) {
									if (arg6.method7783(local9, local7, arg10, arg7, arg2, arg3, arg4, arg0)) {
										Static51.anInt1061 = local9;
										Static520.anInt9403 = local7;
										return true;
									}
								} else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
									if (arg6.method7776(arg2, local9, arg8, arg7, arg1, local7, arg0)) {
										Static51.anInt1061 = local9;
										Static520.anInt9403 = local7;
										return true;
									}
								} else if (arg6.method7773(arg7, local7, arg1, arg0, local9, arg8, arg2)) {
									Static520.anInt9403 = local7;
									Static51.anInt1061 = local9;
									return true;
								}
								local240 = Static358.anIntArrayArray33[local69][local74] + 1;
								if (local69 > 0 && Static394.anIntArrayArray35[local69 - 1][local74] == 0 && (local54[local85 - 1][local91] & 0x43A40000) == 0 && (local54[local85 - 1][arg7 + local91 - 1] & 0x4E240000) == 0) {
									local285 = 1;
									while (true) {
										if (local285 >= arg7 - 1) {
											Static233.anIntArray251[local49] = local7 - 1;
											Static436.anIntArray495[local49] = local9;
											local49 = local49 + 1 & 0xFFF;
											Static394.anIntArrayArray35[local69 - 1][local74] = 2;
											Static358.anIntArrayArray33[local69 - 1][local74] = local240;
											break;
										}
										if ((local54[local85 - 1][local285 + local91] & 0x4FA40000) != 0) {
											break;
										}
										local285++;
									}
								}
								if (128 - arg7 > local69 && Static394.anIntArrayArray35[local69 + 1][local74] == 0 && (local54[local85 + arg7][local91] & 0x60E40000) == 0 && (local54[arg7 + local85][arg7 + local91 - 1] & 0x78240000) == 0) {
									local285 = 1;
									while (true) {
										if (arg7 - 1 <= local285) {
											Static233.anIntArray251[local49] = local7 + 1;
											Static436.anIntArray495[local49] = local9;
											local49 = local49 + 1 & 0xFFF;
											Static394.anIntArrayArray35[local69 + 1][local74] = 8;
											Static358.anIntArrayArray33[local69 + 1][local74] = local240;
											break;
										}
										if ((local54[local85 + arg7][local91 + local285] & 0x78E40000) != 0) {
											break;
										}
										local285++;
									}
								}
								if (local74 > 0 && Static394.anIntArrayArray35[local69][local74 - 1] == 0 && (local54[local85][local91 - 1] & 0x43A40000) == 0 && (local54[arg7 + local85 - 1][local91 - 1] & 0x60E40000) == 0) {
									local285 = 1;
									while (true) {
										if (local285 >= arg7 - 1) {
											Static233.anIntArray251[local49] = local7;
											Static436.anIntArray495[local49] = local9 - 1;
											Static394.anIntArrayArray35[local69][local74 - 1] = 1;
											local49 = local49 + 1 & 0xFFF;
											Static358.anIntArrayArray33[local69][local74 - 1] = local240;
											break;
										}
										if ((local54[local285 + local85][local91 - 1] & 0x63E40000) != 0) {
											break;
										}
										local285++;
									}
								}
								if (local74 < 128 - arg7 && Static394.anIntArrayArray35[local69][local74 + 1] == 0 && (local54[local85][arg7 + local91] & 0x4E240000) == 0 && (local54[arg7 + local85 - 1][local91 + arg7] & 0x78240000) == 0) {
									local285 = 1;
									while (true) {
										if (local285 >= arg7 - 1) {
											Static233.anIntArray251[local49] = local7;
											Static436.anIntArray495[local49] = local9 + 1;
											local49 = local49 + 1 & 0xFFF;
											Static394.anIntArrayArray35[local69][local74 + 1] = 4;
											Static358.anIntArrayArray33[local69][local74 + 1] = local240;
											break;
										}
										if ((local54[local285 + local85][arg7 + local91] & 0x7E240000) != 0) {
											break;
										}
										local285++;
									}
								}
								if (local69 > 0 && local74 > 0 && Static394.anIntArrayArray35[local69 - 1][local74 - 1] == 0 && (local54[local85 - 1][local91 - 1] & 0x43A40000) == 0) {
									local285 = 1;
									while (true) {
										if (local285 >= arg7) {
											Static233.anIntArray251[local49] = local7 - 1;
											Static436.anIntArray495[local49] = local9 - 1;
											local49 = local49 + 1 & 0xFFF;
											Static394.anIntArrayArray35[local69 - 1][local74 - 1] = 3;
											Static358.anIntArrayArray33[local69 - 1][local74 - 1] = local240;
											break;
										}
										if ((local54[local85 - 1][local91 + local285 - 1] & 0x4FA40000) != 0 || (local54[local285 + local85 - 1][local91 - 1] & 0x63E40000) != 0) {
											break;
										}
										local285++;
									}
								}
								if (local69 < 128 - arg7 && local74 > 0 && Static394.anIntArrayArray35[local69 + 1][local74 - 1] == 0 && (local54[arg7 + local85][local91 - 1] & 0x60E40000) == 0) {
									local285 = 1;
									while (true) {
										if (arg7 <= local285) {
											Static233.anIntArray251[local49] = local7 + 1;
											Static436.anIntArray495[local49] = local9 - 1;
											Static394.anIntArrayArray35[local69 + 1][local74 - 1] = 9;
											local49 = local49 + 1 & 0xFFF;
											Static358.anIntArrayArray33[local69 + 1][local74 - 1] = local240;
											break;
										}
										if ((local54[arg7 + local85][local285 + local91 - 1] & 0x78E40000) != 0 || (local54[local285 + local85][local91 - 1] & 0x63E40000) != 0) {
											break;
										}
										local285++;
									}
								}
								if (local69 > 0 && local74 < 128 - arg7 && Static394.anIntArrayArray35[local69 - 1][local74 + 1] == 0 && (local54[local85 - 1][arg7 + local91] & 0x4E240000) == 0) {
									for (local285 = 1; local285 < arg7; local285++) {
										if ((local54[local85 - 1][local285 + local91] & 0x4FA40000) != 0 || (local54[local285 + local85 - 1][arg7 + local91] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static233.anIntArray251[local49] = local7 - 1;
									Static436.anIntArray495[local49] = local9 + 1;
									local49 = local49 + 1 & 0xFFF;
									Static394.anIntArrayArray35[local69 - 1][local74 + 1] = 6;
									Static358.anIntArrayArray33[local69 - 1][local74 + 1] = local240;
								}
							} while (local69 >= 128 - arg7);
						} while (local74 >= 128 - arg7);
					} while (Static394.anIntArrayArray35[local69 + 1][local74 + 1] != 0);
				} while ((local54[arg7 + local85][arg7 + local91] & 0x78240000) != 0);
				for (local285 = 1; local285 < arg7; local285++) {
					if ((local54[local285 + local85][local91 + arg7] & 0x7E240000) != 0 || (local54[arg7 + local85][local285 + local91] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static233.anIntArray251[local49] = local7 + 1;
				Static436.anIntArray495[local49] = local9 + 1;
				local49 = local49 + 1 & 0xFFF;
				Static394.anIntArrayArray35[local69 + 1][local74 + 1] = 12;
				Static358.anIntArrayArray33[local69 + 1][local74 + 1] = local240;
			}
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
	public static void method4027(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		Static595.anInt9707 = -1;
		Static560.anInt1380 = 1;
		Static539.method7683(arg1, false, arg0);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)Z")
	public static boolean method4028(@OriginalArg(0) int arg0) {
		if (arg0 == 18 || arg0 == 10 || arg0 == 16 || arg0 == 21 || arg0 == 9) {
			return true;
		} else {
			return arg0 == 46 || arg0 == 1011;
		}
	}
}
