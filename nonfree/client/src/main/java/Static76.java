import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static76 {

	@OriginalMember(owner = "client!cda", name = "D", descriptor = "I")
	public static int anInt1342;

	@OriginalMember(owner = "client!cda", name = "E", descriptor = "Lclient!fh;")
	public static final Class118 aClass118_3 = new Class118(33);

	@OriginalMember(owner = "client!cda", name = "f", descriptor = "(I)V")
	public static void method1179() {
		Static284.aClass85_32.method1748();
	}

	@OriginalMember(owner = "client!cda", name = "b", descriptor = "(III)I")
	public static int method1180(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}
}
