import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static441 {

	@OriginalMember(owner = "client!oka", name = "b", descriptor = "I")
	public static int anInt7456;

	@OriginalMember(owner = "client!oka", name = "d", descriptor = "[I")
	public static int[] anIntArray394;

	@OriginalMember(owner = "client!oka", name = "c", descriptor = "[I")
	public static final int[] anIntArray395 = new int[13];

	@OriginalMember(owner = "client!oka", name = "a", descriptor = "(ICI)I")
	public static int method6593(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			@Pc(24) char local24 = Character.toLowerCase(arg0);
			local13 = (local24 << 4) + 1;
		}
		return local13;
	}

	@OriginalMember(owner = "client!oka", name = "a", descriptor = "(I)I")
	public static int method6594() {
		@Pc(8) int local8;
		if (Static181.aClass14_Sub26_9.aClass43_Sub18_1.method5170() == 0) {
			for (local8 = 0; local8 < Static563.anInt4938; local8++) {
				if (Static340.anInterface17Array1[local8].method650() == 's' || Static340.anInterface17Array1[local8].method650() == 'S') {
					Static181.aClass14_Sub26_9.method5270(1, Static181.aClass14_Sub26_9.aClass43_Sub18_1);
					Static479.aBoolean587 = true;
					break;
				}
			}
		}
		@Pc(72) int local72;
		if (Static18.aClass168_1 == Static243.aClass168_2) {
			@Pc(63) Runtime local63 = Runtime.getRuntime();
			local72 = (int) ((local63.totalMemory() - local63.freeMemory()) / 1024L);
			@Pc(75) long local75 = Static26.method382();
			if (Static577.aLong263 == 0L) {
				Static577.aLong263 = local75;
			}
			if (local72 > 16384 && local75 - Static577.aLong263 < 5000L) {
				if (local75 - Static203.aLong119 > 1000L) {
					System.gc();
					Static203.aLong119 = local75;
				}
				return 0;
			}
		}
		if (Static243.aClass168_3 == Static18.aClass168_1) {
			if (Static343.aClass52_1 == null) {
				Static343.aClass52_1 = new Class52(Static685.aClass24_3, Static466.aClass364_2, Static129.aBigInteger4, Static478.aBigInteger6);
			}
			if (!Static343.aClass52_1.method1025()) {
				return 0;
			}
			Static602.method8507(true, 0, (String) null);
			Static490.aBoolean597 = !Static554.method8001();
			Static132.aClass310_33 = Static526.method7811(1, Static490.aBoolean597 ? 34 : 32, false);
			Static662.aClass310_133 = Static526.method7811(1, 33, false);
			Static130.aClass310_31 = Static526.method7811(1, 13, false);
		}
		@Pc(180) boolean local180;
		if (Static18.aClass168_1 == Static243.aClass168_4) {
			local180 = Static662.aClass310_133.method7784();
			local72 = Static84.aClass293_Sub1Array2[33].method7313();
			local72 += Static84.aClass293_Sub1Array2[Static490.aBoolean597 ? 34 : 32].method7313();
			local72 += Static84.aClass293_Sub1Array2[13].method7313();
			local72 += local180 ? 100 : Static662.aClass310_133.method7775((byte) -51);
			if (local72 != 400) {
				return local72 / 4;
			}
			Static323.anInt5607 = Static132.aClass310_33.method7797();
			Static450.anInt7526 = Static662.aClass310_133.method7797();
			Static416.method6261(Static132.aClass310_33);
			@Pc(244) int local244 = Static181.aClass14_Sub26_9.aClass43_Sub6_1.method2623();
			Static597.aClass116_1 = new Class116(Static161.aClass80_6, Static26.anInt352, Static662.aClass310_133);
			@Pc(256) int[] local256 = Static597.aClass116_1.method2332(local244);
			if (local256.length == 0) {
				local256 = Static597.aClass116_1.method2332(0);
			}
			@Pc(270) Class373 local270 = new Class373(Static132.aClass310_33, Static130.aClass310_31);
			if (local256.length > 0) {
				Static588.anInterface11Array1 = new Interface11[local256.length];
				for (@Pc(279) int local279 = 0; local279 < Static588.anInterface11Array1.length; local279++) {
					Static588.anInterface11Array1[local279] = new Class87(Static597.aClass116_1.method2331(local256[local279]), local270);
				}
			}
		}
		if (Static243.aClass168_5 == Static18.aClass168_1) {
			Static341.method5220(Static429.method6442(), Static132.aClass310_33, Static130.aClass310_31);
		}
		if (Static243.aClass168_6 == Static18.aClass168_1) {
			local8 = Static460.method7426();
			local72 = Static100.method1674();
			if (local8 < local72) {
				return local8 * 100 / local72;
			}
		}
		if (Static18.aClass168_1 == Static243.aClass168_7) {
			if (Static588.anInterface11Array1 != null && Static588.anInterface11Array1.length > 0) {
				if (Static588.anInterface11Array1[0].method5416() < 100) {
					return 0;
				}
				if (Static588.anInterface11Array1.length > 1 && Static597.aClass116_1.method2330() && Static588.anInterface11Array1[1].method5416() < 100) {
					return 0;
				}
			}
			Static86.method1436(Static103.aClass144_3);
			Static544.method8201(Static103.aClass144_3);
			Static160.method2323(1);
		}
		if (Static18.aClass168_1 == Static243.aClass168_8) {
			for (local8 = 0; local8 < 4; local8++) {
				Static40.aClass289Array1[local8] = Static269.method8946(Static542.anInt9214, Static380.anInt6689);
			}
		}
		if (Static18.aClass168_1 == Static243.aClass168_9) {
			Static99.aClass310_23 = Static526.method7811(1, 8, false);
			Static126.aClass310_111 = Static526.method7811(1, 0, false);
			Static663.aClass310_134 = Static526.method7811(1, 1, false);
			Static376.aClass310_102 = Static526.method7811(1, 2, false);
			Static396.aClass310_81 = Static526.method7811(1, 3, false);
			Static620.aClass310_121 = Static526.method7811(1, 4, false);
			Static655.aClass310_132 = Static526.method7811(1, 5, true);
			Static341.aClass310_67 = Static526.method7811(1, 6, true);
			Static640.aClass310_127 = Static526.method7811(1, 7, false);
			Static355.aClass310_72 = Static526.method7811(1, 9, false);
			Static358.aClass310_73 = Static526.method7811(1, 10, false);
			Static581.aClass310_113 = Static526.method7811(1, 11, false);
			Static413.aClass310_89 = Static526.method7811(1, 12, false);
			Static237.aClass310_52 = Static526.method7811(1, 14, false);
			Static245.aClass310_55 = Static526.method7811(1, 15, false);
			Static403.aClass310_85 = Static526.method7811(1, 16, false);
			Static192.aClass310_135 = Static526.method7811(1, 17, false);
			Static524.aClass310_114 = Static526.method7811(1, 18, false);
			Static525.aClass310_105 = Static526.method7811(1, 19, false);
			Static214.aClass310_47 = Static526.method7811(1, 20, false);
			Static129.aClass310_28 = Static526.method7811(1, 21, false);
			Static604.aClass310_118 = Static526.method7811(1, 22, false);
			Static123.aClass310_26 = Static526.method7811(1, 23, true);
			Static228.aClass310_50 = Static526.method7811(1, 24, false);
			Static65.aClass310_16 = Static526.method7811(1, 25, false);
			Static334.aClass310_65 = Static526.method7811(1, 26, true);
			Static31.aClass310_8 = Static526.method7811(1, 27, false);
			Static4.aClass310_1 = Static526.method7811(1, 28, true);
			Static97.aClass310_22 = Static526.method7811(1, 29, false);
			Static248.aClass310_57 = Static526.method7811(1, 30, true);
			Static75.aClass310_17 = Static526.method7811(1, 31, true);
			Static64.aClass310_13 = Static526.method7811(2, 36, true);
		}
		if (Static243.aClass168_10 == Static18.aClass168_1) {
			local8 = 0;
			for (local72 = 0; local72 < 37; local72++) {
				if (Static84.aClass293_Sub1Array2[local72] != null) {
					local8 += Static84.aClass293_Sub1Array2[local72].method7313() * Static667.anIntArray586[local72] / 100;
				}
			}
			if (local8 != 100) {
				if (Static553.anInt9260 < 0) {
					Static553.anInt9260 = local8;
				}
				return (local8 - Static553.anInt9260) * 100 / (100 - Static553.anInt9260);
			}
			Static337.method5169(Static99.aClass310_23);
			Static341.method5220(Static429.method6442(), Static99.aClass310_23, Static130.aClass310_31);
		}
		if (Static18.aClass168_1 == Static243.aClass168_11) {
			@Pc(715) byte[] local715 = Static4.aClass310_1.method7795(4);
			if (local715 == null) {
				return 0;
			}
			Static309.method7555((byte) 57, local715);
			Static243.method4059();
			Static160.method2323(2);
		}
		if (Static243.aClass168_12 == Static18.aClass168_1) {
			Static157.method2250(Static248.aClass310_57, Static344.aClass173_5);
		}
		if (Static243.aClass168_13 == Static18.aClass168_1) {
			local8 = Static446.method6636();
			if (local8 < 100) {
				return local8;
			}
			Static392.method5972(Static4.aClass310_1.method7795(1));
			Static551.aClass355_1 = new Class355(Static4.aClass310_1);
			Static673.aShortArrayArray6 = Static551.aClass355_1.aShortArrayArray5;
			Static222.aShortArrayArrayArray1 = Static551.aClass355_1.aShortArrayArrayArray2;
			Static642.aClass400_2 = new Class400(Static4.aClass310_1);
		}
		if (Static243.aClass168_14 == Static18.aClass168_1) {
			if (Static551.aClass355_1.anInt9855 != -1 && !Static640.aClass310_127.method7793(0, Static551.aClass355_1.anInt9855)) {
				return 99;
			}
			Static160.anInterface4_3 = new Class372(Static334.aClass310_65, Static355.aClass310_72, Static99.aClass310_23);
			Static653.aClass104_2 = new Class104(Static161.aClass80_6, Static26.anInt352, Static376.aClass310_102);
			Static52.aClass175_1 = new Class175(Static161.aClass80_6, Static26.anInt352, Static376.aClass310_102, Static642.aClass400_2);
			Static603.aClass279_2 = new Class279(Static161.aClass80_6, Static26.anInt352, Static376.aClass310_102, Static99.aClass310_23);
			Static153.aClass322_1 = new Class322(Static161.aClass80_6, Static26.anInt352, Static192.aClass310_135);
			Static130.aClass389_5 = new Class389(Static161.aClass80_6, Static26.anInt352, Static376.aClass310_102);
			Static337.aClass50_4 = new Class50(Static161.aClass80_6, Static26.anInt352, Static376.aClass310_102);
			Static638.aClass262_2 = new Class262(Static161.aClass80_6, Static26.anInt352, Static376.aClass310_102, Static99.aClass310_23);
			Static265.aClass103_2 = new Class103(Static161.aClass80_6, Static26.anInt352, Static376.aClass310_102, Static640.aClass310_127);
			Static688.aClass232_1 = new Class232(Static161.aClass80_6, Static26.anInt352, Static376.aClass310_102);
			Static607.aClass308_1 = new Class308(Static161.aClass80_6, Static26.anInt352, Static376.aClass310_102);
			Static212.aClass249_4 = new Class249(Static161.aClass80_6, Static26.anInt352, true, Static403.aClass310_85, Static640.aClass310_127);
			Static690.aClass274_7 = new Class274(Static161.aClass80_6, Static26.anInt352, Static376.aClass310_102, Static99.aClass310_23);
			Static94.aClass334_3 = new Class334(Static161.aClass80_6, Static26.anInt352, Static376.aClass310_102, Static99.aClass310_23);
			Static152.aClass61_1 = new Class61(Static161.aClass80_6, Static26.anInt352, true, Static524.aClass310_114, Static640.aClass310_127);
			Static252.aClass56_1 = new Class56(Static161.aClass80_6, Static26.anInt352, true, Static653.aClass104_2, Static525.aClass310_105, Static640.aClass310_127);
			Static285.aClass325_1 = new Class325(Static161.aClass80_6, Static26.anInt352, Static376.aClass310_102);
			Static59.aClass204_1 = new Class204(Static161.aClass80_6, Static26.anInt352, Static214.aClass310_47, Static126.aClass310_111, Static663.aClass310_134);
			Static254.aClass142_1 = new Class142(Static161.aClass80_6, Static26.anInt352, Static376.aClass310_102);
			Static103.aClass171_1 = new Class171(Static161.aClass80_6, Static26.anInt352, Static376.aClass310_102);
			Static453.aClass281_2 = new Class281(Static161.aClass80_6, Static26.anInt352, Static129.aClass310_28, Static640.aClass310_127);
			Static241.aClass253_1 = new Class253(Static161.aClass80_6, Static26.anInt352, Static376.aClass310_102);
			Static673.aClass390_1 = new Class390(Static161.aClass80_6, Static26.anInt352, Static376.aClass310_102);
			Static365.aClass331_1 = new Class331(Static161.aClass80_6, Static26.anInt352, Static376.aClass310_102);
			Static431.aClass18_1 = new Class18(Static161.aClass80_6, Static26.anInt352, Static604.aClass310_118);
			Static144.aClass379_2 = new Class379(Static161.aClass80_6, Static26.anInt352, Static376.aClass310_102);
			Static258.aClass370_1 = new Class370(Static161.aClass80_6, Static26.anInt352, Static376.aClass310_102);
			Static485.aClass264_1 = new Class264(Static161.aClass80_6, Static26.anInt352, Static376.aClass310_102);
			Static216.method5711(Static99.aClass310_23, Static640.aClass310_127, Static130.aClass310_31, Static396.aClass310_81);
			Static69.method1090(Static97.aClass310_22);
			Static541.aClass77_1 = new Class77(Static26.anInt352, Static228.aClass310_50, Static65.aClass310_16);
			Static592.aClass46_2 = new Class46(Static26.anInt352, Static228.aClass310_50, Static65.aClass310_16, new Class48());
			Static353.method9158();
			Static212.aClass249_4.method6129(Static181.aClass14_Sub26_9.aClass43_Sub19_1.method5412() == 0);
			Static188.aClass238_1 = new Class238();
			Static38.method661();
			Static170.method2464(Static59.aClass204_1);
			Static42.method4376(Static31.aClass310_8);
			Static350.method5347(Static640.aClass310_127, Static160.anInterface4_3);
			@Pc(1075) Class296 local1075 = new Class296(Static358.aClass310_73.method7801("", "huffman"));
			Static425.method6395(local1075);
			try {
				jagmisc.init();
			} catch (@Pc(1082) Throwable local1082) {
			}
			Static15.aClass2_1 = Static534.method7888();
			Static526.aClass14_Sub12_1 = new Class14_Sub12(true, Static344.aClass173_5);
		}
		if (Static18.aClass168_1 == Static243.aClass168_16) {
			local8 = Static193.method8384(Static99.aClass310_23) + Static294.method4853(true);
			local72 = Static180.method2651() + Static100.method1674();
			if (local8 < local72) {
				return local8 * 100 / local72;
			}
		}
		if (Static18.aClass168_1 == Static243.aClass168_17) {
			Static224.method1299(Static123.aClass310_26, Static130.aClass389_5, Static337.aClass50_4, Static212.aClass249_4, Static690.aClass274_7, Static94.aClass334_3, Static188.aClass238_1);
		}
		if (Static18.aClass168_1 == Static243.aClass168_18) {
			Static110.aStringArray14 = new String[Static673.aClass390_1.anInt10949];
			Static184.anIntArray401 = new int[Static365.aClass331_1.anInt9369];
			Static195.aBooleanArray6 = new boolean[Static365.aClass331_1.anInt9369];
			for (local8 = 0; local8 < Static365.aClass331_1.anInt9369; local8++) {
				if (Static365.aClass331_1.method8080(local8).anInt10620 == 0) {
					Static195.aBooleanArray6[local8] = true;
					Static15.anInt213++;
				}
				Static184.anIntArray401[local8] = -1;
			}
			Static139.method2103();
			Static655.aClass310_132.method7777(false);
			Static341.aClass310_67.method7777(true);
			Static99.aClass310_23.method7777(true);
			Static130.aClass310_31.method7777(true);
			Static358.aClass310_73.method7777(true);
			Static655.aBoolean740 = true;
			Static376.aClass310_102.anInt9032 = 2;
			Static192.aClass310_135.anInt9032 = 2;
			Static403.aClass310_85.anInt9032 = 2;
			Static524.aClass310_114.anInt9032 = 2;
			Static525.aClass310_105.anInt9032 = 2;
			Static214.aClass310_47.anInt9032 = 2;
			Static129.aClass310_28.anInt9032 = 2;
		}
		if (Static18.aClass168_1 == Static243.aClass168_19) {
			if (!Static558.method8063(Static551.aClass355_1.anInt9851)) {
				return 0;
			}
			local180 = true;
			for (local72 = 0; local72 < Static339.aClass299ArrayArray1[Static551.aClass355_1.anInt9851].length; local72++) {
				@Pc(1265) Class299 local1265 = Static339.aClass299ArrayArray1[Static551.aClass355_1.anInt9851][local72];
				if (local1265.anInt8610 == 5 && local1265.anInt8611 != -1 && !Static99.aClass310_23.method7793(0, local1265.anInt8611)) {
					local180 = false;
				}
			}
			if (!local180) {
				return 0;
			}
		}
		if (Static18.aClass168_1 == Static243.aClass168_20) {
			Static499.method7528(true);
		}
		if (Static243.aClass168_21 == Static18.aClass168_1) {
			Static161.aClass329_3.method8069();
			try {
				Static101.aThread2.join();
			} catch (@Pc(1323) InterruptedException local1323) {
				return 0;
			}
			Static161.aClass329_3 = null;
			Static101.aThread2 = null;
			Static597.aClass116_1 = null;
			Static588.anInterface11Array1 = null;
			Static132.aClass310_33 = null;
			Static662.aClass310_133 = null;
			Static491.method7394();
			Static84.aBoolean103 = Static181.aClass14_Sub26_9.aClass43_Sub18_1.method5170() == 1;
			Static181.aClass14_Sub26_9.method5270(1, Static181.aClass14_Sub26_9.aClass43_Sub18_1);
			if (Static84.aBoolean103) {
				Static181.aClass14_Sub26_9.method5270(0, Static181.aClass14_Sub26_9.aClass43_Sub1_2);
			} else if (Static181.aClass14_Sub26_9.aClass43_Sub1_2.aBoolean64 && Static526.aClass14_Sub12_1.anInt1226 < 512 && Static526.aClass14_Sub12_1.anInt1226 != 0) {
				Static181.aClass14_Sub26_9.method5270(0, Static181.aClass14_Sub26_9.aClass43_Sub1_2);
			}
			Static574.method8188();
			if (Static84.aBoolean103) {
				Static459.method8986(false, 0);
			} else {
				Static459.method8986(false, Static181.aClass14_Sub26_9.aClass43_Sub1_2.method801());
			}
			Static89.method8701(false, -1, Static181.aClass14_Sub26_9.aClass43_Sub15_1.method4526(), -1);
			Static86.method1436(Static103.aClass144_3);
			Static544.method8201(Static103.aClass144_3);
			Static202.method3018(Static103.aClass144_3, Static99.aClass310_23);
			Static326.method5101(Static610.aClass45Array31);
		}
		return Static316.method5002();
	}

	@OriginalMember(owner = "client!oka", name = "a", descriptor = "(B)V")
	public static void method6595() {
		for (@Pc(3) int local3 = 0; local3 < Static662.anInt10795; local3++) {
			@Pc(19) int local19 = Static253.anIntArray241[local3];
			@Pc(26) Class14_Sub44 local26 = (Class14_Sub44) Static100.aClass125_9.method2630((long) local19);
			if (local26 != null) {
				@Pc(31) Class4_Sub3_Sub3_Sub3_Sub1 local31 = local26.aClass4_Sub3_Sub3_Sub3_Sub1_2;
				Static597.method8453(local31.aClass362_1.anInt10069, local31);
			}
		}
		anInt7456++;
	}
}
