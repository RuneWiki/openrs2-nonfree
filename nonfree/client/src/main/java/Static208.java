import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!pn", name = "y", descriptor = "[I")
	public static int[] anIntArray362 = new int[10000];

	@OriginalMember(owner = "client!pn", name = "H", descriptor = "[I")
	public static int[] anIntArray364 = Class131.anIntArray355;

	@OriginalMember(owner = "client!pn", name = "M", descriptor = "I")
	public static int anInt4093 = 0;

	@OriginalMember(owner = "client!pn", name = "P", descriptor = "[I")
	public static int[] anIntArray366 = Class131.anIntArray353;

	@OriginalMember(owner = "client!pn", name = "bb", descriptor = "[I")
	public static int[] anIntArray370 = new int[10000];

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lclient!lc;II)Lclient!pn;")
	public static Class12_Sub7 method3332(@OriginalArg(0) Class98 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method2396(0, arg1);
		return local5 == null ? null : new Class12_Sub7(local5);
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "([[III)I")
	public static int method3337(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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

	@OriginalMember(owner = "client!pn", name = "k", descriptor = "()V")
	public static void method3342() {
		anIntArray362 = null;
		anIntArray370 = null;
		anIntArray364 = null;
		anIntArray366 = null;
	}
}
