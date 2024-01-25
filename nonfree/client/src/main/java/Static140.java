import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "Lclient!hh;")
	public static Class109 aClass109_36;

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_130 = new Class12(12, -2);

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_51 = new Class254(62, 15);

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIZ)Z")
	public static boolean method2256(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		for (@Pc(7) int local7 = arg2; local7 <= arg1; local7++) {
			for (@Pc(11) int local11 = arg0; local11 <= arg3; local11++) {
				if (Static150.anIntArrayArray17[local7][local11] == arg4 && Static310.anIntArrayArray39[local7][local11] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)Lclient!kg;")
	public static Class47_Sub4 method2257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class137 local7 = Static131.aClass137ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass47_Sub4_2;
	}
}
