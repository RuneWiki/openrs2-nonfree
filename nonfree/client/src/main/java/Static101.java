import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!fa", name = "q", descriptor = "Lclient!fp;")
	public static Class75 aClass75_1;

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "Lclient!gn;")
	public static final Class84 aClass84_5 = new Class84();

	@OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
	public static int anInt2036 = -50;

	@OriginalMember(owner = "client!fa", name = "v", descriptor = "[I")
	public static final int[] anIntArray158 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IB)Z")
	public static boolean method1778(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(Z)V")
	public static void method1784() {
		if (Static277.anIntArray336 != null && Static345.anIntArray416 != null) {
			return;
		}
		Static345.anIntArray416 = new int[256];
		Static277.anIntArray336 = new int[256];
		for (@Pc(18) int local18 = 0; local18 < 256; local18++) {
			@Pc(27) double local27 = (double) local18 / 255.0D * 6.283185307179586D;
			Static277.anIntArray336[local18] = (int) (Math.sin(local27) * 4096.0D);
			Static345.anIntArray416[local18] = (int) (Math.cos(local27) * 4096.0D);
		}
	}
}
