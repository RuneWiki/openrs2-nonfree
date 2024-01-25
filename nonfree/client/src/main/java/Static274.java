import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!nr", name = "g", descriptor = "Ljava/awt/Image;")
	public static Image anImage2;

	@OriginalMember(owner = "client!nr", name = "n", descriptor = "I")
	public static int anInt4887;

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_64 = new Class84("flash2:", "blinken2:", "clignotant2:", "flash2:");

	@OriginalMember(owner = "client!nr", name = "i", descriptor = "I")
	public static int anInt4882 = 10;

	@OriginalMember(owner = "client!nr", name = "q", descriptor = "Lclient!tk;")
	public static final Class225 aClass225_14 = new Class225(9, 0, 4, 1);

	@OriginalMember(owner = "client!nr", name = "r", descriptor = "F")
	public static float aFloat78 = 0.0F;

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(ILclient!lh;I)Ljava/lang/String;")
	public static String method3960(@OriginalArg(1) Class1_Sub1 arg0) {
		try {
			@Pc(12) int local12 = arg0.method4096();
			if (local12 > 32767) {
				local12 = 32767;
			}
			@Pc(24) byte[] local24 = new byte[local12];
			arg0.anInt5056 += Static25.aClass71_1.method1481(arg0.anInt5056, local24, local12, 0, arg0.aByteArray66);
			return Static365.method5027(local24, 0, local12);
		} catch (@Pc(48) Exception local48) {
			return "Cabbage";
		}
	}
}
