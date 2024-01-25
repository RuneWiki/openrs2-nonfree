import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static517 {

	@OriginalMember(owner = "client!ts", name = "H", descriptor = "Lclient!it;")
	public static Class36 aClass36_3;

	@OriginalMember(owner = "client!ts", name = "B", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_202 = new Class81(8, 1);

	@OriginalMember(owner = "client!ts", name = "I", descriptor = "I")
	public static int anInt8561 = 0;

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lclient!io;I)Lclient!fda;")
	public static Class96 method7093(@OriginalArg(0) Class1_Sub20 arg0) {
		@Pc(7) int local7 = arg0.method4393();
		@Pc(16) Class314 local16 = Static303.method7887()[arg0.method4393()];
		@Pc(25) Class103 local25 = Static208.method7270()[arg0.method4393()];
		@Pc(31) int local31 = arg0.method4391();
		@Pc(35) int local35 = arg0.method4391();
		@Pc(41) int local41 = arg0.method4426();
		@Pc(45) int local45 = arg0.method4426();
		@Pc(49) int local49 = arg0.method4371();
		@Pc(53) int local53 = arg0.method4371();
		@Pc(57) int local57 = arg0.method4371();
		@Pc(66) boolean local66 = arg0.method4393() == 1;
		return new Class96(local7, local16, local25, local31, local35, local41, local45, local49, local53, local57, local66);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIIIIIIIILclient!ev;II)Z")
	public static boolean method7094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class94 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg1;
		@Pc(9) int local9 = arg3;
		@Pc(17) int local17 = arg1 - 64;
		@Pc(21) int local21 = arg3 - 64;
		Static252.anIntArrayArray62[64][64] = 99;
		Static89.anIntArrayArray10[64][64] = 0;
		@Pc(52) byte local52 = 0;
		Static341.anIntArray410[0] = arg1;
		@Pc(58) int local58 = 0;
		@Pc(61) int local61 = local52 + 1;
		Static343.anIntArray412[0] = arg3;
		@Pc(66) int[][] local66 = arg8.anIntArrayArray20;
		while (true) {
			label282: while (true) {
				@Pc(92) int local92;
				@Pc(81) int local81;
				@Pc(97) int local97;
				@Pc(102) int local102;
				@Pc(249) int local249;
				@Pc(295) int local295;
				do {
					do {
						do {
							label259: do {
								if (local61 == local58) {
									Static492.anInt8284 = local7;
									Static126.anInt6655 = local9;
									return false;
								}
								local9 = Static343.anIntArray412[local58];
								local7 = Static341.anIntArray410[local58];
								local81 = local9 - local21;
								local58 = local58 + 1 & 0xFFF;
								local92 = local7 - local17;
								local97 = local7 - arg8.anInt2619;
								local102 = local9 - arg8.anInt2626;
								if (arg6 == -4) {
									if (local7 == arg5 && arg7 == local9) {
										Static492.anInt8284 = local7;
										Static126.anInt6655 = local9;
										return true;
									}
								} else if (arg6 == -3) {
									if (Static239.method3923(arg5, local9, arg7, arg10, local7, arg4, arg10, arg2)) {
										Static492.anInt8284 = local7;
										Static126.anInt6655 = local9;
										return true;
									}
								} else if (arg6 == -2) {
									if (arg8.method2223(arg5, arg10, local7, arg10, arg2, arg9, arg4, local9, arg7)) {
										Static492.anInt8284 = local7;
										Static126.anInt6655 = local9;
										return true;
									}
								} else if (arg6 == -1) {
									if (arg8.method2214(arg2, local9, local7, arg9, arg7, arg10, arg5, arg4)) {
										Static492.anInt8284 = local7;
										Static126.anInt6655 = local9;
										return true;
									}
								} else if (arg6 == 0 || arg6 == 1 || arg6 == 2 || arg6 == 3 || arg6 == 9) {
									if (arg8.method2222(arg0, arg7, arg10, arg6, arg5, local7, local9)) {
										Static492.anInt8284 = local7;
										Static126.anInt6655 = local9;
										return true;
									}
								} else if (arg8.method2215(arg5, arg10, arg7, local9, arg0, arg6, local7)) {
									Static126.anInt6655 = local9;
									Static492.anInt8284 = local7;
									return true;
								}
								local249 = Static89.anIntArrayArray10[local92][local81] + 1;
								if (local92 > 0 && Static252.anIntArrayArray62[local92 - 1][local81] == 0 && (local66[local97 - 1][local102] & 0x43A40000) == 0 && (local66[local97 - 1][local102 + arg10 - 1] & 0x4E240000) == 0) {
									local295 = 1;
									while (true) {
										if (arg10 - 1 <= local295) {
											Static341.anIntArray410[local61] = local7 - 1;
											Static343.anIntArray412[local61] = local9;
											Static252.anIntArrayArray62[local92 - 1][local81] = 2;
											local61 = local61 + 1 & 0xFFF;
											Static89.anIntArrayArray10[local92 - 1][local81] = local249;
											break;
										}
										if ((local66[local97 - 1][local295 + local102] & 0x4FA40000) != 0) {
											break;
										}
										local295++;
									}
								}
								if (local92 < 128 - arg10 && Static252.anIntArrayArray62[local92 + 1][local81] == 0 && (local66[arg10 + local97][local102] & 0x60E40000) == 0 && (local66[local97 + arg10][arg10 + local102 - 1] & 0x78240000) == 0) {
									local295 = 1;
									while (true) {
										if (arg10 - 1 <= local295) {
											Static341.anIntArray410[local61] = local7 + 1;
											Static343.anIntArray412[local61] = local9;
											Static252.anIntArrayArray62[local92 + 1][local81] = 8;
											local61 = local61 + 1 & 0xFFF;
											Static89.anIntArrayArray10[local92 + 1][local81] = local249;
											break;
										}
										if ((local66[local97 + arg10][local295 + local102] & 0x78E40000) != 0) {
											break;
										}
										local295++;
									}
								}
								if (local81 > 0 && Static252.anIntArrayArray62[local92][local81 - 1] == 0 && (local66[local97][local102 - 1] & 0x43A40000) == 0 && (local66[local97 + arg10 - 1][local102 - 1] & 0x60E40000) == 0) {
									local295 = 1;
									while (true) {
										if (arg10 - 1 <= local295) {
											Static341.anIntArray410[local61] = local7;
											Static343.anIntArray412[local61] = local9 - 1;
											Static252.anIntArrayArray62[local92][local81 - 1] = 1;
											local61 = local61 + 1 & 0xFFF;
											Static89.anIntArrayArray10[local92][local81 - 1] = local249;
											break;
										}
										if ((local66[local295 + local97][local102 - 1] & 0x63E40000) != 0) {
											break;
										}
										local295++;
									}
								}
								if (128 - arg10 > local81 && Static252.anIntArrayArray62[local92][local81 + 1] == 0 && (local66[local97][arg10 + local102] & 0x4E240000) == 0 && (local66[arg10 + local97 - 1][arg10 + local102] & 0x78240000) == 0) {
									local295 = 1;
									while (true) {
										if (arg10 - 1 <= local295) {
											Static341.anIntArray410[local61] = local7;
											Static343.anIntArray412[local61] = local9 + 1;
											Static252.anIntArrayArray62[local92][local81 + 1] = 4;
											local61 = local61 + 1 & 0xFFF;
											Static89.anIntArrayArray10[local92][local81 + 1] = local249;
											break;
										}
										if ((local66[local97 + local295][local102 + arg10] & 0x7E240000) != 0) {
											break;
										}
										local295++;
									}
								}
								if (local92 > 0 && local81 > 0 && Static252.anIntArrayArray62[local92 - 1][local81 - 1] == 0 && (local66[local97 - 1][local102 - 1] & 0x43A40000) == 0) {
									local295 = 1;
									while (true) {
										if (arg10 <= local295) {
											Static341.anIntArray410[local61] = local7 - 1;
											Static343.anIntArray412[local61] = local9 - 1;
											local61 = local61 + 1 & 0xFFF;
											Static252.anIntArrayArray62[local92 - 1][local81 - 1] = 3;
											Static89.anIntArrayArray10[local92 - 1][local81 - 1] = local249;
											break;
										}
										if ((local66[local97 - 1][local102 + local295 - 1] & 0x4FA40000) != 0 || (local66[local97 + local295 - 1][local102 - 1] & 0x63E40000) != 0) {
											break;
										}
										local295++;
									}
								}
								if (local92 < 128 - arg10 && local81 > 0 && Static252.anIntArrayArray62[local92 + 1][local81 - 1] == 0 && (local66[local97 + arg10][local102 - 1] & 0x60E40000) == 0) {
									local295 = 1;
									while (true) {
										if (arg10 <= local295) {
											Static341.anIntArray410[local61] = local7 + 1;
											Static343.anIntArray412[local61] = local9 - 1;
											local61 = local61 + 1 & 0xFFF;
											Static252.anIntArrayArray62[local92 + 1][local81 - 1] = 9;
											Static89.anIntArrayArray10[local92 + 1][local81 - 1] = local249;
											break;
										}
										if ((local66[local97 + arg10][local102 + local295 - 1] & 0x78E40000) != 0 || (local66[local97 + local295][local102 - 1] & 0x63E40000) != 0) {
											break;
										}
										local295++;
									}
								}
								if (local92 > 0 && local81 < 128 - arg10 && Static252.anIntArrayArray62[local92 - 1][local81 + 1] == 0 && (local66[local97 - 1][arg10 + local102] & 0x4E240000) == 0) {
									for (local295 = 1; local295 < arg10; local295++) {
										if ((local66[local97 - 1][local102 + local295] & 0x4FA40000) != 0 || (local66[local97 + local295 - 1][local102 + arg10] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static341.anIntArray410[local61] = local7 - 1;
									Static343.anIntArray412[local61] = local9 + 1;
									Static252.anIntArrayArray62[local92 - 1][local81 + 1] = 6;
									local61 = local61 + 1 & 0xFFF;
									Static89.anIntArrayArray10[local92 - 1][local81 + 1] = local249;
								}
							} while (128 - arg10 <= local92);
						} while (local81 >= 128 - arg10);
					} while (Static252.anIntArrayArray62[local92 + 1][local81 + 1] != 0);
				} while ((local66[local97 + arg10][arg10 + local102] & 0x78240000) != 0);
				for (local295 = 1; local295 < arg10; local295++) {
					if ((local66[local97 + local295][local102 + arg10] & 0x7E240000) != 0 || (local66[local97 + arg10][local102 + local295] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static341.anIntArray410[local61] = local7 + 1;
				Static343.anIntArray412[local61] = local9 + 1;
				Static252.anIntArrayArray62[local92 + 1][local81 + 1] = 12;
				local61 = local61 + 1 & 0xFFF;
				Static89.anIntArrayArray10[local92 + 1][local81 + 1] = local249;
			}
		}
	}
}
