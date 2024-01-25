import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static216 {

	@OriginalMember(owner = "client!kr", name = "k", descriptor = "[Lclient!qg;")
	public static final Class193_Sub1[] aClass193_Sub1Array2 = new Class193_Sub1[30];

	@OriginalMember(owner = "client!kr", name = "l", descriptor = "I")
	public static int anInt4045 = 0;

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)V")
	public static void method3072() {
		Static23.aClass14_1.method1514();
		Static284.aClass12_1.method4212();
		if (Static141.aClass44_1 != null) {
			Static141.aClass44_1.method3472(Static248.aCanvas5);
		}
		Static102.aClient1.method1103();
		Static248.aCanvas5.setBackground(Color.black);
		Static446.anInt7427 = -1;
		Static23.aClass14_1 = Static108.method1682(Static248.aCanvas5);
		Static284.aClass12_1 = Static34.method631(Static248.aCanvas5);
		if (Static141.aClass44_1 != null) {
			Static141.aClass44_1.method3469(Static248.aCanvas5);
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIIILclient!ns;Z)V")
	public static void method3074(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class166 arg2) {
		Static386.anInt6719 = 10000;
		Static449.anInt7510 = arg1;
		Static164.aBoolean219 = false;
		Static324.aClass166_264 = arg2;
		Static231.anInt4228 = 0;
		Static142.anInt2689 = 1;
		Static325.anInt5778 = arg0;
	}
}
