import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static427 {

	@OriginalMember(owner = "client!vm", name = "C", descriptor = "[Lclient!pe;")
	public static Class16_Sub1[] aClass16_Sub1Array3;

	@OriginalMember(owner = "client!vm", name = "Q", descriptor = "Lclient!mg;")
	public static final Class149 aClass149_1 = new Class149();

	@OriginalMember(owner = "client!vm", name = "R", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_94 = new Class215(12, 4);

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(IIII)V")
	public static void method5456(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = Static323.aClass50_Sub1_1.anInt3439 * arg2 >> 8;
		if (arg0 == -1 && !Static436.aBoolean666) {
			Static106.method1986();
		} else if (arg0 != -1 && (arg0 != Static62.anInt1117 || !Static109.method5336()) && local6 != 0 && !Static436.aBoolean666) {
			Static417.method5355(local6, Static46.aClass76_54, arg1, arg0);
		}
		Static62.anInt1117 = arg0;
	}
}
