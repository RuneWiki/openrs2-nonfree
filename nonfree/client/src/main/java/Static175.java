import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static175 {

	@OriginalMember(owner = "client!fw", name = "k", descriptor = "Z")
	public static boolean aBoolean230;

	@OriginalMember(owner = "client!fw", name = "o", descriptor = "[B")
	public static final byte[] aByteArray38 = new byte[2048];

	@OriginalMember(owner = "client!fw", name = "t", descriptor = "[I")
	public static final int[] anIntArray226 = new int[6];

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(II)I")
	public static int method2864(@OriginalArg(1) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}
}
