import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static583 {

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
	public static int anInt9699 = 1;

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "(B)V")
	public static void method7888() {
		if (!Static594.aBoolean851) {
			return;
		}
		@Pc(11) Class305 local11 = Static282.method4864(Static352.anInt7064, Static317.anInt9395);
		if (local11 != null && local11.anObjectArray25 != null) {
			@Pc(20) Class3_Sub38 local20 = new Class3_Sub38();
			local20.aClass305_11 = local11;
			local20.anObjectArray4 = local11.anObjectArray25;
			Static597.method8423(local20);
		}
		Static594.aBoolean851 = false;
		Static153.anInt3371 = -1;
		Static68.anInt1810 = -1;
		if (local11 != null) {
			Static282.method4860(local11);
		}
	}
}
