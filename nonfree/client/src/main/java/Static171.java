import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static171 {

	@OriginalMember(owner = "client!ne", name = "o", descriptor = "Lclient!pk;")
	public static Class132 aClass132_60;

	@OriginalMember(owner = "client!ne", name = "r", descriptor = "[I")
	public static int[] anIntArray258;

	@OriginalMember(owner = "client!ne", name = "s", descriptor = "I")
	public static int anInt3423;

	@OriginalMember(owner = "client!ne", name = "p", descriptor = "[I")
	public static int[] anIntArray257 = new int[1000];

	@OriginalMember(owner = "client!ne", name = "u", descriptor = "[I")
	public static int[] anIntArray259 = new int[2048];

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method2675(@OriginalArg(1) Component arg0) {
		arg0.removeMouseListener(Static89.aClass82_1);
		arg0.removeMouseMotionListener(Static89.aClass82_1);
		arg0.removeFocusListener(Static89.aClass82_1);
		Static27.anInt669 = 0;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)V")
	public static void method2677() {
		Static138.aClass61_21.method1379();
		Static114.aClass61_19.method1379();
	}
}
