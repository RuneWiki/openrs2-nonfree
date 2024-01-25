import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!v", name = "a", descriptor = "[I")
	public static final int[] anIntArray645 = new int[1000];

	@OriginalMember(owner = "client!v", name = "l", descriptor = "I")
	public static int anInt6403 = 0;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!lm;ZLclient!lm;I)V")
	public static void method5494(@OriginalArg(0) Class134 arg0, @OriginalArg(2) Class134 arg1) {
		Static127.aClass134_57 = arg1;
		Static121.aBoolean337 = true;
		Static206.aClass134_100 = arg0;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method5495(@OriginalArg(0) int arg0) {
		return arg0 < 999999999 ? Integer.toString(arg0) : "*";
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!il;[[BII[[BLclient!ii;[ZIIIII[[BLclient!rc;)V")
	public static void method5497(@OriginalArg(0) Class107 arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[][] arg3, @OriginalArg(5) Class105 arg4, @OriginalArg(6) boolean[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) byte[][] arg11, @OriginalArg(13) Class175 arg12) {
		@Pc(55) int local55;
		if (arg12 != null && arg0 != null || arg0 != null && arg7 == 12 || arg12 != null && arg7 == 0) {
			@Pc(36) boolean[] local36 = arg12 != null && arg12.aBoolean437 ? Static50.aBooleanArrayArray2[arg7] : Static94.aBooleanArrayArray3[arg7];
			@Pc(63) Class175 local63;
			@Pc(80) byte local80;
			@Pc(96) int local96;
			@Pc(101) int local101;
			if (arg6 > 0) {
				if (arg2 > 0) {
					local55 = arg11[arg2 - 1][arg6 - 1] & 0xFF;
					if (local55 > 0) {
						local63 = Static338.method5610(local55 - 1);
						if (local63.anInt5263 != -1 && local63.aBoolean437) {
							local80 = arg1[arg2 - 1][arg6 - 1];
							local96 = arg3[arg2 - 1][arg6 - 1] * 2 + 4 & 0x7;
							local101 = Static344.method5761(arg4, local63);
							if (Static123.aBooleanArrayArray7[local80][local96]) {
								Static135.anIntArray270[0] = local63.anInt5263;
								Static147.anIntArray297[0] = local101;
								Static201.anIntArray665[0] = arg4.method4259() ? local63.anInt5275 : local63.anInt5265;
								Static85.anIntArray127[0] = local63.anInt5268;
								Static37.anIntArray60[0] = local63.anInt5267;
								Static175.anIntArray350[0] = 256;
							}
						}
					}
				}
				if (arg2 < arg9 - 1) {
					local55 = arg11[arg2 + 1][arg6 - 1] & 0xFF;
					if (local55 > 0) {
						local63 = Static338.method5610(local55 - 1);
						if (local63.anInt5263 != -1 && local63.aBoolean437) {
							local80 = arg1[arg2 + 1][arg6 - 1];
							local96 = arg3[arg2 + 1][arg6 - 1] * 2 + 6 & 0x7;
							local101 = Static344.method5761(arg4, local63);
							if (Static123.aBooleanArrayArray7[local80][local96]) {
								Static135.anIntArray270[2] = local63.anInt5263;
								Static147.anIntArray297[2] = local101;
								Static201.anIntArray665[2] = arg4.method4259() ? local63.anInt5275 : local63.anInt5265;
								Static85.anIntArray127[2] = local63.anInt5268;
								Static37.anIntArray60[2] = local63.anInt5267;
								Static175.anIntArray350[2] = 512;
							}
						}
					}
				}
			}
			if (arg8 - 1 > arg6) {
				if (arg2 > 0) {
					local55 = arg11[arg2 - 1][arg6 + 1] & 0xFF;
					if (local55 > 0) {
						local63 = Static338.method5610(local55 - 1);
						if (local63.anInt5263 != -1 && local63.aBoolean437) {
							local80 = arg1[arg2 - 1][arg6 + 1];
							local96 = arg3[arg2 - 1][arg6 + 1] * 2 + 2 & 0x7;
							local101 = Static344.method5761(arg4, local63);
							if (Static123.aBooleanArrayArray7[local80][local96]) {
								Static135.anIntArray270[6] = local63.anInt5263;
								Static147.anIntArray297[6] = local101;
								Static201.anIntArray665[6] = arg4.method4259() ? local63.anInt5275 : local63.anInt5265;
								Static85.anIntArray127[6] = local63.anInt5268;
								Static37.anIntArray60[6] = local63.anInt5267;
								Static175.anIntArray350[6] = 64;
							}
						}
					}
				}
				if (arg9 - 1 > arg2) {
					local55 = arg11[arg2 + 1][arg6 + 1] & 0xFF;
					if (local55 > 0) {
						local63 = Static338.method5610(local55 - 1);
						if (local63.anInt5263 != -1 && local63.aBoolean437) {
							local80 = arg1[arg2 + 1][arg6 + 1];
							local96 = --(arg3[arg2 + 1][arg6 + 1] * 2) & 0x7;
							local101 = Static344.method5761(arg4, local63);
							if (Static123.aBooleanArrayArray7[local80][local96]) {
								Static135.anIntArray270[4] = local63.anInt5263;
								Static147.anIntArray297[4] = local101;
								Static201.anIntArray665[4] = arg4.method4259() ? local63.anInt5275 : local63.anInt5265;
								Static85.anIntArray127[4] = local63.anInt5268;
								Static37.anIntArray60[4] = local63.anInt5267;
								Static175.anIntArray350[4] = 128;
							}
						}
					}
				}
			}
			@Pc(516) int local516;
			@Pc(521) int local521;
			@Pc(523) int local523;
			@Pc(504) byte local504;
			if (arg6 > 0) {
				local55 = arg11[arg2][arg6 - 1] & 0xFF;
				if (local55 > 0) {
					local63 = Static338.method5610(local55 - 1);
					if (local63.anInt5263 != -1) {
						local80 = arg1[arg2][arg6 - 1];
						local504 = arg3[arg2][arg6 - 1];
						if (local63.aBoolean437) {
							local101 = 2;
							local516 = local504 * 2 + 4;
							local521 = Static344.method5761(arg4, local63);
							for (local523 = 0; local523 < 3; local523++) {
								local101 &= 0x7;
								local516 &= 0x7;
								if (Static123.aBooleanArrayArray7[local80][local516] && Static37.anIntArray60[local101] <= local63.anInt5267) {
									Static135.anIntArray270[local101] = local63.anInt5263;
									Static147.anIntArray297[local101] = local521;
									Static201.anIntArray665[local101] = arg4.method4259() ? local63.anInt5275 : local63.anInt5265;
									Static85.anIntArray127[local101] = local63.anInt5268;
									if (Static37.anIntArray60[local101] == local63.anInt5267) {
										Static175.anIntArray350[local101] |= 0x20;
									} else {
										Static175.anIntArray350[local101] = 32;
									}
									Static37.anIntArray60[local101] = local63.anInt5267;
								}
								local101--;
								local516++;
							}
							if (!local36[arg10 & 0x3]) {
								arg5[0] = Static50.aBooleanArrayArray2[local80][local504 + 2 & 0x3];
							}
						} else if (!local36[arg10 & 0x3]) {
							arg5[0] = Static94.aBooleanArrayArray3[local80][local504 + 2 & 0x3];
						}
					}
				}
			}
			if (arg6 < arg8 - 1) {
				local55 = arg11[arg2][arg6 + 1] & 0xFF;
				if (local55 > 0) {
					local63 = Static338.method5610(local55 - 1);
					if (local63.anInt5263 != -1) {
						local80 = arg1[arg2][arg6 + 1];
						local504 = arg3[arg2][arg6 + 1];
						if (local63.aBoolean437) {
							local101 = 4;
							local516 = local504 * 2 + 2;
							local521 = Static344.method5761(arg4, local63);
							for (local523 = 0; local523 < 3; local523++) {
								local101 &= 0x7;
								local516 &= 0x7;
								if (Static123.aBooleanArrayArray7[local80][local516] && local63.anInt5267 >= Static37.anIntArray60[local101]) {
									Static135.anIntArray270[local101] = local63.anInt5263;
									Static147.anIntArray297[local101] = local521;
									Static201.anIntArray665[local101] = arg4.method4259() ? local63.anInt5275 : local63.anInt5265;
									Static85.anIntArray127[local101] = local63.anInt5268;
									if (Static37.anIntArray60[local101] == local63.anInt5267) {
										Static175.anIntArray350[local101] |= 0x10;
									} else {
										Static175.anIntArray350[local101] = 16;
									}
									Static37.anIntArray60[local101] = local63.anInt5267;
								}
								local516--;
								local101++;
							}
							if (!local36[arg10 + 2 & 0x3]) {
								arg5[2] = Static50.aBooleanArrayArray2[local80][--local504 & 0x3];
							}
						} else if (!local36[arg10 + 2 & 0x3]) {
							arg5[2] = Static94.aBooleanArrayArray3[local80][local504 & 0x3];
						}
					}
				}
			}
			if (arg2 > 0) {
				local55 = arg11[arg2 - 1][arg6] & 0xFF;
				if (local55 > 0) {
					local63 = Static338.method5610(local55 - 1);
					if (local63.anInt5263 != -1) {
						local80 = arg1[arg2 - 1][arg6];
						local504 = arg3[arg2 - 1][arg6];
						if (local63.aBoolean437) {
							local101 = 6;
							local516 = local504 * 2 + 4;
							local521 = Static344.method5761(arg4, local63);
							for (local523 = 0; local523 < 3; local523++) {
								local516 &= 0x7;
								local101 &= 0x7;
								if (Static123.aBooleanArrayArray7[local80][local516] && Static37.anIntArray60[local101] <= local63.anInt5267) {
									Static135.anIntArray270[local101] = local63.anInt5263;
									Static147.anIntArray297[local101] = local521;
									Static201.anIntArray665[local101] = arg4.method4259() ? local63.anInt5275 : local63.anInt5265;
									Static85.anIntArray127[local101] = local63.anInt5268;
									if (local63.anInt5267 == Static37.anIntArray60[local101]) {
										Static175.anIntArray350[local101] |= 0x8;
									} else {
										Static175.anIntArray350[local101] = 8;
									}
									Static37.anIntArray60[local101] = local63.anInt5267;
								}
								local101++;
								local516--;
							}
							if (!local36[arg10 + 3 & 0x3]) {
								arg5[3] = Static50.aBooleanArrayArray2[local80][local504 + 1 & 0x3];
							}
						} else if (!local36[arg10 + 3 & 0x3]) {
							arg5[3] = Static94.aBooleanArrayArray3[local80][local504 + 1 & 0x3];
						}
					}
				}
			}
			if (arg9 - 1 > arg2) {
				local55 = arg11[arg2 + 1][arg6] & 0xFF;
				if (local55 > 0) {
					local63 = Static338.method5610(local55 - 1);
					if (local63.anInt5263 != -1) {
						local80 = arg1[arg2 + 1][arg6];
						local504 = arg3[arg2 + 1][arg6];
						if (local63.aBoolean437) {
							local101 = 4;
							local516 = local504 * 2 + 6;
							local521 = Static344.method5761(arg4, local63);
							for (local523 = 0; local523 < 3; local523++) {
								local516 &= 0x7;
								local101 &= 0x7;
								if (Static123.aBooleanArrayArray7[local80][local516] && local63.anInt5267 >= Static37.anIntArray60[local101]) {
									Static135.anIntArray270[local101] = local63.anInt5263;
									Static147.anIntArray297[local101] = local521;
									Static201.anIntArray665[local101] = arg4.method4259() ? local63.anInt5275 : local63.anInt5265;
									Static85.anIntArray127[local101] = local63.anInt5268;
									if (Static37.anIntArray60[local101] == local63.anInt5267) {
										Static175.anIntArray350[local101] |= 0x4;
									} else {
										Static175.anIntArray350[local101] = 4;
									}
									Static37.anIntArray60[local101] = local63.anInt5267;
								}
								local516++;
								local101--;
							}
							if (!local36[arg10 + 1 & 0x3]) {
								arg5[1] = Static50.aBooleanArrayArray2[local80][local504 + 3 & 0x3];
							}
						} else if (!local36[arg10 + 1 & 0x3]) {
							arg5[1] = Static94.aBooleanArrayArray3[local80][local504 + 3 & 0x3];
						}
					}
				}
			}
		}
		if (arg12 == null) {
			return;
		}
		@Pc(1217) int local1217 = Static344.method5761(arg4, arg12);
		if (!arg12.aBoolean437) {
			return;
		}
		for (local55 = 0; local55 < 8; local55++) {
			@Pc(1232) int local1232 = local55 - arg10 * 2 & 0x7;
			if (Static123.aBooleanArrayArray7[arg7][local55] && Static37.anIntArray60[local1232] <= arg12.anInt5267) {
				Static135.anIntArray270[local1232] = arg12.anInt5263;
				Static147.anIntArray297[local1232] = local1217;
				Static201.anIntArray665[local1232] = arg4.method4259() ? arg12.anInt5275 : arg12.anInt5265;
				Static85.anIntArray127[local1232] = arg12.anInt5268;
				if (Static37.anIntArray60[local1232] == arg12.anInt5267) {
					Static175.anIntArray350[local1232] |= 0x2;
				} else {
					Static175.anIntArray350[local1232] = 2;
				}
				Static37.anIntArray60[local1232] = arg12.anInt5267;
			}
		}
	}
}
