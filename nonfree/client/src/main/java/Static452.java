import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
	public static int anInt7800 = 0;

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
	public static int anInt7801 = 0;

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "Lclient!u;")
	public static final Class352 aClass352_7 = new Class352("WTQA", "office", "_qa", 2);

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(BI[ILclient!rha;)Lclient!ak;")
	public static Class18 method6947(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class316 arg2) {
		@Pc(7) int[] local7 = null;
		@Pc(16) int[] local16 = null;
		@Pc(18) int[] local18 = null;
		@Pc(20) float[][] local20 = null;
		if (arg2.aByteArray93 != null) {
			@Pc(26) int local26 = arg2.anInt8617;
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
			local18 = new int[local26];
			local20 = new float[local26][];
			@Pc(105) int local105;
			@Pc(164) int local164;
			for (@Pc(97) int local97 = 0; local97 < arg0; local97++) {
				local105 = arg1[local97];
				if (arg2.aByteArray93[local105] != -1) {
					@Pc(119) int local119 = arg2.aByteArray93[local105] & 0xFF;
					for (@Pc(121) int local121 = 0; local121 < 3; local121++) {
						@Pc(140) short local140;
						if (local121 == 0) {
							local140 = arg2.aShortArray131[local105];
						} else if (local121 == 1) {
							local140 = arg2.aShortArray125[local105];
						} else {
							local140 = arg2.aShortArray129[local105];
						}
						@Pc(159) int local159 = arg2.anIntArray570[local140];
						local164 = arg2.anIntArray575[local140];
						@Pc(169) int local169 = arg2.anIntArray574[local140];
						if (local29[local119] > local159) {
							local29[local119] = local159;
						}
						if (local159 > local32[local119]) {
							local32[local119] = local159;
						}
						if (local164 < local35[local119]) {
							local35[local119] = local164;
						}
						if (local164 > local38[local119]) {
							local38[local119] = local164;
						}
						if (local41[local119] > local169) {
							local41[local119] = local169;
						}
						if (local169 > local44[local119]) {
							local44[local119] = local169;
						}
					}
				}
			}
			local16 = new int[local26];
			for (local105 = 0; local105 < local26; local105++) {
				@Pc(281) byte local281 = arg2.aByteArray96[local105];
				if (local281 > 0) {
					local7[local105] = (local32[local105] + local29[local105]) / 2;
					local16[local105] = (local38[local105] + local35[local105]) / 2;
					local18[local105] = (local41[local105] + local44[local105]) / 2;
					@Pc(351) float local351;
					@Pc(340) float local340;
					@Pc(356) float local356;
					if (local281 == 1) {
						local164 = arg2.anIntArray571[local105];
						local340 = 64.0F / (float) arg2.anIntArray573[local105];
						if (local164 == 0) {
							local351 = 1.0F;
							local356 = 1.0F;
						} else if (local164 > 0) {
							local351 = 1.0F;
							local356 = (float) local164 / 1024.0F;
						} else {
							local356 = 1.0F;
							local351 = (float) -local164 / 1024.0F;
						}
					} else if (local281 == 2) {
						local351 = 64.0F / (float) arg2.anIntArray571[local105];
						local340 = 64.0F / (float) arg2.anIntArray573[local105];
						local356 = 64.0F / (float) arg2.anIntArray567[local105];
					} else {
						local340 = (float) arg2.anIntArray573[local105] / 1024.0F;
						local356 = (float) arg2.anIntArray567[local105] / 1024.0F;
						local351 = (float) arg2.anIntArray571[local105] / 1024.0F;
					}
					local20[local105] = Static319.method5023(arg2.aShortArray130[local105], local340, arg2.aByteArray95[local105] & 0xFF, local356, local351, arg2.aShortArray126[local105], arg2.aShortArray128[local105]);
				}
			}
		}
		return new Class18(local7, local16, local18, local20);
	}
}
