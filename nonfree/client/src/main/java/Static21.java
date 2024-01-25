import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static21 {

	@OriginalMember(owner = "client!av", name = "d", descriptor = "S")
	public static short aShort2 = 32767;

	@OriginalMember(owner = "client!av", name = "e", descriptor = "[I")
	public static final int[] anIntArray20 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!av", name = "h", descriptor = "[I")
	public static final int[] anIntArray21 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IBII)I")
	public static int method297(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static4.aByteArrayArrayArray1[arg2][arg1][arg0] & 0x8) == 0) {
			return arg2 <= 0 || (Static4.aByteArrayArrayArray1[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}
}
