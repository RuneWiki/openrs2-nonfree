import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!oi", name = "t", descriptor = "I")
	public static int anInt5311;

	@OriginalMember(owner = "client!oi", name = "n", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_164 = new Class214(14, 11);

	@OriginalMember(owner = "client!oi", name = "r", descriptor = "Lclient!ge;")
	public static final Class83 aClass83_34 = new Class83(4);

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IILclient!i;Lclient!tf;ILjava/lang/String;Lclient!ba;IIILclient!gg;I)V")
	public static void method4433(@OriginalArg(0) int arg0, @OriginalArg(2) Class74 arg1, @OriginalArg(3) Class240 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) Class18 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class84 arg9, @OriginalArg(11) int arg10) {
		@Pc(13) int local13;
		if (Static275.anInt5173 == 4) {
			local13 = (int) Static322.aFloat82 & 0x3FFF;
		} else {
			local13 = (int) Static322.aFloat82 + Static53.anInt4624 & 0x3FFF;
		}
		@Pc(32) int local32 = Math.max(arg2.anInt6904 / 2, arg2.anInt6894 / 2) + 10;
		@Pc(40) int local40 = arg6 * arg6 + arg10 * arg10;
		if (local40 > local32 * local32) {
			return;
		}
		@Pc(50) int local50 = Class4_Sub13.anIntArray497[local13];
		@Pc(54) int local54 = Class4_Sub13.anIntArray496[local13];
		if (Static275.anInt5173 != 4) {
			local50 = local50 * 256 / (Static437.anInt7473 + 256);
			local54 = local54 * 256 / (Static437.anInt7473 + 256);
		}
		@Pc(85) int local85 = local54 * arg6 + arg10 * local50 >> 15;
		@Pc(95) int local95 = arg10 * local54 - arg6 * local50 >> 15;
		@Pc(102) int local102 = arg9.method2375(null, 100, arg4);
		@Pc(108) int local108 = local85 - local102 / 2;
		@Pc(116) int local116 = arg9.method2384(null, arg4);
		if (-arg2.anInt6904 <= local108 && local108 <= arg2.anInt6904 && -arg2.anInt6894 <= local95 && arg2.anInt6894 >= local95) {
			arg5.method5768(0, arg2.anInt6904 / 2 + local108 + arg8, 0, arg2.anInt6894 / 2 + arg7 - local116 - local95 - arg0, arg7, arg8, 50, arg1, arg3, null, local102, arg4, null);
		}
	}
}
