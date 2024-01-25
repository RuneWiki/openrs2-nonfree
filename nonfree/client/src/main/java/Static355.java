import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
	public static int anInt6834 = 0;

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
	public static int anInt6836 = 0;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIIIIIB)V")
	public static void method5609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 == arg4 && arg8 == arg6 && arg7 == arg3 && arg5 == arg1) {
			Static236.method4343(arg1, arg0, arg3, arg2, arg8);
			return;
		}
		@Pc(40) int local40 = arg2;
		@Pc(42) int local42 = arg8;
		@Pc(46) int local46 = arg2 * 3;
		@Pc(50) int local50 = arg8 * 3;
		@Pc(54) int local54 = arg4 * 3;
		@Pc(58) int local58 = arg6 * 3;
		@Pc(62) int local62 = arg7 * 3;
		@Pc(66) int local66 = arg5 * 3;
		@Pc(76) int local76 = local54 + arg3 - local62 - arg2;
		@Pc(85) int local85 = arg1 + local58 - arg8 - local66;
		@Pc(95) int local95 = local46 + local62 - local54 - local54;
		@Pc(105) int local105 = local66 + local50 - local58 - local58;
		@Pc(110) int local110 = local54 - local46;
		@Pc(115) int local115 = local58 - local50;
		for (@Pc(117) int local117 = 128; local117 <= 4096; local117 += 128) {
			@Pc(125) int local125 = local117 * local117 >> 12;
			@Pc(131) int local131 = local117 * local125 >> 12;
			@Pc(135) int local135 = local131 * local76;
			@Pc(139) int local139 = local85 * local131;
			@Pc(143) int local143 = local125 * local95;
			@Pc(147) int local147 = local105 * local125;
			@Pc(151) int local151 = local117 * local110;
			@Pc(155) int local155 = local115 * local117;
			@Pc(167) int local167 = arg2 + (local151 + local135 + local143 >> 12);
			@Pc(178) int local178 = arg8 + (local155 + local147 + local139 >> 12);
			Static236.method4343(local178, arg0, local167, local40, local42);
			local42 = local178;
			local40 = local167;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IB)I")
	public static int method5610(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local14 > local23) {
			local32 = local23;
		}
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local23 > local14) {
			local46 = local23;
		}
		if (local46 < local30) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local46 + local32) / 2.0D;
		if (local46 != local32) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local46 + local32);
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local46 - local32);
			}
			if (local46 == local14) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local46 == local23) {
				local60 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local30 == local46) {
				local60 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
		}
		local60 /= 6.0D;
		@Pc(160) int local160 = (int) (local60 * 256.0D);
		@Pc(165) int local165 = (int) (local62 * 256.0D);
		@Pc(170) int local170 = (int) (local68 * 256.0D);
		if (local165 < 0) {
			local165 = 0;
		} else if (local165 > 255) {
			local165 = 255;
		}
		if (local170 < 0) {
			local170 = 0;
		} else if (local170 > 255) {
			local170 = 255;
		}
		if (local170 > 243) {
			local165 >>= 0x4;
		} else if (local170 > 217) {
			local165 >>= 0x3;
		} else if (local170 > 192) {
			local165 >>= 0x2;
		} else if (local170 > 179) {
			local165 >>= 0x1;
		}
		return (local170 >> 1) + (local165 >> 5 << 7) + ((local160 >> 2 & 0x3F) << 10);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIBII)V")
	public static void method5611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		for (@Pc(10) Class15_Sub9 local10 = (Class15_Sub9) Static330.aClass123_6.method3537(); local10 != null; local10 = (Class15_Sub9) Static330.aClass123_6.method3541()) {
			if (local10.anInt9014 <= Static435.anInt8192) {
				local10.method8314();
			} else {
				Static10.method133(arg2 >> 1, arg3 >> 1, (local10.anInt9012 << 9) + 256, local10.anInt9007 * 2, local10.anInt9010, (local10.anInt9006 << 9) + 256);
				Static206.aClass27_20.method7002(0, local10.anInt9011 | 0xFF000000, local10.aString92, arg0 + Static390.anIntArray410[0], Static390.anIntArray410[1] + arg1);
			}
		}
	}
}
