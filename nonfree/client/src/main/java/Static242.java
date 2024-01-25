import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "[Lclient!caa;")
	public static Class12_Sub2[] aClass12_Sub2Array1;

	@OriginalMember(owner = "client!jaa", name = "d", descriptor = "[J")
	public static final long[] aLongArray11 = new long[32];

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIII)I")
	public static int method3443(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return 4095 - arg1;
		} else if (local7 == 2) {
			return 4095 - arg2;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IILclient!da;II)Lclient!ifa;")
	public static Class157 method3444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class33 arg2, @OriginalArg(4) int arg3) {
		return arg2 == null ? null : new Class157(arg3, arg1, arg0, arg2.K(), arg2.KA(), arg2.l(), arg2.J(), arg2.H(), arg2.OA(), arg2.za());
	}
}
