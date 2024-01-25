import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static378 {

	@OriginalMember(owner = "client!td", name = "m", descriptor = "Z")
	public static boolean aBoolean549 = false;

	@OriginalMember(owner = "client!td", name = "n", descriptor = "I")
	public static int anInt6791 = 0;

	@OriginalMember(owner = "client!td", name = "p", descriptor = "I")
	public static int anInt6793 = -1;

	@OriginalMember(owner = "client!td", name = "q", descriptor = "I")
	public static int anInt6794 = -1;

	@OriginalMember(owner = "client!td", name = "r", descriptor = "I")
	public static int anInt6795 = 0;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(II)V")
	public static void method5321(@OriginalArg(1) int arg0) {
		Static131.anInt2418 = -1;
		Static347.anInt6360 = arg0;
		Static309.anInt5223 = 3;
		Static203.anInt2040 = 100;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(I)[Lclient!ao;")
	public static Class12[] method5322() {
		return new Class12[] { Static404.aClass12_346, Static437.aClass12_377, Static407.aClass12_351, Static268.aClass12_230, Static74.aClass12_87, Static305.aClass12_265, Static230.aClass12_207, Static217.aClass12_200, Static164.aClass12_156, Static75.aClass12_88, Static307.aClass12_272, Static359.aClass12_316, Static140.aClass12_130, Static224.aClass12_206, Static263.aClass12_222, Static310.aClass12_274, Static237.aClass12_212, Static153.aClass12_233, Static454.aClass12_390, Static81.aClass12_89, Static216.aClass12_198, Static275.aClass12_234, Static385.aClass12_339, Static25.aClass12_25, Static304.aClass12_264, Static39.aClass12_44, Static326.aClass12_287, Static62.aClass12_69, Static251.aClass12_216, Static364.aClass12_323, Static312.aClass12_277, Static373.aClass12_335, Static362.aClass12_319, Static265.aClass12_227, Static422.aClass12_108, Static165.aClass12_246, Static304.aClass12_263, Static51.aClass12_61, Static7.aClass12_16, Static114.aClass12_115, Static331.aClass12_291, Static117.aClass12_116, Static291.aClass12_389, Static119.aClass12_122, Static40.aClass12_47, Static328.aClass12_290, Static347.aClass12_307, Static362.aClass12_320, Static223.aClass12_205, Static216.aClass12_199, Static179.aClass12_173, Static266.aClass12_366, Static33.aClass12_41, Static233.aClass12_209, Static156.aClass12_150, Static276.aClass12_237, Static5.aClass12_332, Static282.aClass12_243, Static433.aClass12_371, Static420.aClass12_359, Static222.aClass12_204, Static159.aClass12_153, Static97.aClass12_105, Static31.aClass12_38, Static385.aClass12_338, Static183.aClass12_178, Static436.aClass12_374, Static143.aClass12_137, Static381.aClass12_29, Static56.aClass12_64, Static428.aClass12_367, Static47.aClass12_60, Static310.aClass12_275, Static217.aClass12_201, Static252.aClass12_218, Static396.aClass12_344, Static27.aClass12_30, Static291.aClass12_388, Static73.aClass12_86, Static438.aClass12_380, Static184.aClass12_179, Static439.aClass12_383, Static41.aClass12_52, Static250.aClass12_215, Static406.aClass12_348, Static334.aClass12_292, Static432.aClass12_370, Static367.aClass12_328, Static296.aClass12_256, Static306.aClass12_269, Static263.aClass12_223, Static265.aClass12_226, Static230.aClass12_208, Static305.aClass12_266, Static83.aClass12_251, Static337.aClass12_296, Static27.aClass12_31, Static310.aClass12_273, Static150.aClass12_140, Static175.aClass12_278, Static405.aClass12_347, Static276.aClass12_238, Static215.aClass12_195, Static251.aClass12_217, Static39.aClass12_45, Static260.aClass12_276, Static381.aClass12_28, Static40.aClass12_46, Static84.aClass12_299, Static409.aClass12_352 };
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(I)V")
	public static void method5323() {
		for (@Pc(7) int local7 = 0; local7 < Static381.anInt436; local7++) {
			@Pc(13) Class239 local13 = Static426.aClass239Array1[local7];
			if (local13.aByte98 == 2) {
				if (local13.aClass1_Sub5_Sub2_4 == null) {
					local13.anInt7126 = Integer.MIN_VALUE;
				} else {
					Static292.aClass1_Sub5_Sub1_2.method423(local13.aClass1_Sub5_Sub2_4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IZIB)I")
	public static int method5324(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub13 local8 = Static379.method5347(arg0, arg1);
		if (local8 == null) {
			return -1;
		} else if (arg2 >= 0 && arg2 < local8.anIntArray82.length) {
			return local8.anIntArray82[arg2];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V")
	public static void method5325() {
		if (Static248.aBoolean343) {
			Static248.aBoolean343 = false;
			Static287.aClass78_17 = null;
			Static403.aClass78_21 = null;
		}
	}
}
