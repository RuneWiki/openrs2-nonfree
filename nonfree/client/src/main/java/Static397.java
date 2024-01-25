import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!pea", name = "yc", descriptor = "I")
	public static int anInt7106 = 0;

	@OriginalMember(owner = "client!pea", name = "Ec", descriptor = "Lclient!em;")
	public static final Class83 aClass83_146 = new Class83(52, -1);

	@OriginalMember(owner = "client!pea", name = "Fc", descriptor = "I")
	public static int anInt7112 = -1;

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(IIIIIIILclient!ls;ILclient!ls;)V")
	public static void method5700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) Class11_Sub1_Sub1_Sub3 arg5, @OriginalArg(9) Class11_Sub1_Sub1_Sub3 arg6) {
		@Pc(7) int local7 = arg5.method6076();
		if (local7 == -1) {
			return;
		}
		@Pc(21) Class5 local21 = (Class5) Static118.aClass207_8.method4390((long) local7);
		if (local21 == null) {
			@Pc(32) Class282[] local32 = Static604.method6020(Static121.aClass308_48, local7);
			if (local32 == null) {
				return;
			}
			local21 = Static31.aClass78_18.method6838(local32[0], true);
			Static118.aClass207_8.method4391((long) local7, local21);
		}
		Static264.method3878(arg6.aByte113, arg4 >> 1, 0, arg6.anInt8906, arg6.method6058() * 256, arg6.anInt8902, arg0 >> 1);
		@Pc(78) int local78 = Static70.anIntArray59[0] + arg2 - 18;
		@Pc(86) int local86 = local78 + arg1 / 4 * 18;
		@Pc(96) int local96 = Static70.anIntArray59[1] + arg3 - 54 - 16;
		@Pc(104) int local104 = local96 + arg1 % 4 * 18;
		local21.method7795(local86, local104);
		if (arg5 == arg6) {
			Static31.aClass78_18.method6779(local104 - 1, -256, local86 - 1, 18, 18);
		}
		@Pc(126) Class11_Sub6 local126 = Static57.method963();
		local126.aClass11_Sub1_Sub1_Sub3_1 = arg5;
		local126.anInt4094 = local86;
		local126.anInt4098 = local86 + 16;
		local126.anInt4096 = local104 + 16;
		local126.anInt4097 = local104;
		Static312.aClass196_4.method4032(local126);
	}
}
