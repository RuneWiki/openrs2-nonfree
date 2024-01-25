import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "Lclient!cga;")
	public static Class55 aClass55_2;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)Lclient!pf;")
	public static Class280 method169(@OriginalArg(1) int arg0) {
		@Pc(10) Class280 local10 = (Class280) Static77.aClass359_8.method8517((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static172.aClass223_34.method5267(arg0, 0);
		local10 = new Class280();
		if (local21 != null) {
			local10.method6965(new Class6_Sub15(local21));
		}
		local10.method6963();
		Static77.aClass359_8.method8515((long) arg0, local10);
		return local10;
	}
}
