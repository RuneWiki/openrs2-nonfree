import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static559 {

	@OriginalMember(owner = "client!tu", name = "r", descriptor = "I")
	public static int anInt9602;

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method7848(@OriginalArg(0) Class5 arg0) {
		Static588.aClass34_14 = Static13.method523(Static432.anInt7908, arg0, true);
		Static150.aClass213_4 = Static99.method2384(Static432.anInt7908, arg0);
		Static359.aClass34_7 = Static13.method523(Static473.anInt8397, arg0, true);
		Static184.aClass213_5 = Static99.method2384(Static473.anInt8397, arg0);
		Static537.aClass34_12 = Static13.method523(Static59.anInt1888, arg0, true);
		Static2.aClass213_9 = Static99.method2384(Static59.anInt1888, arg0);
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(CI)Z")
	public static boolean method7849(@OriginalArg(0) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}
}
