import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static460 {

	@OriginalMember(owner = "client!ws", name = "p", descriptor = "I")
	public static int anInt7742;

	@OriginalMember(owner = "client!ws", name = "g", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_107 = new Class208(37, -1);

	@OriginalMember(owner = "client!ws", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString75 = null;

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(III)I")
	public static int method6244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(45) int local45 = Static125.method2634(arg0 + 45365, 4, arg1 + 91923) + (Static125.method2634(arg0 + 10294, 2, arg1 + 37821) - 128 >> 1) + (Static125.method2634(arg0, 1, arg1) - 128 >> 2) - 128;
		local45 = (int) ((double) local45 * 0.3D) + 35;
		if (local45 < 10) {
			local45 = 10;
		} else if (local45 > 60) {
			local45 = 60;
		}
		return local45;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(ILclient!gi;)V")
	public static void method6245(@OriginalArg(1) Class93 arg0) {
		@Pc(7) Class93 local7 = Static345.method4859(arg0);
		@Pc(12) int local12;
		@Pc(15) int local15;
		if (local7 == null) {
			local15 = Static344.anInt6105;
			local12 = Static49.anInt789;
		} else {
			local12 = local7.anInt2436;
			local15 = local7.anInt2495;
		}
		Static389.method5409(local12, local15, arg0, false);
		Static83.method1223(arg0, local15, local12);
	}
}
