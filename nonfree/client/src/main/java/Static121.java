import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static121 {

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
	public static int anInt2656;

	@OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
	public static int anInt2658;

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "Lclient!sc;")
	public static Class107 aClass107_718 = Static231.method3737("(U0a )2 via: ");

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "Lclient!sc;")
	public static Class107 aClass107_719 = Static231.method3737("null");

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(BI)V")
	public static void method2074() {
		Static186.aClass61_72.method1695(50);
		Static188.aClass61_73.method1695(50);
		Static110.aClass61_44.method1695(50);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILclient!o;I)Lclient!sc;")
	public static Class107 method2076(@OriginalArg(1) Class86 arg0, @OriginalArg(2) int arg1) {
		if (!Static118.method2044(arg1, Static34.method676(arg0)) && arg0.anObjectArray12 == null) {
			return null;
		} else if (arg0.aClass107Array18 == null || arg1 >= arg0.aClass107Array18.length || arg0.aClass107Array18[arg1] == null || arg0.aClass107Array18[arg1].method3101().method3095() == 0) {
			return Static219.aBoolean426 ? Static149.method2437(new Class107[] { Static154.aClass107_895, Static115.method2001(arg1) }) : null;
		} else {
			return arg0.aClass107Array18[arg1];
		}
	}
}
