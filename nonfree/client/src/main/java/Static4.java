import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "Lclient!id;")
	private static Class34 aClass34_126 = Static9.method266("To create a new account you need to");

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "Lclient!id;")
	public static Class34 aClass34_125 = aClass34_126;

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
	public static int anInt280 = 2;

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "[Lclient!hd;")
	public static Class1_Sub1_Sub1_Sub1_Sub2[] aClass1_Sub1_Sub1_Sub1_Sub2Array1 = new Class1_Sub1_Sub1_Sub1_Sub2[32768];

	@OriginalMember(owner = "client!ad", name = "h", descriptor = "[Lclient!df;")
	public static Class17[] aClass17Array1 = new Class17[16];

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
	public static void method107() {
		@Pc(10) int local10 = (Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1405 >> 7) + Static121.anInt2871;
		Static97.anInt2495 = 0;
		@Pc(20) int local20 = (Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1428 >> 7) + Static37.anInt1098;
		if (local20 >= 3053 && local20 <= 3156 && local10 >= 3056 && local10 <= 3136) {
			Static97.anInt2495 = 1;
		}
		if (local20 >= 3072 && local20 <= 3118 && local10 >= 9492 && local10 <= 9535) {
			Static97.anInt2495 = 1;
		}
		if (Static97.anInt2495 == 1 && local20 >= 3139 && local20 <= 3199 && local10 >= 3008 && local10 <= 3062) {
			Static97.anInt2495 = 0;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
	public static void method108() {
		aClass17Array1 = null;
		aClass34_125 = null;
		aClass1_Sub1_Sub1_Sub1_Sub2Array1 = null;
		aClass34_126 = null;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method109(@OriginalArg(1) Component arg0) {
		arg0.removeKeyListener(Static114.aClass76_1);
		arg0.removeFocusListener(Static114.aClass76_1);
		Static47.anInt1348 = -1;
	}
}
