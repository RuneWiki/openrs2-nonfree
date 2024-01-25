import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static460 {

	@OriginalMember(owner = "client!pha", name = "p", descriptor = "I")
	public static int anInt11073 = 0;

	@OriginalMember(owner = "client!pha", name = "q", descriptor = "Lclient!in;")
	public static final Class169 aClass169_258 = new Class169(32, 6);

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(Z)V")
	public static void method9469() {
		if (Static299.anInt5456 == -1 || Static230.anInt4627 == -1) {
			return;
		}
		@Pc(26) int local26 = Static193.anInt4103 + (Static630.anInt7989 * (Static329.anInt6013 - Static193.anInt4103) >> 16);
		Static630.anInt7989 += local26;
		if (Static630.anInt7989 >= 65535) {
			if (Static264.aBoolean378) {
				Static628.aBoolean786 = false;
			} else {
				Static628.aBoolean786 = true;
			}
			Static630.anInt7989 = 65535;
			Static264.aBoolean378 = true;
		} else {
			Static628.aBoolean786 = false;
			Static264.aBoolean378 = false;
		}
		@Pc(56) float local56 = (float) Static630.anInt7989 / 65535.0F;
		@Pc(59) float[] local59 = new float[3];
		@Pc(63) int local63 = Static170.anInt3601 * 2;
		@Pc(89) int local89;
		@Pc(123) int local123;
		@Pc(131) int local131;
		@Pc(136) int local136;
		@Pc(146) int local146;
		@Pc(163) int local163;
		for (@Pc(65) int local65 = 0; local65 < 3; local65++) {
			@Pc(77) int local77 = Static19.anIntArrayArrayArray1[Static299.anInt5456][local63][local65] * 3;
			local89 = Static19.anIntArrayArrayArray1[Static299.anInt5456][local63 + 1][local65] * 3;
			local123 = (Static19.anIntArrayArrayArray1[Static299.anInt5456][local63 + 2][local65] + Static19.anIntArrayArrayArray1[Static299.anInt5456][local63 + 2][local65] - Static19.anIntArrayArrayArray1[Static299.anInt5456][local63 + 3][local65]) * 3;
			local131 = Static19.anIntArrayArrayArray1[Static299.anInt5456][local63][local65];
			local136 = local89 - local77;
			local146 = local77 + local123 - local89 * 2;
			local163 = local89 + Static19.anIntArrayArrayArray1[Static299.anInt5456][local63 + 2][local65] - local131 - local123;
			local59[local65] = (float) local131 + local56 * ((float) local136 + local56 * ((float) local146 + local56 * (float) local163));
		}
		Static598.anInt10387 = (int) local59[2] - Static490.anInt8763 * 512;
		Static229.anInt4615 = (int) local59[1] * -1;
		Static108.anInt1987 = (int) local59[0] - Static640.anInt11085 * 512;
		@Pc(221) float[] local221 = new float[3];
		local89 = Static458.anInt8233 * 2;
		for (local123 = 0; local123 < 3; local123++) {
			local131 = Static19.anIntArrayArrayArray1[Static230.anInt4627][local89][local123] * 3;
			local136 = Static19.anIntArrayArrayArray1[Static230.anInt4627][local89 + 1][local123] * 3;
			local146 = (Static19.anIntArrayArrayArray1[Static230.anInt4627][local89 + 2][local123] + Static19.anIntArrayArrayArray1[Static230.anInt4627][local89 + 2][local123] - Static19.anIntArrayArrayArray1[Static230.anInt4627][local89 + 3][local123]) * 3;
			local163 = Static19.anIntArrayArrayArray1[Static230.anInt4627][local89][local123];
			@Pc(298) int local298 = local136 - local131;
			@Pc(307) int local307 = local146 + local131 - local136 * 2;
			@Pc(324) int local324 = Static19.anIntArrayArrayArray1[Static230.anInt4627][local89 + 2][local123] + local136 - local163 - local146;
			local221[local123] = ((local56 * (float) local324 + (float) local307) * local56 + (float) local298) * local56 + (float) local163;
		}
		@Pc(356) float local356 = local221[0] - local59[0];
		@Pc(367) float local367 = -1.0F * (local221[1] - local59[1]);
		@Pc(375) float local375 = local221[2] - local59[2];
		@Pc(385) double local385 = Math.sqrt((double) (local356 * local356 + local375 * local375));
		Static550.anInt9633 = (int) (Math.atan2((double) local367, local385) * 2607.5945876176133D) & 0x3FFF;
		Static152.anInt3290 = (int) (-Math.atan2((double) local356, (double) local375) * 2607.5945876176133D) & 0x3FFF;
		Static297.anInt5413 = Static19.anIntArrayArrayArray1[Static299.anInt5456][local63][3] + ((Static19.anIntArrayArrayArray1[Static299.anInt5456][local63 + 2][3] - Static19.anIntArrayArrayArray1[Static299.anInt5456][local63][3]) * Static630.anInt7989 >> 16);
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(IIIBLclient!ww;)Z")
	public static boolean method9473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class15_Sub3_Sub4 arg3) {
		if (!Static351.aBoolean516 || !Static175.aBoolean283) {
			return false;
		} else if (Static22.anInt390 < 100) {
			return false;
		} else if (Static328.method5423(arg1, arg2, arg0)) {
			@Pc(26) int local26 = arg2 << Static170.anInt3602;
			@Pc(30) int local30 = arg1 << Static170.anInt3602;
			@Pc(40) int local40 = Static245.aClass18Array14[arg0].method8537(arg1, arg2) - 1;
			@Pc(51) int local51 = local40 + arg3.method9430();
			if (arg3.aShort126 == 1) {
				if (!Static630.method7146(local30, local40, local26, local51, local26, local30 + Static536.anInt4502, local30, local51, local26)) {
					return false;
				} else if (Static630.method7146(local30 + Static536.anInt4502, local40, local26, local40, local26, Static536.anInt4502 + local30, local30, local51, local26)) {
					Static383.anInt7255++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort126 == 2) {
				if (!Static630.method7146(Static536.anInt4502 + local30, local40, local26, local51, local26, Static536.anInt4502 + local30, Static536.anInt4502 + local30, local51, local26 + Static536.anInt4502)) {
					return false;
				} else if (Static630.method7146(local30 + Static536.anInt4502, local40, local26 + Static536.anInt4502, local51, local26, local30 + Static536.anInt4502, Static536.anInt4502 + local30, local40, Static536.anInt4502 + local26)) {
					Static383.anInt7255++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort126 == 4) {
				if (!Static630.method7146(local30, local40, Static536.anInt4502 + local26, local51, local26 + Static536.anInt4502, Static536.anInt4502 + local30, local30, local51, Static536.anInt4502 + local26)) {
					return false;
				} else if (Static630.method7146(local30 + Static536.anInt4502, local40, Static536.anInt4502 + local26, local40, local26 + Static536.anInt4502, Static536.anInt4502 + local30, local30, local51, Static536.anInt4502 + local26)) {
					Static383.anInt7255++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort126 == 8) {
				if (!Static630.method7146(local30, local40, local26, local51, local26, local30, local30, local51, Static536.anInt4502 + local26)) {
					return false;
				} else if (Static630.method7146(local30, local40, local26 + Static536.anInt4502, local51, local26, local30, local30, local40, Static536.anInt4502 + local26)) {
					Static383.anInt7255++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort126 == 16) {
				if (Static571.method8696(local40, Static124.anInt2431, local51, Static124.anInt2431, Static124.anInt2431 + local30, local26)) {
					Static383.anInt7255++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort126 == 32) {
				if (Static571.method8696(local40, Static124.anInt2431, local51, Static124.anInt2431, local30 + Static124.anInt2431, local26 - -Static124.anInt2431)) {
					Static383.anInt7255++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort126 == 64) {
				if (Static571.method8696(local40, Static124.anInt2431, local51, Static124.anInt2431, local30, local26 + Static124.anInt2431)) {
					Static383.anInt7255++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort126 != 128) {
				return true;
			} else if (Static571.method8696(local40, Static124.anInt2431, local51, Static124.anInt2431, local30, local26)) {
				Static383.anInt7255++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
