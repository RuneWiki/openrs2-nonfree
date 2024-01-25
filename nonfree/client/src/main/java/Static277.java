import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!sf", name = "J", descriptor = "Lclient!lm;")
	public static Class134 aClass134_127;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIILclient!e;Lclient!e;)V")
	public static void method4955(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class10_Sub2 arg3, @OriginalArg(4) Class10_Sub2 arg4) {
		if (Static347.aClass83ArrayArrayArray3[arg0][arg1][arg2] == null) {
			Static313.method5368(arg0, arg1, arg2);
		}
		Static347.aClass83ArrayArrayArray3[arg0][arg1][arg2].aClass10_Sub2_1 = arg3;
		Static347.aClass83ArrayArrayArray3[arg0][arg1][arg2].aClass10_Sub2_2 = arg4;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!ri;III[Z)V")
	public static void method4956(@OriginalArg(0) Class1_Sub2_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static263.aClass12Array2 == Static81.aClass12Array1) {
			return;
		}
		@Pc(9) int local9 = Static278.aClass12Array3[arg1].method2698(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class12 local22 = Static278.aClass12Array3[local11];
				if (local22 != null) {
					local22.method2706(arg0, arg2, local9 - local22.method2698(arg2, arg3), arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(Z)V")
	public static void method4957() {
		for (@Pc(6) Class1_Sub26 local6 = (Class1_Sub26) Static298.aClass207_35.method5560(); local6 != null; local6 = (Class1_Sub26) Static298.aClass207_35.method5559()) {
			@Pc(11) int local11 = local6.anInt3825;
			if (Static274.method4904(local11)) {
				@Pc(17) boolean local17 = true;
				@Pc(21) Class163[] local21 = Static313.aClass163ArrayArray1[local11];
				for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
					if (local21[local23] != null) {
						local17 = local21[local23].aBoolean411;
						break;
					}
				}
				if (!local17) {
					@Pc(51) int local51 = (int) local6.aLong214;
					@Pc(55) Class163 local55 = Static248.method22(local51);
					if (local55 != null) {
						Static340.method5639(local55);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(II)I")
	public static int method4958(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
