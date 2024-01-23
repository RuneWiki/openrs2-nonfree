import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!mc", name = "x", descriptor = "Lclient!nm;")
	public static Class119 aClass119_11;

	@OriginalMember(owner = "client!mc", name = "z", descriptor = "Lclient!nm;")
	public static Class119 aClass119_12;

	@OriginalMember(owner = "client!mc", name = "n", descriptor = "I")
	public static int anInt636 = 0;

	@OriginalMember(owner = "client!mc", name = "p", descriptor = "I")
	public static int anInt637 = 0;

	@OriginalMember(owner = "client!mc", name = "r", descriptor = "[I")
	public static int[] anIntArray68 = new int[50];

	@OriginalMember(owner = "client!mc", name = "s", descriptor = "I")
	public static int anInt638 = 127;

	@OriginalMember(owner = "client!mc", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString25 = "flash1:";

	@OriginalMember(owner = "client!mc", name = "y", descriptor = "Z")
	public static boolean aBoolean68 = true;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILclient!si;I)I")
	public static int method595(@OriginalArg(1) Class157 arg0, @OriginalArg(2) int arg1) {
		if (!Static42.method777(arg0).method1127(arg1) && arg0.anObjectArray29 == null) {
			return -1;
		} else if (arg0.anIntArray534 == null || arg1 >= arg0.anIntArray534.length) {
			return -1;
		} else {
			return arg0.anIntArray534[arg1];
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZLclient!nm;)V")
	public static void method596(@OriginalArg(1) Class119 arg0) {
		Static14.aClass119_3 = arg0;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BI)V")
	public static void method597(@OriginalArg(1) int arg0) {
		Static97.method1896();
		Static25.method4018();
		@Pc(14) int local14 = Static198.method3329(arg0).anInt4005;
		if (local14 == 0) {
			return;
		}
		@Pc(23) int local23 = Static99.anIntArray148[arg0];
		if (local14 == 6) {
			Static195.anInt3889 = local23;
		}
		if (local14 == 9) {
			Static231.anInt4323 = local23;
		}
		if (local14 == 5) {
			Static239.anInt4459 = local23;
		}
	}
}
