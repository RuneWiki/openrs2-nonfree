import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "client!ol", name = "cb", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_103 = new Class98(14, 8);

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Z)V")
	public static void method5490() {
		for (@Pc(12) int local12 = 0; local12 < Static300.anInt5490; local12++) {
			@Pc(18) Class152 local18 = Static486.aClass152Array1[local12];
			if (local18.aByte53 == 3) {
				if (local18.aClass6_Sub15_Sub2_2 == null) {
					local18.anInt4381 = Integer.MIN_VALUE;
				} else {
					Static204.aClass6_Sub15_Sub1_1.method2421(local18.aClass6_Sub15_Sub2_2);
				}
			}
		}
	}
}
