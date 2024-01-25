import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static274 {

	@OriginalMember(owner = "client!rk", name = "m", descriptor = "I")
	public static int anInt5408;

	@OriginalMember(owner = "client!rk", name = "s", descriptor = "Z")
	public static boolean aBoolean403 = false;

	@OriginalMember(owner = "client!rk", name = "t", descriptor = "[I")
	public static final int[] anIntArray693 = new int[5];

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public static void method4567(@OriginalArg(0) Component arg0) {
		arg0.addMouseListener(Static263.aClass202_1);
		arg0.addMouseMotionListener(Static263.aClass202_1);
		arg0.addFocusListener(Static263.aClass202_1);
	}
}
