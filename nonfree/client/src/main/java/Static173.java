import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!w", name = "c", descriptor = "[I")
	public static int[] anIntArray690;

	@OriginalMember(owner = "client!w", name = "s", descriptor = "[Lclient!dh;")
	public static Class3_Sub2_Sub2_Sub3[] aClass3_Sub2_Sub2_Sub3Array10;

	@OriginalMember(owner = "client!w", name = "w", descriptor = "[I")
	public static int[] anIntArray691;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "[I")
	public static int[] anIntArray689 = new int[5];

	@OriginalMember(owner = "client!w", name = "e", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1453 = Static170.method3101("Too many connections from your address)3");

	@OriginalMember(owner = "client!w", name = "b", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1452 = aClass28_1453;

	@OriginalMember(owner = "client!w", name = "f", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1454 = Static170.method3101("No reply from loginserver)3");

	@OriginalMember(owner = "client!w", name = "x", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1455 = Static170.method3101("gr-Un:");

	@OriginalMember(owner = "client!w", name = "y", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1456 = aClass28_1454;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ILclient!gf;)Lclient!eh;")
	public static Class28 method3139(@OriginalArg(1) Class33 arg0) {
		if (Static161.method3002(Static4.method97(arg0)) == 0) {
			return null;
		} else if (arg0.aClass28_453 == null || arg0.aClass28_453.method915().method901() == 0) {
			return Static168.aBoolean190 ? Static105.aClass28_876 : null;
		} else {
			return arg0.aClass28_453;
		}
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(II)V")
	public static void method3141(@OriginalArg(1) int arg0) {
		if (arg0 == Static137.anInt3514) {
			return;
		}
		if (Static137.anInt3514 == 0) {
			Static134.method2618();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static91.anInt4137 = 0;
			Static86.anInt2525 = 0;
			Static160.anInt3909 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static172.aClass38_4 != null) {
			Static172.aClass38_4.method1632();
			Static172.aClass38_4 = null;
		}
		if (Static137.anInt3514 == 25) {
			Static160.anInt3912 = 1;
			Static114.anInt2921 = 0;
			Static100.anInt2652 = 0;
			Static159.anInt3902 = 1;
			Static136.anInt3477 = 0;
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static80.method2762(Static2.aClass7_Sub1_1, Static21.aClass7_Sub1_3, Static41.aCanvas1);
		} else {
			Static138.method2706();
		}
		Static137.anInt3514 = arg0;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(BILclient!ah;I)Lclient!dh;")
	public static Class3_Sub2_Sub2_Sub3 method3142(@OriginalArg(1) int arg0, @OriginalArg(2) Class7 arg1, @OriginalArg(3) int arg2) {
		return Static162.method3012(arg2, arg0, arg1) ? Static145.method2780() : null;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I)Lclient!uc;")
	public static Class17 method3144() {
		try {
			return (Class17) Class.forName("Class17_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ZII)V")
	public static void method3145(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11;
		if (Static129.anInt3285 != arg0) {
			Static146.anIntArray618 = new int[arg0];
			for (local11 = 0; local11 < arg0; local11++) {
				Static146.anIntArray618[local11] = (local11 << 12) / arg0;
			}
			Static105.anInt2733 = arg0 - 1;
			Static129.anInt3285 = arg0;
		}
		if (Static104.anInt2685 == arg1) {
			return;
		}
		Static22.anIntArray152 = new int[arg1];
		for (local11 = 0; local11 < arg1; local11++) {
			Static22.anIntArray152[local11] = (local11 << 12) / arg1;
		}
		Static106.anInt2755 = arg1 - 1;
		Static104.anInt2685 = arg1;
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V")
	public static void method3146() {
		anIntArray690 = null;
		aClass28_1456 = null;
		aClass3_Sub2_Sub2_Sub3Array10 = null;
		anIntArray689 = null;
		aClass28_1452 = null;
		aClass28_1453 = null;
		aClass28_1455 = null;
		aClass28_1454 = null;
		anIntArray691 = null;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ZLclient!jh;ZLclient!ah;Lclient!ah;)V")
	public static void method3148(@OriginalArg(1) Class3_Sub2_Sub2_Sub1_Sub1 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class7 arg2, @OriginalArg(4) Class7 arg3) {
		Static38.aClass7_21 = arg2;
		Static11.aClass7_7 = arg3;
		Static9.aBoolean19 = arg1;
		Static27.anInt878 = Static11.aClass7_7.method1022(10);
		Static72.aClass3_Sub2_Sub2_Sub1_Sub1_3 = arg0;
	}
}
