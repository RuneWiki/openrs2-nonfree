import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static571 {

	@OriginalMember(owner = "client!th", name = "b", descriptor = "J")
	public static long aLong281;

	@OriginalMember(owner = "client!th", name = "e", descriptor = "Lclient!dea;")
	public static final Class85 aClass85_7 = new Class85();

	@OriginalMember(owner = "client!th", name = "d", descriptor = "Lclient!eba;")
	public static final Class98 aClass98_7 = new Class98();

	@OriginalMember(owner = "client!th", name = "f", descriptor = "I")
	public static int anInt9569 = -1;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(B)I")
	public static int method8207() {
		@Pc(22) int local22;
		if (Static637.aClass5_Sub20_31.aClass24_Sub8_1.method2669() == 0) {
			for (local22 = 0; local22 < Static643.anInt10457; local22++) {
				if (Static538.anInterface12Array2[local22].method6714() == 's' || Static538.anInterface12Array2[local22].method6714() == 'S') {
					Static637.aClass5_Sub20_31.method3194(1, Static637.aClass5_Sub20_31.aClass24_Sub8_1);
					Static415.aBoolean741 = true;
					break;
				}
			}
		}
		@Pc(80) int local80;
		if (Static198.aClass146_1 == Static279.aClass146_22) {
			@Pc(71) Runtime local71 = Runtime.getRuntime();
			local80 = (int) ((local71.totalMemory() - local71.freeMemory()) / 1024L);
			@Pc(83) long local83 = Static515.method7499(119);
			if (Static26.aLong10 == 0L) {
				Static26.aLong10 = local83;
			}
			if (local80 > 16384 && local83 - Static26.aLong10 < 5000L) {
				if (local83 - Static225.aLong110 > 1000L) {
					System.gc();
					Static225.aLong110 = local83;
				}
				return 0;
			}
		}
		if (Static198.aClass146_2 == Static279.aClass146_22) {
			if (Static33.aClass331_1 == null) {
				Static33.aClass331_1 = new Class331(Static410.aClass65_1, Static514.aClass381_2, Static446.aBigInteger5, Static57.aBigInteger1);
			}
			if (!Static33.aClass331_1.method8149()) {
				return 0;
			}
			Static632.method8846((String) null, true, 0);
			Static457.aBoolean592 = !Static643.method8966();
			Static480.aClass208_111 = Static239.method3453(false, Static457.aBoolean592 ? 34 : 32, 1);
			Static160.aClass208_38 = Static239.method3453(false, 33, 1);
			Static85.aClass208_16 = Static239.method3453(false, 13, 1);
		}
		@Pc(187) boolean local187;
		if (Static279.aClass146_22 == Static198.aClass146_3) {
			local187 = Static160.aClass208_38.method4983();
			local80 = Static11.aClass260_Sub1Array1[33].method6262();
			local80 += Static11.aClass260_Sub1Array1[Static457.aBoolean592 ? 34 : 32].method6262();
			local80 += Static11.aClass260_Sub1Array1[13].method6262();
			local80 += local187 ? 100 : Static160.aClass208_38.method4993();
			if (local80 != 400) {
				return local80 / 4;
			}
			Static53.anInt839 = Static480.aClass208_111.method4995();
			Static339.anInt6034 = Static160.aClass208_38.method4995();
			Static142.method2008(Static480.aClass208_111);
			@Pc(249) int local249 = Static637.aClass5_Sub20_31.aClass24_Sub29_1.method8889();
			Static217.aClass229_1 = new Class229(Static256.aClass333_3, Static323.anInt5795, Static160.aClass208_38);
			@Pc(261) int[] local261 = Static217.aClass229_1.method5339(1, local249);
			if (local261.length == 0) {
				local261 = Static217.aClass229_1.method5339(1, 0);
			}
			@Pc(275) Class264 local275 = new Class264(Static480.aClass208_111, Static85.aClass208_16);
			if (local261.length > 0) {
				Static109.anInterface14Array1 = new Interface14[local261.length];
				for (@Pc(284) int local284 = 0; local284 < Static109.anInterface14Array1.length; local284++) {
					Static109.anInterface14Array1[local284] = new Class322(Static217.aClass229_1.method5340(local261[local284]), local275);
				}
			}
		}
		if (Static198.aClass146_4 == Static279.aClass146_22) {
			Static250.method3680(Static232.method3377(), Static480.aClass208_111, Static85.aClass208_16);
		}
		if (Static279.aClass146_22 == Static198.aClass146_5) {
			local22 = Static374.method5471();
			local80 = Static497.method9020();
			if (local80 > local22) {
				return local22 * 100 / local80;
			}
		}
		if (Static279.aClass146_22 == Static198.aClass146_6) {
			if (Static109.anInterface14Array1 != null && Static109.anInterface14Array1.length > 0) {
				if (Static109.anInterface14Array1[0].method7949() < 100) {
					return 0;
				}
				if (Static109.anInterface14Array1.length > 1 && Static217.aClass229_1.method5341() && Static109.anInterface14Array1[1].method7949() < 100) {
					return 0;
				}
			}
			Static471.method6859(Static457.aClass57_11);
			Static320.method4881(Static457.aClass57_11);
			Static21.method316(1);
		}
		if (Static198.aClass146_7 == Static279.aClass146_22) {
			for (local22 = 0; local22 < 4; local22++) {
				Static670.aClass88Array1[local22] = Static416.method8826(Static544.anInt9261, Static282.anInt4887);
			}
		}
		if (Static279.aClass146_22 == Static198.aClass146_8) {
			Static345.aClass208_78 = Static239.method3453(false, 8, 1);
			Static650.aClass208_32 = Static239.method3453(false, 0, 1);
			Static579.aClass208_130 = Static239.method3453(false, 1, 1);
			Static449.aClass208_104 = Static239.method3453(false, 2, 1);
			Static491.aClass208_114 = Static239.method3453(false, 3, 1);
			Static274.aClass208_64 = Static239.method3453(false, 4, 1);
			Static609.aClass208_137 = Static239.method3453(true, 5, 1);
			Static229.aClass208_57 = Static239.method3453(true, 6, 1);
			Static635.aClass208_143 = Static239.method3453(false, 7, 1);
			Static127.aClass208_20 = Static239.method3453(false, 9, 1);
			Static265.aClass208_60 = Static239.method3453(false, 10, 1);
			Static367.aClass208_141 = Static239.method3453(false, 11, 1);
			Static343.aClass208_76 = Static239.method3453(false, 12, 1);
			Static307.aClass208_70 = Static239.method3453(false, 14, 1);
			Static417.aClass208_98 = Static239.method3453(false, 15, 1);
			Static404.aClass208_93 = Static239.method3453(false, 16, 1);
			Static43.aClass208_9 = Static239.method3453(false, 17, 1);
			Static292.aClass208_65 = Static239.method3453(false, 18, 1);
			Static348.aClass208_79 = Static239.method3453(false, 19, 1);
			Static264.aClass208_59 = Static239.method3453(false, 20, 1);
			Static289.aClass208_148 = Static239.method3453(false, 21, 1);
			Static275.aClass208_63 = Static239.method3453(false, 22, 1);
			Static529.aClass208_117 = Static239.method3453(true, 23, 1);
			Static106.aClass208_19 = Static239.method3453(false, 24, 1);
			Static400.aClass208_90 = Static239.method3453(false, 25, 1);
			Static26.aClass208_2 = Static239.method3453(true, 26, 1);
			Static69.aClass208_12 = Static239.method3453(false, 27, 1);
			Static253.aClass208_58 = Static239.method3453(true, 28, 1);
			Static451.aClass208_105 = Static239.method3453(false, 29, 1);
			Static178.aClass208_48 = Static239.method3453(true, 30, 1);
			Static226.aClass208_56 = Static239.method3453(true, 31, 1);
			Static338.aClass208_74 = Static239.method3453(true, 36, 2);
		}
		if (Static198.aClass146_9 == Static279.aClass146_22) {
			local22 = 0;
			for (local80 = 0; local80 < 37; local80++) {
				if (Static11.aClass260_Sub1Array1[local80] != null) {
					local22 += Static11.aClass260_Sub1Array1[local80].method6262() * Static19.anIntArray22[local80] / 100;
				}
			}
			if (local22 != 100) {
				if (Static520.anInt8812 < 0) {
					Static520.anInt8812 = local22;
				}
				return (local22 - Static520.anInt8812) * 100 / (100 - Static520.anInt8812);
			}
			Static500.method7163(Static345.aClass208_78);
			Static250.method3680(Static232.method3377(), Static345.aClass208_78, Static85.aClass208_16);
		}
		if (Static198.aClass146_10 == Static279.aClass146_22) {
			if (Static430.anInt6325 == -1) {
				Static430.anInt6325 = Static229.aClass208_57.method4986("scape main", 69);
			}
			Static618.method8749();
			Static21.method316(2);
		}
		if (Static279.aClass146_22 == Static198.aClass146_11) {
			Static346.method5219(Static178.aClass208_48, Static294.aClass230_3);
		}
		if (Static198.aClass146_12 == Static279.aClass146_22) {
			local22 = Static480.method6994();
			if (local22 < 100) {
				return local22;
			}
			Static228.method3240(Static253.aClass208_58.method4997(1));
			Static368.method5415(Static253.aClass208_58.method4997(3));
			Static269.aClass196_1 = new Class196(Static253.aClass208_58);
		}
		if (Static198.aClass146_13 == Static279.aClass146_22) {
			if (Static456.anInt7803 != -1 && !Static635.aClass208_143.method4980(0, Static456.anInt7803)) {
				return 99;
			}
			Static509.anInterface1_10 = new Class148(Static26.aClass208_2, Static127.aClass208_20, Static345.aClass208_78);
			Static4.aClass355_1 = new Class355(Static256.aClass333_3, Static323.anInt5795, Static449.aClass208_104);
			Static356.aClass325_2 = new Class325(Static256.aClass333_3, Static323.anInt5795, Static449.aClass208_104, Static269.aClass196_1);
			Static575.aClass350_2 = new Class350(Static256.aClass333_3, Static323.anInt5795, Static449.aClass208_104, Static345.aClass208_78);
			Static102.aClass156_20 = new Class156(Static256.aClass333_3, Static323.anInt5795, Static43.aClass208_9);
			Static63.aClass290_2 = new Class290(Static256.aClass333_3, Static323.anInt5795, Static449.aClass208_104);
			Static557.aClass218_3 = new Class218(Static256.aClass333_3, Static323.anInt5795, Static449.aClass208_104);
			Static588.aClass237_2 = new Class237(Static256.aClass333_3, Static323.anInt5795, Static449.aClass208_104, Static345.aClass208_78);
			Static133.aClass324_1 = new Class324(Static256.aClass333_3, Static323.anInt5795, Static449.aClass208_104, Static635.aClass208_143);
			Static163.aClass122_1 = new Class122(Static256.aClass333_3, Static323.anInt5795, Static449.aClass208_104);
			Static565.aClass363_33 = new Class363(Static256.aClass333_3, Static323.anInt5795, Static449.aClass208_104);
			Static536.aClass392_2 = new Class392(Static256.aClass333_3, Static323.anInt5795, true, Static404.aClass208_93, Static635.aClass208_143);
			Static2.aClass33_1 = new Class33(Static256.aClass333_3, Static323.anInt5795, Static449.aClass208_104, Static345.aClass208_78);
			Static645.aClass256_4 = new Class256(Static256.aClass333_3, Static323.anInt5795, Static449.aClass208_104, Static345.aClass208_78);
			Static325.aClass231_1 = new Class231(Static256.aClass333_3, Static323.anInt5795, true, Static292.aClass208_65, Static635.aClass208_143);
			Static201.aClass127_1 = new Class127(Static256.aClass333_3, Static323.anInt5795, true, Static4.aClass355_1, Static348.aClass208_79, Static635.aClass208_143);
			Static218.aClass20_1 = new Class20(Static256.aClass333_3, Static323.anInt5795, Static449.aClass208_104);
			Static158.aClass317_1 = new Class317(Static256.aClass333_3, Static323.anInt5795, Static264.aClass208_59, Static650.aClass208_32, Static579.aClass208_130);
			Static162.aClass181_1 = new Class181(Static256.aClass333_3, Static323.anInt5795, Static449.aClass208_104);
			Static112.aClass321_1 = new Class321(Static256.aClass333_3, Static323.anInt5795, Static449.aClass208_104);
			Static421.aClass385_2 = new Class385(Static256.aClass333_3, Static323.anInt5795, Static289.aClass208_148, Static635.aClass208_143);
			Static356.aClass157_1 = new Class157(Static256.aClass333_3, Static323.anInt5795, Static449.aClass208_104);
			Static396.aClass49_1 = new Class49(Static256.aClass333_3, Static323.anInt5795, Static449.aClass208_104);
			Static545.aClass344_1 = new Class344(Static256.aClass333_3, Static323.anInt5795, Static449.aClass208_104);
			Static519.aClass199_1 = new Class199(Static256.aClass333_3, Static323.anInt5795, Static275.aClass208_63);
			Static637.aClass301_1 = new Class301(Static256.aClass333_3, Static323.anInt5795, Static449.aClass208_104);
			Static123.aClass234_1 = new Class234(Static256.aClass333_3, Static323.anInt5795, Static449.aClass208_104);
			Static515.method7498(Static345.aClass208_78, Static491.aClass208_114, Static635.aClass208_143, Static85.aClass208_16);
			Static366.method5413(Static451.aClass208_105);
			Static112.aClass123_1 = new Class123(Static323.anInt5795, Static106.aClass208_19, Static400.aClass208_90);
			Static502.aClass259_2 = new Class259(Static323.anInt5795, Static106.aClass208_19, Static400.aClass208_90, new Class302());
			Static538.method7910();
			Static536.aClass392_2.method9297(Static637.aClass5_Sub20_31.aClass24_Sub25_2.method7146() == 0);
			Static413.aClass118_1 = new Class118();
			Static310.method4717();
			Static347.method5235(Static69.aClass208_12);
			Static163.method2206(Static509.anInterface1_10, Static635.aClass208_143);
			@Pc(1045) Class247 local1045 = new Class247(Static265.aClass208_60.method4999("", "huffman"));
			Static285.method4224(local1045);
			try {
				jagmisc.init();
			} catch (@Pc(1052) Throwable local1052) {
			}
			Static451.aClass67_1 = Static202.method2912();
			Static528.aClass5_Sub19_1 = new Class5_Sub19(true, Static294.aClass230_3);
		}
		if (Static279.aClass146_22 == Static198.aClass146_15) {
			local22 = Static488.method7041(Static345.aClass208_78) + Static630.method8820(true);
			local80 = Static516.method7503() + Static497.method9020();
			if (local22 < local80) {
				return local22 * 100 / local80;
			}
		}
		if (Static279.aClass146_22 == Static198.aClass146_16) {
			Static629.method8376(Static529.aClass208_117, Static63.aClass290_2, Static557.aClass218_3, Static536.aClass392_2, Static2.aClass33_1, Static645.aClass256_4, Static413.aClass118_1);
		}
		if (Static198.aClass146_17 == Static279.aClass146_22) {
			Static580.aStringArray69 = new String[Static396.aClass49_1.anInt842];
			Static433.aBooleanArray17 = new boolean[Static545.aClass344_1.anInt10027];
			Static21.anIntArray24 = new int[Static545.aClass344_1.anInt10027];
			for (local22 = 0; local22 < Static545.aClass344_1.anInt10027; local22++) {
				if (Static545.aClass344_1.method8615(local22).anInt1873 == 0) {
					Static433.aBooleanArray17[local22] = true;
					Static674.anInt10792++;
				}
				Static21.anIntArray24[local22] = -1;
			}
			Static349.method5248();
			Static259.anInt4502 = Static491.aClass208_114.method4986("loginscreen", -96);
			Static164.anInt2526 = Static491.aClass208_114.method4986("lobbyscreen", -128);
			Static609.aClass208_137.method4984(false);
			Static229.aClass208_57.method4984(true);
			Static345.aClass208_78.method4984(true);
			Static85.aClass208_16.method4984(true);
			Static265.aClass208_60.method4984(true);
			Static491.aClass208_114.method4984(true);
			Static76.aBoolean98 = true;
			Static449.aClass208_104.anInt5851 = 2;
			Static43.aClass208_9.anInt5851 = 2;
			Static404.aClass208_93.anInt5851 = 2;
			Static292.aClass208_65.anInt5851 = 2;
			Static348.aClass208_79.anInt5851 = 2;
			Static264.aClass208_59.anInt5851 = 2;
			Static289.aClass208_148.anInt5851 = 2;
		}
		if (Static279.aClass146_22 == Static198.aClass146_18) {
			if (!Static596.method8616(Static259.anInt4502)) {
				return 0;
			}
			local187 = true;
			for (local80 = 0; local80 < Static489.aClass73ArrayArray2[Static259.anInt4502].length; local80++) {
				@Pc(1248) Class73 local1248 = Static489.aClass73ArrayArray2[Static259.anInt4502][local80];
				if (local1248.anInt1391 == 5 && local1248.anInt1403 != -1 && !Static345.aClass208_78.method4980(0, local1248.anInt1403)) {
					local187 = false;
				}
			}
			if (!local187) {
				return 0;
			}
		}
		if (Static198.aClass146_19 == Static279.aClass146_22) {
			Static546.method8412(true);
		}
		if (Static198.aClass146_20 == Static279.aClass146_22) {
			Static410.aClass194_1.method4386();
			try {
				Static564.aThread6.join();
			} catch (@Pc(1302) InterruptedException local1302) {
				return 0;
			}
			Static480.aClass208_111 = null;
			Static410.aClass194_1 = null;
			Static564.aThread6 = null;
			Static217.aClass229_1 = null;
			Static109.anInterface14Array1 = null;
			Static160.aClass208_38 = null;
			Static55.method806();
			Static52.aBoolean69 = Static637.aClass5_Sub20_31.aClass24_Sub8_1.method2669() == 1;
			Static637.aClass5_Sub20_31.method3194(1, Static637.aClass5_Sub20_31.aClass24_Sub8_1);
			if (Static52.aBoolean69) {
				Static637.aClass5_Sub20_31.method3194(0, Static637.aClass5_Sub20_31.aClass24_Sub10_2);
			} else if (Static637.aClass5_Sub20_31.aClass24_Sub10_2.aBoolean286 && Static528.aClass5_Sub19_1.anInt3442 < 512 && Static528.aClass5_Sub19_1.anInt3442 != 0) {
				Static637.aClass5_Sub20_31.method3194(0, Static637.aClass5_Sub20_31.aClass24_Sub10_2);
			}
			Static52.method792();
			if (Static52.aBoolean69) {
				Static565.method8890(0, false);
			} else {
				Static565.method8890(Static637.aClass5_Sub20_31.aClass24_Sub10_2.method3153(), false);
			}
			Static674.method9280(false, -1, -1, Static637.aClass5_Sub20_31.aClass24_Sub7_2.method2574());
			Static471.method6859(Static457.aClass57_11);
			Static320.method4881(Static457.aClass57_11);
			Static293.method4357(Static345.aClass208_78, Static457.aClass57_11);
			Static332.method5053(Static575.aClass134Array15);
		}
		return Static624.method8770();
	}
}
