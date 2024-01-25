import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static523 {

	@OriginalMember(owner = "client!wa", name = "k", descriptor = "[[I")
	public static int[][] anIntArrayArray120;

	@OriginalMember(owner = "client!wa", name = "l", descriptor = "Z")
	public static boolean aBoolean690 = false;

	@OriginalMember(owner = "client!wa", name = "m", descriptor = "I")
	public static int anInt9228 = 0;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!ra;Lclient!fc;IIIZLclient!et;Lclient!pa;Ljava/lang/String;III)V")
	public static void method7971(@OriginalArg(0) Class36 arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class91 arg5, @OriginalArg(7) Class28 arg6, @OriginalArg(8) String arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(20) int local20;
		if (Static170.anInt3418 == 4) {
			local20 = (int) Static135.aFloat193 & 0x3FFF;
		} else {
			local20 = Static445.anInt7798 + (int) Static135.aFloat193 & 0x3FFF;
		}
		@Pc(39) int local39 = Math.max(arg5.anInt2399 / 2, arg5.anInt2378 / 2) + 10;
		@Pc(47) int local47 = arg4 * arg4 + arg9 * arg9;
		if (local47 > local39 * local39) {
			return;
		}
		@Pc(61) int local61 = Class200_Sub1.lb[local20];
		@Pc(65) int local65 = Class200_Sub1.anIntArray576[local20];
		if (Static170.anInt3418 != 4) {
			local65 = local65 * 256 / (Static220.anInt4325 + 256);
			local61 = local61 * 256 / (Static220.anInt4325 + 256);
		}
		@Pc(96) int local96 = arg9 * local65 + local61 * arg4 >> 15;
		@Pc(106) int local106 = local65 * arg4 - arg9 * local61 >> 15;
		@Pc(113) int local113 = arg1.method2367(100, null, arg7);
		@Pc(119) int local119 = local96 - local113 / 2;
		@Pc(127) int local127 = arg1.method2368(null, arg7);
		if (local119 >= -arg5.anInt2399 && arg5.anInt2399 >= local119 && -arg5.anInt2378 <= local106 && local106 <= arg5.anInt2378) {
			arg0.method7963(null, arg5.anInt2378 / 2 + arg10 - local106 - arg8 - local127, null, arg6, arg7, 50, arg10, arg2, 0, local113, local119 + arg2 + arg5.anInt2399 / 2, arg3, 0);
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(BZ)V")
	public static void method7973(@OriginalArg(1) boolean arg0) {
		if (Static231.aString101.length() == 0) {
			return;
		}
		Static465.method7070("--> " + Static231.aString101);
		Static141.method2638(arg0, Static231.aString101, false);
		Static140.anInt2804 = 0;
		Static231.aString101 = "";
		Static441.anInt7708 = 0;
	}
}
