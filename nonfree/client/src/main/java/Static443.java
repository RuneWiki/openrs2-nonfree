import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static443 {

	@OriginalMember(owner = "client!pt", name = "n", descriptor = "I")
	public static int anInt7088;

	@OriginalMember(owner = "client!pt", name = "f", descriptor = "I")
	public static int anInt7083 = 0;

	@OriginalMember(owner = "client!pt", name = "p", descriptor = "Z")
	public static boolean aBoolean532 = false;

	@OriginalMember(owner = "client!pt", name = "s", descriptor = "[I")
	public static final int[] anIntArray506 = new int[8];

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(Ljava/lang/String;IBLjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
	public static void method6042(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5) {
		Static150.method2241(arg1, arg2, arg3, arg0, arg4, -1, null, arg5);
	}
}
