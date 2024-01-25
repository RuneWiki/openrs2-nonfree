import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static631 {

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "Lclient!qv;")
	public static Class280 aClass280_5;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIBI)I")
	public static int method8493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(21) int local21 = (arg1 * (arg2 & 0xFF00) & 0xFF0000 | (arg2 & 0xFF00FF) * arg1 & 0xFF00FF00) >>> 8;
		@Pc(31) int local31 = 255 - arg1;
		return ((local31 * (arg0 & 0xFF00FF) & 0xFF00FF00 | local31 * (arg0 & 0xFF00) & 0xFF0000) >>> 8) + local21;
	}
}
