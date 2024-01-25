import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static437 {

	@OriginalMember(owner = "client!vv", name = "j", descriptor = "F")
	public static float aFloat97;

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(BI)V")
	public static void method5474(@OriginalArg(1) int arg0) {
		@Pc(13) Class1_Sub3_Sub13 local13 = Static397.method4998(1, arg0);
		local13.method3458();
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(IC)Z")
	public static boolean method5475(@OriginalArg(1) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
