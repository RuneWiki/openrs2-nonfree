import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!kv", name = "Pb", descriptor = "Lclient!sba;")
	public static Class288 aClass288_1;

	@OriginalMember(owner = "client!kv", name = "Qb", descriptor = "[I")
	public static int[] anIntArray446;

	@OriginalMember(owner = "client!kv", name = "xb", descriptor = "Lclient!ej;")
	public static final Class84 aClass84_9 = new Class84("", 16);

	@OriginalMember(owner = "client!kv", name = "Ub", descriptor = "[I")
	public static final int[] anIntArray447 = new int[64];

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method3935(@OriginalArg(0) String arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(17) int local17 = arg0.length();
		for (@Pc(19) int local19 = 0; local19 < local17; local19++) {
			@Pc(25) char local25 = arg0.charAt(local19);
			if (local25 == '%' && local19 + 2 < local17) {
				local25 = arg0.charAt(local19 + 1);
				@Pc(72) int local72;
				if (local25 >= '0' && local25 <= '9') {
					local72 = local25 - 48;
				} else if (local25 >= 'a' && local25 <= 'f') {
					local72 = local25 - 87;
				} else {
					if (local25 < 'A' || local25 > 'F') {
						local9.append('%');
						continue;
					}
					local72 = local25 - 55;
				}
				local25 = arg0.charAt(local19 + 2);
				local72 *= 16;
				if (local25 >= '0' && local25 <= '9') {
					local72 += local25 - 48;
				} else if (local25 >= 'a' && local25 <= 'f') {
					local72 += local25 + '\n' - 97;
				} else {
					if (local25 < 'A' || local25 > 'F') {
						local9.append('%');
						continue;
					}
					local72 += local25 - 55;
				}
				if (local72 != 0 && Static557.method7621((byte) local72)) {
					local9.append(Static276.method3963((byte) local72));
				}
				local19 += 2;
			} else if (local25 == '+') {
				local9.append(' ');
			} else {
				local9.append(local25);
			}
		}
		return local9.toString();
	}
}
