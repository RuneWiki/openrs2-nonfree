import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static532 {

	@OriginalMember(owner = "client!sr", name = "r", descriptor = "[Lclient!ufa;")
	public static Class4[] aClass4Array14;

	@OriginalMember(owner = "client!sr", name = "t", descriptor = "F")
	public static float aFloat179 = 1024.0F;

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(FI)F")
	public static float method7553(@OriginalArg(0) float arg0) {
		return arg0 * arg0 * arg0 * (arg0 * (arg0 * 6.0F - 15.0F) + 10.0F);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(II)V")
	public static void method7555(@OriginalArg(1) int arg0) {
		Static451.anInt9272 = arg0;
		Static246.anInt5375 = -1;
		Static591.anInt9999 = 3;
		Static502.anInt7199 = 100;
	}
}
