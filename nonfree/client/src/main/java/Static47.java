import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!br", name = "H", descriptor = "Lclient!bu;")
	public static Class41 aClass41_1;

	@OriginalMember(owner = "client!br", name = "L", descriptor = "I")
	public static int anInt889 = 0;

	@OriginalMember(owner = "client!br", name = "M", descriptor = "I")
	public static int anInt890 = 0;

	@OriginalMember(owner = "client!br", name = "O", descriptor = "[I")
	public static final int[] anIntArray123 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method886(@OriginalArg(0) String arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(12) int local12 = arg0.length();
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			@Pc(20) char local20 = arg0.charAt(local14);
			if (local20 == '%' && local14 + 2 < local12) {
				local20 = arg0.charAt(local14 + 1);
				@Pc(87) int local87;
				if (local20 >= '0' && local20 <= '9') {
					local87 = local20 - 48;
				} else if (local20 >= 'a' && local20 <= 'f') {
					local87 = local20 + '\n' - 97;
				} else {
					if (local20 < 'A' || local20 > 'F') {
						local9.append('%');
						continue;
					}
					local87 = local20 - 55;
				}
				local20 = arg0.charAt(local14 + 2);
				local87 *= 16;
				if (local20 >= '0' && local20 <= '9') {
					local87 += local20 - 48;
				} else if (local20 >= 'a' && local20 <= 'f') {
					local87 += local20 + '\n' - 97;
				} else {
					if (local20 < 'A' || local20 > 'F') {
						local9.append('%');
						continue;
					}
					local87 += local20 + 10 - 65;
				}
				if (local87 != 0 && Static136.method2791((byte) local87)) {
					local9.append(Static485.method7249((byte) local87));
				}
				local14 += 2;
			} else if (local20 == '+') {
				local9.append(' ');
			} else {
				local9.append(local20);
			}
		}
		return local9.toString();
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(BI)V")
	public static void method888(@OriginalArg(1) int arg0) {
		Static242.aLong131 = 1000000000L / (long) arg0;
	}
}
