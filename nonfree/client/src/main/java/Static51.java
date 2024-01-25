import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static51 {

	@OriginalMember(owner = "client!br", name = "S", descriptor = "I")
	public static int anInt1085;

	@OriginalMember(owner = "client!br", name = "u", descriptor = "I")
	public static int anInt1073 = 0;

	@OriginalMember(owner = "client!br", name = "J", descriptor = "I")
	public static int anInt1080 = 0;

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(III)Z")
	public static boolean method829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static528.method7294(arg0, arg1) & Static201.method2851(arg1, arg0);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IIIII)V")
	public static void method832(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static297.anInt4862 = arg2;
		Static578.anInt9407 = arg3;
		Static201.anInt3403 = arg0;
		Static447.anInt8771 = arg1;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "([Ljava/lang/String;Z[S)V")
	public static void method835(@OriginalArg(0) String[] arg0, @OriginalArg(2) short[] arg1) {
		Static595.method8063(arg0, 0, arg1, arg0.length - 1);
	}
}
