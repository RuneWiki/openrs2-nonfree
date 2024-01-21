import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!td", name = "cb", descriptor = "J")
	public static long aLong85;

	@OriginalMember(owner = "client!td", name = "pb", descriptor = "Z")
	public static boolean aBoolean252;

	@OriginalMember(owner = "client!td", name = "T", descriptor = "Lclient!ec;")
	private static Class22 aClass22_879 = Static60.method1113("Please enter your password)3");

	@OriginalMember(owner = "client!td", name = "Y", descriptor = "I")
	public static int anInt2819 = 0;

	@OriginalMember(owner = "client!td", name = "bb", descriptor = "I")
	public static int anInt2821 = 0;

	@OriginalMember(owner = "client!td", name = "nb", descriptor = "Lclient!ec;")
	public static Class22 aClass22_880 = aClass22_879;

	@OriginalMember(owner = "client!td", name = "ob", descriptor = "Lclient!ec;")
	public static Class22 aClass22_881 = Static60.method1113("nicht hergestellt werden)3");

	@OriginalMember(owner = "client!td", name = "rb", descriptor = "Lclient!ec;")
	public static Class22 aClass22_882 = Static60.method1113("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IBII)V")
	public static void method1818(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < 128 || arg0 < 128 || arg1 > 13056 || arg0 > 13056) {
			Static108.anInt2723 = -1;
			Static74.anInt1966 = -1;
			return;
		}
		@Pc(29) int local29 = Static69.method1173(Static37.anInt895, arg1, arg0) - arg2;
		@Pc(33) int local33 = arg0 - Static42.anInt885;
		@Pc(37) int local37 = Class4_Sub1_Sub2_Sub1.anIntArray9[Static39.anInt957];
		@Pc(41) int local41 = local29 - Static60.anInt1788;
		@Pc(49) int local49 = Class4_Sub1_Sub2_Sub1.anIntArray12[Static39.anInt957];
		@Pc(53) int local53 = Class4_Sub1_Sub2_Sub1.anIntArray9[Static96.anInt2480];
		@Pc(57) int local57 = Class4_Sub1_Sub2_Sub1.anIntArray12[Static96.anInt2480];
		@Pc(61) int local61 = arg1 - Static87.anInt2318;
		@Pc(71) int local71 = local61 * local57 + local33 * local53 >> 16;
		@Pc(82) int local82 = local33 * local57 - local61 * local53 >> 16;
		@Pc(84) int local84 = local71;
		@Pc(95) int local95 = local49 * local41 - local37 * local82 >> 16;
		@Pc(105) int local105 = local82 * local49 + local41 * local37 >> 16;
		if (local105 < 50) {
			Static74.anInt1966 = -1;
			Static108.anInt2723 = -1;
		} else {
			Static108.anInt2723 = (local95 << 9) / local105 + 167;
			Static74.anInt1966 = (local84 << 9) / local105 + 256;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIILclient!h;I)V")
	public static void method1819(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class4_Sub1_Sub2_Sub2 arg3, @OriginalArg(5) int arg4) {
		if (arg3 == null) {
			return;
		}
		@Pc(12) int local12 = Static23.anInt552 + Static111.anInt2754 & 0x7FF;
		@Pc(20) int local20 = arg4 * arg4 + arg2 * arg2;
		if (local20 > 6400) {
			return;
		}
		@Pc(38) int local38 = Class4_Sub1_Sub2_Sub1.anIntArray9[local12];
		@Pc(46) int local46 = local38 * 256 / (Static25.anInt574 + 256);
		@Pc(50) int local50 = Class4_Sub1_Sub2_Sub1.anIntArray12[local12];
		@Pc(58) int local58 = local50 * 256 / (Static25.anInt574 + 256);
		@Pc(69) int local69 = local58 * arg2 - arg4 * local46 >> 16;
		@Pc(80) int local80 = arg2 * local46 + local58 * arg4 >> 16;
		if (local20 <= 2500) {
			arg3.method790(local80 + arg0 + 94 + 4 - arg3.anInt1157 / 2, arg1 + 83 + -local69 + (-(arg3.anInt1159 / 2) - 4));
		} else {
			arg3.method792(Static16.aClass4_Sub1_Sub2_Sub3_2, arg0 + local80 + 94 + 4 - arg3.anInt1157 / 2, -(arg3.anInt1159 / 2) + 83 + (arg1 - local69) + -4);
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!ec;Lclient!ea;ZLclient!ec;)Lclient!hb;")
	public static Class4_Sub1_Sub2_Sub3 method1820(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(3) Class22 arg2) {
		@Pc(15) int local15 = arg1.method592(arg2);
		@Pc(21) int local21 = arg1.method606(arg0, local15);
		return Static1.method4(local21, local15, arg1);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!ea;Lclient!ea;B)V")
	public static void method1821(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class20 arg1) {
		Static15.aClass20_14 = arg1;
		Static130.aClass20_61 = arg0;
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(B)V")
	public static void method1823() {
		aClass22_882 = null;
		aClass22_879 = null;
		aClass22_880 = null;
		aClass22_881 = null;
	}
}
