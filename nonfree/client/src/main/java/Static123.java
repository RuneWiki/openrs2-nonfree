import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)Lclient!wga;")
	public static Class2_Sub5_Sub21 method2503(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub5_Sub21 local10 = (Class2_Sub5_Sub21) Static282.aClass117_4.method3041((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static224.aClass97_59.method2545(0, arg0);
		if (local20 == null || local20.length <= 1) {
			return null;
		}
		try {
			local10 = Static91.method1611(local20);
		} catch (@Pc(44) Exception local44) {
			throw new RuntimeException(local44.getMessage() + " S: " + arg0);
		}
		Static282.aClass117_4.method3042((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)I")
	public static int method2504() {
		return Static97.anInt1908;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!gs;ZZ)V")
	public static void method2505(@OriginalArg(0) Class11_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		arg0.aBoolean731 = arg1;
		if (Static501.aBoolean631) {
			Static328.aClass103Array1[Static328.aClass103Array1.length - 1].method2675(arg0);
		} else {
			Static460.method6690(arg0, Static412.aClass2_Sub4Array6);
		}
	}
}
