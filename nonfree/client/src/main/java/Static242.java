import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!pb", name = "T", descriptor = "Z")
	public static boolean aBoolean330;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIII)I", line = 24)
	public static int method4468(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(21) int local21 = (arg0 * (arg1 & 0xFF00FF) & 0xFF00FF00 | (arg1 & 0xFF00) * arg0 & 0xFF0000) >>> 8;
		@Pc(35) int local35 = 255 - arg0;
		return local21 + (((arg2 & 0xFF00FF) * local35 & 0xFF00FF00 | (arg2 & 0xFF00) * local35 & 0xFF0000) >>> 8);
	}
}
