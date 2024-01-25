import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static652 {

	@OriginalMember(owner = "client!vm", name = "g", descriptor = "[I")
	public static final int[] anIntArray569 = new int[2];

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "Z")
	public static boolean aBoolean739 = false;

	@OriginalMember(owner = "client!vm", name = "e", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray14 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIIIII)V")
	public static void method9129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static105.method8317(arg1);
		@Pc(8) int local8 = 0;
		@Pc(13) int local13 = arg1 - arg5;
		if (local13 < 0) {
			local13 = 0;
		}
		@Pc(22) int local22 = arg1;
		@Pc(25) int local25 = -arg1;
		@Pc(27) int local27 = local13;
		@Pc(30) int local30 = -local13;
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = -1;
		@Pc(38) int[] local38 = Static144.anIntArrayArray30[arg3];
		@Pc(43) int local43 = arg0 - local13;
		Static240.method4038(local43, local38, arg2, arg0 - arg1);
		@Pc(57) int local57 = arg0 + local13;
		Static240.method4038(local57, local38, arg4, local43);
		Static240.method4038(arg1 + arg0, local38, arg2, local57);
		while (local22 > local8) {
			local32 += 2;
			local34 += 2;
			local25 += local32;
			local30 += local34;
			if (local30 >= 0 && local27 >= 1) {
				Static318.anIntArray311[local27] = local8;
				local27--;
				local30 -= local27 << 1;
			}
			local8++;
			@Pc(121) int[] local121;
			@Pc(128) int[] local128;
			@Pc(132) int local132;
			@Pc(136) int local136;
			@Pc(141) int local141;
			@Pc(145) int local145;
			@Pc(150) int local150;
			if (local25 >= 0) {
				local22--;
				local25 -= local22 << 1;
				if (local13 > local22) {
					local121 = Static144.anIntArrayArray30[local22 + arg3];
					local128 = Static144.anIntArrayArray30[arg3 - local22];
					local132 = Static318.anIntArray311[local22];
					local136 = local8 + arg0;
					local141 = arg0 - local8;
					local145 = local132 + arg0;
					local150 = arg0 - local132;
					Static240.method4038(local150, local121, arg2, local141);
					Static240.method4038(local145, local121, arg4, local150);
					Static240.method4038(local136, local121, arg2, local145);
					Static240.method4038(local150, local128, arg2, local141);
					Static240.method4038(local145, local128, arg4, local150);
					Static240.method4038(local136, local128, arg2, local145);
				} else {
					local121 = Static144.anIntArrayArray30[local22 + arg3];
					local128 = Static144.anIntArrayArray30[arg3 - local22];
					local132 = arg0 + local8;
					local136 = arg0 - local8;
					Static240.method4038(local132, local121, arg2, local136);
					Static240.method4038(local132, local128, arg2, local136);
				}
			}
			local121 = Static144.anIntArrayArray30[arg3 + local8];
			local128 = Static144.anIntArrayArray30[arg3 - local8];
			local132 = arg0 + local22;
			local136 = arg0 - local22;
			if (local8 >= local13) {
				Static240.method4038(local132, local121, arg2, local136);
				Static240.method4038(local132, local128, arg2, local136);
			} else {
				local141 = local27 < local8 ? Static318.anIntArray311[local8] : local27;
				local145 = arg0 + local141;
				local150 = arg0 - local141;
				Static240.method4038(local150, local121, arg2, local136);
				Static240.method4038(local145, local121, arg4, local150);
				Static240.method4038(local132, local121, arg2, local145);
				Static240.method4038(local150, local128, arg2, local136);
				Static240.method4038(local145, local128, arg4, local150);
				Static240.method4038(local132, local128, arg2, local145);
			}
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)V")
	public static void method9130() {
		for (@Pc(15) int local15 = 0; local15 < Static208.anInt7849; local15++) {
			@Pc(21) Class106 local21 = Static314.aClass106Array1[local15];
			@Pc(23) boolean local23 = false;
			@Pc(184) int local184;
			if (local21.aClass14_Sub1_Sub1_1 == null) {
				local21.anInt2306--;
				if (local21.anInt2306 >= (local21.method2178() ? -1500 : -10)) {
					if (local21.aByte32 == 1 && local21.aClass15_1 == null) {
						local21.aClass15_1 = Static693.method239(Static620.aClass310_121, local21.anInt2311, 0);
						if (local21.aClass15_1 == null) {
							continue;
						}
						local21.anInt2306 += local21.aClass15_1.method240();
					} else if (local21.method2178() && (local21.aClass14_Sub53_1 == null || local21.aClass14_Sub19_Sub1_1 == null)) {
						if (local21.aClass14_Sub53_1 == null) {
							local21.aClass14_Sub53_1 = Static659.method9191(Static237.aClass310_52, local21.anInt2311);
						}
						if (local21.aClass14_Sub53_1 == null) {
							continue;
						}
						if (local21.aClass14_Sub19_Sub1_1 == null) {
							local21.aClass14_Sub19_Sub1_1 = local21.aClass14_Sub53_1.method9197(new int[] { 22050 });
							if (local21.aClass14_Sub19_Sub1_1 == null) {
								continue;
							}
						}
					}
					if (local21.anInt2306 < 0) {
						@Pc(161) int local161 = 8192;
						if (local21.anInt2308 == 0) {
							local184 = local21.anInt2301 * (local21.aByte32 == 3 ? Static181.aClass14_Sub26_9.aClass43_Sub11_4.method3829() : Static181.aClass14_Sub26_9.aClass43_Sub11_3.method3829()) >> 2;
						} else {
							@Pc(174) int local174 = local21.anInt2308 >> 24 & 0x3;
							if (local174 == Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aByte146) {
								@Pc(193) int local193 = (local21.anInt2308 & 0xFF) << 9;
								@Pc(199) int local199 = Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.method2870(0) << 8;
								@Pc(206) int local206 = local21.anInt2308 >> 16 & 0xFF;
								@Pc(218) int local218 = local199 + (local206 << 9) + 256 - Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt11184;
								@Pc(225) int local225 = local21.anInt2308 >> 8 & 0xFF;
								@Pc(236) int local236 = local199 + (local225 << 9) + 256 - Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt11178;
								@Pc(245) int local245 = Math.abs(local218) + Math.abs(local236) - 512;
								if (local193 < local245) {
									local21.anInt2306 = -99999;
									continue;
								}
								if (local245 < 0) {
									local245 = 0;
								}
								local184 = Static181.aClass14_Sub26_9.aClass43_Sub11_5.method3829() * (local193 - local245) * local21.anInt2301 / local193 >> 2;
								if (local21.aClass4_Sub3_6 != null && local21.aClass4_Sub3_6 instanceof Class4_Sub3_Sub3) {
									@Pc(291) Class4_Sub3_Sub3 local291 = (Class4_Sub3_Sub3) local21.aClass4_Sub3_6;
									@Pc(294) short local294 = local291.aShort108;
									@Pc(297) short local297 = local291.aShort109;
								}
								if (local218 != 0 || local236 != 0) {
									@Pc(325) int local325 = -Static669.anInt10940 - (int) (Math.atan2((double) local218, (double) local236) * 2607.5945876176133D) - 4096 & 0x3FFF;
									if (local325 > 8192) {
										local325 = 16384 - local325;
									}
									@Pc(340) int local340;
									if (local245 <= 0) {
										local340 = 8192;
									} else if (local245 < 4096) {
										local340 = (8192 - local245) / 4096 + 8192;
									} else {
										local340 = 16384;
									}
									local161 = (16384 - local340 >> 1) + local325 * local340 / 8192;
								}
							} else {
								local184 = 0;
							}
						}
						if (local184 > 0) {
							@Pc(406) Class14_Sub19_Sub1 local406 = null;
							if (local21.aByte32 == 1) {
								local406 = local21.aClass15_1.method242().method6790(Static291.aClass250_3);
							} else if (local21.method2178()) {
								local406 = local21.aClass14_Sub19_Sub1_1;
							}
							@Pc(436) Class14_Sub1_Sub1 local436 = local21.aClass14_Sub1_Sub1_1 = Static692.method188(local406, local21.anInt2310, local184, local161);
							local436.method152(local21.anInt2312 - 1);
							Static196.aClass14_Sub1_Sub2_1.method1805(local436);
						}
					}
				} else {
					local23 = true;
				}
			} else if (!local21.aClass14_Sub1_Sub1_1.method9512()) {
				local23 = true;
			}
			if (local23) {
				Static208.anInt7849--;
				for (local184 = local15; local184 < Static208.anInt7849; local184++) {
					Static314.aClass106Array1[local184] = Static314.aClass106Array1[local184 + 1];
				}
				local15--;
			}
		}
		if (Static460.aBoolean599 && !Static104.method1717()) {
			if (Static181.aClass14_Sub26_9.aClass43_Sub11_1.method3829() != 0 && Static184.anInt7567 != -1) {
				if (Static157.aClass14_Sub1_Sub3_1 == null) {
					Static494.method7429(Static181.aClass14_Sub26_9.aClass43_Sub11_1.method3829(), Static341.aClass310_67, Static184.anInt7567);
				} else {
					Static469.method9385(Static157.aClass14_Sub1_Sub3_1, Static341.aClass310_67, Static181.aClass14_Sub26_9.aClass43_Sub11_1.method3829(), Static184.anInt7567);
				}
			}
			Static460.aBoolean599 = false;
			Static157.aClass14_Sub1_Sub3_1 = null;
		} else if (Static181.aClass14_Sub26_9.aClass43_Sub11_1.method3829() != 0 && Static184.anInt7567 != -1 && !Static104.method1717()) {
			@Pc(565) Class14_Sub54 local565 = Static72.method1195(Static277.aClass347_2.aClass197_2, Static98.aClass251_54);
			local565.aClass14_Sub21_Sub2_2.method7730(Static184.anInt7567);
			Static277.aClass347_2.method8308(local565);
			Static184.anInt7567 = -1;
		}
	}
}
