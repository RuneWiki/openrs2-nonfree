import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!lja", name = "r", descriptor = "I")
	public static int anInt6353;

	@OriginalMember(owner = "client!lja", name = "l", descriptor = "Lclient!cfa;")
	public static final Class54 aClass54_4 = new Class54();

	@OriginalMember(owner = "client!lja", name = "o", descriptor = "[Z")
	public static final boolean[] aBooleanArray16 = new boolean[100];

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BLjava/lang/String;)Ljava/lang/String;")
	public static String method5263(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(18) int local18 = arg2.indexOf(arg1); local18 != -1; local18 = arg2.indexOf(arg1, local18 + arg0.length())) {
			arg2 = arg2.substring(0, local18) + arg0 + arg2.substring(local18 + arg1.length());
		}
		return arg2;
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(ILjava/lang/String;ZII)V")
	public static void method5264(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		Static257.method3751(arg1, false, (String) null, arg2, arg0, arg3);
	}
}
