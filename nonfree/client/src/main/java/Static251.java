import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "Lclient!sc;")
	public static Class328 aClass328_1;

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
	public static int anInt4886;

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "[Lclient!mq;")
	public static Class71[] aClass71Array25;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/lang/String;IILclient!uf;Lclient!da;Lclient!aa;IIZILclient!rt;I)V")
	public static void method4426(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class357 arg3, @OriginalArg(4) Class59 arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class324 arg9, @OriginalArg(11) int arg10) {
		@Pc(13) int local13;
		if (Static484.anInt8685 == 4) {
			local13 = (int) Static278.aFloat108 & 0x3FFF;
		} else {
			local13 = Static275.anInt5119 + (int) Static278.aFloat108 & 0x3FFF;
		}
		@Pc(32) int local32 = Math.max(arg3.anInt10395 / 2, arg3.anInt10465 / 2) + 10;
		@Pc(40) int local40 = arg1 * arg1 + arg8 * arg8;
		if (local32 * local32 < local40) {
			return;
		}
		@Pc(54) int local54 = Class12_Sub2.anIntArray204[local13];
		@Pc(58) int local58 = Class12_Sub2.anIntArray203[local13];
		if (Static484.anInt8685 != 4) {
			local58 = local58 * 256 / (Static199.anInt4199 + 256);
			local54 = local54 * 256 / (Static199.anInt4199 + 256);
		}
		@Pc(95) int local95 = arg1 * local54 + arg8 * local58 >> 14;
		@Pc(106) int local106 = local58 * arg1 - local54 * arg8 >> 14;
		@Pc(113) int local113 = arg9.method8177(100, arg0, (Class71[]) null);
		@Pc(121) int local121 = arg9.method8178(100, arg0, (Class71[]) null, 0);
		@Pc(127) int local127 = local95 - local113 / 2;
		if (local127 >= -arg3.anInt10395 && local127 <= arg3.anInt10395 && -arg3.anInt10465 <= local106 && arg3.anInt10465 >= local106) {
			arg4.method9576(1, arg0, arg2, local113, local127 + arg10 + arg3.anInt10395 / 2, 0, 0, 50, arg7, arg5, 0, arg10, (int[]) null, arg3.anInt10465 / 2 + arg7 - local106 - arg6 - local121, (Class71[]) null);
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIILclient!ha;IIII)V")
	public static void method4428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class101 arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4) {
		arg2.method8061(arg4, arg1, -10660793, arg3, arg0);
		arg2.method8061(arg4 + 1, 16, -16777216, arg3 + 1, arg0 - 2);
		arg2.method8103(arg1 - 19, arg3 + 1, -16777216, arg4 + 18, arg0 - 2);
	}
}
