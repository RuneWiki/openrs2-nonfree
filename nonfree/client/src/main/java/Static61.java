import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!cf", name = "k", descriptor = "F")
	public static float aFloat40;

	@OriginalMember(owner = "client!cf", name = "n", descriptor = "F")
	public static float aFloat41;

	@OriginalMember(owner = "client!cf", name = "u", descriptor = "I")
	public static int anInt1223;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(FB)F")
	public static float method1168(@OriginalArg(0) float arg0) {
		return ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F) * arg0 * arg0 * arg0;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "([II)Ljava/lang/String;")
	public static String method1174(@OriginalArg(0) int[] arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(11) int local11 = Static435.anInt7669;
		for (@Pc(20) int local20 = 0; local20 < arg0.length; local20++) {
			@Pc(29) Class182 local29 = Static530.aClass122_1.method3032(arg0[local20]);
			if (local29.anInt5368 != -1) {
				@Pc(41) Class25 local41 = (Class25) Static313.aClass288_42.method6745((long) local29.anInt5368);
				if (local41 == null) {
					@Pc(49) Class96 local49 = Static551.method2427(Static533.aClass117_228, local29.anInt5368, 0);
					if (local49 != null) {
						local41 = Static110.aClass62_15.method6998(local49);
						Static313.aClass288_42.method6746(local41, (long) local29.anInt5368);
					}
				}
				if (local41 != null) {
					Static372.aClass25Array8[local11] = local41;
					local9.append(" <img=").append(local11).append(">");
					local11++;
				}
			}
		}
		return local9.toString();
	}
}
