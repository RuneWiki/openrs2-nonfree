import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!gk", name = "Xb", descriptor = "Lclient!vg;")
	public static Class247 aClass247_2;

	@OriginalMember(owner = "client!gk", name = "u", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_93 = new Class175("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!gk", name = "yd", descriptor = "J")
	public static long aLong86 = 0L;

	@OriginalMember(owner = "client!gk", name = "Ed", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray1 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(CB)Z")
	public static boolean method2457(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(33) char[] local33 = Static203.aCharArray7;
			for (@Pc(35) int local35 = 0; local35 < local33.length; local35++) {
				@Pc(41) char local41 = local33[local35];
				if (arg0 == local41) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(JI)V")
	public static void method2458(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static54.method1103(arg0 - 1L);
			Static54.method1103(1L);
		} else {
			Static54.method1103(arg0);
		}
	}

	@OriginalMember(owner = "client!gk", name = "j", descriptor = "(II)Lclient!dw;")
	public static Class3_Sub4 method2468(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return new Class3_Sub4_Sub8();
		} else if (arg0 == 1) {
			return new Class3_Sub4_Sub12();
		} else if (arg0 == 2) {
			return new Class3_Sub4_Sub35();
		} else if (arg0 == 3) {
			return new Class3_Sub4_Sub13();
		} else if (arg0 == 4) {
			return new Class3_Sub4_Sub21();
		} else if (arg0 == 5) {
			return new Class3_Sub4_Sub37();
		} else if (arg0 == 6) {
			return new Class3_Sub4_Sub27();
		} else if (arg0 == 7) {
			return new Class3_Sub4_Sub20();
		} else if (arg0 == 8) {
			return new Class3_Sub4_Sub10();
		} else if (arg0 == 9) {
			return new Class3_Sub4_Sub33();
		} else if (arg0 == 10) {
			return new Class3_Sub4_Sub11();
		} else if (arg0 == 11) {
			return new Class3_Sub4_Sub28();
		} else if (arg0 == 12) {
			return new Class3_Sub4_Sub36();
		} else if (arg0 == 13) {
			return new Class3_Sub4_Sub23();
		} else if (arg0 == 14) {
			return new Class3_Sub4_Sub16();
		} else if (arg0 == 15) {
			return new Class3_Sub4_Sub32();
		} else if (arg0 == 16) {
			return new Class3_Sub4_Sub2();
		} else if (arg0 == 17) {
			return new Class3_Sub4_Sub9();
		} else if (arg0 == 18) {
			return new Class3_Sub4_Sub14_Sub1();
		} else if (arg0 == 19) {
			return new Class3_Sub4_Sub29();
		} else if (arg0 == 20) {
			return new Class3_Sub4_Sub24();
		} else if (arg0 == 21) {
			return new Class3_Sub4_Sub19();
		} else if (arg0 == 22) {
			return new Class3_Sub4_Sub39();
		} else if (arg0 == 23) {
			return new Class3_Sub4_Sub3();
		} else if (arg0 == 24) {
			return new Class3_Sub4_Sub6();
		} else if (arg0 == 25) {
			return new Class3_Sub4_Sub4();
		} else if (arg0 == 26) {
			return new Class3_Sub4_Sub5();
		} else if (arg0 == 27) {
			return new Class3_Sub4_Sub18();
		} else if (arg0 == 28) {
			return new Class3_Sub4_Sub17();
		} else if (arg0 == 29) {
			return new Class3_Sub4_Sub7();
		} else if (arg0 == 30) {
			return new Class3_Sub4_Sub25();
		} else if (arg0 == 31) {
			return new Class3_Sub4_Sub31();
		} else if (arg0 == 32) {
			return new Class3_Sub4_Sub1();
		} else if (arg0 == 33) {
			return new Class3_Sub4_Sub15();
		} else if (arg0 == 34) {
			return new Class3_Sub4_Sub26();
		} else if (arg0 == 35) {
			return new Class3_Sub4_Sub30();
		} else if (arg0 == 36) {
			return new Class3_Sub4_Sub22();
		} else if (arg0 == 37) {
			return new Class3_Sub4_Sub34();
		} else if (arg0 == 38) {
			return new Class3_Sub4_Sub38();
		} else if (arg0 == 39) {
			return new Class3_Sub4_Sub14();
		} else {
			return null;
		}
	}
}
