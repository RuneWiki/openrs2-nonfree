import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(B)V")
	public static void method5568() {
		if (Static205.anInt3674 != 0) {
			Static365.aClass389_9.method9073();
			Static13.method207();
			Static372.method5545();
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lclient!mj;BZ)V")
	public static void method5569(@OriginalArg(0) Class238 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(16) int local16 = arg0.anInt5941 == 0 ? arg0.anInt5985 : arg0.anInt5941;
		@Pc(29) int local29 = arg0.anInt5995 == 0 ? arg0.anInt5973 : arg0.anInt5995;
		Static537.method7384(arg1, Static397.aClass238ArrayArray2[arg0.anInt5971 >> 16], arg0.anInt5971, local16, local29);
		if (arg0.aClass238Array2 != null) {
			Static537.method7384(arg1, arg0.aClass238Array2, arg0.anInt5971, local16, local29);
		}
		@Pc(69) Class5_Sub38 local69 = (Class5_Sub38) Static438.aClass306_31.method6943((long) arg0.anInt5971);
		if (local69 != null) {
			Static300.method4692(local29, local69.anInt6418, local16, arg1);
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lclient!gda;BLclient!gda;I)V")
	public static void method5571(@OriginalArg(0) Class126 arg0, @OriginalArg(2) Class126 arg1) {
		Static7.aClass126_4 = arg0;
		Static433.aClass126_200 = arg1;
	}
}
