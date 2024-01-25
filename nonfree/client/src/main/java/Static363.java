import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!rs", name = "f", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray39;

	@OriginalMember(owner = "client!rs", name = "i", descriptor = "I")
	public static int anInt6177 = 0;

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(B)V")
	public static void method5075() {
		@Pc(9) int[] local9 = new int[Static158.aClass272_1.anInt7762];
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static158.aClass272_1.anInt7762; local13++) {
			@Pc(20) Class209 local20 = Static158.aClass272_1.method6283(local13);
			if (local20.anInt6032 >= 0 || local20.anInt6009 >= 0) {
				local9[local11++] = local13;
			}
		}
		Static332.anIntArray347 = new int[local11];
		for (@Pc(56) int local56 = 0; local56 < local11; local56++) {
			Static332.anIntArray347[local56] = local9[local56];
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(BLclient!ga;)Ljava/lang/String;")
	public static String method5076(@OriginalArg(1) Class82 arg0) {
		if (Static54.method1060(arg0).method5454() == 0) {
			return null;
		} else if (arg0.aString33 == null || arg0.aString33.trim().length() == 0) {
			return Static64.aBoolean82 ? "Hidden-use" : null;
		} else {
			return arg0.aString33;
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(I[[[Lclient!sn;IIZI)Z")
	public static boolean method5077(@OriginalArg(0) int arg0, @OriginalArg(1) Class227[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(14) byte local14 = arg4 ? 1 : (byte) (Static463.anInt7797 & 0xFF);
		if (local14 == Static6.aByteArrayArrayArray1[Static276.anInt4606][arg3][arg2]) {
			return false;
		} else if ((Static360.aByteArrayArrayArray16[Static276.anInt4606][arg3][arg2] & 0x4) == 0) {
			return false;
		} else {
			@Pc(46) byte local46 = 0;
			Static321.anIntArray338[0] = arg3;
			@Pc(52) int local52 = 0;
			@Pc(55) int local55 = local46 + 1;
			Static323.anIntArray345[0] = arg2;
			Static6.aByteArrayArrayArray1[Static276.anInt4606][arg3][arg2] = local14;
			while (local55 != local52) {
				@Pc(73) int local73 = Static321.anIntArray338[local52] & 0xFFFF;
				@Pc(81) int local81 = Static321.anIntArray338[local52] >> 16 & 0xFF;
				@Pc(89) int local89 = Static321.anIntArray338[local52] >> 24 & 0xFF;
				@Pc(95) int local95 = Static323.anIntArray345[local52] & 0xFFFF;
				@Pc(103) int local103 = Static323.anIntArray345[local52] >> 16 & 0xFF;
				local52 = local52 + 1 & 0xFFF;
				@Pc(111) boolean local111 = false;
				if ((Static360.aByteArrayArrayArray16[Static276.anInt4606][local73][local95] & 0x4) == 0) {
					local111 = true;
				}
				@Pc(125) boolean local125 = false;
				@Pc(164) int local164;
				@Pc(210) int local210;
				label231: for (@Pc(129) int local129 = Static276.anInt4606 + 1; local129 <= 3; local129++) {
					if ((Static360.aByteArrayArrayArray16[local129][local73][local95] & 0x8) == 0) {
						@Pc(305) Class1_Sub2 local305;
						@Pc(315) int local315;
						@Pc(294) Class227 local294;
						@Pc(300) Class114 local300;
						if (local111 && arg1[local129][local73][local95] != null) {
							if (arg1[local129][local73][local95].aClass1_Sub3_3 != null) {
								local164 = Static400.method5477(local81);
								if (arg1[local129][local73][local95].aClass1_Sub3_3.anInt6690 == local164 || arg1[local129][local73][local95].aClass1_Sub3_2 != null && arg1[local129][local73][local95].aClass1_Sub3_2.anInt6690 == local164) {
									continue;
								}
								if (local89 != 0) {
									local210 = Static400.method5477(local89);
									if (local210 == arg1[local129][local73][local95].aClass1_Sub3_3.anInt6690 || arg1[local129][local73][local95].aClass1_Sub3_2 != null && local210 == arg1[local129][local73][local95].aClass1_Sub3_2.anInt6690) {
										continue;
									}
								}
								if (local103 != 0) {
									local210 = Static400.method5477(local103);
									if (arg1[local129][local73][local95].aClass1_Sub3_3.anInt6690 == local210 || arg1[local129][local73][local95].aClass1_Sub3_2 != null && arg1[local129][local73][local95].aClass1_Sub3_2.anInt6690 == local210) {
										continue;
									}
								}
							}
							local294 = arg1[local129][local73][local95];
							if (local294.aClass114_2 != null) {
								for (local300 = local294.aClass114_2; local300 != null; local300 = local300.aClass114_1) {
									local305 = local300.aClass1_Sub2_1;
									if (local305 instanceof Interface5) {
										@Pc(311) Interface5 local311 = (Interface5) local305;
										local315 = local311.method6261();
										if (local315 == 21) {
											local315 = 19;
										}
										@Pc(326) int local326 = local311.method6262();
										@Pc(332) int local332 = local326 << 6 | local315;
										if (local332 == local81 || local89 != 0 && local89 == local332 || local103 != 0 && local332 == local103) {
											continue label231;
										}
									}
								}
							}
						}
						local294 = arg1[local129][local73][local95];
						if (local294 != null && local294.aClass114_2 != null) {
							for (local300 = local294.aClass114_2; local300 != null; local300 = local300.aClass114_1) {
								local305 = local300.aClass1_Sub2_1;
								if (local305.aShort108 != local305.aShort109 || local305.aShort107 != local305.aShort110) {
									for (@Pc(397) int local397 = local305.aShort108; local397 <= local305.aShort109; local397++) {
										for (local315 = local305.aShort107; local315 <= local305.aShort110; local315++) {
											Static6.aByteArrayArrayArray1[local129][local397][local315] = local14;
										}
									}
								}
							}
						}
						local125 = true;
						Static6.aByteArrayArrayArray1[local129][local73][local95] = local14;
					}
				}
				if (local125) {
					local164 = Static178.aClass55Array1[Static276.anInt4606 + 1].oa(local73, local95);
					if (local164 > Static204.anIntArray311[arg0]) {
						Static204.anIntArray311[arg0] = local164;
					}
					local210 = local73 << 7;
					@Pc(479) int local479 = local95 << 7;
					if (Static124.anIntArray113[arg0] > local210) {
						Static124.anIntArray113[arg0] = local210;
					} else if (local210 > Static123.anIntArray103[arg0]) {
						Static123.anIntArray103[arg0] = local210;
					}
					if (Static130.anIntArray120[arg0] > local479) {
						Static130.anIntArray120[arg0] = local479;
					} else if (Static256.anIntArray280[arg0] < local479) {
						Static256.anIntArray280[arg0] = local479;
					}
				}
				if (!local111) {
					if (local73 >= 1 && Static6.aByteArrayArrayArray1[Static276.anInt4606][local73 - 1][local95] != local14) {
						Static321.anIntArray338[local55] = 0xD3000000 | 0x120000 | local73 - 1;
						Static323.anIntArray345[local55] = local95 | 0x130000;
						local55 = local55 + 1 & 0xFFF;
						Static6.aByteArrayArrayArray1[Static276.anInt4606][local73 - 1][local95] = local14;
					}
					local95++;
					if (Static291.anInt5062 > local95) {
						if (local73 - 1 >= 0 && Static6.aByteArrayArrayArray1[Static276.anInt4606][local73 - 1][local95] != local14 && (Static360.aByteArrayArrayArray16[Static276.anInt4606][local73][local95] & 0x4) == 0 && (Static360.aByteArrayArrayArray16[Static276.anInt4606][local73 - 1][local95 - 1] & 0x4) == 0) {
							Static321.anIntArray338[local55] = local73 - 1 | 0x120000 | 0x52000000;
							Static323.anIntArray345[local55] = local95 | 0x130000;
							local55 = local55 + 1 & 0xFFF;
							Static6.aByteArrayArrayArray1[Static276.anInt4606][local73 - 1][local95] = local14;
						}
						if (Static6.aByteArrayArrayArray1[Static276.anInt4606][local73][local95] != local14) {
							Static321.anIntArray338[local55] = local73 | 0x13000000 | 0x520000;
							Static323.anIntArray345[local55] = local95 | 0x530000;
							Static6.aByteArrayArrayArray1[Static276.anInt4606][local73][local95] = local14;
							local55 = local55 + 1 & 0xFFF;
						}
						if (local73 + 1 < Static373.anInt6324 && local14 != Static6.aByteArrayArrayArray1[Static276.anInt4606][local73 + 1][local95] && (Static360.aByteArrayArrayArray16[Static276.anInt4606][local73][local95] & 0x4) == 0 && (Static360.aByteArrayArrayArray16[Static276.anInt4606][local73 + 1][local95 - 1] & 0x4) == 0) {
							Static321.anIntArray338[local55] = local73 + 1 | 0x520000 | 0x92000000;
							Static323.anIntArray345[local55] = local95 | 0x530000;
							local55 = local55 + 1 & 0xFFF;
							Static6.aByteArrayArrayArray1[Static276.anInt4606][local73 + 1][local95] = local14;
						}
					}
					local95--;
					if (local73 + 1 < Static373.anInt6324 && local14 != Static6.aByteArrayArrayArray1[Static276.anInt4606][local73 + 1][local95]) {
						Static321.anIntArray338[local55] = local73 + 1 | 0x920000 | 0x53000000;
						Static323.anIntArray345[local55] = local95 | 0x930000;
						Static6.aByteArrayArrayArray1[Static276.anInt4606][local73 + 1][local95] = local14;
						local55 = local55 + 1 & 0xFFF;
					}
					local95--;
					if (local95 >= 0) {
						if (local73 - 1 >= 0 && local14 != Static6.aByteArrayArrayArray1[Static276.anInt4606][local73 - 1][local95] && (Static360.aByteArrayArrayArray16[Static276.anInt4606][local73][local95] & 0x4) == 0 && (Static360.aByteArrayArrayArray16[Static276.anInt4606][local73 - 1][local95 + 1] & 0x4) == 0) {
							Static321.anIntArray338[local55] = local73 - 1 | 0xD20000 | 0x12000000;
							Static323.anIntArray345[local55] = local95 | 0xD30000;
							Static6.aByteArrayArrayArray1[Static276.anInt4606][local73 - 1][local95] = local14;
							local55 = local55 + 1 & 0xFFF;
						}
						if (local14 != Static6.aByteArrayArrayArray1[Static276.anInt4606][local73][local95]) {
							Static321.anIntArray338[local55] = 0x93000000 | 0xD20000 | local73;
							Static323.anIntArray345[local55] = local95 | 0xD30000;
							local55 = local55 + 1 & 0xFFF;
							Static6.aByteArrayArrayArray1[Static276.anInt4606][local73][local95] = local14;
						}
						if (Static373.anInt6324 > local73 + 1 && local14 != Static6.aByteArrayArrayArray1[Static276.anInt4606][local73 + 1][local95] && (Static360.aByteArrayArrayArray16[Static276.anInt4606][local73][local95] & 0x4) == 0 && (Static360.aByteArrayArrayArray16[Static276.anInt4606][local73 + 1][local95 + 1] & 0x4) == 0) {
							Static321.anIntArray338[local55] = local73 + 1 | 0x920000 | 0xD2000000;
							Static323.anIntArray345[local55] = local95 | 0x930000;
							Static6.aByteArrayArrayArray1[Static276.anInt4606][local73 + 1][local95] = local14;
							local55 = local55 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static204.anIntArray311[arg0] != -1000000) {
				Static204.anIntArray311[arg0] += 10;
				Static124.anIntArray113[arg0] -= 50;
				Static123.anIntArray103[arg0] += 50;
				Static256.anIntArray280[arg0] += 50;
				Static130.anIntArray120[arg0] -= 50;
			}
			return true;
		}
	}
}
