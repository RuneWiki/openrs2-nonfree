import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!pk", name = "ub", descriptor = "Z")
	public static boolean aBoolean360;

	@OriginalMember(owner = "client!pk", name = "Jb", descriptor = "I")
	public static int anInt5497;

	@OriginalMember(owner = "client!pk", name = "R", descriptor = "[I")
	public static final int[] anIntArray429 = new int[14];

	@OriginalMember(owner = "client!pk", name = "Bb", descriptor = "[I")
	public static final int[] anIntArray431 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)I")
	public static int method4376(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(III)Z")
	public static boolean method4387(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 | Static397.method5408(arg1, arg0) || Static161.method2443(arg1, arg0);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IBI)I")
	public static int method4392(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local7 *= arg0;
			}
			arg1 >>= 0x1;
			arg0 *= arg0;
		}
		if (arg1 == 1) {
			return arg0 * local7;
		} else {
			return local7;
		}
	}
}
