import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!fm", name = "M", descriptor = "[I")
	public static final int[] anIntArray112 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(B[Ljava/lang/Object;[J)V")
	public static void method1732(@OriginalArg(1) Object[] arg0, @OriginalArg(2) long[] arg1) {
		Static190.method3005(arg0, 0, arg1.length - 1, arg1);
	}

	@OriginalMember(owner = "client!fm", name = "e", descriptor = "(I)V")
	public static void method1733() {
		Static381.anInt436 = 0;
		Static426.aClass239Array1 = new Class239[50];
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIII)V")
	public static void method1735(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static327.aClass230_Sub1_1.anInt7298 != 0 && arg0 != 0 && Static381.anInt436 < 50 && arg2 != -1) {
			Static426.aClass239Array1[Static381.anInt436++] = new Class239((byte) 1, arg2, arg0, arg1, arg3, 0);
		}
	}

	@OriginalMember(owner = "client!fm", name = "g", descriptor = "(I)Lclient!nn;")
	public static Class100 method1736() {
		try {
			return (Class100) Class.forName("Class100_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIBII)V")
	public static void method1737(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static47.anInt762 <= arg2 && arg2 <= Static60.anInt1086) {
			@Pc(19) int local19 = Static248.method3569(Static357.anInt6537, Static85.anInt1517, arg1);
			@Pc(25) int local25 = Static248.method3569(Static357.anInt6537, Static85.anInt1517, arg3);
			Static320.method4413(local25, arg2, local19, arg0);
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZII)Ljava/lang/String;")
	public static String method1738(@OriginalArg(2) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static296.method4058(arg0);
	}
}
