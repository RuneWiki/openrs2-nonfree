import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static51 {

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "[Lclient!pf;")
	public static Class1_Sub1_Sub1_Sub3[] aClass1_Sub1_Sub1_Sub3Array4;

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
	public static int anInt1669 = 0;

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "[Lclient!rf;")
	public static Class70[] aClass70Array8 = new Class70[100];

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "Lclient!rf;")
	public static Class70 aClass70_531 = Static49.method1293("<col=ff7000>");

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V")
	public static void method1304() {
		aClass1_Sub1_Sub1_Sub3Array4 = null;
		aClass70Array8 = null;
		aClass70_531 = null;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!u;Z)V")
	public static void method1305(@OriginalArg(0) Class76 arg0) {
		Static45.aClass76_41 = arg0;
	}
}
