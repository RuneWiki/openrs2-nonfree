import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "([II)Ljava/lang/String;")
	public static String method549(@OriginalArg(0) int[] arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(11) int local11 = Static130.anInt2269;
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			@Pc(22) Class102 local22 = Static105.aClass251_1.method5677(arg0[local13]);
			if (local22.anInt2417 != -1) {
				@Pc(34) Class80 local34 = (Class80) Static97.aClass83_15.method1658((long) local22.anInt2417);
				if (local34 == null) {
					@Pc(42) Class159 local42 = Static459.method3755(Static384.aClass250_76, local22.anInt2417, 0);
					if (local42 != null) {
						local34 = Static276.aClass109_10.method4684(local42);
						Static97.aClass83_15.method1675((long) local22.anInt2417, local34);
					}
				}
				if (local34 != null) {
					Static364.aClass80Array17[local11] = local34;
					local9.append(" <img=").append(local11).append(">");
					local11++;
				}
			}
		}
		return local9.toString();
	}
}
