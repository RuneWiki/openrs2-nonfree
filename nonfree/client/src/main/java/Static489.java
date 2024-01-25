import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static489 {

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "Lclient!pe;")
	public static Class246 aClass246_6;

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "Ljava/lang/Object;")
	public static Object anObject20;

	@OriginalMember(owner = "client!tg", name = "h", descriptor = "Lclient!ta;")
	public static Class73 aClass73_5;

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V")
	public static void method7368() {
		if (Static506.aBoolean678) {
			return;
		}
		Static506.aBoolean678 = true;
		Static399.aBoolean713 = true;
		if (Static104.aClass6_Sub6_Sub1_4.aBoolean137) {
			Static200.aFloat100 = (int) Static200.aFloat100 + 47 & 0xFFFFFFF0;
		} else {
			Static342.aFloat131 += (12.0F - Static342.aFloat131) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!iaa;I)Lclient!fca;")
	public static Class101_Sub1 method7369(@OriginalArg(0) Class6_Sub26 arg0) {
		@Pc(9) Class101 local9 = Static170.method3473(arg0);
		@Pc(13) int local13 = arg0.method5000();
		@Pc(22) int local22 = arg0.method5000();
		@Pc(26) int local26 = arg0.method4999();
		return new Class101_Sub1(local9.aClass148_10, local9.aClass49_11, local9.anInt9011, local9.anInt9013, local9.anInt9016, local9.anInt9009, local9.anInt9010, local13, local22, local26);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IZ)Lclient!cc;")
	public static Class6_Sub1 method7370(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return new Class6_Sub1_Sub12();
		} else if (arg0 == 1) {
			return new Class6_Sub1_Sub16();
		} else if (arg0 == 2) {
			return new Class6_Sub1_Sub26();
		} else if (arg0 == 3) {
			return new Class6_Sub1_Sub29();
		} else if (arg0 == 4) {
			return new Class6_Sub1_Sub3();
		} else if (arg0 == 5) {
			return new Class6_Sub1_Sub36();
		} else if (arg0 == 6) {
			return new Class6_Sub1_Sub11();
		} else if (arg0 == 7) {
			return new Class6_Sub1_Sub20();
		} else if (arg0 == 8) {
			return new Class6_Sub1_Sub8();
		} else if (arg0 == 9) {
			return new Class6_Sub1_Sub14();
		} else if (arg0 == 10) {
			return new Class6_Sub1_Sub35();
		} else if (arg0 == 11) {
			return new Class6_Sub1_Sub7();
		} else if (arg0 == 12) {
			return new Class6_Sub1_Sub32();
		} else if (arg0 == 13) {
			return new Class6_Sub1_Sub27();
		} else if (arg0 == 14) {
			return new Class6_Sub1_Sub19();
		} else if (arg0 == 15) {
			return new Class6_Sub1_Sub17();
		} else if (arg0 == 16) {
			return new Class6_Sub1_Sub13();
		} else if (arg0 == 17) {
			return new Class6_Sub1_Sub34();
		} else if (arg0 == 18) {
			return new Class6_Sub1_Sub18_Sub1();
		} else if (arg0 == 19) {
			return new Class6_Sub1_Sub23();
		} else if (arg0 == 20) {
			return new Class6_Sub1_Sub24();
		} else if (arg0 == 21) {
			return new Class6_Sub1_Sub33();
		} else if (arg0 == 22) {
			return new Class6_Sub1_Sub39();
		} else if (arg0 == 23) {
			return new Class6_Sub1_Sub28();
		} else if (arg0 == 24) {
			return new Class6_Sub1_Sub38();
		} else if (arg0 == 25) {
			return new Class6_Sub1_Sub4();
		} else if (arg0 == 26) {
			return new Class6_Sub1_Sub5();
		} else if (arg0 == 27) {
			return new Class6_Sub1_Sub2();
		} else if (arg0 == 28) {
			return new Class6_Sub1_Sub21();
		} else if (arg0 == 29) {
			return new Class6_Sub1_Sub10();
		} else if (arg0 == 30) {
			return new Class6_Sub1_Sub1();
		} else if (arg0 == 31) {
			return new Class6_Sub1_Sub9();
		} else if (arg0 == 32) {
			return new Class6_Sub1_Sub25();
		} else if (arg0 == 33) {
			return new Class6_Sub1_Sub31();
		} else if (arg0 == 34) {
			return new Class6_Sub1_Sub37();
		} else if (arg0 == 35) {
			return new Class6_Sub1_Sub15();
		} else if (arg0 == 36) {
			return new Class6_Sub1_Sub6();
		} else if (arg0 == 37) {
			return new Class6_Sub1_Sub30();
		} else if (arg0 == 38) {
			return new Class6_Sub1_Sub22();
		} else if (arg0 == 39) {
			return new Class6_Sub1_Sub18();
		} else {
			return null;
		}
	}
}
