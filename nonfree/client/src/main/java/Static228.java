import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "Lclient!co;")
	public static Class4_Sub6_Sub2 aClass4_Sub6_Sub2_2;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
	public static int anInt4576 = 0;

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "Lclient!ul;")
	public static Class172 aClass172_38 = new Class172(20);

	@OriginalMember(owner = "client!qk", name = "g", descriptor = "I")
	public static int anInt4580 = 0;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIII)V")
	public static void method3583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static190.method3151(arg4 + arg2, Static253.anIntArrayArray34[arg1], arg3, arg2 - arg4);
		@Pc(19) int local19 = 0;
		@Pc(23) int local23 = arg0 * arg0;
		@Pc(27) int local27 = arg4 * arg4;
		@Pc(29) int local29 = arg0;
		@Pc(39) int local39 = local27 << 1;
		@Pc(43) int local43 = local23 << 1;
		@Pc(47) int local47 = arg0 << 1;
		@Pc(56) int local56 = (1 - local47) * local27 + local43;
		@Pc(65) int local65 = local23 - (local47 - 1) * local39;
		@Pc(69) int local69 = local23 << 2;
		@Pc(73) int local73 = local27 << 2;
		@Pc(81) int local81 = local43 * 3;
		@Pc(89) int local89 = local39 * ((arg0 << 1) - 3);
		@Pc(95) int local95 = local69;
		@Pc(101) int local101 = local73 * (arg0 - 1);
		while (local29 > 0) {
			if (local56 < 0) {
				while (local56 < 0) {
					local19++;
					local65 += local95;
					local56 += local81;
					local81 += local69;
					local95 += local69;
				}
			}
			if (local65 < 0) {
				local56 += local81;
				local19++;
				local65 += local95;
				local95 += local69;
				local81 += local69;
			}
			local65 += -local89;
			local89 -= local73;
			local29--;
			local56 += -local101;
			@Pc(175) int local175 = arg1 - local29;
			local101 -= local73;
			@Pc(183) int local183 = local19 + arg2;
			@Pc(188) int local188 = arg1 + local29;
			@Pc(193) int local193 = arg2 - local19;
			Static190.method3151(local183, Static253.anIntArrayArray34[local175], arg3, local193);
			Static190.method3151(local183, Static253.anIntArrayArray34[local188], arg3, local193);
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)V")
	public static void method3584(@OriginalArg(1) int arg0) {
		@Pc(8) Class4_Sub2_Sub15 local8 = Static131.method1210(arg0, 4);
		local8.method2875();
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIII)V")
	public static void method3585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) int local8 = 0;
		@Pc(10) int local10 = arg0;
		@Pc(16) int local16 = -1;
		@Pc(19) int local19 = -arg0;
		@Pc(27) int local27 = Static101.method1680(Static121.anInt2460, Static173.anInt3481, arg1 + arg0);
		@Pc(36) int local36 = Static101.method1680(Static121.anInt2460, Static173.anInt3481, arg1 - arg0);
		Static190.method3151(local27, Static253.anIntArrayArray34[arg2], arg3, local36);
		while (local8 < local10) {
			local16 += 2;
			local19 += local16;
			@Pc(69) int local69;
			@Pc(65) int local65;
			@Pc(88) int local88;
			@Pc(97) int local97;
			if (local19 > 0) {
				local10--;
				local19 -= local10 << 1;
				local65 = arg2 + local10;
				local69 = arg2 - local10;
				if (local65 >= Static293.anInt5688 && Static100.anInt1982 >= local69) {
					local88 = Static101.method1680(Static121.anInt2460, Static173.anInt3481, arg1 + local8);
					local97 = Static101.method1680(Static121.anInt2460, Static173.anInt3481, arg1 - local8);
					if (Static100.anInt1982 >= local65) {
						Static190.method3151(local88, Static253.anIntArrayArray34[local65], arg3, local97);
					}
					if (Static293.anInt5688 <= local69) {
						Static190.method3151(local88, Static253.anIntArrayArray34[local69], arg3, local97);
					}
				}
			}
			local8++;
			local65 = arg2 + local8;
			local69 = arg2 - local8;
			if (Static293.anInt5688 <= local65 && Static100.anInt1982 >= local69) {
				local88 = Static101.method1680(Static121.anInt2460, Static173.anInt3481, local10 + arg1);
				local97 = Static101.method1680(Static121.anInt2460, Static173.anInt3481, arg1 - local10);
				if (local65 <= Static100.anInt1982) {
					Static190.method3151(local88, Static253.anIntArrayArray34[local65], arg3, local97);
				}
				if (Static293.anInt5688 <= local69) {
					Static190.method3151(local88, Static253.anIntArrayArray34[local69], arg3, local97);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "([Lclient!lg;II)V")
	public static void method3586(@OriginalArg(0) Class97[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			@Pc(19) Class97 local19 = arg0[local11];
			if (local19 != null && local19.anInt3165 == arg1 && (!local19.aBoolean192 || !Static41.method790(local19))) {
				if (local19.anInt3177 == 0) {
					if (!local19.aBoolean192 && Static41.method790(local19) && Static218.aClass97_19 != local19) {
						continue;
					}
					method3586(arg0, local19.anInt3162);
					if (local19.aClass97Array1 != null) {
						method3586(local19.aClass97Array1, local19.anInt3162);
					}
					@Pc(73) Class4_Sub30 local73 = (Class4_Sub30) Static167.aClass163_25.method4188((long) local19.anInt3162);
					if (local73 != null) {
						Static214.method4432(local73.anInt5208);
					}
				}
				if (local19.anInt3177 == 6) {
					@Pc(105) int local105;
					if (local19.anInt3122 != -1 || local19.anInt3139 != -1) {
						@Pc(100) boolean local100 = Static182.method2941(local19);
						if (local100) {
							local105 = local19.anInt3139;
						} else {
							local105 = local19.anInt3122;
						}
						if (local105 != -1) {
							@Pc(117) Class186 local117 = Static51.method992(local105);
							if (local117 != null) {
								local19.anInt3188 += Static309.anInt1336;
								while (local19.anInt3188 > local117.anIntArray470[local19.anInt3194]) {
									local19.anInt3188 -= local117.anIntArray470[local19.anInt3194];
									local19.anInt3194++;
									if (local117.anIntArray469.length <= local19.anInt3194) {
										local19.anInt3194 -= local117.anInt5823;
										if (local19.anInt3194 < 0 || local117.anIntArray469.length <= local19.anInt3194) {
											local19.anInt3194 = 0;
										}
									}
									local19.anInt3120 = local19.anInt3194 + 1;
									if (local117.anIntArray469.length <= local19.anInt3120) {
										local19.anInt3120 -= local117.anInt5823;
										if (local19.anInt3120 < 0 || local19.anInt3120 >= local117.anIntArray469.length) {
											local19.anInt3120 = -1;
										}
									}
									Static178.method2927(local19);
								}
							}
						}
					}
					if (local19.anInt3197 != 0 && !local19.aBoolean192) {
						@Pc(236) int local236 = local19.anInt3197 >> 16;
						local105 = local19.anInt3197 << 16 >> 16;
						@Pc(247) int local247 = local236 * Static309.anInt1336;
						local105 *= Static309.anInt1336;
						local19.anInt3143 = local19.anInt3143 + local105 & 0x7FF;
						local19.anInt3114 = local247 + local19.anInt3114 & 0x7FF;
						Static178.method2927(local19);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(I[Lclient!bl;)V")
	public static void method3588(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub8[] arg1) {
		Static158.aClass4_Sub8ArrayArray1[arg0] = arg1;
	}
}
