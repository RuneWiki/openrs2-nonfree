import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!hv", name = "u", descriptor = "D")
	public static double aDouble71;

	@OriginalMember(owner = "client!hv", name = "v", descriptor = "[Lclient!oq;")
	public static Class2_Sub1[] aClass2_Sub1Array2;

	@OriginalMember(owner = "client!hv", name = "m", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_149 = new Class179(114, -1);

	@OriginalMember(owner = "client!hv", name = "r", descriptor = "Lclient!af;")
	public static final Class10 aClass10_18 = new Class10(50);

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIILclient!ha;IIIIIIILclient!laa;)V")
	public static void method3319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class132 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) Class6_Sub4_Sub10 arg10) {
		if (arg2 < arg5 && arg5 < arg7 + arg2 && arg4 - 13 < arg0 && arg0 < arg4 + 3) {
			arg8 = arg6;
		}
		@Pc(39) String local39 = Static666.method9034(arg10);
		Static51.aClass19_4.method6322(Static493.anIntArray540, arg2 + 3, arg4, arg8, Static24.aClass9Array7, local39);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(I[BII)I")
	public static int method3320(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = arg2; local9 < arg0; local9++) {
			local7 = local7 >>> 8 ^ Class381.anIntArray698[(local7 ^ arg1[local9]) & 0xFF];
		}
		return ~local7;
	}
}
