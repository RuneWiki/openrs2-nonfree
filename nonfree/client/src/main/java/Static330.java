import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!qe", name = "v", descriptor = "[Lclient!ch;")
	public static Class38[] aClass38Array1;

	@OriginalMember(owner = "client!qe", name = "u", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_139 = new Class25(74, 8);

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILclient!gi;ZILclient!ta;ILjava/lang/String;Lclient!la;IIILclient!aq;)V")
	public static void method4704(@OriginalArg(0) int arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class102 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) Class14 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class15 arg10) {
		@Pc(11) int local11;
		if (Static25.anInt7273 == 4) {
			local11 = (int) Static37.aFloat9 & 0x3FFF;
		} else {
			local11 = (int) Static37.aFloat9 + Static149.anInt7397 & 0x3FFF;
		}
		@Pc(33) int local33 = Math.max(arg1.anInt2436 / 2, arg1.anInt2495 / 2) + 10;
		@Pc(42) int local42 = arg2 * arg2 + arg0 * arg0;
		if (local42 > local33 * local33) {
			return;
		}
		@Pc(68) int local68 = Class229.anIntArray537[local11];
		@Pc(72) int local72 = Class229.anIntArray536[local11];
		if (Static25.anInt7273 != 4) {
			local72 = local72 * 256 / (Static148.anInt2711 + 256);
			local68 = local68 * 256 / (Static148.anInt2711 + 256);
		}
		@Pc(104) int local104 = arg0 * local68 + arg2 * local72 >> 15;
		@Pc(114) int local114 = local72 * arg0 - arg2 * local68 >> 15;
		@Pc(121) int local121 = arg10.method322(null, 100, arg5);
		@Pc(127) int local127 = local104 - local121 / 2;
		@Pc(135) int local135 = arg10.method321(arg5, null);
		if (local127 >= -arg1.anInt2436 && local127 <= arg1.anInt2436 && -arg1.anInt2495 <= local114 && local114 <= arg1.anInt2495) {
			arg6.method4891(50, arg9, local121, arg1.anInt2436 / 2 + arg7 + local127, arg3, 0, null, 0, null, arg5, arg1.anInt2495 / 2 + arg4 - local114 - arg8 - local135, arg7, arg4);
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIB)Z")
	public static boolean method4706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10) != 0;
	}
}
