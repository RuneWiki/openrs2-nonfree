import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ag", name = "B", descriptor = "Lclient!eh;")
	public static Class28 aClass28_12;

	@OriginalMember(owner = "client!ag", name = "L", descriptor = "Lclient!eh;")
	public static Class28 aClass28_13;

	@OriginalMember(owner = "client!ag", name = "x", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_45 = Static181.method2795(":duelfriend:");

	@OriginalMember(owner = "client!ag", name = "C", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_47 = Static181.method2795("slide:");

	@OriginalMember(owner = "client!ag", name = "z", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_46 = aClass83_47;

	@OriginalMember(owner = "client!ag", name = "A", descriptor = "[Lclient!ee;")
	public static final Class28_Sub1[] aClass28_Sub1Array1 = new Class28_Sub1[256];

	@OriginalMember(owner = "client!ag", name = "I", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_48 = Static181.method2795("No response from server)3");

	@OriginalMember(owner = "client!ag", name = "J", descriptor = "Lclient!qe;")
	public static Class83 aClass83_49 = aClass83_48;

	@OriginalMember(owner = "client!ag", name = "N", descriptor = "Lclient!qe;")
	public static Class83 aClass83_51 = aClass83_47;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)V")
	public static void method124(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(10) int local10 = Static2.anIntArray1[arg0];
		@Pc(14) int local14 = Static94.anIntArray201[arg0];
		@Pc(18) int local18 = Static22.aShortArray9[arg0];
		if (local18 >= 2000) {
			local18 -= 2000;
		}
		@Pc(29) int local29 = (int) Static212.aLongArray9[arg0];
		@Pc(33) long local33 = Static212.aLongArray9[arg0];
		if (local18 == 1004) {
			Static142.method2282(local10, local33, local14);
			Static69.aClass2_Sub3_Sub1_2.method284(23);
			Static69.aClass2_Sub3_Sub1_2.method239(Static2.anInt57 + local10);
			Static69.aClass2_Sub3_Sub1_2.method239(local14 + Static123.anInt2755);
			Static69.aClass2_Sub3_Sub1_2.method239((int) (local33 >>> 32) & Integer.MAX_VALUE);
		}
		@Pc(82) Class5 local82;
		if (local18 == 26) {
			local82 = Static74.method1401(local14);
			@Pc(84) boolean local84 = true;
			if (local82.anInt180 > 0) {
				local84 = Static200.method3031(local82);
			}
			if (local84) {
				Static69.aClass2_Sub3_Sub1_2.method284(85);
				Static69.aClass2_Sub3_Sub1_2.method246(local14);
			}
		}
		if (local18 == 58) {
			Static142.method2282(local10, local33, local14);
			Static69.aClass2_Sub3_Sub1_2.method284(236);
			Static69.aClass2_Sub3_Sub1_2.method239(Integer.MAX_VALUE & (int) (local33 >>> 32));
			Static69.aClass2_Sub3_Sub1_2.method239(Static123.anInt2755 + local14);
			Static69.aClass2_Sub3_Sub1_2.method239(local10 + Static2.anInt57);
		}
		@Pc(177) boolean local177;
		if (local18 == 49) {
			local177 = Static166.method2576(2, local10, 0, local14, false, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray316[0], 0, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray319[0], 0);
			if (!local177) {
				Static166.method2576(2, local10, 0, local14, false, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray316[0], 1, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray319[0], 1);
			}
			Static37.anInt961 = 2;
			Static85.anInt1874 = Static59.anInt1446;
			Static33.anInt870 = Static153.anInt3298;
			Static46.anInt1093 = 0;
			Static69.aClass2_Sub3_Sub1_2.method284(70);
			Static69.aClass2_Sub3_Sub1_2.method263(Static2.anInt57 + local10);
			Static69.aClass2_Sub3_Sub1_2.method253(local29);
			Static69.aClass2_Sub3_Sub1_2.method263(Static146.anInt3041);
			Static69.aClass2_Sub3_Sub1_2.method250(Static50.anInt1300);
			Static69.aClass2_Sub3_Sub1_2.method263(Static123.anInt2755 + local14);
		}
		@Pc(244) Class24_Sub4_Sub1 local244;
		if (local18 == 6) {
			local244 = Static22.aClass24_Sub4_Sub1Array1[local29];
			if (local244 != null) {
				Static166.method2576(2, local244.anIntArray319[0], 0, local244.anIntArray316[0], false, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray316[0], 1, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray319[0], 1);
				Static85.anInt1874 = Static59.anInt1446;
				Static37.anInt961 = 2;
				Static33.anInt870 = Static153.anInt3298;
				Static46.anInt1093 = 0;
				Static69.aClass2_Sub3_Sub1_2.method284(63);
				Static69.aClass2_Sub3_Sub1_2.method246(Static50.anInt1300);
				Static69.aClass2_Sub3_Sub1_2.method225(local29);
				Static69.aClass2_Sub3_Sub1_2.method263(Static146.anInt3041);
			}
		}
		if (local18 == 1007) {
			Static46.anInt1093 = 0;
			Static37.anInt961 = 2;
			Static33.anInt870 = Static153.anInt3298;
			Static85.anInt1874 = Static59.anInt1446;
			Static69.aClass2_Sub3_Sub1_2.method284(79);
			Static69.aClass2_Sub3_Sub1_2.method253(local29);
		}
		if (local18 == 35) {
			Static69.aClass2_Sub3_Sub1_2.method284(159);
			Static69.aClass2_Sub3_Sub1_2.method239(local10);
			Static69.aClass2_Sub3_Sub1_2.method250(local14);
			Static69.aClass2_Sub3_Sub1_2.method239(local29);
			Static93.anInt1976 = 0;
			Static183.aClass5_6 = Static74.method1401(local14);
			Static153.anInt3291 = local10;
		}
		if (local18 == 17) {
			local244 = Static22.aClass24_Sub4_Sub1Array1[local29];
			if (local244 != null) {
				Static166.method2576(2, local244.anIntArray319[0], 0, local244.anIntArray316[0], false, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray316[0], 1, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray319[0], 1);
				Static85.anInt1874 = Static59.anInt1446;
				Static33.anInt870 = Static153.anInt3298;
				Static37.anInt961 = 2;
				Static46.anInt1093 = 0;
				Static69.aClass2_Sub3_Sub1_2.method284(247);
				Static69.aClass2_Sub3_Sub1_2.method253(local29);
			}
		}
		if (local18 == 46) {
			Static69.aClass2_Sub3_Sub1_2.method284(59);
			Static69.aClass2_Sub3_Sub1_2.method253(local10);
			Static69.aClass2_Sub3_Sub1_2.method225(local29);
			Static69.aClass2_Sub3_Sub1_2.method218(local14);
			Static93.anInt1976 = 0;
			Static183.aClass5_6 = Static74.method1401(local14);
			Static153.anInt3291 = local10;
		}
		if (local18 == 19) {
			Static174.method2692();
			local82 = Static74.method1401(local14);
			Static62.anInt1511 = local29;
			Static63.anInt3436 = local14;
			Static150.anInt3074 = 1;
			Static183.anInt803 = local10;
			Static121.method2085(local82);
			Static99.aClass83_646 = Static67.method1268(new Class83[] { Static182.aClass83_1066, Static113.method1987(local29).aClass83_87, Static2.aClass83_8 });
			if (Static99.aClass83_646 == null) {
				Static99.aClass83_646 = Static21.aClass83_129;
			}
			return;
		}
		if (local18 == 45) {
			local177 = Static166.method2576(2, local10, 0, local14, false, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray316[0], 0, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray319[0], 0);
			if (!local177) {
				Static166.method2576(2, local10, 0, local14, false, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray316[0], 1, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray319[0], 1);
			}
			Static46.anInt1093 = 0;
			Static85.anInt1874 = Static59.anInt1446;
			Static33.anInt870 = Static153.anInt3298;
			Static37.anInt961 = 2;
			Static69.aClass2_Sub3_Sub1_2.method284(125);
			Static69.aClass2_Sub3_Sub1_2.method225(Static183.anInt803);
			Static69.aClass2_Sub3_Sub1_2.method225(Static2.anInt57 + local10);
			Static69.aClass2_Sub3_Sub1_2.method246(Static63.anInt3436);
			Static69.aClass2_Sub3_Sub1_2.method263(local14 + Static123.anInt2755);
			Static69.aClass2_Sub3_Sub1_2.method239(local29);
			Static69.aClass2_Sub3_Sub1_2.method225(Static62.anInt1511);
		}
		if (local18 == 50) {
			local82 = Static201.method3053(local10, local14);
			if (local82 != null) {
				Static174.method2692();
				Static75.method1425(Static200.method3027(Static138.method2242(local82)), local14, local10);
				Static150.anInt3074 = 0;
				Static171.aClass83_1013 = Static93.method1605(local82);
				if (Static171.aClass83_1013 == null) {
					Static171.aClass83_1013 = Static60.aClass83_643;
				}
				if (local82.aBoolean7) {
					Static163.aClass83_962 = Static67.method1268(new Class83[] { local82.aClass83_35, Static2.aClass83_8 });
					return;
				}
				Static163.aClass83_962 = Static67.method1268(new Class83[] { Static116.aClass83_784, local82.aClass83_34, Static2.aClass83_8 });
			}
			return;
		}
		if (local18 == 29) {
			Static69.aClass2_Sub3_Sub1_2.method284(32);
			Static69.aClass2_Sub3_Sub1_2.method246(local14);
			Static69.aClass2_Sub3_Sub1_2.method253(local29);
			Static69.aClass2_Sub3_Sub1_2.method239(local10);
			Static93.anInt1976 = 0;
			Static183.aClass5_6 = Static74.method1401(local14);
			Static153.anInt3291 = local10;
		}
		if (local18 == 14 && Static104.aClass5_11 == null) {
			Static174.method2690(local14, local10);
			Static104.aClass5_11 = Static201.method3053(local10, local14);
			Static121.method2085(Static104.aClass5_11);
		}
		if (local18 == 3) {
			local244 = Static22.aClass24_Sub4_Sub1Array1[local29];
			if (local244 != null) {
				Static166.method2576(2, local244.anIntArray319[0], 0, local244.anIntArray316[0], false, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray316[0], 1, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray319[0], 1);
				Static37.anInt961 = 2;
				Static46.anInt1093 = 0;
				Static85.anInt1874 = Static59.anInt1446;
				Static33.anInt870 = Static153.anInt3298;
				Static69.aClass2_Sub3_Sub1_2.method284(180);
				Static69.aClass2_Sub3_Sub1_2.method225(local29);
			}
		}
		if (local18 == 32) {
			local244 = Static22.aClass24_Sub4_Sub1Array1[local29];
			if (local244 != null) {
				Static166.method2576(2, local244.anIntArray319[0], 0, local244.anIntArray316[0], false, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray316[0], 1, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray319[0], 1);
				Static85.anInt1874 = Static59.anInt1446;
				Static37.anInt961 = 2;
				Static46.anInt1093 = 0;
				Static33.anInt870 = Static153.anInt3298;
				Static69.aClass2_Sub3_Sub1_2.method284(35);
				Static69.aClass2_Sub3_Sub1_2.method239(local29);
			}
		}
		if (local18 == 21) {
			local244 = Static22.aClass24_Sub4_Sub1Array1[local29];
			if (local244 != null) {
				Static166.method2576(2, local244.anIntArray319[0], 0, local244.anIntArray316[0], false, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray316[0], 1, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray319[0], 1);
				Static46.anInt1093 = 0;
				Static33.anInt870 = Static153.anInt3298;
				Static37.anInt961 = 2;
				Static85.anInt1874 = Static59.anInt1446;
				Static69.aClass2_Sub3_Sub1_2.method284(239);
				Static69.aClass2_Sub3_Sub1_2.method263(local29);
			}
		}
		@Pc(901) Class24_Sub4_Sub2 local901;
		if (local18 == 47) {
			local901 = Static47.aClass24_Sub4_Sub2Array1[local29];
			if (local901 != null) {
				Static166.method2576(2, local901.anIntArray319[0], 0, local901.anIntArray316[0], false, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray316[0], 1, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray319[0], 1);
				Static46.anInt1093 = 0;
				Static85.anInt1874 = Static59.anInt1446;
				Static37.anInt961 = 2;
				Static33.anInt870 = Static153.anInt3298;
				Static69.aClass2_Sub3_Sub1_2.method284(209);
				Static69.aClass2_Sub3_Sub1_2.method225(local29);
			}
		}
		if (local18 == 1001) {
			Static85.anInt1874 = Static59.anInt1446;
			Static33.anInt870 = Static153.anInt3298;
			Static37.anInt961 = 2;
			Static46.anInt1093 = 0;
			local901 = Static47.aClass24_Sub4_Sub2Array1[local29];
			if (local901 != null) {
				@Pc(969) Class2_Sub2_Sub24 local969 = local901.aClass2_Sub2_Sub24_1;
				if (local969.anIntArray309 != null) {
					local969 = local969.method2447();
				}
				if (local969 != null) {
					Static69.aClass2_Sub3_Sub1_2.method284(233);
					Static69.aClass2_Sub3_Sub1_2.method225(local969.anInt3201);
				}
			}
		}
		if (local18 == 42) {
			local901 = Static47.aClass24_Sub4_Sub2Array1[local29];
			if (local901 != null) {
				Static166.method2576(2, local901.anIntArray319[0], 0, local901.anIntArray316[0], false, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray316[0], 1, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray319[0], 1);
				Static37.anInt961 = 2;
				Static33.anInt870 = Static153.anInt3298;
				Static85.anInt1874 = Static59.anInt1446;
				Static46.anInt1093 = 0;
				Static69.aClass2_Sub3_Sub1_2.method284(228);
				Static69.aClass2_Sub3_Sub1_2.method250(Static63.anInt3436);
				Static69.aClass2_Sub3_Sub1_2.method239(Static62.anInt1511);
				Static69.aClass2_Sub3_Sub1_2.method239(Static183.anInt803);
				Static69.aClass2_Sub3_Sub1_2.method253(local29);
			}
		}
		if (local18 == 40) {
			local244 = Static22.aClass24_Sub4_Sub1Array1[local29];
			if (local244 != null) {
				Static166.method2576(2, local244.anIntArray319[0], 0, local244.anIntArray316[0], false, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray316[0], 1, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray319[0], 1);
				Static85.anInt1874 = Static59.anInt1446;
				Static46.anInt1093 = 0;
				Static37.anInt961 = 2;
				Static33.anInt870 = Static153.anInt3298;
				Static69.aClass2_Sub3_Sub1_2.method284(183);
				Static69.aClass2_Sub3_Sub1_2.method239(local29);
			}
		}
		if (local18 == 33) {
			local901 = Static47.aClass24_Sub4_Sub2Array1[local29];
			if (local901 != null) {
				Static166.method2576(2, local901.anIntArray319[0], 0, local901.anIntArray316[0], false, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray316[0], 1, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray319[0], 1);
				Static85.anInt1874 = Static59.anInt1446;
				Static37.anInt961 = 2;
				Static33.anInt870 = Static153.anInt3298;
				Static46.anInt1093 = 0;
				Static69.aClass2_Sub3_Sub1_2.method284(220);
				Static69.aClass2_Sub3_Sub1_2.method253(local29);
			}
		}
		if (local18 == 23) {
			local244 = Static22.aClass24_Sub4_Sub1Array1[local29];
			if (local244 != null) {
				Static166.method2576(2, local244.anIntArray319[0], 0, local244.anIntArray316[0], false, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray316[0], 1, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray319[0], 1);
				Static85.anInt1874 = Static59.anInt1446;
				Static37.anInt961 = 2;
				Static46.anInt1093 = 0;
				Static33.anInt870 = Static153.anInt3298;
				Static69.aClass2_Sub3_Sub1_2.method284(121);
				Static69.aClass2_Sub3_Sub1_2.method233(Static63.anInt3436);
				Static69.aClass2_Sub3_Sub1_2.method225(local29);
				Static69.aClass2_Sub3_Sub1_2.method253(Static183.anInt803);
				Static69.aClass2_Sub3_Sub1_2.method263(Static62.anInt1511);
			}
		}
		if (local18 == 15) {
			Static69.aClass2_Sub3_Sub1_2.method284(118);
			Static69.aClass2_Sub3_Sub1_2.method263(Static146.anInt3041);
			Static69.aClass2_Sub3_Sub1_2.method246(Static50.anInt1300);
			Static69.aClass2_Sub3_Sub1_2.method233(local14);
			Static69.aClass2_Sub3_Sub1_2.method253(local10);
		}
		if (local18 == 37) {
			local177 = Static166.method2576(2, local10, 0, local14, false, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray316[0], 0, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray319[0], 0);
			if (!local177) {
				Static166.method2576(2, local10, 0, local14, false, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray316[0], 1, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray319[0], 1);
			}
			Static46.anInt1093 = 0;
			Static37.anInt961 = 2;
			Static85.anInt1874 = Static59.anInt1446;
			Static33.anInt870 = Static153.anInt3298;
			Static69.aClass2_Sub3_Sub1_2.method284(218);
			Static69.aClass2_Sub3_Sub1_2.method263(local29);
			Static69.aClass2_Sub3_Sub1_2.method263(Static2.anInt57 + local10);
			Static69.aClass2_Sub3_Sub1_2.method225(Static123.anInt2755 + local14);
		}
		if (local18 == 57 && Static142.method2282(local10, local33, local14)) {
			Static69.aClass2_Sub3_Sub1_2.method284(66);
			Static69.aClass2_Sub3_Sub1_2.method263((int) (local33 >>> 32) & Integer.MAX_VALUE);
			Static69.aClass2_Sub3_Sub1_2.method253(Static183.anInt803);
			Static69.aClass2_Sub3_Sub1_2.method225(Static62.anInt1511);
			Static69.aClass2_Sub3_Sub1_2.method253(local10 + Static2.anInt57);
			Static69.aClass2_Sub3_Sub1_2.method239(Static123.anInt2755 + local14);
			Static69.aClass2_Sub3_Sub1_2.method250(Static63.anInt3436);
		}
		if (local18 == 1006) {
			Static85.anInt1874 = Static59.anInt1446;
			Static33.anInt870 = Static153.anInt3298;
			Static46.anInt1093 = 0;
			Static37.anInt961 = 2;
			Static69.aClass2_Sub3_Sub1_2.method284(116);
			Static69.aClass2_Sub3_Sub1_2.method225(local29);
		}
		if (local18 == 38) {
			Static142.method2282(local10, local33, local14);
			Static69.aClass2_Sub3_Sub1_2.method284(221);
			Static69.aClass2_Sub3_Sub1_2.method253(Static123.anInt2755 + local14);
			Static69.aClass2_Sub3_Sub1_2.method253(Static2.anInt57 + local10);
			Static69.aClass2_Sub3_Sub1_2.method239(Integer.MAX_VALUE & (int) (local33 >>> 32));
		}
		if (local18 == 28) {
			Static69.aClass2_Sub3_Sub1_2.method284(69);
			Static69.aClass2_Sub3_Sub1_2.method218(Static50.anInt1300);
			Static69.aClass2_Sub3_Sub1_2.method263(local29);
			Static69.aClass2_Sub3_Sub1_2.method253(Static146.anInt3041);
			Static69.aClass2_Sub3_Sub1_2.method246(local14);
			Static69.aClass2_Sub3_Sub1_2.method253(local10);
			Static93.anInt1976 = 0;
			Static183.aClass5_6 = Static74.method1401(local14);
			Static153.anInt3291 = local10;
		}
		if (local18 == 13) {
			local901 = Static47.aClass24_Sub4_Sub2Array1[local29];
			if (local901 != null) {
				Static166.method2576(2, local901.anIntArray319[0], 0, local901.anIntArray316[0], false, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray316[0], 1, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray319[0], 1);
				Static46.anInt1093 = 0;
				Static33.anInt870 = Static153.anInt3298;
				Static85.anInt1874 = Static59.anInt1446;
				Static37.anInt961 = 2;
				Static69.aClass2_Sub3_Sub1_2.method284(151);
				Static69.aClass2_Sub3_Sub1_2.method225(local29);
			}
		}
		if (local18 == 44) {
			local177 = Static166.method2576(2, local10, 0, local14, false, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray316[0], 0, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray319[0], 0);
			if (!local177) {
				Static166.method2576(2, local10, 0, local14, false, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray316[0], 1, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray319[0], 1);
			}
			Static46.anInt1093 = 0;
			Static33.anInt870 = Static153.anInt3298;
			Static37.anInt961 = 2;
			Static85.anInt1874 = Static59.anInt1446;
			Static69.aClass2_Sub3_Sub1_2.method284(94);
			Static69.aClass2_Sub3_Sub1_2.method225(local10 + Static2.anInt57);
			Static69.aClass2_Sub3_Sub1_2.method253(Static123.anInt2755 + local14);
			Static69.aClass2_Sub3_Sub1_2.method263(local29);
		}
		if (local18 == 22) {
			Static69.aClass2_Sub3_Sub1_2.method284(111);
			Static69.aClass2_Sub3_Sub1_2.method218(local14);
			Static69.aClass2_Sub3_Sub1_2.method253(local10);
			Static69.aClass2_Sub3_Sub1_2.method253(local29);
			Static93.anInt1976 = 0;
			Static183.aClass5_6 = Static74.method1401(local14);
			Static153.anInt3291 = local10;
		}
		if (local18 == 48) {
			local901 = Static47.aClass24_Sub4_Sub2Array1[local29];
			if (local901 != null) {
				Static166.method2576(2, local901.anIntArray319[0], 0, local901.anIntArray316[0], false, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray316[0], 1, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray319[0], 1);
				Static33.anInt870 = Static153.anInt3298;
				Static46.anInt1093 = 0;
				Static37.anInt961 = 2;
				Static85.anInt1874 = Static59.anInt1446;
				Static69.aClass2_Sub3_Sub1_2.method284(97);
				Static69.aClass2_Sub3_Sub1_2.method263(local29);
			}
		}
		if (local18 == 25) {
			Static69.aClass2_Sub3_Sub1_2.method284(143);
			Static69.aClass2_Sub3_Sub1_2.method253(local29);
			Static69.aClass2_Sub3_Sub1_2.method218(local14);
			Static69.aClass2_Sub3_Sub1_2.method239(local10);
			Static93.anInt1976 = 0;
			Static183.aClass5_6 = Static74.method1401(local14);
			Static153.anInt3291 = local10;
		}
		@Pc(1809) int local1809;
		if (local18 == 36) {
			Static69.aClass2_Sub3_Sub1_2.method284(85);
			Static69.aClass2_Sub3_Sub1_2.method246(local14);
			local82 = Static74.method1401(local14);
			if (local82.anIntArrayArray1 != null && local82.anIntArrayArray1[0][0] == 5) {
				local1809 = local82.anIntArrayArray1[0][1];
				Static14.anIntArray235[local1809] = 1 - Static14.anIntArray235[local1809];
				Static34.method719(local1809);
			}
		}
		if (local18 == 7) {
			Static186.method2833();
		}
		if (local18 == 20) {
			local244 = Static22.aClass24_Sub4_Sub1Array1[local29];
			if (local244 != null) {
				Static166.method2576(2, local244.anIntArray319[0], 0, local244.anIntArray316[0], false, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray316[0], 1, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray319[0], 1);
				Static85.anInt1874 = Static59.anInt1446;
				Static46.anInt1093 = 0;
				Static37.anInt961 = 2;
				Static33.anInt870 = Static153.anInt3298;
				Static69.aClass2_Sub3_Sub1_2.method284(112);
				Static69.aClass2_Sub3_Sub1_2.method225(local29);
			}
		}
		if (local18 == 1002) {
			local82 = Static74.method1401(local14);
			if (local82 == null || local82.anIntArray5[local10] < 100000) {
				Static69.aClass2_Sub3_Sub1_2.method284(79);
				Static69.aClass2_Sub3_Sub1_2.method253(local29);
			} else {
				Static165.method2554(0, Static67.method1268(new Class83[] { Static129.method2179(local82.anIntArray5[local10]), Static21.aClass83_130, Static113.method1987(local29).aClass83_87 }), Static182.aClass83_1067);
			}
			Static93.anInt1976 = 0;
			Static183.aClass5_6 = Static74.method1401(local14);
			Static153.anInt3291 = local10;
		}
		if (local18 == 30) {
			local177 = Static166.method2576(2, local10, 0, local14, false, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray316[0], 0, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray319[0], 0);
			if (!local177) {
				Static166.method2576(2, local10, 0, local14, false, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray316[0], 1, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray319[0], 1);
			}
			Static85.anInt1874 = Static59.anInt1446;
			Static46.anInt1093 = 0;
			Static37.anInt961 = 2;
			Static33.anInt870 = Static153.anInt3298;
			Static69.aClass2_Sub3_Sub1_2.method284(156);
			Static69.aClass2_Sub3_Sub1_2.method263(local29);
			Static69.aClass2_Sub3_Sub1_2.method239(local10 + Static2.anInt57);
			Static69.aClass2_Sub3_Sub1_2.method239(local14 + Static123.anInt2755);
		}
		if (local18 == 10) {
			Static103.method1808(Static43.anInt1126, local10, local14);
		}
		if (local18 == 51) {
			Static69.aClass2_Sub3_Sub1_2.method284(88);
			Static69.aClass2_Sub3_Sub1_2.method233(local14);
			Static69.aClass2_Sub3_Sub1_2.method239(local10);
			Static69.aClass2_Sub3_Sub1_2.method263(local29);
			Static93.anInt1976 = 0;
			Static183.aClass5_6 = Static74.method1401(local14);
			Static153.anInt3291 = local10;
		}
		if (local18 == 9 || local18 == 1003) {
			Static9.method148(local14, local10, local29, Static22.aClass83Array12[arg0]);
		}
		if (local18 == 24) {
			Static69.aClass2_Sub3_Sub1_2.method284(85);
			Static69.aClass2_Sub3_Sub1_2.method246(local14);
			local82 = Static74.method1401(local14);
			if (local82.anIntArrayArray1 != null && local82.anIntArrayArray1[0][0] == 5) {
				local1809 = local82.anIntArrayArray1[0][1];
				if (local82.anIntArray7[0] != Static14.anIntArray235[local1809]) {
					Static14.anIntArray235[local1809] = local82.anIntArray7[0];
					Static34.method719(local1809);
				}
			}
		}
		if (local18 == 18) {
			Static69.aClass2_Sub3_Sub1_2.method284(246);
			Static69.aClass2_Sub3_Sub1_2.method239(local10);
			Static69.aClass2_Sub3_Sub1_2.method239(Static62.anInt1511);
			Static69.aClass2_Sub3_Sub1_2.method233(Static63.anInt3436);
			Static69.aClass2_Sub3_Sub1_2.method239(local29);
			Static69.aClass2_Sub3_Sub1_2.method239(Static183.anInt803);
			Static69.aClass2_Sub3_Sub1_2.method246(local14);
			Static93.anInt1976 = 0;
			Static183.aClass5_6 = Static74.method1401(local14);
			Static153.anInt3291 = local10;
		}
		if (local18 == 2 && Static142.method2282(local10, local33, local14)) {
			Static69.aClass2_Sub3_Sub1_2.method284(113);
			Static69.aClass2_Sub3_Sub1_2.method253(local14 + Static123.anInt2755);
			Static69.aClass2_Sub3_Sub1_2.method253(Static2.anInt57 + local10);
			Static69.aClass2_Sub3_Sub1_2.method239(Static146.anInt3041);
			Static69.aClass2_Sub3_Sub1_2.method239(Integer.MAX_VALUE & (int) (local33 >>> 32));
			Static69.aClass2_Sub3_Sub1_2.method218(Static50.anInt1300);
		}
		if (local18 == 43) {
			Static69.aClass2_Sub3_Sub1_2.method284(193);
			Static69.aClass2_Sub3_Sub1_2.method263(local10);
			Static69.aClass2_Sub3_Sub1_2.method239(local29);
			Static69.aClass2_Sub3_Sub1_2.method233(local14);
			Static93.anInt1976 = 0;
			Static183.aClass5_6 = Static74.method1401(local14);
			Static153.anInt3291 = local10;
		}
		if (local18 == 31) {
			local901 = Static47.aClass24_Sub4_Sub2Array1[local29];
			if (local901 != null) {
				Static166.method2576(2, local901.anIntArray319[0], 0, local901.anIntArray316[0], false, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray316[0], 1, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray319[0], 1);
				Static37.anInt961 = 2;
				Static33.anInt870 = Static153.anInt3298;
				Static46.anInt1093 = 0;
				Static85.anInt1874 = Static59.anInt1446;
				Static69.aClass2_Sub3_Sub1_2.method284(47);
				Static69.aClass2_Sub3_Sub1_2.method225(local29);
				Static69.aClass2_Sub3_Sub1_2.method263(Static146.anInt3041);
				Static69.aClass2_Sub3_Sub1_2.method250(Static50.anInt1300);
			}
		}
		if (local18 == 8) {
			local177 = Static166.method2576(2, local10, 0, local14, false, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray316[0], 0, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray319[0], 0);
			if (!local177) {
				Static166.method2576(2, local10, 0, local14, false, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray316[0], 1, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray319[0], 1);
			}
			Static37.anInt961 = 2;
			Static46.anInt1093 = 0;
			Static85.anInt1874 = Static59.anInt1446;
			Static33.anInt870 = Static153.anInt3298;
			Static69.aClass2_Sub3_Sub1_2.method284(138);
			Static69.aClass2_Sub3_Sub1_2.method239(local10 + Static2.anInt57);
			Static69.aClass2_Sub3_Sub1_2.method225(local14 + Static123.anInt2755);
			Static69.aClass2_Sub3_Sub1_2.method263(local29);
		}
		if (local18 == 11) {
			local244 = Static22.aClass24_Sub4_Sub1Array1[local29];
			if (local244 != null) {
				Static166.method2576(2, local244.anIntArray319[0], 0, local244.anIntArray316[0], false, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray316[0], 1, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray319[0], 1);
				Static37.anInt961 = 2;
				Static85.anInt1874 = Static59.anInt1446;
				Static46.anInt1093 = 0;
				Static33.anInt870 = Static153.anInt3298;
				Static69.aClass2_Sub3_Sub1_2.method284(89);
				Static69.aClass2_Sub3_Sub1_2.method263(local29);
			}
		}
		if (local18 == 34) {
			Static69.aClass2_Sub3_Sub1_2.method284(114);
			Static69.aClass2_Sub3_Sub1_2.method246(local14);
			Static69.aClass2_Sub3_Sub1_2.method263(local29);
			Static69.aClass2_Sub3_Sub1_2.method263(local10);
			Static93.anInt1976 = 0;
			Static183.aClass5_6 = Static74.method1401(local14);
			Static153.anInt3291 = local10;
		}
		if (local18 == 41) {
			Static69.aClass2_Sub3_Sub1_2.method284(219);
			Static69.aClass2_Sub3_Sub1_2.method225(local10);
			Static69.aClass2_Sub3_Sub1_2.method253(local29);
			Static69.aClass2_Sub3_Sub1_2.method218(local14);
			Static93.anInt1976 = 0;
			Static183.aClass5_6 = Static74.method1401(local14);
			Static153.anInt3291 = local10;
		}
		if (local18 == 1) {
			local244 = Static22.aClass24_Sub4_Sub1Array1[local29];
			if (local244 != null) {
				Static166.method2576(2, local244.anIntArray319[0], 0, local244.anIntArray316[0], false, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray316[0], 1, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray319[0], 1);
				Static85.anInt1874 = Static59.anInt1446;
				Static37.anInt961 = 2;
				Static33.anInt870 = Static153.anInt3298;
				Static46.anInt1093 = 0;
				Static69.aClass2_Sub3_Sub1_2.method284(240);
				Static69.aClass2_Sub3_Sub1_2.method263(local29);
			}
		}
		if (local18 == 16) {
			Static69.aClass2_Sub3_Sub1_2.method284(152);
			Static69.aClass2_Sub3_Sub1_2.method225(local29);
			Static69.aClass2_Sub3_Sub1_2.method225(local10);
			Static69.aClass2_Sub3_Sub1_2.method246(local14);
			Static93.anInt1976 = 0;
			Static183.aClass5_6 = Static74.method1401(local14);
			Static153.anInt3291 = local10;
		}
		if (local18 == 4) {
			local177 = Static166.method2576(2, local10, 0, local14, false, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray316[0], 0, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray319[0], 0);
			if (!local177) {
				Static166.method2576(2, local10, 0, local14, false, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray316[0], 1, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray319[0], 1);
			}
			Static37.anInt961 = 2;
			Static46.anInt1093 = 0;
			Static85.anInt1874 = Static59.anInt1446;
			Static33.anInt870 = Static153.anInt3298;
			Static69.aClass2_Sub3_Sub1_2.method284(184);
			Static69.aClass2_Sub3_Sub1_2.method239(Static123.anInt2755 + local14);
			Static69.aClass2_Sub3_Sub1_2.method263(local29);
			Static69.aClass2_Sub3_Sub1_2.method263(Static2.anInt57 + local10);
		}
		if (local18 == 5) {
			Static142.method2282(local10, local33, local14);
			Static69.aClass2_Sub3_Sub1_2.method284(196);
			Static69.aClass2_Sub3_Sub1_2.method263(local14 + Static123.anInt2755);
			Static69.aClass2_Sub3_Sub1_2.method253(local10 + Static2.anInt57);
			Static69.aClass2_Sub3_Sub1_2.method263(Integer.MAX_VALUE & (int) (local33 >>> 32));
		}
		if (local18 == 12) {
			local901 = Static47.aClass24_Sub4_Sub2Array1[local29];
			if (local901 != null) {
				Static166.method2576(2, local901.anIntArray319[0], 0, local901.anIntArray316[0], false, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray316[0], 1, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray319[0], 1);
				Static85.anInt1874 = Static59.anInt1446;
				Static33.anInt870 = Static153.anInt3298;
				Static46.anInt1093 = 0;
				Static37.anInt961 = 2;
				Static69.aClass2_Sub3_Sub1_2.method284(108);
				Static69.aClass2_Sub3_Sub1_2.method225(local29);
			}
		}
		if (local18 == 39) {
			Static142.method2282(local10, local33, local14);
			Static69.aClass2_Sub3_Sub1_2.method284(213);
			Static69.aClass2_Sub3_Sub1_2.method239(Static2.anInt57 + local10);
			Static69.aClass2_Sub3_Sub1_2.method263(Integer.MAX_VALUE & (int) (local33 >>> 32));
			Static69.aClass2_Sub3_Sub1_2.method253(local14 + Static123.anInt2755);
		}
		if (Static150.anInt3074 != 0) {
			Static150.anInt3074 = 0;
			Static121.method2085(Static74.method1401(Static63.anInt3436));
		}
		if (Static142.aBoolean141) {
			Static174.method2692();
		}
		if (Static183.aClass5_6 != null && Static93.anInt1976 == 0) {
			Static121.method2085(Static183.aClass5_6);
		}
	}
}
