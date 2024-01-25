import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static140 {

	@OriginalMember(owner = "client!gs", name = "n", descriptor = "Lclient!wg;")
	public static Class265 aClass265_3;

	@OriginalMember(owner = "client!gs", name = "e", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_61 = new Class211(34, 3);

	@OriginalMember(owner = "client!gs", name = "g", descriptor = "[I")
	public static final int[] anIntArray195 = new int[4];

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(III)Z")
	public static boolean method2074(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static100.method1527(arg0, arg1) | (arg1 & 0x60000) != 0 || Static261.method1844(arg1, arg0) || Static177.method2477(arg0, arg1);
	}
}
