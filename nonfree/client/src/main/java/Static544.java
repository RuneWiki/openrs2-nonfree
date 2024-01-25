import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static544 {

	@OriginalMember(owner = "client!sha", name = "s", descriptor = "[Lclient!nf;")
	public static Class102[] aClass102Array21;

	@OriginalMember(owner = "client!sha", name = "v", descriptor = "D")
	public static double aDouble29;

	@OriginalMember(owner = "client!sha", name = "q", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_179 = new Class126(35, -2);

	@OriginalMember(owner = "client!sha", name = "t", descriptor = "[F")
	public static final float[] aFloatArray65 = new float[4];

	@OriginalMember(owner = "client!sha", name = "u", descriptor = "[I")
	public static final int[] anIntArray579 = new int[200];

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(IIIIIII)I")
	public static int method7532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) int local8 = arg3 & 0x3;
		if ((arg0 & 0x1) == 1) {
			@Pc(15) int local15 = arg4;
			arg4 = arg5;
			arg5 = local15;
		}
		if (local8 == 0) {
			return arg2;
		} else if (local8 == 1) {
			return arg1;
		} else if (local8 == 2) {
			return 1 + 7 - arg4 - arg2;
		} else {
			return 1 + 7 - arg5 - arg1;
		}
	}
}
