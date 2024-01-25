import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static587 {

	@OriginalMember(owner = "client!wm", name = "d", descriptor = "I")
	public static int anInt9355;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "Lclient!cb;")
	public static final Class37 aClass37_5 = new Class37();

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "I")
	public static int anInt9353 = -1;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)J")
	public static synchronized long method7753() {
		@Pc(10) long local10 = System.currentTimeMillis();
		if (Static119.aLong79 > local10) {
			Static293.aLong144 += Static119.aLong79 - local10;
		}
		Static119.aLong79 = local10;
		return Static293.aLong144 + local10;
	}
}
