import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "[Lclient!sw;")
	public static Class329[] aClass329Array1;

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "Z")
	public static boolean aBoolean49;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIII)I")
	public static int method958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = 255 - arg2;
		@Pc(34) int local34 = (arg2 * (arg1 & 0xFF00FF) & 0xFF00FF00 | arg2 * (arg1 & 0xFF00) & 0xFF0000) >>> 8;
		return (((arg0 & 0xFF00) * local16 & 0xFF0000 | local16 * (arg0 & 0xFF00FF) & 0xFF00FF00) >>> 8) + local34;
	}
}
