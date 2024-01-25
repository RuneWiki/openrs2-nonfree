import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!jg", name = "x", descriptor = "I")
	public static int anInt4517;

	@OriginalMember(owner = "client!jg", name = "O", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(III)V")
	public static void method3826(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class6_Sub5_Sub8 local10 = Static49.method760(7, arg1);
		local10.method3256();
		local10.anInt3740 = arg0;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V")
	public static void method3828() {
		Static89.aClass90_3.ha(((float) Static58.aClass6_Sub17_Sub1_1.anInt9274 * 0.1F + 0.7F) * Static348.aFloat157);
		Static89.aClass90_3.YA(Static281.anInt5187, Static121.aFloat36, Static582.aFloat171, (float) (Static265.anInt4731 << 2), (float) (Static491.anInt8623 << 2), (float) (Static128.anInt2210 << 2));
		Static89.aClass90_3.method7454(Static23.aClass3_2);
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(III)Z")
	public static boolean method3831(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static484.anIntArrayArrayArray20[arg0][arg1][arg2];
		if (local7 == -Static171.anInt9038) {
			return false;
		} else if (local7 == Static171.anInt9038) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << Static23.anInt420;
			@Pc(26) int local26 = arg2 << Static23.anInt420;
			if (Static416.method5920(local22 + 1, Static205.aClass46Array1[arg0].JA(arg1, arg2), local26 + 1) && Static416.method5920(local22 + Static113.anInt1928 - 1, Static205.aClass46Array1[arg0].JA(arg1 + 1, arg2), local26 + 1) && Static416.method5920(local22 + Static113.anInt1928 - 1, Static205.aClass46Array1[arg0].JA(arg1 + 1, arg2 + 1), local26 + Static113.anInt1928 - 1) && Static416.method5920(local22 + 1, Static205.aClass46Array1[arg0].JA(arg1, arg2 + 1), local26 + Static113.anInt1928 - 1) && Static416.method5920(local22 + Static259.anInt4703, Static205.aClass46Array1[arg0].JA(arg1, arg2), local26 + 1) && Static416.method5920(local22 + Static113.anInt1928 - 1, Static205.aClass46Array1[arg0].JA(arg1 + 1, arg2), local26 + Static259.anInt4703) && Static416.method5920(local22 + Static259.anInt4703, Static205.aClass46Array1[arg0].JA(arg1, arg2 + 1), local26 + Static113.anInt1928 - 1) && Static416.method5920(local22 + Static113.anInt1928 - 1, Static205.aClass46Array1[arg0].JA(arg1, arg2), local26 + Static259.anInt4703) && Static416.method5920(local22 + Static259.anInt4703, Static205.aClass46Array1[arg0].JA(arg1, arg2), local26 + Static259.anInt4703)) {
				Static484.anIntArrayArrayArray20[arg0][arg1][arg2] = Static171.anInt9038;
				return true;
			} else {
				Static484.anIntArrayArrayArray20[arg0][arg1][arg2] = -Static171.anInt9038;
				return false;
			}
		}
	}
}
