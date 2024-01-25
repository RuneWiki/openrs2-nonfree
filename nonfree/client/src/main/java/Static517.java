import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static517 {

	@OriginalMember(owner = "client!qca", name = "b", descriptor = "Z")
	public static boolean aBoolean546 = false;

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "I")
	public static int anInt8136 = -1;

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(Z)J")
	public static synchronized long method6965() {
		@Pc(12) long local12 = System.currentTimeMillis();
		if (Static7.aLong7 > local12) {
			Static306.aLong166 += Static7.aLong7 - local12;
		}
		Static7.aLong7 = local12;
		return Static306.aLong166 + local12;
	}
}
