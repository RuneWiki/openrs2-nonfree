import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "F")
	public static float aFloat92;

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "J")
	public static long aLong116;

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "Z")
	public static boolean aBoolean355 = false;

	@OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
	public static int anInt4796 = 0;

	@OriginalMember(owner = "client!jp", name = "f", descriptor = "[C")
	public static final char[] aCharArray2 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIFF[BFIIIILclient!ifa;FF)V")
	public static void method4295(@OriginalArg(2) float arg0, @OriginalArg(3) float arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) float arg3, @OriginalArg(7) int arg4, @OriginalArg(10) Class136 arg5, @OriginalArg(11) float arg6, @OriginalArg(12) float arg7) {
		for (@Pc(10) int local10 = 0; local10 < 16; local10++) {
			Static55.method945(arg1, arg4, arg2, arg0, arg7, arg3, local10, arg6, arg5);
			arg4 += 16384;
		}
	}
}
