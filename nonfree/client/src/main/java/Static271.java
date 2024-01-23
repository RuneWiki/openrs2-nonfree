import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!ud", name = "y", descriptor = "[I")
	public static int[] anIntArray425 = Class174.anIntArray444;

	@OriginalMember(owner = "client!ud", name = "P", descriptor = "[I")
	public static int[] anIntArray427 = new int[10000];

	@OriginalMember(owner = "client!ud", name = "U", descriptor = "[I")
	public static int[] anIntArray429 = Class174.anIntArray443;

	@OriginalMember(owner = "client!ud", name = "bb", descriptor = "[I")
	public static int[] anIntArray431 = new int[10000];

	@OriginalMember(owner = "client!ud", name = "ib", descriptor = "I")
	public static int anInt5393 = 0;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "([[III)I")
	public static int method4280(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!cg;II)Lclient!ud;")
	public static Class13_Sub7 method4293(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method665(arg1, 0);
		return local5 == null ? null : new Class13_Sub7(local5);
	}
}
