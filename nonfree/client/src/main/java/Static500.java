import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static500 {

	@OriginalMember(owner = "client!tba", name = "c", descriptor = "I")
	public static int anInt6882;

	@OriginalMember(owner = "client!tba", name = "l", descriptor = "I")
	public static int anInt6889;

	@OriginalMember(owner = "client!tba", name = "d", descriptor = "[I")
	public static final int[] anIntArray473 = new int[32];

	@OriginalMember(owner = "client!tba", name = "k", descriptor = "I")
	public static int anInt6888 = 104;

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(III)I")
	public static int method5654(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local7 *= arg0;
			}
			arg1 >>= 0x1;
			arg0 *= arg0;
		}
		if (arg1 == 1) {
			return local7 * arg0;
		} else {
			return local7;
		}
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(BII)Z")
	public static boolean method5655(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static95.method1800(arg0, arg1) & Static374.method5446(arg0, arg1);
	}
}
