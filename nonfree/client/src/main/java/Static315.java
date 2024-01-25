import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!lp", name = "n", descriptor = "[I")
	public static int[] anIntArray600;

	@OriginalMember(owner = "client!lp", name = "p", descriptor = "[[S")
	public static short[][] aShortArrayArray31;

	@OriginalMember(owner = "client!lp", name = "f", descriptor = "I")
	public static final int anInt8437 = 1337;

	@OriginalMember(owner = "client!lp", name = "k", descriptor = "Lclient!baa;")
	public static final Class28 aClass28_21 = new Class28(11, 0, 1, 2);

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(I)V")
	public static void method7016() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static536.aBooleanArray39[local3] = false;
		}
		Static260.anInt4826 = Static90.anInt1932;
		Static309.anInt5528 = 0;
		Static94.anInt2006 = -1;
		Static238.anInt4482 = -1;
		Static332.anInt6122 = -1;
		Static465.anInt7977 = Static7.anInt337;
		Static506.anInt8458 = Static177.anInt3712;
		Static101.anInt2066 = Static548.anInt8906;
		Static204.anInt3987 = 0;
		Static300.anInt4989 = Static323.anInt6015;
		Static311.anInt5570 = 5;
		Static24.anInt646 = Static412.anInt575;
		Static408.anInt7104 = -1;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "([[II)V")
	public static void method7018(@OriginalArg(0) int[][] arg0) {
		Static582.anIntArrayArray69 = arg0;
	}

	@OriginalMember(owner = "client!lp", name = "d", descriptor = "(I)V")
	public static void method7021() {
		if (Static561.anIntArray667 != null && Static388.anIntArray472 != null) {
			return;
		}
		Static561.anIntArray667 = new int[256];
		Static388.anIntArray472 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			@Pc(22) double local22 = (double) local13 / 255.0D * 6.283185307179586D;
			Static561.anIntArray667[local13] = (int) (Math.sin(local22) * 4096.0D);
			Static388.anIntArray472[local13] = (int) (Math.cos(local22) * 4096.0D);
		}
	}
}
