import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static127 {

	@OriginalMember(owner = "client!ew", name = "y", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_29 = new Class230(16, -1);

	@OriginalMember(owner = "client!ew", name = "z", descriptor = "Z")
	public static boolean aBoolean226 = false;

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(IB)Z")
	public static boolean method2533(@OriginalArg(0) int arg0) {
		if (arg0 == 49 || arg0 == 48 || arg0 == 18 || arg0 == 57 || arg0 == 1006) {
			return true;
		} else {
			return arg0 == 60 || arg0 == 1004;
		}
	}
}
