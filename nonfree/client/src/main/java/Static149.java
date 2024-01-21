import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
	public static int anInt3040 = 0;

	@OriginalMember(owner = "client!pd", name = "j", descriptor = "Z")
	public static boolean aBoolean142 = false;

	@OriginalMember(owner = "client!pd", name = "o", descriptor = "[Lclient!oc;")
	public static final Class70[] aClass70Array54 = new Class70[1000];

	@OriginalMember(owner = "client!pd", name = "v", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1432 = Static193.method3027("<col=ff9040>");

	@OriginalMember(owner = "client!pd", name = "x", descriptor = "[I")
	public static final int[] anIntArray220 = new int[25];

	@OriginalMember(owner = "client!pd", name = "y", descriptor = "[I")
	public static final int[] anIntArray221 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!pd", name = "z", descriptor = "[I")
	public static final int[] anIntArray222 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!pd", name = "F", descriptor = "[I")
	public static final int[] anIntArray223 = new int[] { 1, 0, 0, 0, 1, 0, 2 };

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(DI)V")
	public static void method2161(@OriginalArg(0) double arg0) {
		if (Static80.aDouble42 == arg0) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < 256; local12++) {
			@Pc(24) int local24 = (int) (Math.pow((double) local12 / 255.0D, arg0) * 255.0D);
			Static7.anIntArray3[local12] = local24 > 255 ? 255 : local24;
		}
		Static80.aDouble42 = arg0;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IB)V")
	public static void method2167(@OriginalArg(0) int arg0) {
		Static147.anInt3029 += arg0 * 128;
		@Pc(29) int local29;
		if (Static147.anInt3029 > Static39.anIntArray41.length) {
			Static147.anInt3029 -= Static39.anIntArray41.length;
			local29 = (int) (Math.random() * 12.0D);
			Static36.method638(Static163.aClass3_Sub3_Sub2_Sub2Array8[local29]);
		}
		local29 = 0;
		@Pc(40) int local40 = arg0 * 128;
		@Pc(47) int local47 = (256 - arg0) * 128;
		@Pc(72) int local72;
		for (@Pc(49) int local49 = 0; local49 < local47; local49++) {
			local72 = Static209.anIntArray380[local29 + local40] - Static39.anIntArray41[Static147.anInt3029 + local29 & Static39.anIntArray41.length + -1] * arg0 / 6;
			if (local72 < 0) {
				local72 = 0;
			}
			Static209.anIntArray380[local29++] = local72;
		}
		@Pc(95) int local95;
		@Pc(97) int local97;
		@Pc(103) int local103;
		for (local72 = 256 - arg0; local72 < 256; local72++) {
			local95 = local72 * 128;
			for (local97 = 0; local97 < 128; local97++) {
				local103 = (int) (Math.random() * 100.0D);
				if (local103 < 50 && local97 > 10 && local97 < 118) {
					Static209.anIntArray380[local95 + local97] = 255;
				} else {
					Static209.anIntArray380[local97 + local95] = 0;
				}
			}
		}
		if (Static138.anInt2811 > 0) {
			Static138.anInt2811 -= arg0 * 4;
		}
		if (Static9.anInt205 > 0) {
			Static9.anInt205 -= arg0 * 4;
		}
		if (Static138.anInt2811 == 0 && Static9.anInt205 == 0) {
			local95 = (int) (Math.random() * (double) (2000 / arg0));
			if (local95 == 0) {
				Static138.anInt2811 = 1024;
			}
			if (local95 == 1) {
				Static9.anInt205 = 1024;
			}
		}
		for (local95 = 0; local95 < 256 - arg0; local95++) {
			Static184.anIntArray323[local95] = Static184.anIntArray323[local95 + arg0];
		}
		for (local97 = 256 - arg0; local97 < 256; local97++) {
			Static184.anIntArray323[local97] = (int) (Math.sin((double) Static172.anInt3459 / 14.0D) * 16.0D + Math.sin((double) Static172.anInt3459 / 15.0D) * 14.0D + Math.sin((double) Static172.anInt3459 / 16.0D) * 12.0D);
			Static172.anInt3459++;
		}
		Static154.anInt3185 += arg0;
		local103 = (arg0 + (Static184.anInt3760 & 0x1)) / 2;
		if (local103 <= 0) {
			return;
		}
		@Pc(271) int local271;
		@Pc(278) int local278;
		for (@Pc(263) int local263 = 0; local263 < Static154.anInt3185 * 100; local263++) {
			local271 = (int) (Math.random() * 124.0D) + 2;
			local278 = (int) (Math.random() * 128.0D) + 128;
			Static209.anIntArray380[local271 + (local278 << 7)] = 192;
		}
		Static154.anInt3185 = 0;
		@Pc(308) int local308;
		@Pc(311) int local311;
		for (local271 = 0; local271 < 256; local271++) {
			local278 = 0;
			local308 = local271 * 128;
			for (local311 = -local103; local311 < 128; local311++) {
				if (local103 + local311 < 128) {
					local278 += Static209.anIntArray380[local311 + local308 + local103];
				}
				if (local311 - local103 - 1 >= 0) {
					local278 -= Static209.anIntArray380[local308 + local311 - local103 - 1];
				}
				if (local311 >= 0) {
					Static91.anIntArray94[local311 + local308] = local278 / (local103 * 2 + 1);
				}
			}
		}
		for (local278 = 0; local278 < 128; local278++) {
			local308 = 0;
			for (local311 = -local103; local311 < 256; local311++) {
				@Pc(389) int local389 = local311 * 128;
				if (local103 + local311 < 256) {
					local308 += Static91.anIntArray94[local103 * 128 + local389 + local278];
				}
				if (local311 - local103 - 1 >= 0) {
					local308 -= Static91.anIntArray94[local278 + local389 - (local103 + 1) * 128];
				}
				if (local311 >= 0) {
					Static209.anIntArray380[local389 + local278] = local308 / (local103 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V")
	public static void method2172() {
		@Pc(13) int local13 = Static1.anInt1794 - (int) ((double) Static58.aClass6_35.anInt217 / Static87.aDouble115);
		@Pc(27) int local27 = (int) ((double) Static58.aClass6_35.anInt244 / Static87.aDouble115) + Static156.anInt3196;
		@Pc(37) int local37 = Static156.anInt3196 - (int) ((double) Static58.aClass6_35.anInt244 / Static87.aDouble115);
		@Pc(46) int local46 = Static1.anInt1794 + (int) ((double) Static58.aClass6_35.anInt217 / Static87.aDouble115);
		if (local37 < 0) {
			Static54.anInt1162 = -1;
			Static136.anInt2777 = -1;
			Static156.anInt3196 = (int) ((double) Static58.aClass6_35.anInt244 / Static87.aDouble115);
		}
		if (local27 > Static65.anInt1364) {
			Static136.anInt2777 = -1;
			Static54.anInt1162 = -1;
			Static156.anInt3196 = Static65.anInt1364 - (int) ((double) Static58.aClass6_35.anInt244 / Static87.aDouble115);
		}
		if (local13 < 0) {
			Static54.anInt1162 = -1;
			Static136.anInt2777 = -1;
			Static1.anInt1794 = (int) ((double) Static58.aClass6_35.anInt217 / Static87.aDouble115);
		}
		if (local46 > Static50.anInt1046) {
			Static1.anInt1794 = Static50.anInt1046 - (int) ((double) Static58.aClass6_35.anInt217 / Static87.aDouble115);
			Static136.anInt2777 = -1;
			Static54.anInt1162 = -1;
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "([S[Lclient!oc;B)V")
	public static void method2175(@OriginalArg(0) short[] arg0, @OriginalArg(1) Class70[] arg1) {
		Static114.method1649(arg0, arg1, arg1.length - 1, 0);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I[Lclient!b;I)V")
	public static void method2178(@OriginalArg(1) Class6[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class6 local6 = arg0[local1];
			if (local6 != null && local6.anInt198 == arg1 && (!local6.aBoolean21 || !Static103.method1468(local6))) {
				if (local6.anInt250 == 0) {
					if (!local6.aBoolean21 && Static103.method1468(local6) && Static85.aClass6_51 != local6) {
						continue;
					}
					method2178(arg0, local6.anInt229);
					if (local6.aClass6Array1 != null) {
						method2178(local6.aClass6Array1, local6.anInt229);
					}
					@Pc(63) Class3_Sub10 local63 = (Class3_Sub10) Static144.aClass40_9.method1029((long) local6.anInt229);
					if (local63 != null) {
						Static195.method3038(local63.anInt1427);
					}
				}
				if (local6.anInt250 == 6) {
					@Pc(94) int local94;
					if (local6.anInt248 != -1 || local6.anInt260 != -1) {
						@Pc(89) boolean local89 = Static144.method2087(local6);
						if (local89) {
							local94 = local6.anInt260;
						} else {
							local94 = local6.anInt248;
						}
						if (local94 != -1) {
							@Pc(105) Class3_Sub3_Sub17 local105 = Static11.method254(local94);
							if (local105 != null) {
								local6.anInt210 += Static211.anInt4246;
								while (local105.anIntArray193[local6.anInt265] < local6.anInt210) {
									local6.anInt210 -= local105.anIntArray193[local6.anInt265];
									local6.anInt265++;
									if (local105.anIntArray197.length <= local6.anInt265) {
										local6.anInt265 -= local105.anInt2738;
										if (local6.anInt265 < 0 || local105.anIntArray197.length <= local6.anInt265) {
											local6.anInt265 = 0;
										}
									}
									Static9.method237(local6);
								}
							}
						}
					}
					if (local6.anInt208 != 0 && !local6.aBoolean21) {
						@Pc(184) int local184 = local6.anInt208 >> 16;
						local94 = local6.anInt208 << 16 >> 16;
						@Pc(195) int local195 = local184 * Static211.anInt4246;
						local94 *= Static211.anInt4246;
						local6.anInt200 = local6.anInt200 + local94 & 0x7FF;
						local6.anInt263 = local6.anInt263 + local195 & 0x7FF;
						Static9.method237(local6);
					}
				}
			}
		}
	}
}
