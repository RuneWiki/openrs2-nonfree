import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!au", name = "w", descriptor = "I")
	public static int anInt396;

	@OriginalMember(owner = "client!au", name = "x", descriptor = "I")
	public static int anInt397;

	@OriginalMember(owner = "client!au", name = "t", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_7 = new Class205(19, 10);

	@OriginalMember(owner = "client!au", name = "v", descriptor = "Lclient!jd;")
	public static final Class117 aClass117_1 = new Class117("LIVE", 0);

	@OriginalMember(owner = "client!au", name = "y", descriptor = "I")
	public static int anInt398 = -1;

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IB)Lclient!ol;")
	public static Class2_Sub4 method316(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return new Class2_Sub4_Sub37();
		} else if (arg0 == 1) {
			return new Class2_Sub4_Sub26();
		} else if (arg0 == 2) {
			return new Class2_Sub4_Sub27();
		} else if (arg0 == 3) {
			return new Class2_Sub4_Sub24();
		} else if (arg0 == 4) {
			return new Class2_Sub4_Sub12();
		} else if (arg0 == 5) {
			return new Class2_Sub4_Sub4();
		} else if (arg0 == 6) {
			return new Class2_Sub4_Sub2();
		} else if (arg0 == 7) {
			return new Class2_Sub4_Sub39();
		} else if (arg0 == 8) {
			return new Class2_Sub4_Sub36();
		} else if (arg0 == 9) {
			return new Class2_Sub4_Sub11();
		} else if (arg0 == 10) {
			return new Class2_Sub4_Sub20();
		} else if (arg0 == 11) {
			return new Class2_Sub4_Sub33();
		} else if (arg0 == 12) {
			return new Class2_Sub4_Sub35();
		} else if (arg0 == 13) {
			return new Class2_Sub4_Sub25();
		} else if (arg0 == 14) {
			return new Class2_Sub4_Sub5();
		} else if (arg0 == 15) {
			return new Class2_Sub4_Sub19();
		} else if (arg0 == 16) {
			return new Class2_Sub4_Sub31();
		} else if (arg0 == 17) {
			return new Class2_Sub4_Sub9();
		} else if (arg0 == 18) {
			return new Class2_Sub4_Sub17_Sub1();
		} else if (arg0 == 19) {
			return new Class2_Sub4_Sub38();
		} else if (arg0 == 20) {
			return new Class2_Sub4_Sub30();
		} else if (arg0 == 21) {
			return new Class2_Sub4_Sub13();
		} else if (arg0 == 22) {
			return new Class2_Sub4_Sub18();
		} else if (arg0 == 23) {
			return new Class2_Sub4_Sub21();
		} else if (arg0 == 24) {
			return new Class2_Sub4_Sub34();
		} else if (arg0 == 25) {
			return new Class2_Sub4_Sub14();
		} else if (arg0 == 26) {
			return new Class2_Sub4_Sub29();
		} else if (arg0 == 27) {
			return new Class2_Sub4_Sub23();
		} else if (arg0 == 28) {
			return new Class2_Sub4_Sub32();
		} else if (arg0 == 29) {
			return new Class2_Sub4_Sub10();
		} else if (arg0 == 30) {
			return new Class2_Sub4_Sub1();
		} else if (arg0 == 31) {
			return new Class2_Sub4_Sub15();
		} else if (arg0 == 32) {
			return new Class2_Sub4_Sub3();
		} else if (arg0 == 33) {
			return new Class2_Sub4_Sub16();
		} else if (arg0 == 34) {
			return new Class2_Sub4_Sub22();
		} else if (arg0 == 35) {
			return new Class2_Sub4_Sub7();
		} else if (arg0 == 36) {
			return new Class2_Sub4_Sub6();
		} else if (arg0 == 37) {
			return new Class2_Sub4_Sub8();
		} else if (arg0 == 38) {
			return new Class2_Sub4_Sub28();
		} else if (arg0 == 39) {
			return new Class2_Sub4_Sub17();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(Ljava/awt/Frame;Lclient!is;I)V")
	public static void method318(@OriginalArg(0) Frame arg0, @OriginalArg(1) Class111 arg1) {
		while (true) {
			@Pc(6) Class182 local6 = arg1.method2800(arg0);
			while (local6.anInt4498 == 0) {
				Static358.method2028(10L);
			}
			if (local6.anInt4498 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static358.method2028(100L);
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(II)Z")
	public static boolean method319(@OriginalArg(0) int arg0) {
		if (arg0 == 8 || arg0 == 9 || arg0 == 50 || arg0 == 30 || arg0 == 46) {
			return true;
		} else {
			return arg0 == 18 || arg0 == 1011;
		}
	}

	@OriginalMember(owner = "client!au", name = "d", descriptor = "(I)V")
	public static void method320() {
		if (Static322.anInt5530 > 0) {
			Static32.method596();
		} else {
			Static94.aClass221_2 = Static88.aClass221_1;
			Static88.aClass221_1 = null;
			Static104.method2180(40);
		}
	}
}
