import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!pc", name = "G", descriptor = "Lclient!ps;")
	public static final Class291 aClass291_10 = new Class291();

	@OriginalMember(owner = "client!pc", name = "cd", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_113 = new Class216(84, -1);

	@OriginalMember(owner = "client!pc", name = "ge", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_114 = new Class216(54, 8);

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZIIIIII)V")
	public static void method6344(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg0 + arg4;
		@Pc(15) int local15 = arg2 - arg4;
		for (@Pc(17) int local17 = arg0; local17 < local10; local17++) {
			Static559.method7424(arg5, Static172.anIntArrayArray17[local17], arg1, arg3);
		}
		@Pc(36) int local36 = arg3 + arg4;
		for (@Pc(38) int local38 = arg2; local38 > local15; local38--) {
			Static559.method7424(arg5, Static172.anIntArrayArray17[local38], arg1, arg3);
		}
		@Pc(57) int local57 = arg1 - arg4;
		for (@Pc(70) int local70 = local10; local70 <= local15; local70++) {
			@Pc(76) int[] local76 = Static172.anIntArrayArray17[local70];
			Static559.method7424(arg5, local76, local36, arg3);
			Static559.method7424(arg5, local76, arg1, local57);
		}
	}
}
