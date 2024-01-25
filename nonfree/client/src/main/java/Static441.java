import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static441 {

	@OriginalMember(owner = "client!wk", name = "A", descriptor = "Lclient!ig;")
	public static Class12 aClass12_20;

	@OriginalMember(owner = "client!wk", name = "j", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_112 = new Class231("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!wk", name = "r", descriptor = "I")
	public static int anInt7213 = 0;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZI)Lclient!mj;")
	public static Class168 method5929(@OriginalArg(1) int arg0) {
		@Pc(10) Class168 local10 = (Class168) Static374.aClass220_50.method4990((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static81.aClass158_21.method3672(arg0, 1);
		local10 = new Class168();
		local10.anInt4155 = arg0;
		if (local20 != null) {
			local10.method3781(new Class6_Sub15(local20));
		}
		local10.method3787();
		if (local10.anInt4156 == 2 && Static282.aClass137_28.method3175((long) arg0) == null) {
			Static282.aClass137_28.method3179((long) arg0, new Class6_Sub44(Static318.anInt5150));
			Static84.aClass168Array1[Static318.anInt5150++] = local10;
		}
		Static374.aClass220_50.method4996(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!qh;BIII)V")
	public static void method5930(@OriginalArg(0) Class3_Sub3_Sub6_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		@Pc(8) int local8 = arg0.anIntArray582[0];
		@Pc(13) int local13 = arg0.anIntArray583[0];
		if (local8 < 0 || Static84.anInt1632 <= local8 || local13 < 0 || local13 >= Static261.anInt4480 || (arg1 < 0 || Static84.anInt1632 <= arg1 || arg2 < 0 || Static261.anInt4480 <= arg2)) {
			return;
		}
		@Pc(64) int local64 = Static434.method5877(0, local13, arg2, true, 0, local8, 0, arg0.method5512(), Static401.anIntArray576, -4, Static254.aClass61Array2[arg0.aByte93], arg1, 0, Static120.anIntArray217);
		if (local64 >= 1 && local64 <= 3) {
			for (@Pc(76) int local76 = 0; local76 < local64 - 1; local76++) {
				arg0.method4692((byte) 2, Static120.anIntArray217[local76], Static401.anIntArray576[local76]);
			}
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!h;III[Z)V")
	public static void method5932(@OriginalArg(0) Class6_Sub1_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static420.aClass84Array4 == Static365.aClass84Array3) {
			return;
		}
		@Pc(9) int local9 = Static93.aClass84Array1[arg1].method5334(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class84 local22 = Static93.aClass84Array1[local11];
				if (local22 != null) {
					local22.method5329(arg0, arg2, local9 - local22.method5334(arg2, arg3), arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIII)V")
	public static void method5933(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(13) int local13 = arg0 * arg0;
		@Pc(17) int local17 = arg4 * arg4;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(33) int local33 = arg4 << 1;
		@Pc(42) int local42 = local21 + (1 - local33) * local13;
		@Pc(51) int local51 = local17 - local25 * (local33 - 1);
		@Pc(55) int local55 = local13 << 2;
		@Pc(59) int local59 = local17 << 2;
		@Pc(67) int local67 = local21 * 3;
		@Pc(75) int local75 = ((arg4 << 1) - 3) * local25;
		@Pc(81) int local81 = local59;
		@Pc(95) int local95;
		@Pc(104) int local104;
		if (Static97.anInt1796 <= arg2 && Static85.anInt1636 >= arg2) {
			local95 = Static53.method977(Static99.anInt1808, Static81.anInt1574, arg1 + arg0);
			local104 = Static53.method977(Static99.anInt1808, Static81.anInt1574, arg1 - arg0);
			Static73.method1404(Static347.anIntArrayArray54[arg2], local95, arg3, local104);
		}
		@Pc(118) int local118 = (arg4 - 1) * local55;
		while (local9 > 0) {
			if (local42 < 0) {
				while (local42 < 0) {
					local51 += local81;
					local42 += local67;
					local81 += local59;
					local67 += local59;
					local7++;
				}
			}
			if (local51 < 0) {
				local51 += local81;
				local42 += local67;
				local7++;
				local67 += local59;
				local81 += local59;
			}
			local51 += -local75;
			local42 += -local118;
			local75 -= local55;
			local9--;
			local118 -= local55;
			local95 = arg2 - local9;
			local104 = arg2 + local9;
			if (Static97.anInt1796 <= local104 && Static85.anInt1636 >= local95) {
				@Pc(219) int local219 = Static53.method977(Static99.anInt1808, Static81.anInt1574, arg1 + local7);
				@Pc(228) int local228 = Static53.method977(Static99.anInt1808, Static81.anInt1574, arg1 - local7);
				if (Static97.anInt1796 <= local95) {
					Static73.method1404(Static347.anIntArrayArray54[local95], local219, arg3, local228);
				}
				if (local104 <= Static85.anInt1636) {
					Static73.method1404(Static347.anIntArrayArray54[local104], local219, arg3, local228);
				}
			}
		}
	}
}
