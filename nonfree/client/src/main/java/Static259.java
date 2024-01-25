import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
	public static int anInt4836;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "Lclient!jv;")
	public static Class138 aClass138_8 = null;

	@OriginalMember(owner = "client!nh", name = "h", descriptor = "Lclient!kl;")
	public static final Class142 aClass142_83 = new Class142(11, 0, 1, 2);

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)I")
	public static int method3896(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(26) int local26 = arg0 * 6 - 61440;
		@Pc(34) int local34 = (arg0 * local26 >> 12) + 40960;
		return local13 * local34 >> 12;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)Lclient!em;")
	public static Class68 method3899(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class68 local7 = Static165.method2704(arg1);
		if (arg0 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass68Array1 == null || local7.aClass68Array1.length <= arg0) {
			return null;
		} else {
			return local7.aClass68Array1[arg0];
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method3902(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(14) int local14 = arg0.length();
		while (local11 < local14 && Static167.method2724(arg0.charAt(local11))) {
			local11++;
		}
		while (local14 > local11 && Static167.method2724(arg0.charAt(local14 - 1))) {
			local14--;
		}
		@Pc(49) int local49 = local14 - local11;
		if (local49 < 1 || local49 > 12) {
			return null;
		}
		@Pc(64) StringBuffer local64 = new StringBuffer(local49);
		for (@Pc(74) int local74 = local11; local74 < local14; local74++) {
			@Pc(80) char local80 = arg0.charAt(local74);
			if (Static12.method254(local80)) {
				@Pc(88) char local88 = Static136.method2315(local80);
				if (local88 != '\u0000') {
					local64.append(local88);
				}
			}
		}
		if (local64.length() == 0) {
			return null;
		} else {
			return local64.toString();
		}
	}
}
