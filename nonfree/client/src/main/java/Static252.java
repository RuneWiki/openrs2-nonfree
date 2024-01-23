import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!tf", name = "x", descriptor = "[I")
	public static int[] anIntArray451 = Class66.anIntArray148;

	@OriginalMember(owner = "client!tf", name = "E", descriptor = "I")
	public static int anInt5034 = 0;

	@OriginalMember(owner = "client!tf", name = "F", descriptor = "[I")
	public static int[] anIntArray453 = Class66.anIntArray153;

	@OriginalMember(owner = "client!tf", name = "L", descriptor = "[I")
	public static int[] anIntArray456 = new int[10000];

	@OriginalMember(owner = "client!tf", name = "fb", descriptor = "[I")
	public static int[] anIntArray460 = new int[10000];

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!jd;II)Lclient!tf;")
	public static Class36_Sub6 method4038(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method2127(0, arg1);
		return local5 == null ? null : new Class36_Sub6(local5);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "([[III)I")
	public static int method4059(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
