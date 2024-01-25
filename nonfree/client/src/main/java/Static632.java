import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static632 {

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "Lclient!kha;")
	public static final Class201 aClass201_1 = new Class201();

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIIIIII)V")
	public static void method8411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 < 0 || arg0 < 0 || arg3 >= Static124.anInt2150 - 1 || Static64.anInt1015 - 1 <= arg0) {
			return;
		}
		if (Static129.aClass313ArrayArrayArray7 == null) {
			return;
		}
		@Pc(60) Interface10 local60;
		if (arg4 != 0) {
			if (arg4 != 1) {
				if (arg4 == 2) {
					local60 = (Interface10) Static156.method2369(arg5, arg3, arg0, ija.class);
					if (local60 == null) {
						return;
					}
					if (arg6 == 11) {
						arg6 = 10;
					}
					if (local60 instanceof Class41_Sub1_Sub1_Sub4) {
						((Class41_Sub1_Sub1_Sub4) local60).aClass205_3.method4789(arg2);
						return;
					}
					Static362.method5333(arg6, arg1, arg2, arg3, arg0, arg5, arg4, local60.method8668());
				} else if (arg4 == 3) {
					local60 = (Interface10) Static198.method2808(arg5, arg3, arg0);
					if (local60 != null) {
						if (!(local60 instanceof Class41_Sub1_Sub4_Sub1)) {
							Static362.method5333(arg6, arg1, arg2, arg3, arg0, arg5, arg4, local60.method8668());
							return;
						}
						((Class41_Sub1_Sub4_Sub1) local60).aClass205_2.method4789(arg2);
						return;
					}
				}
				return;
			}
			local60 = (Interface10) Static295.method4024(arg5, arg3, arg0);
			if (local60 != null) {
				if (!(local60 instanceof Class41_Sub1_Sub5_Sub2)) {
					@Pc(144) int local144 = local60.method8668();
					if (arg6 != 4 && arg6 != 5) {
						if (arg6 == 6) {
							Static362.method5333(4, arg1 + 4, arg2, arg3, arg0, arg5, arg4, local144);
						} else if (arg6 == 7) {
							Static362.method5333(4, (arg1 + 2 & 0x3) + 4, arg2, arg3, arg0, arg5, arg4, local144);
							return;
						} else if (arg6 == 8) {
							Static362.method5333(4, arg1 + 4, arg2, arg3, arg0, arg5, arg4, local144);
							Static362.method5333(4, (arg1 + 2 & 0x3) + 4, arg2, arg3, arg0, arg5, arg4, local144);
							return;
						}
						return;
					}
					Static362.method5333(4, arg1, arg2, arg3, arg0, arg5, arg4, local144);
					return;
				}
				((Class41_Sub1_Sub5_Sub2) local60).aClass205_1.method4789(arg2);
				return;
			}
			return;
		}
		local60 = (Interface10) Static322.method5015(arg5, arg3, arg0);
		@Pc(252) Interface10 local252 = (Interface10) Static195.method2767(arg5, arg3, arg0);
		if (local60 != null && arg6 != 2) {
			if (local60 instanceof Class41_Sub1_Sub3_Sub2) {
				((Class41_Sub1_Sub3_Sub2) local60).aClass205_4.method4789(arg2);
			} else {
				Static362.method5333(arg6, arg1, arg2, arg3, arg0, arg5, arg4, local60.method8668());
			}
		}
		if (local252 == null) {
			return;
		}
		if (local252 instanceof Class41_Sub1_Sub3_Sub2) {
			((Class41_Sub1_Sub3_Sub2) local252).aClass205_4.method4789(arg2);
			return;
		}
		Static362.method5333(arg6, arg1, arg2, arg3, arg0, arg5, arg4, local252.method8668());
		return;
	}
}
