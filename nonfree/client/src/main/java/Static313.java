import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static313 {

	@OriginalMember(owner = "client!ki", name = "v", descriptor = "[I")
	public static final int[] anIntArray315 = new int[4096];

	@OriginalMember(owner = "client!ki", name = "p", descriptor = "[B")
	public static final byte[] aByteArray52 = new byte[2048];

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IB)J")
	public static long method4965(@OriginalArg(0) int arg0) {
		return (long) (arg0 + 11745) * 86400000L;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)Z")
	public static boolean method4966(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static26.method333(arg0, arg1) & ((arg0 & 0x2000) != 0 | Static70.method927(arg1, arg0) | Static516.method7468(arg1, arg0));
	}
}
