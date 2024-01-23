import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "G", descriptor = "[I")
	public static int[] anIntArray564;

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(II)V")
	public static void method4718(@OriginalArg(0) int arg0) {
		Static43.anIntArray130 = new int[arg0];
		Static38.anIntArray120 = new int[arg0];
		Static18.anIntArray44 = new int[arg0];
		Static49.anIntArray146 = new int[arg0];
		Static162.anIntArray323 = new int[arg0];
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IB)Lclient!a;")
	public static Class1_Sub1 method4719(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return new Class1_Sub1_Sub9();
		} else if (arg0 == 1) {
			return new Class1_Sub1_Sub13();
		} else if (arg0 == 2) {
			return new Class1_Sub1_Sub18();
		} else if (arg0 == 3) {
			return new Class1_Sub1_Sub32();
		} else if (arg0 == 4) {
			return new Class1_Sub1_Sub22();
		} else if (arg0 == 5) {
			return new Class1_Sub1_Sub19();
		} else if (arg0 == 6) {
			return new Class1_Sub1_Sub5();
		} else if (arg0 == 7) {
			return new Class1_Sub1_Sub10();
		} else if (arg0 == 8) {
			return new Class1_Sub1_Sub16();
		} else if (arg0 == 9) {
			return new Class1_Sub1_Sub34();
		} else if (arg0 == 10) {
			return new Class1_Sub1_Sub4();
		} else if (arg0 == 11) {
			return new Class1_Sub1_Sub20();
		} else if (arg0 == 12) {
			return new Class1_Sub1_Sub38();
		} else if (arg0 == 13) {
			return new Class1_Sub1_Sub3();
		} else if (arg0 == 14) {
			return new Class1_Sub1_Sub12();
		} else if (arg0 == 15) {
			return new Class1_Sub1_Sub1();
		} else if (arg0 == 16) {
			return new Class1_Sub1_Sub28();
		} else if (arg0 == 17) {
			return new Class1_Sub1_Sub2();
		} else if (arg0 == 18) {
			return new Class1_Sub1_Sub17_Sub1();
		} else if (arg0 == 19) {
			return new Class1_Sub1_Sub27();
		} else if (arg0 == 20) {
			return new Class1_Sub1_Sub7();
		} else if (arg0 == 21) {
			return new Class1_Sub1_Sub6();
		} else if (arg0 == 22) {
			return new Class1_Sub1_Sub29();
		} else if (arg0 == 23) {
			return new Class1_Sub1_Sub35();
		} else if (arg0 == 24) {
			return new Class1_Sub1_Sub30();
		} else if (arg0 == 25) {
			return new Class1_Sub1_Sub26();
		} else if (arg0 == 26) {
			return new Class1_Sub1_Sub31();
		} else if (arg0 == 27) {
			return new Class1_Sub1_Sub8();
		} else if (arg0 == 28) {
			return new Class1_Sub1_Sub39();
		} else if (arg0 == 29) {
			return new Class1_Sub1_Sub25();
		} else if (arg0 == 30) {
			return new Class1_Sub1_Sub21();
		} else if (arg0 == 31) {
			return new Class1_Sub1_Sub24();
		} else if (arg0 == 32) {
			return new Class1_Sub1_Sub15();
		} else if (arg0 == 33) {
			return new Class1_Sub1_Sub37();
		} else if (arg0 == 34) {
			return new Class1_Sub1_Sub33();
		} else if (arg0 == 35) {
			return new Class1_Sub1_Sub23();
		} else if (arg0 == 36) {
			return new Class1_Sub1_Sub11();
		} else if (arg0 == 37) {
			return new Class1_Sub1_Sub14();
		} else if (arg0 == 38) {
			return new Class1_Sub1_Sub36();
		} else if (arg0 == 39) {
			return new Class1_Sub1_Sub17();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(III)V")
	public static void method4721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 8) {
			arg1 = 4;
		}
		if (arg1 == 4 && !Static255.aBoolean321) {
			arg0 = 2;
			arg1 = 2;
		}
		if (Static56.anInt1255 != arg1) {
			if (Static214.aBoolean289) {
				return;
			}
			if (Static56.anInt1255 != 0) {
				Static246.anInterface4Array1[Static56.anInt1255].method3791();
			}
			if (arg1 != 0) {
				@Pc(68) Interface4 local68 = Static246.anInterface4Array1[arg1];
				local68.method3794();
				local68.method3792(arg0);
			}
			Static117.anInt4600 = arg0;
			Static56.anInt1255 = arg1;
		} else if (arg1 != 0 && Static117.anInt4600 != arg0) {
			Static246.anInterface4Array1[arg1].method3792(arg0);
			Static117.anInt4600 = arg0;
		}
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(II)Lclient!jg;")
	public static Class1_Sub3_Sub10 method4722(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub3_Sub10 local10 = (Class1_Sub3_Sub10) Static153.aClass162_5.method4003((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static171.aClass168_126.method4058(arg0, 5);
		local10 = new Class1_Sub3_Sub10();
		if (local28 != null) {
			local10.method2070(new Class1_Sub14(local28));
		}
		Static153.aClass162_5.method4005(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!df;ILclient!wf;Ljava/lang/String;IIIIII)V")
	public static void method4724(@OriginalArg(0) Class1_Sub3_Sub5 arg0, @OriginalArg(2) Class191 arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(15) int local15;
		if (Static106.anInt2378 == 4) {
			local15 = (int) Static62.aFloat16 & 0x7FF;
		} else {
			local15 = Static220.anInt4691 + (int) Static62.aFloat16 & 0x7FF;
		}
		@Pc(30) int local30 = arg4 * arg4 + arg7 * arg7;
		@Pc(42) int local42 = Math.max(arg1.anInt6088 / 2, arg1.anInt6128 / 2) + 10;
		if (local42 * local42 < local30) {
			return;
		}
		@Pc(57) int local57 = Class146.anIntArray461[local15];
		@Pc(61) int local61 = Class146.anIntArray463[local15];
		if (Static106.anInt2378 != 4) {
			local61 = local61 * 256 / (Static253.anInt5117 + 256);
			local57 = local57 * 256 / (Static253.anInt5117 + 256);
		}
		@Pc(85) int local85 = arg0.method3501(arg2, 100);
		@Pc(95) int local95 = arg4 * local57 + arg7 * local61 >> 16;
		@Pc(106) int local106 = local61 * arg4 - arg7 * local57 >> 16;
		@Pc(112) int local112 = arg0.method3507(arg2);
		@Pc(118) int local118 = local95 - local85 / 2;
		if (-arg1.anInt6088 > local118 || local118 > arg1.anInt6088 || local106 < -arg1.anInt6128 || local106 > arg1.anInt6128) {
			return;
		}
		if (Static294.aBoolean367) {
			Static156.method2539((Class1_Sub3_Sub13_Sub1) arg1.method4674(false));
		} else {
			Static231.method3644(arg1.anIntArray557, arg1.anIntArray554);
		}
		arg0.method3517(arg2, arg1.anInt6088 / 2 + local118 + arg3, -local112 + -local106 + arg1.anInt6128 / 2 + arg8 + -arg5, local85, 50, arg6, 0, 1, 0, 0);
		if (Static294.aBoolean367) {
			Static156.method2542();
		} else {
			Static231.method3643();
		}
	}
}
