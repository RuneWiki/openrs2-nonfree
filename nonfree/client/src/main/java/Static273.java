import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static273 {

	@OriginalMember(owner = "client!nt", name = "d", descriptor = "[B")
	public static byte[] aByteArray64;

	@OriginalMember(owner = "client!nt", name = "f", descriptor = "I")
	public static int anInt5120;

	@OriginalMember(owner = "client!nt", name = "m", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas5;

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "[I")
	public static final int[] anIntArray334 = new int[8];

	@OriginalMember(owner = "client!nt", name = "e", descriptor = "I")
	public static int anInt5119 = 0;

	@OriginalMember(owner = "client!nt", name = "g", descriptor = "Z")
	public static boolean aBoolean463 = false;

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIZII)V")
	public static void method3912(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static323.aClass50_Sub1_1.anInt3448 != 0 && arg0 != 0 && Static109.anInt6886 < 50 && arg2 != -1) {
			Static86.aClass269Array1[Static109.anInt6886++] = new Class269((byte) 2, arg2, arg0, arg1, arg3, 0);
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public static String method3913(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(III)Z")
	public static boolean method3914(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static245.method3594(arg0, arg1) | Static190.method2975(arg1, arg0) | Static83.method1510(arg1, arg0)) & Static426.method5437(arg0, arg1);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(Lclient!fs;Lclient!ga;B)V")
	public static void method3916(@OriginalArg(0) Class76 arg0, @OriginalArg(1) Interface7 arg1) {
		Static151.aClass76_38 = arg0;
		Static402.anInterface7_8 = arg1;
	}
}
