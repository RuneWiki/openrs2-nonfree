import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!jr", name = "w", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_57 = new Class61(38, -1);

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(III[FIIIFII)V")
	public static void method4261(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg8 - arg7;
		@Pc(13) int local13 = arg3 - arg4;
		@Pc(17) int local17 = arg1 - arg5;
		@Pc(38) float local38 = arg2[1] * (float) local17 + (float) local13 * arg2[0] + arg2[2] * (float) local9;
		@Pc(59) float local59 = (float) local9 * arg2[5] + arg2[3] * (float) local13 + arg2[4] * (float) local17;
		@Pc(80) float local80 = (float) local9 * arg2[8] + (float) local17 * arg2[7] + (float) local13 * arg2[6];
		@Pc(95) float local95 = (float) Math.sqrt((double) (local59 * local59 + local38 * local38 + local80 * local80));
		@Pc(106) float local106 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(119) float local119 = (float) Math.asin((double) (local59 / local95)) / 3.1415927F + arg6 + 0.5F;
		@Pc(124) float local124;
		if (arg0 == 1) {
			local124 = local106;
			local106 = -local119;
			local119 = local124;
		} else if (arg0 == 2) {
			local119 = -local119;
			local106 = -local106;
		} else if (arg0 == 3) {
			local124 = local106;
			local106 = local119;
			local119 = -local124;
		}
		Static453.aFloat153 = local119;
		Static407.aFloat143 = local106;
	}

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "(B)V")
	public static void method4262() {
		Static447.aClass223_51.method4932();
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(Z)[Lclient!qw;")
	public static Class284[] method4264() {
		return new Class284[] { Static498.aClass284_23, Static270.aClass284_13, Static28.aClass284_2, Static23.aClass284_1, Static275.aClass284_14, Static398.aClass284_18, Static143.aClass284_8, Static178.aClass284_9, Static576.aClass284_27, Static34.aClass284_25, Static555.aClass284_26, Static243.aClass284_11, Static368.aClass284_16, Static498.aClass284_24, Static427.aClass284_21, Static56.aClass284_4 };
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lclient!dv;BIILclient!ba;IILclient!oa;IIIIIII)Lclient!ba;")
	public static Class9 method4265(@OriginalArg(0) Class77 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class9 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class66 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg3 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg0 != null) {
			local11 = arg0.method2295(false, -1, arg7) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(48) long local48 = ((long) arg10 << 32) + ((long) (arg2 + (arg8 << 16) + (arg4 << 24)) + ((long) arg9 << 48));
		@Pc(50) Class223 local50 = Static476.aClass223_57;
		@Pc(58) Class9 local58;
		synchronized (Static476.aClass223_57) {
			local58 = (Class9) Static476.aClass223_57.method4943(local48);
		}
		@Pc(152) int local152;
		@Pc(158) int local158;
		@Pc(164) int local164;
		@Pc(168) int local168;
		if (local58 == null || arg6.method6831(local58.h(), local11) != 0) {
			if (local58 != null) {
				local11 = arg6.method6818(local11, local58.h());
			}
			@Pc(85) byte local85;
			if (arg2 == 1) {
				local85 = 9;
			} else if (arg2 == 2) {
				local85 = 12;
			} else if (arg2 == 3) {
				local85 = 15;
			} else if (arg2 == 4) {
				local85 = 18;
			} else {
				local85 = 21;
			}
			@Pc(127) int[] local127 = new int[] { 64, 96, 128 };
			@Pc(145) Class266 local145 = new Class266(local85 * 3 + 1, local85 * 6 + -local85, 0);
			local152 = local145.method5844(0, 0, 0);
			@Pc(156) int[][] local156 = new int[3][local85];
			@Pc(170) int local170;
			@Pc(194) int local194;
			for (local158 = 0; local158 < 3; local158++) {
				local164 = local127[local158];
				local168 = local127[local158];
				for (local170 = 0; local170 < local85; local170++) {
					@Pc(178) int local178 = (local170 << 14) / local85;
					@Pc(186) int local186 = Class4_Sub11.anIntArray148[local178] * local164 >> 14;
					local194 = Class4_Sub11.anIntArray147[local178] * local168 >> 14;
					local156[local158][local170] = local145.method5844(local194, local186, 0);
				}
			}
			for (local164 = 0; local164 < 3; local164++) {
				local168 = (local164 * 256 + 128) / 3;
				local170 = 256 - local168;
				@Pc(249) byte local249 = (byte) (arg8 * local170 + local168 * arg4 >> 8);
				@Pc(294) short local294 = (short) ((local168 * (arg9 & 0xFC00) + (arg10 & 0xFC00) * local170 & 0xFC0000) + (local170 * (arg10 & 0x380) + local168 * (arg9 & 0x380) & 0x38000) + ((arg9 & 0x7F) * local168 + local170 * (arg10 & 0x7F) & 0x7F00) >> 8);
				for (local194 = 0; local194 < local85; local194++) {
					if (local164 == 0) {
						local145.method5848((short) -1, local156[0][(local194 + 1) % local85], local156[0][local194], local249, (byte) 1, (byte) -1, local152, local294);
					} else {
						local145.method5848((short) -1, local156[local164 - 1][(local194 + 1) % local85], local156[local164][(local194 + 1) % local85], local249, (byte) 1, (byte) -1, local156[local164 - 1][local194], local294);
						local145.method5848((short) -1, local156[local164][(local194 + 1) % local85], local156[local164][local194], local249, (byte) 1, (byte) -1, local156[local164 - 1][local194], local294);
					}
				}
			}
			local58 = arg6.method6779(local145, local11, Static474.anInt4410, 64, 768);
			@Pc(414) Class223 local414 = Static476.aClass223_57;
			synchronized (Static476.aClass223_57) {
				Static476.aClass223_57.method4938(local48, local58);
			}
		}
		@Pc(433) int local433 = (arg2 << 8) - 1;
		@Pc(436) int local436 = -local433;
		@Pc(439) int local439 = -local433;
		@Pc(441) int local441 = local433;
		local152 = local433;
		if (arg1 != 0) {
			if ((arg1 & 0x2) != 0) {
				local439 -= 512;
			}
			if ((arg1 & 0x1) != 0) {
				local152 = local433 + 512;
			}
			if ((arg1 & 0x8) != 0) {
				local436 -= 512;
			}
			if ((arg1 & 0x4) != 0) {
				local441 = local433 + 512;
			}
		}
		@Pc(474) int local474 = arg3.ha();
		local158 = arg3.M();
		local164 = arg3.LA();
		if (local158 > local441) {
			local158 = local441;
		}
		local168 = arg3.K();
		if (local474 < local436) {
			local474 = local436;
		}
		if (local439 > local164) {
			local164 = local439;
		}
		if (local168 > local152) {
			local168 = local152;
		}
		@Pc(529) Class4_Sub7_Sub19 local529 = null;
		if (arg0 != null) {
			@Pc(536) int local536 = arg0.anIntArray238[arg7];
			local529 = Static168.aClass327_2.method7324(local536 >> 16);
			arg7 = local536 & 0xFFFF;
		}
		if (local529 == null) {
			local58 = local58.method4006((byte) 3, local11, true);
			local58.l(local158 - local474 >> 1, 128, local168 - local164 >> 1);
			local58.m(local158 + local474 >> 1, 0, local164 + local168 >> 1);
		} else {
			local58 = local58.method4006((byte) 3, local11, true);
			local58.l(local158 - local474 >> 1, 128, local168 - local164 >> 1);
			local58.m(local474 + local158 >> 1, 0, local168 + local164 >> 1);
			local58.method4017(arg7, local529);
		}
		if (arg11 != 0) {
			local58.AA(arg11);
		}
		if (arg12 != 0) {
			local58.v(arg12);
		}
		if (arg5 != 0) {
			local58.m(0, arg5, 0);
		}
		return local58;
	}
}
