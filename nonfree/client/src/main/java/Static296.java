import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static296 {

	@OriginalMember(owner = "client!lfa", name = "f", descriptor = "[I")
	public static final int[] anIntArray421 = new int[8];

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(IIII)I")
	public static int method4850(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((Static356.aByteArrayArrayArray17[arg1][arg2][arg0] & 0x8) == 0) {
			return arg1 <= 0 || (Static356.aByteArrayArrayArray17[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}
}
