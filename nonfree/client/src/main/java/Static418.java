import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static418 {

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZI)I")
	public static int method5348(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;I)V")
	public static void method5350(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		Static436.anInt6898 = 2;
		Static212.anInt3924 = arg2;
		Static130.method1657(arg1, arg0);
	}
}
