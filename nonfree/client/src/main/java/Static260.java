import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static260 {

	@OriginalMember(owner = "client!it", name = "z", descriptor = "[B")
	public static byte[] aByteArray44;

	@OriginalMember(owner = "client!it", name = "x", descriptor = "[[B")
	public static final byte[][] aByteArrayArray18 = new byte[250][];

	@OriginalMember(owner = "client!it", name = "y", descriptor = "I")
	public static int anInt4398 = 0;

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(II)I")
	public static int method4008(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static62.aByteArrayArray5 == null ? 0 : Static62.aByteArrayArray5[arg0][arg1] & 0xFF;
	}
}
