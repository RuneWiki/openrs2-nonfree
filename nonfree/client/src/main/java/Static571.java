import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static571 {

	@OriginalMember(owner = "client!tj", name = "l", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_213 = new Class359(109, 7);

	@OriginalMember(owner = "client!tj", name = "p", descriptor = "J")
	public static long aLong266 = 0L;

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIIIIII)V")
	public static void method7885(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static596.method2932(Static639.anInt10384, Static496.anInt8305, arg4);
		@Pc(17) int local17 = Static596.method2932(Static639.anInt10384, Static496.anInt8305, arg1);
		@Pc(23) int local23 = Static596.method2932(Static106.anInt2266, Static669.anInt10712, arg6);
		@Pc(33) int local33 = Static596.method2932(Static106.anInt2266, Static669.anInt10712, arg3);
		@Pc(41) int local41 = Static596.method2932(Static639.anInt10384, Static496.anInt8305, arg0 + arg4);
		@Pc(50) int local50 = Static596.method2932(Static639.anInt10384, Static496.anInt8305, arg1 - arg0);
		for (@Pc(52) int local52 = local11; local52 < local41; local52++) {
			Static197.method3240(local33, Static16.anIntArrayArray2[local52], local23, arg2);
		}
		for (@Pc(68) int local68 = local17; local68 > local50; local68--) {
			Static197.method3240(local33, Static16.anIntArrayArray2[local68], local23, arg2);
		}
		@Pc(94) int local94 = Static596.method2932(Static106.anInt2266, Static669.anInt10712, arg0 + arg6);
		@Pc(103) int local103 = Static596.method2932(Static106.anInt2266, Static669.anInt10712, arg3 - arg0);
		for (@Pc(105) int local105 = local41; local105 <= local50; local105++) {
			@Pc(111) int[] local111 = Static16.anIntArrayArray2[local105];
			Static197.method3240(local94, local111, local23, arg2);
			Static197.method3240(local103, local111, local94, arg5);
			Static197.method3240(local33, local111, local103, arg2);
		}
	}
}
