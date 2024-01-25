import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static432 {

	@OriginalMember(owner = "client!os", name = "i", descriptor = "[I")
	public static int[] anIntArray489 = new int[1];

	@OriginalMember(owner = "client!os", name = "l", descriptor = "I")
	public static int anInt7402 = 0;

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIILclient!ha;III)V")
	public static void method6398(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class132 arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4) {
		Static367.aClass132_7 = arg2;
		Static467.aClass207_29 = Static367.aClass132_7.method7467();
		Static621.aClass207_37 = Static367.aClass132_7.method7467();
		Static32.aClass207_6 = Static367.aClass132_7.method7467();
		Static622.anInt10138 = 0;
		Static236.anInt4272 = 2;
		Static208.anInt3594 = arg4;
		Static263.anInt4574 = arg0;
		Static675.anInterface16_1 = null;
		Static353.anInt6019 = 1;
		Static604.anInt4516 = 0;
		Static230.anInt3916 = 2;
		Static630.method5247(arg1, arg3);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IBII)V")
	public static void method6399(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static59.anInt1160 == arg1 && arg0 == Static383.anInt6432 && arg2 == Static627.anInt10200) {
			return;
		}
		Static59.anInt1160 = arg1;
		Static627.anInt10200 = arg2;
		Static119.aBoolean126 = true;
		Static383.anInt6432 = arg0;
		@Pc(31) double local31 = -((double) (arg1 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(41) double local41 = -((double) (arg0 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(44) double local44 = Math.cos(local41);
		@Pc(47) double local47 = Math.sin(local41);
		@Pc(50) double local50 = Math.cos(local31);
		@Pc(53) double local53 = Math.sin(local31);
		Static83.aDouble29 = local44 * local50;
		Static308.aDouble96 = local47;
		Static286.aDouble86 = local44;
		Static230.aDouble72 = local50;
		Static543.aDouble190 = local53 * local47;
		Static135.aDouble42 = 0.0D;
		Static541.aDouble121 = local53;
		Static403.aDouble133 = -local44 * local53;
		Static531.aDouble154 = local50 * -local47;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IZI)Z")
	public static boolean method6400(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ZI)Lclient!uba;")
	public static Class6_Sub1 method6401(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return new Class6_Sub1_Sub2();
		} else if (arg0 == 1) {
			return new Class6_Sub1_Sub24();
		} else if (arg0 == 2) {
			return new Class6_Sub1_Sub19();
		} else if (arg0 == 3) {
			return new Class6_Sub1_Sub21();
		} else if (arg0 == 4) {
			return new Class6_Sub1_Sub15();
		} else if (arg0 == 5) {
			return new Class6_Sub1_Sub36();
		} else if (arg0 == 6) {
			return new Class6_Sub1_Sub20();
		} else if (arg0 == 7) {
			return new Class6_Sub1_Sub6();
		} else if (arg0 == 8) {
			return new Class6_Sub1_Sub26();
		} else if (arg0 == 9) {
			return new Class6_Sub1_Sub9();
		} else if (arg0 == 10) {
			return new Class6_Sub1_Sub5();
		} else if (arg0 == 11) {
			return new Class6_Sub1_Sub37();
		} else if (arg0 == 12) {
			return new Class6_Sub1_Sub39();
		} else if (arg0 == 13) {
			return new Class6_Sub1_Sub30();
		} else if (arg0 == 14) {
			return new Class6_Sub1_Sub35();
		} else if (arg0 == 15) {
			return new Class6_Sub1_Sub11();
		} else if (arg0 == 16) {
			return new Class6_Sub1_Sub14();
		} else if (arg0 == 17) {
			return new Class6_Sub1_Sub12();
		} else if (arg0 == 18) {
			return new Class6_Sub1_Sub1_Sub1();
		} else if (arg0 == 19) {
			return new Class6_Sub1_Sub10();
		} else if (arg0 == 20) {
			return new Class6_Sub1_Sub34();
		} else if (arg0 == 21) {
			return new Class6_Sub1_Sub29();
		} else if (arg0 == 22) {
			return new Class6_Sub1_Sub7();
		} else if (arg0 == 23) {
			return new Class6_Sub1_Sub17();
		} else if (arg0 == 24) {
			return new Class6_Sub1_Sub32();
		} else if (arg0 == 25) {
			return new Class6_Sub1_Sub3();
		} else if (arg0 == 26) {
			return new Class6_Sub1_Sub23();
		} else if (arg0 == 27) {
			return new Class6_Sub1_Sub4();
		} else if (arg0 == 28) {
			return new Class6_Sub1_Sub28();
		} else if (arg0 == 29) {
			return new Class6_Sub1_Sub38();
		} else if (arg0 == 30) {
			return new Class6_Sub1_Sub16();
		} else if (arg0 == 31) {
			return new Class6_Sub1_Sub18();
		} else if (arg0 == 32) {
			return new Class6_Sub1_Sub22();
		} else if (arg0 == 33) {
			return new Class6_Sub1_Sub33();
		} else if (arg0 == 34) {
			return new Class6_Sub1_Sub13();
		} else if (arg0 == 35) {
			return new Class6_Sub1_Sub27();
		} else if (arg0 == 36) {
			return new Class6_Sub1_Sub25();
		} else if (arg0 == 37) {
			return new Class6_Sub1_Sub31();
		} else if (arg0 == 38) {
			return new Class6_Sub1_Sub8();
		} else if (arg0 == 39) {
			return new Class6_Sub1_Sub1();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V")
	public static void method6402() {
		Static237.aClass209_15.method5041();
		Static273.aClass384_8.method8913();
		Static407.aClass384_13.method8913();
	}
}
