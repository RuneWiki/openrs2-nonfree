import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static532 {

	@OriginalMember(owner = "client!tba", name = "b", descriptor = "Lclient!vq;")
	public static Class2_Sub6_Sub21 aClass2_Sub6_Sub21_1 = null;

	@OriginalMember(owner = "client!tba", name = "b", descriptor = "(I)V")
	public static void method8011() {
		@Pc(18) Class2_Sub52 local18 = Static130.method3019(Static3.aClass94_103, Static361.aClass183_1);
		local18.aClass2_Sub11_Sub2_7.method8374(0);
		Static96.method2563(local18);
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(BLclient!vq;)V")
	public static void method8012(@OriginalArg(1) Class2_Sub6_Sub21 arg0) {
		arg0.method8933();
		@Pc(18) boolean local18 = false;
		for (@Pc(23) Class2_Sub6_Sub21 local23 = (Class2_Sub6_Sub21) Static522.aClass211_7.method6008(); local23 != null; local23 = (Class2_Sub6_Sub21) Static522.aClass211_7.method6000()) {
			if (Static608.method8914(local23.method8939(), arg0.method8939())) {
				Static288.method5232(local23, arg0);
				local18 = true;
				break;
			}
		}
		if (!local18) {
			Static522.aClass211_7.method6002(arg0);
		}
	}
}
