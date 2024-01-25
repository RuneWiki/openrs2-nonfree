import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "J")
	private static long aLong107;

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "J")
	private static long aLong108;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)J")
	public static synchronized long method3182() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (aLong107 > local1) {
			aLong108 += aLong107 - local1;
		}
		aLong107 = local1;
		return aLong108 + local1;
	}
}
