import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static222 {

	@OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
	public static int anInt4125;

	@OriginalMember(owner = "client!lg", name = "m", descriptor = "Lclient!v;")
	public static Class249 aClass249_1;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)Z")
	public static boolean method3349(@OriginalArg(0) int arg0) {
		return arg0 != 1 && arg0 != 7;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IB)V")
	public static void method3351() {
		Static259.aClass68_26.method1788(50);
		Static232.aClass68_25.method1788(50);
		Static384.aClass68_47.method1788(50);
		Static52.aClass68_4.method1788(50);
		Static158.aClass68_16.method1788(50);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZLclient!ac;Lclient!ac;)V")
	public static void method3353(@OriginalArg(1) Class4_Sub1 arg0, @OriginalArg(2) Class4_Sub1 arg1) {
		if (arg1.aClass4_Sub1_56 != null) {
			arg1.method4662();
		}
		arg1.aClass4_Sub1_56 = arg0;
		arg1.aClass4_Sub1_55 = arg0.aClass4_Sub1_55;
		arg1.aClass4_Sub1_56.aClass4_Sub1_55 = arg1;
		arg1.aClass4_Sub1_55.aClass4_Sub1_56 = arg1;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V")
	public static void method3355() {
		Static336.aBoolean596 = true;
	}
}
