import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!dh", name = "P", descriptor = "Lclient!um;")
	public static Class244 aClass244_7;

	@OriginalMember(owner = "client!dh", name = "Y", descriptor = "Z")
	public static boolean aBoolean480 = false;

	@OriginalMember(owner = "client!dh", name = "ib", descriptor = "Z")
	public static boolean aBoolean481 = true;

	@OriginalMember(owner = "client!dh", name = "h", descriptor = "(B)V")
	public static void method4489() {
		Static154.aClass1_Sub11_Sub1_3.method3352();
		@Pc(18) int local18 = Static154.aClass1_Sub11_Sub1_3.method3347(8);
		@Pc(23) int local23;
		if (local18 < Static411.anInt6695) {
			for (local23 = local18; local23 < Static411.anInt6695; local23++) {
				Static379.anIntArray386[Static178.anInt2910++] = Static220.anIntArray193[local23];
			}
		}
		if (Static411.anInt6695 < local18) {
			throw new RuntimeException("gnpov1");
		}
		Static411.anInt6695 = 0;
		for (local23 = 0; local23 < local18; local23++) {
			@Pc(57) int local57 = Static220.anIntArray193[local23];
			@Pc(61) Class20_Sub3_Sub3_Sub2 local61 = Static98.aClass20_Sub3_Sub3_Sub2Array1[local57];
			@Pc(66) int local66 = Static154.aClass1_Sub11_Sub1_3.method3347(1);
			if (local66 == 0) {
				Static220.anIntArray193[Static411.anInt6695++] = local57;
				local61.anInt6043 = Static368.anInt6250;
			} else {
				@Pc(86) int local86 = Static154.aClass1_Sub11_Sub1_3.method3347(2);
				if (local86 == 0) {
					Static220.anIntArray193[Static411.anInt6695++] = local57;
					local61.anInt6043 = Static368.anInt6250;
					Static386.anIntArray396[Static158.anInt2643++] = local57;
				} else {
					@Pc(128) int local128;
					@Pc(138) int local138;
					if (local86 == 1) {
						Static220.anIntArray193[Static411.anInt6695++] = local57;
						local61.anInt6043 = Static368.anInt6250;
						local128 = Static154.aClass1_Sub11_Sub1_3.method3347(3);
						local61.method4698(local128, 1);
						local138 = Static154.aClass1_Sub11_Sub1_3.method3347(1);
						if (local138 == 1) {
							Static386.anIntArray396[Static158.anInt2643++] = local57;
						}
					} else if (local86 == 2) {
						Static220.anIntArray193[Static411.anInt6695++] = local57;
						local61.anInt6043 = Static368.anInt6250;
						if (Static154.aClass1_Sub11_Sub1_3.method3347(1) == 1) {
							local128 = Static154.aClass1_Sub11_Sub1_3.method3347(3);
							local61.method4698(local128, 2);
							local138 = Static154.aClass1_Sub11_Sub1_3.method3347(3);
							local61.method4698(local138, 2);
						} else {
							local128 = Static154.aClass1_Sub11_Sub1_3.method3347(3);
							local61.method4698(local128, 0);
						}
						local128 = Static154.aClass1_Sub11_Sub1_3.method3347(1);
						if (local128 == 1) {
							Static386.anIntArray396[Static158.anInt2643++] = local57;
						}
					} else if (local86 == 3) {
						Static379.anIntArray386[Static178.anInt2910++] = local57;
					}
				}
			}
		}
	}
}
