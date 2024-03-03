import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Lclient!r;BLclient!r;)V", line = 3)
	public static void method3666(@OriginalArg(0) Class197 arg0, @OriginalArg(2) Class197 arg1) {
		Static74.aClass197_89 = arg1;
		Static366.aClass197_97 = arg0;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "([[[Lclient!f;ZIIII)Z", line = 46)
	public static boolean method3668(@OriginalArg(0) Class67[][][] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) byte local14 = arg1 ? 1 : (byte) (Class2_Sub2_Sub10_Sub1.anInt3082 & 0xFF);
		if (Static213.aByteArrayArrayArray13[Static330.anInt6573][arg2][arg3] == local14) {
			return false;
		} else if ((Static334.aByteArrayArrayArray16[Static330.anInt6573][arg2][arg3] & 0x4) == 0) {
			return false;
		} else {
			@Pc(42) byte local42 = 0;
			Class226.anIntArray432[0] = arg2;
			@Pc(53) int local53 = 0;
			@Pc(56) int local56 = local42 + 1;
			Class2_Sub39.anIntArray477[0] = arg3;
			Static213.aByteArrayArrayArray13[Static330.anInt6573][arg2][arg3] = local14;
			while (local56 != local53) {
				@Pc(74) int local74 = Class226.anIntArray432[local53] & 0xFFFF;
				@Pc(82) int local82 = Class226.anIntArray432[local53] >> 16 & 0xFF;
				@Pc(90) int local90 = Class226.anIntArray432[local53] >> 24 & 0xFF;
				@Pc(96) int local96 = Class2_Sub39.anIntArray477[local53] & 0xFFFF;
				@Pc(104) int local104 = Class2_Sub39.anIntArray477[local53] >> 16 & 0xFF;
				local53 = local53 + 1 & 0xFFF;
				@Pc(112) boolean local112 = false;
				if ((Static334.aByteArrayArrayArray16[Static330.anInt6573][local74][local96] & 0x4) == 0) {
					local112 = true;
				}
				@Pc(129) boolean local129 = false;
				@Pc(168) int local168;
				@Pc(210) int local210;
				label231: for (@Pc(133) int local133 = Static330.anInt6573 + 1; local133 <= 3; local133++) {
					if ((Static334.aByteArrayArrayArray16[local133][local74][local96] & 0x8) == 0) {
						@Pc(313) Class11_Sub5 local313;
						@Pc(325) int local325;
						@Pc(302) Class67 local302;
						@Pc(308) Class22 local308;
						if (local112 && arg0[local133][local74][local96] != null) {
							if (arg0[local133][local74][local96].aClass11_Sub1_3 != null) {
								local168 = Static216.method4064(local82);
								if (local168 == arg0[local133][local74][local96].aClass11_Sub1_3.anInt3478 || arg0[local133][local74][local96].aClass11_Sub1_2 != null && local168 == arg0[local133][local74][local96].aClass11_Sub1_2.anInt3478) {
									continue;
								}
								if (local90 != 0) {
									local210 = Static216.method4064(local90);
									if (arg0[local133][local74][local96].aClass11_Sub1_3.anInt3478 == local210 || arg0[local133][local74][local96].aClass11_Sub1_2 != null && local210 == arg0[local133][local74][local96].aClass11_Sub1_2.anInt3478) {
										continue;
									}
								}
								if (local104 != 0) {
									local210 = Static216.method4064(local104);
									if (arg0[local133][local74][local96].aClass11_Sub1_3.anInt3478 == local210 || arg0[local133][local74][local96].aClass11_Sub1_2 != null && local210 == arg0[local133][local74][local96].aClass11_Sub1_2.anInt3478) {
										continue;
									}
								}
							}
							local302 = arg0[local133][local74][local96];
							if (local302.aClass22_2 != null) {
								for (local308 = local302.aClass22_2; local308 != null; local308 = local308.aClass22_1) {
									local313 = local308.aClass11_Sub5_1;
									if (local313 instanceof Interface6) {
										@Pc(319) Interface6 local319 = (Interface6) local313;
										local325 = local319.method6082();
										if (local325 == 21) {
											local325 = 19;
										}
										@Pc(334) int local334 = local319.method6085();
										@Pc(340) int local340 = local325 | local334 << 6;
										if (local82 == local340 || local90 != 0 && local90 == local340 || local104 != 0 && local340 == local104) {
											continue label231;
										}
									}
								}
							}
						}
						local302 = arg0[local133][local74][local96];
						if (local302 != null && local302.aClass22_2 != null) {
							for (local308 = local302.aClass22_2; local308 != null; local308 = local308.aClass22_1) {
								local313 = local308.aClass11_Sub5_1;
								if (local313.aShort103 != local313.aShort104 || local313.aShort102 != local313.aShort101) {
									for (@Pc(401) int local401 = local313.aShort103; local401 <= local313.aShort104; local401++) {
										for (local325 = local313.aShort101; local325 <= local313.aShort102; local325++) {
											Static213.aByteArrayArrayArray13[local133][local401][local325] = local14;
										}
									}
								}
							}
						}
						local129 = true;
						Static213.aByteArrayArrayArray13[local133][local74][local96] = local14;
					}
				}
				if (local129) {
					local168 = Static340.aClass6Array4[Static330.anInt6573 + 1].method5720(local74, local96);
					if (Class233.anIntArray448[arg4] < local168) {
						Class233.anIntArray448[arg4] = local168;
					}
					local210 = local74 << 7;
					@Pc(477) int local477 = local96 << 7;
					if (Class77.anIntArray136[arg4] > local210) {
						Class77.anIntArray136[arg4] = local210;
					} else if (Class11_Sub5_Sub2_Sub2.anIntArray318[arg4] < local210) {
						Class11_Sub5_Sub2_Sub2.anIntArray318[arg4] = local210;
					}
					if (local477 < Class11_Sub3_Sub1.anIntArray122[arg4]) {
						Class11_Sub3_Sub1.anIntArray122[arg4] = local477;
					} else if (Class217.anIntArray409[arg4] < local477) {
						Class217.anIntArray409[arg4] = local477;
					}
				}
				if (!local112) {
					if (local74 >= 1 && Static213.aByteArrayArrayArray13[Static330.anInt6573][local74 - 1][local96] != local14) {
						Class226.anIntArray432[local56] = local74 - 1 | 0x120000 | 0xD3000000;
						Class2_Sub39.anIntArray477[local56] = local96 | 0x130000;
						Static213.aByteArrayArrayArray13[Static330.anInt6573][local74 - 1][local96] = local14;
						local56 = local56 + 1 & 0xFFF;
					}
					local96++;
					if (OutputStream_Sub1.anInt4442 > local96) {
						if (local74 - 1 >= 0 && Static213.aByteArrayArrayArray13[Static330.anInt6573][local74 - 1][local96] != local14 && (Static334.aByteArrayArrayArray16[Static330.anInt6573][local74][local96] & 0x4) == 0 && (Static334.aByteArrayArrayArray16[Static330.anInt6573][local74 - 1][local96 - 1] & 0x4) == 0) {
							Class226.anIntArray432[local56] = local74 - 1 | 0x120000 | 0x52000000;
							Class2_Sub39.anIntArray477[local56] = local96 | 0x130000;
							local56 = local56 + 1 & 0xFFF;
							Static213.aByteArrayArrayArray13[Static330.anInt6573][local74 - 1][local96] = local14;
						}
						if (local14 != Static213.aByteArrayArrayArray13[Static330.anInt6573][local74][local96]) {
							Class226.anIntArray432[local56] = 0x13000000 | 0x520000 | local74;
							Class2_Sub39.anIntArray477[local56] = local96 | 0x530000;
							Static213.aByteArrayArrayArray13[Static330.anInt6573][local74][local96] = local14;
							local56 = local56 + 1 & 0xFFF;
						}
						if (Class241.anInt7020 > local74 + 1 && Static213.aByteArrayArrayArray13[Static330.anInt6573][local74 + 1][local96] != local14 && (Static334.aByteArrayArrayArray16[Static330.anInt6573][local74][local96] & 0x4) == 0 && (Static334.aByteArrayArrayArray16[Static330.anInt6573][local74 + 1][local96 - 1] & 0x4) == 0) {
							Class226.anIntArray432[local56] = local74 + 1 | 0x520000 | 0x92000000;
							Class2_Sub39.anIntArray477[local56] = local96 | 0x530000;
							Static213.aByteArrayArrayArray13[Static330.anInt6573][local74 + 1][local96] = local14;
							local56 = local56 + 1 & 0xFFF;
						}
					}
					local96--;
					if (Class241.anInt7020 > local74 + 1 && local14 != Static213.aByteArrayArrayArray13[Static330.anInt6573][local74 + 1][local96]) {
						Class226.anIntArray432[local56] = 0x53000000 | 0x920000 | local74 + 1;
						Class2_Sub39.anIntArray477[local56] = local96 | 0x930000;
						Static213.aByteArrayArrayArray13[Static330.anInt6573][local74 + 1][local96] = local14;
						local56 = local56 + 1 & 0xFFF;
					}
					local96--;
					if (local96 >= 0) {
						if (local74 - 1 >= 0 && local14 != Static213.aByteArrayArrayArray13[Static330.anInt6573][local74 - 1][local96] && (Static334.aByteArrayArrayArray16[Static330.anInt6573][local74][local96] & 0x4) == 0 && (Static334.aByteArrayArrayArray16[Static330.anInt6573][local74 - 1][local96 + 1] & 0x4) == 0) {
							Class226.anIntArray432[local56] = local74 - 1 | 0xD20000 | 0x12000000;
							Class2_Sub39.anIntArray477[local56] = local96 | 0xD30000;
							Static213.aByteArrayArrayArray13[Static330.anInt6573][local74 - 1][local96] = local14;
							local56 = local56 + 1 & 0xFFF;
						}
						if (Static213.aByteArrayArrayArray13[Static330.anInt6573][local74][local96] != local14) {
							Class226.anIntArray432[local56] = 0x93000000 | 0xD20000 | local74;
							Class2_Sub39.anIntArray477[local56] = local96 | 0xD30000;
							local56 = local56 + 1 & 0xFFF;
							Static213.aByteArrayArrayArray13[Static330.anInt6573][local74][local96] = local14;
						}
						if (local74 + 1 < Class241.anInt7020 && local14 != Static213.aByteArrayArrayArray13[Static330.anInt6573][local74 + 1][local96] && (Static334.aByteArrayArrayArray16[Static330.anInt6573][local74][local96] & 0x4) == 0 && (Static334.aByteArrayArrayArray16[Static330.anInt6573][local74 + 1][local96 + 1] & 0x4) == 0) {
							Class226.anIntArray432[local56] = local74 + 1 | 0x920000 | 0xD2000000;
							Class2_Sub39.anIntArray477[local56] = local96 | 0x930000;
							local56 = local56 + 1 & 0xFFF;
							Static213.aByteArrayArrayArray13[Static330.anInt6573][local74 + 1][local96] = local14;
						}
					}
				}
			}
			if (Class233.anIntArray448[arg4] != -1000000) {
				Class233.anIntArray448[arg4] += 10;
				Class77.anIntArray136[arg4] -= 50;
				Class11_Sub5_Sub2_Sub2.anIntArray318[arg4] += 50;
				Class217.anIntArray409[arg4] += 50;
				Class11_Sub3_Sub1.anIntArray122[arg4] -= 50;
			}
			return true;
		}
	}
}
