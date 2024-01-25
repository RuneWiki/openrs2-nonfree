import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!lu", name = "r", descriptor = "[I")
	public static final int[] anIntArray358 = new int[] { 3500, 200 };

	@OriginalMember(owner = "client!lu", name = "u", descriptor = "[I")
	public static final int[] anIntArray359 = new int[8];

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(III)V")
	public static void method4773(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static582.anInt9419 = arg1 - Static313.anInt4085;
		Static248.anInt4641 = arg0 - Static313.anInt4096;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "([II)Ljava/lang/String;")
	public static String method4774(@OriginalArg(0) int[] arg0) {
		@Pc(14) StringBuffer local14 = new StringBuffer();
		@Pc(16) int local16 = Static151.anInt2848;
		for (@Pc(18) int local18 = 0; local18 < arg0.length; local18++) {
			@Pc(27) Class95 local27 = Static83.aClass255_1.method5729(arg0[local18]);
			if (local27.anInt2637 != -1) {
				@Pc(40) Class10 local40 = (Class10) Static237.aClass326_17.method7238((long) local27.anInt2637);
				if (local40 == null) {
					@Pc(48) Class318 local48 = Static604.method7062(Static141.aClass111_32, local27.anInt2637, 0);
					if (local48 != null) {
						local40 = Static136.aClass12_8.method6434(local48, true);
						Static237.aClass326_17.method7236(local40, (long) local27.anInt2637);
					}
				}
				if (local40 != null) {
					Static206.aClass10Array13[local16] = local40;
					local14.append(" <img=").append(local16).append(">");
					local16++;
				}
			}
		}
		return local14.toString();
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lclient!r;Lclient!ci;BI)V")
	public static void method4775(@OriginalArg(0) Class12 arg0, @OriginalArg(1) Class50 arg1, @OriginalArg(3) int arg2) {
		@Pc(17) int local17;
		if (Static594.anIntArray633 != null && arg2 <= arg1.aByte29) {
			for (local17 = 0; local17 < Static594.anIntArray633.length; local17++) {
				if (Static594.anIntArray633[local17] != -1000000 && (arg1.anIntArray86[0] <= Static594.anIntArray633[local17] || arg1.anIntArray86[1] <= Static594.anIntArray633[local17] || arg1.anIntArray86[2] <= Static594.anIntArray633[local17] || arg1.anIntArray86[3] <= Static594.anIntArray633[local17]) && (Static398.anIntArray470[local17] >= arg1.anIntArray85[0] || Static398.anIntArray470[local17] >= arg1.anIntArray85[1] || Static398.anIntArray470[local17] >= arg1.anIntArray85[2] || Static398.anIntArray470[local17] >= arg1.anIntArray85[3]) && (arg1.anIntArray85[0] >= Static267.anIntArray302[local17] || Static267.anIntArray302[local17] <= arg1.anIntArray85[1] || Static267.anIntArray302[local17] <= arg1.anIntArray85[2] || arg1.anIntArray85[3] >= Static267.anIntArray302[local17]) && (Static253.anIntArray288[local17] >= arg1.anIntArray87[0] || arg1.anIntArray87[1] <= Static253.anIntArray288[local17] || arg1.anIntArray87[2] <= Static253.anIntArray288[local17] || arg1.anIntArray87[3] <= Static253.anIntArray288[local17]) && (Static127.anIntArray157[local17] <= arg1.anIntArray87[0] || Static127.anIntArray157[local17] <= arg1.anIntArray87[1] || arg1.anIntArray87[2] >= Static127.anIntArray157[local17] || Static127.anIntArray157[local17] <= arg1.anIntArray87[3])) {
					return;
				}
			}
		}
		@Pc(267) int local267;
		@Pc(291) int local291;
		@Pc(314) boolean local314;
		@Pc(346) float local346;
		if (arg1.aByte30 == 1) {
			local17 = Static246.anInt8757 + arg1.aShort22 - Static251.anInt4676;
			if (local17 >= 0 && Static246.anInt8757 + Static246.anInt8757 >= local17) {
				local267 = Static246.anInt8757 + arg1.aShort21 - Static63.anInt1544;
				if (local267 < 0) {
					local267 = 0;
				} else if (Static246.anInt8757 + Static246.anInt8757 < local267) {
					return;
				}
				local291 = Static246.anInt8757 + arg1.aShort23 - Static63.anInt1544;
				if (local291 > Static246.anInt8757 + Static246.anInt8757) {
					local291 = Static246.anInt8757 + Static246.anInt8757;
				} else if (local291 < 0) {
					return;
				}
				local314 = false;
				while (local267 <= local291) {
					if (Static116.aBooleanArrayArray4[local17][local267++]) {
						local314 = true;
						break;
					}
				}
				if (local314) {
					local346 = Static221.anInt4276 - arg1.anIntArray85[0];
					if (local346 < 0.0F) {
						local346 *= -1.0F;
					}
					if (!local346 < (float) Static41.anInt1085 && (Static355.method5198(0, arg1) && (Static355.method5198(1, arg1) && (Static355.method5198(2, arg1) && Static355.method5198(3, arg1))))) {
						Static17.aClass50Array1[Static259.anInt4761++] = arg1;
					}
				}
			}
		} else if (arg1.aByte30 == 2) {
			local17 = Static246.anInt8757 + arg1.aShort21 - Static63.anInt1544;
			if (local17 >= 0 && local17 <= Static246.anInt8757 + Static246.anInt8757) {
				local267 = arg1.aShort22 + Static246.anInt8757 - Static251.anInt4676;
				if (local267 < 0) {
					local267 = 0;
				} else if (Static246.anInt8757 + Static246.anInt8757 < local267) {
					return;
				}
				local291 = arg1.aShort20 + Static246.anInt8757 - Static251.anInt4676;
				if (Static246.anInt8757 + Static246.anInt8757 < local291) {
					local291 = Static246.anInt8757 + Static246.anInt8757;
				} else if (local291 < 0) {
					return;
				}
				local314 = false;
				while (local267 <= local291) {
					if (Static116.aBooleanArrayArray4[local267++][local17]) {
						local314 = true;
						break;
					}
				}
				if (local314) {
					local346 = Static41.anInt1080 - arg1.anIntArray87[0];
					if (local346 < 0.0F) {
						local346 *= -1.0F;
					}
					if (!((float) Static41.anInt1085 > local346) && (Static355.method5198(0, arg1) && (Static355.method5198(1, arg1) && (Static355.method5198(2, arg1) && Static355.method5198(3, arg1))))) {
						Static17.aClass50Array1[Static259.anInt4761++] = arg1;
					}
				}
			}
		} else if (arg1.aByte30 == 16 || arg1.aByte30 == 8) {
			local17 = Static246.anInt8757 + arg1.aShort22 - Static251.anInt4676;
			if (local17 >= 0 && Static246.anInt8757 + Static246.anInt8757 >= local17) {
				local267 = Static246.anInt8757 + arg1.aShort21 - Static63.anInt1544;
				if (local267 >= 0 && local267 <= Static246.anInt8757 + Static246.anInt8757 && Static116.aBooleanArrayArray4[local17][local267]) {
					@Pc(610) float local610 = (float) (Static221.anInt4276 - arg1.anIntArray85[0]);
					if (local610 < 0.0F) {
						local610 *= -1.0F;
					}
					@Pc(627) float local627 = (float) (Static41.anInt1080 - arg1.anIntArray87[0]);
					if (local627 < 0.0F) {
						local627 *= -1.0F;
					}
					if ((!((float) Static41.anInt1085 > local610) || !(local627 < (float) Static41.anInt1085)) && (Static355.method5198(0, arg1) && (Static355.method5198(1, arg1) && (Static355.method5198(2, arg1) && Static355.method5198(3, arg1))))) {
						Static17.aClass50Array1[Static259.anInt4761++] = arg1;
					}
				}
			}
		} else if (arg1.aByte30 == 4) {
			@Pc(694) float local694 = (float) (arg1.anIntArray86[0] - Static453.anInt7762);
			if (!(local694 <= (float) Static324.anInt5805)) {
				local267 = Static246.anInt8757 + arg1.aShort21 - Static63.anInt1544;
				if (local267 < 0) {
					local267 = 0;
				} else if (Static246.anInt8757 + Static246.anInt8757 < local267) {
					return;
				}
				local291 = arg1.aShort23 + Static246.anInt8757 - Static63.anInt1544;
				if (Static246.anInt8757 + Static246.anInt8757 < local291) {
					local291 = Static246.anInt8757 + Static246.anInt8757;
				} else if (local291 < 0) {
					return;
				}
				@Pc(754) int local754 = arg1.aShort22 + Static246.anInt8757 - Static251.anInt4676;
				if (local754 < 0) {
					local754 = 0;
				} else if (local754 > Static246.anInt8757 + Static246.anInt8757) {
					return;
				}
				@Pc(781) int local781 = Static246.anInt8757 + arg1.aShort20 - Static251.anInt4676;
				if (Static246.anInt8757 + Static246.anInt8757 < local781) {
					local781 = Static246.anInt8757 + Static246.anInt8757;
				} else if (local781 < 0) {
					return;
				}
				@Pc(798) boolean local798 = false;
				label283: for (@Pc(800) int local800 = local754; local800 <= local781; local800++) {
					for (@Pc(804) int local804 = local267; local804 <= local291; local804++) {
						if (Static116.aBooleanArrayArray4[local800][local804]) {
							local798 = true;
							break label283;
						}
					}
				}
				if (local798 && (Static355.method5198(0, arg1) && (Static355.method5198(1, arg1) && (Static355.method5198(2, arg1) && Static355.method5198(3, arg1))))) {
					Static17.aClass50Array1[Static259.anInt4761++] = arg1;
				}
			}
		}
	}
}
