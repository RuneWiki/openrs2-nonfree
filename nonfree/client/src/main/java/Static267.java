import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!tc", name = "n", descriptor = "[I")
	public static int[] anIntArray498 = Class1.anIntArray4;

	@OriginalMember(owner = "client!tc", name = "u", descriptor = "[I")
	public static int[] anIntArray499 = Class1.anIntArray3;

	@OriginalMember(owner = "client!tc", name = "N", descriptor = "I")
	public static int anInt5222 = 0;

	@OriginalMember(owner = "client!tc", name = "W", descriptor = "[I")
	public static int[] anIntArray502 = new int[10000];

	@OriginalMember(owner = "client!tc", name = "hb", descriptor = "[I")
	public static int[] anIntArray506 = new int[10000];

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!ek;II)Lclient!tc;")
	public static Class15_Sub7 method4203(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method1256(arg1, 0);
		return local5 == null ? null : new Class15_Sub7(local5);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "([[III)I")
	public static int method4207(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
