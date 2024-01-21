import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!fa", name = "v", descriptor = "B")
	public static byte aByte4;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "[I")
	public static int[] anIntArray164 = new int[32];

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
	public static int anInt950 = 0;

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "Lclient!af;")
	public static Class5 aClass5_436 = Static45.method1937("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "Lclient!af;")
	private static Class5 aClass5_437 = Static45.method1937("Loading title screen )2 ");

	@OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
	public static int anInt952 = 0;

	@OriginalMember(owner = "client!fa", name = "k", descriptor = "Lclient!af;")
	private static Class5 aClass5_438 = Static45.method1937("level)2");

	@OriginalMember(owner = "client!fa", name = "n", descriptor = "Lclient!af;")
	public static Class5 aClass5_439 = aClass5_437;

	@OriginalMember(owner = "client!fa", name = "p", descriptor = "Lclient!af;")
	public static Class5 aClass5_440 = Static45.method1937("oder benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!fa", name = "q", descriptor = "Lclient!af;")
	public static Class5 aClass5_441 = aClass5_438;

	@OriginalMember(owner = "client!fa", name = "r", descriptor = "Lclient!af;")
	public static Class5 aClass5_442 = Static45.method1937("Clientscript error )2 check log for details");

	@OriginalMember(owner = "client!fa", name = "s", descriptor = "Lclient!af;")
	public static Class5 aClass5_443 = Static45.method1937("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!fa", name = "u", descriptor = "I")
	public static int anInt959 = 0;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
	public static void method679() {
		anIntArray164 = null;
		aClass5_436 = null;
		aClass5_439 = null;
		aClass5_442 = null;
		aClass5_441 = null;
		aClass5_440 = null;
		aClass5_438 = null;
		aClass5_437 = null;
		aClass5_443 = null;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)Lclient!of;")
	public static Class1_Sub17 method680(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static49.aClass1_Sub17ArrayArray1[local7] == null || Static49.aClass1_Sub17ArrayArray1[local7][local11] == null) {
			@Pc(29) boolean local29 = Static8.method244(local7);
			if (!local29) {
				return null;
			}
		}
		return Static49.aClass1_Sub17ArrayArray1[local7][local11];
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILclient!cd;B)V")
	public static void method681(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub3_Sub4_Sub2 arg1) {
		if (Static131.anInt3270 < arg1.anInt3072) {
			Static124.method2204(arg1);
		} else if (Static131.anInt3270 <= arg1.anInt3074) {
			Static37.method683(arg1);
		} else {
			Static116.method2033(arg1);
		}
		if (arg1.anInt3089 < 128 || arg1.anInt3079 < 128 || arg1.anInt3089 >= 13184 || arg1.anInt3079 >= 13184) {
			arg1.anInt3068 = -1;
			arg1.anInt3089 = arg1.anIntArray443[0] * 128 + arg1.anInt3063 * 64;
			arg1.anInt3059 = -1;
			arg1.anInt3074 = 0;
			arg1.anInt3079 = arg1.anIntArray446[0] * 128 + arg1.anInt3063 * 64;
			arg1.anInt3072 = 0;
			arg1.method2152();
		}
		if (arg1 == Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1 && (arg1.anInt3089 < 1536 || arg1.anInt3079 < 1536 || arg1.anInt3089 >= 11776 || arg1.anInt3079 >= 11776)) {
			arg1.anInt3072 = 0;
			arg1.anInt3068 = -1;
			arg1.anInt3089 = arg1.anIntArray443[0] * 128 + arg1.anInt3063 * 64;
			arg1.anInt3079 = arg1.anIntArray446[0] * 128 + arg1.anInt3063 * 64;
			arg1.anInt3074 = 0;
			arg1.anInt3059 = -1;
			arg1.method2152();
		}
		Static113.method1949(arg1);
		Static131.method2262(arg1);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)Lclient!qc;")
	public static Class1_Sub3_Sub1_Sub3 method682() {
		@Pc(7) Class1_Sub3_Sub1_Sub3 local7 = new Class1_Sub3_Sub1_Sub3();
		local7.anInt2445 = Static11.anInt327;
		local7.aByteArray33 = Static73.aByteArrayArray7[0];
		local7.anInt2444 = Static48.anIntArray196[0];
		local7.anIntArray374 = Static27.anIntArray97;
		local7.anInt2446 = Static116.anInt2900;
		local7.anInt2443 = Static109.anIntArray409[0];
		local7.anInt2447 = Static75.anIntArray290[0];
		local7.anInt2442 = Static76.anIntArray296[0];
		Static50.method890();
		return local7;
	}
}
