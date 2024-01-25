import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static24 {

	@OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
	public static int anInt332 = 0;

	@OriginalMember(owner = "client!bd", name = "w", descriptor = "I")
	public static int anInt334 = 0;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;II)V")
	public static void method309(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static362.method5404(arg2, arg4, null, arg0, arg3, -1, arg1);
	}
}
