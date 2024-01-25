import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!ku", name = "i", descriptor = "Lclient!hb;")
	public static final Class146 aClass146_5 = new Class146();

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IIIB)I")
	public static int method4820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg2 / arg0;
		@Pc(13) int local13 = arg2 & arg0 - 1;
		@Pc(17) int local17 = arg1 / arg0;
		@Pc(30) int local30 = arg0 - 1 & arg1;
		@Pc(35) int local35 = Static392.method5833(local17, local7);
		@Pc(42) int local42 = Static392.method5833(local17, local7 + 1);
		@Pc(49) int local49 = Static392.method5833(local17 + 1, local7);
		@Pc(58) int local58 = Static392.method5833(local17 + 1, local7 + 1);
		@Pc(65) int local65 = Static721.method9620(local13, local42, local35, arg0);
		@Pc(72) int local72 = Static721.method9620(local13, local58, local49, arg0);
		return Static721.method9620(local30, local72, local65, arg0);
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(II[ILclient!ln;)Lclient!ui;")
	public static Class369 method4823(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class229 arg2) {
		@Pc(7) int[] local7 = null;
		@Pc(9) int[] local9 = null;
		@Pc(11) int[] local11 = null;
		@Pc(20) float[][] local20 = null;
		if (arg2.aByteArray77 != null) {
			@Pc(26) int local26 = arg2.anInt5946;
			@Pc(29) int[] local29 = new int[local26];
			@Pc(32) int[] local32 = new int[local26];
			@Pc(35) int[] local35 = new int[local26];
			@Pc(38) int[] local38 = new int[local26];
			@Pc(41) int[] local41 = new int[local26];
			@Pc(44) int[] local44 = new int[local26];
			for (@Pc(46) int local46 = 0; local46 < local26; local46++) {
				local29[local46] = Integer.MAX_VALUE;
				local32[local46] = -2147483647;
				local35[local46] = Integer.MAX_VALUE;
				local38[local46] = -2147483647;
				local41[local46] = Integer.MAX_VALUE;
				local44[local46] = -2147483647;
			}
			local7 = new int[local26];
			local20 = new float[local26][];
			local9 = new int[local26];
			@Pc(105) int local105;
			@Pc(166) int local166;
			for (@Pc(97) int local97 = 0; local97 < arg0; local97++) {
				local105 = arg1[local97];
				if (arg2.aByteArray77[local105] != -1) {
					@Pc(119) int local119 = arg2.aByteArray77[local105] & 0xFF;
					for (@Pc(121) int local121 = 0; local121 < 3; local121++) {
						@Pc(142) short local142;
						if (local121 == 0) {
							local142 = arg2.aShortArray102[local105];
						} else if (local121 == 1) {
							local142 = arg2.aShortArray95[local105];
						} else {
							local142 = arg2.aShortArray98[local105];
						}
						@Pc(161) int local161 = arg2.anIntArray394[local142];
						local166 = arg2.anIntArray392[local142];
						@Pc(171) int local171 = arg2.anIntArray396[local142];
						if (local161 < local29[local119]) {
							local29[local119] = local161;
						}
						if (local32[local119] < local161) {
							local32[local119] = local161;
						}
						if (local166 < local35[local119]) {
							local35[local119] = local166;
						}
						if (local166 > local38[local119]) {
							local38[local119] = local166;
						}
						if (local41[local119] > local171) {
							local41[local119] = local171;
						}
						if (local44[local119] < local171) {
							local44[local119] = local171;
						}
					}
				}
			}
			local11 = new int[local26];
			for (local105 = 0; local105 < local26; local105++) {
				@Pc(277) byte local277 = arg2.aByteArray82[local105];
				if (local277 > 0) {
					local7[local105] = (local32[local105] + local29[local105]) / 2;
					local9[local105] = (local38[local105] + local35[local105]) / 2;
					local11[local105] = (local44[local105] + local41[local105]) / 2;
					@Pc(340) float local340;
					@Pc(333) float local333;
					@Pc(342) float local342;
					if (local277 == 1) {
						local166 = arg2.anIntArray399[local105];
						local333 = 64.0F / (float) arg2.anIntArray402[local105];
						if (local166 == 0) {
							local340 = 1.0F;
							local342 = 1.0F;
						} else if (local166 <= 0) {
							local342 = 1.0F;
							local340 = (float) -local166 / 1024.0F;
						} else {
							local342 = (float) local166 / 1024.0F;
							local340 = 1.0F;
						}
					} else if (local277 == 2) {
						local342 = 64.0F / (float) arg2.anIntArray398[local105];
						local340 = 64.0F / (float) arg2.anIntArray399[local105];
						local333 = 64.0F / (float) arg2.anIntArray402[local105];
					} else {
						local333 = (float) arg2.anIntArray402[local105] / 1024.0F;
						local342 = (float) arg2.anIntArray398[local105] / 1024.0F;
						local340 = (float) arg2.anIntArray399[local105] / 1024.0F;
					}
					local20[local105] = Static684.method9214(local333, arg2.aByteArray81[local105] & 0xFF, local340, arg2.aShortArray96[local105], arg2.aShortArray94[local105], local342, arg2.aShortArray101[local105]);
				}
			}
		}
		return new Class369(local7, local9, local11, local20);
	}
}
