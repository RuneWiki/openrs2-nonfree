import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
	public static int anInt2200;

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_88 = new Class56(108, 0);

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "Lclient!up;")
	public static final Class250 aClass250_9 = new Class250(8, -1);

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
	public static int anInt2199 = 0;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIBILclient!is;IIIIII)Z")
	public static boolean method1761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class128 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(12) int local12 = arg6;
		@Pc(14) int local14 = arg9;
		@Pc(23) int local23 = arg6 - 64;
		@Pc(28) int local28 = arg9 - 64;
		Static47.anIntArrayArray10[64][64] = 99;
		Static51.anIntArrayArray12[64][64] = 0;
		@Pc(42) byte local42 = 0;
		@Pc(44) int local44 = 0;
		Static13.anIntArray10[0] = arg6;
		@Pc(51) int local51 = local42 + 1;
		Static149.anIntArray226[0] = arg9;
		@Pc(56) int[][] local56 = arg4.anIntArrayArray38;
		while (true) {
			label282: while (true) {
				@Pc(76) int local76;
				@Pc(71) int local71;
				@Pc(88) int local88;
				@Pc(94) int local94;
				@Pc(246) int local246;
				@Pc(289) int local289;
				do {
					do {
						do {
							label259: do {
								if (local44 == local51) {
									Static228.anInt3904 = local12;
									Static110.anInt2053 = local14;
									return false;
								}
								local12 = Static13.anIntArray10[local44];
								local14 = Static149.anIntArray226[local44];
								local71 = local14 - local28;
								local76 = local12 - local23;
								local44 = local44 + 1 & 0xFFF;
								local88 = local12 - arg4.anInt3180;
								local94 = local14 - arg4.anInt3167;
								if (arg8 == -4) {
									if (local12 == arg3 && local14 == arg7) {
										Static228.anInt3904 = local12;
										Static110.anInt2053 = local14;
										return true;
									}
								} else if (arg8 == -3) {
									if (Static248.method3584(arg5, local14, local12, arg2, arg7, arg0, arg5, arg3)) {
										Static110.anInt2053 = local14;
										Static228.anInt3904 = local12;
										return true;
									}
								} else if (arg8 == -2) {
									if (arg4.method2456(arg0, local14, arg5, arg2, arg3, arg7, arg1, arg5, local12)) {
										Static110.anInt2053 = local14;
										Static228.anInt3904 = local12;
										return true;
									}
								} else if (arg8 == -1) {
									if (arg4.method2459(local12, arg5, arg1, arg2, arg0, local14, arg3, arg7)) {
										Static228.anInt3904 = local12;
										Static110.anInt2053 = local14;
										return true;
									}
								} else if (arg8 == 0 || arg8 == 1 || arg8 == 2 || arg8 == 3 || arg8 == 9) {
									if (arg4.method2463(arg3, arg10, arg7, arg8, local14, arg5, local12)) {
										Static110.anInt2053 = local14;
										Static228.anInt3904 = local12;
										return true;
									}
								} else if (arg4.method2449(arg5, local14, local12, arg3, arg10, arg8, arg7)) {
									Static110.anInt2053 = local14;
									Static228.anInt3904 = local12;
									return true;
								}
								local246 = Static51.anIntArrayArray12[local76][local71] + 1;
								if (local76 > 0 && Static47.anIntArrayArray10[local76 - 1][local71] == 0 && (local56[local88 - 1][local94] & 0x43A40000) == 0 && (local56[local88 - 1][local94 + arg5 - 1] & 0x4E240000) == 0) {
									local289 = 1;
									while (true) {
										if (arg5 - 1 <= local289) {
											Static13.anIntArray10[local51] = local12 - 1;
											Static149.anIntArray226[local51] = local14;
											Static47.anIntArrayArray10[local76 - 1][local71] = 2;
											local51 = local51 + 1 & 0xFFF;
											Static51.anIntArrayArray12[local76 - 1][local71] = local246;
											break;
										}
										if ((local56[local88 - 1][local289 + local94] & 0x4FA40000) != 0) {
											break;
										}
										local289++;
									}
								}
								if (128 - arg5 > local76 && Static47.anIntArrayArray10[local76 + 1][local71] == 0 && (local56[local88 + arg5][local94] & 0x60E40000) == 0 && (local56[arg5 + local88][local94 + arg5 - 1] & 0x78240000) == 0) {
									local289 = 1;
									while (true) {
										if (arg5 - 1 <= local289) {
											Static13.anIntArray10[local51] = local12 + 1;
											Static149.anIntArray226[local51] = local14;
											local51 = local51 + 1 & 0xFFF;
											Static47.anIntArrayArray10[local76 + 1][local71] = 8;
											Static51.anIntArrayArray12[local76 + 1][local71] = local246;
											break;
										}
										if ((local56[local88 + arg5][local289 + local94] & 0x78E40000) != 0) {
											break;
										}
										local289++;
									}
								}
								if (local71 > 0 && Static47.anIntArrayArray10[local76][local71 - 1] == 0 && (local56[local88][local94 - 1] & 0x43A40000) == 0 && (local56[local88 + arg5 - 1][local94 - 1] & 0x60E40000) == 0) {
									local289 = 1;
									while (true) {
										if (local289 >= arg5 - 1) {
											Static13.anIntArray10[local51] = local12;
											Static149.anIntArray226[local51] = local14 - 1;
											local51 = local51 + 1 & 0xFFF;
											Static47.anIntArrayArray10[local76][local71 - 1] = 1;
											Static51.anIntArrayArray12[local76][local71 - 1] = local246;
											break;
										}
										if ((local56[local289 + local88][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local289++;
									}
								}
								if (local71 < 128 - arg5 && Static47.anIntArrayArray10[local76][local71 + 1] == 0 && (local56[local88][arg5 + local94] & 0x4E240000) == 0 && (local56[local88 + arg5 - 1][local94 + arg5] & 0x78240000) == 0) {
									local289 = 1;
									while (true) {
										if (arg5 - 1 <= local289) {
											Static13.anIntArray10[local51] = local12;
											Static149.anIntArray226[local51] = local14 + 1;
											Static47.anIntArrayArray10[local76][local71 + 1] = 4;
											local51 = local51 + 1 & 0xFFF;
											Static51.anIntArrayArray12[local76][local71 + 1] = local246;
											break;
										}
										if ((local56[local88 + local289][arg5 + local94] & 0x7E240000) != 0) {
											break;
										}
										local289++;
									}
								}
								if (local76 > 0 && local71 > 0 && Static47.anIntArrayArray10[local76 - 1][local71 - 1] == 0 && (local56[local88 - 1][local94 - 1] & 0x43A40000) == 0) {
									local289 = 1;
									while (true) {
										if (arg5 <= local289) {
											Static13.anIntArray10[local51] = local12 - 1;
											Static149.anIntArray226[local51] = local14 - 1;
											local51 = local51 + 1 & 0xFFF;
											Static47.anIntArrayArray10[local76 - 1][local71 - 1] = 3;
											Static51.anIntArrayArray12[local76 - 1][local71 - 1] = local246;
											break;
										}
										if ((local56[local88 - 1][local94 + local289 - 1] & 0x4FA40000) != 0 || (local56[local88 + local289 - 1][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local289++;
									}
								}
								if (128 - arg5 > local76 && local71 > 0 && Static47.anIntArrayArray10[local76 + 1][local71 - 1] == 0 && (local56[arg5 + local88][local94 - 1] & 0x60E40000) == 0) {
									local289 = 1;
									while (true) {
										if (arg5 <= local289) {
											Static13.anIntArray10[local51] = local12 + 1;
											Static149.anIntArray226[local51] = local14 - 1;
											Static47.anIntArrayArray10[local76 + 1][local71 - 1] = 9;
											local51 = local51 + 1 & 0xFFF;
											Static51.anIntArrayArray12[local76 + 1][local71 - 1] = local246;
											break;
										}
										if ((local56[local88 + arg5][local289 + local94 - 1] & 0x78E40000) != 0 || (local56[local88 + local289][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local289++;
									}
								}
								if (local76 > 0 && local71 < 128 - arg5 && Static47.anIntArrayArray10[local76 - 1][local71 + 1] == 0 && (local56[local88 - 1][local94 + arg5] & 0x4E240000) == 0) {
									for (local289 = 1; local289 < arg5; local289++) {
										if ((local56[local88 - 1][local94 + local289] & 0x4FA40000) != 0 || (local56[local88 + local289 - 1][arg5 + local94] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static13.anIntArray10[local51] = local12 - 1;
									Static149.anIntArray226[local51] = local14 + 1;
									Static47.anIntArrayArray10[local76 - 1][local71 + 1] = 6;
									local51 = local51 + 1 & 0xFFF;
									Static51.anIntArrayArray12[local76 - 1][local71 + 1] = local246;
								}
							} while (128 - arg5 <= local76);
						} while (128 - arg5 <= local71);
					} while (Static47.anIntArrayArray10[local76 + 1][local71 + 1] != 0);
				} while ((local56[arg5 + local88][arg5 + local94] & 0x78240000) != 0);
				for (local289 = 1; local289 < arg5; local289++) {
					if ((local56[local88 + local289][arg5 + local94] & 0x7E240000) != 0 || (local56[local88 + arg5][local94 + local289] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static13.anIntArray10[local51] = local12 + 1;
				Static149.anIntArray226[local51] = local14 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static47.anIntArrayArray10[local76 + 1][local71 + 1] = 12;
				Static51.anIntArrayArray12[local76 + 1][local71 + 1] = local246;
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BI)Lclient!jb;")
	public static Class132 method1762(@OriginalArg(1) int arg0) {
		@Pc(17) Class132 local17 = (Class132) Static250.aClass137_45.method2744((long) arg0);
		if (local17 != null) {
			return local17;
		}
		@Pc(27) byte[] local27 = Static177.aClass211_48.method4377(0, arg0);
		local17 = new Class132();
		if (local27 != null) {
			local17.method2500(new Class4_Sub9(local27));
		}
		local17.method2502();
		Static250.aClass137_45.method2732((long) arg0, local17);
		return local17;
	}
}
