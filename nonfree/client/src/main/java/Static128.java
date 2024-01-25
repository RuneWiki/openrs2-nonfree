import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static128 {

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "S")
	public static short aShort24 = 205;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V")
	public static void method2268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4) {
		Static426.method5438(-1, arg4, arg2, null, arg0, arg3, arg1);
	}
}
