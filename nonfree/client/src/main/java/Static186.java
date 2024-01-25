import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static186 {

	@OriginalMember(owner = "client!gia", name = "n", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray5;

	@OriginalMember(owner = "client!gia", name = "w", descriptor = "J")
	public static long aLong141;

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(II)I")
	public static int method4310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static136.aByteArrayArray32 == null ? 0 : Static136.aByteArrayArray32[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!gia", name = "f", descriptor = "(I)V")
	public static void method4312() {
		Static626.method8386();
		Static48.method803();
	}
}
