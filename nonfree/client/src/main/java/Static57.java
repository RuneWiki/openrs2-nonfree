import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static57 {

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "[[B")
	public static byte[][] aByteArrayArray14;

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "[Z")
	public static final boolean[] aBooleanArray108 = new boolean[5];

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "(II)I")
	public static int method4060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static354.aByteArrayArray20 == null ? 0 : Static354.aByteArrayArray20[arg0][arg1] & 0xFF;
	}
}
