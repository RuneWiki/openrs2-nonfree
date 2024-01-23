import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!uj", name = "I", descriptor = "I")
	public static int anInt5612;

	@OriginalMember(owner = "client!uj", name = "F", descriptor = "[J")
	public static long[] aLongArray54 = new long[200];

	@OriginalMember(owner = "client!uj", name = "H", descriptor = "I")
	public static int anInt5611 = -1;

	@OriginalMember(owner = "client!uj", name = "L", descriptor = "Z")
	public static boolean aBoolean389 = false;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZIIII)V")
	public static void method4549(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) boolean local5 = false;
		Static18.aLong15 = 0L;
		@Pc(15) int local15 = Static35.method557();
		if (local15 > 0 == arg1 <= 0) {
			local5 = true;
		}
		if (arg1 == 3 || local15 == 3) {
			arg0 = true;
		}
		if (Static215.aString254.startsWith("mac") && arg1 > 0) {
			arg0 = true;
		}
		if (arg0 && arg1 > 0) {
			local5 = true;
		}
		Static166.method2826(arg2, local15, arg0, arg3, arg1, local5);
	}
}
