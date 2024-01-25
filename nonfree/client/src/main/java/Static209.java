import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static209 {

	@OriginalMember(owner = "client!iba", name = "E", descriptor = "I")
	public static int anInt4091 = 0;

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(ZZB)V")
	public static void method3312(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg0) {
			Static578.anInt9523++;
			Static15.method150();
		}
		if (arg1) {
			Static344.anInt5739++;
			Static464.method6400();
		}
	}
}
