import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_69 = new Class131(12, 8);

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(BI)Lclient!sb;")
	public static Class210 method1876(@OriginalArg(1) int arg0) {
		@Pc(10) Class210 local10 = (Class210) Static381.aClass83_41.method1658((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static75.aClass250_16.method5667(arg0, 0);
		local10 = new Class210();
		if (local25 != null) {
			local10.method4941(new Class1_Sub1(local25), arg0);
		}
		Static381.aClass83_41.method1675((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(B)V")
	public static void method1878() {
		for (@Pc(12) int local12 = 0; local12 < Static288.anInt5039; local12++) {
			@Pc(18) int local18 = Static212.anIntArray28[local12];
			@Pc(22) Class26_Sub2_Sub2_Sub2 local22 = Static410.aClass26_Sub2_Sub2_Sub2Array1[local18];
			if (local22 != null) {
				Static30.method496(local22, local22.aClass66_1.anInt1717);
			}
		}
	}
}
