import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
	public static int anInt231;

	@OriginalMember(owner = "client!ak", name = "f", descriptor = "Z")
	public static boolean aBoolean9 = true;

	@OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
	public static int anInt234 = 0;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!mc;I)Ljava/lang/String;")
	public static String method356(@OriginalArg(0) Class198 arg0) {
		if (Static67.method1529(arg0).method5780() == 0) {
			return null;
		} else if (arg0.aString66 == null || arg0.aString66.trim().length() == 0) {
			return Static470.aBoolean610 ? "Hidden-use" : null;
		} else {
			return arg0.aString66;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(BIIIIII)I")
	public static int method360(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg4 & 0x3;
		if ((arg1 & 0x1) == 1) {
			@Pc(12) int local12 = arg3;
			arg3 = arg0;
			arg0 = local12;
		}
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return arg5;
		} else if (local3 == 2) {
			return 1 + 7 - arg3 - arg2;
		} else {
			return 1 + 7 - arg0 - arg5;
		}
	}
}
