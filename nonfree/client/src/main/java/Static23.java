import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
	public static int anInt582;

	@OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
	public static int anInt588;

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
	public static int anInt583 = 0;

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
	public static int anInt584 = -1;

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
	public static int anInt585 = 128;

	@OriginalMember(owner = "client!cd", name = "i", descriptor = "Lclient!tg;")
	public static Class81 aClass81_192 = Static120.method2057("blaugr-Un:");

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
	public static void method506() {
		aClass81_192 = null;
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)J")
	public static synchronized long method507() {
		@Pc(10) long local10 = System.currentTimeMillis();
		if (Static137.aLong109 > local10) {
			Static154.aLong127 += Static137.aLong109 - local10;
		}
		Static137.aLong109 = local10;
		return Static154.aLong127 + local10;
	}
}
