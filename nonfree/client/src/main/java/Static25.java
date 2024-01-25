import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!au", name = "g", descriptor = "I")
	public static int anInt591;

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(II)Z")
	public static boolean method460(@OriginalArg(1) int arg0) {
		return arg0 == 4 || arg0 == 8 || arg0 == 11;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(ILjava/lang/String;ZB)I")
	public static int method461(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(36) int local36 = 0;
		@Pc(39) int local39 = arg1.length();
		for (@Pc(41) int local41 = 0; local41 < local39; local41++) {
			@Pc(47) char local47 = arg1.charAt(local41);
			if (local41 == 0) {
				if (local47 == '-') {
					local24 = true;
					continue;
				}
				if (local47 == '+') {
					continue;
				}
			}
			@Pc(77) int local77;
			if (local47 >= '0' && local47 <= '9') {
				local77 = local47 - '0';
			} else if (local47 >= 'A' && local47 <= 'Z') {
				local77 = local47 - '7';
			} else if (local47 >= 'a' && local47 <= 'z') {
				local77 = local47 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local77 >= arg0) {
				throw new NumberFormatException();
			}
			if (local24) {
				local77 = -local77;
			}
			@Pc(121) int local121 = local36 * arg0 + local77;
			if (local36 != local121 / arg0) {
				throw new NumberFormatException();
			}
			local36 = local121;
			local26 = true;
		}
		if (!local26) {
			throw new NumberFormatException();
		}
		return local36;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IIII)V")
	public static void method462(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = arg0 << 3;
		@Pc(15) int local15 = arg1 << 3;
		Static439.aFloat151 = local11;
		Static527.aFloat183 = local15;
		if (Static446.anInt7363 == 2) {
			Static68.anInt4065 = 0;
			Static37.anInt878 = local15;
			Static154.anInt3150 = local11;
		}
		Static89.method2014();
		Static350.aBoolean631 = true;
	}
}
