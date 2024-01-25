import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!fk", name = "s", descriptor = "Lclient!qa;")
	public static Class75 aClass75_3;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
	public static void method2110() {
		Static323.method4693();
		Static381.method2283(Static123.aClass21_Sub1_1.aBoolean81);
		Static183.aClass33_4 = Static336.method4877(22050, 0, Static351.aCanvas6, Static295.aClass103_5);
		Static183.aClass33_4.method3057(Static228.aClass3_Sub5_Sub1_130);
		Static14.aClass33_1 = Static336.method4877(2048, 1, Static351.aCanvas6, Static295.aClass103_5);
		Static14.aClass33_1.method3057(Static251.aClass3_Sub5_Sub4_1);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(BZ)Z")
	public static boolean method2112(@OriginalArg(1) boolean arg0) {
		@Pc(6) boolean local6 = Static266.aClass75_7.method2609();
		if (arg0 == local6) {
			return true;
		}
		if (!arg0) {
			Static266.aClass75_7.method2583();
		} else if (!Static266.aClass75_7.method2642()) {
			arg0 = false;
		}
		if (local6 == arg0) {
			return false;
		} else {
			Static123.aClass21_Sub1_1.aBoolean82 = arg0;
			Static123.aClass21_Sub1_1.method782(Static295.aClass103_5);
			return true;
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z)V")
	public static void method2113() {
		Static278.anIntArray493 = Static185.method3113(0.4F);
	}
}
