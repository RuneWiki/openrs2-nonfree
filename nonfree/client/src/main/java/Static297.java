import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "Z")
	public static boolean aBoolean450;

	@OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
	public static int anInt5893;

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
	public static int anInt5891 = 0;

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray39 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!wl", name = "f", descriptor = "[Lclient!tj;")
	public static Class158[] aClass158Array1 = new Class158[50];

	@OriginalMember(owner = "client!wl", name = "h", descriptor = "I")
	public static int anInt5895 = 0;

	@OriginalMember(owner = "client!wl", name = "j", descriptor = "I")
	public static int anInt5897 = 99;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(B[Ljava/lang/String;[S)V")
	public static void method4542(@OriginalArg(1) String[] arg0, @OriginalArg(2) short[] arg1) {
		Static199.method3041(arg0, arg0.length - 1, arg1, 0);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZIIIIII)V")
	public static void method4543(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static72.anInt1430 = arg1;
		Static298.anInt5904 = arg3;
		Static54.anInt1154 = arg5;
		Static158.anInt2962 = arg2;
		Static192.anInt5400 = arg4;
		if (arg0 && Static72.anInt1430 >= 100) {
			Static68.anInt4743 = Static192.anInt5400 * 128 + 64;
			Static182.anInt3398 = Static298.anInt5904 * 128 + 64;
			Static185.anInt3457 = Static124.method1919(Static159.anInt2978, Static182.anInt3398, Static68.anInt4743) - Static158.anInt2962;
		}
		Static109.anInt2057 = 2;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)Lclient!ka;")
	public static Class90 method4544() {
		try {
			return (Class90) Class.forName("Class90_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIII)Z")
	public static boolean method4546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static266.method4099(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static191.method2911(local10 + 1, Static163.anIntArrayArrayArray16[arg0][arg1][arg2] + arg3, local14 + 1) && Static191.method2911(local10 + 128 - 1, Static163.anIntArrayArrayArray16[arg0][arg1 + 1][arg2] + arg3, local14 + 1) && Static191.method2911(local10 + 128 - 1, Static163.anIntArrayArrayArray16[arg0][arg1 + 1][arg2 + 1] + arg3, local14 + 128 - 1) && Static191.method2911(local10 + 1, Static163.anIntArrayArrayArray16[arg0][arg1][arg2 + 1] + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}
}
