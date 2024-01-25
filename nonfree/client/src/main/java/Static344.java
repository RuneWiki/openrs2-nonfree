import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static344 {

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "[I")
	public static final int[] anIntArray710 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "[B")
	public static final byte[] aByteArray96 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
	public static int anInt6236 = 0;

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "Z")
	public static boolean aBoolean415 = false;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!ec;I)Ljava/lang/String;")
	public static String method5644(@OriginalArg(0) Class6_Sub10 arg0) {
		return Static316.method5305(arg0);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method5646(@OriginalArg(0) String arg0) {
		return Static23.method352(10, arg0);
	}
}
