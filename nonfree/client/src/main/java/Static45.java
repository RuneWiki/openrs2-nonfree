import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!ib", name = "D", descriptor = "I")
	public static int anInt1316;

	@OriginalMember(owner = "client!ib", name = "y", descriptor = "I")
	public static int anInt1313 = 0;

	@OriginalMember(owner = "client!ib", name = "z", descriptor = "Lclient!s;")
	public static Class66 aClass66_7 = new Class66(32);

	@OriginalMember(owner = "client!ib", name = "A", descriptor = "Lclient!mb;")
	public static Class45 aClass45_557 = Static63.method1251("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!ib", name = "B", descriptor = "I")
	public static int anInt1314 = 0;

	@OriginalMember(owner = "client!ib", name = "E", descriptor = "I")
	public static int anInt1317 = 0;

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)V")
	public static void method964() {
		aClass45_557 = null;
		aClass66_7 = null;
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(B)V")
	public static void method965() {
		@Pc(5) Object local5 = Static61.anObject2;
		synchronized (Static61.anObject2) {
			if (Static21.anInt696 != 0) {
				Static21.anInt696 = 1;
				try {
					Static61.anObject2.wait();
				} catch (@Pc(15) InterruptedException local15) {
				}
			}
		}
	}
}
