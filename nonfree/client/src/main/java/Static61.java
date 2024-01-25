import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!di", name = "e", descriptor = "I")
	public static int anInt1578;

	@OriginalMember(owner = "client!di", name = "d", descriptor = "[I")
	public static final int[] anIntArray92 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!tj;Z)V")
	public static void method1269(@OriginalArg(0) Class193 arg0) {
		Static348.aClass193_108 = arg0;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!br;ZLclient!vq;)V")
	public static void method1270(@OriginalArg(0) Class21 arg0, @OriginalArg(2) Class47 arg1) {
		@Pc(34) boolean local34 = Static295.method4919(arg0.anInt784 | 0xFF000000, arg0.aBoolean76 ? Static158.aClass8_Sub1_Sub2_Sub1_1.aClass33_1 : null, arg0.anInt776, arg0.anInt765, arg0.anInt770, arg1, arg0.anInt739) == null;
		if (local34) {
			Static160.aClass116_29.method3274(new Class4_Sub20(arg0.anInt770, arg0.anInt776, arg0.anInt765, arg0.anInt784 | 0xFF000000, arg0.anInt739, arg0.aBoolean76));
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
	public static void method1272() {
		Static354.aClass58Array137 = null;
		Static186.aClass58Array74 = null;
		Static316.aClass58Array124 = null;
		Static348.aClass58Array134 = null;
		Static63.aClass51_1 = null;
		Static282.aClass51_4 = null;
		Static237.aClass58Array136 = null;
		Static233.aClass58Array92 = null;
		Static55.aClass58Array28 = null;
		Static108.aClass58Array44 = null;
		Static345.aClass58_47 = null;
		Static36.aClass58Array21 = null;
		Static138.aClass58Array54 = null;
		Static238.aClass51_6 = null;
		Static312.aClass58Array122 = null;
		Static101.aClass58Array140 = null;
		Static106.aClass58Array43 = null;
	}
}
