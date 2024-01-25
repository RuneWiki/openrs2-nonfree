import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "Z")
	public static boolean aBoolean11 = false;

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "[I")
	public static final int[] anIntArray19 = new int[32];

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)V")
	public static void method71(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = Static167.anInt3605 * arg1 >> 8;
		if (arg0 == -1 && !Static82.aBoolean192) {
			Static344.method5519();
		} else if (arg0 != -1 && (Static93.anInt2303 != arg0 || !Static39.method920()) && local5 != 0 && !Static82.aBoolean192) {
			Static73.method1692(arg0, Static228.aClass216_78, local5);
		}
		Static93.anInt2303 = arg0;
	}
}
