import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static102 {

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
	public static int anInt8588 = 0;

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_174 = new Class239(46, -2);

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZF)F")
	public static float method7204(@OriginalArg(1) float arg0) {
		return ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F) * arg0 * arg0 * arg0;
	}
}
