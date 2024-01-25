import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static181 {

	@OriginalMember(owner = "client!gaa", name = "b", descriptor = "F")
	public static float aFloat80;

	@OriginalMember(owner = "client!gaa", name = "g", descriptor = "I")
	public static int anInt3818;

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Lclient!uf;Z)Ljava/lang/String;")
	public static String method3540(@OriginalArg(0) Class357 arg0) {
		if (Static85.method1469(arg0).method1142() == 0) {
			return null;
		} else if (arg0.aString122 == null || arg0.aString122.trim().length() == 0) {
			return Static214.aBoolean351 ? "Hidden-use" : null;
		} else {
			return arg0.aString122;
		}
	}
}
