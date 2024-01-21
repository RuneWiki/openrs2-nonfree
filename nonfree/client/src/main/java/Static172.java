import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static172 {

	@OriginalMember(owner = "client!vf", name = "L", descriptor = "Lclient!v;")
	public static Class80 aClass80_5;

	@OriginalMember(owner = "client!vf", name = "O", descriptor = "[Z")
	public static boolean[] aBooleanArray17 = new boolean[112];

	@OriginalMember(owner = "client!vf", name = "Q", descriptor = "[I")
	public static int[] anIntArray398 = new int[256];

	@OriginalMember(owner = "client!vf", name = "R", descriptor = "Lclient!sd;")
	private static Class73 aClass73_2024 = Static122.method531("You can(Wt add yourself to your own friend list)3");

	@OriginalMember(owner = "client!vf", name = "U", descriptor = "Lclient!sd;")
	public static Class73 aClass73_2025 = aClass73_2024;

	@OriginalMember(owner = "client!vf", name = "X", descriptor = "Lclient!sd;")
	public static Class73 aClass73_2026 = Static122.method531("compass");

	@OriginalMember(owner = "client!vf", name = "ab", descriptor = "Lclient!sd;")
	public static Class73 aClass73_2027 = Static122.method531("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!vf", name = "bb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_2028 = Static122.method531("60 Sekunden noch einmal)3)3)3");

	@OriginalMember(owner = "client!vf", name = "i", descriptor = "(I)V")
	public static void method2688() {
		aClass73_2027 = null;
		aClass73_2025 = null;
		aClass80_5 = null;
		anIntArray398 = null;
		aClass73_2028 = null;
		aClass73_2026 = null;
		aClass73_2024 = null;
		aBooleanArray17 = null;
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(II)I")
	public static int method2691(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x3F;
	}
}
