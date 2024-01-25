import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static480 {

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
	public static int anInt7783;

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "Z")
	public static boolean aBoolean521 = false;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)J")
	public static synchronized long method6763() {
		@Pc(11) long local11 = System.currentTimeMillis();
		if (Static125.aLong73 > local11) {
			Static163.aLong92 += Static125.aLong73 - local11;
		}
		Static125.aLong73 = local11;
		return Static163.aLong92 + local11;
	}
}
