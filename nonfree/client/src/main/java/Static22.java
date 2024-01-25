import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!be", name = "J", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray4;

	@OriginalMember(owner = "client!be", name = "S", descriptor = "I")
	public static int anInt428;

	@OriginalMember(owner = "client!be", name = "W", descriptor = "Ljava/lang/String;")
	public static String aString15 = "Loading defaults - ";

	@OriginalMember(owner = "client!be", name = "X", descriptor = "[[I")
	public static final int[][] anIntArrayArray6 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!be", name = "Y", descriptor = "[I")
	public static final int[] anIntArray22 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZZ)V")
	public static void method393(@OriginalArg(0) boolean arg0) {
		Static278.aBoolean473 = arg0;
		Static318.aBoolean525 = !Static25.method408();
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIII)V")
	public static void method394(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static54.method1088(Static41.anInt1131, arg4, Static165.anInt3409);
		@Pc(17) int local17 = Static54.method1088(Static41.anInt1131, arg3, Static165.anInt3409);
		@Pc(27) int local27 = Static54.method1088(Static60.anInt1399, arg2, Static138.anInt6334);
		@Pc(33) int local33 = Static54.method1088(Static60.anInt1399, arg0, Static138.anInt6334);
		for (@Pc(35) int local35 = local11; local35 <= local17; local35++) {
			Static244.method5351(local27, local33, Static319.anIntArrayArray31[local35], arg1);
		}
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(II)Lclient!fa;")
	public static Class1_Sub5 method396(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return new Class1_Sub5_Sub21();
		} else if (arg0 == 1) {
			return new Class1_Sub5_Sub14();
		} else if (arg0 == 2) {
			return new Class1_Sub5_Sub7();
		} else if (arg0 == 3) {
			return new Class1_Sub5_Sub16();
		} else if (arg0 == 4) {
			return new Class1_Sub5_Sub35();
		} else if (arg0 == 5) {
			return new Class1_Sub5_Sub24();
		} else if (arg0 == 6) {
			return new Class1_Sub5_Sub29();
		} else if (arg0 == 7) {
			return new Class1_Sub5_Sub15();
		} else if (arg0 == 8) {
			return new Class1_Sub5_Sub10();
		} else if (arg0 == 9) {
			return new Class1_Sub5_Sub31();
		} else if (arg0 == 10) {
			return new Class1_Sub5_Sub18();
		} else if (arg0 == 11) {
			return new Class1_Sub5_Sub17();
		} else if (arg0 == 12) {
			return new Class1_Sub5_Sub37();
		} else if (arg0 == 13) {
			return new Class1_Sub5_Sub38();
		} else if (arg0 == 14) {
			return new Class1_Sub5_Sub3();
		} else if (arg0 == 15) {
			return new Class1_Sub5_Sub13();
		} else if (arg0 == 16) {
			return new Class1_Sub5_Sub27();
		} else if (arg0 == 17) {
			return new Class1_Sub5_Sub28();
		} else if (arg0 == 18) {
			return new Class1_Sub5_Sub12_Sub1();
		} else if (arg0 == 19) {
			return new Class1_Sub5_Sub30();
		} else if (arg0 == 20) {
			return new Class1_Sub5_Sub32();
		} else if (arg0 == 21) {
			return new Class1_Sub5_Sub11();
		} else if (arg0 == 22) {
			return new Class1_Sub5_Sub8();
		} else if (arg0 == 23) {
			return new Class1_Sub5_Sub23();
		} else if (arg0 == 24) {
			return new Class1_Sub5_Sub26();
		} else if (arg0 == 25) {
			return new Class1_Sub5_Sub36();
		} else if (arg0 == 26) {
			return new Class1_Sub5_Sub4();
		} else if (arg0 == 27) {
			return new Class1_Sub5_Sub20();
		} else if (arg0 == 28) {
			return new Class1_Sub5_Sub19();
		} else if (arg0 == 29) {
			return new Class1_Sub5_Sub5();
		} else if (arg0 == 30) {
			return new Class1_Sub5_Sub25();
		} else if (arg0 == 31) {
			return new Class1_Sub5_Sub1();
		} else if (arg0 == 32) {
			return new Class1_Sub5_Sub2();
		} else if (arg0 == 33) {
			return new Class1_Sub5_Sub33();
		} else if (arg0 == 34) {
			return new Class1_Sub5_Sub6();
		} else if (arg0 == 35) {
			return new Class1_Sub5_Sub39();
		} else if (arg0 == 36) {
			return new Class1_Sub5_Sub9();
		} else if (arg0 == 37) {
			return new Class1_Sub5_Sub34();
		} else if (arg0 == 38) {
			return new Class1_Sub5_Sub22();
		} else if (arg0 == 39) {
			return new Class1_Sub5_Sub12();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ILclient!nd;)V")
	public static void method397(@OriginalArg(1) Class7_Sub8 arg0) {
		arg0.aClass10_Sub1_Sub2_1 = null;
		if (Static233.anInt4835 < 20) {
			Static148.aClass122_4.method2624(arg0);
			Static233.anInt4835++;
		}
	}
}
