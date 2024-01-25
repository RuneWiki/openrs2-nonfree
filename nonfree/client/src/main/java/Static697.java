import java.applet.Applet;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static697 {

	@OriginalMember(owner = "client!vu", name = "w", descriptor = "I")
	public static int anInt10943;

	@OriginalMember(owner = "client!vu", name = "r", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet2;

	@OriginalMember(owner = "client!vu", name = "n", descriptor = "Z")
	public static boolean aBoolean790 = false;

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(Ljava/awt/Component;B)Lclient!jfa;")
	public static Class133 method9140(@OriginalArg(0) Component arg0) {
		return new Class133_Sub1(arg0);
	}
}
