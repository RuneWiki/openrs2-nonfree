import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!ks", name = "Jc", descriptor = "I")
	public static int anInt5086;

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(JIIZI)Ljava/lang/String;")
	public static String method4372(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(5) char local5 = ',';
		@Pc(7) char local7 = '.';
		if (arg3 == 0) {
			local5 = '.';
			local7 = ',';
		}
		if (arg3 == 2) {
			local7 = ' ';
		}
		@Pc(20) boolean local20 = false;
		if (arg0 < 0L) {
			local20 = true;
			arg0 = -arg0;
		}
		@Pc(44) StringBuffer local44 = new StringBuffer(26);
		@Pc(51) int local51;
		@Pc(55) int local55;
		if (arg1 > 0) {
			for (local51 = 0; local51 < arg1; local51++) {
				local55 = (int) arg0;
				arg0 /= 10L;
				local44.append((char) (local55 + 48 - (int) arg0 * 10));
			}
			local44.append(local5);
		}
		local51 = 0;
		while (true) {
			local55 = (int) arg0;
			arg0 /= 10L;
			local44.append((char) (local55 + 48 - (int) arg0 * 10));
			if (arg0 == 0L) {
				if (local20) {
					local44.append('-');
				}
				return local44.reverse().toString();
			}
			if (arg2) {
				local51++;
				if (local51 % 3 == 0) {
					local44.append(local7);
				}
			}
		}
	}
}
