import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "I")
	public static int anInt6330;

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(IILclient!mv;ILclient!sba;IBLjava/lang/String;Lclient!aa;IILclient!da;)V")
	public static void method5305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class213 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class302 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) String arg6, @OriginalArg(8) Class1 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class34 arg10) {
		@Pc(13) int local13;
		if (Static554.anInt9497 == 4) {
			local13 = (int) Static595.aFloat184 & 0x3FFF;
		} else {
			local13 = (int) Static595.aFloat184 + Static372.anInt7080 & 0x3FFF;
		}
		@Pc(35) int local35 = Math.max(arg4.anInt8909 / 2, arg4.anInt8872 / 2) + 10;
		@Pc(43) int local43 = arg9 * arg9 + arg0 * arg0;
		if (local35 * local35 < local43) {
			return;
		}
		@Pc(73) int local73 = Class78_Sub2_Sub2.anIntArray270[local13];
		@Pc(77) int local77 = Class78_Sub2_Sub2.anIntArray271[local13];
		if (Static554.anInt9497 != 4) {
			local73 = local73 * 256 / (Static289.anInt10738 + 256);
			local77 = local77 * 256 / (Static289.anInt10738 + 256);
		}
		@Pc(106) int local106 = arg9 * local73 + arg0 * local77 >> 14;
		@Pc(117) int local117 = local77 * arg9 - arg0 * local73 >> 14;
		@Pc(124) int local124 = arg2.method5827(100, arg6, (Class4[]) null);
		@Pc(132) int local132 = arg2.method5829((Class4[]) null, 100, 0, arg6);
		@Pc(138) int local138 = local106 - local124 / 2;
		if (-arg4.anInt8909 <= local138 && arg4.anInt8909 >= local138 && -arg4.anInt8872 <= local117 && local117 <= arg4.anInt8872) {
			arg10.method8595(arg4.anInt8909 / 2 + local138 + arg1, (Class4[]) null, local124, arg6, arg1, 0, arg7, 1, arg8, (int[]) null, 0, arg3, 0, arg3 + arg4.anInt8872 / 2 - local132 - local117 - arg5, 50);
		}
	}
}
