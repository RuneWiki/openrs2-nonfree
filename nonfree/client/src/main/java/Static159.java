import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static159 {

	@OriginalMember(owner = "client!te", name = "m", descriptor = "Lclient!mc;")
	public static Class40_Sub1 aClass40_Sub1_125;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "Lclient!ch;")
	public static Class14 aClass14_207 = new Class14(64);

	@OriginalMember(owner = "client!te", name = "f", descriptor = "Lclient!gg;")
	private static Class28 aClass28_2430 = Static107.method1838("Members only world");

	@OriginalMember(owner = "client!te", name = "h", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2431 = Static107.method1838("M");

	@OriginalMember(owner = "client!te", name = "i", descriptor = "[Lclient!kh;")
	public static Class43[] aClass43Array105 = new Class43[100];

	@OriginalMember(owner = "client!te", name = "k", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2432 = Static107.method1838("::");

	@OriginalMember(owner = "client!te", name = "n", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2433 = aClass28_2430;

	@OriginalMember(owner = "client!te", name = "o", descriptor = "I")
	public static int anInt4048 = 0;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method2885(@OriginalArg(1) Component arg0) {
		arg0.removeKeyListener(Static45.aClass59_1);
		arg0.removeFocusListener(Static45.aClass59_1);
		Static81.anInt2516 = -1;
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(Z)V")
	public static void method2887() {
		aClass14_207 = null;
		aClass28_2431 = null;
		aClass28_2430 = null;
		aClass28_2433 = null;
		aClass43Array105 = null;
		aClass40_Sub1_125 = null;
		aClass28_2432 = null;
	}
}
