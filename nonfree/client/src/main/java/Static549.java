import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static549 {

	@OriginalMember(owner = "client!sda", name = "b", descriptor = "Lclient!tf;")
	public static final Class340 aClass340_69 = new Class340();

	@OriginalMember(owner = "client!sda", name = "b", descriptor = "(I)J")
	public static synchronized long method7758() {
		@Pc(5) long local5 = System.currentTimeMillis();
		if (Static34.aLong23 > local5) {
			Static666.aLong337 += Static34.aLong23 - local5;
		}
		Static34.aLong23 = local5;
		return local5 + Static666.aLong337;
	}
}
