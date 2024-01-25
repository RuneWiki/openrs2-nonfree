import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!ap", name = "k", descriptor = "I")
	public static int anInt220;

	@OriginalMember(owner = "client!ap", name = "B", descriptor = "I")
	public static int anInt236;

	@OriginalMember(owner = "client!ap", name = "x", descriptor = "I")
	public static int anInt233 = 0;

	@OriginalMember(owner = "client!ap", name = "y", descriptor = "I")
	public static int anInt234 = 0;

	@OriginalMember(owner = "client!ap", name = "A", descriptor = "[[I")
	public static final int[][] anIntArrayArray3 = new int[6][];

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(BIIII)Z")
	public static boolean method276(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!Static20.aBoolean21 || !Static110.aBoolean234) {
			return false;
		} else if (Static314.anInt6404 < 100) {
			return false;
		} else if (Static562.method7912(arg3, arg1, arg2)) {
			@Pc(26) int local26 = arg1 << Static276.anInt5846;
			@Pc(30) int local30 = arg2 << Static276.anInt5846;
			if (Static142.method3163(Static325.anInt6512, arg0, Static325.anInt6512, Static500.aClass274Array2[arg3].method8041(arg1, arg2), local30, local26)) {
				Static104.anInt2625++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
