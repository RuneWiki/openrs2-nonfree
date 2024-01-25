import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!kc", name = "y", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!kc", name = "A", descriptor = "Lclient!ko;")
	public static Class134 aClass134_5;

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray5 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "[I")
	public static final int[] anIntArray354 = new int[4];

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
	public static final int anInt5252 = 1339;

	@OriginalMember(owner = "client!kc", name = "r", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_168 = new Class189("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");

	@OriginalMember(owner = "client!kc", name = "u", descriptor = "[I")
	public static final int[] anIntArray356 = new int[4096];

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)Lclient!ko;")
	public static Class134 method4109(@OriginalArg(1) int arg0) {
		@Pc(13) Class134[] local13 = Static99.method1747();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Class134 local21 = local13[local15];
			if (local21.anInt4088 == arg0) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILclient!bw;)V")
	public static void method4111(@OriginalArg(1) Class33 arg0) {
		Static73.aClass33_1 = arg0;
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)V")
	public static void method4112() {
		if (Static115.aBoolean223) {
			return;
		}
		Static385.method5004(Static276.aClass118ArrayArrayArray3);
		if (Static38.aClass118ArrayArrayArray1 != null) {
			Static385.method5004(Static38.aClass118ArrayArrayArray1);
		}
		Static115.aBoolean223 = true;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BI)Lclient!qn;")
	public static Class3_Sub2 method4119(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return new Class3_Sub2_Sub33();
		} else if (arg0 == 1) {
			return new Class3_Sub2_Sub36();
		} else if (arg0 == 2) {
			return new Class3_Sub2_Sub18();
		} else if (arg0 == 3) {
			return new Class3_Sub2_Sub3();
		} else if (arg0 == 4) {
			return new Class3_Sub2_Sub12();
		} else if (arg0 == 5) {
			return new Class3_Sub2_Sub19();
		} else if (arg0 == 6) {
			return new Class3_Sub2_Sub30();
		} else if (arg0 == 7) {
			return new Class3_Sub2_Sub34();
		} else if (arg0 == 8) {
			return new Class3_Sub2_Sub21();
		} else if (arg0 == 9) {
			return new Class3_Sub2_Sub22();
		} else if (arg0 == 10) {
			return new Class3_Sub2_Sub13();
		} else if (arg0 == 11) {
			return new Class3_Sub2_Sub17();
		} else if (arg0 == 12) {
			return new Class3_Sub2_Sub15();
		} else if (arg0 == 13) {
			return new Class3_Sub2_Sub32();
		} else if (arg0 == 14) {
			return new Class3_Sub2_Sub23();
		} else if (arg0 == 15) {
			return new Class3_Sub2_Sub11();
		} else if (arg0 == 16) {
			return new Class3_Sub2_Sub24();
		} else if (arg0 == 17) {
			return new Class3_Sub2_Sub39();
		} else if (arg0 == 18) {
			return new Class3_Sub2_Sub27_Sub1();
		} else if (arg0 == 19) {
			return new Class3_Sub2_Sub6();
		} else if (arg0 == 20) {
			return new Class3_Sub2_Sub35();
		} else if (arg0 == 21) {
			return new Class3_Sub2_Sub8();
		} else if (arg0 == 22) {
			return new Class3_Sub2_Sub4();
		} else if (arg0 == 23) {
			return new Class3_Sub2_Sub25();
		} else if (arg0 == 24) {
			return new Class3_Sub2_Sub14();
		} else if (arg0 == 25) {
			return new Class3_Sub2_Sub1();
		} else if (arg0 == 26) {
			return new Class3_Sub2_Sub31();
		} else if (arg0 == 27) {
			return new Class3_Sub2_Sub2();
		} else if (arg0 == 28) {
			return new Class3_Sub2_Sub26();
		} else if (arg0 == 29) {
			return new Class3_Sub2_Sub38();
		} else if (arg0 == 30) {
			return new Class3_Sub2_Sub37();
		} else if (arg0 == 31) {
			return new Class3_Sub2_Sub20();
		} else if (arg0 == 32) {
			return new Class3_Sub2_Sub9();
		} else if (arg0 == 33) {
			return new Class3_Sub2_Sub16();
		} else if (arg0 == 34) {
			return new Class3_Sub2_Sub28();
		} else if (arg0 == 35) {
			return new Class3_Sub2_Sub29();
		} else if (arg0 == 36) {
			return new Class3_Sub2_Sub10();
		} else if (arg0 == 37) {
			return new Class3_Sub2_Sub7();
		} else if (arg0 == 38) {
			return new Class3_Sub2_Sub5();
		} else if (arg0 == 39) {
			return new Class3_Sub2_Sub27();
		} else {
			return null;
		}
	}
}
