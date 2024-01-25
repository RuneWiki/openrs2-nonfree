import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "I")
	public static int anInt8688;

	@OriginalMember(owner = "client!gs", name = "e", descriptor = "Lclient!pe;")
	public static Class254 aClass254_118;

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "Lclient!ft;")
	public static final Class110 aClass110_35 = new Class110(10, 3);

	@OriginalMember(owner = "client!gs", name = "f", descriptor = "Lclient!gaa;")
	public static final Class112 aClass112_19 = new Class112();

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIIIIIIILclient!wk;Lclient!wk;)V")
	public static void method7111(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) Class2_Sub2_Sub1 arg5, @OriginalArg(9) Class2_Sub2_Sub1 arg6) {
		@Pc(7) int local7 = arg5.method6300();
		if (local7 == -1) {
			return;
		}
		@Pc(20) Class37 local20 = (Class37) Static531.aClass211_62.method5534((long) local7);
		if (local20 == null) {
			@Pc(27) Class20[] local27 = Static599.method813(Static579.aClass254_137, local7);
			if (local27 == null) {
				return;
			}
			local20 = Static546.aClass15_16.method5275(local27[0], true);
			Static531.aClass211_62.method5529((long) local7, local20);
		}
		Static415.method6705(0, arg6.method6311() * 256, arg3 >> 1, arg6.anInt9398, arg0 >> 1, arg6.aByte103, arg6.anInt9396);
		@Pc(73) int local73 = arg1 + Static580.anIntArray664[0] - 18;
		@Pc(81) int local81 = local73 + arg2 / 4 * 18;
		@Pc(91) int local91 = Static580.anIntArray664[1] + arg4 - 54 - 16;
		@Pc(99) int local99 = local91 + arg2 % 4 * 18;
		local20.method7076(local81, local99);
		if (arg5 == arg6) {
			Static546.aClass15_16.method5300(18, -256, local81 - 1, 18, local99 - 1);
		}
		@Pc(121) Class55_Sub1 local121 = Static281.method4847();
		local121.anInt1898 = local99 + 16;
		local121.anInt1899 = local81;
		local121.anInt1900 = local99;
		local121.anInt1896 = local81 + 16;
		local121.aClass2_Sub2_Sub1_1 = arg5;
		Static220.aClass134_6.method3236(local121);
	}
}
