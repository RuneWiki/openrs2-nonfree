import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "Lclient!mb;")
	public static Class132 aClass132_18;

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "[I")
	public static int[] anIntArray665;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
	public static int anInt5841 = 0;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)Z")
	public static boolean method5292() {
		@Pc(8) Class6_Sub32 local8 = (Class6_Sub32) Static214.aClass211_24.aClass6_237.aClass6_247;
		if (local8 == null || Static214.aClass211_24.aClass6_237 == local8) {
			return false;
		} else {
			if (local8.anInt4932 >= 2000) {
				local8.anInt4932 -= 2000;
			}
			return local8.anInt4932 == 1010;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIIII)I")
	public static int method5294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg1 & 0x1) == 1) {
			@Pc(8) int local8 = arg5;
			arg5 = arg4;
			arg4 = local8;
		}
		@Pc(20) int local20 = arg3 & 0x3;
		if (local20 == 0) {
			return arg2;
		} else if (local20 == 1) {
			return arg0;
		} else if (local20 == 2) {
			return 1 + 7 - arg5 - arg2;
		} else {
			return 1 + 7 - arg4 - arg0;
		}
	}
}
