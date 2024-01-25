import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "Lclient!re;")
	public static final Class250 aClass250_1 = new Class250("runescape", 0);

	@OriginalMember(owner = "client!cv", name = "d", descriptor = "Lclient!ui;")
	public static Class295 aClass295_8 = new Class295();

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(FIFIIIZ[FIII)V")
	public static void method1698(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) float[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg5 - arg9;
		@Pc(9) int local9 = arg1 - arg8;
		@Pc(13) int local13 = arg3 - arg4;
		@Pc(38) float local38 = (float) local5 * arg6[2] + (float) local13 * arg6[0] + (float) local9 * arg6[1];
		@Pc(59) float local59 = (float) local5 * arg6[5] + (float) local9 * arg6[4] + arg6[3] * (float) local13;
		@Pc(80) float local80 = arg6[8] * (float) local5 + arg6[6] * (float) local13 + arg6[7] * (float) local9;
		@Pc(106) float local106 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg0 != 1.0F) {
			local106 *= arg0;
		}
		@Pc(120) float local120 = local59 + arg2 + 0.5F;
		@Pc(125) float local125;
		if (arg7 == 1) {
			local125 = local106;
			local106 = -local120;
			local120 = local125;
		} else if (arg7 == 2) {
			local106 = -local106;
			local120 = -local120;
		} else if (arg7 == 3) {
			local125 = local106;
			local106 = local120;
			local120 = -local125;
		}
		Static403.aFloat144 = local120;
		Static183.aFloat80 = local106;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(ILclient!pq;)[Lclient!sn;")
	public static Class270[] method1699(@OriginalArg(1) Class229 arg0) {
		if (!arg0.method6064()) {
			return new Class270[0];
		}
		@Pc(16) Class311 local16 = arg0.method6067();
		while (local16.anInt9169 == 0) {
			Static265.method3147(10L);
		}
		if (local16.anInt9169 == 2) {
			return new Class270[0];
		}
		@Pc(35) int[] local35 = (int[]) local16.anObject17;
		@Pc(41) Class270[] local41 = new Class270[local35.length >> 2];
		for (@Pc(43) int local43 = 0; local43 < local41.length; local43++) {
			@Pc(49) Class270 local49 = new Class270();
			local41[local43] = local49;
			local49.anInt7897 = local35[local43 << 2];
			local49.anInt7894 = local35[(local43 << 2) + 1];
			local49.anInt7899 = local35[(local43 << 2) + 2];
			local49.anInt7895 = local35[(local43 << 2) + 3];
		}
		return local41;
	}
}
