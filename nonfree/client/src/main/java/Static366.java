import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static366 {

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_86 = new Class77(2, -1);

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "Z")
	public static boolean aBoolean638 = false;

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString103 = null;

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "Z")
	public static boolean aBoolean639 = false;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIBZI)V")
	public static void method7367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		if (Static120.aClass37ArrayArrayArray1 == null) {
			Static243.aClass42_4.method5866(arg1, arg0, arg4, -16777216, arg2);
		} else if (Static440.aClass30_Sub1_Sub1_Sub1_2.anInt9418 >= 0 && Static37.anInt7512 * 128 > Static440.aClass30_Sub1_Sub1_Sub1_2.anInt9418 && Static440.aClass30_Sub1_Sub1_Sub1_2.anInt9416 >= 0 && Static440.aClass30_Sub1_Sub1_Sub1_2.anInt9416 < Static329.anInt6247 * 128) {
			Static491.anInt8889++;
			if (Static440.aClass30_Sub1_Sub1_Sub1_2 != null && Static440.aClass30_Sub1_Sub1_Sub1_2.anInt9418 - (Static440.aClass30_Sub1_Sub1_Sub1_2.method3591() - 1) * 64 >> 7 == Static273.anInt5444 && Static440.aClass30_Sub1_Sub1_Sub1_2.anInt9416 + 64 - Static440.aClass30_Sub1_Sub1_Sub1_2.method3591() * 64 >> 7 == Static141.anInt3151) {
				Static273.anInt5444 = -1;
				Static141.anInt3151 = -1;
				Static62.method1459();
			}
			Static289.method4717();
			if (!arg3) {
				Static125.method2673();
			}
			Static87.method1913();
			Static490.method7296(arg2, arg0, arg4, arg1, true);
			@Pc(113) int local113 = Static106.anInt2440;
			@Pc(115) int local115 = Static326.anInt6151;
			@Pc(121) int local121 = Static354.anInt6608;
			@Pc(123) int local123 = Static474.anInt8686;
			@Pc(140) int local140;
			@Pc(179) int local179;
			if (Static242.anInt4993 == 1) {
				local140 = (int) Static49.aFloat10;
				if (local140 < Static32.anInt534 >> 8) {
					local140 = Static32.anInt534 >> 8;
				}
				if (Static110.aBooleanArray22[4] && Static325.anIntArray433[4] + 128 > local140) {
					local140 = Static325.anIntArray433[4] + 128;
				}
				local179 = (int) Static500.aFloat186 + Static525.anInt9367 & 0x3FFF;
				Static52.method1403(Static112.anInt2594, local113, local140, Static443.method6717(Static440.aClass30_Sub1_Sub1_Sub1_2.anInt9418, Static440.aClass30_Sub1_Sub1_Sub1_2.anInt9416, Static56.anInt1418) - 50, local179, Static401.anInt7550, (local140 >> 3) * 3 + 600 << 0);
			} else if (Static242.anInt4993 == 4) {
				local140 = (int) Static49.aFloat10;
				if (local140 < Static32.anInt534 >> 8) {
					local140 = Static32.anInt534 >> 8;
				}
				if (Static110.aBooleanArray22[4] && local140 < Static325.anIntArray433[4] + 128) {
					local140 = Static325.anIntArray433[4] + 128;
				}
				local179 = (int) Static500.aFloat186 & 0x3FFF;
				Static52.method1403(Static112.anInt2594, local113, local140, Static443.method6717(Static247.anInt5092, Static357.anInt6674, Static56.anInt1418) - 50, local179, Static401.anInt7550, (local140 >> 3) * 3 + 600 << 0);
			} else if (Static242.anInt4993 == 5) {
				Static486.method7268(local113);
			}
			local140 = Static368.anInt6832;
			local179 = Static62.anInt1472;
			@Pc(284) int local284 = Static6.anInt93;
			@Pc(286) int local286 = Static519.anInt9341;
			@Pc(288) int local288 = Static248.anInt5104;
			@Pc(331) int local331;
			for (@Pc(290) int local290 = 0; local290 < 5; local290++) {
				if (Static110.aBooleanArray22[local290]) {
					local331 = (int) (Math.random() * (double) (Static135.anIntArray227[local290] * 2 + 1) - (double) Static135.anIntArray227[local290] + Math.sin((double) Static465.anIntArray632[local290] / 100.0D * (double) Static146.anIntArray238[local290]) * (double) Static325.anIntArray433[local290]);
					if (local290 == 0) {
						Static368.anInt6832 += local331;
					}
					if (local290 == 4) {
						Static519.anInt9341 += local331;
						if (Static519.anInt9341 < 1024) {
							Static519.anInt9341 = 1024;
						} else if (Static519.anInt9341 > 3072) {
							Static519.anInt9341 = 3072;
						}
					}
					if (local290 == 2) {
						Static6.anInt93 += local331;
					}
					if (local290 == 3) {
						Static248.anInt5104 = Static248.anInt5104 + local331 & 0x3FFF;
					}
					if (local290 == 1) {
						Static62.anInt1472 += local331;
					}
				}
			}
			if (Static368.anInt6832 < 0) {
				Static368.anInt6832 = 0;
			}
			if ((Static537.anInt9566 << 7) - 1 < Static368.anInt6832) {
				Static368.anInt6832 = (Static537.anInt9566 << 7) - 1;
			}
			if (Static6.anInt93 < 0) {
				Static6.anInt93 = 0;
			}
			if (Static6.anInt93 > (Static509.anInt9164 << 7) - 1) {
				Static6.anInt93 = (Static509.anInt9164 << 7) - 1;
			}
			Static461.method6919();
			Static74.method1671();
			Static243.aClass42_4.N(local123, local115, local123 + local121, local113 + local115);
			Static243.aClass42_4.method5792();
			local331 = Static173.anInt3935;
			if (Static476.aClass186_2 == null) {
				Static243.aClass42_4.Z(local331);
			} else {
				Static476.aClass186_2.method4607(local123, Static519.anInt9341, local113, Static188.anInt4270 << 3, local115, local121, local331, Static243.aClass42_4, Static248.anInt5104);
			}
			Static365.method5697();
			Static180.aClass91_5.B(Static368.anInt6832, Static62.anInt1472, Static6.anInt93, -Static519.anInt9341 & 0x3FFF, -Static248.anInt5104 & 0x3FFF, -Static507.anInt9125 & 0x3FFF);
			Static243.aClass42_4.method5855(Static180.aClass91_5);
			Static243.aClass42_4.b(local121 / 2 + local123, local113 / 2 + local115, Static225.anInt4816 << 1, Static225.anInt4816 << 1);
			Static122.method2531(local121 / 2 + local123, Static225.anInt4816 << 1, local115 + local113 / 2, Static225.anInt4816 << 1);
			Static134.method2772(Static62.anInt1472, -Static519.anInt9341 & 0x3FFF, Static368.anInt6832, Static6.anInt93, -Static507.anInt9125 & 0x3FFF, -Static248.anInt5104 & 0x3FFF);
			@Pc(560) byte local560 = Static208.aClass12_Sub10_Sub1_1.method2046(Static148.anInt6867) == 2 ? (byte) Static491.anInt8889 : 1;
			Static519.method7732(Static243.aClass42_4, Static409.anInt7683, Static67.anInt1607, Static180.aClass91_5, Static368.anInt6832, Static62.anInt1472, Static6.anInt93, Static245.aByteArrayArrayArray19, Static475.anIntArray644, Static138.anIntArray232, Static487.anIntArray656, Static149.anIntArray245, Static224.anIntArray633, Static440.aClass30_Sub1_Sub1_Sub1_2.aByte99 + 1, local560, Static440.aClass30_Sub1_Sub1_Sub1_2.anInt9418 >> 7, Static440.aClass30_Sub1_Sub1_Sub1_2.anInt9416 >> 7, !Static208.aClass12_Sub10_Sub1_1.aBoolean179);
			Static365.method5697();
			if (Static96.anInt2243 == 9) {
				Static329.method5243(local113, local115, local121, local123);
				Static287.method4698(local123, local113, local115, local121);
				Static277.method4632(local115, local113, local121, local123);
				Static500.method7438(local113, local115, local121, local123);
			}
			Static413.method6432();
			Static248.anInt5104 = local288;
			Static368.anInt6832 = local140;
			Static62.anInt1472 = local179;
			Static519.anInt9341 = local286;
			Static6.anInt93 = local284;
			if (Static176.aBoolean324 && Static234.aClass86_2.method2315() == 0) {
				Static176.aBoolean324 = false;
			}
			if (Static176.aBoolean324) {
				Static243.aClass42_4.method5866(local115, local121, local113, -16777216, local123);
				Static178.method3537(Static53.aClass88_34.method2391(Static345.anInt6495), false, Static56.aClass80_2);
			}
		} else {
			Static243.aClass42_4.method5866(arg1, arg0, arg4, -16777216, arg2);
		}
	}
}
