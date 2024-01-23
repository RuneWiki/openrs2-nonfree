import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!mh", name = "p", descriptor = "Lclient!uj;")
	public static Class1_Sub5_Sub9 aClass1_Sub5_Sub9_4;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(JIZII)Ljava/lang/String;")
	public static String method2949(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) boolean local9 = false;
		@Pc(21) char local21 = '.';
		@Pc(26) StringBuffer local26 = new StringBuffer(26);
		if (arg0 < 0L) {
			local9 = true;
			arg0 = -arg0;
		}
		if (arg3 == 0) {
			local21 = ',';
			local7 = '.';
		}
		@Pc(52) int local52;
		@Pc(58) int local58;
		if (arg1 > 0) {
			for (local52 = 0; local52 < arg1; local52++) {
				local58 = (int) arg0;
				arg0 /= 10L;
				local26.append((char) (local58 + 48 - (int) arg0 * 10));
			}
			local26.append(local7);
		}
		if (arg3 == 2) {
			local21 = ' ';
		}
		local52 = 0;
		while (true) {
			local58 = (int) arg0;
			arg0 /= 10L;
			local26.append((char) (local58 + 48 - (int) arg0 * 10));
			if (arg0 == 0L) {
				if (local9) {
					local26.append('-');
				}
				return local26.reverse().toString();
			}
			if (arg2) {
				local52++;
				if (local52 % 3 == 0) {
					local26.append(local21);
				}
			}
		}
	}
}
