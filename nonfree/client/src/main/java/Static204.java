import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!hv", name = "r", descriptor = "F")
	public static float aFloat59;

	@OriginalMember(owner = "client!hv", name = "k", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_48 = new Class230(9, 6);

	@OriginalMember(owner = "client!hv", name = "m", descriptor = "Z")
	public static boolean aBoolean305 = false;

	@OriginalMember(owner = "client!hv", name = "o", descriptor = "Lclient!eg;")
	public static final Class82 aClass82_3 = new Class82();

	@OriginalMember(owner = "client!hv", name = "q", descriptor = "Lclient!me;")
	public static final Class211 aClass211_30 = new Class211(5);

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(B[[[Lclient!gn;ZIII)Z")
	public static boolean method3391(@OriginalArg(1) Class125[][][] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) byte local12 = arg1 ? 1 : (byte) (Static453.anInt8598 & 0xFF);
		if (local12 == Static570.aByteArrayArrayArray20[Static212.anInt4380][arg2][arg3]) {
			return false;
		} else if ((Static576.aByteArrayArrayArray21[Static212.anInt4380][arg2][arg3] & 0x4) == 0) {
			return false;
		} else {
			@Pc(44) byte local44 = 0;
			@Pc(46) int local46 = 0;
			Static510.anIntArray613[0] = arg2;
			@Pc(53) int local53 = local44 + 1;
			Static25.anIntArray23[0] = arg3;
			Static570.aByteArrayArrayArray20[Static212.anInt4380][arg2][arg3] = local12;
			while (local46 != local53) {
				@Pc(70) int local70 = Static510.anIntArray613[local46] & 0xFFFF;
				@Pc(78) int local78 = Static510.anIntArray613[local46] >> 16 & 0xFF;
				@Pc(86) int local86 = Static510.anIntArray613[local46] >> 24 & 0xFF;
				@Pc(92) int local92 = Static25.anIntArray23[local46] & 0xFFFF;
				@Pc(100) int local100 = Static25.anIntArray23[local46] >> 16 & 0xFF;
				local46 = local46 + 1 & 0xFFF;
				@Pc(108) boolean local108 = false;
				if ((Static576.aByteArrayArrayArray21[Static212.anInt4380][local70][local92] & 0x4) == 0) {
					local108 = true;
				}
				@Pc(125) boolean local125 = false;
				@Pc(165) int local165;
				@Pc(208) int local208;
				label231: for (@Pc(129) int local129 = Static212.anInt4380 + 1; local129 <= 3; local129++) {
					if ((Static576.aByteArrayArrayArray21[local129][local70][local92] & 0x8) == 0) {
						@Pc(304) Class2_Sub2 local304;
						@Pc(314) int local314;
						@Pc(294) Class125 local294;
						@Pc(300) Class302 local300;
						if (local108 && arg0[local129][local70][local92] != null) {
							if (arg0[local129][local70][local92].aClass2_Sub4_1 != null) {
								local165 = Static535.method7878(local78);
								if (local165 == arg0[local129][local70][local92].aClass2_Sub4_1.anInt7254 || arg0[local129][local70][local92].aClass2_Sub4_2 != null && arg0[local129][local70][local92].aClass2_Sub4_2.anInt7254 == local165) {
									continue;
								}
								if (local86 != 0) {
									local208 = Static535.method7878(local86);
									if (local208 == arg0[local129][local70][local92].aClass2_Sub4_1.anInt7254 || arg0[local129][local70][local92].aClass2_Sub4_2 != null && local208 == arg0[local129][local70][local92].aClass2_Sub4_2.anInt7254) {
										continue;
									}
								}
								if (local100 != 0) {
									local208 = Static535.method7878(local100);
									if (arg0[local129][local70][local92].aClass2_Sub4_1.anInt7254 == local208 || arg0[local129][local70][local92].aClass2_Sub4_2 != null && local208 == arg0[local129][local70][local92].aClass2_Sub4_2.anInt7254) {
										continue;
									}
								}
							}
							local294 = arg0[local129][local70][local92];
							if (local294.aClass302_1 != null) {
								for (local300 = local294.aClass302_1; local300 != null; local300 = local300.aClass302_2) {
									local304 = local300.aClass2_Sub2_1;
									if (local304 instanceof Interface22) {
										@Pc(310) Interface22 local310 = (Interface22) local304;
										local314 = local310.method8399();
										if (local314 == 21) {
											local314 = 19;
										}
										@Pc(323) int local323 = local310.method8402();
										@Pc(329) int local329 = local314 | local323 << 6;
										if (local329 == local78 || local86 != 0 && local86 == local329 || local100 != 0 && local100 == local329) {
											continue label231;
										}
									}
								}
							}
						}
						local294 = arg0[local129][local70][local92];
						if (local294 != null && local294.aClass302_1 != null) {
							for (local300 = local294.aClass302_1; local300 != null; local300 = local300.aClass302_2) {
								local304 = local300.aClass2_Sub2_1;
								if (local304.aShort121 != local304.aShort120 || local304.aShort122 != local304.aShort123) {
									for (@Pc(403) int local403 = local304.aShort120; local403 <= local304.aShort121; local403++) {
										for (local314 = local304.aShort122; local314 <= local304.aShort123; local314++) {
											Static570.aByteArrayArrayArray20[local129][local403][local314] = local12;
										}
									}
								}
							}
						}
						local125 = true;
						Static570.aByteArrayArrayArray20[local129][local70][local92] = local12;
					}
				}
				if (local125) {
					local165 = Static224.aClass4Array3[Static212.anInt4380 + 1].JA(local70, local92);
					if (local165 > Static429.anIntArray509[arg4]) {
						Static429.anIntArray509[arg4] = local165;
					}
					local208 = local70 << 9;
					@Pc(477) int local477 = local92 << 9;
					if (Static331.anIntArray443[arg4] > local208) {
						Static331.anIntArray443[arg4] = local208;
					} else if (Static539.anIntArray649[arg4] < local208) {
						Static539.anIntArray649[arg4] = local208;
					}
					if (local477 < Static260.anIntArray333[arg4]) {
						Static260.anIntArray333[arg4] = local477;
					} else if (Static364.anIntArray461[arg4] < local477) {
						Static364.anIntArray461[arg4] = local477;
					}
				}
				if (!local108) {
					if (local70 >= 1 && Static570.aByteArrayArrayArray20[Static212.anInt4380][local70 - 1][local92] != local12) {
						Static510.anIntArray613[local53] = 0xD3000000 | 0x120000 | local70 - 1;
						Static25.anIntArray23[local53] = local92 | 0x130000;
						Static570.aByteArrayArrayArray20[Static212.anInt4380][local70 - 1][local92] = local12;
						local53 = local53 + 1 & 0xFFF;
					}
					local92++;
					if (Static292.anInt7682 > local92) {
						if (local70 - 1 >= 0 && local12 != Static570.aByteArrayArrayArray20[Static212.anInt4380][local70 - 1][local92] && (Static576.aByteArrayArrayArray21[Static212.anInt4380][local70][local92] & 0x4) == 0 && (Static576.aByteArrayArrayArray21[Static212.anInt4380][local70 - 1][local92 - 1] & 0x4) == 0) {
							Static510.anIntArray613[local53] = local70 - 1 | 0x52000000 | 0x120000;
							Static25.anIntArray23[local53] = local92 | 0x130000;
							Static570.aByteArrayArrayArray20[Static212.anInt4380][local70 - 1][local92] = local12;
							local53 = local53 + 1 & 0xFFF;
						}
						if (Static570.aByteArrayArrayArray20[Static212.anInt4380][local70][local92] != local12) {
							Static510.anIntArray613[local53] = local70 | 0x520000 | 0x13000000;
							Static25.anIntArray23[local53] = local92 | 0x530000;
							local53 = local53 + 1 & 0xFFF;
							Static570.aByteArrayArrayArray20[Static212.anInt4380][local70][local92] = local12;
						}
						if (local70 + 1 < Static460.anInt8640 && local12 != Static570.aByteArrayArrayArray20[Static212.anInt4380][local70 + 1][local92] && (Static576.aByteArrayArrayArray21[Static212.anInt4380][local70][local92] & 0x4) == 0 && (Static576.aByteArrayArrayArray21[Static212.anInt4380][local70 + 1][local92 - 1] & 0x4) == 0) {
							Static510.anIntArray613[local53] = local70 + 1 | 0x520000 | 0x92000000;
							Static25.anIntArray23[local53] = local92 | 0x530000;
							local53 = local53 + 1 & 0xFFF;
							Static570.aByteArrayArrayArray20[Static212.anInt4380][local70 + 1][local92] = local12;
						}
					}
					local92--;
					if (local70 + 1 < Static460.anInt8640 && local12 != Static570.aByteArrayArrayArray20[Static212.anInt4380][local70 + 1][local92]) {
						Static510.anIntArray613[local53] = local70 + 1 | 0x53000000 | 0x920000;
						Static25.anIntArray23[local53] = local92 | 0x930000;
						Static570.aByteArrayArrayArray20[Static212.anInt4380][local70 + 1][local92] = local12;
						local53 = local53 + 1 & 0xFFF;
					}
					local92--;
					if (local92 >= 0) {
						if (local70 - 1 >= 0 && local12 != Static570.aByteArrayArrayArray20[Static212.anInt4380][local70 - 1][local92] && (Static576.aByteArrayArrayArray21[Static212.anInt4380][local70][local92] & 0x4) == 0 && (Static576.aByteArrayArrayArray21[Static212.anInt4380][local70 - 1][local92 + 1] & 0x4) == 0) {
							Static510.anIntArray613[local53] = local70 - 1 | 0xD20000 | 0x12000000;
							Static25.anIntArray23[local53] = local92 | 0xD30000;
							Static570.aByteArrayArrayArray20[Static212.anInt4380][local70 - 1][local92] = local12;
							local53 = local53 + 1 & 0xFFF;
						}
						if (local12 != Static570.aByteArrayArrayArray20[Static212.anInt4380][local70][local92]) {
							Static510.anIntArray613[local53] = local70 | 0xD20000 | 0x93000000;
							Static25.anIntArray23[local53] = local92 | 0xD30000;
							Static570.aByteArrayArrayArray20[Static212.anInt4380][local70][local92] = local12;
							local53 = local53 + 1 & 0xFFF;
						}
						if (local70 + 1 < Static460.anInt8640 && Static570.aByteArrayArrayArray20[Static212.anInt4380][local70 + 1][local92] != local12 && (Static576.aByteArrayArrayArray21[Static212.anInt4380][local70][local92] & 0x4) == 0 && (Static576.aByteArrayArrayArray21[Static212.anInt4380][local70 + 1][local92 + 1] & 0x4) == 0) {
							Static510.anIntArray613[local53] = local70 + 1 | 0x920000 | 0xD2000000;
							Static25.anIntArray23[local53] = local92 | 0x930000;
							Static570.aByteArrayArrayArray20[Static212.anInt4380][local70 + 1][local92] = local12;
							local53 = local53 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static429.anIntArray509[arg4] != -1000000) {
				Static429.anIntArray509[arg4] += 10;
				Static331.anIntArray443[arg4] -= 50;
				Static539.anIntArray649[arg4] += 50;
				Static364.anIntArray461[arg4] += 50;
				Static260.anIntArray333[arg4] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lclient!mca;IZ)Lclient!sr;")
	public static Class302 method3396(@OriginalArg(0) Class2_Sub2 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class302 local9;
		if (Static503.aClass302_3 == null) {
			local9 = new Class302();
		} else {
			local9 = Static503.aClass302_3;
			Static503.aClass302_3 = Static503.aClass302_3.aClass302_2;
			local9.aClass302_2 = null;
			Static594.anInt10394--;
		}
		local9.anInt9079 = arg1;
		local9.aClass2_Sub2_1 = arg0;
		return local9;
	}
}
