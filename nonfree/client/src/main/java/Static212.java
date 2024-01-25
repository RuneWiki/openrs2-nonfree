import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static212 {

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "[I")
	public static int[] anIntArray483;

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "Lclient!hh;")
	public static final Class155 aClass155_46 = new Class155(1);

	@OriginalMember(owner = "client!ha", name = "s", descriptor = "[I")
	public static final int[] anIntArray482 = new int[32];

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!d;Lclient!lga;IIBILjava/awt/Canvas;I)Lclient!ha;")
	public static synchronized Class75 method6648(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Canvas arg5, @OriginalArg(7) int arg6) {
		if (arg6 == 0) {
			return Static539.method7694(arg0, arg5, arg4, arg3);
		} else if (arg6 == 2) {
			return Static473.method7126(arg5, arg4, arg3, arg0);
		} else if (arg6 == 1) {
			return Static339.method5222(arg5, arg0, arg2);
		} else if (arg6 == 5) {
			return Static537.method7679(arg2, arg1, arg0, arg5);
		} else if (arg6 == 3) {
			return Static696.method5669(arg1, arg2, arg0, arg5);
		} else {
			throw new IllegalArgumentException("UM");
		}
	}

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "(II)I")
	public static int method6681(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)V")
	public static void method6684(@OriginalArg(1) int arg0) {
		Static41.anInt544 = 2;
		Static305.aClass260_2 = Static525.aClass260_4;
		Static423.anInt7240 = arg0;
		Static430.method3630(true, Static87.aString114, "", Static87.aString114.equals(""));
	}
}
