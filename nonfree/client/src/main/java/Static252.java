import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!td", name = "a", descriptor = "J")
	private static long aLong161;

	@OriginalMember(owner = "client!td", name = "b", descriptor = "J")
	private static long aLong162;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B)J")
	public static synchronized long method3964() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (aLong162 > local1) {
			aLong161 += aLong162 - local1;
		}
		aLong162 = local1;
		return local1 + aLong161;
	}
}
