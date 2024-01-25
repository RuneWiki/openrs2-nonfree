import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static414 {

	@OriginalMember(owner = "client!or", name = "r", descriptor = "[Z")
	public static boolean[] aBooleanArray118;

	@OriginalMember(owner = "client!or", name = "e", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_88 = new Class179(11, -1);

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IIIZ)I")
	public static int method5547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 > arg0) {
			return arg1;
		} else if (arg0 > arg2) {
			return arg2;
		} else {
			return arg0;
		}
	}
}
