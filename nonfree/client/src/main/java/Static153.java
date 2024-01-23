import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static153 {

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
	public static int anInt3417;

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "[Lclient!ch;")
	public static Class1_Sub1_Sub6[] aClass1_Sub1_Sub6Array8;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "Lclient!db;")
	public static Class19 aClass19_14 = new Class19();

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1179 = Static200.method3116("null");

	@OriginalMember(owner = "client!pi", name = "h", descriptor = "Lclient!kh;")
	private static Class60 aClass60_1180 = Static200.method3116("Enter your username (V password)3");

	@OriginalMember(owner = "client!pi", name = "k", descriptor = "Lclient!kh;")
	private static Class60 aClass60_1182 = Static200.method3116("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!pi", name = "i", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1181 = aClass60_1182;

	@OriginalMember(owner = "client!pi", name = "j", descriptor = "[Lclient!ab;")
	public static Class3[] aClass3Array1 = new Class3[4];

	@OriginalMember(owner = "client!pi", name = "l", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1183 = aClass60_1180;

	@OriginalMember(owner = "client!pi", name = "m", descriptor = "[Z")
	public static boolean[] aBooleanArray19 = new boolean[100];

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)V")
	public static void method2603(@OriginalArg(1) int arg0) {
		if (Static199.method3112(arg0)) {
			Static156.method2634(Static82.aClass6ArrayArray1[arg0], -1);
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2604(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 >= Static214.anInt4572 && arg3 <= Static130.anInt2847 && Static141.anInt3163 <= arg4 && Static200.anInt4273 >= arg1) {
			Static167.method2733(arg3, arg4, arg2, arg1, arg5, arg0, arg6);
		} else {
			Static75.method1350(arg4, arg5, arg0, arg1, arg2, arg3, arg6);
		}
	}
}
