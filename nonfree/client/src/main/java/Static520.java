import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static520 {

	@OriginalMember(owner = "client!ul", name = "e", descriptor = "Lclient!lc;")
	public static final Class192 aClass192_4 = new Class192("LIVE", 0);

	@OriginalMember(owner = "client!ul", name = "q", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_165 = new Class254(80, 8);

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!fa;ILclient!ep;IJZIII)V")
	public static void method7610(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class93 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) long arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(13) int local13 = arg1 * arg1 + arg7 * arg7;
		if (arg4 < (long) local13) {
			return;
		}
		@Pc(33) int local33 = Math.min(arg2.anInt2777 / 2, arg2.anInt2738 / 2);
		if (local33 * local33 >= local13) {
			Static429.method6568(Static99.aClass66Array2[arg6], arg3, arg5, arg0, arg1, arg7, arg2);
			return;
		}
		local33 -= 10;
		@Pc(66) int local66;
		if (Static84.anInt1994 == 4) {
			local66 = (int) Static412.aFloat175 & 0x3FFF;
		} else {
			local66 = Static47.anInt1291 + (int) Static412.aFloat175 & 0x3FFF;
		}
		@Pc(79) int local79 = Class179.anIntArray756[local66];
		@Pc(83) int local83 = Class179.anIntArray757[local66];
		if (Static84.anInt1994 != 4) {
			local83 = local83 * 256 / (Static146.anInt8629 + 256);
			local79 = local79 * 256 / (Static146.anInt8629 + 256);
		}
		@Pc(115) int local115 = local79 * arg1 + local83 * arg7 >> 14;
		@Pc(125) int local125 = local83 * arg1 - arg7 * local79 >> 14;
		@Pc(131) double local131 = Math.atan2((double) local115, (double) local125);
		@Pc(138) int local138 = (int) (Math.sin(local131) * (double) local33);
		@Pc(145) int local145 = (int) ((double) local33 * Math.cos(local131));
		Static233.aClass66Array6[arg6].method8061((float) local138 + (float) arg2.anInt2777 / 2.0F + (float) arg5, (float) -local145 + (float) arg3 + (float) arg2.anInt2738 / 2.0F, 4096, (int) (-local131 / 6.283185307179586D * 65535.0D));
	}
}
