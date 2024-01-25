import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static544 {

	@OriginalMember(owner = "client!ws", name = "L", descriptor = "F")
	public static float aFloat205;

	@OriginalMember(owner = "client!ws", name = "I", descriptor = "Lclient!mt;")
	public static final Class199 aClass199_15 = new Class199("LOCAL", 4);

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(II)V")
	public static void method7948(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub1_Sub13 local12 = Static476.method6225(10, arg0);
		local12.method4925();
	}

	@OriginalMember(owner = "client!ws", name = "e", descriptor = "(I)[Lclient!mt;")
	public static Class199[] method7949() {
		return new Class199[] { Static359.aClass199_13, Static348.aClass199_11, Static168.aClass199_6, Static295.aClass199_10, aClass199_15, Static353.aClass199_12 };
	}

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "(II)Lclient!gn;")
	public static Class107 method7950(@OriginalArg(0) int arg0) {
		@Pc(10) Class107 local10 = (Class107) Static11.aClass316_1.method7799((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static259.aClass160_58.method4198(arg0, 0);
		local10 = new Class107();
		if (local20 != null) {
			local10.method3256(new Class1_Sub13(local20));
		}
		local10.method3260();
		Static11.aClass316_1.method7792((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ws", name = "c", descriptor = "(III)Z")
	public static boolean method7953(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x84080) != 0;
	}
}
