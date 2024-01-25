import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static31 {

	@OriginalMember(owner = "client!bca", name = "t", descriptor = "I")
	public static int anInt601;

	@OriginalMember(owner = "client!bca", name = "q", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_7 = new Class218(59, 6);

	@OriginalMember(owner = "client!bca", name = "b", descriptor = "(III)Z")
	public static boolean method594(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static502.method7318(arg0, arg1) & Static438.method6670(arg1, arg0);
	}
}
