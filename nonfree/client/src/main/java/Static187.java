import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "J")
	public static long aLong102;

	@OriginalMember(owner = "client!gw", name = "f", descriptor = "I")
	public static int anInt3554;

	@OriginalMember(owner = "client!gw", name = "n", descriptor = "[Lclient!fr;")
	public static Class103[] aClass103Array1;

	@OriginalMember(owner = "client!gw", name = "e", descriptor = "I")
	public static int anInt3553 = 0;

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(BII)Z")
	public static boolean method3171(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static302.method4446(arg0, arg1) & Static43.method703(arg1, arg0);
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(IIZI)Lclient!tf;")
	public static Class322 method3177(@OriginalArg(2) boolean arg0, @OriginalArg(3) int arg1) {
		@Pc(14) Class22 local14 = null;
		if (Static334.aClass226_3 != null) {
			local14 = new Class22(arg1, Static334.aClass226_3, Static386.aClass226Array1[arg1], 1000000);
		}
		Static184.aClass30_Sub1Array1[arg1] = Static370.aClass357_1.method7712(arg1, Static533.aClass22_4, local14);
		Static184.aClass30_Sub1Array1[arg1].method582();
		return new Class322(Static184.aClass30_Sub1Array1[arg1], arg0, 1);
	}
}
