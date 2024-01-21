import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!td", name = "d", descriptor = "B")
	public static byte aByte11;

	@OriginalMember(owner = "client!td", name = "l", descriptor = "Lclient!ab;")
	public static Class3 aClass3_35;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1809 = Static187.method3089("No response from server)3");

	@OriginalMember(owner = "client!td", name = "b", descriptor = "I")
	public static int anInt3805 = 0;

	@OriginalMember(owner = "client!td", name = "f", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1810 = Static187.method3089("Verbinde mit Server)3)3)3");

	@OriginalMember(owner = "client!td", name = "h", descriptor = "[Lclient!se;")
	public static final Class8_Sub3_Sub2[] aClass8_Sub3_Sub2Array1 = new Class8_Sub3_Sub2[32768];

	@OriginalMember(owner = "client!td", name = "m", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1811 = Static187.method3089("Die Adresse dieses Computers wurde gesperrt)1");

	@OriginalMember(owner = "client!td", name = "o", descriptor = "I")
	public static int anInt3812 = 0;

	@OriginalMember(owner = "client!td", name = "p", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1812 = aClass92_1809;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ZI)V")
	public static void method2882(@OriginalArg(1) int arg0) {
		@Pc(1) Class9 local1 = Static156.aClass9_1;
		synchronized (Static156.aClass9_1) {
			Static165.anInt3435 = arg0;
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(ZI)Lclient!hf;")
	public static Class1_Sub3_Sub8 method2884(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub3_Sub8 local10 = (Class1_Sub3_Sub8) Static208.aClass47_8.method1281((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static71.aClass3_11.method3265(1, arg0);
		local10 = new Class1_Sub3_Sub8();
		if (local20 != null) {
			local10.method1139(new Class1_Sub14(local20), arg0);
		}
		Static208.aClass47_8.method1273((long) arg0, local10);
		return local10;
	}
}
