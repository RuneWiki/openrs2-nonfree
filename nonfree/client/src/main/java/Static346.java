import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!nda", name = "e", descriptor = "Lclient!br;")
	public static final Class37 aClass37_4 = new Class37("", 14);

	@OriginalMember(owner = "client!nda", name = "t", descriptor = "Z")
	public static boolean aBoolean439 = false;

	@OriginalMember(owner = "client!nda", name = "v", descriptor = "[I")
	public static final int[] anIntArray413 = new int[2048];

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(IF)F")
	public static float method5121(@OriginalArg(1) float arg0) {
		return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(FFFB)I")
	public static int method5122(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(19) float local19 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(28) float local28 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(37) float local37 = arg0 < 0.0F ? -arg0 : arg0;
		if (local28 > local19 && local28 > local37) {
			return arg2 > 0.0F ? 0 : 1;
		} else if (local37 > local19 && local28 < local37) {
			return arg0 > 0.0F ? 2 : 3;
		} else if (arg1 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(Z)V")
	public static void method5123() {
		Static102.anInt2115 = 0;
		@Pc(11) int local11 = Static480.aClass1_Sub20_Sub1_1.method4426();
		@Pc(15) int local15 = Static480.aClass1_Sub20_Sub1_1.method4394();
		@Pc(19) int local19 = Static480.aClass1_Sub20_Sub1_1.method4408();
		@Pc(30) boolean local30 = Static480.aClass1_Sub20_Sub1_1.method4393() == 1;
		Static64.method1429();
		Static317.method4814(local19);
		@Pc(43) int local43 = (Static494.anInt8294 - Static480.aClass1_Sub20_Sub1_1.anInt5238) / 16;
		Static357.anIntArrayArray43 = new int[local43][4];
		@Pc(57) int local57;
		for (@Pc(53) int local53 = 0; local53 < local43; local53++) {
			for (local57 = 0; local57 < 4; local57++) {
				Static357.anIntArrayArray43[local53][local57] = Static480.aClass1_Sub20_Sub1_1.method4371();
			}
		}
		Static331.aByteArrayArray20 = new byte[local43][];
		Static585.anIntArray630 = new int[local43];
		Static466.aByteArrayArray10 = new byte[local43][];
		Static429.aByteArrayArray24 = null;
		Static515.anIntArray586 = new int[local43];
		Static549.anIntArray609 = new int[local43];
		Static457.aByteArrayArray25 = new byte[local43][];
		Static328.anIntArray378 = null;
		Static201.anIntArray451 = new int[local43];
		Static349.aByteArrayArray21 = new byte[local43][];
		Static298.anIntArray348 = new int[local43];
		local43 = 0;
		for (local57 = (local15 - (Static500.anInt6888 >> 4)) / 8; local57 <= ((Static500.anInt6888 >> 4) + local15) / 8; local57++) {
			for (@Pc(130) int local130 = (local11 - (Static573.anInt9325 >> 4)) / 8; local130 <= ((Static573.anInt9325 >> 4) + local11) / 8; local130++) {
				Static298.anIntArray348[local43] = local130 + (local57 << 8);
				Static549.anIntArray609[local43] = Static373.aClass111_90.method2462("m" + local57 + "_" + local130);
				Static515.anIntArray586[local43] = Static373.aClass111_90.method2462("l" + local57 + "_" + local130);
				Static201.anIntArray451[local43] = Static373.aClass111_90.method2462("um" + local57 + "_" + local130);
				Static585.anIntArray630[local43] = Static373.aClass111_90.method2462("ul" + local57 + "_" + local130);
				local43++;
			}
		}
		Static304.method4713(11, local15, local11, local30);
	}

	@OriginalMember(owner = "client!nda", name = "b", descriptor = "(B)V")
	public static void method5127() {
		if (Static479.aClass1_Sub7_Sub1_1.method2638(Static375.anInt6609) != 2) {
			return;
		}
		@Pc(19) byte local19 = (byte) (Static473.anInt8020 - 4 & 0xFF);
		@Pc(23) int local23 = Static473.anInt8020 % Static500.anInt6888;
		@Pc(29) int local29;
		for (@Pc(25) int local25 = 0; local25 < 4; local25++) {
			for (local29 = 0; local29 < Static573.anInt9325; local29++) {
				Static221.aByteArrayArrayArray5[local25][local23][local29] = local19;
			}
		}
		if (Static240.anInt4595 == 3) {
			return;
		}
		for (local29 = 0; local29 < 2; local29++) {
			Static179.anIntArray187[local29] = -1000000;
			Static378.anIntArray446[local29] = 1000000;
			Static506.anIntArray581[local29] = 0;
			Static123.anIntArray152[local29] = 1000000;
			Static399.anIntArray474[local29] = 0;
		}
		@Pc(87) int local87 = Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt8796;
		@Pc(90) int local90 = Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt8795;
		@Pc(138) int local138;
		if (Static585.anInt9461 != 1 && Static394.anInt6810 == -1) {
			local138 = Static122.method2103(Static240.anInt4595, Static333.anInt5940, Static216.anInt4203);
			if (local138 - Static350.anInt6168 < 3200 && (Static511.aByteArrayArrayArray19[Static240.anInt4595][Static333.anInt5940 >> 9][Static216.anInt4203 >> 9] & 0x4) != 0) {
				Static109.method1958(1, Static118.aClass293ArrayArrayArray14, Static216.anInt4203 >> 9, false, Static333.anInt5940 >> 9);
				return;
			}
			return;
		}
		if (Static585.anInt9461 != 1) {
			local87 = Static394.anInt6810;
			local90 = Static282.anInt5182;
		}
		if ((Static511.aByteArrayArrayArray19[Static240.anInt4595][local87 >> 9][local90 >> 9] & 0x4) != 0) {
			Static109.method1958(0, Static118.aClass293ArrayArrayArray14, local90 >> 9, false, local87 >> 9);
		}
		if (Static124.anInt2517 >= 2560) {
			return;
		}
		local138 = Static333.anInt5940 >> 9;
		@Pc(142) int local142 = Static216.anInt4203 >> 9;
		@Pc(146) int local146 = local87 >> 9;
		@Pc(150) int local150 = local90 >> 9;
		@Pc(162) int local162;
		if (local138 < local146) {
			local162 = local146 - local138;
		} else {
			local162 = local138 - local146;
		}
		@Pc(180) int local180;
		if (local142 >= local150) {
			local180 = local142 - local150;
		} else {
			local180 = local150 - local142;
		}
		if ((local162 != 0 || local180 != 0) && -Static500.anInt6888 < local162 && Static500.anInt6888 > local162 && local180 > -Static573.anInt9325 && Static573.anInt9325 > local180) {
			@Pc(252) int local252;
			@Pc(254) int local254;
			if (local162 <= local180) {
				local252 = local162 * 65536 / local180;
				local254 = 32768;
				while (local150 != local142) {
					if (local150 > local142) {
						local142++;
					} else if (local142 > local150) {
						local142--;
					}
					if ((Static511.aByteArrayArrayArray19[Static240.anInt4595][local138][local142] & 0x4) != 0) {
						Static109.method1958(1, Static118.aClass293ArrayArrayArray14, local142, false, local138);
						return;
					}
					local254 += local252;
					if (local254 >= 65536) {
						if (local138 < local146) {
							local138++;
						} else if (local146 < local138) {
							local138--;
						}
						local254 -= 65536;
						if ((Static511.aByteArrayArrayArray19[Static240.anInt4595][local138][local142] & 0x4) != 0) {
							Static109.method1958(1, Static118.aClass293ArrayArrayArray14, local142, false, local138);
							return;
						}
					}
				}
				return;
			}
			local252 = local180 * 65536 / local162;
			local254 = 32768;
			while (local138 != local146) {
				if (local146 > local138) {
					local138++;
				} else if (local146 < local138) {
					local138--;
				}
				if ((Static511.aByteArrayArrayArray19[Static240.anInt4595][local138][local142] & 0x4) != 0) {
					Static109.method1958(1, Static118.aClass293ArrayArrayArray14, local142, false, local138);
					return;
				}
				local254 += local252;
				if (local254 >= 65536) {
					local254 -= 65536;
					if (local142 < local150) {
						local142++;
					} else if (local142 > local150) {
						local142--;
					}
					if ((Static511.aByteArrayArrayArray19[Static240.anInt4595][local138][local142] & 0x4) != 0) {
						Static109.method1958(1, Static118.aClass293ArrayArrayArray14, local142, false, local138);
						return;
					}
				}
			}
			return;
		}
		Static259.method4059("RC: " + local138 + "," + local142 + " " + local146 + "," + local150 + " " + Static376.anInt6631 + "," + Static24.anInt674, null);
		return;
	}
}
