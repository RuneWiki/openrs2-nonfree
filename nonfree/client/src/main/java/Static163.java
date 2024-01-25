import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!hs", name = "w", descriptor = "Lclient!mj;")
	public static Class170 aClass170_2;

	@OriginalMember(owner = "client!hs", name = "A", descriptor = "I")
	public static int anInt3445;

	@OriginalMember(owner = "client!hs", name = "D", descriptor = "[[I")
	public static int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!hs", name = "l", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_49 = new Class177(31, 5);

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ZIIII[[[Lclient!ut;)Z")
	public static boolean method2682(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class252[][][] arg4) {
		@Pc(12) byte local12 = arg0 ? 1 : (byte) (Static140.anInt3086 & 0xFF);
		if (Static237.aByteArrayArrayArray15[Static426.anInt1486][arg1][arg2] == local12) {
			return false;
		} else if ((Static110.aByteArrayArrayArray20[Static426.anInt1486][arg1][arg2] & 0x4) == 0) {
			return false;
		} else {
			@Pc(44) byte local44 = 0;
			Static368.anIntArray619[0] = arg1;
			@Pc(50) int local50 = 0;
			@Pc(53) int local53 = local44 + 1;
			Static339.anIntArray582[0] = arg2;
			Static237.aByteArrayArrayArray15[Static426.anInt1486][arg1][arg2] = local12;
			while (local50 != local53) {
				@Pc(75) int local75 = Static368.anIntArray619[local50] & 0xFFFF;
				@Pc(83) int local83 = Static368.anIntArray619[local50] >> 16 & 0xFF;
				@Pc(91) int local91 = Static368.anIntArray619[local50] >> 24 & 0xFF;
				@Pc(97) int local97 = Static339.anIntArray582[local50] & 0xFFFF;
				@Pc(105) int local105 = Static339.anIntArray582[local50] >> 16 & 0xFF;
				local50 = local50 + 1 & 0xFFF;
				@Pc(113) boolean local113 = false;
				if ((Static110.aByteArrayArrayArray20[Static426.anInt1486][local75][local97] & 0x4) == 0) {
					local113 = true;
				}
				@Pc(130) boolean local130 = false;
				@Pc(171) int local171;
				@Pc(216) int local216;
				label231: for (@Pc(134) int local134 = Static426.anInt1486 + 1; local134 <= 3; local134++) {
					if ((Static110.aByteArrayArrayArray20[local134][local75][local97] & 0x8) == 0) {
						@Pc(312) Class30_Sub1 local312;
						@Pc(324) int local324;
						@Pc(302) Class252 local302;
						@Pc(308) Class208 local308;
						if (local113 && arg4[local134][local75][local97] != null) {
							if (arg4[local134][local75][local97].aClass30_Sub3_3 != null) {
								local171 = Static30.method571(local83);
								if (local171 == arg4[local134][local75][local97].aClass30_Sub3_3.anInt5441 || arg4[local134][local75][local97].aClass30_Sub3_2 != null && arg4[local134][local75][local97].aClass30_Sub3_2.anInt5441 == local171) {
									continue;
								}
								if (local91 != 0) {
									local216 = Static30.method571(local91);
									if (arg4[local134][local75][local97].aClass30_Sub3_3.anInt5441 == local216 || arg4[local134][local75][local97].aClass30_Sub3_2 != null && local216 == arg4[local134][local75][local97].aClass30_Sub3_2.anInt5441) {
										continue;
									}
								}
								if (local105 != 0) {
									local216 = Static30.method571(local105);
									if (arg4[local134][local75][local97].aClass30_Sub3_3.anInt5441 == local216 || arg4[local134][local75][local97].aClass30_Sub3_2 != null && local216 == arg4[local134][local75][local97].aClass30_Sub3_2.anInt5441) {
										continue;
									}
								}
							}
							local302 = arg4[local134][local75][local97];
							if (local302.aClass208_3 != null) {
								for (local308 = local302.aClass208_3; local308 != null; local308 = local308.aClass208_2) {
									local312 = local308.aClass30_Sub1_1;
									if (local312 instanceof Interface5) {
										@Pc(318) Interface5 local318 = (Interface5) local312;
										local324 = local318.method5727();
										if (local324 == 21) {
											local324 = 19;
										}
										@Pc(333) int local333 = local318.method5729();
										@Pc(339) int local339 = local324 | local333 << 6;
										if (local339 == local83 || local91 != 0 && local339 == local91 || local105 != 0 && local339 == local105) {
											continue label231;
										}
									}
								}
							}
						}
						local302 = arg4[local134][local75][local97];
						if (local302 != null && local302.aClass208_3 != null) {
							for (local308 = local302.aClass208_3; local308 != null; local308 = local308.aClass208_2) {
								local312 = local308.aClass30_Sub1_1;
								if (local312.aShort104 != local312.aShort105 || local312.aShort103 != local312.aShort102) {
									for (@Pc(402) int local402 = local312.aShort104; local402 <= local312.aShort105; local402++) {
										for (local324 = local312.aShort103; local324 <= local312.aShort102; local324++) {
											Static237.aByteArrayArrayArray15[local134][local402][local324] = local12;
										}
									}
								}
							}
						}
						Static237.aByteArrayArrayArray15[local134][local75][local97] = local12;
						local130 = true;
					}
				}
				if (local130) {
					local171 = Static396.aClass96Array5[Static426.anInt1486 + 1].ua(local75, local97);
					if (local171 > Static334.anIntArray577[arg3]) {
						Static334.anIntArray577[arg3] = local171;
					}
					local216 = local75 << 7;
					if (Static53.anIntArray133[arg3] > local216) {
						Static53.anIntArray133[arg3] = local216;
					} else if (Static203.anIntArray400[arg3] < local216) {
						Static203.anIntArray400[arg3] = local216;
					}
					@Pc(495) int local495 = local97 << 7;
					if (Static184.anIntArray385[arg3] > local495) {
						Static184.anIntArray385[arg3] = local495;
					} else if (local495 > Static1.anIntArray4[arg3]) {
						Static1.anIntArray4[arg3] = local495;
					}
				}
				if (!local113) {
					if (local75 >= 1 && Static237.aByteArrayArrayArray15[Static426.anInt1486][local75 - 1][local97] != local12) {
						Static368.anIntArray619[local53] = local75 - 1 | 0xD3000000 | 0x120000;
						Static339.anIntArray582[local53] = local97 | 0x130000;
						local53 = local53 + 1 & 0xFFF;
						Static237.aByteArrayArrayArray15[Static426.anInt1486][local75 - 1][local97] = local12;
					}
					local97++;
					if (Static211.anInt4295 > local97) {
						if (local75 - 1 >= 0 && local12 != Static237.aByteArrayArrayArray15[Static426.anInt1486][local75 - 1][local97] && (Static110.aByteArrayArrayArray20[Static426.anInt1486][local75][local97] & 0x4) == 0 && (Static110.aByteArrayArrayArray20[Static426.anInt1486][local75 - 1][local97 - 1] & 0x4) == 0) {
							Static368.anIntArray619[local53] = 0x52000000 | 0x120000 | local75 - 1;
							Static339.anIntArray582[local53] = local97 | 0x130000;
							Static237.aByteArrayArrayArray15[Static426.anInt1486][local75 - 1][local97] = local12;
							local53 = local53 + 1 & 0xFFF;
						}
						if (local12 != Static237.aByteArrayArrayArray15[Static426.anInt1486][local75][local97]) {
							Static368.anIntArray619[local53] = local75 | 0x520000 | 0x13000000;
							Static339.anIntArray582[local53] = local97 | 0x530000;
							local53 = local53 + 1 & 0xFFF;
							Static237.aByteArrayArrayArray15[Static426.anInt1486][local75][local97] = local12;
						}
						if (local75 + 1 < Static209.anInt4283 && local12 != Static237.aByteArrayArrayArray15[Static426.anInt1486][local75 + 1][local97] && (Static110.aByteArrayArrayArray20[Static426.anInt1486][local75][local97] & 0x4) == 0 && (Static110.aByteArrayArrayArray20[Static426.anInt1486][local75 + 1][local97 - 1] & 0x4) == 0) {
							Static368.anIntArray619[local53] = local75 + 1 | 0x92000000 | 0x520000;
							Static339.anIntArray582[local53] = local97 | 0x530000;
							Static237.aByteArrayArrayArray15[Static426.anInt1486][local75 + 1][local97] = local12;
							local53 = local53 + 1 & 0xFFF;
						}
					}
					local97--;
					if (local75 + 1 < Static209.anInt4283 && local12 != Static237.aByteArrayArrayArray15[Static426.anInt1486][local75 + 1][local97]) {
						Static368.anIntArray619[local53] = local75 + 1 | 0x920000 | 0x53000000;
						Static339.anIntArray582[local53] = local97 | 0x930000;
						local53 = local53 + 1 & 0xFFF;
						Static237.aByteArrayArrayArray15[Static426.anInt1486][local75 + 1][local97] = local12;
					}
					local97--;
					if (local97 >= 0) {
						if (local75 - 1 >= 0 && local12 != Static237.aByteArrayArrayArray15[Static426.anInt1486][local75 - 1][local97] && (Static110.aByteArrayArrayArray20[Static426.anInt1486][local75][local97] & 0x4) == 0 && (Static110.aByteArrayArrayArray20[Static426.anInt1486][local75 - 1][local97 + 1] & 0x4) == 0) {
							Static368.anIntArray619[local53] = local75 - 1 | 0xD20000 | 0x12000000;
							Static339.anIntArray582[local53] = local97 | 0xD30000;
							Static237.aByteArrayArrayArray15[Static426.anInt1486][local75 - 1][local97] = local12;
							local53 = local53 + 1 & 0xFFF;
						}
						if (local12 != Static237.aByteArrayArrayArray15[Static426.anInt1486][local75][local97]) {
							Static368.anIntArray619[local53] = 0x93000000 | 0xD20000 | local75;
							Static339.anIntArray582[local53] = local97 | 0xD30000;
							Static237.aByteArrayArrayArray15[Static426.anInt1486][local75][local97] = local12;
							local53 = local53 + 1 & 0xFFF;
						}
						if (local75 + 1 < Static209.anInt4283 && Static237.aByteArrayArrayArray15[Static426.anInt1486][local75 + 1][local97] != local12 && (Static110.aByteArrayArrayArray20[Static426.anInt1486][local75][local97] & 0x4) == 0 && (Static110.aByteArrayArrayArray20[Static426.anInt1486][local75 + 1][local97 + 1] & 0x4) == 0) {
							Static368.anIntArray619[local53] = local75 + 1 | 0xD2000000 | 0x920000;
							Static339.anIntArray582[local53] = local97 | 0x930000;
							Static237.aByteArrayArrayArray15[Static426.anInt1486][local75 + 1][local97] = local12;
							local53 = local53 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static334.anIntArray577[arg3] != -1000000) {
				Static334.anIntArray577[arg3] += 10;
				Static53.anIntArray133[arg3] -= 50;
				Static203.anIntArray400[arg3] += 50;
				Static1.anIntArray4[arg3] += 50;
				Static184.anIntArray385[arg3] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(III)V")
	public static void method2685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class252 local7 = Static67.aClass252ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass30_Sub2_2 != null) {
			local7.aClass30_Sub2_2 = null;
		}
		if (local7.aClass30_Sub2_3 != null) {
			local7.aClass30_Sub2_3 = null;
		}
	}
}
