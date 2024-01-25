import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!ib", name = "u", descriptor = "Lclient!ffa;")
	public static Class115 aClass115_2;

	@OriginalMember(owner = "client!ib", name = "v", descriptor = "Z")
	public static boolean aBoolean271 = false;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)Z")
	public static boolean method3443(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)S")
	public static short method3445(@OriginalArg(1) int arg0) {
		@Pc(14) int local14 = arg0 >> 10 & 0x3F;
		@Pc(20) int local20 = arg0 >> 3 & 0x70;
		@Pc(24) int local24 = arg0 & 0x7F;
		@Pc(41) int local41 = local24 > 64 ? local20 * (127 - local24) >> 7 : local24 * local20 >> 7;
		@Pc(46) int local46 = local24 + local41;
		@Pc(52) int local52;
		if (local46 == 0) {
			local52 = local41 << 1;
		} else {
			local52 = (local41 << 8) / local46;
		}
		return (short) (local14 << 10 | local52 >> 4 << 7 | local46);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILclient!li;IIIILclient!li;III)V")
	public static void method3446(@OriginalArg(1) Class41_Sub1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class41_Sub1_Sub1_Sub3 arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		@Pc(7) int local7 = arg4.method7913();
		if (local7 == -1) {
			return;
		}
		@Pc(21) Class59 local21 = (Class59) Static301.aClass265_28.method6577((long) local7);
		if (local21 == null) {
			@Pc(28) Class301[] local28 = Static684.method7227(Static471.aClass50_136, local7);
			if (local28 == null) {
				return;
			}
			local21 = Static563.aClass143_13.method6247(local28[0], true);
			Static301.aClass265_28.method6566(local21, (long) local7);
		}
		Static345.method5208(arg5 >> 1, arg0.method7917() * 256, arg0.anInt10366, arg0.aByte149, arg2 >> 1, 0, arg0.anInt10367);
		@Pc(88) int local88 = arg1 + Static340.anIntArray352[0] - 18;
		@Pc(98) int local98 = Static340.anIntArray352[1] + arg3 - 54 - 16;
		@Pc(106) int local106 = local88 + arg6 / 4 * 18;
		@Pc(114) int local114 = local98 + arg6 % 4 * 18;
		local21.method8057(local106, local114);
		if (arg4 == arg0) {
			Static563.aClass143_13.method6235(local114 - 1, 18, 18, -256, local106 - 1);
		}
		Static430.method7439(local114 - 1, local114 - -18, local106 - 1, local106 - -18);
		@Pc(150) Class41_Sub2 local150 = Static640.method8470();
		local150.anInt1407 = local114;
		local150.aClass41_Sub1_Sub1_Sub3_1 = arg4;
		local150.anInt1406 = local114 + 16;
		local150.anInt1404 = local106 + 16;
		local150.anInt1409 = local106;
		Static447.aClass102_6.method2055(local150);
	}
}
