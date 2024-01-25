import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!ar", name = "k", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_3 = new Class200(118, 0);

	@OriginalMember(owner = "client!ar", name = "r", descriptor = "I")
	public static int anInt961 = -1;

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(B)V")
	public static void method1024() {
		Static30.aClass3_Sub3_Sub2_1.method4273();
		@Pc(18) int local18 = Static30.aClass3_Sub3_Sub2_1.method4276(8);
		@Pc(23) int local23;
		if (local18 < Static94.anInt2209) {
			for (local23 = local18; local23 < Static94.anInt2209; local23++) {
				Static598.anIntArray636[Static577.anInt9501++] = Static520.anIntArray594[local23];
			}
		}
		if (Static94.anInt2209 < local18) {
			throw new RuntimeException("gnpov1");
		}
		Static94.anInt2209 = 0;
		for (local23 = 0; local23 < local18; local23++) {
			@Pc(57) int local57 = Static520.anIntArray594[local23];
			@Pc(65) Class4_Sub1_Sub2_Sub1_Sub1 local65 = ((Class3_Sub28) Static551.aClass280_43.method7107((long) local57)).aClass4_Sub1_Sub2_Sub1_Sub1_2;
			@Pc(70) int local70 = Static30.aClass3_Sub3_Sub2_1.method4276(1);
			if (local70 == 0) {
				Static520.anIntArray594[Static94.anInt2209++] = local57;
				local65.anInt5721 = Static590.anInt9681;
			} else {
				@Pc(93) int local93 = Static30.aClass3_Sub3_Sub2_1.method4276(2);
				if (local93 == 0) {
					Static520.anIntArray594[Static94.anInt2209++] = local57;
					local65.anInt5721 = Static590.anInt9681;
					Static131.anIntArray128[Static605.anInt9850++] = local57;
				} else {
					@Pc(137) int local137;
					@Pc(147) int local147;
					if (local93 == 1) {
						Static520.anIntArray594[Static94.anInt2209++] = local57;
						local65.anInt5721 = Static590.anInt9681;
						local137 = Static30.aClass3_Sub3_Sub2_1.method4276(3);
						local65.method3337(1, local137);
						local147 = Static30.aClass3_Sub3_Sub2_1.method4276(1);
						if (local147 == 1) {
							Static131.anIntArray128[Static605.anInt9850++] = local57;
						}
					} else if (local93 == 2) {
						Static520.anIntArray594[Static94.anInt2209++] = local57;
						local65.anInt5721 = Static590.anInt9681;
						if (Static30.aClass3_Sub3_Sub2_1.method4276(1) == 1) {
							local137 = Static30.aClass3_Sub3_Sub2_1.method4276(3);
							local65.method3337(2, local137);
							local147 = Static30.aClass3_Sub3_Sub2_1.method4276(3);
							local65.method3337(2, local147);
						} else {
							local137 = Static30.aClass3_Sub3_Sub2_1.method4276(3);
							local65.method3337(0, local137);
						}
						local137 = Static30.aClass3_Sub3_Sub2_1.method4276(1);
						if (local137 == 1) {
							Static131.anIntArray128[Static605.anInt9850++] = local57;
						}
					} else if (local93 == 3) {
						Static598.anIntArray636[Static577.anInt9501++] = local57;
					}
				}
			}
		}
	}
}
