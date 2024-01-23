import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!qf", name = "B", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!qf", name = "y", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray35 = new String[1000];

	@OriginalMember(owner = "client!qf", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString157 = "flash2:";

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method3719(@OriginalArg(1) String arg0) {
		@Pc(4) long local4 = (long) 0;
		@Pc(7) int local7 = arg0.length();
		for (@Pc(13) int local13 = 0; local13 < local7; local13++) {
			@Pc(24) char local24 = arg0.charAt(local13);
			local4 *= 37L;
			if (local24 >= 'A' && local24 <= 'Z') {
				local4 += local24 + 1 - 65;
			} else if (local24 >= 'a' && local24 <= 'z') {
				local4 += local24 + 1 - 97;
			} else if (local24 >= '0' && local24 <= '9') {
				local4 += local24 + 27 - 48;
			}
			if (local4 >= 177917621779460413L) {
				break;
			}
		}
		while (local4 % 37L == 0L && local4 != 0L) {
			local4 /= 37L;
		}
		return local4;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(BI)I")
	public static int method3720(@OriginalArg(1) int arg0) {
		return arg0 == 16711935 ? -1 : Static50.method945(arg0);
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(II)V")
	public static void method3721() {
		Static89.aClass157_19.method4034(5);
	}
}
