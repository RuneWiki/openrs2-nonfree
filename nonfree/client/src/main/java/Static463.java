import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static463 {

	@OriginalMember(owner = "client!wv", name = "I", descriptor = "Lclient!bi;")
	public static Class25 aClass25_185;

	@OriginalMember(owner = "client!wv", name = "O", descriptor = "Lclient!dp;")
	public static Class58 aClass58_3;

	@OriginalMember(owner = "client!wv", name = "P", descriptor = "[I")
	public static int[] anIntArray637;

	@OriginalMember(owner = "client!wv", name = "Q", descriptor = "Lclient!nj;")
	public static Class181 aClass181_53;

	@OriginalMember(owner = "client!wv", name = "L", descriptor = "[I")
	public static final int[] anIntArray636 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!wv", name = "M", descriptor = "Lclient!nj;")
	public static final Class181 aClass181_52 = new Class181();

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(BLclient!ta;IIIJIILclient!gi;)V")
	public static void method6279(@OriginalArg(1) Class102 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) long arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class93 arg7) {
		@Pc(24) int local24 = arg5 * arg5 + arg3 * arg3;
		if (arg4 < (long) local24) {
			return;
		}
		@Pc(44) int local44 = Math.min(arg7.anInt2436 / 2, arg7.anInt2495 / 2);
		if (local24 <= local44 * local44) {
			Static228.method4887(arg2, Static239.aClass41Array7[arg1], arg5, arg7, arg6, arg3, arg0);
			return;
		}
		local44 -= 10;
		@Pc(72) int local72;
		if (Static25.anInt7273 == 4) {
			local72 = (int) Static37.aFloat9 & 0x3FFF;
		} else {
			local72 = (int) Static37.aFloat9 + Static149.anInt7397 & 0x3FFF;
		}
		@Pc(85) int local85 = Class229.anIntArray537[local72];
		@Pc(89) int local89 = Class229.anIntArray536[local72];
		if (Static25.anInt7273 != 4) {
			local85 = local85 * 256 / (Static148.anInt2711 + 256);
			local89 = local89 * 256 / (Static148.anInt2711 + 256);
		}
		@Pc(118) int local118 = local85 * arg3 + local89 * arg5 >> 15;
		@Pc(129) int local129 = arg3 * local89 - arg5 * local85 >> 15;
		@Pc(135) double local135 = Math.atan2((double) local118, (double) local129);
		@Pc(142) int local142 = (int) (Math.sin(local135) * (double) local44);
		@Pc(149) int local149 = (int) (Math.cos(local135) * (double) local44);
		Static417.aClass41Array13[arg1].method6084((float) arg6 + (float) arg7.anInt2436 / 2.0F + (float) local142, (float) arg2 + (float) arg7.anInt2495 / 2.0F - (float) local149, 4096, (int) (-local135 / 6.283185307179586D * 65535.0D));
	}
}
