import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static630 {

	@OriginalMember(owner = "client!tn", name = "j", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_170 = new Class397(134, -2);

	@OriginalMember(owner = "client!tn", name = "f", descriptor = "I")
	public static int anInt9714 = 0;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "J")
	public static long aLong311 = -1L;

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "(I)V")
	public static void method8285() {
		Static681.anInt10651 = -1;
		Static606.anInt9195 = -1;
		Static306.anInt4920 = 0;
		Static517.anInt8136 = -1;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(III)Z")
	public static boolean method8286(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIIII)V")
	public static void method8287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static440.anInt6772; local7++) {
			@Pc(13) Rectangle local13 = Class202.aRectangleArray1[local7];
			if (arg3 < local13.width + local13.x && arg0 + arg3 > local13.x && local13.height + local13.y > arg2 && local13.y < arg2 + arg1) {
				Static472.aBooleanArray19[local7] = true;
			}
		}
		Static218.method3251(arg2 + arg1, arg3, arg0 + arg3, arg2);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(ILclient!s;)V")
	public static void method8288(@OriginalArg(0) int arg0, @OriginalArg(1) Class259 arg1) {
		Static477.aClass259Array3[arg0] = arg1;
	}
}
