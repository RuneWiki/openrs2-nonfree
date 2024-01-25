import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "[[[Lclient!dq;")
	public static Class73[][][] aClass73ArrayArrayArray2;

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "I")
	public static int anInt4309 = 104;

	@OriginalMember(owner = "client!iv", name = "d", descriptor = "I")
	public static int anInt4311 = 0;

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIBI)I")
	public static int method3811(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg2 & 0x3;
		if (local12 == 0) {
			return arg1;
		} else if (local12 == 1) {
			return 7 - arg0;
		} else if (local12 == 2) {
			return 7 - arg1;
		} else {
			return arg0;
		}
	}
}
