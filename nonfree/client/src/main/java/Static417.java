import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static417 {

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "Lclient!pda;")
	public static final Class283 aClass283_9 = new Class283();

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "I")
	public static int anInt7161 = -1;

	@OriginalMember(owner = "client!nr", name = "d", descriptor = "I")
	public static int anInt7162 = 0;

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)V")
	public static void method6263() {
		if (Static648.method9079(Static387.anInt9114) || Static232.method3903(Static387.anInt9114)) {
			Static468.method7041(Static229.anInt4393 >> 12, Static194.anInt3385, Static70.anInt1085 >> 12);
		} else {
			@Pc(22) int local22 = Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anIntArray200[0] >> 3;
			@Pc(29) int local29 = Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anIntArray201[0] >> 3;
			if (local22 >= 0 && local22 < Static380.anInt6689 >> 3 && local29 >= 0 && local29 < Static542.anInt9214 >> 3) {
				Static468.method7041(local29, Static194.anInt3385, local22);
			} else {
				Static468.method7041(Static542.anInt9214 >> 4, 0, Static380.anInt6689 >> 4);
			}
		}
		Static226.method5055();
		Static137.method2081();
		Static494.method7451();
		Static419.method9120();
	}
}
