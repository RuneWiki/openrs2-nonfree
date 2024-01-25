import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!i", name = "d", descriptor = "Lclient!jl;")
	public static final Class109 aClass109_3 = new Class109();

	@OriginalMember(owner = "client!i", name = "e", descriptor = "Lclient!jj;")
	public static final Class108 aClass108_18 = new Class108(512);

	@OriginalMember(owner = "client!i", name = "f", descriptor = "Lclient!fg;")
	public static final Class70 aClass70_40 = new Class70(64);

	@OriginalMember(owner = "client!i", name = "g", descriptor = "[I")
	public static final int[] anIntArray308 = new int[50];

	@OriginalMember(owner = "client!i", name = "h", descriptor = "I")
	public static int anInt2340 = 0;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ILclient!ja;Lclient!nc;ZI[Lclient!c;)V")
	public static void method2489(@OriginalArg(0) int arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) Class106 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) Class27[] arg4) {
		@Pc(13) int local13;
		@Pc(17) int local17;
		@Pc(34) int local34;
		if (!arg3) {
			for (@Pc(9) int local9 = 0; local9 < 4; local9++) {
				for (local13 = 0; local13 < Static153.anInt2883; local13++) {
					for (local17 = 0; local17 < Static246.anInt4606; local17++) {
						if ((Static265.aByteArrayArrayArray11[local9][local13][local17] & 0x1) != 0) {
							local34 = local9;
							if ((Static265.aByteArrayArrayArray11[1][local13][local17] & 0x2) != 0) {
								local34 = local9 - 1;
							}
							if (local34 >= 0) {
								arg4[local34].method513(local13, local17);
							}
						}
					}
				}
			}
		}
		@Pc(75) int[][] local75 = new int[Static153.anInt2883][Static246.anInt4606];
		for (local13 = 0; local13 < arg0; local13++) {
			for (local17 = 0; local17 < Static246.anInt4606; local17++) {
				Static118.anIntArray300[local17] = 0;
				Static212.anIntArray453[local17] = 0;
				Static147.anIntArray340[local17] = 0;
				Static225.anIntArray478[local17] = 0;
				Static246.anIntArray505[local17] = 0;
			}
			for (local34 = -5; local34 < Static153.anInt2883; local34++) {
				@Pc(119) int local119;
				@Pc(136) int local136;
				@Pc(199) int local199;
				for (@Pc(113) int local113 = 0; local113 < Static246.anInt4606; local113++) {
					local119 = local34 + 5;
					@Pc(180) int local180;
					if (local119 < Static153.anInt2883) {
						local136 = Static53.aByteArrayArrayArray4[local13][local119][local113] & 0xFF;
						if (local136 > 0) {
							@Pc(144) Class181 local144 = Static60.method983(local136 - 1);
							Static118.anIntArray300[local113] += local144.anInt5369;
							Static212.anIntArray453[local113] += local144.anInt5379;
							Static147.anIntArray340[local113] += local144.anInt5371;
							Static225.anIntArray478[local113] += local144.anInt5368;
							local180 = Static246.anIntArray505[local113]++;
						}
					}
					local136 = local34 - 5;
					if (local136 >= 0) {
						local199 = Static53.aByteArrayArrayArray4[local13][local136][local113] & 0xFF;
						if (local199 > 0) {
							@Pc(207) Class181 local207 = Static60.method983(local199 - 1);
							Static118.anIntArray300[local113] -= local207.anInt5369;
							Static212.anIntArray453[local113] -= local207.anInt5379;
							Static147.anIntArray340[local113] -= local207.anInt5371;
							Static225.anIntArray478[local113] -= local207.anInt5368;
							local180 = Static246.anIntArray505[local113]--;
						}
					}
				}
				if (local34 >= 0) {
					local119 = 0;
					local136 = 0;
					local199 = 0;
					@Pc(264) int local264 = 0;
					@Pc(266) int local266 = 0;
					for (@Pc(268) int local268 = -5; local268 < Static246.anInt4606; local268++) {
						@Pc(274) int local274 = local268 + 5;
						if (local274 < Static246.anInt4606) {
							local199 += Static147.anIntArray340[local274];
							local266 += Static246.anIntArray505[local274];
							local119 += Static118.anIntArray300[local274];
							local136 += Static212.anIntArray453[local274];
							local264 += Static225.anIntArray478[local274];
						}
						@Pc(315) int local315 = local268 - 5;
						if (local315 >= 0) {
							local136 -= Static212.anIntArray453[local315];
							local266 -= Static246.anIntArray505[local315];
							local199 -= Static147.anIntArray340[local315];
							local264 -= Static225.anIntArray478[local315];
							local119 -= Static118.anIntArray300[local315];
						}
						if (local268 >= 0 && local264 > 0 && local266 > 0) {
							local75[local34][local268] = Static136.method2606(local119 * 256 / local264, local136 / local266, local199 / local266);
						}
					}
				}
			}
			Static136.method2605(Static203.aClass106Array3[local13], local13, Static246.anInt4606, Static230.aByteArrayArrayArray8[local13], Static53.aByteArrayArrayArray4[local13], Static116.aByteArrayArrayArray7[local13], local75, Static153.anInt2883, arg2, arg3, Static5.aByteArrayArrayArray1[local13], arg1);
			Static53.aByteArrayArrayArray4[local13] = null;
			Static116.aByteArrayArrayArray7[local13] = null;
			Static5.aByteArrayArrayArray1[local13] = null;
			Static230.aByteArrayArrayArray8[local13] = null;
		}
		if (!arg3) {
			if (Static194.aBoolean277) {
				Static186.method3518();
			}
			if (Static282.anInt5340 != 0) {
				Static230.method4093();
			}
		}
		for (local17 = 0; local17 < arg0; local17++) {
			Static203.aClass106Array3[local17].method5721();
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public static void method2490() {
		for (@Pc(12) int local12 = 0; local12 < Static284.anInt5378; local12++) {
			@Pc(18) int local18 = Static263.anIntArray530[local12]--;
			if (Static263.anIntArray530[local12] >= -10) {
				@Pc(99) Class12 local99 = Static65.aClass12Array1[local12];
				if (local99 == null) {
					local99 = Static357.method221(Static15.aClass53_14, Static194.anIntArray433[local12], 0);
					if (local99 == null) {
						continue;
					}
					Static263.anIntArray530[local12] += local99.method223();
					Static65.aClass12Array1[local12] = local99;
				}
				if (Static263.anIntArray530[local12] < 0) {
					@Pc(229) int local229;
					if (Static209.anIntArray449[local12] == 0) {
						local229 = Static125.anIntArray307[local12] * Static252.anInt4702 >> 8;
					} else {
						@Pc(145) int local145 = (Static209.anIntArray449[local12] & 0xFF) * 128;
						@Pc(153) int local153 = Static209.anIntArray449[local12] >> 16 & 0xFF;
						@Pc(162) int local162 = local153 * 128 + 64 - Static253.aClass44_Sub4_Sub4_Sub1_1.anInt6340;
						if (local162 < 0) {
							local162 = -local162;
						}
						@Pc(175) int local175 = Static209.anIntArray449[local12] >> 8 & 0xFF;
						@Pc(184) int local184 = local175 * 128 + 64 - Static253.aClass44_Sub4_Sub4_Sub1_1.anInt6339;
						if (local184 < 0) {
							local184 = -local184;
						}
						@Pc(198) int local198 = local184 + local162 - 128;
						if (local198 > local145) {
							Static263.anIntArray530[local12] = -100;
							continue;
						}
						if (local198 < 0) {
							local198 = 0;
						}
						local229 = Static125.anIntArray307[local12] * Static243.anInt4564 * (local145 - local198) / local145 >> 8;
					}
					if (local229 > 0) {
						@Pc(249) Class6_Sub11_Sub1 local249 = local99.method222().method2389(Static191.aClass63_1);
						@Pc(254) Class6_Sub12_Sub4 local254 = Static369.method5691(local249, local229);
						local254.method5675(Static194.anIntArray432[local12] - 1);
						Static241.aClass6_Sub12_Sub3_6.method4904(local254);
					}
					Static263.anIntArray530[local12] = -100;
				}
			} else {
				Static284.anInt5378--;
				for (@Pc(34) int local34 = local12; local34 < Static284.anInt5378; local34++) {
					Static194.anIntArray433[local34] = Static194.anIntArray433[local34 + 1];
					Static65.aClass12Array1[local34] = Static65.aClass12Array1[local34 + 1];
					Static194.anIntArray432[local34] = Static194.anIntArray432[local34 + 1];
					Static263.anIntArray530[local34] = Static263.anIntArray530[local34 + 1];
					Static209.anIntArray449[local34] = Static209.anIntArray449[local34 + 1];
					Static125.anIntArray307[local34] = Static125.anIntArray307[local34 + 1];
				}
				local12--;
			}
		}
		if (Static40.aBoolean54 && !Static60.method985()) {
			if (Static62.anInt1130 != 0 && Static253.anInt4718 != -1) {
				Static177.method3430(Static62.anInt1130, Static244.aClass53_116, Static253.anInt4718);
			}
			Static40.aBoolean54 = false;
		} else if (Static62.anInt1130 != 0 && Static253.anInt4718 != -1 && !Static60.method985()) {
			Static131.aClass6_Sub10_Sub1_2.method2886(47);
			Static131.aClass6_Sub10_Sub1_2.method3976(Static253.anInt4718);
			Static253.anInt4718 = -1;
		}
	}
}
