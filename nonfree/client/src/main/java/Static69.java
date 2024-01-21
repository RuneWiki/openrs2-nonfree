import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static69 {

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "Lclient!jb;")
	public static Class33 aClass33_24 = new Class33(30);

	@OriginalMember(owner = "client!lb", name = "m", descriptor = "Lclient!jb;")
	public static Class33 aClass33_25 = new Class33(100);

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "Lclient!kd;")
	private static Class39 aClass39_870 = Static108.method1915("Loading)3)3)3");

	@OriginalMember(owner = "client!lb", name = "o", descriptor = "Lclient!kd;")
	public static Class39 aClass39_871 = Static108.method1915("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
	public static int anInt1767 = 0;

	@OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
	public static int anInt1768 = 0;

	@OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
	public static int anInt1769 = 0;

	@OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
	public static int anInt1770 = -1;

	@OriginalMember(owner = "client!lb", name = "t", descriptor = "Lclient!kd;")
	public static Class39 aClass39_872 = aClass39_870;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)V")
	public static void method1222(@OriginalArg(1) int arg0) {
		Static22.anInt754 = arg0;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(II)Lclient!kd;")
	public static Class39 method1226(@OriginalArg(0) int arg0) {
		return Static77.method1321(arg0, false);
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(Z)V")
	public static void method1227() {
		aClass33_24 = null;
		aClass39_872 = null;
		aClass39_870 = null;
		aClass39_871 = null;
		aClass33_25 = null;
	}
}
