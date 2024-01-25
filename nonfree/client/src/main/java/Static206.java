import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!hp", name = "n", descriptor = "[Lclient!sf;")
	public static Class308[] aClass308Array4;

	@OriginalMember(owner = "client!hp", name = "u", descriptor = "Z")
	public static boolean aBoolean283 = true;

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IZ)V")
	public static void method3371(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static353.anInt6188 != -1) {
				Static153.method2893(Static353.anInt6188);
			}
			for (@Pc(20) Class3_Sub49 local20 = (Class3_Sub49) Static216.aClass354_18.method7694(); local20 != null; local20 = (Class3_Sub49) Static216.aClass354_18.method7692()) {
				if (!local20.method7828()) {
					local20 = (Class3_Sub49) Static216.aClass354_18.method7694();
					if (local20 == null) {
						break;
					}
				}
				Static250.method3868(local20, false, true);
			}
			Static353.anInt6188 = -1;
			Static216.aClass354_18 = new Class354(8);
			Static333.method4752();
			Static353.anInt6188 = Static270.anInt4755;
			Static101.method1867(false);
			Static238.method3668();
			Static312.method4561(Static353.anInt6188);
		}
		Static173.aString18 = "";
		Static196.aString85 = "";
		Static241.aBoolean317 = false;
		Static184.method3147();
		Static69.anInt1582 = -1;
		Static45.method737(Static87.anInt5456);
		Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2 = new Class41_Sub2_Sub1_Sub4_Sub2();
		Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9442 = Static140.anInt3026 * 512 / 2;
		Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9444 = Static54.anInt1038 * 512 / 2;
		Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anIntArray629[0] = Static54.anInt1038 / 2;
		Static350.anInt6080 = 0;
		Static226.anInt3984 = 0;
		Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anIntArray628[0] = Static140.anInt3026 / 2;
		if (Static379.anInt6482 == 2) {
			Static226.anInt3984 = Static413.anInt7051 << 9;
			Static350.anInt6080 = Static92.anInt1927 << 9;
		} else {
			Static344.method5091();
		}
		Static428.method6060();
	}
}
