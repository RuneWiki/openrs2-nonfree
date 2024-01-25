import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static538 {

	@OriginalMember(owner = "client!td", name = "g", descriptor = "I")
	public static int anInt9064;

	@OriginalMember(owner = "client!td", name = "b", descriptor = "Lclient!st;")
	public static final Class314 aClass314_134 = new Class314(47, 3);

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!dc;Z)Lclient!ria;")
	public static Class35_Sub1 method7782(@OriginalArg(0) Class3_Sub9 arg0) {
		@Pc(7) Class35 local7 = Static232.method3992(arg0);
		@Pc(11) int local11 = arg0.method5610();
		@Pc(15) int local15 = arg0.method5610();
		@Pc(19) int local19 = arg0.method5610();
		@Pc(28) int local28 = arg0.method5610();
		@Pc(32) int local32 = arg0.method5610();
		@Pc(36) int local36 = arg0.method5610();
		return new Class35_Sub1(local7.aClass293_11, local7.aClass15_12, local7.anInt9052, local7.anInt9054, local7.anInt9053, local7.anInt9046, local7.anInt9050, local7.anInt9045, local7.anInt9055, local11, local15, local19, local28, local32, local36);
	}
}
