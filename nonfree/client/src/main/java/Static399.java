import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static399 {

	@OriginalMember(owner = "client!mk", name = "i", descriptor = "D")
	public static double aDouble34;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_91 = new Class349(1, 4);

	@OriginalMember(owner = "client!mk", name = "d", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_124 = new Class225(63, 8);

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIIII)V")
	public static void method5894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = arg2 + 1;
		Static494.method7075(arg0, arg3, arg1, Static449.anIntArrayArray48[arg2], 18601);
		@Pc(20) int local20 = arg4 - 1;
		Static494.method7075(arg0, arg3, arg1, Static449.anIntArrayArray48[arg4], 18601);
		for (@Pc(27) int local27 = local11; local27 <= local20; local27++) {
			@Pc(33) int[] local33 = Static449.anIntArrayArray48[local27];
			local33[arg0] = local33[arg1] = arg3;
		}
	}
}
