import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!sf", name = "E", descriptor = "Lclient!dk;")
	public static Class54 aClass54_100;

	@OriginalMember(owner = "client!sf", name = "I", descriptor = "I")
	public static int anInt6114;

	@OriginalMember(owner = "client!sf", name = "N", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_127 = new Class211(91, -1);

	@OriginalMember(owner = "client!sf", name = "Q", descriptor = "I")
	public static int anInt6120 = 0;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IFIFF)F")
	public static float method4778(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		@Pc(15) float[] local15 = Static116.aFloatArrayArray1[arg1];
		return local15[2] * arg0 + local15[1] * arg3 + arg2 * local15[0];
	}

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "(I)V")
	public static void method4779() {
		Static354.aClass132_55.method2698();
		Static264.aClass132_40.method2698();
		Static327.aClass132_52.method2698();
		Static209.aClass132_27.method2698();
		Static234.aClass132_30.method2698();
	}

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "(I)V")
	public static void method4780() {
		if (Static392.anInt6450 < 0) {
			return;
		}
		@Pc(4) long local4 = Static110.method1702();
		Static392.anInt6450 = (int) ((long) Static392.anInt6450 + Static295.aLong163 - local4);
		if (Static392.anInt6450 > 0) {
			@Pc(24) int local24 = (Static392.anInt6450 << 8) / Static160.anInt2719;
			@Pc(28) int local28 = 255 - local24;
			@Pc(33) float local33 = (float) local24 / 255.0F;
			@Pc(38) float local38 = 1.0F - local33;
			Static106.anInt2003 = (local24 * (Static164.anInt4843 & 0xFF00) + local28 * (Static342.aClass159_2.anInt4046 & 0xFF00) & 0xFF0000) + (local28 * (Static342.aClass159_2.anInt4046 & 0xFF00FF) + local24 * (Static164.anInt4843 & 0xFF00FF) & 0xFF00FF00) >>> 8;
			Static229.anInt3736 = ((anInt6114 & 0xFF00) * local24 + (Static342.aClass159_2.anInt4048 & 0xFF00) * local28 & 0xFF0000) + ((anInt6114 & 0xFF00FF) * local24 + local28 * (Static342.aClass159_2.anInt4048 & 0xFF00FF) & 0xFF00FF00) >>> 8;
			Static153.anInt2663 = Static99.anInt1890 * local24 + Static342.aClass159_2.anInt4051 * local28 >> 8;
			Static261.aFloat21 = local38 * (Static342.aClass159_2.aFloat47 - Static386.aFloat99) + Static386.aFloat99;
			Static9.aFloat1 = Static36.aFloat8 + (Static342.aClass159_2.aFloat48 - Static36.aFloat8) * local38;
			Static107.aFloat18 = local38 * (Static342.aClass159_2.aFloat45 - Static373.aFloat97) + Static373.aFloat97;
			Static422.aFloat102 = Static161.aFloat83 + local38 * (Static342.aClass159_2.aFloat49 - Static161.aFloat83);
			Static440.aFloat103 = (Static342.aClass159_2.aFloat46 - Static173.aFloat100) * local38 + Static173.aFloat100;
			Static280.aFloat54 = Static216.aFloat36 + (Static342.aClass159_2.aFloat50 - Static216.aFloat36) * local38;
			if (Static278.aClass109_3 != Static342.aClass159_2.aClass109_2) {
				Static30.aClass109_1 = Static420.aClass163_11.method5525(Static278.aClass109_3, Static342.aClass159_2.aClass109_2, local38, Static30.aClass109_1);
			}
		} else {
			Static9.aFloat1 = Static342.aClass159_2.aFloat48;
			Static392.anInt6450 = -1;
			Static106.anInt2003 = Static342.aClass159_2.anInt4046;
			Static107.aFloat18 = Static342.aClass159_2.aFloat45;
			Static280.aFloat54 = Static342.aClass159_2.aFloat50;
			Static153.anInt2663 = Static342.aClass159_2.anInt4051;
			Static261.aFloat21 = Static342.aClass159_2.aFloat47;
			Static229.anInt3736 = Static342.aClass159_2.anInt4048;
			Static440.aFloat103 = Static342.aClass159_2.aFloat46;
			Static30.aClass109_1 = Static342.aClass159_2.aClass109_2;
			Static422.aFloat102 = Static342.aClass159_2.aFloat49;
		}
		Static295.aLong163 = local4;
	}
}
