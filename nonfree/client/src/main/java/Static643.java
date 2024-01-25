import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static643 {

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "([SII)[S")
	public static short[] method9229(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(14) short[] local14 = new short[arg1];
		Static653.method7722(arg0, 0, local14, 0, arg1);
		return local14;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIII)I")
	public static int method9230(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg0 & 0x3;
		if (local12 == 0) {
			return arg1;
		} else if (local12 == 1) {
			return 4095 - arg2;
		} else if (local12 == 2) {
			return 4095 - arg1;
		} else {
			return arg2;
		}
	}
}
