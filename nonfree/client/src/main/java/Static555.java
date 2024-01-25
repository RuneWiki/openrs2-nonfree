import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static555 {

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)I")
	public static int method7592() {
		return Static12.aClass124_1.method2777();
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(III)Z")
	public static boolean method7593(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "([IIBLclient!dc;)Lclient!uaa;")
	public static Class348 method7594(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class73 arg2) {
		@Pc(12) int[] local12 = null;
		@Pc(14) int[] local14 = null;
		@Pc(16) int[] local16 = null;
		@Pc(18) float[][] local18 = null;
		if (arg2.aByteArray12 != null) {
			@Pc(24) int local24 = arg2.anInt2034;
			@Pc(27) int[] local27 = new int[local24];
			@Pc(30) int[] local30 = new int[local24];
			@Pc(33) int[] local33 = new int[local24];
			@Pc(36) int[] local36 = new int[local24];
			@Pc(39) int[] local39 = new int[local24];
			@Pc(42) int[] local42 = new int[local24];
			for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
				local27[local44] = Integer.MAX_VALUE;
				local30[local44] = -2147483647;
				local33[local44] = Integer.MAX_VALUE;
				local36[local44] = -2147483647;
				local39[local44] = Integer.MAX_VALUE;
				local42[local44] = -2147483647;
			}
			local14 = new int[local24];
			local18 = new float[local24][];
			@Pc(88) int local88;
			@Pc(141) int local141;
			for (@Pc(82) int local82 = 0; local82 < arg1; local82++) {
				local88 = arg0[local82];
				if (arg2.aByteArray12[local88] != -1) {
					@Pc(101) int local101 = arg2.aByteArray12[local88] & 0xFF;
					for (@Pc(103) int local103 = 0; local103 < 3; local103++) {
						@Pc(112) short local112;
						if (local103 == 0) {
							local112 = arg2.aShortArray27[local88];
						} else if (local103 == 1) {
							local112 = arg2.aShortArray35[local88];
						} else {
							local112 = arg2.aShortArray33[local88];
						}
						@Pc(136) int local136 = arg2.anIntArray133[local112];
						local141 = arg2.anIntArray135[local112];
						@Pc(146) int local146 = arg2.anIntArray131[local112];
						if (local136 < local27[local101]) {
							local27[local101] = local136;
						}
						if (local136 > local30[local101]) {
							local30[local101] = local136;
						}
						if (local33[local101] > local141) {
							local33[local101] = local141;
						}
						if (local36[local101] < local141) {
							local36[local101] = local141;
						}
						if (local146 < local39[local101]) {
							local39[local101] = local146;
						}
						if (local146 > local42[local101]) {
							local42[local101] = local146;
						}
					}
				}
			}
			local16 = new int[local24];
			local12 = new int[local24];
			for (local88 = 0; local88 < local24; local88++) {
				@Pc(239) byte local239 = arg2.aByteArray14[local88];
				if (local239 > 0) {
					local12[local88] = (local30[local88] + local27[local88]) / 2;
					local14[local88] = (local33[local88] + local36[local88]) / 2;
					local16[local88] = (local39[local88] + local42[local88]) / 2;
					@Pc(294) float local294;
					@Pc(292) float local292;
					@Pc(323) float local323;
					if (local239 == 1) {
						local141 = arg2.anIntArray129[local88];
						if (local141 == 0) {
							local292 = 1.0F;
							local294 = 1.0F;
						} else if (local141 > 0) {
							local294 = 1.0F;
							local292 = (float) local141 / 1024.0F;
						} else {
							local294 = (float) -local141 / 1024.0F;
							local292 = 1.0F;
						}
						local323 = 64.0F / (float) arg2.anIntArray134[local88];
					} else if (local239 == 2) {
						local294 = 64.0F / (float) arg2.anIntArray129[local88];
						local323 = 64.0F / (float) arg2.anIntArray134[local88];
						local292 = 64.0F / (float) arg2.anIntArray136[local88];
					} else {
						local294 = (float) arg2.anIntArray129[local88] / 1024.0F;
						local292 = (float) arg2.anIntArray136[local88] / 1024.0F;
						local323 = (float) arg2.anIntArray134[local88] / 1024.0F;
					}
					local18[local88] = Static205.method3261(local294, arg2.aShortArray32[local88], arg2.aShortArray36[local88], arg2.aShortArray31[local88], local323, local292, arg2.aByteArray9[local88] & 0xFF);
				}
			}
		}
		return new Class348(local12, local14, local16, local18);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IILclient!ha;ILclient!kh;)V")
	public static void method7595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(4) Class208 arg3) {
		for (@Pc(11) int local11 = 63; local11 >= 0; local11--) {
			@Pc(29) int local29 = (local11 & 0x3F) << 10 | 0x380 | 0x3F;
			@Pc(37) int local37 = Static422.anIntArray448[Static231.method3710(local29) & 0xFFFF];
			arg2.aa(arg0, (arg3.anInt5630 * (63 - local11) >> 6) + arg1, arg3.anInt5639, (arg3.anInt5630 >> 6) + 1, local37, 0);
		}
	}
}
