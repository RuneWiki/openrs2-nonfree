import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!iw", name = "G", descriptor = "[Lclient!xa;")
	public static Class58[] aClass58Array10;

	@OriginalMember(owner = "client!iw", name = "C", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_66 = new Class47(21, -1);

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(III)Z")
	public static boolean method3784(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static450.anIntArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == -Static31.anInt4658) {
			return false;
		} else if (local7 == Static31.anInt4658) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << Static339.anInt6128;
			@Pc(26) int local26 = arg2 << Static339.anInt6128;
			if (Static502.method6781(local22 + 1, Static133.aClass59Array3[arg0].JA(arg1, arg2), local26 + 1) && Static502.method6781(local22 + Static112.anInt2178 - 1, Static133.aClass59Array3[arg0].JA(arg1 + 1, arg2), local26 + 1) && Static502.method6781(local22 + Static112.anInt2178 - 1, Static133.aClass59Array3[arg0].JA(arg1 + 1, arg2 + 1), local26 + Static112.anInt2178 - 1) && Static502.method6781(local22 + 1, Static133.aClass59Array3[arg0].JA(arg1, arg2 + 1), local26 + Static112.anInt2178 - 1) && Static502.method6781(local22 + Static108.anInt2068, Static133.aClass59Array3[arg0].JA(arg1, arg2), local26 + 1) && Static502.method6781(local22 + Static112.anInt2178 - 1, Static133.aClass59Array3[arg0].JA(arg1 + 1, arg2), local26 + Static108.anInt2068) && Static502.method6781(local22 + Static108.anInt2068, Static133.aClass59Array3[arg0].JA(arg1, arg2 + 1), local26 + Static112.anInt2178 - 1) && Static502.method6781(local22 + Static112.anInt2178 - 1, Static133.aClass59Array3[arg0].JA(arg1, arg2), local26 + Static108.anInt2068) && Static502.method6781(local22 + Static108.anInt2068, Static133.aClass59Array3[arg0].JA(arg1, arg2), local26 + Static108.anInt2068)) {
				Static450.anIntArrayArrayArray4[arg0][arg1][arg2] = Static31.anInt4658;
				return true;
			} else {
				Static450.anIntArrayArrayArray4[arg0][arg1][arg2] = -Static31.anInt4658;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(ILclient!ac;)I")
	public static int method3785(@OriginalArg(1) Class4_Sub1_Sub1_Sub1 arg0) {
		@Pc(13) Class273 local13 = arg0.aClass273_1;
		if (local13.anIntArray537 != null) {
			local13 = local13.method6159(Static498.aClass101_1);
			if (local13 == null) {
				return -1;
			}
		}
		@Pc(28) int local28 = local13.anInt7444;
		@Pc(32) Class118 local32 = arg0.method5891();
		if (arg0.aBoolean495) {
			local28 = local13.anInt7460;
		} else if (local32.anInt3607 == arg0.anInt7100 || local32.anInt3604 == arg0.anInt7100 || local32.anInt3593 == arg0.anInt7100 || arg0.anInt7100 == local32.anInt3575) {
			local28 = local13.anInt7452;
		} else if (arg0.anInt7100 == local32.anInt3590 || arg0.anInt7100 == local32.anInt3606 || local32.anInt3572 == arg0.anInt7100 || local32.anInt3610 == arg0.anInt7100) {
			local28 = local13.anInt7441;
		}
		return local28;
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(ZI)Lclient!jg;")
	public static Class6_Sub2_Sub10 method3787(@OriginalArg(1) int arg0) {
		@Pc(10) Class6_Sub2_Sub10 local10 = (Class6_Sub2_Sub10) Static228.aClass94_3.method2647((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static466.aClass251_110.method5772(0, arg0);
		if (local20 == null || local20.length <= 1) {
			return null;
		} else {
			local10 = Static17.method403(local20);
			Static228.aClass94_3.method2643((long) arg0, local10);
			return local10;
		}
	}
}
