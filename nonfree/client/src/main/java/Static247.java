import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!rn", name = "e", descriptor = "I")
	public static int anInt1590 = 0;

	@OriginalMember(owner = "client!rn", name = "j", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray8 = new String[100];

	@OriginalMember(owner = "client!rn", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString59 = "Loading world list data";

	@OriginalMember(owner = "client!rn", name = "n", descriptor = "Lclient!hm;")
	public static Interface4 anInterface4_2 = null;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIII)V")
	public static void method1453(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = Static172.anInt3363 * arg2 >> 8;
		if (local5 != 0 && arg0 != -1) {
			Static130.method2283(Static265.aClass119_83, local5, arg0);
			Static197.aBoolean347 = true;
		}
	}

	@OriginalMember(owner = "client!rn", name = "d", descriptor = "(IB)V")
	public static void method1454(@OriginalArg(0) int arg0) {
		Static175.anInt3415 = arg0;
		Static272.anInt5001 = -1;
		Static272.anInt5001 = -1;
		Static94.method1798();
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method1456(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(13) int local13 = 0; local13 < Static282.anInt5138; local13++) {
			if (arg0.equalsIgnoreCase(Static18.aStringArray3[local13])) {
				return true;
			}
		}
		return false;
	}
}
