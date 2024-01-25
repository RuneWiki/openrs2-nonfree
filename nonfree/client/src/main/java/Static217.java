import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static217 {

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "Lclient!mg;")
	public static Class160 aClass160_40;

	@OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
	public static int anInt4191;

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString44 = "";

	@OriginalMember(owner = "client!ld", name = "l", descriptor = "[I")
	public static int[] anIntArray358 = new int[2];

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IB)I")
	public static int method3402(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(Z)V")
	public static void method3408() {
		Static334.aClass226_1.method4983();
		Static109.aClass1_2.method711();
		if (Static96.aClass39_1 != null) {
			Static96.aClass39_1.method3514(Static339.aCanvas7);
		}
		Static148.aClient1.method756();
		Static339.aCanvas7.setBackground(Color.black);
		Static223.anInt4335 = -1;
		Static334.aClass226_1 = Static311.method4389(Static339.aCanvas7);
		Static109.aClass1_2 = Static52.method883(Static339.aCanvas7);
		if (Static96.aClass39_1 != null) {
			Static96.aClass39_1.method3512(Static339.aCanvas7);
		}
	}
}
