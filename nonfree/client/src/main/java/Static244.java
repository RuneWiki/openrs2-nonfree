import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!hja", name = "o", descriptor = "[I")
	public static int[] anIntArray245;

	@OriginalMember(owner = "client!hja", name = "w", descriptor = "D")
	public static double aDouble16;

	@OriginalMember(owner = "client!hja", name = "D", descriptor = "I")
	public static int anInt4562 = 0;

	@OriginalMember(owner = "client!hja", name = "y", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_80 = new Class186(43, -2);

	@OriginalMember(owner = "client!hja", name = "i", descriptor = "Z")
	public static boolean aBoolean399 = false;

	@OriginalMember(owner = "client!hja", name = "b", descriptor = "(III)Lclient!av;")
	public static Class20 method3731(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class20 local7 = Static118.method2045(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass20Array1 == null || arg1 >= local7.aClass20Array1.length) {
			return null;
		} else {
			return local7.aClass20Array1[arg1];
		}
	}

	@OriginalMember(owner = "client!hja", name = "a", descriptor = "(III)Z")
	public static boolean method3738(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!hja", name = "a", descriptor = "([BZ)Ljava/lang/String;")
	public static String method3742(@OriginalArg(0) byte[] arg0) {
		return Static358.method5137(arg0, arg0.length, 0);
	}
}
