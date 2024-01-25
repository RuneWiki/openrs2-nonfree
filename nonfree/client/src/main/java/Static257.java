import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!n", name = "o", descriptor = "I")
	public static int anInt4679;

	@OriginalMember(owner = "client!n", name = "p", descriptor = "Lclient!qn;")
	public static Class209 aClass209_74;

	@OriginalMember(owner = "client!n", name = "n", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_247 = new Class123(9, 5);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(FZ)F")
	public static float method3943(@OriginalArg(0) float arg0) {
		return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!ts;I)Lclient!ts;")
	public static Class239 method3944(@OriginalArg(0) Class239 arg0) {
		@Pc(6) Class239 local6 = Static50.method1142(arg0);
		if (local6 == null) {
			local6 = arg0.aClass239_12;
		}
		return local6;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
	public static void method3945() {
		Static100.method1818(25);
		Static344.method5288();
		System.gc();
	}
}
