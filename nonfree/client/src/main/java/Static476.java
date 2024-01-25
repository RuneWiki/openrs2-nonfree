import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static476 {

	@OriginalMember(owner = "client!qda", name = "G", descriptor = "I")
	public static int anInt8289;

	@OriginalMember(owner = "client!qda", name = "J", descriptor = "[Lclient!rca;")
	public static Class296[] aClass296Array1;

	@OriginalMember(owner = "client!qda", name = "I", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_106 = new Class100(24, 3);

	@OriginalMember(owner = "client!qda", name = "P", descriptor = "[I")
	public static final int[] anIntArray628 = new int[6];

	@OriginalMember(owner = "client!qda", name = "W", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_59 = new Class187(512);

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "([FIIIIII)V")
	public static void method6898(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 > 0 && !Static178.method2845(arg4)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static178.method2845(arg1)) {
			@Pc(39) int local39 = Static25.method477(6408);
			@Pc(41) int local41 = 0;
			@Pc(52) int local52 = arg1 > arg4 ? arg4 : arg1;
			@Pc(56) int local56 = arg4 >> 1;
			@Pc(60) int local60 = arg1 >> 1;
			@Pc(62) float[] local62 = arg0;
			@Pc(69) float[] local69 = new float[local56 * local60 * local39];
			while (true) {
				OpenGL.glTexImage2Df(3553, local41, 34842, arg4, arg1, 0, 6408, 5126, local62, 0);
				if (local52 <= 1) {
					return;
				}
				@Pc(89) int local89 = local39 * arg4;
				for (@Pc(91) int local91 = 0; local91 < local39; local91++) {
					@Pc(95) int local95 = local91;
					@Pc(97) int local97 = local91;
					@Pc(101) int local101 = local91 + local89;
					for (@Pc(103) int local103 = 0; local103 < local60; local103++) {
						for (@Pc(107) int local107 = 0; local107 < local56; local107++) {
							@Pc(113) float local113 = local62[local97];
							local97 += local39;
							@Pc(123) float local123 = local113 + local62[local97];
							@Pc(129) float local129 = local123 + local62[local101];
							local97 += local39;
							local101 += local39;
							@Pc(143) float local143 = local129 + local62[local101];
							local101 += local39;
							local69[local95] = local143 * 0.25F;
							local95 += local39;
						}
						local97 += local89;
						local101 += local89;
					}
				}
				@Pc(191) float[] local191 = local69;
				local69 = local62;
				local62 = local191;
				arg1 = local60;
				arg4 = local56;
				local41++;
				local60 >>= 0x1;
				local56 >>= 0x1;
				local52 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(IZILclient!ph;I)V")
	public static void method6899(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class14_Sub41 arg2, @OriginalArg(4) int arg3) {
		@Pc(16) long local16 = (long) (arg3 | arg1 << 14 | arg0 << 28);
		@Pc(22) Class14_Sub42 local22 = (Class14_Sub42) Static568.aClass187_71.method4078(local16);
		if (local22 == null) {
			local22 = new Class14_Sub42();
			Static568.aClass187_71.method4077(local16, local22);
			local22.aClass262_47.method6314(arg2);
			return;
		}
		@Pc(45) Class27 local45 = Static175.aClass247_2.method5962(arg2.anInt7971);
		@Pc(59) int local59 = local45.anInt921;
		if (local45.anInt901 == 1) {
			local59 *= arg2.anInt7970 + 1;
		}
		for (@Pc(78) Class14_Sub41 local78 = (Class14_Sub41) local22.aClass262_47.method6318(); local78 != null; local78 = (Class14_Sub41) local22.aClass262_47.method6311()) {
			local45 = Static175.aClass247_2.method5962(local78.anInt7971);
			@Pc(89) int local89 = local45.anInt921;
			if (local45.anInt901 == 1) {
				local89 *= local78.anInt7970 + 1;
			}
			if (local59 > local89) {
				Static149.method5515(arg2, local78);
				return;
			}
		}
		local22.aClass262_47.method6314(arg2);
	}
}
