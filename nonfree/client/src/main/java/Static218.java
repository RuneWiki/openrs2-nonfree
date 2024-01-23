import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!vj", name = "w", descriptor = "[I")
	public static int[] anIntArray755 = Class77.anIntArray632;

	@OriginalMember(owner = "client!vj", name = "D", descriptor = "[I")
	public static int[] anIntArray757 = new int[10000];

	@OriginalMember(owner = "client!vj", name = "J", descriptor = "[I")
	public static int[] anIntArray759 = Class77.anIntArray631;

	@OriginalMember(owner = "client!vj", name = "M", descriptor = "I")
	public static int anInt4745 = 0;

	@OriginalMember(owner = "client!vj", name = "kb", descriptor = "[I")
	public static int[] anIntArray766 = new int[10000];

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "([[III)I")
	public static int method3784(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg1 >> 7;
		@Pc(7) int local7 = arg2 >> 7;
		if (local3 < 0 || local7 < 0 || local3 >= arg0.length || local7 >= arg0[0].length) {
			return 0;
		}
		@Pc(27) int local27 = arg1 & 0x7F;
		@Pc(31) int local31 = arg2 & 0x7F;
		@Pc(53) int local53 = arg0[local3][local7] * (128 - local27) + arg0[local3 + 1][local7] * local27 >> 7;
		@Pc(79) int local79 = arg0[local3][local7 + 1] * (128 - local27) + arg0[local3 + 1][local7 + 1] * local27 >> 7;
		return local53 * (128 - local31) + local79 * local31 >> 7;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!oe;II)Lclient!vj;")
	public static Class5_Sub7 method3807(@OriginalArg(0) Class72 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method3197(0, arg1);
		return local5 == null ? null : new Class5_Sub7(local5);
	}
}
