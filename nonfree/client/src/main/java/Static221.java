import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "J")
	private static long aLong167;

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "J")
	private static long aLong168;

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)J")
	public static synchronized long method3670() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < aLong167) {
			aLong168 += aLong167 - local1;
		}
		aLong167 = local1;
		return local1 + aLong168;
	}
}
