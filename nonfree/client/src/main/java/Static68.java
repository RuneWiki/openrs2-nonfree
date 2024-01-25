import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!cfa", name = "J", descriptor = "[Lclient!waa;")
	public static Class366[] aClass366Array1;

	@OriginalMember(owner = "client!cfa", name = "I", descriptor = "[I")
	public static final int[] anIntArray98 = new int[1];

	@OriginalMember(owner = "client!cfa", name = "N", descriptor = "[I")
	public static final int[] anIntArray99 = new int[2];

	@OriginalMember(owner = "client!cfa", name = "e", descriptor = "(II)I")
	public static int method2103(@OriginalArg(1) int arg0) {
		return arg0 == 16711935 ? -1 : Static1.method6137(arg0);
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(ZB)V")
	public static void method2104(@OriginalArg(0) boolean arg0) {
		if (Static272.aClass116_1 != null) {
			Static272.aClass116_1.method3740();
			Static272.aClass116_1 = null;
		}
		Static513.anInt9420 = 0;
		Static261.method4784();
		Static286.method5211();
		for (@Pc(24) int local24 = 0; local24 < 4; local24++) {
			Static55.aClass104Array3[local24].method3255();
		}
		Static328.method5641(false);
		System.gc();
		Static428.method5138();
		Static301.aBoolean468 = false;
		Static580.anInt10350 = -1;
		Static75.method2188();
		Static200.method4041(true);
		Static32.anInt723 = 0;
		Static84.anInt2565 = 0;
		Static199.anInt8568 = 0;
		Static93.anInt2688 = 0;
		Static69.anInt2216 = 0;
		Static314.anInt6440 = 0;
		for (@Pc(69) int local69 = 0; local69 < Static351.aClass373Array1.length; local69++) {
			Static351.aClass373Array1[local69] = null;
		}
		Static606.method8934();
		for (@Pc(88) int local88 = 0; local88 < 2048; local88++) {
			Static618.aClass3_Sub1_Sub3_Sub3_Sub2Array1[local88] = null;
		}
		Static398.anInt7589 = 0;
		Static600.aClass99_79.method3057();
		Static474.anInt8881 = 0;
		Static378.aClass99_26.method3057();
		Static376.method6271();
		Static274.anInt5853 = 0;
		Static286.aClass263_3.method6863();
		Static64.method1970();
		Static202.method4064();
		Static200.aLong99 = 0L;
		Static282.aClass2_Sub36_1 = null;
		if (arg0) {
			Static66.method8375(12);
			return;
		}
		Static66.method8375(3);
		try {
			Static646.method1788(Static334.anApplet2, "loggedout");
		} catch (@Pc(147) Throwable local147) {
		}
	}
}
