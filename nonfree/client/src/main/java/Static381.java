import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static381 {

	@OriginalMember(owner = "client!m", name = "l", descriptor = "I")
	public static int anInt6082;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(BLclient!it;)Z")
	public static boolean method5504(@OriginalArg(1) Class187 arg0) {
		return arg0 == null ? false : Static719.method9571(arg0.anInt4404, arg0.anInt4400, arg0.anInt4397, arg0.anInt4407 - arg0.anInt4404, -arg0.anInt4397 + arg0.anInt4396, arg0.anInt4402 - arg0.anInt4400);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIZI)I")
	public static int method5505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if ((Static392.aByteArrayArrayArray16[arg0][arg2][arg1] & 0x8) == 0) {
			return arg0 <= 0 || (Static392.aByteArrayArrayArray16[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II)Lclient!bw;")
	public static Class2_Sub11 method5506(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return new Class2_Sub11_Sub3();
		} else if (arg0 == 1) {
			return new Class2_Sub11_Sub29();
		} else if (arg0 == 2) {
			return new Class2_Sub11_Sub35();
		} else if (arg0 == 3) {
			return new Class2_Sub11_Sub14();
		} else if (arg0 == 4) {
			return new Class2_Sub11_Sub23();
		} else if (arg0 == 5) {
			return new Class2_Sub11_Sub39();
		} else if (arg0 == 6) {
			return new Class2_Sub11_Sub16();
		} else if (arg0 == 7) {
			return new Class2_Sub11_Sub17();
		} else if (arg0 == 8) {
			return new Class2_Sub11_Sub7();
		} else if (arg0 == 9) {
			return new Class2_Sub11_Sub18();
		} else if (arg0 == 10) {
			return new Class2_Sub11_Sub5();
		} else if (arg0 == 11) {
			return new Class2_Sub11_Sub24();
		} else if (arg0 == 12) {
			return new Class2_Sub11_Sub22();
		} else if (arg0 == 13) {
			return new Class2_Sub11_Sub38();
		} else if (arg0 == 14) {
			return new Class2_Sub11_Sub32();
		} else if (arg0 == 15) {
			return new Class2_Sub11_Sub37();
		} else if (arg0 == 16) {
			return new Class2_Sub11_Sub10();
		} else if (arg0 == 17) {
			return new Class2_Sub11_Sub8();
		} else if (arg0 == 18) {
			return new Class2_Sub11_Sub21_Sub1();
		} else if (arg0 == 19) {
			return new Class2_Sub11_Sub1();
		} else if (arg0 == 20) {
			return new Class2_Sub11_Sub26();
		} else if (arg0 == 21) {
			return new Class2_Sub11_Sub11();
		} else if (arg0 == 22) {
			return new Class2_Sub11_Sub30();
		} else if (arg0 == 23) {
			return new Class2_Sub11_Sub4();
		} else if (arg0 == 24) {
			return new Class2_Sub11_Sub19();
		} else if (arg0 == 25) {
			return new Class2_Sub11_Sub15();
		} else if (arg0 == 26) {
			return new Class2_Sub11_Sub34();
		} else if (arg0 == 27) {
			return new Class2_Sub11_Sub13();
		} else if (arg0 == 28) {
			return new Class2_Sub11_Sub12();
		} else if (arg0 == 29) {
			return new Class2_Sub11_Sub27();
		} else if (arg0 == 30) {
			return new Class2_Sub11_Sub2();
		} else if (arg0 == 31) {
			return new Class2_Sub11_Sub28();
		} else if (arg0 == 32) {
			return new Class2_Sub11_Sub6();
		} else if (arg0 == 33) {
			return new Class2_Sub11_Sub9();
		} else if (arg0 == 34) {
			return new Class2_Sub11_Sub20();
		} else if (arg0 == 35) {
			return new Class2_Sub11_Sub33();
		} else if (arg0 == 36) {
			return new Class2_Sub11_Sub31();
		} else if (arg0 == 37) {
			return new Class2_Sub11_Sub25();
		} else if (arg0 == 38) {
			return new Class2_Sub11_Sub36();
		} else if (arg0 == 39) {
			return new Class2_Sub11_Sub21();
		} else {
			return null;
		}
	}
}
