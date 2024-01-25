import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "Lclient!pfa;")
	public static Class251 aClass251_18;

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(BIJZI)Ljava/lang/String;")
	public static String method1226(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg3 == 0) {
			local9 = ',';
			local7 = '.';
		}
		if (arg3 == 2) {
			local9 = ' ';
		}
		@Pc(27) boolean local27 = false;
		if (arg1 < 0L) {
			arg1 = -arg1;
			local27 = true;
		}
		@Pc(41) StringBuffer local41 = new StringBuffer(26);
		@Pc(48) int local48;
		@Pc(53) int local53;
		if (arg0 > 0) {
			for (local48 = 0; local48 < arg0; local48++) {
				local53 = (int) arg1;
				arg1 /= 10L;
				local41.append((char) (local53 + 48 - (int) arg1 * 10));
			}
			local41.append(local7);
		}
		local48 = 0;
		while (true) {
			local53 = (int) arg1;
			arg1 /= 10L;
			local41.append((char) (local53 + 48 - (int) arg1 * 10));
			if (arg1 == 0L) {
				if (local27) {
					local41.append('-');
				}
				return local41.reverse().toString();
			}
			if (arg2) {
				local48++;
				if (local48 % 3 == 0) {
					local41.append(local9);
				}
			}
		}
	}
}
