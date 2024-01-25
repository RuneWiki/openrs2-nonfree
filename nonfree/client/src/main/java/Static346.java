import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!r", name = "v", descriptor = "Z")
	public static boolean aBoolean425 = false;

	@OriginalMember(owner = "client!r", name = "w", descriptor = "I")
	public static int anInt6124 = 0;

	@OriginalMember(owner = "client!r", name = "E", descriptor = "[I")
	public static final int[] anIntArray514 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!r", name = "H", descriptor = "I")
	public static int anInt6132 = 0;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method4874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(12) int local12 = arg3; local12 <= arg1; local12++) {
			for (@Pc(16) int local16 = arg4; local16 <= arg2; local16++) {
				if (arg0 == Static404.anIntArrayArray61[local12][local16] && Static51.anIntArrayArray26[local12][local16] <= 1) {
					return true;
				}
			}
		}
		return false;
	}
}
