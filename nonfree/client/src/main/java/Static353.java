import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!lb", name = "qg", descriptor = "S")
	public static short aShort131 = 32767;

	@OriginalMember(owner = "client!lb", name = "o", descriptor = "(I)Z")
	public static boolean method9774() {
		return Static391.anInt6484 != 0;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Ljava/lang/String;")
	public static String method9848(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(9) int local9 = arg1.indexOf(arg0); local9 != -1; local9 = arg1.indexOf(arg0, arg2.length() + local9)) {
			arg1 = arg1.substring(0, local9) + arg2 + arg1.substring(local9 + arg0.length());
		}
		return arg1;
	}
}
