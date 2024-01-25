import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "J")
	private static long aLong114;

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "J")
	private static long aLong115;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)J")
	public static synchronized long method3058() {
		@Pc(6) long local6 = System.currentTimeMillis();
		if (aLong115 > local6) {
			aLong114 += aLong115 - local6;
		}
		aLong115 = local6;
		return local6 + aLong114;
	}
}
