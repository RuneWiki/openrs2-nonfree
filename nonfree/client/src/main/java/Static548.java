import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static548 {

	@OriginalMember(owner = "client!sc", name = "x", descriptor = "Lclient!cg;")
	public static Class59 aClass59_10;

	@OriginalMember(owner = "client!sc", name = "B", descriptor = "Z")
	public static boolean aBoolean640 = false;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(JI)V")
	public static void method7968(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static330.method5121(arg0 - 1L);
			Static330.method5121(1L);
		} else {
			Static330.method5121(arg0);
		}
	}
}
