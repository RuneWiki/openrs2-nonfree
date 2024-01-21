import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!db", name = "d", descriptor = "Lclient!sb;")
	public static Class25 aClass25_26;

	@OriginalMember(owner = "client!db", name = "f", descriptor = "[I")
	public static int[] anIntArray36;

	@OriginalMember(owner = "client!db", name = "i", descriptor = "[I")
	public static int[] anIntArray37;

	@OriginalMember(owner = "client!db", name = "k", descriptor = "I")
	public static int anInt492;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "[Lclient!ad;")
	public static Class4[] aClass4Array2 = new Class4[200];

	@OriginalMember(owner = "client!db", name = "b", descriptor = "I")
	public static int anInt488 = 0;

	@OriginalMember(owner = "client!db", name = "c", descriptor = "I")
	public static volatile int anInt489 = 0;

	@OriginalMember(owner = "client!db", name = "e", descriptor = "Z")
	public static boolean aBoolean32 = false;

	@OriginalMember(owner = "client!db", name = "g", descriptor = "I")
	public static int anInt490 = -1;

	@OriginalMember(owner = "client!db", name = "o", descriptor = "Lclient!ad;")
	private static Class4 aClass4_254 = Static75.method1216("Too many connections from your address)3");

	@OriginalMember(owner = "client!db", name = "h", descriptor = "Lclient!ad;")
	public static Class4 aClass4_250 = aClass4_254;

	@OriginalMember(owner = "client!db", name = "l", descriptor = "Lclient!ad;")
	public static Class4 aClass4_251 = Static75.method1216("nicht hergestellt werden)3");

	@OriginalMember(owner = "client!db", name = "m", descriptor = "Lclient!ad;")
	public static Class4 aClass4_252 = Static75.method1216("Bitte versuchen Sie es in ");

	@OriginalMember(owner = "client!db", name = "n", descriptor = "Lclient!ad;")
	public static Class4 aClass4_253 = Static75.method1216("Gegenstand konnte nicht gefunden werden)1 verk-Urzen Sie den Suchbegriff)3");

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)V")
	public static void method295() {
		aClass25_26 = null;
		aClass4_254 = null;
		aClass4_252 = null;
		anIntArray37 = null;
		aClass4_251 = null;
		anIntArray36 = null;
		aClass4_253 = null;
		aClass4Array2 = null;
		aClass4_250 = null;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!ad;Lclient!ad;ZI)V")
	public static void method296(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(3) int arg2) {
		if (Static6.anInt259 == -1) {
			Static86.aBoolean153 = true;
		}
		if (arg2 == 0 && Static77.anInt1841 != -1) {
			Static29.aClass4_444 = arg0;
			Static77.anInt1842 = 0;
		}
		for (@Pc(21) int local21 = 99; local21 > 0; local21--) {
			Static42.anIntArray157[local21] = Static42.anIntArray157[local21 - 1];
			Static100.aClass4Array18[local21] = Static100.aClass4Array18[local21 - 1];
			Static83.aClass4Array15[local21] = Static83.aClass4Array15[local21 - 1];
		}
		Static42.anIntArray157[0] = arg2;
		Static100.aClass4Array18[0] = arg1;
		Static83.aClass4Array15[0] = arg0;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V")
	public static void method297() {
		Static39.anIntArray112 = null;
		Static34.anIntArray96 = null;
		Static55.anIntArray188 = null;
		Static16.aByteArrayArray2 = null;
		Static15.anIntArray31 = null;
		Static42.anIntArray156 = null;
	}
}
