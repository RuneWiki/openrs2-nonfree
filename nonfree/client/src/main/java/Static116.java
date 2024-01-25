import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static116 {

	@OriginalMember(owner = "client!es", name = "c", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_43 = new Class45("purple:", "lila:", "violet:", "roxo:");

	@OriginalMember(owner = "client!es", name = "k", descriptor = "Lclient!re;")
	public static final Class250 aClass250_2 = new Class250("stellardawn", 1);

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method2268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg7 + arg2 > arg3 && arg1 + arg3 > arg2) {
			return arg4 + arg0 > arg5 && arg4 < arg5 + arg6;
		} else {
			return false;
		}
	}
}
