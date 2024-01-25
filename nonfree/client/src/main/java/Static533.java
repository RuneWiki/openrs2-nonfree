import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static533 {

	@OriginalMember(owner = "client!sw", name = "f", descriptor = "I")
	public static int anInt1376;

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_51 = new Class194(70, -1);

	@OriginalMember(owner = "client!sw", name = "d", descriptor = "[I")
	public static final int[] anIntArray99 = new int[250];

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(IJIILclient!uv;IBLclient!aa;I)V")
	public static void method1200(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class344 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7) {
		@Pc(13) int local13 = arg0 * arg0 + arg3 * arg3;
		if (arg1 < (long) local13) {
			return;
		}
		@Pc(33) int local33 = Math.min(arg4.anInt9546 / 2, arg4.anInt9602 / 2);
		if (local33 * local33 >= local13) {
			Static453.method6694(arg4, arg7, arg6, arg3, arg0, arg2, Static484.aClass103Array21[arg5]);
			return;
		}
		local33 -= 10;
		@Pc(49) int local49;
		if (Static471.anInt8064 == 4) {
			local49 = (int) Static170.aFloat71 & 0x3FFF;
		} else {
			local49 = Static579.anInt9458 + (int) Static170.aFloat71 & 0x3FFF;
		}
		@Pc(62) int local62 = Class3_Sub13.anIntArray147[local49];
		@Pc(66) int local66 = Class3_Sub13.anIntArray146[local49];
		if (Static471.anInt8064 != 4) {
			local66 = local66 * 256 / (Static296.anInt5883 + 256);
			local62 = local62 * 256 / (Static296.anInt5883 + 256);
		}
		@Pc(96) int local96 = arg3 * local62 + local66 * arg0 >> 14;
		@Pc(107) int local107 = local66 * arg3 - local62 * arg0 >> 14;
		@Pc(113) double local113 = Math.atan2((double) local96, (double) local107);
		@Pc(120) int local120 = (int) ((double) local33 * Math.sin(local113));
		@Pc(127) int local127 = (int) ((double) local33 * Math.cos(local113));
		Static585.aClass103Array24[arg5].method7450((float) local120 + (float) arg7 + (float) arg4.anInt9546 / 2.0F, (float) arg2 + (float) arg4.anInt9602 / 2.0F - (float) local127, 4096, (int) (-local113 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(IBIIIII)V")
	public static void method1202(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg1 - arg3;
		@Pc(13) int local13 = arg3 + arg0;
		for (@Pc(23) int local23 = arg0; local23 < local13; local23++) {
			Static82.method1400(arg2, arg5, arg4, Static71.anIntArrayArray5[local23]);
		}
		for (@Pc(39) int local39 = arg1; local39 > local9; local39--) {
			Static82.method1400(arg2, arg5, arg4, Static71.anIntArrayArray5[local39]);
		}
		@Pc(62) int local62 = arg4 - arg3;
		@Pc(67) int local67 = arg5 + arg3;
		for (@Pc(69) int local69 = local13; local69 <= local9; local69++) {
			@Pc(75) int[] local75 = Static71.anIntArrayArray5[local69];
			Static82.method1400(arg2, arg5, local67, local75);
			Static82.method1400(arg2, local62, arg4, local75);
		}
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(IB)I")
	public static int method1203(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(10) int local10 = local4 | local4 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(33) int local33 = local22 | local22 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}
}
