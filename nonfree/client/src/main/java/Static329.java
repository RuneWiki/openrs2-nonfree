import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!vf", name = "eb", descriptor = "F")
	public static float aFloat85;

	@OriginalMember(owner = "client!vf", name = "gb", descriptor = "Lclient!dp;")
	public static Class53 aClass53_150;

	@OriginalMember(owner = "client!vf", name = "bb", descriptor = "[I")
	public static final int[] anIntArray695 = new int[14];

	@OriginalMember(owner = "client!vf", name = "cb", descriptor = "I")
	public static int anInt6094 = 0;

	@OriginalMember(owner = "client!vf", name = "db", descriptor = "I")
	public static int anInt6095 = 0;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(II[[[Lclient!sk;ZIB)Z")
	public static boolean method5490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class187[][][] arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(14) byte local14 = arg3 ? 1 : (byte) (Static138.anInt4577 & 0xFF);
		if (Static37.aByteArrayArrayArray2[Static343.anInt6225][arg0][arg1] == local14) {
			return false;
		} else if ((Static265.aByteArrayArrayArray11[Static343.anInt6225][arg0][arg1] & 0x4) == 0) {
			return false;
		} else {
			@Pc(46) byte local46 = 0;
			@Pc(48) int local48 = 0;
			Static49.anIntArray109[0] = arg0;
			@Pc(55) int local55 = local46 + 1;
			Static77.anIntArray155[0] = arg1;
			Static37.aByteArrayArrayArray2[Static343.anInt6225][arg0][arg1] = local14;
			while (local48 != local55) {
				@Pc(73) int local73 = Static49.anIntArray109[local48] & 0xFFFF;
				@Pc(81) int local81 = Static49.anIntArray109[local48] >> 16 & 0xFF;
				@Pc(89) int local89 = Static49.anIntArray109[local48] >> 24 & 0xFF;
				@Pc(95) int local95 = Static77.anIntArray155[local48] & 0xFFFF;
				@Pc(103) int local103 = Static77.anIntArray155[local48] >> 16 & 0xFF;
				local48 = local48 + 1 & 0xFFF;
				@Pc(111) boolean local111 = false;
				if ((Static265.aByteArrayArrayArray11[Static343.anInt6225][local73][local95] & 0x4) == 0) {
					local111 = true;
				}
				@Pc(125) boolean local125 = false;
				@Pc(164) int local164;
				@Pc(210) int local210;
				label231: for (@Pc(129) int local129 = Static343.anInt6225 + 1; local129 <= 3; local129++) {
					if ((Static265.aByteArrayArrayArray11[local129][local73][local95] & 0x8) == 0) {
						@Pc(312) Class44_Sub4 local312;
						@Pc(322) int local322;
						@Pc(301) Class187 local301;
						@Pc(307) Class214 local307;
						if (local111 && arg2[local129][local73][local95] != null) {
							if (arg2[local129][local73][local95].aClass44_Sub5_1 != null) {
								local164 = Static98.method2030(local81);
								if (local164 == arg2[local129][local73][local95].aClass44_Sub5_1.anInt5411 || arg2[local129][local73][local95].aClass44_Sub5_2 != null && local164 == arg2[local129][local73][local95].aClass44_Sub5_2.anInt5411) {
									continue;
								}
								if (local89 != 0) {
									local210 = Static98.method2030(local89);
									if (arg2[local129][local73][local95].aClass44_Sub5_1.anInt5411 == local210 || arg2[local129][local73][local95].aClass44_Sub5_2 != null && arg2[local129][local73][local95].aClass44_Sub5_2.anInt5411 == local210) {
										continue;
									}
								}
								if (local103 != 0) {
									local210 = Static98.method2030(local103);
									if (local210 == arg2[local129][local73][local95].aClass44_Sub5_1.anInt5411 || arg2[local129][local73][local95].aClass44_Sub5_2 != null && local210 == arg2[local129][local73][local95].aClass44_Sub5_2.anInt5411) {
										continue;
									}
								}
							}
							local301 = arg2[local129][local73][local95];
							if (local301.aClass214_19 != null) {
								for (local307 = local301.aClass214_19; local307 != null; local307 = local307.aClass214_21) {
									local312 = local307.aClass44_Sub4_1;
									if (local312 instanceof Interface7) {
										@Pc(318) Interface7 local318 = (Interface7) local312;
										local322 = local318.method5795();
										if (local322 == 21) {
											local322 = 19;
										}
										@Pc(335) int local335 = local318.method5793();
										@Pc(341) int local341 = local322 | local335 << 6;
										if (local81 == local341 || local89 != 0 && local341 == local89 || local103 != 0 && local341 == local103) {
											continue label231;
										}
									}
								}
							}
						}
						local301 = arg2[local129][local73][local95];
						if (local301 != null && local301.aClass214_19 != null) {
							for (local307 = local301.aClass214_19; local307 != null; local307 = local307.aClass214_21) {
								local312 = local307.aClass44_Sub4_1;
								if (local312.aShort90 != local312.aShort87 || local312.aShort88 != local312.aShort89) {
									for (@Pc(406) int local406 = local312.aShort90; local406 <= local312.aShort87; local406++) {
										for (local322 = local312.aShort89; local322 <= local312.aShort88; local322++) {
											Static37.aByteArrayArrayArray2[local129][local406][local322] = local14;
										}
									}
								}
							}
						}
						local125 = true;
						Static37.aByteArrayArrayArray2[local129][local73][local95] = local14;
					}
				}
				if (local125) {
					local164 = Static203.aClass106Array3[Static343.anInt6225 + 1].method5720(local73, local95);
					if (local164 > Static326.anIntArray687[arg4]) {
						Static326.anIntArray687[arg4] = local164;
					}
					local210 = local73 << 7;
					@Pc(486) int local486 = local95 << 7;
					if (local210 < Static102.anIntArray566[arg4]) {
						Static102.anIntArray566[arg4] = local210;
					} else if (Static22.anIntArray36[arg4] < local210) {
						Static22.anIntArray36[arg4] = local210;
					}
					if (Static247.anIntArray485[arg4] > local486) {
						Static247.anIntArray485[arg4] = local486;
					} else if (Static36.anIntArray86[arg4] < local486) {
						Static36.anIntArray86[arg4] = local486;
					}
				}
				if (!local111) {
					if (local73 >= 1 && local14 != Static37.aByteArrayArrayArray2[Static343.anInt6225][local73 - 1][local95]) {
						Static49.anIntArray109[local55] = local73 - 1 | 0x120000 | 0xD3000000;
						Static77.anIntArray155[local55] = local95 | 0x130000;
						local55 = local55 + 1 & 0xFFF;
						Static37.aByteArrayArrayArray2[Static343.anInt6225][local73 - 1][local95] = local14;
					}
					@Pc(591) int local591 = ~Static246.anInt4606;
					local95++;
					if (local591 < ~local95) {
						if (local73 - 1 >= 0 && Static37.aByteArrayArrayArray2[Static343.anInt6225][local73 - 1][local95] != local14 && (Static265.aByteArrayArrayArray11[Static343.anInt6225][local73][local95] & 0x4) == 0 && (Static265.aByteArrayArrayArray11[Static343.anInt6225][local73 - 1][local95 - 1] & 0x4) == 0) {
							Static49.anIntArray109[local55] = local73 - 1 | 0x52000000 | 0x120000;
							Static77.anIntArray155[local55] = local95 | 0x130000;
							Static37.aByteArrayArrayArray2[Static343.anInt6225][local73 - 1][local95] = local14;
							local55 = local55 + 1 & 0xFFF;
						}
						if (Static37.aByteArrayArrayArray2[Static343.anInt6225][local73][local95] != local14) {
							Static49.anIntArray109[local55] = local73 | 0x520000 | 0x13000000;
							Static77.anIntArray155[local55] = local95 | 0x530000;
							local55 = local55 + 1 & 0xFFF;
							Static37.aByteArrayArrayArray2[Static343.anInt6225][local73][local95] = local14;
						}
						if (Static153.anInt2883 > local73 + 1 && Static37.aByteArrayArrayArray2[Static343.anInt6225][local73 + 1][local95] != local14 && (Static265.aByteArrayArrayArray11[Static343.anInt6225][local73][local95] & 0x4) == 0 && (Static265.aByteArrayArrayArray11[Static343.anInt6225][local73 + 1][local95 - 1] & 0x4) == 0) {
							Static49.anIntArray109[local55] = local73 + 1 | 0x92000000 | 0x520000;
							Static77.anIntArray155[local55] = local95 | 0x530000;
							Static37.aByteArrayArrayArray2[Static343.anInt6225][local73 + 1][local95] = local14;
							local55 = local55 + 1 & 0xFFF;
						}
					}
					local95--;
					if (local73 + 1 < Static153.anInt2883 && Static37.aByteArrayArrayArray2[Static343.anInt6225][local73 + 1][local95] != local14) {
						Static49.anIntArray109[local55] = 0x53000000 | 0x920000 | local73 + 1;
						Static77.anIntArray155[local55] = local95 | 0x930000;
						local55 = local55 + 1 & 0xFFF;
						Static37.aByteArrayArrayArray2[Static343.anInt6225][local73 + 1][local95] = local14;
					}
					local95--;
					if (local95 >= 0) {
						if (local73 - 1 >= 0 && Static37.aByteArrayArrayArray2[Static343.anInt6225][local73 - 1][local95] != local14 && (Static265.aByteArrayArrayArray11[Static343.anInt6225][local73][local95] & 0x4) == 0 && (Static265.aByteArrayArrayArray11[Static343.anInt6225][local73 - 1][local95 + 1] & 0x4) == 0) {
							Static49.anIntArray109[local55] = local73 - 1 | 0xD20000 | 0x12000000;
							Static77.anIntArray155[local55] = local95 | 0xD30000;
							Static37.aByteArrayArrayArray2[Static343.anInt6225][local73 - 1][local95] = local14;
							local55 = local55 + 1 & 0xFFF;
						}
						if (Static37.aByteArrayArrayArray2[Static343.anInt6225][local73][local95] != local14) {
							Static49.anIntArray109[local55] = local73 | 0x93000000 | 0xD20000;
							Static77.anIntArray155[local55] = local95 | 0xD30000;
							local55 = local55 + 1 & 0xFFF;
							Static37.aByteArrayArrayArray2[Static343.anInt6225][local73][local95] = local14;
						}
						if (Static153.anInt2883 > local73 + 1 && Static37.aByteArrayArrayArray2[Static343.anInt6225][local73 + 1][local95] != local14 && (Static265.aByteArrayArrayArray11[Static343.anInt6225][local73][local95] & 0x4) == 0 && (Static265.aByteArrayArrayArray11[Static343.anInt6225][local73 + 1][local95 + 1] & 0x4) == 0) {
							Static49.anIntArray109[local55] = 0xD2000000 | 0x920000 | local73 + 1;
							Static77.anIntArray155[local55] = local95 | 0x930000;
							local55 = local55 + 1 & 0xFFF;
							Static37.aByteArrayArrayArray2[Static343.anInt6225][local73 + 1][local95] = local14;
						}
					}
				}
			}
			if (Static326.anIntArray687[arg4] != -1000000) {
				Static326.anIntArray687[arg4] += 10;
				Static102.anIntArray566[arg4] -= 50;
				Static22.anIntArray36[arg4] += 50;
				Static36.anIntArray86[arg4] += 50;
				Static247.anIntArray485[arg4] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IBIIZ[Lclient!mb;)V")
	public static void method5492(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class132[] arg4) {
		for (@Pc(11) int local11 = 0; local11 < arg4.length; local11++) {
			@Pc(17) Class132 local17 = arg4[local11];
			if (local17 != null && arg2 == local17.anInt3500) {
				Static118.method2412(arg0, arg3, arg1, local17);
				Static177.method3432(local17, arg0, arg1);
				if (local17.anInt3528 - local17.anInt3507 < local17.anInt3522) {
					local17.anInt3522 = local17.anInt3528 - local17.anInt3507;
				}
				if (local17.anInt3566 - local17.anInt3503 < local17.anInt3578) {
					local17.anInt3578 = local17.anInt3566 - local17.anInt3503;
				}
				if (local17.anInt3522 < 0) {
					local17.anInt3522 = 0;
				}
				if (local17.anInt3578 < 0) {
					local17.anInt3578 = 0;
				}
				if (local17.anInt3524 == 0) {
					Static189.method3558(local17, arg3);
				}
			}
		}
	}
}
