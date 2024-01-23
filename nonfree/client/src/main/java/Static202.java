import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static202 {

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "Lclient!ol;")
	public static Class4_Sub20 aClass4_Sub20_1 = new Class4_Sub20(0, 0);

	@OriginalMember(owner = "client!ok", name = "f", descriptor = "F")
	public static float aFloat97 = 0.0F;

	@OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
	public static int anInt3896 = 99;

	@OriginalMember(owner = "client!ok", name = "h", descriptor = "Lclient!cc;")
	public static Class26 aClass26_42 = new Class26(64);

	@OriginalMember(owner = "client!ok", name = "i", descriptor = "[Lclient!te;")
	public static Class4_Sub3_Sub19[] aClass4_Sub3_Sub19Array3 = new Class4_Sub3_Sub19[14];

	@OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
	public static int anInt3897 = 0;

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(BI)I")
	public static int method3248(@OriginalArg(1) int arg0) {
		if (Static134.aClass52_7 != null) {
			Static134.aClass52_7.method1103();
			Static134.aClass52_7 = null;
		}
		Static243.anInt4619++;
		if (Static243.anInt4619 > 4) {
			Static279.anInt5320 = 0;
			Static243.anInt4619 = 0;
			return arg0;
		}
		Static279.anInt5320 = 0;
		if (Static117.anInt2337 == Static177.anInt3358) {
			Static177.anInt3358 = Static297.anInt5499;
		} else {
			Static177.anInt3358 = Static117.anInt2337;
		}
		return -1;
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(BI)V")
	public static void method3249() {
		Static133.aClass26_26.method517(5);
	}
}
