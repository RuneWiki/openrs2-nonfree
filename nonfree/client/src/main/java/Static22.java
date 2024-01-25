import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(BII)Z")
	public static boolean method343(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IILclient!aa;IILclient!mea;IIJ)V")
	public static void method344(@OriginalArg(0) int arg0, @OriginalArg(2) Class1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class230 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) long arg7) {
		@Pc(11) int local11 = arg3 * arg3 + arg0 * arg0;
		if (arg7 < (long) local11) {
			return;
		}
		@Pc(27) int local27 = Math.min(arg4.anInt6703 / 2, arg4.anInt6701 / 2);
		if (local27 * local27 >= local11) {
			Static236.method3562(arg5, arg4, arg3, Static347.aClass20Array7[arg2], arg1, arg0, arg6);
			return;
		}
		local27 -= 10;
		@Pc(51) int local51;
		if (Static378.anInt6935 == 4) {
			local51 = (int) Static543.aFloat228 & 0x3FFF;
		} else {
			local51 = Static470.anInt10171 + (int) Static543.aFloat228 & 0x3FFF;
		}
		@Pc(64) int local64 = Class32.anIntArray76[local51];
		@Pc(68) int local68 = Class32.anIntArray77[local51];
		if (Static378.anInt6935 != 4) {
			local68 = local68 * 256 / (Static422.anInt7593 + 256);
			local64 = local64 * 256 / (Static422.anInt7593 + 256);
		}
		@Pc(97) int local97 = local68 * arg3 + arg0 * local64 >> 14;
		@Pc(107) int local107 = local68 * arg0 - arg3 * local64 >> 14;
		@Pc(113) double local113 = Math.atan2((double) local97, (double) local107);
		@Pc(120) int local120 = (int) ((double) local27 * Math.sin(local113));
		@Pc(127) int local127 = (int) ((double) local27 * Math.cos(local113));
		Static53.aClass20Array2[arg2].method7416((float) arg4.anInt6703 / 2.0F + (float) arg5 + (float) local120, (float) -local127 + (float) arg6 + (float) arg4.anInt6701 / 2.0F, 4096, (int) (-local113 / 6.283185307179586D * 65535.0D));
	}
}
