import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!lh", name = "k", descriptor = "Lclient!ov;")
	public static Class179 aClass179_11;

	@OriginalMember(owner = "client!lh", name = "n", descriptor = "I")
	public static int anInt4398;

	@OriginalMember(owner = "client!lh", name = "p", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray101;

	@OriginalMember(owner = "client!lh", name = "q", descriptor = "I")
	public static int anInt4400;

	@OriginalMember(owner = "client!lh", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString42 = "";

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZLjava/lang/String;IB)Z")
	public static boolean method3588(@OriginalArg(1) String arg0) {
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		@Pc(26) int local26 = 0;
		@Pc(29) int local29 = arg0.length();
		for (@Pc(36) int local36 = 0; local36 < local29; local36++) {
			@Pc(41) char local41 = arg0.charAt(local36);
			if (local36 == 0) {
				if (local41 == '-') {
					local22 = true;
					continue;
				}
				if (local41 == '+') {
					continue;
				}
			}
			@Pc(67) int local67;
			if (local41 >= '0' && local41 <= '9') {
				local67 = local41 - '0';
			} else if (local41 >= 'A' && local41 <= 'Z') {
				local67 = local41 - '7';
			} else if (local41 >= 'a' && local41 <= 'z') {
				local67 = local41 - 'W';
			} else {
				return false;
			}
			if (local67 >= 10) {
				return false;
			}
			if (local22) {
				local67 = -local67;
			}
			@Pc(111) int local111 = local67 + local26 * 10;
			if (local111 / 10 != local26) {
				return false;
			}
			local24 = true;
			local26 = local111;
		}
		return local24;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method3589(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(17) Class3_Sub3_Sub7 local17 = Static139.method2522(2, arg0);
		local17.method1570();
		local17.aString16 = arg1;
	}
}
