import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static381 {

	@OriginalMember(owner = "client!t", name = "a", descriptor = "Ljava/lang/Boolean;")
	public static Boolean aBoolean305 = Boolean.FALSE;

	@OriginalMember(owner = "client!t", name = "c", descriptor = "I")
	public static int anInt4535 = 0;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ILclient!nn;)Lclient!bq;")
	public static Class20_Sub2 method3657(@OriginalArg(1) Class10_Sub8 arg0) {
		return new Class20_Sub2(arg0.method2492(), arg0.method2492(), arg0.method2492(), arg0.method2492(), arg0.method2507(), arg0.method2502());
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IZFIIIII)[I")
	public static int[] method3658(@OriginalArg(2) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class10_Sub2_Sub22 local10 = new Class10_Sub2_Sub22();
		local10.anInt4917 = 8;
		local10.aBoolean335 = true;
		local10.anInt4918 = 35;
		local10.anInt4922 = 4;
		local10.anInt4910 = (int) (arg0 * 4096.0F);
		local10.anInt4916 = 8;
		local10.method6036();
		Static229.method3414(2048, 1);
		local10.method3963(local6, 0);
		return local6;
	}
}
