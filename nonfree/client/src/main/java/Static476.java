import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static476 {

	@OriginalMember(owner = "client!tt", name = "l", descriptor = "F")
	public static float aFloat154;

	@OriginalMember(owner = "client!tt", name = "m", descriptor = "I")
	public static int anInt7960 = 0;

	@OriginalMember(owner = "client!tt", name = "o", descriptor = "Z")
	public static boolean aBoolean565 = false;

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(B)V")
	public static void method6602() {
		for (@Pc(10) Class1_Sub36 local10 = (Class1_Sub36) Static191.aClass37_41.method977(); local10 != null; local10 = (Class1_Sub36) Static191.aClass37_41.method971()) {
			if (local10.anInt6238 == -1) {
				local10.anInt6236 = 0;
				if (local10.anInt6239 >= 0 && local10.anInt6235 >= 0 && local10.anInt6239 < Static459.anInt7799 && Static482.anInt7990 > local10.anInt6235) {
					Static215.method3604(local10);
				}
			} else {
				local10.method7525();
			}
		}
	}
}
