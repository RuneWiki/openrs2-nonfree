import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static60 {

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
	public static int anInt1599 = 0;

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
	public static int anInt1600 = 0;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIBI)V")
	public static void method1629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static638.anInt10171 = arg1;
		Static44.anInt1313 = arg5;
		Static265.anInt4848 = arg4;
		Static296.anInt5216 = arg3;
		Static551.anInt9267 = arg0;
		Static621.anInt10057 = arg2;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BZI)Ljava/lang/String;")
	public static String method1630(@OriginalArg(2) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static287.method4607(arg0);
	}
}
