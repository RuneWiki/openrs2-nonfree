import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!im", name = "e", descriptor = "I")
	public static int anInt3181;

	@OriginalMember(owner = "client!im", name = "i", descriptor = "I")
	public static int anInt3183;

	@OriginalMember(owner = "client!im", name = "g", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_63 = new Class231("Drop", "Fallen lassen", "Poser", "Largar");

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIIIZZ)V")
	public static void method2618(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) boolean arg4) {
		Static146.anInt2674 = 7;
		Static327.anInt5862 = 0x1 << Static146.anInt2674;
		Static417.anInt7156 = Static327.anInt5862 >> 1;
		Static315.anInt5650 = (int) Math.sqrt((double) (Static417.anInt7156 * Static417.anInt7156 + Static417.anInt7156 * Static417.anInt7156));
		Static187.anInt3296 = Static327.anInt5862 >> 2;
		Static195.anInt3386 = Static327.anInt5862;
		Static212.anInt3636 = arg0;
		Static104.anInt1675 = arg1;
		Static30.anInt535 = arg2;
		Static292.aClass36ArrayArrayArray2 = new Class36[4][Static212.anInt3636][Static104.anInt1675];
		Static114.aClass22Array2 = new Class22[4];
		if (arg3) {
			Static427.anIntArrayArray176 = new int[Static212.anInt3636][Static104.anInt1675];
			Static182.aByteArrayArray11 = new byte[Static212.anInt3636][Static104.anInt1675];
			Static131.aShortArrayArray3 = new short[Static212.anInt3636][Static104.anInt1675];
			Static317.aClass36ArrayArrayArray3 = new Class36[1][Static212.anInt3636][Static104.anInt1675];
			Static46.aClass22Array1 = new Class22[1];
		} else {
			Static427.anIntArrayArray176 = null;
			Static182.aByteArrayArray11 = null;
			Static131.aShortArrayArray3 = null;
			Static317.aClass36ArrayArrayArray3 = null;
			Static46.aClass22Array1 = null;
		}
		if (arg4) {
			Static254.aLongArrayArrayArray1 = new long[4][arg0][arg1];
			Static330.aClass38Array1 = new Class38[65535];
			Static457.aBooleanArray26 = new boolean[65535];
			Static439.anInt7384 = 0;
		} else {
			Static254.aLongArrayArrayArray1 = null;
			Static330.aClass38Array1 = null;
			Static457.aBooleanArray26 = null;
			Static439.anInt7384 = 0;
		}
		Static368.method6267(false);
		Static123.aClass160Array1 = new Class160[1000];
		Static461.anInt7751 = 0;
		Static417.aClass160Array2 = new Class160[1000];
		Static186.anInt3290 = 0;
		Static59.anIntArrayArrayArray16 = new int[4][Static212.anInt3636 + 1][Static104.anInt1675 + 1];
		Static218.aClass11_Sub5Array3 = new Class11_Sub5[5000];
		Static315.anInt5651 = 0;
		Static409.aBooleanArrayArray5 = new boolean[Static30.anInt535 + Static30.anInt535 + 1][Static30.anInt535 + Static30.anInt535 + 1];
		Static150.aBooleanArrayArray20 = new boolean[Static30.anInt535 + Static30.anInt535 + 2][Static30.anInt535 + Static30.anInt535 + 2];
		Static45.aClass20_1 = null;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIIIIZ)V")
	public static void method2619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(10) Class28_Sub8 local10 = (Class28_Sub8) Static383.aClass97_7.method2145(); local10 != null; local10 = (Class28_Sub8) Static383.aClass97_7.method2148()) {
			if (local10.anInt7362 <= Static277.anInt5022) {
				local10.method5916();
			} else {
				Static6.method90(arg2 >> 1, local10.anInt7360, (local10.anInt7361 << 7) + 64, local10.anInt7363 * 2, arg3 >> 1, (local10.anInt7367 << 7) + 64);
				Static143.aClass14_2.method4883(local10.aString70, arg0 + Static242.anIntArray380[0], Static242.anIntArray380[1] + arg1, local10.anInt7366 | 0xFF000000, 0);
			}
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(BI)I")
	public static int method2620(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V")
	public static void method2621() {
		Static318.anIntArray480 = Static269.method1982(0.4F);
	}
}
