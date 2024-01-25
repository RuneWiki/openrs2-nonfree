import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static386 {

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "Lclient!iw;")
	public static final Class5_Sub15_Sub2 aClass5_Sub15_Sub2_2 = new Class5_Sub15_Sub2(15000);

	@OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
	public static int anInt6720 = 0;

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "Z")
	public static boolean aBoolean482 = false;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IZILjava/lang/String;)Z")
	public static boolean method5661(@OriginalArg(3) String arg0) {
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		@Pc(26) int local26 = 0;
		@Pc(29) int local29 = arg0.length();
		for (@Pc(31) int local31 = 0; local31 < local29; local31++) {
			@Pc(36) char local36 = arg0.charAt(local31);
			if (local31 == 0) {
				if (local36 == '-') {
					local22 = true;
					continue;
				}
				if (local36 == '+') {
					continue;
				}
			}
			@Pc(65) int local65;
			if (local36 >= '0' && local36 <= '9') {
				local65 = local36 - '0';
			} else if (local36 >= 'A' && local36 <= 'Z') {
				local65 = local36 - '7';
			} else if (local36 >= 'a' && local36 <= 'z') {
				local65 = local36 - 'W';
			} else {
				return false;
			}
			if (local65 >= 10) {
				return false;
			}
			if (local22) {
				local65 = -local65;
			}
			@Pc(107) int local107 = local65 + local26 * 10;
			if (local26 != local107 / 10) {
				return false;
			}
			local24 = true;
			local26 = local107;
		}
		return local24;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZBI)Lclient!sv;")
	public static Class5_Sub48 method5663(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(12) long local12 = (long) (arg1 | (arg0 ? Integer.MIN_VALUE : 0));
		return (Class5_Sub48) Static459.aClass335_41.method7766(local12);
	}
}
