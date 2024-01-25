import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!ht", name = "w", descriptor = "I")
	public static int anInt3926;

	@OriginalMember(owner = "client!ht", name = "z", descriptor = "I")
	public static int anInt3929 = 0;

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method3393(@OriginalArg(0) String arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(12) int local12 = arg0.length();
		for (@Pc(22) int local22 = 0; local22 < local12; local22++) {
			@Pc(28) char local28 = arg0.charAt(local22);
			if (local28 == '%' && local12 > local22 + 2) {
				local28 = arg0.charAt(local22 + 1);
				@Pc(77) int local77;
				if (local28 >= '0' && local28 <= '9') {
					local77 = local28 - 48;
				} else if (local28 >= 'a' && local28 <= 'f') {
					local77 = local28 + 10 - 97;
				} else {
					if (local28 < 'A' || local28 > 'F') {
						local9.append('%');
						continue;
					}
					local77 = local28 + 10 - 65;
				}
				local28 = arg0.charAt(local22 + 2);
				local77 *= 16;
				if (local28 >= '0' && local28 <= '9') {
					local77 += local28 - 48;
				} else if (local28 >= 'a' && local28 <= 'f') {
					local77 += local28 + '\n' - 97;
				} else {
					if (local28 < 'A' || local28 > 'F') {
						local9.append('%');
						continue;
					}
					local77 += local28 + '\n' - 65;
				}
				local22 += 2;
				if (local77 != 0 && Static465.method6496((byte) local77)) {
					local9.append(Static58.method838((byte) local77));
				}
			} else if (local28 == '+') {
				local9.append(' ');
			} else {
				local9.append(local28);
			}
		}
		return local9.toString();
	}

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(B)Lclient!gh;")
	public static Class60_Sub3 method3394() {
		@Pc(8) Class60_Sub3 local8 = (Class60_Sub3) Static360.aClass349_13.method7892();
		if (local8 == null) {
			return new Class60_Sub3();
		} else {
			Static497.anInt8653--;
			return local8;
		}
	}
}
