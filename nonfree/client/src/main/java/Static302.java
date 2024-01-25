import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!tg", name = "q", descriptor = "Lclient!hq;")
	public static Class94 aClass94_31;

	@OriginalMember(owner = "client!tg", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString423;

	@OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
	public static int anInt6436 = 0;

	@OriginalMember(owner = "client!tg", name = "m", descriptor = "[I")
	public static final int[] anIntArray820 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

	@OriginalMember(owner = "client!tg", name = "s", descriptor = "[I")
	public static final int[] anIntArray821 = new int[32];

	@OriginalMember(owner = "client!tg", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString424 = "Loading config - ";

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)V")
	public static void method5504() {
		Static130.anInt2837 = Static326.aClass208_7.anInt6371 + Static326.aClass208_7.anInt6381 + 2;
		Static73.anInt1814 = Static175.aClass208_3.anInt6381 + Static175.aClass208_3.anInt6371 + 2;
		Static353.aStringArray27 = new String[350 / Static130.anInt2837];
		for (@Pc(27) int local27 = 0; local27 < Static353.aStringArray27.length; local27++) {
			Static353.aStringArray27[local27] = "";
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIII)V")
	public static void method5506(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = Static254.anInt4943 * arg1 >> 8;
		if (local9 != 0 && arg2 != -1) {
			Static226.method4018(arg2, Static65.aClass180_18, local9);
			Static85.aBoolean152 = true;
		}
	}

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "(B)V")
	public static void method5507() {
		if (Static22.anInt448 != 3) {
			Static65.anInt1630 = -1;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(I[[BLclient!wd;II[[BIBILclient!pe;[ZI[[BLclient!fr;)V")
	public static void method5508(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) Class213 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[][] arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class89 arg8, @OriginalArg(10) boolean[] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) byte[][] arg11, @OriginalArg(13) Class78 arg12) {
		@Pc(47) int local47;
		if (arg2 != null && arg12 != null || arg12 != null && arg4 == 12 || arg2 != null && arg4 == 0) {
			@Pc(28) boolean[] local28 = arg2 != null && arg2.aBoolean477 ? Static292.aBooleanArrayArray3[arg4] : Static344.aBooleanArrayArray5[arg4];
			@Pc(55) Class213 local55;
			@Pc(73) byte local73;
			@Pc(89) int local89;
			@Pc(94) int local94;
			if (arg10 > 0) {
				if (arg3 > 0) {
					local47 = arg5[arg3 - 1][arg10 - 1] & 0xFF;
					if (local47 > 0) {
						local55 = Static146.method2935(local47 - 1);
						if (local55.anInt6543 != -1 && local55.aBoolean477) {
							local73 = arg1[arg3 - 1][arg10 - 1];
							local89 = arg11[arg3 - 1][arg10 - 1] * 2 + 4 & 0x7;
							local94 = Static201.method3718(local55, arg8);
							if (Static298.aBooleanArrayArray4[local73][local89]) {
								Static192.anIntArray524[0] = local55.anInt6543;
								Static294.anIntArray813[0] = local94;
								Static57.anIntArray219[0] = arg8.method5393() ? local55.anInt6539 : local55.anInt6542;
								Static350.anIntArray838[0] = local55.anInt6547;
								Static87.anIntArray719[0] = local55.anInt6551;
								Static342.anIntArray827[0] = 256;
							}
						}
					}
				}
				if (arg0 - 1 > arg3) {
					local47 = arg5[arg3 + 1][arg10 - 1] & 0xFF;
					if (local47 > 0) {
						local55 = Static146.method2935(local47 - 1);
						if (local55.anInt6543 != -1 && local55.aBoolean477) {
							local73 = arg1[arg3 + 1][arg10 - 1];
							local89 = arg11[arg3 + 1][arg10 - 1] * 2 + 6 & 0x7;
							local94 = Static201.method3718(local55, arg8);
							if (Static298.aBooleanArrayArray4[local73][local89]) {
								Static192.anIntArray524[2] = local55.anInt6543;
								Static294.anIntArray813[2] = local94;
								Static57.anIntArray219[2] = arg8.method5393() ? local55.anInt6539 : local55.anInt6542;
								Static350.anIntArray838[2] = local55.anInt6547;
								Static87.anIntArray719[2] = local55.anInt6551;
								Static342.anIntArray827[2] = 512;
							}
						}
					}
				}
			}
			if (arg10 < arg6 - 1) {
				if (arg3 > 0) {
					local47 = arg5[arg3 - 1][arg10 + 1] & 0xFF;
					if (local47 > 0) {
						local55 = Static146.method2935(local47 - 1);
						if (local55.anInt6543 != -1 && local55.aBoolean477) {
							local73 = arg1[arg3 - 1][arg10 + 1];
							local89 = arg11[arg3 - 1][arg10 + 1] * 2 + 2 & 0x7;
							local94 = Static201.method3718(local55, arg8);
							if (Static298.aBooleanArrayArray4[local73][local89]) {
								Static192.anIntArray524[6] = local55.anInt6543;
								Static294.anIntArray813[6] = local94;
								Static57.anIntArray219[6] = arg8.method5393() ? local55.anInt6539 : local55.anInt6542;
								Static350.anIntArray838[6] = local55.anInt6547;
								Static87.anIntArray719[6] = local55.anInt6551;
								Static342.anIntArray827[6] = 64;
							}
						}
					}
				}
				if (arg3 < arg0 - 1) {
					local47 = arg5[arg3 + 1][arg10 + 1] & 0xFF;
					if (local47 > 0) {
						local55 = Static146.method2935(local47 - 1);
						if (local55.anInt6543 != -1 && local55.aBoolean477) {
							local73 = arg1[arg3 + 1][arg10 + 1];
							local89 = arg11[arg3 + 1][arg10 + 1] * 2 & 0x7;
							local94 = Static201.method3718(local55, arg8);
							if (Static298.aBooleanArrayArray4[local73][local89]) {
								Static192.anIntArray524[4] = local55.anInt6543;
								Static294.anIntArray813[4] = local94;
								Static57.anIntArray219[4] = arg8.method5393() ? local55.anInt6539 : local55.anInt6542;
								Static350.anIntArray838[4] = local55.anInt6547;
								Static87.anIntArray719[4] = local55.anInt6551;
								Static342.anIntArray827[4] = 128;
							}
						}
					}
				}
			}
			@Pc(522) int local522;
			@Pc(527) int local527;
			@Pc(529) int local529;
			@Pc(511) byte local511;
			if (arg10 > 0) {
				local47 = arg5[arg3][arg10 - 1] & 0xFF;
				if (local47 > 0) {
					local55 = Static146.method2935(local47 - 1);
					if (local55.anInt6543 != -1) {
						local73 = arg1[arg3][arg10 - 1];
						local511 = arg11[arg3][arg10 - 1];
						if (local55.aBoolean477) {
							local94 = 2;
							local522 = local511 * 2 + 4;
							local527 = Static201.method3718(local55, arg8);
							for (local529 = 0; local529 < 3; local529++) {
								local522 &= 0x7;
								local94 &= 0x7;
								if (Static298.aBooleanArrayArray4[local73][local522] && local55.anInt6551 >= Static87.anIntArray719[local94]) {
									Static192.anIntArray524[local94] = local55.anInt6543;
									Static294.anIntArray813[local94] = local527;
									Static57.anIntArray219[local94] = arg8.method5393() ? local55.anInt6539 : local55.anInt6542;
									Static350.anIntArray838[local94] = local55.anInt6547;
									if (local55.anInt6551 == Static87.anIntArray719[local94]) {
										Static342.anIntArray827[local94] |= 0x20;
									} else {
										Static342.anIntArray827[local94] = 32;
									}
									Static87.anIntArray719[local94] = local55.anInt6551;
								}
								local94--;
								local522++;
							}
							if (!local28[arg7 & 0x3]) {
								arg9[0] = Static292.aBooleanArrayArray3[local73][local511 + 2 & 0x3];
							}
						} else if (!local28[arg7 & 0x3]) {
							arg9[0] = Static344.aBooleanArrayArray5[local73][local511 + 2 & 0x3];
						}
					}
				}
			}
			if (arg10 < arg6 - 1) {
				local47 = arg5[arg3][arg10 + 1] & 0xFF;
				if (local47 > 0) {
					local55 = Static146.method2935(local47 - 1);
					if (local55.anInt6543 != -1) {
						local73 = arg1[arg3][arg10 + 1];
						local511 = arg11[arg3][arg10 + 1];
						if (local55.aBoolean477) {
							local94 = 4;
							local522 = local511 * 2 + 2;
							local527 = Static201.method3718(local55, arg8);
							for (local529 = 0; local529 < 3; local529++) {
								local522 &= 0x7;
								local94 &= 0x7;
								if (Static298.aBooleanArrayArray4[local73][local522] && local55.anInt6551 >= Static87.anIntArray719[local94]) {
									Static192.anIntArray524[local94] = local55.anInt6543;
									Static294.anIntArray813[local94] = local527;
									Static57.anIntArray219[local94] = arg8.method5393() ? local55.anInt6539 : local55.anInt6542;
									Static350.anIntArray838[local94] = local55.anInt6547;
									if (local55.anInt6551 == Static87.anIntArray719[local94]) {
										Static342.anIntArray827[local94] |= 0x10;
									} else {
										Static342.anIntArray827[local94] = 16;
									}
									Static87.anIntArray719[local94] = local55.anInt6551;
								}
								local94++;
								local522--;
							}
							if (!local28[arg7 + 2 & 0x3]) {
								arg9[2] = Static292.aBooleanArrayArray3[local73][local511 & 0x3];
							}
						} else if (!local28[arg7 + 2 & 0x3]) {
							arg9[2] = Static344.aBooleanArrayArray5[local73][local511 & 0x3];
						}
					}
				}
			}
			if (arg3 > 0) {
				local47 = arg5[arg3 - 1][arg10] & 0xFF;
				if (local47 > 0) {
					local55 = Static146.method2935(local47 - 1);
					if (local55.anInt6543 != -1) {
						local73 = arg1[arg3 - 1][arg10];
						local511 = arg11[arg3 - 1][arg10];
						if (local55.aBoolean477) {
							local94 = 6;
							local522 = local511 * 2 + 4;
							local527 = Static201.method3718(local55, arg8);
							for (local529 = 0; local529 < 3; local529++) {
								local522 &= 0x7;
								local94 &= 0x7;
								if (Static298.aBooleanArrayArray4[local73][local522] && Static87.anIntArray719[local94] <= local55.anInt6551) {
									Static192.anIntArray524[local94] = local55.anInt6543;
									Static294.anIntArray813[local94] = local527;
									Static57.anIntArray219[local94] = arg8.method5393() ? local55.anInt6539 : local55.anInt6542;
									Static350.anIntArray838[local94] = local55.anInt6547;
									if (local55.anInt6551 == Static87.anIntArray719[local94]) {
										Static342.anIntArray827[local94] |= 0x8;
									} else {
										Static342.anIntArray827[local94] = 8;
									}
									Static87.anIntArray719[local94] = local55.anInt6551;
								}
								local522--;
								local94++;
							}
							if (!local28[arg7 + 3 & 0x3]) {
								arg9[3] = Static292.aBooleanArrayArray3[local73][local511 + 1 & 0x3];
							}
						} else if (!local28[arg7 + 3 & 0x3]) {
							arg9[3] = Static344.aBooleanArrayArray5[local73][local511 + 1 & 0x3];
						}
					}
				}
			}
			if (arg3 < arg0 - 1) {
				local47 = arg5[arg3 + 1][arg10] & 0xFF;
				if (local47 > 0) {
					local55 = Static146.method2935(local47 - 1);
					if (local55.anInt6543 != -1) {
						local73 = arg1[arg3 + 1][arg10];
						local511 = arg11[arg3 + 1][arg10];
						if (local55.aBoolean477) {
							local94 = 4;
							local522 = local511 * 2 + 6;
							local527 = Static201.method3718(local55, arg8);
							for (local529 = 0; local529 < 3; local529++) {
								local94 &= 0x7;
								local522 &= 0x7;
								if (Static298.aBooleanArrayArray4[local73][local522] && local55.anInt6551 >= Static87.anIntArray719[local94]) {
									Static192.anIntArray524[local94] = local55.anInt6543;
									Static294.anIntArray813[local94] = local527;
									Static57.anIntArray219[local94] = arg8.method5393() ? local55.anInt6539 : local55.anInt6542;
									Static350.anIntArray838[local94] = local55.anInt6547;
									if (Static87.anIntArray719[local94] == local55.anInt6551) {
										Static342.anIntArray827[local94] |= 0x4;
									} else {
										Static342.anIntArray827[local94] = 4;
									}
									Static87.anIntArray719[local94] = local55.anInt6551;
								}
								local94--;
								local522++;
							}
							if (!local28[arg7 + 1 & 0x3]) {
								arg9[1] = Static292.aBooleanArrayArray3[local73][local511 + 3 & 0x3];
							}
						} else if (!local28[arg7 + 1 & 0x3]) {
							arg9[1] = Static344.aBooleanArrayArray5[local73][local511 + 3 & 0x3];
						}
					}
				}
			}
		}
		if (arg2 == null) {
			return;
		}
		@Pc(1234) int local1234 = Static201.method3718(arg2, arg8);
		if (!arg2.aBoolean477) {
			return;
		}
		for (local47 = 0; local47 < 8; local47++) {
			@Pc(1249) int local1249 = local47 - arg7 * 2 & 0x7;
			if (Static298.aBooleanArrayArray4[arg4][local47] && Static87.anIntArray719[local1249] <= arg2.anInt6551) {
				Static192.anIntArray524[local1249] = arg2.anInt6543;
				Static294.anIntArray813[local1249] = local1234;
				Static57.anIntArray219[local1249] = arg8.method5393() ? arg2.anInt6539 : arg2.anInt6542;
				Static350.anIntArray838[local1249] = arg2.anInt6547;
				if (Static87.anIntArray719[local1249] == arg2.anInt6551) {
					Static342.anIntArray827[local1249] |= 0x2;
				} else {
					Static342.anIntArray827[local1249] = 2;
				}
				Static87.anIntArray719[local1249] = arg2.anInt6551;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILclient!pe;)V")
	public static void method5510(@OriginalArg(1) Class89 arg0) {
		if (Static225.anInt4490 != Static168.anInt3508 && (Static229.aClass49ArrayArrayArray6 != null && Static339.method5511(Static168.anInt3508, arg0))) {
			Static225.anInt4490 = Static168.anInt3508;
		}
	}
}
