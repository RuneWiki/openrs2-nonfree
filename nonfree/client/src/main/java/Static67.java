import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static67 {

	@OriginalMember(owner = "client!bw", name = "w", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_162 = new Class349(10, 7);

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(IIII)I")
	public static int method9535(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 <= arg1) {
			return arg2 < arg1 ? arg2 : arg1;
		} else {
			return arg0;
		}
	}
}
