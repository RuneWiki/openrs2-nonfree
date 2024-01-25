import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static447 {

	@OriginalMember(owner = "client!r", name = "j", descriptor = "I")
	public static int anInt10076;

	@OriginalMember(owner = "client!r", name = "m", descriptor = "I")
	public static int anInt10079;

	@OriginalMember(owner = "client!r", name = "c", descriptor = "I")
	public static int anInt10072 = -1;

	@OriginalMember(owner = "client!r", name = "d", descriptor = "[I")
	public static final int[] anIntArray570 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!r", name = "g", descriptor = "[I")
	public static final int[] anIntArray571 = new int[2048];

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!is;I)V")
	public static void method7797(@OriginalArg(0) Class155 arg0) {
		if (arg0.anInt4796 == 5 && arg0.anInt4785 != -1) {
			Static416.method6243(Static39.aClass7_2, arg0);
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BILclient!vo;Ljava/awt/Canvas;ILclient!fa;)Lclient!r;")
	public static synchronized Class7 method7798(@OriginalArg(1) int arg0, @OriginalArg(2) Class348 arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Interface7 arg4) {
		if (arg0 == 0) {
			return Static371.method5566(arg2, arg4);
		} else if (arg0 == 2) {
			return Static398.method6105(arg2, arg4);
		} else if (arg0 == 1) {
			return Static272.method8237(arg2, arg3, arg4);
		} else if (arg0 == 5) {
			return Static444.method6534(arg1, arg3, arg4, arg2);
		} else if (arg0 == 3) {
			return Static604.method6316(arg4, arg2, arg3, arg1);
		} else {
			throw new IllegalArgumentException("UM");
		}
	}
}
