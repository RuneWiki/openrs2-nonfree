import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
	public static final int anInt134 = -1;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIBIII)V")
	public static void method99(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static566.anInt9279 <= arg4 && arg0 <= Static392.anInt6753 && arg2 >= Static346.anInt5494 && arg5 <= Static640.anInt10333) {
			if (arg3 == 1) {
				Static198.method3396(arg5, arg4, arg0, arg1, arg2);
			} else {
				Static322.method4929(arg3, arg0, arg5, arg2, arg1, arg4);
			}
		} else if (arg3 == 1) {
			Static122.method2199(arg0, arg1, arg5, arg4, arg2);
		} else {
			Static612.method7250(arg4, arg2, arg5, arg3, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILjava/awt/Canvas;Lclient!d;I)Lclient!ha;")
	public static Class13 method100(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface2 arg2) {
		return new Class13_Sub2(arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
	public static void method101() {
		Static245.method4156();
		@Pc(10) int local10 = Static305.aClass2_Sub49_15.aClass33_Sub14_1.method4886();
		if (local10 == 2) {
			Static123.method2205(Class16_Sub1_Sub5_Sub1.lb, Static141.aClass13_27, Static71.anInt1925);
		} else if (local10 == 3) {
			Static114.method2023(Static513.anInt8649, Static141.aClass13_27, Static222.anInt4144, Static71.anInt1925, Class16_Sub1_Sub5_Sub1.lb);
		}
		if (Static305.aClass2_Sub49_15.aClass33_Sub14_1.method4884()) {
			Static316.method4868(Static150.aCanvas4);
		}
		if (Static141.aClass13_27 != null) {
			Static550.method7586();
		}
		Static582.aBoolean678 = Static305.aClass2_Sub49_15.aClass33_Sub14_1.method4886() != 0;
		Static148.aBoolean241 = Static305.aClass2_Sub49_15.aClass33_Sub14_1.method4884();
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIIILclient!je;IIBII)Z")
	public static boolean method102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class175 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(5) int local5 = arg10;
		@Pc(7) int local7 = arg1;
		@Pc(21) int local21 = arg10 - 64;
		Static220.anIntArrayArray44[64][64] = 99;
		@Pc(32) int local32 = arg1 - 64;
		Static314.anIntArrayArray58[64][64] = 0;
		@Pc(40) byte local40 = 0;
		Static55.anIntArray87[0] = arg10;
		@Pc(46) int local46 = 0;
		@Pc(49) int local49 = local40 + 1;
		Static335.anIntArray379[0] = arg1;
		@Pc(54) int[][] local54 = arg6.anIntArrayArray48;
		while (true) {
			label282: while (true) {
				@Pc(68) int local68;
				@Pc(79) int local79;
				@Pc(85) int local85;
				@Pc(91) int local91;
				@Pc(240) int local240;
				@Pc(282) int local282;
				do {
					do {
						do {
							label259: do {
								if (local46 == local49) {
									Static166.anInt3402 = local5;
									Static530.anInt8535 = local7;
									return false;
								}
								local5 = Static55.anIntArray87[local46];
								local7 = Static335.anIntArray379[local46];
								local68 = local5 - local21;
								local46 = local46 + 1 & 0xFFF;
								local79 = local7 - local32;
								local85 = local5 - arg6.anInt4875;
								local91 = local7 - arg6.anInt4866;
								if (arg5 == -4) {
									if (local5 == arg8 && arg4 == local7) {
										Static166.anInt3402 = local5;
										Static530.anInt8535 = local7;
										return true;
									}
								} else if (arg5 == -3) {
									if (Static175.method3006(arg7, local7, arg8, arg7, arg0, arg4, local5, arg2)) {
										Static530.anInt8535 = local7;
										Static166.anInt3402 = local5;
										return true;
									}
								} else if (arg5 == -2) {
									if (arg6.method4289(arg8, arg4, arg2, local5, arg7, arg3, arg7, local7, arg0)) {
										Static530.anInt8535 = local7;
										Static166.anInt3402 = local5;
										return true;
									}
								} else if (arg5 == -1) {
									if (arg6.method4292(arg7, arg3, local7, arg8, local5, arg0, arg2, arg4)) {
										Static166.anInt3402 = local5;
										Static530.anInt8535 = local7;
										return true;
									}
								} else if (arg5 == 0 || arg5 == 1 || arg5 == 2 || arg5 == 3 || arg5 == 9) {
									if (arg6.method4291(arg4, arg5, arg7, arg8, arg9, local5, local7)) {
										Static166.anInt3402 = local5;
										Static530.anInt8535 = local7;
										return true;
									}
								} else if (arg6.method4287(arg5, local7, local5, arg8, arg7, arg4, arg9)) {
									Static530.anInt8535 = local7;
									Static166.anInt3402 = local5;
									return true;
								}
								local240 = Static314.anIntArrayArray58[local68][local79] + 1;
								if (local68 > 0 && Static220.anIntArrayArray44[local68 - 1][local79] == 0 && (local54[local85 - 1][local91] & 0x43A40000) == 0 && (local54[local85 - 1][arg7 + local91 - 1] & 0x4E240000) == 0) {
									local282 = 1;
									while (true) {
										if (arg7 - 1 <= local282) {
											Static55.anIntArray87[local49] = local5 - 1;
											Static335.anIntArray379[local49] = local7;
											local49 = local49 + 1 & 0xFFF;
											Static220.anIntArrayArray44[local68 - 1][local79] = 2;
											Static314.anIntArrayArray58[local68 - 1][local79] = local240;
											break;
										}
										if ((local54[local85 - 1][local91 + local282] & 0x4FA40000) != 0) {
											break;
										}
										local282++;
									}
								}
								if (128 - arg7 > local68 && Static220.anIntArrayArray44[local68 + 1][local79] == 0 && (local54[arg7 + local85][local91] & 0x60E40000) == 0 && (local54[local85 + arg7][local91 + arg7 - 1] & 0x78240000) == 0) {
									local282 = 1;
									while (true) {
										if (local282 >= arg7 - 1) {
											Static55.anIntArray87[local49] = local5 + 1;
											Static335.anIntArray379[local49] = local7;
											local49 = local49 + 1 & 0xFFF;
											Static220.anIntArrayArray44[local68 + 1][local79] = 8;
											Static314.anIntArrayArray58[local68 + 1][local79] = local240;
											break;
										}
										if ((local54[local85 + arg7][local91 + local282] & 0x78E40000) != 0) {
											break;
										}
										local282++;
									}
								}
								if (local79 > 0 && Static220.anIntArrayArray44[local68][local79 - 1] == 0 && (local54[local85][local91 - 1] & 0x43A40000) == 0 && (local54[local85 + arg7 - 1][local91 - 1] & 0x60E40000) == 0) {
									local282 = 1;
									while (true) {
										if (local282 >= arg7 - 1) {
											Static55.anIntArray87[local49] = local5;
											Static335.anIntArray379[local49] = local7 - 1;
											local49 = local49 + 1 & 0xFFF;
											Static220.anIntArrayArray44[local68][local79 - 1] = 1;
											Static314.anIntArrayArray58[local68][local79 - 1] = local240;
											break;
										}
										if ((local54[local282 + local85][local91 - 1] & 0x63E40000) != 0) {
											break;
										}
										local282++;
									}
								}
								if (128 - arg7 > local79 && Static220.anIntArrayArray44[local68][local79 + 1] == 0 && (local54[local85][local91 + arg7] & 0x4E240000) == 0 && (local54[local85 + arg7 - 1][arg7 + local91] & 0x78240000) == 0) {
									local282 = 1;
									while (true) {
										if (local282 >= arg7 - 1) {
											Static55.anIntArray87[local49] = local5;
											Static335.anIntArray379[local49] = local7 + 1;
											local49 = local49 + 1 & 0xFFF;
											Static220.anIntArrayArray44[local68][local79 + 1] = 4;
											Static314.anIntArrayArray58[local68][local79 + 1] = local240;
											break;
										}
										if ((local54[local282 + local85][arg7 + local91] & 0x7E240000) != 0) {
											break;
										}
										local282++;
									}
								}
								if (local68 > 0 && local79 > 0 && Static220.anIntArrayArray44[local68 - 1][local79 - 1] == 0 && (local54[local85 - 1][local91 - 1] & 0x43A40000) == 0) {
									local282 = 1;
									while (true) {
										if (local282 >= arg7) {
											Static55.anIntArray87[local49] = local5 - 1;
											Static335.anIntArray379[local49] = local7 - 1;
											Static220.anIntArrayArray44[local68 - 1][local79 - 1] = 3;
											local49 = local49 + 1 & 0xFFF;
											Static314.anIntArrayArray58[local68 - 1][local79 - 1] = local240;
											break;
										}
										if ((local54[local85 - 1][local282 + local91 - 1] & 0x4FA40000) != 0 || (local54[local85 + local282 - 1][local91 - 1] & 0x63E40000) != 0) {
											break;
										}
										local282++;
									}
								}
								if (128 - arg7 > local68 && local79 > 0 && Static220.anIntArrayArray44[local68 + 1][local79 - 1] == 0 && (local54[local85 + arg7][local91 - 1] & 0x60E40000) == 0) {
									local282 = 1;
									while (true) {
										if (local282 >= arg7) {
											Static55.anIntArray87[local49] = local5 + 1;
											Static335.anIntArray379[local49] = local7 - 1;
											local49 = local49 + 1 & 0xFFF;
											Static220.anIntArrayArray44[local68 + 1][local79 - 1] = 9;
											Static314.anIntArrayArray58[local68 + 1][local79 - 1] = local240;
											break;
										}
										if ((local54[arg7 + local85][local282 + local91 - 1] & 0x78E40000) != 0 || (local54[local282 + local85][local91 - 1] & 0x63E40000) != 0) {
											break;
										}
										local282++;
									}
								}
								if (local68 > 0 && local79 < 128 - arg7 && Static220.anIntArrayArray44[local68 - 1][local79 + 1] == 0 && (local54[local85 - 1][arg7 + local91] & 0x4E240000) == 0) {
									for (local282 = 1; local282 < arg7; local282++) {
										if ((local54[local85 - 1][local282 + local91] & 0x4FA40000) != 0 || (local54[local282 + local85 - 1][arg7 + local91] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static55.anIntArray87[local49] = local5 - 1;
									Static335.anIntArray379[local49] = local7 + 1;
									local49 = local49 + 1 & 0xFFF;
									Static220.anIntArrayArray44[local68 - 1][local79 + 1] = 6;
									Static314.anIntArrayArray58[local68 - 1][local79 + 1] = local240;
								}
							} while (local68 >= 128 - arg7);
						} while (local79 >= 128 - arg7);
					} while (Static220.anIntArrayArray44[local68 + 1][local79 + 1] != 0);
				} while ((local54[local85 + arg7][arg7 + local91] & 0x78240000) != 0);
				for (local282 = 1; local282 < arg7; local282++) {
					if ((local54[local282 + local85][local91 + arg7] & 0x7E240000) != 0 || (local54[local85 + arg7][local282 + local91] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static55.anIntArray87[local49] = local5 + 1;
				Static335.anIntArray379[local49] = local7 + 1;
				local49 = local49 + 1 & 0xFFF;
				Static220.anIntArrayArray44[local68 + 1][local79 + 1] = 12;
				Static314.anIntArrayArray58[local68 + 1][local79 + 1] = local240;
			}
		}
	}
}
