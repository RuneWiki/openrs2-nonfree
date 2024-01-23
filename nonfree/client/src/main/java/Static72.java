import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!he", name = "t", descriptor = "[I")
	public static int[] anIntArray178 = Class79.anIntArray377;

	@OriginalMember(owner = "client!he", name = "E", descriptor = "[I")
	public static int[] anIntArray180 = new int[10000];

	@OriginalMember(owner = "client!he", name = "I", descriptor = "[I")
	public static int[] anIntArray181 = new int[10000];

	@OriginalMember(owner = "client!he", name = "M", descriptor = "I")
	public static int anInt1894 = 0;

	@OriginalMember(owner = "client!he", name = "V", descriptor = "[I")
	public static int[] anIntArray184 = Class79.anIntArray375;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "([[III)I")
	public static int method1313(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!nb;II)Lclient!he;")
	public static Class12_Sub6 method1336(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method387(0, arg1);
		return local5 == null ? null : new Class12_Sub6(local5);
	}
}
