import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static623 {

	@OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
	public static int anInt6559;

	@OriginalMember(owner = "client!wf", name = "u", descriptor = "F")
	public static float aFloat127;

	@OriginalMember(owner = "client!wf", name = "A", descriptor = "[I")
	public static final int[] anIntArray369 = new int[3];

	@OriginalMember(owner = "client!wf", name = "e", descriptor = "(I)V")
	public static void method5387() {
		if (Static330.method3429(Static435.anInt8191) || Static118.method5770(Static435.anInt8191)) {
			Static571.method7932(Static377.anInt7114 >> 12, Static637.anInt10650 >> 12, 5000);
		} else {
			@Pc(22) int local22 = Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anIntArray435[0] >> 3;
			@Pc(29) int local29 = Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anIntArray436[0] >> 3;
			if (local22 >= 0 && Static372.anInt7082 >> 3 > local22 && local29 >= 0 && Static218.anInt5023 >> 3 > local29) {
				Static571.method7932(local29, local22, 5000);
			} else {
				Static571.method7932(Static218.anInt5023 >> 4, Static372.anInt7082 >> 4, 0);
			}
		}
		Static51.method1419();
		Static132.method2909();
		Static297.method4907();
		Static75.method1960();
	}
}
