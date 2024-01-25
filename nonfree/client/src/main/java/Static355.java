import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5703(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) int local10 = arg4 - arg1;
		@Pc(15) int local15 = arg2 + arg1;
		for (@Pc(17) int local17 = arg2; local17 < local15; local17++) {
			Static282.method4681(arg3, arg5, Static323.anIntArrayArray55[local17], arg0);
		}
		for (@Pc(37) int local37 = arg4; local37 > local10; local37--) {
			Static282.method4681(arg3, arg5, Static323.anIntArrayArray55[local37], arg0);
		}
		@Pc(61) int local61 = arg0 - arg1;
		@Pc(66) int local66 = arg5 + arg1;
		for (@Pc(68) int local68 = local15; local68 <= local10; local68++) {
			@Pc(74) int[] local74 = Static323.anIntArrayArray55[local68];
			Static282.method4681(arg3, arg5, local74, local66);
			Static282.method4681(arg6, local66, local74, local61);
			Static282.method4681(arg3, local61, local74, arg0);
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IB)V")
	public static void method5705(@OriginalArg(0) int arg0) {
		Static320.anInt6132 = 100;
		Static100.anInt2435 = arg0;
		Static242.anInt3402 = 3;
		Static268.anInt5281 = -1;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZI)V")
	public static void method5707(@OriginalArg(0) boolean arg0) {
		if (arg0 != Static114.aBoolean180) {
			Static114.aBoolean180 = arg0;
			Static275.method4593();
		}
	}
}
