import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static156 {

	@OriginalMember(owner = "client!lh", name = "A", descriptor = "Lclient!g;")
	public static Class58 aClass58_1;

	@OriginalMember(owner = "client!lh", name = "D", descriptor = "I")
	public static int anInt3124;

	@OriginalMember(owner = "client!lh", name = "E", descriptor = "Z")
	public static volatile boolean aBoolean272 = true;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method2692(@OriginalArg(0) Component arg0) {
		arg0.addMouseListener(Static184.aClass13_1);
		arg0.addMouseMotionListener(Static184.aClass13_1);
		arg0.addFocusListener(Static184.aClass13_1);
	}
}
