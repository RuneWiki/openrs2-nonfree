import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!nk", name = "r", descriptor = "Lclient!wl;")
	public static final Class265 aClass265_42 = new Class265();

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(II[B)[B")
	public static byte[] method4259(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(14) byte[] local14 = new byte[arg0];
		Static459.method3348(arg1, 0, local14, 0, arg0);
		return local14;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IBII)I")
	public static int method4260(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(21) int local21 = (arg2 * (arg1 & 0xFF00FF) & 0xFF00FF00 | (arg1 & 0xFF00) * arg2 & 0xFF0000) >>> 8;
		@Pc(26) int local26 = 255 - arg2;
		return ((local26 * (arg0 & 0xFF00FF) & 0xFF00FF00 | (arg0 & 0xFF00) * local26 & 0xFF0000) >>> 8) + local21;
	}
}
