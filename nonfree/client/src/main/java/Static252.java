import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!is", name = "C", descriptor = "Lclient!ai;")
	public static Class15 aClass15_1;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(III)V")
	public static void method4478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class186 local7 = Static26.aClass186ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			Static248.method4430(local7.aClass9_Sub4_Sub3_1);
			if (local7.aClass9_Sub4_Sub3_1 != null) {
				local7.aClass9_Sub4_Sub3_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(ZB)V")
	public static void method4480(@OriginalArg(0) boolean arg0) {
		Static368.aClass115_4.method6282(Static293.aClass5_6.method6115());
		@Pc(10) int[] local10 = Static293.aClass5_6.Y();
		Static633.anInt10643 = local10[3];
		Static599.anInt10169 = local10[0];
		Static171.anInt3808 = local10[2];
		Static107.anInt2889 = local10[1];
		if (arg0) {
			Static293.aClass5_6.DA(Static274.anInt5862, Static5.anInt456, Static629.anInt10542, Static66.anInt2290);
			Static81.method2197(Static465.aDouble12);
		} else {
			Static293.aClass5_6.DA(Static459.anInt8227, Static635.anInt10682, Static265.anInt5687, Static116.anInt2993);
			Static81.method2197(Static508.aDouble23);
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Lclient!oia;B)Z")
	public static boolean method4483(@OriginalArg(0) Class243 arg0) {
		return arg0 == null ? false : Static406.method6366(arg0.anInt7499, arg0.anInt7500 - arg0.anInt7497, arg0.anInt7492 - arg0.anInt7499, arg0.anInt7493 - arg0.anInt7501, arg0.anInt7501, arg0.anInt7497);
	}
}
