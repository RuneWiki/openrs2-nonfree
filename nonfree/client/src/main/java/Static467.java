import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static467 {

	@OriginalMember(owner = "client!tk", name = "o", descriptor = "Lclient!im;")
	public static final Class140 aClass140_126 = new Class140(87, -1);

	@OriginalMember(owner = "client!tk", name = "u", descriptor = "Lclient!bv;")
	public static final Class37 aClass37_86 = new Class37();

	@OriginalMember(owner = "client!tk", name = "w", descriptor = "Lclient!dh;")
	public static final Class64 aClass64_7 = new Class64("", 14);

	@OriginalMember(owner = "client!tk", name = "y", descriptor = "I")
	public static int anInt7880 = 0;

	@OriginalMember(owner = "client!tk", name = "z", descriptor = "[I")
	public static final int[] anIntArray740 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!tk", name = "A", descriptor = "Lclient!im;")
	public static final Class140 aClass140_127 = new Class140(28, 2);

	@OriginalMember(owner = "client!tk", name = "C", descriptor = "I")
	public static int anInt7881 = 13156520;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIIFFFI)[F")
	public static float[] method6551(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg1 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg1 * 0.024543693F));
		local6[3] = 0.0F;
		local6[1] = 0.0F;
		local6[0] = local17;
		local6[7] = 0.0F;
		local6[5] = 0.0F;
		local6[4] = 1.0F;
		local6[2] = local25;
		local6[6] = -local25;
		local6[8] = local17;
		@Pc(74) float[] local74 = new float[9];
		@Pc(76) float local76 = 1.0F;
		@Pc(81) float local81 = (float) arg0 / 32767.0F;
		@Pc(83) float local83 = 0.0F;
		@Pc(94) float local94 = -((float) Math.sqrt((double) (1.0F - local81 * local81)));
		@Pc(99) float local99 = 1.0F - local81;
		@Pc(110) float local110 = (float) Math.sqrt((double) (arg2 * arg2 + arg6 * arg6));
		if (local110 == 0.0F && local81 == 0.0F) {
			local9 = local6;
		} else {
			if (local110 != 0.0F) {
				local83 = (float) arg6 / local110;
				local76 = (float) -arg2 / local110;
			}
			local74[5] = local94 * local76;
			local74[1] = local83 * local94;
			local74[6] = local99 * local76 * local83;
			local74[0] = local81 + local99 * local76 * local76;
			local74[4] = local81;
			local74[3] = -local83 * local94;
			local74[2] = local99 * local83 * local76;
			local74[8] = local99 * local83 * local83 + local81;
			local74[7] = local94 * -local76;
			local9[0] = local6[2] * local74[6] + local74[3] * local6[1] + local74[0] * local6[0];
			local9[1] = local74[7] * local6[2] + local74[4] * local6[1] + local74[1] * local6[0];
			local9[3] = local6[5] * local74[6] + local74[3] * local6[4] + local6[3] * local74[0];
			local9[2] = local6[2] * local74[8] + local74[5] * local6[1] + local6[0] * local74[2];
			local9[4] = local6[3] * local74[1] + local6[4] * local74[4] + local6[5] * local74[7];
			local9[5] = local74[5] * local6[4] + local74[2] * local6[3] + local6[5] * local74[8];
			local9[6] = local6[7] * local74[3] + local74[0] * local6[6] + local74[6] * local6[8];
			local9[7] = local6[6] * local74[1] + local6[7] * local74[4] + local74[7] * local6[8];
			local9[8] = local6[7] * local74[5] + local74[2] * local6[6] + local6[8] * local74[8];
		}
		local9[5] *= arg4;
		local9[6] *= arg3;
		local9[0] *= arg5;
		local9[3] *= arg4;
		local9[4] *= arg4;
		local9[1] *= arg5;
		local9[8] *= arg3;
		local9[7] *= arg3;
		local9[2] *= arg5;
		return local9;
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(Z)V")
	public static void method6553() {
		Static296.aClass37_47.method967();
		Static465.aClass37_85.method967();
		@Pc(26) int local26;
		for (@Pc(21) Class1_Sub24 local21 = (Class1_Sub24) Static248.aClass37_30.method977(); local21 != null; local21 = (Class1_Sub24) Static248.aClass37_30.method971()) {
			local26 = local21.anInt3161;
			if (local26 < 1000) {
				local21.method7525();
				if (local26 == 30 || local26 == 22 || local26 == 8 || local26 == 10 || local26 == 5 || local26 == 60 || local26 == 2) {
					Static465.aClass37_85.method970(local21);
				} else {
					Static296.aClass37_47.method970(local21);
				}
			}
		}
		Static296.aClass37_47.method972(Static248.aClass37_30);
		Static465.aClass37_85.method972(Static248.aClass37_30);
		if (Static16.anInt415 <= 1) {
			Static46.aClass1_Sub24_1 = null;
		} else if (Static546.aBoolean183 && Static149.aClass66_1.method1582(81) && Static16.anInt415 > 2) {
			Static46.aClass1_Sub24_1 = (Class1_Sub24) Static248.aClass37_30.aClass1_47.aClass1_283.aClass1_283;
		} else {
			Static46.aClass1_Sub24_1 = (Class1_Sub24) Static248.aClass37_30.aClass1_47.aClass1_283;
		}
		local26 = -1;
		@Pc(131) Class1_Sub13 local131 = (Class1_Sub13) Static22.aClass37_50.method977();
		if (local131 != null) {
			local26 = local131.method5739();
		}
		if (!Static15.aBoolean16) {
			if (local26 == 0 && (Static329.anInt5978 == 1 && Static16.anInt415 > 2 || Static177.method2907())) {
				local26 = 2;
			}
			if (local26 == 2 && Static16.anInt415 > 0 && local131 != null) {
				if (Static86.aClass156_4 == null && Static315.anInt5797 == 0) {
					Static95.method1650(local131.method5742(), local131.method5737());
				} else {
					Static481.anInt7987 = 2;
				}
			}
			if (local26 == 0 && Static16.anInt415 > 0) {
				Static261.method1959();
			}
			if (Static86.aClass156_4 != null || Static315.anInt5797 != 0) {
				return;
			}
			Static481.anInt7987 = 0;
			Static109.aClass1_Sub24_4 = null;
			return;
		}
		@Pc(147) int local147;
		@Pc(151) int local151;
		if (local26 == -1) {
			local147 = Static498.aClass5_1.method7052();
			local151 = Static498.aClass5_1.method7042();
			if (Static13.anInt305 - 10 > local147 || local147 > Static13.anInt305 + Static541.anInt9145 + 10 || local151 < Static188.anInt3359 - 10 || local151 > Static188.anInt3359 + Static260.anInt5040 + 10) {
				Static543.method7538();
			}
		}
		if (local26 != 0) {
			return;
		}
		local147 = Static13.anInt305;
		local151 = Static188.anInt3359;
		@Pc(197) int local197 = Static541.anInt9145;
		@Pc(201) int local201 = local131.method5737();
		@Pc(205) int local205 = local131.method5742();
		@Pc(207) int local207 = -1;
		@Pc(226) int local226;
		for (@Pc(209) int local209 = 0; local209 < Static16.anInt415; local209++) {
			if (Static541.aBoolean640) {
				local226 = (Static16.anInt415 - local209 - 1) * 16 + local151 + 33;
				if (local201 > local147 && local147 + local197 > local201 && local205 > local226 - 13 && local226 + 4 > local205) {
					local207 = local209;
				}
			} else {
				local226 = (Static16.anInt415 - local209 - 1) * 16 + local151 + 31;
				if (local147 < local201 && local147 + local197 > local201 && local226 - 13 < local205 && local205 < local226 + 3) {
					local207 = local209;
				}
			}
		}
		if (local207 != -1) {
			local226 = 0;
			@Pc(318) Class106 local318 = new Class106(Static248.aClass37_30);
			for (@Pc(323) Class1_Sub24 local323 = (Class1_Sub24) local318.method2484(); local323 != null; local323 = (Class1_Sub24) local318.method2485()) {
				if (local226 == local207) {
					Static484.method6632(local201, local205, local323);
				}
				local226++;
			}
		}
		Static543.method7538();
		return;
	}
}
