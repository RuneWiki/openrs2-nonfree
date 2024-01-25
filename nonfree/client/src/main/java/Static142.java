import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "[I")
	public static final int[] anIntArray175 = new int[14];

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(I[S)[S")
	public static short[] method2161(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) short[] local11 = new short[arg0.length];
			Static653.method5394(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(III)Z")
	public static boolean method2163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(22) boolean local22 = (arg0 & 0x37) == 0 ? Static279.method3860(arg0, arg1) : Static412.method5531(arg1, arg0);
		return local22 | Static256.method3530(arg1, arg0) | (arg1 & 0x10000) != 0;
	}
}
