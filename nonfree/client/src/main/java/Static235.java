import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static235 {

	@OriginalMember(owner = "client!hg", name = "h", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_71 = new Class225(87, 6);

	@OriginalMember(owner = "client!hg", name = "i", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!hg", name = "g", descriptor = "[I")
	public static final int[] anIntArray289 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIBIIILclient!ha;)V")
	public static void method3346(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) Class145 arg4) {
		arg4.method9637(arg1, arg0, arg2, -10660793, arg3);
		arg4.method9637(arg1 - 2, 16, arg2 + 1, -16777216, arg3 + 1);
		arg4.method9635(-16777216, arg2 + 18, arg0 - 19, arg3 + 1, arg1 - 2);
	}
}
