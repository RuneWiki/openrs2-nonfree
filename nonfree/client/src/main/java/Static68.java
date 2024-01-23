import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static68 {

	@OriginalMember(owner = "client!fa", name = "r", descriptor = "Lclient!km;")
	public static Class91 aClass91_56;

	@OriginalMember(owner = "client!fa", name = "A", descriptor = "I")
	public static int anInt1455;

	@OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
	public static int anInt1450 = 0;

	@OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
	public static int anInt1451 = 100;

	@OriginalMember(owner = "client!fa", name = "w", descriptor = "Z")
	public static boolean aBoolean105 = false;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method1246(@OriginalArg(1) Component arg0) {
		arg0.removeKeyListener(Static57.aClass94_1);
		arg0.removeFocusListener(Static57.aClass94_1);
		Static141.anInt3035 = -1;
	}
}
