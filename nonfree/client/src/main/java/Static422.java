import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!ov", name = "u", descriptor = "Lclient!ria;")
	public static Class303 aClass303_15;

	@OriginalMember(owner = "client!ov", name = "p", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_125 = new Class145(42, 0);

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(B)I")
	public static int method6162() {
		@Pc(12) int local12;
		if (Static305.aClass2_Sub49_15.aClass33_Sub22_1.method6417() == 0) {
			for (local12 = 0; local12 < Static206.anInt3998; local12++) {
				if (Static248.anInterface20Array3[local12].method7056() == 's' || Static248.anInterface20Array3[local12].method7056() == 'S') {
					Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub22_1, 1);
					Static588.aBoolean707 = true;
					break;
				}
			}
		}
		@Pc(60) int local60;
		if (Static58.aClass48_2 == Static247.aClass48_23) {
			@Pc(51) Runtime local51 = Runtime.getRuntime();
			local60 = (int) ((local51.totalMemory() - local51.freeMemory()) / 1024L);
			@Pc(63) long local63 = Static48.method1203();
			if (Static511.aLong219 == 0L) {
				Static511.aLong219 = local63;
			}
			if (local60 > 16384 && local63 - Static511.aLong219 < 5000L) {
				if (local63 - Static243.aLong188 > 1000L) {
					System.gc();
					Static243.aLong188 = local63;
				}
				return 0;
			}
		}
		if (Static247.aClass48_23 == Static58.aClass48_3) {
			if (Static93.aClass89_1 == null) {
				Static93.aClass89_1 = new Class89(Static194.aClass322_2, Static216.aClass116_2, Static585.aBigInteger10, Static282.aBigInteger9);
			}
			if (!Static93.aClass89_1.method2198()) {
				return 0;
			}
			Static45.method1179(0, true, (String) null);
			Static236.aBoolean320 = !Static12.method149();
			Static282.aClass238_218 = Static513.method7452(1, false, Static236.aBoolean320 ? 34 : 32);
			Static139.aClass238_66 = Static513.method7452(1, false, 33);
			Static419.aClass238_210 = Static513.method7452(1, false, 13);
		}
		@Pc(155) boolean local155;
		if (Static58.aClass48_4 == Static247.aClass48_23) {
			local155 = Static139.aClass238_66.method5586();
			local60 = Static59.aClass87_Sub1Array4[33].method5179();
			local60 += Static59.aClass87_Sub1Array4[Static236.aBoolean320 ? 34 : 32].method5179();
			local60 += Static59.aClass87_Sub1Array4[13].method5179();
			local60 += local155 ? 100 : Static139.aClass238_66.method5584();
			if (local60 != 400) {
				return local60 / 4;
			}
			Static366.anInt6320 = Static282.aClass238_218.method5599();
			Static456.anInt7430 = Static139.aClass238_66.method5599();
			Static207.method3503(Static282.aClass238_218);
			@Pc(214) int local214 = Static305.aClass2_Sub49_15.aClass33_Sub12_1.method4636();
			Static509.aClass88_1 = new Class88(Static51.aClass17_2, Static496.anInt7407, Static139.aClass238_66);
			@Pc(226) int[] local226 = Static509.aClass88_1.method2104(local214);
			if (local226.length == 0) {
				local226 = Static509.aClass88_1.method2104(0);
			}
			@Pc(243) Class102 local243 = new Class102(Static282.aClass238_218, Static419.aClass238_210);
			if (local226.length > 0) {
				Static519.anInterface16Array1 = new Interface16[local226.length];
				for (@Pc(252) int local252 = 0; local252 < Static519.anInterface16Array1.length; local252++) {
					Static519.anInterface16Array1[local252] = new Class27(Static509.aClass88_1.method2102(local226[local252]), local243);
				}
			}
		}
		if (Static247.aClass48_23 == Static58.aClass48_5) {
			Static544.method7523(Static565.method7891(), Static282.aClass238_218, Static419.aClass238_210);
		}
		if (Static247.aClass48_23 == Static58.aClass48_6) {
			local12 = Static478.method6779();
			local60 = Static245.method4162();
			if (local60 > local12) {
				return local12 * 100 / local60;
			}
		}
		if (Static58.aClass48_7 == Static247.aClass48_23) {
			if (Static519.anInterface16Array1 != null && Static519.anInterface16Array1.length > 0) {
				if (Static519.anInterface16Array1[0].method6302() < 100) {
					return 0;
				}
				if (Static519.anInterface16Array1.length > 1 && Static509.aClass88_1.method2103() && Static519.anInterface16Array1[1].method6302() < 100) {
					return 0;
				}
			}
			Static508.method7061(Static141.aClass13_27);
			Static343.method5197(Static141.aClass13_27);
			Static213.method3541(1);
		}
		if (Static247.aClass48_23 == Static58.aClass48_8) {
			for (local12 = 0; local12 < 4; local12++) {
				Static520.aClass175Array1[local12] = Static460.method6506(Static5.anInt112, Static456.anInt7428);
			}
		}
		if (Static58.aClass48_9 == Static247.aClass48_23) {
			Static497.aClass238_223 = Static513.method7452(1, false, 8);
			Static321.aClass238_147 = Static513.method7452(1, false, 0);
			Static550.aClass238_250 = Static513.method7452(1, false, 1);
			Static215.aClass238_103 = Static513.method7452(1, false, 2);
			Static493.aClass238_222 = Static513.method7452(1, false, 3);
			Static75.aClass238_236 = Static513.method7452(1, false, 4);
			Static122.aClass238_58 = Static513.method7452(1, true, 5);
			Static609.aClass238_284 = Static513.method7452(1, true, 6);
			Static72.aClass238_40 = Static513.method7452(1, false, 7);
			Class16_Sub1_Sub1_Sub2.lb = Static513.method7452(1, false, 9);
			Static143.aClass238_70 = Static513.method7452(1, false, 10);
			Static355.aClass238_164 = Static513.method7452(1, false, 11);
			Static222.aClass238_106 = Static513.method7452(1, false, 12);
			Static441.aClass238_203 = Static513.method7452(1, false, 14);
			Static29.aClass238_16 = Static513.method7452(1, false, 15);
			Static425.aClass238_197 = Static513.method7452(1, false, 16);
			Static120.aClass238_57 = Static513.method7452(1, false, 17);
			Static26.aClass238_15 = Static513.method7452(1, false, 18);
			Static444.aClass238_206 = Static513.method7452(1, false, 19);
			Static556.aClass238_253 = Static513.method7452(1, false, 20);
			Static258.aClass238_119 = Static513.method7452(1, false, 21);
			Static367.aClass238_170 = Static513.method7452(1, false, 22);
			Static178.aClass238_289 = Static513.method7452(1, true, 23);
			Static332.aClass238_154 = Static513.method7452(1, false, 24);
			Static388.aClass238_178 = Static513.method7452(1, false, 25);
			Static213.aClass238_102 = Static513.method7452(1, true, 26);
			Static305.aClass238_141 = Static513.method7452(1, false, 27);
			Static546.aClass238_245 = Static513.method7452(1, true, 28);
			Static562.aClass238_256 = Static513.method7452(1, false, 29);
			Static306.aClass238_142 = Static513.method7452(1, true, 30);
			Static98.aClass238_299 = Static513.method7452(1, true, 31);
			Static188.aClass238_91 = Static513.method7452(2, true, 36);
		}
		if (Static58.aClass48_10 == Static247.aClass48_23) {
			local12 = 0;
			for (local60 = 0; local60 < 37; local60++) {
				if (Static59.aClass87_Sub1Array4[local60] != null) {
					local12 += Static59.aClass87_Sub1Array4[local60].method5179() * Static383.anIntArray665[local60] / 100;
				}
			}
			if (local12 != 100) {
				if (Static530.anInt8534 < 0) {
					Static530.anInt8534 = local12;
				}
				return (local12 - Static530.anInt8534) * 100 / (100 - Static530.anInt8534);
			}
			Static600.method8442(Static497.aClass238_223);
			Static544.method7523(Static565.method7891(), Static497.aClass238_223, Static419.aClass238_210);
		}
		if (Static58.aClass48_11 == Static247.aClass48_23) {
			if (Static115.anInt2472 == -1) {
				Static115.anInt2472 = Static609.aClass238_284.method5575("scape main");
			}
			Static434.method6277();
			Static213.method3541(2);
		}
		if (Static247.aClass48_23 == Static58.aClass48_12) {
			Static244.method4144(Static265.aClass286_3, Static306.aClass238_142);
		}
		if (Static247.aClass48_23 == Static58.aClass48_13) {
			local12 = Static592.method8363();
			if (local12 < 100) {
				return local12;
			}
			Static177.method3067(Static546.aClass238_245.method5580(1));
			Static104.method1962(Static546.aClass238_245.method5580(3));
		}
		if (Static58.aClass48_14 == Static247.aClass48_23) {
			if (Static132.anInt2869 != -1 && !Static72.aClass238_40.method5571(0, Static132.anInt2869)) {
				return 99;
			}
			Static173.anInterface2_7 = new Class254(Static213.aClass238_102, Class16_Sub1_Sub1_Sub2.lb, Static497.aClass238_223);
			Static106.aClass293_1 = new Class293(Static51.aClass17_2, Static496.anInt7407, Static215.aClass238_103);
			Static6.aClass146_1 = new Class146(Static51.aClass17_2, Static496.anInt7407, Static215.aClass238_103);
			Static649.aClass81_5 = new Class81(Static51.aClass17_2, Static496.anInt7407, Static215.aClass238_103, Static497.aClass238_223);
			Static132.aClass184_1 = new Class184(Static51.aClass17_2, Static496.anInt7407, Static120.aClass238_57);
			Static49.aClass216_1 = new Class216(Static51.aClass17_2, Static496.anInt7407, Static215.aClass238_103);
			Static400.aClass270_5 = new Class270(Static51.aClass17_2, Static496.anInt7407, Static215.aClass238_103);
			Static333.aClass356_2 = new Class356(Static51.aClass17_2, Static496.anInt7407, Static215.aClass238_103, Static497.aClass238_223);
			Static629.aClass177_2 = new Class177(Static51.aClass17_2, Static496.anInt7407, Static215.aClass238_103, Static72.aClass238_40);
			Static177.aClass331_1 = new Class331(Static51.aClass17_2, Static496.anInt7407, Static215.aClass238_103);
			Static341.aClass147_1 = new Class147(Static51.aClass17_2, Static496.anInt7407, Static215.aClass238_103);
			Static79.aClass304_2 = new Class304(Static51.aClass17_2, Static496.anInt7407, true, Static425.aClass238_197, Static72.aClass238_40);
			Static240.aClass336_5 = new Class336(Static51.aClass17_2, Static496.anInt7407, Static215.aClass238_103, Static497.aClass238_223);
			Static108.aClass79_1 = new Class79(Static51.aClass17_2, Static496.anInt7407, Static215.aClass238_103, Static497.aClass238_223);
			Static137.aClass366_1 = new Class366(Static51.aClass17_2, Static496.anInt7407, true, Static26.aClass238_15, Static72.aClass238_40);
			Static470.aClass250_1 = new Class250(Static51.aClass17_2, Static496.anInt7407, true, Static106.aClass293_1, Static444.aClass238_206, Static72.aClass238_40);
			Static542.aClass210_1 = new Class210(Static51.aClass17_2, Static496.anInt7407, Static215.aClass238_103);
			Static479.aClass308_2 = new Class308(Static51.aClass17_2, Static496.anInt7407, Static556.aClass238_253, Static321.aClass238_147, Static550.aClass238_250);
			Static302.aClass181_1 = new Class181(Static51.aClass17_2, Static496.anInt7407, Static215.aClass238_103);
			Static405.aClass231_1 = new Class231(Static51.aClass17_2, Static496.anInt7407, Static215.aClass238_103);
			Static546.aClass263_1 = new Class263(Static51.aClass17_2, Static496.anInt7407, Static258.aClass238_119, Static72.aClass238_40);
			Static372.aClass60_1 = new Class60(Static51.aClass17_2, Static496.anInt7407, Static215.aClass238_103);
			Static629.aClass171_1 = new Class171(Static51.aClass17_2, Static496.anInt7407, Static215.aClass238_103);
			Static317.aClass256_1 = new Class256(Static51.aClass17_2, Static496.anInt7407, Static215.aClass238_103);
			Static502.aClass199_2 = new Class199(Static51.aClass17_2, Static496.anInt7407, Static367.aClass238_170);
			Static47.aClass364_1 = new Class364(Static51.aClass17_2, Static496.anInt7407, Static215.aClass238_103);
			Static440.method6323(Static419.aClass238_210, Static493.aClass238_222, Static497.aClass238_223, Static72.aClass238_40);
			Static116.method2088(Static562.aClass238_256);
			Static190.aClass106_1 = new Class106(Static496.anInt7407, Static332.aClass238_154, Static388.aClass238_178);
			Static327.aClass344_1 = new Class344(Static496.anInt7407, Static332.aClass238_154, Static388.aClass238_178, new Class42());
			Static67.method1557();
			Static79.aClass304_2.method6960(Static305.aClass2_Sub49_15.aClass33_Sub27_1.method8670() == 0);
			Static382.aClass282_1 = new Class282();
			Static350.method5257();
			Static47.method1195(Static305.aClass238_141);
			Static80.method1746(Static173.anInterface2_7, Static72.aClass238_40);
			@Pc(954) Class346 local954 = new Class346(Static143.aClass238_70.method5572("huffman", ""));
			Static453.method6431(local954);
			try {
				jagmisc.init();
			} catch (@Pc(961) Throwable local961) {
			}
			Static340.aClass64_1 = Static93.method1898();
			Static153.aClass2_Sub42_1 = new Class2_Sub42(true, Static265.aClass286_3);
		}
		if (Static58.aClass48_16 == Static247.aClass48_23) {
			local12 = Static620.method8618(Static497.aClass238_223) + Static242.method4113(true);
			local60 = Static357.method5329() + Static245.method4162();
			if (local60 > local12) {
				return local12 * 100 / local60;
			}
		}
		if (Static247.aClass48_23 == Static58.aClass48_17) {
			Static371.method7981(Static178.aClass238_289, Static49.aClass216_1, Static400.aClass270_5, Static79.aClass304_2, Static240.aClass336_5, Static108.aClass79_1, Static382.aClass282_1);
		}
		if (Static247.aClass48_23 == Static58.aClass48_18) {
			Static192.aStringArray23 = new String[Static629.aClass171_1.anInt4843];
			Static450.anIntArray501 = new int[Static317.aClass256_1.anInt6922];
			Static226.aBooleanArray6 = new boolean[Static317.aClass256_1.anInt6922];
			for (local12 = 0; local12 < Static317.aClass256_1.anInt6922; local12++) {
				if (Static317.aClass256_1.method6036(local12).anInt4784 == 0) {
					Static226.aBooleanArray6[local12] = true;
					Static621.anInt10146++;
				}
				Static450.anIntArray501[local12] = -1;
			}
			Static29.method631();
			Static220.anInt4141 = Static493.aClass238_222.method5575("loginscreen");
			Static649.anInt10494 = Static493.aClass238_222.method5575("lobbyscreen");
			Static122.aClass238_58.method5596(false);
			Static609.aClass238_284.method5596(true);
			Static497.aClass238_223.method5596(true);
			Static419.aClass238_210.method5596(true);
			Static143.aClass238_70.method5596(true);
			Static493.aClass238_222.method5596(true);
			Static215.aClass238_103.anInt6471 = 2;
			Static397.aBoolean483 = true;
			Static120.aClass238_57.anInt6471 = 2;
			Static425.aClass238_197.anInt6471 = 2;
			Static26.aClass238_15.anInt6471 = 2;
			Static444.aClass238_206.anInt6471 = 2;
			Static556.aClass238_253.anInt6471 = 2;
			Static258.aClass238_119.anInt6471 = 2;
		}
		if (Static58.aClass48_19 == Static247.aClass48_23) {
			if (!Static31.method728(Static220.anInt4141)) {
				return 0;
			}
			local155 = true;
			for (local60 = 0; local60 < Static261.aClass303ArrayArray1[Static220.anInt4141].length; local60++) {
				@Pc(1153) Class303 local1153 = Static261.aClass303ArrayArray1[Static220.anInt4141][local60];
				if (local1153.anInt7935 == 5 && local1153.anInt7949 != -1 && !Static497.aClass238_223.method5571(0, local1153.anInt7949)) {
					local155 = false;
				}
			}
			if (!local155) {
				return 0;
			}
		}
		if (Static247.aClass48_23 == Static58.aClass48_20) {
			Static219.method3589(true);
		}
		if (Static58.aClass48_21 == Static247.aClass48_23) {
			Static113.aClass23_1.method625();
			try {
				Static272.aThread2.join();
			} catch (@Pc(1199) InterruptedException local1199) {
				return 0;
			}
			Static282.aClass238_218 = null;
			Static519.anInterface16Array1 = null;
			Static509.aClass88_1 = null;
			Static113.aClass23_1 = null;
			Static272.aThread2 = null;
			Static139.aClass238_66 = null;
			Static546.method7559();
			Static521.aBoolean609 = Static305.aClass2_Sub49_15.aClass33_Sub22_1.method6417() == 1;
			Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub22_1, 1);
			if (Static521.aBoolean609) {
				Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub28_2, 0);
			} else if (Static305.aClass2_Sub49_15.aClass33_Sub28_2.aBoolean735 && Static153.aClass2_Sub42_1.anInt9302 < 512 && Static153.aClass2_Sub42_1.anInt9302 != 0) {
				Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub28_2, 0);
			}
			Static531.method7366();
			if (Static521.aBoolean609) {
				Static99.method1936(false, 0);
			} else {
				Static99.method1936(false, Static305.aClass2_Sub49_15.aClass33_Sub28_2.method8687());
			}
			Static63.method1431(-1, false, Static305.aClass2_Sub49_15.aClass33_Sub25_2.method7520(), -1);
			Static508.method7061(Static141.aClass13_27);
			Static343.method5197(Static141.aClass13_27);
			Static151.method2656(Static497.aClass238_223, Static141.aClass13_27);
			Static385.method5686(Static435.aClass31Array12);
		}
		return Static294.method4654();
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(II[BI)Ljava/lang/String;")
	public static String method6164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(11) char[] local11 = new char[arg1];
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < arg1; local15++) {
			@Pc(24) int local24 = arg2[arg0 + local15] & 0xFF;
			if (local24 != 0) {
				if (local24 >= 128 && local24 < 160) {
					@Pc(40) char local40 = Static45.aCharArray1[local24 - 128];
					if (local40 == '\u0000') {
						local40 = '?';
					}
					local24 = local40;
				}
				local11[local13++] = (char) local24;
			}
		}
		return new String(local11, 0, local13);
	}
}
