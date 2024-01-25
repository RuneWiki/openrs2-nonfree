import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!bga", name = "ub", descriptor = "[I")
	public static final int[] anIntArray76 = new int[2048];

	@OriginalMember(owner = "client!bga", name = "vb", descriptor = "[[B")
	public static final byte[][] aByteArrayArray2 = new byte[1000][];

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(FFBF)I")
	public static int method1079(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		@Pc(12) float local12 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(26) float local26 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(35) float local35 = arg2 < 0.0F ? -arg2 : arg2;
		if (local12 < local26 && local35 < local26) {
			return arg0 > 0.0F ? 0 : 1;
		} else if (local35 > local12 && local26 < local35) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg1 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}
}
