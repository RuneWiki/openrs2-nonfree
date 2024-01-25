import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static469 {

	@OriginalMember(owner = "client!sl", name = "l", descriptor = "Lclient!mfa;")
	public static final Class211 aClass211_66 = new Class211();

	@OriginalMember(owner = "client!sl", name = "n", descriptor = "Lclient!ep;")
	public static Class93 aClass93_15 = null;

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IZ)I")
	public static int method7231(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static17.method842(arg0);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(III)Z")
	public static boolean method7232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x180) != 0;
	}
}
