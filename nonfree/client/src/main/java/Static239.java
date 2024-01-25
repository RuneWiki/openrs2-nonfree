import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
	public static int anInt4818;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!co;Z)Lclient!le;")
	public static Class52_Sub2 method4075(@OriginalArg(0) Class5_Sub3 arg0) {
		return new Class52_Sub2(arg0.method4212(), arg0.method4212(), arg0.method4212(), arg0.method4212(), arg0.method4182(), arg0.method4220());
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IB)V")
	public static void method4077(@OriginalArg(0) int arg0) {
		@Pc(12) Class5_Sub2_Sub7 local12 = Static144.method2728(arg0, 2);
		local12.method1324();
	}
}
