import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static496 {

	@OriginalMember(owner = "client!rm", name = "p", descriptor = "I")
	public static int anInt8111 = -1;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!eo;)V")
	public static void method6875(@OriginalArg(0) Class94 arg0) {
		Static219.aClass94_4 = arg0;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(II)Lclient!sc;")
	public static Class312 method6878(@OriginalArg(1) int arg0) {
		@Pc(10) Class312 local10 = (Class312) Static90.aClass32_15.method630((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static6.aClass380_2.method8620(1, arg0);
		local10 = new Class312();
		local10.anInt8524 = arg0;
		if (local20 != null) {
			local10.method7173(new Class2_Sub22(local20));
		}
		local10.method7176();
		if (local10.anInt8526 == 2 && Static4.aClass118_3.method2595((long) arg0) == null) {
			Static4.aClass118_3.method2601(new Class2_Sub30(Static454.anInt7299), (long) arg0);
			Static539.aClass312Array1[Static454.anInt7299++] = local10;
		}
		Static90.aClass32_15.method629(local10, (long) arg0);
		return local10;
	}
}
