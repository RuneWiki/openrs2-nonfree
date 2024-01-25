import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!af", name = "C", descriptor = "I")
	public static int anInt123;

	@OriginalMember(owner = "client!af", name = "F", descriptor = "Lclient!dp;")
	public static Class53 aClass53_9;

	@OriginalMember(owner = "client!af", name = "N", descriptor = "[Z")
	public static boolean[] aBooleanArray1;

	@OriginalMember(owner = "client!af", name = "v", descriptor = "I")
	public static int anInt117 = 2;

	@OriginalMember(owner = "client!af", name = "I", descriptor = "S")
	public static short aShort1 = 1;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIIII)V")
	public static void method119(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4) {
		Static144.method2691(arg3, 0, arg4, arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(II)V")
	public static void method121() {
		Static223.aClass70_74.method1397(5);
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(II)I")
	public static int method122(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!af", name = "e", descriptor = "(I)Lclient!aj;")
	public static Class10 method124() {
		try {
			return new Class10_Sub3();
		} catch (@Pc(13) Throwable local13) {
			try {
				return (Class10) Class.forName("Class10_Sub2").getDeclaredConstructor().newInstance();
			} catch (@Pc(19) Throwable local19) {
				return new Class10_Sub1();
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIII)I")
	public static int method125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 <= arg0) {
			return arg0 > arg1 ? arg1 : arg0;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!af", name = "f", descriptor = "(I)V")
	public static void method127() {
		for (@Pc(15) int local15 = -1; local15 < Static200.anInt3712; local15++) {
			@Pc(23) int local23;
			if (local15 == -1) {
				local23 = 2047;
			} else {
				local23 = Static183.anIntArray400[local15];
			}
			@Pc(33) Class44_Sub4_Sub4_Sub1 local33 = Static343.aClass44_Sub4_Sub4_Sub1Array1[local23];
			if (local33 != null) {
				Static103.method2101(local33.method4714(), local33);
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "g", descriptor = "(I)V")
	public static void method128() {
		while (true) {
			@Pc(13) Class6_Sub22 local13 = (Class6_Sub22) Static109.aClass211_16.method5587();
			if (local13 == null) {
				return;
			}
			if (Static39.aClass187ArrayArrayArray1 != null) {
				@Pc(34) Class44_Sub4_Sub4 local34;
				@Pc(29) int local29;
				if (local13.anInt3143 < 0) {
					local29 = -local13.anInt3143 - 1;
					if (Static44.anInt879 == local29) {
						local34 = Static253.aClass44_Sub4_Sub4_Sub1_1;
					} else {
						local34 = Static343.aClass44_Sub4_Sub4_Sub1Array1[local29];
					}
				} else {
					local29 = local13.anInt3143 - 1;
					local34 = Static239.aClass44_Sub4_Sub4_Sub2Array8[local29];
				}
				if (local34 != null) {
					@Pc(58) Class66 local58 = Static196.method3622(local13.anInt3139);
					@Pc(69) int local69;
					@Pc(72) int local72;
					if (local13.anInt3134 == 1 || local13.anInt3134 == 3) {
						local69 = local58.lb;
						local72 = local58.anInt1489;
					} else {
						local69 = local58.anInt1489;
						local72 = local58.lb;
					}
					@Pc(87) int local87 = (local69 >> 1) + local13.anInt3135;
					@Pc(96) int local96 = (local69 + 1 >> 1) + local13.anInt3135;
					@Pc(103) int local103 = local13.anInt3129 + (local72 >> 1);
					@Pc(112) int local112 = (local72 + 1 >> 1) + local13.anInt3129;
					@Pc(117) Class106 local117 = Static203.aClass106Array3[local34.aByte90];
					@Pc(141) int local141 = local117.method5720(local87, local103) + local117.method5720(local96, local103) + local117.method5720(local87, local112) + local117.method5720(local96, local112) >> 2;
					@Pc(143) Interface7 local143 = null;
					@Pc(148) int local148 = Static348.anIntArray718[local13.anInt3138];
					if (local148 == 0) {
						local143 = (Interface7) Static9.method161(local34.aByte90, local13.anInt3135, local13.anInt3129);
					} else if (local148 == 1) {
						local143 = (Interface7) Static105.method2135(local34.aByte90, local13.anInt3135, local13.anInt3129);
					} else if (local148 == 2) {
						local143 = (Interface7) Static162.method3236(local34.aByte90, local13.anInt3135, local13.anInt3129, sc.class);
					} else if (local148 == 3) {
						local143 = (Interface7) Static68.method4012(local34.aByte90, local13.anInt3135, local13.anInt3129);
					}
					if (local143 != null) {
						Static86.method1480(0, -1, local13.anInt3129, local13.anInt3132, local13.anInt3130 + 1, local148, local13.anInt3135, local34.aByte90, 0);
						local34.anInt5166 = local13.anInt3135 * 128 + local69 * 64;
						local34.anInt5157 = local141;
						local34.anInterface7_3 = local143;
						local34.anInt5165 = Static76.anInt2853 + local13.anInt3132;
						local34.anInt5163 = local13.anInt3130 + Static76.anInt2853;
						local34.anInt5164 = local72 * 64 + local13.anInt3129 * 128;
						@Pc(269) int local269 = local13.anInt3128;
						@Pc(272) int local272 = local13.anInt3140;
						@Pc(275) int local275 = local13.anInt3136;
						@Pc(284) int local284;
						if (local269 > local272) {
							local284 = local269;
							local269 = local272;
							local272 = local284;
						}
						@Pc(291) int local291 = local13.anInt3141;
						if (local275 > local291) {
							local284 = local275;
							local275 = local291;
							local291 = local284;
						}
						local34.anInt5160 = local272 + local13.anInt3135;
						local34.anInt5162 = local13.anInt3135 + local269;
						local34.anInt5154 = local13.anInt3129 + local291;
						local34.anInt5161 = local13.anInt3129 + local275;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(BII)Lclient!mb;")
	public static Class132 method131(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class132 local7 = Static249.method4316(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass132Array2 == null || arg1 >= local7.aClass132Array2.length) {
			return null;
		} else {
			return local7.aClass132Array2[arg1];
		}
	}
}
