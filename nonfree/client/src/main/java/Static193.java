import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "[Lclient!up;")
	public static final Class240[] aClass240Array5 = new Class240[30];

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(BIII[FII)V")
	public static void method5122(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 > 0 && !Static39.method920(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static39.method920(arg2)) {
			@Pc(29) int local29 = Static265.method3997(6408);
			@Pc(31) int local31 = 0;
			@Pc(42) int local42 = arg2 > arg0 ? arg0 : arg2;
			@Pc(46) int local46 = arg0 >> 1;
			@Pc(50) int local50 = arg2 >> 1;
			@Pc(52) float[] local52 = arg3;
			@Pc(67) float[] local67 = new float[local29 * local50 * local46];
			while (true) {
				OpenGL.glTexImage2Df(3553, local31, 34842, arg0, arg2, 0, 6408, 5126, local52, 0);
				if (local42 <= 1) {
					return;
				}
				@Pc(86) int local86 = local29 * arg0;
				for (@Pc(88) int local88 = 0; local88 < local29; local88++) {
					@Pc(91) int local91 = local88;
					@Pc(93) int local93 = local88;
					@Pc(97) int local97 = local86 + local88;
					for (@Pc(99) int local99 = 0; local99 < local50; local99++) {
						for (@Pc(102) int local102 = 0; local102 < local46; local102++) {
							@Pc(107) float local107 = local52[local93];
							local93 += local29;
							@Pc(117) float local117 = local107 + local52[local93];
							@Pc(123) float local123 = local117 + local52[local97];
							local93 += local29;
							local97 += local29;
							@Pc(137) float local137 = local123 + local52[local97];
							local67[local91] = local137 * 0.25F;
							local97 += local29;
							local91 += local29;
						}
						local93 += local86;
						local97 += local86;
					}
				}
				@Pc(177) float[] local177 = local67;
				local67 = local52;
				arg0 = local46;
				arg2 = local50;
				local52 = local177;
				local42 >>= 0x1;
				local50 >>= 0x1;
				local46 >>= 0x1;
				local31++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Z)V")
	public static void method5123() {
		if (Static212.aClass238_2 != Static356.aClass238_6) {
			try {
				Static462.method4867(Static107.aClient1, "tbrefresh");
			} catch (@Pc(19) Throwable local19) {
			}
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lclient!eo;IIIZ)V")
	public static void method5124(@OriginalArg(0) Class68 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(6) int local6 = arg0.anInt2178;
		if (arg0.aByte35 == 0) {
			arg0.anInt2178 = arg0.anInt2157;
		} else if (arg0.aByte35 == 1) {
			arg0.anInt2178 = arg1 - arg0.anInt2157;
		} else if (arg0.aByte35 == 2) {
			arg0.anInt2178 = arg1 * arg0.anInt2157 >> 14;
		}
		@Pc(45) int local45 = arg0.lb;
		if (arg0.aByte38 == 0) {
			arg0.lb = arg0.anInt2200;
		} else if (arg0.aByte38 == 1) {
			arg0.lb = arg2 - arg0.anInt2200;
		} else if (arg0.aByte38 == 2) {
			arg0.lb = arg2 * arg0.anInt2200 >> 14;
		}
		if (arg0.aByte35 == 4) {
			arg0.anInt2178 = arg0.lb * arg0.anInt2203 / arg0.anInt2199;
		}
		if (arg0.aByte38 == 4) {
			arg0.lb = arg0.anInt2199 * arg0.anInt2178 / arg0.anInt2203;
		}
		if (Static176.aBoolean278 && (Static56.method1160(arg0).anInt4282 != 0 || arg0.anInt2182 == 0)) {
			if (arg0.lb < 5 && arg0.anInt2178 < 5) {
				arg0.lb = 5;
				arg0.anInt2178 = 5;
			} else {
				if (arg0.anInt2178 <= 0) {
					arg0.anInt2178 = 5;
				}
				if (arg0.lb <= 0) {
					arg0.lb = 5;
				}
			}
		}
		if (Static27.anInt769 == arg0.anInt2211) {
			Static294.aClass68_10 = arg0;
		}
		if (arg3 && arg0.anObjectArray13 != null && (arg0.anInt2178 != local6 || arg0.lb != local45)) {
			@Pc(193) Class3_Sub20 local193 = new Class3_Sub20();
			local193.anObjectArray35 = arg0.anObjectArray13;
			local193.aClass68_4 = arg0;
			Static392.aClass229_44.method5321(local193);
		}
	}
}
