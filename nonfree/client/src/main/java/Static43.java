import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static43 {

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "Lclient!la;")
	public static Class17 aClass17_5;

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "Lclient!v;")
	private static Class76 aClass76_139 = Static134.method2017("Loading interfaces )2 ");

	@OriginalMember(owner = "client!hc", name = "n", descriptor = "Lclient!v;")
	public static Class76 aClass76_140 = Static134.method2017("(U0a )2 via: ");

	@OriginalMember(owner = "client!hc", name = "r", descriptor = "Lclient!v;")
	public static Class76 aClass76_141 = Static134.method2017("title)3jpg");

	@OriginalMember(owner = "client!hc", name = "t", descriptor = "Lclient!v;")
	public static Class76 aClass76_142 = aClass76_139;

	@OriginalMember(owner = "client!hc", name = "B", descriptor = "Lclient!v;")
	public static Class76 aClass76_143 = Static134.method2017("<col=00ff80>");

	@OriginalMember(owner = "client!hc", name = "E", descriptor = "Z")
	public static boolean aBoolean16 = false;

	@OriginalMember(owner = "client!hc", name = "H", descriptor = "[I")
	public static int[] anIntArray43 = new int[4000];

	@OriginalMember(owner = "client!hc", name = "I", descriptor = "Lclient!v;")
	public static Class76 aClass76_144 = Static134.method2017(" )2> <col=ffffff>");

	@OriginalMember(owner = "client!hc", name = "P", descriptor = "Z")
	public static boolean aBoolean17 = false;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method214(@OriginalArg(0) Component arg0) {
		arg0.removeMouseListener(Static92.aClass55_1);
		arg0.removeMouseMotionListener(Static92.aClass55_1);
		arg0.removeFocusListener(Static92.aClass55_1);
		Static57.anInt1523 = 0;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZLclient!dd;)Lclient!v;")
	public static Class76 method217(@OriginalArg(1) Class4_Sub8 arg0) {
		if (Static122.method1889(Static35.method627(arg0)) == 0) {
			return null;
		} else if (arg0.aClass76_194 == null || arg0.aClass76_194.method1883().method1851() == 0) {
			return Static99.aBoolean157 ? Static100.aClass76_1052 : null;
		} else {
			return arg0.aClass76_194;
		}
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V")
	public static void method222() {
		anIntArray43 = null;
		aClass17_5 = null;
		aClass76_139 = null;
		aClass76_142 = null;
		aClass76_141 = null;
		aClass76_144 = null;
		aClass76_140 = null;
		aClass76_143 = null;
	}
}
