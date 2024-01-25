import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static539 {

	@OriginalMember(owner = "client!uo", name = "f", descriptor = "Lclient!mt;")
	public static final Class220 aClass220_21 = new Class220();

	@OriginalMember(owner = "client!uo", name = "g", descriptor = "Z")
	public static boolean aBoolean655 = false;

	@OriginalMember(owner = "client!uo", name = "i", descriptor = "I")
	public static int anInt8888 = -1;

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!he;IIIIIZLclient!he;II)V")
	public static void method7335(@OriginalArg(0) Class20_Sub2_Sub4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) Class20_Sub2_Sub4_Sub1 arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) int local7 = arg0.method5350();
		if (local7 == -1) {
			return;
		}
		@Pc(21) Class10 local21 = (Class10) Static595.aClass326_60.method7238((long) local7);
		if (local21 == null) {
			@Pc(28) Class318[] local28 = Static604.method7068(Static141.aClass111_32, local7);
			if (local28 == null) {
				return;
			}
			local21 = Static136.aClass12_8.method6434(local28[0], true);
			Static595.aClass326_60.method7236(local21, (long) local7);
		}
		Static484.method6766(0, arg4.method5349() * 256, arg4.anInt8795, arg4.aByte116, arg2 >> 1, arg4.anInt8796, arg5 >> 1);
		@Pc(75) int local75 = arg1 + Static480.anIntArray537[0] - 18;
		@Pc(86) int local86 = arg3 + Static480.anIntArray537[1] - 54 - 16;
		@Pc(94) int local94 = local75 + arg6 / 4 * 18;
		@Pc(102) int local102 = local86 + arg6 % 4 * 18;
		local21.method7679(local94, local102);
		if (arg4 == arg0) {
			Static136.aClass12_8.method6456(local102 - 1, local94 - 1, 18, 18, -256);
		}
		@Pc(124) Class20_Sub6 local124 = Static496.method6924();
		local124.anInt4675 = local102 + 16;
		local124.anInt4673 = local94;
		local124.anInt4678 = local94 + 16;
		local124.aClass20_Sub2_Sub4_Sub1_1 = arg0;
		local124.anInt4674 = local102;
		Static334.aClass349_9.method7655(local124);
	}
}
