import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static117 {

	@OriginalMember(owner = "client!mf", name = "ib", descriptor = "Lclient!oh;")
	public static final Class67 aClass67_6 = new Class67(500);

	@OriginalMember(owner = "client!mf", name = "lb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1665 = Static118.method2249("");

	@OriginalMember(owner = "client!mf", name = "nb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1666 = Static118.method2249("Bitte versuchen Sie es erneut)3");

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(II)V")
	public static void method2156(@OriginalArg(0) int arg0) {
		if (arg0 == -1 && !Static128.aBoolean132) {
			Static1.method3302();
		} else if (arg0 != -1 && (Static12.anInt306 != arg0 || !Static169.method1450()) && Static135.anInt3352 != 0 && !Static128.aBoolean132) {
			Static19.method379(arg0, Static16.aClass60_Sub1_15, Static135.anInt3352);
		}
		Static12.anInt306 = arg0;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILclient!pd;)V")
	public static void method2157(@OriginalArg(1) Class70 arg0) {
		Static67.aClass70_1 = arg0;
	}

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "(B)V")
	public static void method2159() {
		Static168.aClass87_54.method3061();
		Static60.aClass67_1.method2568();
		Static208.aClass87_69.method3061();
	}
}
