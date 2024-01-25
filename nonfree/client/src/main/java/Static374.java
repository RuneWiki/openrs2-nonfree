import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static374 {

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "D")
	public static double aDouble12;

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
	public static int anInt6010;

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "Lclient!da;")
	public static Class63 aClass63_9;

	@OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
	public static int anInt6012;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IC)Z")
	public static boolean method5189(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!uv;Z)Ljava/lang/String;")
	public static String method5191(@OriginalArg(0) Class344 arg0) {
		if (Static76.method1311(arg0).method8089() == 0) {
			return null;
		} else if (arg0.aString92 == null || arg0.aString92.trim().length() == 0) {
			return Static349.aBoolean768 ? "Hidden-use" : null;
		} else {
			return arg0.aString92;
		}
	}
}
