import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!faa", name = "h", descriptor = "Lclient!ln;")
	public static final Class203 aClass203_1 = new Class203();

	@OriginalMember(owner = "client!faa", name = "k", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_35 = new Class218(16, 3);

	@OriginalMember(owner = "client!faa", name = "p", descriptor = "Lclient!ib;")
	public static final Class147 aClass147_3 = new Class147("WTWIP", "office", "_wip", 3);

	@OriginalMember(owner = "client!faa", name = "q", descriptor = "I")
	public static int anInt3031 = 0;

	@OriginalMember(owner = "client!faa", name = "s", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_65 = new Class180(65, 9);

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method2799(@OriginalArg(0) String arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(12) int local12 = arg0.length();
		for (@Pc(19) int local19 = 0; local19 < local12; local19++) {
			@Pc(25) char local25 = arg0.charAt(local19);
			if (local25 == '%' && local19 + 2 < local12) {
				local25 = arg0.charAt(local19 + 1);
				@Pc(96) int local96;
				if (local25 >= '0' && local25 <= '9') {
					local96 = local25 - 48;
				} else if (local25 >= 'a' && local25 <= 'f') {
					local96 = local25 + '\n' - 97;
				} else {
					if (local25 < 'A' || local25 > 'F') {
						local9.append('%');
						continue;
					}
					local96 = local25 + 10 - 65;
				}
				local25 = arg0.charAt(local19 + 2);
				local96 *= 16;
				if (local25 >= '0' && local25 <= '9') {
					local96 += local25 - '0';
				} else if (local25 >= 'a' && local25 <= 'f') {
					local96 += local25 - 87;
				} else {
					if (local25 < 'A' || local25 > 'F') {
						local9.append('%');
						continue;
					}
					local96 += local25 + 10 - 65;
				}
				if (local96 != 0 && Static483.method7016((byte) local96)) {
					local9.append(Static375.method5437((byte) local96));
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
