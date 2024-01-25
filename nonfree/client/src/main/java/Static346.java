import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!rh", name = "f", descriptor = "Lclient!lt;")
	public static Class158 aClass158_73;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "D")
	public static double aDouble9 = -1.0D;

	@OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
	public static int anInt5783 = 0;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIIII)V")
	public static void method4857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) int local14 = arg3 - arg2;
		@Pc(18) int local18 = arg2 + arg4;
		for (@Pc(20) int local20 = arg4; local20 < local18; local20++) {
			Static73.method1404(Static347.anIntArrayArray54[local20], arg1, arg5, arg0);
		}
		@Pc(39) int local39 = arg1 - arg2;
		for (@Pc(41) int local41 = arg3; local41 > local14; local41--) {
			Static73.method1404(Static347.anIntArrayArray54[local41], arg1, arg5, arg0);
		}
		@Pc(61) int local61 = arg2 + arg0;
		for (@Pc(63) int local63 = local18; local63 <= local14; local63++) {
			@Pc(69) int[] local69 = Static347.anIntArrayArray54[local63];
			Static73.method1404(local69, local61, arg5, arg0);
			Static73.method1404(local69, arg1, arg5, local39);
		}
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)V")
	public static void method4859() {
		if (Static313.anInt5099 == -1) {
			return;
		}
		@Pc(11) int local11 = Static37.aClass71_26.method1618();
		@Pc(15) int local15 = Static37.aClass71_26.method1624();
		@Pc(24) Class6_Sub7 local24 = (Class6_Sub7) Static254.aClass88_34.method1882();
		if (local24 != null) {
			local11 = local24.method1257();
			local15 = local24.method1258();
		}
		Static119.method1909(0, local15, Static313.anInt5099, 0, 0, Static235.anInt4053, Static381.anInt6279, 0, local11);
		if (Static332.aClass239_11 != null) {
			Static62.method1175(local11, local15);
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!lt;II)Lclient!pm;")
	public static Class201 method4860(@OriginalArg(0) Class158 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte[] local8 = arg0.method3691(arg1);
		return local8 == null ? null : new Class201(local8);
	}
}
