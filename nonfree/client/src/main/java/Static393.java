import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static393 {

	@OriginalMember(owner = "client!mg", name = "p", descriptor = "Lclient!sk;")
	public static Class339 aClass339_1;

	@OriginalMember(owner = "client!mg", name = "o", descriptor = "J")
	public static long aLong185 = -1L;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIII)V")
	public static void method5839(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) Class2_Sub6_Sub12 local14 = Static636.method8647(19, (long) arg3 | (long) arg1 << 32);
		local14.method6239();
		local14.anInt6938 = arg0;
		local14.anInt6936 = arg2;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)I")
	public static int method5840() {
		@Pc(12) int local12;
		if (Static650.aClass2_Sub30_29.aClass11_Sub28_1.method9314() == 0) {
			for (local12 = 0; local12 < Static510.anInt8118; local12++) {
				if (Static176.anInterface21Array2[local12].method9558() == 's' || Static176.anInterface21Array2[local12].method9558() == 'S') {
					Static650.aClass2_Sub30_29.method2988(1, Static650.aClass2_Sub30_29.aClass11_Sub28_1);
					Static96.aBoolean201 = true;
					break;
				}
			}
		}
		@Pc(70) int local70;
		if (Static722.aClass406_10 == Static101.aClass406_8) {
			@Pc(61) Runtime local61 = Runtime.getRuntime();
			local70 = (int) ((local61.totalMemory() - local61.freeMemory()) / 1024L);
			@Pc(73) long local73 = Static567.method7863();
			if (Static174.aLong106 == 0L) {
				Static174.aLong106 = local73;
			}
			if (local70 > 16384 && local73 - Static174.aLong106 < 5000L) {
				if (local73 - Static34.aLong270 > 1000L) {
					System.gc();
					Static34.aLong270 = local73;
				}
				return 0;
			}
		}
		if (Static101.aClass406_8 == Static722.aClass406_11) {
			if (Static402.aClass318_1 == null) {
				Static402.aClass318_1 = new Class318(Static190.aClass309_1, Static431.aClass92_2, Static540.aBigInteger27, Static313.aBigInteger12);
			}
			if (!Static402.aClass318_1.method7565()) {
				return 0;
			}
			Static166.method2507(0, true, (String) null);
			Static589.aBoolean931 = !Static170.method2535();
			Static497.aClass254_127 = Static45.method595(Static589.aBoolean931 ? 34 : 32, false, 1);
			Static155.aClass254_59 = Static45.method595(33, false, 1);
			Static335.aClass254_99 = Static45.method595(13, false, 1);
		}
		@Pc(179) boolean local179;
		if (Static101.aClass406_8 == Static722.aClass406_12) {
			local179 = Static155.aClass254_59.method6089();
			local70 = Static485.aClass147_Sub1Array1[33].method3248();
			local70 += Static485.aClass147_Sub1Array1[Static589.aBoolean931 ? 34 : 32].method3248();
			local70 += Static485.aClass147_Sub1Array1[13].method3248();
			local70 += local179 ? 100 : Static155.aClass254_59.method6084((byte) 108);
			if (local70 != 400) {
				return local70 / 4;
			}
			Static585.anInt9211 = Static497.aClass254_127.method6075();
			Static324.anInt5011 = Static155.aClass254_59.method6075();
			Static662.method9202(Static497.aClass254_127);
			@Pc(243) int local243 = Static650.aClass2_Sub30_29.aClass11_Sub2_1.method919();
			Static509.aClass241_1 = new Class241(Static249.aClass150_6, Static414.anInt9485, Static155.aClass254_59);
			@Pc(255) int[] local255 = Static509.aClass241_1.method5848(local243);
			if (local255.length == 0) {
				local255 = Static509.aClass241_1.method5848(0);
			}
			@Pc(272) Class354 local272 = new Class354(Static497.aClass254_127, Static335.aClass254_99);
			if (local255.length > 0) {
				Static380.anInterface8Array1 = new Interface8[local255.length];
				for (@Pc(284) int local284 = 0; local284 < Static380.anInterface8Array1.length; local284++) {
					Static380.anInterface8Array1[local284] = new Class306(Static509.aClass241_1.method5846(local255[local284]), local272);
				}
			}
		}
		if (Static722.aClass406_13 == Static101.aClass406_8) {
			Static231.method3314(Static335.aClass254_99, Static469.method6731(), Static497.aClass254_127);
		}
		if (Static722.aClass406_14 == Static101.aClass406_8) {
			local12 = Static316.method4404();
			local70 = Static389.method5820();
			if (local12 < local70) {
				return local12 * 100 / local70;
			}
		}
		if (Static722.aClass406_15 == Static101.aClass406_8) {
			if (Static380.anInterface8Array1 != null && Static380.anInterface8Array1.length > 0) {
				if (Static380.anInterface8Array1[0].method7193() < 100) {
					return 0;
				}
				if (Static380.anInterface8Array1.length > 1 && Static509.aClass241_1.method5845() && Static380.anInterface8Array1[1].method7193() < 100) {
					return 0;
				}
			}
			Static347.method4808(Static396.aClass145_6);
			Static33.method470(Static396.aClass145_6);
			Static261.method9374(-85, 1);
		}
		if (Static722.aClass406_16 == Static101.aClass406_8) {
			for (local12 = 0; local12 < 4; local12++) {
				Static626.aClass226Array1[local12] = Static687.method9260(Static426.anInt6942, Static280.anInt6752);
			}
		}
		if (Static101.aClass406_8 == Static722.aClass406_17) {
			Static117.aClass254_47 = Static45.method595(8, false, 1);
			Static703.aClass254_168 = Static45.method595(0, false, 1);
			Static102.aClass254_44 = Static45.method595(1, false, 1);
			Static1.aClass254_144 = Static45.method595(2, false, 1);
			Static282.aClass254_91 = Static45.method595(3, false, 1);
			Static157.aClass254_60 = Static45.method595(4, false, 1);
			Static311.aClass254_96 = Static45.method595(5, true, 1);
			Static177.aClass254_66 = Static45.method595(6, true, 1);
			Static700.aClass254_167 = Static45.method595(7, false, 1);
			Static380.aClass254_109 = Static45.method595(9, false, 1);
			Static455.aClass254_122 = Static45.method595(10, false, 1);
			Static727.aClass254_174 = Static45.method595(11, false, 1);
			Static680.aClass254_169 = Static45.method595(12, false, 1);
			Static514.aClass254_129 = Static45.method595(14, false, 1);
			Static614.aClass254_153 = Static45.method595(15, false, 1);
			Static529.aClass254_132 = Static45.method595(16, false, 1);
			Static566.aClass254_142 = Static45.method595(17, false, 1);
			Static307.aClass254_95 = Static45.method595(18, false, 1);
			Static625.aClass254_156 = Static45.method595(19, false, 1);
			Static565.aClass254_141 = Static45.method595(20, false, 1);
			Static191.aClass254_69 = Static45.method595(21, false, 1);
			Static18.aClass254_14 = Static45.method595(22, false, 1);
			Static394.aClass254_113 = Static45.method595(23, true, 1);
			Static263.aClass254_87 = Static45.method595(24, false, 1);
			Static327.aClass254_161 = Static45.method595(25, false, 1);
			Static55.aClass254_32 = Static45.method595(26, true, 1);
			Static35.aClass254_20 = Static45.method595(27, false, 1);
			Static50.aClass254_29 = Static45.method595(28, true, 1);
			Static228.aClass254_120 = Static45.method595(29, false, 1);
			Static560.aClass254_138 = Static45.method595(35, true, 1);
			Static96.aClass254_42 = Static45.method595(30, true, 1);
			Static554.aClass254_136 = Static45.method595(31, true, 1);
			Static161.aClass254_61 = Static45.method595(36, true, 2);
		}
		if (Static722.aClass406_18 == Static101.aClass406_8) {
			local12 = 0;
			for (local70 = 0; local70 < 37; local70++) {
				if (Static485.aClass147_Sub1Array1[local70] != null) {
					local12 += Static485.aClass147_Sub1Array1[local70].method3248() * Static482.anIntArray550[local70] / 100;
				}
			}
			if (local12 != 100) {
				if (Static53.anInt872 < 0) {
					Static53.anInt872 = local12;
				}
				return (local12 - Static53.anInt872) * 100 / (100 - Static53.anInt872);
			}
			Static45.method593(Static117.aClass254_47);
			Static231.method3314(Static335.aClass254_99, Static469.method6731(), Static117.aClass254_47);
		}
		if (Static722.aClass406_19 == Static101.aClass406_8) {
			@Pc(716) byte[] local716 = Static50.aClass254_29.method6079(4);
			if (local716 == null) {
				return 0;
			}
			Static426.method6242(local716);
			Static417.method6110();
			Static261.method9374(-61, 2);
		}
		if (Static722.aClass406_20 == Static101.aClass406_8) {
			Static96.method1493(Static135.aClass389_2, Static96.aClass254_42);
		}
		if (Static722.aClass406_21 == Static101.aClass406_8) {
			local12 = Static641.method8679();
			if (local12 < 100) {
				return local12;
			}
			Static361.method5172(Static50.aClass254_29.method6079(1));
			Static519.aClass132_1 = new Class132(Static50.aClass254_29);
			Static87.aShortArrayArrayArray1 = Static519.aClass132_1.aShortArrayArrayArray2;
			Static75.aShortArrayArray1 = Static519.aClass132_1.aShortArrayArray2;
			Static227.aClass210_1 = new Class210(Static50.aClass254_29);
		}
		if (Static101.aClass406_8 == Static722.aClass406_22) {
			if (Static519.aClass132_1.anInt3156 != -1 && !Static700.aClass254_167.method6071(Static519.aClass132_1.anInt3156, 0)) {
				return 99;
			}
			Static179.anInterface3_1 = new Class135(Static55.aClass254_32, Static380.aClass254_109, Static117.aClass254_47);
			Static97.aClass328_2 = new Class328(Static249.aClass150_6, Static414.anInt9485, Static1.aClass254_144);
			Static378.aClass314_2 = new Class314(Static249.aClass150_6, Static414.anInt9485, Static1.aClass254_144, Static227.aClass210_1);
			Static506.aClass327_2 = new Class327(Static249.aClass150_6, Static414.anInt9485, Static1.aClass254_144, Static117.aClass254_47);
			Static10.aClass57_1 = new Class57(Static249.aClass150_6, Static414.anInt9485, Static566.aClass254_142);
			Static433.aClass231_36 = new Class231(Static249.aClass150_6, Static414.anInt9485, Static1.aClass254_144);
			Static101.aClass100_12 = new Class100(Static249.aClass150_6, Static414.anInt9485, Static1.aClass254_144);
			Static159.aClass346_1 = new Class346(Static249.aClass150_6, Static414.anInt9485, Static1.aClass254_144, Static117.aClass254_47);
			Static91.aClass7_1 = new Class7(Static249.aClass150_6, Static414.anInt9485, Static1.aClass254_144, Static700.aClass254_167);
			Static130.aClass141_1 = new Class141(Static249.aClass150_6, Static414.anInt9485, Static1.aClass254_144);
			Static298.aClass266_1 = new Class266(Static249.aClass150_6, Static414.anInt9485, Static1.aClass254_144);
			Static148.aClass153_3 = new Class153(Static249.aClass150_6, Static414.anInt9485, true, Static529.aClass254_132, Static700.aClass254_167);
			Static117.aClass196_2 = new Class196(Static249.aClass150_6, Static414.anInt9485, Static1.aClass254_144, Static117.aClass254_47);
			Static591.aClass351_6 = new Class351(Static249.aClass150_6, Static414.anInt9485, Static1.aClass254_144, Static117.aClass254_47);
			Static192.aClass41_1 = new Class41(Static249.aClass150_6, Static414.anInt9485, true, Static307.aClass254_95, Static700.aClass254_167);
			Static543.aClass37_2 = new Class37(Static249.aClass150_6, Static414.anInt9485, true, Static97.aClass328_2, Static625.aClass254_156, Static700.aClass254_167);
			Static412.aClass344_1 = new Class344(Static249.aClass150_6, Static414.anInt9485, Static1.aClass254_144);
			Static89.aClass274_1 = new Class274(Static249.aClass150_6, Static414.anInt9485, Static565.aClass254_141, Static703.aClass254_168, Static102.aClass254_44);
			Static120.aClass232_1 = new Class232(Static249.aClass150_6, Static414.anInt9485, Static1.aClass254_144);
			Static271.aClass25_1 = new Class25(Static249.aClass150_6, Static414.anInt9485, Static1.aClass254_144);
			Static119.aClass209_1 = new Class209(Static249.aClass150_6, Static414.anInt9485, Static191.aClass254_69, Static700.aClass254_167);
			Static481.aClass280_1 = new Class280(Static249.aClass150_6, Static414.anInt9485, Static1.aClass254_144);
			Static163.aClass336_1 = new Class336(Static249.aClass150_6, Static414.anInt9485, Static1.aClass254_144);
			Static452.aClass362_1 = new Class362(Static249.aClass150_6, Static414.anInt9485, Static1.aClass254_144);
			Static153.aClass79_3 = new Class79(Static249.aClass150_6, Static414.anInt9485, Static18.aClass254_14);
			Static13.aClass119_1 = new Class119(Static249.aClass150_6, Static414.anInt9485, Static1.aClass254_144);
			Static80.aClass90_1 = new Class90(Static249.aClass150_6, Static414.anInt9485, Static1.aClass254_144);
			Static202.aClass31_1 = new Class31(Static249.aClass150_6, Static414.anInt9485, Static1.aClass254_144);
			Static351.method4860(Static117.aClass254_47, Static335.aClass254_99, Static700.aClass254_167, Static282.aClass254_91);
			Static182.method9567(Static228.aClass254_120);
			Static468.aClass69_1 = new Class69(Static414.anInt9485, Static263.aClass254_87, Static327.aClass254_161);
			Static645.aClass180_2 = new Class180(Static414.anInt9485, Static263.aClass254_87, Static327.aClass254_161, new Class403());
			Static425.method6175();
			Static148.aClass153_3.method3344(Static650.aClass2_Sub30_29.aClass11_Sub12_1.method2753() == 0);
			Static396.aClass107_1 = new Class107();
			Static593.method8176();
			Static535.method7515(Static89.aClass274_1);
			Static180.method5446(Static35.aClass254_20);
			Static525.method7393(Static179.anInterface3_1, Static700.aClass254_167);
			@Pc(1074) Class102 local1074 = new Class102(Static455.aClass254_122.method6104("huffman", ""));
			Static289.method4072(local1074);
			try {
				jagmisc.init();
			} catch (@Pc(1081) Throwable local1081) {
			}
			Static66.aClass106_1 = Static201.method2851();
			Static604.aClass2_Sub45_1 = new Class2_Sub45(true, Static135.aClass389_2);
		}
		if (Static101.aClass406_8 == Static722.aClass406_24) {
			local12 = Static189.method2693(Static117.aClass254_47) + Static264.method3746(true);
			local70 = Static711.method9469() + Static389.method5820();
			if (local70 > local12) {
				return local12 * 100 / local70;
			}
		}
		if (Static101.aClass406_8 == Static722.aClass406_25) {
			Static90.method2920(Static394.aClass254_113, Static433.aClass231_36, Static101.aClass100_12, Static148.aClass153_3, Static117.aClass196_2, Static591.aClass351_6, Static396.aClass107_1);
		}
		if (Static101.aClass406_8 == Static722.aClass406_26) {
			Static317.aBooleanArray27 = new boolean[Static452.aClass362_1.anInt9771];
			Static41.anIntArray266 = new int[Static452.aClass362_1.anInt9771];
			Static581.aStringArray41 = new String[Static163.aClass336_1.anInt9168];
			for (local12 = 0; local12 < Static452.aClass362_1.anInt9771; local12++) {
				if (Static452.aClass362_1.method8628(local12).anInt1909 == 0) {
					Static317.aBooleanArray27[local12] = true;
					Static413.anInt6774++;
				}
				Static41.anIntArray266[local12] = -1;
			}
			Static142.method4102();
			Static311.aClass254_96.method6085(false);
			Static177.aClass254_66.method6085(true);
			Static117.aClass254_47.method6085(true);
			Static335.aClass254_99.method6085(true);
			Static455.aClass254_122.method6085(true);
			Static1.aClass254_144.anInt6802 = 2;
			Static644.aBoolean845 = true;
			Static566.aClass254_142.anInt6802 = 2;
			Static529.aClass254_132.anInt6802 = 2;
			Static307.aClass254_95.anInt6802 = 2;
			Static625.aClass254_156.anInt6802 = 2;
			Static565.aClass254_141.anInt6802 = 2;
			Static191.aClass254_69.anInt6802 = 2;
		}
		if (Static722.aClass406_27 == Static101.aClass406_8) {
			if (!Static268.method3778(Static519.aClass132_1.anInt3151)) {
				return 0;
			}
			local179 = true;
			for (local70 = 0; local70 < Static581.aClass273ArrayArray2[Static519.aClass132_1.anInt3151].length; local70++) {
				@Pc(1258) Class273 local1258 = Static581.aClass273ArrayArray2[Static519.aClass132_1.anInt3151][local70];
				if (local1258.anInt7371 == 5 && local1258.anInt7394 != -1 && !Static117.aClass254_47.method6071(local1258.anInt7394, 0)) {
					local179 = false;
				}
			}
			if (!local179) {
				return 0;
			}
		}
		if (Static722.aClass406_28 == Static101.aClass406_8) {
			Static547.method7638(true);
		}
		if (Static101.aClass406_8 == Static722.aClass406_29) {
			Static591.aClass337_3.method8104();
			try {
				Static181.aThread4.join();
			} catch (@Pc(1318) InterruptedException local1318) {
				return 0;
			}
			Static591.aClass337_3 = null;
			Static497.aClass254_127 = null;
			Static181.aThread4 = null;
			Static155.aClass254_59 = null;
			Static509.aClass241_1 = null;
			Static380.anInterface8Array1 = null;
			Static600.method8234();
			Static346.aBoolean453 = Static650.aClass2_Sub30_29.aClass11_Sub28_1.method9314() == 1;
			Static650.aClass2_Sub30_29.method2988(1, Static650.aClass2_Sub30_29.aClass11_Sub28_1);
			if (Static346.aBoolean453) {
				Static650.aClass2_Sub30_29.method2988(0, Static650.aClass2_Sub30_29.aClass11_Sub20_1);
			} else if (Static650.aClass2_Sub30_29.aClass11_Sub20_1.aBoolean458 && Static604.aClass2_Sub45_1.anInt7311 < 512 && Static604.aClass2_Sub45_1.anInt7311 != 0) {
				Static650.aClass2_Sub30_29.method2988(0, Static650.aClass2_Sub30_29.aClass11_Sub20_1);
			}
			Static610.method9380();
			if (Static346.aBoolean453) {
				Static213.method2982(false, 0);
			} else {
				Static213.method2982(false, Static650.aClass2_Sub30_29.aClass11_Sub20_1.method4863());
			}
			Static309.method4316(false, -1, -1, Static650.aClass2_Sub30_29.aClass11_Sub30_1.method9623());
			Static347.method4808(Static396.aClass145_6);
			Static33.method470(Static396.aClass145_6);
			Static712.method9471(Static117.aClass254_47, -109, Static396.aClass145_6);
			Static255.method3621(-60, Static245.aClass43Array9);
		}
		return Static526.method7418();
	}
}
