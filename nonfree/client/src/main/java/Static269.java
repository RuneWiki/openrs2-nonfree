import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!nm", name = "A", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_92 = new Class254(37, -1);

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(III)Z")
	public static boolean method3759(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		@Pc(22) Class29 local22 = Static251.aClass207_2.method4977(arg0);
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local22.method473(arg1);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIII)V")
	public static void method3761(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 - arg1 >= Static47.anInt762 && Static60.anInt1086 >= arg1 + arg0 && arg2 - arg1 >= Static357.anInt6537 && arg1 + arg2 <= Static85.anInt1517) {
			Static318.method4377(arg2, arg1, arg3, arg0);
		} else {
			Static310.method4257(arg2, arg1, arg0, arg3);
		}
	}
}
