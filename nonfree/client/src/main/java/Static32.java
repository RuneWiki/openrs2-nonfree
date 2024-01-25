import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!b", name = "A", descriptor = "I")
	public static int anInt960;

	@OriginalMember(owner = "client!b", name = "gb", descriptor = "Lclient!od;")
	public static Class3_Sub6_Sub16 aClass3_Sub6_Sub16_1;

	@OriginalMember(owner = "client!b", name = "rb", descriptor = "[I")
	public static final int[] anIntArray32 = new int[32];

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIZI[[[Lclient!ni;)Z")
	public static boolean method1022(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) Class247[][][] arg4) {
		@Pc(19) byte local19 = arg3 ? 1 : (byte) (Static156.anInt5851 & 0xFF);
		if (Static588.aByteArrayArrayArray18[Static576.anInt9136][arg0][arg2] == local19) {
			return false;
		} else if ((Static338.aByteArrayArrayArray13[Static576.anInt9136][arg0][arg2] & 0x4) == 0) {
			return false;
		} else {
			@Pc(44) byte local44 = 0;
			@Pc(46) int local46 = 0;
			Static436.anIntArray457[0] = arg0;
			@Pc(53) int local53 = local44 + 1;
			Static456.anIntArray474[0] = arg2;
			Static588.aByteArrayArrayArray18[Static576.anInt9136][arg0][arg2] = local19;
			while (local53 != local46) {
				@Pc(71) int local71 = Static436.anIntArray457[local46] & 0xFFFF;
				@Pc(79) int local79 = Static436.anIntArray457[local46] >> 16 & 0xFF;
				@Pc(87) int local87 = Static436.anIntArray457[local46] >> 24 & 0xFF;
				@Pc(93) int local93 = Static456.anIntArray474[local46] & 0xFFFF;
				@Pc(101) int local101 = Static456.anIntArray474[local46] >> 16 & 0xFF;
				local46 = local46 + 1 & 0xFFF;
				@Pc(109) boolean local109 = false;
				if ((Static338.aByteArrayArrayArray13[Static576.anInt9136][local71][local93] & 0x4) == 0) {
					local109 = true;
				}
				@Pc(123) boolean local123 = false;
				@Pc(129) int local129;
				@Pc(171) int local171;
				@Pc(213) int local213;
				if (arg4 != null) {
					label237: for (local129 = Static576.anInt9136 + 1; local129 <= 3; local129++) {
						if (arg4[local129] != null && (Static338.aByteArrayArrayArray13[local129][local71][local93] & 0x8) == 0) {
							@Pc(315) Class23_Sub2_Sub1 local315;
							@Pc(325) int local325;
							@Pc(304) Class247 local304;
							@Pc(310) Class85 local310;
							if (local109 && arg4[local129][local71][local93] != null) {
								if (arg4[local129][local71][local93].aClass23_Sub2_Sub5_1 != null) {
									local171 = Static481.method6842(local79);
									if (local171 == arg4[local129][local71][local93].aClass23_Sub2_Sub5_1.aShort111 || arg4[local129][local71][local93].aClass23_Sub2_Sub5_2 != null && arg4[local129][local71][local93].aClass23_Sub2_Sub5_2.aShort111 == local171) {
										continue;
									}
									if (local87 != 0) {
										local213 = Static481.method6842(local87);
										if (local213 == arg4[local129][local71][local93].aClass23_Sub2_Sub5_1.aShort111 || arg4[local129][local71][local93].aClass23_Sub2_Sub5_2 != null && local213 == arg4[local129][local71][local93].aClass23_Sub2_Sub5_2.aShort111) {
											continue;
										}
									}
									if (local101 != 0) {
										local213 = Static481.method6842(local101);
										if (arg4[local129][local71][local93].aClass23_Sub2_Sub5_1.aShort111 == local213 || arg4[local129][local71][local93].aClass23_Sub2_Sub5_2 != null && local213 == arg4[local129][local71][local93].aClass23_Sub2_Sub5_2.aShort111) {
											continue;
										}
									}
								}
								local304 = arg4[local129][local71][local93];
								if (local304.aClass85_3 != null) {
									for (local310 = local304.aClass85_3; local310 != null; local310 = local310.aClass85_1) {
										local315 = local310.aClass23_Sub2_Sub1_1;
										if (local315 instanceof Interface2) {
											@Pc(321) Interface2 local321 = (Interface2) local315;
											local325 = local321.method7824();
											if (local325 == 21) {
												local325 = 19;
											}
											@Pc(336) int local336 = local321.method7827();
											@Pc(342) int local342 = local325 | local336 << 6;
											if (local79 == local342 || local87 != 0 && local342 == local87 || local101 != 0 && local342 == local101) {
												continue label237;
											}
										}
									}
								}
							}
							local304 = arg4[local129][local71][local93];
							if (local304 != null && local304.aClass85_3 != null) {
								for (local310 = local304.aClass85_3; local310 != null; local310 = local310.aClass85_1) {
									local315 = local310.aClass23_Sub2_Sub1_1;
									if (local315.aShort123 != local315.aShort125 || local315.aShort122 != local315.aShort124) {
										for (@Pc(418) int local418 = local315.aShort123; local418 <= local315.aShort125; local418++) {
											for (local325 = local315.aShort124; local325 <= local315.aShort122; local325++) {
												Static588.aByteArrayArrayArray18[local129][local418][local325] = local19;
											}
										}
									}
								}
							}
							local123 = true;
							Static588.aByteArrayArrayArray18[local129][local71][local93] = local19;
						}
					}
				}
				if (local123) {
					local129 = Static343.aClass104Array2[Static576.anInt9136 + 1].method8279(local93, local71);
					if (Static112.anIntArray151[arg1] < local129) {
						Static112.anIntArray151[arg1] = local129;
					}
					local171 = local71 << 9;
					if (Static457.anIntArray475[arg1] > local171) {
						Static457.anIntArray475[arg1] = local171;
					} else if (Static384.anIntArray26[arg1] < local171) {
						Static384.anIntArray26[arg1] = local171;
					}
					local213 = local93 << 9;
					if (Static676.anIntArray669[arg1] > local213) {
						Static676.anIntArray669[arg1] = local213;
					} else if (local213 > Static309.anIntArray373[arg1]) {
						Static309.anIntArray373[arg1] = local213;
					}
				}
				if (!local109) {
					if (local71 >= 1 && Static588.aByteArrayArrayArray18[Static576.anInt9136][local71 - 1][local93] != local19) {
						Static436.anIntArray457[local53] = 0xD3000000 | 0x120000 | local71 - 1;
						Static456.anIntArray474[local53] = local93 | 0x130000;
						Static588.aByteArrayArrayArray18[Static576.anInt9136][local71 - 1][local93] = local19;
						local53 = local53 + 1 & 0xFFF;
					}
					@Pc(594) int local594 = ~Static406.anInt6924;
					local93++;
					if (local594 < ~local93) {
						if (local71 - 1 >= 0 && Static588.aByteArrayArrayArray18[Static576.anInt9136][local71 - 1][local93] != local19 && (Static338.aByteArrayArrayArray13[Static576.anInt9136][local71][local93] & 0x4) == 0 && (Static338.aByteArrayArrayArray13[Static576.anInt9136][local71 - 1][local93 - 1] & 0x4) == 0) {
							Static436.anIntArray457[local53] = 0x52000000 | 0x120000 | local71 - 1;
							Static456.anIntArray474[local53] = local93 | 0x130000;
							local53 = local53 + 1 & 0xFFF;
							Static588.aByteArrayArrayArray18[Static576.anInt9136][local71 - 1][local93] = local19;
						}
						if (Static588.aByteArrayArrayArray18[Static576.anInt9136][local71][local93] != local19) {
							Static436.anIntArray457[local53] = local71 | 0x13000000 | 0x520000;
							Static456.anIntArray474[local53] = local93 | 0x530000;
							Static588.aByteArrayArrayArray18[Static576.anInt9136][local71][local93] = local19;
							local53 = local53 + 1 & 0xFFF;
						}
						if (local71 + 1 < Static251.anInt4680 && Static588.aByteArrayArrayArray18[Static576.anInt9136][local71 + 1][local93] != local19 && (Static338.aByteArrayArrayArray13[Static576.anInt9136][local71][local93] & 0x4) == 0 && (Static338.aByteArrayArrayArray13[Static576.anInt9136][local71 + 1][local93 - 1] & 0x4) == 0) {
							Static436.anIntArray457[local53] = local71 + 1 | 0x520000 | 0x92000000;
							Static456.anIntArray474[local53] = local93 | 0x530000;
							Static588.aByteArrayArrayArray18[Static576.anInt9136][local71 + 1][local93] = local19;
							local53 = local53 + 1 & 0xFFF;
						}
					}
					local93--;
					if (local71 + 1 < Static251.anInt4680 && Static588.aByteArrayArrayArray18[Static576.anInt9136][local71 + 1][local93] != local19) {
						Static436.anIntArray457[local53] = local71 + 1 | 0x920000 | 0x53000000;
						Static456.anIntArray474[local53] = local93 | 0x930000;
						local53 = local53 + 1 & 0xFFF;
						Static588.aByteArrayArrayArray18[Static576.anInt9136][local71 + 1][local93] = local19;
					}
					local93--;
					if (local93 >= 0) {
						if (local71 - 1 >= 0 && Static588.aByteArrayArrayArray18[Static576.anInt9136][local71 - 1][local93] != local19 && (Static338.aByteArrayArrayArray13[Static576.anInt9136][local71][local93] & 0x4) == 0 && (Static338.aByteArrayArrayArray13[Static576.anInt9136][local71 - 1][local93 + 1] & 0x4) == 0) {
							Static436.anIntArray457[local53] = local71 - 1 | 0xD20000 | 0x12000000;
							Static456.anIntArray474[local53] = local93 | 0xD30000;
							Static588.aByteArrayArrayArray18[Static576.anInt9136][local71 - 1][local93] = local19;
							local53 = local53 + 1 & 0xFFF;
						}
						if (local19 != Static588.aByteArrayArrayArray18[Static576.anInt9136][local71][local93]) {
							Static436.anIntArray457[local53] = local71 | 0xD20000 | 0x93000000;
							Static456.anIntArray474[local53] = local93 | 0xD30000;
							local53 = local53 + 1 & 0xFFF;
							Static588.aByteArrayArrayArray18[Static576.anInt9136][local71][local93] = local19;
						}
						if (Static251.anInt4680 > local71 + 1 && Static588.aByteArrayArrayArray18[Static576.anInt9136][local71 + 1][local93] != local19 && (Static338.aByteArrayArrayArray13[Static576.anInt9136][local71][local93] & 0x4) == 0 && (Static338.aByteArrayArrayArray13[Static576.anInt9136][local71 + 1][local93 + 1] & 0x4) == 0) {
							Static436.anIntArray457[local53] = local71 + 1 | 0xD2000000 | 0x920000;
							Static456.anIntArray474[local53] = local93 | 0x930000;
							local53 = local53 + 1 & 0xFFF;
							Static588.aByteArrayArrayArray18[Static576.anInt9136][local71 + 1][local93] = local19;
						}
					}
				}
			}
			if (Static112.anIntArray151[arg1] != -1000000) {
				Static112.anIntArray151[arg1] += 40;
				Static457.anIntArray475[arg1] -= 512;
				Static384.anIntArray26[arg1] += 512;
				Static309.anIntArray373[arg1] += 512;
				Static676.anIntArray669[arg1] -= 512;
			}
			return true;
		}
	}
}
