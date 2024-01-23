import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "J")
	private static long aLong203;

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "J")
	private static long aLong204;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)J")
	public static synchronized long method4413() {
		@Pc(7) long local7 = System.currentTimeMillis();
		if (aLong203 > local7) {
			aLong204 += aLong203 - local7;
		}
		aLong203 = local7;
		return local7 + aLong204;
	}
}
