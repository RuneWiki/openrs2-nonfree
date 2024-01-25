import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static454 {

	@OriginalMember(owner = "client!qba", name = "u", descriptor = "Lclient!fc;")
	public static final Class94 aClass94_42 = new Class94(64);

	@OriginalMember(owner = "client!qba", name = "y", descriptor = "[[I")
	public static final int[][] anIntArrayArray41 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(Lclient!ac;Z[IIBIII)Lclient!iaa;")
	public static Class2_Sub1_Sub1 method6881(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg0.aBoolean30 || Static152.method3040(arg2) && Static152.method3040(arg5)) {
			return new Class2_Sub1_Sub1(arg0, 3553, arg2, arg5, false, arg1, arg3, 0);
		} else if (arg0.aBoolean20) {
			return new Class2_Sub1_Sub1(arg0, 34037, arg2, arg5, false, arg1, arg3, 0);
		} else {
			return new Class2_Sub1_Sub1(arg0, arg2, arg5, Static101.method2622(arg2), Static101.method2622(arg5), arg1);
		}
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(BII)Lclient!sba;")
	public static Class302 method6884(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class302 local7 = Static299.method5103(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass302Array2 == null || arg1 >= local7.aClass302Array2.length) {
			return null;
		} else {
			return local7.aClass302Array2[arg1];
		}
	}
}
