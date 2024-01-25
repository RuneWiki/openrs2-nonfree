import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static426 {

	@OriginalMember(owner = "client!ro", name = "f", descriptor = "Lclient!wh;")
	public static Class319 aClass319_10;

	@OriginalMember(owner = "client!ro", name = "g", descriptor = "F")
	public static float aFloat235;

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "[I")
	public static final int[] anIntArray671 = new int[1];

	@OriginalMember(owner = "client!ro", name = "e", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_140 = new Class133(88, -2);

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(III)Z")
	public static boolean method6519(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static253.method4324(arg0, arg1) | (arg0 & 0x70000) != 0 || Static372.method5860(arg0, arg1);
	}
}
