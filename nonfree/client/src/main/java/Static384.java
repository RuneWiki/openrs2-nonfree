import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static384 {

	@OriginalMember(owner = "client!om", name = "q", descriptor = "Lclient!om;")
	public static Class246 aClass246_184;

	@OriginalMember(owner = "client!om", name = "p", descriptor = "I")
	public static int anInt6605 = 0;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(I)J")
	public static long method5650() {
		return Static270.aClass77_1.method7581();
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IZZ[[[Lclient!df;II)Z")
	public static boolean method5671(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class63[][][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(19) byte local19 = arg1 ? 1 : (byte) (Static337.anInt5983 & 0xFF);
		if (local19 == Static55.aByteArrayArrayArray2[Static209.anInt8182][arg0][arg3]) {
			return false;
		} else if ((Static154.aByteArrayArrayArray15[Static209.anInt8182][arg0][arg3] & 0x4) == 0) {
			return false;
		} else {
			@Pc(44) byte local44 = 0;
			@Pc(46) int local46 = 0;
			Static173.anIntArray292[0] = arg0;
			@Pc(53) int local53 = local44 + 1;
			Static326.anIntArray454[0] = arg3;
			Static55.aByteArrayArrayArray2[Static209.anInt8182][arg0][arg3] = local19;
			while (local46 != local53) {
				@Pc(71) int local71 = Static173.anIntArray292[local46] & 0xFFFF;
				@Pc(79) int local79 = Static173.anIntArray292[local46] >> 16 & 0xFF;
				@Pc(87) int local87 = Static173.anIntArray292[local46] >> 24 & 0xFF;
				@Pc(93) int local93 = Static326.anIntArray454[local46] & 0xFFFF;
				@Pc(101) int local101 = Static326.anIntArray454[local46] >> 16 & 0xFF;
				local46 = local46 + 1 & 0xFFF;
				@Pc(109) boolean local109 = false;
				if ((Static154.aByteArrayArrayArray15[Static209.anInt8182][local71][local93] & 0x4) == 0) {
					local109 = true;
				}
				@Pc(126) boolean local126 = false;
				@Pc(168) int local168;
				@Pc(214) int local214;
				label231: for (@Pc(130) int local130 = Static209.anInt8182 + 1; local130 <= 3; local130++) {
					if ((Static154.aByteArrayArrayArray15[local130][local71][local93] & 0x8) == 0) {
						@Pc(317) Class9_Sub1_Sub1 local317;
						@Pc(327) int local327;
						@Pc(306) Class63 local306;
						@Pc(312) Class16 local312;
						if (local109 && arg2[local130][local71][local93] != null) {
							if (arg2[local130][local71][local93].aClass9_Sub1_Sub4_1 != null) {
								local168 = Static323.method7768(local79);
								if (local168 == arg2[local130][local71][local93].aClass9_Sub1_Sub4_1.aShort103 || arg2[local130][local71][local93].aClass9_Sub1_Sub4_2 != null && arg2[local130][local71][local93].aClass9_Sub1_Sub4_2.aShort103 == local168) {
									continue;
								}
								if (local87 != 0) {
									local214 = Static323.method7768(local87);
									if (local214 == arg2[local130][local71][local93].aClass9_Sub1_Sub4_1.aShort103 || arg2[local130][local71][local93].aClass9_Sub1_Sub4_2 != null && local214 == arg2[local130][local71][local93].aClass9_Sub1_Sub4_2.aShort103) {
										continue;
									}
								}
								if (local101 != 0) {
									local214 = Static323.method7768(local101);
									if (local214 == arg2[local130][local71][local93].aClass9_Sub1_Sub4_1.aShort103 || arg2[local130][local71][local93].aClass9_Sub1_Sub4_2 != null && arg2[local130][local71][local93].aClass9_Sub1_Sub4_2.aShort103 == local214) {
										continue;
									}
								}
							}
							local306 = arg2[local130][local71][local93];
							if (local306.aClass16_3 != null) {
								for (local312 = local306.aClass16_3; local312 != null; local312 = local312.aClass16_1) {
									local317 = local312.aClass9_Sub1_Sub1_1;
									if (local317 instanceof Interface22) {
										@Pc(323) Interface22 local323 = (Interface22) local317;
										local327 = local323.method7091();
										@Pc(331) int local331 = local323.method7093();
										if (local327 == 21) {
											local327 = 19;
										}
										@Pc(342) int local342 = local327 | local331 << 6;
										if (local79 == local342 || local87 != 0 && local87 == local342 || local101 != 0 && local342 == local101) {
											continue label231;
										}
									}
								}
							}
						}
						local306 = arg2[local130][local71][local93];
						if (local306 != null && local306.aClass16_3 != null) {
							for (local312 = local306.aClass16_3; local312 != null; local312 = local312.aClass16_1) {
								local317 = local312.aClass9_Sub1_Sub1_1;
								if (local317.aShort114 != local317.aShort112 || local317.aShort115 != local317.aShort113) {
									for (@Pc(414) int local414 = local317.aShort112; local414 <= local317.aShort114; local414++) {
										for (local327 = local317.aShort115; local327 <= local317.aShort113; local327++) {
											Static55.aByteArrayArrayArray2[local130][local414][local327] = local19;
										}
									}
								}
							}
						}
						local126 = true;
						Static55.aByteArrayArrayArray2[local130][local71][local93] = local19;
					}
				}
				if (local126) {
					local168 = Static29.aClass139Array6[Static209.anInt8182 + 1].method6889(local71, local93);
					if (local168 > Static76.anIntArray123[arg4]) {
						Static76.anIntArray123[arg4] = local168;
					}
					local214 = local71 << 9;
					if (local214 < Static368.anIntArray498[arg4]) {
						Static368.anIntArray498[arg4] = local214;
					} else if (Static334.anIntArray462[arg4] < local214) {
						Static334.anIntArray462[arg4] = local214;
					}
					@Pc(519) int local519 = local93 << 9;
					if (Static280.anIntArray383[arg4] > local519) {
						Static280.anIntArray383[arg4] = local519;
					} else if (local519 > Static336.anIntArray464[arg4]) {
						Static336.anIntArray464[arg4] = local519;
					}
				}
				if (!local109) {
					if (local71 >= 1 && local19 != Static55.aByteArrayArrayArray2[Static209.anInt8182][local71 - 1][local93]) {
						Static173.anIntArray292[local53] = local71 - 1 | 0x120000 | 0xD3000000;
						Static326.anIntArray454[local53] = local93 | 0x130000;
						Static55.aByteArrayArrayArray2[Static209.anInt8182][local71 - 1][local93] = local19;
						local53 = local53 + 1 & 0xFFF;
					}
					local93++;
					if (local93 < Static271.anInt5050) {
						if (local71 - 1 >= 0 && local19 != Static55.aByteArrayArrayArray2[Static209.anInt8182][local71 - 1][local93] && (Static154.aByteArrayArrayArray15[Static209.anInt8182][local71][local93] & 0x4) == 0 && (Static154.aByteArrayArrayArray15[Static209.anInt8182][local71 - 1][local93 - 1] & 0x4) == 0) {
							Static173.anIntArray292[local53] = local71 - 1 | 0x120000 | 0x52000000;
							Static326.anIntArray454[local53] = local93 | 0x130000;
							local53 = local53 + 1 & 0xFFF;
							Static55.aByteArrayArrayArray2[Static209.anInt8182][local71 - 1][local93] = local19;
						}
						if (Static55.aByteArrayArrayArray2[Static209.anInt8182][local71][local93] != local19) {
							Static173.anIntArray292[local53] = local71 | 0x520000 | 0x13000000;
							Static326.anIntArray454[local53] = local93 | 0x530000;
							local53 = local53 + 1 & 0xFFF;
							Static55.aByteArrayArrayArray2[Static209.anInt8182][local71][local93] = local19;
						}
						if (local71 + 1 < Static400.anInt6818 && Static55.aByteArrayArrayArray2[Static209.anInt8182][local71 + 1][local93] != local19 && (Static154.aByteArrayArrayArray15[Static209.anInt8182][local71][local93] & 0x4) == 0 && (Static154.aByteArrayArrayArray15[Static209.anInt8182][local71 + 1][local93 - 1] & 0x4) == 0) {
							Static173.anIntArray292[local53] = local71 + 1 | 0x520000 | 0x92000000;
							Static326.anIntArray454[local53] = local93 | 0x530000;
							Static55.aByteArrayArrayArray2[Static209.anInt8182][local71 + 1][local93] = local19;
							local53 = local53 + 1 & 0xFFF;
						}
					}
					local93--;
					if (Static400.anInt6818 > local71 + 1 && Static55.aByteArrayArrayArray2[Static209.anInt8182][local71 + 1][local93] != local19) {
						Static173.anIntArray292[local53] = local71 + 1 | 0x920000 | 0x53000000;
						Static326.anIntArray454[local53] = local93 | 0x930000;
						Static55.aByteArrayArrayArray2[Static209.anInt8182][local71 + 1][local93] = local19;
						local53 = local53 + 1 & 0xFFF;
					}
					local93--;
					if (local93 >= 0) {
						if (local71 - 1 >= 0 && Static55.aByteArrayArrayArray2[Static209.anInt8182][local71 - 1][local93] != local19 && (Static154.aByteArrayArrayArray15[Static209.anInt8182][local71][local93] & 0x4) == 0 && (Static154.aByteArrayArrayArray15[Static209.anInt8182][local71 - 1][local93 + 1] & 0x4) == 0) {
							Static173.anIntArray292[local53] = local71 - 1 | 0xD20000 | 0x12000000;
							Static326.anIntArray454[local53] = local93 | 0xD30000;
							local53 = local53 + 1 & 0xFFF;
							Static55.aByteArrayArrayArray2[Static209.anInt8182][local71 - 1][local93] = local19;
						}
						if (local19 != Static55.aByteArrayArrayArray2[Static209.anInt8182][local71][local93]) {
							Static173.anIntArray292[local53] = local71 | 0xD20000 | 0x93000000;
							Static326.anIntArray454[local53] = local93 | 0xD30000;
							local53 = local53 + 1 & 0xFFF;
							Static55.aByteArrayArrayArray2[Static209.anInt8182][local71][local93] = local19;
						}
						if (local71 + 1 < Static400.anInt6818 && Static55.aByteArrayArrayArray2[Static209.anInt8182][local71 + 1][local93] != local19 && (Static154.aByteArrayArrayArray15[Static209.anInt8182][local71][local93] & 0x4) == 0 && (Static154.aByteArrayArrayArray15[Static209.anInt8182][local71 + 1][local93 + 1] & 0x4) == 0) {
							Static173.anIntArray292[local53] = local71 + 1 | 0xD2000000 | 0x920000;
							Static326.anIntArray454[local53] = local93 | 0x930000;
							local53 = local53 + 1 & 0xFFF;
							Static55.aByteArrayArrayArray2[Static209.anInt8182][local71 + 1][local93] = local19;
						}
					}
				}
			}
			if (Static76.anIntArray123[arg4] != -1000000) {
				Static76.anIntArray123[arg4] += 40;
				Static368.anIntArray498[arg4] -= 512;
				Static334.anIntArray462[arg4] += 512;
				Static336.anIntArray464[arg4] += 512;
				Static280.anIntArray383[arg4] -= 512;
			}
			return true;
		}
	}
}
