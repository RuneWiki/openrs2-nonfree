import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!he", name = "I", descriptor = "J")
	public static long aLong94;

	@OriginalMember(owner = "client!he", name = "E", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_101 = new Class214(58, 0);

	@OriginalMember(owner = "client!he", name = "K", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_41 = new Class212(80, 6);

	@OriginalMember(owner = "client!he", name = "L", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_42 = new Class212(69, 18);

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ILclient!qa;)V")
	public static void method2644(@OriginalArg(1) Class30 arg0) {
		for (@Pc(11) Class71_Sub6 local11 = (Class71_Sub6) Static299.aClass273_2.method6246(); local11 != null; local11 = (Class71_Sub6) Static299.aClass273_2.method6249()) {
			local11.method5797(arg0);
		}
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(I)Z")
	public static boolean method2647() {
		@Pc(7) Class4 local7 = Static289.aClass91_31.aClass4_103.aClass4_270;
		if (local7 == null || Static289.aClass91_31.aClass4_103 == local7) {
			return false;
		}
		@Pc(18) Class4_Sub14 local18 = (Class4_Sub14) local7;
		if (local18.anInt2132 >= 2000) {
			local18.anInt2132 -= 2000;
		}
		return local18.anInt2132 == 1008;
	}
}
