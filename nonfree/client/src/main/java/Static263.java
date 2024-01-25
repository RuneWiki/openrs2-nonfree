import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!jv", name = "i", descriptor = "Lclient!gd;")
	public static Class121 aClass121_1;

	@OriginalMember(owner = "client!jv", name = "e", descriptor = "[F")
	public static final float[] aFloatArray34 = new float[4];

	@OriginalMember(owner = "client!jv", name = "r", descriptor = "I")
	public static int anInt4318 = -2;

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)V")
	public static void method3670() {
		if (Static257.aClass2_Sub35_Sub1_1.method6041(Static226.anInt3318) != 2) {
			return;
		}
		@Pc(19) byte local19 = (byte) (Static388.anInt6397 - 4 & 0xFF);
		@Pc(23) int local23 = Static388.anInt6397 % Static281.anInt4822;
		@Pc(29) int local29;
		for (@Pc(25) int local25 = 0; local25 < 4; local25++) {
			for (local29 = 0; local29 < Static29.anInt491; local29++) {
				Class2_Sub35_Sub1.lb[local25][local23][local29] = local19;
			}
		}
		if (Static402.anInt6620 == 3) {
			return;
		}
		for (local29 = 0; local29 < 2; local29++) {
			Static264.anIntArray313[local29] = -1000000;
			Static100.anIntArray153[local29] = 1000000;
			Static524.anIntArray557[local29] = 0;
			Static523.anIntArray556[local29] = 1000000;
			Static447.anIntArray484[local29] = 0;
		}
		@Pc(93) int local93 = Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt9374;
		@Pc(96) int local96 = Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt9375;
		@Pc(150) int local150;
		if (Static489.anInt7763 != 1 && Static148.anInt2359 == -1) {
			local150 = Static24.method347(Static469.anInt7519, Static285.anInt2206, Static402.anInt6620);
			if (local150 - Static151.anInt2436 < 3200 && (Static433.aByteArrayArrayArray15[Static402.anInt6620][Static285.anInt2206 >> 9][Static469.anInt7519 >> 9] & 0x4) != 0) {
				Static145.method1995(false, 1, Static469.anInt7519 >> 9, Static285.anInt2206 >> 9, Static469.aClass228ArrayArrayArray6);
				return;
			}
			return;
		}
		if (Static489.anInt7763 != 1) {
			local93 = Static148.anInt2359;
			local96 = Static203.anInt2978;
		}
		if ((Static433.aByteArrayArrayArray15[Static402.anInt6620][local93 >> 9][local96 >> 9] & 0x4) != 0) {
			Static145.method1995(false, 0, local96 >> 9, local93 >> 9, Static469.aClass228ArrayArrayArray6);
		}
		if (Static396.anInt6527 >= 2560) {
			return;
		}
		local150 = Static285.anInt2206 >> 9;
		@Pc(154) int local154 = Static469.anInt7519 >> 9;
		@Pc(158) int local158 = local93 >> 9;
		@Pc(162) int local162 = local96 >> 9;
		@Pc(174) int local174;
		if (local150 < local158) {
			local174 = local158 - local150;
		} else {
			local174 = local150 - local158;
		}
		@Pc(193) int local193;
		if (local154 < local162) {
			local193 = local162 - local154;
		} else {
			local193 = local154 - local162;
		}
		if ((local174 != 0 || local193 != 0) && -Static281.anInt4822 < local174 && local174 < Static281.anInt4822 && local193 > -Static29.anInt491 && Static29.anInt491 > local193) {
			@Pc(268) int local268;
			@Pc(270) int local270;
			if (local193 >= local174) {
				local268 = local174 * 65536 / local193;
				local270 = 32768;
				while (local154 != local162) {
					if (local162 > local154) {
						local154++;
					} else if (local162 < local154) {
						local154--;
					}
					if ((Static433.aByteArrayArrayArray15[Static402.anInt6620][local150][local154] & 0x4) != 0) {
						Static145.method1995(false, 1, local154, local150, Static469.aClass228ArrayArrayArray6);
						return;
					}
					local270 += local268;
					if (local270 >= 65536) {
						local270 -= 65536;
						if (local158 > local150) {
							local150++;
						} else if (local150 > local158) {
							local150--;
						}
						if ((Static433.aByteArrayArrayArray15[Static402.anInt6620][local150][local154] & 0x4) != 0) {
							Static145.method1995(false, 1, local154, local150, Static469.aClass228ArrayArrayArray6);
							return;
						}
					}
				}
				return;
			}
			local268 = local193 * 65536 / local174;
			local270 = 32768;
			while (local150 != local158) {
				if (local150 < local158) {
					local150++;
				} else if (local150 > local158) {
					local150--;
				}
				if ((Static433.aByteArrayArrayArray15[Static402.anInt6620][local150][local154] & 0x4) != 0) {
					Static145.method1995(false, 1, local154, local150, Static469.aClass228ArrayArrayArray6);
					return;
				}
				local270 += local268;
				if (local270 >= 65536) {
					local270 -= 65536;
					if (local154 < local162) {
						local154++;
					} else if (local154 > local162) {
						local154--;
					}
					if ((Static433.aByteArrayArrayArray15[Static402.anInt6620][local150][local154] & 0x4) != 0) {
						Static145.method1995(false, 1, local154, local150, Static469.aClass228ArrayArrayArray6);
						return;
					}
				}
			}
			return;
		}
		Static357.method5094(null, "RC: " + local150 + "," + local154 + " " + local158 + "," + local162 + " " + Static485.anInt7725 + "," + Static310.anInt5129);
		return;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(JI)V")
	public static void method3671(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static363.method5135(arg0 - 1L);
			Static363.method5135(1L);
		} else {
			Static363.method5135(arg0);
		}
	}

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "(I)[Lclient!pb;")
	public static Class262[] method3672() {
		return new Class262[] { Static275.aClass262_8, Static575.aClass262_16, Static426.aClass262_13, Static235.aClass262_6, Static84.aClass262_17, Static371.aClass262_11, Static543.aClass262_14, Static90.aClass262_3, Static251.aClass262_7, Static591.aClass262_18, Static422.aClass262_12, Static574.aClass262_15, Static157.aClass262_4, Static308.aClass262_9, Static220.aClass262_5 };
	}

	@OriginalMember(owner = "client!jv", name = "e", descriptor = "(I)[Lclient!qf;")
	public static Class283[] method3677() {
		return new Class283[] { Static28.aClass283_1, Static28.aClass283_2, Static28.aClass283_3, Static28.aClass283_4, Static28.aClass283_5, Static28.aClass283_6, Static28.aClass283_7, Static28.aClass283_8, Static28.aClass283_9, Static28.aClass283_10, Static28.aClass283_11, Static28.aClass283_12, Static28.aClass283_13, Static28.aClass283_14 };
	}
}
