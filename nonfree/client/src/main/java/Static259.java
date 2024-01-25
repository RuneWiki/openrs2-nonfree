import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!kb", name = "r", descriptor = "Lclient!st;")
	public static Class297 aClass297_4;

	@OriginalMember(owner = "client!kb", name = "y", descriptor = "Lclient!pj;")
	public static Class248 aClass248_35;

	@OriginalMember(owner = "client!kb", name = "V", descriptor = "I")
	public static int anInt4703;

	@OriginalMember(owner = "client!kb", name = "db", descriptor = "F")
	public static float aFloat124;

	@OriginalMember(owner = "client!kb", name = "p", descriptor = "[F")
	public static final float[] aFloatArray41 = new float[4];

	@OriginalMember(owner = "client!kb", name = "t", descriptor = "Lclient!ws;")
	public static final Class284 aClass284_1 = Static423.method5981();

	@OriginalMember(owner = "client!kb", name = "ib", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_65 = new Class98(46, -2);

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(II)Lclient!rp;")
	public static Class282 method3985(@OriginalArg(1) int arg0) {
		@Pc(10) Class282 local10 = (Class282) Static3.aClass330_42.method7677((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static396.aClass248_69.method5797(1, arg0);
		local10 = new Class282();
		local10.anInt7987 = arg0;
		if (local20 != null) {
			local10.method6353(new Class6_Sub12(local20));
		}
		local10.method6351();
		if (local10.anInt7984 == 2 && Static557.aClass234_48.method5464((long) arg0) == null) {
			Static557.aClass234_48.method5466((long) arg0, new Class6_Sub14(Static63.anInt1088));
			Static158.aClass282Array1[Static63.anInt1088++] = local10;
		}
		Static3.aClass330_42.method7676(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BII)Z")
	public static boolean method3987(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static391.method5695(arg1, arg0) | (arg1 & 0x10000) != 0 || Static451.method6337(arg1, arg0)) {
			return true;
		} else {
			return (arg0 & 0x37) == 0 && Static369.method5433(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
	public static void method3990() {
		Static373.aClass6_Sub15_Sub3_2.method6656();
		Static131.anInt2504 = 1;
		Static226.aClass248_33 = null;
	}
}
