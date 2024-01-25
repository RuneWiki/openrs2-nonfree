import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static580 {

	@OriginalMember(owner = "client!wfa", name = "s", descriptor = "[Lclient!f;")
	public static Class14[] aClass14Array16;

	@OriginalMember(owner = "client!wfa", name = "l", descriptor = "Lclient!hi;")
	public static final Class131 aClass131_1 = new Class131();

	@OriginalMember(owner = "client!wfa", name = "p", descriptor = "Lclient!wo;")
	public static final Class276 aClass276_1 = Static500.method6738();

	@OriginalMember(owner = "client!wfa", name = "q", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_103 = new Class303(59, 2);

	@OriginalMember(owner = "client!wfa", name = "r", descriptor = "J")
	public static long aLong272 = -1L;

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(I)Z")
	public static boolean method7784() {
		return Static565.anInt9228 == 0 ? Static323.aClass3_Sub4_Sub3_2.method6353() : true;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(II)V")
	public static void method7785(@OriginalArg(1) int arg0) {
		@Pc(1) Class3_Sub7_Sub13 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class34 local8 = Static108.aClass34Array6[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static39.anInt747; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static155.anInt3254; local15++) {
						local1 = local8.v(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static315.anInt5369;
							@Pc(32) int local32 = local12 << Static315.anInt5369;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class34 local41 = Static108.aClass34Array6[local36];
								if (local41 != null) {
									@Pc(55) int local55 = local8.method6525(local12, local15) - local41.method6525(local12, local15);
									@Pc(71) int local71 = local8.method6525(local12, local15 + 1) - local41.method6525(local12, local15 + 1);
									@Pc(91) int local91 = local8.method6525(local12 + 1, local15 + 1) - local41.method6525(local12 + 1, local15 + 1);
									@Pc(107) int local107 = local8.method6525(local12 + 1, local15) - local41.method6525(local12 + 1, local15);
									local41.E(local1, local28, (local55 + local71 + local91 + local107) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(Lclient!gda;I)Z")
	public static boolean method7786(@OriginalArg(0) Interface4 arg0) {
		@Pc(10) Class280 local10 = Static478.aClass212_3.method4793(arg0.method7561());
		if (local10.anInt7383 == -1) {
			return true;
		} else {
			@Pc(29) Class120 local29 = Static350.aClass87_3.method2536(local10.anInt7383);
			return local29.anInt3558 == -1 ? true : local29.method3176();
		}
	}
}
