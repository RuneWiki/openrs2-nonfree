import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static187 {

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "[Lclient!gi;")
	public static Class38[] aClass38Array1;

	@OriginalMember(owner = "client!tg", name = "g", descriptor = "[S")
	public static short[] aShortArray135;

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
	public static int anInt3891 = 0;

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "Lclient!bg;")
	public static Class13 aClass13_16 = new Class13();

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "[I")
	public static final int[] anIntArray355 = new int[2048];

	@OriginalMember(owner = "client!tg", name = "h", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_1365 = Static151.method2243("Could not complete login)3");

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1364 = aClass62_1365;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method2683(@OriginalArg(0) Component arg0) {
		arg0.removeKeyListener(Static51.aClass37_1);
		arg0.removeFocusListener(Static51.aClass37_1);
		Static192.anInt3974 = -1;
	}
}
