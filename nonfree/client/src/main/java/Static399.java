import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static399 {

	@OriginalMember(owner = "client!ql", name = "eb", descriptor = "Lclient!vs;")
	public static Class311 aClass311_7;

	@OriginalMember(owner = "client!ql", name = "nb", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_102 = new Class252(59, 4);

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIII)V")
	public static void method6367(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(17) int local17 = arg0;
		@Pc(20) int local20 = -arg0;
		Static313.method5430(arg0 + arg2, arg3, Static143.anIntArrayArray33[arg1], arg2 - arg0);
		@Pc(35) int local35 = -1;
		while (local17 > local7) {
			local35 += 2;
			local20 += local35;
			local7++;
			if (local20 >= 0) {
				local17--;
				local20 -= local17 << 1;
				@Pc(61) int[] local61 = Static143.anIntArrayArray33[local17 + arg1];
				@Pc(68) int[] local68 = Static143.anIntArrayArray33[arg1 - local17];
				@Pc(73) int local73 = arg2 + local7;
				@Pc(78) int local78 = arg2 - local7;
				Static313.method5430(local73, arg3, local61, local78);
				Static313.method5430(local73, arg3, local68, local78);
			}
			@Pc(94) int local94 = arg2 + local17;
			@Pc(99) int local99 = arg2 - local17;
			@Pc(105) int[] local105 = Static143.anIntArrayArray33[arg1 + local7];
			@Pc(112) int[] local112 = Static143.anIntArrayArray33[arg1 - local7];
			Static313.method5430(local94, arg3, local105, local99);
			Static313.method5430(local94, arg3, local112, local99);
		}
	}

	@OriginalMember(owner = "client!ql", name = "e", descriptor = "(II)Lclient!al;")
	public static Class1_Sub3 method6369(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return new Class1_Sub3_Sub36();
		} else if (arg0 == 1) {
			return new Class1_Sub3_Sub14();
		} else if (arg0 == 2) {
			return new Class1_Sub3_Sub3();
		} else if (arg0 == 3) {
			return new Class1_Sub3_Sub5();
		} else if (arg0 == 4) {
			return new Class1_Sub3_Sub4();
		} else if (arg0 == 5) {
			return new Class1_Sub3_Sub13();
		} else if (arg0 == 6) {
			return new Class1_Sub3_Sub30();
		} else if (arg0 == 7) {
			return new Class1_Sub3_Sub16();
		} else if (arg0 == 8) {
			return new Class1_Sub3_Sub17();
		} else if (arg0 == 9) {
			return new Class1_Sub3_Sub34();
		} else if (arg0 == 10) {
			return new Class1_Sub3_Sub11();
		} else if (arg0 == 11) {
			return new Class1_Sub3_Sub26();
		} else if (arg0 == 12) {
			return new Class1_Sub3_Sub27();
		} else if (arg0 == 13) {
			return new Class1_Sub3_Sub12();
		} else if (arg0 == 14) {
			return new Class1_Sub3_Sub23();
		} else if (arg0 == 15) {
			return new Class1_Sub3_Sub7();
		} else if (arg0 == 16) {
			return new Class1_Sub3_Sub20();
		} else if (arg0 == 17) {
			return new Class1_Sub3_Sub39();
		} else if (arg0 == 18) {
			return new Class1_Sub3_Sub9_Sub1();
		} else if (arg0 == 19) {
			return new Class1_Sub3_Sub15();
		} else if (arg0 == 20) {
			return new Class1_Sub3_Sub25();
		} else if (arg0 == 21) {
			return new Class1_Sub3_Sub10();
		} else if (arg0 == 22) {
			return new Class1_Sub3_Sub24();
		} else if (arg0 == 23) {
			return new Class1_Sub3_Sub33();
		} else if (arg0 == 24) {
			return new Class1_Sub3_Sub37();
		} else if (arg0 == 25) {
			return new Class1_Sub3_Sub6();
		} else if (arg0 == 26) {
			return new Class1_Sub3_Sub21();
		} else if (arg0 == 27) {
			return new Class1_Sub3_Sub38();
		} else if (arg0 == 28) {
			return new Class1_Sub3_Sub29();
		} else if (arg0 == 29) {
			return new Class1_Sub3_Sub8();
		} else if (arg0 == 30) {
			return new Class1_Sub3_Sub18();
		} else if (arg0 == 31) {
			return new Class1_Sub3_Sub28();
		} else if (arg0 == 32) {
			return new Class1_Sub3_Sub1();
		} else if (arg0 == 33) {
			return new Class1_Sub3_Sub19();
		} else if (arg0 == 34) {
			return new Class1_Sub3_Sub2();
		} else if (arg0 == 35) {
			return new Class1_Sub3_Sub22();
		} else if (arg0 == 36) {
			return new Class1_Sub3_Sub35();
		} else if (arg0 == 37) {
			return new Class1_Sub3_Sub32();
		} else if (arg0 == 38) {
			return new Class1_Sub3_Sub31();
		} else if (arg0 == 39) {
			return new Class1_Sub3_Sub9();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!av;ZII)V")
	public static void method6375(@OriginalArg(0) Class20_Sub1_Sub1_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg0.anInt9022 && arg2 != -1) {
			@Pc(12) Class176 local12 = Static35.aClass152_1.method4045(arg2);
			@Pc(15) int local15 = local12.anInt5271;
			if (local15 == 1) {
				arg0.anInt8961 = 0;
				arg0.anInt9033 = 0;
				arg0.anInt8979 = 1;
				arg0.anInt8988 = 0;
				arg0.anInt9009 = arg1;
				Static425.method6639(arg0.aByte108, local12, arg0.anInt8949, arg0.anInt8961, arg0 == Static107.aClass20_Sub1_Sub1_Sub1_1, arg0.anInt8954);
			}
			if (local15 == 2) {
				arg0.anInt8988 = 0;
			}
		} else if (arg2 == -1 || arg0.anInt9022 == -1 || Static35.aClass152_1.method4045(arg2).anInt5277 >= Static35.aClass152_1.method4045(arg0.anInt9022).anInt5277) {
			arg0.anInt9037 = arg0.anInt9035;
			arg0.anInt9033 = 0;
			arg0.anInt9022 = arg2;
			arg0.anInt8979 = 1;
			arg0.anInt9009 = arg1;
			arg0.anInt8988 = 0;
			arg0.anInt8961 = 0;
			if (arg0.anInt9022 != -1) {
				Static425.method6639(arg0.aByte108, Static35.aClass152_1.method4045(arg0.anInt9022), arg0.anInt8949, arg0.anInt8961, Static107.aClass20_Sub1_Sub1_Sub1_1 == arg0, arg0.anInt8954);
			}
		}
	}
}
