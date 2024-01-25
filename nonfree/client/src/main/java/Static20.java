import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static20 {

	@OriginalMember(owner = "client!ao", name = "h", descriptor = "[I")
	public static int[] anIntArray13;

	@OriginalMember(owner = "client!ao", name = "m", descriptor = "Z")
	public static boolean aBoolean18;

	@OriginalMember(owner = "client!ao", name = "k", descriptor = "I")
	public static int anInt301 = 0;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Ljava/awt/Canvas;IILclient!fa;)Lclient!r;")
	public static Class44 method228(@OriginalArg(0) Canvas arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface11 arg2) {
		return new Class44_Sub3(arg0, arg2, arg1);
	}
}
