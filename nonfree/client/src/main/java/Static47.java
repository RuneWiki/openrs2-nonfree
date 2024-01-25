import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static47 {

	@OriginalMember(owner = "client!cs", name = "g", descriptor = "I")
	public static int anInt1202;

	@OriginalMember(owner = "client!cs", name = "q", descriptor = "Lclient!jf;")
	public static Class96 aClass96_2;

	@OriginalMember(owner = "client!cs", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString65 = "Your ignore list is full. Max of 100 users.";

	@OriginalMember(owner = "client!cs", name = "t", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray4 = new String[8];

	@OriginalMember(owner = "client!cs", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString66 = "Loading...";

	@OriginalMember(owner = "client!cs", name = "x", descriptor = "I")
	public static int anInt1211 = 0;

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(B)Z")
	public static boolean method1053() {
		return Static226.anInt4439 != 0 || Static70.anInt1768 >= 2;
	}

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "(Z)V")
	public static void method1059() {
		Static26.aClass59_2.method4790(Static49.anInt1234, Static18.aBoolean39 ? Static52.anInt1317 + 256 : -1);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(BI)I")
	public static int method1061(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}
}
