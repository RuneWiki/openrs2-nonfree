import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static29 {

	@OriginalMember(owner = "client!bk", name = "l", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_38 = new Class137(30, -1);

	@OriginalMember(owner = "client!bk", name = "n", descriptor = "I")
	public static final int anInt576 = 1406;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(BI)I")
	public static int method504(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IB)Z")
	public static boolean method506(@OriginalArg(0) int arg0) {
		if (arg0 == 57 || arg0 == 16 || arg0 == 13 || arg0 == 8 || arg0 == 1012) {
			return true;
		} else {
			return arg0 == 18 || arg0 == 1006;
		}
	}
}
