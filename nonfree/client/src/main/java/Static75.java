import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!je", name = "m", descriptor = "[Lclient!gd;")
	public static Class2_Sub2_Sub3_Sub3[] aClass2_Sub2_Sub3_Sub3Array12;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "I")
	public static int anInt1978 = 0;

	@OriginalMember(owner = "client!je", name = "c", descriptor = "Lclient!sg;")
	public static Class77 aClass77_790 = Static146.method2172(" <col=00ff80>");

	@OriginalMember(owner = "client!je", name = "d", descriptor = "Lclient!sg;")
	public static Class77 aClass77_791 = Static146.method2172("Anmelde)2Limit -Uberschritten)3");

	@OriginalMember(owner = "client!je", name = "f", descriptor = "Lclient!sg;")
	private static Class77 aClass77_792 = Static146.method2172("Loading title screen )2 ");

	@OriginalMember(owner = "client!je", name = "g", descriptor = "Lclient!sg;")
	private static Class77 aClass77_793 = Static146.method2172("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

	@OriginalMember(owner = "client!je", name = "h", descriptor = "Lclient!ua;")
	public static Class82 aClass82_31 = new Class82(64);

	@OriginalMember(owner = "client!je", name = "i", descriptor = "I")
	public static int anInt1980 = 1;

	@OriginalMember(owner = "client!je", name = "k", descriptor = "Lclient!sg;")
	public static Class77 aClass77_794 = Static146.method2172("Fehler beim Laden Ihres Spielcharakters)3");

	@OriginalMember(owner = "client!je", name = "o", descriptor = "Lclient!sg;")
	public static Class77 aClass77_795 = aClass77_792;

	@OriginalMember(owner = "client!je", name = "q", descriptor = "Lclient!sg;")
	public static Class77 aClass77_796 = aClass77_793;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
	public static void method1420() {
		aClass77_791 = null;
		aClass77_792 = null;
		aClass82_31 = null;
		aClass77_796 = null;
		aClass77_794 = null;
		aClass77_795 = null;
		aClass2_Sub2_Sub3_Sub3Array12 = null;
		aClass77_793 = null;
		aClass77_790 = null;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IZI)I")
	public static int method1421(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(45) int local45 = Static3.method63(arg1 + 91923, arg0 + 45365, 4) + (Static3.method63(arg1 + 37821, arg0 + 10294, 2) - 128 >> 1) + (Static3.method63(arg1, arg0, 1) + -128 >> 2) - 128;
		local45 = (int) ((double) local45 * 0.3D) + 35;
		if (local45 < 10) {
			local45 = 10;
		} else if (local45 > 60) {
			local45 = 60;
		}
		return local45;
	}
}
