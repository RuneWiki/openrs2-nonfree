import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static125 {

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "Lclient!lm;")
	public static Class134 aClass134_55;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "[I")
	public static final int[] anIntArray253 = new int[64];

	@OriginalMember(owner = "client!ia", name = "j", descriptor = "[I")
	public static final int[] anIntArray254 = new int[] { 6144, 8192, 10240, 4096, 12288, 2048, 0, 14336 };

	@OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
	public static int anInt2448 = 0;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)V")
	public static void method1999(@OriginalArg(0) int arg0) {
		Static24.anInt439 = arg0;
		Static288.anInt5766 = -1;
		Static288.anInt5766 = -1;
		Static173.method3116();
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IBI)I")
	public static int method2000(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static264.anIntArray532[arg0 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)V")
	public static void method2001(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static274.method4904(arg1)) {
			Static211.method3856(arg0, Static313.aClass163ArrayArray1[arg1]);
		}
	}
}
