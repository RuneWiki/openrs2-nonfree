import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static384 {

	@OriginalMember(owner = "client!mka", name = "n", descriptor = "[I")
	public static int[] anIntArray349 = new int[2];

	@OriginalMember(owner = "client!mka", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray45 = new int[128][128];

	@OriginalMember(owner = "client!mka", name = "a", descriptor = "(III)Lclient!qga;")
	public static Class299 method5875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class299 local7 = Static391.method5936(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass299Array1 == null || arg1 >= local7.aClass299Array1.length) {
			return null;
		} else {
			return local7.aClass299Array1[arg1];
		}
	}

	@OriginalMember(owner = "client!mka", name = "a", descriptor = "(IZII)I")
	public static int method5879(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class14_Sub14 local8 = Static495.method7455(arg2, arg1);
		if (local8 == null) {
			return 0;
		} else if (arg0 >= 0 && local8.anIntArray107.length > arg0) {
			return local8.anIntArray107[arg0];
		} else {
			return 0;
		}
	}
}
