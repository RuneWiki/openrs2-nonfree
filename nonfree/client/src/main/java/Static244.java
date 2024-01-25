import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!pl", name = "B", descriptor = "Lclient!dp;")
	public static Class53 aClass53_115;

	@OriginalMember(owner = "client!pl", name = "P", descriptor = "Lclient!dp;")
	public static Class53 aClass53_116;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIILclient!c;IIZIII[I[III)I")
	public static int method4296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class27 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int[] arg10, @OriginalArg(12) int[] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 128; local11++) {
				Static27.anIntArrayArray28[local7][local11] = 0;
				Static339.anIntArrayArray215[local7][local11] = 99999999;
			}
		}
		@Pc(56) boolean local56;
		if (arg2 == 1) {
			local56 = Static102.method4780(arg9, arg13, arg12, arg8, arg1, arg5, arg6, arg3, arg0, arg4);
		} else if (arg2 == 2) {
			local56 = Static253.method4340(arg0, arg5, arg9, arg4, arg12, arg8, arg1, arg3, arg13, arg6);
		} else {
			local56 = Static285.method4906(arg12, arg1, arg4, arg3, arg0, arg2, arg6, arg8, arg9, arg13, arg5);
		}
		@Pc(91) int local91 = arg3 - 64;
		@Pc(95) int local95 = arg1 - 64;
		@Pc(97) int local97 = Static151.anInt2862;
		@Pc(99) int local99 = Static78.anInt1445;
		@Pc(107) int local107;
		@Pc(109) int local109;
		@Pc(116) int local116;
		if (!local56) {
			if (!arg7) {
				return -1;
			}
			local107 = Integer.MAX_VALUE;
			local109 = Integer.MAX_VALUE;
			for (local116 = arg0 - 10; local116 <= arg0 + 10; local116++) {
				for (@Pc(123) int local123 = arg12 - 10; local123 <= arg12 + 10; local123++) {
					@Pc(130) int local130 = local116 - local91;
					@Pc(134) int local134 = local123 - local95;
					if (local130 >= 0 && local134 >= 0 && local130 < 128 && local134 < 128 && Static339.anIntArrayArray215[local130][local134] < 100) {
						@Pc(159) int local159 = 0;
						if (arg0 > local116) {
							local159 = arg0 - local116;
						} else if (arg0 + arg8 - 1 < local116) {
							local159 = local116 + 1 - arg0 - arg8;
						}
						@Pc(191) int local191 = 0;
						if (local123 < arg12) {
							local191 = arg12 - local123;
						} else if (arg12 + arg13 - 1 < local123) {
							local191 = local123 + 1 - arg12 - arg13;
						}
						@Pc(227) int local227 = local191 * local191 + local159 * local159;
						if (local227 < local107 || local107 == local227 && Static339.anIntArrayArray215[local130][local134] < local109) {
							local99 = local123;
							local109 = Static339.anIntArrayArray215[local130][local134];
							local97 = local116;
							local107 = local227;
						}
					}
				}
			}
			if (local107 == Integer.MAX_VALUE) {
				return -1;
			}
		}
		if (local97 == arg3 && arg1 == local99) {
			return 0;
		}
		@Pc(295) byte local295 = 0;
		Static52.anIntArray112[0] = local97;
		local107 = local295 + 1;
		Static101.anIntArray258[0] = local99;
		@Pc(316) int local316;
		local109 = local316 = Static27.anIntArrayArray28[local97 - local91][local99 - local95];
		while (arg3 != local97 || arg1 != local99) {
			if (local316 != local109) {
				local316 = local109;
				Static52.anIntArray112[local107] = local97;
				Static101.anIntArray258[local107++] = local99;
			}
			if ((local109 & 0x2) != 0) {
				local97++;
			} else if ((local109 & 0x8) != 0) {
				local97--;
			}
			if ((local109 & 0x1) != 0) {
				local99++;
			} else if ((local109 & 0x4) != 0) {
				local99--;
			}
			local109 = Static27.anIntArrayArray28[local97 - local91][local99 - local95];
		}
		local116 = 0;
		while (local107-- > 0) {
			arg10[local116] = Static52.anIntArray112[local107];
			arg11[local116++] = Static101.anIntArray258[local107];
			if (arg10.length <= local116) {
				break;
			}
		}
		return local116;
	}

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "(Z)V")
	public static void method4298() {
		if (Static158.anIntArray634 != null) {
			return;
		}
		Static158.anIntArray634 = new int[65536];
		@Pc(19) double local19 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < 512; local23++) {
			@Pc(36) float local36 = ((float) (local23 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(45) float local45 = (float) (local23 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(47) int local47 = 0; local47 < 128; local47++) {
				@Pc(54) float local54 = (float) local47 / 128.0F;
				@Pc(56) float local56 = 0.0F;
				@Pc(58) float local58 = 0.0F;
				@Pc(60) float local60 = 0.0F;
				@Pc(64) float local64 = local36 / 60.0F;
				@Pc(67) int local67 = (int) local64;
				@Pc(71) int local71 = local67 % 6;
				@Pc(76) float local76 = local64 - (float) local67;
				@Pc(82) float local82 = (1.0F - local45) * local54;
				@Pc(90) float local90 = local54 * (1.0F - local45 * local76);
				@Pc(101) float local101 = (1.0F - local45 * (1.0F - local76)) * local54;
				if (local71 == 0) {
					local58 = local101;
					local56 = local54;
					local60 = local82;
				} else if (local71 == 1) {
					local60 = local82;
					local58 = local54;
					local56 = local90;
				} else if (local71 == 2) {
					local56 = local82;
					local58 = local54;
					local60 = local101;
				} else if (local71 == 3) {
					local56 = local82;
					local58 = local90;
					local60 = local54;
				} else if (local71 == 4) {
					local60 = local54;
					local56 = local101;
					local58 = local82;
				} else if (local71 == 5) {
					local56 = local54;
					local58 = local82;
					local60 = local90;
				}
				local56 = (float) Math.pow((double) local56, local19);
				local58 = (float) Math.pow((double) local58, local19);
				local60 = (float) Math.pow((double) local60, local19);
				@Pc(195) int local195 = (int) (local56 * 256.0F);
				@Pc(200) int local200 = (int) (local58 * 256.0F);
				@Pc(205) int local205 = (int) (local60 * 256.0F);
				@Pc(218) int local218 = (local200 << 8) + ((local195 << 16) + local205 - 16777216);
				Static158.anIntArray634[local21++] = local218;
			}
		}
	}

	@OriginalMember(owner = "client!pl", name = "h", descriptor = "(I)V")
	public static void method4299() {
		for (@Pc(12) Class20_Sub2 local12 = (Class20_Sub2) Static334.aClass109_7.method2948(); local12 != null; local12 = (Class20_Sub2) Static334.aClass109_7.method2939()) {
			local12.method448();
		}
	}
}
