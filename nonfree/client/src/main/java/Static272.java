import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static272 {

	@OriginalMember(owner = "client!ku", name = "e", descriptor = "[I")
	public static final int[] anIntArray442 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!ku", name = "s", descriptor = "[I")
	public static final int[] anIntArray443 = new int[2048];

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(III)Z")
	public static boolean method3833(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x580) != 0;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lclient!saa;I)Z")
	public static boolean method3834(@OriginalArg(0) Class287 arg0) {
		return Static420.aClass287_7 == arg0 || Static257.aClass287_4 == arg0 || arg0 == Static154.aClass287_2 || Static351.aClass287_5 == arg0;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)V")
	public static void method3835() {
		Static493.anInt8238 = 0;
		Static410.anInt7192 = 0;
		Static90.anInt1536 = 0;
		Static401.anInt7056 = 0;
	}

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(III)Z")
	public static boolean method3839(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x21) != 0;
	}
}
