import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!tk", name = "k", descriptor = "[I")
	public static int[] anIntArray476 = Class17.anIntArray24;

	@OriginalMember(owner = "client!tk", name = "t", descriptor = "[I")
	public static int[] anIntArray477 = new int[10000];

	@OriginalMember(owner = "client!tk", name = "y", descriptor = "I")
	public static int anInt5256 = 0;

	@OriginalMember(owner = "client!tk", name = "I", descriptor = "[I")
	public static int[] anIntArray479 = new int[10000];

	@OriginalMember(owner = "client!tk", name = "P", descriptor = "[I")
	public static int[] anIntArray481 = Class17.anIntArray22;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lclient!ph;II)Lclient!tk;")
	public static Class22_Sub7 method4085(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method3346(arg1, 0);
		return local5 == null ? null : new Class22_Sub7(local5);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "([[III)I")
	public static int method4104(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
}
