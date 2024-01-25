import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static447 {

	@OriginalMember(owner = "client!wm", name = "H", descriptor = "Lclient!fj;")
	public static Class78 aClass78_1;

	@OriginalMember(owner = "client!wm", name = "P", descriptor = "Lclient!rt;")
	public static Class4_Sub1_Sub16 aClass4_Sub1_Sub16_3;

	@OriginalMember(owner = "client!wm", name = "R", descriptor = "[I")
	public static int[] anIntArray653;

	@OriginalMember(owner = "client!wm", name = "s", descriptor = "I")
	public static int anInt7438 = 999999;

	@OriginalMember(owner = "client!wm", name = "y", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray44 = new String[100];

	@OriginalMember(owner = "client!wm", name = "A", descriptor = "Lclient!vr;")
	public static final Class258 aClass258_49 = new Class258();

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IB)Lclient!nc;")
	public static Class4_Sub2 method5735(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return new Class4_Sub2_Sub22();
		} else if (arg0 == 1) {
			return new Class4_Sub2_Sub14();
		} else if (arg0 == 2) {
			return new Class4_Sub2_Sub37();
		} else if (arg0 == 3) {
			return new Class4_Sub2_Sub24();
		} else if (arg0 == 4) {
			return new Class4_Sub2_Sub9();
		} else if (arg0 == 5) {
			return new Class4_Sub2_Sub8();
		} else if (arg0 == 6) {
			return new Class4_Sub2_Sub13();
		} else if (arg0 == 7) {
			return new Class4_Sub2_Sub32();
		} else if (arg0 == 8) {
			return new Class4_Sub2_Sub29();
		} else if (arg0 == 9) {
			return new Class4_Sub2_Sub15();
		} else if (arg0 == 10) {
			return new Class4_Sub2_Sub2();
		} else if (arg0 == 11) {
			return new Class4_Sub2_Sub6();
		} else if (arg0 == 12) {
			return new Class4_Sub2_Sub12();
		} else if (arg0 == 13) {
			return new Class4_Sub2_Sub38();
		} else if (arg0 == 14) {
			return new Class4_Sub2_Sub4();
		} else if (arg0 == 15) {
			return new Class4_Sub2_Sub5();
		} else if (arg0 == 16) {
			return new Class4_Sub2_Sub17();
		} else if (arg0 == 17) {
			return new Class4_Sub2_Sub30();
		} else if (arg0 == 18) {
			return new Class4_Sub2_Sub19_Sub1();
		} else if (arg0 == 19) {
			return new Class4_Sub2_Sub33();
		} else if (arg0 == 20) {
			return new Class4_Sub2_Sub20();
		} else if (arg0 == 21) {
			return new Class4_Sub2_Sub39();
		} else if (arg0 == 22) {
			return new Class4_Sub2_Sub27();
		} else if (arg0 == 23) {
			return new Class4_Sub2_Sub11();
		} else if (arg0 == 24) {
			return new Class4_Sub2_Sub7();
		} else if (arg0 == 25) {
			return new Class4_Sub2_Sub18();
		} else if (arg0 == 26) {
			return new Class4_Sub2_Sub1();
		} else if (arg0 == 27) {
			return new Class4_Sub2_Sub3();
		} else if (arg0 == 28) {
			return new Class4_Sub2_Sub28();
		} else if (arg0 == 29) {
			return new Class4_Sub2_Sub26();
		} else if (arg0 == 30) {
			return new Class4_Sub2_Sub34();
		} else if (arg0 == 31) {
			return new Class4_Sub2_Sub35();
		} else if (arg0 == 32) {
			return new Class4_Sub2_Sub25();
		} else if (arg0 == 33) {
			return new Class4_Sub2_Sub21();
		} else if (arg0 == 34) {
			return new Class4_Sub2_Sub10();
		} else if (arg0 == 35) {
			return new Class4_Sub2_Sub16();
		} else if (arg0 == 36) {
			return new Class4_Sub2_Sub36();
		} else if (arg0 == 37) {
			return new Class4_Sub2_Sub23();
		} else if (arg0 == 38) {
			return new Class4_Sub2_Sub31();
		} else if (arg0 == 39) {
			return new Class4_Sub2_Sub19();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ZII)I")
	public static int method5736(@OriginalArg(1) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(47) int local47 = (arg0 & 0x7F) * 96 >> 7;
			if (local47 < 2) {
				local47 = 2;
			} else if (local47 > 126) {
				local47 = 126;
			}
			return local47 + (arg0 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(I)V")
	public static void method5738() {
		Static408.anInt6971 = 0;
		Static67.anInt1669 = 0;
		Static169.anInt3170 = 0;
		Static22.anInt6852 = 0;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILclient!tl;)Lclient!wa;")
	public static Class43_Sub4 method5740(@OriginalArg(1) Class4_Sub30 arg0) {
		return new Class43_Sub4(arg0.method4889(), arg0.method4889(), arg0.method4889(), arg0.method4889(), arg0.method4887(), arg0.method4887(), arg0.method4864());
	}
}
