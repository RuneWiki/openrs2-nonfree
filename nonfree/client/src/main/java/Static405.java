import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static405 {

	@OriginalMember(owner = "client!ng", name = "w", descriptor = "[I")
	public static final int[] anIntArray357 = new int[1];

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
	public static int anInt7023 = 0;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V")
	public static void method6120() {
		Static458.anInt7634 = 0;
		Static658.anInt10759 = 0;
		Static14.anInt197 = 0;
		Static43.anInt695 = 0;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(BILjava/net/Socket;)Lclient!qaa;")
	public static Class278 method6124(@OriginalArg(2) Socket arg0) throws IOException {
		return new Class278_Sub1(arg0, 15000);
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(II)Lclient!pia;")
	public static Class14_Sub7 method6126(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return new Class14_Sub7_Sub8();
		} else if (arg0 == 1) {
			return new Class14_Sub7_Sub4();
		} else if (arg0 == 2) {
			return new Class14_Sub7_Sub6();
		} else if (arg0 == 3) {
			return new Class14_Sub7_Sub31();
		} else if (arg0 == 4) {
			return new Class14_Sub7_Sub37();
		} else if (arg0 == 5) {
			return new Class14_Sub7_Sub10();
		} else if (arg0 == 6) {
			return new Class14_Sub7_Sub34();
		} else if (arg0 == 7) {
			return new Class14_Sub7_Sub28();
		} else if (arg0 == 8) {
			return new Class14_Sub7_Sub24();
		} else if (arg0 == 9) {
			return new Class14_Sub7_Sub16();
		} else if (arg0 == 10) {
			return new Class14_Sub7_Sub27();
		} else if (arg0 == 11) {
			return new Class14_Sub7_Sub36();
		} else if (arg0 == 12) {
			return new Class14_Sub7_Sub33();
		} else if (arg0 == 13) {
			return new Class14_Sub7_Sub2();
		} else if (arg0 == 14) {
			return new Class14_Sub7_Sub19();
		} else if (arg0 == 15) {
			return new Class14_Sub7_Sub39();
		} else if (arg0 == 16) {
			return new Class14_Sub7_Sub26();
		} else if (arg0 == 17) {
			return new Class14_Sub7_Sub14();
		} else if (arg0 == 18) {
			return new Class14_Sub7_Sub29_Sub1();
		} else if (arg0 == 19) {
			return new Class14_Sub7_Sub20();
		} else if (arg0 == 20) {
			return new Class14_Sub7_Sub30();
		} else if (arg0 == 21) {
			return new Class14_Sub7_Sub15();
		} else if (arg0 == 22) {
			return new Class14_Sub7_Sub35();
		} else if (arg0 == 23) {
			return new Class14_Sub7_Sub32();
		} else if (arg0 == 24) {
			return new Class14_Sub7_Sub3();
		} else if (arg0 == 25) {
			return new Class14_Sub7_Sub22();
		} else if (arg0 == 26) {
			return new Class14_Sub7_Sub18();
		} else if (arg0 == 27) {
			return new Class14_Sub7_Sub7();
		} else if (arg0 == 28) {
			return new Class14_Sub7_Sub11();
		} else if (arg0 == 29) {
			return new Class14_Sub7_Sub12();
		} else if (arg0 == 30) {
			return new Class14_Sub7_Sub17();
		} else if (arg0 == 31) {
			return new Class14_Sub7_Sub38();
		} else if (arg0 == 32) {
			return new Class14_Sub7_Sub21();
		} else if (arg0 == 33) {
			return new Class14_Sub7_Sub13();
		} else if (arg0 == 34) {
			return new Class14_Sub7_Sub9();
		} else if (arg0 == 35) {
			return new Class14_Sub7_Sub5();
		} else if (arg0 == 36) {
			return new Class14_Sub7_Sub25();
		} else if (arg0 == 37) {
			return new Class14_Sub7_Sub23();
		} else if (arg0 == 38) {
			return new Class14_Sub7_Sub1();
		} else if (arg0 == 39) {
			return new Class14_Sub7_Sub29();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(B)V")
	public static void method6127() {
		if (Static181.aClass14_Sub26_9.aClass43_Sub19_1.method5412() == 0 && Static391.anInt6811 != Static114.anInt1886) {
			Static333.method8696(false, 12, Static406.anInt7033, Static306.anInt6137);
		} else {
			Static545.method5450(Static103.aClass144_3);
			if (Static391.anInt6811 != Static612.anInt10103) {
				Static357.method5426();
			}
		}
	}
}
