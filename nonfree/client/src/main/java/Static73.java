import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static73 {

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
	public static int anInt2250;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
	public static int anInt2247 = 0;

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "Lclient!rf;")
	private static Class70 aClass70_717 = Static49.method1293("Drop");

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "Lclient!rf;")
	public static Class70 aClass70_718 = Static49.method1293("mapdots");

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "Lclient!rf;")
	public static Class70 aClass70_719 = aClass70_717;

	@OriginalMember(owner = "client!ib", name = "j", descriptor = "Z")
	public static boolean aBoolean77 = false;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!u;ZLclient!u;)V")
	public static void method1660(@OriginalArg(0) Class76 arg0, @OriginalArg(2) Class76 arg1) {
		Static117.aClass76_94 = arg0;
		Static158.aClass76_123 = arg1;
		Static92.anInt2689 = Static158.aClass76_123.method3306(3);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
	public static void method1661() {
		aClass70_717 = null;
		aClass70_719 = null;
		aClass70_718 = null;
	}
}
