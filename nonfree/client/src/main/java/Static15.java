import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "Z")
	public static boolean aBoolean15 = false;

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(Z)J")
	public static synchronized long method380() {
		@Pc(5) long local5 = System.currentTimeMillis();
		if (Static210.aLong97 > local5) {
			Static46.aLong33 += Static210.aLong97 - local5;
		}
		Static210.aLong97 = local5;
		return Static46.aLong33 + local5;
	}
}
