import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static12 {

	@OriginalMember(owner = "client!af", name = "b", descriptor = "I")
	public static int anInt263;

	@OriginalMember(owner = "client!af", name = "g", descriptor = "Lclient!lh;")
	public static Class58 aClass58_1;

	@OriginalMember(owner = "client!af", name = "c", descriptor = "I")
	public static int anInt264 = 0;

	@OriginalMember(owner = "client!af", name = "d", descriptor = "Lclient!qn;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!af", name = "f", descriptor = "[Lclient!ps;")
	public static final Class2_Sub29[] aClass2_Sub29Array1 = new Class2_Sub29[2048];

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IZI)B")
	public static byte method408(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
