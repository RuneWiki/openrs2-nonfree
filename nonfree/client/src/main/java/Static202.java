import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "I")
	public static int anInt3721 = 2;

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "Lclient!ib;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!ls", name = "m", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)V")
	public static void method3430() {
		Static285.anInt4946 = 0;
		Static195.aClass30_28.method692();
		Static269.aBoolean349 = false;
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(B)Z")
	public static boolean method3433() {
		if (Static217.aBoolean297) {
			try {
				if ((Boolean) Static403.method4138("showingVideoAd", Static359.aClass111_5.anApplet1)) {
					return false;
				}
				return true;
			} catch (@Pc(18) Throwable local18) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method3436(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static121.anInt2600; local11++) {
			if (arg0.equalsIgnoreCase(Static174.aStringArray82[local11])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static206.aClass1_Sub5_Sub1_Sub1_1.aString24);
	}
}
