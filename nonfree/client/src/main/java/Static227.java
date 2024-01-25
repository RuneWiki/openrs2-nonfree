import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!hk", name = "hb", descriptor = "[Lclient!sf;")
	public static Class41_Sub1[] aClass41_Sub1Array3;

	@OriginalMember(owner = "client!hk", name = "jb", descriptor = "I")
	public static int anInt3654;

	@OriginalMember(owner = "client!hk", name = "yb", descriptor = "[[Lclient!wq;")
	public static Class394[][] aClass394ArrayArray2;

	@OriginalMember(owner = "client!hk", name = "o", descriptor = "[I")
	public static final int[] anIntArray204 = new int[4096];

	@OriginalMember(owner = "client!hk", name = "cb", descriptor = "Lclient!ga;")
	public static Class124 aClass124_36 = new Class124();

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "([BIIIBII)Z")
	public static boolean method3235(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		@Pc(9) int local9 = arg1 % 8;
		@Pc(16) int local16;
		if (local9 == 0) {
			local16 = 0;
		} else {
			local16 = 8 - local9;
		}
		@Pc(30) int local30 = -((arg4 + 8 - 1) / 8);
		@Pc(39) int local39 = -((arg1 + 8 - 1) / 8);
		for (@Pc(41) int local41 = local30; local41 < 0; local41++) {
			for (@Pc(50) int local50 = local39; local50 < 0; local50++) {
				if (arg0[arg2] == 0) {
					return true;
				}
				arg2 += 8;
			}
			arg2 -= local16;
			if (arg0[arg2 - 1] == 0) {
				return true;
			}
			arg2 += arg3;
		}
		return false;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!cb;I)V")
	public static void method3242(@OriginalArg(0) Class50 arg0) {
		Static49.aClass50_14 = arg0;
	}
}
