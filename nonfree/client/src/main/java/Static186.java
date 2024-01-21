import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static186 {

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "[I")
	public static final int[] anIntArray485 = new int[5];

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "Lclient!ua;")
	public static Class85 aClass85_1 = new Class85();

	@OriginalMember(owner = "client!vc", name = "m", descriptor = "[I")
	public static final int[] anIntArray486 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!vc", name = "n", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1279 = Static158.method3034("Bitte benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!vc", name = "q", descriptor = "[J")
	public static final long[] aLongArray10 = new long[32];

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)Lclient!af;")
	public static Class2_Sub2 method3430(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return new Class2_Sub2_Sub26();
		} else if (arg0 == 1) {
			return new Class2_Sub2_Sub16();
		} else if (arg0 == 2) {
			return new Class2_Sub2_Sub38();
		} else if (arg0 == 3) {
			return new Class2_Sub2_Sub8();
		} else if (arg0 == 4) {
			return new Class2_Sub2_Sub23();
		} else if (arg0 == 5) {
			return new Class2_Sub2_Sub14();
		} else if (arg0 == 6) {
			return new Class2_Sub2_Sub5();
		} else if (arg0 == 7) {
			return new Class2_Sub2_Sub18();
		} else if (arg0 == 8) {
			return new Class2_Sub2_Sub35();
		} else if (arg0 == 9) {
			return new Class2_Sub2_Sub37();
		} else if (arg0 == 10) {
			return new Class2_Sub2_Sub28();
		} else if (arg0 == 11) {
			return new Class2_Sub2_Sub36();
		} else if (arg0 == 12) {
			return new Class2_Sub2_Sub2();
		} else if (arg0 == 13) {
			return new Class2_Sub2_Sub12();
		} else if (arg0 == 14) {
			return new Class2_Sub2_Sub7();
		} else if (arg0 == 15) {
			return new Class2_Sub2_Sub32();
		} else if (arg0 == 16) {
			return new Class2_Sub2_Sub34();
		} else if (arg0 == 17) {
			return new Class2_Sub2_Sub27();
		} else if (arg0 == 18) {
			return new Class2_Sub2_Sub20_Sub1();
		} else if (arg0 == 19) {
			return new Class2_Sub2_Sub29();
		} else if (arg0 == 20) {
			return new Class2_Sub2_Sub17();
		} else if (arg0 == 21) {
			return new Class2_Sub2_Sub22();
		} else if (arg0 == 22) {
			return new Class2_Sub2_Sub25();
		} else if (arg0 == 23) {
			return new Class2_Sub2_Sub39();
		} else if (arg0 == 24) {
			return new Class2_Sub2_Sub11();
		} else if (arg0 == 25) {
			return new Class2_Sub2_Sub10();
		} else if (arg0 == 26) {
			return new Class2_Sub2_Sub19();
		} else if (arg0 == 27) {
			return new Class2_Sub2_Sub4();
		} else if (arg0 == 28) {
			return new Class2_Sub2_Sub3();
		} else if (arg0 == 29) {
			return new Class2_Sub2_Sub31();
		} else if (arg0 == 30) {
			return new Class2_Sub2_Sub6();
		} else if (arg0 == 31) {
			return new Class2_Sub2_Sub33();
		} else if (arg0 == 32) {
			return new Class2_Sub2_Sub24();
		} else if (arg0 == 33) {
			return new Class2_Sub2_Sub13();
		} else if (arg0 == 34) {
			return new Class2_Sub2_Sub30();
		} else if (arg0 == 35) {
			return new Class2_Sub2_Sub1();
		} else if (arg0 == 36) {
			return new Class2_Sub2_Sub9();
		} else if (arg0 == 37) {
			return new Class2_Sub2_Sub21();
		} else if (arg0 == 38) {
			return new Class2_Sub2_Sub15();
		} else if (arg0 == 39) {
			return new Class2_Sub2_Sub20();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!h;ILclient!pe;Lclient!pe;Lclient!pe;)Z")
	public static boolean method3431(@OriginalArg(0) Class2_Sub7_Sub1 arg0, @OriginalArg(2) Class13 arg1, @OriginalArg(3) Class13 arg2, @OriginalArg(4) Class13 arg3) {
		Static35.aClass13_23 = arg3;
		Static78.aClass2_Sub7_Sub1_1 = arg0;
		Static141.aClass13_28 = arg1;
		Static6.aClass13_3 = arg2;
		return true;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IZ)Lclient!ob;")
	public static Class60 method3433(@OriginalArg(0) int arg0) {
		if (arg0 < 100000) {
			return Static193.method3536(new Class60[] { Static71.aClass60_1170, Static72.method1661(arg0), Static155.aClass60_1068 });
		} else if (arg0 < 10000000) {
			return Static193.method3536(new Class60[] { Static40.aClass60_290, Static72.method1661(arg0 / 1000), Static22.aClass60_159, Static155.aClass60_1068 });
		} else {
			return Static193.method3536(new Class60[] { Static81.aClass60_652, Static72.method1661(arg0 / 1000000), Static79.aClass60_643, Static155.aClass60_1068 });
		}
	}
}
