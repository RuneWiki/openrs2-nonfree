import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "J")
	private static long aLong94;

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "J")
	private static long aLong95;

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)J")
	public static synchronized long method2186() {
		@Pc(6) long local6 = System.currentTimeMillis();
		if (local6 < aLong95) {
			aLong94 += aLong95 - local6;
		}
		aLong95 = local6;
		return local6 + aLong94;
	}
}
