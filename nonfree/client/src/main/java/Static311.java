import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!maa", name = "L", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_50 = new Class344(37, 3);

	@OriginalMember(owner = "client!maa", name = "S", descriptor = "Lclient!au;")
	public static final Class22 aClass22_41 = new Class22();

	@OriginalMember(owner = "client!maa", name = "T", descriptor = "I")
	public static int anInt6268 = 0;

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(ILclient!is;)V")
	public static void method4929(@OriginalArg(1) Class155 arg0) {
		@Pc(7) Class155 local7 = Static510.method5509(arg0);
		@Pc(13) int local13;
		@Pc(11) int local11;
		if (local7 == null) {
			local11 = Static71.anInt1872;
			local13 = Static123.anInt9150;
		} else {
			local13 = local7.anInt4806;
			local11 = local7.anInt4831;
		}
		Static276.method4457(local11, arg0, local13, false);
		Static145.method2520(local11, local13, arg0);
	}
}
