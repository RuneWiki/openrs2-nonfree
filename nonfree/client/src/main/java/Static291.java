import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!maa", name = "j", descriptor = "F")
	public static float aFloat109;

	@OriginalMember(owner = "client!maa", name = "d", descriptor = "I")
	public static int anInt5669 = 0;

	@OriginalMember(owner = "client!maa", name = "f", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_86 = new Class6(86, 7);

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method4907(@OriginalArg(0) String arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static265.aStringArray21.length; local12++) {
			if (Static265.aStringArray21[local12].equalsIgnoreCase(arg0)) {
				return local12;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(Lclient!vp;B)V")
	public static void method4908(@OriginalArg(0) Class309 arg0) {
		if (Static358.anInt2385 == arg0.anInt8789) {
			Static145.aBooleanArray14[arg0.anInt8743] = true;
		}
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(II)Lclient!pv;")
	public static Class1_Sub3 method4909(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return new Class1_Sub3_Sub37();
		} else if (arg0 == 1) {
			return new Class1_Sub3_Sub11();
		} else if (arg0 == 2) {
			return new Class1_Sub3_Sub20();
		} else if (arg0 == 3) {
			return new Class1_Sub3_Sub4();
		} else if (arg0 == 4) {
			return new Class1_Sub3_Sub23();
		} else if (arg0 == 5) {
			return new Class1_Sub3_Sub18();
		} else if (arg0 == 6) {
			return new Class1_Sub3_Sub33();
		} else if (arg0 == 7) {
			return new Class1_Sub3_Sub2();
		} else if (arg0 == 8) {
			return new Class1_Sub3_Sub15();
		} else if (arg0 == 9) {
			return new Class1_Sub3_Sub1();
		} else if (arg0 == 10) {
			return new Class1_Sub3_Sub34();
		} else if (arg0 == 11) {
			return new Class1_Sub3_Sub30();
		} else if (arg0 == 12) {
			return new Class1_Sub3_Sub10();
		} else if (arg0 == 13) {
			return new Class1_Sub3_Sub17();
		} else if (arg0 == 14) {
			return new Class1_Sub3_Sub8();
		} else if (arg0 == 15) {
			return new Class1_Sub3_Sub12();
		} else if (arg0 == 16) {
			return new Class1_Sub3_Sub39();
		} else if (arg0 == 17) {
			return new Class1_Sub3_Sub21();
		} else if (arg0 == 18) {
			return new Class1_Sub3_Sub6_Sub1();
		} else if (arg0 == 19) {
			return new Class1_Sub3_Sub22();
		} else if (arg0 == 20) {
			return new Class1_Sub3_Sub3();
		} else if (arg0 == 21) {
			return new Class1_Sub3_Sub25();
		} else if (arg0 == 22) {
			return new Class1_Sub3_Sub19();
		} else if (arg0 == 23) {
			return new Class1_Sub3_Sub35();
		} else if (arg0 == 24) {
			return new Class1_Sub3_Sub24();
		} else if (arg0 == 25) {
			return new Class1_Sub3_Sub16();
		} else if (arg0 == 26) {
			return new Class1_Sub3_Sub28();
		} else if (arg0 == 27) {
			return new Class1_Sub3_Sub36();
		} else if (arg0 == 28) {
			return new Class1_Sub3_Sub13();
		} else if (arg0 == 29) {
			return new Class1_Sub3_Sub5();
		} else if (arg0 == 30) {
			return new Class1_Sub3_Sub14();
		} else if (arg0 == 31) {
			return new Class1_Sub3_Sub9();
		} else if (arg0 == 32) {
			return new Class1_Sub3_Sub27();
		} else if (arg0 == 33) {
			return new Class1_Sub3_Sub32();
		} else if (arg0 == 34) {
			return new Class1_Sub3_Sub7();
		} else if (arg0 == 35) {
			return new Class1_Sub3_Sub31();
		} else if (arg0 == 36) {
			return new Class1_Sub3_Sub26();
		} else if (arg0 == 37) {
			return new Class1_Sub3_Sub38();
		} else if (arg0 == 38) {
			return new Class1_Sub3_Sub29();
		} else if (arg0 == 39) {
			return new Class1_Sub3_Sub6();
		} else {
			return null;
		}
	}
}
