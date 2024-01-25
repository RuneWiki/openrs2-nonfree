import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "[Lclient!kb;")
	public static Class52[] aClass52Array7;

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
	public static int anInt2837;

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
	public static int anInt2840;

	@OriginalMember(owner = "client!ie", name = "p", descriptor = "[I")
	public static int[] anIntArray376;

	@OriginalMember(owner = "client!ie", name = "j", descriptor = "Z")
	public static boolean aBoolean223 = false;

	@OriginalMember(owner = "client!ie", name = "l", descriptor = "I")
	public static int anInt2843 = -1;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!rk;I)V")
	public static void method2636(@OriginalArg(0) Class180 arg0) {
		Static120.anInt2720 = 0;
		Static337.anInt6358 = 0;
		Static111.aClass191_2 = new Class191();
		Static203.aClass36_Sub2_Sub1_Sub1Array2 = new Class36_Sub2_Sub1_Sub1[1024];
		Static67.method5326(arg0);
		Static60.method1213(arg0);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!ap;Z)V")
	public static void method2637(@OriginalArg(0) Class7_Sub3 arg0) {
		if (arg0.aByteArray33.length - arg0.anInt3005 < 1) {
			return;
		}
		@Pc(19) int local19 = arg0.method2772();
		if (local19 < 0 || local19 > 1 || arg0.aByteArray33.length - arg0.anInt3005 < 2) {
			return;
		}
		@Pc(42) int local42 = arg0.method2764();
		if (local42 * 6 != arg0.aByteArray33.length - arg0.anInt3005) {
			return;
		}
		while (true) {
			@Pc(67) int local67;
			@Pc(71) int local71;
			do {
				do {
					do {
						if (arg0.anInt3005 >= arg0.aByteArray33.length) {
							return;
						}
						local67 = arg0.method2764();
						local71 = arg0.method2767();
					} while (local67 >= Static165.anIntArray464.length);
				} while (!Static120.aBooleanArray17[local67]);
			} while (Static147.method2949(local67).aChar3 == '1' && (local71 < -1 || local71 > 1));
			Static165.anIntArray464[local67] = local71;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
	public static void method2639() {
		while (true) {
			@Pc(18) Class7_Sub24 local18 = (Class7_Sub24) Static28.aClass74_3.method1792();
			if (local18 == null) {
				return;
			}
			@Pc(37) Class22_Sub2_Sub1 local37;
			@Pc(32) int local32;
			if (local18.anInt3863 < 0) {
				local32 = -local18.anInt3863 - 1;
				if (local32 == Static4.anInt77) {
					local37 = Static252.aClass22_Sub2_Sub1_Sub1_4;
				} else {
					local37 = Static157.aClass22_Sub2_Sub1_Sub1Array1[local32];
				}
			} else {
				local32 = local18.anInt3863 - 1;
				local37 = Static69.aClass22_Sub2_Sub1_Sub2Array1[local32];
			}
			if (local37 != null) {
				@Pc(61) Class122 local61 = Static245.method4227(local18.anInt3859);
				@Pc(75) int local75;
				@Pc(72) int local72;
				if (local18.anInt3849 == 1 || local18.anInt3849 == 3) {
					local72 = local61.anInt3562;
					local75 = local61.anInt3527;
				} else {
					local72 = local61.anInt3527;
					local75 = local61.anInt3562;
				}
				@Pc(91) int local91 = local18.anInt3853 + (local75 >> 1);
				@Pc(100) int local100 = local18.anInt3853 + (local75 + 1 >> 1);
				@Pc(107) int local107 = local18.anInt3857 + (local72 >> 1);
				@Pc(116) int local116 = (local72 + 1 >> 1) + local18.anInt3857;
				@Pc(121) Class8 local121 = Static331.aClass8Array5[local37.aByte69];
				@Pc(144) int local144 = local121.method4173(local91, local107) + local121.method4173(local100, local107) + local121.method4173(local91, local116) + local121.method4173(local100, local116) >> 2;
				@Pc(146) Interface1 local146 = null;
				@Pc(151) int local151 = Static191.anIntArray521[local18.anInt3860];
				if (local151 == 0) {
					local146 = (Interface1) Static48.method4691(local37.aByte69, local18.anInt3853, local18.anInt3857);
				} else if (local151 == 1) {
					local146 = (Interface1) Static96.method1983(local37.aByte69, local18.anInt3853, local18.anInt3857);
				} else if (local151 == 2) {
					local146 = (Interface1) Static252.method5177(local37.aByte69, local18.anInt3853, local18.anInt3857, gd.class);
				} else if (local151 == 3) {
					local146 = (Interface1) Static44.method981(local37.aByte69, local18.anInt3853, local18.anInt3857);
				}
				if (local146 != null) {
					Static334.method5306(local18.anInt3858 + 1, local151, local37.aByte69, 0, -1, local18.anInt3853, local18.anInt3857, local18.anInt3854, 0);
					local37.anInterface1_3 = local146;
					local37.anInt5156 = local18.anInt3853 * 128 + local75 * 64;
					local37.anInt5147 = local18.anInt3854 + Static212.anInt4234;
					local37.anInt5145 = local144;
					local37.anInt5154 = local18.anInt3857 * 128 + local72 * 64;
					local37.anInt5148 = Static212.anInt4234 + local18.anInt3858;
					@Pc(277) int local277 = local18.anInt3850;
					@Pc(280) int local280 = local18.anInt3851;
					@Pc(283) int local283 = local18.anInt3862;
					@Pc(286) int local286 = local18.anInt3856;
					@Pc(291) int local291;
					if (local280 < local277) {
						local291 = local277;
						local277 = local280;
						local280 = local291;
					}
					local37.anInt5153 = local280 + local18.anInt3853;
					local37.anInt5150 = local277 + local18.anInt3853;
					if (local286 < local283) {
						local291 = local283;
						local283 = local286;
						local286 = local291;
					}
					local37.anInt5149 = local18.anInt3857 + local286;
					local37.anInt5155 = local283 + local18.anInt3857;
				}
			}
		}
	}
}
