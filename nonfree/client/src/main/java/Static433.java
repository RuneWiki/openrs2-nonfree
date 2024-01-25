import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static433 {

	@OriginalMember(owner = "client!qr", name = "c", descriptor = "I")
	public static int anInt4793;

	@OriginalMember(owner = "client!qr", name = "e", descriptor = "Lclient!gh;")
	public static Class117 aClass117_2;

	@OriginalMember(owner = "client!qr", name = "f", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet2;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray15 = new String[100];

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(III)B")
	public static byte method3810(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(III)Z")
	public static boolean method3811(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x100) != 0;
	}
}
