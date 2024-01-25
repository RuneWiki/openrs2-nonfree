import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!bj", name = "r", descriptor = "Lclient!dn;")
	public static Class56 aClass56_13;

	@OriginalMember(owner = "client!bj", name = "w", descriptor = "F")
	public static float aFloat12;

	@OriginalMember(owner = "client!bj", name = "x", descriptor = "I")
	public static int anInt838;

	@OriginalMember(owner = "client!bj", name = "s", descriptor = "I")
	public static int anInt834 = 0;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
	public static void method766() {
		if (!Static59.aBoolean111) {
			return;
		}
		@Pc(11) Class68 local11 = Static347.method4975(Static295.anInt5382, Static207.anInt4138);
		if (local11 != null && local11.anObjectArray24 != null) {
			@Pc(20) Class3_Sub20 local20 = new Class3_Sub20();
			local20.anObjectArray35 = local11.anObjectArray24;
			local20.aClass68_4 = local11;
			Static272.method4044(local20);
		}
		Static332.anInt6029 = -1;
		Static455.anInt5935 = -1;
		Static59.aBoolean111 = false;
		if (local11 != null) {
			Static442.method5899(local11);
		}
	}
}
