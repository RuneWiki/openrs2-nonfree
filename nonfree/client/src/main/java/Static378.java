import java.awt.Color;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static378 {

	@OriginalMember(owner = "client!sn", name = "l", descriptor = "I")
	public static int anInt6253;

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "[I")
	public static final int[] anIntArray435 = new int[1];

	@OriginalMember(owner = "client!sn", name = "f", descriptor = "[S")
	public static short[] aShortArray101 = new short[256];

	@OriginalMember(owner = "client!sn", name = "m", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_103 = new Class194(27, 2);

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V")
	public static void method4939() {
		if (!Static113.method1560()) {
			return;
		}
		if (Static286.aStringArray33 == null) {
			Static301.method3744();
		}
		Static241.anInt3924 = 0;
		Static430.aBoolean482 = true;
		try {
			Static412.aClipboard1 = Static440.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(20) Exception local20) {
		}
	}

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "(I)V")
	public static void method4942() {
		Static188.aClass80_1.method1726();
		Static290.aClass66_1.method5971();
		Static440.aClient1.method873();
		Static246.aCanvas2.setBackground(Color.black);
		Static203.anInt3350 = -1;
		Static188.aClass80_1 = Static127.method1777(Static246.aCanvas2);
		Static290.aClass66_1 = Static194.method2595(Static246.aCanvas2);
	}
}
