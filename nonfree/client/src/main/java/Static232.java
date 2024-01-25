import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static232 {

	@OriginalMember(owner = "client!ida", name = "D", descriptor = "Lclient!he;")
	public static final Class128 aClass128_13 = new Class128(16);

	@OriginalMember(owner = "client!ida", name = "V", descriptor = "Ljava/lang/String;")
	public static String aString53 = null;

	@OriginalMember(owner = "client!ida", name = "f", descriptor = "(B)V")
	public static void method4001() {
		Static560.aClass166_55.method4802();
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(IZIBI)V")
	public static void method4003(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static578.method5705(arg0)) {
			Static106.method1753(arg2, arg3, arg1, -1, Static605.aClass302ArrayArray4[arg0]);
		}
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "([Ljava/lang/String;I[S)V")
	public static void method4005(@OriginalArg(0) String[] arg0, @OriginalArg(2) short[] arg1) {
		Static174.method3211(0, arg0.length - 1, arg0, arg1);
	}
}
