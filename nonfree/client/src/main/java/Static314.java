import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!wl", name = "y", descriptor = "F")
	public static float aFloat154;

	@OriginalMember(owner = "client!wl", name = "x", descriptor = "Z")
	public static boolean aBoolean423 = false;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V")
	public static void method4831() {
		if (Static60.aClass126_1 != null) {
			@Pc(17) Class126 local17 = Static60.aClass126_1;
			synchronized (Static60.aClass126_1) {
				Static60.aClass126_1 = null;
			}
		}
	}
}
