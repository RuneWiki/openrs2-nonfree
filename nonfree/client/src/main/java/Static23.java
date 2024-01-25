import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!ar", name = "i", descriptor = "I")
	public static int anInt476;

	@OriginalMember(owner = "client!ar", name = "g", descriptor = "I")
	public static final int anInt475 = 1400;

	@OriginalMember(owner = "client!ar", name = "j", descriptor = "[S")
	public static short[] aShortArray18 = new short[256];

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method572(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(13) int local13 = arg1.indexOf(arg2); local13 != -1; local13 = arg1.indexOf(arg2, local13 + arg0.length())) {
			arg1 = arg1.substring(0, local13) + arg0 + arg1.substring(arg2.length() + local13);
		}
		return arg1;
	}
}
