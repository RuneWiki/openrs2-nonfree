import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!te", name = "T", descriptor = "[I")
	public static int[] anIntArray401;

	@OriginalMember(owner = "client!te", name = "y", descriptor = "Lclient!r;")
	public static Class70 aClass70_1 = new Class70();

	@OriginalMember(owner = "client!te", name = "B", descriptor = "Lclient!kb;")
	private static Class46 aClass46_1254 = Static65.method1172("purple:");

	@OriginalMember(owner = "client!te", name = "E", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1255 = aClass46_1254;

	@OriginalMember(owner = "client!te", name = "H", descriptor = "I")
	public static int anInt3496 = 0;

	@OriginalMember(owner = "client!te", name = "I", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1256 = aClass46_1254;

	@OriginalMember(owner = "client!te", name = "M", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1257 = Static65.method1172("leuchten2:");

	@OriginalMember(owner = "client!te", name = "O", descriptor = "Lclient!nb;")
	public static Class57 aClass57_27 = new Class57(5);

	@OriginalMember(owner = "client!te", name = "P", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1258 = Static65.method1172("b12_full");

	@OriginalMember(owner = "client!te", name = "Q", descriptor = "Lclient!kb;")
	private static Class46 aClass46_1259 = Static65.method1172("flash2:");

	@OriginalMember(owner = "client!te", name = "S", descriptor = "Lclient!kb;")
	private static Class46 aClass46_1260 = Static65.method1172("au");

	@OriginalMember(owner = "client!te", name = "U", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1261 = aClass46_1259;

	@OriginalMember(owner = "client!te", name = "V", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1262 = aClass46_1259;

	@OriginalMember(owner = "client!te", name = "W", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1263 = Static65.method1172("http:)4)4");

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V")
	public static void method2534() {
		aClass46_1263 = null;
		aClass46_1254 = null;
		aClass70_1 = null;
		aClass46_1258 = null;
		aClass46_1255 = null;
		aClass46_1260 = null;
		aClass46_1261 = null;
		anIntArray401 = null;
		aClass46_1262 = null;
		aClass46_1259 = null;
		aClass46_1256 = null;
		aClass46_1257 = null;
		aClass57_27 = null;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(II)V")
	public static void method2535(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static123.aBooleanArray16[arg0]) {
			return;
		}
		Static18.aClass44_4.method1626(arg0);
		if (Static26.aClass33ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(26) boolean local26 = true;
		for (@Pc(28) int local28 = 0; local28 < Static26.aClass33ArrayArray1[arg0].length; local28++) {
			if (Static26.aClass33ArrayArray1[arg0][local28] != null) {
				if (Static26.aClass33ArrayArray1[arg0][local28].anInt1441 == 2) {
					local26 = false;
				} else {
					Static26.aClass33ArrayArray1[arg0][local28] = null;
				}
			}
		}
		if (local26) {
			Static26.aClass33ArrayArray1[arg0] = null;
		}
		Static123.aBooleanArray16[arg0] = false;
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(ZLclient!kb;)I")
	public static int method2536(@OriginalArg(1) Class46 arg0) {
		if (Static122.anInt2902 == 1) {
			return 7;
		} else if (arg0.method1367(Static173.aClass46_1359)) {
			return 1;
		} else if (arg0.method1367(Static64.aClass46_572)) {
			return 1;
		} else if (arg0.method1367(Static165.aClass46_1315)) {
			return 2;
		} else if (arg0.method1367(Static14.aClass46_98)) {
			return 2;
		} else if (arg0.method1367(aClass46_1260)) {
			return 3;
		} else if (arg0.method1367(Static26.aClass46_160)) {
			return 4;
		} else if (arg0.method1367(Static59.aClass46_535)) {
			return 4;
		} else if (arg0.method1367(Static54.aClass46_473)) {
			return 5;
		} else if (arg0.method1367(Static110.aClass46_874)) {
			return 6;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(III)Z")
	public static boolean method2539(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 >> arg0 + 1 & 0x1) != 0;
	}
}
