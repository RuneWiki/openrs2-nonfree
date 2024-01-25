import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static296 {

	@OriginalMember(owner = "client!kha", name = "E", descriptor = "I")
	public static int anInt5216;

	@OriginalMember(owner = "client!kha", name = "F", descriptor = "[I")
	public static final int[] anIntArray283 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(III)Z")
	public static boolean method4677(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static347.method5788(arg0, arg1) & Static119.method2415(arg1, arg0);
	}

	@OriginalMember(owner = "client!kha", name = "c", descriptor = "(I)V")
	public static void method4678() {
		Static151.aClass95Array1 = null;
	}
}
