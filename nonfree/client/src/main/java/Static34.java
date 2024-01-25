import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!bo", name = "Q", descriptor = "Lclient!c;")
	public static Class6 aClass6_1;

	@OriginalMember(owner = "client!bo", name = "K", descriptor = "I")
	public static int anInt590 = 999999;

	@OriginalMember(owner = "client!bo", name = "L", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray3 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!bo", name = "M", descriptor = "[I")
	public static final int[] anIntArray54 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!bo", name = "O", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_12 = new Class25(20, 6);

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IZI)V")
	public static void method564(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub1_Sub6 local8 = Static267.method3705(arg0, 16);
		local8.method2574();
		local8.anInt3131 = arg1;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(III[[[Lclient!ce;IZ)Z")
	public static boolean method565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class36[][][] arg3, @OriginalArg(5) boolean arg4) {
		@Pc(14) byte local14 = arg4 ? 1 : (byte) (Static383.anInt6623 & 0xFF);
		if (Static419.aByteArrayArrayArray17[Static204.anInt3498][arg1][arg0] == local14) {
			return false;
		} else if ((Static326.aByteArrayArrayArray15[Static204.anInt3498][arg1][arg0] & 0x4) == 0) {
			return false;
		} else {
			@Pc(44) byte local44 = 0;
			@Pc(46) int local46 = 0;
			Static58.anIntArray77[0] = arg1;
			@Pc(53) int local53 = local44 + 1;
			Static96.anIntArray107[0] = arg0;
			Static419.aByteArrayArrayArray17[Static204.anInt3498][arg1][arg0] = local14;
			while (local53 != local46) {
				@Pc(71) int local71 = Static58.anIntArray77[local46] & 0xFFFF;
				@Pc(79) int local79 = Static58.anIntArray77[local46] >> 16 & 0xFF;
				@Pc(87) int local87 = Static58.anIntArray77[local46] >> 24 & 0xFF;
				@Pc(93) int local93 = Static96.anIntArray107[local46] & 0xFFFF;
				@Pc(101) int local101 = Static96.anIntArray107[local46] >> 16 & 0xFF;
				local46 = local46 + 1 & 0xFFF;
				@Pc(109) boolean local109 = false;
				if ((Static326.aByteArrayArrayArray15[Static204.anInt3498][local71][local93] & 0x4) == 0) {
					local109 = true;
				}
				@Pc(126) boolean local126 = false;
				@Pc(168) int local168;
				@Pc(207) int local207;
				label231: for (@Pc(130) int local130 = Static204.anInt3498 + 1; local130 <= 3; local130++) {
					if ((Static326.aByteArrayArrayArray15[local130][local71][local93] & 0x8) == 0) {
						@Pc(314) Class11_Sub5 local314;
						@Pc(324) int local324;
						@Pc(303) Class36 local303;
						@Pc(309) Class195 local309;
						if (local109 && arg3[local130][local71][local93] != null) {
							if (arg3[local130][local71][local93].aClass11_Sub1_2 != null) {
								local168 = Static450.method6255(local79);
								if (local168 == arg3[local130][local71][local93].aClass11_Sub1_2.anInt3191 || arg3[local130][local71][local93].aClass11_Sub1_3 != null && arg3[local130][local71][local93].aClass11_Sub1_3.anInt3191 == local168) {
									continue;
								}
								if (local87 != 0) {
									local207 = Static450.method6255(local87);
									if (local207 == arg3[local130][local71][local93].aClass11_Sub1_2.anInt3191 || arg3[local130][local71][local93].aClass11_Sub1_3 != null && arg3[local130][local71][local93].aClass11_Sub1_3.anInt3191 == local207) {
										continue;
									}
								}
								if (local101 != 0) {
									local207 = Static450.method6255(local101);
									if (local207 == arg3[local130][local71][local93].aClass11_Sub1_2.anInt3191 || arg3[local130][local71][local93].aClass11_Sub1_3 != null && arg3[local130][local71][local93].aClass11_Sub1_3.anInt3191 == local207) {
										continue;
									}
								}
							}
							local303 = arg3[local130][local71][local93];
							if (local303.aClass195_1 != null) {
								for (local309 = local303.aClass195_1; local309 != null; local309 = local309.aClass195_2) {
									local314 = local309.aClass11_Sub5_1;
									if (local314 instanceof Interface6) {
										@Pc(320) Interface6 local320 = (Interface6) local314;
										local324 = local320.method5721();
										@Pc(328) int local328 = local320.method5723();
										if (local324 == 21) {
											local324 = 19;
										}
										@Pc(339) int local339 = local324 | local328 << 6;
										if (local79 == local339 || local87 != 0 && local87 == local339 || local101 != 0 && local339 == local101) {
											continue label231;
										}
									}
								}
							}
						}
						local303 = arg3[local130][local71][local93];
						if (local303 != null && local303.aClass195_1 != null) {
							for (local309 = local303.aClass195_1; local309 != null; local309 = local309.aClass195_2) {
								local314 = local309.aClass11_Sub5_1;
								if (local314.aShort108 != local314.aShort107 || local314.aShort106 != local314.aShort109) {
									for (@Pc(404) int local404 = local314.aShort108; local404 <= local314.aShort107; local404++) {
										for (local324 = local314.aShort109; local324 <= local314.aShort106; local324++) {
											Static419.aByteArrayArrayArray17[local130][local404][local324] = local14;
										}
									}
								}
							}
						}
						Static419.aByteArrayArrayArray17[local130][local71][local93] = local14;
						local126 = true;
					}
				}
				if (local126) {
					local168 = Static241.aClass22Array3[Static204.anInt3498 + 1].ua(local71, local93);
					if (Static202.anIntArray290[arg2] < local168) {
						Static202.anIntArray290[arg2] = local168;
					}
					local207 = local71 << 7;
					if (Static197.anIntArray283[arg2] > local207) {
						Static197.anIntArray283[arg2] = local207;
					} else if (Static318.anIntArray479[arg2] < local207) {
						Static318.anIntArray479[arg2] = local207;
					}
					@Pc(516) int local516 = local93 << 7;
					if (local516 < Static285.anIntArray428[arg2]) {
						Static285.anIntArray428[arg2] = local516;
					} else if (local516 > Static102.anIntArray109[arg2]) {
						Static102.anIntArray109[arg2] = local516;
					}
				}
				if (!local109) {
					if (local71 >= 1 && Static419.aByteArrayArrayArray17[Static204.anInt3498][local71 - 1][local93] != local14) {
						Static58.anIntArray77[local53] = local71 - 1 | 0x120000 | 0xD3000000;
						Static96.anIntArray107[local53] = local93 | 0x130000;
						local53 = local53 + 1 & 0xFFF;
						Static419.aByteArrayArrayArray17[Static204.anInt3498][local71 - 1][local93] = local14;
					}
					local93++;
					if (local93 < Static371.anInt6492) {
						if (local71 - 1 >= 0 && local14 != Static419.aByteArrayArrayArray17[Static204.anInt3498][local71 - 1][local93] && (Static326.aByteArrayArrayArray15[Static204.anInt3498][local71][local93] & 0x4) == 0 && (Static326.aByteArrayArrayArray15[Static204.anInt3498][local71 - 1][local93 - 1] & 0x4) == 0) {
							Static58.anIntArray77[local53] = local71 - 1 | 0x120000 | 0x52000000;
							Static96.anIntArray107[local53] = local93 | 0x130000;
							local53 = local53 + 1 & 0xFFF;
							Static419.aByteArrayArrayArray17[Static204.anInt3498][local71 - 1][local93] = local14;
						}
						if (local14 != Static419.aByteArrayArrayArray17[Static204.anInt3498][local71][local93]) {
							Static58.anIntArray77[local53] = local71 | 0x520000 | 0x13000000;
							Static96.anIntArray107[local53] = local93 | 0x530000;
							Static419.aByteArrayArrayArray17[Static204.anInt3498][local71][local93] = local14;
							local53 = local53 + 1 & 0xFFF;
						}
						if (local71 + 1 < Static234.anInt3949 && local14 != Static419.aByteArrayArrayArray17[Static204.anInt3498][local71 + 1][local93] && (Static326.aByteArrayArrayArray15[Static204.anInt3498][local71][local93] & 0x4) == 0 && (Static326.aByteArrayArrayArray15[Static204.anInt3498][local71 + 1][local93 - 1] & 0x4) == 0) {
							Static58.anIntArray77[local53] = local71 + 1 | 0x92000000 | 0x520000;
							Static96.anIntArray107[local53] = local93 | 0x530000;
							local53 = local53 + 1 & 0xFFF;
							Static419.aByteArrayArrayArray17[Static204.anInt3498][local71 + 1][local93] = local14;
						}
					}
					local93--;
					if (local71 + 1 < Static234.anInt3949 && local14 != Static419.aByteArrayArrayArray17[Static204.anInt3498][local71 + 1][local93]) {
						Static58.anIntArray77[local53] = 0x53000000 | 0x920000 | local71 + 1;
						Static96.anIntArray107[local53] = local93 | 0x930000;
						local53 = local53 + 1 & 0xFFF;
						Static419.aByteArrayArrayArray17[Static204.anInt3498][local71 + 1][local93] = local14;
					}
					local93--;
					if (local93 >= 0) {
						if (local71 - 1 >= 0 && Static419.aByteArrayArrayArray17[Static204.anInt3498][local71 - 1][local93] != local14 && (Static326.aByteArrayArrayArray15[Static204.anInt3498][local71][local93] & 0x4) == 0 && (Static326.aByteArrayArrayArray15[Static204.anInt3498][local71 - 1][local93 + 1] & 0x4) == 0) {
							Static58.anIntArray77[local53] = local71 - 1 | 0xD20000 | 0x12000000;
							Static96.anIntArray107[local53] = local93 | 0xD30000;
							local53 = local53 + 1 & 0xFFF;
							Static419.aByteArrayArrayArray17[Static204.anInt3498][local71 - 1][local93] = local14;
						}
						if (Static419.aByteArrayArrayArray17[Static204.anInt3498][local71][local93] != local14) {
							Static58.anIntArray77[local53] = local71 | 0xD20000 | 0x93000000;
							Static96.anIntArray107[local53] = local93 | 0xD30000;
							local53 = local53 + 1 & 0xFFF;
							Static419.aByteArrayArrayArray17[Static204.anInt3498][local71][local93] = local14;
						}
						if (local71 + 1 < Static234.anInt3949 && local14 != Static419.aByteArrayArrayArray17[Static204.anInt3498][local71 + 1][local93] && (Static326.aByteArrayArrayArray15[Static204.anInt3498][local71][local93] & 0x4) == 0 && (Static326.aByteArrayArrayArray15[Static204.anInt3498][local71 + 1][local93 + 1] & 0x4) == 0) {
							Static58.anIntArray77[local53] = local71 + 1 | 0x920000 | 0xD2000000;
							Static96.anIntArray107[local53] = local93 | 0x930000;
							local53 = local53 + 1 & 0xFFF;
							Static419.aByteArrayArrayArray17[Static204.anInt3498][local71 + 1][local93] = local14;
						}
					}
				}
			}
			if (Static202.anIntArray290[arg2] != -1000000) {
				Static202.anIntArray290[arg2] += 10;
				Static197.anIntArray283[arg2] -= 50;
				Static318.anIntArray479[arg2] += 50;
				Static102.anIntArray109[arg2] += 50;
				Static285.anIntArray428[arg2] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZII)Lclient!gi;")
	public static Class93 method566(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class93 local11 = Static160.method2380(arg1);
		if (arg0 == -1) {
			return local11;
		} else if (local11 == null || local11.aClass93Array1 == null || arg0 >= local11.aClass93Array1.length) {
			return null;
		} else {
			return local11.aClass93Array1[arg0];
		}
	}
}
