import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!fga", name = "k", descriptor = "I")
	public static int anInt7434;

	@OriginalMember(owner = "client!fga", name = "l", descriptor = "J")
	public static long aLong204;

	@OriginalMember(owner = "client!fga", name = "p", descriptor = "[Z")
	public static boolean[] aBooleanArray26;

	@OriginalMember(owner = "client!fga", name = "g", descriptor = "Z")
	public static boolean aBoolean620 = true;

	@OriginalMember(owner = "client!fga", name = "i", descriptor = "I")
	public static int anInt7433 = -1;

	@OriginalMember(owner = "client!fga", name = "j", descriptor = "[I")
	public static final int[] anIntArray499 = new int[14];

	@OriginalMember(owner = "client!fga", name = "o", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_126 = new Class349(17, -1);

	@OriginalMember(owner = "client!fga", name = "q", descriptor = "I")
	public static int anInt7437 = 0;

	@OriginalMember(owner = "client!fga", name = "r", descriptor = "Lclient!mh;")
	public static final Class225 aClass225_25 = new Class225(2, 2);

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(BI)I")
	public static int method5990(@OriginalArg(1) int arg0) {
		return arg0 == 16711935 ? -1 : Static465.method5998(arg0);
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(III)Z")
	public static boolean method5992(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method5993(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(16) int local16 = 0; local16 < Static107.anInt1861; local16++) {
			if (arg0.equalsIgnoreCase(Static394.aStringArray33[local16])) {
				return local16;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fga", name = "b", descriptor = "(II)Lclient!eo;")
	public static Class2_Sub4 method5994(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return new Class2_Sub4_Sub30();
		} else if (arg0 == 1) {
			return new Class2_Sub4_Sub28();
		} else if (arg0 == 2) {
			return new Class2_Sub4_Sub16();
		} else if (arg0 == 3) {
			return new Class2_Sub4_Sub37();
		} else if (arg0 == 4) {
			return new Class2_Sub4_Sub33();
		} else if (arg0 == 5) {
			return new Class2_Sub4_Sub32();
		} else if (arg0 == 6) {
			return new Class2_Sub4_Sub24();
		} else if (arg0 == 7) {
			return new Class2_Sub4_Sub13();
		} else if (arg0 == 8) {
			return new Class2_Sub4_Sub6();
		} else if (arg0 == 9) {
			return new Class2_Sub4_Sub5();
		} else if (arg0 == 10) {
			return new Class2_Sub4_Sub35();
		} else if (arg0 == 11) {
			return new Class2_Sub4_Sub18();
		} else if (arg0 == 12) {
			return new Class2_Sub4_Sub4();
		} else if (arg0 == 13) {
			return new Class2_Sub4_Sub31();
		} else if (arg0 == 14) {
			return new Class2_Sub4_Sub20();
		} else if (arg0 == 15) {
			return new Class2_Sub4_Sub29();
		} else if (arg0 == 16) {
			return new Class2_Sub4_Sub3();
		} else if (arg0 == 17) {
			return new Class2_Sub4_Sub12();
		} else if (arg0 == 18) {
			return new Class2_Sub4_Sub19_Sub1();
		} else if (arg0 == 19) {
			return new Class2_Sub4_Sub23();
		} else if (arg0 == 20) {
			return new Class2_Sub4_Sub34();
		} else if (arg0 == 21) {
			return new Class2_Sub4_Sub38();
		} else if (arg0 == 22) {
			return new Class2_Sub4_Sub8();
		} else if (arg0 == 23) {
			return new Class2_Sub4_Sub22();
		} else if (arg0 == 24) {
			return new Class2_Sub4_Sub9();
		} else if (arg0 == 25) {
			return new Class2_Sub4_Sub15();
		} else if (arg0 == 26) {
			return new Class2_Sub4_Sub14();
		} else if (arg0 == 27) {
			return new Class2_Sub4_Sub36();
		} else if (arg0 == 28) {
			return new Class2_Sub4_Sub1();
		} else if (arg0 == 29) {
			return new Class2_Sub4_Sub10();
		} else if (arg0 == 30) {
			return new Class2_Sub4_Sub7();
		} else if (arg0 == 31) {
			return new Class2_Sub4_Sub17();
		} else if (arg0 == 32) {
			return new Class2_Sub4_Sub11();
		} else if (arg0 == 33) {
			return new Class2_Sub4_Sub21();
		} else if (arg0 == 34) {
			return new Class2_Sub4_Sub26();
		} else if (arg0 == 35) {
			return new Class2_Sub4_Sub2();
		} else if (arg0 == 36) {
			return new Class2_Sub4_Sub39();
		} else if (arg0 == 37) {
			return new Class2_Sub4_Sub27();
		} else if (arg0 == 38) {
			return new Class2_Sub4_Sub25();
		} else if (arg0 == 39) {
			return new Class2_Sub4_Sub19();
		} else {
			return null;
		}
	}
}
