import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static626 {

	@OriginalMember(owner = "client!wga", name = "k", descriptor = "Lclient!oh;")
	public static Class237 aClass237_147;

	@OriginalMember(owner = "client!wga", name = "n", descriptor = "I")
	public static int anInt10465;

	@OriginalMember(owner = "client!wga", name = "o", descriptor = "[Lclient!mfa;")
	public static Class204[] aClass204Array1;

	@OriginalMember(owner = "client!wga", name = "b", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_150 = new Class71(97, 2);

	@OriginalMember(owner = "client!wga", name = "m", descriptor = "[I")
	public static final int[] anIntArray615 = new int[5];

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(III)I")
	public static int method8433(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(40) int local40 = Static16.method763(4, arg0 + 45365, arg1 + 91923) + (Static16.method763(2, arg0 + 10294, arg1 + 37821) - 128 >> 1) + (Static16.method763(1, arg0, arg1) + -128 >> 2) - 128;
		local40 = (int) ((double) local40 * 0.3D) + 35;
		if (local40 < 10) {
			local40 = 10;
		} else if (local40 > 60) {
			local40 = 60;
		}
		return local40;
	}

	@OriginalMember(owner = "client!wga", name = "b", descriptor = "(I)V")
	public static void method8434() {
		Static329.aClass253_22.method6598();
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(ZI)V")
	public static void method8436(@OriginalArg(1) int arg0) {
		Static389.anIntArray409 = new int[arg0];
		Static86.anIntArray106 = new int[arg0];
		Static82.anIntArray101 = new int[arg0];
		Static37.anIntArray51 = new int[arg0];
		Static303.anIntArray353 = new int[arg0];
	}
}
