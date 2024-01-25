import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!da", name = "a", descriptor = "J")
	private static long aLong32;

	@OriginalMember(owner = "client!da", name = "b", descriptor = "J")
	private static long aLong33;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I)J")
	public static synchronized long method979() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (aLong32 > local1) {
			aLong33 += aLong32 - local1;
		}
		aLong32 = local1;
		return local1 + aLong33;
	}
}
