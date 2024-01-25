import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!jp", name = "G", descriptor = "I")
	public static int anInt4643;

	@OriginalMember(owner = "client!jp", name = "J", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_200 = new Class296(64, 3);

	@OriginalMember(owner = "client!jp", name = "K", descriptor = "Z")
	public static boolean aBoolean319 = false;

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lclient!qa;IIIII)V")
	public static void method4041(@OriginalArg(0) Class122 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg0.N(arg1, arg3, arg1 + arg2, arg3 - -arg4);
		arg0.method7265(-16777216, arg4, arg1, arg2, arg3);
		if (Static385.anInt6975 < 100) {
			return;
		}
		@Pc(39) float local39 = (float) Static118.anInt816 / (float) Static118.anInt818;
		@Pc(41) int local41 = arg2;
		@Pc(43) int local43 = arg4;
		if (local39 < 1.0F) {
			local43 = (int) (local39 * (float) arg2);
		} else {
			local41 = (int) ((float) arg4 / local39);
		}
		@Pc(70) int local70 = arg1 + (arg2 - local41) / 2;
		@Pc(78) int local78 = arg3 + (arg4 - local43) / 2;
		if (Static234.aClass2_27 == null || Static234.aClass2_27.c() != arg2 || arg4 != Static234.aClass2_27.la()) {
			Static118.method826(Static118.anInt815, Static118.anInt813 + Static118.anInt816, Static118.anInt818 + Static118.anInt815, Static118.anInt813, local70, local78, local70 + local41, local43 + local78);
			Static118.method824(arg0);
			Static234.aClass2_27 = arg0.method7261(local70, local78, local41, local43, false);
		}
		Static234.aClass2_27.method7364(local70, local78);
		@Pc(130) int local130 = Static135.anInt2650 * local41 / Static118.anInt818;
		@Pc(136) int local136 = local43 * Static431.anInt7507 / Static118.anInt816;
		@Pc(144) int local144 = Static56.anInt1112 * local41 / Static118.anInt818 + local70;
		@Pc(156) int local156 = local43 + local78 - local43 * Static388.anInt7030 / Static118.anInt816 - local136;
		@Pc(158) int local158 = -1996554240;
		if (Static304.aClass101_1 == Static542.aClass101_4) {
			local158 = -1996488705;
		}
		arg0.f(local144, local156, local130, local136, local158, 1);
		arg0.method7282(local144, local156, local130, local136, local158, 0);
		if (Static546.anInt2811 <= 0) {
			return;
		}
		@Pc(196) int local196;
		if (Static99.anInt1989 > 50) {
			local196 = 500 - Static99.anInt1989 * 5;
		} else {
			local196 = Static99.anInt1989 * 5;
		}
		for (@Pc(207) Class1_Sub39 local207 = (Class1_Sub39) Static118.aClass37_11.method977(); local207 != null; local207 = (Class1_Sub39) Static118.aClass37_11.method971()) {
			@Pc(215) Class30 local215 = Static118.aClass272_2.method6380(local207.anInt7253);
			if (Static300.method4761(local215)) {
				@Pc(244) int local244;
				@Pc(256) int local256;
				if (Static361.anInt6368 == local207.anInt7253) {
					local244 = local41 * local207.anInt7249 / Static118.anInt818 + local70;
					local256 = local43 * (Static118.anInt816 - local207.anInt7250) / Static118.anInt816 + local78;
					arg0.method7265(local196 << 24 | 0xFFFF00, 4, local244 - 2, 4, local256 - 2);
				} else if (Static299.anInt5548 != -1 && Static299.anInt5548 == local215.anInt871) {
					local244 = local70 + local41 * local207.anInt7249 / Static118.anInt818;
					local256 = local78 + local43 * (Static118.anInt816 - local207.anInt7250) / Static118.anInt816;
					arg0.method7265(local196 << 24 | 0xFFFF00, 4, local244 - 2, 4, local256 - 2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(B)V")
	public static void method4043() {
		Static97.aClass1_Sub6_Sub2_1.method3972();
		@Pc(15) int local15 = Static97.aClass1_Sub6_Sub2_1.method3976(8);
		@Pc(24) int local24;
		if (local15 < Static157.anInt4503) {
			for (local24 = local15; local24 < Static157.anInt4503; local24++) {
				Static305.anIntArray559[Static493.anInt8167++] = Static427.anIntArray711[local24];
			}
		}
		if (Static157.anInt4503 < local15) {
			throw new RuntimeException("gnpov1");
		}
		Static157.anInt4503 = 0;
		for (local24 = 0; local24 < local15; local24++) {
			@Pc(64) int local64 = Static427.anIntArray711[local24];
			@Pc(72) Class49_Sub2_Sub2_Sub2 local72 = ((Class1_Sub17) Static380.aClass17_29.method738((long) local64)).aClass49_Sub2_Sub2_Sub2_2;
			@Pc(79) int local79 = Static97.aClass1_Sub6_Sub2_1.method3976(1);
			if (local79 == 0) {
				Static427.anIntArray711[Static157.anInt4503++] = local64;
				local72.anInt4300 = Static436.anInt6850;
			} else {
				@Pc(102) int local102 = Static97.aClass1_Sub6_Sub2_1.method3976(2);
				if (local102 == 0) {
					Static427.anIntArray711[Static157.anInt4503++] = local64;
					local72.anInt4300 = Static436.anInt6850;
					Static344.anIntArray616[Static545.anInt9167++] = local64;
				} else {
					@Pc(147) int local147;
					@Pc(157) int local157;
					if (local102 == 1) {
						Static427.anIntArray711[Static157.anInt4503++] = local64;
						local72.anInt4300 = Static436.anInt6850;
						local147 = Static97.aClass1_Sub6_Sub2_1.method3976(3);
						local72.method3805(local147, 1);
						local157 = Static97.aClass1_Sub6_Sub2_1.method3976(1);
						if (local157 == 1) {
							Static344.anIntArray616[Static545.anInt9167++] = local64;
						}
					} else if (local102 == 2) {
						Static427.anIntArray711[Static157.anInt4503++] = local64;
						local72.anInt4300 = Static436.anInt6850;
						if (Static97.aClass1_Sub6_Sub2_1.method3976(1) == 1) {
							local147 = Static97.aClass1_Sub6_Sub2_1.method3976(3);
							local72.method3805(local147, 2);
							local157 = Static97.aClass1_Sub6_Sub2_1.method3976(3);
							local72.method3805(local157, 2);
						} else {
							local147 = Static97.aClass1_Sub6_Sub2_1.method3976(3);
							local72.method3805(local147, 0);
						}
						local147 = Static97.aClass1_Sub6_Sub2_1.method3976(1);
						if (local147 == 1) {
							Static344.anIntArray616[Static545.anInt9167++] = local64;
						}
					} else if (local102 == 3) {
						Static305.anIntArray559[Static493.anInt8167++] = local64;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(BIIIIIIIII)V")
	public static void method4044(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg8 == arg5 && arg0 == arg3 && arg2 == arg7 && arg1 == arg4) {
			Static423.method6197(arg8, arg0, arg1, arg7, arg6);
			return;
		}
		@Pc(31) int local31 = arg8;
		@Pc(33) int local33 = arg0;
		@Pc(37) int local37 = arg8 * 3;
		@Pc(41) int local41 = arg0 * 3;
		@Pc(45) int local45 = arg5 * 3;
		@Pc(49) int local49 = arg3 * 3;
		@Pc(53) int local53 = arg2 * 3;
		@Pc(57) int local57 = arg4 * 3;
		@Pc(68) int local68 = arg7 + local45 - arg8 - local53;
		@Pc(77) int local77 = arg1 + local49 - local57 - arg0;
		@Pc(87) int local87 = local53 + local37 - local45 - local45;
		@Pc(98) int local98 = local57 + local41 - local49 - local49;
		@Pc(103) int local103 = local45 - local37;
		@Pc(108) int local108 = local49 - local41;
		for (@Pc(110) int local110 = 128; local110 <= 4096; local110 += 128) {
			@Pc(118) int local118 = local110 * local110 >> 12;
			@Pc(124) int local124 = local118 * local110 >> 12;
			@Pc(128) int local128 = local124 * local68;
			@Pc(132) int local132 = local124 * local77;
			@Pc(136) int local136 = local87 * local118;
			@Pc(140) int local140 = local98 * local118;
			@Pc(144) int local144 = local103 * local110;
			@Pc(148) int local148 = local108 * local110;
			@Pc(158) int local158 = (local128 + local136 + local144 >> 12) + arg8;
			@Pc(168) int local168 = (local148 + local132 + local140 >> 12) + arg0;
			Static423.method6197(local31, local33, local168, local158, arg6);
			local31 = local158;
			local33 = local168;
		}
	}
}
