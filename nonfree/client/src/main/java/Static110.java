import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "J")
	private static long aLong67;

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "J")
	private static long aLong68;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)J")
	public static synchronized long method1702() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (aLong67 > local1) {
			aLong68 += aLong67 - local1;
		}
		aLong67 = local1;
		return local1 + aLong68;
	}
}
