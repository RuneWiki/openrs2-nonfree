import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "[Lclient!fca;")
	public static Class108[] aClass108Array4;

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "Lclient!on;")
	public static final Class280 aClass280_4 = new Class280();

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IILclient!dga;B)V")
	public static void method2340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub7_Sub5 arg2) {
		if (!Static530.aBoolean556) {
			return;
		}
		@Pc(11) int local11 = 0;
		@Pc(25) int local25;
		for (@Pc(17) Class3_Sub7_Sub10 local17 = (Class3_Sub7_Sub10) arg2.aClass147_1.method3334(); local17 != null; local17 = (Class3_Sub7_Sub10) arg2.aClass147_1.method3332()) {
			local25 = Static499.method6809(local17);
			if (local25 > local11) {
				local11 = local25;
			}
		}
		if (-123 < -127) {
			method2342((Class145) null, (int[]) null, 29);
		}
		local11 += 8;
		local25 = arg2.anInt2315 * 16 + 21;
		Static558.anInt8545 = arg2.anInt2315 * 16 + (Static477.aBoolean508 ? 26 : 22);
		@Pc(81) int local81 = Static332.anInt5338 + Static123.anInt2492;
		if (Static681.anInt10652 < local81 + local11) {
			local81 = Static123.anInt2492 - local11;
		}
		if (local81 < 0) {
			local81 = 0;
		}
		@Pc(102) int local102 = Static477.aBoolean508 ? 33 : 31;
		@Pc(109) int local109 = arg1 + 13 - local102;
		if (Static76.anInt1720 < local25 + local109) {
			local109 = Static76.anInt1720 - local25;
		}
		if (local109 < 0) {
			local109 = 0;
		}
		Static440.anInt6770 = local81;
		Static225.anInt3682 = local109;
		Static331.anInt5337 = local11;
		Static15.aClass3_Sub7_Sub5_1 = arg2;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)Lclient!lu;")
	public static Class238_Sub1 method2341(@OriginalArg(0) int arg0) {
		return Static303.aBoolean319 && Static711.anInt11000 <= arg0 && Static42.anInt1246 >= arg0 ? Static612.aClass238_Sub1Array2[arg0 - Static711.anInt11000] : null;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZLclient!gt;[II)Lclient!va;")
	public static Class384 method2342(@OriginalArg(1) Class145 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int[] local7 = null;
		@Pc(9) int[] local9 = null;
		@Pc(18) int[] local18 = null;
		@Pc(20) float[][] local20 = null;
		if (arg0.aByteArray30 != null) {
			@Pc(26) int local26 = arg0.anInt3629;
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
			local18 = new int[local26];
			local9 = new int[local26];
			local7 = new int[local26];
			@Pc(101) int local101;
			@Pc(156) int local156;
			for (@Pc(93) int local93 = 0; local93 < arg2; local93++) {
				local101 = arg1[local93];
				if (arg0.aByteArray30[local101] != -1) {
					@Pc(114) int local114 = arg0.aByteArray30[local101] & 0xFF;
					for (@Pc(116) int local116 = 0; local116 < 3; local116++) {
						@Pc(127) short local127;
						if (local116 == 0) {
							local127 = arg0.aShortArray30[local101];
						} else if (local116 == 1) {
							local127 = arg0.aShortArray33[local101];
						} else {
							local127 = arg0.aShortArray36[local101];
						}
						@Pc(151) int local151 = arg0.anIntArray253[local127];
						local156 = arg0.anIntArray257[local127];
						@Pc(161) int local161 = arg0.anIntArray251[local127];
						if (local151 < local29[local114]) {
							local29[local114] = local151;
						}
						if (local32[local114] < local151) {
							local32[local114] = local151;
						}
						if (local35[local114] > local156) {
							local35[local114] = local156;
						}
						if (local38[local114] < local156) {
							local38[local114] = local156;
						}
						if (local161 < local41[local114]) {
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
				@Pc(267) byte local267 = arg0.aByteArray31[local101];
				if (local267 > 0) {
					local7[local101] = (local32[local101] + local29[local101]) / 2;
					local9[local101] = (local38[local101] + local35[local101]) / 2;
					local18[local101] = (local41[local101] + local44[local101]) / 2;
					@Pc(337) float local337;
					@Pc(329) float local329;
					@Pc(345) float local345;
					if (local267 == 1) {
						local156 = arg0.anIntArray252[local101];
						local329 = 64.0F / (float) arg0.anIntArray254[local101];
						if (local156 == 0) {
							local345 = 1.0F;
							local337 = 1.0F;
						} else if (local156 > 0) {
							local337 = 1.0F;
							local345 = (float) local156 / 1024.0F;
						} else {
							local337 = (float) -local156 / 1024.0F;
							local345 = 1.0F;
						}
					} else if (local267 == 2) {
						local329 = 64.0F / (float) arg0.anIntArray254[local101];
						local337 = 64.0F / (float) arg0.anIntArray252[local101];
						local345 = 64.0F / (float) arg0.anIntArray255[local101];
					} else {
						local329 = (float) arg0.anIntArray254[local101] / 1024.0F;
						local337 = (float) arg0.anIntArray252[local101] / 1024.0F;
						local345 = (float) arg0.anIntArray255[local101] / 1024.0F;
					}
					local20[local101] = Static151.method2499(local345, arg0.aShortArray37[local101], local337, arg0.aShortArray31[local101], arg0.aByteArray32[local101] & 0xFF, arg0.aShortArray34[local101], local329);
				}
			}
		}
		return new Class384(local7, local9, local18, local20);
	}
}
