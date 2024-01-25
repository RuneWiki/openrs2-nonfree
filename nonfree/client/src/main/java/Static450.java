import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static450 {

	@OriginalMember(owner = "client!pca", name = "l", descriptor = "I")
	public static int anInt7444 = 0;

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(IZI)Z")
	public static boolean method6576(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V")
	public static void method6577(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) String arg5) {
		Static470.method6813(arg0, arg5, arg1, -1, arg2, arg4, arg3, (String) null);
	}
}
