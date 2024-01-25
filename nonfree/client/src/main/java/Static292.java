import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!mca", name = "x", descriptor = "Lclient!rl;")
	public static Class255 aClass255_1;

	@OriginalMember(owner = "client!mca", name = "u", descriptor = "Lclient!sw;")
	public static final Class277 aClass277_41 = new Class277(8);

	@OriginalMember(owner = "client!mca", name = "w", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_86 = new Class45("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

	@OriginalMember(owner = "client!mca", name = "b", descriptor = "(III)V")
	public static void method5118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class64 local7 = Static263.aClass64ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 != null && local7.aClass20_Sub5_1 != null) {
			local7.aClass20_Sub5_1 = null;
		}
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(IIII)I")
	public static int method5120(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = 255 - arg1;
		@Pc(31) int local31 = (arg1 * (arg2 & 0xFF00) & 0xFF0000 | (arg2 & 0xFF00FF) * arg1 & 0xFF00FF00) >>> 8;
		return local31 + (((arg0 & 0xFF00) * local13 & 0xFF0000 | local13 * (arg0 & 0xFF00FF) & 0xFF00FF00) >>> 8);
	}
}
