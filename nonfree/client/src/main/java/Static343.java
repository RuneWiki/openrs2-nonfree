import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!u", name = "R", descriptor = "[I")
	public static int[] anIntArray628;

	@OriginalMember(owner = "client!u", name = "A", descriptor = "Lclient!us;")
	public static final Class234 aClass234_117 = new Class234(24, 6);

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(III)Lclient!uj;")
	public static Class28_Sub3 method5200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class48 local7 = Static69.aClass48ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass28_Sub3_1;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIBII)V")
	public static void method5201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 >= Static26.anInt345 && Static272.anInt4750 >= arg0) {
			@Pc(11) int local11 = Static97.method1633(arg3, Static365.anInt6140, Static221.anInt3917);
			@Pc(19) int local19 = Static97.method1633(arg2, Static365.anInt6140, Static221.anInt3917);
			Static226.method3727(local19, arg0, local11, arg1);
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ZIIIIIII)V")
	public static void method5203(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg6 + arg4;
		@Pc(14) int local14 = arg5 - arg6;
		for (@Pc(16) int local16 = arg4; local16 < local9; local16++) {
			Static349.method5265(arg0, arg1, arg2, Static325.anIntArrayArray50[local16]);
		}
		@Pc(35) int local35 = arg1 - arg6;
		for (@Pc(37) int local37 = arg5; local37 > local14; local37--) {
			Static349.method5265(arg0, arg1, arg2, Static325.anIntArrayArray50[local37]);
		}
		@Pc(67) int local67 = arg0 + arg6;
		for (@Pc(69) int local69 = local9; local69 <= local14; local69++) {
			@Pc(75) int[] local75 = Static325.anIntArrayArray50[local69];
			Static349.method5265(arg0, local67, arg2, local75);
			Static349.method5265(local67, local35, arg3, local75);
			Static349.method5265(local35, arg1, arg2, local75);
		}
	}
}
