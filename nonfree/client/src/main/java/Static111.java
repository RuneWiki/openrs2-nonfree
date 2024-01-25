import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static111 {

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "Lclient!nga;")
	public static final Class233 aClass233_28 = new Class233(8);

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString54 = null;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)I")
	public static int method4493(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZLjava/lang/String;IZ)V")
	public static void method4502(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) {
		Static472.method6789(null, arg0, false, arg1, arg2, arg3);
	}
}
