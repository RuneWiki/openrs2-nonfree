import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static392 {

	@OriginalMember(owner = "client!te", name = "F", descriptor = "I")
	public static int anInt6820;

	@OriginalMember(owner = "client!te", name = "K", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_209 = new Class214(86, 3);

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(III)I")
	public static int method5522(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static447.anIntArray614[arg0 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method5523(@OriginalArg(1) String arg0) {
		System.exit(1);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BI)V")
	public static void method5525(@OriginalArg(1) int arg0) {
		if (Static104.method1974(arg0)) {
			Static317.method4764(-1, Static122.aClass240ArrayArray2[arg0]);
		}
	}
}
