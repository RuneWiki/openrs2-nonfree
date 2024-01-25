import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static528 {

	@OriginalMember(owner = "client!uea", name = "m", descriptor = "[Lclient!xa;")
	public static Class37[] aClass37Array11;

	@OriginalMember(owner = "client!uea", name = "n", descriptor = "Lclient!uk;")
	public static Class329 aClass329_7;

	@OriginalMember(owner = "client!uea", name = "j", descriptor = "Lclient!tc;")
	public static Class305 aClass305_13 = null;

	@OriginalMember(owner = "client!uea", name = "l", descriptor = "Z")
	public static boolean aBoolean799 = false;

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(IIIZLclient!jba;Lclient!jba;Z)I")
	public static int method7776(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class69_Sub1 arg3, @OriginalArg(5) Class69_Sub1 arg4, @OriginalArg(6) boolean arg5) {
		@Pc(10) int local10 = Static236.method4122(arg1, arg4, arg2, arg3);
		if (local10 != 0) {
			return arg2 ? -local10 : local10;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(31) int local31 = Static236.method4122(arg0, arg4, arg5, arg3);
			return arg5 ? -local31 : local31;
		}
	}
}
