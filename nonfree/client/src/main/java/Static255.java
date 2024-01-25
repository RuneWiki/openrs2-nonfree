import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "Lclient!wd;")
	public static Class212 aClass212_13;

	@OriginalMember(owner = "client!pr", name = "e", descriptor = "I")
	public static int anInt4875;

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lclient!mo;III)Lclient!o;")
	public static Class14_Sub2_Sub14 method4391(@OriginalArg(0) Class143 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class14_Sub4 local14 = new Class14_Sub4(arg0.method3745(arg2, arg1));
		@Pc(46) Class14_Sub2_Sub14 local46 = new Class14_Sub2_Sub14(arg1, local14.method2496(), local14.method2496(), local14.method2510(), local14.method2510(), local14.method2548() == 1, local14.method2548());
		@Pc(50) int local50 = local14.method2548();
		for (@Pc(52) int local52 = 0; local52 < local50; local52++) {
			local46.aClass18_21.method451(new Class14_Sub33(local14.method2548(), local14.method2498(), local14.method2498(), local14.method2498(), local14.method2498(), local14.method2498(), local14.method2498(), local14.method2498(), local14.method2498()));
		}
		local46.method3989();
		return local46;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Z)V")
	public static void method4392() {
		Static254.aClass2_18 = null;
		Static223.anInt5825 = -1;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lclient!mo;I)V")
	public static void method4394(@OriginalArg(0) Class143 arg0) {
		Static253.aClass143_27 = arg0;
	}
}
