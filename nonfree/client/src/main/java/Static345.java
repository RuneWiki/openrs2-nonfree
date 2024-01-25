import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!nba", name = "g", descriptor = "I")
	public static int anInt6059;

	@OriginalMember(owner = "client!nba", name = "c", descriptor = "I")
	public static int anInt6055 = -1;

	@OriginalMember(owner = "client!nba", name = "d", descriptor = "I")
	public static int anInt6056 = 0;

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(I)Z")
	public static boolean method5246() {
		return Static375.anInt6351 == 0 ? Static142.aClass3_Sub6_Sub3_1.method2142() : true;
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(IZ)Lclient!ju;")
	public static Class173 method5247(@OriginalArg(0) int arg0) {
		@Pc(8) Class173[] local8 = Static231.method3921();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(21) Class173 local21 = local8[local10];
			if (local21.anInt4936 == arg0) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!nba", name = "b", descriptor = "(I)V")
	public static void method5248() {
		Static355.method5325(false);
		Static43.anInt5562 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static240.aByteArrayArray13.length; local14++) {
			if (Static147.anIntArray258[local14] != -1 && Static240.aByteArrayArray13[local14] == null) {
				Static240.aByteArrayArray13[local14] = Static565.aClass246_261.method5653(Static147.anIntArray258[local14], 0);
				if (Static240.aByteArrayArray13[local14] == null) {
					local12 = false;
					Static43.anInt5562++;
				}
			}
			if (Static557.anIntArray656[local14] != -1 && Static475.aByteArrayArray25[local14] == null) {
				Static475.aByteArrayArray25[local14] = Static565.aClass246_261.method5647(Static167.anIntArrayArray27[local14], 0, Static557.anIntArray656[local14]);
				if (Static475.aByteArrayArray25[local14] == null) {
					Static43.anInt5562++;
					local12 = false;
				}
			}
			if (Static113.anIntArray189[local14] != -1 && Static101.aByteArrayArray6[local14] == null) {
				Static101.aByteArrayArray6[local14] = Static565.aClass246_261.method5653(Static113.anIntArray189[local14], 0);
				if (Static101.aByteArrayArray6[local14] == null) {
					Static43.anInt5562++;
					local12 = false;
				}
			}
			if (Static232.anIntArray358[local14] != -1 && Static411.aByteArrayArray22[local14] == null) {
				Static411.aByteArrayArray22[local14] = Static565.aClass246_261.method5653(Static232.anIntArray358[local14], 0);
				if (Static411.aByteArrayArray22[local14] == null) {
					local12 = false;
					Static43.anInt5562++;
				}
			}
			if (Static531.anIntArray635 != null && Static259.aByteArrayArray29[local14] == null && Static531.anIntArray635[local14] != -1) {
				Static259.aByteArrayArray29[local14] = Static565.aClass246_261.method5647(Static167.anIntArrayArray27[local14], 0, Static531.anIntArray635[local14]);
				if (Static259.aByteArrayArray29[local14] == null) {
					Static43.anInt5562++;
					local12 = false;
				}
			}
		}
		if (Static190.aClass149_1 == null) {
			if (Static28.aClass3_Sub3_Sub3_1 == null || !Static494.aClass246_232.method5663(Static28.aClass3_Sub3_Sub3_1.aString8 + "_staticelements")) {
				Static190.aClass149_1 = new Class149(0);
			} else if (Static494.aClass246_232.method5669(Static28.aClass3_Sub3_Sub3_1.aString8 + "_staticelements")) {
				Static190.aClass149_1 = Static197.method3571(Static28.aClass3_Sub3_Sub3_1.aString8 + "_staticelements", Static494.aClass246_232, Static137.aBoolean250);
			} else {
				local12 = false;
				Static43.anInt5562++;
			}
		}
		if (!local12) {
			Static506.anInt8040 = 1;
			return;
		}
		local12 = true;
		Static49.anInt1056 = 0;
		@Pc(264) int local264;
		@Pc(274) int local274;
		for (@Pc(245) int local245 = 0; local245 < Static240.aByteArrayArray13.length; local245++) {
			@Pc(251) byte[] local251 = Static475.aByteArrayArray25[local245];
			if (local251 != null) {
				local264 = (Static548.anIntArray650[local245] >> 8) * 64 - Static529.anInt8344;
				local274 = (Static548.anIntArray650[local245] & 0xFF) * 64 - Static463.anInt7588;
				if (Static282.anInt5183 != 0) {
					local264 = 10;
					local274 = 10;
				}
				local12 &= Static119.method2477(Static400.anInt6818, local274, local264, local251, Static271.anInt5050);
			}
			local251 = Static411.aByteArrayArray22[local245];
			if (local251 != null) {
				local264 = (Static548.anIntArray650[local245] >> 8) * 64 - Static529.anInt8344;
				local274 = (Static548.anIntArray650[local245] & 0xFF) * 64 - Static463.anInt7588;
				if (Static282.anInt5183 != 0) {
					local274 = 10;
					local264 = 10;
				}
				local12 &= Static119.method2477(Static400.anInt6818, local274, local264, local251, Static271.anInt5050);
			}
		}
		if (!local12) {
			Static506.anInt8040 = 2;
			return;
		}
		if (Static506.anInt8040 != 0) {
			Static392.method5757(Static4.aClass43_1, Static48.aClass33_14.method797(Static131.anInt2839) + "<br>(100%)", true, Static49.aClass117_1, Static103.aClass58_6);
		}
		Static66.method1526();
		Static65.method1513();
		@Pc(375) boolean local375 = false;
		if (Static4.aClass43_1.method7217() && Static278.aClass3_Sub13_Sub1_1.aBoolean404) {
			for (local264 = 0; local264 < Static240.aByteArrayArray13.length; local264++) {
				if (Static411.aByteArrayArray22[local264] != null || Static101.aByteArrayArray6[local264] != null) {
					local375 = true;
					break;
				}
			}
		}
		if (Static278.aClass3_Sub13_Sub1_1.aBoolean399) {
			local264 = Static253.anIntArray369[Static164.anInt3289];
		} else {
			local264 = Static341.anIntArray470[Static164.anInt3289];
		}
		if (Static4.aClass43_1.method7192()) {
			local264++;
		}
		Static327.method5083(Static4.aClass43_1, Static94.anInt2311, Static400.anInt6818, Static271.anInt5050, local264, local375, Static4.aClass43_1.method7159() > 0);
		if (Static351.aBoolean498) {
			Static4.method59(Static410.aClass117_8);
		} else {
			Static4.method59(null);
		}
		for (local274 = 0; local274 < 4; local274++) {
			Static221.aClass95Array2[local274].method2739();
		}
		Static428.method1624();
		Static7.method105(false);
		Static221.method5004();
		Static461.aClass242_1 = null;
		Static103.aBoolean199 = false;
		Static66.method1526();
		System.gc();
		Static355.method5325(true);
		Static484.method6592();
		Static118.anInt2701 = Static278.aClass3_Sub13_Sub1_1.method4464(Static260.anInt4932);
		Static14.aBoolean16 = Static278.aClass3_Sub13_Sub1_1.aBoolean404;
		Static12.aBoolean6 = Static597.anInt9433 >= 96;
		Static130.aBoolean241 = Static278.aClass3_Sub13_Sub1_1.method4457(Static260.anInt4932);
		Static504.aBoolean626 = !Static278.aClass3_Sub13_Sub1_1.aBoolean398;
		Static509.anInt8091 = Static278.aClass3_Sub13_Sub1_1.method4485(Static260.anInt4932) ? -1 : Static65.anInt1778;
		Static76.aBoolean164 = Static316.method7582(Static260.anInt4932) || Static278.aClass3_Sub13_Sub1_1.aBoolean412;
		Static265.aBoolean389 = Static278.aClass3_Sub13_Sub1_1.aBoolean410;
		Static589.aClass70_Sub1_2 = new Class70_Sub1(4, Static400.anInt6818, Static271.anInt5050, false);
		if (Static282.anInt5183 == 0) {
			Static446.method6257(Static240.aByteArrayArray13, Static589.aClass70_Sub1_2);
		} else {
			Static499.method6735(Static240.aByteArrayArray13, Static589.aClass70_Sub1_2);
		}
		Static451.method6283(Static400.anInt6818 >> 4, Static271.anInt5050 >> 4);
		Static62.method4288();
		if (local375) {
			Static226.method3890(true);
			Static37.aClass70_Sub1_1 = new Class70_Sub1(1, Static400.anInt6818, Static271.anInt5050, true);
			if (Static282.anInt5183 == 0) {
				Static446.method6257(Static101.aByteArrayArray6, Static37.aClass70_Sub1_1);
				Static355.method5325(true);
			} else {
				Static499.method6735(Static101.aByteArrayArray6, Static37.aClass70_Sub1_1);
				Static355.method5325(true);
			}
			Static37.aClass70_Sub1_1.method2204(Static589.aClass70_Sub1_2.anIntArrayArrayArray5[0]);
			Static37.aClass70_Sub1_1.method2211(null, null, Static4.aClass43_1);
			Static226.method3890(false);
		}
		Static589.aClass70_Sub1_2.method2211(Static221.aClass95Array2, local375 ? Static37.aClass70_Sub1_1.anIntArrayArrayArray5 : null, Static4.aClass43_1);
		if (Static282.anInt5183 == 0) {
			Static355.method5325(true);
			Static141.method2713(Static475.aByteArrayArray25, Static589.aClass70_Sub1_2);
			if (Static259.aByteArrayArray29 != null) {
				Static213.method3764();
			}
		} else {
			Static355.method5325(true);
			Static170.method2968(Static589.aClass70_Sub1_2, Static475.aByteArrayArray25);
		}
		Static65.method1513();
		if (Static597.anInt9433 < 96) {
			Static466.method7466();
		}
		Static355.method5325(true);
		Static589.aClass70_Sub1_2.method2202(local375 ? Static168.aClass139Array22[0] : null, null, Static4.aClass43_1);
		Static589.aClass70_Sub1_2.method2220(Static4.aClass43_1, false);
		Static355.method5325(true);
		if (local375) {
			Static226.method3890(true);
			Static355.method5325(true);
			if (Static282.anInt5183 == 0) {
				Static141.method2713(Static411.aByteArrayArray22, Static37.aClass70_Sub1_1);
			} else {
				Static170.method2968(Static37.aClass70_Sub1_1, Static411.aByteArrayArray22);
			}
			Static65.method1513();
			Static355.method5325(true);
			Static37.aClass70_Sub1_1.method2202(null, Static374.aClass139Array17[0], Static4.aClass43_1);
			Static37.aClass70_Sub1_1.method2220(Static4.aClass43_1, true);
			Static355.method5325(true);
			Static226.method3890(false);
		}
		Static585.method7724();
		@Pc(738) int local738 = Static589.aClass70_Sub1_2.anInt2476;
		if (Static209.anInt8182 < local738) {
			local738 = Static209.anInt8182;
		}
		if (Static209.anInt8182 - 1 > local738) {
			local738 = Static209.anInt8182 - 1;
		}
		if (Static278.aClass3_Sub13_Sub1_1.method4485(Static260.anInt4932)) {
			Static303.method4766(0);
		} else {
			Static303.method4766(local738);
		}
		@Pc(773) int local773;
		@Pc(777) int local777;
		for (@Pc(769) int local769 = 0; local769 < 4; local769++) {
			for (local773 = 0; local773 < Static400.anInt6818; local773++) {
				for (local777 = 0; local777 < Static271.anInt5050; local777++) {
					Static577.method3277(local777, local773, local769);
				}
			}
		}
		Static48.method799();
		Static66.method1526();
		Static169.method2949();
		Static65.method1513();
		Static74.method1678();
		@Pc(830) Class3_Sub34 local830;
		if (Static92.aFrame1 != null && Static78.aClass152_2 != null && Static246.anInt4542 == 11) {
			local830 = Static374.method5522(Static15.aClass298_10, Static220.aClass287_2);
			local830.aClass3_Sub11_Sub1_2.method3101(1057001181);
			Static131.method2572(local830);
		}
		if (Static282.anInt5183 == 0) {
			local773 = (Static16.anInt248 - (Static400.anInt6818 >> 4)) / 8;
			local777 = ((Static400.anInt6818 >> 4) + Static16.anInt248) / 8;
			@Pc(868) int local868 = (Static596.anInt9431 - (Static271.anInt5050 >> 4)) / 8;
			@Pc(876) int local876 = ((Static271.anInt5050 >> 4) + Static596.anInt9431) / 8;
			for (@Pc(880) int local880 = local773 - 1; local880 <= local777 + 1; local880++) {
				for (@Pc(886) int local886 = local868 - 1; local886 <= local876 + 1; local886++) {
					if (local880 < local773 || local880 > local777 || local868 > local886 || local886 > local876) {
						Static565.aClass246_261.method5659("m" + local880 + "_" + local886);
						Static565.aClass246_261.method5659("l" + local880 + "_" + local886);
					}
				}
			}
		}
		if (Static246.anInt4542 == 4) {
			Static113.method2374(3);
		} else if (Static246.anInt4542 == 8) {
			Static113.method2374(7);
		} else {
			Static113.method2374(10);
			if (Static78.aClass152_2 != null) {
				local830 = Static374.method5522(Static595.aClass298_181, Static220.aClass287_2);
				Static131.method2572(local830);
			}
		}
		Static167.method2944();
		Static66.method1526();
		Static488.method6648();
		if (Static198.aBoolean314) {
			Static369.method5492("Took: " + (Static587.method7753() - Static106.aLong64) + "ms");
			Static198.aBoolean314 = false;
		}
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(II)Z")
	public static boolean method5249(@OriginalArg(0) int arg0) {
		return arg0 == 0;
	}
}
