import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "I")
	public static final int anInt6104 = 1;

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIZ)Z")
	public static boolean method4819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(I)V")
	public static void method4820() {
		for (@Pc(3) int local3 = 0; local3 < Static399.anInt7806; local3++) {
			@Pc(9) Class185 local9 = Static256.aClass185Array1[local3];
			@Pc(11) boolean local11 = false;
			@Pc(230) int local230;
			if (local9.aClass4_Sub21_Sub2_1 == null) {
				local9.anInt5795--;
				if (local9.anInt5795 < (local9.method4472() ? -1500 : -10)) {
					local11 = true;
				} else {
					if (local9.aByte94 == 1 && local9.aClass323_1 == null) {
						local9.aClass323_1 = Static605.method7397(Static518.aClass348_118, local9.anInt5787, 0);
						if (local9.aClass323_1 == null) {
							continue;
						}
						local9.anInt5795 += local9.aClass323_1.method7394();
					} else if (local9.method4472() && (local9.aClass4_Sub12_1 == null || local9.aClass4_Sub42_Sub1_1 == null)) {
						if (local9.aClass4_Sub12_1 == null) {
							local9.aClass4_Sub12_1 = Static116.method2118(Static19.aClass348_11, local9.anInt5787);
						}
						if (local9.aClass4_Sub12_1 == null) {
							continue;
						}
						if (local9.aClass4_Sub42_Sub1_1 == null) {
							local9.aClass4_Sub42_Sub1_1 = local9.aClass4_Sub12_1.method2116(new int[] { 22050 });
							if (local9.aClass4_Sub42_Sub1_1 == null) {
								continue;
							}
						}
					}
					if (local9.anInt5795 < 0) {
						@Pc(126) int local126 = 8192;
						if (local9.anInt5788 == 0) {
							local230 = (local9.aByte94 == 3 ? Static455.aClass4_Sub35_Sub1_1.anInt9930 : Static455.aClass4_Sub35_Sub1_1.anInt9916) * local9.anInt5786 >> 2;
						} else {
							@Pc(136) int local136 = local9.anInt5788 >> 24 & 0x3;
							if (local136 == Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aByte127) {
								@Pc(147) int local147 = (local9.anInt5788 & 0xFF) << 9;
								@Pc(153) int local153 = Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.method3339() << 8;
								@Pc(160) int local160 = local9.anInt5788 >> 16 & 0xFF;
								@Pc(172) int local172 = local153 + (local160 << 9) + 256 - Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt10551;
								@Pc(179) int local179 = local9.anInt5788 >> 8 & 0xFF;
								@Pc(191) int local191 = local153 + (local179 << 9) + 256 - Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt10550;
								@Pc(200) int local200 = Math.abs(local172) + Math.abs(local191) - 512;
								if (local200 > local147) {
									local9.anInt5795 = -99999;
									continue;
								}
								if (local200 < 0) {
									local200 = 0;
								}
								local230 = Static455.aClass4_Sub35_Sub1_1.anInt9929 * (local147 - local200) * local9.anInt5786 / local147 >> 2;
								if (local9.aClass21_Sub1_3 != null && local9.aClass21_Sub1_3 instanceof Class21_Sub1_Sub1) {
									@Pc(241) Class21_Sub1_Sub1 local241 = (Class21_Sub1_Sub1) local9.aClass21_Sub1_3;
									@Pc(244) short local244 = local241.aShort121;
									@Pc(247) short local247 = local241.aShort119;
								}
								if (local172 != 0 || local191 != 0) {
									@Pc(271) int local271 = -Static353.anInt6831 - (int) (Math.atan2((double) local172, (double) local191) * 2607.5945876176133D) - 4096 & 0x3FFF;
									if (local271 > 8192) {
										local271 = 16384 - local271;
									}
									@Pc(283) int local283;
									if (local200 <= 0) {
										local283 = 8192;
									} else if (local200 >= 4096) {
										local283 = 16384;
									} else {
										local283 = (8192 - local200) / 4096 + 8192;
									}
									local126 = local283 * local271 / 8192 + (16384 - local283 >> 1);
								}
							} else {
								local230 = 0;
							}
						}
						if (local230 > 0) {
							@Pc(345) Class4_Sub42_Sub1 local345 = null;
							if (local9.aByte94 == 1) {
								local345 = local9.aClass323_1.method7396().method7307(Static209.aClass285_1);
							} else if (local9.method4472()) {
								local345 = local9.aClass4_Sub42_Sub1_1;
							}
							@Pc(373) Class4_Sub21_Sub2 local373 = local9.aClass4_Sub21_Sub2_1 = Static601.method4643(local345, local9.anInt5797, local230, local126);
							local373.method4624(local9.anInt5789 - 1);
							Static472.aClass4_Sub21_Sub3_2.method5927(local373);
						}
					}
				}
			} else if (!local9.aClass4_Sub21_Sub2_1.method8199()) {
				local11 = true;
			}
			if (local11) {
				Static399.anInt7806--;
				for (local230 = local3; local230 < Static399.anInt7806; local230++) {
					Static256.aClass185Array1[local230] = Static256.aClass185Array1[local230 + 1];
				}
				local3--;
			}
		}
		if (Static421.aBoolean581 && !Static578.method8124()) {
			if (Static455.aClass4_Sub35_Sub1_1.anInt9926 != 0 && Static269.anInt5657 != -1) {
				if (Static565.aClass4_Sub21_Sub4_5 == null) {
					Static586.method8188(Static269.anInt5657, Static326.aClass348_69, Static455.aClass4_Sub35_Sub1_1.anInt9926);
				} else {
					Static56.method1304(Static269.anInt5657, Static455.aClass4_Sub35_Sub1_1.anInt9926, Static565.aClass4_Sub21_Sub4_5, Static326.aClass348_69);
				}
			}
			Static565.aClass4_Sub21_Sub4_5 = null;
			Static421.aBoolean581 = false;
		} else if (Static455.aClass4_Sub35_Sub1_1.anInt9926 != 0 && Static269.anInt5657 != -1 && !Static578.method8124()) {
			@Pc(481) Class4_Sub39 local481 = Static32.method999(Static402.aClass356_1, Static330.aClass344_56);
			local481.aClass4_Sub13_Sub2_1.method7032(Static269.anInt5657);
			Static50.method1166(local481);
			Static269.anInt5657 = -1;
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IB)Z")
	public static boolean method4821(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 7 || arg0 == 10;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(II)I")
	public static int method4825(@OriginalArg(1) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
