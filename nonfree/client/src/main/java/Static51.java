import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "Lclient!gba;")
	public static Class115 aClass115_1 = null;

	@OriginalMember(owner = "client!bw", name = "c", descriptor = "I")
	public static int anInt907 = 0;

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(IIIILclient!fa;Lclient!gba;IIJ)V")
	public static void method794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class98 arg4, @OriginalArg(5) Class115 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) long arg7) {
		@Pc(12) int local12 = arg2 * arg2 + arg3 * arg3;
		if (arg7 < (long) local12) {
			return;
		}
		@Pc(32) int local32 = Math.min(arg5.anInt3474 / 2, arg5.anInt3481 / 2);
		if (local12 <= local32 * local32) {
			Static283.method4483(arg4, arg1, arg3, arg2, arg5, Static294.aClass13Array19[arg0], arg6);
			return;
		}
		local32 -= 10;
		@Pc(46) int local46;
		if (Static555.anInt9335 == 4) {
			local46 = (int) Static477.aFloat164 & 0x3FFF;
		} else {
			local46 = (int) Static477.aFloat164 + Static402.anInt6978 & 0x3FFF;
		}
		@Pc(59) int local59 = Class4_Sub11.anIntArray148[local46];
		@Pc(63) int local63 = Class4_Sub11.anIntArray147[local46];
		if (Static555.anInt9335 != 4) {
			local63 = local63 * 256 / (Static380.anInt6751 + 256);
			local59 = local59 * 256 / (Static380.anInt6751 + 256);
		}
		@Pc(93) int local93 = arg3 * local59 + arg2 * local63 >> 14;
		@Pc(103) int local103 = arg3 * local63 - arg2 * local59 >> 14;
		@Pc(109) double local109 = Math.atan2((double) local93, (double) local103);
		@Pc(116) int local116 = (int) (Math.sin(local109) * (double) local32);
		@Pc(123) int local123 = (int) (Math.cos(local109) * (double) local32);
		Static362.aClass13Array22[arg0].method8018((float) local116 + (float) arg1 + (float) arg5.anInt3474 / 2.0F, (float) -local123 + (float) arg5.anInt3481 / 2.0F + (float) arg6, 4096, (int) (-local109 / 6.283185307179586D * 65535.0D));
	}
}
