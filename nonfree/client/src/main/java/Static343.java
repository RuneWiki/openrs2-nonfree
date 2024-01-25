import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!na", name = "c", descriptor = "Lclient!sa;")
	public static Class299 aClass299_5;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(II)Lclient!iv;")
	public static Class167 method5092(@OriginalArg(1) int arg0) {
		@Pc(15) Class167 local15 = (Class167) Static447.aClass223_51.method4943((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static269.aClass31_59.method667(1, arg0);
		local15 = new Class167();
		local15.anInt4717 = arg0;
		if (local25 != null) {
			local15.method3997(new Class4_Sub9(local25));
		}
		local15.method4000();
		if (local15.anInt4716 == 2 && Static29.aClass183_3.method4289((long) arg0) == null) {
			Static29.aClass183_3.method4282((long) arg0, new Class4_Sub33(Static243.anInt4815));
			Static598.aClass167Array1[Static243.anInt4815++] = local15;
		}
		Static447.aClass223_51.method4938((long) arg0, local15);
		return local15;
	}
}
