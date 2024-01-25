import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static515 {

	@OriginalMember(owner = "client!sfa", name = "F", descriptor = "F")
	public static float aFloat184;

	@OriginalMember(owner = "client!sfa", name = "H", descriptor = "[Z")
	public static final boolean[] aBooleanArray50 = new boolean[8];

	@OriginalMember(owner = "client!sfa", name = "f", descriptor = "(B)V")
	public static void method7728() {
		Static477.method7165();
		Static617.aClass57_3 = null;
		Static476.aClass274ArrayArray4 = null;
		Static636.aClass57_4 = null;
		Static6.aClass100_1 = null;
		Static526.aClass57_2 = null;
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Z)I")
	public static int method7729() {
		@Pc(17) byte local17;
		if (Static396.anInt7427 < 96) {
			local17 = 1;
			Static488.method8558();
		} else {
			@Pc(29) int local29 = Static175.method3218();
			if (local29 <= 100) {
				local17 = 4;
				Static308.method5205();
			} else if (local29 <= 500) {
				Static600.method8452();
				local17 = 3;
			} else if (local29 <= 1000) {
				local17 = 2;
				Static112.method1848();
			} else {
				Static488.method8558();
				local17 = 1;
			}
		}
		if (Static348.aClass6_Sub22_19.aClass15_Sub22_2.method6681() != 0) {
			Static348.aClass6_Sub22_19.method3534(0, Static348.aClass6_Sub22_19.aClass15_Sub22_1);
			Static278.method4875(0, false);
		}
		Static289.method5031();
		return local17;
	}
}
