import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "[Lclient!jf;")
	public static Class174[] aClass174Array1;

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "[I")
	public static final int[] anIntArray264 = new int[2048];

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
	public static int anInt4932 = -50;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILclient!up;IIIIIIIIZI)Z")
	public static boolean method4438(@OriginalArg(0) int arg0, @OriginalArg(1) Class352 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg9;
		@Pc(9) int local9 = arg5;
		@Pc(18) int local18 = arg9 - 64;
		@Pc(23) int local23 = arg5 - 64;
		Static499.anIntArrayArray72[64][64] = 99;
		Static348.anIntArrayArray44[64][64] = 0;
		@Pc(42) byte local42 = 0;
		@Pc(44) int local44 = 0;
		Static120.anIntArray137[0] = arg9;
		@Pc(51) int local51 = local42 + 1;
		Static330.anIntArray303[0] = arg5;
		@Pc(56) int[][] local56 = arg1.anIntArrayArray67;
		while (true) {
			label282: while (true) {
				@Pc(71) int local71;
				@Pc(82) int local82;
				@Pc(88) int local88;
				@Pc(94) int local94;
				@Pc(246) int local246;
				@Pc(292) int local292;
				do {
					do {
						do {
							label259: do {
								if (local44 == local51) {
									Static541.anInt9200 = local9;
									Static199.anInt3913 = local7;
									return false;
								}
								local9 = Static330.anIntArray303[local44];
								local7 = Static120.anIntArray137[local44];
								local71 = local7 - local18;
								local44 = local44 + 1 & 0xFFF;
								local82 = local9 - local23;
								local88 = local7 - arg1.anInt9711;
								local94 = local9 - arg1.anInt9709;
								if (arg7 == -4) {
									if (arg2 == local7 && arg0 == local9) {
										Static541.anInt9200 = local9;
										Static199.anInt3913 = local7;
										return true;
									}
								} else if (arg7 == -3) {
									if (Static536.method7904(arg2, arg0, local9, arg10, arg10, local7, arg8, arg4)) {
										Static541.anInt9200 = local9;
										Static199.anInt3913 = local7;
										return true;
									}
								} else if (arg7 == -2) {
									if (arg1.method8345(local7, arg10, arg10, arg0, local9, arg8, arg4, arg2, arg3)) {
										Static541.anInt9200 = local9;
										Static199.anInt3913 = local7;
										return true;
									}
								} else if (arg7 == -1) {
									if (arg1.method8343(arg2, arg8, local7, local9, arg4, arg3, arg10, arg0)) {
										Static199.anInt3913 = local7;
										Static541.anInt9200 = local9;
										return true;
									}
								} else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
									if (arg1.method8334(local7, arg0, arg10, arg7, local9, arg6, arg2)) {
										Static541.anInt9200 = local9;
										Static199.anInt3913 = local7;
										return true;
									}
								} else if (arg1.method8351(arg6, arg0, arg7, arg10, arg2, local9, local7)) {
									Static199.anInt3913 = local7;
									Static541.anInt9200 = local9;
									return true;
								}
								local246 = Static348.anIntArrayArray44[local71][local82] + 1;
								if (local71 > 0 && Static499.anIntArrayArray72[local71 - 1][local82] == 0 && (local56[local88 - 1][local94] & 0x43A40000) == 0 && (local56[local88 - 1][local94 + arg10 - 1] & 0x4E240000) == 0) {
									local292 = 1;
									while (true) {
										if (local292 >= arg10 - 1) {
											Static120.anIntArray137[local51] = local7 - 1;
											Static330.anIntArray303[local51] = local9;
											local51 = local51 + 1 & 0xFFF;
											Static499.anIntArrayArray72[local71 - 1][local82] = 2;
											Static348.anIntArrayArray44[local71 - 1][local82] = local246;
											break;
										}
										if ((local56[local88 - 1][local94 + local292] & 0x4FA40000) != 0) {
											break;
										}
										local292++;
									}
								}
								if (local71 < 128 - arg10 && Static499.anIntArrayArray72[local71 + 1][local82] == 0 && (local56[arg10 + local88][local94] & 0x60E40000) == 0 && (local56[local88 + arg10][arg10 + local94 - 1] & 0x78240000) == 0) {
									local292 = 1;
									while (true) {
										if (arg10 - 1 <= local292) {
											Static120.anIntArray137[local51] = local7 + 1;
											Static330.anIntArray303[local51] = local9;
											local51 = local51 + 1 & 0xFFF;
											Static499.anIntArrayArray72[local71 + 1][local82] = 8;
											Static348.anIntArrayArray44[local71 + 1][local82] = local246;
											break;
										}
										if ((local56[local88 + arg10][local292 + local94] & 0x78E40000) != 0) {
											break;
										}
										local292++;
									}
								}
								if (local82 > 0 && Static499.anIntArrayArray72[local71][local82 - 1] == 0 && (local56[local88][local94 - 1] & 0x43A40000) == 0 && (local56[arg10 + local88 - 1][local94 - 1] & 0x60E40000) == 0) {
									local292 = 1;
									while (true) {
										if (arg10 - 1 <= local292) {
											Static120.anIntArray137[local51] = local7;
											Static330.anIntArray303[local51] = local9 - 1;
											Static499.anIntArrayArray72[local71][local82 - 1] = 1;
											local51 = local51 + 1 & 0xFFF;
											Static348.anIntArrayArray44[local71][local82 - 1] = local246;
											break;
										}
										if ((local56[local292 + local88][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local292++;
									}
								}
								if (128 - arg10 > local82 && Static499.anIntArrayArray72[local71][local82 + 1] == 0 && (local56[local88][local94 + arg10] & 0x4E240000) == 0 && (local56[arg10 + local88 - 1][local94 + arg10] & 0x78240000) == 0) {
									local292 = 1;
									while (true) {
										if (arg10 - 1 <= local292) {
											Static120.anIntArray137[local51] = local7;
											Static330.anIntArray303[local51] = local9 + 1;
											Static499.anIntArrayArray72[local71][local82 + 1] = 4;
											local51 = local51 + 1 & 0xFFF;
											Static348.anIntArrayArray44[local71][local82 + 1] = local246;
											break;
										}
										if ((local56[local292 + local88][arg10 + local94] & 0x7E240000) != 0) {
											break;
										}
										local292++;
									}
								}
								if (local71 > 0 && local82 > 0 && Static499.anIntArrayArray72[local71 - 1][local82 - 1] == 0 && (local56[local88 - 1][local94 - 1] & 0x43A40000) == 0) {
									local292 = 1;
									while (true) {
										if (arg10 <= local292) {
											Static120.anIntArray137[local51] = local7 - 1;
											Static330.anIntArray303[local51] = local9 - 1;
											local51 = local51 + 1 & 0xFFF;
											Static499.anIntArrayArray72[local71 - 1][local82 - 1] = 3;
											Static348.anIntArrayArray44[local71 - 1][local82 - 1] = local246;
											break;
										}
										if ((local56[local88 - 1][local292 + local94 - 1] & 0x4FA40000) != 0 || (local56[local88 + local292 - 1][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local292++;
									}
								}
								if (128 - arg10 > local71 && local82 > 0 && Static499.anIntArrayArray72[local71 + 1][local82 - 1] == 0 && (local56[local88 + arg10][local94 - 1] & 0x60E40000) == 0) {
									local292 = 1;
									while (true) {
										if (arg10 <= local292) {
											Static120.anIntArray137[local51] = local7 + 1;
											Static330.anIntArray303[local51] = local9 - 1;
											Static499.anIntArrayArray72[local71 + 1][local82 - 1] = 9;
											local51 = local51 + 1 & 0xFFF;
											Static348.anIntArrayArray44[local71 + 1][local82 - 1] = local246;
											break;
										}
										if ((local56[arg10 + local88][local292 + local94 - 1] & 0x78E40000) != 0 || (local56[local88 + local292][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local292++;
									}
								}
								if (local71 > 0 && local82 < 128 - arg10 && Static499.anIntArrayArray72[local71 - 1][local82 + 1] == 0 && (local56[local88 - 1][arg10 + local94] & 0x4E240000) == 0) {
									for (local292 = 1; local292 < arg10; local292++) {
										if ((local56[local88 - 1][local292 + local94] & 0x4FA40000) != 0 || (local56[local88 + local292 - 1][arg10 + local94] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static120.anIntArray137[local51] = local7 - 1;
									Static330.anIntArray303[local51] = local9 + 1;
									local51 = local51 + 1 & 0xFFF;
									Static499.anIntArrayArray72[local71 - 1][local82 + 1] = 6;
									Static348.anIntArrayArray44[local71 - 1][local82 + 1] = local246;
								}
							} while (128 - arg10 <= local71);
						} while (128 - arg10 <= local82);
					} while (Static499.anIntArrayArray72[local71 + 1][local82 + 1] != 0);
				} while ((local56[local88 + arg10][local94 + arg10] & 0x78240000) != 0);
				for (local292 = 1; local292 < arg10; local292++) {
					if ((local56[local292 + local88][local94 + arg10] & 0x7E240000) != 0 || (local56[arg10 + local88][local292 + local94] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static120.anIntArray137[local51] = local7 + 1;
				Static330.anIntArray303[local51] = local9 + 1;
				Static499.anIntArrayArray72[local71 + 1][local82 + 1] = 12;
				local51 = local51 + 1 & 0xFFF;
				Static348.anIntArrayArray44[local71 + 1][local82 + 1] = local246;
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method4439(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}
}
