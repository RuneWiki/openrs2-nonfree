import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
	public static int anInt5140;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)Lclient!vl;")
	public static Class1_Sub2_Sub20 method4026(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub2_Sub20 local10 = (Class1_Sub2_Sub20) Static187.aClass49_8.method1381((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static170.aClass91_138.method2495(26, arg0);
		local10 = new Class1_Sub2_Sub20();
		if (local20 != null) {
			local10.method4270(new Class1_Sub11(local20));
		}
		Static187.aClass49_8.method1385(local10, (long) arg0);
		return local10;
	}
}
