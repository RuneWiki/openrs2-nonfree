import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static481 {

	@OriginalMember(owner = "client!sk", name = "n", descriptor = "F")
	public static float aFloat217;

	@OriginalMember(owner = "client!sk", name = "p", descriptor = "I")
	public static int anInt8820 = -1;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)V")
	public static void method7203() {
		Static204.method7208();
		for (@Pc(12) int local12 = 0; local12 < 4; local12++) {
			Static86.aClass111Array1[local12].method2855();
		}
		Static37.method484();
		Static28.method361();
		System.gc();
		Static440.aClass44_12.ya();
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(CB)Z")
	public static boolean method7204(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}
}
