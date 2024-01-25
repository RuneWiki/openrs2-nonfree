import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "J")
	private static long aLong129;

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "J")
	private static long aLong130;

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)J")
	public static synchronized long method3498() {
		@Pc(6) long local6 = System.currentTimeMillis();
		if (aLong129 > local6) {
			aLong130 += aLong129 - local6;
		}
		aLong129 = local6;
		return local6 + aLong130;
	}
}
