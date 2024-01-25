import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static157 {

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "Lclient!raa;")
	public static final Class246 aClass246_1 = new Class246();

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "[I")
	public static final int[] anIntArray266 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)Z")
	public static boolean method2875(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static54.method1451(arg0, arg1) & ((arg1 & 0x2000) != 0 | Static346.method5755(arg1, arg0) | Static469.method7144(arg0, arg1));
	}
}
