import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!cq", name = "O", descriptor = "J")
	public static long aLong47 = 0L;

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lclient!ir;B)V")
	public static void method894(@OriginalArg(0) Class100 arg0) {
		Static271.aClass100_106 = arg0;
		Static299.anInt5947 = Static271.aClass100_106.method2309(15);
	}

	@OriginalMember(owner = "client!cq", name = "e", descriptor = "(I)V")
	public static void method895() {
		Static164.method5308(false);
		Static231.anInt4674 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static290.aByteArrayArray19.length; local14++) {
			if (Static314.anIntArray511[local14] != -1 && Static290.aByteArrayArray19[local14] == null) {
				Static290.aByteArrayArray19[local14] = Static50.aClass100_20.method2319(Static314.anIntArray511[local14], 0);
				if (Static290.aByteArrayArray19[local14] == null) {
					local12 = false;
					Static231.anInt4674++;
				}
			}
			if (Static314.anIntArray512[local14] != -1 && Static73.aByteArrayArray7[local14] == null) {
				Static73.aByteArrayArray7[local14] = Static50.aClass100_20.method2310(Static149.anIntArrayArray20[local14], 0, Static314.anIntArray512[local14]);
				if (Static73.aByteArrayArray7[local14] == null) {
					local12 = false;
					Static231.anInt4674++;
				}
			}
			if (Static277.anIntArray439[local14] != -1 && Static112.aByteArrayArray12[local14] == null) {
				Static112.aByteArrayArray12[local14] = Static50.aClass100_20.method2319(Static277.anIntArray439[local14], 0);
				if (Static112.aByteArrayArray12[local14] == null) {
					Static231.anInt4674++;
					local12 = false;
				}
			}
			if (Static269.anIntArray432[local14] != -1 && Static81.aByteArrayArray9[local14] == null) {
				Static81.aByteArrayArray9[local14] = Static50.aClass100_20.method2319(Static269.anIntArray432[local14], 0);
				if (Static81.aByteArrayArray9[local14] == null) {
					local12 = false;
					Static231.anInt4674++;
				}
			}
			if (Static54.anIntArray76 != null && Static76.aByteArrayArray8[local14] == null && Static54.anIntArray76[local14] != -1) {
				Static76.aByteArrayArray8[local14] = Static50.aClass100_20.method2310(Static149.anIntArrayArray20[local14], 0, Static54.anIntArray76[local14]);
				if (Static76.aByteArrayArray8[local14] == null) {
					local12 = false;
					Static231.anInt4674++;
				}
			}
		}
		if (Static247.aClass146_5 == null) {
			if (Static154.aClass3_Sub7_Sub13_6 == null || !Static124.aClass100_58.method2308(Static154.aClass3_Sub7_Sub13_6.aString119 + "_staticelements")) {
				Static247.aClass146_5 = new Class146(0);
			} else if (Static124.aClass100_58.method2317(Static154.aClass3_Sub7_Sub13_6.aString119 + "_staticelements")) {
				Static247.aClass146_5 = Static137.method2083(Static154.aClass3_Sub7_Sub13_6.aString119 + "_staticelements", Static124.aClass100_58, Static126.aBoolean251);
			} else {
				Static231.anInt4674++;
				local12 = false;
			}
		}
		if (!local12) {
			Static78.anInt1558 = 1;
			return;
		}
		Static290.anInt5803 = 0;
		local12 = true;
		@Pc(268) int local268;
		@Pc(279) int local279;
		for (@Pc(249) int local249 = 0; local249 < Static290.aByteArrayArray19.length; local249++) {
			@Pc(255) byte[] local255 = Static73.aByteArrayArray7[local249];
			if (local255 != null) {
				local268 = (Static169.anIntArray239[local249] >> 8) * 64 - Static186.anInt3094;
				local279 = (Static169.anIntArray239[local249] & 0xFF) * 64 - Static296.anInt5889;
				if (Static297.aBoolean407) {
					local268 = 10;
					local279 = 10;
				}
				local12 &= Static174.method2865(local268, local279, local255);
			}
			local255 = Static81.aByteArrayArray9[local249];
			if (local255 != null) {
				local268 = (Static169.anIntArray239[local249] >> 8) * 64 - Static186.anInt3094;
				local279 = (Static169.anIntArray239[local249] & 0xFF) * 64 - Static296.anInt5889;
				if (Static297.aBoolean407) {
					local268 = 10;
					local279 = 10;
				}
				local12 &= Static174.method2865(local268, local279, local255);
			}
		}
		if (!local12) {
			Static78.anInt1558 = 2;
			return;
		}
		if (Static78.anInt1558 != 0) {
			Static300.method5080(Static168.aString130 + "<br>(100%)", true, Static83.aClass120_1);
		}
		Static123.method2158();
		Static333.method5471();
		@Pc(364) boolean local364 = false;
		if (Static212.aClass122_2.method4715() && Static333.aBoolean435) {
			for (local268 = 0; local268 < Static290.aByteArrayArray19.length; local268++) {
				if (Static81.aByteArrayArray9[local268] != null || Static112.aByteArrayArray12[local268] != null) {
					local364 = true;
					break;
				}
			}
		}
		if (Static302.aBoolean410) {
			local268 = Static69.anIntArray85[Static181.anInt1027];
		} else {
			local268 = Static278.anIntArray441[Static181.anInt1027];
		}
		if (Static212.aClass122_2.method4746()) {
			local268++;
		}
		Static270.method4574(Static162.anInt2152, Static122.anInt2632, local268, local364, Static212.aClass122_2.method4800() > 0);
		for (local279 = 0; local279 < 4; local279++) {
			Static34.aClass13Array1[local279].method241();
		}
		Static256.method4300();
		Static107.method1836(false);
		Static1.method6();
		Static123.method2158();
		System.gc();
		Static164.method5308(true);
		Static336.method5506(4);
		@Pc(464) int[][] local464 = null;
		if (!Static297.aBoolean407) {
			Static123.method2160(false);
			Static126.method3739(Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray405[0] >> 3, Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray404[0] >> 3);
			Static56.method928();
			Static85.method1381(4, false, Static212.aClass122_2, null);
			local464 = Static105.anIntArrayArrayArray2[0];
			Static164.method5308(true);
			Static113.method5427(false);
			if (Static76.aByteArrayArray8 != null) {
				Static113.method5425();
			}
		}
		if (Static297.aBoolean407) {
			Static309.method5205(false);
			Static126.method3739(Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray405[0] >> 3, Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray404[0] >> 3);
			Static56.method928();
			Static85.method1381(4, false, Static212.aClass122_2, null);
			local464 = Static105.anIntArrayArrayArray2[0];
			Static164.method5308(true);
			Static54.method911(false);
		}
		Static333.method5471();
		Static164.method5308(true);
		Static161.method2567(null, Static212.aClass122_2, false, 4, Static34.aClass13Array1);
		Static341.method5589(4, Static212.aClass122_2);
		Static164.method5308(true);
		@Pc(563) int local563 = Static137.anInt2556;
		if (Static163.anInt3184 < local563) {
			local563 = Static163.anInt3184;
		}
		if (local563 < Static163.anInt3184 - 1) {
			local563 = Static163.anInt3184 - 1;
		}
		if (Static75.method1142()) {
			Static295.method5006(0);
		} else {
			Static295.method5006(local563);
		}
		Static212.method1614();
		if (local364) {
			Static197.method3454(true);
			Static336.method5506(1);
			if (!Static297.aBoolean407) {
				Static123.method2160(true);
				Static85.method1381(1, true, Static212.aClass122_2, local464);
				Static164.method5308(true);
				Static113.method5427(true);
				Static341.method5589(1, Static212.aClass122_2);
			}
			if (Static297.aBoolean407) {
				Static309.method5205(true);
				Static85.method1381(1, true, Static212.aClass122_2, local464);
				Static164.method5308(true);
				Static54.method911(true);
			}
			Static333.method5471();
			Static164.method5308(true);
			Static161.method2567(Static355.aClass22Array3[0], Static212.aClass122_2, true, 1, Static34.aClass13Array1);
			Static341.method5589(1, Static212.aClass122_2);
			Static164.method5308(true);
			Static212.method1614();
			Static197.method3454(false);
		}
		@Pc(672) int local672;
		@Pc(676) int local676;
		for (@Pc(668) int local668 = 0; local668 < 3; local668++) {
			for (local672 = 0; local672 < Static162.anInt2152; local672++) {
				for (local676 = 0; local676 < Static122.anInt2632; local676++) {
					Static301.method5085(local668, local672, local676);
				}
			}
		}
		Static24.method5096();
		Static123.method2158();
		Static55.method4670();
		Static333.method5471();
		Static343.aBoolean448 = false;
		Static163.method2599();
		if (Static176.aFrame4 != null && Static76.aClass16_2 != null && Static266.anInt5370 == 25) {
			Static291.aClass3_Sub4_Sub2_3.method3682(203);
			Static291.aClass3_Sub4_Sub2_3.method3650(1057001181);
		}
		if (!Static297.aBoolean407) {
			local672 = (Static16.anInt512 - (Static162.anInt2152 >> 4)) / 8;
			local676 = (Static16.anInt512 + (Static162.anInt2152 >> 4)) / 8;
			@Pc(759) int local759 = (Static130.anInt2745 - (Static122.anInt2632 >> 4)) / 8;
			@Pc(767) int local767 = ((Static122.anInt2632 >> 4) + Static130.anInt2745) / 8;
			for (@Pc(771) int local771 = local672 - 1; local771 <= local676 + 1; local771++) {
				for (@Pc(777) int local777 = local759 - 1; local777 <= local767 + 1; local777++) {
					if (local771 < local672 || local676 < local771 || local759 > local777 || local777 > local767) {
						Static50.aClass100_20.method2303("m" + local771 + "_" + local777);
						Static50.aClass100_20.method2303("l" + local771 + "_" + local777);
					}
				}
			}
		}
		if (Static266.anInt5370 == 28) {
			Static353.method5714(10);
		} else {
			Static353.method5714(30);
			if (Static76.aClass16_2 != null) {
				Static291.aClass3_Sub4_Sub2_3.method3682(169);
			}
		}
		Static164.method5312();
		Static123.method2158();
		Static350.method5691();
	}

	@OriginalMember(owner = "client!cq", name = "f", descriptor = "(I)I")
	public static int method896() {
		@Pc(7) Class122 local7 = Static212.aClass122_2;
		@Pc(9) boolean local9 = false;
		if (Static352.anInt6827 != 0) {
			@Pc(18) Canvas local18 = new Canvas();
			local18.setSize(100, 100);
			local9 = true;
			local7 = Static102.method1725(0, null, 0, local18, null);
		}
		@Pc(35) long local35 = Static53.method898();
		for (@Pc(37) int local37 = 0; local37 < 10000; local37++) {
			local7.method4745();
		}
		@Pc(64) int local64 = (int) (Static53.method898() - local35);
		local7.method4801(100, 0, 0, 100, -16777216);
		if (local9) {
			local7.method4780();
		}
		return local64;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(III[Ljava/lang/Object;[J)V")
	public static void method897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Object[] arg2, @OriginalArg(4) long[] arg3) {
		if (arg0 <= arg1) {
			return;
		}
		@Pc(18) int local18 = (arg0 + arg1) / 2;
		@Pc(20) int local20 = arg1;
		@Pc(24) long local24 = arg3[local18];
		arg3[local18] = arg3[arg0];
		arg3[arg0] = local24;
		@Pc(38) Object local38 = arg2[local18];
		arg2[local18] = arg2[arg0];
		arg2[arg0] = local38;
		for (@Pc(50) int local50 = arg1; local50 < arg0; local50++) {
			if ((long) (local50 & 0x1) + local24 > arg3[local50]) {
				@Pc(67) long local67 = arg3[local50];
				arg3[local50] = arg3[local20];
				arg3[local20] = local67;
				@Pc(81) Object local81 = arg2[local50];
				arg2[local50] = arg2[local20];
				arg2[local20++] = local81;
			}
		}
		arg3[arg0] = arg3[local20];
		arg3[local20] = local24;
		arg2[arg0] = arg2[local20];
		arg2[local20] = local38;
		method897(local20 - 1, arg1, arg2, arg3);
		method897(arg0, local20 + 1, arg2, arg3);
	}
}
