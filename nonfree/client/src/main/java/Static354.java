import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "J")
	private static long aLong202;

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "J")
	private static long aLong203;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)J")
	public static synchronized long method4966() {
		@Pc(6) long local6 = System.currentTimeMillis();
		if (local6 < aLong203) {
			aLong202 += aLong203 - local6;
		}
		aLong203 = local6;
		return local6 + aLong202;
	}
}
