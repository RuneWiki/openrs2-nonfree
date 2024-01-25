import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!mq", name = "l", descriptor = "Lclient!mg;")
	public static Class155 aClass155_5;

	@OriginalMember(owner = "client!mq", name = "p", descriptor = "Lclient!qr;")
	public static Class208 aClass208_1;

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_93 = new Class253(16, 5);

	@OriginalMember(owner = "client!mq", name = "k", descriptor = "Z")
	public static boolean aBoolean277 = true;

	@OriginalMember(owner = "client!mq", name = "o", descriptor = "[J")
	public static final long[] aLongArray8 = new long[32];

	@OriginalMember(owner = "client!mq", name = "q", descriptor = "Lclient!oo;")
	public static final Class181 aClass181_4 = new Class181("WIP", 2);

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(III)Z")
	public static boolean method3431(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method3432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg6 >= Static293.anInt4886 && arg6 <= Static137.anInt2576 && arg2 >= Static293.anInt4886 && Static137.anInt2576 >= arg2 && arg4 >= Static293.anInt4886 && arg4 <= Static137.anInt2576 && Static293.anInt4886 <= arg1 && Static137.anInt2576 >= arg1 && arg3 >= Static316.anInt5188 && arg3 <= Static82.anInt1667 && Static316.anInt5188 <= arg0 && arg0 <= Static82.anInt1667 && arg8 >= Static316.anInt5188 && Static82.anInt1667 >= arg8 && arg5 >= Static316.anInt5188 && Static82.anInt1667 >= arg5) {
			Static325.method4306(arg4, arg1, arg6, arg2, arg5, arg0, arg8, arg3, arg7);
		} else {
			Static364.method1717(arg6, arg4, arg8, arg7, arg1, arg2, arg5, arg3, arg0);
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)V")
	public static void method3435() {
		if (Static277.aBoolean293) {
			return;
		}
		Static277.aBoolean293 = true;
		Static213.aBoolean230 = true;
		if (Static130.aClass153_Sub1_1.aBoolean337) {
			Static97.aFloat52 = (int) Static97.aFloat52 - 65 & 0xFFFFFF80;
		} else {
			Static218.aFloat108 += (-24.0F - Static218.aFloat108) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIIIILclient!ep;IIIIII)Z")
	public static boolean method3437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class70 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		@Pc(7) int local7 = arg9;
		@Pc(9) int local9 = arg8;
		@Pc(17) int local17 = arg9 - 64;
		Static444.anIntArrayArray62[64][64] = 99;
		@Pc(28) int local28 = arg8 - 64;
		Static430.anIntArrayArray61[64][64] = 0;
		@Pc(36) byte local36 = 0;
		@Pc(38) int local38 = 0;
		Static345.anIntArray498[0] = arg9;
		@Pc(45) int local45 = local36 + 1;
		Static276.anIntArray422[0] = arg8;
		@Pc(50) int[][] local50 = arg5.anIntArrayArray10;
		while (true) {
			label282: while (true) {
				@Pc(70) int local70;
				@Pc(75) int local75;
				@Pc(81) int local81;
				@Pc(86) int local86;
				@Pc(246) int local246;
				@Pc(288) int local288;
				do {
					do {
						do {
							label259: do {
								if (local38 == local45) {
									Static416.anInt6617 = local9;
									Static448.anInt7376 = local7;
									return false;
								}
								local9 = Static276.anIntArray422[local38];
								local7 = Static345.anIntArray498[local38];
								local38 = local38 + 1 & 0xFFF;
								local70 = local7 - local17;
								local75 = local9 - local28;
								local81 = local7 - arg5.anInt1966;
								local86 = local9 - arg5.anInt1971;
								if (arg10 == -4) {
									if (arg3 == local7 && local9 == arg1) {
										Static448.anInt7376 = local7;
										Static416.anInt6617 = local9;
										return true;
									}
								} else if (arg10 == -3) {
									if (Static344.method4453(local7, arg3, arg6, local9, arg4, arg1, arg6, arg7)) {
										Static448.anInt7376 = local7;
										Static416.anInt6617 = local9;
										return true;
									}
								} else if (arg10 == -2) {
									if (arg5.method1698(arg6, arg7, local9, arg4, arg3, arg6, arg2, arg1, local7)) {
										Static416.anInt6617 = local9;
										Static448.anInt7376 = local7;
										return true;
									}
								} else if (arg10 == -1) {
									if (arg5.method1695(local9, local7, arg6, arg7, arg4, arg2, arg1, arg3)) {
										Static448.anInt7376 = local7;
										Static416.anInt6617 = local9;
										return true;
									}
								} else if (arg10 == 0 || arg10 == 1 || arg10 == 2 || arg10 == 3 || arg10 == 9) {
									if (arg5.method1699(local9, arg10, arg3, arg6, arg0, local7, arg1)) {
										Static448.anInt7376 = local7;
										Static416.anInt6617 = local9;
										return true;
									}
								} else if (arg5.method1696(arg3, arg0, arg1, local7, local9, arg6, arg10)) {
									Static448.anInt7376 = local7;
									Static416.anInt6617 = local9;
									return true;
								}
								local246 = Static430.anIntArrayArray61[local70][local75] + 1;
								if (local70 > 0 && Static444.anIntArrayArray62[local70 - 1][local75] == 0 && (local50[local81 - 1][local86] & 0x43A40000) == 0 && (local50[local81 - 1][local86 + arg6 - 1] & 0x4E240000) == 0) {
									local288 = 1;
									while (true) {
										if (local288 >= arg6 - 1) {
											Static345.anIntArray498[local45] = local7 - 1;
											Static276.anIntArray422[local45] = local9;
											Static444.anIntArrayArray62[local70 - 1][local75] = 2;
											local45 = local45 + 1 & 0xFFF;
											Static430.anIntArrayArray61[local70 - 1][local75] = local246;
											break;
										}
										if ((local50[local81 - 1][local288 + local86] & 0x4FA40000) != 0) {
											break;
										}
										local288++;
									}
								}
								if (local70 < 128 - arg6 && Static444.anIntArrayArray62[local70 + 1][local75] == 0 && (local50[arg6 + local81][local86] & 0x60E40000) == 0 && (local50[arg6 + local81][local86 + arg6 - 1] & 0x78240000) == 0) {
									local288 = 1;
									while (true) {
										if (local288 >= arg6 - 1) {
											Static345.anIntArray498[local45] = local7 + 1;
											Static276.anIntArray422[local45] = local9;
											local45 = local45 + 1 & 0xFFF;
											Static444.anIntArrayArray62[local70 + 1][local75] = 8;
											Static430.anIntArrayArray61[local70 + 1][local75] = local246;
											break;
										}
										if ((local50[arg6 + local81][local288 + local86] & 0x78E40000) != 0) {
											break;
										}
										local288++;
									}
								}
								if (local75 > 0 && Static444.anIntArrayArray62[local70][local75 - 1] == 0 && (local50[local81][local86 - 1] & 0x43A40000) == 0 && (local50[local81 + arg6 - 1][local86 - 1] & 0x60E40000) == 0) {
									local288 = 1;
									while (true) {
										if (arg6 - 1 <= local288) {
											Static345.anIntArray498[local45] = local7;
											Static276.anIntArray422[local45] = local9 - 1;
											Static444.anIntArrayArray62[local70][local75 - 1] = 1;
											local45 = local45 + 1 & 0xFFF;
											Static430.anIntArrayArray61[local70][local75 - 1] = local246;
											break;
										}
										if ((local50[local288 + local81][local86 - 1] & 0x63E40000) != 0) {
											break;
										}
										local288++;
									}
								}
								if (128 - arg6 > local75 && Static444.anIntArrayArray62[local70][local75 + 1] == 0 && (local50[local81][arg6 + local86] & 0x4E240000) == 0 && (local50[local81 + arg6 - 1][local86 + arg6] & 0x78240000) == 0) {
									local288 = 1;
									while (true) {
										if (arg6 - 1 <= local288) {
											Static345.anIntArray498[local45] = local7;
											Static276.anIntArray422[local45] = local9 + 1;
											Static444.anIntArrayArray62[local70][local75 + 1] = 4;
											local45 = local45 + 1 & 0xFFF;
											Static430.anIntArrayArray61[local70][local75 + 1] = local246;
											break;
										}
										if ((local50[local81 + local288][local86 + arg6] & 0x7E240000) != 0) {
											break;
										}
										local288++;
									}
								}
								if (local70 > 0 && local75 > 0 && Static444.anIntArrayArray62[local70 - 1][local75 - 1] == 0 && (local50[local81 - 1][local86 - 1] & 0x43A40000) == 0) {
									local288 = 1;
									while (true) {
										if (arg6 <= local288) {
											Static345.anIntArray498[local45] = local7 - 1;
											Static276.anIntArray422[local45] = local9 - 1;
											local45 = local45 + 1 & 0xFFF;
											Static444.anIntArrayArray62[local70 - 1][local75 - 1] = 3;
											Static430.anIntArrayArray61[local70 - 1][local75 - 1] = local246;
											break;
										}
										if ((local50[local81 - 1][local288 + local86 - 1] & 0x4FA40000) != 0 || (local50[local81 + local288 - 1][local86 - 1] & 0x63E40000) != 0) {
											break;
										}
										local288++;
									}
								}
								if (local70 < 128 - arg6 && local75 > 0 && Static444.anIntArrayArray62[local70 + 1][local75 - 1] == 0 && (local50[local81 + arg6][local86 - 1] & 0x60E40000) == 0) {
									local288 = 1;
									while (true) {
										if (arg6 <= local288) {
											Static345.anIntArray498[local45] = local7 + 1;
											Static276.anIntArray422[local45] = local9 - 1;
											Static444.anIntArrayArray62[local70 + 1][local75 - 1] = 9;
											local45 = local45 + 1 & 0xFFF;
											Static430.anIntArrayArray61[local70 + 1][local75 - 1] = local246;
											break;
										}
										if ((local50[arg6 + local81][local288 + local86 - 1] & 0x78E40000) != 0 || (local50[local81 + local288][local86 - 1] & 0x63E40000) != 0) {
											break;
										}
										local288++;
									}
								}
								if (local70 > 0 && 128 - arg6 > local75 && Static444.anIntArrayArray62[local70 - 1][local75 + 1] == 0 && (local50[local81 - 1][arg6 + local86] & 0x4E240000) == 0) {
									for (local288 = 1; local288 < arg6; local288++) {
										if ((local50[local81 - 1][local86 + local288] & 0x4FA40000) != 0 || (local50[local288 + local81 - 1][arg6 + local86] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static345.anIntArray498[local45] = local7 - 1;
									Static276.anIntArray422[local45] = local9 + 1;
									local45 = local45 + 1 & 0xFFF;
									Static444.anIntArrayArray62[local70 - 1][local75 + 1] = 6;
									Static430.anIntArrayArray61[local70 - 1][local75 + 1] = local246;
								}
							} while (128 - arg6 <= local70);
						} while (local75 >= 128 - arg6);
					} while (Static444.anIntArrayArray62[local70 + 1][local75 + 1] != 0);
				} while ((local50[local81 + arg6][local86 + arg6] & 0x78240000) != 0);
				for (local288 = 1; local288 < arg6; local288++) {
					if ((local50[local81 + local288][arg6 + local86] & 0x7E240000) != 0 || (local50[local81 + arg6][local288 + local86] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static345.anIntArray498[local45] = local7 + 1;
				Static276.anIntArray422[local45] = local9 + 1;
				Static444.anIntArrayArray62[local70 + 1][local75 + 1] = 12;
				local45 = local45 + 1 & 0xFFF;
				Static430.anIntArrayArray61[local70 + 1][local75 + 1] = local246;
			}
		}
	}
}
