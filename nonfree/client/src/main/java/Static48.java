import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!cf", name = "i", descriptor = "[I")
	public static final int[] anIntArray574 = new int[13];

	@OriginalMember(owner = "client!cf", name = "m", descriptor = "[I")
	public static final int[] anIntArray575 = new int[4096];

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)Z")
	public static boolean method5463() {
		try {
			if (Static2.anInt9 == 2) {
				if (Static140.aClass6_Sub37_1 == null) {
					Static140.aClass6_Sub37_1 = Static458.method5286(Static411.aClass158_87, Static422.anInt7022, Static271.anInt4635);
					if (Static140.aClass6_Sub37_1 == null) {
						return false;
					}
				}
				if (Static187.aClass124_1 == null) {
					Static187.aClass124_1 = new Class124(Static386.aClass158_83, Static211.aClass158_45);
				}
				if (Static47.aClass6_Sub5_Sub3_7.method3657(Static187.aClass124_1, Static407.aClass158_86, Static140.aClass6_Sub37_1)) {
					Static47.aClass6_Sub5_Sub3_7.method3635();
					Static47.aClass6_Sub5_Sub3_7.method3630(Static258.anInt4423);
					Static47.aClass6_Sub5_Sub3_7.method3654(Static61.aBoolean110, Static140.aClass6_Sub37_1);
					Static411.aClass158_87 = null;
					Static140.aClass6_Sub37_1 = null;
					Static2.anInt9 = 0;
					Static187.aClass124_1 = null;
					return true;
				}
			}
		} catch (@Pc(61) Exception local61) {
			local61.printStackTrace();
			Static47.aClass6_Sub5_Sub3_7.method3664();
			Static411.aClass158_87 = null;
			Static2.anInt9 = 0;
			Static187.aClass124_1 = null;
			Static140.aClass6_Sub37_1 = null;
		}
		return false;
	}
}
