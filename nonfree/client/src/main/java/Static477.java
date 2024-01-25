import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static477 {

	@OriginalMember(owner = "client!tv", name = "o", descriptor = "I")
	public static int anInt8634;

	@OriginalMember(owner = "client!tv", name = "h", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_151 = new Class133(100, 7);

	@OriginalMember(owner = "client!tv", name = "p", descriptor = "I")
	public static int anInt8635 = 0;

	@OriginalMember(owner = "client!tv", name = "q", descriptor = "[J")
	public static final long[] aLongArray27 = new long[32];

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "([[II)V")
	public static void method7098(@OriginalArg(0) int[][] arg0) {
		Static68.anIntArrayArray24 = arg0;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Z)V")
	public static void method7099() {
		Static257.aClass267_24.method6648();
		Static40.aClass267_3.method6648();
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(ILjava/lang/String;IZ)Z")
	public static boolean method7100(@OriginalArg(1) String arg0) {
		@Pc(29) boolean local29 = false;
		@Pc(31) boolean local31 = false;
		@Pc(33) int local33 = 0;
		@Pc(36) int local36 = arg0.length();
		for (@Pc(38) int local38 = 0; local38 < local36; local38++) {
			@Pc(44) char local44 = arg0.charAt(local38);
			if (local38 == 0) {
				if (local44 == '-') {
					local29 = true;
					continue;
				}
				if (local44 == '+') {
					continue;
				}
			}
			@Pc(80) int local80;
			if (local44 >= '0' && local44 <= '9') {
				local80 = local44 - '0';
			} else if (local44 >= 'A' && local44 <= 'Z') {
				local80 = local44 - '7';
			} else if (local44 >= 'a' && local44 <= 'z') {
				local80 = local44 - 'W';
			} else {
				return false;
			}
			if (local80 >= 10) {
				return false;
			}
			if (local29) {
				local80 = -local80;
			}
			@Pc(118) int local118 = local80 + local33 * 10;
			if (local33 != local118 / 10) {
				return false;
			}
			local31 = true;
			local33 = local118;
		}
		return local31;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method7101(@OriginalArg(1) String arg0) {
		if (Static468.aClass47Array1 != null) {
			Static278.method4791(Static117.aClass158_30);
			Static515.aClass3_Sub27_Sub1_2.method7576(Static274.method4751(arg0));
			Static515.aClass3_Sub27_Sub1_2.method7608(arg0);
		}
	}
}
