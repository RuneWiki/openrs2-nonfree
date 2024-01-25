import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!le", name = "i", descriptor = "Lclient!ln;")
	public static Class157 aClass157_3;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IBIII)I")
	public static int method3477(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) int local16 = 65536 - Class90_Sub1.anIntArray303[arg1 * 8192 / arg0] >> 1;
		return ((65536 - local16) * arg3 >> 16) + (local16 * arg2 >> 16);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(II[III)V")
	public static void method3480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		arg0--;
		@Pc(15) int local15 = arg3 - 1;
		@Pc(18) int local18 = local15 - 7;
		while (local18 > arg0) {
			@Pc(21) int local21 = arg0 + 1;
			arg2[local21] = arg1;
			@Pc(26) int local26 = local21 + 1;
			arg2[local26] = arg1;
			@Pc(31) int local31 = local26 + 1;
			arg2[local31] = arg1;
			@Pc(36) int local36 = local31 + 1;
			arg2[local36] = arg1;
			@Pc(41) int local41 = local36 + 1;
			arg2[local41] = arg1;
			@Pc(46) int local46 = local41 + 1;
			arg2[local46] = arg1;
			@Pc(51) int local51 = local46 + 1;
			arg2[local51] = arg1;
			arg0 = local51 + 1;
			arg2[arg0] = arg1;
		}
		while (local15 > arg0) {
			arg0++;
			arg2[arg0] = arg1;
		}
	}
}
