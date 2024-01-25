import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static395 {

	@OriginalMember(owner = "client!p", name = "W", descriptor = "F")
	public static float aFloat140;

	@OriginalMember(owner = "client!p", name = "R", descriptor = "Lclient!db;")
	public static final Class64 aClass64_334 = new Class64(23, 8);

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(I)V")
	public static void method5766() {
		Static487.aClass4_Sub9_Sub1_2.method1039();
		@Pc(13) int local13 = Static487.aClass4_Sub9_Sub1_2.method1046(8);
		@Pc(18) int local18;
		if (Static428.anInt7363 > local13) {
			for (local18 = local13; local18 < Static428.anInt7363; local18++) {
				Static519.anIntArray677[Static587.anInt2342++] = Static444.anIntArray617[local18];
			}
		}
		if (local13 > Static428.anInt7363) {
			throw new RuntimeException("gnpov1");
		}
		Static428.anInt7363 = 0;
		for (local18 = 0; local18 < local13; local18++) {
			@Pc(64) int local64 = Static444.anIntArray617[local18];
			@Pc(72) Class10_Sub1_Sub2_Sub1 local72 = ((Class4_Sub50) Static106.aClass183_8.method4289((long) local64)).aClass10_Sub1_Sub2_Sub1_1;
			@Pc(77) int local77 = Static487.aClass4_Sub9_Sub1_2.method1046(1);
			if (local77 == 0) {
				Static444.anIntArray617[Static428.anInt7363++] = local64;
				local72.anInt8497 = Static237.anInt7561;
			} else {
				@Pc(100) int local100 = Static487.aClass4_Sub9_Sub1_2.method1046(2);
				if (local100 == 0) {
					Static444.anIntArray617[Static428.anInt7363++] = local64;
					local72.anInt8497 = Static237.anInt7561;
					Static253.anIntArray436[Static267.anInt5143++] = local64;
				} else {
					@Pc(147) int local147;
					@Pc(157) int local157;
					if (local100 == 1) {
						Static444.anIntArray617[Static428.anInt7363++] = local64;
						local72.anInt8497 = Static237.anInt7561;
						local147 = Static487.aClass4_Sub9_Sub1_2.method1046(3);
						local72.method3530(local147, 1);
						local157 = Static487.aClass4_Sub9_Sub1_2.method1046(1);
						if (local157 == 1) {
							Static253.anIntArray436[Static267.anInt5143++] = local64;
						}
					} else if (local100 == 2) {
						Static444.anIntArray617[Static428.anInt7363++] = local64;
						local72.anInt8497 = Static237.anInt7561;
						if (Static487.aClass4_Sub9_Sub1_2.method1046(1) == 1) {
							local147 = Static487.aClass4_Sub9_Sub1_2.method1046(3);
							local72.method3530(local147, 2);
							local157 = Static487.aClass4_Sub9_Sub1_2.method1046(3);
							local72.method3530(local157, 2);
						} else {
							local147 = Static487.aClass4_Sub9_Sub1_2.method1046(3);
							local72.method3530(local147, 0);
						}
						local147 = Static487.aClass4_Sub9_Sub1_2.method1046(1);
						if (local147 == 1) {
							Static253.anIntArray436[Static267.anInt5143++] = local64;
						}
					} else if (local100 == 3) {
						Static519.anIntArray677[Static587.anInt2342++] = local64;
					}
				}
			}
		}
	}
}
