import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static465 {

	@OriginalMember(owner = "client!wt", name = "i", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_230 = new Class214(113, 10);

	@OriginalMember(owner = "client!wt", name = "j", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_102 = new Class212(73, 4);

	@OriginalMember(owner = "client!wt", name = "l", descriptor = "I")
	public static int anInt7963 = -2;

	@OriginalMember(owner = "client!wt", name = "m", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_103 = new Class212(18, -1);

	@OriginalMember(owner = "client!wt", name = "n", descriptor = "[Lclient!kg;")
	public static final Class130[] aClass130Array2 = new Class130[14];

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IZIIFIIII)[[I")
	public static int[][] method6296(@OriginalArg(4) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class4_Sub3_Sub15 local13 = new Class4_Sub3_Sub15();
		local13.aBoolean237 = false;
		local13.anInt3765 = 4;
		local13.anInt3769 = (int) (arg0 * 4096.0F);
		local13.anInt3761 = 3;
		local13.anInt3774 = 8;
		local13.method6341();
		Static447.method6111(64, 256);
		for (@Pc(40) int local40 = 0; local40 < 256; local40++) {
			local13.method3386(local9[local40], local40);
		}
		return local9;
	}
}
