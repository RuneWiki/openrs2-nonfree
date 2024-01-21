import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static30 {

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
	public static int anInt875;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "Lclient!af;")
	public static Class5 aClass5_406 = Static45.method1937(" )2> <col=ffff00>");

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "Lclient!gd;")
	public static Class28 aClass28_23 = new Class28(50);

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "Lclient!af;")
	private static Class5 aClass5_407 = Static45.method1937("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "Lclient!af;")
	public static Class5 aClass5_408 = aClass5_407;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IILclient!of;)Lclient!af;")
	public static Class5 method605(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (!Static32.method656(Static6.method221(arg1), arg0) && arg1.anObjectArray18 == null) {
			return null;
		} else if (arg1.aClass5Array17 == null || arg0 >= arg1.aClass5Array17.length || arg1.aClass5Array17[arg0] == null || arg1.aClass5Array17[arg0].method194().method215() == 0) {
			return Static93.aBoolean91 ? Static100.method1696(new Class5[] { Static109.aClass5_1259, Static48.method838(arg0) }) : null;
		} else {
			return arg1.aClass5Array17[arg0];
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
	public static void method607() {
		aClass28_23 = null;
		aClass5_407 = null;
		aClass5_408 = null;
		aClass5_406 = null;
	}
}
