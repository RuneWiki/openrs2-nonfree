import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "Lclient!fa;")
	public static Class1_Sub9 aClass1_Sub9_3;

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "Lclient!ge;")
	public static Class30 aClass30_15 = new Class30(32);

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "Lclient!fc;")
	public static Class25 aClass25_26 = new Class25(64);

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "Lclient!rf;")
	private static Class70 aClass70_1534 = Static49.method1293("Password: ");

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1535 = Static49.method1293("Willkommen auf RuneScape");

	@OriginalMember(owner = "client!vc", name = "h", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1536 = aClass70_1534;

	@OriginalMember(owner = "client!vc", name = "i", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1537 = Static49.method1293("::gc");

	@OriginalMember(owner = "client!vc", name = "j", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1538 = Static49.method1293("titlebutton");

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V")
	public static void method3413() {
		aClass70_1534 = null;
		aClass30_15 = null;
		aClass70_1535 = null;
		aClass25_26 = null;
		aClass1_Sub9_3 = null;
		aClass70_1538 = null;
		aClass70_1537 = null;
		aClass70_1536 = null;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!fa;I)V")
	public static void method3414(@OriginalArg(0) Class1_Sub9 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static25.aClass66_4 != null) {
			@Pc(20) int local20;
			try {
				Static25.aClass66_4.method2662(0L);
				Static25.aClass66_4.method2649(local8);
				for (local20 = 0; local20 < 24 && local8[local20] == 0; local20++) {
				}
				if (local20 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(42) Exception local42) {
				for (local20 = 0; local20 < 24; local20++) {
					local8[local20] = -1;
				}
			}
		}
		arg0.method1255(24, local8);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILclient!u;I)Lclient!rh;")
	public static Class1_Sub1_Sub1_Sub4 method3415(@OriginalArg(1) Class76 arg0, @OriginalArg(2) int arg1) {
		return Static75.method1680(arg1, arg0) ? Static68.method1566() : null;
	}
}
