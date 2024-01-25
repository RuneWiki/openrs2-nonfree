import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static409 {

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "Lclient!fo;")
	public static Class82 aClass82_93;

	@OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
	public static int anInt6725 = 0;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
	public static void method5275() {
		if (Static283.anInt4984 == -1 || Static142.anInt2499 == -1) {
			return;
		}
		@Pc(25) int local25 = (Static357.anInt6112 * (Static453.anInt7490 - Static322.anInt5502) >> 16) + Static322.anInt5502;
		Static357.anInt6112 += local25;
		if (Static357.anInt6112 >= 65535) {
			if (Static378.aBoolean331) {
				Static288.aBoolean575 = false;
			} else {
				Static288.aBoolean575 = true;
			}
			Static357.anInt6112 = 65535;
			Static378.aBoolean331 = true;
		} else {
			Static288.aBoolean575 = false;
			Static378.aBoolean331 = false;
		}
		@Pc(63) float local63 = (float) Static357.anInt6112 / 65535.0F;
		@Pc(66) float[] local66 = new float[3];
		@Pc(70) int local70 = Static58.anInt1167 * 2;
		@Pc(96) int local96;
		@Pc(129) int local129;
		@Pc(137) int local137;
		@Pc(142) int local142;
		@Pc(151) int local151;
		@Pc(169) int local169;
		for (@Pc(72) int local72 = 0; local72 < 3; local72++) {
			@Pc(84) int local84 = Static370.anIntArrayArrayArray5[Static283.anInt4984][local70][local72] * 3;
			local96 = Static370.anIntArrayArrayArray5[Static283.anInt4984][local70 + 1][local72] * 3;
			local129 = (Static370.anIntArrayArrayArray5[Static283.anInt4984][local70 + 2][local72] + Static370.anIntArrayArrayArray5[Static283.anInt4984][local70 + 2][local72] - Static370.anIntArrayArrayArray5[Static283.anInt4984][local70 + 3][local72]) * 3;
			local137 = Static370.anIntArrayArrayArray5[Static283.anInt4984][local70][local72];
			local142 = local96 - local84;
			local151 = local129 + local84 - local96 * 2;
			local169 = local96 + Static370.anIntArrayArrayArray5[Static283.anInt4984][local70 + 2][local72] - local129 - local137;
			local66[local72] = (((float) local169 * local63 + (float) local151) * local63 + (float) local142) * local63 + (float) local137;
		}
		Static391.anInt6529 = (int) local66[1] * -1;
		Static360.anInt6145 = (int) local66[2] - Static164.anInt2731 * 128;
		Static213.anInt258 = (int) local66[0] - Static199.anInt3480 * 128;
		@Pc(225) float[] local225 = new float[3];
		local96 = Static415.anInt6868 * 2;
		for (local129 = 0; local129 < 3; local129++) {
			local137 = Static370.anIntArrayArrayArray5[Static142.anInt2499][local96][local129] * 3;
			local142 = Static370.anIntArrayArrayArray5[Static142.anInt2499][local96 + 1][local129] * 3;
			local151 = (Static370.anIntArrayArrayArray5[Static142.anInt2499][local96 + 2][local129] + Static370.anIntArrayArrayArray5[Static142.anInt2499][local96 + 2][local129] - Static370.anIntArrayArrayArray5[Static142.anInt2499][local96 + 3][local129]) * 3;
			local169 = Static370.anIntArrayArrayArray5[Static142.anInt2499][local96][local129];
			@Pc(301) int local301 = local142 - local137;
			@Pc(310) int local310 = local151 + local137 - local142 * 2;
			@Pc(327) int local327 = local142 + Static370.anIntArrayArrayArray5[Static142.anInt2499][local96 + 2][local129] - local151 - local169;
			local225[local129] = (float) local169 + local63 * ((float) local301 + ((float) local327 * local63 + (float) local310) * local63);
		}
		@Pc(359) float local359 = local225[0] - local66[0];
		@Pc(369) float local369 = -1.0F * (local225[1] - local66[1]);
		@Pc(378) float local378 = local225[2] - local66[2];
		@Pc(388) double local388 = Math.sqrt((double) (local359 * local359 + local378 * local378));
		Static340.anInt5790 = (int) (Math.atan2((double) local369, local388) * 2607.5945876176133D) & 0x3FFF;
		Static106.anInt2033 = (int) (-Math.atan2((double) local359, (double) local378) * 2607.5945876176133D) & 0x3FFF;
		Static73.anInt1361 = Static370.anIntArrayArrayArray5[Static283.anInt4984][local70][3] + (Static357.anInt6112 * (Static370.anIntArrayArrayArray5[Static283.anInt4984][local70 + 2][3] - Static370.anIntArrayArrayArray5[Static283.anInt4984][local70][3]) >> 16);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method5277(@OriginalArg(0) String arg0) {
		Static87.aString74 = arg0;
		if (Static183.aClass83_2.anApplet1 == null) {
			return;
		}
		try {
			@Pc(19) String local19 = Static183.aClass83_2.anApplet1.getParameter("cookieprefix");
			@Pc(24) String local24 = Static183.aClass83_2.anApplet1.getParameter("cookiehost");
			@Pc(39) String local39 = local19 + "settings=" + arg0 + "; version=1; path=/; domain=" + local24;
			if (arg0.length() == 0) {
				local39 = local39 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local39 = local39 + "; Expires=" + Static285.method3938(Static27.method359() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static461.method3099("document.cookie=\"" + local39 + "\"", Static183.aClass83_2.anApplet1);
		} catch (@Pc(93) Throwable local93) {
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)Z")
	public static boolean method5278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static97.anInt1738; local1++) {
			@Pc(6) Class252 local6 = Static443.aClass252Array8[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt7235 == 1) {
				local15 = local6.anInt7228 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt7237 + (local6.anInt7223 * local15 >> 8);
					local37 = local6.anInt7236 + (local6.anInt7238 * local15 >> 8);
					local47 = local6.anInt7231 + (local6.anInt7232 * local15 >> 8);
					local57 = local6.anInt7240 + (local6.anInt7233 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt7235 == 2) {
				local15 = arg0 - local6.anInt7228;
				if (local15 > 0) {
					local27 = local6.anInt7237 + (local6.anInt7223 * local15 >> 8);
					local37 = local6.anInt7236 + (local6.anInt7238 * local15 >> 8);
					local47 = local6.anInt7231 + (local6.anInt7232 * local15 >> 8);
					local57 = local6.anInt7240 + (local6.anInt7233 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt7235 == 3) {
				local15 = local6.anInt7237 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt7228 + (local6.anInt7245 * local15 >> 8);
					local37 = local6.anInt7241 + (local6.anInt7226 * local15 >> 8);
					local47 = local6.anInt7231 + (local6.anInt7232 * local15 >> 8);
					local57 = local6.anInt7240 + (local6.anInt7233 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt7235 == 4) {
				local15 = arg2 - local6.anInt7237;
				if (local15 > 0) {
					local27 = local6.anInt7228 + (local6.anInt7245 * local15 >> 8);
					local37 = local6.anInt7241 + (local6.anInt7226 * local15 >> 8);
					local47 = local6.anInt7231 + (local6.anInt7232 * local15 >> 8);
					local57 = local6.anInt7240 + (local6.anInt7233 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt7235 == 5) {
				local15 = arg1 - local6.anInt7231;
				if (local15 > 0) {
					local27 = local6.anInt7228 + (local6.anInt7245 * local15 >> 8);
					local37 = local6.anInt7241 + (local6.anInt7226 * local15 >> 8);
					local47 = local6.anInt7237 + (local6.anInt7223 * local15 >> 8);
					local57 = local6.anInt7236 + (local6.anInt7238 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
