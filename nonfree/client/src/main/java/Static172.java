import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!gq", name = "G", descriptor = "[I")
	public static int[] anIntArray164;

	@OriginalMember(owner = "client!gq", name = "S", descriptor = "Lclient!hea;")
	public static Class135 aClass135_1;

	@OriginalMember(owner = "client!gq", name = "O", descriptor = "Lclient!hq;")
	public static final Class145 aClass145_3 = new Class145("WTI", 5);

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(BII)I")
	public static int method3146(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >>> 24;
		@Pc(25) int local25 = (local7 * (arg1 & 0xFF00) & 0xFF0000 | local7 * (arg1 & 0xFF00FF) & 0xFF00FF00) >>> 8;
		@Pc(30) int local30 = 255 - local7;
		return ((local30 * (arg0 & 0xFF00FF) & 0xFF00FF00 | (arg0 & 0xFF00) * local30 & 0xFF0000) >>> 8) + local25;
	}
}
