import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!of", name = "c", descriptor = "Lclient!nq;")
	public static Class144 aClass144_74;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "I")
	public static int anInt4561 = 0;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ZILjava/lang/String;I)Z")
	public static boolean method4018(@OriginalArg(2) String arg0) {
		@Pc(28) boolean local28 = false;
		@Pc(30) boolean local30 = false;
		@Pc(40) int local40 = 0;
		@Pc(43) int local43 = arg0.length();
		for (@Pc(45) int local45 = 0; local45 < local43; local45++) {
			@Pc(51) char local51 = arg0.charAt(local45);
			if (local45 == 0) {
				if (local51 == '-') {
					local28 = true;
					continue;
				}
				if (local51 == '+') {
					continue;
				}
			}
			@Pc(79) int local79;
			if (local51 >= '0' && local51 <= '9') {
				local79 = local51 - '0';
			} else if (local51 >= 'A' && local51 <= 'Z') {
				local79 = local51 - '7';
			} else if (local51 >= 'a' && local51 <= 'z') {
				local79 = local51 - 'W';
			} else {
				return false;
			}
			if (local79 >= 10) {
				return false;
			}
			if (local28) {
				local79 = -local79;
			}
			@Pc(118) int local118 = local40 * 10 + local79;
			if (local118 / 10 != local40) {
				return false;
			}
			local40 = local118;
			local30 = true;
		}
		return local30;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BLclient!wk;II)V")
	public static void method4019(@OriginalArg(1) Class214 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static247.aClass214ArrayArray1[arg1][arg2] = arg0;
	}
}
