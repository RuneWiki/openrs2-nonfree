import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!hf", name = "L", descriptor = "I")
	public static int anInt2563;

	@OriginalMember(owner = "client!hf", name = "Q", descriptor = "Lclient!eb;")
	public static final Class42 aClass42_14 = new Class42();

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIILclient!rc;Lclient!fp;I[[BI[ZLclient!sf;[[B[[B)V")
	public static void method2458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class180 arg5, @OriginalArg(6) Class63 arg6, @OriginalArg(8) byte[][] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean[] arg9, @OriginalArg(11) Class189 arg10, @OriginalArg(12) byte[][] arg11, @OriginalArg(13) byte[][] arg12) {
		@Pc(43) int local43;
		if (arg5 != null && arg10 != null || arg10 != null && arg0 == 12 || arg5 != null && arg0 == 0) {
			@Pc(27) boolean[] local27 = arg5 != null && arg5.aBoolean403 ? Static191.aBooleanArrayArray9[arg0] : Static83.aBooleanArrayArray3[arg0];
			@Pc(54) Class180 local54;
			@Pc(72) byte local72;
			@Pc(88) int local88;
			@Pc(93) int local93;
			if (arg3 > 0) {
				if (arg8 > 0) {
					local43 = arg7[arg8 - 1][arg3 - 1] & 0xFF;
					if (local43 > 0) {
						local54 = Static201.method3743(local43 - 1);
						if (local54.anInt5293 != -1 && local54.aBoolean403) {
							local72 = arg11[arg8 - 1][arg3 - 1];
							local88 = arg12[arg8 - 1][arg3 - 1] * 2 + 4 & 0x7;
							local93 = Static225.method4171(local54, arg6);
							if (Static214.aBooleanArrayArray7[local72][local88]) {
								Static293.anIntArray384[0] = local54.anInt5293;
								Static197.anIntArray306[0] = local93;
								Static222.anIntArray370[0] = arg6.method4598() ? local54.anInt5286 : local54.anInt5289;
								Static56.anIntArray118[0] = local54.anInt5284;
								Static5.anIntArray20[0] = local54.anInt5288;
								Static155.anIntArray231[0] = 256;
							}
						}
					}
				}
				if (arg1 - 1 > arg8) {
					local43 = arg7[arg8 + 1][arg3 - 1] & 0xFF;
					if (local43 > 0) {
						local54 = Static201.method3743(local43 - 1);
						if (local54.anInt5293 != -1 && local54.aBoolean403) {
							local72 = arg11[arg8 + 1][arg3 - 1];
							local88 = arg12[arg8 + 1][arg3 - 1] * 2 + 6 & 0x7;
							local93 = Static225.method4171(local54, arg6);
							if (Static214.aBooleanArrayArray7[local72][local88]) {
								Static293.anIntArray384[2] = local54.anInt5293;
								Static197.anIntArray306[2] = local93;
								Static222.anIntArray370[2] = arg6.method4598() ? local54.anInt5286 : local54.anInt5289;
								Static56.anIntArray118[2] = local54.anInt5284;
								Static5.anIntArray20[2] = local54.anInt5288;
								Static155.anIntArray231[2] = 512;
							}
						}
					}
				}
			}
			if (arg3 < arg4 - 1) {
				if (arg8 > 0) {
					local43 = arg7[arg8 - 1][arg3 + 1] & 0xFF;
					if (local43 > 0) {
						local54 = Static201.method3743(local43 - 1);
						if (local54.anInt5293 != -1 && local54.aBoolean403) {
							local72 = arg11[arg8 - 1][arg3 + 1];
							local88 = arg12[arg8 - 1][arg3 + 1] * 2 + 2 & 0x7;
							local93 = Static225.method4171(local54, arg6);
							if (Static214.aBooleanArrayArray7[local72][local88]) {
								Static293.anIntArray384[6] = local54.anInt5293;
								Static197.anIntArray306[6] = local93;
								Static222.anIntArray370[6] = arg6.method4598() ? local54.anInt5286 : local54.anInt5289;
								Static56.anIntArray118[6] = local54.anInt5284;
								Static5.anIntArray20[6] = local54.anInt5288;
								Static155.anIntArray231[6] = 64;
							}
						}
					}
				}
				if (arg1 - 1 > arg8) {
					local43 = arg7[arg8 + 1][arg3 + 1] & 0xFF;
					if (local43 > 0) {
						local54 = Static201.method3743(local43 - 1);
						if (local54.anInt5293 != -1 && local54.aBoolean403) {
							local72 = arg11[arg8 + 1][arg3 + 1];
							local88 = arg12[arg8 + 1][arg3 + 1] * 2 & 0x7;
							local93 = Static225.method4171(local54, arg6);
							if (Static214.aBooleanArrayArray7[local72][local88]) {
								Static293.anIntArray384[4] = local54.anInt5293;
								Static197.anIntArray306[4] = local93;
								Static222.anIntArray370[4] = arg6.method4598() ? local54.anInt5286 : local54.anInt5289;
								Static56.anIntArray118[4] = local54.anInt5284;
								Static5.anIntArray20[4] = local54.anInt5288;
								Static155.anIntArray231[4] = 128;
							}
						}
					}
				}
			}
			@Pc(540) int local540;
			@Pc(545) int local545;
			@Pc(547) int local547;
			@Pc(506) byte local506;
			if (arg3 > 0) {
				local43 = arg7[arg8][arg3 - 1] & 0xFF;
				if (local43 > 0) {
					local54 = Static201.method3743(local43 - 1);
					if (local54.anInt5293 != -1) {
						local72 = arg11[arg8][arg3 - 1];
						local506 = arg12[arg8][arg3 - 1];
						if (local54.aBoolean403) {
							local93 = 2;
							local540 = local506 * 2 + 4;
							local545 = Static225.method4171(local54, arg6);
							for (local547 = 0; local547 < 3; local547++) {
								local93 &= 0x7;
								local540 &= 0x7;
								if (Static214.aBooleanArrayArray7[local72][local540] && Static5.anIntArray20[local93] <= local54.anInt5288) {
									Static293.anIntArray384[local93] = local54.anInt5293;
									Static197.anIntArray306[local93] = local545;
									Static222.anIntArray370[local93] = arg6.method4598() ? local54.anInt5286 : local54.anInt5289;
									Static56.anIntArray118[local93] = local54.anInt5284;
									if (Static5.anIntArray20[local93] == local54.anInt5288) {
										Static155.anIntArray231[local93] |= 0x20;
									} else {
										Static155.anIntArray231[local93] = 32;
									}
									Static5.anIntArray20[local93] = local54.anInt5288;
								}
								local93--;
								local540++;
							}
							if (!local27[arg2 & 0x3]) {
								arg9[0] = Static191.aBooleanArrayArray9[local72][local506 + 2 & 0x3];
							}
						} else if (!local27[--arg2 & 0x3]) {
							arg9[0] = Static83.aBooleanArrayArray3[local72][local506 + 2 & 0x3];
						}
					}
				}
			}
			if (arg4 - 1 > arg3) {
				local43 = arg7[arg8][arg3 + 1] & 0xFF;
				if (local43 > 0) {
					local54 = Static201.method3743(local43 - 1);
					if (local54.anInt5293 != -1) {
						local72 = arg11[arg8][arg3 + 1];
						local506 = arg12[arg8][arg3 + 1];
						if (local54.aBoolean403) {
							local93 = 4;
							local540 = local506 * 2 + 2;
							local545 = Static225.method4171(local54, arg6);
							for (local547 = 0; local547 < 3; local547++) {
								local93 &= 0x7;
								local540 &= 0x7;
								if (Static214.aBooleanArrayArray7[local72][local540] && Static5.anIntArray20[local93] <= local54.anInt5288) {
									Static293.anIntArray384[local93] = local54.anInt5293;
									Static197.anIntArray306[local93] = local545;
									Static222.anIntArray370[local93] = arg6.method4598() ? local54.anInt5286 : local54.anInt5289;
									Static56.anIntArray118[local93] = local54.anInt5284;
									if (Static5.anIntArray20[local93] == local54.anInt5288) {
										Static155.anIntArray231[local93] |= 0x10;
									} else {
										Static155.anIntArray231[local93] = 16;
									}
									Static5.anIntArray20[local93] = local54.anInt5288;
								}
								local93++;
								local540--;
							}
							if (!local27[arg2 + 2 & 0x3]) {
								arg9[2] = Static191.aBooleanArrayArray9[local72][local506 & 0x3];
							}
						} else if (!local27[arg2 + 2 & 0x3]) {
							arg9[2] = Static83.aBooleanArrayArray3[local72][local506 & 0x3];
						}
					}
				}
			}
			if (arg8 > 0) {
				local43 = arg7[arg8 - 1][arg3] & 0xFF;
				if (local43 > 0) {
					local54 = Static201.method3743(local43 - 1);
					if (local54.anInt5293 != -1) {
						local72 = arg11[arg8 - 1][arg3];
						local506 = arg12[arg8 - 1][arg3];
						if (local54.aBoolean403) {
							local93 = 6;
							local540 = local506 * 2 + 4;
							local545 = Static225.method4171(local54, arg6);
							for (local547 = 0; local547 < 3; local547++) {
								local93 &= 0x7;
								local540 &= 0x7;
								if (Static214.aBooleanArrayArray7[local72][local540] && Static5.anIntArray20[local93] <= local54.anInt5288) {
									Static293.anIntArray384[local93] = local54.anInt5293;
									Static197.anIntArray306[local93] = local545;
									Static222.anIntArray370[local93] = arg6.method4598() ? local54.anInt5286 : local54.anInt5289;
									Static56.anIntArray118[local93] = local54.anInt5284;
									if (local54.anInt5288 == Static5.anIntArray20[local93]) {
										Static155.anIntArray231[local93] |= 0x8;
									} else {
										Static155.anIntArray231[local93] = 8;
									}
									Static5.anIntArray20[local93] = local54.anInt5288;
								}
								local540--;
								local93++;
							}
							if (!local27[arg2 + 3 & 0x3]) {
								arg9[3] = Static191.aBooleanArrayArray9[local72][local506 + 1 & 0x3];
							}
						} else if (!local27[arg2 + 3 & 0x3]) {
							arg9[3] = Static83.aBooleanArrayArray3[local72][local506 + 1 & 0x3];
						}
					}
				}
			}
			if (arg1 - 1 > arg8) {
				local43 = arg7[arg8 + 1][arg3] & 0xFF;
				if (local43 > 0) {
					local54 = Static201.method3743(local43 - 1);
					if (local54.anInt5293 != -1) {
						local72 = arg11[arg8 + 1][arg3];
						local506 = arg12[arg8 + 1][arg3];
						if (local54.aBoolean403) {
							local93 = 4;
							local540 = local506 * 2 + 6;
							local545 = Static225.method4171(local54, arg6);
							for (local547 = 0; local547 < 3; local547++) {
								local540 &= 0x7;
								local93 &= 0x7;
								if (Static214.aBooleanArrayArray7[local72][local540] && local54.anInt5288 >= Static5.anIntArray20[local93]) {
									Static293.anIntArray384[local93] = local54.anInt5293;
									Static197.anIntArray306[local93] = local545;
									Static222.anIntArray370[local93] = arg6.method4598() ? local54.anInt5286 : local54.anInt5289;
									Static56.anIntArray118[local93] = local54.anInt5284;
									if (local54.anInt5288 == Static5.anIntArray20[local93]) {
										Static155.anIntArray231[local93] |= 0x4;
									} else {
										Static155.anIntArray231[local93] = 4;
									}
									Static5.anIntArray20[local93] = local54.anInt5288;
								}
								local540++;
								local93--;
							}
							if (!local27[arg2 + 1 & 0x3]) {
								arg9[1] = Static191.aBooleanArrayArray9[local72][local506 + 3 & 0x3];
							}
						} else if (!local27[arg2 + 1 & 0x3]) {
							arg9[1] = Static83.aBooleanArrayArray3[local72][local506 + 3 & 0x3];
						}
					}
				}
			}
		}
		if (arg5 == null) {
			return;
		}
		@Pc(1223) int local1223 = Static225.method4171(arg5, arg6);
		if (!arg5.aBoolean403) {
			return;
		}
		for (local43 = 0; local43 < 8; local43++) {
			@Pc(1238) int local1238 = local43 - arg2 * 2 & 0x7;
			if (Static214.aBooleanArrayArray7[arg0][local43] && arg5.anInt5288 >= Static5.anIntArray20[local1238]) {
				Static293.anIntArray384[local1238] = arg5.anInt5293;
				Static197.anIntArray306[local1238] = local1223;
				Static222.anIntArray370[local1238] = arg6.method4598() ? arg5.anInt5286 : arg5.anInt5289;
				Static56.anIntArray118[local1238] = arg5.anInt5284;
				if (arg5.anInt5288 == Static5.anIntArray20[local1238]) {
					Static155.anIntArray231[local1238] |= 0x2;
				} else {
					Static155.anIntArray231[local1238] = 2;
				}
				Static5.anIntArray20[local1238] = arg5.anInt5288;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method2459(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + Static195.method3638("%0a", arg0, "\n"));
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(IB)Lclient!qm;")
	public static Class174 method2461(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if ((double) Static269.aFloat26 == 3.0D) {
				return Static164.aClass174_9;
			}
			if ((double) Static269.aFloat26 == 4.0D) {
				return Static21.aClass174_4;
			}
			if ((double) Static269.aFloat26 == 6.0D) {
				return Static21.aClass174_3;
			}
			if ((double) Static269.aFloat26 >= 8.0D) {
				return Static286.aClass174_11;
			}
		} else if (arg0 == 1) {
			if ((double) Static269.aFloat26 == 3.0D) {
				return Static21.aClass174_3;
			}
			if ((double) Static269.aFloat26 == 4.0D) {
				return Static286.aClass174_11;
			}
			if ((double) Static269.aFloat26 == 6.0D) {
				return Static230.aClass174_8;
			}
			if ((double) Static269.aFloat26 >= 8.0D) {
				return Static175.aClass174_10;
			}
		} else if (arg0 == 2) {
			if ((double) Static269.aFloat26 == 3.0D) {
				return Static230.aClass174_8;
			}
			if ((double) Static269.aFloat26 == 4.0D) {
				return Static175.aClass174_10;
			}
			if ((double) Static269.aFloat26 == 6.0D) {
				return Static69.aClass174_6;
			}
			if ((double) Static269.aFloat26 >= 8.0D) {
				return Static331.aClass174_12;
			}
		}
		return null;
	}
}
