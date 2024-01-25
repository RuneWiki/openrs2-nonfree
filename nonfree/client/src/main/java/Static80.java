import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!cq", name = "I", descriptor = "I")
	public static int anInt1600 = -1;

	@OriginalMember(owner = "client!cq", name = "K", descriptor = "Z")
	public static boolean aBoolean118 = false;

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lclient!dc;I)Lclient!dca;")
	public static Class66 method1360(@OriginalArg(0) Class3_Sub9 arg0) {
		@Pc(9) int local9 = arg0.method5610();
		@Pc(18) Class293 local18 = Static76.method1319()[arg0.method5633()];
		@Pc(25) Class15 local25 = Static582.method8112()[arg0.method5633()];
		@Pc(29) int local29 = arg0.method5624();
		@Pc(33) int local33 = arg0.method5624();
		return new Class66(local9, local18, local25, local29, local33);
	}
}
