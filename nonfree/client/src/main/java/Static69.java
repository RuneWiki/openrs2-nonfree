import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "[I")
	public static final int[] anIntArray80 = new int[2500];

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!re;I)V")
	public static void method1524(@OriginalArg(0) Class25_Sub1_Sub1_Sub2 arg0) {
		for (@Pc(10) Class5_Sub27 local10 = (Class5_Sub27) Static16.aClass211_1.method5608(); local10 != null; local10 = (Class5_Sub27) Static16.aClass211_1.method5603()) {
			if (local10.aClass25_Sub1_Sub1_Sub2_1 == arg0) {
				if (local10.aClass5_Sub17_Sub1_1 != null) {
					Static5.aClass5_Sub17_Sub3_1.method3544(local10.aClass5_Sub17_Sub1_1);
					local10.aClass5_Sub17_Sub1_1 = null;
				}
				local10.method5803();
				return;
			}
		}
	}
}
