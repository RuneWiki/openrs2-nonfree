import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static367 {

	@OriginalMember(owner = "client!nu", name = "P", descriptor = "[Lclient!f;")
	public static Class14[] aClass14Array13;

	@OriginalMember(owner = "client!nu", name = "L", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_124 = new Class56(73, 2);

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(BZI)Ljava/lang/String;")
	public static String method5384(@OriginalArg(2) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static186.method3165(arg0);
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(BI)I")
	public static int method5385(@OriginalArg(1) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
