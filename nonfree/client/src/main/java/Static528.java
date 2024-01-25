import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static528 {

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "[I")
	public static final int[] anIntArray611 = new int[2048];

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)I")
	public static int method7368() {
		@Pc(10) int local10;
		if (Static404.aClass2_Sub13_2.aClass33_Sub29_1.method8447() == 0) {
			for (local10 = 0; local10 < Static470.anInt8064; local10++) {
				if (Static15.anInterface16Array1[local10].method4737() == 's' || Static15.anInterface16Array1[local10].method4737() == 'S') {
					Static404.aClass2_Sub13_2.method1383(1, Static404.aClass2_Sub13_2.aClass33_Sub29_1);
					break;
				}
			}
		}
		@Pc(57) int local57;
		if (Static631.aClass372_3 == Static410.aClass372_1) {
			@Pc(47) Runtime local47 = Runtime.getRuntime();
			local57 = (int) ((local47.totalMemory() - local47.freeMemory()) / 1024L);
			@Pc(60) long local60 = Static438.method6517();
			if (Static301.aLong162 == 0L) {
				Static301.aLong162 = local60;
			}
			if (local57 > 16384 && local60 - Static301.aLong162 < 5000L) {
				if (local60 - Static495.aLong231 > 1000L) {
					System.gc();
					Static495.aLong231 = local60;
				}
				return 0;
			}
		}
		if (Static410.aClass372_1 == Static631.aClass372_4) {
			if (Static622.aClass224_1 == null) {
				Static622.aClass224_1 = new Class224(Static252.aClass190_1, Static397.aClass325_2, Static139.aBigInteger4, Static429.aBigInteger7);
			}
			if (!Static622.aClass224_1.method5483()) {
				return 0;
			}
			Static596.method8206(null, true, 0);
			Static49.aBoolean76 = !Static466.method3728();
			Static444.aClass97_111 = Static238.method3938(false, Static49.aBoolean76 ? 34 : 32, 1);
			Static145.aClass97_36 = Static238.method3938(false, 33, 1);
			Static428.aClass97_107 = Static238.method3938(false, 13, 1);
		}
		@Pc(152) boolean local152;
		if (Static631.aClass372_5 == Static410.aClass372_1) {
			local152 = Static145.aClass97_36.method2553();
			local57 = Static8.aClass167_Sub1Array1[33].method6963();
			local57 += Static8.aClass167_Sub1Array1[Static49.aBoolean76 ? 34 : 32].method6963();
			local57 += Static8.aClass167_Sub1Array1[13].method6963();
			local57 += local152 ? 100 : Static145.aClass97_36.method2554();
			if (local57 != 400) {
				return local57 / 4;
			}
			Static279.anInt5329 = Static444.aClass97_111.method2547();
			Static223.anInt4591 = Static145.aClass97_36.method2547();
			Static220.method3782(Static444.aClass97_111);
			@Pc(211) int local211 = Static404.aClass2_Sub13_2.aClass33_Sub27_1.method8344();
			Static512.aClass129_1 = new Class129(Static499.aClass63_15, Static377.anInt6756, Static145.aClass97_36);
			@Pc(223) int[] local223 = Static512.aClass129_1.method3297(local211);
			if (local223.length == 0) {
				local223 = Static512.aClass129_1.method3297(0);
			}
			@Pc(240) Class186 local240 = new Class186(Static444.aClass97_111, Static428.aClass97_107);
			if (local223.length > 0) {
				Static207.anInterface14Array1 = new Interface14[local223.length];
				for (@Pc(252) int local252 = 0; local252 < Static207.anInterface14Array1.length; local252++) {
					Static207.anInterface14Array1[local252] = new Class242(Static512.aClass129_1.method3296(local223[local252]), local240);
				}
			}
		}
		if (Static410.aClass372_1 == Static631.aClass372_6) {
			Static340.method5231(Static428.aClass97_107, Static444.aClass97_111, Static335.method4771());
		}
		if (Static631.aClass372_7 == Static410.aClass372_1) {
			local10 = Static283.method4473();
			local57 = Static70.method1354();
			if (local10 < local57) {
				return local10 * 100 / local57;
			}
		}
		if (Static631.aClass372_8 == Static410.aClass372_1) {
			if (Static207.anInterface14Array1 != null && Static207.anInterface14Array1.length > 0) {
				if (Static207.anInterface14Array1[0].method6245() < 100) {
					return 0;
				}
				if (Static207.anInterface14Array1.length > 1 && Static512.aClass129_1.method3295() && Static207.anInterface14Array1[1].method6245() < 100) {
					return 0;
				}
			}
			Static74.method1386(Static600.aClass87_15);
			Static411.method6321(Static600.aClass87_15);
			Static51.method997(1);
		}
		if (Static631.aClass372_9 == Static410.aClass372_1) {
			for (local10 = 0; local10 < 4; local10++) {
				Static19.aClass179Array2[local10] = Static282.method4468(Static3.anInt46, Static270.anInt5194);
			}
		}
		if (Static631.aClass372_10 == Static410.aClass372_1) {
			Static594.aClass97_144 = Static238.method3938(false, 8, 1);
			Static164.aClass97_42 = Static238.method3938(false, 0, 1);
			Static573.aClass97_139 = Static238.method3938(false, 1, 1);
			Static104.aClass97_26 = Static238.method3938(false, 2, 1);
			Static100.aClass97_25 = Static238.method3938(false, 3, 1);
			Static560.aClass97_137 = Static238.method3938(false, 4, 1);
			Static48.aClass97_6 = Static238.method3938(true, 5, 1);
			Static536.aClass97_133 = Static238.method3938(true, 6, 1);
			Static625.aClass97_153 = Static238.method3938(false, 7, 1);
			Static276.aClass97_69 = Static238.method3938(false, 9, 1);
			Static345.aClass97_91 = Static238.method3938(false, 10, 1);
			Static226.aClass97_60 = Static238.method3938(false, 11, 1);
			Static224.aClass97_59 = Static238.method3938(false, 12, 1);
			Static333.aClass97_87 = Static238.method3938(false, 14, 1);
			Static87.aClass97_17 = Static238.method3938(false, 15, 1);
			Static95.aClass97_21 = Static238.method3938(false, 16, 1);
			Static410.aClass97_101 = Static238.method3938(false, 17, 1);
			Static377.aClass97_96 = Static238.method3938(false, 18, 1);
			Static64.aClass97_12 = Static238.method3938(false, 19, 1);
			Static328.aClass97_84 = Static238.method3938(false, 20, 1);
			Static282.aClass97_70 = Static238.method3938(false, 21, 1);
			Static544.aClass97_135 = Static238.method3938(false, 22, 1);
			Static612.aClass97_149 = Static238.method3938(true, 23, 1);
			Static253.aClass97_65 = Static238.method3938(false, 24, 1);
			Static551.aClass97_136 = Static238.method3938(false, 25, 1);
			Static442.aClass97_110 = Static238.method3938(true, 26, 1);
			Static372.aClass97_95 = Static238.method3938(false, 27, 1);
			Static150.aClass97_37 = Static238.method3938(true, 28, 1);
			Static644.aClass97_154 = Static238.method3938(false, 29, 1);
			Static193.aClass97_56 = Static238.method3938(true, 30, 1);
			Static181.aClass97_52 = Static238.method3938(true, 31, 1);
			Static312.aClass97_78 = Static238.method3938(true, 36, 2);
		}
		if (Static410.aClass372_1 == Static631.aClass372_11) {
			local10 = 0;
			for (local57 = 0; local57 < 37; local57++) {
				if (Static8.aClass167_Sub1Array1[local57] != null) {
					local10 += Static8.aClass167_Sub1Array1[local57].method6963() * Static401.anIntArray495[local57] / 100;
				}
			}
			if (local10 != 100) {
				if (Static149.anInt9153 < 0) {
					Static149.anInt9153 = local10;
				}
				return (local10 - Static149.anInt9153) * 100 / (100 - Static149.anInt9153);
			}
			Static364.method5550(Static594.aClass97_144);
			Static340.method5231(Static428.aClass97_107, Static594.aClass97_144, Static335.method4771());
		}
		if (Static631.aClass372_12 == Static410.aClass372_1) {
			if (Static80.anInt1719 == -1) {
				Static80.anInt1719 = Static536.aClass97_133.method2574("scape main");
			}
			Static432.method6473();
			Static51.method997(2);
		}
		if (Static631.aClass372_13 == Static410.aClass372_1) {
			Static38.method831(Static375.aClass359_4, Static193.aClass97_56);
		}
		if (Static631.aClass372_14 == Static410.aClass372_1) {
			local10 = Static38.method830();
			if (local10 < 100) {
				return local10;
			}
			Static252.method4166(Static150.aClass97_37.method2570(1));
			Static175.method3256(Static150.aClass97_37.method2570(3));
		}
		if (Static410.aClass372_1 == Static631.aClass372_15) {
			if (Static415.anInt7581 != -1 && !Static625.aClass97_153.method2561(Static415.anInt7581, 0)) {
				return 99;
			}
			Static23.anInterface6_1 = new Class249(Static442.aClass97_110, Static276.aClass97_69, Static594.aClass97_144);
			Static584.aClass206_2 = new Class206(Static499.aClass63_15, Static377.anInt6756, Static104.aClass97_26);
			Static182.aClass140_1 = new Class140(Static499.aClass63_15, Static377.anInt6756, Static104.aClass97_26);
			Static151.aClass273_1 = new Class273(Static499.aClass63_15, Static377.anInt6756, Static104.aClass97_26, Static594.aClass97_144);
			Static197.aClass118_1 = new Class118(Static499.aClass63_15, Static377.anInt6756, Static410.aClass97_101);
			Static29.aClass77_1 = new Class77(Static499.aClass63_15, Static377.anInt6756, Static104.aClass97_26);
			Static3.aClass14_1 = new Class14(Static499.aClass63_15, Static377.anInt6756, Static104.aClass97_26);
			Static489.aClass344_1 = new Class344(Static499.aClass63_15, Static377.anInt6756, Static104.aClass97_26, Static625.aClass97_153);
			Static496.aClass53_1 = new Class53(Static499.aClass63_15, Static377.anInt6756, Static104.aClass97_26);
			Static375.aClass58_1 = new Class58(Static499.aClass63_15, Static377.anInt6756, Static104.aClass97_26);
			Static619.aClass281_4 = new Class281(Static499.aClass63_15, Static377.anInt6756, true, Static95.aClass97_21, Static625.aClass97_153);
			Static259.aClass248_2 = new Class248(Static499.aClass63_15, Static377.anInt6756, Static104.aClass97_26, Static594.aClass97_144);
			Static509.aClass139_3 = new Class139(Static499.aClass63_15, Static377.anInt6756, Static104.aClass97_26, Static594.aClass97_144);
			Static341.aClass76_1 = new Class76(Static499.aClass63_15, Static377.anInt6756, true, Static377.aClass97_96, Static625.aClass97_153);
			Static570.aClass267_2 = new Class267(Static499.aClass63_15, Static377.anInt6756, true, Static584.aClass206_2, Static64.aClass97_12, Static625.aClass97_153);
			Static290.aClass119_1 = new Class119(Static499.aClass63_15, Static377.anInt6756, Static104.aClass97_26);
			Static185.aClass303_1 = new Class303(Static499.aClass63_15, Static377.anInt6756, Static328.aClass97_84, Static164.aClass97_42, Static573.aClass97_139);
			Static571.aClass169_1 = new Class169(Static499.aClass63_15, Static377.anInt6756, Static104.aClass97_26);
			Static576.aClass343_1 = new Class343(Static499.aClass63_15, Static377.anInt6756, Static104.aClass97_26);
			Static414.aClass356_2 = new Class356(Static499.aClass63_15, Static377.anInt6756, Static282.aClass97_70, Static625.aClass97_153);
			Static232.aClass92_3 = new Class92(Static499.aClass63_15, Static377.anInt6756, Static104.aClass97_26);
			Static406.aClass195_30 = new Class195(Static499.aClass63_15, Static377.anInt6756, Static104.aClass97_26);
			Static339.aClass128_1 = new Class128(Static499.aClass63_15, Static377.anInt6756, Static104.aClass97_26);
			Static23.aClass296_1 = new Class296(Static499.aClass63_15, Static377.anInt6756, Static544.aClass97_135);
			Static18.aClass244_1 = new Class244(Static499.aClass63_15, Static377.anInt6756, Static104.aClass97_26);
			Static201.method3527(Static625.aClass97_153, Static100.aClass97_25, Static428.aClass97_107, Static594.aClass97_144);
			Static425.method4455(Static644.aClass97_154);
			Static239.aClass180_6 = new Class180(Static377.anInt6756, Static253.aClass97_65, Static551.aClass97_136);
			Static249.aClass111_1 = new Class111(Static377.anInt6756, Static253.aClass97_65, Static551.aClass97_136, new Class155());
			Static380.method5724();
			Static619.aClass281_4.method6735(Static404.aClass2_Sub13_2.aClass33_Sub26_1.method8294() == 0);
			Static438.aClass198_1 = new Class198();
			Static53.method1014();
			Static71.method1358(Static372.aClass97_95);
			Static456.method6669(Static625.aClass97_153, Static23.anInterface6_1);
			@Pc(946) Class193 local946 = new Class193(Static345.aClass97_91.method2567("", "huffman"));
			Static321.method8562(local946);
			try {
				jagmisc.init();
			} catch (@Pc(953) Throwable local953) {
			}
			Static149.aClass15_10 = Static385.method5794();
			Static620.aClass2_Sub23_1 = new Class2_Sub23(true, Static375.aClass359_4);
		}
		if (Static410.aClass372_1 == Static631.aClass372_17) {
			local10 = Static611.method8351(Static594.aClass97_144) + Static487.method6993(true);
			local57 = Static121.method2494() + Static70.method1354();
			if (local57 > local10) {
				return local10 * 100 / local57;
			}
		}
		if (Static410.aClass372_1 == Static631.aClass372_18) {
			Static292.method7047(Static612.aClass97_149, Static29.aClass77_1, Static3.aClass14_1, Static619.aClass281_4, Static259.aClass248_2, Static509.aClass139_3, Static438.aClass198_1);
		}
		if (Static410.aClass372_1 == Static631.aClass372_19) {
			Static608.anIntArray246 = new int[Static339.aClass128_1.anInt4003];
			Static229.aStringArray11 = new String[Static406.aClass195_30.anInt5618];
			Static276.aBooleanArray33 = new boolean[Static339.aClass128_1.anInt4003];
			for (local10 = 0; local10 < Static339.aClass128_1.anInt4003; local10++) {
				if (Static339.aClass128_1.method3293(local10).anInt2868 == 0) {
					Static276.aBooleanArray33[local10] = true;
					Static127.anInt2951++;
				}
				Static608.anIntArray246[local10] = -1;
			}
			Static323.method4874();
			Static276.anInt5310 = Static100.aClass97_25.method2574("loginscreen");
			Static485.anInt8300 = Static100.aClass97_25.method2574("lobbyscreen");
			Static48.aClass97_6.method2542(false);
			Static536.aClass97_133.method2542(true);
			Static594.aClass97_144.method2542(true);
			Static428.aClass97_107.method2542(true);
			Static345.aClass97_91.method2542(true);
			Static100.aClass97_25.method2542(true);
			Static104.aClass97_26.anInt3014 = 2;
			Static421.aBoolean575 = true;
			Static410.aClass97_101.anInt3014 = 2;
			Static95.aClass97_21.anInt3014 = 2;
			Static377.aClass97_96.anInt3014 = 2;
			Static64.aClass97_12.anInt3014 = 2;
			Static328.aClass97_84.anInt3014 = 2;
			Static282.aClass97_70.anInt3014 = 2;
		}
		if (Static410.aClass372_1 == Static631.aClass372_20) {
			if (!Static164.method3053(Static276.anInt5310)) {
				return 0;
			}
			local152 = true;
			for (local57 = 0; local57 < Static399.aClass78ArrayArray1[Static276.anInt5310].length; local57++) {
				@Pc(1144) Class78 local1144 = Static399.aClass78ArrayArray1[Static276.anInt5310][local57];
				if (local1144.anInt1955 == 5 && local1144.anInt1986 != -1 && !Static594.aClass97_144.method2561(local1144.anInt1986, 0)) {
					local152 = false;
				}
			}
			if (!local152) {
				return 0;
			}
		}
		if (Static631.aClass372_21 == Static410.aClass372_1) {
			Static161.method3023(true);
		}
		if (Static631.aClass372_22 == Static410.aClass372_1) {
			Static368.aClass349_2.method8070();
			try {
				Static3.aThread1.join();
			} catch (@Pc(1194) InterruptedException local1194) {
				return 0;
			}
			Static207.anInterface14Array1 = null;
			Static3.aThread1 = null;
			Static512.aClass129_1 = null;
			Static145.aClass97_36 = null;
			Static444.aClass97_111 = null;
			Static368.aClass349_2 = null;
			Static237.method3927();
			Static599.aBoolean721 = Static404.aClass2_Sub13_2.aClass33_Sub29_1.method8447() == 1;
			Static404.aClass2_Sub13_2.method1383(1, Static404.aClass2_Sub13_2.aClass33_Sub29_1);
			Static209.method3628();
			if (Static599.aBoolean721) {
				Static352.method5455(false, 0);
			} else {
				Static352.method5455(false, Static404.aClass2_Sub13_2.aClass33_Sub24_2.method7329());
			}
			Static227.method3850(Static404.aClass2_Sub13_2.aClass33_Sub7_2.method3189(), false, -1, -1);
			Static74.method1386(Static600.aClass87_15);
			Static411.method6321(Static600.aClass87_15);
			Static183.method3304(Static594.aClass97_144, Static600.aClass87_15);
			Static107.method1806(Static539.aClass20Array13);
		}
		return Static200.method3506();
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!eq;II)Lclient!fp;")
	public static Class114 method7370(@OriginalArg(0) Class97 arg0, @OriginalArg(2) int arg1) {
		@Pc(14) byte[] local14 = arg0.method2570(arg1);
		return local14 == null ? null : new Class114(local14);
	}
}
