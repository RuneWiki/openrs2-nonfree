import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!ar", name = "c", descriptor = "I")
	public static int anInt596;

	@OriginalMember(owner = "client!ar", name = "d", descriptor = "I")
	public static int anInt597;

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "Lclient!bm;")
	public static final Class32 aClass32_2 = new Class32();

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;")
	public static String method744(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(7) int local7 = arg1.indexOf(arg0); local7 != -1; local7 = arg1.indexOf(arg0, local7 + arg2.length())) {
			arg1 = arg1.substring(0, local7) + arg2 + arg1.substring(local7 + arg0.length());
		}
		return arg1;
	}
}
