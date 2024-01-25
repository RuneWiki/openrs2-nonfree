import jagex3.jagmisc.jagmisc;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!jr", name = "o", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_52 = new Class146(40, -1);

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(ZII)V")
	public static void method2786(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			Static39.aClass135_1 = Static458.method5338(Static413.aClass49_Sub1_1.anInt3200 * 2, Static24.aClass196_1, Static391.aCanvas5, arg1, Static91.anInterface5_2);
		} else {
			if (arg0) {
				Static39.aClass135_1 = Static458.method5338(0, Static24.aClass196_1, Static391.aCanvas5, 0, Static91.anInterface5_2);
				Static39.aClass135_1.p(0);
				@Pc(27) Class158 local27 = Static259.method3463(Static57.aClass211_18, Static433.anInt7157);
				@Pc(36) Class123 local36 = Static39.aClass135_1.method5352(local27, Static465.method4468(Static13.aClass211_11, Static433.anInt7157));
				Static94.method4424(local36, Static243.aClass15_65.method180(Static429.anInt6999), true);
				Static39.aClass135_1.method5341();
				Static79.method1276();
				Static39.aClass135_1.method5332();
			}
			try {
				Static39.aClass135_1 = Static458.method5338(Static413.aClass49_Sub1_1.anInt3200 * 2, Static24.aClass196_1, Static391.aCanvas5, arg1, Static91.anInterface5_2);
				if (Static39.aClass135_1.method5364()) {
					@Pc(67) boolean local67 = true;
					try {
						local67 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(77) Throwable local77) {
					}
					@Pc(83) Class4_Sub39 local83;
					if (local67) {
						local83 = Static39.aClass135_1.method5381(146800640);
					} else {
						local83 = Static39.aClass135_1.method5381(104857600);
					}
					Static39.aClass135_1.method5333(local83);
				}
			} catch (@Pc(94) Throwable local94) {
				Static39.aClass135_1 = Static458.method5338(0, Static24.aClass196_1, Static391.aCanvas5, 0, Static91.anInterface5_2);
				arg1 = 0;
			}
		}
		Static341.anInt5549 = arg1;
		Static130.method1853();
		if (!Static39.aClass135_1.method5393()) {
			Static114.anInt2109 = 1;
		}
		Static39.aClass135_1.method5373(Static114.anInt2109);
		Static39.aClass135_1.method5335(0);
		Static39.aClass135_1.MA(8);
		Static423.aClass35_5 = Static39.aClass135_1.method5400();
		Static412.aClass35_4 = Static39.aClass135_1.method5400();
		Static157.method2230();
		Static39.aClass135_1.method5380(!Static413.aClass49_Sub1_1.aBoolean241);
		if (Static39.aClass135_1.method5346()) {
			Static350.method4638(Static413.aClass49_Sub1_1.aBoolean245);
		}
		Static165.method2303(Static39.aClass135_1, Static282.anInt4644 >> 3, Static337.anInt5497 >> 3);
		Static458.method5376();
		Static340.aBoolean392 = false;
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(Z)V")
	public static void method2788() {
		Static66.aClass67_5.method1431();
		Static309.aClass239_8.method5122();
		Static96.aClass239_5.method5122();
	}

	@OriginalMember(owner = "client!jr", name = "f", descriptor = "(I)[Lclient!dq;")
	public static Class56[] method2790() {
		return new Class56[] { Static39.aClass56_30, Static276.aClass56_169, Static399.aClass56_240, Static56.aClass56_43, Static318.aClass56_196, Static210.aClass56_127, Static173.aClass56_113, Static314.aClass56_193, Static140.aClass56_94, Static362.aClass56_219, Static151.aClass56_103, Static165.aClass56_109, Static22.aClass56_21, Static252.aClass56_148, Static330.aClass56_203, Static268.aClass56_162, Static183.aClass56_119, Static169.aClass56_112, Static268.aClass56_161, Static161.aClass56_108, Static209.aClass56_126, Static211.aClass56_128, Static367.aClass56_225, Static338.aClass56_207, Static456.aClass56_273, Static260.aClass56_274, Static440.aClass56_262, Static371.aClass56_218, Static55.aClass56_40, Static236.aClass56_139, Static306.aClass56_191, Static146.aClass56_97, Static359.aClass56_216, Static146.aClass56_98, Static234.aClass56_138, Static86.aClass56_65, Static30.aClass56_28, Static256.aClass56_154, Static253.aClass56_150, Static274.aClass56_167, Static100.aClass56_74, Static431.aClass56_263, Static105.aClass56_79, Static321.aClass56_197, Static108.aClass56_10, Static58.aClass56_46, Static55.aClass56_39, Static356.aClass56_215, Static93.aClass56_70, Static256.aClass56_153, Static186.aClass56_120, Static262.aClass56_178, Static218.aClass56_130, Static410.aClass56_246, Static23.aClass56_239, Static387.aClass56_233, Static105.aClass56_78, Static180.aClass56_116, Static288.aClass56_181, Static349.aClass56_210, Static408.aClass56_244, Static327.aClass56_200, Static83.aClass56_195, Static112.aClass56_85, Static368.aClass56_226, Static131.aClass56_91, Static29.aClass56_13, Static454.aClass56_270, Static285.aClass56_176, Static147.aClass56_99, Static133.aClass56_93, Static39.aClass56_31, Static429.aClass56_251, Static335.aClass56_205, Static243.aClass56_142, Static11.aClass56_11, Static414.aClass56_248, Static433.aClass56_258, Static55.aClass56_41, Static244.aClass56_143, Static79.aClass56_61, Static362.aClass56_220, Static255.aClass56_152, Static155.aClass56_105, Static60.aClass56_48, Static244.aClass56_144, Static285.aClass56_175, Static1.aClass56_1, Static429.aClass56_250, Static378.aClass56_245, Static280.aClass56_171, Static73.aClass56_58, Static157.aClass56_106, Static219.aClass56_132, Static455.aClass56_271, Static437.aClass56_260, Static24.aClass56_25, Static295.aClass56_184, Static114.aClass56_86, Static221.aClass56_134, Static189.aClass56_122, Static96.aClass56_71, Static115.aClass56_87, Static375.aClass56_228, Static366.aClass56_224, Static100.aClass56_75, Static85.aClass56_64, Static448.aClass56_264, Static126.aClass56_88, Static202.aClass56_125, Static281.aClass56_172 };
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(I[FIIIIB)V")
	public static void method2791(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg4 > 0 && !Static280.method3692(arg4)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static280.method3692(arg0)) {
			@Pc(31) int local31 = Static172.method2393(6408);
			@Pc(33) int local33 = 0;
			@Pc(44) int local44 = arg0 > arg4 ? arg4 : arg0;
			@Pc(53) int local53 = arg4 >> 1;
			@Pc(57) int local57 = arg0 >> 1;
			@Pc(59) float[] local59 = arg1;
			@Pc(66) float[] local66 = new float[local57 * local53 * local31];
			while (true) {
				OpenGL.glTexImage2Df(3553, local33, 34842, arg4, arg0, 0, 6408, 5126, local59, 0);
				if (local44 <= 1) {
					return;
				}
				@Pc(84) int local84 = arg4 * local31;
				@Pc(86) float[] local86 = local66;
				for (@Pc(88) int local88 = 0; local88 < local31; local88++) {
					@Pc(92) int local92 = local88;
					@Pc(94) int local94 = local88;
					@Pc(98) int local98 = local88 + local84;
					for (@Pc(100) int local100 = 0; local100 < local57; local100++) {
						for (@Pc(104) int local104 = 0; local104 < local53; local104++) {
							@Pc(110) float local110 = local59[local94];
							local94 += local31;
							@Pc(120) float local120 = local110 + local59[local94];
							@Pc(126) float local126 = local120 + local59[local98];
							local94 += local31;
							local98 += local31;
							@Pc(140) float local140 = local126 + local59[local98];
							local98 += local31;
							local66[local92] = local140 * 0.25F;
							local92 += local31;
						}
						local94 += local84;
						local98 += local84;
					}
				}
				local66 = local59;
				local59 = local86;
				arg4 = local53;
				arg0 = local57;
				local33++;
				local57 >>= 0x1;
				local53 >>= 0x1;
				local44 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
