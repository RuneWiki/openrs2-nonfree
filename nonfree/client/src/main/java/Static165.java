import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static165 {

	@OriginalMember(owner = "client!gda", name = "d", descriptor = "Lclient!sj;")
	public static Class306 aClass306_3;

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(FB)F")
	public static float method2884(@OriginalArg(0) float arg0) {
		return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(ZZB)V")
	public static void method2887(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg0) {
			Static499.anInt8385++;
			Static578.method7803();
		}
		if (arg1) {
			Static12.anInt425++;
			Static26.method447();
		}
	}
}
