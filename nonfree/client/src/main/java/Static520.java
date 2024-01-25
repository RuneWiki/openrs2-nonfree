import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static520 {

	@OriginalMember(owner = "client!ru", name = "s", descriptor = "F")
	public static float aFloat162;

	@OriginalMember(owner = "client!ru", name = "x", descriptor = "I")
	public static int anInt8706;

	@OriginalMember(owner = "client!ru", name = "t", descriptor = "Z")
	public static final boolean aBoolean632 = false;

	@OriginalMember(owner = "client!ru", name = "u", descriptor = "I")
	public static int anInt8703 = 0;

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(BI)Z")
	public static boolean method7346(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			return false;
		} else {
			return local7 < 128 || local7 >= 160 || Static218.aCharArray3[local7 - 128] != '\u0000';
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lclient!d;ILclient!cb;)V")
	public static void method7347(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) Class50 arg1) {
		Static400.anInterface3_9 = arg0;
		Static373.aClass50_109 = arg1;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(II)Lclient!oha;")
	public static Class257 method7348(@OriginalArg(1) int arg0) {
		@Pc(10) Class257 local10 = (Class257) Static359.aClass265_30.method6577((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static49.aClass50_14.method916(arg0, 1);
		local10 = new Class257();
		local10.anInt7536 = arg0;
		if (local20 != null) {
			local10.method6429(new Class5_Sub15(local20));
		}
		local10.method6427();
		if (local10.anInt7538 == 2 && Static310.aClass335_24.method7766((long) arg0) == null) {
			Static310.aClass335_24.method7770((long) arg0, new Class5_Sub43(Static80.anInt1292));
			Static626.aClass257Array1[Static80.anInt1292++] = local10;
		}
		Static359.aClass265_30.method6566(local10, (long) arg0);
		return local10;
	}
}
