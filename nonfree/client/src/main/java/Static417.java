import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static417 {

	@OriginalMember(owner = "client!qh", name = "E", descriptor = "[I")
	public static final int[] anIntArray581 = new int[5];

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIBIII)V")
	public static void method6124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static112.method1759(arg3, Static134.anInt2364, Static60.anInt971);
		@Pc(17) int local17 = Static112.method1759(arg0, Static134.anInt2364, Static60.anInt971);
		@Pc(23) int local23 = Static112.method1759(arg1, Static235.anInt3970, Static151.anInt2683);
		@Pc(29) int local29 = Static112.method1759(arg2, Static235.anInt3970, Static151.anInt2683);
		@Pc(37) int local37 = Static112.method1759(arg3 + arg4, Static134.anInt2364, Static60.anInt971);
		@Pc(46) int local46 = Static112.method1759(arg0 - arg4, Static134.anInt2364, Static60.anInt971);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static455.method6536(local29, local23, arg5, Static503.anIntArrayArray12[local48]);
		}
		for (@Pc(73) int local73 = local17; local73 > local46; local73--) {
			Static455.method6536(local29, local23, arg5, Static503.anIntArrayArray12[local73]);
		}
		@Pc(96) int local96 = Static112.method1759(arg1 + arg4, Static235.anInt3970, Static151.anInt2683);
		@Pc(105) int local105 = Static112.method1759(arg2 - arg4, Static235.anInt3970, Static151.anInt2683);
		for (@Pc(107) int local107 = local37; local107 <= local46; local107++) {
			@Pc(113) int[] local113 = Static503.anIntArrayArray12[local107];
			Static455.method6536(local96, local23, arg5, local113);
			Static455.method6536(local29, local105, arg5, local113);
		}
	}
}
