import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!jc", name = "v", descriptor = "I")
	public static int anInt3247;

	@OriginalMember(owner = "client!jc", name = "B", descriptor = "I")
	public static int anInt3253;

	@OriginalMember(owner = "client!jc", name = "u", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_163 = new Class159("K", "T", "K", "K");

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)Z")
	public static boolean method2962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static180.anIntArrayArrayArray21[arg0][arg1][arg2];
		if (local7 == -Static218.anInt4453) {
			return false;
		} else if (local7 == Static218.anInt4453) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (Static218.method3955(local22 + 1, Static261.aClass60Array2[arg0].method2264(arg1, arg2), local26 + 1) && Static218.method3955(local22 + 128 - 1, Static261.aClass60Array2[arg0].method2264(arg1 + 1, arg2), local26 + 1) && Static218.method3955(local22 + 128 - 1, Static261.aClass60Array2[arg0].method2264(arg1 + 1, arg2 + 1), local26 + 128 - 1) && Static218.method3955(local22 + 1, Static261.aClass60Array2[arg0].method2264(arg1, arg2 + 1), local26 + 128 - 1)) {
				Static180.anIntArrayArrayArray21[arg0][arg1][arg2] = Static218.anInt4453;
				return true;
			} else {
				Static180.anIntArrayArrayArray21[arg0][arg1][arg2] = -Static218.anInt4453;
				return false;
			}
		}
	}
}
