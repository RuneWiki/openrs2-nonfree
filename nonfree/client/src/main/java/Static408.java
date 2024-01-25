import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static408 {

	@OriginalMember(owner = "client!o", name = "b", descriptor = "Lclient!ho;")
	public static Class9 aClass9_28;

	@OriginalMember(owner = "client!o", name = "h", descriptor = "I")
	public static int anInt6832 = 0;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(III)V")
	public static void method5841(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static441.aClass351ArrayArrayArray1[0][arg1][arg2] != null && Static441.aClass351ArrayArrayArray1[0][arg1][arg2].aClass351_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static441.aClass351ArrayArrayArray1[local22][arg1][arg2] == null) {
				@Pc(44) Class351 local44 = Static441.aClass351ArrayArrayArray1[local22][arg1][arg2] = new Class351(local22);
				if (local20) {
					local44.aByte139++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIIB)V")
	public static void method5842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (Static502.anInt8456 <= arg4 - arg1 && Static153.anInt2554 >= arg1 + arg4 && Static55.anInt4238 <= arg5 - arg1 && arg1 + arg5 <= Static292.anInt4921) {
			Static523.method7369(arg1, arg3, arg2, arg4, arg0, arg5);
		} else {
			Static411.method6182(arg4, arg2, arg0, arg5, arg1, arg3);
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIBIII)V")
	public static void method5843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 < 0 || arg2 < 0 || Static491.anInt9856 - 1 <= arg1 || arg2 >= Static393.anInt6574 - 1) {
			return;
		}
		if (Static441.aClass351ArrayArrayArray1 == null) {
			return;
		}
		@Pc(49) Interface18 local49;
		if (arg6 == 0) {
			local49 = (Interface18) Static401.method5788(arg4, arg1, arg2);
			@Pc(55) Interface18 local55 = (Interface18) Static22.method528(arg4, arg1, arg2);
			if (local49 != null && arg0 != 2) {
				if (local49 instanceof Class2_Sub1_Sub2_Sub2) {
					((Class2_Sub1_Sub2_Sub2) local49).aClass390_1.method9088(arg3);
				} else {
					Static175.method2479(arg2, arg4, arg5, local49.method8469(), arg1, arg3, arg6, arg0);
				}
			}
			if (local55 != null) {
				if (local55 instanceof Class2_Sub1_Sub2_Sub2) {
					((Class2_Sub1_Sub2_Sub2) local55).aClass390_1.method9088(arg3);
					return;
				}
				Static175.method2479(arg2, arg4, arg5, local55.method8469(), arg1, arg3, arg6, arg0);
				return;
			}
			return;
		}
		if (arg6 != 1) {
			if (arg6 == 2) {
				local49 = (Interface18) Static486.method7064(arg4, arg1, arg2, oc.class);
				if (local49 == null) {
					return;
				}
				if (arg0 == 11) {
					arg0 = 10;
				}
				if (local49 instanceof Class2_Sub1_Sub1_Sub2) {
					((Class2_Sub1_Sub1_Sub2) local49).aClass390_2.method9088(arg3);
					return;
				}
				Static175.method2479(arg2, arg4, arg5, local49.method8469(), arg1, arg3, arg6, arg0);
			} else if (arg6 == 3) {
				local49 = (Interface18) Static82.method1398(arg4, arg1, arg2);
				if (local49 != null) {
					if (!(local49 instanceof Class2_Sub1_Sub3_Sub2)) {
						Static175.method2479(arg2, arg4, arg5, local49.method8469(), arg1, arg3, arg6, arg0);
						return;
					}
					((Class2_Sub1_Sub3_Sub2) local49).aClass390_3.method9088(arg3);
					return;
				}
			}
			return;
		}
		local49 = (Interface18) Static567.method7938(arg4, arg1, arg2);
		if (local49 == null) {
			return;
		}
		if (local49 instanceof Class2_Sub1_Sub4_Sub1) {
			((Class2_Sub1_Sub4_Sub1) local49).aClass390_4.method9088(arg3);
			return;
		}
		@Pc(222) int local222 = local49.method8469();
		if (arg0 == 4 || arg0 == 5) {
			Static175.method2479(arg2, arg4, arg5, local222, arg1, arg3, arg6, 4);
			return;
		}
		if (arg0 == 6) {
			Static175.method2479(arg2, arg4, arg5 + 4, local222, arg1, arg3, arg6, 4);
			return;
		}
		if (arg0 == 7) {
			Static175.method2479(arg2, arg4, (arg5 + 2 & 0x3) + 4, local222, arg1, arg3, arg6, 4);
		} else if (arg0 == 8) {
			Static175.method2479(arg2, arg4, arg5 + 4, local222, arg1, arg3, arg6, 4);
			Static175.method2479(arg2, arg4, (arg5 + 2 & 0x3) + 4, local222, arg1, arg3, arg6, 4);
			return;
		}
		return;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "([J[IB)V")
	public static void method5845(@OriginalArg(0) long[] arg0, @OriginalArg(1) int[] arg1) {
		Static252.method3640(arg0, arg0.length - 1, 0, arg1);
	}
}
