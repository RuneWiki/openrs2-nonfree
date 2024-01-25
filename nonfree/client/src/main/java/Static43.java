import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static43 {

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "[I")
	public static int[] anIntArray121;

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "Lclient!vaa;")
	public static final Class299 aClass299_1 = new Class299();

	@OriginalMember(owner = "client!bn", name = "f", descriptor = "I")
	public static int anInt839 = 0;

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(III)Z")
	public static boolean method849(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static122.method2532(arg0, arg1) | Static440.method6681(arg1, arg0) | Static374.method5767(arg1, arg0)) & Static254.method4370(arg0, arg1);
	}
}
