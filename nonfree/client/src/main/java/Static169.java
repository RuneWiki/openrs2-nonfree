import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static169 {

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
	public static int anInt3796;

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
	public static int anInt3799 = -1;

	@OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
	public static int anInt3803 = 500;

	@OriginalMember(owner = "client!mg", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString239 = "You can't add yourself to your own ignore list.";

	@OriginalMember(owner = "client!mg", name = "l", descriptor = "Lclient!ta;")
	public static Class162 aClass162_7 = new Class162(64);

	@OriginalMember(owner = "client!mg", name = "m", descriptor = "I")
	public static int anInt3805 = 0;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method2750(@OriginalArg(1) Component arg0) {
		arg0.addMouseListener(Static253.aClass185_1);
		arg0.addMouseMotionListener(Static253.aClass185_1);
		arg0.addFocusListener(Static253.aClass185_1);
	}
}
