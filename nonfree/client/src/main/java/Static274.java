import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "J")
	private static long aLong207;

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "J")
	private static long aLong208;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)J")
	public static synchronized long method4763() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < aLong208) {
			aLong207 += aLong208 - local1;
		}
		aLong208 = local1;
		return local1 + aLong207;
	}
}
