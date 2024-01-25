import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!pl", name = "h", descriptor = "F")
	public static float aFloat174;

	@OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
	public static int anInt7513 = 0;

	@OriginalMember(owner = "client!pl", name = "k", descriptor = "[S")
	public static short[] aShortArray94 = new short[256];

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)V")
	public static void method6265() {
		@Pc(5) int local5 = 0;
		if (Static104.aClass6_Sub6_Sub1_4.method1064(Static5.anInt145)) {
			local5 = 55;
		}
		if (!Static104.aClass6_Sub6_Sub1_4.aBoolean135) {
			local5 |= 0x40;
		}
		Static310.method5016(local5);
		Static480.aClass57_11.method1467(local5);
		Static98.aClass203_1.method4900(local5);
		Static504.aClass343_2.method7995(local5);
		Static355.aClass278_2.method6830(local5);
		Static414.method6473(local5);
		Static82.method1824(local5);
		Static504.method7510(local5);
		Static140.method2628(local5);
		Static190.method3621();
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)V")
	public static void method6267() {
		@Pc(6) Class245 local6 = Static551.aClass245_66;
		synchronized (Static551.aClass245_66) {
			Static551.aClass245_66.method6079();
		}
	}
}
