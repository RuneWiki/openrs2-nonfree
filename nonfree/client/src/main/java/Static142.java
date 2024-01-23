import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static142 {

	@OriginalMember(owner = "client!jm", name = "E", descriptor = "[Lclient!bn;")
	public static Class2_Sub8_Sub1[] aClass2_Sub8_Sub1Array6;

	@OriginalMember(owner = "client!jm", name = "F", descriptor = "Z")
	public static boolean aBoolean218 = false;

	@OriginalMember(owner = "client!jm", name = "G", descriptor = "Ljava/lang/String;")
	public static String aString110 = "slide:";

	@OriginalMember(owner = "client!jm", name = "H", descriptor = "I")
	public static int anInt3132 = 0;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public static void method2540(@OriginalArg(0) Component arg0) {
		arg0.removeKeyListener(Static88.aClass142_1);
		arg0.removeFocusListener(Static88.aClass142_1);
		Static92.anInt2206 = -1;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!ek;I)V")
	public static void method2541(@OriginalArg(0) Class42 arg0) {
		Static105.aClass42_15 = arg0;
		Static247.anInt1735 = Static105.aClass42_15.method1269(4);
	}
}
