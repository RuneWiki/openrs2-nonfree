import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static60 {

	@OriginalMember(owner = "client!cba", name = "w", descriptor = "Lclient!kk;")
	public static final Class171 aClass171_4 = new Class171();

	@OriginalMember(owner = "client!cba", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString69 = "";

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method5318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 < arg0 + arg1 && arg0 < arg7 + arg4) {
			return arg3 + arg5 > arg2 && arg5 < arg2 + arg6;
		} else {
			return false;
		}
	}
}
