import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static642 {

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "[I")
	public static int[] anIntArray572;

	@OriginalMember(owner = "client!wr", name = "h", descriptor = "[[B")
	public static byte[][] aByteArrayArray37;

	@OriginalMember(owner = "client!wr", name = "j", descriptor = "I")
	public static int anInt10730;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!sba;II)I")
	public static int method8748(@OriginalArg(0) Class302 arg0, @OriginalArg(2) int arg1) {
		if (!Static75.method2151(arg0).method8490(arg1) && arg0.anObjectArray28 == null) {
			return -1;
		} else if (arg0.anIntArray459 == null || arg0.anIntArray459.length <= arg1) {
			return -1;
		} else {
			return arg0.anIntArray459[arg1];
		}
	}
}
