import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!ki", name = "x", descriptor = "J")
	public static long aLong140 = 0L;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!r;IIIIILclient!fa;)V")
	public static void method4275(@OriginalArg(0) Class31 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Interface4 arg5) {
		if (Static111.anInt2675 < 100) {
			Static21.method220(arg5, arg0);
		}
		arg0.da(arg2, arg4, arg2 + arg3, arg4 + arg1);
		@Pc(34) int local34;
		@Pc(45) int local45;
		if (Static111.anInt2675 < 100) {
			local34 = arg2 + arg3 / 2;
			local45 = arg4 + arg1 / 2 - 20 - 18;
			arg0.J(arg2, arg4, arg3, arg1, -16777216, 0);
			arg0.method8035(local34 - 152, local45, 304, 34, Static17.aColorArray4[Static6.anInt44].getRGB(), 0);
			arg0.J(local34 - 150, local45 - -2, Static111.anInt2675 * 3, 30, Static330.aColorArray3[Static6.anInt44].getRGB(), 0);
			Static465.aClass63_10.method6878(local45 + 20, -1, Static538.aColorArray5[Static6.anInt44].getRGB(), Static573.aClass350_22.method7730(Static201.anInt4321), local34);
			return;
		}
		@Pc(109) int local109 = Static79.anInt2117 - (int) ((float) arg3 / Static157.aFloat71);
		local34 = Static461.anInt8061 + (int) ((float) arg1 / Static157.aFloat71);
		local45 = (int) ((float) arg3 / Static157.aFloat71) + Static79.anInt2117;
		Static454.anInt7931 = Static461.anInt8061 - (int) ((float) arg1 / Static157.aFloat71);
		@Pc(143) int local143 = Static461.anInt8061 - (int) ((float) arg1 / Static157.aFloat71);
		Static228.anInt4656 = (int) ((float) (arg1 * 2) / Static157.aFloat71);
		Static454.anInt7940 = (int) ((float) (arg3 * 2) / Static157.aFloat71);
		Static585.anInt10112 = Static79.anInt2117 - (int) ((float) arg3 / Static157.aFloat71);
		Static157.method2235(local109 + Static157.anInt2670, Static157.anInt2671 + local34, local45 + Static157.anInt2670, local143 - -Static157.anInt2671, arg2, arg4, arg2 + arg3, arg1 + 1 + arg4);
		Static157.method2251(arg0);
		@Pc(198) Class244 local198 = Static157.method2246(arg0);
		Static330.method4877(local198, arg0);
		if (Static438.anInt4270 > 0) {
			Static21.anInt211--;
			if (Static21.anInt211 == 0) {
				Static21.anInt211 = 20;
				Static438.anInt4270--;
			}
		}
		if (!Static306.aBoolean385) {
			return;
		}
		@Pc(237) int local237 = arg2 + arg3 - 5;
		@Pc(243) int local243 = arg1 + arg4 - 8;
		Static2.aClass63_1.method6879(local243, -1, local237, 16776960, "Fps:" + Static180.anInt3953);
		@Pc(258) int local258 = local243 - 15;
		@Pc(260) Runtime local260 = Runtime.getRuntime();
		@Pc(270) int local270 = (int) ((local260.totalMemory() - local260.freeMemory()) / 1024L);
		@Pc(272) int local272 = 16776960;
		if (local270 > 65536) {
			local272 = 16711680;
		}
		Static2.aClass63_1.method6879(local258, -1, local237, local272, "Mem:" + local270 + "k");
		local243 = local258 - 15;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)[Lclient!hga;")
	public static Class123[] method4276() {
		return new Class123[] { Static565.aClass123_311, Static563.aClass123_223, Static550.aClass123_305, Static361.aClass123_212, Static365.aClass123_216, Static307.aClass123_193, Static52.aClass123_39, Static223.aClass123_150, Static515.aClass123_283, Static15.aClass123_14, Static228.aClass123_151, Static79.aClass123_59, Static525.aClass123_287, Static43.aClass123_36, Static267.aClass123_173, Static86.aClass123_66, Static99.aClass123_77, Static311.aClass123_194, Static18.aClass123_15, Static354.aClass123_208, Static190.aClass123_142, Static44.aClass123_326, Static447.aClass123_259, Static28.aClass123_29, Static150.aClass123_112, Static325.aClass123_200, Static137.aClass123_106, Static262.aClass123_169, Static187.aClass123_140, Static279.aClass123_182, Static149.aClass123_111, Static106.aClass123_88, Static403.aClass123_234, Static434.aClass123_251, Static406.aClass123_236, Static32.aClass123_103, Static125.aClass123_95, Static101.aClass123_86, Static154.aClass123_115, Static58.aClass123_46, Static244.aClass123_160, Static258.aClass123_168, Static4.aClass123_4, Static212.aClass123_197, Static62.aClass123_51, Static136.aClass123_105, Static593.aClass123_327, Static467.aClass123_266, Static332.aClass123_45, Static400.aClass123_232, Static527.aClass123_325, Static24.aClass123_21, Static168.aClass123_123, Static123.aClass123_94, Static37.aClass123_33, Static495.aClass123_276, Static566.aClass123_312, Static220.aClass123_149, Static472.aClass123_270, Static101.aClass123_85, Static81.aClass123_61, Static407.aClass123_239, Static351.aClass123_206, Static569.aClass123_313, Static452.aClass123_262, Static351.aClass123_205, Static313.aClass123_196, Static376.aClass123_221, Static219.aClass123_148, Static547.aClass123_304, Static521.aClass123_286, Static167.aClass123_227, Static542.aClass123_300, Static390.aClass123_230, Static426.aClass123_245, Static99.aClass123_78, Static531.aClass123_290, Static133.aClass123_100, Static229.aClass123_153, Static9.aClass123_13, Static22.aClass123_19, Static9.aClass123_12, Static254.aClass123_165, Static210.aClass123_302, Static569.aClass123_314, Static581.aClass123_323, Static538.aClass123_296, Static350.aClass123_204, Static18.aClass123_16, Static489.aClass123_291, Static413.aClass123_243, Static122.aClass123_93, Static74.aClass123_58, Static132.aClass123_98, Static341.aClass123_202, Static357.aClass123_211, Static580.aClass123_322, Static297.aClass123_281, Static470.aClass123_268, Static7.aClass123_5, Static93.aClass123_69, Static109.aClass123_89, Static550.aClass123_306, Static178.aClass123_132, Static526.aClass123_288, Static321.aClass123_198, Static357.aClass123_210, Static263.aClass123_170, Static248.aClass123_162, Static34.aClass123_99, Static403.aClass123_235, Static65.aClass123_54, Static330.aClass123_201, Static32.aClass123_104, Static229.aClass123_152, Static277.aClass123_179, Static572.aClass123_316, Static134.aClass123_101 };
	}
}
