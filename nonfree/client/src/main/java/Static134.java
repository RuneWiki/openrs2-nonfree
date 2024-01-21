import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!r", name = "P", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1297 = Static51.method932("Bitte versuchen Sie)1");

	@OriginalMember(owner = "client!r", name = "T", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1298 = Static51.method932("Schlie-8en");

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(B)V")
	public static void method2140() {
		aClass10_1297 = null;
		aClass10_1298 = null;
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(Z)V")
	public static void method2143() {
		while (true) {
			if (Static75.aClass2_Sub11_Sub1_1.method1491(Static174.anInt3743) >= 27) {
				@Pc(22) int local22 = Static75.aClass2_Sub11_Sub1_1.method1490(15);
				if (local22 != 32767) {
					@Pc(27) boolean local27 = false;
					if (Static83.aClass2_Sub1_Sub3_Sub2_Sub2Array1[local22] == null) {
						Static83.aClass2_Sub1_Sub3_Sub2_Sub2Array1[local22] = new Class2_Sub1_Sub3_Sub2_Sub2();
						local27 = true;
					}
					@Pc(43) Class2_Sub1_Sub3_Sub2_Sub2 local43 = Static83.aClass2_Sub1_Sub3_Sub2_Sub2Array1[local22];
					Static8.anIntArray15[Static64.anInt1578++] = local22;
					local43.anInt3491 = Static14.anInt386;
					local43.aClass2_Sub1_Sub2_1 = Static106.method1725(Static75.aClass2_Sub11_Sub1_1.method1490(14));
					@Pc(67) int local67 = Static75.aClass2_Sub11_Sub1_1.method1490(5);
					@Pc(72) int local72 = Static75.aClass2_Sub11_Sub1_1.method1490(5);
					if (local72 > 15) {
						local72 -= 32;
					}
					@Pc(85) int local85 = Static24.anIntArray41[Static75.aClass2_Sub11_Sub1_1.method1490(3)];
					if (local27) {
						local43.anInt3465 = local43.anInt3489 = local85;
					}
					@Pc(98) int local98 = Static75.aClass2_Sub11_Sub1_1.method1490(1);
					if (local67 > 15) {
						local67 -= 32;
					}
					@Pc(107) int local107 = Static75.aClass2_Sub11_Sub1_1.method1490(1);
					if (local107 == 1) {
						Static142.anIntArray334[Static97.anInt2273++] = local22;
					}
					local43.anInt3464 = local43.aClass2_Sub1_Sub2_1.anInt57;
					local43.anInt3493 = local43.aClass2_Sub1_Sub2_1.anInt77;
					local43.anInt3487 = local43.aClass2_Sub1_Sub2_1.anInt65;
					local43.anInt3496 = local43.aClass2_Sub1_Sub2_1.anInt73;
					local43.anInt3467 = local43.aClass2_Sub1_Sub2_1.anInt72;
					local43.anInt3455 = local43.aClass2_Sub1_Sub2_1.anInt69;
					local43.anInt3480 = local43.aClass2_Sub1_Sub2_1.anInt67;
					if (local43.anInt3496 == 0) {
						local43.anInt3489 = 0;
					}
					local43.anInt3482 = local43.aClass2_Sub1_Sub2_1.anInt68;
					local43.anInt3466 = local43.aClass2_Sub1_Sub2_1.anInt66;
					local43.method2468(Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray365[0] + local72, local98 == 1, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray366[0] + local67);
					continue;
				}
			}
			Static75.aClass2_Sub11_Sub1_1.method1494();
			return;
		}
	}
}
