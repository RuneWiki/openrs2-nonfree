import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static14 {

	@OriginalMember(owner = "client!ap", name = "H", descriptor = "B")
	public static byte aByte6;

	@OriginalMember(owner = "client!ap", name = "K", descriptor = "Lclient!cb;")
	public static Class35 aClass35_1;

	@OriginalMember(owner = "client!ap", name = "N", descriptor = "I")
	public static int anInt247;

	@OriginalMember(owner = "client!ap", name = "O", descriptor = "I")
	public static int anInt248;

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(II)Z")
	public static boolean method269(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1;
	}

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "(II)I")
	public static int method271(@OriginalArg(0) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIZIIII)V")
	public static void method272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static409.anInt6536 = arg0;
		Static164.anInt6557 = arg1;
		Static109.anInt1672 = arg3;
		Static151.anInt2353 = arg5;
		Static189.anInt3460 = arg4;
		if (arg2 && Static151.anInt2353 >= 100) {
			Static80.anInt1106 = Static164.anInt6557 * 128 + 64;
			Static386.anInt7155 = Static409.anInt6536 * 128 + 64;
			Static375.anInt6055 = Static135.method1732(Static386.anInt7155, Static80.anInt1106, Static390.anInt6272) - Static109.anInt1672;
		}
		Static139.anInt2147 = 2;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ZI)Z")
	public static boolean method273(@OriginalArg(1) int arg0) {
		return arg0 == 20 || arg0 == 10 || arg0 == 1004 || arg0 == 11 || arg0 == 51;
	}
}
