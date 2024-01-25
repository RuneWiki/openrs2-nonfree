import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!pn", name = "H", descriptor = "I")
	public static int anInt5456;

	@OriginalMember(owner = "client!pn", name = "S", descriptor = "Lclient!os;")
	public static final Class182 aClass182_195 = new Class182("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method4336(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(18) char local18 = arg0.charAt(local12);
			if (local18 <= '\u007f') {
				local10++;
			} else if (local18 <= '\u07ff') {
				local10 += 2;
			} else {
				local10 += 3;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(II)Lclient!ej;")
	public static Class10_Sub2 method4338(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return new Class10_Sub2_Sub6();
		} else if (arg0 == 1) {
			return new Class10_Sub2_Sub14();
		} else if (arg0 == 2) {
			return new Class10_Sub2_Sub3();
		} else if (arg0 == 3) {
			return new Class10_Sub2_Sub20();
		} else if (arg0 == 4) {
			return new Class10_Sub2_Sub9();
		} else if (arg0 == 5) {
			return new Class10_Sub2_Sub39();
		} else if (arg0 == 6) {
			return new Class10_Sub2_Sub38();
		} else if (arg0 == 7) {
			return new Class10_Sub2_Sub37();
		} else if (arg0 == 8) {
			return new Class10_Sub2_Sub19();
		} else if (arg0 == 9) {
			return new Class10_Sub2_Sub35();
		} else if (arg0 == 10) {
			return new Class10_Sub2_Sub5();
		} else if (arg0 == 11) {
			return new Class10_Sub2_Sub16();
		} else if (arg0 == 12) {
			return new Class10_Sub2_Sub32();
		} else if (arg0 == 13) {
			return new Class10_Sub2_Sub31();
		} else if (arg0 == 14) {
			return new Class10_Sub2_Sub12();
		} else if (arg0 == 15) {
			return new Class10_Sub2_Sub17();
		} else if (arg0 == 16) {
			return new Class10_Sub2_Sub25();
		} else if (arg0 == 17) {
			return new Class10_Sub2_Sub29();
		} else if (arg0 == 18) {
			return new Class10_Sub2_Sub13_Sub1();
		} else if (arg0 == 19) {
			return new Class10_Sub2_Sub10();
		} else if (arg0 == 20) {
			return new Class10_Sub2_Sub21();
		} else if (arg0 == 21) {
			return new Class10_Sub2_Sub23();
		} else if (arg0 == 22) {
			return new Class10_Sub2_Sub1();
		} else if (arg0 == 23) {
			return new Class10_Sub2_Sub15();
		} else if (arg0 == 24) {
			return new Class10_Sub2_Sub34();
		} else if (arg0 == 25) {
			return new Class10_Sub2_Sub28();
		} else if (arg0 == 26) {
			return new Class10_Sub2_Sub33();
		} else if (arg0 == 27) {
			return new Class10_Sub2_Sub36();
		} else if (arg0 == 28) {
			return new Class10_Sub2_Sub27();
		} else if (arg0 == 29) {
			return new Class10_Sub2_Sub8();
		} else if (arg0 == 30) {
			return new Class10_Sub2_Sub24();
		} else if (arg0 == 31) {
			return new Class10_Sub2_Sub11();
		} else if (arg0 == 32) {
			return new Class10_Sub2_Sub30();
		} else if (arg0 == 33) {
			return new Class10_Sub2_Sub2();
		} else if (arg0 == 34) {
			return new Class10_Sub2_Sub22();
		} else if (arg0 == 35) {
			return new Class10_Sub2_Sub26();
		} else if (arg0 == 36) {
			return new Class10_Sub2_Sub4();
		} else if (arg0 == 37) {
			return new Class10_Sub2_Sub7();
		} else if (arg0 == 38) {
			return new Class10_Sub2_Sub18();
		} else if (arg0 == 39) {
			return new Class10_Sub2_Sub13();
		} else {
			return null;
		}
	}
}
