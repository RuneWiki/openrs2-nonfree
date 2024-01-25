import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!bfa", name = "f", descriptor = "F")
	public static float aFloat24;

	@OriginalMember(owner = "client!bfa", name = "h", descriptor = "Lclient!mv;")
	public static Class229 aClass229_9;

	@OriginalMember(owner = "client!bfa", name = "d", descriptor = "I")
	public static int anInt678 = -1;

	@OriginalMember(owner = "client!bfa", name = "g", descriptor = "S")
	public static short aShort1 = 32767;

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(I)V")
	public static void method574() {
		for (@Pc(10) Class12_Sub10 local10 = (Class12_Sub10) Static357.aClass220_9.method4662(); local10 != null; local10 = (Class12_Sub10) Static357.aClass220_9.method4662()) {
			Static237.method3391(local10);
		}
		@Pc(36) int local36;
		@Pc(34) int local34;
		if (Static257.aClass2_Sub35_Sub1_1.method6053(Static226.anInt3318)) {
			local34 = 3;
			local36 = 0;
		} else {
			local34 = Static487.anInt7738;
			local36 = Static487.anInt7738;
		}
		Static70.method1172();
		for (@Pc(45) int local45 = local36; local45 <= local34; local45++) {
			Static70.method1173();
			Static70.method1163(local45);
			Static70.method1177(local45);
		}
		Static70.method1176();
		Static70.method1162();
	}
}
