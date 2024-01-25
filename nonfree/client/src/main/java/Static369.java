import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(ILclient!em;)V")
	public static void method5575(@OriginalArg(1) Class60_Sub1_Sub1_Sub3_Sub1 arg0) {
		@Pc(11) Class6_Sub35 local11 = (Class6_Sub35) Static635.aClass74_71.method1401((long) arg0.anInt4845);
		if (local11 == null) {
			return;
		}
		if (local11.aClass6_Sub17_Sub2_2 != null) {
			Static544.aClass6_Sub17_Sub3_2.method4663(local11.aClass6_Sub17_Sub2_2);
			local11.aClass6_Sub17_Sub2_2 = null;
		}
		local11.method9051();
	}
}
