import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static490 {

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "I")
	public static int anInt8758 = 1;

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "Lclient!ok;")
	public static final Class262 aClass262_58 = new Class262();

	@OriginalMember(owner = "client!qp", name = "d", descriptor = "Lclient!ip;")
	public static final Class169 aClass169_6 = new Class169();

	@OriginalMember(owner = "client!qp", name = "e", descriptor = "I")
	public static final int anInt8759 = 1406;

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIIIBIII)V")
	public static void method7253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < 0 || arg1 < 0 || arg0 >= Static26.anInt462 - 1 || Static445.anInt6140 - 1 <= arg1) {
			return;
		}
		if (Static486.aClass58ArrayArrayArray2 == null) {
			return;
		}
		@Pc(57) Interface19 local57;
		if (arg3 == 0) {
			local57 = (Interface19) Static622.method8738(arg4, arg0, arg1);
			@Pc(267) Interface19 local267 = (Interface19) Static308.method4510(arg4, arg0, arg1);
			if (local57 != null && arg2 != 2) {
				if (local57 instanceof Class12_Sub2_Sub1_Sub2) {
					((Class12_Sub2_Sub1_Sub2) local57).aClass246_4.method5943(arg6);
				} else {
					Static81.method1534(arg4, arg1, arg6, arg2, arg3, local57.method9171(), arg5, arg0);
				}
			}
			if (local267 != null) {
				if (local267 instanceof Class12_Sub2_Sub1_Sub2) {
					((Class12_Sub2_Sub1_Sub2) local267).aClass246_4.method5943(arg6);
				} else {
					Static81.method1534(arg4, arg1, arg6, arg2, arg3, local267.method9171(), arg5, arg0);
				}
			}
		} else if (arg3 == 1) {
			local57 = (Interface19) Static385.method5716(arg4, arg0, arg1);
			if (local57 != null) {
				if (local57 instanceof Class12_Sub2_Sub3_Sub1) {
					((Class12_Sub2_Sub3_Sub1) local57).aClass246_1.method5943(arg6);
				} else {
					@Pc(158) int local158 = local57.method9171();
					if (arg2 == 4 || arg2 == 5) {
						Static81.method1534(arg4, arg1, arg6, 4, arg3, local158, arg5, arg0);
					} else if (arg2 == 6) {
						Static81.method1534(arg4, arg1, arg6, 4, arg3, local158, arg5 + 4, arg0);
					} else if (arg2 == 7) {
						Static81.method1534(arg4, arg1, arg6, 4, arg3, local158, (arg5 + 2 & 0x3) + 4, arg0);
					} else if (arg2 == 8) {
						Static81.method1534(arg4, arg1, arg6, 4, arg3, local158, arg5 + 4, arg0);
						Static81.method1534(arg4, arg1, arg6, 4, arg3, local158, (arg5 + 2 & 0x3) + 4, arg0);
					}
				}
			}
		} else if (arg3 == 2) {
			local57 = (Interface19) Static595.method8438(arg4, arg0, arg1, nq.class);
			if (local57 != null) {
				if (arg2 == 11) {
					arg2 = 10;
				}
				if (local57 instanceof Class12_Sub2_Sub2_Sub3) {
					((Class12_Sub2_Sub2_Sub3) local57).aClass246_2.method5943(arg6);
				} else {
					Static81.method1534(arg4, arg1, arg6, arg2, arg3, local57.method9171(), arg5, arg0);
				}
			}
		} else if (arg3 == 3) {
			local57 = (Interface19) Static430.method6312(arg4, arg0, arg1);
			if (local57 != null) {
				if (local57 instanceof Class12_Sub2_Sub4_Sub2) {
					((Class12_Sub2_Sub4_Sub2) local57).aClass246_3.method5943(arg6);
				} else {
					Static81.method1534(arg4, arg1, arg6, arg2, arg3, local57.method9171(), arg5, arg0);
				}
			}
		}
	}
}
