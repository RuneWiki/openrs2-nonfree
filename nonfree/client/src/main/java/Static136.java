import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "[I")
	public static int[] anIntArray184;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!ri;BLclient!oi;Lclient!oi;Lclient!oi;)Z")
	public static boolean method1740(@OriginalArg(0) Class1_Sub9_Sub3 arg0, @OriginalArg(2) Class185 arg1, @OriginalArg(3) Class185 arg2, @OriginalArg(4) Class185 arg3) {
		Static293.aClass185_76 = arg2;
		Static337.aClass185_55 = arg1;
		Static49.aClass185_12 = arg3;
		Static181.aClass1_Sub9_Sub3_2 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
	public static void method1741() {
		Static456.aClass208_21.method4408();
		Static394.aClass208_36.method4408();
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!et;B)V")
	public static void method1742(@OriginalArg(0) Class11_Sub1_Sub3_Sub1 arg0) {
		for (@Pc(15) Class1_Sub35 local15 = (Class1_Sub35) Static175.aClass14_12.method203(); local15 != null; local15 = (Class1_Sub35) Static175.aClass14_12.method208()) {
			if (local15.aClass11_Sub1_Sub3_Sub1_1 == arg0) {
				if (local15.aClass1_Sub9_Sub4_3 != null) {
					Static123.aClass1_Sub9_Sub1_1.method4263(local15.aClass1_Sub9_Sub4_3);
					local15.aClass1_Sub9_Sub4_3 = null;
				}
				local15.method5953();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)[Lclient!eh;")
	public static Class67[] method1743() {
		return new Class67[] { Static13.aClass67_10, Static199.aClass67_125, Static76.aClass67_51, Static85.aClass67_239, Static437.aClass67_263, Static448.aClass67_268, Static291.aClass67_177, Static138.aClass67_94, Static50.aClass67_37, Static96.aClass67_65, Static62.aClass67_46, Static81.aClass67_55, Static290.aClass67_176, Static270.aClass67_87, Static182.aClass67_119, Static300.aClass67_189, Static195.aClass67_124, Static231.aClass67_146, Static379.aClass67_7, Class1_Sub29.aClass67_273, Static182.aClass67_118, Static189.aClass67_122, Static33.aClass67_27, Static171.aClass67_112, Static130.aClass67_91, Static229.aClass67_144, Static39.aClass67_29, Static404.aClass67_245, Static128.aClass67_85, Static293.aClass67_179, Static20.aClass67_13, Static65.aClass67_48, Static81.aClass67_54, Static163.aClass67_224, Static235.aClass67_151, Static82.aClass67_58, Static235.aClass67_152, Static341.aClass67_212, Static175.aClass67_114, Static5.aClass67_5, Static454.aClass67_274, Static231.aClass67_147, Static206.aClass67_132, Static395.aClass67_241, Static360.aClass67_226, Static216.aClass67_137, Static12.aClass67_9, Static404.aClass67_246, Static290.aClass67_175, Static169.aClass67_194, Static396.aClass67_242, Static125.aClass67_83, Static414.aClass67_251, Static247.aClass67_164, Static59.aClass67_44, Static231.aClass67_148, Static464.aClass67_254, Static461.aClass67_280, Static342.aClass67_214, Static285.aClass67_171, Static135.aClass67_93, Static292.aClass67_178, Static104.aClass67_69, Static4.aClass67_4, Static170.aClass67_111, Static199.aClass67_126, Static461.aClass67_281, Static306.aClass67_190, Static62.aClass67_45, Static315.aClass67_196, Static52.aClass67_39, Static399.aClass67_244, Static243.aClass67_161, Static440.aClass67_116, Static316.aClass67_197, Static228.aClass67_222, Static281.aClass67_170, Static106.aClass67_282, Static87.aClass67_62, Static28.aClass67_24, Static213.aClass67_136, Static382.aClass67_188, Static174.aClass67_113, Static53.aClass67_42, Static352.aClass67_221, Static81.aClass67_56, Static311.aClass67_192, Static410.aClass67_249, Static44.aClass67_35, Static409.aClass67_248, Static319.aClass67_199, Static382.aClass67_187, Static232.aClass67_149, Static332.aClass67_209, Static67.aClass67_267, Static441.aClass67_184, Static455.aClass67_275, Static308.aClass67_191, Static427.aClass67_258, Static295.aClass67_180, Static368.aClass67_265, Static420.aClass67_255, Static229.aClass67_143, Static344.aClass67_220, Static412.aClass67_250, Static288.aClass67_174, Static20.aClass67_14, Static124.aClass67_81, Static459.aClass67_277, Static329.aClass67_207, Static3.aClass67_3, Static452.aClass67_271, Static166.aClass67_106, Static364.aClass67_229 };
	}
}
