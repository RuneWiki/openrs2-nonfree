import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static37 {

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
	public static int anInt936;

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "[I")
	public static int[] anIntArray60;

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
	public static int anInt939;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IB[B)I")
	public static int method929(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static44.method1078(arg0, 0, arg1);
	}
}
