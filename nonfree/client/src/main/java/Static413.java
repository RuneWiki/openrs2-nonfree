import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static413 {

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "Lclient!wba;")
	public static final Class353 aClass353_56 = new Class353();

	@OriginalMember(owner = "client!pt", name = "c", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_72 = new Class70(63, 0);

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(Z)J")
	public static synchronized long method5668() {
		@Pc(10) long local10 = System.currentTimeMillis();
		if (local10 < Static255.aLong140) {
			Static522.aLong268 += Static255.aLong140 - local10;
		}
		Static255.aLong140 = local10;
		return local10 + Static522.aLong268;
	}
}
