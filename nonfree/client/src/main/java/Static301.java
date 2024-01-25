import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static301 {

	@OriginalMember(owner = "client!op", name = "x", descriptor = "I")
	public static int anInt4204;

	@OriginalMember(owner = "client!op", name = "g", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_98 = new Class25(56, -2);

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IIIB)I")
	public static int method3387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 < arg1) {
			return arg1;
		} else if (arg2 > arg0) {
			return arg0;
		} else {
			return arg2;
		}
	}
}
