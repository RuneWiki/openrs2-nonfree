import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZIIII)V")
	public static void method3632(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static494.method7283();
		Static224.aLong118 = 0L;
		@Pc(14) int local14 = Static259.method1979();
		if (arg1 == 3 || local14 == 3) {
			arg0 = true;
		}
		if (!Static485.aClass126_17.method7012()) {
			arg0 = true;
		}
		Static137.method2067(local14, arg2, arg3, arg0, arg1);
	}
}
