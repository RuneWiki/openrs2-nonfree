import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static291 {

	@OriginalMember(owner = "client!tb", name = "T", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!tb", name = "V", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!tb", name = "J", descriptor = "[I")
	public static final int[] anIntArray566 = new int[128];

	@OriginalMember(owner = "client!tb", name = "K", descriptor = "J")
	public static long aLong182 = 0L;

	@OriginalMember(owner = "client!tb", name = "L", descriptor = "S")
	public static short aShort88 = 256;

	@OriginalMember(owner = "client!tb", name = "O", descriptor = "I")
	public static int anInt5860 = 0;

	@OriginalMember(owner = "client!tb", name = "P", descriptor = "I")
	public static final int anInt5861 = -11713997;

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "(I)V")
	public static void method5098() {
		Static313.aClass163ArrayArray1 = new Class163[Static237.aClass134_112.method3016()][];
		Static168.aBooleanArray17 = new boolean[Static237.aClass134_112.method3016()];
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BII)I")
	public static int method5100(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static328.anIntArray31[arg1 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5101(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static274.method4904(arg3)) {
			Static40.method844(Static313.aClass163ArrayArray1[arg3], -1, arg0, arg2, arg4, arg5, arg1, arg6);
		}
	}
}
