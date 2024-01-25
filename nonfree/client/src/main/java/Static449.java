import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static449 {

	@OriginalMember(owner = "client!sk", name = "C", descriptor = "Lclient!raa;")
	public static final Class246 aClass246_4 = new Class246();

	@OriginalMember(owner = "client!sk", name = "cb", descriptor = "I")
	public static int anInt7876 = -1;

	@OriginalMember(owner = "client!sk", name = "gb", descriptor = "[I")
	public static final int[] anIntArray729 = new int[] { 4, 4, 1, 2, 6, 4, 2, 45, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!sk", name = "hb", descriptor = "I")
	public static int anInt7879 = -1;

	@OriginalMember(owner = "client!sk", name = "f", descriptor = "(B)V")
	public static void method6955() {
		Static99.method2036(false);
		Static519.anInt2064 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static464.aByteArrayArray24.length; local14++) {
			if (Static46.anIntArray85[local14] != -1 && Static464.aByteArrayArray24[local14] == null) {
				Static464.aByteArrayArray24[local14] = Static10.aClass69_4.method1888(0, Static46.anIntArray85[local14]);
				if (Static464.aByteArrayArray24[local14] == null) {
					local12 = false;
					Static519.anInt2064++;
				}
			}
			if (Static487.anIntArray754[local14] != -1 && Static268.aByteArrayArray15[local14] == null) {
				Static268.aByteArrayArray15[local14] = Static10.aClass69_4.method1903(Static16.anIntArrayArray125[local14], Static487.anIntArray754[local14], 0);
				if (Static268.aByteArrayArray15[local14] == null) {
					Static519.anInt2064++;
					local12 = false;
				}
			}
			if (Static214.anIntArray337[local14] != -1 && Static373.aByteArrayArray19[local14] == null) {
				Static373.aByteArrayArray19[local14] = Static10.aClass69_4.method1888(0, Static214.anIntArray337[local14]);
				if (Static373.aByteArrayArray19[local14] == null) {
					Static519.anInt2064++;
					local12 = false;
				}
			}
			if (Static395.anIntArray676[local14] != -1 && Static473.aByteArrayArray25[local14] == null) {
				Static473.aByteArrayArray25[local14] = Static10.aClass69_4.method1888(0, Static395.anIntArray676[local14]);
				if (Static473.aByteArrayArray25[local14] == null) {
					local12 = false;
					Static519.anInt2064++;
				}
			}
			if (Static144.anIntArray245 != null && Static77.aByteArrayArray10[local14] == null && Static144.anIntArray245[local14] != -1) {
				Static77.aByteArrayArray10[local14] = Static10.aClass69_4.method1903(Static16.anIntArrayArray125[local14], Static144.anIntArray245[local14], 0);
				if (Static77.aByteArrayArray10[local14] == null) {
					local12 = false;
					Static519.anInt2064++;
				}
			}
		}
		if (Static260.aClass214_3 == null) {
			if (Static220.aClass1_Sub2_Sub12_1 == null || !Static11.aClass69_6.method1883(Static220.aClass1_Sub2_Sub12_1.aString153 + "_staticelements")) {
				Static260.aClass214_3 = new Class214(0);
			} else if (Static11.aClass69_6.method1908(Static220.aClass1_Sub2_Sub12_1.aString153 + "_staticelements")) {
				Static260.aClass214_3 = Static451.method6970(Static11.aClass69_6, Static220.aClass1_Sub2_Sub12_1.aString153 + "_staticelements", Static343.aBoolean696);
			} else {
				Static519.anInt2064++;
				local12 = false;
			}
		}
		if (!local12) {
			Static134.anInt2698 = 1;
			return;
		}
		local12 = true;
		Static264.anInt9555 = 0;
		@Pc(270) int local270;
		@Pc(280) int local280;
		for (@Pc(251) int local251 = 0; local251 < Static464.aByteArrayArray24.length; local251++) {
			@Pc(257) byte[] local257 = Static268.aByteArrayArray15[local251];
			if (local257 != null) {
				local270 = (Static378.anIntArray656[local251] >> 8) * 64 - Static538.anInt9485;
				local280 = (Static378.anIntArray656[local251] & 0xFF) * 64 - Static282.anInt5380;
				if (Static61.anInt1489 != 0) {
					local270 = 10;
					local280 = 10;
				}
				local12 &= Static343.method8033(local257, Static237.anInt4563, Static373.anInt6694, local270, local280);
			}
			local257 = Static473.aByteArrayArray25[local251];
			if (local257 != null) {
				local270 = (Static378.anIntArray656[local251] >> 8) * 64 - Static538.anInt9485;
				local280 = (Static378.anIntArray656[local251] & 0xFF) * 64 - Static282.anInt5380;
				if (Static61.anInt1489 != 0) {
					local270 = 10;
					local280 = 10;
				}
				local12 &= Static343.method8033(local257, Static237.anInt4563, Static373.anInt6694, local270, local280);
			}
		}
		if (!local12) {
			Static134.anInt2698 = 2;
			return;
		}
		if (Static134.anInt2698 != 0) {
			Static433.method6712(Static246.aClass45_71.method1474(Static544.anInt7853) + "<br>(100%)", true, Static186.aClass36_1);
		}
		Static422.method6584();
		Static519.method1985();
		@Pc(383) boolean local383 = false;
		if (Static455.aClass4_11.method7219() && Static286.aClass1_Sub15_Sub1_1.aBoolean532) {
			for (local270 = 0; local270 < Static464.aByteArrayArray24.length; local270++) {
				if (Static473.aByteArrayArray25[local270] != null || Static373.aByteArrayArray19[local270] != null) {
					local383 = true;
					break;
				}
			}
		}
		if (Static286.aClass1_Sub15_Sub1_1.aBoolean523) {
			local270 = Static470.anIntArray671[Static344.anInt6329];
		} else {
			local270 = Static395.anIntArray678[Static344.anInt6329];
		}
		if (Static455.aClass4_11.method7151()) {
			local270++;
		}
		Static68.method1683(Static237.anInt4563, Static373.anInt6694, local270, local383, Static455.aClass4_11.method7163() > 0);
		for (local280 = 0; local280 < 4; local280++) {
			Static362.aClass243Array5[local280].method6471();
		}
		Static33.method5998();
		Static282.method4959(false);
		Static465.method7072();
		Static250.aBoolean369 = false;
		Static516.aClass62_1 = null;
		Static422.method6584();
		System.gc();
		Static99.method2036(true);
		Static526.method8052();
		Static275.anInt5266 = Static286.aClass1_Sub15_Sub1_1.method6358(anInt7876);
		Static33.aBoolean495 = Static286.aClass1_Sub15_Sub1_1.aBoolean532;
		Static138.aBoolean688 = Static520.anInt9181 >= 96;
		Static18.aBoolean20 = Static286.aClass1_Sub15_Sub1_1.method6361(anInt7876);
		Static524.aBoolean694 = !Static286.aClass1_Sub15_Sub1_1.aBoolean525;
		Static398.anInt7022 = Static286.aClass1_Sub15_Sub1_1.method6381(anInt7876) ? -1 : Static514.anInt9103;
		Static44.aBoolean697 = Static91.method7968(anInt7876) || Static286.aClass1_Sub15_Sub1_1.aBoolean534;
		Static145.aBoolean248 = Static286.aClass1_Sub15_Sub1_1.aBoolean527;
		Static107.aClass102_Sub1_1 = new Class102_Sub1(4, Static237.anInt4563, Static373.anInt6694, false);
		if (Static61.anInt1489 == 0) {
			Static192.method547(Static464.aByteArrayArray24, Static107.aClass102_Sub1_1);
		} else {
			Static482.method7477(Static464.aByteArrayArray24, Static107.aClass102_Sub1_1);
		}
		Static91.method7970(Static373.anInt6694 >> 4, Static237.anInt4563 >> 4);
		Static435.method6758();
		if (local383) {
			Static355.method5829(true);
			Static363.aClass102_Sub1_2 = new Class102_Sub1(1, Static237.anInt4563, Static373.anInt6694, true);
			if (Static61.anInt1489 == 0) {
				Static192.method547(Static373.aByteArrayArray19, Static363.aClass102_Sub1_2);
				Static99.method2036(true);
			} else {
				Static482.method7477(Static373.aByteArrayArray19, Static363.aClass102_Sub1_2);
				Static99.method2036(true);
			}
			Static363.aClass102_Sub1_2.method7846(Static107.aClass102_Sub1_1.anIntArrayArrayArray20[0]);
			Static363.aClass102_Sub1_2.method7841(null, Static455.aClass4_11, null);
			Static355.method5829(false);
		}
		Static107.aClass102_Sub1_1.method7841(Static362.aClass243Array5, Static455.aClass4_11, local383 ? Static363.aClass102_Sub1_2.anIntArrayArrayArray20 : null);
		if (Static61.anInt1489 == 0) {
			Static99.method2036(true);
			Static409.method6504(Static107.aClass102_Sub1_1, Static268.aByteArrayArray15);
			if (Static77.aByteArrayArray10 != null) {
				Static425.method6632();
			}
		} else {
			Static99.method2036(true);
			Static149.method6357(Static107.aClass102_Sub1_1, Static268.aByteArrayArray15);
		}
		Static519.method1985();
		if (Static520.anInt9181 < 96) {
			Static210.method3879();
		}
		Static99.method2036(true);
		Static107.aClass102_Sub1_1.method7839(Static455.aClass4_11, local383 ? Static207.aClass7Array7[0] : null, null);
		Static107.aClass102_Sub1_1.method7860(Static455.aClass4_11);
		Static99.method2036(true);
		if (local383) {
			Static355.method5829(true);
			Static99.method2036(true);
			if (Static61.anInt1489 == 0) {
				Static409.method6504(Static363.aClass102_Sub1_2, Static473.aByteArrayArray25);
			} else {
				Static149.method6357(Static363.aClass102_Sub1_2, Static473.aByteArrayArray25);
			}
			Static519.method1985();
			Static99.method2036(true);
			Static363.aClass102_Sub1_2.method7839(Static455.aClass4_11, null, Static411.aClass7Array12[0]);
			Static363.aClass102_Sub1_2.method7860(Static455.aClass4_11);
			Static99.method2036(true);
			Static355.method5829(false);
		}
		Static514.method7869();
		@Pc(731) int local731 = Static107.aClass102_Sub1_1.anInt9091;
		if (local731 > Static322.anInt6113) {
			local731 = Static322.anInt6113;
		}
		if (Static322.anInt6113 - 1 > local731) {
			local731 = Static322.anInt6113 - 1;
		}
		if (Static286.aClass1_Sub15_Sub1_1.method6381(anInt7876)) {
			Static320.method5474(0);
		} else {
			Static320.method5474(local731);
		}
		@Pc(766) int local766;
		@Pc(770) int local770;
		for (@Pc(762) int local762 = 0; local762 < 4; local762++) {
			for (local766 = 0; local766 < Static237.anInt4563; local766++) {
				for (local770 = 0; local770 < Static373.anInt6694; local770++) {
					Static388.method6198(local770, local766, local762);
				}
			}
		}
		Static441.method6824();
		Static422.method6584();
		Static407.method6486();
		Static519.method1985();
		Static77.method1769();
		if (Static306.aFrame2 != null && Static200.aClass134_2 != null && Static186.anInt3863 == 10) {
			Static216.method3997(Static20.aClass252_6);
			Static259.aClass1_Sub17_Sub2_1.method4489(1057001181);
		}
		if (Static61.anInt1489 == 0) {
			local766 = (Static388.anInt6883 - (Static237.anInt4563 >> 4)) / 8;
			local770 = ((Static237.anInt4563 >> 4) + Static388.anInt6883) / 8;
			@Pc(852) int local852 = (Static225.anInt4357 - (Static373.anInt6694 >> 4)) / 8;
			@Pc(861) int local861 = (Static225.anInt4357 + (Static373.anInt6694 >> 4)) / 8;
			for (@Pc(865) int local865 = local766 - 1; local865 <= local770 + 1; local865++) {
				for (@Pc(871) int local871 = local852 - 1; local871 <= local861 + 1; local871++) {
					if (local865 < local766 || local770 < local865 || local852 > local871 || local871 > local861) {
						Static10.aClass69_4.method1887("m" + local865 + "_" + local871);
						Static10.aClass69_4.method1887("l" + local865 + "_" + local871);
					}
				}
			}
		}
		if (Static186.anInt3863 == 3) {
			Static506.method7745(2);
		} else if (Static186.anInt3863 == 7) {
			Static506.method7745(6);
		} else {
			Static506.method7745(9);
			if (Static200.aClass134_2 != null) {
				Static216.method3997(Static197.aClass252_57);
			}
		}
		Static522.method7944();
		Static422.method6584();
		Static175.method3240();
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(JBLclient!qa;)V")
	public static void method6956(@OriginalArg(0) long arg0, @OriginalArg(2) Class4 arg1) {
		Static437.anInt4598 = 0;
		Static166.anInt3382 = Static460.anInt7966;
		Static460.anInt7966 = 0;
		@Pc(19) long local19 = Static110.method2222();
		for (@Pc(24) Class46_Sub7 local24 = (Class46_Sub7) Static448.aClass184_36.method5138(); local24 != null; local24 = (Class46_Sub7) Static448.aClass184_36.method5145()) {
			if (local24.method7413(arg1, arg0)) {
				Static437.anInt4598++;
			}
		}
		if (Static453.aBoolean586 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static448.aClass184_36.method5144() + ", running: " + Static437.anInt4598 + ". Particles: " + Static460.anInt7966 + ". Time taken: " + (Static110.method2222() - local19) + "ms");
		}
	}

	@OriginalMember(owner = "client!sk", name = "e", descriptor = "(I)V")
	public static void method6959() {
		@Pc(5) int local5 = 0;
		if (Static286.aClass1_Sub15_Sub1_1.method6361(anInt7876)) {
			local5 = 55;
		}
		if (!Static286.aClass1_Sub15_Sub1_1.aBoolean527) {
			local5 |= 0x40;
		}
		Static484.method7505(local5);
		Static398.aClass18_4.method597(local5);
		Static181.aClass316_1.method8100(local5);
		Static358.aClass95_1.method2355(local5);
		Static530.aClass195_2.method5438(local5);
		Static422.method6585(local5);
		Static294.method5135(local5);
		Static450.method6965(local5);
		Static180.method3530(local5);
		Static473.method7370();
	}

	@OriginalMember(owner = "client!sk", name = "h", descriptor = "(B)I")
	public static int method6960() {
		@Pc(12) Class277 local12 = Static346.aClass277_50;
		synchronized (Static346.aClass277_50) {
			return Static346.aClass277_50.method7017();
		}
	}

	@OriginalMember(owner = "client!sk", name = "i", descriptor = "(B)V")
	public static void method6961() {
		if (Static340.aClass311_2 == null) {
			return;
		}
		if (Static340.aClass311_2.anInt9169 == 1) {
			Static340.aClass311_2 = null;
			return;
		}
		if (Static340.aClass311_2.anInt9169 == 2) {
			Static314.method5434(Static274.aClass229_9, 2, Static148.aString60);
			Static340.aClass311_2 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)I")
	public static int method6962(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
