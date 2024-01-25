import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!hk", name = "Db", descriptor = "[I")
	public static final int[] anIntArray189 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!hk", name = "Hb", descriptor = "I")
	public static int anInt3012 = 0;

	@OriginalMember(owner = "client!hk", name = "Ib", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_129 = new Class22(100, 6);

	@OriginalMember(owner = "client!hk", name = "t", descriptor = "(I)[Lclient!bg;")
	public static Class22[] method2553() {
		return new Class22[] { Static11.aClass22_16, Static82.aClass22_80, Static233.aClass22_195, Static409.aClass22_325, Static435.aClass22_328, Static3.aClass22_185, Static372.aClass22_290, Static324.aClass22_261, Static230.aClass22_194, Static376.aClass22_286, Static302.aClass22_248, Static390.aClass22_292, Static279.aClass22_330, Static195.aClass22_167, Static12.aClass22_17, Static423.aClass22_317, Static187.aClass22_159, Static423.aClass22_316, Static27.aClass22_33, Static234.aClass22_199, Static119.aClass22_106, Static239.aClass22_203, Static302.aClass22_247, Static233.aClass22_196, Static135.aClass22_120, Static421.aClass22_310, Static42.aClass22_46, Static223.aClass22_191, Static107.aClass22_96, Static452.aClass22_335, Static48.aClass22_53, Static422.aClass22_313, Static115.aClass22_102, Static49.aClass22_98, Static296.aClass22_241, Static74.aClass22_72, Static214.aClass22_178, Static199.aClass22_173, Static262.aClass22_219, Static106.aClass22_95, Static24.aClass22_245, Static320.aClass22_263, Static201.aClass22_273, Static210.aClass22_175, Static225.aClass22_192, Static1.aClass22_1, Static172.aClass22_150, Static146.aClass22_23, Static178.aClass22_152, Static332.aClass22_269, Static431.aClass22_324, Static287.aClass22_236, Static278.aClass22_232, Static379.aClass22_293, Static169.aClass22_146, Static310.aClass22_251, Static287.aClass22_235, Static164.aClass22_204, Static422.aClass22_312, Static43.aClass22_332, Static399.aClass22_301, Static257.aClass22_212, Static131.aClass22_117, Static352.aClass22_282, Static396.aClass22_214, Static434.aClass22_336, Static369.aClass22_287, Static194.aClass22_164, Static329.aClass22_264, Static41.aClass22_45, Static311.aClass22_252, Static75.aClass22_73, Static245.aClass22_205, Static424.aClass22_319, Static352.aClass22_281, Static421.aClass22_311, Static345.aClass22_278, Static72.aClass22_71, Static154.aClass22_51, Static189.aClass22_160, Static330.aClass22_266, Static4.aClass22_277, Static8.aClass22_11, Static207.aClass22_253, Static261.aClass22_218, Static331.aClass22_268, Static265.aClass22_223, Static26.aClass22_32, Static401.aClass22_302, Static7.aClass22_254, Static184.aClass22_157, Static143.aClass22_125, Static167.aClass22_144, Static272.aClass22_230, Static406.aClass22_307, Static105.aClass22_94, Static406.aClass22_306, Static236.aClass22_200, Static277.aClass22_231, Static60.aClass22_63, aClass22_129, Static443.aClass22_331, Static254.aClass22_209, Static433.aClass22_327, Static113.aClass22_101, Static305.aClass22_249, Static360.aClass22_284, Static433.aClass22_326, Static45.aClass22_49, Static399.aClass22_300 };
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!ya;B)V")
	public static void method2554(@OriginalArg(0) Class19 arg0) {
		if (Static299.aBoolean481) {
			Static305.method4129(arg0);
		} else {
			Static293.method4033(arg0);
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!lh;I)V")
	public static void method2555(@OriginalArg(0) Class16_Sub1_Sub5_Sub1 arg0) {
		@Pc(17) Class4_Sub8 local17 = (Class4_Sub8) Static341.aClass102_38.method2700((long) arg0.anInt6037);
		if (local17 == null) {
			Static126.method2264(arg0.anIntArray426[0], null, arg0, arg0.anIntArray427[0], 0, arg0.aByte82, null);
		} else {
			local17.method638();
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIII)V")
	public static void method2558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) Class155 local12 = Static1.aClass155ArrayArray1[arg0][arg1];
		Static223.method3431(local12 == null ? Static47.aClass155_1 : local12, arg2);
	}
}
