import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static554 {

	@OriginalMember(owner = "client!sv", name = "p", descriptor = "[I")
	public static int[] anIntArray510;

	@OriginalMember(owner = "client!sv", name = "s", descriptor = "D")
	public static double aDouble24;

	@OriginalMember(owner = "client!sv", name = "m", descriptor = "Z")
	public static boolean aBoolean774 = false;

	@OriginalMember(owner = "client!sv", name = "n", descriptor = "J")
	public static long aLong260 = 1L;

	@OriginalMember(owner = "client!sv", name = "r", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_212 = new Class359(119, -2);

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(ZI)V")
	public static void method7691(@OriginalArg(0) boolean arg0) {
		for (@Pc(8) Class5_Sub52 local8 = (Class5_Sub52) Static573.aClass114_64.method2805(); local8 != null; local8 = (Class5_Sub52) Static573.aClass114_64.method2814()) {
			if (local8.aClass5_Sub17_Sub2_2 != null) {
				Static245.aClass5_Sub17_Sub4_2.method6184(local8.aClass5_Sub17_Sub2_2);
				local8.aClass5_Sub17_Sub2_2 = null;
			}
			if (local8.aClass5_Sub17_Sub2_3 != null) {
				Static245.aClass5_Sub17_Sub4_2.method6184(local8.aClass5_Sub17_Sub2_3);
				local8.aClass5_Sub17_Sub2_3 = null;
			}
			local8.method9052();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(46) Class5_Sub52 local46 = (Class5_Sub52) Static195.aClass114_21.method2805(); local46 != null; local46 = (Class5_Sub52) Static195.aClass114_21.method2814()) {
			if (local46.aClass5_Sub17_Sub2_2 != null) {
				Static245.aClass5_Sub17_Sub4_2.method6184(local46.aClass5_Sub17_Sub2_2);
				local46.aClass5_Sub17_Sub2_2 = null;
			}
			local46.method9052();
		}
		for (@Pc(72) Class5_Sub52 local72 = (Class5_Sub52) Static520.aClass300_40.method7182(); local72 != null; local72 = (Class5_Sub52) Static520.aClass300_40.method7192()) {
			if (local72.aClass5_Sub17_Sub2_2 != null) {
				Static245.aClass5_Sub17_Sub4_2.method6184(local72.aClass5_Sub17_Sub2_2);
				local72.aClass5_Sub17_Sub2_2 = null;
			}
			local72.method9052();
		}
	}
}
