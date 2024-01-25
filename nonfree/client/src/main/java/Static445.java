import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static445 {

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
	public static int anInt7219;

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_102 = new Class349(70, 7);

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_103 = new Class349(28, 15);

	@OriginalMember(owner = "client!ob", name = "n", descriptor = "I")
	public static int anInt7222 = -1;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIIIIBI)V")
	public static void method6509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (arg8 == arg0 && arg2 == arg4 && arg5 == arg6 && arg3 == arg7) {
			Static242.method7780(arg4, arg3, arg8, arg1, arg6);
			return;
		}
		@Pc(25) int local25 = arg8;
		@Pc(27) int local27 = arg4;
		@Pc(31) int local31 = arg8 * 3;
		@Pc(35) int local35 = arg4 * 3;
		@Pc(39) int local39 = arg0 * 3;
		@Pc(43) int local43 = arg2 * 3;
		@Pc(47) int local47 = arg5 * 3;
		@Pc(51) int local51 = arg7 * 3;
		@Pc(61) int local61 = local39 + arg6 - local47 - arg8;
		@Pc(72) int local72 = arg3 + local43 - arg4 - local51;
		@Pc(80) int local80 = local47 + local31 - local39 - local39;
		@Pc(89) int local89 = local35 + local51 - local43 - local43;
		@Pc(93) int local93 = local39 - local31;
		@Pc(98) int local98 = local43 - local35;
		for (@Pc(100) int local100 = 128; local100 <= 4096; local100 += 128) {
			@Pc(108) int local108 = local100 * local100 >> 12;
			@Pc(114) int local114 = local108 * local100 >> 12;
			@Pc(118) int local118 = local114 * local61;
			@Pc(122) int local122 = local114 * local72;
			@Pc(126) int local126 = local108 * local80;
			@Pc(130) int local130 = local108 * local89;
			@Pc(134) int local134 = local100 * local93;
			@Pc(138) int local138 = local100 * local98;
			@Pc(149) int local149 = (local118 + local126 + local134 >> 12) + arg8;
			@Pc(159) int local159 = arg4 + (local138 + local122 + local130 >> 12);
			Static242.method7780(local27, local159, local25, arg1, local149);
			local25 = local149;
			local27 = local159;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
	public static void method6510() {
		for (@Pc(7) int local7 = 0; local7 < Static66.anInt1152; local7++) {
			@Pc(13) Class177 local13 = Static461.aClass177Array1[local7];
			@Pc(15) boolean local15 = false;
			@Pc(184) int local184;
			if (local13.aClass2_Sub23_Sub2_1 == null) {
				local13.anInt4167--;
				if (local13.anInt4167 < (local13.method3779() ? -1500 : -10)) {
					local15 = true;
				} else {
					if (local13.aByte76 == 1 && local13.aClass250_1 == null) {
						local13.aClass250_1 = Static735.method6017(Static157.aClass254_60, local13.anInt4172, 0);
						if (local13.aClass250_1 == null) {
							continue;
						}
						local13.anInt4167 += local13.aClass250_1.method6018();
					} else if (local13.method3779() && (local13.aClass2_Sub17_1 == null || local13.aClass2_Sub4_Sub1_1 == null)) {
						if (local13.aClass2_Sub17_1 == null) {
							local13.aClass2_Sub17_1 = Static115.method1664(Static514.aClass254_129, local13.anInt4172);
						}
						if (local13.aClass2_Sub17_1 == null) {
							continue;
						}
						if (local13.aClass2_Sub4_Sub1_1 == null) {
							local13.aClass2_Sub4_Sub1_1 = local13.aClass2_Sub17_1.method1672(new int[] { 22050 });
							if (local13.aClass2_Sub4_Sub1_1 == null) {
								continue;
							}
						}
					}
					if (local13.anInt4167 < 0) {
						@Pc(159) int local159 = 8192;
						if (local13.anInt4169 == 0) {
							local184 = local13.anInt4166 * (local13.aByte76 == 3 ? Static650.aClass2_Sub30_29.aClass11_Sub5_2.method1696(1) : Static650.aClass2_Sub30_29.aClass11_Sub5_5.method1696(1)) >> 2;
						} else {
							@Pc(193) int local193 = local13.anInt4169 >> 24 & 0x3;
							if (Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aByte133 == local193) {
								@Pc(208) int local208 = (local13.anInt4169 & 0xFF) << 9;
								@Pc(214) int local214 = Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.method2046() << 8;
								@Pc(221) int local221 = local13.anInt4169 >> 16 & 0xFF;
								@Pc(233) int local233 = (local221 << 9) + local214 + 256 - Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt10229;
								@Pc(240) int local240 = local13.anInt4169 >> 8 & 0xFF;
								@Pc(252) int local252 = local214 + (local240 << 9) + 256 - Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt10228;
								@Pc(261) int local261 = Math.abs(local233) + Math.abs(local252) - 512;
								if (local261 > local208) {
									local13.anInt4167 = -99999;
									continue;
								}
								if (local261 < 0) {
									local261 = 0;
								}
								local184 = (local208 - local261) * Static650.aClass2_Sub30_29.aClass11_Sub5_1.method1696(1) * local13.anInt4166 / local208 >> 2;
								if (local13.aClass4_Sub2_15 != null && local13.aClass4_Sub2_15 instanceof Class4_Sub2_Sub1) {
									@Pc(311) Class4_Sub2_Sub1 local311 = (Class4_Sub2_Sub1) local13.aClass4_Sub2_15;
									@Pc(314) short local314 = local311.aShort130;
									@Pc(317) short local317 = local311.aShort127;
								}
								if (local233 != 0 || local252 != 0) {
									@Pc(346) int local346 = -Static611.anInt9456 - (int) (Math.atan2((double) local233, (double) local252) * 2607.5945876176133D) - 4096 & 0x3FFF;
									if (local346 > 8192) {
										local346 = 16384 - local346;
									}
									@Pc(360) int local360;
									if (local261 <= 0) {
										local360 = 8192;
									} else if (local261 < 4096) {
										local360 = (8192 - local261) / 4096 + 8192;
									} else {
										local360 = 16384;
									}
									local159 = (16384 - local360 >> 1) + local360 * local346 / 8192;
								}
							} else {
								local184 = 0;
							}
						}
						if (local184 > 0) {
							@Pc(400) Class2_Sub4_Sub1 local400 = null;
							if (local13.aByte76 == 1) {
								local400 = local13.aClass250_1.method6019().method7558(Static182.aClass51_6);
							} else if (local13.method3779()) {
								local400 = local13.aClass2_Sub4_Sub1_1;
							}
							@Pc(430) Class2_Sub23_Sub2 local430 = local13.aClass2_Sub23_Sub2_1 = Static733.method4506(local400, local13.anInt4168, local184, local159);
							local430.method4498(local13.anInt4170 - 1);
							Static130.aClass2_Sub23_Sub3_1.method6795(local430);
						}
					}
				}
			} else if (!local13.aClass2_Sub23_Sub2_1.method9871()) {
				local15 = true;
			}
			if (local15) {
				Static66.anInt1152--;
				for (local184 = local7; local184 < Static66.anInt1152; local184++) {
					Static461.aClass177Array1[local184] = Static461.aClass177Array1[local184 + 1];
				}
				local7--;
			}
		}
		if (Static366.aBoolean494 && !Static156.method2243(-1)) {
			if (Static650.aClass2_Sub30_29.aClass11_Sub5_4.method1696(1) != 0 && Static717.anInt10936 != -1) {
				if (Static429.aClass2_Sub23_Sub5_2 == null) {
					Static704.method9423(Static650.aClass2_Sub30_29.aClass11_Sub5_4.method1696(1), Static177.aClass254_66, Static717.anInt10936);
				} else {
					Static471.method6761(Static650.aClass2_Sub30_29.aClass11_Sub5_4.method1696(1), Static717.anInt10936, Static177.aClass254_66, Static429.aClass2_Sub23_Sub5_2);
				}
			}
			Static366.aBoolean494 = false;
			Static429.aClass2_Sub23_Sub5_2 = null;
		} else if (Static650.aClass2_Sub30_29.aClass11_Sub5_4.method1696(1) != 0 && Static717.anInt10936 != -1 && !Static156.method2243(-1)) {
			@Pc(566) Class2_Sub33 local566 = Static592.method8154(Static724.aClass349_163, Static487.aClass221_2.aClass48_1);
			local566.aClass2_Sub20_Sub2_1.method8577(Static717.anInt10936);
			Static487.aClass221_2.method5173(local566);
			Static717.anInt10936 = -1;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IZ)V")
	public static void method6516(@OriginalArg(1) boolean arg0) {
		Static724.method9629(Static295.anInt4558, Static151.anInt7983, arg0, Static542.anInt8552);
	}
}
