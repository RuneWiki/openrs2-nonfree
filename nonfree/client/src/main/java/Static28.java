import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!au", name = "r", descriptor = "Lclient!ha;")
	public static Class13 aClass13_87;

	@OriginalMember(owner = "client!au", name = "v", descriptor = "[[I")
	public static int[][] anIntArrayArray115;

	@OriginalMember(owner = "client!au", name = "D", descriptor = "I")
	public static int anInt10469 = 0;

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(Lclient!r;III[Z)Z")
	public static boolean method8894(@OriginalArg(0) Class2_Sub7_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static511.aClass91Array3 != Static332.aClass91Array2) {
			@Pc(12) int local12 = Static124.aClass91Array1[arg1].method7446(arg2, arg3);
			for (@Pc(14) int local14 = 0; local14 <= arg1; local14++) {
				@Pc(19) Class91 local19 = Static124.aClass91Array1[local14];
				if (local19 != null) {
					@Pc(29) int local29 = local12 - local19.method7446(arg2, arg3);
					if (arg4 != null) {
						arg4[local14] = local19.method7445(arg0, arg2, local29, arg3);
						if (!arg4[local14]) {
							continue;
						}
					}
					local19.CA(arg0, arg2, local29, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(Lclient!rba;IIIII)V")
	public static void method8896(@OriginalArg(0) Class16_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static395.anInt6810) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static595.anInt9881) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static389.anInt6693 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class84 local62 = Static348.aClass84ArrayArrayArray5[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static511.aClass91Array3[local17].method7447(local32, local23) + Static511.aClass91Array3[local17].method7447(local32, local23 + 1) + Static511.aClass91Array3[local17].method7447(local32 + 1, local23) + Static511.aClass91Array3[local17].method7447(local32 + 1, local23 + 1)) / 4 - (Static511.aClass91Array3[arg1].method7447(arg3, arg2) + Static511.aClass91Array3[arg1].method7447(arg3, arg2 + 1) + Static511.aClass91Array3[arg1].method7447(arg3 + 1, arg2) + Static511.aClass91Array3[arg1].method7447(arg3 + 1, arg2 + 1)) / 4;
									@Pc(151) Class16_Sub1_Sub2 local151 = local62.aClass16_Sub1_Sub2_1;
									@Pc(154) Class16_Sub1_Sub2 local154 = local62.aClass16_Sub1_Sub2_2;
									if (local151 != null && local151.method6976()) {
										arg0.method6984(local148, local151, Static380.aClass13_86, local1, (local32 - arg3) * Static519.anInt8387 + (1 - arg5) * Static620.anInt10145, (local23 - arg2) * Static519.anInt8387 + (1 - arg4) * Static620.anInt10145);
									}
									if (local154 != null && local154.method6976()) {
										arg0.method6984(local148, local154, Static380.aClass13_86, local1, (local32 - arg3) * Static519.anInt8387 + (1 - arg5) * Static620.anInt10145, (local23 - arg2) * Static519.anInt8387 + (1 - arg4) * Static620.anInt10145);
									}
									for (@Pc(227) Class333 local227 = local62.aClass333_1; local227 != null; local227 = local227.aClass333_3) {
										@Pc(231) Class16_Sub1_Sub1 local231 = local227.aClass16_Sub1_Sub1_1;
										if (local231 != null && local231.method6976() && (local23 == local231.aShort103 || local23 == local3) && (local32 == local231.aShort106 || local32 == local11)) {
											@Pc(260) int local260 = local231.aShort104 + 1 - local231.aShort103;
											@Pc(268) int local268 = local231.aShort105 + 1 - local231.aShort106;
											arg0.method6984(local148, local231, Static380.aClass13_86, local1, (local231.aShort106 - arg3) * Static519.anInt8387 + (local268 - arg5) * Static620.anInt10145, (local231.aShort103 - arg2) * Static519.anInt8387 + (local260 - arg4) * Static620.anInt10145);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IILclient!nd;I)Lclient!jl;")
	public static Class183 method8897(@OriginalArg(0) int arg0, @OriginalArg(2) Class238 arg1) {
		@Pc(14) byte[] local14 = arg1.method5567(0, arg0);
		return local14 == null ? null : new Class183(local14);
	}

	@OriginalMember(owner = "client!au", name = "c", descriptor = "(Z)V")
	public static void method8899() {
		Static600.method8443(false);
		Static171.anInt3468 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static94.aByteArrayArray5.length; local14++) {
			if (Static87.anIntArray158[local14] != -1 && Static94.aByteArrayArray5[local14] == null) {
				Static94.aByteArrayArray5[local14] = Static122.aClass238_58.method5567(0, Static87.anIntArray158[local14]);
				if (Static94.aByteArrayArray5[local14] == null) {
					local12 = false;
					Static171.anInt3468++;
				}
			}
			if (Static326.anIntArray366[local14] != -1 && Static641.aByteArrayArray27[local14] == null) {
				Static641.aByteArrayArray27[local14] = Static122.aClass238_58.method5597(Static326.anIntArray366[local14], 0, anIntArrayArray115[local14]);
				if (Static641.aByteArrayArray27[local14] == null) {
					Static171.anInt3468++;
					local12 = false;
				}
			}
			if (Static80.anIntArray148[local14] != -1 && Static187.aByteArrayArray8[local14] == null) {
				Static187.aByteArrayArray8[local14] = Static122.aClass238_58.method5567(0, Static80.anIntArray148[local14]);
				if (Static187.aByteArrayArray8[local14] == null) {
					Static171.anInt3468++;
					local12 = false;
				}
			}
			if (Static555.anIntArray663[local14] != -1 && Static291.aByteArrayArray14[local14] == null) {
				Static291.aByteArrayArray14[local14] = Static122.aClass238_58.method5567(0, Static555.anIntArray663[local14]);
				if (Static291.aByteArrayArray14[local14] == null) {
					Static171.anInt3468++;
					local12 = false;
				}
			}
			if (Static461.anIntArray517 != null && Static502.aByteArrayArray26[local14] == null && Static461.anIntArray517[local14] != -1) {
				Static502.aByteArrayArray26[local14] = Static122.aClass238_58.method5597(Static461.anIntArray517[local14], 0, anIntArrayArray115[local14]);
				if (Static502.aByteArrayArray26[local14] == null) {
					local12 = false;
					Static171.anInt3468++;
				}
			}
		}
		if (Static223.aClass129_3 == null) {
			if (Static126.aClass2_Sub7_Sub3_1 == null || !Static178.aClass238_289.method5583(Static126.aClass2_Sub7_Sub3_1.aString26 + "_staticelements")) {
				Static223.aClass129_3 = new Class129(0);
			} else if (Static178.aClass238_289.method5570(Static126.aClass2_Sub7_Sub3_1.aString26 + "_staticelements")) {
				Static223.aClass129_3 = Static247.method4167(Static158.aBoolean257, Static126.aClass2_Sub7_Sub3_1.aString26 + "_staticelements", Static178.aClass238_289);
			} else {
				Static171.anInt3468++;
				local12 = false;
			}
		}
		if (!local12) {
			Static85.anInt2172 = 1;
			return;
		}
		local12 = true;
		Static417.anInt6986 = 0;
		@Pc(274) int local274;
		@Pc(285) int local285;
		for (@Pc(256) int local256 = 0; local256 < Static94.aByteArrayArray5.length; local256++) {
			@Pc(262) byte[] local262 = Static641.aByteArrayArray27[local256];
			if (local262 != null) {
				local274 = (Static635.anIntArray728[local256] >> 8) * 64 - Static406.anInt6899;
				local285 = (Static635.anIntArray728[local256] & 0xFF) * 64 - Static338.anInt5885;
				if (Static376.anInt6481 != 0) {
					local285 = 10;
					local274 = 10;
				}
				local12 &= Static122.method2201(Static456.anInt7428, local262, local285, Static5.anInt112, local274);
			}
			local262 = Static291.aByteArrayArray14[local256];
			if (local262 != null) {
				local274 = (Static635.anIntArray728[local256] >> 8) * 64 - Static406.anInt6899;
				local285 = (Static635.anIntArray728[local256] & 0xFF) * 64 - Static338.anInt5885;
				if (Static376.anInt6481 != 0) {
					local285 = 10;
					local274 = 10;
				}
				local12 &= Static122.method2201(Static456.anInt7428, local262, local285, Static5.anInt112, local274);
			}
		}
		if (!local12) {
			Static85.anInt2172 = 2;
			return;
		}
		if (Static85.anInt2172 != 0) {
			Static24.method603(Static39.aClass37_1, Static141.aClass13_27, true, Static266.aClass183_7, Static573.aClass345_14.method7951(Static496.anInt7407) + "<br>(100%)");
		}
		Static113.method2018();
		Static116.method2086();
		Static160.method2773();
		@Pc(387) boolean local387 = false;
		if (Static141.aClass13_27.method8121() && Static305.aClass2_Sub49_15.aClass33_Sub17_1.method5248() == 2) {
			for (local274 = 0; local274 < Static94.aByteArrayArray5.length; local274++) {
				if (Static291.aByteArrayArray14[local274] != null || Static187.aByteArrayArray8[local274] != null) {
					local387 = true;
					break;
				}
			}
		}
		if (Static305.aClass2_Sub49_15.aClass33_Sub23_1.method7242() == 1) {
			local274 = Static509.anIntArray604[Static523.anInt8452];
		} else {
			local274 = Static318.anIntArray350[Static523.anInt8452];
		}
		if (Static141.aClass13_27.method8152()) {
			local274++;
		}
		Static364.method5411(Static141.aClass13_27, Static58.anInt1440, Static456.anInt7428, Static5.anInt112, local274, local387, Static141.aClass13_27.method8089() > 0);
		Static12.method152(Static642.anInt10397);
		if (Static642.anInt10397 == 0) {
			Static335.method5092((Class37) null);
		} else {
			Static335.method5092(Static591.aClass37_12);
		}
		for (local285 = 0; local285 < 4; local285++) {
			Static520.aClass175Array1[local285].method4286();
		}
		Static584.method8074();
		Static562.method7870(false);
		Static433.method6269();
		Static593.aClass224_1 = null;
		Static36.aBoolean72 = false;
		Static113.method2018();
		System.gc();
		Static600.method8443(true);
		Static238.method6995();
		Static181.anInt3623 = Static305.aClass2_Sub49_15.aClass33_Sub18_1.method5267();
		Static229.aBoolean312 = Static79.anInt2093 >= 96;
		Static387.aBoolean471 = Static305.aClass2_Sub49_15.aClass33_Sub17_1.method5248() == 2;
		Static346.aBoolean404 = Static305.aClass2_Sub49_15.aClass33_Sub20_1.method5562() == 1;
		Static520.anInt8394 = Static305.aClass2_Sub49_15.aClass33_Sub27_1.method8670() == 1 ? -1 : Static245.anInt4753;
		Static472.aBoolean547 = Static305.aClass2_Sub49_15.aClass33_Sub6_1.method2479() == 1;
		Static646.aBoolean757 = Static305.aClass2_Sub49_15.aClass33_Sub2_1.method1432() == 1;
		Static348.aClass309_Sub1_1 = new Class309_Sub1(4, Static456.anInt7428, Static5.anInt112, false);
		if (Static376.anInt6481 == 0) {
			Static556.method7838(Static94.aByteArrayArray5, Static348.aClass309_Sub1_1);
		} else {
			Static582.method8068(Static348.aClass309_Sub1_1, Static94.aByteArrayArray5);
		}
		Static561.method7866(Static456.anInt7428 >> 4, Static5.anInt112 >> 4);
		Static563.method7886();
		if (local387) {
			Static192.method3293(true);
			Static405.aClass309_Sub1_2 = new Class309_Sub1(1, Static456.anInt7428, Static5.anInt112, true);
			if (Static376.anInt6481 == 0) {
				Static556.method7838(Static187.aByteArrayArray8, Static405.aClass309_Sub1_2);
				Static600.method8443(true);
			} else {
				Static582.method8068(Static405.aClass309_Sub1_2, Static187.aByteArrayArray8);
				Static600.method8443(true);
			}
			Static405.aClass309_Sub1_2.method7102(Static348.aClass309_Sub1_1.anIntArrayArrayArray17[0]);
			Static405.aClass309_Sub1_2.method7095(Static141.aClass13_27, (Class175[]) null, (int[][][]) null);
			Static192.method3293(false);
		}
		Static348.aClass309_Sub1_1.method7095(Static141.aClass13_27, Static520.aClass175Array1, local387 ? Static405.aClass309_Sub1_2.anIntArrayArrayArray17 : null);
		if (Static376.anInt6481 == 0) {
			Static600.method8443(true);
			Static30.method657(Static641.aByteArrayArray27, Static348.aClass309_Sub1_1);
			if (Static502.aByteArrayArray26 != null) {
				Static24.method604();
			}
		} else {
			Static600.method8443(true);
			Static65.method1476(Static348.aClass309_Sub1_1, Static641.aByteArrayArray27);
		}
		Static116.method2086();
		if (Static79.anInt2093 < 96) {
			Static287.method8820();
		}
		Static600.method8443(true);
		Static348.aClass309_Sub1_1.method7091(Static141.aClass13_27, local387 ? Static332.aClass91Array2[0] : null, (Class91) null);
		Static348.aClass309_Sub1_1.method7112(false, Static141.aClass13_27);
		Static600.method8443(true);
		if (local387) {
			Static192.method3293(true);
			Static600.method8443(true);
			if (Static376.anInt6481 == 0) {
				Static30.method657(Static291.aByteArrayArray14, Static405.aClass309_Sub1_2);
			} else {
				Static65.method1476(Static405.aClass309_Sub1_2, Static291.aByteArrayArray14);
			}
			Static116.method2086();
			Static600.method8443(true);
			Static405.aClass309_Sub1_2.method7091(Static141.aClass13_27, (Class91) null, Static124.aClass91Array1[0]);
			Static405.aClass309_Sub1_2.method7112(true, Static141.aClass13_27);
			Static600.method8443(true);
			Static192.method3293(false);
		}
		Static554.method7825();
		@Pc(768) int local768 = Static348.aClass309_Sub1_1.anInt8275;
		if (Static531.anInt8550 < local768) {
			local768 = Static531.anInt8550;
		}
		if (Static531.anInt8550 - 1 > local768) {
			local768 = Static531.anInt8550 - 1;
		}
		if (Static305.aClass2_Sub49_15.aClass33_Sub27_1.method8670() == 0) {
			Static295.method4662(local768);
		} else {
			Static295.method4662(0);
		}
		@Pc(803) int local803;
		@Pc(807) int local807;
		for (@Pc(799) int local799 = 0; local799 < 4; local799++) {
			for (local803 = 0; local803 < Static456.anInt7428; local803++) {
				for (local807 = 0; local807 < Static5.anInt112; local807++) {
					Static72.method1634(local807, local799, local803);
				}
			}
		}
		Static196.method3388();
		Static113.method2018();
		Static420.method6133();
		Static116.method2086();
		Static460.method6509();
		@Pc(860) Class2_Sub31 local860;
		if (Static80.aFrame2 != null && Static341.aClass22_4 != null && Static454.anInt7416 == 11) {
			local860 = Static275.method4480(Static640.aClass314_2, Static210.aClass145_168);
			local860.aClass2_Sub17_Sub1_2.method2827(1057001181);
			Static526.method7309(local860);
		}
		if (Static376.anInt6481 == 0) {
			local803 = (Static470.anInt7589 - (Static456.anInt7428 >> 4)) / 8;
			local807 = (Static470.anInt7589 + (Static456.anInt7428 >> 4)) / 8;
			@Pc(897) int local897 = (Static456.anInt7439 - (Static5.anInt112 >> 4)) / 8;
			@Pc(905) int local905 = ((Static5.anInt112 >> 4) + Static456.anInt7439) / 8;
			for (@Pc(909) int local909 = local803 - 1; local909 <= local807 + 1; local909++) {
				for (@Pc(915) int local915 = local897 - 1; local915 <= local905 + 1; local915++) {
					if (local909 < local803 || local807 < local909 || local915 < local897 || local915 > local905) {
						Static122.aClass238_58.method5590("m" + local909 + "_" + local915);
						Static122.aClass238_58.method5590("l" + local909 + "_" + local915);
					}
				}
			}
		}
		if (Static454.anInt7416 == 4) {
			Static213.method3541(3);
		} else if (Static454.anInt7416 == 8) {
			Static213.method3541(7);
		} else {
			Static213.method3541(10);
			if (Static341.aClass22_4 != null) {
				local860 = Static275.method4480(Static640.aClass314_2, Static422.aClass145_125);
				Static526.method7309(local860);
			}
		}
		Static196.method3390();
		Static113.method2018();
		Static127.method2286();
		Static578.aBoolean673 = true;
		if (Static272.aBoolean376) {
			Static575.method7997("Took: " + (Static48.method1203() - Static552.aLong8) + "ms");
			Static272.aBoolean376 = false;
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(I[BLjava/lang/String;I)I")
	public static int method8903(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) String arg2) {
		@Pc(13) int local13 = arg2.length();
		for (@Pc(15) int local15 = 0; local15 < local13; local15 += 4) {
			@Pc(24) int local24 = Static388.method5733(arg2.charAt(local15));
			@Pc(41) int local41 = local15 + 1 < local13 ? Static388.method5733(arg2.charAt(local15 + 1)) : -1;
			@Pc(60) int local60 = local15 + 2 >= local13 ? -1 : Static388.method5733(arg2.charAt(local15 + 2));
			@Pc(79) int local79 = local13 > local15 + 3 ? Static388.method5733(arg2.charAt(local15 + 3)) : -1;
			arg1[arg0++] = (byte) (local41 >>> 4 | local24 << 2);
			if (local60 == -1) {
				break;
			}
			arg1[arg0++] = (byte) (local60 >>> 2 | (local41 & 0xF) << 4);
			if (local79 == -1) {
				break;
			}
			arg1[arg0++] = (byte) ((local60 & 0x3) << 6 | local79);
		}
		return arg0;
	}
}
