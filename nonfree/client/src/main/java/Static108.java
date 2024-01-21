import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1077 = Static51.method932("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1078 = Static51.method932(" has logged in)3");

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1079 = aClass10_1078;

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1080 = Static51.method932("mn");

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!kh;III)[Lclient!ea;")
	public static Class2_Sub1_Sub4_Sub2[] method1730(@OriginalArg(0) Class29 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return Static111.method1762(arg1, arg2, arg0) ? Static137.method2177() : null;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
	public static void method1731() {
		aClass10_1078 = null;
		aClass10_1079 = null;
		aClass10_1077 = null;
		aClass10_1080 = null;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIB)I")
	public static int method1732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local12 *= arg1;
			}
			arg0 >>= 0x1;
			arg1 *= arg1;
		}
		if (arg0 == 1) {
			return local12 * arg1;
		} else {
			return local12;
		}
	}
}
