import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static253 {

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "I")
	public static int anInt4808;

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "Lclient!oga;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!iw", name = "d", descriptor = "Z")
	public static boolean aBoolean361 = true;

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(BLclient!sl;)Lclient!ib;")
	public static Class53_Sub2 method4192(@OriginalArg(1) Class2_Sub17 arg0) {
		return new Class53_Sub2(arg0.method2836(), arg0.method2836(), arg0.method2836(), arg0.method2836(), arg0.method2835(), arg0.method2835(), arg0.method2859());
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(IBI)Z")
	public static boolean method4193(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static57.method1305(arg0, arg1) & Static153.method2686(arg1, arg0);
	}
}
