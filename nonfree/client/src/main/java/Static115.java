import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static115 {

	@OriginalMember(owner = "client!of", name = "bb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1077 = Static146.method2172("Weiter");

	@OriginalMember(owner = "client!of", name = "lb", descriptor = "Lclient!sg;")
	private static Class77 aClass77_1082 = Static146.method2172("Loading sprites )2 ");

	@OriginalMember(owner = "client!of", name = "cb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1078 = aClass77_1082;

	@OriginalMember(owner = "client!of", name = "gb", descriptor = "Lclient!sg;")
	private static Class77 aClass77_1079 = Static146.method2172("This world is full)3");

	@OriginalMember(owner = "client!of", name = "ib", descriptor = "Lclient!sg;")
	private static Class77 aClass77_1080 = Static146.method2172("Service unavailable)3");

	@OriginalMember(owner = "client!of", name = "jb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1081 = aClass77_1079;

	@OriginalMember(owner = "client!of", name = "mb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1083 = aClass77_1080;

	@OriginalMember(owner = "client!of", name = "h", descriptor = "(I)V")
	public static void method2041() {
		aClass77_1079 = null;
		aClass77_1080 = null;
		aClass77_1082 = null;
		aClass77_1077 = null;
		aClass77_1083 = null;
		aClass77_1081 = null;
		aClass77_1078 = null;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IBI)V")
	public static void method2042(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static124.aClass2_Sub18_Sub1_3.method2398(74);
		Static124.aClass2_Sub18_Sub1_3.method2369(arg0);
		Static124.aClass2_Sub18_Sub1_3.method2357(arg1);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method2043(@OriginalArg(0) Component arg0) {
		arg0.removeKeyListener(Static125.aClass9_1);
		arg0.removeFocusListener(Static125.aClass9_1);
		Static62.anInt1662 = -1;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V")
	public static void method2044() {
		if (Static63.anInt1682 > 0) {
			Static133.method2258();
		} else {
			Static123.method2155(40);
			Static1.aClass29_1 = Static2.aClass29_2;
			Static2.aClass29_2 = null;
		}
	}
}
