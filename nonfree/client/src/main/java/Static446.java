import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "J")
	private static long aLong226;

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "J")
	private static long aLong227;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)J")
	public static synchronized long method5903() {
		@Pc(6) long local6 = System.currentTimeMillis();
		if (aLong226 > local6) {
			aLong227 += aLong226 - local6;
		}
		aLong226 = local6;
		return aLong227 + local6;
	}
}
