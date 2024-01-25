import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "Lclient!st;")
	public static Class297 aClass297_2;

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_26 = new Class98(61, 6);

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_27 = new Class98(0, 8);

	@OriginalMember(owner = "client!dn", name = "g", descriptor = "I")
	public static int anInt1767 = 0;

	@OriginalMember(owner = "client!dn", name = "h", descriptor = "[B")
	public static final byte[] aByteArray15 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIB)I")
	public static int method1622(@OriginalArg(1) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(38) int local38 = (arg0 & 0x7F) * 96 >> 7;
			if (local38 < 2) {
				local38 = 2;
			} else if (local38 > 126) {
				local38 = 126;
			}
			return local38 + (arg0 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(BLjava/lang/String;I)I")
	public static int method1623(@OriginalArg(1) String arg0) {
		return Static238.method3728(arg0, 16);
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)V")
	public static void method1624() {
		Static184.aClass262_1.method6384();
		Static9.aClass29_1.method2949();
		Static536.aClient1.method1019();
		Static77.aCanvas1.setBackground(Color.black);
		Static500.anInt8696 = -1;
		Static184.aClass262_1 = Static460.method6445(Static77.aCanvas1);
		Static9.aClass29_1 = Static213.method3452(Static77.aCanvas1);
	}
}
