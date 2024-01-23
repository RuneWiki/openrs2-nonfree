import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!la", name = "b", descriptor = "[S")
	public static short[] aShortArray56;

	@OriginalMember(owner = "client!la", name = "d", descriptor = "I")
	public static int anInt3066 = -1;

	@OriginalMember(owner = "client!la", name = "e", descriptor = "[I")
	public static int[] anIntArray261 = new int[4096];

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!si;I)V")
	public static void method2627(@OriginalArg(0) Class157 arg0) {
		@Pc(7) Class157 local7 = Static145.method2516(arg0);
		@Pc(21) int local21;
		@Pc(18) int local18;
		if (local7 == null) {
			local18 = Static288.anInt5232;
			local21 = Static194.anInt3876;
		} else {
			local18 = local7.anInt4689;
			local21 = local7.anInt4680;
		}
		Static62.method1107(arg0, local21, local18, false);
		Static148.method2592(local21, arg0, local18);
	}
}
