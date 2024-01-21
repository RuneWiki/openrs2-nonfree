import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!ve", name = "ib", descriptor = "Lclient!bg;")
	public static Class1_Sub3_Sub1_Sub1 aClass1_Sub3_Sub1_Sub1_7;

	@OriginalMember(owner = "client!ve", name = "kb", descriptor = "I")
	public static int anInt4330;

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "(B)V")
	public static void method3282() {
		if (!Static72.aBoolean100) {
			return;
		}
		@Pc(11) Class11 local11 = Static173.method2744(Static14.anInt382, Static114.anInt2462);
		if (local11 != null && local11.anObjectArray15 != null) {
			@Pc(20) Class1_Sub24 local20 = new Class1_Sub24();
			local20.aClass11_18 = local11;
			local20.anObjectArray28 = local11.anObjectArray15;
			Static45.method810(local20);
		}
		Static72.aBoolean100 = false;
		Static73.method1118(local11);
	}
}
