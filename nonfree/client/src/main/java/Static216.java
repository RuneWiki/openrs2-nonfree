import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!ica", name = "R", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_85 = new Class254(59, 7);

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(IIIIBI)V")
	public static void method3978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 > Static289.anInt5545 || arg3 < Static96.anInt2302) {
			return;
		}
		@Pc(22) boolean local22;
		if (arg2 < Static376.anInt7071) {
			arg2 = Static376.anInt7071;
			local22 = false;
		} else if (arg2 <= Class179_Sub2.lb) {
			local22 = true;
		} else {
			arg2 = Class179_Sub2.lb;
			local22 = false;
		}
		@Pc(42) boolean local42;
		if (Static376.anInt7071 > arg4) {
			arg4 = Static376.anInt7071;
			local42 = false;
		} else if (Class179_Sub2.lb >= arg4) {
			local42 = true;
		} else {
			arg4 = Class179_Sub2.lb;
			local42 = false;
		}
		if (Static96.anInt2302 > arg0) {
			arg0 = Static96.anInt2302;
		} else {
			Static115.method2332(arg2, arg4, arg1, Static183.anIntArrayArray26[arg0++]);
		}
		if (Static289.anInt5545 >= arg3) {
			Static115.method2332(arg2, arg4, arg1, Static183.anIntArrayArray26[arg3--]);
		} else {
			arg3 = Static289.anInt5545;
		}
		@Pc(101) int local101;
		if (local22 && local42) {
			for (local101 = arg0; local101 <= arg3; local101++) {
				@Pc(107) int[] local107 = Static183.anIntArrayArray26[local101];
				local107[arg2] = local107[arg4] = arg1;
			}
		} else if (local22) {
			for (local101 = arg0; local101 <= arg3; local101++) {
				Static183.anIntArrayArray26[local101][arg2] = arg1;
			}
		} else if (local42) {
			for (local101 = arg0; local101 <= arg3; local101++) {
				Static183.anIntArrayArray26[local101][arg4] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ica", name = "c", descriptor = "(III)Lclient!oj;")
	public static Class11_Sub5 method3980(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class224 local7 = Static256.aClass224ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass11_Sub5_2 == null ? null : local7.aClass11_Sub5_2;
	}
}
