import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "J")
	private static long aLong108;

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "J")
	private static long aLong109;

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)J")
	public static synchronized long method3300() {
		@Pc(6) long local6 = System.currentTimeMillis();
		if (local6 < aLong108) {
			aLong109 += aLong108 - local6;
		}
		aLong108 = local6;
		return local6 + aLong109;
	}
}
