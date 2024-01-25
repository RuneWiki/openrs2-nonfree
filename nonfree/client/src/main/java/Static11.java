import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
	public static int anInt305;

	@OriginalMember(owner = "client!ak", name = "o", descriptor = "I")
	public static int anInt311;

	@OriginalMember(owner = "client!ak", name = "k", descriptor = "J")
	public static long aLong13 = -1L;

	@OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
	public static int anInt309 = 0;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIIII)V")
	public static void method213(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static440.method5950(arg5, Static175.anInt3399, Static75.anInt1858);
		@Pc(17) int local17 = Static440.method5950(arg3, Static175.anInt3399, Static75.anInt1858);
		@Pc(23) int local23 = Static440.method5950(arg1, Static351.anInt6176, Static331.anInt5894);
		@Pc(29) int local29 = Static440.method5950(arg4, Static351.anInt6176, Static331.anInt5894);
		@Pc(37) int local37 = Static440.method5950(arg2 + arg5, Static175.anInt3399, Static75.anInt1858);
		@Pc(45) int local45 = Static440.method5950(arg3 - arg2, Static175.anInt3399, Static75.anInt1858);
		for (@Pc(47) int local47 = local11; local47 < local37; local47++) {
			Static49.method990(Static277.anIntArrayArray40[local47], local29, local23, arg0);
		}
		for (@Pc(79) int local79 = local17; local79 > local45; local79--) {
			Static49.method990(Static277.anIntArrayArray40[local79], local29, local23, arg0);
		}
		@Pc(105) int local105 = Static440.method5950(arg2 + arg1, Static351.anInt6176, Static331.anInt5894);
		@Pc(113) int local113 = Static440.method5950(arg4 - arg2, Static351.anInt6176, Static331.anInt5894);
		for (@Pc(115) int local115 = local37; local115 <= local45; local115++) {
			@Pc(121) int[] local121 = Static277.anIntArrayArray40[local115];
			Static49.method990(local121, local105, local23, arg0);
			Static49.method990(local121, local29, local113, arg0);
		}
	}
}
