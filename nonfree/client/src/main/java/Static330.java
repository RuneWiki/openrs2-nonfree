import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!vc", name = "k", descriptor = "I")
	public static int anInt6364;

	@OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
	public static int anInt6365;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)I")
	public static int method5663(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 & 0x3F;
		@Pc(18) int local18 = arg0 >> 6 & 0x3;
		if (local7 == 18) {
			if (local18 == 0) {
				return 1;
			}
			if (local18 == 1) {
				return 2;
			}
			if (local18 == 2) {
				return 4;
			}
			if (local18 == 3) {
				return 8;
			}
		} else if (local7 == 19 || local7 == 21) {
			if (local18 == 0) {
				return 16;
			}
			if (local18 == 1) {
				return 32;
			}
			if (local18 == 2) {
				return 64;
			}
			if (local18 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
	public static void method5664() {
		Static124.method2598(false);
		Static207.anInt4120 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static334.aByteArrayArray26.length; local14++) {
			if (Static243.anIntArray430[local14] != -1 && Static334.aByteArrayArray26[local14] == null) {
				Static334.aByteArrayArray26[local14] = Static231.aClass143_85.method3745(Static243.anIntArray430[local14], 0);
				if (Static334.aByteArrayArray26[local14] == null) {
					local12 = false;
					Static207.anInt4120++;
				}
			}
			if (Static88.anIntArray193[local14] != -1 && Static196.aByteArrayArray14[local14] == null) {
				Static196.aByteArrayArray14[local14] = Static231.aClass143_85.method3733(Static88.anIntArray193[local14], 0, Static169.anIntArrayArray55[local14]);
				if (Static196.aByteArrayArray14[local14] == null) {
					Static207.anInt4120++;
					local12 = false;
				}
			}
			if (Static167.anIntArray485[local14] != -1 && Static196.aByteArrayArray13[local14] == null) {
				Static196.aByteArrayArray13[local14] = Static231.aClass143_85.method3745(Static167.anIntArray485[local14], 0);
				if (Static196.aByteArrayArray13[local14] == null) {
					local12 = false;
					Static207.anInt4120++;
				}
			}
			if (Static54.anIntArray80[local14] != -1 && Static113.aByteArrayArray6[local14] == null) {
				Static113.aByteArrayArray6[local14] = Static231.aClass143_85.method3745(Static54.anIntArray80[local14], 0);
				if (Static113.aByteArrayArray6[local14] == null) {
					local12 = false;
					Static207.anInt4120++;
				}
			}
			if (Static37.anIntArray55 != null && Static179.aByteArrayArray9[local14] == null && Static37.anIntArray55[local14] != -1) {
				Static179.aByteArrayArray9[local14] = Static231.aClass143_85.method3733(Static37.anIntArray55[local14], 0, Static169.anIntArrayArray55[local14]);
				if (Static179.aByteArrayArray9[local14] == null) {
					local12 = false;
					Static207.anInt4120++;
				}
			}
		}
		if (Static112.aClass163_1 == null) {
			if (Static166.aClass14_Sub2_Sub14_1 == null || !Static53.aClass143_37.method3743(Static166.aClass14_Sub2_Sub14_1.aString160 + "_staticelements")) {
				Static112.aClass163_1 = new Class163(0);
			} else if (Static53.aClass143_37.method3754(Static166.aClass14_Sub2_Sub14_1.aString160 + "_staticelements")) {
				Static112.aClass163_1 = Static77.method1918(Static53.aClass143_37, Static166.aClass14_Sub2_Sub14_1.aString160 + "_staticelements", Static15.aBoolean420);
			} else {
				local12 = false;
				Static207.anInt4120++;
			}
		}
		if (!local12) {
			Static70.anInt1686 = 1;
			return;
		}
		Static194.anInt3956 = 0;
		local12 = true;
		@Pc(271) int local271;
		@Pc(282) int local282;
		for (@Pc(253) int local253 = 0; local253 < Static334.aByteArrayArray26.length; local253++) {
			@Pc(259) byte[] local259 = Static196.aByteArrayArray14[local253];
			if (local259 != null) {
				local271 = (Static8.anIntArray9[local253] >> 8) * 64 - Static151.anInt3234;
				local282 = (Static8.anIntArray9[local253] & 0xFF) * 64 - Static251.anInt3170;
				if (Static54.aBoolean88) {
					local282 = 10;
					local271 = 10;
				}
				local12 &= Static240.method5764(local282, local259, local271);
			}
			local259 = Static113.aByteArrayArray6[local253];
			if (local259 != null) {
				local271 = (Static8.anIntArray9[local253] >> 8) * 64 - Static151.anInt3234;
				local282 = (Static8.anIntArray9[local253] & 0xFF) * 64 - Static251.anInt3170;
				if (Static54.aBoolean88) {
					local282 = 10;
					local271 = 10;
				}
				local12 &= Static240.method5764(local282, local259, local271);
			}
		}
		if (!local12) {
			Static70.anInt1686 = 2;
			return;
		}
		if (Static70.anInt1686 != 0) {
			Static162.method3226(Static84.aString78 + "<br>(100%)", true, Static245.aClass30_7);
		}
		Static151.method3006();
		Static244.method4283();
		@Pc(375) boolean local375 = false;
		if (Static218.aClass46_5.method5138() && Static185.aBoolean242) {
			for (local271 = 0; local271 < Static334.aByteArrayArray26.length; local271++) {
				if (Static113.aByteArrayArray6[local271] != null || Static196.aByteArrayArray13[local271] != null) {
					local375 = true;
					break;
				}
			}
		}
		if (Static134.aBoolean191) {
			local271 = Static216.anIntArray390[Static154.anInt3268];
		} else {
			local271 = Static196.anIntArray338[Static154.anInt3268];
		}
		if (Static218.aClass46_5.method5106()) {
			local271++;
		}
		Static162.method3224(Static195.anInt3965, Static298.anInt5716, local271, local375, Static218.aClass46_5.method5135() > 0);
		for (local282 = 0; local282 < 4; local282++) {
			Static75.aClass65Array1[local282].method2134();
		}
		Static86.method2096();
		Static147.method2546(false);
		Static121.method2573();
		Static151.method3006();
		System.gc();
		Static124.method2598(true);
		Static30.method746(false, 4);
		@Pc(465) int[][] local465 = null;
		if (!Static54.aBoolean88) {
			Static355.method6005(false);
			Static220.method3967(Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray535[0] >> 3, Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray536[0] >> 3);
			Static348.method4748();
			Static269.method4580(Static218.aClass46_5, 4, null, false);
			local465 = Static1.anIntArrayArrayArray12[0];
			Static124.method2598(true);
			Static348.method4756(false);
			if (Static179.aByteArrayArray9 != null) {
				Static175.method3433();
			}
		}
		if (Static54.aBoolean88) {
			Static138.method2789(false);
			Static220.method3967(Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray535[0] >> 3, Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray536[0] >> 3);
			Static348.method4748();
			Static269.method4580(Static218.aClass46_5, 4, null, false);
			local465 = Static1.anIntArrayArrayArray12[0];
			Static124.method2598(true);
			Static235.method4145(false);
		}
		Static244.method4283();
		Static124.method2598(true);
		Static221.method3975(false, 4, Static218.aClass46_5, Static75.aClass65Array1, null);
		Static289.method4962(4, Static218.aClass46_5);
		Static124.method2598(true);
		@Pc(570) int local570 = Static256.anInt4894;
		if (local570 > Static219.anInt4400) {
			local570 = Static219.anInt4400;
		}
		if (Static219.anInt4400 - 1 > local570) {
			local570 = Static219.anInt4400 - 1;
		}
		if (Static96.method2208()) {
			Static212.method3828(0);
		} else {
			Static212.method3828(local570);
		}
		Static64.method1511();
		if (local375) {
			Static319.method5482(true);
			Static30.method746(true, 1);
			if (!Static54.aBoolean88) {
				Static355.method6005(true);
				Static269.method4580(Static218.aClass46_5, 1, local465, true);
				Static124.method2598(true);
				Static348.method4756(true);
				Static289.method4962(1, Static218.aClass46_5);
			}
			if (Static54.aBoolean88) {
				Static138.method2789(true);
				Static269.method4580(Static218.aClass46_5, 1, local465, true);
				Static124.method2598(true);
				Static235.method4145(true);
			}
			Static244.method4283();
			Static124.method2598(true);
			Static221.method3975(true, 1, Static218.aClass46_5, Static75.aClass65Array1, Static18.aClass114Array1[0]);
			Static289.method4962(1, Static218.aClass46_5);
			Static124.method2598(true);
			Static64.method1511();
			Static319.method5482(false);
		}
		@Pc(683) int local683;
		@Pc(687) int local687;
		for (@Pc(679) int local679 = 0; local679 < 4; local679++) {
			for (local683 = 0; local683 < Static195.anInt3965; local683++) {
				for (local687 = 0; local687 < Static298.anInt5716; local687++) {
					Static82.method2034(local679, local687, local683);
				}
			}
		}
		Static224.method4014();
		Static151.method3006();
		Static58.method1316();
		Static244.method4283();
		Static239.aBoolean430 = false;
		Static153.method3020();
		if (Static277.aFrame2 != null && Static138.aClass159_3 != null && Static302.anInt5842 == 25) {
			Static164.aClass14_Sub4_Sub2_3.method2557(151);
			Static164.aClass14_Sub4_Sub2_3.method2541(1057001181);
		}
		if (!Static54.aBoolean88) {
			local683 = (Static217.anInt4356 - (Static195.anInt3965 >> 4)) / 8;
			local687 = ((Static195.anInt3965 >> 4) + Static217.anInt4356) / 8;
			@Pc(775) int local775 = (Static31.anInt735 - (Static298.anInt5716 >> 4)) / 8;
			@Pc(783) int local783 = ((Static298.anInt5716 >> 4) + Static31.anInt735) / 8;
			for (@Pc(787) int local787 = local683 - 1; local787 <= local687 + 1; local787++) {
				for (@Pc(793) int local793 = local775 - 1; local793 <= local783 + 1; local793++) {
					if (local683 > local787 || local687 < local787 || local775 > local793 || local793 > local783) {
						Static231.aClass143_85.method3764("m" + local787 + "_" + local793);
						Static231.aClass143_85.method3764("l" + local787 + "_" + local793);
					}
				}
			}
		}
		if (Static302.anInt5842 == 28) {
			Static67.method1662(10);
		} else {
			Static67.method1662(30);
			if (Static138.aClass159_3 != null) {
				Static164.aClass14_Sub4_Sub2_3.method2557(135);
			}
		}
		Static155.method3048();
		Static151.method3006();
		Static187.method3587();
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V")
	public static void method5665() {
		try {
			if (Static106.anInt2365 == 1) {
				@Pc(14) int local14 = Static143.aClass14_Sub19_Sub4_2.method5521();
				if (local14 > 0 && Static143.aClass14_Sub19_Sub4_2.method5540()) {
					local14 -= Static185.anInt3817;
					if (local14 < 0) {
						local14 = 0;
					}
					Static143.aClass14_Sub19_Sub4_2.method5536(local14);
				} else {
					Static143.aClass14_Sub19_Sub4_2.method5545();
					Static143.aClass14_Sub19_Sub4_2.method5528();
					Static36.aClass55_1 = null;
					if (Static285.aClass143_100 == null) {
						Static106.anInt2365 = 0;
					} else {
						Static106.anInt2365 = 2;
					}
					Static339.aClass14_Sub21_3 = null;
				}
			}
		} catch (@Pc(59) Exception local59) {
			local59.printStackTrace();
			Static143.aClass14_Sub19_Sub4_2.method5545();
			Static339.aClass14_Sub21_3 = null;
			Static285.aClass143_100 = null;
			Static106.anInt2365 = 0;
			Static36.aClass55_1 = null;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)I")
	public static int method5666() {
		return 2;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I[BZ)Ljava/lang/Object;")
	public static Object method5667(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static77.aBoolean125) {
			try {
				@Pc(18) Class94 local18 = (Class94) Class.forName("Class94_Sub1").getDeclaredConstructor().newInstance();
				local18.method2745(arg0);
				return local18;
			} catch (@Pc(25) Throwable local25) {
				Static77.aBoolean125 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(BB)V")
	public static void method5668(@OriginalArg(0) byte arg0) {
		if (Static124.aByteArrayArrayArray6 == null) {
			Static124.aByteArrayArrayArray6 = new byte[4][Static195.anInt3965][Static298.anInt5716];
		}
		for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static195.anInt3965; local18++) {
				for (@Pc(22) int local22 = 0; local22 < Static298.anInt5716; local22++) {
					Static124.aByteArrayArrayArray6[local14][local18][local22] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)V")
	public static void method5672(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class14_Sub2_Sub13 local8 = Static1.method5711(14, arg0);
		local8.method3540();
		local8.anInt3805 = arg1;
	}
}
