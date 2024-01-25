import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static172 {

	@OriginalMember(owner = "client!la", name = "D", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray26 = new String[100];

	@OriginalMember(owner = "client!la", name = "J", descriptor = "I")
	public static int anInt3418 = 0;

	@OriginalMember(owner = "client!la", name = "P", descriptor = "D")
	public static double aDouble9 = -1.0D;

	@OriginalMember(owner = "client!la", name = "W", descriptor = "I")
	public static int anInt3428 = 0;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)V")
	public static void method2812() {
		Static278.aClass143_20.method4850();
		Static214.aClass29_1.method377();
		if (Static242.aClass59_3 != null) {
			Static242.aClass59_3.method1030(Static34.aCanvas1);
		}
		Static210.aClient1.method618();
		Static34.aCanvas1.setBackground(Color.black);
		Static340.anInt5687 = -1;
		Static278.aClass143_20 = Static281.method4704(Static34.aCanvas1);
		Static214.aClass29_1 = Static118.method1788(Static34.aCanvas1);
		if (Static242.aClass59_3 != null) {
			Static242.aClass59_3.method1022(Static34.aCanvas1);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BC)C")
	public static char method2815(@OriginalArg(1) char arg0) {
		return arg0 == 'µ' || arg0 == 'ƒ' ? arg0 : Character.toTitleCase(arg0);
	}
}
