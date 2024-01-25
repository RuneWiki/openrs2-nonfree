import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static418 {

	@OriginalMember(owner = "client!rf", name = "g", descriptor = "F")
	public static float aFloat234;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
	public static int anInt7807 = -1;

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
	public static int anInt7809 = 0;

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "[B")
	public static final byte[] aByteArray90 = new byte[520];

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!qf;II)I")
	public static int method6466(@OriginalArg(0) Class245 arg0, @OriginalArg(2) int arg1) {
		if (!Static63.method1295(arg0).method1759(arg1) && arg0.anObjectArray24 == null) {
			return -1;
		} else if (arg0.anIntArray640 == null || arg1 >= arg0.anIntArray640.length) {
			return -1;
		} else {
			return arg0.anIntArray640[arg1];
		}
	}
}
