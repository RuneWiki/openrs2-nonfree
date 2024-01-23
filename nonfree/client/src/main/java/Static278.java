import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static278 {

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "[Lclient!bi;")
	public static Class4_Sub2_Sub1[] aClass4_Sub2_Sub1Array13;

	@OriginalMember(owner = "client!ve", name = "cb", descriptor = "Lclient!fg;")
	public static Class4_Sub9_Sub2 aClass4_Sub9_Sub2_3;

	@OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
	public static int anInt5194 = 0;

	@OriginalMember(owner = "client!ve", name = "s", descriptor = "[I")
	public static int[] anIntArray461 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
	public static void method4124() {
		Static106.aClass33_18.method843();
		Static295.aClass33_40.method843();
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)V")
	public static void method4126(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static6.anInt161 = Static61.aClass64ArrayArray1[arg1][arg0].anInt2259;
		Static65.anInt1219 = Static61.aClass64ArrayArray1[arg1][arg0].anInt2268;
		Static266.anInt5004 = Static61.aClass64ArrayArray1[arg1][arg0].anInt2269;
		Static291.method4317((float) Static6.anInt161, (float) Static65.anInt1219, (float) Static266.anInt5004);
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
	public static void method4129() {
		if (Static117.anInt2592 > 0) {
			Static180.method2828();
		} else {
			Static298.aClass158_4 = Static259.aClass158_3;
			Static259.aClass158_3 = null;
			Static264.method3976(40);
		}
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(B)V")
	public static void method4131() {
		anIntArray461 = null;
		aClass4_Sub9_Sub2_3 = null;
		aClass4_Sub2_Sub1Array13 = null;
	}
}
