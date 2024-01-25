import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!jw", name = "g", descriptor = "Lclient!mca;")
	public static Class230 aClass230_3;

	@OriginalMember(owner = "client!jw", name = "d", descriptor = "I")
	public static int anInt5121;

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "J")
	public static long aLong158 = 0L;

	@OriginalMember(owner = "client!jw", name = "h", descriptor = "Lclient!el;")
	public static final Class109 aClass109_115 = new Class109(22, 6);

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(BZ)V")
	public static void method4358(@OriginalArg(1) boolean arg0) {
		Static250.method3677(Static390.anInt6669, Static70.anInt1125, Static631.anInt10283, arg0);
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "([BIB)[B")
	public static byte[] method4359(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(14) byte[] local14 = new byte[arg1];
		Static682.method799(arg0, 0, local14, 0, arg1);
		return local14;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "([IIILclient!ju;)Lclient!taa;")
	public static Class330 method4360(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class192 arg2) {
		@Pc(14) int[] local14 = null;
		@Pc(16) int[] local16 = null;
		@Pc(18) int[] local18 = null;
		@Pc(20) float[][] local20 = null;
		if (arg2.aByteArray41 != null) {
			@Pc(26) int local26 = arg2.anInt5082;
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
			local14 = new int[local26];
			local18 = new int[local26];
			local16 = new int[local26];
			@Pc(101) int local101;
			@Pc(156) int local156;
			for (@Pc(93) int local93 = 0; local93 < arg1; local93++) {
				local101 = arg0[local93];
				if (arg2.aByteArray41[local101] != -1) {
					@Pc(114) int local114 = arg2.aByteArray41[local101] & 0xFF;
					for (@Pc(116) int local116 = 0; local116 < 3; local116++) {
						@Pc(132) short local132;
						if (local116 == 0) {
							local132 = arg2.aShortArray72[local101];
						} else if (local116 == 1) {
							local132 = arg2.aShortArray77[local101];
						} else {
							local132 = arg2.aShortArray69[local101];
						}
						@Pc(151) int local151 = arg2.anIntArray278[local132];
						local156 = arg2.anIntArray280[local132];
						@Pc(161) int local161 = arg2.anIntArray281[local132];
						if (local151 < local29[local114]) {
							local29[local114] = local151;
						}
						if (local32[local114] < local151) {
							local32[local114] = local151;
						}
						if (local156 < local35[local114]) {
							local35[local114] = local156;
						}
						if (local38[local114] < local156) {
							local38[local114] = local156;
						}
						if (local41[local114] > local161) {
							local41[local114] = local161;
						}
						if (local44[local114] < local161) {
							local44[local114] = local161;
						}
					}
				}
			}
			local20 = new float[local26][];
			for (local101 = 0; local101 < local26; local101++) {
				@Pc(269) byte local269 = arg2.aByteArray43[local101];
				if (local269 > 0) {
					local14[local101] = (local32[local101] + local29[local101]) / 2;
					local16[local101] = (local38[local101] + local35[local101]) / 2;
					local18[local101] = (local41[local101] + local44[local101]) / 2;
					@Pc(346) float local346;
					@Pc(330) float local330;
					@Pc(338) float local338;
					if (local269 == 1) {
						local156 = arg2.anIntArray279[local101];
						if (local156 == 0) {
							local330 = 1.0F;
							local346 = 1.0F;
						} else if (local156 <= 0) {
							local346 = (float) -local156 / 1024.0F;
							local330 = 1.0F;
						} else {
							local346 = 1.0F;
							local330 = (float) local156 / 1024.0F;
						}
						local338 = 64.0F / (float) arg2.anIntArray283[local101];
					} else if (local269 == 2) {
						local338 = 64.0F / (float) arg2.anIntArray283[local101];
						local346 = 64.0F / (float) arg2.anIntArray279[local101];
						local330 = 64.0F / (float) arg2.anIntArray277[local101];
					} else {
						local330 = (float) arg2.anIntArray277[local101] / 1024.0F;
						local338 = (float) arg2.anIntArray283[local101] / 1024.0F;
						local346 = (float) arg2.anIntArray279[local101] / 1024.0F;
					}
					local20[local101] = Static439.method6501(arg2.aShortArray70[local101], arg2.aShortArray73[local101], arg2.aShortArray75[local101], local338, local346, local330, arg2.aByteArray38[local101] & 0xFF);
				}
			}
		}
		return new Class330(local14, local16, local18, local20);
	}
}
