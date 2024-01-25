import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!gca", name = "g", descriptor = "I")
	public static int anInt2854;

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString27 = "";

	@OriginalMember(owner = "client!gca", name = "c", descriptor = "I")
	public static final int anInt2851 = 1338;

	@OriginalMember(owner = "client!gca", name = "f", descriptor = "Lclient!rw;")
	public static final Class297 aClass297_7 = new Class297(7, 2);

	@OriginalMember(owner = "client!gca", name = "p", descriptor = "I")
	public static int anInt2860 = 0;

	@OriginalMember(owner = "client!gca", name = "q", descriptor = "Lclient!rw;")
	public static final Class297 aClass297_8 = new Class297(2, 2);

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(FFBF)I")
	public static int method2277(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		@Pc(12) float local12 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(21) float local21 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(35) float local35 = arg0 < 0.0F ? -arg0 : arg0;
		if (local12 < local21 && local21 > local35) {
			return arg1 > 0.0F ? 0 : 1;
		} else if (local35 > local12 && local35 > local21) {
			return arg0 > 0.0F ? 2 : 3;
		} else if (arg2 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(ZI)Z")
	public static boolean method2278(@OriginalArg(0) boolean arg0) {
		@Pc(15) boolean local15 = Static16.aClass134_1.method6917();
		if (arg0 == local15) {
			return true;
		}
		if (!arg0) {
			Static16.aClass134_1.method6934();
		} else if (!Static16.aClass134_1.method6906()) {
			arg0 = false;
		}
		if (local15 == arg0) {
			return false;
		} else {
			Static348.aClass1_Sub30_Sub1_1.aBoolean390 = arg0;
			Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
			return true;
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lclient!wt;IIZ)V")
	public static void method2280(@OriginalArg(0) Class1_Sub51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null || arg0 == Static310.aClass353_32.aClass1_271) {
			return;
		}
		@Pc(15) int local15 = arg0.anInt9641;
		@Pc(18) int local18 = arg0.anInt9640;
		@Pc(21) int local21 = arg0.anInt9638;
		@Pc(25) int local25 = (int) arg0.aLong302;
		@Pc(28) long local28 = arg0.aLong302;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(41) Class8_Sub3_Sub3_Sub1_Sub1 local41;
		@Pc(60) Class1_Sub11 local60;
		if (local21 == 51) {
			local41 = Static576.aClass8_Sub3_Sub3_Sub1_Sub1Array1[local25];
			if (local41 != null) {
				Static12.anInt5207 = arg1;
				Static505.anInt8616 = 2;
				Static497.anInt6024 = arg2;
				Static576.anInt9487 = 0;
				local60 = Static276.method3885(Static184.aClass70_28, Static481.aClass276_2);
				local60.aClass1_Sub35_Sub2_1.method5777(Static137.aClass295_1.method7719(82) ? 1 : 0);
				local60.aClass1_Sub35_Sub2_1.method5789(local25);
				Static48.method743(local60);
				Static136.method2083(local41.anIntArray533[0], local41.method5434(), -2, local41.anIntArray534[0], true, local41.method5434(), 0, 0);
			}
		}
		@Pc(132) Class1_Sub11 local132;
		if (local21 == 1006) {
			Static497.anInt6024 = arg2;
			Static505.anInt8616 = 2;
			Static576.anInt9487 = 0;
			Static12.anInt5207 = arg1;
			local132 = Static276.method3885(Static580.aClass70_103, Static481.aClass276_2);
			local132.aClass1_Sub35_Sub2_1.method5776(local25);
			Static48.method743(local132);
		}
		if (local21 == 48) {
			if (Static267.anInt4711 > 0 && Static137.aClass295_1.method7719(82) && Static137.aClass295_1.method7719(81)) {
				Static17.method165(Static541.anInt9058 + local15, Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aByte123, local18 + Static116.anInt2289);
			} else {
				local132 = Static572.method7712(local18, local15, local25);
				if (local25 == 1) {
					local132.aClass1_Sub35_Sub2_1.method5777(-1);
					local132.aClass1_Sub35_Sub2_1.method5777(-1);
					local132.aClass1_Sub35_Sub2_1.method5776((int) Static167.aFloat59);
					local132.aClass1_Sub35_Sub2_1.method5777(57);
					local132.aClass1_Sub35_Sub2_1.method5777(Static548.anInt8574);
					local132.aClass1_Sub35_Sub2_1.method5777(Static348.anInt5786);
					local132.aClass1_Sub35_Sub2_1.method5777(89);
					local132.aClass1_Sub35_Sub2_1.method5776(Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt9365);
					local132.aClass1_Sub35_Sub2_1.method5776(Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt9370);
					local132.aClass1_Sub35_Sub2_1.method5777(63);
				} else {
					Static497.anInt6024 = arg2;
					Static505.anInt8616 = 1;
					Static576.anInt9487 = 0;
					Static12.anInt5207 = arg1;
				}
				Static48.method743(local132);
				Static136.method2083(local18, 1, -4, local15, true, 1, 0, 0);
			}
		}
		if (local21 == 44) {
			local41 = Static576.aClass8_Sub3_Sub3_Sub1_Sub1Array1[local25];
			if (local41 != null) {
				Static12.anInt5207 = arg1;
				Static497.anInt6024 = arg2;
				Static505.anInt8616 = 2;
				Static576.anInt9487 = 0;
				local60 = Static276.method3885(Static293.aClass70_54, Static481.aClass276_2);
				local60.aClass1_Sub35_Sub2_1.method5740(local25);
				local60.aClass1_Sub35_Sub2_1.method5777(Static137.aClass295_1.method7719(82) ? 1 : 0);
				Static48.method743(local60);
				Static136.method2083(local41.anIntArray533[0], local41.method5434(), -2, local41.anIntArray534[0], true, local41.method5434(), 0, 0);
			}
		}
		@Pc(337) Class341 local337;
		if (local21 == 23) {
			local337 = Static49.method751(local18, local15);
			if (local337 != null) {
				Static50.method827();
				@Pc(344) Class1_Sub49 local344 = Static63.method1137(local337);
				Static425.method5883(local344.anInt9538, local344.method7774(), local337);
				Static302.aString46 = Static490.method6642(local337);
				if (Static302.aString46 == null) {
					Static302.aString46 = "Null";
				}
				Static593.aString101 = local337.aString94 + "<col=ffffff>";
			}
			return;
		}
		if (local21 == 3) {
			Static497.anInt6024 = arg2;
			Static576.anInt9487 = 0;
			Static12.anInt5207 = arg1;
			Static505.anInt8616 = 2;
			local132 = Static276.method3885(Static243.aClass70_48, Static481.aClass276_2);
			local132.aClass1_Sub35_Sub2_1.method5756(Static137.aClass295_1.method7719(82) ? 1 : 0);
			local132.aClass1_Sub35_Sub2_1.method5784(Static48.anInt840);
			local132.aClass1_Sub35_Sub2_1.method5764(Static78.anInt1494);
			local132.aClass1_Sub35_Sub2_1.method5740(Static84.anInt8888);
			local132.aClass1_Sub35_Sub2_1.method5740(Static541.anInt9058 + local15);
			local132.aClass1_Sub35_Sub2_1.method5740(Static116.anInt2289 + local18);
			local132.aClass1_Sub35_Sub2_1.method5789(local25);
			Static48.method743(local132);
			Static251.method7506(local15, local18);
		}
		if (local21 == 5) {
			local41 = Static576.aClass8_Sub3_Sub3_Sub1_Sub1Array1[local25];
			if (local41 != null) {
				Static576.anInt9487 = 0;
				Static497.anInt6024 = arg2;
				Static12.anInt5207 = arg1;
				Static505.anInt8616 = 2;
				local60 = Static276.method3885(Static521.aClass70_93, Static481.aClass276_2);
				local60.aClass1_Sub35_Sub2_1.method5794(Static137.aClass295_1.method7719(82) ? 1 : 0);
				local60.aClass1_Sub35_Sub2_1.method5789(local25);
				Static48.method743(local60);
				Static136.method2083(local41.anIntArray533[0], local41.method5434(), -2, local41.anIntArray534[0], true, local41.method5434(), 0, 0);
			}
		}
		if (local21 == 18) {
			Static12.anInt5207 = arg1;
			Static576.anInt9487 = 0;
			Static505.anInt8616 = 2;
			Static497.anInt6024 = arg2;
			local132 = Static276.method3885(Static377.aClass70_67, Static481.aClass276_2);
			local132.aClass1_Sub35_Sub2_1.method5740(Static116.anInt2289 + local18);
			local132.aClass1_Sub35_Sub2_1.method5740(Static541.anInt9058 + local15);
			local132.aClass1_Sub35_Sub2_1.method5776(local25);
			local132.aClass1_Sub35_Sub2_1.method5795(Static137.aClass295_1.method7719(82) ? 1 : 0);
			Static48.method743(local132);
			Static251.method7506(local15, local18);
		}
		@Pc(615) Class1_Sub11 local615;
		@Pc(598) Class8_Sub3_Sub3_Sub1_Sub2 local598;
		@Pc(593) Class1_Sub42 local593;
		if (local21 == 13) {
			local593 = (Class1_Sub42) Static84.aClass187_40.method3797((long) local25);
			if (local593 != null) {
				local598 = local593.aClass8_Sub3_Sub3_Sub1_Sub2_2;
				Static505.anInt8616 = 2;
				Static576.anInt9487 = 0;
				Static12.anInt5207 = arg1;
				Static497.anInt6024 = arg2;
				local615 = Static276.method3885(Static40.aClass70_9, Static481.aClass276_2);
				local615.aClass1_Sub35_Sub2_1.method5740(local25);
				local615.aClass1_Sub35_Sub2_1.method5794(Static137.aClass295_1.method7719(82) ? 1 : 0);
				Static48.method743(local615);
				Static136.method2083(local598.anIntArray533[0], local598.method5434(), -2, local598.anIntArray534[0], true, local598.method5434(), 0, 0);
			}
		}
		if (local21 == 1001) {
			Static505.anInt8616 = 2;
			Static576.anInt9487 = 0;
			Static497.anInt6024 = arg2;
			Static12.anInt5207 = arg1;
			local132 = Static276.method3885(Static350.aClass70_62, Static481.aClass276_2);
			local132.aClass1_Sub35_Sub2_1.method5776(local25);
			Static48.method743(local132);
		}
		if (local21 == 6) {
			Static12.anInt5207 = arg1;
			Static505.anInt8616 = 2;
			Static576.anInt9487 = 0;
			Static497.anInt6024 = arg2;
			local132 = Static276.method3885(Static380.aClass70_69, Static481.aClass276_2);
			local132.aClass1_Sub35_Sub2_1.method5789(Static116.anInt2289 + local18);
			local132.aClass1_Sub35_Sub2_1.method5740(Static84.anInt8888);
			local132.aClass1_Sub35_Sub2_1.method5792(Static48.anInt840);
			local132.aClass1_Sub35_Sub2_1.method5794(Static137.aClass295_1.method7719(82) ? 1 : 0);
			local132.aClass1_Sub35_Sub2_1.method5789(Integer.MAX_VALUE & (int) (local28 >>> 32));
			local132.aClass1_Sub35_Sub2_1.method5789(Static78.anInt1494);
			local132.aClass1_Sub35_Sub2_1.method5776(local15 + Static541.anInt9058);
			Static48.method743(local132);
			Static49.method748(local18, local15, local28);
		}
		if (local21 == 47) {
			local41 = Static576.aClass8_Sub3_Sub3_Sub1_Sub1Array1[local25];
			if (local41 != null) {
				Static497.anInt6024 = arg2;
				Static12.anInt5207 = arg1;
				Static505.anInt8616 = 2;
				Static576.anInt9487 = 0;
				local60 = Static276.method3885(Static474.aClass70_97, Static481.aClass276_2);
				local60.aClass1_Sub35_Sub2_1.method5777(Static137.aClass295_1.method7719(82) ? 1 : 0);
				local60.aClass1_Sub35_Sub2_1.method5789(local25);
				Static48.method743(local60);
				Static136.method2083(local41.anIntArray533[0], local41.method5434(), -2, local41.anIntArray534[0], true, local41.method5434(), 0, 0);
			}
		}
		if (local21 == 46) {
			Static497.anInt6024 = arg2;
			Static505.anInt8616 = 2;
			Static12.anInt5207 = arg1;
			Static576.anInt9487 = 0;
			local132 = Static276.method3885(Static438.aClass70_77, Static481.aClass276_2);
			local132.aClass1_Sub35_Sub2_1.method5776((int) (local28 >>> 32) & Integer.MAX_VALUE);
			local132.aClass1_Sub35_Sub2_1.method5776(local15 + Static541.anInt9058);
			local132.aClass1_Sub35_Sub2_1.method5776(Static116.anInt2289 + local18);
			local132.aClass1_Sub35_Sub2_1.method5756(Static137.aClass295_1.method7719(82) ? 1 : 0);
			Static48.method743(local132);
			Static49.method748(local18, local15, local28);
		}
		if (local21 == 57) {
			local41 = Static576.aClass8_Sub3_Sub3_Sub1_Sub1Array1[local25];
			if (local41 != null) {
				Static576.anInt9487 = 0;
				Static505.anInt8616 = 2;
				Static12.anInt5207 = arg1;
				Static497.anInt6024 = arg2;
				local60 = Static276.method3885(Static137.aClass70_24, Static481.aClass276_2);
				local60.aClass1_Sub35_Sub2_1.method5764(local25);
				local60.aClass1_Sub35_Sub2_1.method5795(Static137.aClass295_1.method7719(82) ? 1 : 0);
				Static48.method743(local60);
				Static136.method2083(local41.anIntArray533[0], local41.method5434(), -2, local41.anIntArray534[0], true, local41.method5434(), 0, 0);
			}
		}
		if (local21 == 21) {
			local337 = Static49.method751(local18, local15);
			if (local337 != null) {
				Static16.method156(local337);
			}
		}
		if (local21 == 4) {
			Static12.anInt5207 = arg1;
			Static497.anInt6024 = arg2;
			Static576.anInt9487 = 0;
			Static505.anInt8616 = 2;
			local132 = Static276.method3885(Static342.aClass70_60, Static481.aClass276_2);
			local132.aClass1_Sub35_Sub2_1.method5789((int) (local28 >>> 32) & Integer.MAX_VALUE);
			local132.aClass1_Sub35_Sub2_1.method5764(local15 + Static541.anInt9058);
			local132.aClass1_Sub35_Sub2_1.method5777(Static137.aClass295_1.method7719(82) ? 1 : 0);
			local132.aClass1_Sub35_Sub2_1.method5764(Static116.anInt2289 + local18);
			Static48.method743(local132);
			Static49.method748(local18, local15, local28);
		}
		if (local21 == 2) {
			if (Static267.anInt4711 > 0 && Static137.aClass295_1.method7719(82) && Static137.aClass295_1.method7719(81)) {
				Static17.method165(local15 + Static541.anInt9058, Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aByte123, Static116.anInt2289 + local18);
			} else {
				Static576.anInt9487 = 0;
				Static497.anInt6024 = arg2;
				Static505.anInt8616 = 1;
				Static12.anInt5207 = arg1;
				local132 = Static276.method3885(Static98.aClass70_65, Static481.aClass276_2);
				local132.aClass1_Sub35_Sub2_1.method5740(Static541.anInt9058 + local15);
				local132.aClass1_Sub35_Sub2_1.method5776(local18 + Static116.anInt2289);
				Static48.method743(local132);
			}
		}
		if (local21 == 20) {
			Static12.anInt5207 = arg1;
			Static505.anInt8616 = 2;
			Static576.anInt9487 = 0;
			Static497.anInt6024 = arg2;
			local132 = Static276.method3885(Static62.aClass70_14, Static481.aClass276_2);
			local132.aClass1_Sub35_Sub2_1.method5789(local25);
			local132.aClass1_Sub35_Sub2_1.method5777(Static137.aClass295_1.method7719(82) ? 1 : 0);
			local132.aClass1_Sub35_Sub2_1.method5776(local15 + Static541.anInt9058);
			local132.aClass1_Sub35_Sub2_1.method5764(local18 + Static116.anInt2289);
			Static48.method743(local132);
			Static251.method7506(local15, local18);
		}
		if (local21 == 15) {
			local593 = (Class1_Sub42) Static84.aClass187_40.method3797((long) local25);
			if (local593 != null) {
				Static505.anInt8616 = 2;
				Static576.anInt9487 = 0;
				local598 = local593.aClass8_Sub3_Sub3_Sub1_Sub2_2;
				Static497.anInt6024 = arg2;
				Static12.anInt5207 = arg1;
				local615 = Static276.method3885(Static362.aClass70_39, Static481.aClass276_2);
				local615.aClass1_Sub35_Sub2_1.method5777(Static137.aClass295_1.method7719(82) ? 1 : 0);
				local615.aClass1_Sub35_Sub2_1.method5789(local25);
				Static48.method743(local615);
				Static136.method2083(local598.anIntArray533[0], local598.method5434(), -2, local598.anIntArray534[0], true, local598.method5434(), 0, 0);
			}
		}
		if (local21 == 58) {
			local41 = Static576.aClass8_Sub3_Sub3_Sub1_Sub1Array1[local25];
			if (local41 != null) {
				Static12.anInt5207 = arg1;
				Static505.anInt8616 = 2;
				Static497.anInt6024 = arg2;
				Static576.anInt9487 = 0;
				local60 = Static276.method3885(Static434.aClass70_76, Static481.aClass276_2);
				local60.aClass1_Sub35_Sub2_1.method5756(Static137.aClass295_1.method7719(82) ? 1 : 0);
				local60.aClass1_Sub35_Sub2_1.method5789(local25);
				Static48.method743(local60);
				Static136.method2083(local41.anIntArray533[0], local41.method5434(), -2, local41.anIntArray534[0], true, local41.method5434(), 0, 0);
			}
		}
		if (local21 == 9 || local21 == 1010) {
			Static361.method4892(local25, local18, local15, arg0.aString99);
		}
		if (local21 == 45) {
			local593 = (Class1_Sub42) Static84.aClass187_40.method3797((long) local25);
			if (local593 != null) {
				Static12.anInt5207 = arg1;
				local598 = local593.aClass8_Sub3_Sub3_Sub1_Sub2_2;
				Static576.anInt9487 = 0;
				Static497.anInt6024 = arg2;
				Static505.anInt8616 = 2;
				local615 = Static276.method3885(Static248.aClass70_50, Static481.aClass276_2);
				local615.aClass1_Sub35_Sub2_1.method5740(local25);
				local615.aClass1_Sub35_Sub2_1.method5777(Static137.aClass295_1.method7719(82) ? 1 : 0);
				Static48.method743(local615);
				Static136.method2083(local598.anIntArray533[0], local598.method5434(), -2, local598.anIntArray534[0], true, local598.method5434(), 0, 0);
			}
		}
		if (local21 == 1009) {
			Static576.anInt9487 = 0;
			Static505.anInt8616 = 2;
			Static12.anInt5207 = arg1;
			Static497.anInt6024 = arg2;
			local132 = Static276.method3885(Static487.aClass70_87, Static481.aClass276_2);
			local132.aClass1_Sub35_Sub2_1.method5756(Static137.aClass295_1.method7719(82) ? 1 : 0);
			local132.aClass1_Sub35_Sub2_1.method5789(local18 + Static116.anInt2289);
			local132.aClass1_Sub35_Sub2_1.method5776(Integer.MAX_VALUE & (int) (local28 >>> 32));
			local132.aClass1_Sub35_Sub2_1.method5764(Static541.anInt9058 + local15);
			Static48.method743(local132);
			Static49.method748(local18, local15, local28);
		}
		if (local21 == 1007) {
			Static12.anInt5207 = arg1;
			Static576.anInt9487 = 0;
			Static497.anInt6024 = arg2;
			Static505.anInt8616 = 2;
			local593 = (Class1_Sub42) Static84.aClass187_40.method3797((long) local25);
			if (local593 != null) {
				local598 = local593.aClass8_Sub3_Sub3_Sub1_Sub2_2;
				@Pc(1507) Class20 local1507 = local598.aClass20_1;
				if (local1507.anIntArray40 != null) {
					local1507 = local1507.method284(Static430.aClass321_1);
				}
				if (local1507 != null) {
					@Pc(1526) Class1_Sub11 local1526 = Static276.method3885(Static188.aClass70_31, Static481.aClass276_2);
					local1526.aClass1_Sub35_Sub2_1.method5776(local1507.anInt332);
					Static48.method743(local1526);
				}
			}
		}
		if (local21 == 60) {
			local41 = Static576.aClass8_Sub3_Sub3_Sub1_Sub1Array1[local25];
			if (local41 != null) {
				Static497.anInt6024 = arg2;
				Static505.anInt8616 = 2;
				Static576.anInt9487 = 0;
				Static12.anInt5207 = arg1;
				local60 = Static276.method3885(Static326.aClass70_57, Static481.aClass276_2);
				local60.aClass1_Sub35_Sub2_1.method5756(Static137.aClass295_1.method7719(82) ? 1 : 0);
				local60.aClass1_Sub35_Sub2_1.method5740(local25);
				Static48.method743(local60);
				Static136.method2083(local41.anIntArray533[0], local41.method5434(), -2, local41.anIntArray534[0], true, local41.method5434(), 0, 0);
			}
		}
		if (local21 == 8) {
			Static497.anInt6024 = arg2;
			Static505.anInt8616 = 2;
			Static12.anInt5207 = arg1;
			Static576.anInt9487 = 0;
			local132 = Static276.method3885(Static485.aClass70_84, Static481.aClass276_2);
			local132.aClass1_Sub35_Sub2_1.method5776(local25);
			local132.aClass1_Sub35_Sub2_1.method5740(local15 + Static541.anInt9058);
			local132.aClass1_Sub35_Sub2_1.method5764(Static116.anInt2289 + local18);
			local132.aClass1_Sub35_Sub2_1.method5795(Static137.aClass295_1.method7719(82) ? 1 : 0);
			Static48.method743(local132);
			Static251.method7506(local15, local18);
		}
		if (local21 == 49) {
			local593 = (Class1_Sub42) Static84.aClass187_40.method3797((long) local25);
			if (local593 != null) {
				Static505.anInt8616 = 2;
				Static497.anInt6024 = arg2;
				Static12.anInt5207 = arg1;
				local598 = local593.aClass8_Sub3_Sub3_Sub1_Sub2_2;
				Static576.anInt9487 = 0;
				local615 = Static276.method3885(Static595.aClass70_104, Static481.aClass276_2);
				local615.aClass1_Sub35_Sub2_1.method5794(Static137.aClass295_1.method7719(82) ? 1 : 0);
				local615.aClass1_Sub35_Sub2_1.method5776(local25);
				Static48.method743(local615);
				Static136.method2083(local598.anIntArray533[0], local598.method5434(), -2, local598.anIntArray534[0], true, local598.method5434(), 0, 0);
			}
		}
		if (local21 == 12) {
			Static505.anInt8616 = 2;
			Static497.anInt6024 = arg2;
			Static12.anInt5207 = arg1;
			Static576.anInt9487 = 0;
			local132 = Static276.method3885(Static580.aClass70_102, Static481.aClass276_2);
			local132.aClass1_Sub35_Sub2_1.method5777(Static137.aClass295_1.method7719(82) ? 1 : 0);
			local132.aClass1_Sub35_Sub2_1.method5776(local18 + Static116.anInt2289);
			local132.aClass1_Sub35_Sub2_1.method5764(local25);
			local132.aClass1_Sub35_Sub2_1.method5776(local15 + Static541.anInt9058);
			Static48.method743(local132);
			Static251.method7506(local15, local18);
		}
		if (local21 == 50 && Static205.aClass341_21 == null) {
			Static203.method3255(local18, local15);
			Static205.aClass341_21 = Static49.method751(local18, local15);
			Static442.method6111(Static205.aClass341_21);
		}
		if (local21 == 1003 || local21 == 1004 || local21 == 1012 || local21 == 1011 || local21 == 1008) {
			Static382.method5272(local21, local15, local25);
		}
		if (local21 == 30) {
			local593 = (Class1_Sub42) Static84.aClass187_40.method3797((long) local25);
			if (local593 != null) {
				local598 = local593.aClass8_Sub3_Sub3_Sub1_Sub2_2;
				Static505.anInt8616 = 2;
				Static576.anInt9487 = 0;
				Static497.anInt6024 = arg2;
				Static12.anInt5207 = arg1;
				local615 = Static276.method3885(Static268.aClass70_80, Static481.aClass276_2);
				local615.aClass1_Sub35_Sub2_1.method5789(local25);
				local615.aClass1_Sub35_Sub2_1.method5756(Static137.aClass295_1.method7719(82) ? 1 : 0);
				Static48.method743(local615);
				Static136.method2083(local598.anIntArray533[0], local598.method5434(), -2, local598.anIntArray534[0], true, local598.method5434(), 0, 0);
			}
		}
		if (local21 == 25) {
			local593 = (Class1_Sub42) Static84.aClass187_40.method3797((long) local25);
			if (local593 != null) {
				Static505.anInt8616 = 2;
				Static497.anInt6024 = arg2;
				Static12.anInt5207 = arg1;
				Static576.anInt9487 = 0;
				local598 = local593.aClass8_Sub3_Sub3_Sub1_Sub2_2;
				local615 = Static276.method3885(Static125.aClass70_22, Static481.aClass276_2);
				local615.aClass1_Sub35_Sub2_1.method5789(Static78.anInt1494);
				local615.aClass1_Sub35_Sub2_1.method5776(local25);
				local615.aClass1_Sub35_Sub2_1.method5803(Static48.anInt840);
				local615.aClass1_Sub35_Sub2_1.method5794(Static137.aClass295_1.method7719(82) ? 1 : 0);
				local615.aClass1_Sub35_Sub2_1.method5740(Static84.anInt8888);
				Static48.method743(local615);
				Static136.method2083(local598.anIntArray533[0], local598.method5434(), -2, local598.anIntArray534[0], true, local598.method5434(), 0, 0);
			}
		}
		if (local21 == 19) {
			local41 = Static576.aClass8_Sub3_Sub3_Sub1_Sub1Array1[local25];
			if (local41 != null) {
				Static12.anInt5207 = arg1;
				Static497.anInt6024 = arg2;
				Static505.anInt8616 = 2;
				Static576.anInt9487 = 0;
				local60 = Static276.method3885(Static508.aClass70_92, Static481.aClass276_2);
				local60.aClass1_Sub35_Sub2_1.method5776(local25);
				local60.aClass1_Sub35_Sub2_1.method5756(Static137.aClass295_1.method7719(82) ? 1 : 0);
				Static48.method743(local60);
				Static136.method2083(local41.anIntArray533[0], local41.method5434(), -2, local41.anIntArray534[0], true, local41.method5434(), 0, 0);
			}
		}
		if (local21 == 22) {
			Static497.anInt6024 = arg2;
			Static505.anInt8616 = 2;
			Static12.anInt5207 = arg1;
			Static576.anInt9487 = 0;
			local132 = Static276.method3885(Static362.aClass70_38, Static481.aClass276_2);
			local132.aClass1_Sub35_Sub2_1.method5740(Static78.anInt1494);
			local132.aClass1_Sub35_Sub2_1.method5789(Static84.anInt8888);
			local132.aClass1_Sub35_Sub2_1.method5784(Static48.anInt840);
			local132.aClass1_Sub35_Sub2_1.method5776(Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt6821);
			local132.aClass1_Sub35_Sub2_1.method5795(Static137.aClass295_1.method7719(82) ? 1 : 0);
			Static48.method743(local132);
		}
		if (local21 == 11) {
			Static576.anInt9487 = 0;
			Static12.anInt5207 = arg1;
			Static505.anInt8616 = 2;
			Static497.anInt6024 = arg2;
			local132 = Static276.method3885(Static339.aClass70_59, Static481.aClass276_2);
			local132.aClass1_Sub35_Sub2_1.method5777(Static137.aClass295_1.method7719(82) ? 1 : 0);
			local132.aClass1_Sub35_Sub2_1.method5776(local15 + Static541.anInt9058);
			local132.aClass1_Sub35_Sub2_1.method5776(Integer.MAX_VALUE & (int) (local28 >>> 32));
			local132.aClass1_Sub35_Sub2_1.method5789(local18 + Static116.anInt2289);
			Static48.method743(local132);
			Static49.method748(local18, local15, local28);
		}
		if (local21 == 16) {
			Static12.anInt5207 = arg1;
			Static505.anInt8616 = 2;
			Static497.anInt6024 = arg2;
			Static576.anInt9487 = 0;
			local132 = Static276.method3885(Static117.aClass70_21, Static481.aClass276_2);
			local132.aClass1_Sub35_Sub2_1.method5777(Static137.aClass295_1.method7719(82) ? 1 : 0);
			local132.aClass1_Sub35_Sub2_1.method5764(local18 + Static116.anInt2289);
			local132.aClass1_Sub35_Sub2_1.method5764(Integer.MAX_VALUE & (int) (local28 >>> 32));
			local132.aClass1_Sub35_Sub2_1.method5764(local15 + Static541.anInt9058);
			Static48.method743(local132);
			Static49.method748(local18, local15, local28);
		}
		if (local21 == 59) {
			local41 = Static576.aClass8_Sub3_Sub3_Sub1_Sub1Array1[local25];
			if (local41 != null) {
				Static497.anInt6024 = arg2;
				Static12.anInt5207 = arg1;
				Static576.anInt9487 = 0;
				Static505.anInt8616 = 2;
				local60 = Static276.method3885(Static362.aClass70_38, Static481.aClass276_2);
				local60.aClass1_Sub35_Sub2_1.method5740(Static78.anInt1494);
				local60.aClass1_Sub35_Sub2_1.method5789(Static84.anInt8888);
				local60.aClass1_Sub35_Sub2_1.method5784(Static48.anInt840);
				local60.aClass1_Sub35_Sub2_1.method5776(local25);
				local60.aClass1_Sub35_Sub2_1.method5795(Static137.aClass295_1.method7719(82) ? 1 : 0);
				Static48.method743(local60);
				Static136.method2083(local41.anIntArray533[0], local41.method5434(), -2, local41.anIntArray534[0], true, local41.method5434(), 0, 0);
			}
		}
		if (local21 == 10) {
			Static497.anInt6024 = arg2;
			Static12.anInt5207 = arg1;
			Static576.anInt9487 = 0;
			Static505.anInt8616 = 1;
			local132 = Static276.method3885(Static239.aClass70_46, Static481.aClass276_2);
			local132.aClass1_Sub35_Sub2_1.method5776(Static84.anInt8888);
			local132.aClass1_Sub35_Sub2_1.method5792(Static48.anInt840);
			local132.aClass1_Sub35_Sub2_1.method5789(Static116.anInt2289 + local18);
			local132.aClass1_Sub35_Sub2_1.method5776(local15 + Static541.anInt9058);
			local132.aClass1_Sub35_Sub2_1.method5789(Static78.anInt1494);
			Static48.method743(local132);
			Static136.method2083(local18, 1, -4, local15, true, 1, 0, 0);
		}
		if (local21 == 17) {
			Static12.anInt5207 = arg1;
			Static505.anInt8616 = 2;
			Static576.anInt9487 = 0;
			Static497.anInt6024 = arg2;
			local132 = Static276.method3885(Static238.aClass70_45, Static481.aClass276_2);
			local132.aClass1_Sub35_Sub2_1.method5795(Static137.aClass295_1.method7719(82) ? 1 : 0);
			local132.aClass1_Sub35_Sub2_1.method5764(local25);
			local132.aClass1_Sub35_Sub2_1.method5740(Static116.anInt2289 + local18);
			local132.aClass1_Sub35_Sub2_1.method5776(local15 + Static541.anInt9058);
			Static48.method743(local132);
			Static251.method7506(local15, local18);
		}
		if (Static573.aBoolean740) {
			Static50.method827();
		}
		if (Static470.aClass341_19 != null && Static170.anInt3017 == 0) {
			Static442.method6111(Static470.aClass341_19);
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(B[S)[S")
	public static short[] method2281(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) short[] local16 = new short[arg0.length];
			Static598.method1172(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lclient!vg;I)Lclient!vg;")
	public static Class341 method2282(@OriginalArg(0) Class341 arg0) {
		if (arg0.anInt9252 != -1) {
			return Static350.method4758(arg0.anInt9252);
		}
		@Pc(25) int local25 = arg0.anInt9306 >>> 16;
		@Pc(30) Class172 local30 = new Class172(Static78.aClass187_8);
		for (@Pc(35) Class1_Sub44 local35 = (Class1_Sub44) local30.method3635(); local35 != null; local35 = (Class1_Sub44) local30.method3640()) {
			if (local35.anInt7685 == local25) {
				return Static350.method4758((int) local35.aLong301);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(ZZZLclient!rb;)V")
	public static void method2283(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class1_Sub44 arg2) {
		@Pc(8) int local8 = arg2.anInt7685;
		@Pc(12) int local12 = (int) arg2.aLong301;
		arg2.method7859();
		if (arg1) {
			Static546.method7464(local8);
		}
		Static593.method7866(local8);
		@Pc(27) Class341 local27 = Static350.method4758(local12);
		if (local27 != null) {
			Static442.method6111(local27);
		}
		Static201.method3242();
		if (!arg0 && Static422.anInt7311 != -1) {
			Static474.method7346(1, Static422.anInt7311);
		}
		@Pc(48) Class172 local48 = new Class172(Static78.aClass187_8);
		for (@Pc(58) Class1_Sub44 local58 = (Class1_Sub44) local48.method3635(); local58 != null; local58 = (Class1_Sub44) local48.method3640()) {
			if (!local58.method7856()) {
				local58 = (Class1_Sub44) local48.method3635();
				if (local58 == null) {
					return;
				}
			}
			if (local58.anInt7686 == 3) {
				@Pc(82) int local82 = (int) local58.aLong301;
				if (local82 >>> 16 == local8) {
					method2283(arg0, true, local58);
				}
			}
		}
	}
}
