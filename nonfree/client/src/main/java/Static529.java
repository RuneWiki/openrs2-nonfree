import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static529 {

	@OriginalMember(owner = "client!uh", name = "J", descriptor = "I")
	public static int anInt8893;

	@OriginalMember(owner = "client!uh", name = "E", descriptor = "Lclient!tf;")
	public static final Class316 aClass316_15 = new Class316(5, 6);

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(JZIII)Ljava/lang/String;")
	public static String method7270(@OriginalArg(0) long arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) char local7 = ',';
		@Pc(14) char local14 = '.';
		if (arg2 == 0) {
			local14 = ',';
			local7 = '.';
		}
		if (arg2 == 2) {
			local14 = ' ';
		}
		@Pc(30) boolean local30 = false;
		if (arg0 < 0L) {
			local30 = true;
			arg0 = -arg0;
		}
		@Pc(44) StringBuffer local44 = new StringBuffer(26);
		@Pc(51) int local51;
		@Pc(56) int local56;
		if (arg3 > 0) {
			for (local51 = 0; local51 < arg3; local51++) {
				local56 = (int) arg0;
				arg0 /= 10L;
				local44.append((char) (local56 + 48 - (int) arg0 * 10));
			}
			local44.append(local7);
		}
		local51 = 0;
		while (true) {
			local56 = (int) arg0;
			arg0 /= 10L;
			local44.append((char) (local56 + 48 - (int) arg0 * 10));
			if (arg0 == 0L) {
				if (local30) {
					local44.append('-');
				}
				return local44.reverse().toString();
			}
			if (arg1) {
				local51++;
				if (local51 % 3 == 0) {
					local44.append(local14);
				}
			}
		}
	}
}
