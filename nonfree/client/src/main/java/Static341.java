import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "Lclient!kba;")
	public static final Class163 aClass163_38 = new Class163();

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "I")
	public static int anInt6795 = 0;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
	public static void method5673() {
		Static453.method6873(false);
		Static276.anInt9806 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static75.aByteArrayArray1.length; local14++) {
			if (Static502.anIntArray342[local14] != -1 && Static75.aByteArrayArray1[local14] == null) {
				Static75.aByteArrayArray1[local14] = Static415.aClass223_90.method5954(0, Static502.anIntArray342[local14]);
				if (Static75.aByteArrayArray1[local14] == null) {
					Static276.anInt9806++;
					local12 = false;
				}
			}
			if (Static440.anIntArray418[local14] != -1 && Static448.aByteArrayArray24[local14] == null) {
				Static448.aByteArrayArray24[local14] = Static415.aClass223_90.method5945(Static307.anIntArrayArray24[local14], 0, Static440.anIntArray418[local14]);
				if (Static448.aByteArrayArray24[local14] == null) {
					local12 = false;
					Static276.anInt9806++;
				}
			}
			if (Static525.anIntArray474[local14] != -1 && Static199.aByteArrayArray8[local14] == null) {
				Static199.aByteArrayArray8[local14] = Static415.aClass223_90.method5954(0, Static525.anIntArray474[local14]);
				if (Static199.aByteArrayArray8[local14] == null) {
					Static276.anInt9806++;
					local12 = false;
				}
			}
			if (Static642.anIntArray572[local14] != -1 && Static642.aByteArrayArray37[local14] == null) {
				Static642.aByteArrayArray37[local14] = Static415.aClass223_90.method5954(0, Static642.anIntArray572[local14]);
				if (Static642.aByteArrayArray37[local14] == null) {
					Static276.anInt9806++;
					local12 = false;
				}
			}
			if (Static296.anIntArray272 != null && Static191.aByteArrayArray7[local14] == null && Static296.anIntArray272[local14] != -1) {
				Static191.aByteArrayArray7[local14] = Static415.aClass223_90.method5945(Static307.anIntArrayArray24[local14], 0, Static296.anIntArray272[local14]);
				if (Static191.aByteArrayArray7[local14] == null) {
					Static276.anInt9806++;
					local12 = false;
				}
			}
		}
		if (Static511.aClass374_3 == null) {
			if (Static457.aClass6_Sub5_Sub13_3 == null || !Static453.aClass223_102.method5937(Static457.aClass6_Sub5_Sub13_3.aString41 + "_staticelements")) {
				Static511.aClass374_3 = new Class374(0);
			} else if (Static453.aClass223_102.method5950(Static457.aClass6_Sub5_Sub13_3.aString41 + "_staticelements")) {
				Static511.aClass374_3 = Static105.method2437(Static149.aBoolean276, Static453.aClass223_102, Static457.aClass6_Sub5_Sub13_3.aString41 + "_staticelements");
			} else {
				Static276.anInt9806++;
				local12 = false;
			}
		}
		if (!local12) {
			Static249.anInt5410 = 1;
			return;
		}
		local12 = true;
		Static254.anInt5479 = 0;
		@Pc(271) int local271;
		@Pc(281) int local281;
		for (@Pc(252) int local252 = 0; local252 < Static75.aByteArrayArray1.length; local252++) {
			@Pc(258) byte[] local258 = Static448.aByteArrayArray24[local252];
			if (local258 != null) {
				local271 = (Static228.anIntArray215[local252] >> 8) * 64 - Static477.anInt8412;
				local281 = (Static228.anIntArray215[local252] & 0xFF) * 64 - Static227.anInt5049;
				if (Static643.anInt10750 != 0) {
					local281 = 10;
					local271 = 10;
				}
				local12 &= Static235.method1731(local281, local258, local271, Static306.anInt6176, Static108.anInt2930);
			}
			local258 = Static642.aByteArrayArray37[local252];
			if (local258 != null) {
				local271 = (Static228.anIntArray215[local252] >> 8) * 64 - Static477.anInt8412;
				local281 = (Static228.anIntArray215[local252] & 0xFF) * 64 - Static227.anInt5049;
				if (Static643.anInt10750 != 0) {
					local271 = 10;
					local281 = 10;
				}
				local12 &= Static235.method1731(local281, local258, local271, Static306.anInt6176, Static108.anInt2930);
			}
		}
		if (!local12) {
			Static249.anInt5410 = 2;
			return;
		}
		if (Static249.anInt5410 != 0) {
			Static52.method1637(Static184.aClass213_5, Static359.aClass34_7, true, Static467.aClass5_13, Static536.aClass316_14.method7577(Static638.anInt10709) + "<br>(100%)");
		}
		Static245.method4396();
		Static234.method4283();
		Static523.method7457();
		@Pc(381) boolean local381 = false;
		if (Static467.aClass5_13.method6110() && Static87.aClass6_Sub33_6.aClass14_Sub28_1.method8390() == 2) {
			for (local271 = 0; local271 < Static75.aByteArrayArray1.length; local271++) {
				if (Static642.aByteArrayArray37[local271] != null || Static199.aByteArrayArray8[local271] != null) {
					local381 = true;
					break;
				}
			}
		}
		if (Static87.aClass6_Sub33_6.aClass14_Sub14_1.method4939() == 1) {
			local271 = Static464.anIntArray429[Static269.anInt10099];
		} else {
			local271 = Static526.anIntArray476[Static269.anInt10099];
		}
		if (Static467.aClass5_13.method6151()) {
			local271++;
		}
		Static217.method3839(Static467.aClass5_13, Static114.anInt2975, Static306.anInt6176, Static108.anInt2930, local271, local381, Static467.aClass5_13.method6185() > 0);
		Static154.method3058(Static209.anInt4538);
		if (Static209.anInt4538 == 0) {
			Static375.method5955((Class34) null);
		} else {
			Static375.method5955(Static588.aClass34_14);
		}
		for (local281 = 0; local281 < 4; local281++) {
			Static313.aClass258Array1[local281].method6645();
		}
		Static422.method6594();
		Static536.method7576(false);
		Static628.method8568();
		Static412.aBoolean597 = false;
		Static406.aClass350_1 = null;
		Static245.method4396();
		System.gc();
		Static453.method6873(true);
		Static208.method3748();
		Static119.anInt3026 = Static87.aClass6_Sub33_6.aClass14_Sub7_1.method2504();
		Static370.aBoolean560 = Static510.anInt8806 >= 96;
		Static145.aBoolean266 = Static87.aClass6_Sub33_6.aClass14_Sub28_1.method8390() == 2;
		Static173.aBoolean311 = Static87.aClass6_Sub33_6.aClass14_Sub10_1.method3033() == 1;
		Static208.anInt4501 = Static87.aClass6_Sub33_6.aClass14_Sub3_2.method819() == 1 ? -1 : Static213.anInt4581;
		Static551.aBoolean747 = Static87.aClass6_Sub33_6.aClass14_Sub25_1.method8150() == 1;
		Static628.aBoolean832 = Static87.aClass6_Sub33_6.aClass14_Sub20_1.method7110() == 1;
		Static479.aClass210_Sub1_2 = new Class210_Sub1(4, Static306.anInt6176, Static108.anInt2930, false);
		if (Static643.anInt10750 == 0) {
			Static83.method6978(Static479.aClass210_Sub1_2, Static75.aByteArrayArray1);
		} else {
			Static166.method8083(Static75.aByteArrayArray1, Static479.aClass210_Sub1_2);
		}
		Static199.method3644(Static306.anInt6176 >> 4, Static108.anInt2930 >> 4);
		Static564.method7935();
		if (local381) {
			Static437.method6710(true);
			Static22.aClass210_Sub1_1 = new Class210_Sub1(1, Static306.anInt6176, Static108.anInt2930, true);
			if (Static643.anInt10750 == 0) {
				Static83.method6978(Static22.aClass210_Sub1_1, Static199.aByteArrayArray8);
				Static453.method6873(true);
			} else {
				Static166.method8083(Static199.aByteArrayArray8, Static22.aClass210_Sub1_1);
				Static453.method6873(true);
			}
			Static22.aClass210_Sub1_1.method5801(Static479.aClass210_Sub1_2.anIntArrayArrayArray6[0]);
			Static22.aClass210_Sub1_1.method5803((Class258[]) null, Static467.aClass5_13, (int[][][]) null);
			Static437.method6710(false);
		}
		Static479.aClass210_Sub1_2.method5803(Static313.aClass258Array1, Static467.aClass5_13, local381 ? Static22.aClass210_Sub1_1.anIntArrayArrayArray6 : null);
		if (Static643.anInt10750 == 0) {
			Static453.method6873(true);
			Static165.method3166(Static448.aByteArrayArray24, Static479.aClass210_Sub1_2);
			if (Static191.aByteArrayArray7 != null) {
				Static232.method4371();
			}
		} else {
			Static453.method6873(true);
			Static280.method2625(Static448.aByteArrayArray24, Static479.aClass210_Sub1_2);
		}
		Static234.method4283();
		if (Static510.anInt8806 < 96) {
			Static374.method7977();
		}
		Static453.method6873(true);
		Static479.aClass210_Sub1_2.method5792((Class245) null, local381 ? Static152.aClass245Array3[0] : null, Static467.aClass5_13);
		Static479.aClass210_Sub1_2.method5813(false, Static467.aClass5_13);
		Static453.method6873(true);
		if (local381) {
			Static437.method6710(true);
			Static453.method6873(true);
			if (Static643.anInt10750 == 0) {
				Static165.method3166(Static642.aByteArrayArray37, Static22.aClass210_Sub1_1);
			} else {
				Static280.method2625(Static642.aByteArrayArray37, Static22.aClass210_Sub1_1);
			}
			Static234.method4283();
			Static453.method6873(true);
			Static22.aClass210_Sub1_1.method5792(Static150.aClass245Array2[0], (Class245) null, Static467.aClass5_13);
			Static22.aClass210_Sub1_1.method5813(true, Static467.aClass5_13);
			Static453.method6873(true);
			Static437.method6710(false);
		}
		Static135.method2724();
		@Pc(754) int local754 = Static479.aClass210_Sub1_2.anInt6948;
		if (local754 > Static86.anInt10575) {
			local754 = Static86.anInt10575;
		}
		if (Static86.anInt10575 - 1 > local754) {
			local754 = Static86.anInt10575 - 1;
		}
		if (Static87.aClass6_Sub33_6.aClass14_Sub3_2.method819() == 0) {
			Static95.method2331(local754);
		} else {
			Static95.method2331(0);
		}
		@Pc(785) int local785;
		@Pc(789) int local789;
		for (@Pc(781) int local781 = 0; local781 < 4; local781++) {
			for (local785 = 0; local785 < Static306.anInt6176; local785++) {
				for (local789 = 0; local789 < Static108.anInt2930; local789++) {
					Static367.method7655(local785, local781, local789);
				}
			}
		}
		Static260.method4613();
		Static245.method4396();
		Static394.method6234();
		Static234.method4283();
		Static171.method3232();
		@Pc(836) Class6_Sub17 local836;
		if (Static500.aFrame9 != null && Static226.aClass41_1 != null && Static333.anInt6626 == 11) {
			local836 = Static330.method7824(Static366.aClass185_75, Static569.aClass134_2);
			local836.aClass6_Sub8_Sub1_2.method8202(1057001181);
			Static452.method6867(local836);
		}
		if (Static643.anInt10750 == 0) {
			local785 = (Static300.anInt6134 - (Static306.anInt6176 >> 4)) / 8;
			local789 = ((Static306.anInt6176 >> 4) + Static300.anInt6134) / 8;
			@Pc(880) int local880 = (Static484.anInt8559 - (Static108.anInt2930 >> 4)) / 8;
			@Pc(889) int local889 = (Static484.anInt8559 + (Static108.anInt2930 >> 4)) / 8;
			for (@Pc(893) int local893 = local785 - 1; local893 <= local789 + 1; local893++) {
				for (@Pc(899) int local899 = local880 - 1; local899 <= local889 + 1; local899++) {
					if (local785 > local893 || local789 < local893 || local899 < local880 || local899 > local889) {
						Static415.aClass223_90.method5964("m" + local893 + "_" + local899);
						Static415.aClass223_90.method5964("l" + local893 + "_" + local899);
					}
				}
			}
		}
		if (Static333.anInt6626 == 4) {
			Static119.method2558(3);
		} else if (Static333.anInt6626 == 8) {
			Static119.method2558(7);
		} else {
			Static119.method2558(10);
			if (Static226.aClass41_1 != null) {
				local836 = Static330.method7824(Static510.aClass185_99, Static569.aClass134_2);
				Static452.method6867(local836);
			}
		}
		Static576.method8012();
		Static245.method4396();
		Static67.method2006();
		Static610.aBoolean810 = true;
		if (Static474.aBoolean672) {
			Static552.method7749("Took: " + (Static582.method8056() - Static235.aLong40) + "ms");
			Static474.aBoolean672 = false;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILclient!gv;[II)V")
	public static void method5674(@OriginalArg(0) int arg0, @OriginalArg(1) Class9_Sub4_Sub2_Sub1_Sub2 arg1, @OriginalArg(2) int[] arg2) {
		@Pc(10) boolean local10;
		@Pc(12) int local12;
		if (arg1.anIntArray189 != null) {
			local10 = true;
			for (local12 = 0; local12 < arg1.anIntArray189.length; local12++) {
				if (arg1.anIntArray189[local12] != arg2[local12]) {
					local10 = false;
					break;
				}
			}
			if (local10 && arg1.anInt4341 != -1) {
				@Pc(53) Class113 local53 = Static528.aClass198_2.method5706(arg1.anInt4341);
				@Pc(56) int local56 = local53.anInt3849;
				if (local56 == 1) {
					arg1.anInt4290 = 1;
					arg1.anInt4326 = arg0;
					arg1.lb = 0;
					arg1.anInt4332 = 0;
					arg1.anInt4319 = 0;
					if (!arg1.aBoolean350) {
						Static598.method8288(arg1, arg1.anInt4319, local53);
					}
				}
				if (local56 == 2) {
					arg1.anInt4332 = 0;
				}
			}
		}
		local10 = true;
		for (local12 = 0; local12 < arg2.length; local12++) {
			if (arg2[local12] != -1) {
				local10 = false;
			}
			if (arg1.anIntArray189 == null || arg1.anIntArray189[local12] == -1 || Static528.aClass198_2.method5706(arg2[local12]).anInt3857 >= Static528.aClass198_2.method5706(arg1.anIntArray189[local12]).anInt3857) {
				arg1.anInt4326 = arg0;
				arg1.anIntArray189 = arg2;
				break;
			}
		}
		if (local10) {
			arg1.anIntArray189 = arg2;
			arg1.anInt4326 = arg0;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZZI)V")
	public static void method5676(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class6_Sub6 local8 = Static612.method8391(arg1, arg0);
		if (local8 != null) {
			local8.method8792();
		}
	}
}
