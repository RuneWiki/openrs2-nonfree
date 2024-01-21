import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static153 {

	@OriginalMember(owner = "client!ta", name = "r", descriptor = "Z")
	public static boolean aBoolean226;

	@OriginalMember(owner = "client!ta", name = "A", descriptor = "[I")
	public static int[] anIntArray370;

	@OriginalMember(owner = "client!ta", name = "B", descriptor = "Lclient!cb;")
	public static Class13_Sub1 aClass13_Sub1_18;

	@OriginalMember(owner = "client!ta", name = "w", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1854 = Static122.method531("Okay");

	@OriginalMember(owner = "client!ta", name = "x", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1855 = Static122.method531("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!ta", name = "y", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1856 = Static122.method531(")3runescape)3com");

	@OriginalMember(owner = "client!ta", name = "z", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1857 = Static122.method531(" )2> <col=ffffff>");

	@OriginalMember(owner = "client!ta", name = "C", descriptor = "I")
	public static int anInt3415 = 0;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V")
	public static void method2483() {
		aClass73_1855 = null;
		aClass73_1857 = null;
		aClass13_Sub1_18 = null;
		aClass73_1854 = null;
		anIntArray370 = null;
		aClass73_1856 = null;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIB)I")
	public static int method2484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > 179) {
			arg0 /= 2;
		}
		if (arg2 > 192) {
			arg0 /= 2;
		}
		if (arg2 > 217) {
			arg0 /= 2;
		}
		if (arg2 > 243) {
			arg0 /= 2;
		}
		return (arg1 / 4 << 10) + (arg0 / 32 << 7) + arg2 / 2;
	}
}
