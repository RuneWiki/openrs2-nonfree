import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray24 = new String[200];

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "[I")
	public static final int[] anIntArray345 = new int[256];

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)V")
	public static void method5141() {
		if (Static645.method8716(Static178.anInt3225) || Static549.method7771(Static178.anInt3225)) {
			Static40.method590(Static235.anInt4471 >> 12, Static173.anInt3144 >> 12, Static432.anInt7596);
		} else {
			@Pc(18) int local18 = Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anIntArray430[0] >> 3;
			@Pc(25) int local25 = Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.lb[0] >> 3;
			if (local18 >= 0 && Static362.anInt8653 >> 3 > local18 && local25 >= 0 && local25 < Static206.anInt11291 >> 3) {
				Static40.method590(local25, local18, Static432.anInt7596);
			} else {
				Static40.method590(Static206.anInt11291 >> 4, Static362.anInt8653 >> 4, 0);
			}
		}
		Static450.method6668();
		Static138.method2264();
		Static533.method7507();
		Static501.method7209();
	}
}
