import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static290 {

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "[I")
	public static final int[] anIntArray414 = new int[1];

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIB)Z")
	public static boolean method4774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLclient!vj;)I")
	public static int method4775(@OriginalArg(1) Class333 arg0) {
		if (arg0 == Static396.aClass333_12) {
			return 6407;
		} else if (Static487.aClass333_15 == arg0) {
			return 6408;
		} else if (arg0 == Static451.aClass333_14) {
			return 6406;
		} else if (Static26.aClass333_2 == arg0) {
			return 6409;
		} else if (arg0 == Static459.aClass333_7) {
			return 6410;
		} else if (Static18.aClass333_1 == arg0) {
			return 6145;
		} else {
			throw new IllegalStateException();
		}
	}
}
