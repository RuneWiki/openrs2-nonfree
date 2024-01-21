import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "Lclient!de;")
	public static Class1_Sub1_Sub4_Sub1 aClass1_Sub1_Sub4_Sub1_9;

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "Lclient!kd;")
	public static Class39 aClass39_230 = Static108.method1915("headicons_pk");

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "[I")
	public static int[] anIntArray90 = new int[500];

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
	public static int anInt501 = 0;

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
	public static int anInt502 = 0;

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "Lclient!kd;")
	private static Class39 aClass39_232 = Static108.method1915("wishes to duel with you)3");

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "Lclient!kd;")
	public static Class39 aClass39_231 = aClass39_232;

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
	public static int anInt503 = 0;

	@OriginalMember(owner = "client!bf", name = "j", descriptor = "[I")
	public static int[] anIntArray91 = new int[2048];

	@OriginalMember(owner = "client!bf", name = "k", descriptor = "Lclient!kd;")
	private static Class39 aClass39_233 = Static108.method1915("Type");

	@OriginalMember(owner = "client!bf", name = "n", descriptor = "Lclient!kd;")
	private static Class39 aClass39_235 = Static108.method1915("Close");

	@OriginalMember(owner = "client!bf", name = "l", descriptor = "Lclient!kd;")
	public static Class39 aClass39_234 = aClass39_235;

	@OriginalMember(owner = "client!bf", name = "u", descriptor = "Lclient!kd;")
	public static Class39 aClass39_236 = aClass39_233;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZIIIIII)V")
	public static void method274(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static71.method1248(arg2)) {
			Static85.method1432(0, -1, arg4, 0, arg6, arg0, arg1, arg5, Static102.aClass1_Sub1_Sub1ArrayArray1[arg2], arg3);
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V")
	public static void method275() {
		aClass39_232 = null;
		anIntArray91 = null;
		aClass1_Sub1_Sub4_Sub1_9 = null;
		anIntArray90 = null;
		aClass39_235 = null;
		aClass39_231 = null;
		aClass39_230 = null;
		aClass39_233 = null;
		aClass39_236 = null;
		aClass39_234 = null;
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(Z)V")
	public static void method276() {
		Static30.anInt1002 = 0;
		@Pc(12) int local12 = Static103.anInt2610 + (Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2508 >> 7);
		@Pc(20) int local20 = (Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2521 >> 7) + Static71.anInt1795;
		if (local20 >= 3053 && local20 <= 3156 && local12 >= 3056 && local12 <= 3136) {
			Static30.anInt1002 = 1;
		}
		if (local20 >= 3072 && local20 <= 3118 && local12 >= 9492 && local12 <= 9535) {
			Static30.anInt1002 = 1;
		}
		if (Static30.anInt1002 == 1 && local20 >= 3139 && local20 <= 3199 && local12 >= 3008 && local12 <= 3062) {
			Static30.anInt1002 = 0;
		}
	}
}
