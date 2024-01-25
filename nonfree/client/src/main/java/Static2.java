import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static2 {

	@OriginalMember(owner = "client!aaa", name = "e", descriptor = "Lclient!kb;")
	public static Class183 aClass183_1;

	@OriginalMember(owner = "client!aaa", name = "f", descriptor = "[I")
	public static int[] anIntArray3;

	@OriginalMember(owner = "client!aaa", name = "g", descriptor = "[I")
	public static final int[] anIntArray4 = new int[8];

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IC)Z")
	public static boolean method71(@OriginalArg(1) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ILclient!sr;Lclient!da;III)V")
	public static void method72(@OriginalArg(0) int arg0, @OriginalArg(1) Class308 arg1, @OriginalArg(2) Class57 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 != null) {
			arg1.method7241(arg4, arg2.l(), arg2.KA(), arg2.OA(), arg2.K(), arg3, arg2.za(), arg2.H(), arg0, arg2.J());
		}
	}
}
