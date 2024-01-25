import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!wi", name = "o", descriptor = "I")
	public static int anInt6676;

	@OriginalMember(owner = "client!wi", name = "r", descriptor = "[I")
	public static final int[] anIntArray546 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!wi", name = "t", descriptor = "[Lclient!ne;")
	public static final Class138_Sub1[] aClass138_Sub1Array2 = new Class138_Sub1[29];

	@OriginalMember(owner = "client!wi", name = "y", descriptor = "[I")
	public static final int[] anIntArray547 = new int[4096];

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIII)V")
	public static void method5656(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static289.anInt5719 == 0 || arg2 == 0 || Static306.anInt6038 >= 50 || arg0 == -1) {
			return;
		}
		Static253.anIntArray393[Static306.anInt6038] = arg0;
		Static270.anIntArray416[Static306.anInt6038] = arg2;
		Static291.anIntArray446[Static306.anInt6038] = arg3;
		Static53.aClass102Array1[Static306.anInt6038] = null;
		Static64.anIntArray76[Static306.anInt6038] = 0;
		Static75.anIntArray93[Static306.anInt6038] = arg1;
		Static306.anInt6038++;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIZI)V")
	public static void method5657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static313.aClass11_Sub25_Sub1_5.anInt6076 = 0;
		Static313.aClass11_Sub25_Sub1_5.method5186(20);
		Static313.aClass11_Sub25_Sub1_5.method5186(arg2);
		Static313.aClass11_Sub25_Sub1_5.method5186(arg1);
		Static313.aClass11_Sub25_Sub1_5.method5204(arg0);
		Static313.aClass11_Sub25_Sub1_5.method5204(arg3);
		Static41.anInt740 = 0;
		Static136.anInt6476 = 1;
		Static2.anInt9 = 0;
		Static90.anInt4649 = -3;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method5658(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IBII)V")
	public static void method5659(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 0) {
			Static313.aClass11_Sub25_Sub1_5.method2454(54);
		}
		if (arg0 == 1) {
			Static313.aClass11_Sub25_Sub1_5.method2454(134);
		}
		Static313.aClass11_Sub25_Sub1_5.method5210(Static278.aClass143_20.method4857(82) ? 1 : 0);
		Static313.aClass11_Sub25_Sub1_5.method5204(Static182.anInt3662 + arg2);
		Static313.aClass11_Sub25_Sub1_5.method5196(arg1 + Static169.anInt6312);
		Static132.anInt2474 = arg2;
		Static310.aBoolean406 = false;
		Static276.anInt5528 = arg1;
		Static259.method4512();
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method5660(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static264.anInt5400; local11++) {
			if (arg0.equalsIgnoreCase(Static92.aStringArray11[local11])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static189.aStringArray5[local11])) {
				return true;
			}
		}
		return false;
	}
}
