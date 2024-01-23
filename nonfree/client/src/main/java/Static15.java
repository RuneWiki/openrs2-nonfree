import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
	public static int anInt238;

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "F")
	public static float aFloat2 = 128.0F;

	@OriginalMember(owner = "client!bb", name = "h", descriptor = "[I")
	public static int[] anIntArray21 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!bb", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString10 = "rating: ";

	@OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
	public static int anInt243 = 0;

	@OriginalMember(owner = "client!bb", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString11 = "Loaded sprites";

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IB)V")
	public static void method207() {
		Static222.aClass169_122.method4020(5);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method208(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(11) int local11 = arg2.indexOf(arg1); local11 != -1; local11 = arg2.indexOf(arg1, local11 + arg0.length())) {
			arg2 = arg2.substring(0, local11) + arg0 + arg2.substring(local11 + arg1.length());
		}
		return arg2;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method209(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(13) int local13 = 0; local13 < Static268.anInt5931; local13++) {
			if (arg0.equalsIgnoreCase(Static255.aStringArray42[local13])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static250.aStringArray27[local13])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
	public static void method210() {
		Static313.aClass169_165.method4014();
		Static164.aClass169_94.method4014();
		Static75.aClass169_53.method4014();
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)Lclient!ok;")
	public static Class129 method211() {
		try {
			return (Class129) Class.forName("Class129_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIIII)V")
	public static void method212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (Static183.method3031(arg5)) {
			Static36.method641(Static313.aClass146ArrayArray1[arg5], -1, arg6, arg0, arg2, arg4, arg1, arg3);
		}
	}
}
