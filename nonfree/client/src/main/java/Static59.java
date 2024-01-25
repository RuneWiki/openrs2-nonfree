import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!cr", name = "i", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_20 = new Class231("purple:", "lila:", "violet:", "roxo:");

	@OriginalMember(owner = "client!cr", name = "l", descriptor = "[I")
	public static final int[] anIntArray104 = new int[4096];

	@OriginalMember(owner = "client!cr", name = "m", descriptor = "[[I")
	public static final int[][] anIntArrayArray9 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!cr", name = "p", descriptor = "I")
	public static int anInt1234 = 0;

	@OriginalMember(owner = "client!cr", name = "q", descriptor = "I")
	public static int anInt1235 = 0;

	@OriginalMember(owner = "client!cr", name = "t", descriptor = "Z")
	public static boolean aBoolean106 = true;

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IB)V")
	public static void method1102(@OriginalArg(0) int arg0) {
		if (Static367.method5802(arg0)) {
			Static144.method2410(Static129.aClass239ArrayArray1[arg0], -1);
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lclient!ft;IIILclient!qq;)V")
	public static void method1103(@OriginalArg(0) Class88 arg0, @OriginalArg(4) Class28 arg1) {
		Static200.aClass88_31.method1887();
		if (Static393.aBoolean382) {
			return;
		}
		for (@Pc(24) Class6_Sub24 local24 = (Class6_Sub24) arg0.method1882(); local24 != null; local24 = (Class6_Sub24) arg0.method1891()) {
			@Pc(32) Class94 local32 = Static36.aClass254_5.method5834(local24.anInt4802);
			if (Static406.method5559(local32)) {
				@Pc(44) boolean local44 = Static33.method697(local24, arg1, local32);
				if (local44) {
					Static177.method2790(local32, local24, arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IBI)I")
	public static int method1104(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static182.anIntArray293[arg0 & 0x3] : Static14.anIntArray17[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILclient!qq;)V")
	public static void method1105(@OriginalArg(1) Class28 arg0) {
		if (Static228.anInt3878 < 2 && !Static274.aBoolean336 || Static332.aClass239_12 != null) {
			return;
		}
		@Pc(44) String local44;
		if (Static274.aBoolean336 && Static228.anInt3878 < 2) {
			local44 = Static26.aString21 + Static198.aClass231_59.method5138(Static382.anInt6289) + Static263.aString38 + " ->";
		} else if (Static219.aBoolean247 && Static326.aClass86_1.method1867(81) && Static228.anInt3878 > 2) {
			local44 = Static33.method703((Class6_Sub33) Static307.aClass88_23.aClass6_73.aClass6_251.aClass6_251);
		} else {
			@Pc(73) Class6_Sub33 local73 = (Class6_Sub33) Static307.aClass88_23.aClass6_73.aClass6_251;
			local44 = Static33.method703(local73);
			@Pc(79) int[] local79 = null;
			if (Static305.method4412(local73.anInt5954)) {
				local79 = Static354.aClass170_2.method3865((int) local73.aLong176).anIntArray48;
			} else if (local73.anInt5955 != -1) {
				local79 = Static354.aClass170_2.method3865(local73.anInt5955).anIntArray48;
			} else if (Static302.method4398(local73.anInt5954)) {
				@Pc(151) Class3_Sub3_Sub6_Sub2 local151 = Static450.aClass3_Sub3_Sub6_Sub2Array1[(int) local73.aLong176];
				if (local151 != null) {
					@Pc(156) Class17 local156 = local151.aClass17_1;
					if (local156.anIntArray26 != null) {
						local156 = local156.method288(Static71.aClass126_1);
					}
					if (local156 != null) {
						local79 = local156.anIntArray27;
					}
				}
			} else if (Static259.method3996(local73.anInt5954)) {
				@Pc(119) Class118 local119;
				if (local73.anInt5954 == 1009) {
					local119 = Static113.aClass127_2.method2820((int) local73.aLong176);
				} else {
					local119 = Static113.aClass127_2.method2820((int) (local73.aLong176 >>> 32 & 0x7FFFFFFFL));
				}
				if (local119.anIntArray273 != null) {
					local119 = local119.method2718(Static71.aClass126_1);
				}
				if (local119 != null) {
					local79 = local119.anIntArray272;
				}
			}
			if (local79 != null) {
				local44 = local44 + Static420.method5693(local79);
			}
		}
		if (Static228.anInt3878 > 2) {
			local44 = local44 + "<col=ffffff> / " + (Static228.anInt3878 - 2) + Static173.aClass231_46.method5138(Static382.anInt6289);
		}
		if (Static118.aClass239_5 != null) {
			@Pc(221) Class92 local221 = Static118.aClass239_5.method5367(arg0);
			if (local221 == null) {
				local221 = Static45.aClass92_1;
			}
			local221.method5648(Static118.aClass239_5.anInt6431, Static118.aClass239_5.anInt6450, Static62.anIntArray111, local44, Static182.aRandom1, Static118.aClass239_5.anInt6435, Static320.anIntArray466, Static118.aClass239_5.anInt6420, Static361.anInt6103, Static330.anInt4434, Static411.anInt6897, Static118.aClass239_5.anInt6408, Static136.aClass12Array7, Static118.aClass239_5.anInt6427);
			Static87.method1534(Static62.anIntArray111[1], Static62.anIntArray111[3], Static62.anIntArray111[2], Static62.anIntArray111[0]);
		} else if (Static64.aClass239_2 != null && Static323.aClass44_4 == Static307.aClass44_2) {
			@Pc(286) int local286 = Static45.aClass92_1.method5637(Static320.anIntArray466, Static136.aClass12Array7, Static375.anInt6236 + 16, Static324.anInt5293 + 4, Static411.anInt6897, local44, Static182.aRandom1);
			Static87.method1534(Static375.anInt6236, 16, local286 + Static252.aClass201_5.method4452(local44), Static324.anInt5293 - -4);
		}
	}
}
