import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static395 {

	@OriginalMember(owner = "client!qg", name = "f", descriptor = "[I")
	public static int[] anIntArray676;

	@OriginalMember(owner = "client!qg", name = "x", descriptor = "I")
	public static int anInt6942;

	@OriginalMember(owner = "client!qg", name = "y", descriptor = "I")
	public static int anInt6943;

	@OriginalMember(owner = "client!qg", name = "A", descriptor = "I")
	public static int anInt6944;

	@OriginalMember(owner = "client!qg", name = "z", descriptor = "[I")
	public static final int[] anIntArray678 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!qg", name = "e", descriptor = "(I)V")
	public static void method6265() {
		Static74.aClass37_1 = new Class37(8);
		Static474.anInt4535 = 0;
		for (@Pc(22) Class46_Sub7 local22 = (Class46_Sub7) Static448.aClass184_36.method5138(); local22 != null; local22 = (Class46_Sub7) Static448.aClass184_36.method5145()) {
			local22.method7418();
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIIII)V")
	public static void method6267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class192 local3 = new Class192();
		local3.anInt5946 = arg1 >> Static275.anInt5260;
		local3.anInt5939 = arg2 >> Static275.anInt5260;
		local3.anInt5941 = arg3 >> Static275.anInt5260;
		local3.anInt5936 = arg4 >> Static275.anInt5260;
		local3.anInt5935 = arg0;
		local3.anInt5937 = arg1;
		local3.anInt5949 = arg2;
		local3.anInt5944 = arg3;
		local3.anInt5947 = arg4;
		local3.anInt5930 = arg5;
		local3.anInt5942 = arg6;
		Static220.aClass192Array2[Static84.anInt1919++] = local3;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIIIIILclient!qt;III)Z")
	public static boolean method6269(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class243 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg4;
		@Pc(9) int local9 = arg8;
		@Pc(22) int local22 = arg4 - 64;
		@Pc(26) int local26 = arg8 - 64;
		Static430.anIntArrayArray124[64][64] = 99;
		Static219.anIntArrayArray45[64][64] = 0;
		@Pc(40) byte local40 = 0;
		@Pc(42) int local42 = 0;
		Static159.anIntArray267[0] = arg4;
		@Pc(49) int local49 = local40 + 1;
		Static266.anIntArray423[0] = arg8;
		@Pc(54) int[][] local54 = arg7.anIntArrayArray95;
		while (true) {
			label282: while (true) {
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(86) int local86;
				@Pc(91) int local91;
				@Pc(245) int local245;
				@Pc(281) int local281;
				do {
					do {
						do {
							label259: do {
								if (local42 == local49) {
									Static140.anInt2808 = local9;
									Static106.anInt2252 = local7;
									return false;
								}
								local9 = Static266.anIntArray423[local42];
								local7 = Static159.anIntArray267[local42];
								local42 = local42 + 1 & 0xFFF;
								local75 = local7 - local22;
								local80 = local9 - local26;
								local86 = local7 - arg7.anInt7190;
								local91 = local9 - arg7.anInt7169;
								if (arg9 == -4) {
									if (arg1 == local7 && local9 == arg6) {
										Static106.anInt2252 = local7;
										Static140.anInt2808 = local9;
										return true;
									}
								} else if (arg9 == -3) {
									if (Static116.method2268(arg2, arg5, arg1, local7, arg6, local9, arg5, arg10)) {
										Static106.anInt2252 = local7;
										Static140.anInt2808 = local9;
										return true;
									}
								} else if (arg9 == -2) {
									if (arg7.method6465(arg3, arg10, arg6, arg1, local9, arg5, arg5, local7, arg2)) {
										Static140.anInt2808 = local9;
										Static106.anInt2252 = local7;
										return true;
									}
								} else if (arg9 == -1) {
									if (arg7.method6464(arg5, local7, arg6, arg2, arg1, arg10, local9, arg3)) {
										Static140.anInt2808 = local9;
										Static106.anInt2252 = local7;
										return true;
									}
								} else if (arg9 == 0 || arg9 == 1 || arg9 == 2 || arg9 == 3 || arg9 == 9) {
									if (arg7.method6461(arg0, arg6, arg9, arg1, local7, arg5, local9)) {
										Static140.anInt2808 = local9;
										Static106.anInt2252 = local7;
										return true;
									}
								} else if (arg7.method6463(arg0, arg1, local9, local7, arg9, arg5, arg6)) {
									Static140.anInt2808 = local9;
									Static106.anInt2252 = local7;
									return true;
								}
								local245 = Static219.anIntArrayArray45[local75][local80] + 1;
								if (local75 > 0 && Static430.anIntArrayArray124[local75 - 1][local80] == 0 && (local54[local86 - 1][local91] & 0x43A40000) == 0 && (local54[local86 - 1][arg5 + local91 - 1] & 0x4E240000) == 0) {
									local281 = 1;
									while (true) {
										if (local281 >= arg5 - 1) {
											Static159.anIntArray267[local49] = local7 - 1;
											Static266.anIntArray423[local49] = local9;
											Static430.anIntArrayArray124[local75 - 1][local80] = 2;
											local49 = local49 + 1 & 0xFFF;
											Static219.anIntArrayArray45[local75 - 1][local80] = local245;
											break;
										}
										if ((local54[local86 - 1][local281 + local91] & 0x4FA40000) != 0) {
											break;
										}
										local281++;
									}
								}
								if (128 - arg5 > local75 && Static430.anIntArrayArray124[local75 + 1][local80] == 0 && (local54[arg5 + local86][local91] & 0x60E40000) == 0 && (local54[local86 + arg5][local91 + arg5 - 1] & 0x78240000) == 0) {
									local281 = 1;
									while (true) {
										if (arg5 - 1 <= local281) {
											Static159.anIntArray267[local49] = local7 + 1;
											Static266.anIntArray423[local49] = local9;
											local49 = local49 + 1 & 0xFFF;
											Static430.anIntArrayArray124[local75 + 1][local80] = 8;
											Static219.anIntArrayArray45[local75 + 1][local80] = local245;
											break;
										}
										if ((local54[local86 + arg5][local91 + local281] & 0x78E40000) != 0) {
											break;
										}
										local281++;
									}
								}
								if (local80 > 0 && Static430.anIntArrayArray124[local75][local80 - 1] == 0 && (local54[local86][local91 - 1] & 0x43A40000) == 0 && (local54[local86 + arg5 - 1][local91 - 1] & 0x60E40000) == 0) {
									local281 = 1;
									while (true) {
										if (arg5 - 1 <= local281) {
											Static159.anIntArray267[local49] = local7;
											Static266.anIntArray423[local49] = local9 - 1;
											local49 = local49 + 1 & 0xFFF;
											Static430.anIntArrayArray124[local75][local80 - 1] = 1;
											Static219.anIntArrayArray45[local75][local80 - 1] = local245;
											break;
										}
										if ((local54[local281 + local86][local91 - 1] & 0x63E40000) != 0) {
											break;
										}
										local281++;
									}
								}
								if (local80 < 128 - arg5 && Static430.anIntArrayArray124[local75][local80 + 1] == 0 && (local54[local86][arg5 + local91] & 0x4E240000) == 0 && (local54[arg5 + local86 - 1][local91 + arg5] & 0x78240000) == 0) {
									local281 = 1;
									while (true) {
										if (local281 >= arg5 - 1) {
											Static159.anIntArray267[local49] = local7;
											Static266.anIntArray423[local49] = local9 + 1;
											local49 = local49 + 1 & 0xFFF;
											Static430.anIntArrayArray124[local75][local80 + 1] = 4;
											Static219.anIntArrayArray45[local75][local80 + 1] = local245;
											break;
										}
										if ((local54[local86 + local281][local91 + arg5] & 0x7E240000) != 0) {
											break;
										}
										local281++;
									}
								}
								if (local75 > 0 && local80 > 0 && Static430.anIntArrayArray124[local75 - 1][local80 - 1] == 0 && (local54[local86 - 1][local91 - 1] & 0x43A40000) == 0) {
									local281 = 1;
									while (true) {
										if (arg5 <= local281) {
											Static159.anIntArray267[local49] = local7 - 1;
											Static266.anIntArray423[local49] = local9 - 1;
											local49 = local49 + 1 & 0xFFF;
											Static430.anIntArrayArray124[local75 - 1][local80 - 1] = 3;
											Static219.anIntArrayArray45[local75 - 1][local80 - 1] = local245;
											break;
										}
										if ((local54[local86 - 1][local281 + local91 - 1] & 0x4FA40000) != 0 || (local54[local281 + local86 - 1][local91 - 1] & 0x63E40000) != 0) {
											break;
										}
										local281++;
									}
								}
								if (local75 < 128 - arg5 && local80 > 0 && Static430.anIntArrayArray124[local75 + 1][local80 - 1] == 0 && (local54[local86 + arg5][local91 - 1] & 0x60E40000) == 0) {
									local281 = 1;
									while (true) {
										if (arg5 <= local281) {
											Static159.anIntArray267[local49] = local7 + 1;
											Static266.anIntArray423[local49] = local9 - 1;
											Static430.anIntArrayArray124[local75 + 1][local80 - 1] = 9;
											local49 = local49 + 1 & 0xFFF;
											Static219.anIntArrayArray45[local75 + 1][local80 - 1] = local245;
											break;
										}
										if ((local54[arg5 + local86][local281 + local91 - 1] & 0x78E40000) != 0 || (local54[local86 + local281][local91 - 1] & 0x63E40000) != 0) {
											break;
										}
										local281++;
									}
								}
								if (local75 > 0 && 128 - arg5 > local80 && Static430.anIntArrayArray124[local75 - 1][local80 + 1] == 0 && (local54[local86 - 1][local91 + arg5] & 0x4E240000) == 0) {
									for (local281 = 1; local281 < arg5; local281++) {
										if ((local54[local86 - 1][local91 + local281] & 0x4FA40000) != 0 || (local54[local86 + local281 - 1][local91 + arg5] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static159.anIntArray267[local49] = local7 - 1;
									Static266.anIntArray423[local49] = local9 + 1;
									local49 = local49 + 1 & 0xFFF;
									Static430.anIntArrayArray124[local75 - 1][local80 + 1] = 6;
									Static219.anIntArrayArray45[local75 - 1][local80 + 1] = local245;
								}
							} while (128 - arg5 <= local75);
						} while (local80 >= 128 - arg5);
					} while (Static430.anIntArrayArray124[local75 + 1][local80 + 1] != 0);
				} while ((local54[local86 + arg5][arg5 + local91] & 0x78240000) != 0);
				for (local281 = 1; local281 < arg5; local281++) {
					if ((local54[local86 + local281][arg5 + local91] & 0x7E240000) != 0 || (local54[local86 + arg5][local281 + local91] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static159.anIntArray267[local49] = local7 + 1;
				Static266.anIntArray423[local49] = local9 + 1;
				Static430.anIntArrayArray124[local75 + 1][local80 + 1] = 12;
				local49 = local49 + 1 & 0xFFF;
				Static219.anIntArrayArray45[local75 + 1][local80 + 1] = local245;
			}
		}
	}
}
