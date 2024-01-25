import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!gm", name = "K", descriptor = "[I")
	public static final int[] anIntArray172 = new int[1];

	@OriginalMember(owner = "client!gm", name = "O", descriptor = "I")
	public static int anInt2407 = 0;

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "([[[Lclient!kf;I)V")
	public static void method2030(@OriginalArg(0) Class137[][][] arg0) {
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			@Pc(17) Class137[][] local17 = arg0[local11];
			for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
				for (@Pc(23) int local23 = 0; local23 < local17[local19].length; local23++) {
					@Pc(31) Class137 local31 = local17[local19][local23];
					if (local31 != null) {
						if (local31.aClass47_Sub5_1 instanceof Interface11) {
							((Interface11) local31.aClass47_Sub5_1).method5745();
						}
						if (local31.aClass47_Sub4_1 instanceof Interface11) {
							((Interface11) local31.aClass47_Sub4_1).method5745();
						}
						if (local31.aClass47_Sub4_2 instanceof Interface11) {
							((Interface11) local31.aClass47_Sub4_2).method5745();
						}
						if (local31.aClass47_Sub2_1 instanceof Interface11) {
							((Interface11) local31.aClass47_Sub2_1).method5745();
						}
						if (local31.aClass47_Sub2_2 instanceof Interface11) {
							((Interface11) local31.aClass47_Sub2_2).method5745();
						}
						for (@Pc(81) Class167 local81 = local31.aClass167_1; local81 != null; local81 = local81.aClass167_2) {
							@Pc(86) Class47_Sub1 local86 = local81.aClass47_Sub1_2;
							if (local86 instanceof Interface11) {
								((Interface11) local86).method5745();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILclient!qa;IIII)V")
	public static void method2032(@OriginalArg(0) int arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg1.pa(arg4, arg3, arg4 + arg0, arg3 - -arg2);
		arg1.method4600(arg0, arg4, -16777216, arg2, arg3);
		if (Static346.anInt6354 < 100) {
			return;
		}
		@Pc(37) float local37 = (float) Static350.anInt6633 / (float) Static350.anInt6635;
		@Pc(39) int local39 = arg0;
		@Pc(41) int local41 = arg2;
		if (local37 < 1.0F) {
			local41 = (int) (local37 * (float) arg0);
		} else {
			local39 = (int) ((float) arg2 / local37);
		}
		@Pc(67) int local67 = arg3 + (arg2 - local41) / 2;
		@Pc(76) int local76 = arg4 + (arg0 - local39) / 2;
		if (Static265.aClass78_16 == null || Static265.aClass78_16.UA() != arg0 || arg2 != Static265.aClass78_16.qa()) {
			Static350.method5179(Static350.anInt6639, Static350.anInt6636 + Static350.anInt6633, Static350.anInt6639 + Static350.anInt6635, Static350.anInt6636, local76, local67, local39 + local76, local67 + local41);
			Static350.method5197(arg1);
			Static265.aClass78_16 = arg1.method4627(local76, local67, local39, local41, false);
		}
		Static265.aClass78_16.method6003(local76, local67);
		@Pc(127) int local127 = Static205.anInt4952 * local39 / Static350.anInt6635;
		@Pc(143) int local143 = Static204.anInt3638 * local41 / Static350.anInt6633;
		@Pc(152) int local152 = local76 + local39 * Static239.anInt4208 / Static350.anInt6635;
		@Pc(167) int local167 = local67 + local41 - local143 - local41 * Static264.anInt4473 / Static350.anInt6633;
		@Pc(169) int local169 = -1996554240;
		if (Static325.aClass169_2 == Static92.aClass169_1) {
			local169 = -1996488705;
		}
		arg1.NA(local152, local167, local127, local143, local169, 1);
		arg1.method4639(local152, local167, local127, local143, local169, 0);
		if (Static309.anInt5223 <= 0) {
			return;
		}
		@Pc(202) int local202;
		if (Static203.anInt2040 <= 50) {
			local202 = Static203.anInt2040 * 5;
		} else {
			local202 = 500 - Static203.anInt2040 * 5;
		}
		for (@Pc(216) Class1_Sub8 local216 = (Class1_Sub8) Static350.aClass142_46.method3199(); local216 != null; local216 = (Class1_Sub8) Static350.aClass142_46.method3198()) {
			@Pc(224) Class52 local224 = Static350.aClass103_4.method2055(local216.anInt1168);
			if (Static441.method5915(local224)) {
				@Pc(241) int local241;
				@Pc(253) int local253;
				if (Static131.anInt2418 == local216.anInt1168) {
					local241 = local216.anInt1163 * local39 / Static350.anInt6635 + local76;
					local253 = local67 + (Static350.anInt6633 - local216.anInt1160) * local41 / Static350.anInt6633;
					arg1.method4600(4, local241 - 2, local202 << 24 | 0xFFFF00, 4, local253 - 2);
				} else if (Static347.anInt6360 != -1 && Static347.anInt6360 == local224.anInt1179) {
					local241 = local216.anInt1163 * local39 / Static350.anInt6635 + local76;
					local253 = local67 + (Static350.anInt6633 - local216.anInt1160) * local41 / Static350.anInt6633;
					arg1.method4600(4, local241 - 2, local202 << 24 | 0xFFFF00, 4, local253 - 2);
				}
			}
		}
	}
}
