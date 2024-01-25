import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static541 {

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
	public static int anInt9451;

	@OriginalMember(owner = "client!ui", name = "h", descriptor = "[Lclient!iu;")
	public static Class25_Sub7[] aClass25_Sub7Array1;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "([[[Lclient!up;IZIII)Z")
	public static boolean method7418(@OriginalArg(0) Class333[][][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(14) byte local14 = arg2 ? 1 : (byte) (Static335.anInt6052 & 0xFF);
		if (Static435.aByteArrayArrayArray11[Static594.anInt10310][arg3][arg4] == local14) {
			return false;
		} else if ((Static428.aByteArrayArrayArray4[Static594.anInt10310][arg3][arg4] & 0x4) == 0) {
			return false;
		} else {
			@Pc(46) byte local46 = 0;
			Static579.anIntArray580[0] = arg3;
			@Pc(52) int local52 = 0;
			@Pc(55) int local55 = local46 + 1;
			Static411.anIntArray419[0] = arg4;
			Static435.aByteArrayArrayArray11[Static594.anInt10310][arg3][arg4] = local14;
			while (local52 != local55) {
				@Pc(73) int local73 = Static579.anIntArray580[local52] & 0xFFFF;
				@Pc(81) int local81 = Static579.anIntArray580[local52] >> 16 & 0xFF;
				@Pc(89) int local89 = Static579.anIntArray580[local52] >> 24 & 0xFF;
				@Pc(95) int local95 = Static411.anIntArray419[local52] & 0xFFFF;
				@Pc(103) int local103 = Static411.anIntArray419[local52] >> 16 & 0xFF;
				local52 = local52 + 1 & 0xFFF;
				@Pc(111) boolean local111 = false;
				if ((Static428.aByteArrayArrayArray4[Static594.anInt10310][local73][local95] & 0x4) == 0) {
					local111 = true;
				}
				@Pc(128) boolean local128 = false;
				@Pc(170) int local170;
				@Pc(213) int local213;
				label231: for (@Pc(132) int local132 = Static594.anInt10310 + 1; local132 <= 3; local132++) {
					if ((Static428.aByteArrayArrayArray4[local132][local73][local95] & 0x8) == 0) {
						@Pc(315) Class25_Sub2_Sub2 local315;
						@Pc(325) int local325;
						@Pc(304) Class333 local304;
						@Pc(310) Class147 local310;
						if (local111 && arg0[local132][local73][local95] != null) {
							if (arg0[local132][local73][local95].aClass25_Sub2_Sub3_2 != null) {
								local170 = Static272.method4147(local81);
								if (local170 == arg0[local132][local73][local95].aClass25_Sub2_Sub3_2.aShort68 || arg0[local132][local73][local95].aClass25_Sub2_Sub3_1 != null && arg0[local132][local73][local95].aClass25_Sub2_Sub3_1.aShort68 == local170) {
									continue;
								}
								if (local89 != 0) {
									local213 = Static272.method4147(local89);
									if (arg0[local132][local73][local95].aClass25_Sub2_Sub3_2.aShort68 == local213 || arg0[local132][local73][local95].aClass25_Sub2_Sub3_1 != null && local213 == arg0[local132][local73][local95].aClass25_Sub2_Sub3_1.aShort68) {
										continue;
									}
								}
								if (local103 != 0) {
									local213 = Static272.method4147(local103);
									if (local213 == arg0[local132][local73][local95].aClass25_Sub2_Sub3_2.aShort68 || arg0[local132][local73][local95].aClass25_Sub2_Sub3_1 != null && local213 == arg0[local132][local73][local95].aClass25_Sub2_Sub3_1.aShort68) {
										continue;
									}
								}
							}
							local304 = arg0[local132][local73][local95];
							if (local304.aClass147_3 != null) {
								for (local310 = local304.aClass147_3; local310 != null; local310 = local310.aClass147_2) {
									local315 = local310.aClass25_Sub2_Sub2_1;
									if (local315 instanceof Interface14) {
										@Pc(321) Interface14 local321 = (Interface14) local315;
										local325 = local321.method4959();
										@Pc(329) int local329 = local321.method4961();
										if (local325 == 21) {
											local325 = 19;
										}
										@Pc(342) int local342 = local325 | local329 << 6;
										if (local81 == local342 || local89 != 0 && local342 == local89 || local103 != 0 && local103 == local342) {
											continue label231;
										}
									}
								}
							}
						}
						local304 = arg0[local132][local73][local95];
						if (local304 != null && local304.aClass147_3 != null) {
							for (local310 = local304.aClass147_3; local310 != null; local310 = local310.aClass147_2) {
								local315 = local310.aClass25_Sub2_Sub2_1;
								if (local315.aShort106 != local315.aShort108 || local315.aShort109 != local315.aShort107) {
									for (@Pc(411) int local411 = local315.aShort106; local411 <= local315.aShort108; local411++) {
										for (local325 = local315.aShort107; local325 <= local315.aShort109; local325++) {
											Static435.aByteArrayArrayArray11[local132][local411][local325] = local14;
										}
									}
								}
							}
						}
						Static435.aByteArrayArrayArray11[local132][local73][local95] = local14;
						local128 = true;
					}
				}
				if (local128) {
					local170 = Static256.aClass127Array3[Static594.anInt10310 + 1].method7862(local95, local73);
					if (Static375.anIntArray365[arg1] < local170) {
						Static375.anIntArray365[arg1] = local170;
					}
					local213 = local73 << 9;
					if (local213 < Static56.anIntArray43[arg1]) {
						Static56.anIntArray43[arg1] = local213;
					} else if (Static279.anIntArray244[arg1] < local213) {
						Static279.anIntArray244[arg1] = local213;
					}
					@Pc(518) int local518 = local95 << 9;
					if (local518 < Static559.anIntArray562[arg1]) {
						Static559.anIntArray562[arg1] = local518;
					} else if (Static439.anIntArray462[arg1] < local518) {
						Static439.anIntArray462[arg1] = local518;
					}
				}
				if (!local111) {
					if (local73 >= 1 && Static435.aByteArrayArrayArray11[Static594.anInt10310][local73 - 1][local95] != local14) {
						Static579.anIntArray580[local55] = local73 - 1 | 0x120000 | 0xD3000000;
						Static411.anIntArray419[local55] = local95 | 0x130000;
						Static435.aByteArrayArrayArray11[Static594.anInt10310][local73 - 1][local95] = local14;
						local55 = local55 + 1 & 0xFFF;
					}
					local95++;
					if (Static535.anInt9341 > local95) {
						if (local73 - 1 >= 0 && local14 != Static435.aByteArrayArrayArray11[Static594.anInt10310][local73 - 1][local95] && (Static428.aByteArrayArrayArray4[Static594.anInt10310][local73][local95] & 0x4) == 0 && (Static428.aByteArrayArrayArray4[Static594.anInt10310][local73 - 1][local95 - 1] & 0x4) == 0) {
							Static579.anIntArray580[local55] = 0x52000000 | 0x120000 | local73 - 1;
							Static411.anIntArray419[local55] = local95 | 0x130000;
							local55 = local55 + 1 & 0xFFF;
							Static435.aByteArrayArrayArray11[Static594.anInt10310][local73 - 1][local95] = local14;
						}
						if (Static435.aByteArrayArrayArray11[Static594.anInt10310][local73][local95] != local14) {
							Static579.anIntArray580[local55] = local73 | 0x520000 | 0x13000000;
							Static411.anIntArray419[local55] = local95 | 0x530000;
							Static435.aByteArrayArrayArray11[Static594.anInt10310][local73][local95] = local14;
							local55 = local55 + 1 & 0xFFF;
						}
						if (local73 + 1 < Static345.anInt6228 && Static435.aByteArrayArrayArray11[Static594.anInt10310][local73 + 1][local95] != local14 && (Static428.aByteArrayArrayArray4[Static594.anInt10310][local73][local95] & 0x4) == 0 && (Static428.aByteArrayArrayArray4[Static594.anInt10310][local73 + 1][local95 - 1] & 0x4) == 0) {
							Static579.anIntArray580[local55] = local73 + 1 | 0x520000 | 0x92000000;
							Static411.anIntArray419[local55] = local95 | 0x530000;
							Static435.aByteArrayArrayArray11[Static594.anInt10310][local73 + 1][local95] = local14;
							local55 = local55 + 1 & 0xFFF;
						}
					}
					local95--;
					if (Static345.anInt6228 > local73 + 1 && Static435.aByteArrayArrayArray11[Static594.anInt10310][local73 + 1][local95] != local14) {
						Static579.anIntArray580[local55] = local73 + 1 | 0x53000000 | 0x920000;
						Static411.anIntArray419[local55] = local95 | 0x930000;
						Static435.aByteArrayArrayArray11[Static594.anInt10310][local73 + 1][local95] = local14;
						local55 = local55 + 1 & 0xFFF;
					}
					local95--;
					if (local95 >= 0) {
						if (local73 - 1 >= 0 && local14 != Static435.aByteArrayArrayArray11[Static594.anInt10310][local73 - 1][local95] && (Static428.aByteArrayArrayArray4[Static594.anInt10310][local73][local95] & 0x4) == 0 && (Static428.aByteArrayArrayArray4[Static594.anInt10310][local73 - 1][local95 + 1] & 0x4) == 0) {
							Static579.anIntArray580[local55] = 0x12000000 | 0xD20000 | local73 - 1;
							Static411.anIntArray419[local55] = local95 | 0xD30000;
							local55 = local55 + 1 & 0xFFF;
							Static435.aByteArrayArrayArray11[Static594.anInt10310][local73 - 1][local95] = local14;
						}
						if (local14 != Static435.aByteArrayArrayArray11[Static594.anInt10310][local73][local95]) {
							Static579.anIntArray580[local55] = local73 | 0x93000000 | 0xD20000;
							Static411.anIntArray419[local55] = local95 | 0xD30000;
							Static435.aByteArrayArrayArray11[Static594.anInt10310][local73][local95] = local14;
							local55 = local55 + 1 & 0xFFF;
						}
						if (Static345.anInt6228 > local73 + 1 && Static435.aByteArrayArrayArray11[Static594.anInt10310][local73 + 1][local95] != local14 && (Static428.aByteArrayArrayArray4[Static594.anInt10310][local73][local95] & 0x4) == 0 && (Static428.aByteArrayArrayArray4[Static594.anInt10310][local73 + 1][local95 + 1] & 0x4) == 0) {
							Static579.anIntArray580[local55] = local73 + 1 | 0x920000 | 0xD2000000;
							Static411.anIntArray419[local55] = local95 | 0x930000;
							local55 = local55 + 1 & 0xFFF;
							Static435.aByteArrayArrayArray11[Static594.anInt10310][local73 + 1][local95] = local14;
						}
					}
				}
			}
			if (Static375.anIntArray365[arg1] != -1000000) {
				Static375.anIntArray365[arg1] += 40;
				Static56.anIntArray43[arg1] -= 512;
				Static279.anIntArray244[arg1] += 512;
				Static439.anIntArray462[arg1] += 512;
				Static559.anIntArray562[arg1] -= 512;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)I")
	public static int method7420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(24) int local24 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local24;
		}
		return arg1;
	}
}
