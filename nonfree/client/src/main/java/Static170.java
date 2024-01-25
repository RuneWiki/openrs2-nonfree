import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static170 {

	@OriginalMember(owner = "client!gm", name = "h", descriptor = "Lclient!td;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!gm", name = "m", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_27 = new Class70(57, 4);

	@OriginalMember(owner = "client!gm", name = "n", descriptor = "I")
	public static final int anInt3016 = 1401;

	@OriginalMember(owner = "client!gm", name = "o", descriptor = "I")
	public static int anInt3017 = 0;

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(II)V")
	public static void method2425(@OriginalArg(0) int arg0) {
		if (Static38.anIntArray77 == null || Static38.anIntArray77.length < arg0) {
			Static38.anIntArray77 = new int[arg0];
		}
	}
}
