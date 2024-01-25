import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public static void method5247() {
		if (Static148.anInt6290 == -1 || Static418.anInt3024 == -1) {
			return;
		}
		@Pc(25) int local25 = Static451.anInt7735 + ((Static354.anInt6241 - Static451.anInt7735) * Static370.anInt6428 >> 16);
		Static370.anInt6428 += local25;
		if (Static370.anInt6428 >= 65535) {
			Static370.anInt6428 = 65535;
			if (Static95.aBoolean148) {
				Static440.aBoolean551 = false;
			} else {
				Static440.aBoolean551 = true;
			}
			Static95.aBoolean148 = true;
		} else {
			Static95.aBoolean148 = false;
			Static440.aBoolean551 = false;
		}
		@Pc(57) float local57 = (float) Static370.anInt6428 / 65535.0F;
		@Pc(60) float[] local60 = new float[3];
		@Pc(64) int local64 = Static198.anInt3926 * 2;
		@Pc(90) int local90;
		@Pc(123) int local123;
		@Pc(131) int local131;
		@Pc(136) int local136;
		@Pc(144) int local144;
		@Pc(162) int local162;
		for (@Pc(66) int local66 = 0; local66 < 3; local66++) {
			@Pc(78) int local78 = Static353.anIntArrayArrayArray10[Static148.anInt6290][local64][local66] * 3;
			local90 = Static353.anIntArrayArrayArray10[Static148.anInt6290][local64 + 1][local66] * 3;
			local123 = (Static353.anIntArrayArrayArray10[Static148.anInt6290][local64 + 2][local66] + Static353.anIntArrayArrayArray10[Static148.anInt6290][local64 + 2][local66] - Static353.anIntArrayArrayArray10[Static148.anInt6290][local64 + 3][local66]) * 3;
			local131 = Static353.anIntArrayArrayArray10[Static148.anInt6290][local64][local66];
			local136 = local90 - local78;
			local144 = local123 + local78 - local90 * 2;
			local162 = local90 + Static353.anIntArrayArrayArray10[Static148.anInt6290][local64 + 2][local66] - local131 - local123;
			local60[local66] = (float) local131 + ((float) local136 + local57 * ((float) local144 + (float) local162 * local57)) * local57;
		}
		Static235.anInt4645 = (int) local60[0] - Static426.anInt7325 * 128;
		Static108.anInt2350 = (int) local60[2] - Static72.anInt1776 * 128;
		Static405.anInt7103 = (int) local60[1] * -1;
		@Pc(218) float[] local218 = new float[3];
		local90 = Static111.anInt2419 * 2;
		for (local123 = 0; local123 < 3; local123++) {
			local131 = Static353.anIntArrayArrayArray10[Static418.anInt3024][local90][local123] * 3;
			local136 = Static353.anIntArrayArrayArray10[Static418.anInt3024][local90 + 1][local123] * 3;
			local144 = (Static353.anIntArrayArrayArray10[Static418.anInt3024][local90 + 2][local123] + Static353.anIntArrayArrayArray10[Static418.anInt3024][local90 + 2][local123] - Static353.anIntArrayArrayArray10[Static418.anInt3024][local90 + 3][local123]) * 3;
			local162 = Static353.anIntArrayArrayArray10[Static418.anInt3024][local90][local123];
			@Pc(298) int local298 = local136 - local131;
			@Pc(307) int local307 = local144 + local131 - local136 * 2;
			@Pc(324) int local324 = Static353.anIntArrayArrayArray10[Static418.anInt3024][local90 + 2][local123] + local136 - local162 - local144;
			local218[local123] = ((float) local298 + local57 * ((float) local324 * local57 + (float) local307)) * local57 + (float) local162;
		}
		@Pc(357) float local357 = local218[0] - local60[0];
		@Pc(367) float local367 = (local218[1] - local60[1]) * -1.0F;
		@Pc(375) float local375 = local218[2] - local60[2];
		@Pc(385) double local385 = Math.sqrt((double) (local357 * local357 + local375 * local375));
		Static439.anInt7477 = (int) (Math.atan2((double) local367, local385) * 2607.5945876176133D) & 0x3FFF;
		Static200.anInt3936 = (int) (-Math.atan2((double) local357, (double) local375) * 2607.5945876176133D) & 0x3FFF;
		Static246.anInt4786 = (Static370.anInt6428 * (Static353.anIntArrayArrayArray10[Static148.anInt6290][local64 + 2][3] - Static353.anIntArrayArrayArray10[Static148.anInt6290][local64][3]) >> 16) + Static353.anIntArrayArrayArray10[Static148.anInt6290][local64][3];
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IF)F")
	public static float method5248(@OriginalArg(1) float arg0) {
		return arg0 * arg0 * arg0 * (arg0 * (arg0 * 6.0F - 15.0F) + 10.0F);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method5249(@OriginalArg(0) String arg0) {
		Static230.aString35 = arg0;
		if (Static390.aClass255_5.anApplet1 == null) {
			return;
		}
		try {
			@Pc(14) String local14 = Static390.aClass255_5.anApplet1.getParameter("cookieprefix");
			@Pc(19) String local19 = Static390.aClass255_5.anApplet1.getParameter("cookiehost");
			@Pc(34) String local34 = local14 + "settings=" + arg0 + "; version=1; path=/; domain=" + local19;
			if (arg0.length() == 0) {
				local34 = local34 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local34 = local34 + "; Expires=" + Static25.method394(Static167.method2929() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static476.method5364(Static390.aClass255_5.anApplet1, "document.cookie=\"" + local34 + "\"");
		} catch (@Pc(87) Throwable local87) {
		}
	}
}
