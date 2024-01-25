import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!pd", name = "u", descriptor = "I")
	public static int anInt5169;

	@OriginalMember(owner = "client!pd", name = "y", descriptor = "I")
	public static int anInt5172 = 0;

	@OriginalMember(owner = "client!pd", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString185 = "Loading sprites - ";

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILclient!lk;)Z")
	public static boolean method4369(@OriginalArg(1) Interface5 arg0) {
		@Pc(11) Class170 local11 = Static268.method4553(arg0.method5344());
		if (local11.anInt5258 == -1) {
			return true;
		} else {
			@Pc(30) Class154 local30 = Static296.method5021(local11.anInt5258);
			return local30.anInt4686 == -1 ? true : local30.method3995();
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIII)V")
	public static void method4370(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1001) {
			Static139.method2271(10, arg2, arg0);
		} else if (arg1 == 1007) {
			Static139.method2271(11, arg2, arg0);
		} else if (arg1 == 1012) {
			Static139.method2271(12, arg2, arg0);
		} else if (arg1 == 1004) {
			Static139.method2271(13, arg2, arg0);
		} else if (arg1 == 1006) {
			Static139.method2271(14, arg2, arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "([Ljava/lang/Object;I[I)V")
	public static void method4371(@OriginalArg(0) Object[] arg0, @OriginalArg(2) int[] arg1) {
		Static121.method2138(arg0, arg1, arg1.length - 1, 0);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IZ)I")
	public static int method4372(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)V")
	public static void method4373() {
		while (true) {
			@Pc(6) Class3_Sub37 local6 = (Class3_Sub37) Static140.aClass127_15.method3396();
			if (local6 == null) {
				return;
			}
			if (Static256.aClass45ArrayArrayArray2 != null) {
				@Pc(22) Class5_Sub4_Sub4 local22;
				@Pc(18) int local18;
				if (local6.anInt5387 >= 0) {
					local18 = local6.anInt5387 - 1;
					local22 = Static244.aClass5_Sub4_Sub4_Sub2Array1[local18];
				} else {
					local18 = -local6.anInt5387 - 1;
					if (Static312.anInt6280 == local18) {
						local22 = Static349.aClass5_Sub4_Sub4_Sub1_2;
					} else {
						local22 = Static254.aClass5_Sub4_Sub4_Sub1Array1[local18];
					}
				}
				if (local22 != null) {
					@Pc(52) Class170 local52 = Static268.method4553(local6.anInt5399);
					@Pc(70) int local70;
					@Pc(67) int local67;
					if (local6.anInt5400 == 1 || local6.anInt5400 == 3) {
						local67 = local52.anInt5235;
						local70 = local52.anInt5251;
					} else {
						local70 = local52.anInt5235;
						local67 = local52.anInt5251;
					}
					@Pc(86) int local86 = local6.anInt5392 + (local70 >> 1);
					@Pc(95) int local95 = (local70 + 1 >> 1) + local6.anInt5392;
					@Pc(103) int local103 = local6.anInt5398 + (local67 >> 1);
					@Pc(113) int local113 = local6.anInt5398 + (local67 + 1 >> 1);
					@Pc(118) Class22 local118 = Static69.aClass22Array1[local22.aByte69];
					@Pc(141) int local141 = local118.method4672(local86, local103) + local118.method4672(local95, local103) + local118.method4672(local86, local113) + local118.method4672(local95, local113) >> 2;
					@Pc(143) Interface5 local143 = null;
					@Pc(148) int local148 = Static247.anIntArray402[local6.anInt5390];
					if (local148 == 0) {
						local143 = (Interface5) Static132.method2235(local22.aByte69, local6.anInt5392, local6.anInt5398);
					} else if (local148 == 1) {
						local143 = (Interface5) Static2.method11(local22.aByte69, local6.anInt5392, local6.anInt5398);
					} else if (local148 == 2) {
						local143 = (Interface5) Static134.method2239(local22.aByte69, local6.anInt5392, local6.anInt5398, lk.class);
					} else if (local148 == 3) {
						local143 = (Interface5) Static135.method2262(local22.aByte69, local6.anInt5392, local6.anInt5398);
					}
					if (local143 != null) {
						Static108.method4644(0, 0, local6.anInt5397 + 1, local6.anInt5388, local6.anInt5392, local6.anInt5398, local148, local22.aByte69, -1);
						local22.anInt4951 = Static51.anInt1101 + local6.anInt5388;
						local22.anInt4950 = local70 * 64 + local6.anInt5392 * 128;
						local22.anInt4955 = local6.anInt5398 * 128 + local67 * 64;
						local22.anInt4949 = Static51.anInt1101 + local6.anInt5397;
						local22.anInt4959 = local141;
						local22.anInterface5_3 = local143;
						@Pc(274) int local274 = local6.anInt5389;
						@Pc(277) int local277 = local6.anInt5385;
						@Pc(280) int local280 = local6.anInt5384;
						@Pc(285) int local285;
						if (local274 > local277) {
							local285 = local274;
							local274 = local277;
							local277 = local285;
						}
						@Pc(292) int local292 = local6.anInt5396;
						local22.anInt4952 = local6.anInt5392 + local274;
						local22.anInt4947 = local6.anInt5392 + local277;
						if (local280 > local292) {
							local285 = local280;
							local280 = local292;
							local292 = local285;
						}
						local22.anInt4953 = local6.anInt5398 + local292;
						local22.anInt4948 = local6.anInt5398 + local280;
					}
				}
			}
		}
	}
}
