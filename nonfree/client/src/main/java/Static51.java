import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static51 {

	@OriginalMember(owner = "client!bo", name = "A", descriptor = "I")
	public static int anInt617 = -1;

	@OriginalMember(owner = "client!bo", name = "z", descriptor = "Lclient!oba;")
	public static final Class261 aClass261_2 = new Class261();

	@OriginalMember(owner = "client!bo", name = "B", descriptor = "I")
	public static int anInt622 = 0;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIIIIIIBI)Z")
	public static boolean method616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 < arg7 + arg4 && arg4 < arg0 + arg1) {
			return arg6 + arg5 > arg2 && arg6 < arg3 + arg2;
		} else {
			return false;
		}
	}
}
