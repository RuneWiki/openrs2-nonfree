import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "[I")
	public static final int[] anIntArray273 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray32 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "([[[Lclient!af;IIBZI)Z")
	public static boolean method1750(@OriginalArg(0) Class9[][][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(14) byte local14 = arg3 ? 1 : (byte) (Static43.anInt710 & 0xFF);
		if (local14 == Static393.aByteArrayArrayArray16[Static282.anInt4677][arg2][arg4]) {
			return false;
		} else if ((Static303.aByteArrayArrayArray13[Static282.anInt4677][arg2][arg4] & 0x4) == 0) {
			return false;
		} else {
			@Pc(42) byte local42 = 0;
			Static340.anIntArray528[0] = arg2;
			@Pc(53) int local53 = 0;
			@Pc(56) int local56 = local42 + 1;
			Static51.anIntArray57[0] = arg4;
			Static393.aByteArrayArrayArray16[Static282.anInt4677][arg2][arg4] = local14;
			while (local53 != local56) {
				@Pc(74) int local74 = Static340.anIntArray528[local53] & 0xFFFF;
				@Pc(82) int local82 = Static340.anIntArray528[local53] >> 16 & 0xFF;
				@Pc(90) int local90 = Static340.anIntArray528[local53] >> 24 & 0xFF;
				@Pc(96) int local96 = Static51.anIntArray57[local53] & 0xFFFF;
				@Pc(104) int local104 = Static51.anIntArray57[local53] >> 16 & 0xFF;
				local53 = local53 + 1 & 0xFFF;
				@Pc(112) boolean local112 = false;
				if ((Static303.aByteArrayArrayArray13[Static282.anInt4677][local74][local96] & 0x4) == 0) {
					local112 = true;
				}
				@Pc(126) boolean local126 = false;
				@Pc(165) int local165;
				@Pc(212) int local212;
				label231: for (@Pc(130) int local130 = Static282.anInt4677 + 1; local130 <= 3; local130++) {
					if ((Static303.aByteArrayArrayArray13[local130][local74][local96] & 0x8) == 0) {
						@Pc(314) Class29_Sub2 local314;
						@Pc(324) int local324;
						@Pc(303) Class9 local303;
						@Pc(309) Class66 local309;
						if (local112 && arg0[local130][local74][local96] != null) {
							if (arg0[local130][local74][local96].aClass29_Sub5_1 != null) {
								local165 = Static130.method1957(local82);
								if (arg0[local130][local74][local96].aClass29_Sub5_1.anInt7425 == local165 || arg0[local130][local74][local96].aClass29_Sub5_2 != null && local165 == arg0[local130][local74][local96].aClass29_Sub5_2.anInt7425) {
									continue;
								}
								if (local90 != 0) {
									local212 = Static130.method1957(local90);
									if (local212 == arg0[local130][local74][local96].aClass29_Sub5_1.anInt7425 || arg0[local130][local74][local96].aClass29_Sub5_2 != null && local212 == arg0[local130][local74][local96].aClass29_Sub5_2.anInt7425) {
										continue;
									}
								}
								if (local104 != 0) {
									local212 = Static130.method1957(local104);
									if (arg0[local130][local74][local96].aClass29_Sub5_1.anInt7425 == local212 || arg0[local130][local74][local96].aClass29_Sub5_2 != null && arg0[local130][local74][local96].aClass29_Sub5_2.anInt7425 == local212) {
										continue;
									}
								}
							}
							local303 = arg0[local130][local74][local96];
							if (local303.aClass66_1 != null) {
								for (local309 = local303.aClass66_1; local309 != null; local309 = local309.aClass66_2) {
									local314 = local309.aClass29_Sub2_1;
									if (local314 instanceof Interface6) {
										@Pc(320) Interface6 local320 = (Interface6) local314;
										local324 = local320.method7551();
										@Pc(328) int local328 = local320.method7553();
										if (local324 == 21) {
											local324 = 19;
										}
										@Pc(339) int local339 = local328 << 6 | local324;
										if (local82 == local339 || local90 != 0 && local90 == local339 || local104 != 0 && local339 == local104) {
											continue label231;
										}
									}
								}
							}
						}
						local303 = arg0[local130][local74][local96];
						if (local303 != null && local303.aClass66_1 != null) {
							for (local309 = local303.aClass66_1; local309 != null; local309 = local309.aClass66_2) {
								local314 = local309.aClass29_Sub2_1;
								if (local314.aShort122 != local314.aShort124 || local314.aShort121 != local314.aShort123) {
									for (@Pc(401) int local401 = local314.aShort122; local401 <= local314.aShort124; local401++) {
										for (local324 = local314.aShort121; local324 <= local314.aShort123; local324++) {
											Static393.aByteArrayArrayArray16[local130][local401][local324] = local14;
										}
									}
								}
							}
						}
						Static393.aByteArrayArrayArray16[local130][local74][local96] = local14;
						local126 = true;
					}
				}
				if (local126) {
					local165 = Static285.aClass60Array8[Static282.anInt4677 + 1].JA(local74, local96);
					if (local165 > Static494.anIntArray640[arg1]) {
						Static494.anIntArray640[arg1] = local165;
					}
					local212 = local74 << 9;
					@Pc(475) int local475 = local96 << 9;
					if (local212 < Static529.anIntArray680[arg1]) {
						Static529.anIntArray680[arg1] = local212;
					} else if (local212 > Static346.anIntArray533[arg1]) {
						Static346.anIntArray533[arg1] = local212;
					}
					if (local475 < Static180.anIntArray693[arg1]) {
						Static180.anIntArray693[arg1] = local475;
					} else if (local475 > Static343.anIntArray529[arg1]) {
						Static343.anIntArray529[arg1] = local475;
					}
				}
				if (!local112) {
					if (local74 >= 1 && local14 != Static393.aByteArrayArrayArray16[Static282.anInt4677][local74 - 1][local96]) {
						Static340.anIntArray528[local56] = 0xD3000000 | 0x120000 | local74 - 1;
						Static51.anIntArray57[local56] = local96 | 0x130000;
						local56 = local56 + 1 & 0xFFF;
						Static393.aByteArrayArrayArray16[Static282.anInt4677][local74 - 1][local96] = local14;
					}
					local96++;
					if (local96 < Static473.anInt7969) {
						if (local74 - 1 >= 0 && Static393.aByteArrayArrayArray16[Static282.anInt4677][local74 - 1][local96] != local14 && (Static303.aByteArrayArrayArray13[Static282.anInt4677][local74][local96] & 0x4) == 0 && (Static303.aByteArrayArrayArray13[Static282.anInt4677][local74 - 1][local96 - 1] & 0x4) == 0) {
							Static340.anIntArray528[local56] = local74 - 1 | 0x52000000 | 0x120000;
							Static51.anIntArray57[local56] = local96 | 0x130000;
							Static393.aByteArrayArrayArray16[Static282.anInt4677][local74 - 1][local96] = local14;
							local56 = local56 + 1 & 0xFFF;
						}
						if (Static393.aByteArrayArrayArray16[Static282.anInt4677][local74][local96] != local14) {
							Static340.anIntArray528[local56] = 0x13000000 | 0x520000 | local74;
							Static51.anIntArray57[local56] = local96 | 0x530000;
							Static393.aByteArrayArrayArray16[Static282.anInt4677][local74][local96] = local14;
							local56 = local56 + 1 & 0xFFF;
						}
						if (local74 + 1 < Static301.anInt4912 && Static393.aByteArrayArrayArray16[Static282.anInt4677][local74 + 1][local96] != local14 && (Static303.aByteArrayArrayArray13[Static282.anInt4677][local74][local96] & 0x4) == 0 && (Static303.aByteArrayArrayArray13[Static282.anInt4677][local74 + 1][local96 - 1] & 0x4) == 0) {
							Static340.anIntArray528[local56] = 0x92000000 | 0x520000 | local74 + 1;
							Static51.anIntArray57[local56] = local96 | 0x530000;
							local56 = local56 + 1 & 0xFFF;
							Static393.aByteArrayArrayArray16[Static282.anInt4677][local74 + 1][local96] = local14;
						}
					}
					local96--;
					if (Static301.anInt4912 > local74 + 1 && local14 != Static393.aByteArrayArrayArray16[Static282.anInt4677][local74 + 1][local96]) {
						Static340.anIntArray528[local56] = local74 + 1 | 0x53000000 | 0x920000;
						Static51.anIntArray57[local56] = local96 | 0x930000;
						Static393.aByteArrayArrayArray16[Static282.anInt4677][local74 + 1][local96] = local14;
						local56 = local56 + 1 & 0xFFF;
					}
					local96--;
					if (local96 >= 0) {
						if (local74 - 1 >= 0 && Static393.aByteArrayArrayArray16[Static282.anInt4677][local74 - 1][local96] != local14 && (Static303.aByteArrayArrayArray13[Static282.anInt4677][local74][local96] & 0x4) == 0 && (Static303.aByteArrayArrayArray13[Static282.anInt4677][local74 - 1][local96 + 1] & 0x4) == 0) {
							Static340.anIntArray528[local56] = local74 - 1 | 0xD20000 | 0x12000000;
							Static51.anIntArray57[local56] = local96 | 0xD30000;
							local56 = local56 + 1 & 0xFFF;
							Static393.aByteArrayArrayArray16[Static282.anInt4677][local74 - 1][local96] = local14;
						}
						if (Static393.aByteArrayArrayArray16[Static282.anInt4677][local74][local96] != local14) {
							Static340.anIntArray528[local56] = 0x93000000 | 0xD20000 | local74;
							Static51.anIntArray57[local56] = local96 | 0xD30000;
							local56 = local56 + 1 & 0xFFF;
							Static393.aByteArrayArrayArray16[Static282.anInt4677][local74][local96] = local14;
						}
						if (Static301.anInt4912 > local74 + 1 && local14 != Static393.aByteArrayArrayArray16[Static282.anInt4677][local74 + 1][local96] && (Static303.aByteArrayArrayArray13[Static282.anInt4677][local74][local96] & 0x4) == 0 && (Static303.aByteArrayArrayArray13[Static282.anInt4677][local74 + 1][local96 + 1] & 0x4) == 0) {
							Static340.anIntArray528[local56] = local74 + 1 | 0xD2000000 | 0x920000;
							Static51.anIntArray57[local56] = local96 | 0x930000;
							Static393.aByteArrayArrayArray16[Static282.anInt4677][local74 + 1][local96] = local14;
							local56 = local56 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static494.anIntArray640[arg1] != -1000000) {
				Static494.anIntArray640[arg1] += 10;
				Static529.anIntArray680[arg1] -= 50;
				Static346.anIntArray533[arg1] += 50;
				Static343.anIntArray529[arg1] += 50;
				Static180.anIntArray693[arg1] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)I")
	public static int method1752(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(19) int local19 = arg0 * 6 - 61440;
		@Pc(28) int local28 = (local19 * arg0 >> 12) + 40960;
		return local28 * local13 >> 12;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIIZ)V")
	public static void method1753(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		Static517.aLong209 = 0L;
		@Pc(12) int local12 = Static354.method5293();
		if (arg2 == 3 || local12 == 3) {
			arg3 = true;
		}
		if (!Static176.aClass121_5.method7122()) {
			arg3 = true;
		}
		Static308.method4788(local12, arg0, arg2, arg1, arg3);
	}
}
