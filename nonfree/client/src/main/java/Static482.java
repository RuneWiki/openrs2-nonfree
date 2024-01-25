import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static482 {

	@OriginalMember(owner = "client!sga", name = "e", descriptor = "I")
	public static int anInt8138;

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "Lclient!eb;")
	public static final Class81 aClass81_7 = new Class81();

	@OriginalMember(owner = "client!sga", name = "d", descriptor = "Lclient!db;")
	public static final Class64 aClass64_421 = new Class64(114, 10);

	@OriginalMember(owner = "client!sga", name = "g", descriptor = "[I")
	public static final int[] anIntArray642 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(I)I")
	public static int method6707() {
		@Pc(10) int local10;
		if (!Static189.aClass4_Sub2_Sub1_1.aBoolean659) {
			for (local10 = 0; local10 < Static176.anInt3771; local10++) {
				if (Static247.anInterface24Array1[local10].method6735() == 's' || Static247.anInterface24Array1[local10].method6735() == 'S') {
					Static189.aClass4_Sub2_Sub1_1.aBoolean659 = true;
					break;
				}
			}
		}
		@Pc(50) int local50;
		if (Static118.aClass202_1 == Static280.aClass202_2) {
			@Pc(40) Runtime local40 = Runtime.getRuntime();
			local50 = (int) ((local40.totalMemory() - local40.freeMemory()) / 1024L);
			@Pc(53) long local53 = Static184.method3422();
			if (Static494.aLong257 == 0L) {
				Static494.aLong257 = local53;
			}
			if (local50 > 16384 && local53 - Static494.aLong257 < 5000L) {
				if (local53 - Static47.aLong34 > 1000L) {
					System.gc();
					Static47.aLong34 = local53;
				}
				return 0;
			}
		}
		if (Static280.aClass202_3 == Static118.aClass202_1) {
			if (Static96.aClass219_1 == null) {
				Static96.aClass219_1 = new Class219(Static160.aClass207_1, Static340.aClass70_2, Static159.aBigInteger3, Static489.aBigInteger11);
			}
			if (!Static96.aClass219_1.method4897()) {
				return 0;
			}
			Static359.method5269(0, null);
			Static359.aBoolean463 = !Static552.method7615();
			Static4.aClass31_1 = Static368.method5538(false, Static359.aBoolean463 ? 34 : 32);
			Static101.aClass31_23 = Static368.method5538(false, 33);
			Static520.aClass31_110 = Static368.method5538(false, 13);
		}
		if (Static280.aClass202_4 == Static118.aClass202_1) {
			Static101.aClass31_23.method663();
			local10 = Static7.aClass235_Sub1Array1[33].method5090();
			local10 += Static7.aClass235_Sub1Array1[Static359.aBoolean463 ? 34 : 32].method5090();
			local10 += Static7.aClass235_Sub1Array1[13].method5090();
			local10 += Static101.aClass31_23.method656();
			if (local10 != 400) {
				return local10 / 4;
			}
			Static591.anInt9706 = Static4.aClass31_1.method685();
			Static488.anInt8215 = Static101.aClass31_23.method685();
			Static209.method7920(Static4.aClass31_1);
			local50 = Static189.aClass4_Sub2_Sub1_1.anInt9289;
			Static457.aClass166_1 = new Class166(Static538.aClass263_5, Static56.anInt953, Static101.aClass31_23);
			@Pc(208) int[] local208 = Static457.aClass166_1.method3993(local50);
			@Pc(214) Class267 local214 = new Class267(Static4.aClass31_1, Static520.aClass31_110);
			if (local208.length > 0) {
				Static346.anInterface7Array1 = new Interface7[local208.length];
				for (@Pc(223) int local223 = 0; local223 < Static346.anInterface7Array1.length; local223++) {
					Static346.anInterface7Array1[local223] = new Class316(Static457.aClass166_1.method3994(local208[local223]), local214);
				}
			}
		}
		if (Static280.aClass202_5 == Static118.aClass202_1) {
			Static363.method5456(Static4.aClass31_1, Static520.aClass31_110, Static365.method5510());
		}
		if (Static118.aClass202_1 == Static280.aClass202_6) {
			local10 = Static162.method3173();
			local50 = Static292.method4575();
			if (local50 > local10) {
				return local10 * 100 / local50;
			}
		}
		if (Static280.aClass202_7 == Static118.aClass202_1) {
			if (Static346.anInterface7Array1 != null && Static346.anInterface7Array1.length > 0) {
				if (Static346.anInterface7Array1[0].method7202() < 100) {
					return 0;
				}
				if (Static346.anInterface7Array1.length > 1 && Static457.aClass166_1.method3995() && Static346.anInterface7Array1[1].method7202() < 100) {
					return 0;
				}
			}
			Static586.method1200(Static185.aClass66_14);
			Static423.method6070(Static185.aClass66_14);
			Static33.method600(1);
		}
		if (Static280.aClass202_8 == Static118.aClass202_1) {
			for (local10 = 0; local10 < 4; local10++) {
				Static15.aClass84Array1[local10] = Static424.method6074(Static38.anInt740, Static38.anInt741);
			}
		}
		if (Static280.aClass202_9 == Static118.aClass202_1) {
			Static360.aClass31_78 = Static368.method5538(false, 8);
			Static467.aClass31_102 = Static368.method5538(false, 0);
			Static397.aClass31_86 = Static368.method5538(false, 1);
			Static483.aClass31_104 = Static368.method5538(false, 2);
			Static40.aClass31_12 = Static368.method5538(false, 3);
			Static329.aClass31_70 = Static368.method5538(false, 4);
			Static370.aClass31_81 = Static368.method5538(true, 5);
			Static291.aClass31_66 = Static368.method5538(true, 6);
			Static436.aClass31_97 = Static368.method5538(false, 7);
			Static415.aClass31_92 = Static368.method5538(false, 9);
			Static334.aClass31_71 = Static368.method5538(false, 10);
			Static159.aClass31_36 = Static368.method5538(false, 11);
			Static328.aClass31_69 = Static368.method5538(false, 12);
			Static226.aClass31_51 = Static368.method5538(false, 14);
			Static233.aClass31_55 = Static368.method5538(false, 15);
			Static592.aClass31_124 = Static368.method5538(false, 16);
			Static577.aClass31_122 = Static368.method5538(false, 17);
			Static577.aClass31_123 = Static368.method5538(false, 18);
			Static478.aClass31_103 = Static368.method5538(false, 19);
			Static408.aClass31_90 = Static368.method5538(false, 20);
			Static485.aClass31_105 = Static368.method5538(false, 21);
			Static173.aClass31_37 = Static368.method5538(false, 22);
			Static376.aClass31_82 = Static368.method5538(true, 23);
			Static181.aClass31_39 = Static368.method5538(false, 24);
			Static124.aClass31_25 = Static368.method5538(false, 25);
			Static320.aClass31_68 = Static368.method5538(true, 26);
			Static71.aClass31_18 = Static368.method5538(false, 27);
			Static39.aClass31_11 = Static368.method5538(true, 28);
			Static220.aClass31_49 = Static368.method5538(false, 29);
			Static26.aClass31_54 = Static368.method5538(true, 30);
			Static422.aClass31_95 = Static368.method5538(true, 31);
		}
		if (Static118.aClass202_1 == Static280.aClass202_10) {
			local10 = 0;
			for (local50 = 0; local50 < 35; local50++) {
				if (Static7.aClass235_Sub1Array1[local50] != null) {
					local10 += Static7.aClass235_Sub1Array1[local50].method5090() * Static98.anIntArray235[local50] / 100;
				}
			}
			if (local10 != 100) {
				if (Static147.anInt3279 < 0) {
					Static147.anInt3279 = local10;
				}
				return (local10 - Static147.anInt3279) * 100 / (100 - Static147.anInt3279);
			}
			Static521.method7301(Static360.aClass31_78);
			Static363.method5456(Static360.aClass31_78, Static520.aClass31_110, Static365.method5510());
		}
		if (Static118.aClass202_1 == Static280.aClass202_11) {
			Static295.method4624();
			Static33.method600(2);
		}
		if (Static280.aClass202_12 == Static118.aClass202_1) {
			Static413.method5933(Static26.aClass31_54, Static147.aClass161_4);
		}
		if (Static280.aClass202_13 == Static118.aClass202_1) {
			local10 = Static402.method5813();
			if (local10 < 100) {
				return local10;
			}
			Static368.method5542(Static39.aClass31_11.method661(1));
			Static305.method4710(Static39.aClass31_11.method661(3));
		}
		if (Static118.aClass202_1 == Static280.aClass202_14) {
			if (Static385.anInt6801 != -1 && !Static436.aClass31_97.method668(0, Static385.anInt6801)) {
				return 99;
			}
			Static263.anInterface3_14 = new Class320(Static320.aClass31_68, Static415.aClass31_92, Static360.aClass31_78);
			Static53.aClass152_1 = new Class152(Static538.aClass263_5, Static56.anInt953, Static483.aClass31_104);
			Static251.aClass127_1 = new Class127(Static538.aClass263_5, Static56.anInt953, Static483.aClass31_104);
			Static421.aClass15_6 = new Class15(Static538.aClass263_5, Static56.anInt953, Static483.aClass31_104, Static360.aClass31_78);
			Static244.aClass205_1 = new Class205(Static538.aClass263_5, Static56.anInt953, Static577.aClass31_122);
			Static471.aClass291_5 = new Class291(Static538.aClass263_5, Static56.anInt953, Static483.aClass31_104);
			Static81.aClass162_11 = new Class162(Static538.aClass263_5, Static56.anInt953, Static483.aClass31_104);
			Static438.aClass237_2 = new Class237(Static538.aClass263_5, Static56.anInt953, Static483.aClass31_104, Static436.aClass31_97);
			Static20.aClass142_1 = new Class142(Static538.aClass263_5, Static56.anInt953, Static483.aClass31_104);
			Static485.aClass88_1 = new Class88(Static538.aClass263_5, Static56.anInt953, Static483.aClass31_104);
			Static553.aClass288_4 = new Class288(Static538.aClass263_5, Static56.anInt953, true, Static592.aClass31_124, Static436.aClass31_97);
			Static152.aClass337_2 = new Class337(Static538.aClass263_5, Static56.anInt953, Static483.aClass31_104, Static360.aClass31_78);
			Static279.aClass190_2 = new Class190(Static538.aClass263_5, Static56.anInt953, Static483.aClass31_104, Static360.aClass31_78);
			Static401.aClass345_2 = new Class345(Static538.aClass263_5, Static56.anInt953, true, Static577.aClass31_123, Static436.aClass31_97);
			Static195.aClass99_1 = new Class99(Static538.aClass263_5, Static56.anInt953, true, Static53.aClass152_1, Static478.aClass31_103, Static436.aClass31_97);
			Static63.aClass140_1 = new Class140(Static538.aClass263_5, Static56.anInt953, Static483.aClass31_104);
			Static168.aClass327_2 = new Class327(Static538.aClass263_5, Static56.anInt953, Static408.aClass31_90, Static467.aClass31_102, Static397.aClass31_86);
			Static5.aClass60_1 = new Class60(Static538.aClass263_5, Static56.anInt953, Static483.aClass31_104);
			Static276.aClass110_1 = new Class110(Static538.aClass263_5, Static56.anInt953, Static483.aClass31_104);
			Static206.aClass275_1 = new Class275(Static538.aClass263_5, Static56.anInt953, Static485.aClass31_105, Static436.aClass31_97);
			Static506.aClass143_1 = new Class143(Static538.aClass263_5, Static56.anInt953, Static483.aClass31_104);
			Static256.aClass243_1 = new Class243(Static538.aClass263_5, Static56.anInt953, Static483.aClass31_104);
			Static73.aClass96_1 = new Class96(Static538.aClass263_5, Static56.anInt953, Static483.aClass31_104);
			Static538.aClass101_1 = new Class101(Static538.aClass263_5, Static56.anInt953, Static173.aClass31_37);
			Static581.aClass270_1 = new Class270(Static538.aClass263_5, Static56.anInt953, Static483.aClass31_104);
			Static579.method7870(Static520.aClass31_110, Static436.aClass31_97, Static360.aClass31_78, Static40.aClass31_12);
			Static476.method6626(Static220.aClass31_49);
			Static560.aClass51_1 = new Class51(Static56.anInt953, Static181.aClass31_39, Static124.aClass31_25);
			Static320.aClass363_1 = new Class363(Static56.anInt953, Static181.aClass31_39, Static124.aClass31_25, new Class206());
			Static294.method4613();
			Static553.aClass288_4.method6421(!Static189.aClass4_Sub2_Sub1_1.method7652(Static403.anInt6994));
			Static511.aClass335_2 = new Class335();
			Static271.method4381();
			Static220.method3806(Static71.aClass31_18);
			Static232.method4001(Static436.aClass31_97, Static263.anInterface3_14);
			@Pc(915) Class133 local915 = new Class133(Static334.aClass31_71.method662("huffman", ""));
			Static131.method2743(local915);
			try {
				jagmisc.init();
			} catch (@Pc(922) Throwable local922) {
			}
			Static66.aClass103_5 = Static40.method692();
		}
		if (Static118.aClass202_1 == Static280.aClass202_16) {
			local10 = Static322.method4892(Static360.aClass31_78) + Static484.method7811(true);
			local50 = Static114.method2356() + Static292.method4575();
			if (local50 > local10) {
				return local10 * 100 / local50;
			}
		}
		if (Static280.aClass202_17 == Static118.aClass202_1) {
			Static392.method7237(Static376.aClass31_82, Static471.aClass291_5, Static81.aClass162_11, Static553.aClass288_4, Static152.aClass337_2, Static279.aClass190_2, Static511.aClass335_2);
		}
		if (Static118.aClass202_1 == Static280.aClass202_18) {
			Static200.aStringArray15 = new String[Static256.aClass243_1.anInt6214];
			Static23.aBooleanArray6 = new boolean[Static73.aClass96_1.anInt3004];
			Static435.anIntArray612 = new int[Static73.aClass96_1.anInt3004];
			for (local10 = 0; local10 < Static73.aClass96_1.anInt3004; local10++) {
				if (Static73.aClass96_1.method2741(local10).anInt8767 == 0) {
					Static23.aBooleanArray6[local10] = true;
					Static461.anInt7821++;
				}
				Static435.anIntArray612[local10] = -1;
			}
			Static91.method2093();
			Static228.anInt4681 = Static40.aClass31_12.method653("loginscreen");
			Static185.anInt8672 = Static40.aClass31_12.method653("lobbyscreen");
			Static370.aClass31_81.method655(false);
			Static291.aClass31_66.method655(true);
			Static360.aClass31_78.method655(true);
			Static520.aClass31_110.method655(true);
			Static334.aClass31_71.method655(true);
			Static40.aClass31_12.method655(true);
			Static121.aBoolean522 = true;
			Static483.aClass31_104.anInt775 = 2;
			Static577.aClass31_122.anInt775 = 2;
			Static592.aClass31_124.anInt775 = 2;
			Static577.aClass31_123.anInt775 = 2;
			Static478.aClass31_103.anInt775 = 2;
			Static408.aClass31_90.anInt775 = 2;
			Static485.aClass31_105.anInt775 = 2;
		}
		@Pc(1100) Class115 local1100;
		if (Static118.aClass202_1 == Static280.aClass202_19) {
			if (!Static474.method3731(Static228.anInt4681)) {
				return 0;
			}
			for (local10 = 0; local10 < Static458.aClass115ArrayArray2[Static228.anInt4681].length; local10++) {
				local1100 = Static458.aClass115ArrayArray2[Static228.anInt4681][local10];
				if (local1100.anInt3519 == 5 && local1100.anInt3442 != -1) {
					local1100.method3141(Static185.aClass66_14);
				}
			}
		}
		if (Static280.aClass202_20 == Static118.aClass202_1) {
			for (local10 = 0; local10 < Static458.aClass115ArrayArray2[Static228.anInt4681].length; local10++) {
				local1100 = Static458.aClass115ArrayArray2[Static228.anInt4681][local10];
				if (local1100.anInt3519 == 5 && local1100.anInt3442 != -1 && local1100.method3141(Static185.aClass66_14) == null && Static538.aBoolean631) {
					return 0;
				}
			}
		}
		if (Static118.aClass202_1 == Static280.aClass202_21) {
			Static452.method6401(true);
		}
		if (Static118.aClass202_1 == Static280.aClass202_22) {
			Static466.aClass276_1.method6060();
			try {
				Static592.aThread7.join();
			} catch (@Pc(1180) InterruptedException local1180) {
				return 0;
			}
			Static418.aBoolean523 = Static189.aClass4_Sub2_Sub1_1.aBoolean659;
			Static189.aClass4_Sub2_Sub1_1.aBoolean659 = true;
			Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
			if (Static418.aBoolean523) {
				Static8.method7640(0);
			} else {
				Static8.method7640(Static189.aClass4_Sub2_Sub1_1.anInt9285);
			}
			Static469.method6545(Static189.aClass4_Sub2_Sub1_1.anInt9290, -1, -1, false);
			Static586.method1200(Static185.aClass66_14);
			Static423.method6070(Static185.aClass66_14);
			Static62.method4584(Static185.aClass66_14, Static360.aClass31_78);
			Static32.method572(Static223.aClass13Array15);
			Static4.aClass31_1 = null;
			Static101.aClass31_23 = null;
			Static346.anInterface7Array1 = null;
			Static457.aClass166_1 = null;
		}
		return Static363.method5457();
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(IBI)I")
	public static int method6709(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg0 >>> 24;
		@Pc(20) int local20 = 255 - local15;
		@Pc(38) int local38 = ((arg0 & 0xFF00FF) * local15 & 0xFF00FF00 | (arg0 & 0xFF00) * local15 & 0xFF0000) >>> 8;
		return local38 + ((local20 * (arg1 & 0xFF00FF) & 0xFF00FF00 | local20 * (arg1 & 0xFF00) & 0xFF0000) >>> 8);
	}
}
