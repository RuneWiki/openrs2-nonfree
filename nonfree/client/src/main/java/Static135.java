import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)Z")
	public static boolean method1996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static332.anIntArrayArrayArray12[arg0][arg1][arg2];
		if (local7 == -Static201.anInt3382) {
			return false;
		} else if (local7 == Static201.anInt3382) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << Static460.anInt7074;
			@Pc(26) int local26 = arg2 << Static460.anInt7074;
			if (Static387.method4966(local22 + 1, Static345.aClass162Array3[arg0].ua(arg1, arg2), local26 + 1) && Static387.method4966(local22 + Static67.anInt1221 - 1, Static345.aClass162Array3[arg0].ua(arg1 + 1, arg2), local26 + 1) && Static387.method4966(local22 + Static67.anInt1221 - 1, Static345.aClass162Array3[arg0].ua(arg1 + 1, arg2 + 1), local26 + Static67.anInt1221 - 1) && Static387.method4966(local22 + 1, Static345.aClass162Array3[arg0].ua(arg1, arg2 + 1), local26 + Static67.anInt1221 - 1) && Static387.method4966(local22 + Static179.anInt3078, Static345.aClass162Array3[arg0].ua(arg1, arg2), local26 + 1) && Static387.method4966(local22 + Static67.anInt1221 - 1, Static345.aClass162Array3[arg0].ua(arg1 + 1, arg2), local26 + Static179.anInt3078) && Static387.method4966(local22 + Static179.anInt3078, Static345.aClass162Array3[arg0].ua(arg1, arg2 + 1), local26 + Static67.anInt1221 - 1) && Static387.method4966(local22 + Static67.anInt1221 - 1, Static345.aClass162Array3[arg0].ua(arg1, arg2), local26 + Static179.anInt3078) && Static387.method4966(local22 + Static179.anInt3078, Static345.aClass162Array3[arg0].ua(arg1, arg2), local26 + Static179.anInt3078)) {
				Static332.anIntArrayArrayArray12[arg0][arg1][arg2] = Static201.anInt3382;
				return true;
			} else {
				Static332.anIntArrayArrayArray12[arg0][arg1][arg2] = -Static201.anInt3382;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(BI)V")
	public static void method1999(@OriginalArg(1) int arg0) {
		Static379.anInt6865 = arg0;
		Static435.anInt7039 = -1;
		Static49.anInt857 = -1;
		Static108.method1681();
	}
}
