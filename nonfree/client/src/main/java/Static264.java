import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "Lclient!mg;")
	public static Class154 aClass154_1;

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
	public static int anInt4589 = 100;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILclient!je;)V")
	public static void method4056(@OriginalArg(1) Class117 arg0) {
		if (arg0.anInt3108 == 5 && arg0.anInt3080 != -1) {
			Static52.method859(Static66.aClass164_2, arg0);
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)V")
	public static void method4058() {
		@Pc(19) boolean local19 = Static227.aClass117_14 != null || Static355.anInt4355 > 0;
		if (local19) {
			Static122.anInt2186 = 1;
		}
		if (Static327.aBoolean516 && aClass154_1.method3994(81) && Static215.anInt3678 > 2) {
			if (local19) {
				Static180.aClass1_Sub40_2 = (Class1_Sub40) Static358.aClass17_66.aClass1_15.aClass1_244.aClass1_244;
			} else {
				Static364.method5204(Static379.aClass1_Sub13_1.method2559(), (Class1_Sub40) Static358.aClass17_66.aClass1_15.aClass1_244.aClass1_244, Static379.aClass1_Sub13_1.method2554());
			}
		} else if (local19) {
			Static180.aClass1_Sub40_2 = (Class1_Sub40) Static358.aClass17_66.aClass1_15.aClass1_244;
		} else {
			Static364.method5204(Static379.aClass1_Sub13_1.method2559(), (Class1_Sub40) Static358.aClass17_66.aClass1_15.aClass1_244, Static379.aClass1_Sub13_1.method2554());
		}
	}
}
