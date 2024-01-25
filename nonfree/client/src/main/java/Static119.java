import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(BI)Lclient!fs;")
	public static Class107 method2026(@OriginalArg(1) int arg0) {
		@Pc(10) Class107 local10 = (Class107) Static592.aClass326_59.method7238((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static401.aClass111_96.method2441(arg0, 0);
		local10 = new Class107();
		if (local20 != null) {
			local10.method2407(arg0, new Class1_Sub20(local20));
		}
		Static592.aClass326_59.method7236(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ega", name = "b", descriptor = "(BI)V")
	public static void method2028(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub3_Sub1 local8 = Static374.method5445(8, arg0);
		local8.method488();
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(II)Z")
	public static boolean method2029(@OriginalArg(0) int arg0) {
		return (-arg0 & arg0) == arg0;
	}
}
