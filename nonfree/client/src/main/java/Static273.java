import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "Lclient!in;")
	public static final Class169 aClass169_134 = new Class169(101, -1);

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(I)I")
	public static int method4648() {
		@Pc(8) int local8;
		if (Static230.aClass2_Sub54_15.aClass4_Sub7_1.method2341() == 0) {
			for (local8 = 0; local8 < Static257.anInt4926; local8++) {
				if (Static595.anInterface21Array2[local8].method5145() == 's' || Static595.anInterface21Array2[local8].method5145() == 'S') {
					Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub7_1, 1);
					Static643.aBoolean797 = true;
					break;
				}
			}
		}
		@Pc(62) int local62;
		if (Static11.aClass138_1 == Static214.aClass138_2) {
			@Pc(53) Runtime local53 = Runtime.getRuntime();
			local62 = (int) ((local53.totalMemory() - local53.freeMemory()) / 1024L);
			@Pc(65) long local65 = Static99.method1701();
			if (Static353.aLong177 == 0L) {
				Static353.aLong177 = local65;
			}
			if (local62 > 16384 && local65 - Static353.aLong177 < 5000L) {
				if (local65 - Static143.aLong79 > 1000L) {
					System.gc();
					Static143.aLong79 = local65;
				}
				return 0;
			}
		}
		if (Static214.aClass138_3 == Static11.aClass138_1) {
			if (Static173.aClass382_1 == null) {
				Static173.aClass382_1 = new Class382(Static396.aClass206_1, Static158.aClass46_1, Static539.aBigInteger2, Static225.aBigInteger1);
			}
			if (!Static173.aClass382_1.method9534()) {
				return 0;
			}
			Static491.method7785(true, 0, (String) null);
			Static451.aBoolean607 = !Static78.method1390();
			Static74.aClass124_110 = Static632.method9343(false, Static451.aBoolean607 ? 34 : 32, 1);
			Static524.aClass124_111 = Static632.method9343(false, 33, 1);
			Static227.aClass124_49 = Static632.method9343(false, 13, 1);
		}
		@Pc(158) boolean local158;
		if (Static214.aClass138_4 == Static11.aClass138_1) {
			local158 = Static524.aClass124_111.method3626();
			local62 = Static534.aClass51_Sub1Array12[33].method8056();
			local62 += Static534.aClass51_Sub1Array12[Static451.aBoolean607 ? 34 : 32].method8056();
			local62 += Static534.aClass51_Sub1Array12[13].method8056();
			local62 += local158 ? 100 : Static524.aClass124_111.method3620();
			if (local62 != 400) {
				return local62 / 4;
			}
			Static392.anInt7087 = Static74.aClass124_110.method3615();
			Static641.anInt11092 = Static524.aClass124_111.method3615();
			Static669.method9744(Static74.aClass124_110);
			@Pc(223) int local223 = Static230.aClass2_Sub54_15.aClass4_Sub14_1.method4565();
			Static193.aClass93_1 = new Class93(Static551.aClass229_15, Static204.anInt8130, Static524.aClass124_111);
			@Pc(235) int[] local235 = Static193.aClass93_1.method2403(local223);
			if (local235.length == 0) {
				local235 = Static193.aClass93_1.method2403(0);
			}
			@Pc(252) Class151 local252 = new Class151(Static74.aClass124_110, Static227.aClass124_49);
			if (local235.length > 0) {
				Static35.anInterface1Array1 = new Interface1[local235.length];
				for (@Pc(264) int local264 = 0; local264 < Static35.anInterface1Array1.length; local264++) {
					Static35.anInterface1Array1[local264] = new Class305(Static193.aClass93_1.method2399(local235[local264]), local252);
				}
			}
		}
		if (Static11.aClass138_1 == Static214.aClass138_5) {
			Static446.method7247(Static74.aClass124_110, Static321.method5297(), Static227.aClass124_49);
		}
		if (Static214.aClass138_6 == Static11.aClass138_1) {
			local8 = Static160.method9137();
			local62 = Static169.method3352();
			if (local8 < local62) {
				return local8 * 100 / local62;
			}
		}
		if (Static11.aClass138_1 == Static214.aClass138_7) {
			if (Static35.anInterface1Array1 != null && Static35.anInterface1Array1.length > 0) {
				if (Static35.anInterface1Array1[0].method7816() < 100) {
					return 0;
				}
				if (Static35.anInterface1Array1.length > 1 && Static193.aClass93_1.method2404() && Static35.anInterface1Array1[1].method7816() < 100) {
					return 0;
				}
			}
			Static532.method8228(Static607.aClass101_15);
			Static434.method5197(Static607.aClass101_15);
			Static248.method4408(1);
		}
		if (Static214.aClass138_8 == Static11.aClass138_1) {
			for (local8 = 0; local8 < 4; local8++) {
				Static196.aClass200Array1[local8] = Static100.method1446(Static222.anInt4533, Static668.anInt11370);
			}
		}
		if (Static11.aClass138_1 == Static214.aClass138_9) {
			Static409.aClass124_84 = Static632.method9343(false, 8, 1);
			Static256.aClass124_125 = Static632.method9343(false, 0, 1);
			Static170.aClass124_45 = Static632.method9343(false, 1, 1);
			Static361.aClass124_78 = Static632.method9343(false, 2, 1);
			Static362.aClass124_115 = Static632.method9343(false, 3, 1);
			Static437.aClass124_88 = Static632.method9343(false, 4, 1);
			Static52.aClass124_14 = Static632.method9343(true, 5, 1);
			Static502.aClass124_105 = Static632.method9343(true, 6, 1);
			Static21.aClass124_7 = Static632.method9343(false, 7, 1);
			Static390.aClass124_83 = Static632.method9343(false, 9, 1);
			Static270.aClass124_58 = Static632.method9343(false, 10, 1);
			Static489.aClass124_104 = Static632.method9343(false, 11, 1);
			Static670.aClass124_86 = Static632.method9343(false, 12, 1);
			Static40.aClass124_9 = Static632.method9343(false, 14, 1);
			Static472.aClass124_101 = Static632.method9343(false, 15, 1);
			Static287.aClass124_63 = Static632.method9343(false, 16, 1);
			Static324.aClass124_69 = Static632.method9343(false, 17, 1);
			Static345.aClass124_75 = Static632.method9343(false, 18, 1);
			Static383.aClass124_79 = Static632.method9343(false, 19, 1);
			Static114.aClass124_30 = Static632.method9343(false, 20, 1);
			Static233.aClass124_52 = Static632.method9343(false, 21, 1);
			Static12.aClass124_6 = Static632.method9343(false, 22, 1);
			Static480.aClass124_102 = Static632.method9343(true, 23, 1);
			Static47.aClass124_12 = Static632.method9343(false, 24, 1);
			Static83.aClass124_21 = Static632.method9343(false, 25, 1);
			Static11.aClass124_5 = Static632.method9343(true, 26, 1);
			Static521.aClass124_77 = Static632.method9343(false, 27, 1);
			Static389.aClass124_82 = Static632.method9343(true, 28, 1);
			Static68.aClass124_17 = Static632.method9343(false, 29, 1);
			Static632.aClass124_129 = Static632.method9343(true, 30, 1);
			Static560.aClass124_118 = Static632.method9343(true, 31, 1);
			Static455.aClass124_100 = Static632.method9343(true, 36, 2);
		}
		if (Static214.aClass138_10 == Static11.aClass138_1) {
			local8 = 0;
			for (local62 = 0; local62 < 37; local62++) {
				if (Static534.aClass51_Sub1Array12[local62] != null) {
					local8 += Static534.aClass51_Sub1Array12[local62].method8056() * Static32.anIntArray42[local62] / 100;
				}
			}
			if (local8 != 100) {
				if (Static378.anInt7187 < 0) {
					Static378.anInt7187 = local8;
				}
				return (local8 - Static378.anInt7187) * 100 / (100 - Static378.anInt7187);
			}
			Static468.method7501(Static409.aClass124_84);
			Static446.method7247(Static409.aClass124_84, Static321.method5297(), Static227.aClass124_49);
		}
		if (Static214.aClass138_11 == Static11.aClass138_1) {
			if (Static5.anInt86 == -1) {
				Static5.anInt86 = Static502.aClass124_105.method3638("scape main");
			}
			Static233.method4206();
			Static248.method4408(2);
		}
		if (Static11.aClass138_1 == Static214.aClass138_12) {
			Static150.method2592(Static96.aClass48_5, Static632.aClass124_129);
		}
		if (Static11.aClass138_1 == Static214.aClass138_13) {
			local8 = Static436.method7109();
			if (local8 < 100) {
				return local8;
			}
			Static184.method3568(Static389.aClass124_82.method3610(1));
			Static580.method8758(Static389.aClass124_82.method3610(3));
			Static207.aClass265_1 = new Class265(Static389.aClass124_82);
		}
		if (Static214.aClass138_14 == Static11.aClass138_1) {
			if (Static310.anInt5608 != -1 && !Static21.aClass124_7.method3609(Static310.anInt5608, 0)) {
				return 99;
			}
			Static117.anInterface3_2 = new Class74(Static11.aClass124_5, Static390.aClass124_83, Static409.aClass124_84);
			Static142.aClass367_1 = new Class367(Static551.aClass229_15, Static204.anInt8130, Static361.aClass124_78);
			Static665.aClass267_2 = new Class267(Static551.aClass229_15, Static204.anInt8130, Static361.aClass124_78, Static207.aClass265_1);
			Static372.aClass165_2 = new Class165(Static551.aClass229_15, Static204.anInt8130, Static361.aClass124_78, Static409.aClass124_84);
			Static203.aClass164_1 = new Class164(Static551.aClass229_15, Static204.anInt8130, Static324.aClass124_69);
			Static424.aClass266_4 = new Class266(Static551.aClass229_15, Static204.anInt8130, Static361.aClass124_78);
			Static81.aClass359_2 = new Class359(Static551.aClass229_15, Static204.anInt8130, Static361.aClass124_78);
			Static226.aClass102_1 = new Class102(Static551.aClass229_15, Static204.anInt8130, Static361.aClass124_78, Static409.aClass124_84);
			Static42.aClass96_2 = new Class96(Static551.aClass229_15, Static204.anInt8130, Static361.aClass124_78, Static21.aClass124_7);
			Static503.aClass77_2 = new Class77(Static551.aClass229_15, Static204.anInt8130, Static361.aClass124_78);
			Static294.aClass378_1 = new Class378(Static551.aClass229_15, Static204.anInt8130, Static361.aClass124_78);
			Static251.aClass328_1 = new Class328(Static551.aClass229_15, Static204.anInt8130, true, Static287.aClass124_63, Static21.aClass124_7);
			Static350.aClass5_3 = new Class5(Static551.aClass229_15, Static204.anInt8130, Static361.aClass124_78, Static409.aClass124_84);
			Static157.aClass353_1 = new Class353(Static551.aClass229_15, Static204.anInt8130, Static361.aClass124_78, Static409.aClass124_84);
			Static522.aClass272_2 = new Class272(Static551.aClass229_15, Static204.anInt8130, true, Static345.aClass124_75, Static21.aClass124_7);
			Static372.aClass343_1 = new Class343(Static551.aClass229_15, Static204.anInt8130, true, Static142.aClass367_1, Static383.aClass124_79, Static21.aClass124_7);
			Static274.aClass392_1 = new Class392(Static551.aClass229_15, Static204.anInt8130, Static361.aClass124_78);
			Static354.aClass40_2 = new Class40(Static551.aClass229_15, Static204.anInt8130, Static114.aClass124_30, Static256.aClass124_125, Static170.aClass124_45);
			Static462.aClass299_1 = new Class299(Static551.aClass229_15, Static204.anInt8130, Static361.aClass124_78);
			Static6.aClass176_1 = new Class176(Static551.aClass229_15, Static204.anInt8130, Static361.aClass124_78);
			Static391.aClass319_1 = new Class319(Static551.aClass229_15, Static204.anInt8130, Static233.aClass124_52, Static21.aClass124_7);
			Static300.aClass197_5 = new Class197(Static551.aClass229_15, Static204.anInt8130, Static361.aClass124_78);
			Static119.aClass275_1 = new Class275(Static551.aClass229_15, Static204.anInt8130, Static361.aClass124_78);
			Static294.aClass97_1 = new Class97(Static551.aClass229_15, Static204.anInt8130, Static361.aClass124_78);
			Static395.aClass140_1 = new Class140(Static551.aClass229_15, Static204.anInt8130, Static12.aClass124_6);
			Static288.aClass187_1 = new Class187(Static551.aClass229_15, Static204.anInt8130, Static361.aClass124_78);
			Static87.aClass184_1 = new Class184(Static551.aClass229_15, Static204.anInt8130, Static361.aClass124_78);
			Static612.method9196(Static362.aClass124_115, Static21.aClass124_7, Static409.aClass124_84, Static227.aClass124_49);
			Static76.method1370(Static68.aClass124_17);
			Static406.aClass337_1 = new Class337(Static204.anInt8130, Static47.aClass124_12, Static83.aClass124_21);
			Static644.aClass186_2 = new Class186(Static204.anInt8130, Static47.aClass124_12, Static83.aClass124_21, new Class345());
			Static586.method8862();
			Static251.aClass328_1.method8253(Static230.aClass2_Sub54_15.aClass4_Sub9_1.method2556() == 0);
			Static113.aClass282_1 = new Class282();
			Static231.method4178();
			Static124.method2254(Static521.aClass124_77);
			Static220.method4068(Static117.anInterface3_2, Static21.aClass124_7);
			@Pc(984) Class36 local984 = new Class36(Static270.aClass124_58.method3639("", "huffman"));
			Static117.method2049(local984);
			try {
				jagmisc.init();
			} catch (@Pc(991) Throwable local991) {
			}
			Static596.aClass98_1 = Static17.method7638();
			Static466.aClass2_Sub55_1 = new Class2_Sub55(true, Static96.aClass48_5);
		}
		if (Static214.aClass138_16 == Static11.aClass138_1) {
			local8 = Static159.method3206(Static409.aClass124_84) + Static131.method2332(true);
			local62 = Static2.method59() + Static169.method3352();
			if (local8 < local62) {
				return local8 * 100 / local62;
			}
		}
		if (Static11.aClass138_1 == Static214.aClass138_17) {
			Static331.method9062(Static480.aClass124_102, Static424.aClass266_4, Static81.aClass359_2, Static251.aClass328_1, Static350.aClass5_3, Static157.aClass353_1, Static113.aClass282_1);
		}
		if (Static214.aClass138_18 == Static11.aClass138_1) {
			Static576.aStringArray67 = new String[Static119.aClass275_1.anInt8144];
			Static100.anIntArray75 = new int[Static294.aClass97_1.anInt2715];
			Static546.aBooleanArray56 = new boolean[Static294.aClass97_1.anInt2715];
			for (local8 = 0; local8 < Static294.aClass97_1.anInt2715; local8++) {
				if (Static294.aClass97_1.method2526(local8).anInt5074 == 0) {
					Static546.aBooleanArray56[local8] = true;
					Static195.anInt4137++;
				}
				Static100.anIntArray75[local8] = -1;
			}
			Static555.method8485();
			Static640.anInt11084 = Static362.aClass124_115.method3638("loginscreen");
			Static230.anInt4621 = Static362.aClass124_115.method3638("lobbyscreen");
			Static52.aClass124_14.method3611(false);
			Static502.aClass124_105.method3611(true);
			Static409.aClass124_84.method3611(true);
			Static227.aClass124_49.method3611(true);
			Static270.aClass124_58.method3611(true);
			Static362.aClass124_115.method3611(true);
			Static421.aBoolean575 = true;
			Static361.aClass124_78.anInt3918 = 2;
			Static324.aClass124_69.anInt3918 = 2;
			Static287.aClass124_63.anInt3918 = 2;
			Static345.aClass124_75.anInt3918 = 2;
			Static383.aClass124_79.anInt3918 = 2;
			Static114.aClass124_30.anInt3918 = 2;
			Static233.aClass124_52.anInt3918 = 2;
		}
		if (Static214.aClass138_19 == Static11.aClass138_1) {
			if (!Static39.method9317(Static640.anInt11084)) {
				return 0;
			}
			local158 = true;
			for (local62 = 0; local62 < Static111.aClass357ArrayArray1[Static640.anInt11084].length; local62++) {
				@Pc(1180) Class357 local1180 = Static111.aClass357ArrayArray1[Static640.anInt11084][local62];
				if (local1180.anInt10430 == 5 && local1180.anInt10459 != -1 && !Static409.aClass124_84.method3609(local1180.anInt10459, 0)) {
					local158 = false;
				}
			}
			if (!local158) {
				return 0;
			}
		}
		if (Static11.aClass138_1 == Static214.aClass138_20) {
			Static278.method4684(true);
		}
		if (Static11.aClass138_1 == Static214.aClass138_21) {
			Static396.aClass249_1.method6633();
			try {
				Static148.aThread4.join();
			} catch (@Pc(1226) InterruptedException local1226) {
				return 0;
			}
			Static74.aClass124_110 = null;
			Static148.aThread4 = null;
			Static193.aClass93_1 = null;
			Static524.aClass124_111 = null;
			Static35.anInterface1Array1 = null;
			Static396.aClass249_1 = null;
			Static369.method9414();
			Static282.aBoolean392 = Static230.aClass2_Sub54_15.aClass4_Sub7_1.method2341() == 1;
			Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub7_1, 1);
			if (Static282.aBoolean392) {
				Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub16_1, 0);
			} else if (Static230.aClass2_Sub54_15.aClass4_Sub16_1.aBoolean396 && Static466.aClass2_Sub55_1.anInt11444 < 512 && Static466.aClass2_Sub55_1.anInt11444 != 0) {
				Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub16_1, 0);
			}
			Static482.method7663();
			if (Static282.aBoolean392) {
				Static389.method6560(false, 0);
			} else {
				Static389.method6560(false, Static230.aClass2_Sub54_15.aClass4_Sub16_1.method4907());
			}
			Static347.method6004(-1, Static230.aClass2_Sub54_15.aClass4_Sub11_2.method3216(), -1, false);
			Static532.method8228(Static607.aClass101_15);
			Static434.method5197(Static607.aClass101_15);
			Static664.method9702(Static607.aClass101_15, Static409.aClass124_84);
			Static512.method7982(Static622.aClass71Array42);
		}
		return Static476.method7605();
	}
}
