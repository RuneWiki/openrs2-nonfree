import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!gla", name = "i", descriptor = "Lclient!cba;")
	public static Class53 aClass53_3;

	@OriginalMember(owner = "client!gla", name = "n", descriptor = "I")
	public static int anInt3565;

	@OriginalMember(owner = "client!gla", name = "l", descriptor = "Lclient!ik;")
	public static Class182 aClass182_58;

	@OriginalMember(owner = "client!gla", name = "m", descriptor = "I")
	public static int anInt3560 = 0;

	@OriginalMember(owner = "client!gla", name = "k", descriptor = "Z")
	public static boolean aBoolean223 = true;

	@OriginalMember(owner = "client!gla", name = "a", descriptor = "(IIIZI)V")
	public static void method3227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static440.anInt6772; local3++) {
			@Pc(9) Rectangle local9 = Class202.aRectangleArray1[local3];
			if (local9.width + local9.x > arg3 && local9.x < arg1 + arg3 && local9.y + local9.height > arg0 && arg0 + arg2 > local9.y) {
				Static572.aBooleanArray23[local3] = true;
			}
		}
		Static218.method3251(arg2 + arg0, arg3, arg3 + arg1, arg0);
	}

	@OriginalMember(owner = "client!gla", name = "a", descriptor = "(BJ)V")
	public static void method3229(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(13) InterruptedException local13) {
		}
	}
}
