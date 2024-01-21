import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "[I")
	public static int[] anIntArray225;

	@OriginalMember(owner = "client!ob", name = "n", descriptor = "[Lclient!sb;")
	public static Class68[] aClass68Array1;

	@OriginalMember(owner = "client!ob", name = "p", descriptor = "[Z")
	public static boolean[] aBooleanArray20;

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "Lclient!je;")
	public static Class40 aClass40_1058 = Static69.method1231("title_mute");

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "[[[Lclient!ac;")
	public static Class3[][][] aClass3ArrayArrayArray1 = new Class3[4][104][104];

	@OriginalMember(owner = "client!ob", name = "m", descriptor = "Lclient!je;")
	private static Class40 aClass40_1060 = Static69.method1231("Service unavailable)3");

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "Lclient!je;")
	public static Class40 aClass40_1059 = aClass40_1060;

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
	public static int anInt2089 = 255;

	@OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
	public static int anInt2090 = 0;

	@OriginalMember(owner = "client!ob", name = "s", descriptor = "Lclient!je;")
	private static Class40 aClass40_1062 = Static69.method1231("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!ob", name = "r", descriptor = "Lclient!je;")
	public static Class40 aClass40_1061 = aClass40_1062;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)V")
	public static void method1409() {
		aBooleanArray20 = null;
		aClass40_1058 = null;
		aClass40_1059 = null;
		aClass3ArrayArrayArray1 = null;
		anIntArray225 = null;
		aClass40_1060 = null;
		aClass68Array1 = null;
		aClass40_1062 = null;
		aClass40_1061 = null;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(Z)V")
	public static void method1412() {
		@Pc(1) Object local1 = Static69.anObject4;
		synchronized (Static69.anObject4) {
			if (Static57.anInt1492 == 0) {
				Static129.aClass59_5.method1638(5, new Class60());
			}
			Static57.anInt1492 = 600;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IZI)V")
	public static void method1414(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int[] local9 = new int[4];
		local9[0] = arg0;
		@Pc(20) int[] local20 = new int[4];
		@Pc(22) int local22 = 1;
		local20[0] = arg1;
		for (@Pc(28) int local28 = 0; local28 < 4; local28++) {
			if (arg0 != Static107.anIntArray292[local28]) {
				local9[local22] = Static107.anIntArray292[local28];
				local20[local22] = Static118.anIntArray325[local28];
				local22++;
			}
		}
		Static118.anIntArray325 = local20;
		Static107.anIntArray292 = local9;
		Static16.method297(Static118.anIntArray325, aClass68Array1.length - 1, Static107.anIntArray292, 0, aClass68Array1);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!je;II)V")
	public static void method1415(@OriginalArg(0) Class40 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class40 local11 = arg0.method989().method965();
		@Pc(13) boolean local13 = false;
		for (@Pc(15) int local15 = 0; local15 < Static130.anInt3007; local15++) {
			@Pc(23) Class2_Sub1_Sub1_Sub3_Sub2 local23 = Static69.aClass2_Sub1_Sub1_Sub3_Sub2Array2[Static126.anIntArray347[local15]];
			if (local23 != null && local23.aClass40_892 != null && local23.aClass40_892.method984(local11)) {
				local13 = true;
				Static99.method1788(Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray180[0], 0, 2, false, 1, 1, 0, local23.anIntArray180[0], local23.anIntArray177[0], Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray177[0], 0);
				if (arg1 == 1) {
					Static57.aClass2_Sub9_Sub1_2.method673(178);
					Static57.aClass2_Sub9_Sub1_2.method616(Static126.anIntArray347[local15]);
				} else if (arg1 == 4) {
					Static57.aClass2_Sub9_Sub1_2.method673(241);
					Static57.aClass2_Sub9_Sub1_2.method645(Static126.anIntArray347[local15]);
				} else if (arg1 == 6) {
					Static57.aClass2_Sub9_Sub1_2.method673(225);
					Static57.aClass2_Sub9_Sub1_2.method616(Static126.anIntArray347[local15]);
				} else if (arg1 == 7) {
					Static57.aClass2_Sub9_Sub1_2.method673(102);
					Static57.aClass2_Sub9_Sub1_2.method657(Static126.anIntArray347[local15]);
				}
				break;
			}
		}
		if (!local13) {
			Static72.method1228(Static40.method722(new Class40[] { Static30.aClass40_428, local11 }), Static43.aClass40_568, 0);
		}
	}
}
