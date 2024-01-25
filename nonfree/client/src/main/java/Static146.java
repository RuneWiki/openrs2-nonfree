import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!hk", name = "v", descriptor = "I")
	public static int anInt2652;

	@OriginalMember(owner = "client!hk", name = "t", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_42 = new Class186(75, -1);

	@OriginalMember(owner = "client!hk", name = "u", descriptor = "I")
	public static int anInt2651 = 0;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!be;IIILclient!wn;BILjava/lang/String;Lclient!tq;Lclient!pm;II)V")
	public static void method2433(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class92 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6, @OriginalArg(8) Class239 arg7, @OriginalArg(9) Class201 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(11) int local11;
		if (Static9.anInt164 == 4) {
			local11 = (int) Static397.aFloat99 & 0x3FFF;
		} else {
			local11 = (int) Static397.aFloat99 + Static71.anInt1484 & 0x3FFF;
		}
		@Pc(32) int local32 = Math.max(arg7.anInt6435 / 2, arg7.anInt6408 / 2) + 10;
		@Pc(40) int local40 = arg3 * arg3 + arg9 * arg9;
		if (local32 * local32 < local40) {
			return;
		}
		@Pc(54) int local54 = Class6_Sub1_Sub18.anIntArray642[local11];
		@Pc(58) int local58 = Class6_Sub1_Sub18.anIntArray643[local11];
		if (Static9.anInt164 != 4) {
			local54 = local54 * 256 / (Static393.anInt5623 + 256);
			local58 = local58 * 256 / (Static393.anInt5623 + 256);
		}
		@Pc(90) int local90 = arg3 * local54 + local58 * arg9 >> 15;
		@Pc(106) int local106 = arg3 * local58 - arg9 * local54 >> 15;
		@Pc(113) int local113 = arg8.method4449(null, arg6, 100);
		@Pc(119) int local119 = local90 - local113 / 2;
		@Pc(127) int local127 = arg8.method4457(null, arg6);
		if (-arg7.anInt6435 <= local119 && local119 <= arg7.anInt6435 && -arg7.anInt6408 <= local106 && arg7.anInt6408 >= local106) {
			arg4.method5641(arg1, arg5, null, 0, local113, 50, arg7.anInt6408 / 2 + arg5 - local106 - arg10 - local127, 0, arg6, arg2, arg0, null, arg7.anInt6435 / 2 + local119 + arg2);
		}
	}
}
