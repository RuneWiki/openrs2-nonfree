import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static429 {

	@OriginalMember(owner = "client!sb", name = "q", descriptor = "Ljava/awt/Image;")
	public static Image anImage3;

	@OriginalMember(owner = "client!sb", name = "O", descriptor = "[I")
	public static final int[] anIntArray586 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZLclient!gw;)Lclient!es;")
	public static Class82_Sub1 method6339(@OriginalArg(1) Class1_Sub13 arg0) {
		return new Class82_Sub1(arg0.method3058(), arg0.method3058(), arg0.method3058(), arg0.method3058(), arg0.method3039(), arg0.method3039(), arg0.method3043());
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIB)B")
	public static byte method6340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
