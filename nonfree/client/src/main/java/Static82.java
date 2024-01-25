import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!cq", name = "e", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_41 = new Class44(105, 6);

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIIIBII)V")
	public static void method1537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static248.method3660(arg4);
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg4 - arg2;
		if (local14 < 0) {
			local14 = 0;
		}
		@Pc(20) int local20 = arg4;
		@Pc(31) int local31 = -arg4;
		@Pc(33) int local33 = local14;
		@Pc(36) int local36 = -local14;
		@Pc(38) int local38 = -1;
		@Pc(40) int local40 = -1;
		@Pc(62) int local62;
		@Pc(71) int local71;
		@Pc(80) int local80;
		@Pc(89) int local89;
		if (arg1 >= Static468.anInt355 && arg1 <= Static370.anInt10475) {
			@Pc(54) int[] local54 = Static274.anIntArrayArray34[arg1];
			local62 = Static258.method3697(arg5 - arg4, Static575.anInt9879, Static313.anInt9045);
			local71 = Static258.method3697(arg5 + arg4, Static575.anInt9879, Static313.anInt9045);
			local80 = Static258.method3697(arg5 - local14, Static575.anInt9879, Static313.anInt9045);
			local89 = Static258.method3697(arg5 + local14, Static575.anInt9879, Static313.anInt9045);
			Static679.method9323(local54, local62, arg3, local80);
			Static679.method9323(local54, local80, arg0, local89);
			Static679.method9323(local54, local89, arg3, local71);
		}
		while (local20 > local10) {
			local40 += 2;
			local38 += 2;
			local36 += local40;
			local31 += local38;
			if (local36 >= 0 && local33 >= 1) {
				local33--;
				Static404.anIntArray538[local33] = local10;
				local36 -= local33 << 1;
			}
			local10++;
			@Pc(253) int local253;
			@Pc(262) int local262;
			@Pc(273) int[] local273;
			@Pc(154) int local154;
			if (local31 >= 0) {
				local20--;
				local31 -= local20 << 1;
				local154 = arg1 - local20;
				local62 = arg1 + local20;
				if (Static468.anInt355 <= local62 && local154 <= Static370.anInt10475) {
					if (local20 >= local14) {
						local71 = Static258.method3697(local10 + arg5, Static575.anInt9879, Static313.anInt9045);
						local80 = Static258.method3697(arg5 - local10, Static575.anInt9879, Static313.anInt9045);
						if (local62 <= Static370.anInt10475) {
							Static679.method9323(Static274.anIntArrayArray34[local62], local80, arg3, local71);
						}
						if (local154 >= Static468.anInt355) {
							Static679.method9323(Static274.anIntArrayArray34[local154], local80, arg3, local71);
						}
					} else {
						local71 = Static404.anIntArray538[local20];
						local80 = Static258.method3697(local10 + arg5, Static575.anInt9879, Static313.anInt9045);
						local89 = Static258.method3697(arg5 - local10, Static575.anInt9879, Static313.anInt9045);
						local253 = Static258.method3697(arg5 + local71, Static575.anInt9879, Static313.anInt9045);
						local262 = Static258.method3697(arg5 - local71, Static575.anInt9879, Static313.anInt9045);
						if (local62 <= Static370.anInt10475) {
							local273 = Static274.anIntArrayArray34[local62];
							Static679.method9323(local273, local89, arg3, local262);
							Static679.method9323(local273, local262, arg0, local253);
							Static679.method9323(local273, local253, arg3, local80);
						}
						if (Static468.anInt355 <= local154) {
							local273 = Static274.anIntArrayArray34[local154];
							Static679.method9323(local273, local89, arg3, local262);
							Static679.method9323(local273, local262, arg0, local253);
							Static679.method9323(local273, local253, arg3, local80);
						}
					}
				}
			}
			local154 = arg1 - local10;
			local62 = arg1 + local10;
			if (Static468.anInt355 <= local62 && Static370.anInt10475 >= local154) {
				local71 = local20 + arg5;
				local80 = arg5 - local20;
				if (local71 >= Static313.anInt9045 && Static575.anInt9879 >= local80) {
					local71 = Static258.method3697(local71, Static575.anInt9879, Static313.anInt9045);
					local80 = Static258.method3697(local80, Static575.anInt9879, Static313.anInt9045);
					if (local10 >= local14) {
						if (local62 <= Static370.anInt10475) {
							Static679.method9323(Static274.anIntArrayArray34[local62], local80, arg3, local71);
						}
						if (local154 >= Static468.anInt355) {
							Static679.method9323(Static274.anIntArrayArray34[local154], local80, arg3, local71);
						}
					} else {
						local89 = local10 <= local33 ? local33 : Static404.anIntArray538[local10];
						local253 = Static258.method3697(arg5 + local89, Static575.anInt9879, Static313.anInt9045);
						local262 = Static258.method3697(arg5 - local89, Static575.anInt9879, Static313.anInt9045);
						if (local62 <= Static370.anInt10475) {
							local273 = Static274.anIntArrayArray34[local62];
							Static679.method9323(local273, local80, arg3, local262);
							Static679.method9323(local273, local262, arg0, local253);
							Static679.method9323(local273, local253, arg3, local71);
						}
						if (Static468.anInt355 <= local154) {
							local273 = Static274.anIntArrayArray34[local154];
							Static679.method9323(local273, local80, arg3, local262);
							Static679.method9323(local273, local262, arg0, local253);
							Static679.method9323(local273, local253, arg3, local71);
						}
					}
				}
			}
		}
	}
}
