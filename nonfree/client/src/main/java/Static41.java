import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "Lclient!pe;")
	public static Class254 aClass254_16;

	@OriginalMember(owner = "client!bm", name = "h", descriptor = "J")
	public static long aLong46;

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "[I")
	public static final int[] anIntArray67 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!bm", name = "g", descriptor = "Lclient!wq;")
	public static final Class359 aClass359_2 = new Class359();

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;ZI)V")
	public static void method1148(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		Static178.method3156(-1, arg1, arg3, true, arg2, arg0);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(BI)I")
	public static int method1149(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(B)V")
	public static void method1151() {
		Static533.method7862(Static546.aClass15_16, (long) Static129.anInt10429);
		if (Static25.anInt779 != -1) {
			Static101.method2147(Static25.anInt779);
		}
		for (@Pc(17) int local17 = 0; local17 < Static377.anInt7315; local17++) {
			if (Static518.aBooleanArray37[local17]) {
				Static52.aBooleanArray4[local17] = true;
			}
			Static296.aBooleanArray20[local17] = Static518.aBooleanArray37[local17];
			Static518.aBooleanArray37[local17] = false;
		}
		Static243.anInt5076 = Static129.anInt10429;
		if (Static546.aClass15_16.method5289()) {
			Static109.aBoolean199 = true;
		}
		if (Static25.anInt779 != -1) {
			Static377.anInt7315 = 0;
			Static123.method2495();
		}
		Static546.aClass15_16.F();
		Static281.method4852(Static546.aClass15_16);
		@Pc(67) int local67 = Static422.method6755();
		if (local67 == -1) {
			local67 = Static68.anInt1810;
		}
		if (local67 == -1) {
			local67 = Static395.anInt4652;
		}
		Static310.method5164(local67);
		Static377.anInt7320 = 0;
	}
}
