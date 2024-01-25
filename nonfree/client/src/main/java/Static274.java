import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "Lclient!hb;")
	public static Class139 aClass139_4;

	@OriginalMember(owner = "client!jp", name = "g", descriptor = "I")
	public static int anInt5086;

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(ZLclient!ei;)I")
	public static int method4470(@OriginalArg(1) Class2_Sub17_Sub1 arg0) {
		@Pc(8) int local8 = arg0.method2456(2);
		@Pc(31) int local31;
		if (local8 == 0) {
			local31 = 0;
		} else if (local8 == 1) {
			local31 = arg0.method2456(5);
		} else if (local8 == 2) {
			local31 = arg0.method2456(8);
		} else {
			local31 = arg0.method2456(11);
		}
		return local31;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(BLclient!jk;)V")
	public static void method4473(@OriginalArg(1) Class16_Sub5 arg0) {
		arg0.aClass16_Sub1_16 = null;
		@Pc(10) int local10 = arg0.aClass16_Sub10Array1.length;
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			arg0.aClass16_Sub10Array1[local12].aBoolean758 = false;
		}
		@Pc(25) Class19[] local25 = Class2_Sub24.aClass19Array1;
		synchronized (Class2_Sub24.aClass19Array1) {
			if (Class2_Sub24.aClass19Array1.length > local10 && Static161.anIntArray215[local10] < 200) {
				Class2_Sub24.aClass19Array1[local10].method566(arg0);
				@Pc(50) int local50 = Static161.anIntArray215[local10]++;
			}
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "([[[Lclient!ds;ZIIII)Z")
	public static boolean method4475(@OriginalArg(0) Class84[][][] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) byte local12 = arg1 ? 1 : (byte) (Static364.anInt6282 & 0xFF);
		if (local12 == Static582.aByteArrayArrayArray17[Static531.anInt8550][arg2][arg3]) {
			return false;
		} else if ((Static372.aByteArrayArrayArray3[Static531.anInt8550][arg2][arg3] & 0x4) == 0) {
			return false;
		} else {
			@Pc(41) byte local41 = 0;
			Static229.anIntArray273[0] = arg2;
			@Pc(52) int local52 = 0;
			@Pc(55) int local55 = local41 + 1;
			Static553.anIntArray660[0] = arg3;
			Static582.aByteArrayArrayArray17[Static531.anInt8550][arg2][arg3] = local12;
			while (local52 != local55) {
				@Pc(72) int local72 = Static229.anIntArray273[local52] & 0xFFFF;
				@Pc(80) int local80 = Static229.anIntArray273[local52] >> 16 & 0xFF;
				@Pc(88) int local88 = Static229.anIntArray273[local52] >> 24 & 0xFF;
				@Pc(94) int local94 = Static553.anIntArray660[local52] & 0xFFFF;
				@Pc(102) int local102 = Static553.anIntArray660[local52] >> 16 & 0xFF;
				local52 = local52 + 1 & 0xFFF;
				@Pc(110) boolean local110 = false;
				if ((Static372.aByteArrayArrayArray3[Static531.anInt8550][local72][local94] & 0x4) == 0) {
					local110 = true;
				}
				@Pc(124) boolean local124 = false;
				@Pc(130) int local130;
				@Pc(171) int local171;
				@Pc(216) int local216;
				if (arg0 != null) {
					label237: for (local130 = Static531.anInt8550 + 1; local130 <= 3; local130++) {
						if (arg0[local130] != null && (Static372.aByteArrayArrayArray3[local130][local72][local94] & 0x8) == 0) {
							@Pc(316) Class16_Sub1_Sub1 local316;
							@Pc(326) int local326;
							@Pc(306) Class84 local306;
							@Pc(312) Class333 local312;
							if (local110 && arg0[local130][local72][local94] != null) {
								if (arg0[local130][local72][local94].aClass16_Sub1_Sub2_1 != null) {
									local171 = Static433.method6266(local80);
									if (arg0[local130][local72][local94].aClass16_Sub1_Sub2_1.aShort89 == local171 || arg0[local130][local72][local94].aClass16_Sub1_Sub2_2 != null && local171 == arg0[local130][local72][local94].aClass16_Sub1_Sub2_2.aShort89) {
										continue;
									}
									if (local88 != 0) {
										local216 = Static433.method6266(local88);
										if (local216 == arg0[local130][local72][local94].aClass16_Sub1_Sub2_1.aShort89 || arg0[local130][local72][local94].aClass16_Sub1_Sub2_2 != null && arg0[local130][local72][local94].aClass16_Sub1_Sub2_2.aShort89 == local216) {
											continue;
										}
									}
									if (local102 != 0) {
										local216 = Static433.method6266(local102);
										if (local216 == arg0[local130][local72][local94].aClass16_Sub1_Sub2_1.aShort89 || arg0[local130][local72][local94].aClass16_Sub1_Sub2_2 != null && arg0[local130][local72][local94].aClass16_Sub1_Sub2_2.aShort89 == local216) {
											continue;
										}
									}
								}
								local306 = arg0[local130][local72][local94];
								if (local306.aClass333_1 != null) {
									for (local312 = local306.aClass333_1; local312 != null; local312 = local312.aClass333_3) {
										local316 = local312.aClass16_Sub1_Sub1_1;
										if (local316 instanceof Interface25) {
											@Pc(322) Interface25 local322 = (Interface25) local316;
											local326 = local322.method6212();
											if (local326 == 21) {
												local326 = 19;
											}
											@Pc(337) int local337 = local322.method6210();
											@Pc(343) int local343 = local337 << 6 | local326;
											if (local343 == local80 || local88 != 0 && local343 == local88 || local102 != 0 && local102 == local343) {
												continue label237;
											}
										}
									}
								}
							}
							local306 = arg0[local130][local72][local94];
							if (local306 != null && local306.aClass333_1 != null) {
								for (local312 = local306.aClass333_1; local312 != null; local312 = local312.aClass333_3) {
									local316 = local312.aClass16_Sub1_Sub1_1;
									if (local316.aShort104 != local316.aShort103 || local316.aShort105 != local316.aShort106) {
										for (@Pc(402) int local402 = local316.aShort103; local402 <= local316.aShort104; local402++) {
											for (local326 = local316.aShort106; local326 <= local316.aShort105; local326++) {
												Static582.aByteArrayArrayArray17[local130][local402][local326] = local12;
											}
										}
									}
								}
							}
							local124 = true;
							Static582.aByteArrayArrayArray17[local130][local72][local94] = local12;
						}
					}
				}
				if (local124) {
					local130 = Static511.aClass91Array3[Static531.anInt8550 + 1].method7447(local94, local72);
					if (local130 > Static165.anIntArray219[arg4]) {
						Static165.anIntArray219[arg4] = local130;
					}
					local171 = local72 << 9;
					local216 = local94 << 9;
					if (Static237.anIntArray283[arg4] > local171) {
						Static237.anIntArray283[arg4] = local171;
					} else if (Static327.anIntArray367[arg4] < local171) {
						Static327.anIntArray367[arg4] = local171;
					}
					if (Static494.anIntArray569[arg4] > local216) {
						Static494.anIntArray569[arg4] = local216;
					} else if (local216 > Static447.anIntArray498[arg4]) {
						Static447.anIntArray498[arg4] = local216;
					}
				}
				if (!local110) {
					if (local72 >= 1 && Static582.aByteArrayArrayArray17[Static531.anInt8550][local72 - 1][local94] != local12) {
						Static229.anIntArray273[local55] = 0xD3000000 | 0x120000 | local72 - 1;
						Static553.anIntArray660[local55] = local94 | 0x130000;
						Static582.aByteArrayArrayArray17[Static531.anInt8550][local72 - 1][local94] = local12;
						local55 = local55 + 1 & 0xFFF;
					}
					local94++;
					if (local94 < Static5.anInt112) {
						if (local72 - 1 >= 0 && local12 != Static582.aByteArrayArrayArray17[Static531.anInt8550][local72 - 1][local94] && (Static372.aByteArrayArrayArray3[Static531.anInt8550][local72][local94] & 0x4) == 0 && (Static372.aByteArrayArrayArray3[Static531.anInt8550][local72 - 1][local94 - 1] & 0x4) == 0) {
							Static229.anIntArray273[local55] = local72 - 1 | 0x120000 | 0x52000000;
							Static553.anIntArray660[local55] = local94 | 0x130000;
							local55 = local55 + 1 & 0xFFF;
							Static582.aByteArrayArrayArray17[Static531.anInt8550][local72 - 1][local94] = local12;
						}
						if (Static582.aByteArrayArrayArray17[Static531.anInt8550][local72][local94] != local12) {
							Static229.anIntArray273[local55] = local72 | 0x520000 | 0x13000000;
							Static553.anIntArray660[local55] = local94 | 0x530000;
							Static582.aByteArrayArrayArray17[Static531.anInt8550][local72][local94] = local12;
							local55 = local55 + 1 & 0xFFF;
						}
						if (local72 + 1 < Static456.anInt7428 && Static582.aByteArrayArrayArray17[Static531.anInt8550][local72 + 1][local94] != local12 && (Static372.aByteArrayArrayArray3[Static531.anInt8550][local72][local94] & 0x4) == 0 && (Static372.aByteArrayArrayArray3[Static531.anInt8550][local72 + 1][local94 - 1] & 0x4) == 0) {
							Static229.anIntArray273[local55] = local72 + 1 | 0x520000 | 0x92000000;
							Static553.anIntArray660[local55] = local94 | 0x530000;
							Static582.aByteArrayArrayArray17[Static531.anInt8550][local72 + 1][local94] = local12;
							local55 = local55 + 1 & 0xFFF;
						}
					}
					local94--;
					if (local72 + 1 < Static456.anInt7428 && Static582.aByteArrayArrayArray17[Static531.anInt8550][local72 + 1][local94] != local12) {
						Static229.anIntArray273[local55] = local72 + 1 | 0x920000 | 0x53000000;
						Static553.anIntArray660[local55] = local94 | 0x930000;
						local55 = local55 + 1 & 0xFFF;
						Static582.aByteArrayArrayArray17[Static531.anInt8550][local72 + 1][local94] = local12;
					}
					local94--;
					if (local94 >= 0) {
						if (local72 - 1 >= 0 && Static582.aByteArrayArrayArray17[Static531.anInt8550][local72 - 1][local94] != local12 && (Static372.aByteArrayArrayArray3[Static531.anInt8550][local72][local94] & 0x4) == 0 && (Static372.aByteArrayArrayArray3[Static531.anInt8550][local72 - 1][local94 + 1] & 0x4) == 0) {
							Static229.anIntArray273[local55] = local72 - 1 | 0xD20000 | 0x12000000;
							Static553.anIntArray660[local55] = local94 | 0xD30000;
							local55 = local55 + 1 & 0xFFF;
							Static582.aByteArrayArrayArray17[Static531.anInt8550][local72 - 1][local94] = local12;
						}
						if (Static582.aByteArrayArrayArray17[Static531.anInt8550][local72][local94] != local12) {
							Static229.anIntArray273[local55] = 0x93000000 | 0xD20000 | local72;
							Static553.anIntArray660[local55] = local94 | 0xD30000;
							local55 = local55 + 1 & 0xFFF;
							Static582.aByteArrayArrayArray17[Static531.anInt8550][local72][local94] = local12;
						}
						if (Static456.anInt7428 > local72 + 1 && Static582.aByteArrayArrayArray17[Static531.anInt8550][local72 + 1][local94] != local12 && (Static372.aByteArrayArrayArray3[Static531.anInt8550][local72][local94] & 0x4) == 0 && (Static372.aByteArrayArrayArray3[Static531.anInt8550][local72 + 1][local94 + 1] & 0x4) == 0) {
							Static229.anIntArray273[local55] = local72 + 1 | 0x920000 | 0xD2000000;
							Static553.anIntArray660[local55] = local94 | 0x930000;
							local55 = local55 + 1 & 0xFFF;
							Static582.aByteArrayArrayArray17[Static531.anInt8550][local72 + 1][local94] = local12;
						}
					}
				}
			}
			if (Static165.anIntArray219[arg4] != -1000000) {
				Static165.anIntArray219[arg4] += 40;
				Static237.anIntArray283[arg4] -= 512;
				Static327.anIntArray367[arg4] += 512;
				Static447.anIntArray498[arg4] += 512;
				Static494.anIntArray569[arg4] -= 512;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)V")
	public static void method4476() {
		if (Static331.anInt5801 < 0) {
			Static285.anInt5179 = -1;
			Static331.anInt5801 = 0;
			Static280.anInt5122 = -1;
		}
		if (Static331.anInt5801 > Static371.anInt9390) {
			Static285.anInt5179 = -1;
			Static280.anInt5122 = -1;
			Static331.anInt5801 = Static371.anInt9390;
		}
		if (Static611.anInt10071 < 0) {
			Static280.anInt5122 = -1;
			Static611.anInt10071 = 0;
			Static285.anInt5179 = -1;
		}
		if (Static371.anInt9382 < Static611.anInt10071) {
			Static611.anInt10071 = Static371.anInt9382;
			Static280.anInt5122 = -1;
			Static285.anInt5179 = -1;
		}
	}
}
