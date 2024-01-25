import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!ks", name = "d", descriptor = "I")
	public static int anInt3501;

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "I")
	public static int anInt3499 = 0;

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "I")
	public static int anInt3500 = 0;

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)V")
	public static void method2853() {
		if (Static352.anInt5753 == -1) {
			return;
		}
		@Pc(11) int local11 = Static300.aClass182_1.method4112();
		@Pc(15) int local15 = Static300.aClass182_1.method4121();
		if (Static379.aClass1_Sub13_1 != null) {
			local11 = Static379.aClass1_Sub13_1.method2559();
			local15 = Static379.aClass1_Sub13_1.method2554();
		}
		Static310.method4623(local11, 0, Static352.anInt5753, local15, Static218.anInt3871, 0, 0, Static136.anInt6304, 0);
		if (Static56.aClass117_1 != null) {
			Static62.method1007(local11, local15);
		}
	}
}
