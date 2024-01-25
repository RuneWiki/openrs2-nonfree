import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static415 {

	@OriginalMember(owner = "client!pr", name = "y", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_205 = new Class363(112, 8);

	@OriginalMember(owner = "client!pr", name = "D", descriptor = "J")
	public static long aLong200 = 0L;

	@OriginalMember(owner = "client!pr", name = "H", descriptor = "I")
	public static int anInt7185 = -1;

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(II)I")
	public static int method6027(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(BII)I")
	public static int method6028(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 >>> 24;
		@Pc(12) int local12 = 255 - local7;
		@Pc(38) int local38 = (local7 * (arg0 & 0xFF00FF) & 0xFF00FF00 | (arg0 & 0xFF00) * local7 & 0xFF0000) >>> 8;
		return ((local12 * (arg1 & 0xFF00FF) & 0xFF00FF00 | (arg1 & 0xFF00) * local12 & 0xFF0000) >>> 8) + local38;
	}
}
