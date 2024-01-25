import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
	public static int anInt2672 = 0;

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "[Z")
	public static final boolean[] aBooleanArray12 = new boolean[100];

	@OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
	public static int anInt2675 = -1;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method2016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(12) int local12 = arg0; local12 <= arg2; local12++) {
			for (@Pc(16) int local16 = arg3; local16 <= arg4; local16++) {
				if (Static36.anIntArrayArray7[local12][local16] == arg1 && Static210.anIntArrayArray28[local12][local16] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)I")
	public static int method2017(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}
}
