import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static392 {

	@OriginalMember(owner = "client!tl", name = "A", descriptor = "[Lclient!gh;")
	public static Class89[] aClass89Array2;

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "Lclient!tn;")
	public static final Class240 aClass240_6 = new Class240();

	@OriginalMember(owner = "client!tl", name = "x", descriptor = "[I")
	public static final int[] anIntArray649 = new int[4096];

	@OriginalMember(owner = "client!tl", name = "y", descriptor = "Lclient!s;")
	public static final Class217 aClass217_142 = new Class217(50, 6);

	@OriginalMember(owner = "client!tl", name = "z", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_92 = new Class27(57, 1);

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(III)I")
	public static int method5214(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
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

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)I")
	public static int method5217(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}
}
