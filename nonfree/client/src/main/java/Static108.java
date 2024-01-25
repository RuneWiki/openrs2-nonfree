import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!ff", name = "v", descriptor = "F")
	public static float aFloat21;

	@OriginalMember(owner = "client!ff", name = "w", descriptor = "[I")
	public static int[] anIntArray138;

	@OriginalMember(owner = "client!ff", name = "z", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_39 = new Class92(64, -1);

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIIIIIZ)V")
	public static void method1916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg0 < 0 || arg4 < 0 || Static181.anInt3574 - 1 <= arg0 || Static117.anInt2450 - 1 <= arg4) {
			return;
		}
		if (Static409.aClass101ArrayArrayArray3 == null) {
			return;
		}
		@Pc(36) Interface10 local36;
		if (arg3 == 0) {
			local36 = (Interface10) Static86.method825(arg6, arg0, arg4);
			@Pc(42) Interface10 local42 = (Interface10) Static142.method2451(arg6, arg0, arg4);
			if (local36 != null && arg1 != 2) {
				if (local36 instanceof Class3_Sub3_Sub3) {
					((Class3_Sub3_Sub3) local36).aClass215_4.method5189(arg2);
				} else {
					Static295.method4601(arg0, arg1, arg3, arg4, arg5, local36.method5325(), arg2, arg6);
				}
			}
			if (local42 != null) {
				if (!(local42 instanceof Class3_Sub3_Sub3)) {
					Static295.method4601(arg0, arg1, arg3, arg4, arg5, local42.method5325(), arg2, arg6);
					return;
				}
				((Class3_Sub3_Sub3) local42).aClass215_4.method5189(arg2);
				return;
			}
			return;
		}
		if (arg3 != 1) {
			if (arg3 == 2) {
				local36 = (Interface10) Static415.method6101(arg6, arg0, arg4, sq.class);
				if (local36 == null) {
					return;
				}
				if (arg1 == 11) {
					arg1 = 10;
				}
				if (!(local36 instanceof Class3_Sub2_Sub3)) {
					Static295.method4601(arg0, arg1, arg3, arg4, arg5, local36.method5325(), arg2, arg6);
					return;
				}
				((Class3_Sub2_Sub3) local36).aClass215_2.method5189(arg2);
			} else if (arg3 == 3) {
				local36 = (Interface10) Static109.method4308(arg6, arg0, arg4);
				if (local36 != null) {
					if (local36 instanceof Class3_Sub5_Sub1) {
						((Class3_Sub5_Sub1) local36).aClass215_3.method5189(arg2);
						return;
					}
					Static295.method4601(arg0, arg1, arg3, arg4, arg5, local36.method5325(), arg2, arg6);
					return;
				}
			}
			return;
		}
		local36 = (Interface10) Static273.method4127(arg6, arg0, arg4);
		if (local36 == null) {
			return;
		}
		if (!(local36 instanceof Class3_Sub1_Sub1)) {
			@Pc(196) int local196 = local36.method5325();
			if (arg1 != 4 && arg1 != 5) {
				if (arg1 == 6) {
					Static295.method4601(arg0, 4, arg3, arg4, arg5 + 4, local196, arg2, arg6);
				} else if (arg1 == 7) {
					Static295.method4601(arg0, 4, arg3, arg4, (arg5 + 2 & 0x3) + 4, local196, arg2, arg6);
					return;
				} else if (arg1 == 8) {
					Static295.method4601(arg0, 4, arg3, arg4, arg5 + 4, local196, arg2, arg6);
					Static295.method4601(arg0, 4, arg3, arg4, (arg5 + 2 & 0x3) + 4, local196, arg2, arg6);
					return;
				}
				return;
			}
			Static295.method4601(arg0, 4, arg3, arg4, arg5, local196, arg2, arg6);
			return;
		}
		((Class3_Sub1_Sub1) local36).aClass215_1.method5189(arg2);
		return;
	}
}
