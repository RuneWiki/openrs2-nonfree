import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!q", name = "v", descriptor = "[Lclient!tg;")
	public static Class1_Sub1_Sub12_Sub4[] aClass1_Sub1_Sub12_Sub4Array7;

	@OriginalMember(owner = "client!q", name = "u", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1269 = Static169.method2903("Please contact customer support)3");

	@OriginalMember(owner = "client!q", name = "z", descriptor = "I")
	public static int anInt3403 = 0;

	@OriginalMember(owner = "client!q", name = "A", descriptor = "[[I")
	public static int[][] anIntArrayArray32 = new int[104][104];

	@OriginalMember(owner = "client!q", name = "C", descriptor = "[Lclient!ph;")
	public static Class64[] aClass64Array1 = new Class64[6];

	@OriginalMember(owner = "client!q", name = "F", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1270 = Static169.method2903("Anmelde)2Limit -Uberschritten)3");

	@OriginalMember(owner = "client!q", name = "H", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1271 = Static169.method2903("Spiel)2Engine wird gestartet)3)3)3");

	@OriginalMember(owner = "client!q", name = "J", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1272 = aClass23_1269;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(II)I")
	public static int method2305(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(15) int local15 = local0 | local0 >>> 1;
		@Pc(21) int local21 = local15 | local15 >>> 2;
		@Pc(27) int local27 = local21 | local21 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!q", name = "d", descriptor = "(I)V")
	public static void method2306() {
		aClass1_Sub1_Sub12_Sub4Array7 = null;
		anIntArrayArray32 = null;
		aClass23_1271 = null;
		aClass23_1272 = null;
		aClass64Array1 = null;
		aClass23_1269 = null;
		aClass23_1270 = null;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "([IIII)I")
	public static int method2307(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return arg0[0] * arg1 + arg2 * arg0[1];
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V")
	public static void method2308() {
		Static51.anInt1466 = 0;
		@Pc(16) int local16 = Static152.anInt3545 + (Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anInt1838 >> 7);
		@Pc(24) int local24 = (Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anInt1825 >> 7) + Static75.anInt2039;
		if (local16 >= 3053 && local16 <= 3156 && local24 >= 3056 && local24 <= 3136) {
			Static51.anInt1466 = 1;
		}
		if (local16 >= 3072 && local16 <= 3118 && local24 >= 9492 && local24 <= 9535) {
			Static51.anInt1466 = 1;
		}
		if (Static51.anInt1466 == 1 && local16 >= 3139 && local16 <= 3199 && local24 >= 3008 && local24 <= 3062) {
			Static51.anInt1466 = 0;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIZ)Z")
	public static boolean method2309(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 >> arg1 + 1 & 0x1) != 0;
	}
}
