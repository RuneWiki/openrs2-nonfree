import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!gh", name = "G", descriptor = "I")
	public static int anInt1547 = 0;

	@OriginalMember(owner = "client!gh", name = "K", descriptor = "Z")
	public static boolean aBoolean73 = true;

	@OriginalMember(owner = "client!gh", name = "P", descriptor = "Lclient!ia;")
	public static Class51 aClass51_508 = Static64.method1101("W-=hlen Sie eine Option");

	@OriginalMember(owner = "client!gh", name = "R", descriptor = "[I")
	public static int[] anIntArray101 = new int[128];

	@OriginalMember(owner = "client!gh", name = "U", descriptor = "Lclient!ia;")
	public static Class51 aClass51_509 = Static64.method1101("p12_full");

	@OriginalMember(owner = "client!gh", name = "W", descriptor = "Lclient!sf;")
	public static Class105 aClass105_8 = new Class105();

	@OriginalMember(owner = "client!gh", name = "Z", descriptor = "Lclient!ie;")
	public static Class53 aClass53_13 = new Class53(30);

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "(II)Lclient!mg;")
	public static Class1_Sub1 method1186(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return new Class1_Sub1_Sub17();
		} else if (arg0 == 1) {
			return new Class1_Sub1_Sub26();
		} else if (arg0 == 2) {
			return new Class1_Sub1_Sub30();
		} else if (arg0 == 3) {
			return new Class1_Sub1_Sub16();
		} else if (arg0 == 4) {
			return new Class1_Sub1_Sub6();
		} else if (arg0 == 5) {
			return new Class1_Sub1_Sub25();
		} else if (arg0 == 6) {
			return new Class1_Sub1_Sub18();
		} else if (arg0 == 7) {
			return new Class1_Sub1_Sub19();
		} else if (arg0 == 8) {
			return new Class1_Sub1_Sub29();
		} else if (arg0 == 9) {
			return new Class1_Sub1_Sub32();
		} else if (arg0 == 10) {
			return new Class1_Sub1_Sub39();
		} else if (arg0 == 11) {
			return new Class1_Sub1_Sub11();
		} else if (arg0 == 12) {
			return new Class1_Sub1_Sub15();
		} else if (arg0 == 13) {
			return new Class1_Sub1_Sub21();
		} else if (arg0 == 14) {
			return new Class1_Sub1_Sub13();
		} else if (arg0 == 15) {
			return new Class1_Sub1_Sub28();
		} else if (arg0 == 16) {
			return new Class1_Sub1_Sub24();
		} else if (arg0 == 17) {
			return new Class1_Sub1_Sub7();
		} else if (arg0 == 18) {
			return new Class1_Sub1_Sub4_Sub1();
		} else if (arg0 == 19) {
			return new Class1_Sub1_Sub9();
		} else if (arg0 == 20) {
			return new Class1_Sub1_Sub14();
		} else if (arg0 == 21) {
			return new Class1_Sub1_Sub34();
		} else if (arg0 == 22) {
			return new Class1_Sub1_Sub22();
		} else if (arg0 == 23) {
			return new Class1_Sub1_Sub3();
		} else if (arg0 == 24) {
			return new Class1_Sub1_Sub35();
		} else if (arg0 == 25) {
			return new Class1_Sub1_Sub2();
		} else if (arg0 == 26) {
			return new Class1_Sub1_Sub38();
		} else if (arg0 == 27) {
			return new Class1_Sub1_Sub23();
		} else if (arg0 == 28) {
			return new Class1_Sub1_Sub20();
		} else if (arg0 == 29) {
			return new Class1_Sub1_Sub1();
		} else if (arg0 == 30) {
			return new Class1_Sub1_Sub37();
		} else if (arg0 == 31) {
			return new Class1_Sub1_Sub27();
		} else if (arg0 == 32) {
			return new Class1_Sub1_Sub33();
		} else if (arg0 == 33) {
			return new Class1_Sub1_Sub12();
		} else if (arg0 == 34) {
			return new Class1_Sub1_Sub10();
		} else if (arg0 == 35) {
			return new Class1_Sub1_Sub31();
		} else if (arg0 == 36) {
			return new Class1_Sub1_Sub36();
		} else if (arg0 == 37) {
			return new Class1_Sub1_Sub8();
		} else if (arg0 == 38) {
			return new Class1_Sub1_Sub5();
		} else if (arg0 == 39) {
			return new Class1_Sub1_Sub4();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "(B)V")
	public static void method1187() {
		Static140.aClass53_22.method1498();
		Static76.aClass53_15.method1498();
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Ljava/lang/Object;IZ)[B")
	public static byte[] method1189(@OriginalArg(0) Object arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg0;
			return arg1 ? Static89.method1027(local13) : local13;
		} else if (arg0 instanceof Class109) {
			@Pc(27) Class109 local27 = (Class109) arg0;
			return local27.method3263();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
