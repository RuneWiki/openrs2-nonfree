import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "J")
	private static long aLong160;

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "J")
	private static long aLong161;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)J")
	public static synchronized long method4627() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (aLong161 > local1) {
			aLong160 += aLong161 - local1;
		}
		aLong161 = local1;
		return aLong160 + local1;
	}
}
