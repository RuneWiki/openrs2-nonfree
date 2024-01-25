import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!hw", name = "z", descriptor = "I")
	public static int anInt3845;

	@OriginalMember(owner = "client!hw", name = "F", descriptor = "I")
	public static int anInt3850 = 0;

	@OriginalMember(owner = "client!hw", name = "M", descriptor = "I")
	public static int anInt3855 = 0;

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(II)I")
	public static int method3439(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(I[[[Lclient!cq;ZIII)Z")
	public static boolean method3443(@OriginalArg(0) int arg0, @OriginalArg(1) Class53[][][] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(14) byte local14 = arg2 ? 1 : (byte) (anInt3850 & 0xFF);
		if (Static483.aByteArrayArrayArray18[Static13.anInt231][arg3][arg0] == local14) {
			return false;
		} else if ((Static262.aByteArrayArrayArray16[Static13.anInt231][arg3][arg0] & 0x4) == 0) {
			return false;
		} else {
			@Pc(46) byte local46 = 0;
			Static319.anIntArray2[0] = arg3;
			@Pc(52) int local52 = 0;
			@Pc(55) int local55 = local46 + 1;
			Static427.anIntArray421[0] = arg0;
			Static483.aByteArrayArrayArray18[Static13.anInt231][arg3][arg0] = local14;
			while (local52 != local55) {
				@Pc(73) int local73 = Static319.anIntArray2[local52] & 0xFFFF;
				@Pc(81) int local81 = Static319.anIntArray2[local52] >> 16 & 0xFF;
				@Pc(89) int local89 = Static319.anIntArray2[local52] >> 24 & 0xFF;
				@Pc(95) int local95 = Static427.anIntArray421[local52] & 0xFFFF;
				@Pc(103) int local103 = Static427.anIntArray421[local52] >> 16 & 0xFF;
				local52 = local52 + 1 & 0xFFF;
				@Pc(111) boolean local111 = false;
				if ((Static262.aByteArrayArrayArray16[Static13.anInt231][local73][local95] & 0x4) == 0) {
					local111 = true;
				}
				@Pc(128) boolean local128 = false;
				@Pc(167) int local167;
				@Pc(206) int local206;
				label231: for (@Pc(132) int local132 = Static13.anInt231 + 1; local132 <= 3; local132++) {
					if ((Static262.aByteArrayArrayArray16[local132][local73][local95] & 0x8) == 0) {
						@Pc(305) Class1_Sub4_Sub2 local305;
						@Pc(315) int local315;
						@Pc(294) Class53 local294;
						@Pc(300) Class289 local300;
						if (local111 && arg1[local132][local73][local95] != null) {
							if (arg1[local132][local73][local95].aClass1_Sub4_Sub5_2 != null) {
								local167 = Static235.method3775(local81);
								if (arg1[local132][local73][local95].aClass1_Sub4_Sub5_2.aShort92 == local167 || arg1[local132][local73][local95].aClass1_Sub4_Sub5_1 != null && local167 == arg1[local132][local73][local95].aClass1_Sub4_Sub5_1.aShort92) {
									continue;
								}
								if (local89 != 0) {
									local206 = Static235.method3775(local89);
									if (local206 == arg1[local132][local73][local95].aClass1_Sub4_Sub5_2.aShort92 || arg1[local132][local73][local95].aClass1_Sub4_Sub5_1 != null && arg1[local132][local73][local95].aClass1_Sub4_Sub5_1.aShort92 == local206) {
										continue;
									}
								}
								if (local103 != 0) {
									local206 = Static235.method3775(local103);
									if (arg1[local132][local73][local95].aClass1_Sub4_Sub5_2.aShort92 == local206 || arg1[local132][local73][local95].aClass1_Sub4_Sub5_1 != null && local206 == arg1[local132][local73][local95].aClass1_Sub4_Sub5_1.aShort92) {
										continue;
									}
								}
							}
							local294 = arg1[local132][local73][local95];
							if (local294.aClass289_1 != null) {
								for (local300 = local294.aClass289_1; local300 != null; local300 = local300.aClass289_3) {
									local305 = local300.aClass1_Sub4_Sub2_1;
									if (local305 instanceof Interface19) {
										@Pc(311) Interface19 local311 = (Interface19) local305;
										local315 = local311.method7825();
										@Pc(319) int local319 = local311.method7829();
										if (local315 == 21) {
											local315 = 19;
										}
										@Pc(330) int local330 = local315 | local319 << 6;
										if (local330 == local81 || local89 != 0 && local330 == local89 || local103 != 0 && local103 == local330) {
											continue label231;
										}
									}
								}
							}
						}
						local294 = arg1[local132][local73][local95];
						if (local294 != null && local294.aClass289_1 != null) {
							for (local300 = local294.aClass289_1; local300 != null; local300 = local300.aClass289_3) {
								local305 = local300.aClass1_Sub4_Sub2_1;
								if (local305.aShort121 != local305.aShort122 || local305.aShort119 != local305.aShort120) {
									for (@Pc(400) int local400 = local305.aShort121; local400 <= local305.aShort122; local400++) {
										for (local315 = local305.aShort120; local315 <= local305.aShort119; local315++) {
											Static483.aByteArrayArrayArray18[local132][local400][local315] = local14;
										}
									}
								}
							}
						}
						Static483.aByteArrayArrayArray18[local132][local73][local95] = local14;
						local128 = true;
					}
				}
				if (local128) {
					local167 = Static499.aClass83Array3[Static13.anInt231 + 1].method7217(local95, local73);
					if (Static207.anIntArray189[arg4] < local167) {
						Static207.anIntArray189[arg4] = local167;
					}
					local206 = local73 << 9;
					if (Static87.anIntArray85[arg4] > local206) {
						Static87.anIntArray85[arg4] = local206;
					} else if (local206 > Static50.anIntArray28[arg4]) {
						Static50.anIntArray28[arg4] = local206;
					}
					@Pc(509) int local509 = local95 << 9;
					if (Static434.anIntArray425[arg4] > local509) {
						Static434.anIntArray425[arg4] = local509;
					} else if (Static126.anIntArray130[arg4] < local509) {
						Static126.anIntArray130[arg4] = local509;
					}
				}
				if (!local111) {
					if (local73 >= 1 && local14 != Static483.aByteArrayArrayArray18[Static13.anInt231][local73 - 1][local95]) {
						Static319.anIntArray2[local55] = local73 - 1 | 0x120000 | 0xD3000000;
						Static427.anIntArray421[local55] = local95 | 0x130000;
						local55 = local55 + 1 & 0xFFF;
						Static483.aByteArrayArrayArray18[Static13.anInt231][local73 - 1][local95] = local14;
					}
					local95++;
					if (Static119.anInt2717 > local95) {
						if (local73 - 1 >= 0 && Static483.aByteArrayArrayArray18[Static13.anInt231][local73 - 1][local95] != local14 && (Static262.aByteArrayArrayArray16[Static13.anInt231][local73][local95] & 0x4) == 0 && (Static262.aByteArrayArrayArray16[Static13.anInt231][local73 - 1][local95 - 1] & 0x4) == 0) {
							Static319.anIntArray2[local55] = local73 - 1 | 0x120000 | 0x52000000;
							Static427.anIntArray421[local55] = local95 | 0x130000;
							Static483.aByteArrayArrayArray18[Static13.anInt231][local73 - 1][local95] = local14;
							local55 = local55 + 1 & 0xFFF;
						}
						if (local14 != Static483.aByteArrayArrayArray18[Static13.anInt231][local73][local95]) {
							Static319.anIntArray2[local55] = local73 | 0x520000 | 0x13000000;
							Static427.anIntArray421[local55] = local95 | 0x530000;
							local55 = local55 + 1 & 0xFFF;
							Static483.aByteArrayArrayArray18[Static13.anInt231][local73][local95] = local14;
						}
						if (local73 + 1 < Static428.anInt8046 && Static483.aByteArrayArrayArray18[Static13.anInt231][local73 + 1][local95] != local14 && (Static262.aByteArrayArrayArray16[Static13.anInt231][local73][local95] & 0x4) == 0 && (Static262.aByteArrayArrayArray16[Static13.anInt231][local73 + 1][local95 - 1] & 0x4) == 0) {
							Static319.anIntArray2[local55] = 0x92000000 | 0x520000 | local73 + 1;
							Static427.anIntArray421[local55] = local95 | 0x530000;
							local55 = local55 + 1 & 0xFFF;
							Static483.aByteArrayArrayArray18[Static13.anInt231][local73 + 1][local95] = local14;
						}
					}
					local95--;
					if (Static428.anInt8046 > local73 + 1 && Static483.aByteArrayArrayArray18[Static13.anInt231][local73 + 1][local95] != local14) {
						Static319.anIntArray2[local55] = local73 + 1 | 0x53000000 | 0x920000;
						Static427.anIntArray421[local55] = local95 | 0x930000;
						local55 = local55 + 1 & 0xFFF;
						Static483.aByteArrayArrayArray18[Static13.anInt231][local73 + 1][local95] = local14;
					}
					local95--;
					if (local95 >= 0) {
						if (local73 - 1 >= 0 && Static483.aByteArrayArrayArray18[Static13.anInt231][local73 - 1][local95] != local14 && (Static262.aByteArrayArrayArray16[Static13.anInt231][local73][local95] & 0x4) == 0 && (Static262.aByteArrayArrayArray16[Static13.anInt231][local73 - 1][local95 + 1] & 0x4) == 0) {
							Static319.anIntArray2[local55] = 0x12000000 | 0xD20000 | local73 - 1;
							Static427.anIntArray421[local55] = local95 | 0xD30000;
							local55 = local55 + 1 & 0xFFF;
							Static483.aByteArrayArrayArray18[Static13.anInt231][local73 - 1][local95] = local14;
						}
						if (local14 != Static483.aByteArrayArrayArray18[Static13.anInt231][local73][local95]) {
							Static319.anIntArray2[local55] = local73 | 0xD20000 | 0x93000000;
							Static427.anIntArray421[local55] = local95 | 0xD30000;
							Static483.aByteArrayArrayArray18[Static13.anInt231][local73][local95] = local14;
							local55 = local55 + 1 & 0xFFF;
						}
						if (Static428.anInt8046 > local73 + 1 && Static483.aByteArrayArrayArray18[Static13.anInt231][local73 + 1][local95] != local14 && (Static262.aByteArrayArrayArray16[Static13.anInt231][local73][local95] & 0x4) == 0 && (Static262.aByteArrayArrayArray16[Static13.anInt231][local73 + 1][local95 + 1] & 0x4) == 0) {
							Static319.anIntArray2[local55] = local73 + 1 | 0x920000 | 0xD2000000;
							Static427.anIntArray421[local55] = local95 | 0x930000;
							local55 = local55 + 1 & 0xFFF;
							Static483.aByteArrayArrayArray18[Static13.anInt231][local73 + 1][local95] = local14;
						}
					}
				}
			}
			if (Static207.anIntArray189[arg4] != -1000000) {
				Static207.anIntArray189[arg4] += 40;
				Static87.anIntArray85[arg4] -= 512;
				Static50.anIntArray28[arg4] += 512;
				Static126.anIntArray130[arg4] += 512;
				Static434.anIntArray425[arg4] -= 512;
			}
			return true;
		}
	}
}
