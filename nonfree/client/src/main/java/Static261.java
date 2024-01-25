import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!jca", name = "g", descriptor = "I")
	public static int anInt4684;

	@OriginalMember(owner = "client!jca", name = "c", descriptor = "Lclient!lt;")
	public static final Class226 aClass226_12 = new Class226(8, 4);

	@OriginalMember(owner = "client!jca", name = "f", descriptor = "I")
	public static int anInt4685 = 0;

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIIIIIF[FIF[FIIF)V")
	public static void method4254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float arg8, @OriginalArg(10) float[] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) float arg12) {
		@Pc(9) int local9 = arg3 - arg0;
		@Pc(33) int local33 = arg4 - arg1;
		@Pc(37) int local37 = arg7 - arg2;
		@Pc(58) float local58 = (float) local9 * arg9[2] + arg9[0] * (float) local37 + arg9[1] * (float) local33;
		@Pc(79) float local79 = arg9[4] * (float) local33 + (float) local37 * arg9[3] + (float) local9 * arg9[5];
		@Pc(100) float local100 = (float) local9 * arg9[8] + arg9[6] * (float) local37 + arg9[7] * (float) local33;
		@Pc(111) float local111;
		@Pc(118) float local118;
		if (arg11 == 0) {
			local111 = arg8 + local58 + 0.5F;
			local118 = arg12 + 0.5F - local100;
		} else if (arg11 == 1) {
			local118 = local100 + arg12 + 0.5F;
			local111 = local58 + arg8 + 0.5F;
		} else if (arg11 == 2) {
			local111 = arg8 + 0.5F - local58;
			local118 = arg5 + 0.5F - local79;
		} else if (arg11 == 3) {
			local111 = arg8 + local58 + 0.5F;
			local118 = arg5 + 0.5F - local79;
		} else if (arg11 == 4) {
			local111 = local100 + arg12 + 0.5F;
			local118 = arg5 + 0.5F - local79;
		} else {
			local118 = arg5 + 0.5F - local79;
			local111 = arg12 + 0.5F - local100;
		}
		@Pc(237) float local237;
		if (arg10 == 1) {
			local237 = local111;
			local111 = -local118;
			local118 = local237;
		} else if (arg10 == 2) {
			local111 = -local111;
			local118 = -local118;
		} else if (arg10 == 3) {
			local237 = local111;
			local111 = local118;
			local118 = -local237;
		}
		arg6[1] = local118;
		arg6[0] = local111;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lclient!rv;I)V")
	public static void method4255(@OriginalArg(0) Class5_Sub36_Sub2 arg0) {
		arg0.method7336();
		@Pc(12) int local12 = Static649.anInt10621;
		@Pc(22) Class4_Sub1_Sub1_Sub2_Sub1 local22 = Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4 = Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local12] = new Class4_Sub1_Sub1_Sub2_Sub1();
		local22.anInt6843 = local12;
		@Pc(30) int local30 = arg0.method7343(30);
		@Pc(35) byte local35 = (byte) (local30 >> 28);
		@Pc(41) int local41 = local30 >> 14 & 0x3FFF;
		local22.anIntArray405[0] = local41 - Static315.anInt5380;
		@Pc(53) int local53 = local30 & 0x3FFF;
		local22.anInt9805 = (local22.anIntArray405[0] << 9) + (local22.method5932() << 8);
		local22.anIntArray404[0] = local53 - Static290.anInt5128;
		local22.anInt9803 = (local22.anIntArray404[0] << 9) + (local22.method5932() << 8);
		Static324.anInt5529 = local22.aByte139 = local22.aByte138 = local35;
		if (Static389.method1741(local22.anIntArray404[0], local22.anIntArray405[0])) {
			local22.aByte138++;
		}
		if (Static74.aClass5_Sub36Array1[local12] != null) {
			local22.method4091(Static74.aClass5_Sub36Array1[local12]);
		}
		Static274.anInt4921 = 0;
		Static605.anIntArray544[Static274.anInt4921++] = local12;
		Static264.aByteArray44[local12] = 0;
		Static434.anInt7178 = 0;
		for (@Pc(169) int local169 = 1; local169 < 2048; local169++) {
			if (local12 != local169) {
				@Pc(185) int local185 = arg0.method7343(18);
				@Pc(189) int local189 = local185 >> 16;
				@Pc(195) int local195 = local185 >> 8 & 0xFF;
				@Pc(199) int local199 = local185 & 0xFF;
				@Pc(207) Class268 local207 = Static465.aClass268Array1[local169] = new Class268();
				local207.aBoolean473 = false;
				local207.anInt7107 = -1;
				local207.anInt7108 = 0;
				local207.aBoolean474 = false;
				local207.anInt7109 = local199 + (local195 << 14) + (local189 << 28);
				Static192.anIntArray440[Static434.anInt7178++] = local169;
				Static264.aByteArray44[local169] = 0;
			}
		}
		arg0.method7340();
	}
}
