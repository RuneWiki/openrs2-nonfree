import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!jp", name = "f", descriptor = "[I")
	public static final int[] anIntArray253 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!jp", name = "m", descriptor = "[I")
	public static final int[] anIntArray254 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!jp", name = "u", descriptor = "I")
	public static int anInt3808 = -1;

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIIILclient!oa;ILjava/lang/String;Lclient!cr;Lclient!re;IBLclient!ea;)V")
	public static void method3031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class56 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) String arg6, @OriginalArg(7) Class41 arg7, @OriginalArg(8) Class210 arg8, @OriginalArg(9) int arg9, @OriginalArg(11) Class14 arg10) {
		@Pc(13) int local13;
		if (Static65.anInt7824 == 4) {
			local13 = (int) Static203.aFloat130 & 0x3FFF;
		} else {
			local13 = (int) Static203.aFloat130 + Static357.anInt3686 & 0x3FFF;
		}
		@Pc(35) int local35 = Math.max(arg7.anInt1622 / 2, arg7.anInt1599 / 2) + 10;
		@Pc(43) int local43 = arg1 * arg1 + arg2 * arg2;
		if (local43 > local35 * local35) {
			return;
		}
		@Pc(53) int local53 = Class184.anIntArray349[local13];
		@Pc(57) int local57 = Class184.anIntArray350[local13];
		if (Static65.anInt7824 != 4) {
			local57 = local57 * 256 / (Static119.anInt2384 + 256);
			local53 = local53 * 256 / (Static119.anInt2384 + 256);
		}
		@Pc(88) int local88 = local57 * arg2 + arg1 * local53 >> 15;
		@Pc(99) int local99 = local57 * arg1 - arg2 * local53 >> 15;
		@Pc(106) int local106 = arg8.method4754(100, null, arg6);
		@Pc(114) int local114 = arg8.method4745(arg6, null);
		@Pc(120) int local120 = local88 - local106 / 2;
		if (local120 >= -arg7.anInt1622 && arg7.anInt1622 >= local120 && -arg7.anInt1599 <= local99 && arg7.anInt1599 >= local99) {
			arg4.method5851(0, arg9, arg10, 0, arg0 + arg7.anInt1599 / 2 - local114 - arg5 - local99, null, arg0, local106, arg3, 50, arg9 + local120 + arg7.anInt1622 / 2, null, arg6);
		}
	}
}
