import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
	public static int anInt6344;

	@OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
	public static int anInt6346;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(I[[B[[BIILclient!cf;[Z[[BILclient!qn;IIILclient!uo;)V")
	public static void method5427(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class34 arg4, @OriginalArg(6) boolean[] arg5, @OriginalArg(7) byte[][] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class167 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class129 arg12) {
		@Pc(52) int local52;
		if (arg4 != null && arg8 != null || arg8 != null && arg3 == 12 || arg4 != null && arg3 == 0) {
			@Pc(33) boolean[] local33 = arg4 != null && arg4.aBoolean38 ? Static184.aBooleanArrayArray5[arg3] : Static44.aBooleanArrayArray2[arg3];
			@Pc(60) Class34 local60;
			@Pc(77) byte local77;
			@Pc(94) int local94;
			@Pc(99) int local99;
			if (arg9 > 0) {
				if (arg0 > 0) {
					local52 = arg6[arg0 - 1][arg9 - 1] & 0xFF;
					if (local52 > 0) {
						local60 = Static59.method892(local52 - 1);
						if (local60.anInt684 != -1 && local60.aBoolean38) {
							local77 = arg2[arg0 - 1][arg9 - 1];
							local94 = arg1[arg0 - 1][arg9 - 1] * 2 + 4 & 0x7;
							local99 = Static147.method2250(arg12, local60);
							if (Static286.aBooleanArrayArray7[local77][local94]) {
								Static99.anIntArray61[0] = local60.anInt684;
								Static124.anIntArray164[0] = local99;
								Static272.anIntArray398[0] = arg12.method4927() ? local60.anInt686 : local60.anInt690;
								Static113.anIntArray156[0] = local60.anInt692;
								Static36.anIntArray50[0] = local60.anInt682;
								Static218.anIntArray200[0] = 256;
							}
						}
					}
				}
				if (arg0 < arg7 - 1) {
					local52 = arg6[arg0 + 1][arg9 - 1] & 0xFF;
					if (local52 > 0) {
						local60 = Static59.method892(local52 - 1);
						if (local60.anInt684 != -1 && local60.aBoolean38) {
							local77 = arg2[arg0 + 1][arg9 - 1];
							local94 = arg1[arg0 + 1][arg9 - 1] * 2 + 6 & 0x7;
							local99 = Static147.method2250(arg12, local60);
							if (Static286.aBooleanArrayArray7[local77][local94]) {
								Static99.anIntArray61[2] = local60.anInt684;
								Static124.anIntArray164[2] = local99;
								Static272.anIntArray398[2] = arg12.method4927() ? local60.anInt686 : local60.anInt690;
								Static113.anIntArray156[2] = local60.anInt692;
								Static36.anIntArray50[2] = local60.anInt682;
								Static218.anIntArray200[2] = 512;
							}
						}
					}
				}
			}
			if (arg9 < arg11 - 1) {
				if (arg0 > 0) {
					local52 = arg6[arg0 - 1][arg9 + 1] & 0xFF;
					if (local52 > 0) {
						local60 = Static59.method892(local52 - 1);
						if (local60.anInt684 != -1 && local60.aBoolean38) {
							local77 = arg2[arg0 - 1][arg9 + 1];
							local94 = arg1[arg0 - 1][arg9 + 1] * 2 + 2 & 0x7;
							local99 = Static147.method2250(arg12, local60);
							if (Static286.aBooleanArrayArray7[local77][local94]) {
								Static99.anIntArray61[6] = local60.anInt684;
								Static124.anIntArray164[6] = local99;
								Static272.anIntArray398[6] = arg12.method4927() ? local60.anInt686 : local60.anInt690;
								Static113.anIntArray156[6] = local60.anInt692;
								Static36.anIntArray50[6] = local60.anInt682;
								Static218.anIntArray200[6] = 64;
							}
						}
					}
				}
				if (arg7 - 1 > arg0) {
					local52 = arg6[arg0 + 1][arg9 + 1] & 0xFF;
					if (local52 > 0) {
						local60 = Static59.method892(local52 - 1);
						if (local60.anInt684 != -1 && local60.aBoolean38) {
							local77 = arg2[arg0 + 1][arg9 + 1];
							local94 = --(arg1[arg0 + 1][arg9 + 1] * 2) & 0x7;
							local99 = Static147.method2250(arg12, local60);
							if (Static286.aBooleanArrayArray7[local77][local94]) {
								Static99.anIntArray61[4] = local60.anInt684;
								Static124.anIntArray164[4] = local99;
								Static272.anIntArray398[4] = arg12.method4927() ? local60.anInt686 : local60.anInt690;
								Static113.anIntArray156[4] = local60.anInt692;
								Static36.anIntArray50[4] = local60.anInt682;
								Static218.anIntArray200[4] = 128;
							}
						}
					}
				}
			}
			@Pc(538) int local538;
			@Pc(543) int local543;
			@Pc(545) int local545;
			@Pc(505) byte local505;
			if (arg9 > 0) {
				local52 = arg6[arg0][arg9 - 1] & 0xFF;
				if (local52 > 0) {
					local60 = Static59.method892(local52 - 1);
					if (local60.anInt684 != -1) {
						local77 = arg2[arg0][arg9 - 1];
						local505 = arg1[arg0][arg9 - 1];
						if (local60.aBoolean38) {
							local99 = 2;
							local538 = local505 * 2 + 4;
							local543 = Static147.method2250(arg12, local60);
							for (local545 = 0; local545 < 3; local545++) {
								local99 &= 0x7;
								local538 &= 0x7;
								if (Static286.aBooleanArrayArray7[local77][local538] && Static36.anIntArray50[local99] <= local60.anInt682) {
									Static99.anIntArray61[local99] = local60.anInt684;
									Static124.anIntArray164[local99] = local543;
									Static272.anIntArray398[local99] = arg12.method4927() ? local60.anInt686 : local60.anInt690;
									Static113.anIntArray156[local99] = local60.anInt692;
									if (local60.anInt682 == Static36.anIntArray50[local99]) {
										Static218.anIntArray200[local99] |= 0x20;
									} else {
										Static218.anIntArray200[local99] = 32;
									}
									Static36.anIntArray50[local99] = local60.anInt682;
								}
								local99--;
								local538++;
							}
							if (!local33[arg10 & 0x3]) {
								arg5[0] = Static184.aBooleanArrayArray5[local77][local505 + 2 & 0x3];
							}
						} else if (!local33[arg10 & 0x3]) {
							arg5[0] = Static44.aBooleanArrayArray2[local77][local505 + 2 & 0x3];
						}
					}
				}
			}
			if (arg11 - 1 > arg9) {
				local52 = arg6[arg0][arg9 + 1] & 0xFF;
				if (local52 > 0) {
					local60 = Static59.method892(local52 - 1);
					if (local60.anInt684 != -1) {
						local77 = arg2[arg0][arg9 + 1];
						local505 = arg1[arg0][arg9 + 1];
						if (local60.aBoolean38) {
							local99 = 4;
							local538 = local505 * 2 + 2;
							local543 = Static147.method2250(arg12, local60);
							for (local545 = 0; local545 < 3; local545++) {
								local538 &= 0x7;
								local99 &= 0x7;
								if (Static286.aBooleanArrayArray7[local77][local538] && Static36.anIntArray50[local99] <= local60.anInt682) {
									Static99.anIntArray61[local99] = local60.anInt684;
									Static124.anIntArray164[local99] = local543;
									Static272.anIntArray398[local99] = arg12.method4927() ? local60.anInt686 : local60.anInt690;
									Static113.anIntArray156[local99] = local60.anInt692;
									if (Static36.anIntArray50[local99] == local60.anInt682) {
										Static218.anIntArray200[local99] |= 0x10;
									} else {
										Static218.anIntArray200[local99] = 16;
									}
									Static36.anIntArray50[local99] = local60.anInt682;
								}
								local99++;
								local538--;
							}
							if (!local33[arg10 + 2 & 0x3]) {
								arg5[2] = Static184.aBooleanArrayArray5[local77][local505 & 0x3];
							}
						} else if (!local33[arg10 + 2 & 0x3]) {
							arg5[2] = Static44.aBooleanArrayArray2[local77][local505 & 0x3];
						}
					}
				}
			}
			if (arg0 > 0) {
				local52 = arg6[arg0 - 1][arg9] & 0xFF;
				if (local52 > 0) {
					local60 = Static59.method892(local52 - 1);
					if (local60.anInt684 != -1) {
						local77 = arg2[arg0 - 1][arg9];
						local505 = arg1[arg0 - 1][arg9];
						if (local60.aBoolean38) {
							local99 = 6;
							local538 = local505 * 2 + 4;
							local543 = Static147.method2250(arg12, local60);
							for (local545 = 0; local545 < 3; local545++) {
								local538 &= 0x7;
								local99 &= 0x7;
								if (Static286.aBooleanArrayArray7[local77][local538] && local60.anInt682 >= Static36.anIntArray50[local99]) {
									Static99.anIntArray61[local99] = local60.anInt684;
									Static124.anIntArray164[local99] = local543;
									Static272.anIntArray398[local99] = arg12.method4927() ? local60.anInt686 : local60.anInt690;
									Static113.anIntArray156[local99] = local60.anInt692;
									if (local60.anInt682 == Static36.anIntArray50[local99]) {
										Static218.anIntArray200[local99] |= 0x8;
									} else {
										Static218.anIntArray200[local99] = 8;
									}
									Static36.anIntArray50[local99] = local60.anInt682;
								}
								local99++;
								local538--;
							}
							if (!local33[arg10 + 3 & 0x3]) {
								arg5[3] = Static184.aBooleanArrayArray5[local77][local505 + 1 & 0x3];
							}
						} else if (!local33[arg10 + 3 & 0x3]) {
							arg5[3] = Static44.aBooleanArrayArray2[local77][local505 + 1 & 0x3];
						}
					}
				}
			}
			if (arg7 - 1 > arg0) {
				local52 = arg6[arg0 + 1][arg9] & 0xFF;
				if (local52 > 0) {
					local60 = Static59.method892(local52 - 1);
					if (local60.anInt684 != -1) {
						local77 = arg2[arg0 + 1][arg9];
						local505 = arg1[arg0 + 1][arg9];
						if (local60.aBoolean38) {
							local99 = 4;
							local538 = local505 * 2 + 6;
							local543 = Static147.method2250(arg12, local60);
							for (local545 = 0; local545 < 3; local545++) {
								local538 &= 0x7;
								local99 &= 0x7;
								if (Static286.aBooleanArrayArray7[local77][local538] && Static36.anIntArray50[local99] <= local60.anInt682) {
									Static99.anIntArray61[local99] = local60.anInt684;
									Static124.anIntArray164[local99] = local543;
									Static272.anIntArray398[local99] = arg12.method4927() ? local60.anInt686 : local60.anInt690;
									Static113.anIntArray156[local99] = local60.anInt692;
									if (Static36.anIntArray50[local99] == local60.anInt682) {
										Static218.anIntArray200[local99] |= 0x4;
									} else {
										Static218.anIntArray200[local99] = 4;
									}
									Static36.anIntArray50[local99] = local60.anInt682;
								}
								local538++;
								local99--;
							}
							if (!local33[arg10 + 1 & 0x3]) {
								arg5[1] = Static184.aBooleanArrayArray5[local77][local505 + 3 & 0x3];
							}
						} else if (!local33[arg10 + 1 & 0x3]) {
							arg5[1] = Static44.aBooleanArrayArray2[local77][local505 + 3 & 0x3];
						}
					}
				}
			}
		}
		if (arg4 == null) {
			return;
		}
		@Pc(1225) int local1225 = Static147.method2250(arg12, arg4);
		if (!arg4.aBoolean38) {
			return;
		}
		for (local52 = 0; local52 < 8; local52++) {
			@Pc(1241) int local1241 = local52 - arg10 * 2 & 0x7;
			if (Static286.aBooleanArrayArray7[arg3][local52] && arg4.anInt682 >= Static36.anIntArray50[local1241]) {
				Static99.anIntArray61[local1241] = arg4.anInt684;
				Static124.anIntArray164[local1241] = local1225;
				Static272.anIntArray398[local1241] = arg12.method4927() ? arg4.anInt686 : arg4.anInt690;
				Static113.anIntArray156[local1241] = arg4.anInt692;
				if (Static36.anIntArray50[local1241] == arg4.anInt682) {
					Static218.anIntArray200[local1241] |= 0x2;
				} else {
					Static218.anIntArray200[local1241] = 2;
				}
				Static36.anIntArray50[local1241] = arg4.anInt682;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZBLclient!ms;)V")
	public static void method5429(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class137 arg1) {
		@Pc(12) int local12 = arg1.anInt4105 == 0 ? arg1.anInt4060 : arg1.anInt4105;
		@Pc(21) int local21 = arg1.anInt4079 == 0 ? arg1.anInt4110 : arg1.anInt4079;
		Static2.method6(local12, arg1.anInt4044, local21, Static188.aClass137ArrayArray1[arg1.anInt4044 >> 16], arg0);
		if (arg1.aClass137Array2 != null) {
			Static2.method6(local12, arg1.anInt4044, local21, arg1.aClass137Array2, arg0);
		}
		@Pc(62) Class11_Sub41 local62 = (Class11_Sub41) Static197.aClass58_18.method1009((long) arg1.anInt4044);
		if (local62 != null) {
			Static306.method5146(arg0, local21, local62.anInt6364, local12);
		}
	}
}
