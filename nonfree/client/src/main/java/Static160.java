import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "(II)I")
	public static int method2419(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(24) int local24 = (local13 & 0x33333333) + (local13 >>> 2 & 0xF3333333);
		@Pc(33) int local33 = local24 + (local24 >>> 4) & 0xF0F0F0F;
		@Pc(39) int local39 = local33 + (local33 >>> 8);
		@Pc(50) int local50 = local39 + (local39 >>> 16);
		return local50 & 0xFF;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method2420(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) + arg0.charAt(local12) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(B)I")
	public static int method2422() {
		return Static331.anInt5779++;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(BLclient!ee;)Lclient!oh;")
	public static Class96_Sub2 method2423(@OriginalArg(1) Class5_Sub12 arg0) {
		@Pc(12) Class96 local12 = Static607.method8453(arg0);
		@Pc(16) int local16 = arg0.method8623();
		@Pc(20) int local20 = arg0.method8623();
		return new Class96_Sub2(local12.aClass204_13, local12.aClass288_13, local12.anInt9354, local12.anInt9359, local12.anInt9360, local12.anInt9362, local12.anInt9357, local12.anInt9361, local12.anInt9355, local16, local20);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILclient!wu;)I")
	private static int method2424(@OriginalArg(1) Class384 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method8883(Static617.anInt10038)) {
			local5++;
		}
		if (arg0.method8883(Static553.anInt9153)) {
			local5++;
		}
		if (arg0.method8883(Static4.anInt35)) {
			local5++;
		}
		if (arg0.method8883(Static145.anInt6896)) {
			local5++;
		}
		if (arg0.method8883(Static431.anInt772)) {
			local5++;
		}
		if (arg0.method8883(Static428.anInt7271)) {
			local5++;
		}
		if (arg0.method8883(Static137.anInt2275)) {
			local5++;
		}
		if (arg0.method8883(Static134.anInt2213)) {
			local5++;
		}
		if (arg0.method8883(Static420.anInt7197)) {
			local5++;
		}
		if (arg0.method8883(Static506.anInt3275)) {
			local5++;
		}
		if (arg0.method8883(Static414.anInt7098)) {
			local5++;
		}
		if (arg0.method8883(Static150.anInt2401)) {
			local5++;
		}
		if (arg0.method8883(Static507.anInt9922)) {
			local5++;
		}
		if (arg0.method8883(Static506.anInt3268)) {
			local5++;
		}
		if (arg0.method8883(Static393.anInt6851)) {
			local5++;
		}
		if (arg0.method8883(Static556.anInt9160)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)I")
	public static int method2425() {
		@Pc(15) int local15;
		if (Static627.aClass5_Sub46_31.aClass11_Sub12_1.method3658() == 0) {
			for (local15 = 0; local15 < Static451.anInt7590; local15++) {
				if (Static451.anInterface24Array4[local15].method5144() == 's' || Static451.anInterface24Array4[local15].method5144() == 'S') {
					Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub12_1, 1);
					Static357.aBoolean531 = true;
					break;
				}
			}
		}
		@Pc(63) int local63;
		if (Static154.aClass291_2 == Static472.aClass291_3) {
			@Pc(54) Runtime local54 = Runtime.getRuntime();
			local63 = (int) ((local54.totalMemory() - local54.freeMemory()) / 1024L);
			@Pc(68) long local68 = Static205.method3179();
			if (Static468.aLong216 == 0L) {
				Static468.aLong216 = local68;
			}
			if (local63 > 16384 && local68 - Static468.aLong216 < 5000L) {
				if (local68 - Static581.aLong251 > 1000L) {
					System.gc();
					Static581.aLong251 = local68;
				}
				return 0;
			}
		}
		if (Static472.aClass291_4 == Static154.aClass291_2) {
			if (Static267.aClass303_1 == null) {
				Static267.aClass303_1 = new Class303(Static49.aClass331_1, Static268.aClass94_1, Static450.aBigInteger4, Static21.aBigInteger2);
			}
			if (!Static267.aClass303_1.method7157()) {
				return 0;
			}
			Static369.method5768(true, (String) null, 0);
			Static432.aBoolean607 = !Static95.method1437();
			Static292.aClass384_75 = Static72.method1168(false, 1, Static432.aBoolean607 ? 34 : 32);
			Static515.aClass384_115 = Static72.method1168(false, 1, 33);
			Static288.aClass384_72 = Static72.method1168(false, 1, 13);
		}
		@Pc(166) boolean local166;
		if (Static154.aClass291_2 == Static472.aClass291_5) {
			local166 = Static515.aClass384_115.method8877();
			local63 = Static354.aClass277_Sub1Array1[33].method6639();
			local63 += Static354.aClass277_Sub1Array1[Static432.aBoolean607 ? 34 : 32].method6639();
			local63 += Static354.aClass277_Sub1Array1[13].method6639();
			local63 += local166 ? 100 : Static515.aClass384_115.method8896();
			if (local63 != 400) {
				return local63 / 4;
			}
			Static244.anInt4096 = Static292.aClass384_75.method8882();
			Static182.anInt3294 = Static515.aClass384_115.method8882();
			Static357.method5618(Static292.aClass384_75);
			@Pc(225) int local225 = Static627.aClass5_Sub46_31.aClass11_Sub7_1.method1650();
			Static154.aClass327_1 = new Class327(Static24.aClass235_1, Static321.anInt5554, Static515.aClass384_115);
			@Pc(237) int[] local237 = Static154.aClass327_1.method7737(local225);
			if (local237.length == 0) {
				local237 = Static154.aClass327_1.method7737(0);
			}
			@Pc(251) Class21 local251 = new Class21(Static292.aClass384_75, Static288.aClass384_72);
			if (local237.length > 0) {
				Static25.anInterface22Array1 = new Interface22[local237.length];
				for (@Pc(263) int local263 = 0; local263 < Static25.anInterface22Array1.length; local263++) {
					Static25.anInterface22Array1[local263] = new Class270(Static154.aClass327_1.method7739(local237[local263]), local251);
				}
			}
		}
		if (Static154.aClass291_2 == Static472.aClass291_6) {
			Static127.method1900(Static288.aClass384_72, Static292.aClass384_75, Static157.method2384());
		}
		if (Static154.aClass291_2 == Static472.aClass291_7) {
			local15 = Static76.method1239();
			local63 = Static375.method5841();
			if (local63 > local15) {
				return local15 * 100 / local63;
			}
		}
		if (Static154.aClass291_2 == Static472.aClass291_8) {
			if (Static25.anInterface22Array1 != null && Static25.anInterface22Array1.length > 0) {
				if (Static25.anInterface22Array1[0].method6464() < 100) {
					return 0;
				}
				if (Static25.anInterface22Array1.length > 1 && Static154.aClass327_1.method7738() && Static25.anInterface22Array1[1].method6464() < 100) {
					return 0;
				}
			}
			Static462.method6096(Static485.aClass126_17);
			Static526.method7539(Static485.aClass126_17);
			Static214.method3254(1);
		}
		if (Static154.aClass291_2 == Static472.aClass291_9) {
			for (local15 = 0; local15 < 4; local15++) {
				Static308.aClass182Array1[local15] = Static488.method7155(Static111.anInt1752, Static279.anInt4567);
			}
		}
		if (Static472.aClass291_10 == Static154.aClass291_2) {
			Static488.aClass384_112 = Static72.method1168(false, 1, 8);
			Static355.aClass384_92 = Static72.method1168(false, 1, 0);
			Static48.aClass384_22 = Static72.method1168(false, 1, 1);
			Static400.aClass384_100 = Static72.method1168(false, 1, 2);
			Static240.aClass384_57 = Static72.method1168(false, 1, 3);
			Static61.aClass384_23 = Static72.method1168(false, 1, 4);
			Static342.aClass384_86 = Static72.method1168(true, 1, 5);
			Static7.aClass384_3 = Static72.method1168(true, 1, 6);
			Static107.aClass384_33 = Static72.method1168(false, 1, 7);
			Static409.aClass384_102 = Static72.method1168(false, 1, 9);
			Static635.aClass384_137 = Static72.method1168(false, 1, 10);
			Static372.aClass384_96 = Static72.method1168(false, 1, 11);
			Static416.aClass384_104 = Static72.method1168(false, 1, 12);
			Static340.aClass384_85 = Static72.method1168(false, 1, 14);
			Static339.aClass384_84 = Static72.method1168(false, 1, 15);
			Static159.aClass384_40 = Static72.method1168(false, 1, 16);
			Static511.aClass384_113 = Static72.method1168(false, 1, 17);
			Static148.aClass384_59 = Static72.method1168(false, 1, 18);
			Static8.aClass384_5 = Static72.method1168(false, 1, 19);
			Static152.aClass384_39 = Static72.method1168(false, 1, 20);
			Static348.aClass384_89 = Static72.method1168(false, 1, 21);
			Static462.aClass384_98 = Static72.method1168(false, 1, 22);
			Static280.aClass384_71 = Static72.method1168(true, 1, 23);
			Static330.aClass384_83 = Static72.method1168(false, 1, 24);
			Static602.aClass384_131 = Static72.method1168(false, 1, 25);
			Static179.aClass384_45 = Static72.method1168(true, 1, 26);
			Static557.aClass384_123 = Static72.method1168(false, 1, 27);
			Static308.aClass384_78 = Static72.method1168(true, 1, 28);
			Static347.aClass384_128 = Static72.method1168(false, 1, 29);
			Static361.aClass384_95 = Static72.method1168(true, 1, 30);
			Static40.aClass384_20 = Static72.method1168(true, 1, 31);
			Static148.aClass384_60 = Static72.method1168(true, 2, 36);
		}
		if (Static472.aClass291_11 == Static154.aClass291_2) {
			local15 = 0;
			for (local63 = 0; local63 < 37; local63++) {
				if (Static354.aClass277_Sub1Array1[local63] != null) {
					local15 += Static354.aClass277_Sub1Array1[local63].method6639() * Static227.anIntArray329[local63] / 100;
				}
			}
			if (local15 != 100) {
				if (Static413.anInt7073 < 0) {
					Static413.anInt7073 = local15;
				}
				return (local15 - Static413.anInt7073) * 100 / (100 - Static413.anInt7073);
			}
			Static434.method6480(Static488.aClass384_112);
			Static127.method1900(Static288.aClass384_72, Static488.aClass384_112, Static157.method2384());
		}
		if (Static154.aClass291_2 == Static472.aClass291_12) {
			if (Static478.anInt10052 == -1) {
				Static478.anInt10052 = Static7.aClass384_3.method8890("scape main");
			}
			Static381.method5910();
			Static214.method3254(2);
		}
		if (Static472.aClass291_13 == Static154.aClass291_2) {
			Static35.method655(Static214.aClass192_1, Static361.aClass384_95);
		}
		if (Static472.aClass291_14 == Static154.aClass291_2) {
			local15 = Static539.method7690();
			if (local15 < 100) {
				return local15;
			}
			Static73.method1169(Static308.aClass384_78.method8893(1));
			Static196.method3113(Static308.aClass384_78.method8893(3));
		}
		if (Static154.aClass291_2 == Static472.aClass291_15) {
			if (Static334.anInt5798 != -1 && !Static107.aClass384_33.method8878(0, Static334.anInt5798)) {
				return 99;
			}
			Static306.anInterface8_5 = new Class334(Static179.aClass384_45, Static409.aClass384_102, Static488.aClass384_112);
			Static246.aClass258_1 = new Class258(Static24.aClass235_1, Static321.anInt5554, Static400.aClass384_100);
			Static608.aClass151_1 = new Class151(Static24.aClass235_1, Static321.anInt5554, Static400.aClass384_100);
			Static398.aClass102_1 = new Class102(Static24.aClass235_1, Static321.anInt5554, Static400.aClass384_100, Static488.aClass384_112);
			Static561.aClass275_1 = new Class275(Static24.aClass235_1, Static321.anInt5554, Static511.aClass384_113);
			Static519.aClass163_7 = new Class163(Static24.aClass235_1, Static321.anInt5554, Static400.aClass384_100);
			Static244.aClass210_5 = new Class210(Static24.aClass235_1, Static321.anInt5554, Static400.aClass384_100);
			Static39.aClass9_1 = new Class9(Static24.aClass235_1, Static321.anInt5554, Static400.aClass384_100, Static488.aClass384_112);
			Static575.aClass190_2 = new Class190(Static24.aClass235_1, Static321.anInt5554, Static400.aClass384_100, Static107.aClass384_33);
			Static221.aClass324_1 = new Class324(Static24.aClass235_1, Static321.anInt5554, Static400.aClass384_100);
			Static586.aClass337_1 = new Class337(Static24.aClass235_1, Static321.anInt5554, Static400.aClass384_100);
			Static525.aClass371_4 = new Class371(Static24.aClass235_1, Static321.anInt5554, true, Static159.aClass384_40, Static107.aClass384_33);
			Static40.aClass273_3 = new Class273(Static24.aClass235_1, Static321.anInt5554, Static400.aClass384_100, Static488.aClass384_112);
			Static39.aClass56_3 = new Class56(Static24.aClass235_1, Static321.anInt5554, Static400.aClass384_100, Static488.aClass384_112);
			Static258.aClass138_1 = new Class138(Static24.aClass235_1, Static321.anInt5554, true, Static148.aClass384_59, Static107.aClass384_33);
			Static479.aClass348_1 = new Class348(Static24.aClass235_1, Static321.anInt5554, true, Static246.aClass258_1, Static8.aClass384_5, Static107.aClass384_33);
			Static472.aClass317_1 = new Class317(Static24.aClass235_1, Static321.anInt5554, Static400.aClass384_100);
			Static396.aClass359_2 = new Class359(Static24.aClass235_1, Static321.anInt5554, Static152.aClass384_39, Static355.aClass384_92, Static48.aClass384_22);
			Static499.aClass121_1 = new Class121(Static24.aClass235_1, Static321.anInt5554, Static400.aClass384_100);
			Static629.aClass20_1 = new Class20(Static24.aClass235_1, Static321.anInt5554, Static400.aClass384_100);
			Static452.aClass170_4 = new Class170(Static24.aClass235_1, Static321.anInt5554, Static348.aClass384_89, Static107.aClass384_33);
			Static320.aClass133_1 = new Class133(Static24.aClass235_1, Static321.anInt5554, Static400.aClass384_100);
			Static400.aClass165_1 = new Class165(Static24.aClass235_1, Static321.anInt5554, Static400.aClass384_100);
			Static398.aClass312_1 = new Class312(Static24.aClass235_1, Static321.anInt5554, Static400.aClass384_100);
			Static386.aClass338_1 = new Class338(Static24.aClass235_1, Static321.anInt5554, Static462.aClass384_98);
			Static520.aClass381_1 = new Class381(Static24.aClass235_1, Static321.anInt5554, Static400.aClass384_100);
			Static563.method7912(Static107.aClass384_33, Static288.aClass384_72, Static488.aClass384_112, Static240.aClass384_57);
			Static57.method962(Static347.aClass384_128);
			Static48.aClass12_1 = new Class12(Static321.anInt5554, Static330.aClass384_83, Static602.aClass384_131);
			Static473.aClass171_1 = new Class171(Static321.anInt5554, Static330.aClass384_83, Static602.aClass384_131, new Class209());
			Static594.method8338();
			Static525.aClass371_4.method8561(Static627.aClass5_Sub46_31.aClass11_Sub10_1.method2643() == 0);
			Static564.aClass304_1 = new Class304();
			Static246.method3759();
			Static49.method782(Static557.aClass384_123);
			Static137.method2068(Static306.anInterface8_5, Static107.aClass384_33);
			@Pc(971) Class41 local971 = new Class41(Static635.aClass384_137.method8871("", "huffman"));
			Static181.method2919(local971);
			try {
				jagmisc.init();
			} catch (@Pc(978) Throwable local978) {
			}
			Static228.aClass145_1 = Static437.method6510();
			Static343.aClass5_Sub28_1 = new Class5_Sub28(true, Static214.aClass192_1);
		}
		if (Static472.aClass291_17 == Static154.aClass291_2) {
			local15 = method2424(Static488.aClass384_112) + Static245.method3741(true);
			local63 = Static545.method7732() + Static375.method5841();
			if (local63 > local15) {
				return local15 * 100 / local63;
			}
		}
		if (Static472.aClass291_18 == Static154.aClass291_2) {
			Static203.method148(Static280.aClass384_71, Static519.aClass163_7, Static244.aClass210_5, Static525.aClass371_4, Static40.aClass273_3, Static39.aClass56_3, Static564.aClass304_1);
		}
		if (Static154.aClass291_2 == Static472.aClass291_19) {
			Static18.aStringArray1 = new String[Static400.aClass165_1.anInt4287];
			Static605.anIntArray802 = new int[Static398.aClass312_1.anInt8606];
			Static361.aBooleanArray42 = new boolean[Static398.aClass312_1.anInt8606];
			for (local15 = 0; local15 < Static398.aClass312_1.anInt8606; local15++) {
				if (Static398.aClass312_1.method7415(local15).anInt1788 == 0) {
					Static361.aBooleanArray42[local15] = true;
					Static184.anInt3327++;
				}
				Static605.anIntArray802[local15] = -1;
			}
			Static67.method1110();
			Static452.anInt8709 = Static240.aClass384_57.method8890("loginscreen");
			Static274.anInt10336 = Static240.aClass384_57.method8890("lobbyscreen");
			Static342.aClass384_86.method8889(false);
			Static7.aClass384_3.method8889(true);
			Static488.aClass384_112.method8889(true);
			Static288.aClass384_72.method8889(true);
			Static635.aClass384_137.method8889(true);
			Static240.aClass384_57.method8889(true);
			Static400.aClass384_100.anInt10469 = 2;
			Static87.aBoolean115 = true;
			Static511.aClass384_113.anInt10469 = 2;
			Static159.aClass384_40.anInt10469 = 2;
			Static148.aClass384_59.anInt10469 = 2;
			Static8.aClass384_5.anInt10469 = 2;
			Static152.aClass384_39.anInt10469 = 2;
			Static348.aClass384_89.anInt10469 = 2;
		}
		if (Static472.aClass291_20 == Static154.aClass291_2) {
			if (!Static567.method8019(Static452.anInt8709)) {
				return 0;
			}
			local166 = true;
			for (local63 = 0; local63 < Static441.aClass357ArrayArray1[Static452.anInt8709].length; local63++) {
				@Pc(1154) Class357 local1154 = Static441.aClass357ArrayArray1[Static452.anInt8709][local63];
				if (local1154.anInt9828 == 5 && local1154.anInt9810 != -1 && !Static488.aClass384_112.method8878(0, local1154.anInt9810)) {
					local166 = false;
				}
			}
			if (!local166) {
				return 0;
			}
		}
		if (Static154.aClass291_2 == Static472.aClass291_21) {
			Static190.method670(true);
		}
		if (Static154.aClass291_2 == Static472.aClass291_22) {
			Static182.aClass90_1.method1826();
			try {
				Static362.aThread5.join();
			} catch (@Pc(1204) InterruptedException local1204) {
				return 0;
			}
			Static292.aClass384_75 = null;
			Static25.anInterface22Array1 = null;
			Static182.aClass90_1 = null;
			Static515.aClass384_115 = null;
			Static362.aThread5 = null;
			Static154.aClass327_1 = null;
			Static494.method7287();
			Static475.aBoolean712 = Static627.aClass5_Sub46_31.aClass11_Sub12_1.method3658() == 1;
			Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub12_1, 1);
			if (Static475.aBoolean712) {
				Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub15_1, 0);
			} else if (Static627.aClass5_Sub46_31.aClass11_Sub15_1.aBoolean385 && Static343.aClass5_Sub28_1.anInt5496 < 512 && Static343.aClass5_Sub28_1.anInt5496 != 0) {
				Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub15_1, 0);
			}
			Static499.method7307();
			if (Static475.aBoolean712) {
				Static590.method8288(false, 0);
			} else {
				Static590.method8288(false, Static627.aClass5_Sub46_31.aClass11_Sub15_1.method4289());
			}
			Static236.method3632(false, Static627.aClass5_Sub46_31.aClass11_Sub1_1.method191(), -1, -1);
			Static462.method6096(Static485.aClass126_17);
			Static526.method7539(Static485.aClass126_17);
			Static613.method8506(Static488.aClass384_112, Static485.aClass126_17);
			Static231.method3612(Static184.aClass44Array8);
		}
		return Static427.method6424();
	}
}
