import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static370 {

	@OriginalMember(owner = "client!oaa", name = "e", descriptor = "I")
	public static int anInt6548;

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(II)V")
	public static void method5402(@OriginalArg(1) int arg0) {
		if (Static580.anIntArray626 == null || arg0 > Static580.anIntArray626.length) {
			Static580.anIntArray626 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(BZ)V")
	public static void method5403(@OriginalArg(1) boolean arg0) {
		if (arg0 && Static313.aClass1_Sub3_Sub17_2 != null) {
			Static198.anInt4017 = Static313.aClass1_Sub3_Sub17_2.anInt8092;
		} else {
			Static198.anInt4017 = -1;
		}
		Static266.aClass361_88 = null;
		Static587.anInt9497 = 0;
		Static313.aClass1_Sub3_Sub17_2 = null;
		Static559.aClass365_16 = null;
		Static313.method3490();
		Static313.aClass361_41.method7860();
		Static592.aClass27_9 = null;
		Static398.aClass10_30 = null;
		Static143.aClass27_2 = null;
		Static40.aClass27_5 = null;
		Static475.aClass27_7 = null;
		Static398.aClass27_6 = null;
		Static264.aClass27_3 = null;
		Static248.anInt4641 = -1;
		Static313.aClass236_3 = null;
		Static580.aClass27_8 = null;
		Static582.anInt9419 = -1;
		Static292.aClass27_4 = null;
		if (Static313.aClass46_2 != null) {
			Static313.aClass46_2.method1402();
			Static313.aClass46_2.method1405(64, 128);
		}
		if (Static313.aClass184_3 != null) {
			Static313.aClass184_3.method4076(64, 64);
		}
		if (Static313.aClass214_3 != null) {
			Static313.aClass214_3.method4893(64);
		}
		Static558.aClass32_1.method1005(64);
	}
}
