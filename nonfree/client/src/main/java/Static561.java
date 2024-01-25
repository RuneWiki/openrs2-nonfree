import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static561 {

	@OriginalMember(owner = "client!vj", name = "jb", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_115 = new Class61(12, 12);

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIJIZ)Ljava/lang/String;")
	public static String method7023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(4) boolean arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg1 == 0) {
			local9 = ',';
			local7 = '.';
		}
		if (arg1 == 2) {
			local9 = ' ';
		}
		@Pc(25) boolean local25 = false;
		if (arg2 < 0L) {
			arg2 = -arg2;
			local25 = true;
		}
		@Pc(39) StringBuffer local39 = new StringBuffer(26);
		@Pc(43) int local43;
		@Pc(48) int local48;
		if (arg0 > 0) {
			for (local43 = 0; local43 < arg0; local43++) {
				local48 = (int) arg2;
				arg2 /= 10L;
				local39.append((char) (local48 + 48 - (int) arg2 * 10));
			}
			local39.append(local7);
		}
		local43 = 0;
		while (true) {
			local48 = (int) arg2;
			arg2 /= 10L;
			local39.append((char) (local48 + 48 - (int) arg2 * 10));
			if (arg2 == 0L) {
				if (local25) {
					local39.append('-');
				}
				return local39.reverse().toString();
			}
			if (arg3) {
				local43++;
				if (local43 % 3 == 0) {
					local39.append(local9);
				}
			}
		}
	}
}
