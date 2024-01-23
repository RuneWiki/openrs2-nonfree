import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!n", name = "v", descriptor = "I")
	public static int anInt3363;

	@OriginalMember(owner = "client!n", name = "w", descriptor = "I")
	public static int anInt3364;

	@OriginalMember(owner = "client!n", name = "x", descriptor = "I")
	public static int anInt3365;

	@OriginalMember(owner = "client!n", name = "z", descriptor = "Lclient!eg;")
	public static Class8_Sub1_Sub7_Sub1 aClass8_Sub1_Sub7_Sub1_5;

	@OriginalMember(owner = "client!n", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString115 = "Created gameworld";

	@OriginalMember(owner = "client!n", name = "s", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray50 = new String[5];

	@OriginalMember(owner = "client!n", name = "y", descriptor = "Lclient!wn;")
	public static Class182 aClass182_20 = new Class182();

	@OriginalMember(owner = "client!n", name = "A", descriptor = "I")
	public static int anInt3366 = 0;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method2646(@OriginalArg(0) String arg0) {
		return Static41.method625(arg0, 10);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(B)Ljava/lang/String;")
	public static String method2647() {
		@Pc(32) String local32;
		if (Static149.anInt3012 == 1 && Static185.anInt3679 < 2) {
			local32 = Static255.aString176 + Static75.aString63 + Static141.aString100 + " ->";
		} else if (Static215.aBoolean357 && Static185.anInt3679 < 2) {
			local32 = Static47.aString39 + Static75.aString63 + Static153.aString105 + " ->";
		} else if (Static269.aBoolean399 && Static36.aBooleanArray2[81] && Static185.anInt3679 > 2) {
			local32 = Static105.method1704(Static185.anInt3679 - 2);
		} else {
			local32 = Static105.method1704(Static185.anInt3679 - 1);
		}
		if (Static185.anInt3679 > 2) {
			local32 = local32 + "<col=ffffff> / " + (Static185.anInt3679 - 2) + Static132.aString98;
		}
		return local32;
	}
}
