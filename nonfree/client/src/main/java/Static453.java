import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static453 {

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "Lclient!im;")
	public static Class147 aClass147_5;

	@OriginalMember(owner = "client!rw", name = "d", descriptor = "Lclient!ta;")
	public static Class56 aClass56_5;

	@OriginalMember(owner = "client!rw", name = "g", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(BILclient!ta;Lclient!fca;ILclient!il;Ljava/lang/String;IILclient!fa;II)V")
	public static void method6446(@OriginalArg(1) int arg0, @OriginalArg(2) Class56 arg1, @OriginalArg(3) Class97 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class146 arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class16 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(14) int local14;
		if (Static354.anInt6233 == 4) {
			local14 = (int) Static399.aFloat167 & 0x3FFF;
		} else {
			local14 = (int) Static399.aFloat167 + Static574.anInt6272 & 0x3FFF;
		}
		@Pc(33) int local33 = Math.max(arg2.anInt2340 / 2, arg2.anInt2305 / 2) + 10;
		@Pc(42) int local42 = arg0 * arg0 + arg9 * arg9;
		if (local42 > local33 * local33) {
			return;
		}
		@Pc(56) int local56 = Class138.anIntArray392[local14];
		@Pc(64) int local64 = Class138.anIntArray393[local14];
		if (Static354.anInt6233 != 4) {
			local56 = local56 * 256 / (Static291.anInt4749 + 256);
			local64 = local64 * 256 / (Static291.anInt4749 + 256);
		}
		@Pc(95) int local95 = arg9 * local56 + arg0 * local64 >> 14;
		@Pc(106) int local106 = local64 * arg9 - arg0 * local56 >> 14;
		@Pc(113) int local113 = arg4.method3169(100, arg5, null);
		@Pc(121) int local121 = arg4.method3176(null, arg5);
		@Pc(127) int local127 = local95 - local113 / 2;
		if (local127 >= -arg2.anInt2340 && local127 <= arg2.anInt2340 && -arg2.anInt2305 <= local106 && arg2.anInt2305 >= local106) {
			arg1.method7881(null, 0, 50, local113, arg5, arg10, 1, arg6, arg8, null, arg2.anInt2340 / 2 + arg10 + local127, 0, arg3, arg2.anInt2305 / 2 + arg6 - local106 - arg7 - local121);
		}
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(ZIILclient!pq;III)V")
	public static void method6451(@OriginalArg(1) int arg0, @OriginalArg(3) Class251 arg1, @OriginalArg(5) int arg2) {
		Static221.anInt3764 = 2;
		Static466.aClass251_130 = arg1;
		Static192.anInt3325 = arg2;
		Static140.anInt2527 = 1;
		Static259.anInt4237 = arg0;
		Static396.aBoolean490 = false;
		Static74.anInt1223 = 0;
	}
}
