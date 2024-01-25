import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!gda", name = "p", descriptor = "Lclient!be;")
	public static Class28 aClass28_2;

	@OriginalMember(owner = "client!gda", name = "q", descriptor = "Lclient!ha;")
	public static Class33 aClass33_7;

	@OriginalMember(owner = "client!gda", name = "u", descriptor = "I")
	public static int anInt4141;

	@OriginalMember(owner = "client!gda", name = "x", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray15;

	@OriginalMember(owner = "client!gda", name = "d", descriptor = "(II)Z")
	public static boolean method3568(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!gda", name = "c", descriptor = "(I)V")
	public static void method3571() {
		try {
			@Pc(18) int local18;
			if (Static565.anInt9608 == 1) {
				local18 = Static522.aClass3_Sub7_Sub5_4.method6033();
				if (local18 > 0 && Static522.aClass3_Sub7_Sub5_4.method6026()) {
					local18 -= Static370.anInt7046;
					if (local18 < 0) {
						local18 = 0;
					}
					Static522.aClass3_Sub7_Sub5_4.method6043(local18);
					return;
				}
				Static522.aClass3_Sub7_Sub5_4.method6023();
				Static522.aClass3_Sub7_Sub5_4.method6036();
				Static622.aClass58_5 = null;
				Static513.aClass3_Sub33_2 = null;
				if (Static110.aClass181_22 == null) {
					Static565.anInt9608 = 0;
				} else {
					Static565.anInt9608 = 2;
				}
			}
			if (Static565.anInt9608 == 3) {
				local18 = Static522.aClass3_Sub7_Sub5_4.method6033();
				if (local18 < Static458.anInt8332 && Static522.aClass3_Sub7_Sub5_4.method6026()) {
					local18 += Static135.anInt3494;
					if (local18 > Static458.anInt8332) {
						local18 = Static458.anInt8332;
					}
					Static522.aClass3_Sub7_Sub5_4.method6043(local18);
				} else {
					Static565.anInt9608 = 0;
					Static135.anInt3494 = 0;
				}
			}
		} catch (@Pc(98) Exception local98) {
			local98.printStackTrace();
			Static522.aClass3_Sub7_Sub5_4.method6023();
			Static110.aClass181_22 = null;
			Static513.aClass3_Sub33_2 = null;
			Static565.anInt9608 = 0;
			Static218.aClass3_Sub7_Sub5_1 = null;
			Static622.aClass58_5 = null;
		}
	}

	@OriginalMember(owner = "client!gda", name = "f", descriptor = "(B)I")
	public static int method3573() {
		@Pc(8) int local8;
		if (Static552.aClass3_Sub48_30.aClass23_Sub15_1.method4695() == 0) {
			for (local8 = 0; local8 < Static343.anInt6755; local8++) {
				if (Static124.anInterface13Array1[local8].method745() == 's' || Static124.anInterface13Array1[local8].method745() == 'S') {
					Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub15_1, 1);
					Static375.aBoolean619 = true;
					break;
				}
			}
		}
		@Pc(65) int local65;
		if (Static411.aClass251_1 == Static531.aClass251_22) {
			@Pc(56) Runtime local56 = Runtime.getRuntime();
			local65 = (int) ((local56.totalMemory() - local56.freeMemory()) / 1024L);
			@Pc(68) long local68 = Static444.method6719();
			if (Static544.aLong243 == 0L) {
				Static544.aLong243 = local68;
			}
			if (local65 > 16384 && local68 - Static544.aLong243 < 5000L) {
				if (local68 - Static420.aLong192 > 1000L) {
					System.gc();
					Static420.aLong192 = local68;
				}
				return 0;
			}
		}
		if (Static531.aClass251_22 == Static411.aClass251_2) {
			if (Static638.aClass331_1 == null) {
				Static638.aClass331_1 = new Class331(Static262.aClass65_2, Static366.aClass126_2, Static94.aBigInteger1, Static438.aBigInteger2);
			}
			if (!Static638.aClass331_1.method7987()) {
				return 0;
			}
			Static535.method5415(0, null, true);
			Static1.aBoolean870 = !Static403.method3685();
			Static425.aClass181_102 = Static196.method3926(1, Static1.aBoolean870 ? 34 : 32, false);
			Static469.aClass181_96 = Static196.method3926(1, 33, false);
			Static340.aClass181_62 = Static196.method3926(1, 13, false);
		}
		@Pc(158) boolean local158;
		if (Static411.aClass251_3 == Static531.aClass251_22) {
			local158 = Static469.aClass181_96.method5042();
			local65 = Static215.aClass120_Sub1Array1[33].method3840();
			local65 += Static215.aClass120_Sub1Array1[Static1.aBoolean870 ? 34 : 32].method3840();
			local65 += Static215.aClass120_Sub1Array1[13].method3840();
			local65 += local158 ? 100 : Static469.aClass181_96.method5045();
			if (local65 != 400) {
				return local65 / 4;
			}
			Static594.anInt9913 = Static425.aClass181_102.method5046();
			Static179.anInt4236 = Static469.aClass181_96.method5046();
			Static207.method4081(Static425.aClass181_102);
			@Pc(219) int local219 = Static552.aClass3_Sub48_30.aClass23_Sub2_1.method698();
			Static556.aClass154_1 = new Class154(Static648.aClass62_16, Static380.anInt7247, Static469.aClass181_96);
			@Pc(231) int[] local231 = Static556.aClass154_1.method4767(local219);
			if (local231.length == 0) {
				local231 = Static556.aClass154_1.method4767(0);
			}
			@Pc(248) Class233 local248 = new Class233(Static425.aClass181_102, Static340.aClass181_62);
			if (local231.length > 0) {
				Static284.anInterface15Array1 = new Interface15[local231.length];
				for (@Pc(260) int local260 = 0; local260 < Static284.anInterface15Array1.length; local260++) {
					Static284.anInterface15Array1[local260] = new Class226(Static556.aClass154_1.method4769(local231[local260]), local248);
				}
			}
		}
		if (Static411.aClass251_4 == Static531.aClass251_22) {
			Static193.method3835(Static376.method5967(), Static425.aClass181_102, Static340.aClass181_62);
		}
		if (Static531.aClass251_22 == Static411.aClass251_5) {
			local8 = Static140.method3137();
			local65 = Static258.method4833();
			if (local8 < local65) {
				return local8 * 100 / local65;
			}
		}
		if (Static411.aClass251_6 == Static531.aClass251_22) {
			if (Static284.anInterface15Array1 != null && Static284.anInterface15Array1.length > 0) {
				if (Static284.anInterface15Array1[0].method7159() < 100) {
					return 0;
				}
				if (Static284.anInterface15Array1.length > 1 && Static556.aClass154_1.method4768() && Static284.anInterface15Array1[1].method7159() < 100) {
					return 0;
				}
			}
			Static394.method6305(Static47.aClass33_3);
			Static331.method5538(Static47.aClass33_3);
			Static182.method3694(1);
		}
		if (Static411.aClass251_7 == Static531.aClass251_22) {
			for (local8 = 0; local8 < 4; local8++) {
				Static334.aClass291Array20[local8] = Static441.method6696(Static394.anInt7540, Static462.anInt8391);
			}
		}
		if (Static531.aClass251_22 == Static411.aClass251_8) {
			Static150.aClass181_34 = Static196.method3926(1, 8, false);
			Static108.aClass181_21 = Static196.method3926(1, 0, false);
			Static378.aClass181_69 = Static196.method3926(1, 1, false);
			Static187.aClass181_36 = Static196.method3926(1, 2, false);
			Static243.aClass181_54 = Static196.method3926(1, 3, false);
			Static462.aClass181_92 = Static196.method3926(1, 4, false);
			Static123.aClass181_28 = Static196.method3926(1, 5, true);
			Static399.aClass181_75 = Static196.method3926(1, 6, true);
			Static412.aClass181_78 = Static196.method3926(1, 7, false);
			Static511.aClass181_104 = Static196.method3926(1, 9, false);
			Static639.aClass181_133 = Static196.method3926(1, 10, false);
			Static474.aClass181_98 = Static196.method3926(1, 11, false);
			Static347.aClass181_63 = Static196.method3926(1, 12, false);
			Static349.aClass181_64 = Static196.method3926(1, 14, false);
			Static35.aClass181_3 = Static196.method3926(1, 15, false);
			Static493.aClass181_100 = Static196.method3926(1, 16, false);
			Static34.aClass181_2 = Static196.method3926(1, 17, false);
			Static293.aClass181_57 = Static196.method3926(1, 18, false);
			Static387.aClass181_73 = Static196.method3926(1, 19, false);
			Static574.aClass181_117 = Static196.method3926(1, 20, false);
			Static37.aClass181_5 = Static196.method3926(1, 21, false);
			Static113.aClass181_128 = Static196.method3926(1, 22, false);
			Static35.aClass181_4 = Static196.method3926(1, 23, true);
			Static568.aClass181_115 = Static196.method3926(1, 24, false);
			Static465.aClass181_93 = Static196.method3926(1, 25, false);
			Static226.aClass181_47 = Static196.method3926(1, 26, true);
			Static433.aClass181_81 = Static196.method3926(1, 27, false);
			Static496.aClass181_101 = Static196.method3926(1, 28, true);
			Static58.aClass181_9 = Static196.method3926(1, 29, false);
			Static139.aClass181_31 = Static196.method3926(1, 30, true);
			Static393.aClass181_30 = Static196.method3926(1, 31, true);
			Static515.aClass181_107 = Static196.method3926(2, 36, true);
		}
		if (Static411.aClass251_9 == Static531.aClass251_22) {
			local8 = 0;
			for (local65 = 0; local65 < 37; local65++) {
				if (Static215.aClass120_Sub1Array1[local65] != null) {
					local8 += Static215.aClass120_Sub1Array1[local65].method3840() * Static518.anIntArray612[local65] / 100;
				}
			}
			if (local8 != 100) {
				if (Static420.anInt7819 < 0) {
					Static420.anInt7819 = local8;
				}
				return (local8 - Static420.anInt7819) * 100 / (100 - Static420.anInt7819);
			}
			Static592.method8109(Static150.aClass181_34);
			Static193.method3835(Static376.method5967(), Static150.aClass181_34, Static340.aClass181_62);
		}
		if (Static411.aClass251_10 == Static531.aClass251_22) {
			if (Static20.anInt213 == -1) {
				Static20.anInt213 = Static399.aClass181_75.method5033("scape main");
			}
			Static513.method7414();
			Static182.method3694(2);
		}
		if (Static531.aClass251_22 == Static411.aClass251_11) {
			Static618.method8387(Static379.aClass228_6, Static139.aClass181_31);
		}
		if (Static411.aClass251_12 == Static531.aClass251_22) {
			local8 = Static584.method8055();
			if (local8 < 100) {
				return local8;
			}
			Static487.method7153(Static496.aClass181_101.method5049(1));
			Static275.method4944(Static496.aClass181_101.method5049(3));
		}
		if (Static531.aClass251_22 == Static411.aClass251_13) {
			if (Static130.anInt3199 != -1 && !Static412.aClass181_78.method5024(0, Static130.anInt3199)) {
				return 99;
			}
			Static641.anInterface5_12 = new Class273(Static226.aClass181_47, Static511.aClass181_104, Static150.aClass181_34);
			Static513.aClass49_2 = new Class49(Static648.aClass62_16, Static380.anInt7247, Static187.aClass181_36);
			Static367.aClass285_1 = new Class285(Static648.aClass62_16, Static380.anInt7247, Static187.aClass181_36);
			Static535.aClass110_3 = new Class110(Static648.aClass62_16, Static380.anInt7247, Static187.aClass181_36, Static150.aClass181_34);
			Static432.aClass311_1 = new Class311(Static648.aClass62_16, Static380.anInt7247, Static34.aClass181_2);
			Static392.aClass258_4 = new Class258(Static648.aClass62_16, Static380.anInt7247, Static187.aClass181_36);
			Static265.aClass310_4 = new Class310(Static648.aClass62_16, Static380.anInt7247, Static187.aClass181_36);
			Static203.aClass306_1 = new Class306(Static648.aClass62_16, Static380.anInt7247, Static187.aClass181_36, Static150.aClass181_34);
			Static510.aClass97_2 = new Class97(Static648.aClass62_16, Static380.anInt7247, Static187.aClass181_36, Static412.aClass181_78);
			Static126.aClass9_1 = new Class9(Static648.aClass62_16, Static380.anInt7247, Static187.aClass181_36);
			Static461.aClass220_1 = new Class220(Static648.aClass62_16, Static380.anInt7247, Static187.aClass181_36);
			Static541.aClass349_4 = new Class349(Static648.aClass62_16, Static380.anInt7247, true, Static493.aClass181_100, Static412.aClass181_78);
			Static34.aClass115_1 = new Class115(Static648.aClass62_16, Static380.anInt7247, Static187.aClass181_36, Static150.aClass181_34);
			Static168.aClass204_3 = new Class204(Static648.aClass62_16, Static380.anInt7247, Static187.aClass181_36, Static150.aClass181_34);
			Static604.aClass139_2 = new Class139(Static648.aClass62_16, Static380.anInt7247, true, Static293.aClass181_57, Static412.aClass181_78);
			Static367.aClass281_1 = new Class281(Static648.aClass62_16, Static380.anInt7247, true, Static513.aClass49_2, Static387.aClass181_73, Static412.aClass181_78);
			Static552.aClass360_1 = new Class360(Static648.aClass62_16, Static380.anInt7247, Static187.aClass181_36);
			Static618.aClass222_2 = new Class222(Static648.aClass62_16, Static380.anInt7247, Static574.aClass181_117, Static108.aClass181_21, Static378.aClass181_69);
			Static20.aClass202_1 = new Class202(Static648.aClass62_16, Static380.anInt7247, Static187.aClass181_36);
			Static57.aClass265_33 = new Class265(Static648.aClass62_16, Static380.anInt7247, Static187.aClass181_36);
			Static35.aClass343_1 = new Class343(Static648.aClass62_16, Static380.anInt7247, Static37.aClass181_5, Static412.aClass181_78);
			Static5.aClass236_1 = new Class236(Static648.aClass62_16, Static380.anInt7247, Static187.aClass181_36);
			Static104.aClass225_1 = new Class225(Static648.aClass62_16, Static380.anInt7247, Static187.aClass181_36);
			Static514.aClass378_1 = new Class378(Static648.aClass62_16, Static380.anInt7247, Static187.aClass181_36);
			Static390.aClass359_1 = new Class359(Static648.aClass62_16, Static380.anInt7247, Static113.aClass181_128);
			Static90.aClass335_1 = new Class335(Static648.aClass62_16, Static380.anInt7247, Static187.aClass181_36);
			Static367.method5893(Static243.aClass181_54, Static412.aClass181_78, Static150.aClass181_34, Static340.aClass181_62);
			Static300.method5155(Static58.aClass181_9);
			Static123.aClass61_1 = new Class61(Static380.anInt7247, Static568.aClass181_115, Static465.aClass181_93);
			Static221.aClass136_1 = new Class136(Static380.anInt7247, Static568.aClass181_115, Static465.aClass181_93, new Class165());
			Static195.method6165();
			Static541.aClass349_4.method8119(Static552.aClass3_Sub48_30.aClass23_Sub14_1.method4252() == 0);
			Static514.aClass166_1 = new Class166();
			Static379.method6035();
			Static27.method487(Static433.aClass181_81);
			Static401.method6378(Static412.aClass181_78, Static641.anInterface5_12);
			@Pc(956) Class253 local956 = new Class253(Static639.aClass181_133.method5026("huffman", ""));
			Static364.method5883(local956);
			try {
				jagmisc.init();
			} catch (@Pc(963) Throwable local963) {
			}
			Static614.aClass116_1 = Static277.method4949();
			Static2.aClass3_Sub23_1 = new Class3_Sub23(true, Static379.aClass228_6);
		}
		if (Static411.aClass251_15 == Static531.aClass251_22) {
			local8 = Static72.method1845(Static150.aClass181_34) + Static295.method5067(true);
			local65 = Static175.method3580() + Static258.method4833();
			if (local65 > local8) {
				return local8 * 100 / local65;
			}
		}
		if (Static531.aClass251_22 == Static411.aClass251_16) {
			Static361.method2164(Static35.aClass181_4, Static392.aClass258_4, Static265.aClass310_4, Static541.aClass349_4, Static34.aClass115_1, Static168.aClass204_3, Static514.aClass166_1);
		}
		if (Static531.aClass251_22 == Static411.aClass251_17) {
			Static477.anIntArray533 = new int[Static514.aClass378_1.anInt10520];
			Static158.aBooleanArray10 = new boolean[Static514.aClass378_1.anInt10520];
			Static648.aStringArray42 = new String[Static104.aClass225_1.anInt7016];
			for (local8 = 0; local8 < Static514.aClass378_1.anInt10520; local8++) {
				if (Static514.aClass378_1.method8645(local8).anInt6499 == 0) {
					Static158.aBooleanArray10[local8] = true;
					Static223.anInt5090++;
				}
				Static477.anIntArray533[local8] = -1;
			}
			Static483.method7098();
			Static16.anInt166 = Static243.aClass181_54.method5033("loginscreen");
			Static273.anInt5829 = Static243.aClass181_54.method5033("lobbyscreen");
			Static123.aClass181_28.method5039(false);
			Static399.aClass181_75.method5039(true);
			Static150.aClass181_34.method5039(true);
			Static340.aClass181_62.method5039(true);
			Static639.aClass181_133.method5039(true);
			Static243.aClass181_54.method5039(true);
			Static226.aBoolean452 = true;
			Static187.aClass181_36.anInt5947 = 2;
			Static34.aClass181_2.anInt5947 = 2;
			Static493.aClass181_100.anInt5947 = 2;
			Static293.aClass181_57.anInt5947 = 2;
			Static387.aClass181_73.anInt5947 = 2;
			Static574.aClass181_117.anInt5947 = 2;
			Static37.aClass181_5.anInt5947 = 2;
		}
		if (Static411.aClass251_18 == Static531.aClass251_22) {
			if (!Static263.method4883(Static16.anInt166)) {
				return 0;
			}
			local158 = true;
			for (local65 = 0; local65 < Static85.aClass108ArrayArray2[Static16.anInt166].length; local65++) {
				@Pc(1141) Class108 local1141 = Static85.aClass108ArrayArray2[Static16.anInt166][local65];
				if (local1141.anInt4018 == 5 && local1141.anInt4020 != -1 && !Static150.aClass181_34.method5024(0, local1141.anInt4020)) {
					local158 = false;
				}
			}
			if (!local158) {
				return 0;
			}
		}
		if (Static531.aClass251_22 == Static411.aClass251_19) {
			Static63.method1342(true);
		}
		if (Static411.aClass251_20 == Static531.aClass251_22) {
			Static99.aClass348_1.method8103();
			try {
				Static42.aThread1.join();
			} catch (@Pc(1191) InterruptedException local1191) {
				return 0;
			}
			Static42.aThread1 = null;
			Static556.aClass154_1 = null;
			Static425.aClass181_102 = null;
			Static99.aClass348_1 = null;
			Static284.anInterface15Array1 = null;
			Static469.aClass181_96 = null;
			Static6.method97();
			Static339.aBoolean575 = Static552.aClass3_Sub48_30.aClass23_Sub15_1.method4695() == 1;
			Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub15_1, 1);
			if (Static339.aBoolean575) {
				Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub18_1, 0);
			} else if (Static552.aClass3_Sub48_30.aClass23_Sub18_1.aBoolean517 && Static2.aClass3_Sub23_1.anInt4394 < 512 && Static2.aClass3_Sub23_1.anInt4394 != 0) {
				Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub18_1, 0);
			}
			Static152.method3314();
			if (Static339.aBoolean575) {
				Static559.method7893(false, 0);
			} else {
				Static559.method7893(false, Static552.aClass3_Sub48_30.aClass23_Sub18_1.method5152());
			}
			Static494.method7243(-1, Static552.aClass3_Sub48_30.aClass23_Sub9_2.method3448(), -1, false);
			Static394.method6305(Static47.aClass33_3);
			Static331.method5538(Static47.aClass33_3);
			Static121.method5580(Static47.aClass33_3, Static150.aClass181_34);
			Static247.method4661(Static583.aClass5Array19);
		}
		return Static160.method3404();
	}
}
