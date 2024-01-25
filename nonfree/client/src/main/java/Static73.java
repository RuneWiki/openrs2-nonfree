import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!cfa", name = "H", descriptor = "I")
	public static int anInt1410;

	@OriginalMember(owner = "client!cfa", name = "J", descriptor = "F")
	public static float aFloat13;

	@OriginalMember(owner = "client!cfa", name = "A", descriptor = "[I")
	public static final int[] anIntArray70 = new int[14];

	@OriginalMember(owner = "client!cfa", name = "F", descriptor = "Lclient!in;")
	public static final Class169 aClass169_41 = new Class169(131, -1);

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Lclient!uf;B)Lclient!uf;")
	public static Class357 method1353(@OriginalArg(0) Class357 arg0) {
		if (arg0.anInt10449 != -1) {
			return Static647.method9532(arg0.anInt10449);
		}
		@Pc(20) int local20 = arg0.anInt10460 >>> 16;
		@Pc(25) Class10 local25 = new Class10(Static507.aClass335_33);
		for (@Pc(30) Class2_Sub20 local30 = (Class2_Sub20) local25.method152(); local30 != null; local30 = (Class2_Sub20) local25.method151()) {
			if (local30.anInt1667 == local20) {
				return Static647.method9532((int) local30.aLong313);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IIBIIIII)V")
	public static void method1354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 < 0 || arg6 < 0 || arg4 >= Static222.anInt4533 - 1 || arg6 >= Static668.anInt11370 - 1) {
			return;
		}
		if (Static193.aClass291ArrayArrayArray2 == null) {
			return;
		}
		@Pc(40) Interface23 local40;
		if (arg5 == 0) {
			local40 = (Interface23) Static584.method4102(arg2, arg4, arg6);
			@Pc(46) Interface23 local46 = (Interface23) Static262.method4520(arg2, arg4, arg6);
			if (local40 != null && arg3 != 2) {
				if (local40 instanceof Class15_Sub3_Sub4_Sub1) {
					((Class15_Sub3_Sub4_Sub1) local40).aClass241_1.method6535(arg1);
				} else {
					Static340.method5712(arg4, arg5, arg0, arg2, arg1, arg3, arg6, local40.method9451());
				}
			}
			if (local46 != null) {
				if (local46 instanceof Class15_Sub3_Sub4_Sub1) {
					((Class15_Sub3_Sub4_Sub1) local46).aClass241_1.method6535(arg1);
				} else {
					Static340.method5712(arg4, arg5, arg0, arg2, arg1, arg3, arg6, local46.method9451());
				}
			}
		} else if (arg5 == 1) {
			local40 = (Interface23) Static207.method3925(arg2, arg4, arg6);
			if (local40 != null) {
				if (local40 instanceof Class15_Sub3_Sub1_Sub2) {
					((Class15_Sub3_Sub1_Sub2) local40).lb.method6535(arg1);
				} else {
					@Pc(133) int local133 = local40.method9451();
					if (arg3 == 4 || arg3 == 5) {
						Static340.method5712(arg4, arg5, arg0, arg2, arg1, 4, arg6, local133);
					} else if (arg3 == 6) {
						Static340.method5712(arg4, arg5, arg0 + 4, arg2, arg1, 4, arg6, local133);
					} else if (arg3 == 7) {
						Static340.method5712(arg4, arg5, (arg0 + 2 & 0x3) + 4, arg2, arg1, 4, arg6, local133);
					} else if (arg3 == 8) {
						Static340.method5712(arg4, arg5, arg0 + 4, arg2, arg1, 4, arg6, local133);
						Static340.method5712(arg4, arg5, (arg0 + 2 & 0x3) + 4, arg2, arg1, 4, arg6, local133);
					}
				}
			}
		} else if (arg5 == 2) {
			local40 = (Interface23) Static174.method3415(arg2, arg4, arg6, vu.class);
			if (local40 != null) {
				if (arg3 == 11) {
					arg3 = 10;
				}
				if (local40 instanceof Class15_Sub3_Sub3_Sub2) {
					((Class15_Sub3_Sub3_Sub2) local40).aClass241_2.method6535(arg1);
				} else {
					Static340.method5712(arg4, arg5, arg0, arg2, arg1, arg3, arg6, local40.method9451());
				}
			}
		} else if (arg5 == 3) {
			local40 = (Interface23) Static428.method7017(arg2, arg4, arg6);
			if (local40 != null) {
				if (local40 instanceof Class15_Sub3_Sub5_Sub1) {
					((Class15_Sub3_Sub5_Sub1) local40).aClass241_3.method6535(arg1);
				} else {
					Static340.method5712(arg4, arg5, arg0, arg2, arg1, arg3, arg6, local40.method9451());
				}
			}
		}
	}
}
