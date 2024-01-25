import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static450 {

	@OriginalMember(owner = "client!rb", name = "O", descriptor = "Lclient!sa;")
	public static Class294 aClass294_11;

	@OriginalMember(owner = "client!rb", name = "I", descriptor = "[I")
	public static final int[] anIntArray519 = new int[3];

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIFIFFFIILclient!ab;F)[B")
	public static byte[] method6450(@OriginalArg(2) float arg0, @OriginalArg(4) float arg1, @OriginalArg(5) float arg2, @OriginalArg(6) float arg3, @OriginalArg(9) Class4 arg4, @OriginalArg(10) float arg5) {
		@Pc(10) byte[] local10 = new byte[262144];
		Static493.method6891(arg0, local10, arg2, arg4, arg5, arg3, arg1, 0);
		return local10;
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(IBI)Z")
	public static boolean method6451(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZIIBI[[[Lclient!vf;)Z")
	public static boolean method6453(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class346[][][] arg4) {
		@Pc(14) byte local14 = arg0 ? 1 : (byte) (Static485.anInt8225 & 0xFF);
		if (local14 == Static143.aByteArrayArrayArray50[Static566.anInt9278][arg3][arg2]) {
			return false;
		} else if ((Static521.aByteArrayArrayArray45[Static566.anInt9278][arg3][arg2] & 0x4) == 0) {
			return false;
		} else {
			@Pc(58) byte local58 = 0;
			Static454.anIntArray520[0] = arg3;
			@Pc(64) int local64 = 0;
			@Pc(67) int local67 = local58 + 1;
			Static172.anIntArray201[0] = arg2;
			Static143.aByteArrayArrayArray50[Static566.anInt9278][arg3][arg2] = local14;
			while (local67 != local64) {
				@Pc(85) int local85 = Static454.anIntArray520[local64] & 0xFFFF;
				@Pc(93) int local93 = Static454.anIntArray520[local64] >> 16 & 0xFF;
				@Pc(101) int local101 = Static454.anIntArray520[local64] >> 24 & 0xFF;
				@Pc(107) int local107 = Static172.anIntArray201[local64] & 0xFFFF;
				@Pc(115) int local115 = Static172.anIntArray201[local64] >> 16 & 0xFF;
				local64 = local64 + 1 & 0xFFF;
				@Pc(123) boolean local123 = false;
				if ((Static521.aByteArrayArrayArray45[Static566.anInt9278][local85][local107] & 0x4) == 0) {
					local123 = true;
				}
				@Pc(137) boolean local137 = false;
				@Pc(176) int local176;
				@Pc(218) int local218;
				label231: for (@Pc(141) int local141 = Static566.anInt9278 + 1; local141 <= 3; local141++) {
					if ((Static521.aByteArrayArrayArray45[local141][local85][local107] & 0x8) == 0) {
						@Pc(316) Class6_Sub1_Sub1 local316;
						@Pc(326) int local326;
						@Pc(305) Class346 local305;
						@Pc(311) Class153 local311;
						if (local123 && arg4[local141][local85][local107] != null) {
							if (arg4[local141][local85][local107].aClass6_Sub1_Sub3_2 != null) {
								local176 = Static213.method3441(local93);
								if (local176 == arg4[local141][local85][local107].aClass6_Sub1_Sub3_2.aShort98 || arg4[local141][local85][local107].aClass6_Sub1_Sub3_1 != null && arg4[local141][local85][local107].aClass6_Sub1_Sub3_1.aShort98 == local176) {
									continue;
								}
								if (local101 != 0) {
									local218 = Static213.method3441(local101);
									if (local218 == arg4[local141][local85][local107].aClass6_Sub1_Sub3_2.aShort98 || arg4[local141][local85][local107].aClass6_Sub1_Sub3_1 != null && local218 == arg4[local141][local85][local107].aClass6_Sub1_Sub3_1.aShort98) {
										continue;
									}
								}
								if (local115 != 0) {
									local218 = Static213.method3441(local115);
									if (local218 == arg4[local141][local85][local107].aClass6_Sub1_Sub3_2.aShort98 || arg4[local141][local85][local107].aClass6_Sub1_Sub3_1 != null && local218 == arg4[local141][local85][local107].aClass6_Sub1_Sub3_1.aShort98) {
										continue;
									}
								}
							}
							local305 = arg4[local141][local85][local107];
							if (local305.aClass153_3 != null) {
								for (local311 = local305.aClass153_3; local311 != null; local311 = local311.aClass153_1) {
									local316 = local311.aClass6_Sub1_Sub1_1;
									if (local316 instanceof Interface24) {
										@Pc(322) Interface24 local322 = (Interface24) local316;
										local326 = local322.method7336();
										@Pc(330) int local330 = local322.method7340();
										if (local326 == 21) {
											local326 = 19;
										}
										@Pc(341) int local341 = local330 << 6 | local326;
										if (local93 == local341 || local101 != 0 && local101 == local341 || local115 != 0 && local115 == local341) {
											continue label231;
										}
									}
								}
							}
						}
						local305 = arg4[local141][local85][local107];
						if (local305 != null && local305.aClass153_3 != null) {
							for (local311 = local305.aClass153_3; local311 != null; local311 = local311.aClass153_1) {
								local316 = local311.aClass6_Sub1_Sub1_1;
								if (local316.aShort85 != local316.aShort86 || local316.aShort84 != local316.aShort83) {
									for (@Pc(413) int local413 = local316.aShort85; local413 <= local316.aShort86; local413++) {
										for (local326 = local316.aShort83; local326 <= local316.aShort84; local326++) {
											Static143.aByteArrayArrayArray50[local141][local413][local326] = local14;
										}
									}
								}
							}
						}
						Static143.aByteArrayArrayArray50[local141][local85][local107] = local14;
						local137 = true;
					}
				}
				if (local137) {
					local176 = Static421.aClass67Array7[Static566.anInt9278 + 1].method6707(local107, local85);
					if (local176 > Static381.anIntArray484[arg1]) {
						Static381.anIntArray484[arg1] = local176;
					}
					local218 = local85 << 9;
					if (Static326.anIntArray423[arg1] > local218) {
						Static326.anIntArray423[arg1] = local218;
					} else if (local218 > Static204.anIntArray238[arg1]) {
						Static204.anIntArray238[arg1] = local218;
					}
					@Pc(514) int local514 = local107 << 9;
					if (Static323.anIntArray421[arg1] > local514) {
						Static323.anIntArray421[arg1] = local514;
					} else if (Static177.anIntArray207[arg1] < local514) {
						Static177.anIntArray207[arg1] = local514;
					}
				}
				if (!local123) {
					if (local85 >= 1 && local14 != Static143.aByteArrayArrayArray50[Static566.anInt9278][local85 - 1][local107]) {
						Static454.anIntArray520[local67] = local85 - 1 | 0x120000 | 0xD3000000;
						Static172.anIntArray201[local67] = local107 | 0x130000;
						Static143.aByteArrayArrayArray50[Static566.anInt9278][local85 - 1][local107] = local14;
						local67 = local67 + 1 & 0xFFF;
					}
					local107++;
					if (local107 < Static49.anInt1174) {
						if (local85 - 1 >= 0 && local14 != Static143.aByteArrayArrayArray50[Static566.anInt9278][local85 - 1][local107] && (Static521.aByteArrayArrayArray45[Static566.anInt9278][local85][local107] & 0x4) == 0 && (Static521.aByteArrayArrayArray45[Static566.anInt9278][local85 - 1][local107 - 1] & 0x4) == 0) {
							Static454.anIntArray520[local67] = 0x52000000 | 0x120000 | local85 - 1;
							Static172.anIntArray201[local67] = local107 | 0x130000;
							Static143.aByteArrayArrayArray50[Static566.anInt9278][local85 - 1][local107] = local14;
							local67 = local67 + 1 & 0xFFF;
						}
						if (local14 != Static143.aByteArrayArrayArray50[Static566.anInt9278][local85][local107]) {
							Static454.anIntArray520[local67] = local85 | 0x520000 | 0x13000000;
							Static172.anIntArray201[local67] = local107 | 0x530000;
							local67 = local67 + 1 & 0xFFF;
							Static143.aByteArrayArrayArray50[Static566.anInt9278][local85][local107] = local14;
						}
						if (local85 + 1 < Static188.anInt3850 && Static143.aByteArrayArrayArray50[Static566.anInt9278][local85 + 1][local107] != local14 && (Static521.aByteArrayArrayArray45[Static566.anInt9278][local85][local107] & 0x4) == 0 && (Static521.aByteArrayArrayArray45[Static566.anInt9278][local85 + 1][local107 - 1] & 0x4) == 0) {
							Static454.anIntArray520[local67] = 0x92000000 | 0x520000 | local85 + 1;
							Static172.anIntArray201[local67] = local107 | 0x530000;
							local67 = local67 + 1 & 0xFFF;
							Static143.aByteArrayArrayArray50[Static566.anInt9278][local85 + 1][local107] = local14;
						}
					}
					local107--;
					if (local85 + 1 < Static188.anInt3850 && Static143.aByteArrayArrayArray50[Static566.anInt9278][local85 + 1][local107] != local14) {
						Static454.anIntArray520[local67] = local85 + 1 | 0x920000 | 0x53000000;
						Static172.anIntArray201[local67] = local107 | 0x930000;
						Static143.aByteArrayArrayArray50[Static566.anInt9278][local85 + 1][local107] = local14;
						local67 = local67 + 1 & 0xFFF;
					}
					local107--;
					if (local107 >= 0) {
						if (local85 - 1 >= 0 && local14 != Static143.aByteArrayArrayArray50[Static566.anInt9278][local85 - 1][local107] && (Static521.aByteArrayArrayArray45[Static566.anInt9278][local85][local107] & 0x4) == 0 && (Static521.aByteArrayArrayArray45[Static566.anInt9278][local85 - 1][local107 + 1] & 0x4) == 0) {
							Static454.anIntArray520[local67] = local85 - 1 | 0x12000000 | 0xD20000;
							Static172.anIntArray201[local67] = local107 | 0xD30000;
							local67 = local67 + 1 & 0xFFF;
							Static143.aByteArrayArrayArray50[Static566.anInt9278][local85 - 1][local107] = local14;
						}
						if (Static143.aByteArrayArrayArray50[Static566.anInt9278][local85][local107] != local14) {
							Static454.anIntArray520[local67] = local85 | 0x93000000 | 0xD20000;
							Static172.anIntArray201[local67] = local107 | 0xD30000;
							local67 = local67 + 1 & 0xFFF;
							Static143.aByteArrayArrayArray50[Static566.anInt9278][local85][local107] = local14;
						}
						if (Static188.anInt3850 > local85 + 1 && Static143.aByteArrayArrayArray50[Static566.anInt9278][local85 + 1][local107] != local14 && (Static521.aByteArrayArrayArray45[Static566.anInt9278][local85][local107] & 0x4) == 0 && (Static521.aByteArrayArrayArray45[Static566.anInt9278][local85 + 1][local107 + 1] & 0x4) == 0) {
							Static454.anIntArray520[local67] = local85 + 1 | 0x920000 | 0xD2000000;
							Static172.anIntArray201[local67] = local107 | 0x930000;
							Static143.aByteArrayArrayArray50[Static566.anInt9278][local85 + 1][local107] = local14;
							local67 = local67 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static381.anIntArray484[arg1] != -1000000) {
				Static381.anIntArray484[arg1] += 40;
				Static326.anIntArray423[arg1] -= 512;
				Static204.anIntArray238[arg1] += 512;
				Static177.anIntArray207[arg1] += 512;
				Static323.anIntArray421[arg1] -= 512;
			}
			return true;
		}
	}
}
