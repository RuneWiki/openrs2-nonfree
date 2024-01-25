import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!fq", name = "m", descriptor = "Lclient!im;")
	public static final Class140 aClass140_49 = new Class140(84, -2);

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIIIIBII)V")
	public static void method2329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) int local10 = arg6 + arg4;
		@Pc(15) int local15 = arg2 - arg4;
		for (@Pc(17) int local17 = arg6; local17 < local10; local17++) {
			Static424.method6216(arg5, arg0, arg1, Static447.anIntArrayArray99[local17]);
		}
		for (@Pc(39) int local39 = arg2; local39 > local15; local39--) {
			Static424.method6216(arg5, arg0, arg1, Static447.anIntArrayArray99[local39]);
		}
		@Pc(62) int local62 = arg5 - arg4;
		@Pc(66) int local66 = arg4 + arg1;
		for (@Pc(68) int local68 = local10; local68 <= local15; local68++) {
			@Pc(74) int[] local74 = Static447.anIntArrayArray99[local68];
			Static424.method6216(local66, arg0, arg1, local74);
			Static424.method6216(local62, arg3, local66, local74);
			Static424.method6216(arg5, arg0, local62, local74);
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(ZLclient!uv;)V")
	public static void method2331(@OriginalArg(1) Class296 arg0) {
		Static455.aClass1_Sub6_Sub2_2.method3973(arg0.method6960());
	}
}
