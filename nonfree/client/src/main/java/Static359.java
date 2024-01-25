import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static359 {

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lclient!qa;Z)V")
	public static void method5162(@OriginalArg(0) Class30 arg0) {
		if (Static314.aBoolean588) {
			Static348.method5083(arg0);
		} else {
			Static332.method4900(arg0);
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(BI)I")
	public static int method5164(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}
}
