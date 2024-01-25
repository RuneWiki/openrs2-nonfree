import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!hp", name = "w", descriptor = "F")
	public static float aFloat201;

	@OriginalMember(owner = "client!hp", name = "x", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray21;

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!ol;B)Ljava/lang/String;")
	public static String method9277(@OriginalArg(0) Class2_Sub8 arg0) {
		return Static369.method9409(arg0);
	}

	@OriginalMember(owner = "client!hp", name = "g", descriptor = "(I)V")
	public static void method9279() {
		Static91.aClass71_5 = null;
		Static251.aClass71Array25 = null;
		Static418.aClass71_17 = null;
		Static618.aClass71_36 = null;
		Static358.aClass71_15 = null;
		Static434.aClass71_11 = null;
		Static486.aClass71_31 = null;
		Static307.aClass71_9 = null;
		Static167.aClass71_6 = null;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIIIIIIIIILclient!kn;I)Z")
	public static boolean method9284(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class200 arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg2;
		@Pc(9) int local9 = arg0;
		@Pc(26) int local26 = arg2 - 64;
		@Pc(31) int local31 = arg0 - 64;
		Static296.anIntArrayArray19[64][64] = 99;
		Static96.anIntArrayArray16[64][64] = 0;
		@Pc(45) byte local45 = 0;
		@Pc(47) int local47 = 0;
		Static456.anIntArray409[0] = arg2;
		@Pc(54) int local54 = local45 + 1;
		Static312.anIntArray288[0] = arg0;
		@Pc(59) int[][] local59 = arg9.anIntArrayArray23;
		while (true) {
			label282: while (true) {
				@Pc(78) int local78;
				@Pc(74) int local74;
				@Pc(90) int local90;
				@Pc(96) int local96;
				@Pc(256) int local256;
				@Pc(295) int local295;
				do {
					do {
						do {
							label259: do {
								if (local47 == local54) {
									Static503.anInt8360 = local7;
									Static539.anInt9400 = local9;
									return false;
								}
								local7 = Static456.anIntArray409[local47];
								local9 = Static312.anIntArray288[local47];
								local74 = local9 - local31;
								local78 = local7 - local26;
								local47 = local47 + 1 & 0xFFF;
								local90 = local7 - arg9.anInt5838;
								local96 = local9 - arg9.anInt5851;
								if (arg3 == -4) {
									if (local7 == arg10 && arg5 == local9) {
										Static503.anInt8360 = local7;
										Static539.anInt9400 = local9;
										return true;
									}
								} else if (arg3 == -3) {
									if (Static476.method7598(arg10, arg5, local9, arg7, arg4, arg8, local7, arg8)) {
										Static539.anInt9400 = local9;
										Static503.anInt8360 = local7;
										return true;
									}
								} else if (arg3 == -2) {
									if (arg9.method5284(arg8, arg8, local9, local7, arg4, arg7, arg5, arg6, arg10)) {
										Static503.anInt8360 = local7;
										Static539.anInt9400 = local9;
										return true;
									}
								} else if (arg3 == -1) {
									if (arg9.method5296(arg8, local7, arg7, arg4, arg5, arg6, arg10, local9)) {
										Static503.anInt8360 = local7;
										Static539.anInt9400 = local9;
										return true;
									}
								} else if (arg3 == 0 || arg3 == 1 || arg3 == 2 || arg3 == 3 || arg3 == 9) {
									if (arg9.method5300(arg8, arg3, arg5, arg1, arg10, local7, local9)) {
										Static503.anInt8360 = local7;
										Static539.anInt9400 = local9;
										return true;
									}
								} else if (arg9.method5283(local9, arg3, arg1, arg8, arg10, arg5, local7)) {
									Static539.anInt9400 = local9;
									Static503.anInt8360 = local7;
									return true;
								}
								local256 = Static96.anIntArrayArray16[local78][local74] + 1;
								if (local78 > 0 && Static296.anIntArrayArray19[local78 - 1][local74] == 0 && (local59[local90 - 1][local96] & 0x43A40000) == 0 && (local59[local90 - 1][arg8 + local96 - 1] & 0x4E240000) == 0) {
									local295 = 1;
									while (true) {
										if (arg8 - 1 <= local295) {
											Static456.anIntArray409[local54] = local7 - 1;
											Static312.anIntArray288[local54] = local9;
											Static296.anIntArrayArray19[local78 - 1][local74] = 2;
											local54 = local54 + 1 & 0xFFF;
											Static96.anIntArrayArray16[local78 - 1][local74] = local256;
											break;
										}
										if ((local59[local90 - 1][local96 + local295] & 0x4FA40000) != 0) {
											break;
										}
										local295++;
									}
								}
								if (128 - arg8 > local78 && Static296.anIntArrayArray19[local78 + 1][local74] == 0 && (local59[local90 + arg8][local96] & 0x60E40000) == 0 && (local59[arg8 + local90][arg8 + local96 - 1] & 0x78240000) == 0) {
									local295 = 1;
									while (true) {
										if (arg8 - 1 <= local295) {
											Static456.anIntArray409[local54] = local7 + 1;
											Static312.anIntArray288[local54] = local9;
											local54 = local54 + 1 & 0xFFF;
											Static296.anIntArrayArray19[local78 + 1][local74] = 8;
											Static96.anIntArrayArray16[local78 + 1][local74] = local256;
											break;
										}
										if ((local59[arg8 + local90][local96 + local295] & 0x78E40000) != 0) {
											break;
										}
										local295++;
									}
								}
								if (local74 > 0 && Static296.anIntArrayArray19[local78][local74 - 1] == 0 && (local59[local90][local96 - 1] & 0x43A40000) == 0 && (local59[arg8 + local90 - 1][local96 - 1] & 0x60E40000) == 0) {
									local295 = 1;
									while (true) {
										if (local295 >= arg8 - 1) {
											Static456.anIntArray409[local54] = local7;
											Static312.anIntArray288[local54] = local9 - 1;
											local54 = local54 + 1 & 0xFFF;
											Static296.anIntArrayArray19[local78][local74 - 1] = 1;
											Static96.anIntArrayArray16[local78][local74 - 1] = local256;
											break;
										}
										if ((local59[local90 + local295][local96 - 1] & 0x63E40000) != 0) {
											break;
										}
										local295++;
									}
								}
								if (local74 < 128 - arg8 && Static296.anIntArrayArray19[local78][local74 + 1] == 0 && (local59[local90][local96 + arg8] & 0x4E240000) == 0 && (local59[local90 + arg8 - 1][arg8 + local96] & 0x78240000) == 0) {
									local295 = 1;
									while (true) {
										if (arg8 - 1 <= local295) {
											Static456.anIntArray409[local54] = local7;
											Static312.anIntArray288[local54] = local9 + 1;
											Static296.anIntArrayArray19[local78][local74 + 1] = 4;
											local54 = local54 + 1 & 0xFFF;
											Static96.anIntArrayArray16[local78][local74 + 1] = local256;
											break;
										}
										if ((local59[local295 + local90][arg8 + local96] & 0x7E240000) != 0) {
											break;
										}
										local295++;
									}
								}
								if (local78 > 0 && local74 > 0 && Static296.anIntArrayArray19[local78 - 1][local74 - 1] == 0 && (local59[local90 - 1][local96 - 1] & 0x43A40000) == 0) {
									local295 = 1;
									while (true) {
										if (arg8 <= local295) {
											Static456.anIntArray409[local54] = local7 - 1;
											Static312.anIntArray288[local54] = local9 - 1;
											local54 = local54 + 1 & 0xFFF;
											Static296.anIntArrayArray19[local78 - 1][local74 - 1] = 3;
											Static96.anIntArrayArray16[local78 - 1][local74 - 1] = local256;
											break;
										}
										if ((local59[local90 - 1][local96 + local295 - 1] & 0x4FA40000) != 0 || (local59[local295 + local90 - 1][local96 - 1] & 0x63E40000) != 0) {
											break;
										}
										local295++;
									}
								}
								if (local78 < 128 - arg8 && local74 > 0 && Static296.anIntArrayArray19[local78 + 1][local74 - 1] == 0 && (local59[arg8 + local90][local96 - 1] & 0x60E40000) == 0) {
									local295 = 1;
									while (true) {
										if (local295 >= arg8) {
											Static456.anIntArray409[local54] = local7 + 1;
											Static312.anIntArray288[local54] = local9 - 1;
											Static296.anIntArrayArray19[local78 + 1][local74 - 1] = 9;
											local54 = local54 + 1 & 0xFFF;
											Static96.anIntArrayArray16[local78 + 1][local74 - 1] = local256;
											break;
										}
										if ((local59[arg8 + local90][local295 + local96 - 1] & 0x78E40000) != 0 || (local59[local90 + local295][local96 - 1] & 0x63E40000) != 0) {
											break;
										}
										local295++;
									}
								}
								if (local78 > 0 && local74 < 128 - arg8 && Static296.anIntArrayArray19[local78 - 1][local74 + 1] == 0 && (local59[local90 - 1][local96 + arg8] & 0x4E240000) == 0) {
									for (local295 = 1; local295 < arg8; local295++) {
										if ((local59[local90 - 1][local295 + local96] & 0x4FA40000) != 0 || (local59[local295 + local90 - 1][local96 + arg8] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static456.anIntArray409[local54] = local7 - 1;
									Static312.anIntArray288[local54] = local9 + 1;
									Static296.anIntArrayArray19[local78 - 1][local74 + 1] = 6;
									local54 = local54 + 1 & 0xFFF;
									Static96.anIntArrayArray16[local78 - 1][local74 + 1] = local256;
								}
							} while (local78 >= 128 - arg8);
						} while (local74 >= 128 - arg8);
					} while (Static296.anIntArrayArray19[local78 + 1][local74 + 1] != 0);
				} while ((local59[local90 + arg8][arg8 + local96] & 0x78240000) != 0);
				for (local295 = 1; local295 < arg8; local295++) {
					if ((local59[local295 + local90][arg8 + local96] & 0x7E240000) != 0 || (local59[local90 + arg8][local96 + local295] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static456.anIntArray409[local54] = local7 + 1;
				Static312.anIntArray288[local54] = local9 + 1;
				Static296.anIntArrayArray19[local78 + 1][local74 + 1] = 12;
				local54 = local54 + 1 & 0xFFF;
				Static96.anIntArrayArray16[local78 + 1][local74 + 1] = local256;
			}
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ZIJ)Ljava/lang/String;")
	public static String method9287(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		Static345.method5977(arg1);
		@Pc(10) int local10 = Static550.aCalendar2.get(5);
		@Pc(21) int local21 = Static550.aCalendar2.get(2);
		@Pc(25) int local25 = Static550.aCalendar2.get(1);
		return arg0 == 3 ? Static348.method6016(arg1, arg0) : Integer.toString(local10 / 10) + local10 % 10 + "-" + Static303.aStringArrayArray3[arg0][local21] + "-" + local25;
	}
}
