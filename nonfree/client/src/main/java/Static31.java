import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!fa", name = "B", descriptor = "Lclient!la;")
	public static Class17 aClass17_10;

	@OriginalMember(owner = "client!fa", name = "T", descriptor = "[I")
	public static int[] anIntArray96;

	@OriginalMember(owner = "client!fa", name = "V", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!fa", name = "Z", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!fa", name = "I", descriptor = "Lclient!v;")
	private static Class76 aClass76_301 = Static134.method2017("Checking for updates )2 ");

	@OriginalMember(owner = "client!fa", name = "G", descriptor = "Lclient!v;")
	public static Class76 aClass76_300 = aClass76_301;

	@OriginalMember(owner = "client!fa", name = "Q", descriptor = "Lclient!wf;")
	public static Class83 aClass83_1 = new Class83();

	@OriginalMember(owner = "client!fa", name = "U", descriptor = "Lclient!v;")
	public static Class76 aClass76_302 = Static134.method2017(":duelreq:");

	@OriginalMember(owner = "client!fa", name = "W", descriptor = "Lclient!v;")
	public static Class76 aClass76_303 = Static134.method2017("weiss:");

	@OriginalMember(owner = "client!fa", name = "X", descriptor = "Lclient!ua;")
	public static Class72 aClass72_12 = new Class72(64);

	@OriginalMember(owner = "client!fa", name = "Y", descriptor = "[J")
	public static long[] aLongArray17 = new long[100];

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IJ)V")
	public static void method443(@OriginalArg(1) long arg0) {
		if (arg0 != 0L) {
			Static69.aClass4_Sub10_Sub1_2.method611(208);
			Static69.aClass4_Sub10_Sub1_2.method555(arg0);
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILclient!dd;)Z")
	public static boolean method444(@OriginalArg(1) Class4_Sub8 arg0) {
		if (Static99.aBoolean157) {
			if (Static35.method627(arg0) != 0) {
				return false;
			}
			if (arg0.anInt473 == 0) {
				return false;
			}
		}
		return arg0.aBoolean39;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIB)I")
	public static int method445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = arg0 >>> 31;
		return (arg0 + local15) / arg1 - local15;
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)V")
	public static void method447() {
		anIntArray96 = null;
		aClass72_12 = null;
		aClass17_10 = null;
		aClass76_303 = null;
		aLongArray17 = null;
		aByteArrayArrayArray3 = null;
		aClass76_300 = null;
		aClass76_301 = null;
		aByteArrayArrayArray2 = null;
		aClass83_1 = null;
		aClass76_302 = null;
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(B)V")
	public static void method448() {
		Static95.aFont1 = null;
		Static76.anImage3 = null;
		Static105.aFontMetrics1 = null;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!la;B)V")
	public static void method450(@OriginalArg(0) Class17 arg0) {
		Static103.aClass17_31 = arg0;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!dd;ZII)V")
	public static void method451(@OriginalArg(0) Class4_Sub8 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static17.aClass4_Sub8_1 != null || Static32.aBoolean56 || (arg0 == null || Static77.method1396(arg0) == null)) {
			return;
		}
		Static17.aClass4_Sub8_1 = arg0;
		Static55.aClass4_Sub8_11 = Static77.method1396(arg0);
		Static98.anInt2275 = arg1;
		Static105.anInt2347 = arg2;
		Static47.anInt1222 = 0;
		Static7.aBoolean6 = false;
	}
}
