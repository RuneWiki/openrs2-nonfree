import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "Lclient!dn;")
	public static Class69 aClass69_54;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "[Z")
	public static final boolean[] aBooleanArray19 = new boolean[100];

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "[I")
	public static final int[] anIntArray430 = new int[13];

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)I")
	public static int method4831(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local15 *= arg1;
			}
			arg1 *= arg1;
			arg0 >>= 0x1;
		}
		if (arg0 == 1) {
			return arg1 * local15;
		} else {
			return local15;
		}
	}
}
