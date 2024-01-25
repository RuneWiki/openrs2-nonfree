import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static553 {

	@OriginalMember(owner = "client!tn", name = "f", descriptor = "Lclient!da;")
	public static Class62 aClass62_11;

	@OriginalMember(owner = "client!tn", name = "g", descriptor = "I")
	public static int anInt9279;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "Lclient!fba;")
	public static final Class102 aClass102_58 = new Class102(8);

	@OriginalMember(owner = "client!tn", name = "i", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray35 = new String[100];

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "([[[Lclient!dn;IZIIZ)Z")
	public static boolean method7993(@OriginalArg(0) Class77[][][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(14) byte local14 = arg2 ? 1 : (byte) (Static45.anInt1320 & 0xFF);
		if (Static3.aByteArrayArrayArray1[Static549.anInt9262][arg1][arg3] == local14) {
			return false;
		} else if ((Static513.aByteArrayArrayArray18[Static549.anInt9262][arg1][arg3] & 0x4) == 0) {
			return false;
		} else {
			@Pc(42) byte local42 = 0;
			@Pc(44) int local44 = 0;
			Static381.anIntArray428[0] = arg1;
			@Pc(56) int local56 = local42 + 1;
			Static236.anIntArray233[0] = arg3;
			Static3.aByteArrayArrayArray1[Static549.anInt9262][arg1][arg3] = local14;
			while (local56 != local44) {
				@Pc(74) int local74 = Static381.anIntArray428[local44] & 0xFFFF;
				@Pc(82) int local82 = Static381.anIntArray428[local44] >> 16 & 0xFF;
				@Pc(90) int local90 = Static381.anIntArray428[local44] >> 24 & 0xFF;
				@Pc(96) int local96 = Static236.anIntArray233[local44] & 0xFFFF;
				@Pc(104) int local104 = Static236.anIntArray233[local44] >> 16 & 0xFF;
				local44 = local44 + 1 & 0xFFF;
				@Pc(112) boolean local112 = false;
				if ((Static513.aByteArrayArrayArray18[Static549.anInt9262][local74][local96] & 0x4) == 0) {
					local112 = true;
				}
				@Pc(129) boolean local129 = false;
				@Pc(171) int local171;
				@Pc(210) int local210;
				label231: for (@Pc(133) int local133 = Static549.anInt9262 + 1; local133 <= 3; local133++) {
					if ((Static513.aByteArrayArrayArray18[local133][local74][local96] & 0x8) == 0) {
						@Pc(316) Class4_Sub1_Sub2 local316;
						@Pc(326) int local326;
						@Pc(305) Class77 local305;
						@Pc(311) Class128 local311;
						if (local112 && arg0[local133][local74][local96] != null) {
							if (arg0[local133][local74][local96].aClass4_Sub1_Sub3_2 != null) {
								local171 = Static144.method2658(local82);
								if (arg0[local133][local74][local96].aClass4_Sub1_Sub3_2.aShort53 == local171 || arg0[local133][local74][local96].aClass4_Sub1_Sub3_1 != null && arg0[local133][local74][local96].aClass4_Sub1_Sub3_1.aShort53 == local171) {
									continue;
								}
								if (local90 != 0) {
									local210 = Static144.method2658(local90);
									if (local210 == arg0[local133][local74][local96].aClass4_Sub1_Sub3_2.aShort53 || arg0[local133][local74][local96].aClass4_Sub1_Sub3_1 != null && arg0[local133][local74][local96].aClass4_Sub1_Sub3_1.aShort53 == local210) {
										continue;
									}
								}
								if (local104 != 0) {
									local210 = Static144.method2658(local104);
									if (arg0[local133][local74][local96].aClass4_Sub1_Sub3_2.aShort53 == local210 || arg0[local133][local74][local96].aClass4_Sub1_Sub3_1 != null && arg0[local133][local74][local96].aClass4_Sub1_Sub3_1.aShort53 == local210) {
										continue;
									}
								}
							}
							local305 = arg0[local133][local74][local96];
							if (local305.aClass128_1 != null) {
								for (local311 = local305.aClass128_1; local311 != null; local311 = local311.aClass128_2) {
									local316 = local311.aClass4_Sub1_Sub2_1;
									if (local316 instanceof Interface2) {
										@Pc(322) Interface2 local322 = (Interface2) local316;
										local326 = local322.method7382();
										if (local326 == 21) {
											local326 = 19;
										}
										@Pc(337) int local337 = local322.method7379();
										@Pc(343) int local343 = local326 | local337 << 6;
										if (local343 == local82 || local90 != 0 && local90 == local343 || local104 != 0 && local343 == local104) {
											continue label231;
										}
									}
								}
							}
						}
						local305 = arg0[local133][local74][local96];
						if (local305 != null && local305.aClass128_1 != null) {
							for (local311 = local305.aClass128_1; local311 != null; local311 = local311.aClass128_2) {
								local316 = local311.aClass4_Sub1_Sub2_1;
								if (local316.aShort118 != local316.aShort117 || local316.aShort119 != local316.aShort116) {
									for (@Pc(400) int local400 = local316.aShort118; local400 <= local316.aShort117; local400++) {
										for (local326 = local316.aShort116; local326 <= local316.aShort119; local326++) {
											Static3.aByteArrayArrayArray1[local133][local400][local326] = local14;
										}
									}
								}
							}
						}
						Static3.aByteArrayArrayArray1[local133][local74][local96] = local14;
						local129 = true;
					}
				}
				if (local129) {
					local171 = Static364.aClass51Array3[Static549.anInt9262 + 1].method7835(local74, local96);
					if (Static332.anIntArray382[arg4] < local171) {
						Static332.anIntArray382[arg4] = local171;
					}
					local210 = local74 << 9;
					@Pc(481) int local481 = local96 << 9;
					if (Static441.anIntArray484[arg4] > local210) {
						Static441.anIntArray484[arg4] = local210;
					} else if (local210 > Static576.anIntArray604[arg4]) {
						Static576.anIntArray604[arg4] = local210;
					}
					if (Static444.anIntArray555[arg4] > local481) {
						Static444.anIntArray555[arg4] = local481;
					} else if (Static429.anIntArray474[arg4] < local481) {
						Static429.anIntArray474[arg4] = local481;
					}
				}
				if (!local112) {
					if (local74 >= 1 && local14 != Static3.aByteArrayArrayArray1[Static549.anInt9262][local74 - 1][local96]) {
						Static381.anIntArray428[local56] = local74 - 1 | 0xD3000000 | 0x120000;
						Static236.anIntArray233[local56] = local96 | 0x130000;
						local56 = local56 + 1 & 0xFFF;
						Static3.aByteArrayArrayArray1[Static549.anInt9262][local74 - 1][local96] = local14;
					}
					@Pc(590) int local590 = ~Static638.anInt10172;
					local96++;
					if (local590 < ~local96) {
						if (local74 - 1 >= 0 && Static3.aByteArrayArrayArray1[Static549.anInt9262][local74 - 1][local96] != local14 && (Static513.aByteArrayArrayArray18[Static549.anInt9262][local74][local96] & 0x4) == 0 && (Static513.aByteArrayArrayArray18[Static549.anInt9262][local74 - 1][local96 - 1] & 0x4) == 0) {
							Static381.anIntArray428[local56] = 0x52000000 | 0x120000 | local74 - 1;
							Static236.anIntArray233[local56] = local96 | 0x130000;
							local56 = local56 + 1 & 0xFFF;
							Static3.aByteArrayArrayArray1[Static549.anInt9262][local74 - 1][local96] = local14;
						}
						if (local14 != Static3.aByteArrayArrayArray1[Static549.anInt9262][local74][local96]) {
							Static381.anIntArray428[local56] = 0x13000000 | 0x520000 | local74;
							Static236.anIntArray233[local56] = local96 | 0x530000;
							local56 = local56 + 1 & 0xFFF;
							Static3.aByteArrayArrayArray1[Static549.anInt9262][local74][local96] = local14;
						}
						if (local74 + 1 < Static634.anInt10129 && Static3.aByteArrayArrayArray1[Static549.anInt9262][local74 + 1][local96] != local14 && (Static513.aByteArrayArrayArray18[Static549.anInt9262][local74][local96] & 0x4) == 0 && (Static513.aByteArrayArrayArray18[Static549.anInt9262][local74 + 1][local96 - 1] & 0x4) == 0) {
							Static381.anIntArray428[local56] = local74 + 1 | 0x92000000 | 0x520000;
							Static236.anIntArray233[local56] = local96 | 0x530000;
							Static3.aByteArrayArrayArray1[Static549.anInt9262][local74 + 1][local96] = local14;
							local56 = local56 + 1 & 0xFFF;
						}
					}
					local96--;
					if (Static634.anInt10129 > local74 + 1 && Static3.aByteArrayArrayArray1[Static549.anInt9262][local74 + 1][local96] != local14) {
						Static381.anIntArray428[local56] = local74 + 1 | 0x920000 | 0x53000000;
						Static236.anIntArray233[local56] = local96 | 0x930000;
						Static3.aByteArrayArrayArray1[Static549.anInt9262][local74 + 1][local96] = local14;
						local56 = local56 + 1 & 0xFFF;
					}
					local96--;
					if (local96 >= 0) {
						if (local74 - 1 >= 0 && local14 != Static3.aByteArrayArrayArray1[Static549.anInt9262][local74 - 1][local96] && (Static513.aByteArrayArrayArray18[Static549.anInt9262][local74][local96] & 0x4) == 0 && (Static513.aByteArrayArrayArray18[Static549.anInt9262][local74 - 1][local96 + 1] & 0x4) == 0) {
							Static381.anIntArray428[local56] = local74 - 1 | 0x12000000 | 0xD20000;
							Static236.anIntArray233[local56] = local96 | 0xD30000;
							local56 = local56 + 1 & 0xFFF;
							Static3.aByteArrayArrayArray1[Static549.anInt9262][local74 - 1][local96] = local14;
						}
						if (Static3.aByteArrayArrayArray1[Static549.anInt9262][local74][local96] != local14) {
							Static381.anIntArray428[local56] = local74 | 0x93000000 | 0xD20000;
							Static236.anIntArray233[local56] = local96 | 0xD30000;
							Static3.aByteArrayArrayArray1[Static549.anInt9262][local74][local96] = local14;
							local56 = local56 + 1 & 0xFFF;
						}
						if (local74 + 1 < Static634.anInt10129 && Static3.aByteArrayArrayArray1[Static549.anInt9262][local74 + 1][local96] != local14 && (Static513.aByteArrayArrayArray18[Static549.anInt9262][local74][local96] & 0x4) == 0 && (Static513.aByteArrayArrayArray18[Static549.anInt9262][local74 + 1][local96 + 1] & 0x4) == 0) {
							Static381.anIntArray428[local56] = 0xD2000000 | 0x920000 | local74 + 1;
							Static236.anIntArray233[local56] = local96 | 0x930000;
							Static3.aByteArrayArrayArray1[Static549.anInt9262][local74 + 1][local96] = local14;
							local56 = local56 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static332.anIntArray382[arg4] != -1000000) {
				Static332.anIntArray382[arg4] += 40;
				Static441.anIntArray484[arg4] -= 512;
				Static576.anIntArray604[arg4] += 512;
				Static429.anIntArray474[arg4] += 512;
				Static444.anIntArray555[arg4] -= 512;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V")
	public static void method7994() {
		Static383.aClass5_12.xa(((float) Static262.aClass3_Sub27_12.aClass21_Sub23_1.method7600() * 0.1F + 0.7F) * 1.1523438F);
		Static383.aClass5_12.ZA(Static394.anInt7316, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		Static383.aClass5_12.L(Static596.anInt9743, -1, 0);
		Static383.aClass5_12.method7498(Static526.aClass205_3);
	}
}
