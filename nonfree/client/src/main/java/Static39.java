import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "J")
	private static long aLong32;

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "J")
	private static long aLong33;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)J")
	public static synchronized long method699() {
		@Pc(7) long local7 = System.currentTimeMillis();
		if (aLong33 > local7) {
			aLong32 += aLong33 - local7;
		}
		aLong33 = local7;
		return local7 + aLong32;
	}
}
