import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "B")
	public static byte aByte21;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
	public static int anInt1063 = 0;

	@OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
	public static int anInt1065 = 0;

	@OriginalMember(owner = "client!dk", name = "k", descriptor = "I")
	public static int anInt1071 = 0;

	@OriginalMember(owner = "client!dk", name = "l", descriptor = "[I")
	public static final int[] anIntArray116 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIBI)I")
	public static int method933(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(21) int local21 = ((arg1 & 0xFF00) * arg2 & 0xFF0000 | (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >>> 8;
		@Pc(26) int local26 = 255 - arg2;
		return local21 + ((local26 * (arg0 & 0xFF00) & 0xFF0000 | local26 * (arg0 & 0xFF00FF) & 0xFF00FF00) >>> 8);
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)V")
	public static void method935() {
		if (Static135.anInt2114 == 6) {
			Static124.method1519(false);
		} else {
			Static261.aClass110_3 = Static337.aClass110_2;
			Static337.aClass110_2 = null;
			Static154.method1923(12);
		}
	}

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "(I)V")
	public static void method938() {
		Static459.aClass77_63.method1395();
		Static368.aClass77_60.method1395();
		Static141.aClass77_51.method1395();
		Static254.aClass77_35.method1395();
		Static402.aClass77_54.method1395();
	}
}
