import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!vi", name = "C", descriptor = "[I")
	public static int[] anIntArray478 = Class68.anIntArray139;

	@OriginalMember(owner = "client!vi", name = "I", descriptor = "[I")
	public static int[] anIntArray480 = Class68.anIntArray137;

	@OriginalMember(owner = "client!vi", name = "O", descriptor = "[I")
	public static int[] anIntArray484 = new int[10000];

	@OriginalMember(owner = "client!vi", name = "W", descriptor = "[I")
	public static int[] anIntArray485 = new int[10000];

	@OriginalMember(owner = "client!vi", name = "gb", descriptor = "I")
	public static int anInt5549 = 0;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!pk;II)Lclient!vi;")
	public static Class36_Sub7 method4202(@OriginalArg(0) Class132 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method3194(arg1, 0);
		return local5 == null ? null : new Class36_Sub7(local5);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "([[III)I")
	public static int method4210(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
