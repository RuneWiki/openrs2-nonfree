import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!au", name = "d", descriptor = "I")
	public static int anInt353;

	@OriginalMember(owner = "client!au", name = "c", descriptor = "I")
	public static int anInt350 = 0;

	@OriginalMember(owner = "client!au", name = "f", descriptor = "I")
	public static int anInt351 = 0;

	@OriginalMember(owner = "client!au", name = "a", descriptor = "Z")
	public static final boolean aBoolean27 = false;

	@OriginalMember(owner = "client!au", name = "b", descriptor = "I")
	public static int anInt352 = 0;

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(B)J")
	public static synchronized long method382() {
		@Pc(5) long local5 = System.currentTimeMillis();
		if (Static151.aLong100 > local5) {
			Static577.aLong262 += Static151.aLong100 - local5;
		}
		Static151.aLong100 = local5;
		return Static577.aLong262 + local5;
	}
}
