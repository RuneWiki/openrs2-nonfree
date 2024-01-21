import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!ha", name = "nc", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!ha", name = "sc", descriptor = "Lclient!rf;")
	private static Class70 aClass70_635 = Static49.method1293(" is already on your friend list)3");

	@OriginalMember(owner = "client!ha", name = "mc", descriptor = "Lclient!rf;")
	public static Class70 aClass70_633 = aClass70_635;

	@OriginalMember(owner = "client!ha", name = "rc", descriptor = "Lclient!rf;")
	public static Class70 aClass70_634 = Static49.method1293("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIBI)I")
	public static int method1521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(21) int local21 = 65536 - Class1_Sub1_Sub1_Sub1.anIntArray8[arg0 * 1024 / arg3] >> 1;
		return (arg1 * local21 >> 16) + ((65536 - local21) * arg2 >> 16);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(BJ)V")
	public static void method1522(@OriginalArg(1) long arg0) {
		if (arg0 != 0L) {
			Static131.aClass1_Sub9_Sub1_3.method1283(211);
			Static131.aClass1_Sub9_Sub1_3.method1263(arg0);
		}
	}

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "(I)V")
	public static void method1524() {
		aByteArrayArrayArray5 = null;
		aClass70_634 = null;
		aClass70_635 = null;
		aClass70_633 = null;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZI)Lclient!qf;")
	public static Class1_Sub1_Sub16 method1525(@OriginalArg(1) int arg0) {
		@Pc(6) Class1_Sub1_Sub16 local6 = (Class1_Sub1_Sub16) Static67.aClass25_11.method1302((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static158.aClass76_123.method3316(arg0, 3);
		local6 = new Class1_Sub1_Sub16();
		if (local20 != null) {
			local6.method2796(new Class1_Sub9(local20));
		}
		Static67.aClass25_11.method1299(local6, (long) arg0);
		return local6;
	}
}
