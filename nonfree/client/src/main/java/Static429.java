import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static429 {

	@OriginalMember(owner = "client!qv", name = "f", descriptor = "I")
	public static int anInt7863;

	@OriginalMember(owner = "client!qv", name = "g", descriptor = "I")
	public static int anInt7864;

	@OriginalMember(owner = "client!qv", name = "b", descriptor = "[Z")
	public static final boolean[] aBooleanArray27 = new boolean[100];

	@OriginalMember(owner = "client!qv", name = "i", descriptor = "[I")
	public static final int[] anIntArray566 = new int[] { 3, 7, 15 };

	@OriginalMember(owner = "client!qv", name = "j", descriptor = "[I")
	public static int[] anIntArray567 = new int[2];

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lclient!xa;IILclient!fa;IIILclient!ep;)V")
	public static void method6568(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class93 arg6) {
		if (arg0 == null) {
			return;
		}
		@Pc(14) int local14;
		if (Static84.anInt1994 == 4) {
			local14 = (int) Static412.aFloat175 & 0x3FFF;
		} else {
			local14 = (int) Static412.aFloat175 + Static47.anInt1291 & 0x3FFF;
		}
		@Pc(35) int local35 = Math.max(arg6.anInt2777 / 2, arg6.anInt2738 / 2) + 10;
		@Pc(43) int local43 = arg5 * arg5 + arg4 * arg4;
		if (local35 * local35 < local43) {
			return;
		}
		@Pc(57) int local57 = Class179.anIntArray756[local14];
		@Pc(61) int local61 = Class179.anIntArray757[local14];
		if (Static84.anInt1994 != 4) {
			local57 = local57 * 256 / (Static146.anInt8629 + 256);
			local61 = local61 * 256 / (Static146.anInt8629 + 256);
		}
		@Pc(96) int local96 = local57 * arg4 + local61 * arg5 >> 14;
		@Pc(106) int local106 = local61 * arg4 - arg5 * local57 >> 14;
		arg0.method8063(arg2 + arg6.anInt2777 / 2 + local96 - arg0.AA() / 2, -local106 + arg1 + arg6.anInt2738 / 2 - arg0.a() / 2, arg3, arg2, arg1);
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(II[J[II)V")
	public static void method6570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long[] arg2, @OriginalArg(3) int[] arg3) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(18) int local18 = (arg1 + arg0) / 2;
		@Pc(20) int local20 = arg0;
		@Pc(24) long local24 = arg2[local18];
		arg2[local18] = arg2[arg1];
		arg2[arg1] = local24;
		@Pc(38) int local38 = arg3[local18];
		arg3[local18] = arg3[arg1];
		arg3[arg1] = local38;
		@Pc(56) int local56 = local24 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(58) int local58 = arg0; local58 < arg1; local58++) {
			if (local24 + (long) (local58 & local56) > arg2[local58]) {
				@Pc(76) long local76 = arg2[local58];
				arg2[local58] = arg2[local20];
				arg2[local20] = local76;
				@Pc(90) int local90 = arg3[local58];
				arg3[local58] = arg3[local20];
				arg3[local20++] = local90;
			}
		}
		arg2[arg1] = arg2[local20];
		arg2[local20] = local24;
		arg3[arg1] = arg3[local20];
		arg3[local20] = local38;
		method6570(arg0, local20 - 1, arg2, arg3);
		method6570(local20 + 1, arg1, arg2, arg3);
	}
}
