import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static557 {

	@OriginalMember(owner = "client!vfa", name = "d", descriptor = "I")
	public static int anInt1156;

	@OriginalMember(owner = "client!vfa", name = "I", descriptor = "Lclient!jn;")
	public static Class176 aClass176_27;

	@OriginalMember(owner = "client!vfa", name = "N", descriptor = "I")
	private static int anInt1187;

	@OriginalMember(owner = "client!vfa", name = "O", descriptor = "I")
	private static int anInt1188;

	@OriginalMember(owner = "client!vfa", name = "P", descriptor = "Z")
	private static boolean aBoolean71;

	@OriginalMember(owner = "client!vfa", name = "Q", descriptor = "I")
	private static int anInt1189;

	@OriginalMember(owner = "client!vfa", name = "R", descriptor = "I")
	private static int anInt1190;

	@OriginalMember(owner = "client!vfa", name = "S", descriptor = "Z")
	private static boolean aBoolean72;

	@OriginalMember(owner = "client!vfa", name = "T", descriptor = "Z")
	private static boolean aBoolean73;

	@OriginalMember(owner = "client!vfa", name = "U", descriptor = "Z")
	private static boolean aBoolean74;

	@OriginalMember(owner = "client!vfa", name = "V", descriptor = "I")
	private static int anInt1191;

	@OriginalMember(owner = "client!vfa", name = "W", descriptor = "Z")
	private static boolean aBoolean75;

	@OriginalMember(owner = "client!vfa", name = "X", descriptor = "Z")
	private static boolean aBoolean76;

	@OriginalMember(owner = "client!vfa", name = "Y", descriptor = "I")
	private static int anInt1192;

	@OriginalMember(owner = "client!vfa", name = "Z", descriptor = "Z")
	private static boolean aBoolean77;

	@OriginalMember(owner = "client!vfa", name = "ab", descriptor = "Z")
	private static boolean aBoolean78;

	@OriginalMember(owner = "client!vfa", name = "r", descriptor = "[I")
	public static final int[] anIntArray43 = new int[14];

	@OriginalMember(owner = "client!vfa", name = "d", descriptor = "(B)V")
	public static void method1156() {
		@Pc(5) int local5 = 0;
		if (Static214.aClass4_Sub19_Sub1_1 != null) {
			local5 = Static214.aClass4_Sub19_Sub1_1.method2796(Static495.anInt9000);
		}
		@Pc(41) int local41;
		@Pc(57) int local57;
		if (local5 == 2) {
			local41 = Static286.anInt5862 > 800 ? 800 : Static286.anInt5862;
			local57 = Static238.anInt4332 > 600 ? 600 : Static238.anInt4332;
			Static554.anInt9828 = local41;
			Static580.anInt2905 = (Static286.anInt5862 - local41) / 2;
			Static375.anInt7256 = local57;
			Static179.anInt3617 = 0;
		} else if (local5 == 1) {
			local41 = Static286.anInt5862 <= 1024 ? Static286.anInt5862 : 1024;
			Static580.anInt2905 = (Static286.anInt5862 - local41) / 2;
			Static554.anInt9828 = local41;
			local57 = Static238.anInt4332 <= 768 ? Static238.anInt4332 : 768;
			Static375.anInt7256 = local57;
			Static179.anInt3617 = 0;
		} else {
			Static580.anInt2905 = 0;
			Static179.anInt3617 = 0;
			Static375.anInt7256 = Static238.anInt4332;
			Static554.anInt9828 = Static286.anInt5862;
		}
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(II)Lclient!mba;")
	public static Class4_Sub1 method1158(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return new Class4_Sub1_Sub31();
		} else if (arg0 == 1) {
			return new Class4_Sub1_Sub17();
		} else if (arg0 == 2) {
			return new Class4_Sub1_Sub25();
		} else if (arg0 == 3) {
			return new Class4_Sub1_Sub10();
		} else if (arg0 == 4) {
			return new Class4_Sub1_Sub24();
		} else if (arg0 == 5) {
			return new Class4_Sub1_Sub33();
		} else if (arg0 == 6) {
			return new Class4_Sub1_Sub15();
		} else if (arg0 == 7) {
			return new Class4_Sub1_Sub35();
		} else if (arg0 == 8) {
			return new Class4_Sub1_Sub12();
		} else if (arg0 == 9) {
			return new Class4_Sub1_Sub21();
		} else if (arg0 == 10) {
			return new Class4_Sub1_Sub5();
		} else if (arg0 == 11) {
			return new Class4_Sub1_Sub37();
		} else if (arg0 == 12) {
			return new Class4_Sub1_Sub19();
		} else if (arg0 == 13) {
			return new Class4_Sub1_Sub11();
		} else if (arg0 == 14) {
			return new Class4_Sub1_Sub38();
		} else if (arg0 == 15) {
			return new Class4_Sub1_Sub36();
		} else if (arg0 == 16) {
			return new Class4_Sub1_Sub1();
		} else if (arg0 == 17) {
			return new Class4_Sub1_Sub30();
		} else if (arg0 == 18) {
			return new Class4_Sub1_Sub18_Sub1();
		} else if (arg0 == 19) {
			return new Class4_Sub1_Sub23();
		} else if (arg0 == 20) {
			return new Class4_Sub1_Sub16();
		} else if (arg0 == 21) {
			return new Class4_Sub1_Sub20();
		} else if (arg0 == 22) {
			return new Class4_Sub1_Sub7();
		} else if (arg0 == 23) {
			return new Class4_Sub1_Sub13();
		} else if (arg0 == 24) {
			return new Class4_Sub1_Sub9();
		} else if (arg0 == 25) {
			return new Class4_Sub1_Sub28();
		} else if (arg0 == 26) {
			return new Class4_Sub1_Sub32();
		} else if (arg0 == 27) {
			return new Class4_Sub1_Sub22();
		} else if (arg0 == 28) {
			return new Class4_Sub1_Sub26();
		} else if (arg0 == 29) {
			return new Class4_Sub1_Sub8();
		} else if (arg0 == 30) {
			return new Class4_Sub1_Sub34();
		} else if (arg0 == 31) {
			return new Class4_Sub1_Sub14();
		} else if (arg0 == 32) {
			return new Class4_Sub1_Sub6();
		} else if (arg0 == 33) {
			return new Class4_Sub1_Sub29();
		} else if (arg0 == 34) {
			return new Class4_Sub1_Sub4();
		} else if (arg0 == 35) {
			return new Class4_Sub1_Sub39();
		} else if (arg0 == 36) {
			return new Class4_Sub1_Sub2();
		} else if (arg0 == 37) {
			return new Class4_Sub1_Sub3();
		} else if (arg0 == 38) {
			return new Class4_Sub1_Sub27();
		} else if (arg0 == 39) {
			return new Class4_Sub1_Sub18();
		} else {
			return null;
		}
	}
}
