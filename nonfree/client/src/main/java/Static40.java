import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!bfa", name = "g", descriptor = "I")
	public static int anInt8513;

	@OriginalMember(owner = "client!bfa", name = "c", descriptor = "[I")
	public static final int[] anIntArray562 = new int[1000];

	@OriginalMember(owner = "client!bfa", name = "d", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_299 = new Class179(119, 7);

	@OriginalMember(owner = "client!bfa", name = "e", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_300 = new Class179(126, 6);

	@OriginalMember(owner = "client!bfa", name = "f", descriptor = "[Z")
	public static final boolean[] aBooleanArray25 = new boolean[8];

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(DI)V")
	public static void method7250(@OriginalArg(0) double arg0) {
		if (Static642.aDouble180 == arg0) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < 256; local16++) {
			@Pc(28) int local28 = (int) (Math.pow((double) local16 / 255.0D, arg0) * 255.0D);
			Static293.anIntArray281[local16] = local28 <= 255 ? local28 : 255;
		}
		Static642.aDouble180 = arg0;
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(II)Z")
	public static boolean method7251(@OriginalArg(1) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}
}
