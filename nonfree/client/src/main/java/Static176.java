import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!ml", name = "p", descriptor = "[I")
	public static int[] anIntArray321 = Class111.anIntArray298;

	@OriginalMember(owner = "client!ml", name = "u", descriptor = "[I")
	public static int[] anIntArray322 = Class111.anIntArray299;

	@OriginalMember(owner = "client!ml", name = "y", descriptor = "I")
	public static int anInt3354 = 0;

	@OriginalMember(owner = "client!ml", name = "S", descriptor = "[I")
	public static int[] anIntArray327 = new int[10000];

	@OriginalMember(owner = "client!ml", name = "T", descriptor = "[I")
	public static int[] anIntArray328 = new int[10000];

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!fh;II)Lclient!ml;")
	public static Class53_Sub3 method2765(@OriginalArg(0) Class58 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method1372(arg1, 0);
		return local5 == null ? null : new Class53_Sub3(local5);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "([[III)I")
	public static int method2775(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
