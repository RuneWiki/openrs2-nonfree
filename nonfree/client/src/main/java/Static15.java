import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!as", name = "T", descriptor = "I")
	public static int anInt282;

	@OriginalMember(owner = "client!as", name = "Q", descriptor = "Lclient!la;")
	public static final Class136 aClass136_8 = new Class136(27, 6);

	@OriginalMember(owner = "client!as", name = "U", descriptor = "Lclient!la;")
	public static final Class136 aClass136_9 = new Class136(107, 3);

	@OriginalMember(owner = "client!as", name = "V", descriptor = "[Z")
	public static final boolean[] aBooleanArray3 = new boolean[100];

	@OriginalMember(owner = "client!as", name = "W", descriptor = "I")
	public static int anInt283 = 0;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(III)V")
	public static void method314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static389.aClass227ArrayArrayArray3[0][arg1][arg2] != null && Static389.aClass227ArrayArrayArray3[0][arg1][arg2].aClass227_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static389.aClass227ArrayArrayArray3[local22][arg1][arg2] == null) {
				@Pc(46) Class227 local46 = Static389.aClass227ArrayArrayArray3[local22][arg1][arg2] = new Class227(local22, arg1, arg2);
				if (local20) {
					local46.aByte81++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IB)I")
	public static int method315(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IIIIIIIIILclient!kg;II)Z")
	public static boolean method317(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class128 arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg6;
		@Pc(9) int local9 = arg3;
		@Pc(18) int local18 = arg6 - 64;
		@Pc(23) int local23 = arg3 - 64;
		Static220.anIntArrayArray36[64][64] = 99;
		Static248.anIntArrayArray34[64][64] = 0;
		@Pc(37) byte local37 = 0;
		@Pc(39) int local39 = 0;
		Static203.anIntArray227[0] = arg6;
		@Pc(46) int local46 = local37 + 1;
		Static424.anIntArray459[0] = arg3;
		@Pc(51) int[][] local51 = arg9.anIntArrayArray27;
		while (true) {
			label282: while (true) {
				@Pc(75) int local75;
				@Pc(65) int local65;
				@Pc(81) int local81;
				@Pc(86) int local86;
				@Pc(243) int local243;
				@Pc(288) int local288;
				do {
					do {
						do {
							label259: do {
								if (local46 == local39) {
									anInt282 = local9;
									Static129.anInt2348 = local7;
									return false;
								}
								local7 = Static203.anIntArray227[local39];
								local9 = Static424.anIntArray459[local39];
								local65 = local9 - local23;
								local39 = local39 + 1 & 0xFFF;
								local75 = local7 - local18;
								local81 = local7 - arg9.anInt3691;
								local86 = local9 - arg9.anInt3692;
								if (arg4 == -4) {
									if (local7 == arg0 && local9 == arg10) {
										Static129.anInt2348 = local7;
										anInt282 = local9;
										return true;
									}
								} else if (arg4 == -3) {
									if (Static74.method1318(local7, arg2, arg5, arg0, local9, arg2, arg10, arg8)) {
										Static129.anInt2348 = local7;
										anInt282 = local9;
										return true;
									}
								} else if (arg4 == -2) {
									if (arg9.method3187(local9, arg1, arg0, arg2, arg8, arg10, arg2, local7, arg5)) {
										anInt282 = local9;
										Static129.anInt2348 = local7;
										return true;
									}
								} else if (arg4 == -1) {
									if (arg9.method3189(arg1, arg8, arg0, arg2, arg10, local7, local9, arg5)) {
										anInt282 = local9;
										Static129.anInt2348 = local7;
										return true;
									}
								} else if (arg4 == 0 || arg4 == 1 || arg4 == 2 || arg4 == 3 || arg4 == 9) {
									if (arg9.method3186(local9, arg7, local7, arg10, arg2, arg4, arg0)) {
										anInt282 = local9;
										Static129.anInt2348 = local7;
										return true;
									}
								} else if (arg9.method3192(arg4, local9, arg2, arg10, arg7, local7, arg0)) {
									anInt282 = local9;
									Static129.anInt2348 = local7;
									return true;
								}
								local243 = Static248.anIntArrayArray34[local75][local65] + 1;
								if (local75 > 0 && Static220.anIntArrayArray36[local75 - 1][local65] == 0 && (local51[local81 - 1][local86] & 0x43A40000) == 0 && (local51[local81 - 1][local86 + arg2 - 1] & 0x4E240000) == 0) {
									local288 = 1;
									while (true) {
										if (arg2 - 1 <= local288) {
											Static203.anIntArray227[local46] = local7 - 1;
											Static424.anIntArray459[local46] = local9;
											Static220.anIntArrayArray36[local75 - 1][local65] = 2;
											local46 = local46 + 1 & 0xFFF;
											Static248.anIntArrayArray34[local75 - 1][local65] = local243;
											break;
										}
										if ((local51[local81 - 1][local86 + local288] & 0x4FA40000) != 0) {
											break;
										}
										local288++;
									}
								}
								if (local75 < 128 - arg2 && Static220.anIntArrayArray36[local75 + 1][local65] == 0 && (local51[arg2 + local81][local86] & 0x60E40000) == 0 && (local51[arg2 + local81][local86 + arg2 - 1] & 0x78240000) == 0) {
									local288 = 1;
									while (true) {
										if (arg2 - 1 <= local288) {
											Static203.anIntArray227[local46] = local7 + 1;
											Static424.anIntArray459[local46] = local9;
											local46 = local46 + 1 & 0xFFF;
											Static220.anIntArrayArray36[local75 + 1][local65] = 8;
											Static248.anIntArrayArray34[local75 + 1][local65] = local243;
											break;
										}
										if ((local51[arg2 + local81][local86 + local288] & 0x78E40000) != 0) {
											break;
										}
										local288++;
									}
								}
								if (local65 > 0 && Static220.anIntArrayArray36[local75][local65 - 1] == 0 && (local51[local81][local86 - 1] & 0x43A40000) == 0 && (local51[local81 + arg2 - 1][local86 - 1] & 0x60E40000) == 0) {
									local288 = 1;
									while (true) {
										if (arg2 - 1 <= local288) {
											Static203.anIntArray227[local46] = local7;
											Static424.anIntArray459[local46] = local9 - 1;
											local46 = local46 + 1 & 0xFFF;
											Static220.anIntArrayArray36[local75][local65 - 1] = 1;
											Static248.anIntArrayArray34[local75][local65 - 1] = local243;
											break;
										}
										if ((local51[local81 + local288][local86 - 1] & 0x63E40000) != 0) {
											break;
										}
										local288++;
									}
								}
								if (local65 < 128 - arg2 && Static220.anIntArrayArray36[local75][local65 + 1] == 0 && (local51[local81][local86 + arg2] & 0x4E240000) == 0 && (local51[local81 + arg2 - 1][local86 + arg2] & 0x78240000) == 0) {
									local288 = 1;
									while (true) {
										if (local288 >= arg2 - 1) {
											Static203.anIntArray227[local46] = local7;
											Static424.anIntArray459[local46] = local9 + 1;
											Static220.anIntArrayArray36[local75][local65 + 1] = 4;
											local46 = local46 + 1 & 0xFFF;
											Static248.anIntArrayArray34[local75][local65 + 1] = local243;
											break;
										}
										if ((local51[local81 + local288][local86 + arg2] & 0x7E240000) != 0) {
											break;
										}
										local288++;
									}
								}
								if (local75 > 0 && local65 > 0 && Static220.anIntArrayArray36[local75 - 1][local65 - 1] == 0 && (local51[local81 - 1][local86 - 1] & 0x43A40000) == 0) {
									local288 = 1;
									while (true) {
										if (local288 >= arg2) {
											Static203.anIntArray227[local46] = local7 - 1;
											Static424.anIntArray459[local46] = local9 - 1;
											Static220.anIntArrayArray36[local75 - 1][local65 - 1] = 3;
											local46 = local46 + 1 & 0xFFF;
											Static248.anIntArrayArray34[local75 - 1][local65 - 1] = local243;
											break;
										}
										if ((local51[local81 - 1][local288 + local86 - 1] & 0x4FA40000) != 0 || (local51[local288 + local81 - 1][local86 - 1] & 0x63E40000) != 0) {
											break;
										}
										local288++;
									}
								}
								if (local75 < 128 - arg2 && local65 > 0 && Static220.anIntArrayArray36[local75 + 1][local65 - 1] == 0 && (local51[arg2 + local81][local86 - 1] & 0x60E40000) == 0) {
									local288 = 1;
									while (true) {
										if (arg2 <= local288) {
											Static203.anIntArray227[local46] = local7 + 1;
											Static424.anIntArray459[local46] = local9 - 1;
											Static220.anIntArrayArray36[local75 + 1][local65 - 1] = 9;
											local46 = local46 + 1 & 0xFFF;
											Static248.anIntArrayArray34[local75 + 1][local65 - 1] = local243;
											break;
										}
										if ((local51[local81 + arg2][local288 + local86 - 1] & 0x78E40000) != 0 || (local51[local81 + local288][local86 - 1] & 0x63E40000) != 0) {
											break;
										}
										local288++;
									}
								}
								if (local75 > 0 && local65 < 128 - arg2 && Static220.anIntArrayArray36[local75 - 1][local65 + 1] == 0 && (local51[local81 - 1][arg2 + local86] & 0x4E240000) == 0) {
									for (local288 = 1; local288 < arg2; local288++) {
										if ((local51[local81 - 1][local288 + local86] & 0x4FA40000) != 0 || (local51[local288 + local81 - 1][local86 + arg2] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static203.anIntArray227[local46] = local7 - 1;
									Static424.anIntArray459[local46] = local9 + 1;
									local46 = local46 + 1 & 0xFFF;
									Static220.anIntArrayArray36[local75 - 1][local65 + 1] = 6;
									Static248.anIntArrayArray34[local75 - 1][local65 + 1] = local243;
								}
							} while (128 - arg2 <= local75);
						} while (128 - arg2 <= local65);
					} while (Static220.anIntArrayArray36[local75 + 1][local65 + 1] != 0);
				} while ((local51[arg2 + local81][arg2 + local86] & 0x78240000) != 0);
				for (local288 = 1; local288 < arg2; local288++) {
					if ((local51[local81 + local288][local86 + arg2] & 0x7E240000) != 0 || (local51[arg2 + local81][local86 + local288] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static203.anIntArray227[local46] = local7 + 1;
				Static424.anIntArray459[local46] = local9 + 1;
				Static220.anIntArrayArray36[local75 + 1][local65 + 1] = 12;
				local46 = local46 + 1 & 0xFFF;
				Static248.anIntArrayArray34[local75 + 1][local65 + 1] = local243;
			}
		}
	}
}
