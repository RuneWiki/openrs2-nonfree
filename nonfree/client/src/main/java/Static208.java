import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static208 {

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "I")
	public static int anInt3838 = 0;

	@OriginalMember(owner = "client!gu", name = "q", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_53 = new Class376(14, 1);

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(II)V")
	public static void method3291(@OriginalArg(0) int arg0) {
		if (Static54.anInt1418 == 0) {
			Static402.aClass3_Sub9_Sub5_2.method6705(arg0);
		} else {
			Static231.anInt4426 = arg0;
		}
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(II)Z")
	public static boolean method3294(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 4;
	}
}
