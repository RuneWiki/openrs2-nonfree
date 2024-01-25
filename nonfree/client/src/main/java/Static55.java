import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!cm", name = "t", descriptor = "F")
	public static float aFloat13;

	@OriginalMember(owner = "client!cm", name = "y", descriptor = "I")
	public static int anInt1085 = 0;

	@OriginalMember(owner = "client!cm", name = "B", descriptor = "[I")
	public static final int[] anIntArray55 = new int[2048];

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method1094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static163.method5702(arg0)) {
			if (Static145.aClass82ArrayArray1[arg0] == null) {
				Static380.method5283(arg7, arg1, arg3, arg4, arg6, Static298.aClass82ArrayArray2[arg0], arg2, arg5, -1);
			} else {
				Static380.method5283(arg7, arg1, arg3, arg4, arg6, Static145.aClass82ArrayArray1[arg0], arg2, arg5, -1);
			}
		} else if (arg3 == -1) {
			for (@Pc(25) int local25 = 0; local25 < 100; local25++) {
				Static391.aBooleanArray22[local25] = true;
			}
		} else {
			Static391.aBooleanArray22[arg3] = true;
		}
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(IZ)Lclient!ko;")
	public static Class3_Sub4 method1095(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return new Class3_Sub4_Sub6();
		} else if (arg0 == 1) {
			return new Class3_Sub4_Sub37();
		} else if (arg0 == 2) {
			return new Class3_Sub4_Sub2();
		} else if (arg0 == 3) {
			return new Class3_Sub4_Sub35();
		} else if (arg0 == 4) {
			return new Class3_Sub4_Sub4();
		} else if (arg0 == 5) {
			return new Class3_Sub4_Sub8();
		} else if (arg0 == 6) {
			return new Class3_Sub4_Sub13();
		} else if (arg0 == 7) {
			return new Class3_Sub4_Sub21();
		} else if (arg0 == 8) {
			return new Class3_Sub4_Sub24();
		} else if (arg0 == 9) {
			return new Class3_Sub4_Sub27();
		} else if (arg0 == 10) {
			return new Class3_Sub4_Sub3();
		} else if (arg0 == 11) {
			return new Class3_Sub4_Sub26();
		} else if (arg0 == 12) {
			return new Class3_Sub4_Sub34();
		} else if (arg0 == 13) {
			return new Class3_Sub4_Sub7();
		} else if (arg0 == 14) {
			return new Class3_Sub4_Sub20();
		} else if (arg0 == 15) {
			return new Class3_Sub4_Sub39();
		} else if (arg0 == 16) {
			return new Class3_Sub4_Sub28();
		} else if (arg0 == 17) {
			return new Class3_Sub4_Sub22();
		} else if (arg0 == 18) {
			return new Class3_Sub4_Sub16_Sub1();
		} else if (arg0 == 19) {
			return new Class3_Sub4_Sub36();
		} else if (arg0 == 20) {
			return new Class3_Sub4_Sub10();
		} else if (arg0 == 21) {
			return new Class3_Sub4_Sub33();
		} else if (arg0 == 22) {
			return new Class3_Sub4_Sub30();
		} else if (arg0 == 23) {
			return new Class3_Sub4_Sub1();
		} else if (arg0 == 24) {
			return new Class3_Sub4_Sub18();
		} else if (arg0 == 25) {
			return new Class3_Sub4_Sub14();
		} else if (arg0 == 26) {
			return new Class3_Sub4_Sub11();
		} else if (arg0 == 27) {
			return new Class3_Sub4_Sub19();
		} else if (arg0 == 28) {
			return new Class3_Sub4_Sub5();
		} else if (arg0 == 29) {
			return new Class3_Sub4_Sub25();
		} else if (arg0 == 30) {
			return new Class3_Sub4_Sub15();
		} else if (arg0 == 31) {
			return new Class3_Sub4_Sub38();
		} else if (arg0 == 32) {
			return new Class3_Sub4_Sub31();
		} else if (arg0 == 33) {
			return new Class3_Sub4_Sub9();
		} else if (arg0 == 34) {
			return new Class3_Sub4_Sub32();
		} else if (arg0 == 35) {
			return new Class3_Sub4_Sub12();
		} else if (arg0 == 36) {
			return new Class3_Sub4_Sub29();
		} else if (arg0 == 37) {
			return new Class3_Sub4_Sub23();
		} else if (arg0 == 38) {
			return new Class3_Sub4_Sub17();
		} else if (arg0 == 39) {
			return new Class3_Sub4_Sub16();
		} else {
			return null;
		}
	}
}
