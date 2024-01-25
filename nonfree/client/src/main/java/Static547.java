import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static547 {

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "Z")
	public static boolean aBoolean764 = false;

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "Z")
	public static final boolean aBoolean765 = false;

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)J")
	public static synchronized long method7619() {
		@Pc(5) long local5 = System.currentTimeMillis();
		if (local5 < Static563.aLong263) {
			Static271.aLong138 += Static563.aLong263 - local5;
		}
		Static563.aLong263 = local5;
		return Static271.aLong138 + local5;
	}
}
