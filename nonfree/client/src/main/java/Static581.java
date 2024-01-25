import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static581 {

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "I")
	public static int anInt9417;

	@OriginalMember(owner = "client!wca", name = "h", descriptor = "I")
	public static int anInt9423 = 0;

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(IC)Z")
	public static boolean method7526(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method7527(@OriginalArg(2) String arg0) {
		Static316.method4596("", 4, arg0, "", "", 0);
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(BI)C")
	public static char method7528(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(43) char local43 = Static279.aCharArray4[local7 - 128];
			if (local43 == '\u0000') {
				local43 = '?';
			}
			local7 = local43;
		}
		return (char) local7;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(III)I")
	public static int method7530(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}
}
