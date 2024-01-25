import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!rp", name = "E", descriptor = "Lclient!iv;")
	public static Class119 aClass119_128;

	@OriginalMember(owner = "client!rp", name = "I", descriptor = "I")
	public static int anInt6028;

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(BZ)Z")
	public static boolean method4717(@OriginalArg(1) boolean arg0) {
		@Pc(6) boolean local6 = Static121.aClass172_3.method5539();
		if (arg0 == local6) {
			return true;
		}
		if (!arg0) {
			Static121.aClass172_3.method5476();
		} else if (!Static121.aClass172_3.method5494()) {
			arg0 = false;
		}
		if (local6 == arg0) {
			return false;
		} else {
			Static374.aClass20_Sub1_1.aBoolean197 = arg0;
			Static374.aClass20_Sub1_1.method1818(Static66.aClass143_2);
			return true;
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ljava/lang/String;ZII)I")
	public static int method4718(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		@Pc(26) int local26 = 0;
		@Pc(29) int local29 = arg0.length();
		for (@Pc(40) int local40 = 0; local40 < local29; local40++) {
			@Pc(45) char local45 = arg0.charAt(local40);
			if (local40 == 0) {
				if (local45 == '-') {
					local22 = true;
					continue;
				}
				if (local45 == '+') {
					continue;
				}
			}
			@Pc(75) int local75;
			if (local45 >= '0' && local45 <= '9') {
				local75 = local45 - '0';
			} else if (local45 >= 'A' && local45 <= 'Z') {
				local75 = local45 - '7';
			} else if (local45 >= 'a' && local45 <= 'z') {
				local75 = local45 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg1 <= local75) {
				throw new NumberFormatException();
			}
			if (local22) {
				local75 = -local75;
			}
			@Pc(119) int local119 = arg1 * local26 + local75;
			if (local26 != local119 / arg1) {
				throw new NumberFormatException();
			}
			local26 = local119;
			local24 = true;
		}
		if (!local24) {
			throw new NumberFormatException();
		}
		return local26;
	}
}
