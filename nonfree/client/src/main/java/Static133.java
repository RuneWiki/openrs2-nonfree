import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!ew", name = "k", descriptor = "Lclient!uba;")
	public static Class6_Sub47 aClass6_Sub47_2;

	@OriginalMember(owner = "client!ew", name = "j", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_61 = new Class254(28, 2);

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(II)V")
	public static void method2524(@OriginalArg(1) int arg0) {
		Static457.method7114();
		@Pc(11) int local11 = Static329.aClass294_1.method7334(arg0).anInt5846;
		if (local11 == 0) {
			return;
		}
		@Pc(23) int local23 = Static435.aClass234_1.anIntArray491[arg0];
		if (local11 == 6) {
			Static570.anInt9640 = local23;
		}
		if (local11 == 5) {
			Static37.anInt1211 = local23;
		}
	}

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "(II)V")
	public static void method2526(@OriginalArg(1) int arg0) {
		@Pc(16) Class6_Sub4_Sub6 local16 = Static68.method1408(3, arg0);
		local16.method3828();
	}
}
