import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "Lclient!iv;")
	public static Class124 aClass124_1;

	@OriginalMember(owner = "client!jm", name = "l", descriptor = "Lclient!kt;")
	public static Class145 aClass145_1;

	@OriginalMember(owner = "client!jm", name = "n", descriptor = "Lclient!rg;")
	public static Class217 aClass217_1;

	@OriginalMember(owner = "client!jm", name = "q", descriptor = "I")
	public static int anInt3261;

	@OriginalMember(owner = "client!jm", name = "p", descriptor = "I")
	public static int anInt3260 = 0;

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(Z)V")
	public static void method2914() {
		Static55.aClass6_Sub15_Sub1_1.method2607();
		@Pc(13) int local13 = Static55.aClass6_Sub15_Sub1_1.method2604(8);
		@Pc(18) int local18;
		if (local13 < Static147.anInt7038) {
			for (local18 = local13; local18 < Static147.anInt7038; local18++) {
				Static279.anIntArray416[Static64.anInt1353++] = Static345.anIntArray507[local18];
			}
		}
		if (local13 > Static147.anInt7038) {
			throw new RuntimeException("gnpov1");
		}
		Static147.anInt7038 = 0;
		for (local18 = 0; local18 < local13; local18++) {
			@Pc(57) int local57 = Static345.anIntArray507[local18];
			@Pc(61) Class3_Sub3_Sub6_Sub2 local61 = Static450.aClass3_Sub3_Sub6_Sub2Array1[local57];
			@Pc(66) int local66 = Static55.aClass6_Sub15_Sub1_1.method2604(1);
			if (local66 == 0) {
				Static345.anIntArray507[Static147.anInt7038++] = local57;
				local61.anInt6745 = Static125.anInt2225;
			} else {
				@Pc(93) int local93 = Static55.aClass6_Sub15_Sub1_1.method2604(2);
				if (local93 == 0) {
					Static345.anIntArray507[Static147.anInt7038++] = local57;
					local61.anInt6745 = Static125.anInt2225;
					Static375.anIntArray545[Static80.anInt1573++] = local57;
				} else {
					@Pc(144) int local144;
					@Pc(154) int local154;
					if (local93 == 1) {
						Static345.anIntArray507[Static147.anInt7038++] = local57;
						local61.anInt6745 = Static125.anInt2225;
						local144 = Static55.aClass6_Sub15_Sub1_1.method2604(3);
						local61.method5528(local144, 1);
						local154 = Static55.aClass6_Sub15_Sub1_1.method2604(1);
						if (local154 == 1) {
							Static375.anIntArray545[Static80.anInt1573++] = local57;
						}
					} else if (local93 == 2) {
						Static345.anIntArray507[Static147.anInt7038++] = local57;
						local61.anInt6745 = Static125.anInt2225;
						if (Static55.aClass6_Sub15_Sub1_1.method2604(1) == 1) {
							local144 = Static55.aClass6_Sub15_Sub1_1.method2604(3);
							local61.method5528(local144, 2);
							local154 = Static55.aClass6_Sub15_Sub1_1.method2604(3);
							local61.method5528(local154, 2);
						} else {
							local144 = Static55.aClass6_Sub15_Sub1_1.method2604(3);
							local61.method5528(local144, 0);
						}
						local144 = Static55.aClass6_Sub15_Sub1_1.method2604(1);
						if (local144 == 1) {
							Static375.anIntArray545[Static80.anInt1573++] = local57;
						}
					} else if (local93 == 3) {
						Static279.anIntArray416[Static64.anInt1353++] = local57;
					}
				}
			}
		}
	}
}
