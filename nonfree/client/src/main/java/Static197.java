import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static197 {

	@OriginalMember(owner = "client!ud", name = "n", descriptor = "I")
	public static int anInt4442;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "S")
	public static short aShort58 = 32767;

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "Lclient!i;")
	public static Class41 aClass41_1170 = null;

	@OriginalMember(owner = "client!ud", name = "j", descriptor = "Lclient!i;")
	public static Class41 aClass41_1171 = Static184.method2923("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!ud", name = "l", descriptor = "Lclient!i;")
	public static Class41 aClass41_1172 = Static184.method2923("<br>(X100(U(Y");

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!q;BI)Lclient!i;")
	public static Class41 method3070(@OriginalArg(0) Class80 arg0, @OriginalArg(2) int arg1) {
		if (!Static92.method1620(arg1, Static70.method1287(arg0)) && arg0.anObjectArray7 == null) {
			return null;
		} else if (arg0.aClass41Array55 == null || arg1 >= arg0.aClass41Array55.length || arg0.aClass41Array55[arg1] == null || arg0.aClass41Array55[arg1].method1391().method1393() == 0) {
			return Static102.aBoolean133 ? Static149.method2324(new Class41[] { Static86.aClass41_641, Static152.method2471(arg1) }) : null;
		} else {
			return arg0.aClass41Array55[arg1];
		}
	}
}
