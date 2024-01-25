import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static438 {

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!vg;III)V")
	public static void method5502(@OriginalArg(0) Class250 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static68.aClass250_2 != null || Static263.aBoolean329 || (arg0 == null || Static364.method4730(arg0) == null)) {
			return;
		}
		Static68.aClass250_2 = arg0;
		Static6.aClass250_1 = Static364.method4730(arg0);
		Static221.anInt3584 = 0;
		Static16.anInt3240 = arg1;
		Static380.anInt6320 = arg2;
		Static359.aBoolean496 = false;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method5505(@OriginalArg(0) String arg0) {
		@Pc(9) String local9 = Static201.method2761(Static86.method1266(arg0));
		if (local9 == null) {
			local9 = "";
		}
		return local9;
	}
}
