import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
	public static int anInt4514;

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "[I")
	public static int[] anIntArray401 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!rh", name = "k", descriptor = "I")
	public static int anInt4520 = 0;

	@OriginalMember(owner = "client!rh", name = "l", descriptor = "I")
	public static int anInt4521 = -1;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)Z")
	public static boolean method3562() {
		try {
			if (Static299.anInt5641 == 2) {
				if (Static102.aClass1_Sub16_2 == null) {
					Static102.aClass1_Sub16_2 = Static302.method1681(Static14.aClass91_14, Static237.anInt4708, Static59.anInt3983);
					if (Static102.aClass1_Sub16_2 == null) {
						return false;
					}
				}
				if (Static289.aClass109_1 == null) {
					Static289.aClass109_1 = new Class109(Static152.aClass91_120, Static267.aClass91_192);
				}
				if (Static221.aClass1_Sub5_Sub2_2.method1655(Static102.aClass1_Sub16_2, Static260.aClass91_208, Static289.aClass109_1)) {
					Static221.aClass1_Sub5_Sub2_2.method1661();
					Static221.aClass1_Sub5_Sub2_2.method1672(Static244.anInt4854);
					Static221.aClass1_Sub5_Sub2_2.method1669(Static139.aBoolean224, Static102.aClass1_Sub16_2);
					Static289.aClass109_1 = null;
					Static14.aClass91_14 = null;
					Static102.aClass1_Sub16_2 = null;
					Static299.anInt5641 = 0;
					return true;
				}
			}
		} catch (@Pc(69) Exception local69) {
			local69.printStackTrace();
			Static221.aClass1_Sub5_Sub2_2.method1647();
			Static14.aClass91_14 = null;
			Static289.aClass109_1 = null;
			Static102.aClass1_Sub16_2 = null;
			Static299.anInt5641 = 0;
		}
		return false;
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(B)V")
	public static void method3564() {
		Static265.aClass135_38.method3317();
		Static227.aClass135_26.method3317();
		Static255.aClass135_34.method3317();
		Static49.aClass135_2.method3317();
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!km;Z)I")
	public static int method3567(@OriginalArg(0) Class91 arg0) {
		@Pc(9) int local9 = 0;
		if (arg0.method2501(Static215.anInt4271)) {
			local9++;
		}
		if (arg0.method2501(Static200.anInt4064)) {
			local9++;
		}
		return local9;
	}
}
