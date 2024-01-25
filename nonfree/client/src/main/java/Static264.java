import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!ql", name = "F", descriptor = "[I")
	public static int[] anIntArray497;

	@OriginalMember(owner = "client!ql", name = "w", descriptor = "Lclient!jm;")
	public static final Class103 aClass103_128 = new Class103();

	@OriginalMember(owner = "client!ql", name = "C", descriptor = "[Lclient!in;")
	public static final Class5_Sub1_Sub9[] aClass5_Sub1_Sub9Array5 = new Class5_Sub1_Sub9[14];

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(II[I)V")
	public static void method4681(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		for (@Pc(7) int local7 = 31; local7 > 0; local7--) {
			@Pc(13) int local13 = local7 * 36;
			for (@Pc(15) int local15 = 35; local15 > 0; local15--) {
				if (arg1[local15 + local13] == 0 && arg1[local13 + local15 - 36 - 1] != 0) {
					arg1[local15 + local13] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ql", name = "e", descriptor = "(I)V")
	public static void method4683() {
		if (Static236.aClass55_9.method5166()) {
			Static76.method1401();
			Static236.aClass55_9.method5253(Static102.aCanvas3);
			Static300.method5274();
		} else {
			Static144.method2633(Static342.anInt6605);
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IBI)V")
	public static void method4685(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = arg0 * Static349.anInt6699 >> 8;
		if (arg1 == -1 && !Static111.aBoolean156) {
			Static137.method2433();
		} else if (arg1 != -1 && (arg1 != Static236.anInt4219 || !Static317.method5541()) && local17 != 0 && !Static111.aBoolean156) {
			Static163.method2867(arg1, local17, Static319.aClass93_121);
		}
		Static236.anInt4219 = arg1;
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(IB)Lclient!sp;")
	public static Class5_Sub3 method4686(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return new Class5_Sub3_Sub30();
		} else if (arg0 == 1) {
			return new Class5_Sub3_Sub10();
		} else if (arg0 == 2) {
			return new Class5_Sub3_Sub11();
		} else if (arg0 == 3) {
			return new Class5_Sub3_Sub5();
		} else if (arg0 == 4) {
			return new Class5_Sub3_Sub7();
		} else if (arg0 == 5) {
			return new Class5_Sub3_Sub15();
		} else if (arg0 == 6) {
			return new Class5_Sub3_Sub31();
		} else if (arg0 == 7) {
			return new Class5_Sub3_Sub22();
		} else if (arg0 == 8) {
			return new Class5_Sub3_Sub4();
		} else if (arg0 == 9) {
			return new Class5_Sub3_Sub18();
		} else if (arg0 == 10) {
			return new Class5_Sub3_Sub28();
		} else if (arg0 == 11) {
			return new Class5_Sub3_Sub24();
		} else if (arg0 == 12) {
			return new Class5_Sub3_Sub25();
		} else if (arg0 == 13) {
			return new Class5_Sub3_Sub16();
		} else if (arg0 == 14) {
			return new Class5_Sub3_Sub17();
		} else if (arg0 == 15) {
			return new Class5_Sub3_Sub2();
		} else if (arg0 == 16) {
			return new Class5_Sub3_Sub39();
		} else if (arg0 == 17) {
			return new Class5_Sub3_Sub32();
		} else if (arg0 == 18) {
			return new Class5_Sub3_Sub21_Sub1();
		} else if (arg0 == 19) {
			return new Class5_Sub3_Sub6();
		} else if (arg0 == 20) {
			return new Class5_Sub3_Sub13();
		} else if (arg0 == 21) {
			return new Class5_Sub3_Sub1();
		} else if (arg0 == 22) {
			return new Class5_Sub3_Sub33();
		} else if (arg0 == 23) {
			return new Class5_Sub3_Sub37();
		} else if (arg0 == 24) {
			return new Class5_Sub3_Sub29();
		} else if (arg0 == 25) {
			return new Class5_Sub3_Sub38();
		} else if (arg0 == 26) {
			return new Class5_Sub3_Sub8();
		} else if (arg0 == 27) {
			return new Class5_Sub3_Sub3();
		} else if (arg0 == 28) {
			return new Class5_Sub3_Sub12();
		} else if (arg0 == 29) {
			return new Class5_Sub3_Sub36();
		} else if (arg0 == 30) {
			return new Class5_Sub3_Sub26();
		} else if (arg0 == 31) {
			return new Class5_Sub3_Sub20();
		} else if (arg0 == 32) {
			return new Class5_Sub3_Sub19();
		} else if (arg0 == 33) {
			return new Class5_Sub3_Sub14();
		} else if (arg0 == 34) {
			return new Class5_Sub3_Sub35();
		} else if (arg0 == 35) {
			return new Class5_Sub3_Sub34();
		} else if (arg0 == 36) {
			return new Class5_Sub3_Sub9();
		} else if (arg0 == 37) {
			return new Class5_Sub3_Sub27();
		} else if (arg0 == 38) {
			return new Class5_Sub3_Sub23();
		} else if (arg0 == 39) {
			return new Class5_Sub3_Sub21();
		} else {
			return null;
		}
	}
}
