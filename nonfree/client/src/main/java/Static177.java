import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!m", name = "d", descriptor = "I")
	public static int anInt3734;

	@OriginalMember(owner = "client!m", name = "f", descriptor = "I")
	public static int anInt3736;

	@OriginalMember(owner = "client!m", name = "c", descriptor = "Lclient!ps;")
	public static Class163 aClass163_12 = null;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIB)V")
	public static void method3158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray387[0];
		@Pc(22) int local22 = Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray388[0];
		if (Class10_Sub1_Sub1.lb == 1) {
			if (!Static102.method1601(0, arg0, -2, arg1, local22, 1, false, 0, local8, 1)) {
				Static102.method1601(0, arg0, -3, arg1, local22, 1, false, 0, local8, 1);
			}
		} else if (!Static102.method1601(0, arg0, -3, arg1, local22, 1, false, 0, local8, 1)) {
			Static102.method1601(0, arg0, -2, arg1, local22, 1, false, 0, local8, 1);
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIII)V")
	public static void method3159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static344.anInt6649; local7++) {
			@Pc(13) Rectangle local13 = Class1_Sub5_Sub21.aRectangleArray4[local7];
			if (local13.width + local13.x > arg0 && arg3 + arg0 > local13.x && local13.height + local13.y > arg2 && arg2 + arg1 > local13.y) {
				Static19.aBooleanArray1[local7] = true;
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!lm;BLclient!lm;)V")
	public static void method3163(@OriginalArg(0) Class134 arg0, @OriginalArg(2) Class134 arg1) {
		Static354.aClass134_155 = arg1;
		Static320.aClass134_142 = arg0;
	}
}
