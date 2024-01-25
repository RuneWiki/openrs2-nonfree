import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!er", name = "rb", descriptor = "[Lclient!dt;")
	public static Class74[] aClass74Array1;

	@OriginalMember(owner = "client!er", name = "td", descriptor = "[F")
	public static final float[] aFloatArray27 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(B)I")
	public static int method2506() {
		return Static294.anIntArray262 == null ? 0 : Static294.anIntArray262.length * 2;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IIIILclient!nc;IZIIIII)Z")
	public static boolean method2515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class220 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg10;
		@Pc(9) int local9 = arg8;
		@Pc(18) int local18 = arg10 - 64;
		Static418.anIntArrayArray75[64][64] = 99;
		@Pc(28) int local28 = arg8 - 64;
		Static360.anIntArrayArray105[64][64] = 0;
		@Pc(41) byte local41 = 0;
		Static346.anIntArray349[0] = arg10;
		@Pc(47) int local47 = 0;
		@Pc(50) int local50 = local41 + 1;
		Static307.anIntArray276[0] = arg8;
		@Pc(55) int[][] local55 = arg4.anIntArrayArray66;
		while (true) {
			label282: while (true) {
				@Pc(81) int local81;
				@Pc(70) int local70;
				@Pc(87) int local87;
				@Pc(92) int local92;
				@Pc(243) int local243;
				@Pc(282) int local282;
				do {
					do {
						do {
							label259: do {
								if (local47 == local50) {
									Static395.anInt6981 = local7;
									Static454.anInt7943 = local9;
									return false;
								}
								local9 = Static307.anIntArray276[local47];
								local7 = Static346.anIntArray349[local47];
								local70 = local9 - local28;
								local47 = local47 + 1 & 0xFFF;
								local81 = local7 - local18;
								local87 = local7 - arg4.anInt6298;
								local92 = local9 - arg4.anInt6303;
								if (arg9 == -4) {
									if (arg0 == local7 && arg7 == local9) {
										Static454.anInt7943 = local9;
										Static395.anInt6981 = local7;
										return true;
									}
								} else if (arg9 == -3) {
									if (Static391.method5552(local9, arg6, arg1, arg7, arg3, local7, arg1, arg0)) {
										Static454.anInt7943 = local9;
										Static395.anInt6981 = local7;
										return true;
									}
								} else if (arg9 == -2) {
									if (arg4.method5078(arg6, local7, local9, arg0, arg7, arg2, arg1, arg1, arg3)) {
										Static454.anInt7943 = local9;
										Static395.anInt6981 = local7;
										return true;
									}
								} else if (arg9 == -1) {
									if (arg4.method5082(arg3, local7, local9, arg2, arg1, arg6, arg0, arg7)) {
										Static454.anInt7943 = local9;
										Static395.anInt6981 = local7;
										return true;
									}
								} else if (arg9 == 0 || arg9 == 1 || arg9 == 2 || arg9 == 3 || arg9 == 9) {
									if (arg4.method5083(arg7, local9, arg5, arg9, arg0, arg1, local7)) {
										Static454.anInt7943 = local9;
										Static395.anInt6981 = local7;
										return true;
									}
								} else if (arg4.method5089(arg1, arg7, arg5, arg0, local9, arg9, local7)) {
									Static395.anInt6981 = local7;
									Static454.anInt7943 = local9;
									return true;
								}
								local243 = Static360.anIntArrayArray105[local81][local70] + 1;
								if (local81 > 0 && Static418.anIntArrayArray75[local81 - 1][local70] == 0 && (local55[local87 - 1][local92] & 0x43A40000) == 0 && (local55[local87 - 1][arg1 + local92 - 1] & 0x4E240000) == 0) {
									local282 = 1;
									while (true) {
										if (local282 >= arg1 - 1) {
											Static346.anIntArray349[local50] = local7 - 1;
											Static307.anIntArray276[local50] = local9;
											Static418.anIntArrayArray75[local81 - 1][local70] = 2;
											local50 = local50 + 1 & 0xFFF;
											Static360.anIntArrayArray105[local81 - 1][local70] = local243;
											break;
										}
										if ((local55[local87 - 1][local92 + local282] & 0x4FA40000) != 0) {
											break;
										}
										local282++;
									}
								}
								if (128 - arg1 > local81 && Static418.anIntArrayArray75[local81 + 1][local70] == 0 && (local55[local87 + arg1][local92] & 0x60E40000) == 0 && (local55[arg1 + local87][arg1 + local92 - 1] & 0x78240000) == 0) {
									local282 = 1;
									while (true) {
										if (local282 >= arg1 - 1) {
											Static346.anIntArray349[local50] = local7 + 1;
											Static307.anIntArray276[local50] = local9;
											Static418.anIntArrayArray75[local81 + 1][local70] = 8;
											local50 = local50 + 1 & 0xFFF;
											Static360.anIntArrayArray105[local81 + 1][local70] = local243;
											break;
										}
										if ((local55[local87 + arg1][local282 + local92] & 0x78E40000) != 0) {
											break;
										}
										local282++;
									}
								}
								if (local70 > 0 && Static418.anIntArrayArray75[local81][local70 - 1] == 0 && (local55[local87][local92 - 1] & 0x43A40000) == 0 && (local55[arg1 + local87 - 1][local92 - 1] & 0x60E40000) == 0) {
									local282 = 1;
									while (true) {
										if (local282 >= arg1 - 1) {
											Static346.anIntArray349[local50] = local7;
											Static307.anIntArray276[local50] = local9 - 1;
											local50 = local50 + 1 & 0xFFF;
											Static418.anIntArrayArray75[local81][local70 - 1] = 1;
											Static360.anIntArrayArray105[local81][local70 - 1] = local243;
											break;
										}
										if ((local55[local87 + local282][local92 - 1] & 0x63E40000) != 0) {
											break;
										}
										local282++;
									}
								}
								if (128 - arg1 > local70 && Static418.anIntArrayArray75[local81][local70 + 1] == 0 && (local55[local87][arg1 + local92] & 0x4E240000) == 0 && (local55[local87 + arg1 - 1][local92 + arg1] & 0x78240000) == 0) {
									local282 = 1;
									while (true) {
										if (arg1 - 1 <= local282) {
											Static346.anIntArray349[local50] = local7;
											Static307.anIntArray276[local50] = local9 + 1;
											local50 = local50 + 1 & 0xFFF;
											Static418.anIntArrayArray75[local81][local70 + 1] = 4;
											Static360.anIntArrayArray105[local81][local70 + 1] = local243;
											break;
										}
										if ((local55[local87 + local282][arg1 + local92] & 0x7E240000) != 0) {
											break;
										}
										local282++;
									}
								}
								if (local81 > 0 && local70 > 0 && Static418.anIntArrayArray75[local81 - 1][local70 - 1] == 0 && (local55[local87 - 1][local92 - 1] & 0x43A40000) == 0) {
									local282 = 1;
									while (true) {
										if (arg1 <= local282) {
											Static346.anIntArray349[local50] = local7 - 1;
											Static307.anIntArray276[local50] = local9 - 1;
											Static418.anIntArrayArray75[local81 - 1][local70 - 1] = 3;
											local50 = local50 + 1 & 0xFFF;
											Static360.anIntArrayArray105[local81 - 1][local70 - 1] = local243;
											break;
										}
										if ((local55[local87 - 1][local92 + local282 - 1] & 0x4FA40000) != 0 || (local55[local282 + local87 - 1][local92 - 1] & 0x63E40000) != 0) {
											break;
										}
										local282++;
									}
								}
								if (128 - arg1 > local81 && local70 > 0 && Static418.anIntArrayArray75[local81 + 1][local70 - 1] == 0 && (local55[local87 + arg1][local92 - 1] & 0x60E40000) == 0) {
									local282 = 1;
									while (true) {
										if (arg1 <= local282) {
											Static346.anIntArray349[local50] = local7 + 1;
											Static307.anIntArray276[local50] = local9 - 1;
											local50 = local50 + 1 & 0xFFF;
											Static418.anIntArrayArray75[local81 + 1][local70 - 1] = 9;
											Static360.anIntArrayArray105[local81 + 1][local70 - 1] = local243;
											break;
										}
										if ((local55[local87 + arg1][local282 + local92 - 1] & 0x78E40000) != 0 || (local55[local87 + local282][local92 - 1] & 0x63E40000) != 0) {
											break;
										}
										local282++;
									}
								}
								if (local81 > 0 && local70 < 128 - arg1 && Static418.anIntArrayArray75[local81 - 1][local70 + 1] == 0 && (local55[local87 - 1][arg1 + local92] & 0x4E240000) == 0) {
									for (local282 = 1; local282 < arg1; local282++) {
										if ((local55[local87 - 1][local282 + local92] & 0x4FA40000) != 0 || (local55[local87 + local282 - 1][arg1 + local92] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static346.anIntArray349[local50] = local7 - 1;
									Static307.anIntArray276[local50] = local9 + 1;
									local50 = local50 + 1 & 0xFFF;
									Static418.anIntArrayArray75[local81 - 1][local70 + 1] = 6;
									Static360.anIntArrayArray105[local81 - 1][local70 + 1] = local243;
								}
							} while (local81 >= 128 - arg1);
						} while (128 - arg1 <= local70);
					} while (Static418.anIntArrayArray75[local81 + 1][local70 + 1] != 0);
				} while ((local55[local87 + arg1][local92 + arg1] & 0x78240000) != 0);
				for (local282 = 1; local282 < arg1; local282++) {
					if ((local55[local87 + local282][arg1 + local92] & 0x7E240000) != 0 || (local55[arg1 + local87][local92 + local282] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static346.anIntArray349[local50] = local7 + 1;
				Static307.anIntArray276[local50] = local9 + 1;
				local50 = local50 + 1 & 0xFFF;
				Static418.anIntArrayArray75[local81 + 1][local70 + 1] = 12;
				Static360.anIntArrayArray105[local81 + 1][local70 + 1] = local243;
			}
		}
	}

	@OriginalMember(owner = "client!er", name = "c", descriptor = "(III)I")
	public static int method2542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0 >>> 31;
		return (local12 + arg0) / arg1 - local12;
	}

	@OriginalMember(owner = "client!er", name = "h", descriptor = "(B)V")
	public static void method2563() {
		Static446.aClass237_1.method5298();
		Static234.aClass54_4.method7302();
		Static507.aClient1.method1687();
		Static129.aCanvas6.setBackground(Color.black);
		Static286.anInt5362 = -1;
		Static446.aClass237_1 = Static368.method5217(Static129.aCanvas6);
		Static234.aClass54_4 = Static90.method1970(Static129.aCanvas6);
	}
}
