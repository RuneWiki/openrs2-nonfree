import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!ig", name = "h", descriptor = "Lclient!oe;")
	public static final Class66 aClass66_29 = new Class66(260);

	@OriginalMember(owner = "client!ig", name = "x", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_739 = Static177.method3050("Please reload this page)3");

	@OriginalMember(owner = "client!ig", name = "m", descriptor = "Lclient!jd;")
	public static Class46 aClass46_737 = aClass46_739;

	@OriginalMember(owner = "client!ig", name = "u", descriptor = "Lclient!jd;")
	public static Class46 aClass46_738 = null;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(BLclient!nh;Lclient!nh;)I")
	public static int method1562(@OriginalArg(1) Class62 arg0, @OriginalArg(2) Class62 arg1) {
		@Pc(1) int local1 = 0;
		if (arg1.method2864(Static43.anInt1086)) {
			local1++;
		}
		if (arg0.method2864(Static183.anInt1803)) {
			local1++;
		}
		if (arg0.method2864(Static73.anInt1868)) {
			local1++;
		}
		if (arg0.method2864(Static182.anInt4080)) {
			local1++;
		}
		if (arg0.method2864(Static97.anInt2492)) {
			local1++;
		}
		if (arg0.method2864(Static72.anInt1865)) {
			local1++;
		}
		arg0.method2864(Static80.anInt2012);
		arg0.method2864(Static36.anInt954);
		arg0.method2864(Static4.anInt2847);
		arg0.method2864(Static120.anInt3734);
		arg0.method2864(Static140.anInt3269);
		return local1;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IZ)V")
	public static void method1567(@OriginalArg(0) int arg0) {
		if (Static71.anInt1861 == 0) {
			Static175.aClass4_Sub2_Sub4_2.method2787(arg0);
		} else {
			Static99.anInt2522 = arg0;
		}
	}
}
