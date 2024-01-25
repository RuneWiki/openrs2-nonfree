import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static529 {

	@OriginalMember(owner = "client!rv", name = "j", descriptor = "I")
	public static int anInt8741;

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "Lclient!cq;")
	public static final Class65 aClass65_16 = new Class65();

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IJZII)Ljava/lang/String;")
	public static String method7390(@OriginalArg(1) long arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg3 == 0) {
			local7 = '.';
			local9 = ',';
		}
		if (arg3 == 2) {
			local9 = ' ';
		}
		@Pc(24) boolean local24 = false;
		if (arg0 < 0L) {
			local24 = true;
			arg0 = -arg0;
		}
		@Pc(43) StringBuffer local43 = new StringBuffer(26);
		@Pc(47) int local47;
		@Pc(52) int local52;
		if (arg2 > 0) {
			for (local47 = 0; local47 < arg2; local47++) {
				local52 = (int) arg0;
				arg0 /= 10L;
				local43.append((char) (local52 + 48 - (int) arg0 * 10));
			}
			local43.append(local7);
		}
		local47 = 0;
		while (true) {
			local52 = (int) arg0;
			arg0 /= 10L;
			local43.append((char) (local52 + 48 - (int) arg0 * 10));
			if (arg0 == 0L) {
				if (local24) {
					local43.append('-');
				}
				return local43.reverse().toString();
			}
			if (arg1) {
				local47++;
				if (local47 % 3 == 0) {
					local43.append(local9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Ljava/lang/String;ICLjava/lang/String;)Ljava/lang/String;")
	public static String method7391(@OriginalArg(0) String arg0, @OriginalArg(3) String arg1) {
		@Pc(8) int local8 = arg1.length();
		@Pc(11) int local11 = arg0.length();
		@Pc(13) int local13 = local8;
		@Pc(17) int local17 = local11 - 1;
		if (local17 != 0) {
			@Pc(24) int local24 = 0;
			while (true) {
				local24 = arg1.indexOf(13, local24);
				if (local24 < 0) {
					break;
				}
				local13 += local17;
				local24++;
			}
		}
		@Pc(46) StringBuffer local46 = new StringBuffer(local13);
		@Pc(53) int local53 = 0;
		while (true) {
			@Pc(58) int local58 = arg1.indexOf(13, local53);
			if (local58 < 0) {
				local46.append(arg1.substring(local53));
				return local46.toString();
			}
			local46.append(arg1.substring(local53, local58));
			local53 = local58 + 1;
			local46.append(arg0);
		}
	}
}
