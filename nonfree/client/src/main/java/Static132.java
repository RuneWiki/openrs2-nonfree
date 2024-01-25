import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static132 {

	@OriginalMember(owner = "client!id", name = "I", descriptor = "[Lclient!wn;")
	public static Class95[] aClass95Array9;

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(IZ)V")
	public static void method2365(@OriginalArg(1) boolean arg0) {
		if (arg0 != Static53.aBoolean71) {
			Static53.aBoolean71 = arg0;
			Static37.method585();
		}
	}
}
