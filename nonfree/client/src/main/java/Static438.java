import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static438 {

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(IIII)I")
	public static int method5488(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(21) int local21 = (arg0 * (arg2 & 0xFF00) & 0xFF0000 | (arg2 & 0xFF00FF) * arg0 & 0xFF00FF00) >>> 8;
		@Pc(35) int local35 = 255 - arg0;
		return ((local35 * (arg1 & 0xFF00FF) & 0xFF00FF00 | local35 * (arg1 & 0xFF00) & 0xFF0000) >>> 8) + local21;
	}
}
