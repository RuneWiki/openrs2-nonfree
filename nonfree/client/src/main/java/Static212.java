import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!id", name = "a", descriptor = "Lclient!lc;")
	public static Class193 aClass193_1;

	@OriginalMember(owner = "client!id", name = "b", descriptor = "I")
	public static int anInt4380;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(II)Lclient!ku;")
	public static Class3_Sub1 method3724(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return new Class3_Sub1_Sub28();
		} else if (arg0 == 1) {
			return new Class3_Sub1_Sub35();
		} else if (arg0 == 2) {
			return new Class3_Sub1_Sub26();
		} else if (arg0 == 3) {
			return new Class3_Sub1_Sub1();
		} else if (arg0 == 4) {
			return new Class3_Sub1_Sub14();
		} else if (arg0 == 5) {
			return new Class3_Sub1_Sub13();
		} else if (arg0 == 6) {
			return new Class3_Sub1_Sub11();
		} else if (arg0 == 7) {
			return new Class3_Sub1_Sub29();
		} else if (arg0 == 8) {
			return new Class3_Sub1_Sub7();
		} else if (arg0 == 9) {
			return new Class3_Sub1_Sub16();
		} else if (arg0 == 10) {
			return new Class3_Sub1_Sub6();
		} else if (arg0 == 11) {
			return new Class3_Sub1_Sub19();
		} else if (arg0 == 12) {
			return new Class3_Sub1_Sub18();
		} else if (arg0 == 13) {
			return new Class3_Sub1_Sub33();
		} else if (arg0 == 14) {
			return new Class3_Sub1_Sub32();
		} else if (arg0 == 15) {
			return new Class3_Sub1_Sub8();
		} else if (arg0 == 16) {
			return new Class3_Sub1_Sub24();
		} else if (arg0 == 17) {
			return new Class3_Sub1_Sub23();
		} else if (arg0 == 18) {
			return new Class3_Sub1_Sub17_Sub1();
		} else if (arg0 == 19) {
			return new Class3_Sub1_Sub30();
		} else if (arg0 == 20) {
			return new Class3_Sub1_Sub38();
		} else if (arg0 == 21) {
			return new Class3_Sub1_Sub9();
		} else if (arg0 == 22) {
			return new Class3_Sub1_Sub10();
		} else if (arg0 == 23) {
			return new Class3_Sub1_Sub22();
		} else if (arg0 == 24) {
			return new Class3_Sub1_Sub3();
		} else if (arg0 == 25) {
			return new Class3_Sub1_Sub27();
		} else if (arg0 == 26) {
			return new Class3_Sub1_Sub5();
		} else if (arg0 == 27) {
			return new Class3_Sub1_Sub39();
		} else if (arg0 == 28) {
			return new Class3_Sub1_Sub21();
		} else if (arg0 == 29) {
			return new Class3_Sub1_Sub34();
		} else if (arg0 == 30) {
			return new Class3_Sub1_Sub31();
		} else if (arg0 == 31) {
			return new Class3_Sub1_Sub37();
		} else if (arg0 == 32) {
			return new Class3_Sub1_Sub4();
		} else if (arg0 == 33) {
			return new Class3_Sub1_Sub25();
		} else if (arg0 == 34) {
			return new Class3_Sub1_Sub2();
		} else if (arg0 == 35) {
			return new Class3_Sub1_Sub20();
		} else if (arg0 == 36) {
			return new Class3_Sub1_Sub36();
		} else if (arg0 == 37) {
			return new Class3_Sub1_Sub12();
		} else if (arg0 == 38) {
			return new Class3_Sub1_Sub15();
		} else if (arg0 == 39) {
			return new Class3_Sub1_Sub17();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I[BI)[B")
	public static byte[] method3725(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(11) byte[] local11 = new byte[arg0];
		Static602.method4666(arg1, 0, local11, 0, arg0);
		return local11;
	}
}
