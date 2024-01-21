import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!r", name = "t", descriptor = "I")
	public static int anInt4276;

	@OriginalMember(owner = "client!r", name = "v", descriptor = "I")
	public static int anInt4277;

	@OriginalMember(owner = "client!r", name = "z", descriptor = "I")
	public static int anInt4279;

	@OriginalMember(owner = "client!r", name = "F", descriptor = "[I")
	public static int[] anIntArray491;

	@OriginalMember(owner = "client!r", name = "I", descriptor = "Lclient!nd;")
	public static Class60_Sub1 aClass60_Sub1_165;

	@OriginalMember(owner = "client!r", name = "s", descriptor = "I")
	public static final int anInt4275 = 3353893;

	@OriginalMember(owner = "client!r", name = "u", descriptor = "[[B")
	public static final byte[][] aByteArrayArray41 = new byte[50][];

	@OriginalMember(owner = "client!r", name = "B", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2550 = Static118.method2249("slide:");

	@OriginalMember(owner = "client!r", name = "w", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2547 = aClass65_2550;

	@OriginalMember(owner = "client!r", name = "x", descriptor = "I")
	public static int anInt4278 = 0;

	@OriginalMember(owner = "client!r", name = "y", descriptor = "Lclient!oc;")
	public static Class65 aClass65_2548 = aClass65_2550;

	@OriginalMember(owner = "client!r", name = "A", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2549 = Static118.method2249("hint_mapmarkers");

	@OriginalMember(owner = "client!r", name = "G", descriptor = "I")
	public static int anInt4282 = 0;

	@OriginalMember(owner = "client!r", name = "H", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2551 = Static118.method2249("Fehler beim Laden Ihres Spielcharakters)3");

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(II)V")
	public static void method3228(@OriginalArg(1) int arg0) {
		Static90.anInt4438 = -1;
		if (arg0 == 37) {
			Static119.aDouble9 = 3.0D;
		} else if (arg0 == 50) {
			Static119.aDouble9 = 4.0D;
		} else if (arg0 == 75) {
			Static119.aDouble9 = 6.0D;
		} else {
			Static119.aDouble9 = 8.0D;
		}
		Static90.anInt4438 = -1;
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
	public static void method3230() {
		Static45.aClass1_Sub14_Sub1_8.method1761(146);
		for (@Pc(21) Class1_Sub20 local21 = (Class1_Sub20) Static200.aClass99_14.method3288(); local21 != null; local21 = (Class1_Sub20) Static200.aClass99_14.method3289()) {
			if (local21.anInt3110 == 0) {
				Static104.method1931(local21, true);
			}
		}
		if (Static7.aClass97_1 != null) {
			Static25.method448(Static7.aClass97_1);
			Static7.aClass97_1 = null;
		}
	}
}
