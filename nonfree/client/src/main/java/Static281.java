import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!jk", name = "e", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_94 = new Class44(53, 7);

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "([[S[[FZ)[[S")
	public static short[][] method4057(@OriginalArg(0) short[][] arg0, @OriginalArg(1) float[][] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			for (@Pc(7) int local7 = 0; local7 < arg0[local3].length; local7++) {
				arg0[local3][local7] = (short) (int) (arg1[local3][local7] * 16383.0F);
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(III)I")
	public static int method4058(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
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
}
