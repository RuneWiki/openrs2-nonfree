import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!gv", name = "q", descriptor = "[I")
	public static int[] anIntArray306;

	@OriginalMember(owner = "client!gv", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString34 = null;

	@OriginalMember(owner = "client!gv", name = "p", descriptor = "[I")
	public static final int[] anIntArray305 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(III)I")
	public static int method3092(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(41) int local41 = Static129.method1977(4, arg1 + 91923, arg0 + 45365) + (Static129.method1977(2, arg1 + 37821, arg0 + 10294) - 128 >> 1) + (Static129.method1977(1, arg1, arg0) + -128 >> 2) - 128;
		local41 = (int) ((double) local41 * 0.3D) + 35;
		if (local41 < 10) {
			local41 = 10;
		} else if (local41 > 60) {
			local41 = 60;
		}
		return local41;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(I[BIIIII)Z")
	public static boolean method3093(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		@Pc(14) int local14 = arg1 % 8;
		@Pc(18) int local18;
		if (local14 == 0) {
			local18 = 0;
		} else {
			local18 = 8 - local14;
		}
		@Pc(33) int local33 = -((arg4 + 7) / 8);
		@Pc(42) int local42 = -((arg1 + 8 - 1) / 8);
		for (@Pc(44) int local44 = local33; local44 < 0; local44++) {
			for (@Pc(48) int local48 = local42; local48 < 0; local48++) {
				if (arg0[arg3] == 0) {
					return true;
				}
				arg3 += 8;
			}
			arg3 -= local18;
			if (arg0[arg3 - 1] == 0) {
				return true;
			}
			arg3 += arg2;
		}
		return false;
	}
}
