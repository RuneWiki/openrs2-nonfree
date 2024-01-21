import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!ph", name = "bb", descriptor = "Lclient!je;")
	public static Class49 aClass49_1;

	@OriginalMember(owner = "client!ph", name = "db", descriptor = "Lclient!rc;")
	public static Class82 aClass82_4;

	@OriginalMember(owner = "client!ph", name = "gb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1487 = Static193.method3027("Bitte geben Sie Ihr Passwort ein)3");

	@OriginalMember(owner = "client!ph", name = "ob", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1490 = Static193.method3027("glow1:");

	@OriginalMember(owner = "client!ph", name = "ib", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1488 = aClass70_1490;

	@OriginalMember(owner = "client!ph", name = "nb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1489 = aClass70_1490;

	@OriginalMember(owner = "client!ph", name = "qb", descriptor = "[I")
	public static final int[] anIntArray227 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IILclient!eh;IIB)V")
	public static void method2242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub3_Sub9 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) Class3_Sub27 local7 = new Class3_Sub27();
		@Pc(10) int local10 = arg2.anInt1010;
		local7.anInt4162 = arg2.anInt1028;
		local7.anInt4164 = arg3 * 128;
		@Pc(22) int local22 = arg2.anInt1002;
		if (arg4 == 1 || arg4 == 3) {
			local10 = arg2.anInt1002;
			local22 = arg2.anInt1010;
		}
		local7.anInt4171 = arg2.anInt994 * 128;
		local7.anInt4160 = arg2.anInt1024;
		local7.anInt4158 = arg2.anInt1006;
		local7.anIntArray360 = arg2.anIntArray54;
		local7.anInt4170 = arg0 * 128;
		local7.anInt4168 = (local10 + arg0) * 128;
		local7.anInt4159 = arg1;
		local7.anInt4166 = (arg3 + local22) * 128;
		if (arg2.anIntArray52 != null) {
			local7.aClass3_Sub3_Sub9_1 = arg2;
			local7.method3234();
		}
		Static87.aClass10_125.method261(local7);
		if (local7.anIntArray360 != null) {
			local7.anInt4165 = local7.anInt4162 + (int) (Math.random() * (double) (local7.anInt4160 - local7.anInt4162));
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BLclient!oc;Lclient!oc;Lclient!oc;)V")
	public static void method2243(@OriginalArg(1) Class70 arg0, @OriginalArg(2) Class70 arg1, @OriginalArg(3) Class70 arg2) {
		Static198.aClass70_1987 = arg2;
		Static198.aClass70_1995 = arg0;
		Static198.aClass70_1991 = arg1;
	}
}
