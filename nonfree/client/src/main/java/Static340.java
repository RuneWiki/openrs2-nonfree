import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static340 {

	@OriginalMember(owner = "client!kla", name = "a", descriptor = "[I")
	public static final int[] anIntArray334 = new int[1000];

	@OriginalMember(owner = "client!kla", name = "a", descriptor = "(DI)V")
	public static void method4997(@OriginalArg(0) double arg0) {
		Static30.aClass181_1.method6355(Static640.aClass181_14);
		Static30.aClass181_1.method6354(0, 0, (int) arg0);
		Static622.aClass67_15.method7642(Static30.aClass181_1);
	}

	@OriginalMember(owner = "client!kla", name = "a", descriptor = "(III)I")
	public static int method4998(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}

	@OriginalMember(owner = "client!kla", name = "a", descriptor = "(B)[Lclient!lda;")
	public static Class225[] method4999() {
		return new Class225[] { Static311.aClass225_8, Static56.aClass225_2, Static129.aClass225_6, Static252.aClass225_7, Static439.aClass225_10, Static435.aClass225_9, Static15.aClass225_1, Static514.aClass225_11, Static589.aClass225_13, Static672.aClass225_14, Static569.aClass225_12, Static73.aClass225_3, Static83.aClass225_5, Static74.aClass225_4 };
	}
}
