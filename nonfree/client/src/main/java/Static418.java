import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static418 {

	@OriginalMember(owner = "client!qaa", name = "Wb", descriptor = "Lclient!la;")
	public static Class64 aClass64_11;

	@OriginalMember(owner = "client!qaa", name = "Tb", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_215 = new Class235(89, -2);

	@OriginalMember(owner = "client!qaa", name = "Ub", descriptor = "[I")
	public static final int[] anIntArray560 = new int[32];

	@OriginalMember(owner = "client!qaa", name = "Vb", descriptor = "[I")
	public static final int[] anIntArray561 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!oda;")
	public static RuntimeException_Sub1 method5811(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString63 = local12.aString63 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!qaa", name = "r", descriptor = "(I)[Lclient!nea;")
	public static Class235[] method5812() {
		return new Class235[] { Static290.aClass235_153, Static116.aClass235_74, Static47.aClass235_34, Static143.aClass235_95, Static534.aClass235_269, Static52.aClass235_38, Static321.aClass235_171, Static95.aClass235_64, Static10.aClass235_10, Static493.aClass235_252, Static127.aClass235_88, Static458.aClass235_240, Static135.aClass235_93, Static340.aClass235_186, Static304.aClass235_160, Static48.aClass235_35, Static565.aClass235_286, Static568.aClass235_279, Static477.aClass235_245, Static4.aClass235_5, Static362.aClass235_119, Static351.aClass235_195, Static530.aClass235_266, Static408.aClass235_213, Static556.aClass235_277, Static514.aClass235_258, Static402.aClass235_211, Static351.aClass235_194, Static244.aClass235_138, Static347.aClass235_191, Static284.aClass235_148, Static526.aClass235_262, Static79.aClass235_48, Static442.aClass235_234, Static570.aClass235_281, Static330.aClass235_176, Static427.aClass235_219, Static486.aClass235_248, Static574.aClass235_283, Static122.aClass235_79, Static335.aClass235_182, Static290.aClass235_152, Static125.aClass235_84, Static509.aClass235_163, Static194.aClass235_112, Static87.aClass235_165, Static112.aClass235_73, Static585.aClass235_292, Static499.aClass235_123, Static149.aClass235_96, Static229.aClass235_127, Static434.aClass235_230, Static541.aClass235_272, Static135.aClass235_92, Static364.aClass235_200, Static31.aClass235_21, Static93.aClass235_62, Static592.aClass235_295, Static164.aClass235_274, Static42.aClass235_32, Static585.aClass235_293, Static83.aClass235_51, Static500.aClass235_273, Static131.aClass235_90, Static87.aClass235_164, Static397.aClass235_294, Static339.aClass235_184, Static306.aClass235_137, Static42.aClass235_33, Static222.aClass235_125, Static428.aClass235_221, Static93.aClass235_61, Static275.aClass235_144, Static25.aClass235_17, Static344.aClass235_189, Static298.aClass235_157, Static336.aClass235_183, Static161.aClass235_99, Static478.aClass235_270, Static527.aClass235_263, Static459.aClass235_242, Static99.aClass235_181, Static456.aClass235_239, Static86.aClass235_54, Static553.aClass235_276, Static580.aClass235_288, Static288.aClass235_151, Static27.aClass235_18, Static427.aClass235_220, aClass235_215, Static194.aClass235_113, Static12.aClass235_158, Static162.aClass235_100, Static107.aClass235_50, Static586.aClass235_208, Static584.aClass235_290, Static440.aClass235_232, Static102.aClass235_66, Static229.aClass235_126, Static353.aClass235_196, Static438.aClass235_231, Static200.aClass235_117, Static78.aClass235_46, Static442.aClass235_233, Static532.aClass235_268, Static319.aClass235_170, Static315.aClass235_169, Static567.aClass235_278, Static232.aClass235_129, Static125.aClass235_85, Static243.aClass235_135, Static166.aClass235_102, Static271.aClass235_143, Static73.aClass235_30, Static197.aClass235_203, Static528.aClass235_264, Static198.aClass235_116 };
	}

	@OriginalMember(owner = "client!qaa", name = "j", descriptor = "(II)Lclient!kq;")
	public static Class8_Sub5 method5818(@OriginalArg(0) int arg0) {
		@Pc(7) Class209[] local7 = Class318.aClass209Array1;
		synchronized (Class318.aClass209Array1) {
			@Pc(28) Class8_Sub5 local28;
			if (arg0 >= Class318.aClass209Array1.length || Class318.aClass209Array1[arg0].method4188()) {
				local28 = new Class8_Sub5();
				local28.aClass8_Sub4Array1 = new Class8_Sub4[arg0];
				for (@Pc(34) int local34 = 0; local34 < arg0; local34++) {
					local28.aClass8_Sub4Array1[local34] = new Class8_Sub4();
				}
			} else {
				local28 = (Class8_Sub5) Class318.aClass209Array1[arg0].method4189();
				local28.method7615();
				@Pc(67) int local67 = Static42.anIntArray83[arg0]--;
			}
			return local28;
		}
	}
}
