import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_62 = new Class45(79, 2);

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_38 = new Class77(13, 7);

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
	public static void method3621() {
		Static316.aClass84Array11 = null;
		Static225.aClass84Array6 = null;
		Static340.aClass80_3 = null;
		Static478.aClass84Array14 = null;
		Static275.aClass84Array9 = null;
		Static336.aClass84Array12 = null;
		Static70.aClass84Array3 = null;
		Static308.aClass84Array10 = null;
		Static214.aClass84_10 = null;
		Static450.aClass84Array13 = null;
		Static12.aClass80_1 = null;
		Static139.aClass84Array4 = null;
		Static24.aClass84Array2 = null;
		Static320.aClass84_17 = null;
		Static253.aClass84Array8 = null;
		Static56.aClass80_2 = null;
		Static222.aClass84Array5 = null;
		Static243.aClass84Array7 = null;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(III)I")
	public static int method3622(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 >>> 31;
		return (local12 + arg0) / arg1 - local12;
	}
}
