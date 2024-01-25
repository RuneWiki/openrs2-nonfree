import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_32 = new Class341(37, 1);

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "Z")
	public static boolean aBoolean182 = false;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIZIIB)V")
	public static void method2286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 < 1) {
			arg4 = 1;
		}
		if (arg1 < 1) {
			arg1 = 1;
		}
		@Pc(21) int local21 = arg4 - 334;
		if (local21 < 0) {
			local21 = 0;
		} else if (local21 > 100) {
			local21 = 100;
		}
		@Pc(47) int local47 = local21 * (Static486.aShort94 - Static522.aShort101) / 100 + Static522.aShort101;
		if (local47 < Static523.aShort102) {
			local47 = Static523.aShort102;
		} else if (Static589.aShort117 < local47) {
			local47 = Static589.aShort117;
		}
		@Pc(77) int local77 = arg4 * local47 * 512 / (arg1 * 334);
		@Pc(110) int local110;
		@Pc(117) int local117;
		@Pc(85) short local85;
		if (Static553.aShort105 > local77) {
			local85 = Static553.aShort105;
			local47 = arg1 * 334 * local85 / (arg4 * 512);
			if (local47 > Static589.aShort117) {
				local47 = Static589.aShort117;
				local110 = arg4 * local47 * 512 / (local85 * 334);
				local117 = (arg1 - local110) / 2;
				if (arg2) {
					Static607.aClass101_15.la();
					Static607.aClass101_15.method8061(arg3, arg4, -16777216, arg0, local117);
					Static607.aClass101_15.method8061(arg3, arg4, -16777216, arg1 + arg0 - local117, local117);
				}
				arg1 -= local117 * 2;
				arg0 += local117;
			}
		} else if (Static262.aShort53 < local77) {
			local85 = Static262.aShort53;
			local47 = arg1 * local85 * 334 / (arg4 * 512);
			if (local47 < Static523.aShort102) {
				local47 = Static523.aShort102;
				local110 = arg1 * 334 * local85 / (local47 * 512);
				local117 = (arg4 - local110) / 2;
				if (arg2) {
					Static607.aClass101_15.la();
					Static607.aClass101_15.method8061(arg3, local117, -16777216, arg0, arg1);
					Static607.aClass101_15.method8061(arg4 + arg3 - local117, local117, -16777216, arg0, arg1);
				}
				arg4 -= local117 * 2;
				arg3 += local117;
			}
		}
		Static439.anInt7996 = arg4 * local47 / 334;
		Static666.anInt11368 = arg3;
		Static656.anInt11250 = (short) arg4;
		Static598.anInt10388 = (short) arg1;
		Static314.anInt5667 = arg0;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)[Lclient!in;")
	public static Class169[] method2287() {
		return new Class169[] { Static136.aClass169_71, Static129.aClass169_69, Static25.aClass169_14, Static645.aClass169_244, Static92.aClass169_263, Static488.aClass169_212, Static535.aClass169_223, Static430.aClass169_189, Static206.aClass169_110, Static259.aClass169_128, Static429.aClass169_188, Static36.aClass169_23, Static238.aClass169_120, Static196.aClass169_100, Static198.aClass169_105, Static116.aClass169_60, Static12.aClass169_8, Static447.aClass169_195, Static351.aClass169_167, Static477.aClass169_206, Static98.aClass169_55, Static455.aClass169_197, Static401.aClass169_184, Static27.aClass169_16, Static548.aClass169_231, Static191.aClass169_99, Static249.aClass169_122, Static263.aClass169_129, Static414.aClass169_186, Static338.aClass169_160, Static30.aClass169_18, Static633.aClass169_255, Static460.aClass169_258, Static279.aClass169_136, Static576.aClass169_242, Static91.aClass169_49, Static61.aClass169_39, Static557.aClass169_234, Static343.aClass169_164, Static210.aClass169_114, Static197.aClass169_101, Static663.aClass169_265, Static353.aClass169_168, Static530.aClass169_237, Static388.aClass169_182, Static117.aClass169_61, Static153.aClass169_78, Static323.aClass169_155, Static287.aClass169_138, Static354.aClass169_169, Static311.aClass169_151, Static446.aClass169_193, Static201.aClass169_108, Static292.aClass169_141, Static469.aClass169_202, Static542.aClass169_224, Static454.aClass169_163, Static95.aClass169_51, Static212.aClass169_117, Static455.aClass169_196, Static283.aClass169_137, Static598.aClass169_248, Static490.aClass169_213, Static482.aClass169_209, Static151.aClass169_76, Static297.aClass169_145, Static123.aClass169_68, Static546.aClass169_226, Static504.aClass169_214, Static397.aClass169_257, Static645.aClass169_245, Static288.aClass169_139, Static84.aClass169_45, Static215.aClass169_262, Static536.aClass169_119, Static257.aClass169_124, Static582.aClass169_247, Static501.aClass169_222, Static82.aClass169_44, Static613.aClass169_251, Static207.aClass169_111, Static465.aClass169_201, Static27.aClass169_15, Static311.aClass169_150, Static150.aClass169_74, Static520.aClass169_219, Static155.aClass169_79, Static362.aClass169_230, Static341.aClass169_161, Static412.aClass169_185, Static515.aClass169_217, Static38.aClass169_24, Static173.aClass169_88, Static542.aClass169_225, Static521.aClass169_171, Static360.aClass169_174, Static402.aClass169_204, Static249.aClass169_121, Static551.aClass169_233, Static84.aClass169_46, Static568.aClass169_239, Static273.aClass169_134, Static70.aClass169_40, Static318.aClass169_152, Static423.aClass169_187, Static592.aClass169_250, Static520.aClass169_218, Static180.aClass169_95, Static646.aClass169_259, Static44.aClass169_34, Static579.aClass169_243, Static649.aClass169_261, Static74.aClass169_220, Static57.aClass169_38, Static190.aClass169_98, Static347.aClass169_165, Static77.aClass169_43, Static627.aClass169_254, Static565.aClass169_238, Static198.aClass169_103, Static203.aClass169_109, Static605.aClass169_249, Static581.aClass169_246, Static197.aClass169_102, Static167.aClass169_87, Static397.aClass169_256, Static198.aClass169_104, Static648.aClass169_260, Static110.aClass169_264, Static651.aClass169_252, Static470.aClass169_143, Static73.aClass169_41, Static336.aClass169_159 };
	}
}
