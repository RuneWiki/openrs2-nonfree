import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
	public static int anInt6539;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "Lclient!aw;")
	public static final Class23 aClass23_7 = new Class23();

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_135 = new Class136(76, 10);

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIII)V")
	public static void method5780(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static231.anInt3977 < arg3 || Static304.anInt4824 > arg4) {
			return;
		}
		@Pc(26) boolean local26;
		if (Static514.anInt8603 > arg1) {
			arg1 = Static514.anInt8603;
			local26 = false;
		} else if (Static487.anInt8320 < arg1) {
			arg1 = Static487.anInt8320;
			local26 = false;
		} else {
			local26 = true;
		}
		@Pc(47) boolean local47;
		if (Static514.anInt8603 > arg2) {
			local47 = false;
			arg2 = Static514.anInt8603;
		} else if (Static487.anInt8320 >= arg2) {
			local47 = true;
		} else {
			arg2 = Static487.anInt8320;
			local47 = false;
		}
		if (Static304.anInt4824 > arg3) {
			arg3 = Static304.anInt4824;
		} else {
			Static260.method3979(arg0, arg1, Static267.anIntArrayArray20[arg3++], arg2);
		}
		if (arg4 > Static231.anInt3977) {
			arg4 = Static231.anInt3977;
		} else {
			Static260.method3979(arg0, arg1, Static267.anIntArrayArray20[arg4--], arg2);
		}
		@Pc(101) int local101;
		if (local26 && local47) {
			for (local101 = arg3; local101 <= arg4; local101++) {
				@Pc(107) int[] local107 = Static267.anIntArrayArray20[local101];
				local107[arg1] = local107[arg2] = arg0;
			}
		} else if (local26) {
			for (local101 = arg3; local101 <= arg4; local101++) {
				Static267.anIntArrayArray20[local101][arg1] = arg0;
			}
		} else if (local47) {
			for (local101 = arg3; local101 <= arg4; local101++) {
				Static267.anIntArrayArray20[local101][arg2] = arg0;
			}
		}
	}
}
