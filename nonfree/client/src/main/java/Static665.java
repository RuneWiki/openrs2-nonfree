import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static665 {

	@OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
	public static int anInt10879;

	@OriginalMember(owner = "client!wb", name = "r", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_273 = new Class251(16, -1);

	@OriginalMember(owner = "client!wb", name = "x", descriptor = "Z")
	public static boolean aBoolean758 = false;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)[Lclient!ho;")
	public static Class160[] method9231() {
		return new Class160[] { Static427.aClass160_191, Static553.aClass160_229, Static622.aClass160_260, Static188.aClass160_93, Static249.aClass160_134, Static624.aClass160_262, Static532.aClass160_224, Static142.aClass160_63, Static558.aClass160_233, Static563.aClass160_138, Static613.aClass160_257, Static421.aClass160_188, Static597.aClass160_252, Static478.aClass160_205, Static127.aClass160_284, Static155.aClass160_65, Static282.aClass160_149, Static558.aClass160_232, Static520.aClass160_222, Static390.aClass160_179, Static557.aClass160_218, Static209.aClass160_283, Static509.aClass160_220, Static290.aClass160_153, Static60.aClass160_26, Static29.aClass160_8, Static20.aClass160_7, Static7.aClass160_1, Static552.aClass160_228, Static184.aClass160_197, Static157.aClass160_66, Static158.aClass160_67, Static34.aClass160_12, Static411.aClass160_185, Static593.aClass160_250, Static83.aClass160_36, Static82.aClass160_35, Static225.aClass160_111, Static180.aClass160_87, Static547.aClass160_124, Static685.aClass160_131, Static574.aClass160_238, Static128.aClass160_58, Static503.aClass160_217, Static655.aClass160_274, Static609.aClass160_256, Static653.aClass160_271, Static48.aClass160_18, Static601.aClass160_254, Static288.aClass160_150, Static56.aClass160_25, Static675.aClass160_279, Static40.aClass160_15, Static573.aClass160_237, Static681.aClass160_281, Static168.aClass160_77, Static219.aClass160_106, Static558.aClass160_231, Static299.aClass160_156, Static378.aClass160_176, Static104.aClass160_49, Static211.aClass160_104, Static222.aClass160_109, Static423.aClass160_189, Static186.aClass160_91, Static110.aClass160_50, Static17.aClass160_6, Static94.aClass160_48, Static481.aClass160_276, Static193.aClass160_249, Static358.aClass160_171, Static559.aClass160_234, Static165.aClass160_72, Static627.aClass160_264, Static260.aClass160_137, Static537.aClass160_227, Static671.aClass160_278, Static190.aClass160_95, Static228.aClass160_113, Static524.aClass160_246, Static624.aClass160_261, Static481.aClass160_275, Static239.aClass160_126, Static219.aClass160_107, Static334.aClass160_163, Static496.aClass160_208, Static326.aClass160_161, Static280.aClass160_146, Static544.aClass160_239, Static399.aClass160_181, Static586.aClass160_247, Static477.aClass160_204, Static63.aClass160_27, Static252.aClass160_135, Static487.aClass160_209, Static10.aClass160_5, Static519.aClass160_251, Static64.aClass160_28, Static408.aClass160_182, Static235.aClass160_125, Static497.aClass160_214, Static8.aClass160_3, Static175.aClass160_82, Static333.aClass160_259, Static290.aClass160_152, Static514.aClass160_221, Static644.aClass160_270, Static159.aClass160_68, Static614.aClass160_258, Static682.aClass160_282, Static10.aClass160_4, Static219.aClass160_108, Static190.aClass160_94, Static335.aClass160_164, Static72.aClass160_31, Static635.aClass160_267, Static433.aClass160_193, Static654.aClass160_272, Static243.aClass160_128, Static131.aClass160_59, Static116.aClass160_51, Static70.aClass160_29, Static146.aClass160_64, Static508.aClass160_219, Static440.aClass160_76, Static8.aClass160_2, Static383.aClass160_178, Static227.aClass160_112, Static491.aClass160_212, Static566.aClass160_236, Static265.aClass160_141, Static529.aClass160_223, Static469.aClass160_280, Static316.aClass160_160, Static183.aClass160_88, Static654.aClass160_273, Static427.aClass160_192, Static375.aClass160_266, Static174.aClass160_81, Static563.aClass160_139, Static241.aClass160_127, Static549.aClass160_33, Static563.aClass160_140 };
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)I")
	public static int method9232() {
		if ((double) Static224.aFloat11 == 3.0D) {
			return 37;
		} else if ((double) Static224.aFloat11 == 4.0D) {
			return 50;
		} else if ((double) Static224.aFloat11 == 6.0D) {
			return 75;
		} else if ((double) Static224.aFloat11 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IILclient!jc;)V")
	public static void method9233(@OriginalArg(0) int arg0, @OriginalArg(2) Class14_Sub21 arg1) {
		if (Static413.aClass243_3 == null) {
			return;
		}
		try {
			Static413.aClass243_3.method5982(0L);
			Static413.aClass243_3.method5976(24, arg1.aByteArray99, arg0);
		} catch (@Pc(14) Exception local14) {
		}
	}
}
