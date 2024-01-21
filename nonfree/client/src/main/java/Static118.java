import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!nf", name = "h", descriptor = "[I")
	public static int[] anIntArray265;

	@OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
	public static int anInt2877;

	@OriginalMember(owner = "client!nf", name = "g", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1065 = Static177.method3050("button near the top of that page)3");

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1060 = aClass46_1065;

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1061 = Static177.method3050(")2");

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "Z")
	public static boolean aBoolean121 = false;

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1062 = Static177.method3050("cross");

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1063 = Static177.method3050("Connection timed out)3");

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1064 = Static177.method3050(")1p");

	@OriginalMember(owner = "client!nf", name = "k", descriptor = "[I")
	public static final int[] anIntArray266 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

	@OriginalMember(owner = "client!nf", name = "n", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1066 = aClass46_1063;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIII)V")
	public static void method2139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(17) Class4_Sub16 local17 = (Class4_Sub16) Static25.aClass20_1.method505((long) arg1);
		if (local17 == null) {
			local17 = new Class4_Sub16();
			Static25.aClass20_1.method499((long) arg1, local17);
		}
		if (local17.anIntArray245.length <= arg3) {
			@Pc(39) int[] local39 = new int[arg3 + 1];
			@Pc(44) int[] local44 = new int[arg3 + 1];
			for (@Pc(46) int local46 = 0; local46 < local17.anIntArray245.length; local46++) {
				local39[local46] = local17.anIntArray245[local46];
				local44[local46] = local17.anIntArray244[local46];
			}
			for (@Pc(76) int local76 = local17.anIntArray245.length; local76 < arg3; local76++) {
				local39[local76] = -1;
				local44[local76] = 0;
			}
			local17.anIntArray244 = local44;
			local17.anIntArray245 = local39;
		}
		local17.anIntArray245[arg3] = arg0;
		local17.anIntArray244[arg3] = arg2;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(BI)V")
	public static void method2140(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(10) int local10 = Static123.anIntArray280[arg0];
		@Pc(14) int local14 = Static163.anIntArray370[arg0];
		@Pc(18) int local18 = Static11.aShortArray5[arg0];
		if (local18 >= 2000) {
			local18 -= 2000;
		}
		@Pc(27) int local27 = (int) Static40.aLongArray14[arg0];
		@Pc(31) long local31 = Static40.aLongArray14[arg0];
		@Pc(40) Class4_Sub1_Sub1_Sub1_Sub2 local40;
		if (local18 == 47) {
			local40 = Static97.aClass4_Sub1_Sub1_Sub1_Sub2Array1[local27];
			if (local40 != null) {
				Static163.method2823(Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray262[0], 0, Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray259[0], local40.anIntArray262[0], 1, false, 1, 0, 0, local40.anIntArray259[0], 2);
				Static143.anInt3331 = Static73.anInt1877;
				Static65.anInt1716 = 2;
				Static179.anInt3998 = 0;
				Static162.anInt3596 = Static28.anInt747;
				Static90.aClass4_Sub11_Sub1_1.method1285(91);
				Static90.aClass4_Sub11_Sub1_1.method1251(local27);
				Static90.aClass4_Sub11_Sub1_1.method1260(Static117.anInt2870);
				Static90.aClass4_Sub11_Sub1_1.method1248(Static28.anInt745);
				Static90.aClass4_Sub11_Sub1_1.method1268(Static1.anInt54);
			}
		}
		if (local18 == 13) {
			Static90.aClass4_Sub11_Sub1_1.method1285(182);
			Static90.aClass4_Sub11_Sub1_1.method1274(local27);
			Static90.aClass4_Sub11_Sub1_1.method1268(local14);
			Static90.aClass4_Sub11_Sub1_1.method1270(local10);
			Static58.anInt1413 = 0;
			Static45.aClass1_15 = Static154.method3136(local10);
			Static96.anInt2445 = local14;
		}
		@Pc(164) boolean local164;
		if (local18 == 8) {
			local164 = Static163.method2823(Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray262[0], 0, Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray259[0], local14, 0, false, 0, 0, 0, local10, 2);
			if (!local164) {
				Static163.method2823(Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray262[0], 0, Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray259[0], local14, 1, false, 1, 0, 0, local10, 2);
			}
			Static179.anInt3998 = 0;
			Static65.anInt1716 = 2;
			Static162.anInt3596 = Static28.anInt747;
			Static143.anInt3331 = Static73.anInt1877;
			Static90.aClass4_Sub11_Sub1_1.method1285(22);
			Static90.aClass4_Sub11_Sub1_1.method1270(Static124.anInt2981);
			Static90.aClass4_Sub11_Sub1_1.method1274(Static106.anInt2649);
			Static90.aClass4_Sub11_Sub1_1.method1260(local10 + Static184.anInt4144);
			Static90.aClass4_Sub11_Sub1_1.method1268(local27);
			Static90.aClass4_Sub11_Sub1_1.method1251(local14 + Static103.anInt2610);
		}
		if (local18 == 57) {
			Static90.aClass4_Sub11_Sub1_1.method1285(209);
			Static90.aClass4_Sub11_Sub1_1.method1251(local14);
			Static90.aClass4_Sub11_Sub1_1.method1274(local27);
			Static90.aClass4_Sub11_Sub1_1.method1256(local10);
			Static58.anInt1413 = 0;
			Static45.aClass1_15 = Static154.method3136(local10);
			Static96.anInt2445 = local14;
		}
		if (local18 == 2 && Static8.method167(local31, local10, local14)) {
			Static90.aClass4_Sub11_Sub1_1.method1285(125);
			Static90.aClass4_Sub11_Sub1_1.method1268(Static184.anInt4144 + local10);
			Static90.aClass4_Sub11_Sub1_1.method1260(local14 + Static103.anInt2610);
			Static90.aClass4_Sub11_Sub1_1.method1274(Static1.anInt54);
			Static90.aClass4_Sub11_Sub1_1.method1268((int) (local31 >>> 32) & Integer.MAX_VALUE);
			Static90.aClass4_Sub11_Sub1_1.method1260(Static117.anInt2870);
			Static90.aClass4_Sub11_Sub1_1.method1256(Static28.anInt745);
		}
		if (local18 == 50) {
			local164 = Static163.method2823(Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray262[0], 0, Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray259[0], local14, 0, false, 0, 0, 0, local10, 2);
			if (!local164) {
				Static163.method2823(Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray262[0], 0, Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray259[0], local14, 1, false, 1, 0, 0, local10, 2);
			}
			Static65.anInt1716 = 2;
			Static179.anInt3998 = 0;
			Static162.anInt3596 = Static28.anInt747;
			Static143.anInt3331 = Static73.anInt1877;
			Static90.aClass4_Sub11_Sub1_1.method1285(240);
			Static90.aClass4_Sub11_Sub1_1.method1260(local14 + Static103.anInt2610);
			Static90.aClass4_Sub11_Sub1_1.method1251(local27);
			Static90.aClass4_Sub11_Sub1_1.method1274(local10 + Static184.anInt4144);
		}
		@Pc(396) Class1 local396;
		if (local18 == 38) {
			@Pc(392) boolean local392 = true;
			local396 = Static154.method3136(local10);
			if (local396.anInt62 > 0) {
				local392 = Static183.method1447(local396);
			}
			if (local392) {
				Static90.aClass4_Sub11_Sub1_1.method1285(13);
				Static90.aClass4_Sub11_Sub1_1.method1256(local10);
			}
		}
		if (local18 == 18) {
			local40 = Static97.aClass4_Sub1_Sub1_Sub1_Sub2Array1[local27];
			if (local40 != null) {
				Static163.method2823(Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray262[0], 0, Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray259[0], local40.anIntArray262[0], 1, false, 1, 0, 0, local40.anIntArray259[0], 2);
				Static65.anInt1716 = 2;
				Static143.anInt3331 = Static73.anInt1877;
				Static162.anInt3596 = Static28.anInt747;
				Static179.anInt3998 = 0;
				Static90.aClass4_Sub11_Sub1_1.method1285(130);
				Static90.aClass4_Sub11_Sub1_1.method1268(local27);
			}
		}
		if (local18 == 25) {
			local164 = Static163.method2823(Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray262[0], 0, Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray259[0], local14, 0, false, 0, 0, 0, local10, 2);
			if (!local164) {
				Static163.method2823(Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray262[0], 0, Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray259[0], local14, 1, false, 1, 0, 0, local10, 2);
			}
			Static179.anInt3998 = 0;
			Static162.anInt3596 = Static28.anInt747;
			Static65.anInt1716 = 2;
			Static143.anInt3331 = Static73.anInt1877;
			Static90.aClass4_Sub11_Sub1_1.method1285(160);
			Static90.aClass4_Sub11_Sub1_1.method1274(Static103.anInt2610 + local14);
			Static90.aClass4_Sub11_Sub1_1.method1251(local10 + Static184.anInt4144);
			Static90.aClass4_Sub11_Sub1_1.method1251(local27);
		}
		if (local18 == 16) {
			Static41.method712();
		}
		@Pc(575) Class4_Sub1_Sub1_Sub1_Sub1 local575;
		if (local18 == 33) {
			local575 = Static152.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local27];
			if (local575 != null) {
				Static163.method2823(Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray262[0], 0, Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray259[0], local575.anIntArray262[0], 1, false, 1, 0, 0, local575.anIntArray259[0], 2);
				Static162.anInt3596 = Static28.anInt747;
				Static179.anInt3998 = 0;
				Static143.anInt3331 = Static73.anInt1877;
				Static65.anInt1716 = 2;
				Static90.aClass4_Sub11_Sub1_1.method1285(134);
				Static90.aClass4_Sub11_Sub1_1.method1268(local27);
			}
		}
		if (local18 == 15) {
			local575 = Static152.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local27];
			if (local575 != null) {
				Static163.method2823(Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray262[0], 0, Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray259[0], local575.anIntArray262[0], 1, false, 1, 0, 0, local575.anIntArray259[0], 2);
				Static179.anInt3998 = 0;
				Static65.anInt1716 = 2;
				Static162.anInt3596 = Static28.anInt747;
				Static143.anInt3331 = Static73.anInt1877;
				Static90.aClass4_Sub11_Sub1_1.method1285(81);
				Static90.aClass4_Sub11_Sub1_1.method1236(Static28.anInt745);
				Static90.aClass4_Sub11_Sub1_1.method1251(Static1.anInt54);
				Static90.aClass4_Sub11_Sub1_1.method1274(Static117.anInt2870);
				Static90.aClass4_Sub11_Sub1_1.method1274(local27);
			}
		}
		@Pc(733) int local733;
		if (local18 == 39) {
			Static90.aClass4_Sub11_Sub1_1.method1285(13);
			Static90.aClass4_Sub11_Sub1_1.method1256(local10);
			local396 = Static154.method3136(local10);
			if (local396.anIntArrayArray1 != null && local396.anIntArrayArray1[0][0] == 5) {
				local733 = local396.anIntArrayArray1[0][1];
				if (Static147.anIntArray64[local733] != local396.anIntArray8[0]) {
					Static147.anIntArray64[local733] = local396.anIntArray8[0];
					Static125.method2219(local733);
				}
			}
		}
		if (local18 == 1007) {
			local396 = Static154.method3136(local10);
			if (local396 == null || local396.anIntArray2[local14] < 100000) {
				Static90.aClass4_Sub11_Sub1_1.method1285(204);
				Static90.aClass4_Sub11_Sub1_1.method1260(local27);
			} else {
				Static105.method1982(Static3.aClass46_44, 0, Static69.method1482(new Class46[] { Static127.method2240(local396.anIntArray2[local14]), Static114.aClass46_1022, Static83.method1663(local27).aClass46_895 }));
			}
			Static58.anInt1413 = 0;
			Static45.aClass1_15 = Static154.method3136(local10);
			Static96.anInt2445 = local14;
		}
		if (local18 == 21) {
			local575 = Static152.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local27];
			if (local575 != null) {
				Static163.method2823(Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray262[0], 0, Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray259[0], local575.anIntArray262[0], 1, false, 1, 0, 0, local575.anIntArray259[0], 2);
				Static143.anInt3331 = Static73.anInt1877;
				Static179.anInt3998 = 0;
				Static162.anInt3596 = Static28.anInt747;
				Static65.anInt1716 = 2;
				Static90.aClass4_Sub11_Sub1_1.method1285(176);
				Static90.aClass4_Sub11_Sub1_1.method1256(Static124.anInt2981);
				Static90.aClass4_Sub11_Sub1_1.method1251(local27);
				Static90.aClass4_Sub11_Sub1_1.method1274(Static106.anInt2649);
			}
		}
		if (local18 == 1004) {
			Static8.method167(local31, local10, local14);
			Static90.aClass4_Sub11_Sub1_1.method1285(51);
			Static90.aClass4_Sub11_Sub1_1.method1274(local14 + Static103.anInt2610);
			Static90.aClass4_Sub11_Sub1_1.method1260(Integer.MAX_VALUE & (int) (local31 >>> 32));
			Static90.aClass4_Sub11_Sub1_1.method1260(local10 + Static184.anInt4144);
		}
		if (local18 == 48) {
			local40 = Static97.aClass4_Sub1_Sub1_Sub1_Sub2Array1[local27];
			if (local40 != null) {
				Static163.method2823(Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray262[0], 0, Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray259[0], local40.anIntArray262[0], 1, false, 1, 0, 0, local40.anIntArray259[0], 2);
				Static162.anInt3596 = Static28.anInt747;
				Static143.anInt3331 = Static73.anInt1877;
				Static65.anInt1716 = 2;
				Static179.anInt3998 = 0;
				Static90.aClass4_Sub11_Sub1_1.method1285(144);
				Static90.aClass4_Sub11_Sub1_1.method1260(local27);
			}
		}
		if (local18 == 46) {
			Static90.aClass4_Sub11_Sub1_1.method1285(76);
			Static90.aClass4_Sub11_Sub1_1.method1256(local10);
			Static90.aClass4_Sub11_Sub1_1.method1268(local27);
			Static90.aClass4_Sub11_Sub1_1.method1260(local14);
			Static58.anInt1413 = 0;
			Static45.aClass1_15 = Static154.method3136(local10);
			Static96.anInt2445 = local14;
		}
		if (local18 == 1002) {
			Static162.anInt3596 = Static28.anInt747;
			Static65.anInt1716 = 2;
			Static143.anInt3331 = Static73.anInt1877;
			Static179.anInt3998 = 0;
			Static90.aClass4_Sub11_Sub1_1.method1285(204);
			Static90.aClass4_Sub11_Sub1_1.method1260(local27);
		}
		if (local18 == 26) {
			local575 = Static152.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local27];
			if (local575 != null) {
				Static163.method2823(Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray262[0], 0, Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray259[0], local575.anIntArray262[0], 1, false, 1, 0, 0, local575.anIntArray259[0], 2);
				Static179.anInt3998 = 0;
				Static162.anInt3596 = Static28.anInt747;
				Static65.anInt1716 = 2;
				Static143.anInt3331 = Static73.anInt1877;
				Static90.aClass4_Sub11_Sub1_1.method1285(207);
				Static90.aClass4_Sub11_Sub1_1.method1268(local27);
			}
		}
		if (local18 == 43) {
			Static8.method167(local31, local10, local14);
			Static90.aClass4_Sub11_Sub1_1.method1285(10);
			Static90.aClass4_Sub11_Sub1_1.method1274(local10 + Static184.anInt4144);
			Static90.aClass4_Sub11_Sub1_1.method1268(local14 + Static103.anInt2610);
			Static90.aClass4_Sub11_Sub1_1.method1268(Integer.MAX_VALUE & (int) (local31 >>> 32));
		}
		if (local18 == 42) {
			local575 = Static152.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local27];
			if (local575 != null) {
				Static163.method2823(Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray262[0], 0, Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray259[0], local575.anIntArray262[0], 1, false, 1, 0, 0, local575.anIntArray259[0], 2);
				Static65.anInt1716 = 2;
				Static179.anInt3998 = 0;
				Static143.anInt3331 = Static73.anInt1877;
				Static162.anInt3596 = Static28.anInt747;
				Static90.aClass4_Sub11_Sub1_1.method1285(66);
				Static90.aClass4_Sub11_Sub1_1.method1260(local27);
			}
		}
		if (local18 == 44) {
			Static8.method167(local31, local10, local14);
			Static90.aClass4_Sub11_Sub1_1.method1285(42);
			Static90.aClass4_Sub11_Sub1_1.method1268((int) (local31 >>> 32) & Integer.MAX_VALUE);
			Static90.aClass4_Sub11_Sub1_1.method1274(local10 + Static184.anInt4144);
			Static90.aClass4_Sub11_Sub1_1.method1260(Static103.anInt2610 + local14);
		}
		if (local18 == 7) {
			local164 = Static163.method2823(Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray262[0], 0, Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray259[0], local14, 0, false, 0, 0, 0, local10, 2);
			if (!local164) {
				Static163.method2823(Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray262[0], 0, Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray259[0], local14, 1, false, 1, 0, 0, local10, 2);
			}
			Static65.anInt1716 = 2;
			Static162.anInt3596 = Static28.anInt747;
			Static143.anInt3331 = Static73.anInt1877;
			Static179.anInt3998 = 0;
			Static90.aClass4_Sub11_Sub1_1.method1285(118);
			Static90.aClass4_Sub11_Sub1_1.method1274(local27);
			Static90.aClass4_Sub11_Sub1_1.method1268(local10 + Static184.anInt4144);
			Static90.aClass4_Sub11_Sub1_1.method1274(local14 + Static103.anInt2610);
		}
		if (local18 == 14) {
			Static90.aClass4_Sub11_Sub1_1.method1285(165);
			Static90.aClass4_Sub11_Sub1_1.method1260(local14);
			Static90.aClass4_Sub11_Sub1_1.method1270(local10);
			Static90.aClass4_Sub11_Sub1_1.method1251(local27);
			Static58.anInt1413 = 0;
			Static45.aClass1_15 = Static154.method3136(local10);
			Static96.anInt2445 = local14;
		}
		if (local18 == 1001) {
			Static65.anInt1716 = 2;
			Static179.anInt3998 = 0;
			Static162.anInt3596 = Static28.anInt747;
			Static143.anInt3331 = Static73.anInt1877;
			Static90.aClass4_Sub11_Sub1_1.method1285(43);
			Static90.aClass4_Sub11_Sub1_1.method1260(local27);
		}
		if (local18 == 34) {
			Static90.aClass4_Sub11_Sub1_1.method1285(230);
			Static90.aClass4_Sub11_Sub1_1.method1248(local10);
			Static90.aClass4_Sub11_Sub1_1.method1256(Static124.anInt2981);
			Static90.aClass4_Sub11_Sub1_1.method1268(Static106.anInt2649);
			Static90.aClass4_Sub11_Sub1_1.method1251(local14);
		}
		if (local18 == 40) {
			local40 = Static97.aClass4_Sub1_Sub1_Sub1_Sub2Array1[local27];
			if (local40 != null) {
				Static163.method2823(Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray262[0], 0, Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray259[0], local40.anIntArray262[0], 1, false, 1, 0, 0, local40.anIntArray259[0], 2);
				Static143.anInt3331 = Static73.anInt1877;
				Static65.anInt1716 = 2;
				Static179.anInt3998 = 0;
				Static162.anInt3596 = Static28.anInt747;
				Static90.aClass4_Sub11_Sub1_1.method1285(49);
				Static90.aClass4_Sub11_Sub1_1.method1274(local27);
			}
		}
		if (local18 == 6) {
			local164 = Static163.method2823(Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray262[0], 0, Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray259[0], local14, 0, false, 0, 0, 0, local10, 2);
			if (!local164) {
				Static163.method2823(Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray262[0], 0, Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray259[0], local14, 1, false, 1, 0, 0, local10, 2);
			}
			Static143.anInt3331 = Static73.anInt1877;
			Static162.anInt3596 = Static28.anInt747;
			Static65.anInt1716 = 2;
			Static179.anInt3998 = 0;
			Static90.aClass4_Sub11_Sub1_1.method1285(59);
			Static90.aClass4_Sub11_Sub1_1.method1251(local27);
			Static90.aClass4_Sub11_Sub1_1.method1268(local14 + Static103.anInt2610);
			Static90.aClass4_Sub11_Sub1_1.method1251(local10 + Static184.anInt4144);
		}
		if (local18 == 19) {
			local40 = Static97.aClass4_Sub1_Sub1_Sub1_Sub2Array1[local27];
			if (local40 != null) {
				Static163.method2823(Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray262[0], 0, Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray259[0], local40.anIntArray262[0], 1, false, 1, 0, 0, local40.anIntArray259[0], 2);
				Static65.anInt1716 = 2;
				Static162.anInt3596 = Static28.anInt747;
				Static179.anInt3998 = 0;
				Static143.anInt3331 = Static73.anInt1877;
				Static90.aClass4_Sub11_Sub1_1.method1285(175);
				Static90.aClass4_Sub11_Sub1_1.method1274(local27);
			}
		}
		if (local18 == 32) {
			local164 = Static163.method2823(Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray262[0], 0, Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray259[0], local14, 0, false, 0, 0, 0, local10, 2);
			if (!local164) {
				Static163.method2823(Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray262[0], 0, Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray259[0], local14, 1, false, 1, 0, 0, local10, 2);
			}
			Static65.anInt1716 = 2;
			Static162.anInt3596 = Static28.anInt747;
			Static143.anInt3331 = Static73.anInt1877;
			Static179.anInt3998 = 0;
			Static90.aClass4_Sub11_Sub1_1.method1285(201);
			Static90.aClass4_Sub11_Sub1_1.method1260(Static1.anInt54);
			Static90.aClass4_Sub11_Sub1_1.method1251(Static117.anInt2870);
			Static90.aClass4_Sub11_Sub1_1.method1236(Static28.anInt745);
			Static90.aClass4_Sub11_Sub1_1.method1268(Static184.anInt4144 + local10);
			Static90.aClass4_Sub11_Sub1_1.method1260(local14 + Static103.anInt2610);
			Static90.aClass4_Sub11_Sub1_1.method1274(local27);
		}
		if (local18 == 1) {
			local40 = Static97.aClass4_Sub1_Sub1_Sub1_Sub2Array1[local27];
			if (local40 != null) {
				Static163.method2823(Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray262[0], 0, Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray259[0], local40.anIntArray262[0], 1, false, 1, 0, 0, local40.anIntArray259[0], 2);
				Static65.anInt1716 = 2;
				Static162.anInt3596 = Static28.anInt747;
				Static179.anInt3998 = 0;
				Static143.anInt3331 = Static73.anInt1877;
				Static90.aClass4_Sub11_Sub1_1.method1285(33);
				Static90.aClass4_Sub11_Sub1_1.method1256(Static124.anInt2981);
				Static90.aClass4_Sub11_Sub1_1.method1268(local27);
				Static90.aClass4_Sub11_Sub1_1.method1260(Static106.anInt2649);
			}
		}
		if (local18 == 12) {
			local396 = Static132.method2334(local14, local10);
			if (local396 != null) {
				Static39.method690();
				Static63.method1242(Static119.method2144(Static102.method1954(local396)), local10, local14);
				Static53.anInt1331 = 0;
				Static111.aClass46_1005 = Static187.method3167(local396);
				if (Static111.aClass46_1005 == null) {
					Static111.aClass46_1005 = Static170.aClass46_1396;
				}
				if (!local396.aBoolean8) {
					Static30.aClass46_250 = Static69.method1482(new Class46[] { Static163.aClass46_1374, local396.aClass46_4, Static45.aClass46_394 });
					return;
				}
				Static30.aClass46_250 = Static69.method1482(new Class46[] { local396.aClass46_10, Static45.aClass46_394 });
			}
			return;
		}
		if (local18 == 4) {
			Static8.method167(local31, local10, local14);
			Static90.aClass4_Sub11_Sub1_1.method1285(200);
			Static90.aClass4_Sub11_Sub1_1.method1260(local14 + Static103.anInt2610);
			Static90.aClass4_Sub11_Sub1_1.method1268(Integer.MAX_VALUE & (int) (local31 >>> 32));
			Static90.aClass4_Sub11_Sub1_1.method1251(Static184.anInt4144 + local10);
		}
		if (local18 == 31) {
			Static90.aClass4_Sub11_Sub1_1.method1285(94);
			Static90.aClass4_Sub11_Sub1_1.method1256(local10);
			Static90.aClass4_Sub11_Sub1_1.method1260(local14);
			Static90.aClass4_Sub11_Sub1_1.method1274(local27);
			Static58.anInt1413 = 0;
			Static45.aClass1_15 = Static154.method3136(local10);
			Static96.anInt2445 = local14;
		}
		if (local18 == 36 && Static8.method167(local31, local10, local14)) {
			Static90.aClass4_Sub11_Sub1_1.method1285(9);
			Static90.aClass4_Sub11_Sub1_1.method1256(Static124.anInt2981);
			Static90.aClass4_Sub11_Sub1_1.method1260(Integer.MAX_VALUE & (int) (local31 >>> 32));
			Static90.aClass4_Sub11_Sub1_1.method1274(Static106.anInt2649);
			Static90.aClass4_Sub11_Sub1_1.method1260(local14 + Static103.anInt2610);
			Static90.aClass4_Sub11_Sub1_1.method1260(Static184.anInt4144 + local10);
		}
		if (local18 == 11) {
			Static162.method2732(Static73.anInt1873, local14, local10);
		}
		if (local18 == 3) {
			Static90.aClass4_Sub11_Sub1_1.method1285(13);
			Static90.aClass4_Sub11_Sub1_1.method1256(local10);
			local396 = Static154.method3136(local10);
			if (local396.anIntArrayArray1 != null && local396.anIntArrayArray1[0][0] == 5) {
				local733 = local396.anIntArrayArray1[0][1];
				Static147.anIntArray64[local733] = 1 - Static147.anIntArray64[local733];
				Static125.method2219(local733);
			}
		}
		if (local18 == 49) {
			Static90.aClass4_Sub11_Sub1_1.method1285(151);
			Static90.aClass4_Sub11_Sub1_1.method1251(local27);
			Static90.aClass4_Sub11_Sub1_1.method1256(Static124.anInt2981);
			Static90.aClass4_Sub11_Sub1_1.method1256(local10);
			Static90.aClass4_Sub11_Sub1_1.method1260(local14);
			Static90.aClass4_Sub11_Sub1_1.method1268(Static106.anInt2649);
			Static58.anInt1413 = 0;
			Static45.aClass1_15 = Static154.method3136(local10);
			Static96.anInt2445 = local14;
		}
		if (local18 == 24) {
			local575 = Static152.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local27];
			if (local575 != null) {
				Static163.method2823(Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray262[0], 0, Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray259[0], local575.anIntArray262[0], 1, false, 1, 0, 0, local575.anIntArray259[0], 2);
				Static162.anInt3596 = Static28.anInt747;
				Static143.anInt3331 = Static73.anInt1877;
				Static65.anInt1716 = 2;
				Static179.anInt3998 = 0;
				Static90.aClass4_Sub11_Sub1_1.method1285(236);
				Static90.aClass4_Sub11_Sub1_1.method1260(local27);
			}
		}
		if (local18 == 1005) {
			Static143.anInt3331 = Static73.anInt1877;
			Static65.anInt1716 = 2;
			Static179.anInt3998 = 0;
			Static162.anInt3596 = Static28.anInt747;
			local40 = Static97.aClass4_Sub1_Sub1_Sub1_Sub2Array1[local27];
			if (local40 != null) {
				@Pc(2157) Class4_Sub1_Sub11 local2157 = local40.aClass4_Sub1_Sub11_1;
				if (local2157.anIntArray210 != null) {
					local2157 = local2157.method1742();
				}
				if (local2157 != null) {
					Static90.aClass4_Sub11_Sub1_1.method1285(83);
					Static90.aClass4_Sub11_Sub1_1.method1268(local2157.anInt2248);
				}
			}
		}
		if (local18 == 29) {
			Static39.method690();
			local396 = Static154.method3136(local10);
			Static1.anInt54 = local14;
			Static28.anInt745 = local10;
			Static117.anInt2870 = local27;
			Static53.anInt1331 = 1;
			Static3.method21(local396);
			Static1.aClass46_1 = Static69.method1482(new Class46[] { Static46.aClass46_469, Static83.method1663(local27).aClass46_895, Static45.aClass46_394 });
			if (Static1.aClass46_1 == null) {
				Static1.aClass46_1 = Static54.aClass46_524;
			}
			return;
		}
		if (local18 == 58) {
			local575 = Static152.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local27];
			if (local575 != null) {
				Static163.method2823(Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray262[0], 0, Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray259[0], local575.anIntArray262[0], 1, false, 1, 0, 0, local575.anIntArray259[0], 2);
				Static162.anInt3596 = Static28.anInt747;
				Static143.anInt3331 = Static73.anInt1877;
				Static65.anInt1716 = 2;
				Static179.anInt3998 = 0;
				Static90.aClass4_Sub11_Sub1_1.method1285(202);
				Static90.aClass4_Sub11_Sub1_1.method1251(local27);
			}
		}
		if (local18 == 45) {
			local164 = Static163.method2823(Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray262[0], 0, Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray259[0], local14, 0, false, 0, 0, 0, local10, 2);
			if (!local164) {
				Static163.method2823(Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray262[0], 0, Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray259[0], local14, 1, false, 1, 0, 0, local10, 2);
			}
			Static143.anInt3331 = Static73.anInt1877;
			Static179.anInt3998 = 0;
			Static65.anInt1716 = 2;
			Static162.anInt3596 = Static28.anInt747;
			Static90.aClass4_Sub11_Sub1_1.method1285(60);
			Static90.aClass4_Sub11_Sub1_1.method1251(local27);
			Static90.aClass4_Sub11_Sub1_1.method1268(local14 + Static103.anInt2610);
			Static90.aClass4_Sub11_Sub1_1.method1251(Static184.anInt4144 + local10);
		}
		if (local18 == 5) {
			local575 = Static152.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local27];
			if (local575 != null) {
				Static163.method2823(Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray262[0], 0, Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray259[0], local575.anIntArray262[0], 1, false, 1, 0, 0, local575.anIntArray259[0], 2);
				Static179.anInt3998 = 0;
				Static162.anInt3596 = Static28.anInt747;
				Static65.anInt1716 = 2;
				Static143.anInt3331 = Static73.anInt1877;
				Static90.aClass4_Sub11_Sub1_1.method1285(87);
				Static90.aClass4_Sub11_Sub1_1.method1260(local27);
			}
		}
		if (local18 == 35) {
			Static90.aClass4_Sub11_Sub1_1.method1285(44);
			Static90.aClass4_Sub11_Sub1_1.method1274(local14);
			Static90.aClass4_Sub11_Sub1_1.method1251(local27);
			Static90.aClass4_Sub11_Sub1_1.method1236(local10);
			Static58.anInt1413 = 0;
			Static45.aClass1_15 = Static154.method3136(local10);
			Static96.anInt2445 = local14;
		}
		if (local18 == 10) {
			local40 = Static97.aClass4_Sub1_Sub1_Sub1_Sub2Array1[local27];
			if (local40 != null) {
				Static163.method2823(Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray262[0], 0, Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray259[0], local40.anIntArray262[0], 1, false, 1, 0, 0, local40.anIntArray259[0], 2);
				Static162.anInt3596 = Static28.anInt747;
				Static65.anInt1716 = 2;
				Static179.anInt3998 = 0;
				Static143.anInt3331 = Static73.anInt1877;
				Static90.aClass4_Sub11_Sub1_1.method1285(86);
				Static90.aClass4_Sub11_Sub1_1.method1274(local27);
			}
		}
		if (local18 == 41) {
			Static90.aClass4_Sub11_Sub1_1.method1285(231);
			Static90.aClass4_Sub11_Sub1_1.method1274(local27);
			Static90.aClass4_Sub11_Sub1_1.method1256(local10);
			Static90.aClass4_Sub11_Sub1_1.method1268(local14);
			Static58.anInt1413 = 0;
			Static45.aClass1_15 = Static154.method3136(local10);
			Static96.anInt2445 = local14;
		}
		if (local18 == 30) {
			Static90.aClass4_Sub11_Sub1_1.method1285(170);
			Static90.aClass4_Sub11_Sub1_1.method1251(local14);
			Static90.aClass4_Sub11_Sub1_1.method1268(local27);
			Static90.aClass4_Sub11_Sub1_1.method1236(local10);
			Static58.anInt1413 = 0;
			Static45.aClass1_15 = Static154.method3136(local10);
			Static96.anInt2445 = local14;
		}
		if (local18 == 22) {
			Static90.aClass4_Sub11_Sub1_1.method1285(254);
			Static90.aClass4_Sub11_Sub1_1.method1236(Static28.anInt745);
			Static90.aClass4_Sub11_Sub1_1.method1251(local14);
			Static90.aClass4_Sub11_Sub1_1.method1248(local10);
			Static90.aClass4_Sub11_Sub1_1.method1251(Static117.anInt2870);
			Static90.aClass4_Sub11_Sub1_1.method1251(local27);
			Static90.aClass4_Sub11_Sub1_1.method1251(Static1.anInt54);
			Static58.anInt1413 = 0;
			Static45.aClass1_15 = Static154.method3136(local10);
			Static96.anInt2445 = local14;
		}
		if (local18 == 17 || local18 == 1006) {
			Static23.method393(Static166.aClass46Array24[arg0], local14, local27, local10);
		}
		if (local18 == 9 && Static84.aClass1_54 == null) {
			Static180.method3093(local14, local10);
			Static84.aClass1_54 = Static132.method2334(local14, local10);
			Static3.method21(Static84.aClass1_54);
		}
		if (local18 == 51) {
			Static90.aClass4_Sub11_Sub1_1.method1285(215);
			Static90.aClass4_Sub11_Sub1_1.method1236(local10);
			Static90.aClass4_Sub11_Sub1_1.method1274(local14);
			Static90.aClass4_Sub11_Sub1_1.method1251(local27);
			Static58.anInt1413 = 0;
			Static45.aClass1_15 = Static154.method3136(local10);
			Static96.anInt2445 = local14;
		}
		if (local18 == 20) {
			local575 = Static152.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local27];
			if (local575 != null) {
				Static163.method2823(Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray262[0], 0, Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray259[0], local575.anIntArray262[0], 1, false, 1, 0, 0, local575.anIntArray259[0], 2);
				Static162.anInt3596 = Static28.anInt747;
				Static179.anInt3998 = 0;
				Static143.anInt3331 = Static73.anInt1877;
				Static65.anInt1716 = 2;
				Static90.aClass4_Sub11_Sub1_1.method1285(70);
				Static90.aClass4_Sub11_Sub1_1.method1268(local27);
			}
		}
		if (local18 == 23) {
			Static8.method167(local31, local10, local14);
			Static90.aClass4_Sub11_Sub1_1.method1285(237);
			Static90.aClass4_Sub11_Sub1_1.method1260((int) (local31 >>> 32) & Integer.MAX_VALUE);
			Static90.aClass4_Sub11_Sub1_1.method1274(Static184.anInt4144 + local10);
			Static90.aClass4_Sub11_Sub1_1.method1260(Static103.anInt2610 + local14);
		}
		if (local18 == 28) {
			local575 = Static152.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local27];
			if (local575 != null) {
				Static163.method2823(Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray262[0], 0, Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray259[0], local575.anIntArray262[0], 1, false, 1, 0, 0, local575.anIntArray259[0], 2);
				Static179.anInt3998 = 0;
				Static143.anInt3331 = Static73.anInt1877;
				Static65.anInt1716 = 2;
				Static162.anInt3596 = Static28.anInt747;
				Static90.aClass4_Sub11_Sub1_1.method1285(188);
				Static90.aClass4_Sub11_Sub1_1.method1260(local27);
			}
		}
		if (local18 == 37) {
			Static90.aClass4_Sub11_Sub1_1.method1285(123);
			Static90.aClass4_Sub11_Sub1_1.method1268(local27);
			Static90.aClass4_Sub11_Sub1_1.method1260(local14);
			Static90.aClass4_Sub11_Sub1_1.method1270(local10);
			Static58.anInt1413 = 0;
			Static45.aClass1_15 = Static154.method3136(local10);
			Static96.anInt2445 = local14;
		}
		if (Static53.anInt1331 != 0) {
			Static53.anInt1331 = 0;
			Static3.method21(Static154.method3136(Static28.anInt745));
		}
		if (Static86.aBoolean97) {
			Static39.method690();
		}
		if (Static45.aClass1_15 != null && Static58.anInt1413 == 0) {
			Static3.method21(Static45.aClass1_15);
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IZIILclient!nh;I)V")
	public static void method2141(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class62 arg2) {
		Static140.aClass62_35 = arg2;
		Static71.anInt1861 = 1;
		Static135.anInt3221 = arg1;
		Static30.anInt765 = 10000;
		Static99.anInt2522 = arg0;
		Static134.anInt3187 = 0;
		Static135.aBoolean135 = false;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IBI)V")
	public static void method2142(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) long local15 = (long) (arg1 + (arg0 << 16));
		@Pc(23) Class4_Sub1_Sub16 local23 = (Class4_Sub1_Sub16) Static146.aClass20_9.method505(local15);
		if (local23 != null) {
			Static140.aClass78_2.method2671(local23);
		}
	}
}
