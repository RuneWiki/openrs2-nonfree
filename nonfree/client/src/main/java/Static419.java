import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static419 {

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "Lclient!fn;")
	public static Class81 aClass81_1;

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray41;

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_251 = new Class186(43, 5);

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
	public static void method5477() {
		for (@Pc(8) int local8 = 0; local8 < Static425.anInt7124; local8++) {
			@Pc(14) Class200 local14 = Static246.aClass200Array1[local8];
			@Pc(16) boolean local16 = false;
			@Pc(141) int local141;
			if (local14.aClass4_Sub18_Sub2_1 == null) {
				local14.anInt5830--;
				if (local14.anInt5830 < (local14.aByte83 == 2 ? -1500 : -10)) {
					local16 = true;
				} else {
					if (local14.aByte83 == 1 && local14.aClass55_1 == null) {
						local14.aClass55_1 = Static458.method1453(Static354.aClass166_247, local14.anInt5826, 0);
						if (local14.aClass55_1 == null) {
							continue;
						}
						local14.anInt5830 += local14.aClass55_1.method1454();
					} else if (local14.aByte83 == 2 && (local14.aClass4_Sub43_1 == null || local14.aClass4_Sub35_Sub1_1 == null)) {
						if (local14.aClass4_Sub43_1 == null) {
							local14.aClass4_Sub43_1 = Static432.method5550(Static240.aClass166_165, local14.anInt5826);
						}
						if (local14.aClass4_Sub43_1 == null) {
							continue;
						}
						if (local14.aClass4_Sub35_Sub1_1 == null) {
							local14.aClass4_Sub35_Sub1_1 = local14.aClass4_Sub43_1.method5553(new int[] { 22050 });
							if (local14.aClass4_Sub35_Sub1_1 == null) {
								continue;
							}
						}
					}
					if (local14.anInt5830 < 0) {
						if (local14.anInt5833 == 0) {
							local141 = Static126.aClass67_Sub1_1.anInt5852 * local14.anInt5831 >> 8;
						} else {
							@Pc(150) int local150 = local14.anInt5833 >> 24 & 0x3;
							if (Static375.aClass6_Sub2_Sub1_Sub1_3.aByte86 == local150) {
								@Pc(169) int local169 = (local14.anInt5833 & 0xFF) << 7;
								@Pc(176) int local176 = local14.anInt5833 >> 16 & 0xFF;
								@Pc(186) int local186 = (local176 << 7) + 64 - Static375.aClass6_Sub2_Sub1_Sub1_3.anInt6062;
								if (local186 < 0) {
									local186 = -local186;
								}
								@Pc(198) int local198 = local14.anInt5833 >> 8 & 0xFF;
								@Pc(207) int local207 = (local198 << 7) + 64 - Static375.aClass6_Sub2_Sub1_Sub1_3.anInt6061;
								if (local207 < 0) {
									local207 = -local207;
								}
								@Pc(219) int local219 = local186 + local207 - 128;
								if (local219 > local169) {
									local14.anInt5830 = -99999;
									continue;
								}
								if (local219 < 0) {
									local219 = 0;
								}
								local141 = local14.anInt5831 * Static126.aClass67_Sub1_1.anInt5855 * (local169 - local219) / local169 >> 8;
							} else {
								local141 = 0;
							}
						}
						if (local141 > 0) {
							@Pc(250) Class4_Sub35_Sub1 local250 = null;
							if (local14.aByte83 == 1) {
								local250 = local14.aClass55_1.method1452().method5373(Static350.aClass21_1);
							} else if (local14.aByte83 == 2) {
								local250 = local14.aClass4_Sub35_Sub1_1;
							}
							@Pc(278) Class4_Sub18_Sub2 local278 = local14.aClass4_Sub18_Sub2_1 = Static463.method4577(local250, local141);
							local278.method4578(local14.anInt5828 - 1);
							Static393.aClass4_Sub18_Sub1_1.method2787(local278);
						}
					}
				}
			} else if (!local14.aClass4_Sub18_Sub2_1.method5857()) {
				local16 = true;
			}
			if (local16) {
				Static425.anInt7124--;
				for (local141 = local8; local141 < Static425.anInt7124; local141++) {
					Static246.aClass200Array1[local141] = Static246.aClass200Array1[local141 + 1];
				}
				local8--;
			}
		}
		if (Static156.aBoolean213 && !Static334.method5632()) {
			if (Static126.aClass67_Sub1_1.anInt5859 != 0 && Static49.anInt1347 != -1) {
				Static216.method3074(Static126.aClass67_Sub1_1.anInt5859, Static49.anInt1347, Static273.aClass166_193);
			}
			Static156.aBoolean213 = false;
		} else if (Static126.aClass67_Sub1_1.anInt5859 != 0 && Static49.anInt1347 != -1 && !Static334.method5632()) {
			Static209.method2982(Static388.aClass36_124);
			Static116.aClass4_Sub30_Sub1_1.method4861(Static49.anInt1347);
			Static49.anInt1347 = -1;
		}
	}
}
