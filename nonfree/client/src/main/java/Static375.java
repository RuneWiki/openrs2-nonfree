import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static375 {

	@OriginalMember(owner = "client!op", name = "z", descriptor = "[B")
	public static final byte[] aByteArray80 = new byte[2048];

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method5954(@OriginalArg(0) String arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(12) int local12 = arg0.length();
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			@Pc(23) char local23 = arg0.charAt(local14);
			if (local23 == '%' && local12 > local14 + 2) {
				local23 = arg0.charAt(local14 + 1);
				@Pc(55) int local55;
				if (local23 >= '0' && local23 <= '9') {
					local55 = local23 - 48;
				} else if (local23 >= 'a' && local23 <= 'f') {
					local55 = local23 + 10 - 97;
				} else {
					if (local23 < 'A' || local23 > 'F') {
						local9.append('%');
						continue;
					}
					local55 = local23 + '\n' - 65;
				}
				local55 *= 16;
				local23 = arg0.charAt(local14 + 2);
				if (local23 >= '0' && local23 <= '9') {
					local55 += local23 - 48;
				} else if (local23 >= 'a' && local23 <= 'f') {
					local55 += local23 + 10 - 97;
				} else {
					if (local23 < 'A' || local23 > 'F') {
						local9.append('%');
						continue;
					}
					local55 += local23 - 55;
				}
				if (local55 != 0 && Static226.method4055((byte) local55)) {
					local9.append(Static60.method1329((byte) local55));
				}
				local14 += 2;
			} else if (local23 == '+') {
				local9.append(' ');
			} else {
				local9.append(local23);
			}
		}
		return local9.toString();
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(BLclient!jo;I)Lclient!u;")
	public static Class6_Sub46 method5955(@OriginalArg(1) Class168 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) byte[] local15 = arg0.method4438(arg1);
		return local15 == null ? null : new Class6_Sub46(local15);
	}
}
