import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static525 {

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "Z")
	public static boolean aBoolean615 = false;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
	public static void method7371() {
		for (@Pc(6) Class2_Sub2 local6 = (Class2_Sub2) Static304.aClass43_9.method1082(); local6 != null; local6 = (Class2_Sub2) Static304.aClass43_9.method1082()) {
			Static623.method8580(local6);
		}
		@Pc(36) int local36;
		@Pc(35) int local35;
		if (Static96.aClass6_Sub22_7.aClass29_Sub4_2.method1492() == 1) {
			local35 = 3;
			local36 = 0;
		} else {
			local35 = Static216.anInt3669;
			local36 = Static216.anInt3669;
		}
		Static83.method1465();
		for (@Pc(45) int local45 = local36; local45 <= local35; local45++) {
			Static83.method1455();
			Static83.method1447(local45);
			Static83.method1461(local45);
		}
		Static83.method1449();
		Static83.method1448();
	}
}
