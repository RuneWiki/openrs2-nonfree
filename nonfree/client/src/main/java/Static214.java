import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!id", name = "g", descriptor = "J")
	public static long aLong171;

	@OriginalMember(owner = "client!id", name = "h", descriptor = "[I")
	public static int[] anIntArray246;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "I")
	public static int anInt4163 = -1;

	@OriginalMember(owner = "client!id", name = "c", descriptor = "Lclient!br;")
	public static final Class37 aClass37_2 = new Class37("", 10);

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IZ)Z")
	public static boolean method3555(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIII)I")
	public static int method3556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(21) int local21 = ((arg0 & 0xFF00FF) * arg1 & 0xFF00FF00 | (arg0 & 0xFF00) * arg1 & 0xFF0000) >>> 8;
		@Pc(26) int local26 = 255 - arg1;
		return ((local26 * (arg2 & 0xFF00FF) & 0xFF00FF00 | (arg2 & 0xFF00) * local26 & 0xFF0000) >>> 8) + local21;
	}
}
