import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static228 {

	@OriginalMember(owner = "client!qj", name = "H", descriptor = "I")
	public static int anInt709;

	@OriginalMember(owner = "client!qj", name = "L", descriptor = "Z")
	private static boolean aBoolean56;

	@OriginalMember(owner = "client!qj", name = "M", descriptor = "Z")
	private static boolean aBoolean57;

	@OriginalMember(owner = "client!qj", name = "F", descriptor = "Lclient!th;")
	public static Class169 aClass169_25 = new Class169(128);

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method621(@OriginalArg(1) Component arg0) {
		arg0.addMouseListener(Static268.aClass2_5);
		arg0.addMouseMotionListener(Static268.aClass2_5);
		arg0.addFocusListener(Static268.aClass2_5);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(BLclient!sb;)Lclient!wn;")
	public static Class12_Sub4 method624(@OriginalArg(1) Class1_Sub14 arg0) {
		return new Class12_Sub4(arg0.method2623(), arg0.method2623(), arg0.method2623(), arg0.method2623(), arg0.method2588(), arg0.method2588(), arg0.method2595());
	}
}
