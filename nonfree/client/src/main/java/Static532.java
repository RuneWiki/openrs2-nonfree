import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static532 {

	@OriginalMember(owner = "client!se", name = "d", descriptor = "Lclient!oja;")
	public static Class260 aClass260_1;

	@OriginalMember(owner = "client!se", name = "b", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_266 = new Class196(103, -1);

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIBII)V")
	public static void method7416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 != 8 && arg3 != 16) {
			@Pc(98) Class313 local98 = Static129.aClass313ArrayArrayArray7[arg0][arg2][arg1];
			if (local98 != null) {
				if (arg3 == 1) {
					local98.aShort99 = 0;
				} else if (arg3 == 2) {
					local98.aShort100 = 0;
				}
			}
			Static226.method3207();
			return;
		}
		for (@Pc(18) int local18 = 0; local18 < Static252.anInt4008; local18++) {
			@Pc(23) Class180 local23 = Static105.aClass180Array4[local18];
			if (local23.aByte48 == arg3 && local23.aShort54 == arg2 && arg1 == local23.aShort53 || arg2 == local23.aShort51 && local23.aShort53 == arg1) {
				if (Static252.anInt4008 != local18) {
					Static685.method8331(Static105.aClass180Array4, local18 + 1, Static105.aClass180Array4, local18, Static105.aClass180Array4.length - local18 - 1);
				}
				Static252.anInt4008--;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method7417(@OriginalArg(1) String arg0) {
		@Pc(7) StringBuffer local7 = new StringBuffer();
		@Pc(15) int local15 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(22) char local22 = arg0.charAt(local17);
			if (local22 == '%' && local17 + 2 < local15) {
				local22 = arg0.charAt(local17 + 1);
				@Pc(50) int local50;
				if (local22 >= '0' && local22 <= '9') {
					local50 = local22 - 48;
				} else if (local22 >= 'a' && local22 <= 'f') {
					local50 = local22 + 10 - 97;
				} else {
					if (local22 < 'A' || local22 > 'F') {
						local7.append('%');
						continue;
					}
					local50 = local22 + 10 - 65;
				}
				local50 *= 16;
				local22 = arg0.charAt(local17 + 2);
				if (local22 >= '0' && local22 <= '9') {
					local50 += local22 - 48;
				} else if (local22 >= 'a' && local22 <= 'f') {
					local50 += local22 + '\n' - 97;
				} else {
					if (local22 < 'A' || local22 > 'F') {
						local7.append('%');
						continue;
					}
					local50 += local22 - 55;
				}
				if (local50 != 0 && Static520.method7346((byte) local50)) {
					local7.append(Static549.method7576((byte) local50));
				}
				local17 += 2;
			} else if (local22 == '+') {
				local7.append(' ');
			} else {
				local7.append(local22);
			}
		}
		return local7.toString();
	}
}
