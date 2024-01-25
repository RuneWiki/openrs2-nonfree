import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!br", name = "q", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_17 = new Class145(73, 3);

	@OriginalMember(owner = "client!br", name = "u", descriptor = "Lclient!bw;")
	public static final Class2_Sub10 aClass2_Sub10_1 = new Class2_Sub10(0, 0);

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(III)I")
	public static int method1218(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 >>> 24;
		@Pc(17) int local17 = 255 - local7;
		@Pc(35) int local35 = (local7 * (arg0 & 0xFF00) & 0xFF0000 | (arg0 & 0xFF00FF) * local7 & 0xFF00FF00) >>> 8;
		return ((local17 * (arg1 & 0xFF00) & 0xFF0000 | local17 * (arg1 & 0xFF00FF) & 0xFF00FF00) >>> 8) + local35;
	}
}
