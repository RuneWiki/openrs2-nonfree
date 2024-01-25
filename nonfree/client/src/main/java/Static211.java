import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!hha", name = "b", descriptor = "(Z)V")
	public static void method4171() {
		if (Static251.aClass8_1 != null) {
			Static251.aClass8_1.method172();
		}
		if (Static474.aThread5 == null) {
			return;
		}
		while (true) {
			try {
				Static474.aThread5.join();
				return;
			} catch (@Pc(18) InterruptedException local18) {
			}
		}
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(IB)Lclient!tf;")
	public static Class2_Sub3 method4172(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return new Class2_Sub3_Sub23();
		} else if (arg0 == 1) {
			return new Class2_Sub3_Sub25();
		} else if (arg0 == 2) {
			return new Class2_Sub3_Sub26();
		} else if (arg0 == 3) {
			return new Class2_Sub3_Sub13();
		} else if (arg0 == 4) {
			return new Class2_Sub3_Sub29();
		} else if (arg0 == 5) {
			return new Class2_Sub3_Sub8();
		} else if (arg0 == 6) {
			return new Class2_Sub3_Sub9();
		} else if (arg0 == 7) {
			return new Class2_Sub3_Sub24();
		} else if (arg0 == 8) {
			return new Class2_Sub3_Sub22();
		} else if (arg0 == 9) {
			return new Class2_Sub3_Sub16();
		} else if (arg0 == 10) {
			return new Class2_Sub3_Sub2();
		} else if (arg0 == 11) {
			return new Class2_Sub3_Sub32();
		} else if (arg0 == 12) {
			return new Class2_Sub3_Sub7();
		} else if (arg0 == 13) {
			return new Class2_Sub3_Sub27();
		} else if (arg0 == 14) {
			return new Class2_Sub3_Sub20();
		} else if (arg0 == 15) {
			return new Class2_Sub3_Sub14();
		} else if (arg0 == 16) {
			return new Class2_Sub3_Sub11();
		} else if (arg0 == 17) {
			return new Class2_Sub3_Sub36();
		} else if (arg0 == 18) {
			return new Class2_Sub3_Sub5_Sub1();
		} else if (arg0 == 19) {
			return new Class2_Sub3_Sub15();
		} else if (arg0 == 20) {
			return new Class2_Sub3_Sub37();
		} else if (arg0 == 21) {
			return new Class2_Sub3_Sub33();
		} else if (arg0 == 22) {
			return new Class2_Sub3_Sub38();
		} else if (arg0 == 23) {
			return new Class2_Sub3_Sub39();
		} else if (arg0 == 24) {
			return new Class2_Sub3_Sub21();
		} else if (arg0 == 25) {
			return new Class2_Sub3_Sub1();
		} else if (arg0 == 26) {
			return new Class2_Sub3_Sub12();
		} else if (arg0 == 27) {
			return new Class2_Sub3_Sub30();
		} else if (arg0 == 28) {
			return new Class2_Sub3_Sub3();
		} else if (arg0 == 29) {
			return new Class2_Sub3_Sub10();
		} else if (arg0 == 30) {
			return new Class2_Sub3_Sub19();
		} else if (arg0 == 31) {
			return new Class2_Sub3_Sub31();
		} else if (arg0 == 32) {
			return new Class2_Sub3_Sub6();
		} else if (arg0 == 33) {
			return new Class2_Sub3_Sub4();
		} else if (arg0 == 34) {
			return new Class2_Sub3_Sub17();
		} else if (arg0 == 35) {
			return new Class2_Sub3_Sub18();
		} else if (arg0 == 36) {
			return new Class2_Sub3_Sub35();
		} else if (arg0 == 37) {
			return new Class2_Sub3_Sub28();
		} else if (arg0 == 38) {
			return new Class2_Sub3_Sub34();
		} else if (arg0 == 39) {
			return new Class2_Sub3_Sub5();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hha", name = "f", descriptor = "(I)Lclient!ef;")
	public static Class89 method4173() {
		try {
			return (Class89) Class.forName("Class89_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return null;
		}
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(Lclient!jda;I)V")
	public static void method4175(@OriginalArg(0) Class3_Sub4 arg0) {
		arg0.aClass3_Sub1_15 = null;
		@Pc(12) int local12 = arg0.aClass3_Sub3Array1.length;
		for (@Pc(22) int local22 = 0; local22 < local12; local22++) {
			arg0.aClass3_Sub3Array1[local22].aBoolean411 = false;
		}
		@Pc(40) Class325[] local40 = Class3.aClass325Array33;
		synchronized (Class3.aClass325Array33) {
			if (local12 < Class3.aClass325Array33.length && Static102.anIntArray141[local12] < 200) {
				Class3.aClass325Array33[local12].method8013(arg0);
				@Pc(67) int local67 = Static102.anIntArray141[local12]++;
			}
		}
	}
}
