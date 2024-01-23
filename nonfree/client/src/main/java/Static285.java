import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static285 {

	@OriginalMember(owner = "client!vn", name = "g", descriptor = "Lclient!lc;")
	public static Class98 aClass98_169;

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "()V")
	public static void method4283() {
		Static123.method2080();
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "()V")
	public static void method4284() {
		aClass98_169 = null;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lclient!lc;)V")
	public static void method4286(@OriginalArg(0) Class98 arg0) {
		aClass98_169 = arg0;
	}
}
