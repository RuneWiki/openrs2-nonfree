import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!hj", name = "X", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_93 = new Class381(51, -1);

	@OriginalMember(owner = "client!hj", name = "ob", descriptor = "J")
	public static long aLong113 = 0L;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public static int method3474(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < local8; local18++) {
			local16 = (local16 << 5) + Static571.method7687(arg0.charAt(local18)) - local16;
		}
		return local16;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method3476(@OriginalArg(1) String arg0) {
		Static464.method6554("", "", 4, "", arg0, 0);
	}
}
