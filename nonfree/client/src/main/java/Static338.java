import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!mp", name = "m", descriptor = "I")
	public static int anInt5645;

	@OriginalMember(owner = "client!mp", name = "q", descriptor = "Lclient!q;")
	public static Class11 aClass11_4;

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IBI)I")
	public static int method4799(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "([[[Lclient!ru;IBZII)Z")
	public static boolean method4800(@OriginalArg(0) Class299[][][] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) byte local14 = arg2 ? 1 : (byte) (Static81.anInt1761 & 0xFF);
		if (Static45.aByteArrayArrayArray8[Static117.anInt2694][arg4][arg3] == local14) {
			return false;
		} else if ((Static503.aByteArrayArrayArray11[Static117.anInt2694][arg4][arg3] & 0x4) == 0) {
			return false;
		} else {
			@Pc(46) byte local46 = 0;
			Static584.anIntArray621[0] = arg4;
			@Pc(52) int local52 = 0;
			@Pc(55) int local55 = local46 + 1;
			Static198.anIntArray197[0] = arg3;
			Static45.aByteArrayArrayArray8[Static117.anInt2694][arg4][arg3] = local14;
			while (local52 != local55) {
				@Pc(73) int local73 = Static584.anIntArray621[local52] & 0xFFFF;
				@Pc(81) int local81 = Static584.anIntArray621[local52] >> 16 & 0xFF;
				@Pc(89) int local89 = Static584.anIntArray621[local52] >> 24 & 0xFF;
				@Pc(95) int local95 = Static198.anIntArray197[local52] & 0xFFFF;
				@Pc(103) int local103 = Static198.anIntArray197[local52] >> 16 & 0xFF;
				local52 = local52 + 1 & 0xFFF;
				@Pc(111) boolean local111 = false;
				if ((Static503.aByteArrayArrayArray11[Static117.anInt2694][local73][local95] & 0x4) == 0) {
					local111 = true;
				}
				@Pc(125) boolean local125 = false;
				@Pc(164) int local164;
				@Pc(210) int local210;
				label231: for (@Pc(129) int local129 = Static117.anInt2694 + 1; local129 <= 3; local129++) {
					if ((Static503.aByteArrayArrayArray11[local129][local73][local95] & 0x8) == 0) {
						@Pc(309) Class41_Sub2_Sub1 local309;
						@Pc(319) int local319;
						@Pc(298) Class299 local298;
						@Pc(304) Class38 local304;
						if (local111 && arg0[local129][local73][local95] != null) {
							if (arg0[local129][local73][local95].aClass41_Sub2_Sub3_1 != null) {
								local164 = Static566.method7615(local81);
								if (local164 == arg0[local129][local73][local95].aClass41_Sub2_Sub3_1.aShort141 || arg0[local129][local73][local95].aClass41_Sub2_Sub3_2 != null && arg0[local129][local73][local95].aClass41_Sub2_Sub3_2.aShort141 == local164) {
									continue;
								}
								if (local89 != 0) {
									local210 = Static566.method7615(local89);
									if (local210 == arg0[local129][local73][local95].aClass41_Sub2_Sub3_1.aShort141 || arg0[local129][local73][local95].aClass41_Sub2_Sub3_2 != null && local210 == arg0[local129][local73][local95].aClass41_Sub2_Sub3_2.aShort141) {
										continue;
									}
								}
								if (local103 != 0) {
									local210 = Static566.method7615(local103);
									if (arg0[local129][local73][local95].aClass41_Sub2_Sub3_1.aShort141 == local210 || arg0[local129][local73][local95].aClass41_Sub2_Sub3_2 != null && arg0[local129][local73][local95].aClass41_Sub2_Sub3_2.aShort141 == local210) {
										continue;
									}
								}
							}
							local298 = arg0[local129][local73][local95];
							if (local298.aClass38_2 != null) {
								for (local304 = local298.aClass38_2; local304 != null; local304 = local304.aClass38_1) {
									local309 = local304.aClass41_Sub2_Sub1_1;
									if (local309 instanceof Interface4) {
										@Pc(315) Interface4 local315 = (Interface4) local309;
										local319 = local315.method7556();
										@Pc(323) int local323 = local315.method7562();
										if (local319 == 21) {
											local319 = 19;
										}
										@Pc(334) int local334 = local323 << 6 | local319;
										if (local334 == local81 || local89 != 0 && local334 == local89 || local103 != 0 && local334 == local103) {
											continue label231;
										}
									}
								}
							}
						}
						local298 = arg0[local129][local73][local95];
						if (local298 != null && local298.aClass38_2 != null) {
							for (local304 = local298.aClass38_2; local304 != null; local304 = local304.aClass38_1) {
								local309 = local304.aClass41_Sub2_Sub1_1;
								if (local309.aShort147 != local309.aShort146 || local309.aShort144 != local309.aShort145) {
									for (@Pc(406) int local406 = local309.aShort147; local406 <= local309.aShort146; local406++) {
										for (local319 = local309.aShort144; local319 <= local309.aShort145; local319++) {
											Static45.aByteArrayArrayArray8[local129][local406][local319] = local14;
										}
									}
								}
							}
						}
						Static45.aByteArrayArrayArray8[local129][local73][local95] = local14;
						local125 = true;
					}
				}
				if (local125) {
					local164 = Static68.aClass34Array1[Static117.anInt2694 + 1].method6525(local95, local73);
					if (Static5.anIntArray7[arg1] < local164) {
						Static5.anIntArray7[arg1] = local164;
					}
					local210 = local73 << 9;
					if (Static543.anIntArray570[arg1] > local210) {
						Static543.anIntArray570[arg1] = local210;
					} else if (local210 > Static280.anIntArray259[arg1]) {
						Static280.anIntArray259[arg1] = local210;
					}
					@Pc(513) int local513 = local95 << 9;
					if (local513 < Static519.anIntArray540[arg1]) {
						Static519.anIntArray540[arg1] = local513;
					} else if (Static160.anIntArray158[arg1] < local513) {
						Static160.anIntArray158[arg1] = local513;
					}
				}
				if (!local111) {
					if (local73 >= 1 && Static45.aByteArrayArrayArray8[Static117.anInt2694][local73 - 1][local95] != local14) {
						Static584.anIntArray621[local55] = local73 - 1 | 0x120000 | 0xD3000000;
						Static198.anIntArray197[local55] = local95 | 0x130000;
						local55 = local55 + 1 & 0xFFF;
						Static45.aByteArrayArrayArray8[Static117.anInt2694][local73 - 1][local95] = local14;
					}
					@Pc(594) int local594 = ~Static140.anInt3026;
					local95++;
					if (local594 < ~local95) {
						if (local73 - 1 >= 0 && Static45.aByteArrayArrayArray8[Static117.anInt2694][local73 - 1][local95] != local14 && (Static503.aByteArrayArrayArray11[Static117.anInt2694][local73][local95] & 0x4) == 0 && (Static503.aByteArrayArrayArray11[Static117.anInt2694][local73 - 1][local95 - 1] & 0x4) == 0) {
							Static584.anIntArray621[local55] = local73 - 1 | 0x52000000 | 0x120000;
							Static198.anIntArray197[local55] = local95 | 0x130000;
							Static45.aByteArrayArrayArray8[Static117.anInt2694][local73 - 1][local95] = local14;
							local55 = local55 + 1 & 0xFFF;
						}
						if (Static45.aByteArrayArrayArray8[Static117.anInt2694][local73][local95] != local14) {
							Static584.anIntArray621[local55] = local73 | 0x13000000 | 0x520000;
							Static198.anIntArray197[local55] = local95 | 0x530000;
							local55 = local55 + 1 & 0xFFF;
							Static45.aByteArrayArrayArray8[Static117.anInt2694][local73][local95] = local14;
						}
						if (Static54.anInt1038 > local73 + 1 && local14 != Static45.aByteArrayArrayArray8[Static117.anInt2694][local73 + 1][local95] && (Static503.aByteArrayArrayArray11[Static117.anInt2694][local73][local95] & 0x4) == 0 && (Static503.aByteArrayArrayArray11[Static117.anInt2694][local73 + 1][local95 - 1] & 0x4) == 0) {
							Static584.anIntArray621[local55] = 0x92000000 | 0x520000 | local73 + 1;
							Static198.anIntArray197[local55] = local95 | 0x530000;
							local55 = local55 + 1 & 0xFFF;
							Static45.aByteArrayArrayArray8[Static117.anInt2694][local73 + 1][local95] = local14;
						}
					}
					local95--;
					if (local73 + 1 < Static54.anInt1038 && local14 != Static45.aByteArrayArrayArray8[Static117.anInt2694][local73 + 1][local95]) {
						Static584.anIntArray621[local55] = local73 + 1 | 0x920000 | 0x53000000;
						Static198.anIntArray197[local55] = local95 | 0x930000;
						local55 = local55 + 1 & 0xFFF;
						Static45.aByteArrayArrayArray8[Static117.anInt2694][local73 + 1][local95] = local14;
					}
					local95--;
					if (local95 >= 0) {
						if (local73 - 1 >= 0 && local14 != Static45.aByteArrayArrayArray8[Static117.anInt2694][local73 - 1][local95] && (Static503.aByteArrayArrayArray11[Static117.anInt2694][local73][local95] & 0x4) == 0 && (Static503.aByteArrayArrayArray11[Static117.anInt2694][local73 - 1][local95 + 1] & 0x4) == 0) {
							Static584.anIntArray621[local55] = local73 - 1 | 0xD20000 | 0x12000000;
							Static198.anIntArray197[local55] = local95 | 0xD30000;
							Static45.aByteArrayArrayArray8[Static117.anInt2694][local73 - 1][local95] = local14;
							local55 = local55 + 1 & 0xFFF;
						}
						if (Static45.aByteArrayArrayArray8[Static117.anInt2694][local73][local95] != local14) {
							Static584.anIntArray621[local55] = local73 | 0x93000000 | 0xD20000;
							Static198.anIntArray197[local55] = local95 | 0xD30000;
							local55 = local55 + 1 & 0xFFF;
							Static45.aByteArrayArrayArray8[Static117.anInt2694][local73][local95] = local14;
						}
						if (Static54.anInt1038 > local73 + 1 && local14 != Static45.aByteArrayArrayArray8[Static117.anInt2694][local73 + 1][local95] && (Static503.aByteArrayArrayArray11[Static117.anInt2694][local73][local95] & 0x4) == 0 && (Static503.aByteArrayArrayArray11[Static117.anInt2694][local73 + 1][local95 + 1] & 0x4) == 0) {
							Static584.anIntArray621[local55] = local73 + 1 | 0xD2000000 | 0x920000;
							Static198.anIntArray197[local55] = local95 | 0x930000;
							local55 = local55 + 1 & 0xFFF;
							Static45.aByteArrayArrayArray8[Static117.anInt2694][local73 + 1][local95] = local14;
						}
					}
				}
			}
			if (Static5.anIntArray7[arg1] != -1000000) {
				Static5.anIntArray7[arg1] += 40;
				Static543.anIntArray570[arg1] -= 512;
				Static280.anIntArray259[arg1] += 512;
				Static160.anIntArray158[arg1] += 512;
				Static519.anIntArray540[arg1] -= 512;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(BII)Z")
	public static boolean method4801(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(ZLclient!np;)Ljava/lang/String;")
	public static String method4802(@OriginalArg(1) Class3_Sub11 arg0) {
		return Static190.method3222(arg0);
	}
}
