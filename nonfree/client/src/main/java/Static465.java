import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static465 {

	@OriginalMember(owner = "client!pja", name = "d", descriptor = "I")
	public static int anInt7433;

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "I")
	public static int anInt7430 = 0;

	@OriginalMember(owner = "client!pja", name = "b", descriptor = "I")
	public static int anInt7431 = 0;

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(II)Lclient!em;")
	public static Class97 method6461(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 100 ? Static146.aClass97Array1[arg0] : null;
	}
}
