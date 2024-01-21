import java.awt.FontMetrics;
import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!we", name = "b", descriptor = "I")
	public static int anInt4714;

	@OriginalMember(owner = "client!we", name = "e", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!we", name = "g", descriptor = "I")
	public static int anInt4717;

	@OriginalMember(owner = "client!we", name = "l", descriptor = "Lclient!gh;")
	public static Class25 aClass25_12;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "Lclient!rc;")
	public static Class66 aClass66_27 = new Class66(64);

	@OriginalMember(owner = "client!we", name = "c", descriptor = "Lclient!ea;")
	private static Class18 aClass18_1221 = Static8.method128("wishes to trade with you)3");

	@OriginalMember(owner = "client!we", name = "f", descriptor = "I")
	public static int anInt4716 = 0;

	@OriginalMember(owner = "client!we", name = "h", descriptor = "Lclient!ea;")
	private static Class18 aClass18_1222 = Static8.method128("Free world");

	@OriginalMember(owner = "client!we", name = "i", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1223 = aClass18_1222;

	@OriginalMember(owner = "client!we", name = "j", descriptor = "I")
	public static final int anInt4718 = 7759444;

	@OriginalMember(owner = "client!we", name = "n", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1224 = aClass18_1221;

	@OriginalMember(owner = "client!we", name = "o", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1225 = Static8.method128("auf der Hautpseite)3");

	@OriginalMember(owner = "client!we", name = "p", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1226 = Static8.method128(" )2> <col=ff9040>");

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(II)Z")
	public static boolean method3180(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(16) int local16 = Static114.anIntArray288[arg0];
		if (local16 >= 2000) {
			local16 -= 2000;
		}
		return local16 == 1006;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Z[BB)Ljava/lang/Object;")
	public static Object method3181(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static92.aBoolean116) {
			try {
				@Pc(25) Class34 local25 = (Class34) Class.forName("Class34_Sub1").getDeclaredConstructor().newInstance();
				local25.method1505(arg0);
				return local25;
			} catch (@Pc(32) Throwable local32) {
				Static92.aBoolean116 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(BLjava/lang/Object;Lclient!od;)V")
	public static void method3182(@OriginalArg(1) Object arg0, @OriginalArg(2) Class53 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < 50 && arg1.anEventQueue1.peekEvent() != null; local16++) {
			Static114.method2304(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)V")
	public static void method3183() {
		aClass18_1224 = null;
		aClass18_1223 = null;
		aClass25_12 = null;
		aClass18_1222 = null;
		aClass18_1221 = null;
		aFontMetrics1 = null;
		aClass18_1225 = null;
		aClass18_1226 = null;
		aClass66_27 = null;
	}
}
