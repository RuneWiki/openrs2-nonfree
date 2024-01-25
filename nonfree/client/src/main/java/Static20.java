import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!aw", name = "l", descriptor = "F")
	public static float aFloat55;

	@OriginalMember(owner = "client!aw", name = "m", descriptor = "Lclient!ok;")
	public static Class178 aClass178_33;

	@OriginalMember(owner = "client!aw", name = "n", descriptor = "Lclient!ok;")
	public static Class178 aClass178_34;

	@OriginalMember(owner = "client!aw", name = "o", descriptor = "I")
	public static int anInt2216;

	@OriginalMember(owner = "client!aw", name = "i", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_41 = new Class2(39, 15);

	@OriginalMember(owner = "client!aw", name = "k", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_42 = new Class2(28, 8);

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(II)Lclient!vn;")
	public static Class7_Sub3 method1881(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return new Class7_Sub3_Sub26();
		} else if (arg0 == 1) {
			return new Class7_Sub3_Sub10();
		} else if (arg0 == 2) {
			return new Class7_Sub3_Sub21();
		} else if (arg0 == 3) {
			return new Class7_Sub3_Sub9();
		} else if (arg0 == 4) {
			return new Class7_Sub3_Sub35();
		} else if (arg0 == 5) {
			return new Class7_Sub3_Sub1();
		} else if (arg0 == 6) {
			return new Class7_Sub3_Sub27();
		} else if (arg0 == 7) {
			return new Class7_Sub3_Sub36();
		} else if (arg0 == 8) {
			return new Class7_Sub3_Sub14();
		} else if (arg0 == 9) {
			return new Class7_Sub3_Sub19();
		} else if (arg0 == 10) {
			return new Class7_Sub3_Sub33();
		} else if (arg0 == 11) {
			return new Class7_Sub3_Sub25();
		} else if (arg0 == 12) {
			return new Class7_Sub3_Sub32();
		} else if (arg0 == 13) {
			return new Class7_Sub3_Sub5();
		} else if (arg0 == 14) {
			return new Class7_Sub3_Sub23();
		} else if (arg0 == 15) {
			return new Class7_Sub3_Sub13();
		} else if (arg0 == 16) {
			return new Class7_Sub3_Sub6();
		} else if (arg0 == 17) {
			return new Class7_Sub3_Sub7();
		} else if (arg0 == 18) {
			return new Class7_Sub3_Sub22_Sub1();
		} else if (arg0 == 19) {
			return new Class7_Sub3_Sub16();
		} else if (arg0 == 20) {
			return new Class7_Sub3_Sub2();
		} else if (arg0 == 21) {
			return new Class7_Sub3_Sub31();
		} else if (arg0 == 22) {
			return new Class7_Sub3_Sub8();
		} else if (arg0 == 23) {
			return new Class7_Sub3_Sub34();
		} else if (arg0 == 24) {
			return new Class7_Sub3_Sub38();
		} else if (arg0 == 25) {
			return new Class7_Sub3_Sub18();
		} else if (arg0 == 26) {
			return new Class7_Sub3_Sub12();
		} else if (arg0 == 27) {
			return new Class7_Sub3_Sub11();
		} else if (arg0 == 28) {
			return new Class7_Sub3_Sub20();
		} else if (arg0 == 29) {
			return new Class7_Sub3_Sub17();
		} else if (arg0 == 30) {
			return new Class7_Sub3_Sub3();
		} else if (arg0 == 31) {
			return new Class7_Sub3_Sub28();
		} else if (arg0 == 32) {
			return new Class7_Sub3_Sub24();
		} else if (arg0 == 33) {
			return new Class7_Sub3_Sub15();
		} else if (arg0 == 34) {
			return new Class7_Sub3_Sub4();
		} else if (arg0 == 35) {
			return new Class7_Sub3_Sub39();
		} else if (arg0 == 36) {
			return new Class7_Sub3_Sub37();
		} else if (arg0 == 37) {
			return new Class7_Sub3_Sub30();
		} else if (arg0 == 38) {
			return new Class7_Sub3_Sub29();
		} else if (arg0 == 39) {
			return new Class7_Sub3_Sub22();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!aw", name = "c", descriptor = "(I)V")
	public static void method1884() {
		if (Static85.anInt1679 != 3) {
			Static393.aClass124_5 = Static214.aClass124_3;
		}
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(BC)B")
	public static byte method1886(@OriginalArg(1) char arg0) {
		@Pc(36) byte local36;
		if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
			local36 = (byte) arg0;
		} else if (arg0 == '€') {
			local36 = -128;
		} else if (arg0 == '‚') {
			local36 = -126;
		} else if (arg0 == 'ƒ') {
			local36 = -125;
		} else if (arg0 == '„') {
			local36 = -124;
		} else if (arg0 == '…') {
			local36 = -123;
		} else if (arg0 == '†') {
			local36 = -122;
		} else if (arg0 == '‡') {
			local36 = -121;
		} else if (arg0 == 'ˆ') {
			local36 = -120;
		} else if (arg0 == '‰') {
			local36 = -119;
		} else if (arg0 == 'Š') {
			local36 = -118;
		} else if (arg0 == '‹') {
			local36 = -117;
		} else if (arg0 == 'Œ') {
			local36 = -116;
		} else if (arg0 == 'Ž') {
			local36 = -114;
		} else if (arg0 == '‘') {
			local36 = -111;
		} else if (arg0 == '’') {
			local36 = -110;
		} else if (arg0 == '“') {
			local36 = -109;
		} else if (arg0 == '”') {
			local36 = -108;
		} else if (arg0 == '•') {
			local36 = -107;
		} else if (arg0 == '–') {
			local36 = -106;
		} else if (arg0 == '—') {
			local36 = -105;
		} else if (arg0 == '˜') {
			local36 = -104;
		} else if (arg0 == '™') {
			local36 = -103;
		} else if (arg0 == 'š') {
			local36 = -102;
		} else if (arg0 == '›') {
			local36 = -101;
		} else if (arg0 == 'œ') {
			local36 = -100;
		} else if (arg0 == 'ž') {
			local36 = -98;
		} else if (arg0 == 'Ÿ') {
			local36 = -97;
		} else {
			local36 = 63;
		}
		return local36;
	}
}
