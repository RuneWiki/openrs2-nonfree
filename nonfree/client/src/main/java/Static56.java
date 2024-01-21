import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static56 {

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "Lclient!bf;")
	public static Class2_Sub1_Sub2_Sub1 aClass2_Sub1_Sub2_Sub1_5;

	@OriginalMember(owner = "client!ff", name = "h", descriptor = "Lclient!oc;")
	public static Class71_Sub1 aClass71_Sub1_3;

	@OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
	public static int anInt1143;

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "Z")
	public static boolean aBoolean49 = false;

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
	public static int anInt1141 = 0;

	@OriginalMember(owner = "client!ff", name = "i", descriptor = "[I")
	public static final int[] anIntArray89 = new int[50];

	@OriginalMember(owner = "client!ff", name = "j", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_391 = Static151.method2243("null");

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	public static void method791(@OriginalArg(0) Component arg0) {
		arg0.addMouseListener(Static63.aClass12_1);
		arg0.addMouseMotionListener(Static63.aClass12_1);
		arg0.addFocusListener(Static63.aClass12_1);
	}
}
